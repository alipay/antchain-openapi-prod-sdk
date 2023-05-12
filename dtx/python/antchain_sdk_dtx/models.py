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


class Ongoing(TeaModel):
    def __init__(
        self,
        action_num: int = None,
        activity_num: int = None,
    ):
        # 进行中分支事务数
        self.action_num = action_num
        # 进行中事务数
        self.activity_num = activity_num

    def validate(self):
        self.validate_required(self.action_num, 'action_num')
        self.validate_required(self.activity_num, 'activity_num')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.action_num is not None:
            result['action_num'] = self.action_num
        if self.activity_num is not None:
            result['activity_num'] = self.activity_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('action_num') is not None:
            self.action_num = m.get('action_num')
        if m.get('activity_num') is not None:
            self.activity_num = m.get('activity_num')
        return self


class Today(TeaModel):
    def __init__(
        self,
        action_num: int = None,
        activity_num: int = None,
    ):
        # 当天分支事务数
        self.action_num = action_num
        # 当天事务数
        self.activity_num = activity_num

    def validate(self):
        self.validate_required(self.action_num, 'action_num')
        self.validate_required(self.activity_num, 'activity_num')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.action_num is not None:
            result['action_num'] = self.action_num
        if self.activity_num is not None:
            result['activity_num'] = self.activity_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('action_num') is not None:
            self.action_num = m.get('action_num')
        if m.get('activity_num') is not None:
            self.activity_num = m.get('activity_num')
        return self


class ExceptionStats(TeaModel):
    def __init__(
        self,
        total: int = None,
    ):
        # 异常事务数
        self.total = total

    def validate(self):
        self.validate_required(self.total, 'total')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.total is not None:
            result['total'] = self.total
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class ActivityDsVO(TeaModel):
    def __init__(
        self,
        action_table_index_end: int = None,
        action_table_index_start: int = None,
        action_table_name_format: str = None,
        activity_table_index_end: int = None,
        activity_table_index_start: int = None,
        activity_table_name_format: str = None,
        db_connect_min: int = None,
        db_conn_max: int = None,
        db_type: int = None,
        ds_index_end: int = None,
        ds_index_start: int = None,
        ds_name_format: str = None,
        id: int = None,
        is_ldc: bool = None,
        is_local_ds: bool = None,
        zone: str = None,
        task_name_format: str = None,
        task_index_start: int = None,
        task_index_end: int = None,
    ):
        # 9
        self.action_table_index_end = action_table_index_end
        # 0
        self.action_table_index_start = action_table_index_start
        # .
        self.action_table_name_format = action_table_name_format
        # activity_table_index_end
        self.activity_table_index_end = activity_table_index_end
        # a
        self.activity_table_index_start = activity_table_index_start
        # 主事务表
        self.activity_table_name_format = activity_table_name_format
        # DB最小连接数
        self.db_connect_min = db_connect_min
        # DB最大连接数
        self.db_conn_max = db_conn_max
        # 数据库类型
        self.db_type = db_type
        # 统一数据源索引结束值
        self.ds_index_end = ds_index_end
        # 统一数据源索引起始值
        self.ds_index_start = ds_index_start
        # 统一数据源
        self.ds_name_format = ds_name_format
        # 唯一id
        self.id = id
        # 部署模式
        # true：rzone部署，false：gzone部署
        self.is_ldc = is_ldc
        # true：数据源配置在dtap数据库，false：数据源配置在dds/zdc里。
        self.is_local_ds = is_local_ds
        # gzone部署，国际IPAY站点使用
        self.zone = zone
        # .
        self.task_name_format = task_name_format
        # .
        self.task_index_start = task_index_start
        # .
        self.task_index_end = task_index_end

    def validate(self):
        self.validate_required(self.action_table_index_end, 'action_table_index_end')
        self.validate_required(self.action_table_index_start, 'action_table_index_start')
        self.validate_required(self.action_table_name_format, 'action_table_name_format')
        self.validate_required(self.activity_table_index_end, 'activity_table_index_end')
        self.validate_required(self.activity_table_index_start, 'activity_table_index_start')
        self.validate_required(self.activity_table_name_format, 'activity_table_name_format')
        self.validate_required(self.db_connect_min, 'db_connect_min')
        self.validate_required(self.db_conn_max, 'db_conn_max')
        self.validate_required(self.db_type, 'db_type')
        self.validate_required(self.ds_index_end, 'ds_index_end')
        self.validate_required(self.ds_index_start, 'ds_index_start')
        self.validate_required(self.ds_name_format, 'ds_name_format')
        self.validate_required(self.id, 'id')
        self.validate_required(self.is_ldc, 'is_ldc')
        self.validate_required(self.is_local_ds, 'is_local_ds')
        self.validate_required(self.zone, 'zone')
        self.validate_required(self.task_name_format, 'task_name_format')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.action_table_index_end is not None:
            result['action_table_index_end'] = self.action_table_index_end
        if self.action_table_index_start is not None:
            result['action_table_index_start'] = self.action_table_index_start
        if self.action_table_name_format is not None:
            result['action_table_name_format'] = self.action_table_name_format
        if self.activity_table_index_end is not None:
            result['activity_table_index_end'] = self.activity_table_index_end
        if self.activity_table_index_start is not None:
            result['activity_table_index_start'] = self.activity_table_index_start
        if self.activity_table_name_format is not None:
            result['activity_table_name_format'] = self.activity_table_name_format
        if self.db_connect_min is not None:
            result['db_connect_min'] = self.db_connect_min
        if self.db_conn_max is not None:
            result['db_conn_max'] = self.db_conn_max
        if self.db_type is not None:
            result['db_type'] = self.db_type
        if self.ds_index_end is not None:
            result['ds_index_end'] = self.ds_index_end
        if self.ds_index_start is not None:
            result['ds_index_start'] = self.ds_index_start
        if self.ds_name_format is not None:
            result['ds_name_format'] = self.ds_name_format
        if self.id is not None:
            result['id'] = self.id
        if self.is_ldc is not None:
            result['is_ldc'] = self.is_ldc
        if self.is_local_ds is not None:
            result['is_local_ds'] = self.is_local_ds
        if self.zone is not None:
            result['zone'] = self.zone
        if self.task_name_format is not None:
            result['task_name_format'] = self.task_name_format
        if self.task_index_start is not None:
            result['task_index_start'] = self.task_index_start
        if self.task_index_end is not None:
            result['task_index_end'] = self.task_index_end
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('action_table_index_end') is not None:
            self.action_table_index_end = m.get('action_table_index_end')
        if m.get('action_table_index_start') is not None:
            self.action_table_index_start = m.get('action_table_index_start')
        if m.get('action_table_name_format') is not None:
            self.action_table_name_format = m.get('action_table_name_format')
        if m.get('activity_table_index_end') is not None:
            self.activity_table_index_end = m.get('activity_table_index_end')
        if m.get('activity_table_index_start') is not None:
            self.activity_table_index_start = m.get('activity_table_index_start')
        if m.get('activity_table_name_format') is not None:
            self.activity_table_name_format = m.get('activity_table_name_format')
        if m.get('db_connect_min') is not None:
            self.db_connect_min = m.get('db_connect_min')
        if m.get('db_conn_max') is not None:
            self.db_conn_max = m.get('db_conn_max')
        if m.get('db_type') is not None:
            self.db_type = m.get('db_type')
        if m.get('ds_index_end') is not None:
            self.ds_index_end = m.get('ds_index_end')
        if m.get('ds_index_start') is not None:
            self.ds_index_start = m.get('ds_index_start')
        if m.get('ds_name_format') is not None:
            self.ds_name_format = m.get('ds_name_format')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('is_ldc') is not None:
            self.is_ldc = m.get('is_ldc')
        if m.get('is_local_ds') is not None:
            self.is_local_ds = m.get('is_local_ds')
        if m.get('zone') is not None:
            self.zone = m.get('zone')
        if m.get('task_name_format') is not None:
            self.task_name_format = m.get('task_name_format')
        if m.get('task_index_start') is not None:
            self.task_index_start = m.get('task_index_start')
        if m.get('task_index_end') is not None:
            self.task_index_end = m.get('task_index_end')
        return self


class TransactionNode(TeaModel):
    def __init__(
        self,
        id: int = None,
        start_time: str = None,
        end_time: str = None,
        role: str = None,
        name: str = None,
        label: str = None,
        is_end: bool = None,
    ):
        # id
        self.id = id
        # start_time
        self.start_time = start_time
        # end_time
        self.end_time = end_time
        # role
        self.role = role
        # name
        self.name = name
        # label
        self.label = label
        # is_end
        self.is_end = is_end

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')
        self.validate_required(self.role, 'role')
        self.validate_required(self.name, 'name')
        self.validate_required(self.label, 'label')
        self.validate_required(self.is_end, 'is_end')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.role is not None:
            result['role'] = self.role
        if self.name is not None:
            result['name'] = self.name
        if self.label is not None:
            result['label'] = self.label
        if self.is_end is not None:
            result['is_end'] = self.is_end
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('role') is not None:
            self.role = m.get('role')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('label') is not None:
            self.label = m.get('label')
        if m.get('is_end') is not None:
            self.is_end = m.get('is_end')
        return self


class Stats(TeaModel):
    def __init__(
        self,
        exception: ExceptionStats = None,
        ongoing: Ongoing = None,
        today: Today = None,
    ):
        # 异常事务数
        self.exception = exception
        # 进行中事务数统计
        self.ongoing = ongoing
        # 当天事务数统计
        self.today = today

    def validate(self):
        self.validate_required(self.exception, 'exception')
        if self.exception:
            self.exception.validate()
        self.validate_required(self.ongoing, 'ongoing')
        if self.ongoing:
            self.ongoing.validate()
        self.validate_required(self.today, 'today')
        if self.today:
            self.today.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.exception is not None:
            result['exception'] = self.exception.to_map()
        if self.ongoing is not None:
            result['ongoing'] = self.ongoing.to_map()
        if self.today is not None:
            result['today'] = self.today.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('exception') is not None:
            temp_model = ExceptionStats()
            self.exception = temp_model.from_map(m['exception'])
        if m.get('ongoing') is not None:
            temp_model = Ongoing()
            self.ongoing = temp_model.from_map(m['ongoing'])
        if m.get('today') is not None:
            temp_model = Today()
            self.today = temp_model.from_map(m['today'])
        return self


class AppRecoveryVO(TeaModel):
    def __init__(
        self,
        app_name: str = None,
        client_version: str = None,
        ds_array: List[ActivityDsVO] = None,
        id: int = None,
        is_asyn: bool = None,
        is_dds: bool = None,
        is_load_test: bool = None,
        is_mix: bool = None,
        recovery_limit: int = None,
        recovery_thread_num: int = None,
        used: bool = None,
    ):
        # app
        self.app_name = app_name
        # 客户端模式
        self.client_version = client_version
        # 数据源数组
        self.ds_array = ds_array
        # 唯一id
        self.id = id
        # 是否异步化
        self.is_asyn = is_asyn
        # 数据源配置是否在dds中
        self.is_dds = is_dds
        # 压测
        self.is_load_test = is_load_test
        # 是否混合模式
        self.is_mix = is_mix
        # 单条恢复数
        self.recovery_limit = recovery_limit
        # 恢复任务线程数
        self.recovery_thread_num = recovery_thread_num
        # 是否被使用
        self.used = used

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.client_version, 'client_version')
        self.validate_required(self.ds_array, 'ds_array')
        if self.ds_array:
            for k in self.ds_array:
                if k:
                    k.validate()
        self.validate_required(self.id, 'id')
        self.validate_required(self.is_asyn, 'is_asyn')
        self.validate_required(self.is_dds, 'is_dds')
        self.validate_required(self.is_load_test, 'is_load_test')
        self.validate_required(self.is_mix, 'is_mix')
        self.validate_required(self.recovery_limit, 'recovery_limit')
        self.validate_required(self.recovery_thread_num, 'recovery_thread_num')
        self.validate_required(self.used, 'used')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.client_version is not None:
            result['client_version'] = self.client_version
        result['ds_array'] = []
        if self.ds_array is not None:
            for k in self.ds_array:
                result['ds_array'].append(k.to_map() if k else None)
        if self.id is not None:
            result['id'] = self.id
        if self.is_asyn is not None:
            result['is_asyn'] = self.is_asyn
        if self.is_dds is not None:
            result['is_dds'] = self.is_dds
        if self.is_load_test is not None:
            result['is_load_test'] = self.is_load_test
        if self.is_mix is not None:
            result['is_mix'] = self.is_mix
        if self.recovery_limit is not None:
            result['recovery_limit'] = self.recovery_limit
        if self.recovery_thread_num is not None:
            result['recovery_thread_num'] = self.recovery_thread_num
        if self.used is not None:
            result['used'] = self.used
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('client_version') is not None:
            self.client_version = m.get('client_version')
        self.ds_array = []
        if m.get('ds_array') is not None:
            for k in m.get('ds_array'):
                temp_model = ActivityDsVO()
                self.ds_array.append(temp_model.from_map(k))
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('is_asyn') is not None:
            self.is_asyn = m.get('is_asyn')
        if m.get('is_dds') is not None:
            self.is_dds = m.get('is_dds')
        if m.get('is_load_test') is not None:
            self.is_load_test = m.get('is_load_test')
        if m.get('is_mix') is not None:
            self.is_mix = m.get('is_mix')
        if m.get('recovery_limit') is not None:
            self.recovery_limit = m.get('recovery_limit')
        if m.get('recovery_thread_num') is not None:
            self.recovery_thread_num = m.get('recovery_thread_num')
        if m.get('used') is not None:
            self.used = m.get('used')
        return self


class DebugInitiator(TeaModel):
    def __init__(
        self,
        app_name: str = None,
        ds_name: str = None,
        activity_table_name: str = None,
    ):
        # 应用名
        self.app_name = app_name
        # 数据源名
        self.ds_name = ds_name
        # 主事务记录表
        self.activity_table_name = activity_table_name

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.ds_name, 'ds_name')
        self.validate_required(self.activity_table_name, 'activity_table_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.ds_name is not None:
            result['ds_name'] = self.ds_name
        if self.activity_table_name is not None:
            result['activity_table_name'] = self.activity_table_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('ds_name') is not None:
            self.ds_name = m.get('ds_name')
        if m.get('activity_table_name') is not None:
            self.activity_table_name = m.get('activity_table_name')
        return self


class AppInfo(TeaModel):
    def __init__(
        self,
        app_name: str = None,
        creator: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        owner: str = None,
        instance_id: str = None,
    ):
        # 应用名
        self.app_name = app_name
        # 创建人
        self.creator = creator
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified
        # 应用owner
        self.owner = owner
        # 环境唯一标识
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.creator, 'creator')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.owner, 'owner')
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.creator is not None:
            result['creator'] = self.creator
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.owner is not None:
            result['owner'] = self.owner
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('creator') is not None:
            self.creator = m.get('creator')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class ActivityTrend(TeaModel):
    def __init__(
        self,
        time: int = None,
        total: int = None,
        success: int = None,
        rollback: int = None,
    ):
        # 时间点
        self.time = time
        # 总数
        self.total = total
        # 成功数
        self.success = success
        # 回滚数
        self.rollback = rollback

    def validate(self):
        self.validate_required(self.time, 'time')
        self.validate_required(self.total, 'total')
        self.validate_required(self.success, 'success')
        self.validate_required(self.rollback, 'rollback')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.time is not None:
            result['time'] = self.time
        if self.total is not None:
            result['total'] = self.total
        if self.success is not None:
            result['success'] = self.success
        if self.rollback is not None:
            result['rollback'] = self.rollback
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('time') is not None:
            self.time = m.get('time')
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('rollback') is not None:
            self.rollback = m.get('rollback')
        return self


class Participator(TeaModel):
    def __init__(
        self,
        action_name: str = None,
        app_name: str = None,
        class_name: str = None,
        commit_method_name: str = None,
        commit_method_params_type: int = None,
        elastic_key: str = None,
        elastic_route_rule: str = None,
        id: int = None,
        instance_id: str = None,
        is_zone_route: bool = None,
        rollback_method_name: str = None,
        rollback_method_params_type: int = None,
        test_url: str = None,
        unique_id: str = None,
        used: bool = None,
        ws_tr: str = None,
    ):
        # 参与者名称
        self.action_name = action_name
        # 应用名
        self.app_name = app_name
        # 类全名，包括完整包名
        self.class_name = class_name
        # 提交方法名称
        self.commit_method_name = commit_method_name
        # 提交方法参数
        self.commit_method_params_type = commit_method_params_type
        # 弹性key
        self.elastic_key = elastic_key
        # 弹性路由规则（Groovy脚本）
        self.elastic_route_rule = elastic_route_rule
        # 记录id，更新必传
        self.id = id
        # instance_id
        self.instance_id = instance_id
        # rpc是否ldc调用
        self.is_zone_route = is_zone_route
        # 回滚方法名称
        self.rollback_method_name = rollback_method_name
        # 回滚方法的参数类型
        self.rollback_method_params_type = rollback_method_params_type
        # rpc接口测试地址
        self.test_url = test_url
        # rpc uniqueId
        self.unique_id = unique_id
        # 是否被使用
        self.used = used
        # rpc协议，ws或tr
        self.ws_tr = ws_tr

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.action_name is not None:
            result['action_name'] = self.action_name
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.class_name is not None:
            result['class_name'] = self.class_name
        if self.commit_method_name is not None:
            result['commit_method_name'] = self.commit_method_name
        if self.commit_method_params_type is not None:
            result['commit_method_params_type'] = self.commit_method_params_type
        if self.elastic_key is not None:
            result['elastic_key'] = self.elastic_key
        if self.elastic_route_rule is not None:
            result['elastic_route_rule'] = self.elastic_route_rule
        if self.id is not None:
            result['id'] = self.id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.is_zone_route is not None:
            result['is_zone_route'] = self.is_zone_route
        if self.rollback_method_name is not None:
            result['rollback_method_name'] = self.rollback_method_name
        if self.rollback_method_params_type is not None:
            result['rollback_method_params_type'] = self.rollback_method_params_type
        if self.test_url is not None:
            result['test_url'] = self.test_url
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        if self.used is not None:
            result['used'] = self.used
        if self.ws_tr is not None:
            result['ws_tr'] = self.ws_tr
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('action_name') is not None:
            self.action_name = m.get('action_name')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('class_name') is not None:
            self.class_name = m.get('class_name')
        if m.get('commit_method_name') is not None:
            self.commit_method_name = m.get('commit_method_name')
        if m.get('commit_method_params_type') is not None:
            self.commit_method_params_type = m.get('commit_method_params_type')
        if m.get('elastic_key') is not None:
            self.elastic_key = m.get('elastic_key')
        if m.get('elastic_route_rule') is not None:
            self.elastic_route_rule = m.get('elastic_route_rule')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('is_zone_route') is not None:
            self.is_zone_route = m.get('is_zone_route')
        if m.get('rollback_method_name') is not None:
            self.rollback_method_name = m.get('rollback_method_name')
        if m.get('rollback_method_params_type') is not None:
            self.rollback_method_params_type = m.get('rollback_method_params_type')
        if m.get('test_url') is not None:
            self.test_url = m.get('test_url')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        if m.get('used') is not None:
            self.used = m.get('used')
        if m.get('ws_tr') is not None:
            self.ws_tr = m.get('ws_tr')
        return self


class InitiatorDatasource(TeaModel):
    def __init__(
        self,
        action_table_index_end: int = None,
        action_table_index_start: int = None,
        action_table_name_format: str = None,
        activity_table_index_end: int = None,
        activity_table_index_start: int = None,
        activity_table_name_format: str = None,
        db_connect_min: int = None,
        db_conn_max: int = None,
        db_type: int = None,
        ds_index_end: int = None,
        ds_index_start: int = None,
        ds_name_format: str = None,
        id: int = None,
        instance_id: str = None,
        is_ldc: bool = None,
        is_local_ds: bool = None,
        zone: str = None,
    ):
        # 分支事务表索引结束点
        self.action_table_index_end = action_table_index_end
        # 分支事务表索引起始点
        self.action_table_index_start = action_table_index_start
        # 分支事务表模板
        self.action_table_name_format = action_table_name_format
        # 主事务表索引结束点
        self.activity_table_index_end = activity_table_index_end
        # 主事务表索引起始点
        self.activity_table_index_start = activity_table_index_start
        # 主事务表模板
        self.activity_table_name_format = activity_table_name_format
        # DB最小连接数
        self.db_connect_min = db_connect_min
        # DB最大连接数
        self.db_conn_max = db_conn_max
        # 数据库类型
        self.db_type = db_type
        # 数据源索引结束点
        self.ds_index_end = ds_index_end
        # 数据源索引起始点
        self.ds_index_start = ds_index_start
        # 数据源名字
        self.ds_name_format = ds_name_format
        # 唯一键，更新时需要
        self.id = id
        # 环境唯一标识
        self.instance_id = instance_id
        # true：rzone部署，false：gzone部署
        self.is_ldc = is_ldc
        # true：数据源配置在dtap数据库，false：数据源配置在dds/zdc里。
        self.is_local_ds = is_local_ds
        # gzone部署，国际IPAY站点使用
        self.zone = zone

    def validate(self):
        self.validate_required(self.db_connect_min, 'db_connect_min')
        self.validate_required(self.db_conn_max, 'db_conn_max')
        self.validate_required(self.db_type, 'db_type')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.is_ldc, 'is_ldc')
        self.validate_required(self.is_local_ds, 'is_local_ds')
        self.validate_required(self.zone, 'zone')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.action_table_index_end is not None:
            result['action_table_index_end'] = self.action_table_index_end
        if self.action_table_index_start is not None:
            result['action_table_index_start'] = self.action_table_index_start
        if self.action_table_name_format is not None:
            result['action_table_name_format'] = self.action_table_name_format
        if self.activity_table_index_end is not None:
            result['activity_table_index_end'] = self.activity_table_index_end
        if self.activity_table_index_start is not None:
            result['activity_table_index_start'] = self.activity_table_index_start
        if self.activity_table_name_format is not None:
            result['activity_table_name_format'] = self.activity_table_name_format
        if self.db_connect_min is not None:
            result['db_connect_min'] = self.db_connect_min
        if self.db_conn_max is not None:
            result['db_conn_max'] = self.db_conn_max
        if self.db_type is not None:
            result['db_type'] = self.db_type
        if self.ds_index_end is not None:
            result['ds_index_end'] = self.ds_index_end
        if self.ds_index_start is not None:
            result['ds_index_start'] = self.ds_index_start
        if self.ds_name_format is not None:
            result['ds_name_format'] = self.ds_name_format
        if self.id is not None:
            result['id'] = self.id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.is_ldc is not None:
            result['is_ldc'] = self.is_ldc
        if self.is_local_ds is not None:
            result['is_local_ds'] = self.is_local_ds
        if self.zone is not None:
            result['zone'] = self.zone
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('action_table_index_end') is not None:
            self.action_table_index_end = m.get('action_table_index_end')
        if m.get('action_table_index_start') is not None:
            self.action_table_index_start = m.get('action_table_index_start')
        if m.get('action_table_name_format') is not None:
            self.action_table_name_format = m.get('action_table_name_format')
        if m.get('activity_table_index_end') is not None:
            self.activity_table_index_end = m.get('activity_table_index_end')
        if m.get('activity_table_index_start') is not None:
            self.activity_table_index_start = m.get('activity_table_index_start')
        if m.get('activity_table_name_format') is not None:
            self.activity_table_name_format = m.get('activity_table_name_format')
        if m.get('db_connect_min') is not None:
            self.db_connect_min = m.get('db_connect_min')
        if m.get('db_conn_max') is not None:
            self.db_conn_max = m.get('db_conn_max')
        if m.get('db_type') is not None:
            self.db_type = m.get('db_type')
        if m.get('ds_index_end') is not None:
            self.ds_index_end = m.get('ds_index_end')
        if m.get('ds_index_start') is not None:
            self.ds_index_start = m.get('ds_index_start')
        if m.get('ds_name_format') is not None:
            self.ds_name_format = m.get('ds_name_format')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('is_ldc') is not None:
            self.is_ldc = m.get('is_ldc')
        if m.get('is_local_ds') is not None:
            self.is_local_ds = m.get('is_local_ds')
        if m.get('zone') is not None:
            self.zone = m.get('zone')
        return self


class SplitRule(TeaModel):
    def __init__(
        self,
        db_split_rule: int = None,
        db_split_template: str = None,
        table_split_rule: int = None,
        table_split_template: str = None,
    ):
        # db_split_rule
        self.db_split_rule = db_split_rule
        # db_split_template
        self.db_split_template = db_split_template
        # table_split_rule
        self.table_split_rule = table_split_rule
        # table_split_template
        self.table_split_template = table_split_template

    def validate(self):
        self.validate_required(self.db_split_rule, 'db_split_rule')
        self.validate_required(self.table_split_rule, 'table_split_rule')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.db_split_rule is not None:
            result['db_split_rule'] = self.db_split_rule
        if self.db_split_template is not None:
            result['db_split_template'] = self.db_split_template
        if self.table_split_rule is not None:
            result['table_split_rule'] = self.table_split_rule
        if self.table_split_template is not None:
            result['table_split_template'] = self.table_split_template
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('db_split_rule') is not None:
            self.db_split_rule = m.get('db_split_rule')
        if m.get('db_split_template') is not None:
            self.db_split_template = m.get('db_split_template')
        if m.get('table_split_rule') is not None:
            self.table_split_rule = m.get('table_split_rule')
        if m.get('table_split_template') is not None:
            self.table_split_template = m.get('table_split_template')
        return self


class TransactionInfo(TeaModel):
    def __init__(
        self,
        action_mode: int = None,
        biz_type: str = None,
        business_id: str = None,
        end_time: str = None,
        initiator_ip: str = None,
        initiator_name: str = None,
        modify_time: str = None,
        participator_ids: List[str] = None,
        start_time: str = None,
        status: str = None,
        tx_id: str = None,
    ):
        # Saga模式返回3, tcc-local 返回 1， tcc-remote 返回2
        self.action_mode = action_mode
        # 业务码
        self.biz_type = biz_type
        # 业务id
        self.business_id = business_id
        # 结束时间
        self.end_time = end_time
        # 发起方ip
        self.initiator_ip = initiator_ip
        # 发起方名称
        self.initiator_name = initiator_name
        # 最近修改时间
        self.modify_time = modify_time
        # 参与者id列表
        self.participator_ids = participator_ids
        # 开始时间
        self.start_time = start_time
        # 事务状态
        self.status = status
        # 事务id
        self.tx_id = tx_id

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.business_id, 'business_id')
        self.validate_required(self.end_time, 'end_time')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.initiator_ip, 'initiator_ip')
        self.validate_required(self.initiator_name, 'initiator_name')
        self.validate_required(self.modify_time, 'modify_time')
        if self.modify_time is not None:
            self.validate_pattern(self.modify_time, 'modify_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.participator_ids, 'participator_ids')
        self.validate_required(self.start_time, 'start_time')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.status, 'status')
        self.validate_required(self.tx_id, 'tx_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.action_mode is not None:
            result['action_mode'] = self.action_mode
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.initiator_ip is not None:
            result['initiator_ip'] = self.initiator_ip
        if self.initiator_name is not None:
            result['initiator_name'] = self.initiator_name
        if self.modify_time is not None:
            result['modify_time'] = self.modify_time
        if self.participator_ids is not None:
            result['participator_ids'] = self.participator_ids
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.status is not None:
            result['status'] = self.status
        if self.tx_id is not None:
            result['tx_id'] = self.tx_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('action_mode') is not None:
            self.action_mode = m.get('action_mode')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('initiator_ip') is not None:
            self.initiator_ip = m.get('initiator_ip')
        if m.get('initiator_name') is not None:
            self.initiator_name = m.get('initiator_name')
        if m.get('modify_time') is not None:
            self.modify_time = m.get('modify_time')
        if m.get('participator_ids') is not None:
            self.participator_ids = m.get('participator_ids')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('tx_id') is not None:
            self.tx_id = m.get('tx_id')
        return self


class DebugParticipator(TeaModel):
    def __init__(
        self,
        tx_id: str = None,
        action_id: str = None,
        action_name: str = None,
        action_type: int = None,
        activity_context: str = None,
        action_context: str = None,
    ):
        # 主事务id
        self.tx_id = tx_id
        # 分支事务id
        self.action_id = action_id
        # 参与者名称
        self.action_name = action_name
        # 1：提交，2：回滚
        self.action_type = action_type
        # 主事务上下文
        self.activity_context = activity_context
        # 分支事务上下文
        self.action_context = action_context

    def validate(self):
        self.validate_required(self.tx_id, 'tx_id')
        self.validate_required(self.action_id, 'action_id')
        self.validate_required(self.action_name, 'action_name')
        self.validate_required(self.action_type, 'action_type')
        self.validate_required(self.activity_context, 'activity_context')
        self.validate_required(self.action_context, 'action_context')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tx_id is not None:
            result['tx_id'] = self.tx_id
        if self.action_id is not None:
            result['action_id'] = self.action_id
        if self.action_name is not None:
            result['action_name'] = self.action_name
        if self.action_type is not None:
            result['action_type'] = self.action_type
        if self.activity_context is not None:
            result['activity_context'] = self.activity_context
        if self.action_context is not None:
            result['action_context'] = self.action_context
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tx_id') is not None:
            self.tx_id = m.get('tx_id')
        if m.get('action_id') is not None:
            self.action_id = m.get('action_id')
        if m.get('action_name') is not None:
            self.action_name = m.get('action_name')
        if m.get('action_type') is not None:
            self.action_type = m.get('action_type')
        if m.get('activity_context') is not None:
            self.activity_context = m.get('activity_context')
        if m.get('action_context') is not None:
            self.action_context = m.get('action_context')
        return self


class ActionTrend(TeaModel):
    def __init__(
        self,
        time: int = None,
        total: int = None,
        success: int = None,
        rollback: int = None,
    ):
        # 时间点
        self.time = time
        # 总数
        self.total = total
        # 成功数
        self.success = success
        # 回滚数
        self.rollback = rollback

    def validate(self):
        self.validate_required(self.time, 'time')
        self.validate_required(self.total, 'total')
        self.validate_required(self.success, 'success')
        self.validate_required(self.rollback, 'rollback')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.time is not None:
            result['time'] = self.time
        if self.total is not None:
            result['total'] = self.total
        if self.success is not None:
            result['success'] = self.success
        if self.rollback is not None:
            result['rollback'] = self.rollback
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('time') is not None:
            self.time = m.get('time')
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('rollback') is not None:
            self.rollback = m.get('rollback')
        return self


class ExceptionTrend(TeaModel):
    def __init__(
        self,
        time: int = None,
        total: int = None,
    ):
        # 时间点
        self.time = time
        # 异常事务数
        self.total = total

    def validate(self):
        self.validate_required(self.time, 'time')
        self.validate_required(self.total, 'total')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.time is not None:
            result['time'] = self.time
        if self.total is not None:
            result['total'] = self.total
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('time') is not None:
            self.time = m.get('time')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class TransactionsParticipator(TeaModel):
    def __init__(
        self,
        app_name: str = None,
        id: str = None,
        method_name: str = None,
        method_type: str = None,
        rs_desc: str = None,
        rs_type: str = None,
    ):
        # app_name
        self.app_name = app_name
        # id
        self.id = id
        # method_name
        self.method_name = method_name
        # method_type
        self.method_type = method_type
        # rsDesc
        self.rs_desc = rs_desc
        # rs_type
        self.rs_type = rs_type

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.id, 'id')
        self.validate_required(self.method_name, 'method_name')
        self.validate_required(self.method_type, 'method_type')
        self.validate_required(self.rs_desc, 'rs_desc')
        self.validate_required(self.rs_type, 'rs_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.id is not None:
            result['id'] = self.id
        if self.method_name is not None:
            result['method_name'] = self.method_name
        if self.method_type is not None:
            result['method_type'] = self.method_type
        if self.rs_desc is not None:
            result['rs_desc'] = self.rs_desc
        if self.rs_type is not None:
            result['rs_type'] = self.rs_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('method_name') is not None:
            self.method_name = m.get('method_name')
        if m.get('method_type') is not None:
            self.method_type = m.get('method_type')
        if m.get('rs_desc') is not None:
            self.rs_desc = m.get('rs_desc')
        if m.get('rs_type') is not None:
            self.rs_type = m.get('rs_type')
        return self


class TransactionEdge(TeaModel):
    def __init__(
        self,
        id: int = None,
        source: int = None,
        target: int = None,
        type: str = None,
        content: str = None,
        is_error: bool = None,
        error_message: str = None,
    ):
        # id
        self.id = id
        # source
        self.source = source
        # target
        self.target = target
        # type
        self.type = type
        # content
        self.content = content
        # isError
        self.is_error = is_error
        # error_message
        self.error_message = error_message

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.source, 'source')
        self.validate_required(self.target, 'target')
        self.validate_required(self.type, 'type')
        self.validate_required(self.content, 'content')
        self.validate_required(self.is_error, 'is_error')
        self.validate_required(self.error_message, 'error_message')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.source is not None:
            result['source'] = self.source
        if self.target is not None:
            result['target'] = self.target
        if self.type is not None:
            result['type'] = self.type
        if self.content is not None:
            result['content'] = self.content
        if self.is_error is not None:
            result['is_error'] = self.is_error
        if self.error_message is not None:
            result['error_message'] = self.error_message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('target') is not None:
            self.target = m.get('target')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('is_error') is not None:
            self.is_error = m.get('is_error')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        return self


class EnvInfo(TeaModel):
    def __init__(
        self,
        env: str = None,
        is_public_cloud: bool = None,
        tenant: str = None,
        recovery_mode: str = None,
    ):
        # 环境
        self.env = env
        # 是否公有云环境
        self.is_public_cloud = is_public_cloud
        # 租户
        self.tenant = tenant
        # server / client
        self.recovery_mode = recovery_mode

    def validate(self):
        self.validate_required(self.env, 'env')
        self.validate_required(self.is_public_cloud, 'is_public_cloud')
        self.validate_required(self.tenant, 'tenant')
        self.validate_required(self.recovery_mode, 'recovery_mode')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.env is not None:
            result['env'] = self.env
        if self.is_public_cloud is not None:
            result['is_public_cloud'] = self.is_public_cloud
        if self.tenant is not None:
            result['tenant'] = self.tenant
        if self.recovery_mode is not None:
            result['recovery_mode'] = self.recovery_mode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('env') is not None:
            self.env = m.get('env')
        if m.get('is_public_cloud') is not None:
            self.is_public_cloud = m.get('is_public_cloud')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        if m.get('recovery_mode') is not None:
            self.recovery_mode = m.get('recovery_mode')
        return self


class RecoveryDsDTO(TeaModel):
    def __init__(
        self,
        action_table_index_end: int = None,
        action_table_index_start: int = None,
        action_table_name_format: str = None,
        activity_table_index_end: int = None,
        activity_table_index_start: int = None,
        activity_table_name_format: str = None,
        db_connect_min: int = None,
        db_conn_max: int = None,
        db_type: int = None,
        ds_index_end: int = None,
        ds_index_start: int = None,
        ds_name_format: str = None,
        group_id: str = None,
        id: int = None,
        is_ldc: bool = None,
        is_local_ds: bool = None,
        zone: str = None,
        task_name_format: str = None,
        task_index_start: int = None,
        task_index_end: int = None,
    ):
        # 分支事务表索引结束点
        self.action_table_index_end = action_table_index_end
        # 分支事务表索引起始点
        # 
        self.action_table_index_start = action_table_index_start
        # 分支事务表模板
        # 
        self.action_table_name_format = action_table_name_format
        # 主事务表索引结束点
        self.activity_table_index_end = activity_table_index_end
        # 主事务表索引起始点
        # 
        self.activity_table_index_start = activity_table_index_start
        # 主事务表模板
        self.activity_table_name_format = activity_table_name_format
        # DB最小连接数
        # 
        self.db_connect_min = db_connect_min
        # DB最大连接数
        self.db_conn_max = db_conn_max
        # 数据库类型
        # 
        self.db_type = db_type
        # 数据源索引结束点
        # 
        self.ds_index_end = ds_index_end
        # 数据源索引起始点
        # 
        self.ds_index_start = ds_index_start
        # 数据源名字
        self.ds_name_format = ds_name_format
        # 发起方组groupid
        self.group_id = group_id
        # 主键id 更新时传一下
        self.id = id
        # true：rzone部署，false：gzone部署
        self.is_ldc = is_ldc
        # true：数据源配置在dtap数据库，false：数据源配置在dds/zdc里。
        self.is_local_ds = is_local_ds
        # gzone部署，国际IPAY站点使用
        self.zone = zone
        # 恢复任务名称模板
        self.task_name_format = task_name_format
        # 恢复任务起始索引
        self.task_index_start = task_index_start
        # 恢复任务结束索引
        self.task_index_end = task_index_end

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.action_table_index_end is not None:
            result['action_table_index_end'] = self.action_table_index_end
        if self.action_table_index_start is not None:
            result['action_table_index_start'] = self.action_table_index_start
        if self.action_table_name_format is not None:
            result['action_table_name_format'] = self.action_table_name_format
        if self.activity_table_index_end is not None:
            result['activity_table_index_end'] = self.activity_table_index_end
        if self.activity_table_index_start is not None:
            result['activity_table_index_start'] = self.activity_table_index_start
        if self.activity_table_name_format is not None:
            result['activity_table_name_format'] = self.activity_table_name_format
        if self.db_connect_min is not None:
            result['db_connect_min'] = self.db_connect_min
        if self.db_conn_max is not None:
            result['db_conn_max'] = self.db_conn_max
        if self.db_type is not None:
            result['db_type'] = self.db_type
        if self.ds_index_end is not None:
            result['ds_index_end'] = self.ds_index_end
        if self.ds_index_start is not None:
            result['ds_index_start'] = self.ds_index_start
        if self.ds_name_format is not None:
            result['ds_name_format'] = self.ds_name_format
        if self.group_id is not None:
            result['group_id'] = self.group_id
        if self.id is not None:
            result['id'] = self.id
        if self.is_ldc is not None:
            result['is_ldc'] = self.is_ldc
        if self.is_local_ds is not None:
            result['is_local_ds'] = self.is_local_ds
        if self.zone is not None:
            result['zone'] = self.zone
        if self.task_name_format is not None:
            result['task_name_format'] = self.task_name_format
        if self.task_index_start is not None:
            result['task_index_start'] = self.task_index_start
        if self.task_index_end is not None:
            result['task_index_end'] = self.task_index_end
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('action_table_index_end') is not None:
            self.action_table_index_end = m.get('action_table_index_end')
        if m.get('action_table_index_start') is not None:
            self.action_table_index_start = m.get('action_table_index_start')
        if m.get('action_table_name_format') is not None:
            self.action_table_name_format = m.get('action_table_name_format')
        if m.get('activity_table_index_end') is not None:
            self.activity_table_index_end = m.get('activity_table_index_end')
        if m.get('activity_table_index_start') is not None:
            self.activity_table_index_start = m.get('activity_table_index_start')
        if m.get('activity_table_name_format') is not None:
            self.activity_table_name_format = m.get('activity_table_name_format')
        if m.get('db_connect_min') is not None:
            self.db_connect_min = m.get('db_connect_min')
        if m.get('db_conn_max') is not None:
            self.db_conn_max = m.get('db_conn_max')
        if m.get('db_type') is not None:
            self.db_type = m.get('db_type')
        if m.get('ds_index_end') is not None:
            self.ds_index_end = m.get('ds_index_end')
        if m.get('ds_index_start') is not None:
            self.ds_index_start = m.get('ds_index_start')
        if m.get('ds_name_format') is not None:
            self.ds_name_format = m.get('ds_name_format')
        if m.get('group_id') is not None:
            self.group_id = m.get('group_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('is_ldc') is not None:
            self.is_ldc = m.get('is_ldc')
        if m.get('is_local_ds') is not None:
            self.is_local_ds = m.get('is_local_ds')
        if m.get('zone') is not None:
            self.zone = m.get('zone')
        if m.get('task_name_format') is not None:
            self.task_name_format = m.get('task_name_format')
        if m.get('task_index_start') is not None:
            self.task_index_start = m.get('task_index_start')
        if m.get('task_index_end') is not None:
            self.task_index_end = m.get('task_index_end')
        return self


class InstanceDTO(TeaModel):
    def __init__(
        self,
        instance_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # instance id
        self.instance_id = instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 工作空间
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.workspace_id, 'workspace_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class SwitchoverAction(TeaModel):
    def __init__(
        self,
        dest_cell: str = None,
        source_cell: str = None,
    ):
        # 目标单元
        self.dest_cell = dest_cell
        # 来源单元
        self.source_cell = source_cell

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.dest_cell is not None:
            result['dest_cell'] = self.dest_cell
        if self.source_cell is not None:
            result['source_cell'] = self.source_cell
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('dest_cell') is not None:
            self.dest_cell = m.get('dest_cell')
        if m.get('source_cell') is not None:
            self.source_cell = m.get('source_cell')
        return self


class Trend(TeaModel):
    def __init__(
        self,
        action_trend: List[ActionTrend] = None,
        activity_trend: List[ActivityTrend] = None,
        exception_trend: List[ExceptionTrend] = None,
    ):
        # 分支事务数趋势图
        self.action_trend = action_trend
        # 主事务数趋势图
        self.activity_trend = activity_trend
        # 事务失败数趋势图
        self.exception_trend = exception_trend

    def validate(self):
        self.validate_required(self.action_trend, 'action_trend')
        if self.action_trend:
            for k in self.action_trend:
                if k:
                    k.validate()
        self.validate_required(self.activity_trend, 'activity_trend')
        if self.activity_trend:
            for k in self.activity_trend:
                if k:
                    k.validate()
        self.validate_required(self.exception_trend, 'exception_trend')
        if self.exception_trend:
            for k in self.exception_trend:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['action_trend'] = []
        if self.action_trend is not None:
            for k in self.action_trend:
                result['action_trend'].append(k.to_map() if k else None)
        result['activity_trend'] = []
        if self.activity_trend is not None:
            for k in self.activity_trend:
                result['activity_trend'].append(k.to_map() if k else None)
        result['exception_trend'] = []
        if self.exception_trend is not None:
            for k in self.exception_trend:
                result['exception_trend'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.action_trend = []
        if m.get('action_trend') is not None:
            for k in m.get('action_trend'):
                temp_model = ActionTrend()
                self.action_trend.append(temp_model.from_map(k))
        self.activity_trend = []
        if m.get('activity_trend') is not None:
            for k in m.get('activity_trend'):
                temp_model = ActivityTrend()
                self.activity_trend.append(temp_model.from_map(k))
        self.exception_trend = []
        if m.get('exception_trend') is not None:
            for k in m.get('exception_trend'):
                temp_model = ExceptionTrend()
                self.exception_trend.append(temp_model.from_map(k))
        return self


class AppInfoVO(TeaModel):
    def __init__(
        self,
        action_array: List[Participator] = None,
        action_count: int = None,
        activity_count: int = None,
        activity_mode: int = None,
        app_name: str = None,
        db_rule_name: str = None,
        db_rule_template: str = None,
        desc: str = None,
        id: int = None,
        recovery_array: List[AppRecoveryVO] = None,
        table_rule_name: str = None,
        table_rule_template: str = None,
        used: bool = None,
        splite_mode: int = None,
    ):
        # 参与者数组
        self.action_array = action_array
        # 10
        self.action_count = action_count
        # 10
        self.activity_count = activity_count
        # 1 同库 2 异库
        self.activity_mode = activity_mode
        # app
        self.app_name = app_name
        # 分库规则
        self.db_rule_name = db_rule_name
        # 分库规则
        self.db_rule_template = db_rule_template
        # 一句话描述
        self.desc = desc
        # 唯一id
        self.id = id
        # 1
        self.recovery_array = recovery_array
        # 分表类型
        self.table_rule_name = table_rule_name
        # 分表规则
        self.table_rule_template = table_rule_template
        # 是否被使用
        self.used = used
        # 1 单库单表 2 分库分表
        self.splite_mode = splite_mode

    def validate(self):
        self.validate_required(self.action_array, 'action_array')
        if self.action_array:
            for k in self.action_array:
                if k:
                    k.validate()
        self.validate_required(self.action_count, 'action_count')
        self.validate_required(self.activity_count, 'activity_count')
        self.validate_required(self.activity_mode, 'activity_mode')
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.db_rule_name, 'db_rule_name')
        self.validate_required(self.db_rule_template, 'db_rule_template')
        self.validate_required(self.desc, 'desc')
        self.validate_required(self.id, 'id')
        self.validate_required(self.recovery_array, 'recovery_array')
        if self.recovery_array:
            for k in self.recovery_array:
                if k:
                    k.validate()
        self.validate_required(self.table_rule_name, 'table_rule_name')
        self.validate_required(self.table_rule_template, 'table_rule_template')
        self.validate_required(self.used, 'used')
        self.validate_required(self.splite_mode, 'splite_mode')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['action_array'] = []
        if self.action_array is not None:
            for k in self.action_array:
                result['action_array'].append(k.to_map() if k else None)
        if self.action_count is not None:
            result['action_count'] = self.action_count
        if self.activity_count is not None:
            result['activity_count'] = self.activity_count
        if self.activity_mode is not None:
            result['activity_mode'] = self.activity_mode
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.db_rule_name is not None:
            result['db_rule_name'] = self.db_rule_name
        if self.db_rule_template is not None:
            result['db_rule_template'] = self.db_rule_template
        if self.desc is not None:
            result['desc'] = self.desc
        if self.id is not None:
            result['id'] = self.id
        result['recovery_array'] = []
        if self.recovery_array is not None:
            for k in self.recovery_array:
                result['recovery_array'].append(k.to_map() if k else None)
        if self.table_rule_name is not None:
            result['table_rule_name'] = self.table_rule_name
        if self.table_rule_template is not None:
            result['table_rule_template'] = self.table_rule_template
        if self.used is not None:
            result['used'] = self.used
        if self.splite_mode is not None:
            result['splite_mode'] = self.splite_mode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.action_array = []
        if m.get('action_array') is not None:
            for k in m.get('action_array'):
                temp_model = Participator()
                self.action_array.append(temp_model.from_map(k))
        if m.get('action_count') is not None:
            self.action_count = m.get('action_count')
        if m.get('activity_count') is not None:
            self.activity_count = m.get('activity_count')
        if m.get('activity_mode') is not None:
            self.activity_mode = m.get('activity_mode')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('db_rule_name') is not None:
            self.db_rule_name = m.get('db_rule_name')
        if m.get('db_rule_template') is not None:
            self.db_rule_template = m.get('db_rule_template')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('id') is not None:
            self.id = m.get('id')
        self.recovery_array = []
        if m.get('recovery_array') is not None:
            for k in m.get('recovery_array'):
                temp_model = AppRecoveryVO()
                self.recovery_array.append(temp_model.from_map(k))
        if m.get('table_rule_name') is not None:
            self.table_rule_name = m.get('table_rule_name')
        if m.get('table_rule_template') is not None:
            self.table_rule_template = m.get('table_rule_template')
        if m.get('used') is not None:
            self.used = m.get('used')
        if m.get('splite_mode') is not None:
            self.splite_mode = m.get('splite_mode')
        return self


class DsNameInfo(TeaModel):
    def __init__(
        self,
        ds_name: str = None,
        ds_name_format: str = None,
    ):
        # ds_name
        self.ds_name = ds_name
        # ds_name_format
        self.ds_name_format = ds_name_format

    def validate(self):
        self.validate_required(self.ds_name, 'ds_name')
        self.validate_required(self.ds_name_format, 'ds_name_format')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ds_name is not None:
            result['ds_name'] = self.ds_name
        if self.ds_name_format is not None:
            result['ds_name_format'] = self.ds_name_format
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ds_name') is not None:
            self.ds_name = m.get('ds_name')
        if m.get('ds_name_format') is not None:
            self.ds_name_format = m.get('ds_name_format')
        return self


class RecoveryDTO(TeaModel):
    def __init__(
        self,
        client_version: str = None,
        group_id: str = None,
        id: int = None,
        is_asyn: bool = None,
        is_load_test: bool = None,
        is_mix: bool = None,
        recovery_limit: int = None,
        recovery_thread_num: int = None,
    ):
        # 客户端版本
        # 
        self.client_version = client_version
        # 发起方组编号
        self.group_id = group_id
        # 主键id，更新时需要
        self.id = id
        # 是否异步化
        self.is_asyn = is_asyn
        # 是否压测任务
        self.is_load_test = is_load_test
        # 是否混合模式
        self.is_mix = is_mix
        # 恢复条数/分/表
        self.recovery_limit = recovery_limit
        # 恢复线程数
        self.recovery_thread_num = recovery_thread_num

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.client_version is not None:
            result['client_version'] = self.client_version
        if self.group_id is not None:
            result['group_id'] = self.group_id
        if self.id is not None:
            result['id'] = self.id
        if self.is_asyn is not None:
            result['is_asyn'] = self.is_asyn
        if self.is_load_test is not None:
            result['is_load_test'] = self.is_load_test
        if self.is_mix is not None:
            result['is_mix'] = self.is_mix
        if self.recovery_limit is not None:
            result['recovery_limit'] = self.recovery_limit
        if self.recovery_thread_num is not None:
            result['recovery_thread_num'] = self.recovery_thread_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('client_version') is not None:
            self.client_version = m.get('client_version')
        if m.get('group_id') is not None:
            self.group_id = m.get('group_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('is_asyn') is not None:
            self.is_asyn = m.get('is_asyn')
        if m.get('is_load_test') is not None:
            self.is_load_test = m.get('is_load_test')
        if m.get('is_mix') is not None:
            self.is_mix = m.get('is_mix')
        if m.get('recovery_limit') is not None:
            self.recovery_limit = m.get('recovery_limit')
        if m.get('recovery_thread_num') is not None:
            self.recovery_thread_num = m.get('recovery_thread_num')
        return self


class Pair(TeaModel):
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


class AppActionVO(TeaModel):
    def __init__(
        self,
        app_name: str = None,
        action_array: List[str] = None,
    ):
        # 应用名
        self.app_name = app_name
        # 参与者名称数组
        self.action_array = action_array

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.action_array, 'action_array')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.action_array is not None:
            result['action_array'] = self.action_array
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('action_array') is not None:
            self.action_array = m.get('action_array')
        return self


class Initiator(TeaModel):
    def __init__(
        self,
        app_name: str = None,
        client_version: str = None,
        id: int = None,
        instance_id: str = None,
        is_asyn: bool = None,
        is_load_test: bool = None,
        is_mix: bool = None,
        recovery_datasources: List[InitiatorDatasource] = None,
        recovery_limit: int = None,
        recovery_thread_num: int = None,
    ):
        # 应用名
        self.app_name = app_name
        # 客户端版本
        self.client_version = client_version
        # 记录id
        self.id = id
        # 环境唯一标识
        self.instance_id = instance_id
        # 是否异步化
        self.is_asyn = is_asyn
        # 是否压测任务
        self.is_load_test = is_load_test
        # 是否混合模式
        self.is_mix = is_mix
        # 发起方数据源
        self.recovery_datasources = recovery_datasources
        # 恢复条数/分/表
        self.recovery_limit = recovery_limit
        # 恢复线程数
        self.recovery_thread_num = recovery_thread_num

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.client_version, 'client_version')
        self.validate_required(self.id, 'id')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.is_asyn, 'is_asyn')
        self.validate_required(self.is_load_test, 'is_load_test')
        self.validate_required(self.is_mix, 'is_mix')
        self.validate_required(self.recovery_datasources, 'recovery_datasources')
        if self.recovery_datasources:
            for k in self.recovery_datasources:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.client_version is not None:
            result['client_version'] = self.client_version
        if self.id is not None:
            result['id'] = self.id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.is_asyn is not None:
            result['is_asyn'] = self.is_asyn
        if self.is_load_test is not None:
            result['is_load_test'] = self.is_load_test
        if self.is_mix is not None:
            result['is_mix'] = self.is_mix
        result['recovery_datasources'] = []
        if self.recovery_datasources is not None:
            for k in self.recovery_datasources:
                result['recovery_datasources'].append(k.to_map() if k else None)
        if self.recovery_limit is not None:
            result['recovery_limit'] = self.recovery_limit
        if self.recovery_thread_num is not None:
            result['recovery_thread_num'] = self.recovery_thread_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('client_version') is not None:
            self.client_version = m.get('client_version')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('is_asyn') is not None:
            self.is_asyn = m.get('is_asyn')
        if m.get('is_load_test') is not None:
            self.is_load_test = m.get('is_load_test')
        if m.get('is_mix') is not None:
            self.is_mix = m.get('is_mix')
        self.recovery_datasources = []
        if m.get('recovery_datasources') is not None:
            for k in m.get('recovery_datasources'):
                temp_model = InitiatorDatasource()
                self.recovery_datasources.append(temp_model.from_map(k))
        if m.get('recovery_limit') is not None:
            self.recovery_limit = m.get('recovery_limit')
        if m.get('recovery_thread_num') is not None:
            self.recovery_thread_num = m.get('recovery_thread_num')
        return self


class TrasactionAppInfo(TeaModel):
    def __init__(
        self,
        app_name: str = None,
        recovery_id: int = None,
    ):
        # 应用名
        self.app_name = app_name
        # recovery_id
        self.recovery_id = recovery_id

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.recovery_id, 'recovery_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.recovery_id is not None:
            result['recovery_id'] = self.recovery_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('recovery_id') is not None:
            self.recovery_id = m.get('recovery_id')
        return self


class AppStats(TeaModel):
    def __init__(
        self,
        app_name: str = None,
        exception_total: int = None,
        gmt_create: str = None,
        initiator: List[str] = None,
        participator: List[str] = None,
        today_total: int = None,
        action_mode: int = None,
        id: int = None,
    ):
        # app name
        self.app_name = app_name
        # 异常数
        self.exception_total = exception_total
        # 时间
        self.gmt_create = gmt_create
        # 发起方
        self.initiator = initiator
        # 参与者
        self.participator = participator
        # 今日事务总数
        self.today_total = today_total
        # Saga模式返回3，其它模式不返回
        self.action_mode = action_mode
        # 字段ID
        self.id = id

    def validate(self):
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.exception_total is not None:
            result['exception_total'] = self.exception_total
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.initiator is not None:
            result['initiator'] = self.initiator
        if self.participator is not None:
            result['participator'] = self.participator
        if self.today_total is not None:
            result['today_total'] = self.today_total
        if self.action_mode is not None:
            result['action_mode'] = self.action_mode
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('exception_total') is not None:
            self.exception_total = m.get('exception_total')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('initiator') is not None:
            self.initiator = m.get('initiator')
        if m.get('participator') is not None:
            self.participator = m.get('participator')
        if m.get('today_total') is not None:
            self.today_total = m.get('today_total')
        if m.get('action_mode') is not None:
            self.action_mode = m.get('action_mode')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class Correction(TeaModel):
    def __init__(
        self,
        action_context: str = None,
        action_name: str = None,
        action_type: int = None,
        activity_context: str = None,
        app_name: str = None,
        gmt_create: str = None,
        id: int = None,
        operator: str = None,
        state: str = None,
        sync_acctrans: int = None,
        sync_paycore: int = None,
        tracer_context: str = None,
        tx_id: str = None,
    ):
        # 分支事务上下文
        self.action_context = action_context
        # 参与者名称
        self.action_name = action_name
        # 1：提交，2：回滚
        self.action_type = action_type
        # 主事务上下文
        self.activity_context = activity_context
        # 应用名
        self.app_name = app_name
        # 创建时间
        self.gmt_create = gmt_create
        # 记录id
        self.id = id
        # 操作人
        self.operator = operator
        # 0 已提交  4 已执行
        self.state = state
        # 是否同步主账务；0、不同步，1、同步
        self.sync_acctrans = sync_acctrans
        # 是否同步统一支付；0、不同步，1同步
        self.sync_paycore = sync_paycore
        # tracer上下文
        self.tracer_context = tracer_context
        # 事务id
        self.tx_id = tx_id

    def validate(self):
        self.validate_required(self.action_context, 'action_context')
        self.validate_required(self.action_name, 'action_name')
        self.validate_required(self.action_type, 'action_type')
        self.validate_required(self.activity_context, 'activity_context')
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.id, 'id')
        self.validate_required(self.operator, 'operator')
        self.validate_required(self.state, 'state')
        self.validate_required(self.sync_acctrans, 'sync_acctrans')
        self.validate_required(self.sync_paycore, 'sync_paycore')
        self.validate_required(self.tx_id, 'tx_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.action_context is not None:
            result['action_context'] = self.action_context
        if self.action_name is not None:
            result['action_name'] = self.action_name
        if self.action_type is not None:
            result['action_type'] = self.action_type
        if self.activity_context is not None:
            result['activity_context'] = self.activity_context
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.id is not None:
            result['id'] = self.id
        if self.operator is not None:
            result['operator'] = self.operator
        if self.state is not None:
            result['state'] = self.state
        if self.sync_acctrans is not None:
            result['sync_acctrans'] = self.sync_acctrans
        if self.sync_paycore is not None:
            result['sync_paycore'] = self.sync_paycore
        if self.tracer_context is not None:
            result['tracer_context'] = self.tracer_context
        if self.tx_id is not None:
            result['tx_id'] = self.tx_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('action_context') is not None:
            self.action_context = m.get('action_context')
        if m.get('action_name') is not None:
            self.action_name = m.get('action_name')
        if m.get('action_type') is not None:
            self.action_type = m.get('action_type')
        if m.get('activity_context') is not None:
            self.activity_context = m.get('activity_context')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('sync_acctrans') is not None:
            self.sync_acctrans = m.get('sync_acctrans')
        if m.get('sync_paycore') is not None:
            self.sync_paycore = m.get('sync_paycore')
        if m.get('tracer_context') is not None:
            self.tracer_context = m.get('tracer_context')
        if m.get('tx_id') is not None:
            self.tx_id = m.get('tx_id')
        return self


class AsynDbTxInfo(TeaModel):
    def __init__(
        self,
        action_mode: int = None,
        activity_mode: int = None,
        app_name: str = None,
        biz_type: str = None,
        desc: str = None,
        instance_id: str = None,
        role: int = None,
        split_rule: SplitRule = None,
    ):
        # action_mode
        self.action_mode = action_mode
        # activity_mode
        self.activity_mode = activity_mode
        # app_name
        self.app_name = app_name
        # biz_type
        self.biz_type = biz_type
        # desc
        self.desc = desc
        # instance_id
        self.instance_id = instance_id
        # role
        self.role = role
        # split_rule
        self.split_rule = split_rule

    def validate(self):
        self.validate_required(self.activity_mode, 'activity_mode')
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.role, 'role')
        if self.split_rule:
            self.split_rule.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.action_mode is not None:
            result['action_mode'] = self.action_mode
        if self.activity_mode is not None:
            result['activity_mode'] = self.activity_mode
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.desc is not None:
            result['desc'] = self.desc
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.role is not None:
            result['role'] = self.role
        if self.split_rule is not None:
            result['split_rule'] = self.split_rule.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('action_mode') is not None:
            self.action_mode = m.get('action_mode')
        if m.get('activity_mode') is not None:
            self.activity_mode = m.get('activity_mode')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('role') is not None:
            self.role = m.get('role')
        if m.get('split_rule') is not None:
            temp_model = SplitRule()
            self.split_rule = temp_model.from_map(m['split_rule'])
        return self


class ActionInfo(TeaModel):
    def __init__(
        self,
        action_mode: str = None,
        action_name: str = None,
        app_name: str = None,
        commit: str = None,
        rollback: str = None,
        ws_tr: str = None,
    ):
        # action_mode
        self.action_mode = action_mode
        # action_name
        self.action_name = action_name
        # app_name
        self.app_name = app_name
        # commit
        self.commit = commit
        # rollback
        self.rollback = rollback
        # ws_tr
        self.ws_tr = ws_tr

    def validate(self):
        self.validate_required(self.action_name, 'action_name')
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.commit, 'commit')
        self.validate_required(self.rollback, 'rollback')
        self.validate_required(self.ws_tr, 'ws_tr')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.action_mode is not None:
            result['action_mode'] = self.action_mode
        if self.action_name is not None:
            result['action_name'] = self.action_name
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.commit is not None:
            result['commit'] = self.commit
        if self.rollback is not None:
            result['rollback'] = self.rollback
        if self.ws_tr is not None:
            result['ws_tr'] = self.ws_tr
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('action_mode') is not None:
            self.action_mode = m.get('action_mode')
        if m.get('action_name') is not None:
            self.action_name = m.get('action_name')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('commit') is not None:
            self.commit = m.get('commit')
        if m.get('rollback') is not None:
            self.rollback = m.get('rollback')
        if m.get('ws_tr') is not None:
            self.ws_tr = m.get('ws_tr')
        return self


class OrderByParams(TeaModel):
    def __init__(
        self,
        order_name: str = None,
        order_type: str = None,
    ):
        # 排序字段
        self.order_name = order_name
        # asc 正序  desc 倒序
        self.order_type = order_type

    def validate(self):
        self.validate_required(self.order_name, 'order_name')
        self.validate_required(self.order_type, 'order_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_name is not None:
            result['order_name'] = self.order_name
        if self.order_type is not None:
            result['order_type'] = self.order_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_name') is not None:
            self.order_name = m.get('order_name')
        if m.get('order_type') is not None:
            self.order_type = m.get('order_type')
        return self


class DebugRecord(TeaModel):
    def __init__(
        self,
        app_name: str = None,
        debug_type: int = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        id: int = None,
        initiator: DebugInitiator = None,
        instance_id: str = None,
        operator: str = None,
        participator: DebugParticipator = None,
        state: str = None,
        msg: str = None,
    ):
        # 应用名
        self.app_name = app_name
        # 1：发起方联调，2：参与者联调
        self.debug_type = debug_type
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified
        # 记录id
        self.id = id
        # 发起方信息
        self.initiator = initiator
        # 环境唯一标识
        self.instance_id = instance_id
        # 执行人
        self.operator = operator
        # 参与者信息
        self.participator = participator
        # 状态
        self.state = state
        # 联调结果信息
        self.msg = msg

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.debug_type, 'debug_type')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        self.validate_required(self.id, 'id')
        self.validate_required(self.initiator, 'initiator')
        if self.initiator:
            self.initiator.validate()
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.operator, 'operator')
        self.validate_required(self.participator, 'participator')
        if self.participator:
            self.participator.validate()
        self.validate_required(self.state, 'state')
        self.validate_required(self.msg, 'msg')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.debug_type is not None:
            result['debug_type'] = self.debug_type
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.id is not None:
            result['id'] = self.id
        if self.initiator is not None:
            result['initiator'] = self.initiator.to_map()
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.operator is not None:
            result['operator'] = self.operator
        if self.participator is not None:
            result['participator'] = self.participator.to_map()
        if self.state is not None:
            result['state'] = self.state
        if self.msg is not None:
            result['msg'] = self.msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('debug_type') is not None:
            self.debug_type = m.get('debug_type')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('initiator') is not None:
            temp_model = DebugInitiator()
            self.initiator = temp_model.from_map(m['initiator'])
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('participator') is not None:
            temp_model = DebugParticipator()
            self.participator = temp_model.from_map(m['participator'])
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        return self


class TableSplitRule(TeaModel):
    def __init__(
        self,
        rule_name: str = None,
        rule_template: str = None,
    ):
        # 分表规则名
        self.rule_name = rule_name
        # 格式模板
        self.rule_template = rule_template

    def validate(self):
        self.validate_required(self.rule_name, 'rule_name')
        self.validate_required(self.rule_template, 'rule_template')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.rule_name is not None:
            result['rule_name'] = self.rule_name
        if self.rule_template is not None:
            result['rule_template'] = self.rule_template
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('rule_name') is not None:
            self.rule_name = m.get('rule_name')
        if m.get('rule_template') is not None:
            self.rule_template = m.get('rule_template')
        return self


class WhiteListInfo(TeaModel):
    def __init__(
        self,
        app_name: str = None,
        gmt_create: str = None,
        id: int = None,
        instance_id: str = None,
        is_elastic: int = None,
        is_load_test: int = None,
        logical_ds_name: str = None,
        business_type: str = None,
    ):
        # app_ame
        self.app_name = app_name
        # 2018-10-10T10:10:00Z
        self.gmt_create = gmt_create
        # id
        self.id = id
        # instance_id
        self.instance_id = instance_id
        # 机房选择：0非弹机房，1弹性机房；
        self.is_elastic = is_elastic
        # 0正常流量，1影子流量；
        self.is_load_test = is_load_test
        # 数据源名称
        self.logical_ds_name = logical_ds_name
        # business_type
        self.business_type = business_type

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.id, 'id')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.is_elastic, 'is_elastic')
        self.validate_required(self.is_load_test, 'is_load_test')
        self.validate_required(self.logical_ds_name, 'logical_ds_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.id is not None:
            result['id'] = self.id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.is_elastic is not None:
            result['is_elastic'] = self.is_elastic
        if self.is_load_test is not None:
            result['is_load_test'] = self.is_load_test
        if self.logical_ds_name is not None:
            result['logical_ds_name'] = self.logical_ds_name
        if self.business_type is not None:
            result['business_type'] = self.business_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('is_elastic') is not None:
            self.is_elastic = m.get('is_elastic')
        if m.get('is_load_test') is not None:
            self.is_load_test = m.get('is_load_test')
        if m.get('logical_ds_name') is not None:
            self.logical_ds_name = m.get('logical_ds_name')
        if m.get('business_type') is not None:
            self.business_type = m.get('business_type')
        return self


class GlobalStats(TeaModel):
    def __init__(
        self,
        exception: int = None,
        activity: int = None,
        today: int = None,
        connection: int = None,
    ):
        # 异常事务数
        self.exception = exception
        # 进行中事务数
        self.activity = activity
        # 当天事务数
        self.today = today
        # connection
        self.connection = connection

    def validate(self):
        self.validate_required(self.exception, 'exception')
        self.validate_required(self.activity, 'activity')
        self.validate_required(self.today, 'today')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.exception is not None:
            result['exception'] = self.exception
        if self.activity is not None:
            result['activity'] = self.activity
        if self.today is not None:
            result['today'] = self.today
        if self.connection is not None:
            result['connection'] = self.connection
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('exception') is not None:
            self.exception = m.get('exception')
        if m.get('activity') is not None:
            self.activity = m.get('activity')
        if m.get('today') is not None:
            self.today = m.get('today')
        if m.get('connection') is not None:
            self.connection = m.get('connection')
        return self


class TransactionParticipators(TeaModel):
    def __init__(
        self,
        participators: List[TransactionsParticipator] = None,
        transaction_info: TransactionInfo = None,
    ):
        # 参与者详情列表
        self.participators = participators
        # 事务详情
        self.transaction_info = transaction_info

    def validate(self):
        self.validate_required(self.participators, 'participators')
        if self.participators:
            for k in self.participators:
                if k:
                    k.validate()
        self.validate_required(self.transaction_info, 'transaction_info')
        if self.transaction_info:
            self.transaction_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['participators'] = []
        if self.participators is not None:
            for k in self.participators:
                result['participators'].append(k.to_map() if k else None)
        if self.transaction_info is not None:
            result['transaction_info'] = self.transaction_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.participators = []
        if m.get('participators') is not None:
            for k in m.get('participators'):
                temp_model = TransactionsParticipator()
                self.participators.append(temp_model.from_map(k))
        if m.get('transaction_info') is not None:
            temp_model = TransactionInfo()
            self.transaction_info = temp_model.from_map(m['transaction_info'])
        return self


class AppTxInfo(TeaModel):
    def __init__(
        self,
        app_info: AppInfo = None,
        stats: Stats = None,
    ):
        # appInfo
        self.app_info = app_info
        # Stats
        self.stats = stats

    def validate(self):
        self.validate_required(self.app_info, 'app_info')
        if self.app_info:
            self.app_info.validate()
        self.validate_required(self.stats, 'stats')
        if self.stats:
            self.stats.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.app_info is not None:
            result['app_info'] = self.app_info.to_map()
        if self.stats is not None:
            result['stats'] = self.stats.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app_info') is not None:
            temp_model = AppInfo()
            self.app_info = temp_model.from_map(m['app_info'])
        if m.get('stats') is not None:
            temp_model = Stats()
            self.stats = temp_model.from_map(m['stats'])
        return self


class TransactionChartInfo(TeaModel):
    def __init__(
        self,
        biz_id: str = None,
        biz_type: str = None,
        cost: int = None,
        edges: List[TransactionEdge] = None,
        end_time: str = None,
        last_handle_time: str = None,
        lower_line_count: int = None,
        nodes: List[TransactionNode] = None,
        participator_num: int = None,
        starter_ip: str = None,
        starter_name: str = None,
        start_time: str = None,
        state: str = None,
        tx_id: str = None,
        upper_line_count: int = None,
        action_mode: int = None,
    ):
        # a
        self.biz_id = biz_id
        # biz_type
        self.biz_type = biz_type
        # cost
        self.cost = cost
        # edges
        self.edges = edges
        # end_time
        self.end_time = end_time
        # last_handle_time
        self.last_handle_time = last_handle_time
        # lowerLineCount
        self.lower_line_count = lower_line_count
        # nodes
        self.nodes = nodes
        # participatorNum
        self.participator_num = participator_num
        # starter_ip
        self.starter_ip = starter_ip
        # starterName
        self.starter_name = starter_name
        # start_time
        self.start_time = start_time
        # state
        self.state = state
        # txid
        self.tx_id = tx_id
        # upper_line_count
        self.upper_line_count = upper_line_count
        # action_mode
        self.action_mode = action_mode

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.cost, 'cost')
        self.validate_required(self.edges, 'edges')
        if self.edges:
            for k in self.edges:
                if k:
                    k.validate()
        self.validate_required(self.lower_line_count, 'lower_line_count')
        self.validate_required(self.nodes, 'nodes')
        if self.nodes:
            for k in self.nodes:
                if k:
                    k.validate()
        self.validate_required(self.participator_num, 'participator_num')
        self.validate_required(self.starter_ip, 'starter_ip')
        self.validate_required(self.starter_name, 'starter_name')
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.state, 'state')
        self.validate_required(self.tx_id, 'tx_id')
        self.validate_required(self.upper_line_count, 'upper_line_count')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.cost is not None:
            result['cost'] = self.cost
        result['edges'] = []
        if self.edges is not None:
            for k in self.edges:
                result['edges'].append(k.to_map() if k else None)
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.last_handle_time is not None:
            result['last_handle_time'] = self.last_handle_time
        if self.lower_line_count is not None:
            result['lower_line_count'] = self.lower_line_count
        result['nodes'] = []
        if self.nodes is not None:
            for k in self.nodes:
                result['nodes'].append(k.to_map() if k else None)
        if self.participator_num is not None:
            result['participator_num'] = self.participator_num
        if self.starter_ip is not None:
            result['starter_ip'] = self.starter_ip
        if self.starter_name is not None:
            result['starter_name'] = self.starter_name
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.state is not None:
            result['state'] = self.state
        if self.tx_id is not None:
            result['tx_id'] = self.tx_id
        if self.upper_line_count is not None:
            result['upper_line_count'] = self.upper_line_count
        if self.action_mode is not None:
            result['action_mode'] = self.action_mode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('cost') is not None:
            self.cost = m.get('cost')
        self.edges = []
        if m.get('edges') is not None:
            for k in m.get('edges'):
                temp_model = TransactionEdge()
                self.edges.append(temp_model.from_map(k))
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('last_handle_time') is not None:
            self.last_handle_time = m.get('last_handle_time')
        if m.get('lower_line_count') is not None:
            self.lower_line_count = m.get('lower_line_count')
        self.nodes = []
        if m.get('nodes') is not None:
            for k in m.get('nodes'):
                temp_model = TransactionNode()
                self.nodes.append(temp_model.from_map(k))
        if m.get('participator_num') is not None:
            self.participator_num = m.get('participator_num')
        if m.get('starter_ip') is not None:
            self.starter_ip = m.get('starter_ip')
        if m.get('starter_name') is not None:
            self.starter_name = m.get('starter_name')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('tx_id') is not None:
            self.tx_id = m.get('tx_id')
        if m.get('upper_line_count') is not None:
            self.upper_line_count = m.get('upper_line_count')
        if m.get('action_mode') is not None:
            self.action_mode = m.get('action_mode')
        return self


class CreateAppsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        activity_mode: int = None,
        app_name: str = None,
        desc: str = None,
        instance_id: str = None,
        split_rule: SplitRule = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 1：同库模式，事务记录表在业务侧；
        # 2：异库模式。
        self.activity_mode = activity_mode
        # 应用名
        self.app_name = app_name
        # 应用描述
        self.desc = desc
        # 环境唯一标识
        self.instance_id = instance_id
        # 分库分表规则
        self.split_rule = split_rule

    def validate(self):
        self.validate_required(self.activity_mode, 'activity_mode')
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.desc, 'desc')
        self.validate_required(self.instance_id, 'instance_id')
        if self.split_rule:
            self.split_rule.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.activity_mode is not None:
            result['activity_mode'] = self.activity_mode
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.desc is not None:
            result['desc'] = self.desc
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.split_rule is not None:
            result['split_rule'] = self.split_rule.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('activity_mode') is not None:
            self.activity_mode = m.get('activity_mode')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('split_rule') is not None:
            temp_model = SplitRule()
            self.split_rule = temp_model.from_map(m['split_rule'])
        return self


class CreateAppsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回消息
        self.msg = msg
        # 返回结果
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class CreateRecoveryInitiatorsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        action_mode: int = None,
        activity_mode: int = None,
        app_name: str = None,
        biz_type: str = None,
        client_version: str = None,
        desc: str = None,
        instance_id: str = None,
        is_asyn: bool = None,
        is_load_test: bool = None,
        is_mix: bool = None,
        recovery_datasources: List[InitiatorDatasource] = None,
        recovery_limit: int = None,
        recovery_thread_num: int = None,
        split_mode: str = None,
        split_rule: SplitRule = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # action_mode
        self.action_mode = action_mode
        # activity_mode
        self.activity_mode = activity_mode
        # 应用名
        self.app_name = app_name
        # 业务码
        self.biz_type = biz_type
        # Client 版本
        self.client_version = client_version
        # 应用描述
        # 
        self.desc = desc
        # 环境唯一标识
        self.instance_id = instance_id
        # 是否异步化
        self.is_asyn = is_asyn
        # 是否压测任务
        self.is_load_test = is_load_test
        # 是否混合模式
        self.is_mix = is_mix
        # 发起方数据源
        self.recovery_datasources = recovery_datasources
        # 恢复条数/分/表
        self.recovery_limit = recovery_limit
        # 恢复线程数
        self.recovery_thread_num = recovery_thread_num
        # SINGLE：单库单表 SPLIT：分库分表
        # 
        self.split_mode = split_mode
        # 分库分表规则
        # 
        self.split_rule = split_rule

    def validate(self):
        self.validate_required(self.activity_mode, 'activity_mode')
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.client_version, 'client_version')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.is_asyn, 'is_asyn')
        self.validate_required(self.is_load_test, 'is_load_test')
        self.validate_required(self.is_mix, 'is_mix')
        self.validate_required(self.recovery_datasources, 'recovery_datasources')
        if self.recovery_datasources:
            for k in self.recovery_datasources:
                if k:
                    k.validate()
        self.validate_required(self.recovery_limit, 'recovery_limit')
        self.validate_required(self.recovery_thread_num, 'recovery_thread_num')
        if self.split_rule:
            self.split_rule.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.action_mode is not None:
            result['action_mode'] = self.action_mode
        if self.activity_mode is not None:
            result['activity_mode'] = self.activity_mode
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.client_version is not None:
            result['client_version'] = self.client_version
        if self.desc is not None:
            result['desc'] = self.desc
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.is_asyn is not None:
            result['is_asyn'] = self.is_asyn
        if self.is_load_test is not None:
            result['is_load_test'] = self.is_load_test
        if self.is_mix is not None:
            result['is_mix'] = self.is_mix
        result['recovery_datasources'] = []
        if self.recovery_datasources is not None:
            for k in self.recovery_datasources:
                result['recovery_datasources'].append(k.to_map() if k else None)
        if self.recovery_limit is not None:
            result['recovery_limit'] = self.recovery_limit
        if self.recovery_thread_num is not None:
            result['recovery_thread_num'] = self.recovery_thread_num
        if self.split_mode is not None:
            result['split_mode'] = self.split_mode
        if self.split_rule is not None:
            result['split_rule'] = self.split_rule.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('action_mode') is not None:
            self.action_mode = m.get('action_mode')
        if m.get('activity_mode') is not None:
            self.activity_mode = m.get('activity_mode')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('client_version') is not None:
            self.client_version = m.get('client_version')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('is_asyn') is not None:
            self.is_asyn = m.get('is_asyn')
        if m.get('is_load_test') is not None:
            self.is_load_test = m.get('is_load_test')
        if m.get('is_mix') is not None:
            self.is_mix = m.get('is_mix')
        self.recovery_datasources = []
        if m.get('recovery_datasources') is not None:
            for k in m.get('recovery_datasources'):
                temp_model = InitiatorDatasource()
                self.recovery_datasources.append(temp_model.from_map(k))
        if m.get('recovery_limit') is not None:
            self.recovery_limit = m.get('recovery_limit')
        if m.get('recovery_thread_num') is not None:
            self.recovery_thread_num = m.get('recovery_thread_num')
        if m.get('split_mode') is not None:
            self.split_mode = m.get('split_mode')
        if m.get('split_rule') is not None:
            temp_model = SplitRule()
            self.split_rule = temp_model.from_map(m['split_rule'])
        return self


class CreateRecoveryInitiatorsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回的结果文本
        self.msg = msg
        # 返回结果
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class CountAppsStatsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_type: str = None,
        instance_id: str = None,
        app_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用名
        self.biz_type = biz_type
        # 环境唯一标识
        self.instance_id = instance_id
        # app_name
        self.app_name = app_name

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.app_name, 'app_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.app_name is not None:
            result['app_name'] = self.app_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        return self


class CountAppsStatsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AppTxInfo = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 应用统计信息
        self.data = data
        # 接口返回码
        self.success = success

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
            temp_model = AppTxInfo()
            self.data = temp_model.from_map(m['data'])
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class ListAppsBiztypesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 环境唯一标识
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class ListAppsBiztypesResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[str] = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # bizType列表
        self.data = data
        # 接口返回码
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
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class ExportAppsConfigsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        instance_id: str = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用名
        self.app_name = app_name
        # 环境唯一标识
        self.instance_id = instance_id
        # 类型（发起方/参与者）
        self.type = type

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.instance_id, 'instance_id')
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
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class ExportAppsConfigsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        url: str = None,
        context: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 接口返回码
        self.success = success
        # 接口返回文件URL
        self.url = url
        # 导出配置信息，json
        self.context = context

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
        if self.url is not None:
            result['url'] = self.url
        if self.context is not None:
            result['context'] = self.context
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
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('context') is not None:
            self.context = m.get('context')
        return self


class AllAppsAppnamesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 环境唯一标识
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class AllAppsAppnamesResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[str] = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # appname列表
        self.data = data
        # 接口返回码
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
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class ListAppsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        biz_type: str = None,
        current_page: int = None,
        instance_id: str = None,
        page_size: int = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # app_name
        self.app_name = app_name
        # bizType查询条件
        self.biz_type = biz_type
        # 当前页
        self.current_page = current_page
        # 环境唯一标识
        self.instance_id = instance_id
        # 单页大小
        self.page_size = page_size
        # initiator|participator  app_name作为发起者还是参与者
        self.type = type

    def validate(self):
        self.validate_required(self.current_page, 'current_page')
        self.validate_required(self.instance_id, 'instance_id')
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
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class ListAppsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current_page: int = None,
        data: List[AppStats] = None,
        page_size: int = None,
        success: bool = None,
        total: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前页
        self.current_page = current_page
        # 应用列表
        self.data = data
        # 单页大小
        self.page_size = page_size
        # 接口返回码
        self.success = success
        # 总数
        self.total = total

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
        if self.current_page is not None:
            result['current_page'] = self.current_page
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        if self.page_size is not None:
            result['page_size'] = self.page_size
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
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = AppStats()
                self.data.append(temp_model.from_map(k))
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class GetRecoveryParticipatorsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_type: str = None,
        id: int = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # biz_type
        self.biz_type = biz_type
        # id
        self.id = id
        # instance_id
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.id, 'id')
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.id is not None:
            result['id'] = self.id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class GetRecoveryParticipatorsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        action_name: str = None,
        app_name: str = None,
        biz_type: str = None,
        biz_type_id: int = None,
        class_name: str = None,
        commit_method_name: str = None,
        commit_method_params_type: int = None,
        elastic_key: str = None,
        elastic_route_rule: str = None,
        id: int = None,
        instance_id: str = None,
        is_zone_route: bool = None,
        rollback_method_name: str = None,
        rollback_method_params_type: int = None,
        test_url: str = None,
        unique_id: str = None,
        ws_tr: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # action_name
        self.action_name = action_name
        # app_name
        self.app_name = app_name
        # biz_type
        self.biz_type = biz_type
        # 关联关系表的id，用于更新
        self.biz_type_id = biz_type_id
        # class_name
        self.class_name = class_name
        # commit_method_name
        self.commit_method_name = commit_method_name
        # commit_method_params_type
        self.commit_method_params_type = commit_method_params_type
        # elastic_key
        self.elastic_key = elastic_key
        # elastic_route_rule
        self.elastic_route_rule = elastic_route_rule
        # id
        self.id = id
        # instance_id
        self.instance_id = instance_id
        # is_zone_route
        self.is_zone_route = is_zone_route
        # rollback_method_name
        self.rollback_method_name = rollback_method_name
        # rollback_method_params_type
        self.rollback_method_params_type = rollback_method_params_type
        # test_url
        self.test_url = test_url
        # unique_id
        self.unique_id = unique_id
        # ws_tr
        self.ws_tr = ws_tr

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
        if self.action_name is not None:
            result['action_name'] = self.action_name
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.biz_type_id is not None:
            result['biz_type_id'] = self.biz_type_id
        if self.class_name is not None:
            result['class_name'] = self.class_name
        if self.commit_method_name is not None:
            result['commit_method_name'] = self.commit_method_name
        if self.commit_method_params_type is not None:
            result['commit_method_params_type'] = self.commit_method_params_type
        if self.elastic_key is not None:
            result['elastic_key'] = self.elastic_key
        if self.elastic_route_rule is not None:
            result['elastic_route_rule'] = self.elastic_route_rule
        if self.id is not None:
            result['id'] = self.id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.is_zone_route is not None:
            result['is_zone_route'] = self.is_zone_route
        if self.rollback_method_name is not None:
            result['rollback_method_name'] = self.rollback_method_name
        if self.rollback_method_params_type is not None:
            result['rollback_method_params_type'] = self.rollback_method_params_type
        if self.test_url is not None:
            result['test_url'] = self.test_url
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        if self.ws_tr is not None:
            result['ws_tr'] = self.ws_tr
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('action_name') is not None:
            self.action_name = m.get('action_name')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('biz_type_id') is not None:
            self.biz_type_id = m.get('biz_type_id')
        if m.get('class_name') is not None:
            self.class_name = m.get('class_name')
        if m.get('commit_method_name') is not None:
            self.commit_method_name = m.get('commit_method_name')
        if m.get('commit_method_params_type') is not None:
            self.commit_method_params_type = m.get('commit_method_params_type')
        if m.get('elastic_key') is not None:
            self.elastic_key = m.get('elastic_key')
        if m.get('elastic_route_rule') is not None:
            self.elastic_route_rule = m.get('elastic_route_rule')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('is_zone_route') is not None:
            self.is_zone_route = m.get('is_zone_route')
        if m.get('rollback_method_name') is not None:
            self.rollback_method_name = m.get('rollback_method_name')
        if m.get('rollback_method_params_type') is not None:
            self.rollback_method_params_type = m.get('rollback_method_params_type')
        if m.get('test_url') is not None:
            self.test_url = m.get('test_url')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        if m.get('ws_tr') is not None:
            self.ws_tr = m.get('ws_tr')
        return self


class ImportAppsConfigsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        file_name: str = None,
        instance_id: str = None,
        type: str = None,
        context: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # app_name
        self.app_name = app_name
        # 上传文件名
        self.file_name = file_name
        # instance_id
        self.instance_id = instance_id
        # initiator|participator
        self.type = type
        # 导入的内容，严格的json
        self.context = context

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')

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
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.type is not None:
            result['type'] = self.type
        if self.context is not None:
            result['context'] = self.context
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('context') is not None:
            self.context = m.get('context')
        return self


class ImportAppsConfigsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # msg
        self.msg = msg
        # 上传成功
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class GetUploadUrlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        instance_id: str = None,
        app_name: str = None,
        file_name: str = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # instance_id
        self.instance_id = instance_id
        # app_name
        self.app_name = app_name
        # 文件名
        self.file_name = file_name
        # 文件类型，对应folder
        self.type = type

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.file_name, 'file_name')
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
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class GetUploadUrlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        url: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文件URL
        self.url = url
        # 是否成功
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
        if self.url is not None:
            result['url'] = self.url
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
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryAppsBiztypeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        biz_type: str = None,
        instance_id: str = None,
        statemachine_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # app_name
        self.app_name = app_name
        # biz_type
        self.biz_type = biz_type
        # instance_id
        self.instance_id = instance_id
        # saga状态机定义id
        self.statemachine_id = statemachine_id

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.instance_id, 'instance_id')

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
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.statemachine_id is not None:
            result['statemachine_id'] = self.statemachine_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('statemachine_id') is not None:
            self.statemachine_id = m.get('statemachine_id')
        return self


class QueryAppsBiztypeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        asyn_info: AsynDbTxInfo = None,
        content: str = None,
        initiator: Initiator = None,
        participators: List[Participator] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 异库模式更新信息
        self.asyn_info = asyn_info
        # Saga状态机的json定义
        self.content = content
        # initiator
        self.initiator = initiator
        # participators
        self.participators = participators

    def validate(self):
        if self.asyn_info:
            self.asyn_info.validate()
        if self.initiator:
            self.initiator.validate()
        if self.participators:
            for k in self.participators:
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
        if self.asyn_info is not None:
            result['asyn_info'] = self.asyn_info.to_map()
        if self.content is not None:
            result['content'] = self.content
        if self.initiator is not None:
            result['initiator'] = self.initiator.to_map()
        result['participators'] = []
        if self.participators is not None:
            for k in self.participators:
                result['participators'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('asyn_info') is not None:
            temp_model = AsynDbTxInfo()
            self.asyn_info = temp_model.from_map(m['asyn_info'])
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('initiator') is not None:
            temp_model = Initiator()
            self.initiator = temp_model.from_map(m['initiator'])
        self.participators = []
        if m.get('participators') is not None:
            for k in m.get('participators'):
                temp_model = Participator()
                self.participators.append(temp_model.from_map(k))
        return self


class ListAppsRecoverydsnameRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # app_name
        self.app_name = app_name
        # instance_id
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.instance_id, 'instance_id')

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
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class ListAppsRecoverydsnameResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[str] = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据源列表
        self.data = data
        # success
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
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class GetAppsBiztypeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        biz_type: str = None,
        instance_id: str = None,
        statemachine_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用名称
        self.app_name = app_name
        # 业务类型
        self.biz_type = biz_type
        # 000001
        self.instance_id = instance_id
        # saga状态机定义id
        self.statemachine_id = statemachine_id

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.instance_id, 'instance_id')

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
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.statemachine_id is not None:
            result['statemachine_id'] = self.statemachine_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('statemachine_id') is not None:
            self.statemachine_id = m.get('statemachine_id')
        return self


class GetAppsBiztypeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        app_name: str = None,
        data: List[ActionInfo] = None,
        statemachine_json: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 应用名
        self.app_name = app_name
        # 参与者信息
        self.data = data
        # Saga状态机的json定义
        self.statemachine_json = statemachine_json

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
        if self.app_name is not None:
            result['app_name'] = self.app_name
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        if self.statemachine_json is not None:
            result['statemachine_json'] = self.statemachine_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = ActionInfo()
                self.data.append(temp_model.from_map(k))
        if m.get('statemachine_json') is not None:
            self.statemachine_json = m.get('statemachine_json')
        return self


class UpdateAppsBiztypeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        biz_type: str = None,
        client_version: str = None,
        id: int = None,
        instance_id: str = None,
        is_asyn: bool = None,
        is_load_test: bool = None,
        is_mix: bool = None,
        participators: List[Participator] = None,
        recovery_datasources: List[InitiatorDatasource] = None,
        recovery_limit: int = None,
        recovery_thread_num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # app_name
        self.app_name = app_name
        # biz_type
        self.biz_type = biz_type
        # client_version
        self.client_version = client_version
        # id
        self.id = id
        # instance_id
        self.instance_id = instance_id
        # is_asyn
        self.is_asyn = is_asyn
        # is_load_test
        self.is_load_test = is_load_test
        # is_mix
        self.is_mix = is_mix
        # participators
        self.participators = participators
        # recovery_datasources
        self.recovery_datasources = recovery_datasources
        # recovery_limit
        self.recovery_limit = recovery_limit
        # recovery_thread_num
        self.recovery_thread_num = recovery_thread_num

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.client_version, 'client_version')
        self.validate_required(self.id, 'id')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.is_asyn, 'is_asyn')
        self.validate_required(self.is_load_test, 'is_load_test')
        self.validate_required(self.is_mix, 'is_mix')
        self.validate_required(self.participators, 'participators')
        if self.participators:
            for k in self.participators:
                if k:
                    k.validate()
        self.validate_required(self.recovery_datasources, 'recovery_datasources')
        if self.recovery_datasources:
            for k in self.recovery_datasources:
                if k:
                    k.validate()
        self.validate_required(self.recovery_limit, 'recovery_limit')
        self.validate_required(self.recovery_thread_num, 'recovery_thread_num')

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
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.client_version is not None:
            result['client_version'] = self.client_version
        if self.id is not None:
            result['id'] = self.id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.is_asyn is not None:
            result['is_asyn'] = self.is_asyn
        if self.is_load_test is not None:
            result['is_load_test'] = self.is_load_test
        if self.is_mix is not None:
            result['is_mix'] = self.is_mix
        result['participators'] = []
        if self.participators is not None:
            for k in self.participators:
                result['participators'].append(k.to_map() if k else None)
        result['recovery_datasources'] = []
        if self.recovery_datasources is not None:
            for k in self.recovery_datasources:
                result['recovery_datasources'].append(k.to_map() if k else None)
        if self.recovery_limit is not None:
            result['recovery_limit'] = self.recovery_limit
        if self.recovery_thread_num is not None:
            result['recovery_thread_num'] = self.recovery_thread_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('client_version') is not None:
            self.client_version = m.get('client_version')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('is_asyn') is not None:
            self.is_asyn = m.get('is_asyn')
        if m.get('is_load_test') is not None:
            self.is_load_test = m.get('is_load_test')
        if m.get('is_mix') is not None:
            self.is_mix = m.get('is_mix')
        self.participators = []
        if m.get('participators') is not None:
            for k in m.get('participators'):
                temp_model = Participator()
                self.participators.append(temp_model.from_map(k))
        self.recovery_datasources = []
        if m.get('recovery_datasources') is not None:
            for k in m.get('recovery_datasources'):
                temp_model = InitiatorDatasource()
                self.recovery_datasources.append(temp_model.from_map(k))
        if m.get('recovery_limit') is not None:
            self.recovery_limit = m.get('recovery_limit')
        if m.get('recovery_thread_num') is not None:
            self.recovery_thread_num = m.get('recovery_thread_num')
        return self


class UpdateAppsBiztypeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # success
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


class CreateAppsConfigsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        initiator: Initiator = None,
        participators: List[Participator] = None,
        app_name: str = None,
        desc: str = None,
        instance_id: str = None,
        activity_mode: int = None,
        sharding_rule: SplitRule = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 发起方配置
        self.initiator = initiator
        # 参与者列表
        self.participators = participators
        # 应用名
        self.app_name = app_name
        # 应用的描述
        self.desc = desc
        # 环境唯一标识
        self.instance_id = instance_id
        # 1：同库模式，事务记录表在业务侧； 2：异库模式。
        self.activity_mode = activity_mode
        # 分表分表规则
        self.sharding_rule = sharding_rule

    def validate(self):
        if self.initiator:
            self.initiator.validate()
        if self.participators:
            for k in self.participators:
                if k:
                    k.validate()
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.activity_mode, 'activity_mode')
        if self.sharding_rule:
            self.sharding_rule.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.initiator is not None:
            result['initiator'] = self.initiator.to_map()
        result['participators'] = []
        if self.participators is not None:
            for k in self.participators:
                result['participators'].append(k.to_map() if k else None)
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.desc is not None:
            result['desc'] = self.desc
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.activity_mode is not None:
            result['activity_mode'] = self.activity_mode
        if self.sharding_rule is not None:
            result['sharding_rule'] = self.sharding_rule.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('initiator') is not None:
            temp_model = Initiator()
            self.initiator = temp_model.from_map(m['initiator'])
        self.participators = []
        if m.get('participators') is not None:
            for k in m.get('participators'):
                temp_model = Participator()
                self.participators.append(temp_model.from_map(k))
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('activity_mode') is not None:
            self.activity_mode = m.get('activity_mode')
        if m.get('sharding_rule') is not None:
            temp_model = SplitRule()
            self.sharding_rule = temp_model.from_map(m['sharding_rule'])
        return self


class CreateAppsConfigsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.success = success
        # 返回的结果文本
        self.msg = msg

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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        return self


class ImportAppsNewconfigsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        instance_id: str = None,
        context: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # instance_id
        self.instance_id = instance_id
        # 导入的内容，严格的json
        self.context = context

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.context is not None:
            result['context'] = self.context
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('context') is not None:
            self.context = m.get('context')
        return self


class ImportAppsNewconfigsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # msg
        self.msg = msg
        # 上传成功
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class ExportAppsNewconfigsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用名
        self.app_name = app_name
        # 环境唯一标识
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.instance_id, 'instance_id')

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
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class ExportAppsNewconfigsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        context: str = None,
        success: bool = None,
        url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 导出配置信息，json
        self.context = context
        # 接口返回码
        self.success = success
        # 接口返回文件URL
        self.url = url

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
        if self.context is not None:
            result['context'] = self.context
        if self.success is not None:
            result['success'] = self.success
        if self.url is not None:
            result['url'] = self.url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('context') is not None:
            self.context = m.get('context')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('url') is not None:
            self.url = m.get('url')
        return self


class ImportTxConfigsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        context: str = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 导入的内容，严格的json
        self.context = context
        # instance_id
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.context, 'context')
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.context is not None:
            result['context'] = self.context
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('context') is not None:
            self.context = m.get('context')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class ImportTxConfigsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # msg
        self.msg = msg
        # 上传成功
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class ExportTxConfigsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        instance_id: str = None,
        biz_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用名
        self.app_name = app_name
        # 环境唯一标识
        self.instance_id = instance_id
        # id 列表
        self.biz_type = biz_type

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')

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
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        return self


class ExportTxConfigsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        context: str = None,
        success: bool = None,
        url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 导出配置信息，json
        self.context = context
        # 接口返回码
        self.success = success
        # 接口返回文件URL
        self.url = url

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
        if self.context is not None:
            result['context'] = self.context
        if self.success is not None:
            result['success'] = self.success
        if self.url is not None:
            result['url'] = self.url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('context') is not None:
            self.context = m.get('context')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('url') is not None:
            self.url = m.get('url')
        return self


class ListNewAppsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        current_page: int = None,
        instance_id: str = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 支持模糊查询
        self.app_name = app_name
        # 1
        self.current_page = current_page
        # 000001
        self.instance_id = instance_id
        # 10
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.current_page, 'current_page')
        self.validate_required(self.instance_id, 'instance_id')
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
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListNewAppsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current_page: int = None,
        data: List[AppInfoVO] = None,
        page_size: int = None,
        total: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # .
        self.current_page = current_page
        # app
        self.data = data
        # 10
        self.page_size = page_size
        # 10
        self.total = total

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
        if self.current_page is not None:
            result['current_page'] = self.current_page
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        if self.page_size is not None:
            result['page_size'] = self.page_size
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
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = AppInfoVO()
                self.data.append(temp_model.from_map(k))
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class QueryAppsDetailRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_id: int = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用id
        self.app_id = app_id
        # instance
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class QueryAppsDetailResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AppInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 应用信息
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
            temp_model = AppInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class DeleteAppsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_id: int = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 1
        self.app_id = app_id
        # 000001
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class DeleteAppsResponse(TeaModel):
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


class DeleteAppsRecoveryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        instance_id: str = None,
        recovery_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 000001
        self.instance_id = instance_id
        # 发起方id
        self.recovery_id = recovery_id

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.recovery_id, 'recovery_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.recovery_id is not None:
            result['recovery_id'] = self.recovery_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('recovery_id') is not None:
            self.recovery_id = m.get('recovery_id')
        return self


class DeleteAppsRecoveryResponse(TeaModel):
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


class DeleteAppsActionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        action_id: int = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 参与者id
        self.action_id = action_id
        # 00001
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.action_id, 'action_id')
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.action_id is not None:
            result['action_id'] = self.action_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('action_id') is not None:
            self.action_id = m.get('action_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class DeleteAppsActionResponse(TeaModel):
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


class BatchcreateAppsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        action_array: List[Participator] = None,
        activity_mode: int = None,
        app_name: str = None,
        db_rule_name: str = None,
        db_rule_templete: str = None,
        desc: str = None,
        id: int = None,
        instance_id: str = None,
        recovery_array: List[RecoveryDTO] = None,
        recovery_ds_array: List[RecoveryDsDTO] = None,
        table_rule_name: str = None,
        table_rule_templete: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 参与者数组
        self.action_array = action_array
        # 1 同库； 2 异库
        self.activity_mode = activity_mode
        # app
        self.app_name = app_name
        # Hash
        self.db_rule_name = db_rule_name
        # xxx
        self.db_rule_templete = db_rule_templete
        # 描述
        self.desc = desc
        # 编辑时传
        self.id = id
        # 实例id
        self.instance_id = instance_id
        # 发起方信息
        self.recovery_array = recovery_array
        # 数据源数组
        self.recovery_ds_array = recovery_ds_array
        # hash
        self.table_rule_name = table_rule_name
        # xxx
        self.table_rule_templete = table_rule_templete

    def validate(self):
        if self.action_array:
            for k in self.action_array:
                if k:
                    k.validate()
        self.validate_required(self.instance_id, 'instance_id')
        if self.recovery_array:
            for k in self.recovery_array:
                if k:
                    k.validate()
        if self.recovery_ds_array:
            for k in self.recovery_ds_array:
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
        result['action_array'] = []
        if self.action_array is not None:
            for k in self.action_array:
                result['action_array'].append(k.to_map() if k else None)
        if self.activity_mode is not None:
            result['activity_mode'] = self.activity_mode
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.db_rule_name is not None:
            result['db_rule_name'] = self.db_rule_name
        if self.db_rule_templete is not None:
            result['db_rule_templete'] = self.db_rule_templete
        if self.desc is not None:
            result['desc'] = self.desc
        if self.id is not None:
            result['id'] = self.id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        result['recovery_array'] = []
        if self.recovery_array is not None:
            for k in self.recovery_array:
                result['recovery_array'].append(k.to_map() if k else None)
        result['recovery_ds_array'] = []
        if self.recovery_ds_array is not None:
            for k in self.recovery_ds_array:
                result['recovery_ds_array'].append(k.to_map() if k else None)
        if self.table_rule_name is not None:
            result['table_rule_name'] = self.table_rule_name
        if self.table_rule_templete is not None:
            result['table_rule_templete'] = self.table_rule_templete
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.action_array = []
        if m.get('action_array') is not None:
            for k in m.get('action_array'):
                temp_model = Participator()
                self.action_array.append(temp_model.from_map(k))
        if m.get('activity_mode') is not None:
            self.activity_mode = m.get('activity_mode')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('db_rule_name') is not None:
            self.db_rule_name = m.get('db_rule_name')
        if m.get('db_rule_templete') is not None:
            self.db_rule_templete = m.get('db_rule_templete')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        self.recovery_array = []
        if m.get('recovery_array') is not None:
            for k in m.get('recovery_array'):
                temp_model = RecoveryDTO()
                self.recovery_array.append(temp_model.from_map(k))
        self.recovery_ds_array = []
        if m.get('recovery_ds_array') is not None:
            for k in m.get('recovery_ds_array'):
                temp_model = RecoveryDsDTO()
                self.recovery_ds_array.append(temp_model.from_map(k))
        if m.get('table_rule_name') is not None:
            self.table_rule_name = m.get('table_rule_name')
        if m.get('table_rule_templete') is not None:
            self.table_rule_templete = m.get('table_rule_templete')
        return self


class BatchcreateAppsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AppInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 编辑后的应用信息
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
            temp_model = AppInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateAppsRecoveryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        instance_id: str = None,
        recovery: RecoveryDTO = None,
        recovery_ds_array: List[RecoveryDsDTO] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用名
        self.app_name = app_name
        # 000001
        self.instance_id = instance_id
        # 发起方信息
        self.recovery = recovery
        # 数据源信息
        self.recovery_ds_array = recovery_ds_array

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.recovery, 'recovery')
        if self.recovery:
            self.recovery.validate()
        self.validate_required(self.recovery_ds_array, 'recovery_ds_array')
        if self.recovery_ds_array:
            for k in self.recovery_ds_array:
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
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.recovery is not None:
            result['recovery'] = self.recovery.to_map()
        result['recovery_ds_array'] = []
        if self.recovery_ds_array is not None:
            for k in self.recovery_ds_array:
                result['recovery_ds_array'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('recovery') is not None:
            temp_model = RecoveryDTO()
            self.recovery = temp_model.from_map(m['recovery'])
        self.recovery_ds_array = []
        if m.get('recovery_ds_array') is not None:
            for k in m.get('recovery_ds_array'):
                temp_model = RecoveryDsDTO()
                self.recovery_ds_array.append(temp_model.from_map(k))
        return self


class CreateAppsRecoveryResponse(TeaModel):
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


class CreateAppsActionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        action_name: str = None,
        app_name: str = None,
        class_name: str = None,
        commit_method_name: str = None,
        commit_method_params_type: int = None,
        elastic_key: str = None,
        elastic_route_rule: str = None,
        id: int = None,
        instance_id: str = None,
        is_zone_route: bool = None,
        rollback_method_name: str = None,
        rollback_method_params_type: int = None,
        test_url: str = None,
        unique_id: str = None,
        ws_tr: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 参与者名称
        # 
        self.action_name = action_name
        # app_name
        self.app_name = app_name
        # 类全名，包括完整包名
        # 
        self.class_name = class_name
        # 提交方法名称
        # 
        self.commit_method_name = commit_method_name
        # 提交方法参数
        # 
        self.commit_method_params_type = commit_method_params_type
        # 弹性key
        # 
        self.elastic_key = elastic_key
        # 弹性路由规则（Groovy脚本）
        # 
        self.elastic_route_rule = elastic_route_rule
        # 更新时需要
        self.id = id
        # 00001
        self.instance_id = instance_id
        # rpc是否ldc调用
        # 
        self.is_zone_route = is_zone_route
        # 回滚方法名称
        # 
        self.rollback_method_name = rollback_method_name
        # 回滚方法的参数类型
        # 
        self.rollback_method_params_type = rollback_method_params_type
        # rpc接口测试地址
        # 
        self.test_url = test_url
        # rpc uniqueId
        # 
        self.unique_id = unique_id
        # rpc协议，ws或tr
        # 
        self.ws_tr = ws_tr

    def validate(self):
        self.validate_required(self.action_name, 'action_name')
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.class_name, 'class_name')
        self.validate_required(self.commit_method_name, 'commit_method_name')
        self.validate_required(self.commit_method_params_type, 'commit_method_params_type')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.is_zone_route, 'is_zone_route')
        self.validate_required(self.rollback_method_name, 'rollback_method_name')
        self.validate_required(self.rollback_method_params_type, 'rollback_method_params_type')
        self.validate_required(self.ws_tr, 'ws_tr')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.action_name is not None:
            result['action_name'] = self.action_name
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.class_name is not None:
            result['class_name'] = self.class_name
        if self.commit_method_name is not None:
            result['commit_method_name'] = self.commit_method_name
        if self.commit_method_params_type is not None:
            result['commit_method_params_type'] = self.commit_method_params_type
        if self.elastic_key is not None:
            result['elastic_key'] = self.elastic_key
        if self.elastic_route_rule is not None:
            result['elastic_route_rule'] = self.elastic_route_rule
        if self.id is not None:
            result['id'] = self.id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.is_zone_route is not None:
            result['is_zone_route'] = self.is_zone_route
        if self.rollback_method_name is not None:
            result['rollback_method_name'] = self.rollback_method_name
        if self.rollback_method_params_type is not None:
            result['rollback_method_params_type'] = self.rollback_method_params_type
        if self.test_url is not None:
            result['test_url'] = self.test_url
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        if self.ws_tr is not None:
            result['ws_tr'] = self.ws_tr
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('action_name') is not None:
            self.action_name = m.get('action_name')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('class_name') is not None:
            self.class_name = m.get('class_name')
        if m.get('commit_method_name') is not None:
            self.commit_method_name = m.get('commit_method_name')
        if m.get('commit_method_params_type') is not None:
            self.commit_method_params_type = m.get('commit_method_params_type')
        if m.get('elastic_key') is not None:
            self.elastic_key = m.get('elastic_key')
        if m.get('elastic_route_rule') is not None:
            self.elastic_route_rule = m.get('elastic_route_rule')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('is_zone_route') is not None:
            self.is_zone_route = m.get('is_zone_route')
        if m.get('rollback_method_name') is not None:
            self.rollback_method_name = m.get('rollback_method_name')
        if m.get('rollback_method_params_type') is not None:
            self.rollback_method_params_type = m.get('rollback_method_params_type')
        if m.get('test_url') is not None:
            self.test_url = m.get('test_url')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        if m.get('ws_tr') is not None:
            self.ws_tr = m.get('ws_tr')
        return self


class CreateAppsActionResponse(TeaModel):
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


class CreateBiztypeRelationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        action_array: List[str] = None,
        app_name: str = None,
        biz_type: str = None,
        desc: str = None,
        instance_id: str = None,
        state: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 参与者名称数组
        self.action_array = action_array
        # app
        self.app_name = app_name
        # biztype
        self.biz_type = biz_type
        # 一句话描述
        self.desc = desc
        # 00001
        self.instance_id = instance_id
        # add  /  modify
        self.state = state

    def validate(self):
        self.validate_required(self.action_array, 'action_array')
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.desc, 'desc')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.state, 'state')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.action_array is not None:
            result['action_array'] = self.action_array
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.desc is not None:
            result['desc'] = self.desc
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.state is not None:
            result['state'] = self.state
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('action_array') is not None:
            self.action_array = m.get('action_array')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('state') is not None:
            self.state = m.get('state')
        return self


class CreateBiztypeRelationResponse(TeaModel):
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


class DeleteAppsBiztypeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        instance_id: str = None,
        biz_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # instanceid
        self.instance_id = instance_id
        # biz_type
        self.biz_type = biz_type

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.biz_type, 'biz_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        return self


class DeleteAppsBiztypeResponse(TeaModel):
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


class QueryBiztypeRelationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_type: str = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务类型
        self.biz_type = biz_type
        # 实例id
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class QueryBiztypeRelationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        app_action: List[AppActionVO] = None,
        app_name: str = None,
        biz_type: str = None,
        desc: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 参与者信息
        self.app_action = app_action
        # 应用名
        self.app_name = app_name
        # 业务类型
        self.biz_type = biz_type
        # 描述
        self.desc = desc

    def validate(self):
        if self.app_action:
            for k in self.app_action:
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
        result['app_action'] = []
        if self.app_action is not None:
            for k in self.app_action:
                result['app_action'].append(k.to_map() if k else None)
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.desc is not None:
            result['desc'] = self.desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.app_action = []
        if m.get('app_action') is not None:
            for k in m.get('app_action'):
                temp_model = AppActionVO()
                self.app_action.append(temp_model.from_map(k))
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        return self


class DeleteTransactionsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        instance_id: str = None,
        tx_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 实例id
        self.instance_id = instance_id
        # 事务id
        self.tx_id = tx_id

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.tx_id, 'tx_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.tx_id is not None:
            result['tx_id'] = self.tx_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('tx_id') is not None:
            self.tx_id = m.get('tx_id')
        return self


class DeleteTransactionsResponse(TeaModel):
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


class CreateRecoveryConfigurationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        action_mode: int = None,
        activity_mode: int = None,
        app_name: str = None,
        biz_type: str = None,
        desc: str = None,
        instance_id: str = None,
        old_biztype: str = None,
        role: int = None,
        split_rule: SplitRule = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # actionMode取值：1代表TCC模式，2是FMT模式
        self.action_mode = action_mode
        # activityMode取值：1是同库模式，2是异库模式，3是Saga模式
        self.activity_mode = activity_mode
        # 应用名
        self.app_name = app_name
        # 业务码
        self.biz_type = biz_type
        # 应用描述
        self.desc = desc
        # 环境的唯一标识
        self.instance_id = instance_id
        # 如果修改biztype，要穿老的bizType
        self.old_biztype = old_biztype
        # role取值：1是发起方，2是参与者
        self.role = role
        # split_rule
        self.split_rule = split_rule
        # Saga状态机的json定义
        self.content = content

    def validate(self):
        self.validate_required(self.activity_mode, 'activity_mode')
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.role, 'role')
        if self.split_rule:
            self.split_rule.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.action_mode is not None:
            result['action_mode'] = self.action_mode
        if self.activity_mode is not None:
            result['activity_mode'] = self.activity_mode
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.desc is not None:
            result['desc'] = self.desc
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.old_biztype is not None:
            result['old_biztype'] = self.old_biztype
        if self.role is not None:
            result['role'] = self.role
        if self.split_rule is not None:
            result['split_rule'] = self.split_rule.to_map()
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('action_mode') is not None:
            self.action_mode = m.get('action_mode')
        if m.get('activity_mode') is not None:
            self.activity_mode = m.get('activity_mode')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('old_biztype') is not None:
            self.old_biztype = m.get('old_biztype')
        if m.get('role') is not None:
            self.role = m.get('role')
        if m.get('split_rule') is not None:
            temp_model = SplitRule()
            self.split_rule = temp_model.from_map(m['split_rule'])
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class CreateRecoveryConfigurationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 接口结果信息
        self.msg = msg
        # 接口返回码
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class GetGlobalEnvRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # instance_id
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class GetGlobalEnvResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: EnvInfo = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 环境信息
        self.data = data
        # 接口返回码
        self.success = success

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
            temp_model = EnvInfo()
            self.data = temp_model.from_map(m['data'])
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class GetMiddlewareInstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户
        self.tenant_id = tenant_id
        # 工作空间
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.workspace_id, 'workspace_id')

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
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class GetMiddlewareInstanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # instance id
        self.data = data
        # 接口返回码
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
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class AllZoneRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        instance_id: str = None,
        env: str = None,
        tenant_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # instance_id
        self.instance_id = instance_id
        # env
        self.env = env
        # tenant
        self.tenant_name = tenant_name

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.env, 'env')
        self.validate_required(self.tenant_name, 'tenant_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.env is not None:
            result['env'] = self.env
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('env') is not None:
            self.env = m.get('env')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        return self


class AllZoneResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        zones: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # zones
        self.zones = zones

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
        if self.zones is not None:
            result['zones'] = self.zones
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('zones') is not None:
            self.zones = m.get('zones')
        return self


class UpdateRecoveryInitiatorsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        action_mode: int = None,
        activity_mode: int = None,
        app_name: str = None,
        biz_type: str = None,
        biz_type_id: int = None,
        client_version: str = None,
        id: int = None,
        instance_id: str = None,
        is_asyn: bool = None,
        is_load_test: bool = None,
        is_mix: bool = None,
        recovery_datasources: List[InitiatorDatasource] = None,
        recovery_limit: int = None,
        recovery_thread_num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # action_mode
        self.action_mode = action_mode
        # 1同库，2异库
        self.activity_mode = activity_mode
        # 应用名
        self.app_name = app_name
        # biz_type
        self.biz_type = biz_type
        # 关联关系表的id，用于更新
        self.biz_type_id = biz_type_id
        # Client 版本
        self.client_version = client_version
        # 记录id
        self.id = id
        # 环境唯一标识
        self.instance_id = instance_id
        # 是否异步化
        self.is_asyn = is_asyn
        # 是否压测任务
        self.is_load_test = is_load_test
        # 是否混合模式
        self.is_mix = is_mix
        # 发起方数据源
        self.recovery_datasources = recovery_datasources
        # 恢复条数/分/表
        self.recovery_limit = recovery_limit
        # 恢复线程数
        self.recovery_thread_num = recovery_thread_num

    def validate(self):
        self.validate_required(self.action_mode, 'action_mode')
        self.validate_required(self.activity_mode, 'activity_mode')
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.biz_type_id, 'biz_type_id')
        self.validate_required(self.client_version, 'client_version')
        self.validate_required(self.id, 'id')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.is_asyn, 'is_asyn')
        self.validate_required(self.is_load_test, 'is_load_test')
        self.validate_required(self.is_mix, 'is_mix')
        self.validate_required(self.recovery_datasources, 'recovery_datasources')
        if self.recovery_datasources:
            for k in self.recovery_datasources:
                if k:
                    k.validate()
        self.validate_required(self.recovery_limit, 'recovery_limit')
        self.validate_required(self.recovery_thread_num, 'recovery_thread_num')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.action_mode is not None:
            result['action_mode'] = self.action_mode
        if self.activity_mode is not None:
            result['activity_mode'] = self.activity_mode
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.biz_type_id is not None:
            result['biz_type_id'] = self.biz_type_id
        if self.client_version is not None:
            result['client_version'] = self.client_version
        if self.id is not None:
            result['id'] = self.id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.is_asyn is not None:
            result['is_asyn'] = self.is_asyn
        if self.is_load_test is not None:
            result['is_load_test'] = self.is_load_test
        if self.is_mix is not None:
            result['is_mix'] = self.is_mix
        result['recovery_datasources'] = []
        if self.recovery_datasources is not None:
            for k in self.recovery_datasources:
                result['recovery_datasources'].append(k.to_map() if k else None)
        if self.recovery_limit is not None:
            result['recovery_limit'] = self.recovery_limit
        if self.recovery_thread_num is not None:
            result['recovery_thread_num'] = self.recovery_thread_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('action_mode') is not None:
            self.action_mode = m.get('action_mode')
        if m.get('activity_mode') is not None:
            self.activity_mode = m.get('activity_mode')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('biz_type_id') is not None:
            self.biz_type_id = m.get('biz_type_id')
        if m.get('client_version') is not None:
            self.client_version = m.get('client_version')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('is_asyn') is not None:
            self.is_asyn = m.get('is_asyn')
        if m.get('is_load_test') is not None:
            self.is_load_test = m.get('is_load_test')
        if m.get('is_mix') is not None:
            self.is_mix = m.get('is_mix')
        self.recovery_datasources = []
        if m.get('recovery_datasources') is not None:
            for k in m.get('recovery_datasources'):
                temp_model = InitiatorDatasource()
                self.recovery_datasources.append(temp_model.from_map(k))
        if m.get('recovery_limit') is not None:
            self.recovery_limit = m.get('recovery_limit')
        if m.get('recovery_thread_num') is not None:
            self.recovery_thread_num = m.get('recovery_thread_num')
        return self


class UpdateRecoveryInitiatorsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 接口返回信息
        self.msg = msg
        # 接口返回码
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class ListBiztypesInitiatorsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用名
        self.app_name = app_name
        # 环境唯一标识
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.instance_id, 'instance_id')

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
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class ListBiztypesInitiatorsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[Initiator] = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发起方列表
        self.data = data
        # 接口返回码
        self.success = success

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
                temp_model = Initiator()
                self.data.append(temp_model.from_map(k))
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class AllInitiatorsDatasourcesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用名
        self.app_name = app_name
        # 环境唯一标识
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.instance_id, 'instance_id')

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
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class AllInitiatorsDatasourcesResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[DsNameInfo] = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据源名列表
        self.data = data
        # 接口返回码
        self.success = success

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
                temp_model = DsNameInfo()
                self.data.append(temp_model.from_map(k))
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class AllInitiatorsTablesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        ds_name: str = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用名
        self.app_name = app_name
        # 数据源名
        self.ds_name = ds_name
        # 环境唯一标识
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.ds_name, 'ds_name')
        self.validate_required(self.instance_id, 'instance_id')

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
        if self.ds_name is not None:
            result['ds_name'] = self.ds_name
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('ds_name') is not None:
            self.ds_name = m.get('ds_name')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class AllInitiatorsTablesResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[str] = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 表名列表
        self.data = data
        # 接口返回码
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
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class DebugInitiatorsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        activity_table_name: str = None,
        app_name: str = None,
        ds_name: str = None,
        instance_id: str = None,
        recovery_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 主事务记录表
        self.activity_table_name = activity_table_name
        # 应用名
        self.app_name = app_name
        # 数据源名称
        self.ds_name = ds_name
        # 环境唯一标识
        self.instance_id = instance_id
        # 记录id
        self.recovery_id = recovery_id

    def validate(self):
        self.validate_required(self.activity_table_name, 'activity_table_name')
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.ds_name, 'ds_name')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.recovery_id, 'recovery_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.activity_table_name is not None:
            result['activity_table_name'] = self.activity_table_name
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.ds_name is not None:
            result['ds_name'] = self.ds_name
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.recovery_id is not None:
            result['recovery_id'] = self.recovery_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('activity_table_name') is not None:
            self.activity_table_name = m.get('activity_table_name')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('ds_name') is not None:
            self.ds_name = m.get('ds_name')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('recovery_id') is not None:
            self.recovery_id = m.get('recovery_id')
        return self


class DebugInitiatorsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 接口返回信息
        self.msg = msg
        # 接口返回码
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class GetRecoveryInitiatorsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_type: str = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # biz_type
        self.biz_type = biz_type
        # instance_id
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class GetRecoveryInitiatorsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        app_name: str = None,
        biz_type: str = None,
        biz_type_id: int = None,
        client_version: str = None,
        id: int = None,
        instance_id: str = None,
        is_asyn: bool = None,
        is_load_test: bool = None,
        is_mix: bool = None,
        recovery_datasources: List[InitiatorDatasource] = None,
        recovery_limit: int = None,
        thread_num: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # app_name
        self.app_name = app_name
        # biz_type
        self.biz_type = biz_type
        # 关联关系表的id，用于更新
        self.biz_type_id = biz_type_id
        # client_version
        self.client_version = client_version
        # id
        self.id = id
        # instance_id
        self.instance_id = instance_id
        # is_asyn
        self.is_asyn = is_asyn
        # is_load_test
        self.is_load_test = is_load_test
        # is_mix
        self.is_mix = is_mix
        # recovery_datasources
        self.recovery_datasources = recovery_datasources
        # recovery_limit
        self.recovery_limit = recovery_limit
        # thread_num
        self.thread_num = thread_num

    def validate(self):
        if self.recovery_datasources:
            for k in self.recovery_datasources:
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
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.biz_type_id is not None:
            result['biz_type_id'] = self.biz_type_id
        if self.client_version is not None:
            result['client_version'] = self.client_version
        if self.id is not None:
            result['id'] = self.id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.is_asyn is not None:
            result['is_asyn'] = self.is_asyn
        if self.is_load_test is not None:
            result['is_load_test'] = self.is_load_test
        if self.is_mix is not None:
            result['is_mix'] = self.is_mix
        result['recovery_datasources'] = []
        if self.recovery_datasources is not None:
            for k in self.recovery_datasources:
                result['recovery_datasources'].append(k.to_map() if k else None)
        if self.recovery_limit is not None:
            result['recovery_limit'] = self.recovery_limit
        if self.thread_num is not None:
            result['thread_num'] = self.thread_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('biz_type_id') is not None:
            self.biz_type_id = m.get('biz_type_id')
        if m.get('client_version') is not None:
            self.client_version = m.get('client_version')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('is_asyn') is not None:
            self.is_asyn = m.get('is_asyn')
        if m.get('is_load_test') is not None:
            self.is_load_test = m.get('is_load_test')
        if m.get('is_mix') is not None:
            self.is_mix = m.get('is_mix')
        self.recovery_datasources = []
        if m.get('recovery_datasources') is not None:
            for k in m.get('recovery_datasources'):
                temp_model = InitiatorDatasource()
                self.recovery_datasources.append(temp_model.from_map(k))
        if m.get('recovery_limit') is not None:
            self.recovery_limit = m.get('recovery_limit')
        if m.get('thread_num') is not None:
            self.thread_num = m.get('thread_num')
        return self


class CreateRecoveryParticipatorsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        actions: List[Participator] = None,
        biz_type: str = None,
        action_mode: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 批量新增action
        self.actions = actions
        # biz_type
        self.biz_type = biz_type
        # 默认TCC
        self.action_mode = action_mode

    def validate(self):
        self.validate_required(self.actions, 'actions')
        if self.actions:
            for k in self.actions:
                if k:
                    k.validate()
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.action_mode, 'action_mode')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        result['actions'] = []
        if self.actions is not None:
            for k in self.actions:
                result['actions'].append(k.to_map() if k else None)
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.action_mode is not None:
            result['action_mode'] = self.action_mode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.actions = []
        if m.get('actions') is not None:
            for k in m.get('actions'):
                temp_model = Participator()
                self.actions.append(temp_model.from_map(k))
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('action_mode') is not None:
            self.action_mode = m.get('action_mode')
        return self


class CreateRecoveryParticipatorsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 接口返回消息
        self.msg = msg
        # 接口返回码
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class UpdateRecoveryParticipatorsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        actions: List[Participator] = None,
        biz_type: str = None,
        action_mode: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # actions
        self.actions = actions
        # biz_type
        self.biz_type = biz_type
        # 默认1：TCC
        self.action_mode = action_mode

    def validate(self):
        self.validate_required(self.actions, 'actions')
        if self.actions:
            for k in self.actions:
                if k:
                    k.validate()
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.action_mode, 'action_mode')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        result['actions'] = []
        if self.actions is not None:
            for k in self.actions:
                result['actions'].append(k.to_map() if k else None)
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.action_mode is not None:
            result['action_mode'] = self.action_mode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.actions = []
        if m.get('actions') is not None:
            for k in m.get('actions'):
                temp_model = Participator()
                self.actions.append(temp_model.from_map(k))
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('action_mode') is not None:
            self.action_mode = m.get('action_mode')
        return self


class UpdateRecoveryParticipatorsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 接口返回信息
        self.msg = msg
        # 接口返回码
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class ListBiztypesParticipatorsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用名
        self.app_name = app_name
        # 环境唯一标识
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.instance_id, 'instance_id')

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
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class ListBiztypesParticipatorsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[Participator] = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 参与者列表
        self.data = data
        # 接口返回码
        self.success = success

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
                temp_model = Participator()
                self.data.append(temp_model.from_map(k))
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class AllParticipatorsActionamesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用名
        self.app_name = app_name
        # 环境唯一标识
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.instance_id, 'instance_id')

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
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class AllParticipatorsActionamesResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[str] = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 参与者名称列表
        self.data = data
        # 接口返回码
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
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class DebugParticipatorsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        action_context: str = None,
        action_id: str = None,
        action_name: str = None,
        action_type: int = None,
        activity_context: str = None,
        instance_id: str = None,
        tx_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 分支事务上下文
        self.action_context = action_context
        # 分支事务id
        self.action_id = action_id
        # 参与者名称
        self.action_name = action_name
        # 操作类型，提交或回滚
        self.action_type = action_type
        # 主事务上下文
        self.activity_context = activity_context
        # 环境唯一标识
        self.instance_id = instance_id
        # 主事务id
        self.tx_id = tx_id

    def validate(self):
        self.validate_required(self.action_context, 'action_context')
        self.validate_required(self.action_id, 'action_id')
        self.validate_required(self.action_name, 'action_name')
        self.validate_required(self.action_type, 'action_type')
        self.validate_required(self.activity_context, 'activity_context')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.tx_id, 'tx_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.action_context is not None:
            result['action_context'] = self.action_context
        if self.action_id is not None:
            result['action_id'] = self.action_id
        if self.action_name is not None:
            result['action_name'] = self.action_name
        if self.action_type is not None:
            result['action_type'] = self.action_type
        if self.activity_context is not None:
            result['activity_context'] = self.activity_context
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.tx_id is not None:
            result['tx_id'] = self.tx_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('action_context') is not None:
            self.action_context = m.get('action_context')
        if m.get('action_id') is not None:
            self.action_id = m.get('action_id')
        if m.get('action_name') is not None:
            self.action_name = m.get('action_name')
        if m.get('action_type') is not None:
            self.action_type = m.get('action_type')
        if m.get('activity_context') is not None:
            self.activity_context = m.get('activity_context')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('tx_id') is not None:
            self.tx_id = m.get('tx_id')
        return self


class DebugParticipatorsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 接口返回信息
        self.msg = msg
        # 接口返回码
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryActionParamRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        env: str = None,
        instance_id: str = None,
        tenant_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # env
        self.env = env
        # instance_id
        self.instance_id = instance_id
        # tenant
        self.tenant_name = tenant_name

    def validate(self):
        self.validate_required(self.env, 'env')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.tenant_name, 'tenant_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.env is not None:
            result['env'] = self.env
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('env') is not None:
            self.env = m.get('env')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        return self


class QueryActionParamResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        params: List[Pair] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 参数列表
        self.params = params

    def validate(self):
        if self.params:
            for k in self.params:
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
        result['params'] = []
        if self.params is not None:
            for k in self.params:
                result['params'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.params = []
        if m.get('params') is not None:
            for k in m.get('params'):
                temp_model = Pair()
                self.params.append(temp_model.from_map(k))
        return self


class ExecuteSwitchoverRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dest_cell: str = None,
        instance_id: str = None,
        source_cell: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.dest_cell = dest_cell
        self.instance_id = instance_id
        self.source_cell = source_cell

    def validate(self):
        self.validate_required(self.dest_cell, 'dest_cell')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.source_cell, 'source_cell')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.dest_cell is not None:
            result['dest_cell'] = self.dest_cell
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.source_cell is not None:
            result['source_cell'] = self.source_cell
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dest_cell') is not None:
            self.dest_cell = m.get('dest_cell')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('source_cell') is not None:
            self.source_cell = m.get('source_cell')
        return self


class ExecuteSwitchoverResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否达到预期切换状态
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


class CancelSwitchoverRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dest_cell: str = None,
        instance_id: str = None,
        source_cell: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.dest_cell = dest_cell
        self.instance_id = instance_id
        self.source_cell = source_cell

    def validate(self):
        self.validate_required(self.dest_cell, 'dest_cell')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.source_cell, 'source_cell')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.dest_cell is not None:
            result['dest_cell'] = self.dest_cell
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.source_cell is not None:
            result['source_cell'] = self.source_cell
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dest_cell') is not None:
            self.dest_cell = m.get('dest_cell')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('source_cell') is not None:
            self.source_cell = m.get('source_cell')
        return self


class CancelSwitchoverResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求执行是否成功
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


class QuerySwitchoverRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class QuerySwitchoverResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        actions: List[SwitchoverAction] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 单元切换状态列表
        self.actions = actions

    def validate(self):
        self.validate_required(self.actions, 'actions')
        if self.actions:
            for k in self.actions:
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
        result['actions'] = []
        if self.actions is not None:
            for k in self.actions:
                result['actions'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.actions = []
        if m.get('actions') is not None:
            for k in m.get('actions'):
                temp_model = SwitchoverAction()
                self.actions.append(temp_model.from_map(k))
        return self


class CountBiztypesTrendsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        biz_type: str = None,
        end_time: str = None,
        instance_id: str = None,
        start_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用名
        self.app_name = app_name
        # biz_type
        self.biz_type = biz_type
        # 结束时间
        self.end_time = end_time
        # 环境唯一标识
        self.instance_id = instance_id
        # 开始时间
        self.start_time = start_time

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.end_time, 'end_time')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.instance_id, 'instance_id')
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
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.start_time is not None:
            result['start_time'] = self.start_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        return self


class CountBiztypesTrendsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: Trend = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 趋势图
        self.data = data
        # 接口返回码
        self.success = success

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
            temp_model = Trend()
            self.data = temp_model.from_map(m['data'])
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class GetGlobalStatsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 站内：租户+环境；站外：instanceId
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class GetGlobalStatsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: GlobalStats = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 全局统计数
        self.data = data
        # 接口返回码
        self.success = success

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
            temp_model = GlobalStats()
            self.data = temp_model.from_map(m['data'])
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class ListTransactionDebugsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        current_page: int = None,
        instance_id: str = None,
        order_by: List[OrderByParams] = None,
        page_size: int = None,
        app_name: str = None,
        state: str = None,
        debug_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当前分页
        self.current_page = current_page
        # 环境唯一标识
        self.instance_id = instance_id
        # id  desc
        self.order_by = order_by
        # 分页大小
        self.page_size = page_size
        # appname
        self.app_name = app_name
        # 1.进行中 4.成功
        self.state = state
        # 1.发起方 2.参与者
        self.debug_type = debug_type

    def validate(self):
        self.validate_required(self.current_page, 'current_page')
        self.validate_required(self.instance_id, 'instance_id')
        if self.order_by:
            for k in self.order_by:
                if k:
                    k.validate()
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
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        result['order_by'] = []
        if self.order_by is not None:
            for k in self.order_by:
                result['order_by'].append(k.to_map() if k else None)
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.state is not None:
            result['state'] = self.state
        if self.debug_type is not None:
            result['debug_type'] = self.debug_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        self.order_by = []
        if m.get('order_by') is not None:
            for k in m.get('order_by'):
                temp_model = OrderByParams()
                self.order_by.append(temp_model.from_map(k))
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('debug_type') is not None:
            self.debug_type = m.get('debug_type')
        return self


class ListTransactionDebugsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current_page: int = None,
        data: List[DebugRecord] = None,
        page_size: int = None,
        success: bool = None,
        total: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前页
        self.current_page = current_page
        # 联调记录分页数据
        self.data = data
        # 分页大小
        self.page_size = page_size
        # 接口返回码
        self.success = success
        # 总数
        self.total = total

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
        if self.current_page is not None:
            result['current_page'] = self.current_page
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        if self.page_size is not None:
            result['page_size'] = self.page_size
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
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = DebugRecord()
                self.data.append(temp_model.from_map(k))
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class GetTransactionsDebugsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        debug_id: int = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 记录id
        self.debug_id = debug_id
        # 环境唯一标识
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.debug_id, 'debug_id')
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.debug_id is not None:
            result['debug_id'] = self.debug_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('debug_id') is not None:
            self.debug_id = m.get('debug_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class GetTransactionsDebugsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: DebugRecord = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 单个联调记录详情
        self.data = data
        # 接口返回码
        self.success = success

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
            temp_model = DebugRecord()
            self.data = temp_model.from_map(m['data'])
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryTransactionsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        biz_id: str = None,
        business_type: str = None,
        current_page: int = None,
        end_time: int = None,
        instance_id: str = None,
        page_size: int = None,
        start_time: int = None,
        state: str = None,
        tx_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用名
        self.app_name = app_name
        # 业务id
        self.biz_id = biz_id
        # 业务码
        self.business_type = business_type
        # 当前分页
        self.current_page = current_page
        # 结束时间
        self.end_time = end_time
        # 环境唯一标识
        self.instance_id = instance_id
        # 分页大小
        self.page_size = page_size
        # 开始时间
        self.start_time = start_time
        # 事务状态  默认传 all， 其他可选状态 Activity 、 Exception 、 Finish
        self.state = state
        # 事务id
        self.tx_id = tx_id

    def validate(self):
        self.validate_required(self.current_page, 'current_page')
        self.validate_required(self.end_time, 'end_time')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.state, 'state')

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
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.business_type is not None:
            result['business_type'] = self.business_type
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.state is not None:
            result['state'] = self.state
        if self.tx_id is not None:
            result['tx_id'] = self.tx_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('business_type') is not None:
            self.business_type = m.get('business_type')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('tx_id') is not None:
            self.tx_id = m.get('tx_id')
        return self


class QueryTransactionsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current_page: int = None,
        data: List[TransactionInfo] = None,
        page_size: int = None,
        success: bool = None,
        total: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前页
        self.current_page = current_page
        # 事务列表
        self.data = data
        # 分页大小
        self.page_size = page_size
        # 接口返回码
        self.success = success
        # 总数
        self.total = total

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
        if self.current_page is not None:
            result['current_page'] = self.current_page
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        if self.page_size is not None:
            result['page_size'] = self.page_size
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
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = TransactionInfo()
                self.data.append(temp_model.from_map(k))
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class GetTransactionsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        instance_id: str = None,
        tx_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 环境唯一标识
        self.instance_id = instance_id
        # 事务id
        self.tx_id = tx_id

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.tx_id, 'tx_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.tx_id is not None:
            result['tx_id'] = self.tx_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('tx_id') is not None:
            self.tx_id = m.get('tx_id')
        return self


class GetTransactionsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: TransactionParticipators = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 接口返回对象
        self.data = data
        # 接口返回码
        self.success = success

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
            temp_model = TransactionParticipators()
            self.data = temp_model.from_map(m['data'])
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class CreateTransactionsCorrectionsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        action_context: str = None,
        action_name: str = None,
        action_type: int = None,
        activity_context: str = None,
        instance_id: str = None,
        is_commit: int = None,
        sync_acctrans: int = None,
        sync_paycore: int = None,
        tx_id: str = None,
        tracer_context: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 分支事务上下文
        self.action_context = action_context
        # PCREDITBILL_TRANS_TRANSFER_FOR_TRADE
        self.action_name = action_name
        # 操作类型；1、提交，2、回滚
        self.action_type = action_type
        # 主事务上下文
        self.activity_context = activity_context
        # 环境唯一标识
        self.instance_id = instance_id
        # 1：提交，2：回滚
        self.is_commit = is_commit
        # 是否同步主账务；0、不同步，1、同步
        self.sync_acctrans = sync_acctrans
        # 是否同步统一支付；0、不同步，1同步
        self.sync_paycore = sync_paycore
        # 事务id
        self.tx_id = tx_id
        # tracer上下文
        self.tracer_context = tracer_context

    def validate(self):
        self.validate_required(self.action_context, 'action_context')
        self.validate_required(self.action_name, 'action_name')
        self.validate_required(self.action_type, 'action_type')
        self.validate_required(self.activity_context, 'activity_context')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.is_commit, 'is_commit')
        self.validate_required(self.sync_acctrans, 'sync_acctrans')
        self.validate_required(self.sync_paycore, 'sync_paycore')
        self.validate_required(self.tx_id, 'tx_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.action_context is not None:
            result['action_context'] = self.action_context
        if self.action_name is not None:
            result['action_name'] = self.action_name
        if self.action_type is not None:
            result['action_type'] = self.action_type
        if self.activity_context is not None:
            result['activity_context'] = self.activity_context
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.is_commit is not None:
            result['is_commit'] = self.is_commit
        if self.sync_acctrans is not None:
            result['sync_acctrans'] = self.sync_acctrans
        if self.sync_paycore is not None:
            result['sync_paycore'] = self.sync_paycore
        if self.tx_id is not None:
            result['tx_id'] = self.tx_id
        if self.tracer_context is not None:
            result['tracer_context'] = self.tracer_context
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('action_context') is not None:
            self.action_context = m.get('action_context')
        if m.get('action_name') is not None:
            self.action_name = m.get('action_name')
        if m.get('action_type') is not None:
            self.action_type = m.get('action_type')
        if m.get('activity_context') is not None:
            self.activity_context = m.get('activity_context')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('is_commit') is not None:
            self.is_commit = m.get('is_commit')
        if m.get('sync_acctrans') is not None:
            self.sync_acctrans = m.get('sync_acctrans')
        if m.get('sync_paycore') is not None:
            self.sync_paycore = m.get('sync_paycore')
        if m.get('tx_id') is not None:
            self.tx_id = m.get('tx_id')
        if m.get('tracer_context') is not None:
            self.tracer_context = m.get('tracer_context')
        return self


class CreateTransactionsCorrectionsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 接口结果信息
        self.msg = msg
        # 接口返回码
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class GetTransactionsCorrectionsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        correction_id: int = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 记录id
        self.correction_id = correction_id
        # 环境唯一标识
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.correction_id, 'correction_id')
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.correction_id is not None:
            result['correction_id'] = self.correction_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('correction_id') is not None:
            self.correction_id = m.get('correction_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class GetTransactionsCorrectionsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: Correction = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 事务悬挂恢复详情
        self.data = data
        # 接口返回码
        self.success = success

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
            temp_model = Correction()
            self.data = temp_model.from_map(m['data'])
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class ExecTransactionsCorrectionsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: int = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 执行事务订正 id
        self.id = id
        # instanceId
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class ExecTransactionsCorrectionsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # msg
        self.msg = msg
        # success
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class ListTransactionCorrectionsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        action_type: str = None,
        current_page: int = None,
        instance_id: str = None,
        order_by: List[OrderByParams] = None,
        page_size: int = None,
        state: str = None,
        app_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # aaa
        self.action_type = action_type
        # current_page
        self.current_page = current_page
        # instanceId
        self.instance_id = instance_id
        # id desc
        self.order_by = order_by
        # page_size
        self.page_size = page_size
        # 0 已提交 4 成功
        self.state = state
        # app_name
        self.app_name = app_name

    def validate(self):
        self.validate_required(self.current_page, 'current_page')
        self.validate_required(self.instance_id, 'instance_id')
        if self.order_by:
            for k in self.order_by:
                if k:
                    k.validate()
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
        if self.action_type is not None:
            result['action_type'] = self.action_type
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        result['order_by'] = []
        if self.order_by is not None:
            for k in self.order_by:
                result['order_by'].append(k.to_map() if k else None)
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.state is not None:
            result['state'] = self.state
        if self.app_name is not None:
            result['app_name'] = self.app_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('action_type') is not None:
            self.action_type = m.get('action_type')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        self.order_by = []
        if m.get('order_by') is not None:
            for k in m.get('order_by'):
                temp_model = OrderByParams()
                self.order_by.append(temp_model.from_map(k))
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        return self


class ListTransactionCorrectionsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current_page: int = None,
        data: List[Correction] = None,
        page_size: int = None,
        success: bool = None,
        total: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 1
        self.current_page = current_page
        # a
        self.data = data
        # 1
        self.page_size = page_size
        # true
        self.success = success
        # 总数
        self.total = total

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
        if self.current_page is not None:
            result['current_page'] = self.current_page
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        if self.page_size is not None:
            result['page_size'] = self.page_size
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
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = Correction()
                self.data.append(temp_model.from_map(k))
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class ListTransactionAppsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # instance_id
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class ListTransactionAppsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        apps: List[TrasactionAppInfo] = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # apps
        self.apps = apps
        # true
        self.success = success

    def validate(self):
        if self.apps:
            for k in self.apps:
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
        result['apps'] = []
        if self.apps is not None:
            for k in self.apps:
                result['apps'].append(k.to_map() if k else None)
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
        self.apps = []
        if m.get('apps') is not None:
            for k in m.get('apps'):
                temp_model = TrasactionAppInfo()
                self.apps.append(temp_model.from_map(k))
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class GetTransactionChartRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        instance_id: str = None,
        tx_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # aaaa
        self.instance_id = instance_id
        # aaa
        self.tx_id = tx_id

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.tx_id, 'tx_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.tx_id is not None:
            result['tx_id'] = self.tx_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('tx_id') is not None:
            self.tx_id = m.get('tx_id')
        return self


class GetTransactionChartResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        data: TransactionChartInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # a
        self.success = success
        # a
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
        if m.get('data') is not None:
            temp_model = TransactionChartInfo()
            self.data = temp_model.from_map(m['data'])
        return self


class GetTransactionSagaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        instance_id: str = None,
        tx_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # instance_id
        self.instance_id = instance_id
        # 主事务id
        self.tx_id = tx_id

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.tx_id, 'tx_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.tx_id is not None:
            result['tx_id'] = self.tx_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('tx_id') is not None:
            self.tx_id = m.get('tx_id')
        return self


class GetTransactionSagaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        statemachine_inst_json: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 状态机执行记录json
        self.statemachine_inst_json = statemachine_inst_json

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
        if self.statemachine_inst_json is not None:
            result['statemachine_inst_json'] = self.statemachine_inst_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('statemachine_inst_json') is not None:
            self.statemachine_inst_json = m.get('statemachine_inst_json')
        return self


class ListWhitelistRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        current_page: int = None,
        instance_id: str = None,
        page_size: int = None,
        order_by: List[OrderByParams] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用名筛选
        self.app_name = app_name
        # 当前页
        self.current_page = current_page
        # 环境唯一标识
        self.instance_id = instance_id
        # 每页大小
        self.page_size = page_size
        # 排序数组
        self.order_by = order_by

    def validate(self):
        self.validate_required(self.current_page, 'current_page')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.page_size, 'page_size')
        if self.order_by:
            for k in self.order_by:
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
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.page_size is not None:
            result['page_size'] = self.page_size
        result['order_by'] = []
        if self.order_by is not None:
            for k in self.order_by:
                result['order_by'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.order_by = []
        if m.get('order_by') is not None:
            for k in m.get('order_by'):
                temp_model = OrderByParams()
                self.order_by.append(temp_model.from_map(k))
        return self


class ListWhitelistResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current_page: int = None,
        data: List[WhiteListInfo] = None,
        page_size: int = None,
        success: bool = None,
        total: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前页
        self.current_page = current_page
        # data
        self.data = data
        # 每页大小
        self.page_size = page_size
        # 接口返回码
        self.success = success
        # 总数
        self.total = total

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
        if self.current_page is not None:
            result['current_page'] = self.current_page
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        if self.page_size is not None:
            result['page_size'] = self.page_size
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
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = WhiteListInfo()
                self.data.append(temp_model.from_map(k))
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class UpdateWhitelistRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        id: int = None,
        instance_id: str = None,
        is_elastic: int = None,
        is_load_test: int = None,
        logical_ds_name: str = None,
        business_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用名
        self.app_name = app_name
        # id
        self.id = id
        # instance_id
        self.instance_id = instance_id
        # 0非弹机房，1弹性机房；
        self.is_elastic = is_elastic
        # 0正常流量，1影子流量；
        self.is_load_test = is_load_test
        # 数据源名称
        self.logical_ds_name = logical_ds_name
        # business_type
        self.business_type = business_type

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.id, 'id')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.is_elastic, 'is_elastic')
        self.validate_required(self.is_load_test, 'is_load_test')
        self.validate_required(self.logical_ds_name, 'logical_ds_name')
        self.validate_required(self.business_type, 'business_type')

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
        if self.id is not None:
            result['id'] = self.id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.is_elastic is not None:
            result['is_elastic'] = self.is_elastic
        if self.is_load_test is not None:
            result['is_load_test'] = self.is_load_test
        if self.logical_ds_name is not None:
            result['logical_ds_name'] = self.logical_ds_name
        if self.business_type is not None:
            result['business_type'] = self.business_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('is_elastic') is not None:
            self.is_elastic = m.get('is_elastic')
        if m.get('is_load_test') is not None:
            self.is_load_test = m.get('is_load_test')
        if m.get('logical_ds_name') is not None:
            self.logical_ds_name = m.get('logical_ds_name')
        if m.get('business_type') is not None:
            self.business_type = m.get('business_type')
        return self


class UpdateWhitelistResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回描述
        self.msg = msg
        # 状态
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class AddWhitelistRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        instance_id: str = None,
        is_elastic: int = None,
        logical_ds_name: str = None,
        business_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # app_name
        self.app_name = app_name
        # instance_id
        self.instance_id = instance_id
        # 0非弹机房，1弹性机房；
        self.is_elastic = is_elastic
        # 数据源名称
        self.logical_ds_name = logical_ds_name
        # 业务类型
        self.business_type = business_type

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.is_elastic, 'is_elastic')
        self.validate_required(self.logical_ds_name, 'logical_ds_name')

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
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.is_elastic is not None:
            result['is_elastic'] = self.is_elastic
        if self.logical_ds_name is not None:
            result['logical_ds_name'] = self.logical_ds_name
        if self.business_type is not None:
            result['business_type'] = self.business_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('is_elastic') is not None:
            self.is_elastic = m.get('is_elastic')
        if m.get('logical_ds_name') is not None:
            self.logical_ds_name = m.get('logical_ds_name')
        if m.get('business_type') is not None:
            self.business_type = m.get('business_type')
        return self


class AddWhitelistResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 新增白名单成功
        self.msg = msg
        # success
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class PushWhitelistRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        instance_id: str = None,
        ref_id: int = None,
        type: int = None,
        push_target: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # instance_id
        self.instance_id = instance_id
        # ref _id
        self.ref_id = ref_id
        # 1按照服务器推送 2按照集群推送
        self.type = type
        # 如果按照服务器推送 传多个ip的数组，逗号分割。如果是按照集群推送，传zone数组，一个不传就默认全部
        self.push_target = push_target

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.ref_id, 'ref_id')
        self.validate_required(self.type, 'type')
        self.validate_required(self.push_target, 'push_target')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.ref_id is not None:
            result['ref_id'] = self.ref_id
        if self.type is not None:
            result['type'] = self.type
        if self.push_target is not None:
            result['push_target'] = self.push_target
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('ref_id') is not None:
            self.ref_id = m.get('ref_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('push_target') is not None:
            self.push_target = m.get('push_target')
        return self


class PushWhitelistResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 容灾推送到{Master|Failover}成功
        self.msg = msg
        # success
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class DeleteWhitelistRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: int = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # id
        self.id = id
        # instance_id
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class DeleteWhitelistResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 删除成功
        self.msg = msg
        # true
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class ListWhitelistZonesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        instance_id: str = None,
        app_name: str = None,
        ds_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # aaaaa
        self.instance_id = instance_id
        # app
        self.app_name = app_name
        # ds
        self.ds_name = ds_name

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.ds_name, 'ds_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.ds_name is not None:
            result['ds_name'] = self.ds_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('ds_name') is not None:
            self.ds_name = m.get('ds_name')
        return self


class ListWhitelistZonesResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[str] = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
        self.data = data
        # success
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
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


