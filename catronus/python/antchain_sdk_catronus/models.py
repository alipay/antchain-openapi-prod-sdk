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


class FixPath(TeaModel):
    def __init__(
        self,
        path: str = None,
        value: str = None,
    ):
        # 路径
        self.path = path
        # 值
        self.value = value

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.path is not None:
            result['path'] = self.path
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('path') is not None:
            self.path = m.get('path')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class Path(TeaModel):
    def __init__(
        self,
        fix_path: FixPath = None,
        failed_path: str = None,
    ):
        # fixpath
        self.fix_path = fix_path
        # shibai lujing
        self.failed_path = failed_path

    def validate(self):
        if self.fix_path:
            self.fix_path.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.fix_path is not None:
            result['fix_path'] = self.fix_path.to_map()
        if self.failed_path is not None:
            result['failed_path'] = self.failed_path
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('fix_path') is not None:
            temp_model = FixPath()
            self.fix_path = temp_model.from_map(m['fix_path'])
        if m.get('failed_path') is not None:
            self.failed_path = m.get('failed_path')
        return self


class Rule(TeaModel):
    def __init__(
        self,
        name: str = None,
        status: str = None,
        paths: List[Path] = None,
    ):
        # 名称
        self.name = name
        # 状态
        self.status = status
        # path
        self.paths = paths

    def validate(self):
        self.validate_required(self.name, 'name')
        if self.paths:
            for k in self.paths:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.status is not None:
            result['status'] = self.status
        result['paths'] = []
        if self.paths is not None:
            for k in self.paths:
                result['paths'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('status') is not None:
            self.status = m.get('status')
        self.paths = []
        if m.get('paths') is not None:
            for k in m.get('paths'):
                temp_model = Path()
                self.paths.append(temp_model.from_map(k))
        return self


class Framework(TeaModel):
    def __init__(
        self,
        id: str = None,
        name: str = None,
        enable: bool = None,
        describe: str = None,
    ):
        # 策略id
        self.id = id
        # 框架名称
        self.name = name
        # 是否启用
        self.enable = enable
        # 描述
        self.describe = describe

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.enable is not None:
            result['enable'] = self.enable
        if self.describe is not None:
            result['describe'] = self.describe
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('enable') is not None:
            self.enable = m.get('enable')
        if m.get('describe') is not None:
            self.describe = m.get('describe')
        return self


class Cronjob(TeaModel):
    def __init__(
        self,
        crontab: str = None,
    ):
        # crontab格式表述的cronjob
        self.crontab = crontab

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.crontab is not None:
            result['crontab'] = self.crontab
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('crontab') is not None:
            self.crontab = m.get('crontab')
        return self


class BaselineStrategy(TeaModel):
    def __init__(
        self,
        frameworks: List[Framework] = None,
        cronjob: Cronjob = None,
        extended: str = None,
    ):
        # 框架列表
        self.frameworks = frameworks
        # cronjob
        self.cronjob = cronjob
        # 额外配置
        self.extended = extended

    def validate(self):
        if self.frameworks:
            for k in self.frameworks:
                if k:
                    k.validate()
        if self.cronjob:
            self.cronjob.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['frameworks'] = []
        if self.frameworks is not None:
            for k in self.frameworks:
                result['frameworks'].append(k.to_map() if k else None)
        if self.cronjob is not None:
            result['cronjob'] = self.cronjob.to_map()
        if self.extended is not None:
            result['extended'] = self.extended
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.frameworks = []
        if m.get('frameworks') is not None:
            for k in m.get('frameworks'):
                temp_model = Framework()
                self.frameworks.append(temp_model.from_map(k))
        if m.get('cronjob') is not None:
            temp_model = Cronjob()
            self.cronjob = temp_model.from_map(m['cronjob'])
        if m.get('extended') is not None:
            self.extended = m.get('extended')
        return self


class RuntimeStrategy(TeaModel):
    def __init__(
        self,
        webshell: bool = None,
        privilege: bool = None,
        enable: bool = None,
    ):
        # 安全webshell配置
        self.webshell = webshell
        # 提权保护配置
        self.privilege = privilege
        # 是否打开
        self.enable = enable

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.webshell is not None:
            result['webshell'] = self.webshell
        if self.privilege is not None:
            result['privilege'] = self.privilege
        if self.enable is not None:
            result['enable'] = self.enable
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('webshell') is not None:
            self.webshell = m.get('webshell')
        if m.get('privilege') is not None:
            self.privilege = m.get('privilege')
        if m.get('enable') is not None:
            self.enable = m.get('enable')
        return self


class ClusterSecurityComponentBrief(TeaModel):
    def __init__(
        self,
        cnt: int = None,
        component: str = None,
        content: str = None,
        date: str = None,
    ):
        # 风险项数量
        self.cnt = cnt
        # 组件名称
        self.component = component
        # 描述
        self.content = content
        # 日期
        self.date = date

    def validate(self):
        if self.date is not None:
            self.validate_pattern(self.date, 'date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cnt is not None:
            result['cnt'] = self.cnt
        if self.component is not None:
            result['component'] = self.component
        if self.content is not None:
            result['content'] = self.content
        if self.date is not None:
            result['date'] = self.date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cnt') is not None:
            self.cnt = m.get('cnt')
        if m.get('component') is not None:
            self.component = m.get('component')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('date') is not None:
            self.date = m.get('date')
        return self


class Control(TeaModel):
    def __init__(
        self,
        id: str = None,
        rules: List[Rule] = None,
        name: str = None,
    ):
        # id
        self.id = id
        # rule
        self.rules = rules
        # 名称
        self.name = name

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.rules:
            for k in self.rules:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        result['rules'] = []
        if self.rules is not None:
            for k in self.rules:
                result['rules'].append(k.to_map() if k else None)
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        self.rules = []
        if m.get('rules') is not None:
            for k in m.get('rules'):
                temp_model = Rule()
                self.rules.append(temp_model.from_map(k))
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class ImageStrategy(TeaModel):
    def __init__(
        self,
        access: bool = None,
        cronjob: Cronjob = None,
    ):
        # 准入
        self.access = access
        # 巡检
        self.cronjob = cronjob

    def validate(self):
        if self.cronjob:
            self.cronjob.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.access is not None:
            result['access'] = self.access
        if self.cronjob is not None:
            result['cronjob'] = self.cronjob.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('access') is not None:
            self.access = m.get('access')
        if m.get('cronjob') is not None:
            temp_model = Cronjob()
            self.cronjob = temp_model.from_map(m['cronjob'])
        return self


class AntScanImage(TeaModel):
    def __init__(
        self,
        image: str = None,
        app_name: str = None,
    ):
        # 镜像名称
        self.image = image
        # app名称
        self.app_name = app_name

    def validate(self):
        self.validate_required(self.image, 'image')
        self.validate_required(self.app_name, 'app_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.image is not None:
            result['image'] = self.image
        if self.app_name is not None:
            result['app_name'] = self.app_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('image') is not None:
            self.image = m.get('image')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        return self


class Strategy(TeaModel):
    def __init__(
        self,
        strategy_id: str = None,
        strategy_name: str = None,
        image: ImageStrategy = None,
        baseline: BaselineStrategy = None,
        runtime: RuntimeStrategy = None,
    ):
        # 策略id
        self.strategy_id = strategy_id
        # 策略名
        self.strategy_name = strategy_name
        # 镜像相关策略内容
        self.image = image
        # 基线相关策略
        self.baseline = baseline
        # 运行时策略
        self.runtime = runtime

    def validate(self):
        self.validate_required(self.strategy_id, 'strategy_id')
        if self.image:
            self.image.validate()
        if self.baseline:
            self.baseline.validate()
        if self.runtime:
            self.runtime.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.strategy_id is not None:
            result['strategy_id'] = self.strategy_id
        if self.strategy_name is not None:
            result['strategy_name'] = self.strategy_name
        if self.image is not None:
            result['image'] = self.image.to_map()
        if self.baseline is not None:
            result['baseline'] = self.baseline.to_map()
        if self.runtime is not None:
            result['runtime'] = self.runtime.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('strategy_id') is not None:
            self.strategy_id = m.get('strategy_id')
        if m.get('strategy_name') is not None:
            self.strategy_name = m.get('strategy_name')
        if m.get('image') is not None:
            temp_model = ImageStrategy()
            self.image = temp_model.from_map(m['image'])
        if m.get('baseline') is not None:
            temp_model = BaselineStrategy()
            self.baseline = temp_model.from_map(m['baseline'])
        if m.get('runtime') is not None:
            temp_model = RuntimeStrategy()
            self.runtime = temp_model.from_map(m['runtime'])
        return self


class Repository(TeaModel):
    def __init__(
        self,
        id: str = None,
        name: str = None,
        project_id: str = None,
        tags_count: str = None,
    ):
        # 仓库ID
        self.id = id
        # 仓库名称
        self.name = name
        # 项目ID
        self.project_id = project_id
        # 仓库Tag数
        self.tags_count = tags_count

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.tags_count, 'tags_count')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.tags_count is not None:
            result['tags_count'] = self.tags_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('tags_count') is not None:
            self.tags_count = m.get('tags_count')
        return self


class RepoProject(TeaModel):
    def __init__(
        self,
        id: str = None,
        name: str = None,
    ):
        # project id
        self.id = id
        # 项目名称
        self.name = name

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class RiskTaskAudit(TeaModel):
    def __init__(
        self,
        operator: str = None,
        operation_type: str = None,
        risk_task_id: str = None,
        comment: str = None,
    ):
        # 操作人
        self.operator = operator
        # 操作类型
        self.operation_type = operation_type
        # 风险工单ID
        self.risk_task_id = risk_task_id
        # 评论
        self.comment = comment

    def validate(self):
        self.validate_required(self.operator, 'operator')
        self.validate_required(self.operation_type, 'operation_type')
        self.validate_required(self.risk_task_id, 'risk_task_id')
        self.validate_required(self.comment, 'comment')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.operator is not None:
            result['operator'] = self.operator
        if self.operation_type is not None:
            result['operation_type'] = self.operation_type
        if self.risk_task_id is not None:
            result['risk_task_id'] = self.risk_task_id
        if self.comment is not None:
            result['comment'] = self.comment
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('operation_type') is not None:
            self.operation_type = m.get('operation_type')
        if m.get('risk_task_id') is not None:
            self.risk_task_id = m.get('risk_task_id')
        if m.get('comment') is not None:
            self.comment = m.get('comment')
        return self


class Cluster(TeaModel):
    def __init__(
        self,
        id: str = None,
        cluster_name: str = None,
        env: str = None,
        status: str = None,
        source: str = None,
        namespace_whitelist: List[str] = None,
    ):
        # id
        self.id = id
        # 集群名称
        self.cluster_name = cluster_name
        # 环境
        self.env = env
        # 纳管状态（imported已纳管/unimported未纳管）
        self.status = status
        # 导入方式
        self.source = source
        # 白名单
        self.namespace_whitelist = namespace_whitelist

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.cluster_name, 'cluster_name')
        self.validate_required(self.env, 'env')
        self.validate_required(self.status, 'status')
        self.validate_required(self.source, 'source')
        self.validate_required(self.namespace_whitelist, 'namespace_whitelist')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.cluster_name is not None:
            result['cluster_name'] = self.cluster_name
        if self.env is not None:
            result['env'] = self.env
        if self.status is not None:
            result['status'] = self.status
        if self.source is not None:
            result['source'] = self.source
        if self.namespace_whitelist is not None:
            result['namespace_whitelist'] = self.namespace_whitelist
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('cluster_name') is not None:
            self.cluster_name = m.get('cluster_name')
        if m.get('env') is not None:
            self.env = m.get('env')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('namespace_whitelist') is not None:
            self.namespace_whitelist = m.get('namespace_whitelist')
        return self


class ScanResult(TeaModel):
    def __init__(
        self,
        component: str = None,
        result: str = None,
    ):
        # 安全组件名
        self.component = component
        # 结果
        self.result = result

    def validate(self):
        self.validate_required(self.component, 'component')
        self.validate_required(self.result, 'result')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.component is not None:
            result['component'] = self.component
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('component') is not None:
            self.component = m.get('component')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class AntScanImageList(TeaModel):
    def __init__(
        self,
        list: List[AntScanImage] = None,
    ):
        # 镜像镜像扫描
        self.list = list

    def validate(self):
        self.validate_required(self.list, 'list')
        if self.list:
            for k in self.list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = AntScanImage()
                self.list.append(temp_model.from_map(k))
        return self


class RiskSolution(TeaModel):
    def __init__(
        self,
        id: str = None,
        name: str = None,
        risk_name: str = None,
        source: str = None,
        fix_type: str = None,
        risk_description: str = None,
        solution_plan: str = None,
        emergency_plan: str = None,
        owner: str = None,
    ):
        # 风险解决方案ID
        self.id = id
        # 名称
        self.name = name
        # 风险名称
        self.risk_name = risk_name
        # 来源
        self.source = source
        # 修复类型
        self.fix_type = fix_type
        # 风险描述
        self.risk_description = risk_description
        # 风险解决方案
        self.solution_plan = solution_plan
        # 应急解决方案
        self.emergency_plan = emergency_plan
        # 负责人
        self.owner = owner

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.risk_name, 'risk_name')
        self.validate_required(self.source, 'source')
        self.validate_required(self.fix_type, 'fix_type')
        self.validate_required(self.risk_description, 'risk_description')
        self.validate_required(self.solution_plan, 'solution_plan')
        self.validate_required(self.emergency_plan, 'emergency_plan')
        self.validate_required(self.owner, 'owner')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.risk_name is not None:
            result['risk_name'] = self.risk_name
        if self.source is not None:
            result['source'] = self.source
        if self.fix_type is not None:
            result['fix_type'] = self.fix_type
        if self.risk_description is not None:
            result['risk_description'] = self.risk_description
        if self.solution_plan is not None:
            result['solution_plan'] = self.solution_plan
        if self.emergency_plan is not None:
            result['emergency_plan'] = self.emergency_plan
        if self.owner is not None:
            result['owner'] = self.owner
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('risk_name') is not None:
            self.risk_name = m.get('risk_name')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('fix_type') is not None:
            self.fix_type = m.get('fix_type')
        if m.get('risk_description') is not None:
            self.risk_description = m.get('risk_description')
        if m.get('solution_plan') is not None:
            self.solution_plan = m.get('solution_plan')
        if m.get('emergency_plan') is not None:
            self.emergency_plan = m.get('emergency_plan')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        return self


class BaselineScanResult(TeaModel):
    def __init__(
        self,
        kind: str = None,
        name: str = None,
        namespace: str = None,
        resource_id: str = None,
        criticals: List[Control] = None,
        highs: List[Control] = None,
        mids: List[Control] = None,
        lows: List[Control] = None,
        object: str = None,
    ):
        # 类型
        self.kind = kind
        # 资源名称
        self.name = name
        # 命名空间
        self.namespace = namespace
        # 资源id
        self.resource_id = resource_id
        # 紧急control
        self.criticals = criticals
        # 高危control
        self.highs = highs
        # 中危controls
        self.mids = mids
        # 低危controls
        self.lows = lows
        # 资源内容
        self.object = object

    def validate(self):
        self.validate_required(self.kind, 'kind')
        self.validate_required(self.name, 'name')
        self.validate_required(self.resource_id, 'resource_id')
        if self.criticals:
            for k in self.criticals:
                if k:
                    k.validate()
        if self.highs:
            for k in self.highs:
                if k:
                    k.validate()
        if self.mids:
            for k in self.mids:
                if k:
                    k.validate()
        if self.lows:
            for k in self.lows:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.kind is not None:
            result['kind'] = self.kind
        if self.name is not None:
            result['name'] = self.name
        if self.namespace is not None:
            result['namespace'] = self.namespace
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        result['criticals'] = []
        if self.criticals is not None:
            for k in self.criticals:
                result['criticals'].append(k.to_map() if k else None)
        result['highs'] = []
        if self.highs is not None:
            for k in self.highs:
                result['highs'].append(k.to_map() if k else None)
        result['mids'] = []
        if self.mids is not None:
            for k in self.mids:
                result['mids'].append(k.to_map() if k else None)
        result['lows'] = []
        if self.lows is not None:
            for k in self.lows:
                result['lows'].append(k.to_map() if k else None)
        if self.object is not None:
            result['object'] = self.object
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('kind') is not None:
            self.kind = m.get('kind')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('namespace') is not None:
            self.namespace = m.get('namespace')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        self.criticals = []
        if m.get('criticals') is not None:
            for k in m.get('criticals'):
                temp_model = Control()
                self.criticals.append(temp_model.from_map(k))
        self.highs = []
        if m.get('highs') is not None:
            for k in m.get('highs'):
                temp_model = Control()
                self.highs.append(temp_model.from_map(k))
        self.mids = []
        if m.get('mids') is not None:
            for k in m.get('mids'):
                temp_model = Control()
                self.mids.append(temp_model.from_map(k))
        self.lows = []
        if m.get('lows') is not None:
            for k in m.get('lows'):
                temp_model = Control()
                self.lows.append(temp_model.from_map(k))
        if m.get('object') is not None:
            self.object = m.get('object')
        return self


class ImageRepo(TeaModel):
    def __init__(
        self,
        id: str = None,
        name: str = None,
        domain: str = None,
        user_name: str = None,
        password: str = None,
        status: bool = None,
        create_time: str = None,
        last_connect_time: str = None,
    ):
        # repo ID
        self.id = id
        # 镜像仓库名称
        self.name = name
        # 镜像仓库域名
        self.domain = domain
        # 用户名
        self.user_name = user_name
        # 密码
        self.password = password
        # 状态
        self.status = status
        # 创建时间
        self.create_time = create_time
        # 上次连接时间
        self.last_connect_time = last_connect_time

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.domain, 'domain')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.password, 'password')
        self.validate_required(self.status, 'status')
        self.validate_required(self.create_time, 'create_time')
        if self.create_time is not None:
            self.validate_pattern(self.create_time, 'create_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.last_connect_time, 'last_connect_time')
        if self.last_connect_time is not None:
            self.validate_pattern(self.last_connect_time, 'last_connect_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.domain is not None:
            result['domain'] = self.domain
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.password is not None:
            result['password'] = self.password
        if self.status is not None:
            result['status'] = self.status
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.last_connect_time is not None:
            result['last_connect_time'] = self.last_connect_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('domain') is not None:
            self.domain = m.get('domain')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('password') is not None:
            self.password = m.get('password')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('last_connect_time') is not None:
            self.last_connect_time = m.get('last_connect_time')
        return self


class RepoScanStrategy(TeaModel):
    def __init__(
        self,
        id: str = None,
        repo_id: str = None,
        projects: List[str] = None,
        repositories: List[str] = None,
        image_begin_time: str = None,
        crontab: str = None,
        next_date: str = None,
        state: str = None,
    ):
        # 策略ID
        self.id = id
        # 仓库ID
        self.repo_id = repo_id
        # 仓库列表
        self.projects = projects
        # 仓库列表
        self.repositories = repositories
        # 扫描开始时间
        self.image_begin_time = image_begin_time
        # 定时扫描任务
        self.crontab = crontab
        # 下个日期
        self.next_date = next_date
        # 策略状态
        self.state = state

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.repo_id, 'repo_id')
        self.validate_required(self.projects, 'projects')
        self.validate_required(self.repositories, 'repositories')
        self.validate_required(self.image_begin_time, 'image_begin_time')
        if self.image_begin_time is not None:
            self.validate_pattern(self.image_begin_time, 'image_begin_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.crontab, 'crontab')
        self.validate_required(self.next_date, 'next_date')
        if self.next_date is not None:
            self.validate_pattern(self.next_date, 'next_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.state, 'state')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.repo_id is not None:
            result['repo_id'] = self.repo_id
        if self.projects is not None:
            result['projects'] = self.projects
        if self.repositories is not None:
            result['repositories'] = self.repositories
        if self.image_begin_time is not None:
            result['image_begin_time'] = self.image_begin_time
        if self.crontab is not None:
            result['crontab'] = self.crontab
        if self.next_date is not None:
            result['next_date'] = self.next_date
        if self.state is not None:
            result['state'] = self.state
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('repo_id') is not None:
            self.repo_id = m.get('repo_id')
        if m.get('projects') is not None:
            self.projects = m.get('projects')
        if m.get('repositories') is not None:
            self.repositories = m.get('repositories')
        if m.get('image_begin_time') is not None:
            self.image_begin_time = m.get('image_begin_time')
        if m.get('crontab') is not None:
            self.crontab = m.get('crontab')
        if m.get('next_date') is not None:
            self.next_date = m.get('next_date')
        if m.get('state') is not None:
            self.state = m.get('state')
        return self


class ClusterSecurityBrief(TeaModel):
    def __init__(
        self,
        cluster_id: str = None,
        cluster_name: str = None,
        status: str = None,
        last_scan: str = None,
        risk_cnt: int = None,
        brief: List[ClusterSecurityComponentBrief] = None,
        scan_id: str = None,
    ):
        # 集群id
        self.cluster_id = cluster_id
        # 集群名
        self.cluster_name = cluster_name
        # 防护状态
        self.status = status
        # 最后一次安全扫描时间
        self.last_scan = last_scan
        # 风险数量
        self.risk_cnt = risk_cnt
        # 风险简报
        self.brief = brief
        # 扫描id
        self.scan_id = scan_id

    def validate(self):
        self.validate_required(self.cluster_id, 'cluster_id')
        self.validate_required(self.cluster_name, 'cluster_name')
        self.validate_required(self.status, 'status')
        self.validate_required(self.last_scan, 'last_scan')
        if self.last_scan is not None:
            self.validate_pattern(self.last_scan, 'last_scan', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.risk_cnt, 'risk_cnt')
        self.validate_required(self.brief, 'brief')
        if self.brief:
            for k in self.brief:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.cluster_name is not None:
            result['cluster_name'] = self.cluster_name
        if self.status is not None:
            result['status'] = self.status
        if self.last_scan is not None:
            result['last_scan'] = self.last_scan
        if self.risk_cnt is not None:
            result['risk_cnt'] = self.risk_cnt
        result['brief'] = []
        if self.brief is not None:
            for k in self.brief:
                result['brief'].append(k.to_map() if k else None)
        if self.scan_id is not None:
            result['scan_id'] = self.scan_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('cluster_name') is not None:
            self.cluster_name = m.get('cluster_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('last_scan') is not None:
            self.last_scan = m.get('last_scan')
        if m.get('risk_cnt') is not None:
            self.risk_cnt = m.get('risk_cnt')
        self.brief = []
        if m.get('brief') is not None:
            for k in m.get('brief'):
                temp_model = ClusterSecurityComponentBrief()
                self.brief.append(temp_model.from_map(k))
        if m.get('scan_id') is not None:
            self.scan_id = m.get('scan_id')
        return self


class Image(TeaModel):
    def __init__(
        self,
        image_ref: str = None,
        image_tag: str = None,
        app_name: str = None,
        scan_status: str = None,
        image_vul: int = None,
        image_risk_vul: int = None,
        start_time: str = None,
        end_time: str = None,
    ):
        # 镜像Ref
        self.image_ref = image_ref
        # 镜像标签
        self.image_tag = image_tag
        # 应用名称
        self.app_name = app_name
        # 扫描状态
        self.scan_status = scan_status
        # 镜像漏洞
        self.image_vul = image_vul
        # 镜像风险漏洞
        self.image_risk_vul = image_risk_vul
        # 开始时间
        self.start_time = start_time
        # 结束时间
        self.end_time = end_time

    def validate(self):
        self.validate_required(self.image_ref, 'image_ref')
        self.validate_required(self.image_tag, 'image_tag')
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.scan_status, 'scan_status')
        self.validate_required(self.image_vul, 'image_vul')
        self.validate_required(self.image_risk_vul, 'image_risk_vul')
        self.validate_required(self.start_time, 'start_time')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.end_time, 'end_time')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.image_ref is not None:
            result['image_ref'] = self.image_ref
        if self.image_tag is not None:
            result['image_tag'] = self.image_tag
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.scan_status is not None:
            result['scan_status'] = self.scan_status
        if self.image_vul is not None:
            result['image_vul'] = self.image_vul
        if self.image_risk_vul is not None:
            result['image_risk_vul'] = self.image_risk_vul
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('image_ref') is not None:
            self.image_ref = m.get('image_ref')
        if m.get('image_tag') is not None:
            self.image_tag = m.get('image_tag')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('scan_status') is not None:
            self.scan_status = m.get('scan_status')
        if m.get('image_vul') is not None:
            self.image_vul = m.get('image_vul')
        if m.get('image_risk_vul') is not None:
            self.image_risk_vul = m.get('image_risk_vul')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        return self


class Risk(TeaModel):
    def __init__(
        self,
        id: str = None,
        name: str = None,
        source: str = None,
        priority: str = None,
        identity: str = None,
    ):
        # 风险ID
        self.id = id
        # 风险名称
        self.name = name
        # 类型
        self.source = source
        # 等级
        self.priority = priority
        # 风险唯一标识
        self.identity = identity

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.source, 'source')
        self.validate_required(self.priority, 'priority')
        self.validate_required(self.identity, 'identity')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.source is not None:
            result['source'] = self.source
        if self.priority is not None:
            result['priority'] = self.priority
        if self.identity is not None:
            result['identity'] = self.identity
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('priority') is not None:
            self.priority = m.get('priority')
        if m.get('identity') is not None:
            self.identity = m.get('identity')
        return self


class Label(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: str = None,
    ):
        # 标签key
        self.key = key
        # 标签value
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


class RiskTask(TeaModel):
    def __init__(
        self,
        id: str = None,
        display_name: str = None,
        priority: str = None,
        state: str = None,
        risk_type: str = None,
        owner: str = None,
        deadline_time: str = None,
        created_time: str = None,
        respond_phase: str = None,
        followers: List[str] = None,
        sec_owner: str = None,
        days_left: int = None,
        risk_id: str = None,
    ):
        # ID
        self.id = id
        # 风险名称
        self.display_name = display_name
        # 优先级
        self.priority = priority
        # 当前状态
        self.state = state
        # 风险类型
        self.risk_type = risk_type
        # 负责人
        self.owner = owner
        # 到期时间
        self.deadline_time = deadline_time
        # 创建时间
        self.created_time = created_time
        # 响应阶段
        self.respond_phase = respond_phase
        # 风险关注者
        self.followers = followers
        # 安全工程师
        self.sec_owner = sec_owner
        # 到期天数
        self.days_left = days_left
        # 风险ID
        self.risk_id = risk_id

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.display_name, 'display_name')
        self.validate_required(self.priority, 'priority')
        self.validate_required(self.state, 'state')
        self.validate_required(self.risk_type, 'risk_type')
        self.validate_required(self.owner, 'owner')
        self.validate_required(self.deadline_time, 'deadline_time')
        if self.deadline_time is not None:
            self.validate_pattern(self.deadline_time, 'deadline_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.created_time, 'created_time')
        if self.created_time is not None:
            self.validate_pattern(self.created_time, 'created_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.respond_phase, 'respond_phase')
        self.validate_required(self.followers, 'followers')
        self.validate_required(self.sec_owner, 'sec_owner')
        self.validate_required(self.days_left, 'days_left')
        self.validate_required(self.risk_id, 'risk_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.display_name is not None:
            result['display_name'] = self.display_name
        if self.priority is not None:
            result['priority'] = self.priority
        if self.state is not None:
            result['state'] = self.state
        if self.risk_type is not None:
            result['risk_type'] = self.risk_type
        if self.owner is not None:
            result['owner'] = self.owner
        if self.deadline_time is not None:
            result['deadline_time'] = self.deadline_time
        if self.created_time is not None:
            result['created_time'] = self.created_time
        if self.respond_phase is not None:
            result['respond_phase'] = self.respond_phase
        if self.followers is not None:
            result['followers'] = self.followers
        if self.sec_owner is not None:
            result['sec_owner'] = self.sec_owner
        if self.days_left is not None:
            result['days_left'] = self.days_left
        if self.risk_id is not None:
            result['risk_id'] = self.risk_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        if m.get('priority') is not None:
            self.priority = m.get('priority')
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('risk_type') is not None:
            self.risk_type = m.get('risk_type')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        if m.get('deadline_time') is not None:
            self.deadline_time = m.get('deadline_time')
        if m.get('created_time') is not None:
            self.created_time = m.get('created_time')
        if m.get('respond_phase') is not None:
            self.respond_phase = m.get('respond_phase')
        if m.get('followers') is not None:
            self.followers = m.get('followers')
        if m.get('sec_owner') is not None:
            self.sec_owner = m.get('sec_owner')
        if m.get('days_left') is not None:
            self.days_left = m.get('days_left')
        if m.get('risk_id') is not None:
            self.risk_id = m.get('risk_id')
        return self


class CreateRiskTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        name: str = None,
        source: str = None,
        identity: str = None,
        priority: str = None,
        display_name: str = None,
        respond_phase: str = None,
        owner: str = None,
        sec_owner: str = None,
        followers: List[str] = None,
        deadline_time: str = None,
        env_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 风险任务名称
        self.name = name
        # 风险来源，image/benchmark/runtime
        self.source = source
        # 风险唯一标识
        self.identity = identity
        # 风险等级
        self.priority = priority
        # 风险任务显示名称
        self.display_name = display_name
        # 响应阶段，默认是日常阶段
        self.respond_phase = respond_phase
        # 风险责任人
        self.owner = owner
        # 安全责任人
        self.sec_owner = sec_owner
        # 风险关注者
        self.followers = followers
        # 到期时间
        self.deadline_time = deadline_time
        # 环境标识ID
        self.env_id = env_id

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.source, 'source')
        self.validate_required(self.identity, 'identity')
        self.validate_required(self.display_name, 'display_name')
        self.validate_required(self.owner, 'owner')
        self.validate_required(self.sec_owner, 'sec_owner')
        self.validate_required(self.followers, 'followers')
        self.validate_required(self.deadline_time, 'deadline_time')
        if self.deadline_time is not None:
            self.validate_pattern(self.deadline_time, 'deadline_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.env_id, 'env_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.name is not None:
            result['name'] = self.name
        if self.source is not None:
            result['source'] = self.source
        if self.identity is not None:
            result['identity'] = self.identity
        if self.priority is not None:
            result['priority'] = self.priority
        if self.display_name is not None:
            result['display_name'] = self.display_name
        if self.respond_phase is not None:
            result['respond_phase'] = self.respond_phase
        if self.owner is not None:
            result['owner'] = self.owner
        if self.sec_owner is not None:
            result['sec_owner'] = self.sec_owner
        if self.followers is not None:
            result['followers'] = self.followers
        if self.deadline_time is not None:
            result['deadline_time'] = self.deadline_time
        if self.env_id is not None:
            result['env_id'] = self.env_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('identity') is not None:
            self.identity = m.get('identity')
        if m.get('priority') is not None:
            self.priority = m.get('priority')
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        if m.get('respond_phase') is not None:
            self.respond_phase = m.get('respond_phase')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        if m.get('sec_owner') is not None:
            self.sec_owner = m.get('sec_owner')
        if m.get('followers') is not None:
            self.followers = m.get('followers')
        if m.get('deadline_time') is not None:
            self.deadline_time = m.get('deadline_time')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        return self


class CreateRiskTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        risk_task_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 风险任务ID
        self.risk_task_id = risk_task_id

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
        if self.risk_task_id is not None:
            result['risk_task_id'] = self.risk_task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('risk_task_id') is not None:
            self.risk_task_id = m.get('risk_task_id')
        return self


class QueryRiskTasksRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        page: int = None,
        page_size: int = None,
        risk_task_id: str = None,
        display_name: str = None,
        priority: str = None,
        risk_type: str = None,
        risk_task_state: str = None,
        creation_time_from: str = None,
        creation_time_to: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 当前页数
        self.page = page
        # 页大小
        self.page_size = page_size
        # 风险ID
        self.risk_task_id = risk_task_id
        # 风险名称
        self.display_name = display_name
        # 风险等级
        self.priority = priority
        # 风险类型
        self.risk_type = risk_type
        # 风险状态
        self.risk_task_state = risk_task_state
        # FROM时间点， 按照时间范围搜索的开始时间点
        self.creation_time_from = creation_time_from
        # to时间点， 按照时间范围搜索的结束时间点
        # 
        self.creation_time_to = creation_time_to

    def validate(self):
        self.validate_required(self.page, 'page')
        self.validate_required(self.page_size, 'page_size')
        if self.creation_time_from is not None:
            self.validate_pattern(self.creation_time_from, 'creation_time_from', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.creation_time_to is not None:
            self.validate_pattern(self.creation_time_to, 'creation_time_to', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.page is not None:
            result['page'] = self.page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.risk_task_id is not None:
            result['risk_task_id'] = self.risk_task_id
        if self.display_name is not None:
            result['display_name'] = self.display_name
        if self.priority is not None:
            result['priority'] = self.priority
        if self.risk_type is not None:
            result['risk_type'] = self.risk_type
        if self.risk_task_state is not None:
            result['risk_task_state'] = self.risk_task_state
        if self.creation_time_from is not None:
            result['creation_time_from'] = self.creation_time_from
        if self.creation_time_to is not None:
            result['creation_time_to'] = self.creation_time_to
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('risk_task_id') is not None:
            self.risk_task_id = m.get('risk_task_id')
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        if m.get('priority') is not None:
            self.priority = m.get('priority')
        if m.get('risk_type') is not None:
            self.risk_type = m.get('risk_type')
        if m.get('risk_task_state') is not None:
            self.risk_task_state = m.get('risk_task_state')
        if m.get('creation_time_from') is not None:
            self.creation_time_from = m.get('creation_time_from')
        if m.get('creation_time_to') is not None:
            self.creation_time_to = m.get('creation_time_to')
        return self


class QueryRiskTasksResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        risk_tasks: List[RiskTask] = None,
        total_size: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 风险任务列表
        self.risk_tasks = risk_tasks
        # 总条目数
        self.total_size = total_size

    def validate(self):
        if self.risk_tasks:
            for k in self.risk_tasks:
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
        result['risk_tasks'] = []
        if self.risk_tasks is not None:
            for k in self.risk_tasks:
                result['risk_tasks'].append(k.to_map() if k else None)
        if self.total_size is not None:
            result['total_size'] = self.total_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.risk_tasks = []
        if m.get('risk_tasks') is not None:
            for k in m.get('risk_tasks'):
                temp_model = RiskTask()
                self.risk_tasks.append(temp_model.from_map(k))
        if m.get('total_size') is not None:
            self.total_size = m.get('total_size')
        return self


class GetRiskTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        risk_task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 风险工单ID
        self.risk_task_id = risk_task_id

    def validate(self):
        self.validate_required(self.risk_task_id, 'risk_task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.risk_task_id is not None:
            result['risk_task_id'] = self.risk_task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('risk_task_id') is not None:
            self.risk_task_id = m.get('risk_task_id')
        return self


class GetRiskTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        risk_task: RiskTask = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 风险共担详情
        self.risk_task = risk_task

    def validate(self):
        if self.risk_task:
            self.risk_task.validate()

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
        if self.risk_task is not None:
            result['risk_task'] = self.risk_task.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('risk_task') is not None:
            temp_model = RiskTask()
            self.risk_task = temp_model.from_map(m['risk_task'])
        return self


class UpdateRiskTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        risk_task_id: str = None,
        state: str = None,
        owner: str = None,
        sec_owner: str = None,
        followers: List[str] = None,
        risk_solution_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 风险共担ID
        self.risk_task_id = risk_task_id
        # 风险工单状态
        self.state = state
        # 风险责任人
        self.owner = owner
        # 安全责任人
        self.sec_owner = sec_owner
        # 风险关注人员列表
        self.followers = followers
        # 风险解决方案ID
        self.risk_solution_id = risk_solution_id

    def validate(self):
        self.validate_required(self.risk_task_id, 'risk_task_id')
        self.validate_required(self.state, 'state')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.risk_task_id is not None:
            result['risk_task_id'] = self.risk_task_id
        if self.state is not None:
            result['state'] = self.state
        if self.owner is not None:
            result['owner'] = self.owner
        if self.sec_owner is not None:
            result['sec_owner'] = self.sec_owner
        if self.followers is not None:
            result['followers'] = self.followers
        if self.risk_solution_id is not None:
            result['risk_solution_id'] = self.risk_solution_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('risk_task_id') is not None:
            self.risk_task_id = m.get('risk_task_id')
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        if m.get('sec_owner') is not None:
            self.sec_owner = m.get('sec_owner')
        if m.get('followers') is not None:
            self.followers = m.get('followers')
        if m.get('risk_solution_id') is not None:
            self.risk_solution_id = m.get('risk_solution_id')
        return self


class UpdateRiskTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        risk_task_id: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 风险工单ID
        self.risk_task_id = risk_task_id
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
        if self.risk_task_id is not None:
            result['risk_task_id'] = self.risk_task_id
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
        if m.get('risk_task_id') is not None:
            self.risk_task_id = m.get('risk_task_id')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class ConfirmRiskTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        risk_task_id: str = None,
        comment: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 风险工单ID
        self.risk_task_id = risk_task_id
        # 评论
        self.comment = comment

    def validate(self):
        self.validate_required(self.risk_task_id, 'risk_task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.risk_task_id is not None:
            result['risk_task_id'] = self.risk_task_id
        if self.comment is not None:
            result['comment'] = self.comment
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('risk_task_id') is not None:
            self.risk_task_id = m.get('risk_task_id')
        if m.get('comment') is not None:
            self.comment = m.get('comment')
        return self


class ConfirmRiskTaskResponse(TeaModel):
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
        # 是够成功
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


class CancelRiskTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        risk_task_id: str = None,
        comment: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 风险工单ID
        self.risk_task_id = risk_task_id
        # 评论，理由
        self.comment = comment

    def validate(self):
        self.validate_required(self.risk_task_id, 'risk_task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.risk_task_id is not None:
            result['risk_task_id'] = self.risk_task_id
        if self.comment is not None:
            result['comment'] = self.comment
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('risk_task_id') is not None:
            self.risk_task_id = m.get('risk_task_id')
        if m.get('comment') is not None:
            self.comment = m.get('comment')
        return self


class CancelRiskTaskResponse(TeaModel):
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


class RefuseRiskTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        risk_task_id: str = None,
        comment: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 风险工单ID
        self.risk_task_id = risk_task_id
        # 评论
        self.comment = comment

    def validate(self):
        self.validate_required(self.risk_task_id, 'risk_task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.risk_task_id is not None:
            result['risk_task_id'] = self.risk_task_id
        if self.comment is not None:
            result['comment'] = self.comment
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('risk_task_id') is not None:
            self.risk_task_id = m.get('risk_task_id')
        if m.get('comment') is not None:
            self.comment = m.get('comment')
        return self


class RefuseRiskTaskResponse(TeaModel):
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


class VerifyRiskTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        risk_task_id: str = None,
        comment: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 风险工单ID
        self.risk_task_id = risk_task_id
        # 评论
        self.comment = comment

    def validate(self):
        self.validate_required(self.risk_task_id, 'risk_task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.risk_task_id is not None:
            result['risk_task_id'] = self.risk_task_id
        if self.comment is not None:
            result['comment'] = self.comment
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('risk_task_id') is not None:
            self.risk_task_id = m.get('risk_task_id')
        if m.get('comment') is not None:
            self.comment = m.get('comment')
        return self


class VerifyRiskTaskResponse(TeaModel):
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
        # 成功与否
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


class SendRiskTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        risk_task_id: str = None,
        owner: str = None,
        comment: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 风险工单ID
        self.risk_task_id = risk_task_id
        # 责任人
        self.owner = owner
        # 评论
        self.comment = comment

    def validate(self):
        self.validate_required(self.risk_task_id, 'risk_task_id')
        self.validate_required(self.owner, 'owner')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.risk_task_id is not None:
            result['risk_task_id'] = self.risk_task_id
        if self.owner is not None:
            result['owner'] = self.owner
        if self.comment is not None:
            result['comment'] = self.comment
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('risk_task_id') is not None:
            self.risk_task_id = m.get('risk_task_id')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        if m.get('comment') is not None:
            self.comment = m.get('comment')
        return self


class SendRiskTaskResponse(TeaModel):
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


class CloseRiskTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        risk_task_id: str = None,
        comment: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 风险工单ID
        self.risk_task_id = risk_task_id
        # 描述，评论
        self.comment = comment

    def validate(self):
        self.validate_required(self.risk_task_id, 'risk_task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.risk_task_id is not None:
            result['risk_task_id'] = self.risk_task_id
        if self.comment is not None:
            result['comment'] = self.comment
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('risk_task_id') is not None:
            self.risk_task_id = m.get('risk_task_id')
        if m.get('comment') is not None:
            self.comment = m.get('comment')
        return self


class CloseRiskTaskResponse(TeaModel):
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


class GetRiskStatisticsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        return self


class GetRiskStatisticsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_risk_tasks_count: int = None,
        unfixed_risk_tasks_count: int = None,
        unconfirmed_risks_tasks_count: int = None,
        image_risk_tasks_count: int = None,
        benchmark_risk_tasks_count: int = None,
        runtime_risk_tasks_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 风险总数
        self.total_risk_tasks_count = total_risk_tasks_count
        # 未修复风险数
        self.unfixed_risk_tasks_count = unfixed_risk_tasks_count
        # 未响应风险数
        self.unconfirmed_risks_tasks_count = unconfirmed_risks_tasks_count
        # 镜像漏洞风险数
        self.image_risk_tasks_count = image_risk_tasks_count
        # 基线风险数
        self.benchmark_risk_tasks_count = benchmark_risk_tasks_count
        # 运行时风险数
        self.runtime_risk_tasks_count = runtime_risk_tasks_count

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
        if self.total_risk_tasks_count is not None:
            result['total_risk_tasks_count'] = self.total_risk_tasks_count
        if self.unfixed_risk_tasks_count is not None:
            result['unfixed_risk_tasks_count'] = self.unfixed_risk_tasks_count
        if self.unconfirmed_risks_tasks_count is not None:
            result['unconfirmed_risks_tasks_count'] = self.unconfirmed_risks_tasks_count
        if self.image_risk_tasks_count is not None:
            result['image_risk_tasks_count'] = self.image_risk_tasks_count
        if self.benchmark_risk_tasks_count is not None:
            result['benchmark_risk_tasks_count'] = self.benchmark_risk_tasks_count
        if self.runtime_risk_tasks_count is not None:
            result['runtime_risk_tasks_count'] = self.runtime_risk_tasks_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_risk_tasks_count') is not None:
            self.total_risk_tasks_count = m.get('total_risk_tasks_count')
        if m.get('unfixed_risk_tasks_count') is not None:
            self.unfixed_risk_tasks_count = m.get('unfixed_risk_tasks_count')
        if m.get('unconfirmed_risks_tasks_count') is not None:
            self.unconfirmed_risks_tasks_count = m.get('unconfirmed_risks_tasks_count')
        if m.get('image_risk_tasks_count') is not None:
            self.image_risk_tasks_count = m.get('image_risk_tasks_count')
        if m.get('benchmark_risk_tasks_count') is not None:
            self.benchmark_risk_tasks_count = m.get('benchmark_risk_tasks_count')
        if m.get('runtime_risk_tasks_count') is not None:
            self.runtime_risk_tasks_count = m.get('runtime_risk_tasks_count')
        return self


class QueryRiskAuditsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        risk_task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 风险工单ID
        self.risk_task_id = risk_task_id

    def validate(self):
        self.validate_required(self.risk_task_id, 'risk_task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.risk_task_id is not None:
            result['risk_task_id'] = self.risk_task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('risk_task_id') is not None:
            self.risk_task_id = m.get('risk_task_id')
        return self


class QueryRiskAuditsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        risk_task_audits: List[RiskTaskAudit] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 风险任务审计
        self.risk_task_audits = risk_task_audits

    def validate(self):
        if self.risk_task_audits:
            for k in self.risk_task_audits:
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
        result['risk_task_audits'] = []
        if self.risk_task_audits is not None:
            for k in self.risk_task_audits:
                result['risk_task_audits'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.risk_task_audits = []
        if m.get('risk_task_audits') is not None:
            for k in m.get('risk_task_audits'):
                temp_model = RiskTaskAudit()
                self.risk_task_audits.append(temp_model.from_map(k))
        return self


class CreateRiskSolutionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        name: str = None,
        risk_id: str = None,
        source: str = None,
        fix_type: str = None,
        risk_description: str = None,
        solution_plan: str = None,
        emergency_plan: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 名称
        self.name = name
        # 关联风险ID
        self.risk_id = risk_id
        # 解决方案来源
        self.source = source
        # 修复类型
        self.fix_type = fix_type
        # 风险描述
        self.risk_description = risk_description
        # 风险解决方案
        self.solution_plan = solution_plan
        # 应急解决方案
        self.emergency_plan = emergency_plan

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.risk_id, 'risk_id')
        self.validate_required(self.source, 'source')
        self.validate_required(self.fix_type, 'fix_type')
        self.validate_required(self.risk_description, 'risk_description')
        self.validate_required(self.solution_plan, 'solution_plan')
        self.validate_required(self.emergency_plan, 'emergency_plan')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.name is not None:
            result['name'] = self.name
        if self.risk_id is not None:
            result['risk_id'] = self.risk_id
        if self.source is not None:
            result['source'] = self.source
        if self.fix_type is not None:
            result['fix_type'] = self.fix_type
        if self.risk_description is not None:
            result['risk_description'] = self.risk_description
        if self.solution_plan is not None:
            result['solution_plan'] = self.solution_plan
        if self.emergency_plan is not None:
            result['emergency_plan'] = self.emergency_plan
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('risk_id') is not None:
            self.risk_id = m.get('risk_id')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('fix_type') is not None:
            self.fix_type = m.get('fix_type')
        if m.get('risk_description') is not None:
            self.risk_description = m.get('risk_description')
        if m.get('solution_plan') is not None:
            self.solution_plan = m.get('solution_plan')
        if m.get('emergency_plan') is not None:
            self.emergency_plan = m.get('emergency_plan')
        return self


class CreateRiskSolutionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        risk_solution_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 风险解决方案ID
        self.risk_solution_id = risk_solution_id

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
        if self.risk_solution_id is not None:
            result['risk_solution_id'] = self.risk_solution_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('risk_solution_id') is not None:
            self.risk_solution_id = m.get('risk_solution_id')
        return self


class QueryRiskSolutionsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        name: str = None,
        risk_id: str = None,
        page: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 风险解决方案名称
        self.name = name
        # 风险ID
        self.risk_id = risk_id
        # 当前页
        self.page = page
        # 页大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.page, 'page')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.name is not None:
            result['name'] = self.name
        if self.risk_id is not None:
            result['risk_id'] = self.risk_id
        if self.page is not None:
            result['page'] = self.page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('risk_id') is not None:
            self.risk_id = m.get('risk_id')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryRiskSolutionsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        risk_solutions: List[RiskSolution] = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 风险解决方案列表
        self.risk_solutions = risk_solutions
        # 总数
        self.total_count = total_count

    def validate(self):
        if self.risk_solutions:
            for k in self.risk_solutions:
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
        result['risk_solutions'] = []
        if self.risk_solutions is not None:
            for k in self.risk_solutions:
                result['risk_solutions'].append(k.to_map() if k else None)
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
        self.risk_solutions = []
        if m.get('risk_solutions') is not None:
            for k in m.get('risk_solutions'):
                temp_model = RiskSolution()
                self.risk_solutions.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class GetRiskSolutionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        risk_solution_id: str = None,
        risk_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 风险解决方案ID, risk_id和risk_solution_id至少有一个非空
        self.risk_solution_id = risk_solution_id
        # 风险ID，risk_id和risk_solution_id至少有一个非空
        self.risk_id = risk_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.risk_solution_id is not None:
            result['risk_solution_id'] = self.risk_solution_id
        if self.risk_id is not None:
            result['risk_id'] = self.risk_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('risk_solution_id') is not None:
            self.risk_solution_id = m.get('risk_solution_id')
        if m.get('risk_id') is not None:
            self.risk_id = m.get('risk_id')
        return self


class GetRiskSolutionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        risk_solution: RiskSolution = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 风险解决方案
        self.risk_solution = risk_solution

    def validate(self):
        if self.risk_solution:
            self.risk_solution.validate()

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
        if self.risk_solution is not None:
            result['risk_solution'] = self.risk_solution.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('risk_solution') is not None:
            temp_model = RiskSolution()
            self.risk_solution = temp_model.from_map(m['risk_solution'])
        return self


class UpdateRiskSolutionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        risk_solution_id: str = None,
        fix_type: str = None,
        risk_description: str = None,
        solution_plan: str = None,
        emergency_plan: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 风险解决方案ID
        self.risk_solution_id = risk_solution_id
        # 解决方案类型
        self.fix_type = fix_type
        # 风险描述
        self.risk_description = risk_description
        # 风险解决方案
        self.solution_plan = solution_plan
        # 应急解决方案
        self.emergency_plan = emergency_plan

    def validate(self):
        self.validate_required(self.risk_solution_id, 'risk_solution_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.risk_solution_id is not None:
            result['risk_solution_id'] = self.risk_solution_id
        if self.fix_type is not None:
            result['fix_type'] = self.fix_type
        if self.risk_description is not None:
            result['risk_description'] = self.risk_description
        if self.solution_plan is not None:
            result['solution_plan'] = self.solution_plan
        if self.emergency_plan is not None:
            result['emergency_plan'] = self.emergency_plan
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('risk_solution_id') is not None:
            self.risk_solution_id = m.get('risk_solution_id')
        if m.get('fix_type') is not None:
            self.fix_type = m.get('fix_type')
        if m.get('risk_description') is not None:
            self.risk_description = m.get('risk_description')
        if m.get('solution_plan') is not None:
            self.solution_plan = m.get('solution_plan')
        if m.get('emergency_plan') is not None:
            self.emergency_plan = m.get('emergency_plan')
        return self


class UpdateRiskSolutionResponse(TeaModel):
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
        # 更新是否成功
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


class DeleteRiskSolutionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        risk_solution_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 风险解决方案ID
        self.risk_solution_id = risk_solution_id

    def validate(self):
        self.validate_required(self.risk_solution_id, 'risk_solution_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.risk_solution_id is not None:
            result['risk_solution_id'] = self.risk_solution_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('risk_solution_id') is not None:
            self.risk_solution_id = m.get('risk_solution_id')
        return self


class DeleteRiskSolutionResponse(TeaModel):
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


class ImportClusterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        cluster_id: str = None,
        cluster_name: str = None,
        env: str = None,
        source: str = None,
        namespace_whitelist: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群id
        self.cluster_id = cluster_id
        # 集群名称
        self.cluster_name = cluster_name
        # 环境
        self.env = env
        # 导入方式（手工manual/自动auto）
        self.source = source
        # 命名空间白名单
        self.namespace_whitelist = namespace_whitelist

    def validate(self):
        self.validate_required(self.cluster_name, 'cluster_name')
        self.validate_required(self.env, 'env')
        self.validate_required(self.source, 'source')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.cluster_name is not None:
            result['cluster_name'] = self.cluster_name
        if self.env is not None:
            result['env'] = self.env
        if self.source is not None:
            result['source'] = self.source
        if self.namespace_whitelist is not None:
            result['namespace_whitelist'] = self.namespace_whitelist
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('cluster_name') is not None:
            self.cluster_name = m.get('cluster_name')
        if m.get('env') is not None:
            self.env = m.get('env')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('namespace_whitelist') is not None:
            self.namespace_whitelist = m.get('namespace_whitelist')
        return self


class ImportClusterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        cluster_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 被纳管的集群id
        self.cluster_id = cluster_id

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
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        return self


class AddClusterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        cluster_name: str = None,
        env: str = None,
        source: str = None,
        namespace_whitelist: List[str] = None,
        kubeconfig: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群名
        self.cluster_name = cluster_name
        # 环境
        self.env = env
        # 必为manual
        self.source = source
        # 命名空间白名单
        self.namespace_whitelist = namespace_whitelist
        # 新增集群kubeconfig
        self.kubeconfig = kubeconfig

    def validate(self):
        self.validate_required(self.cluster_name, 'cluster_name')
        self.validate_required(self.env, 'env')
        self.validate_required(self.source, 'source')
        self.validate_required(self.namespace_whitelist, 'namespace_whitelist')
        self.validate_required(self.kubeconfig, 'kubeconfig')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.cluster_name is not None:
            result['cluster_name'] = self.cluster_name
        if self.env is not None:
            result['env'] = self.env
        if self.source is not None:
            result['source'] = self.source
        if self.namespace_whitelist is not None:
            result['namespace_whitelist'] = self.namespace_whitelist
        if self.kubeconfig is not None:
            result['kubeconfig'] = self.kubeconfig
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('cluster_name') is not None:
            self.cluster_name = m.get('cluster_name')
        if m.get('env') is not None:
            self.env = m.get('env')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('namespace_whitelist') is not None:
            self.namespace_whitelist = m.get('namespace_whitelist')
        if m.get('kubeconfig') is not None:
            self.kubeconfig = m.get('kubeconfig')
        return self


class AddClusterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        cluster_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 
        # 被纳管的集群id
        self.cluster_id = cluster_id

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
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        return self


class QueryClusterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        cluster_id: str = None,
        cluster_name: str = None,
        source: str = None,
        status: str = None,
        env: str = None,
        page: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群id
        self.cluster_id = cluster_id
        # 集群名
        self.cluster_name = cluster_name
        # 来源
        self.source = source
        # 状态
        self.status = status
        # 环境
        self.env = env
        # 当前页
        self.page = page
        # 页大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.page, 'page')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.cluster_name is not None:
            result['cluster_name'] = self.cluster_name
        if self.source is not None:
            result['source'] = self.source
        if self.status is not None:
            result['status'] = self.status
        if self.env is not None:
            result['env'] = self.env
        if self.page is not None:
            result['page'] = self.page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('cluster_name') is not None:
            self.cluster_name = m.get('cluster_name')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('env') is not None:
            self.env = m.get('env')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryClusterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_cnt: int = None,
        clusters: List[Cluster] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总数
        self.total_cnt = total_cnt
        # 集群信息
        self.clusters = clusters

    def validate(self):
        if self.clusters:
            for k in self.clusters:
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
        if self.total_cnt is not None:
            result['total_cnt'] = self.total_cnt
        result['clusters'] = []
        if self.clusters is not None:
            for k in self.clusters:
                result['clusters'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_cnt') is not None:
            self.total_cnt = m.get('total_cnt')
        self.clusters = []
        if m.get('clusters') is not None:
            for k in m.get('clusters'):
                temp_model = Cluster()
                self.clusters.append(temp_model.from_map(k))
        return self


class QueryClusterNamespaceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        cluster_id: str = None,
        cluster_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群id
        self.cluster_id = cluster_id
        # 集群名
        self.cluster_name = cluster_name

    def validate(self):
        self.validate_required(self.cluster_id, 'cluster_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.cluster_name is not None:
            result['cluster_name'] = self.cluster_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('cluster_name') is not None:
            self.cluster_name = m.get('cluster_name')
        return self


class QueryClusterNamespaceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        namespaces: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 命名空间列表
        self.namespaces = namespaces

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
        if self.namespaces is not None:
            result['namespaces'] = self.namespaces
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('namespaces') is not None:
            self.namespaces = m.get('namespaces')
        return self


class ReclaimClusterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        cluster_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群id
        self.cluster_id = cluster_id

    def validate(self):
        self.validate_required(self.cluster_id, 'cluster_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        return self


class ReclaimClusterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        cluster_id: str = None,
        cluster_name: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 被解绑的集群id
        self.cluster_id = cluster_id
        # 被解绑的集群名
        self.cluster_name = cluster_name

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
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.cluster_name is not None:
            result['cluster_name'] = self.cluster_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('cluster_name') is not None:
            self.cluster_name = m.get('cluster_name')
        return self


class QueryClusterBriefRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        cluster_id: str = None,
        cluster_name: str = None,
        page: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群id
        self.cluster_id = cluster_id
        # 集群名
        self.cluster_name = cluster_name
        # 分野
        self.page = page
        # 分页大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.page, 'page')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.cluster_name is not None:
            result['cluster_name'] = self.cluster_name
        if self.page is not None:
            result['page'] = self.page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('cluster_name') is not None:
            self.cluster_name = m.get('cluster_name')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryClusterBriefResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        brief: List[ClusterSecurityBrief] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 安全简报
        self.brief = brief

    def validate(self):
        if self.brief:
            for k in self.brief:
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
        result['brief'] = []
        if self.brief is not None:
            for k in self.brief:
                result['brief'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.brief = []
        if m.get('brief') is not None:
            for k in m.get('brief'):
                temp_model = ClusterSecurityBrief()
                self.brief.append(temp_model.from_map(k))
        return self


class GetStrategyDefaultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        return self


class GetStrategyDefaultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 策略内容
        self.content = content

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
        if self.content is not None:
            result['content'] = self.content
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
            self.content = m.get('content')
        return self


class AddStrategyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        strategy_id: str = None,
        content: Strategy = None,
        cluster_id: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 策略id
        self.strategy_id = strategy_id
        # 策略内容
        self.content = content
        # 绑定的集群id
        self.cluster_id = cluster_id

    def validate(self):
        self.validate_required(self.content, 'content')
        if self.content:
            self.content.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.strategy_id is not None:
            result['strategy_id'] = self.strategy_id
        if self.content is not None:
            result['content'] = self.content.to_map()
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('strategy_id') is not None:
            self.strategy_id = m.get('strategy_id')
        if m.get('content') is not None:
            temp_model = Strategy()
            self.content = temp_model.from_map(m['content'])
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        return self


class AddStrategyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        strategy_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 策略id
        self.strategy_id = strategy_id

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
        if self.strategy_id is not None:
            result['strategy_id'] = self.strategy_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('strategy_id') is not None:
            self.strategy_id = m.get('strategy_id')
        return self


class BindStrategyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        strategy_id: str = None,
        cluster_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 策略id
        self.strategy_id = strategy_id
        # 集群id
        self.cluster_id = cluster_id

    def validate(self):
        self.validate_required(self.strategy_id, 'strategy_id')
        self.validate_required(self.cluster_id, 'cluster_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.strategy_id is not None:
            result['strategy_id'] = self.strategy_id
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('strategy_id') is not None:
            self.strategy_id = m.get('strategy_id')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        return self


class BindStrategyResponse(TeaModel):
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


class QueryRisksRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        page: int = None,
        page_size: int = None,
        name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 当前页
        self.page = page
        # 页大小
        self.page_size = page_size
        # 风险名称
        self.name = name

    def validate(self):
        self.validate_required(self.page, 'page')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.page is not None:
            result['page'] = self.page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class QueryRisksResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        risks: List[Risk] = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 风险列表
        self.risks = risks
        # 总数
        self.total_count = total_count

    def validate(self):
        if self.risks:
            for k in self.risks:
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
        result['risks'] = []
        if self.risks is not None:
            for k in self.risks:
                result['risks'].append(k.to_map() if k else None)
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
        self.risks = []
        if m.get('risks') is not None:
            for k in m.get('risks'):
                temp_model = Risk()
                self.risks.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class UpdateStrategyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        strategy_id: str = None,
        content: Strategy = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 策略id
        self.strategy_id = strategy_id
        # 策略内容
        self.content = content

    def validate(self):
        self.validate_required(self.strategy_id, 'strategy_id')
        self.validate_required(self.content, 'content')
        if self.content:
            self.content.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.strategy_id is not None:
            result['strategy_id'] = self.strategy_id
        if self.content is not None:
            result['content'] = self.content.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('strategy_id') is not None:
            self.strategy_id = m.get('strategy_id')
        if m.get('content') is not None:
            temp_model = Strategy()
            self.content = temp_model.from_map(m['content'])
        return self


class UpdateStrategyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        strategy_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 策略id
        self.strategy_id = strategy_id

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
        if self.strategy_id is not None:
            result['strategy_id'] = self.strategy_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('strategy_id') is not None:
            self.strategy_id = m.get('strategy_id')
        return self


class QueryStrategyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        strategy_id: str = None,
        cluster_id: str = None,
        page: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 策略id
        self.strategy_id = strategy_id
        # 集群id
        self.cluster_id = cluster_id
        # 分页
        self.page = page
        # 分页大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.page, 'page')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.strategy_id is not None:
            result['strategy_id'] = self.strategy_id
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.page is not None:
            result['page'] = self.page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('strategy_id') is not None:
            self.strategy_id = m.get('strategy_id')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryStrategyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        strategy: List[Strategy] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 策略数组
        self.strategy = strategy

    def validate(self):
        if self.strategy:
            for k in self.strategy:
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
        result['strategy'] = []
        if self.strategy is not None:
            for k in self.strategy:
                result['strategy'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.strategy = []
        if m.get('strategy') is not None:
            for k in m.get('strategy'):
                temp_model = Strategy()
                self.strategy.append(temp_model.from_map(k))
        return self


class ScaleRiskTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        risk_task_id: str = None,
        deadline_time: str = None,
        comment: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 风险任务ID
        self.risk_task_id = risk_task_id
        # 延期时间
        self.deadline_time = deadline_time
        # comment描述
        self.comment = comment

    def validate(self):
        self.validate_required(self.risk_task_id, 'risk_task_id')
        self.validate_required(self.deadline_time, 'deadline_time')
        if self.deadline_time is not None:
            self.validate_pattern(self.deadline_time, 'deadline_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.risk_task_id is not None:
            result['risk_task_id'] = self.risk_task_id
        if self.deadline_time is not None:
            result['deadline_time'] = self.deadline_time
        if self.comment is not None:
            result['comment'] = self.comment
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('risk_task_id') is not None:
            self.risk_task_id = m.get('risk_task_id')
        if m.get('deadline_time') is not None:
            self.deadline_time = m.get('deadline_time')
        if m.get('comment') is not None:
            self.comment = m.get('comment')
        return self


class ScaleRiskTaskResponse(TeaModel):
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
        # 操作成功
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


class ListClusterImagesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        cluster_id: str = None,
        namespace: str = None,
        workload_types: List[str] = None,
        labels: List[Label] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.cluster_id = cluster_id
        # 目标命名空间
        self.namespace = namespace
        # 工作负载类型
        self.workload_types = workload_types
        # 标签列表
        self.labels = labels

    def validate(self):
        self.validate_required(self.cluster_id, 'cluster_id')
        if self.labels:
            for k in self.labels:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.namespace is not None:
            result['namespace'] = self.namespace
        if self.workload_types is not None:
            result['workload_types'] = self.workload_types
        result['labels'] = []
        if self.labels is not None:
            for k in self.labels:
                result['labels'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('namespace') is not None:
            self.namespace = m.get('namespace')
        if m.get('workload_types') is not None:
            self.workload_types = m.get('workload_types')
        self.labels = []
        if m.get('labels') is not None:
            for k in m.get('labels'):
                temp_model = Label()
                self.labels.append(temp_model.from_map(k))
        return self


class ListClusterImagesResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        images: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 镜像列表
        self.images = images

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
        if self.images is not None:
            result['images'] = self.images
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('images') is not None:
            self.images = m.get('images')
        return self


class StartClusterQuickscanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        cluster_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群id
        self.cluster_id = cluster_id

    def validate(self):
        self.validate_required(self.cluster_id, 'cluster_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        return self


class StartClusterQuickscanResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        cluster_id: str = None,
        scan_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 集群id
        self.cluster_id = cluster_id
        # 扫描id
        self.scan_id = scan_id

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
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.scan_id is not None:
            result['scan_id'] = self.scan_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('scan_id') is not None:
            self.scan_id = m.get('scan_id')
        return self


class QueryClusterScanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        cluster_id: str = None,
        scan_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群id
        self.cluster_id = cluster_id
        # 扫描id
        self.scan_id = scan_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.scan_id is not None:
            result['scan_id'] = self.scan_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('scan_id') is not None:
            self.scan_id = m.get('scan_id')
        return self


class QueryClusterScanResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[ScanResult] = None,
        scan_id: str = None,
        cluster_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果
        self.result = result
        # 扫描id
        self.scan_id = scan_id
        # 集群id
        self.cluster_id = cluster_id

    def validate(self):
        if self.result:
            for k in self.result:
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
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        if self.scan_id is not None:
            result['scan_id'] = self.scan_id
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
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
                temp_model = ScanResult()
                self.result.append(temp_model.from_map(k))
        if m.get('scan_id') is not None:
            self.scan_id = m.get('scan_id')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        return self


class CreateRuntimePolicyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        cluster_id: str = None,
        namespace: str = None,
        name: str = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.cluster_id = cluster_id
        # 命名空间
        self.namespace = namespace
        # 名称
        self.name = name
        # 运行时策略yaml文件内容
        self.content = content

    def validate(self):
        self.validate_required(self.cluster_id, 'cluster_id')
        self.validate_required(self.namespace, 'namespace')
        self.validate_required(self.name, 'name')
        self.validate_required(self.content, 'content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.namespace is not None:
            result['namespace'] = self.namespace
        if self.name is not None:
            result['name'] = self.name
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('namespace') is not None:
            self.namespace = m.get('namespace')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class CreateRuntimePolicyResponse(TeaModel):
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
        # 创建是否成功
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


class ListRuntimePoliciesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        cluster_id: str = None,
        namespace: str = None,
        label_selectors: List[Label] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.cluster_id = cluster_id
        # 命名空间
        self.namespace = namespace
        # 标签选择
        self.label_selectors = label_selectors

    def validate(self):
        self.validate_required(self.cluster_id, 'cluster_id')
        self.validate_required(self.namespace, 'namespace')
        if self.label_selectors:
            for k in self.label_selectors:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.namespace is not None:
            result['namespace'] = self.namespace
        result['label_selectors'] = []
        if self.label_selectors is not None:
            for k in self.label_selectors:
                result['label_selectors'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('namespace') is not None:
            self.namespace = m.get('namespace')
        self.label_selectors = []
        if m.get('label_selectors') is not None:
            for k in m.get('label_selectors'):
                temp_model = Label()
                self.label_selectors.append(temp_model.from_map(k))
        return self


class ListRuntimePoliciesResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        policy_list: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 策略列表
        self.policy_list = policy_list

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
        if self.policy_list is not None:
            result['policy_list'] = self.policy_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('policy_list') is not None:
            self.policy_list = m.get('policy_list')
        return self


class UpdateRuntimePolicyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        cluster_id: str = None,
        namespace: str = None,
        name: str = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.cluster_id = cluster_id
        # 命名空间
        self.namespace = namespace
        # 名称
        self.name = name
        # 内容
        self.content = content

    def validate(self):
        self.validate_required(self.cluster_id, 'cluster_id')
        self.validate_required(self.namespace, 'namespace')
        self.validate_required(self.name, 'name')
        self.validate_required(self.content, 'content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.namespace is not None:
            result['namespace'] = self.namespace
        if self.name is not None:
            result['name'] = self.name
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('namespace') is not None:
            self.namespace = m.get('namespace')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class UpdateRuntimePolicyResponse(TeaModel):
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


class DeleteRuntimePolicyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        cluster_id: str = None,
        namespace: str = None,
        name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.cluster_id = cluster_id
        # 运行时策略命名空间
        self.namespace = namespace
        # 运行时策略名称
        self.name = name

    def validate(self):
        self.validate_required(self.cluster_id, 'cluster_id')
        self.validate_required(self.namespace, 'namespace')
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.namespace is not None:
            result['namespace'] = self.namespace
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('namespace') is not None:
            self.namespace = m.get('namespace')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class DeleteRuntimePolicyResponse(TeaModel):
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


class ListRuntimepolicyPodsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        cluster_id: str = None,
        namespace: str = None,
        policy_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.cluster_id = cluster_id
        # 命名空间
        self.namespace = namespace
        # 策略名称
        self.policy_name = policy_name

    def validate(self):
        self.validate_required(self.cluster_id, 'cluster_id')
        self.validate_required(self.namespace, 'namespace')
        self.validate_required(self.policy_name, 'policy_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.namespace is not None:
            result['namespace'] = self.namespace
        if self.policy_name is not None:
            result['policy_name'] = self.policy_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('namespace') is not None:
            self.namespace = m.get('namespace')
        if m.get('policy_name') is not None:
            self.policy_name = m.get('policy_name')
        return self


class ListRuntimepolicyPodsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pods: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # pod列表
        self.pods = pods

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
        if self.pods is not None:
            result['pods'] = self.pods
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pods') is not None:
            self.pods = m.get('pods')
        return self


class ListRuntimepolicyNodesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        cluster_id: str = None,
        namespace: str = None,
        name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.cluster_id = cluster_id
        # 命名空间
        self.namespace = namespace
        # 名称
        self.name = name

    def validate(self):
        self.validate_required(self.cluster_id, 'cluster_id')
        self.validate_required(self.namespace, 'namespace')
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.namespace is not None:
            result['namespace'] = self.namespace
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('namespace') is not None:
            self.namespace = m.get('namespace')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class ListRuntimepolicyNodesResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        nodes: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 节点列表
        self.nodes = nodes

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
        if self.nodes is not None:
            result['nodes'] = self.nodes
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
            self.nodes = m.get('nodes')
        return self


class GetRuntimePolicyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        cluster_id: str = None,
        namespace: str = None,
        name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.cluster_id = cluster_id
        # 命名空间
        self.namespace = namespace
        # 名称
        self.name = name

    def validate(self):
        self.validate_required(self.cluster_id, 'cluster_id')
        self.validate_required(self.namespace, 'namespace')
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.namespace is not None:
            result['namespace'] = self.namespace
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('namespace') is not None:
            self.namespace = m.get('namespace')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class GetRuntimePolicyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        policy: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 策略详情
        self.policy = policy

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
        if self.policy is not None:
            result['policy'] = self.policy
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('policy') is not None:
            self.policy = m.get('policy')
        return self


class QueryClusterBaselineRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        cluster_id: str = None,
        scan_id: str = None,
        page: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群id
        self.cluster_id = cluster_id
        # 扫描id，不填默认最近一次
        self.scan_id = scan_id
        # 页码
        self.page = page
        # 分页大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.cluster_id, 'cluster_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.scan_id is not None:
            result['scan_id'] = self.scan_id
        if self.page is not None:
            result['page'] = self.page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('scan_id') is not None:
            self.scan_id = m.get('scan_id')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryClusterBaselineResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[BaselineScanResult] = None,
        total_cnt: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 扫描结果
        self.result = result
        # 结果条目总数
        self.total_cnt = total_cnt

    def validate(self):
        if self.result:
            for k in self.result:
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
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        if self.total_cnt is not None:
            result['total_cnt'] = self.total_cnt
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
                temp_model = BaselineScanResult()
                self.result.append(temp_model.from_map(k))
        if m.get('total_cnt') is not None:
            self.total_cnt = m.get('total_cnt')
        return self


class SubmitImagesReposcanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        repo_id: str = None,
        projects: List[str] = None,
        repositories: List[str] = None,
        image_begin_time: str = None,
        concurrent_count: int = None,
        poll_interval: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 镜像仓库ID
        self.repo_id = repo_id
        # 项目列表
        self.projects = projects
        # 仓库列表
        self.repositories = repositories
        # 镜像起始时间
        self.image_begin_time = image_begin_time
        # 并发扫描数
        self.concurrent_count = concurrent_count
        # 扫描轮询间隔，单位s
        self.poll_interval = poll_interval

    def validate(self):
        self.validate_required(self.repo_id, 'repo_id')
        if self.image_begin_time is not None:
            self.validate_pattern(self.image_begin_time, 'image_begin_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.repo_id is not None:
            result['repo_id'] = self.repo_id
        if self.projects is not None:
            result['projects'] = self.projects
        if self.repositories is not None:
            result['repositories'] = self.repositories
        if self.image_begin_time is not None:
            result['image_begin_time'] = self.image_begin_time
        if self.concurrent_count is not None:
            result['concurrent_count'] = self.concurrent_count
        if self.poll_interval is not None:
            result['poll_interval'] = self.poll_interval
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('repo_id') is not None:
            self.repo_id = m.get('repo_id')
        if m.get('projects') is not None:
            self.projects = m.get('projects')
        if m.get('repositories') is not None:
            self.repositories = m.get('repositories')
        if m.get('image_begin_time') is not None:
            self.image_begin_time = m.get('image_begin_time')
        if m.get('concurrent_count') is not None:
            self.concurrent_count = m.get('concurrent_count')
        if m.get('poll_interval') is not None:
            self.poll_interval = m.get('poll_interval')
        return self


class SubmitImagesReposcanResponse(TeaModel):
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


class CreateImageRepoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        name: str = None,
        repo_type: str = None,
        domain: str = None,
        endpoint: str = None,
        user_name: str = None,
        password: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 镜像仓库名称
        self.name = name
        # 镜像仓库类型
        self.repo_type = repo_type
        # hub域名
        self.domain = domain
        # API endpoint
        self.endpoint = endpoint
        # 用户名
        self.user_name = user_name
        # 仓库密码
        self.password = password

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.repo_type, 'repo_type')
        self.validate_required(self.domain, 'domain')
        self.validate_required(self.endpoint, 'endpoint')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.password, 'password')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.name is not None:
            result['name'] = self.name
        if self.repo_type is not None:
            result['repo_type'] = self.repo_type
        if self.domain is not None:
            result['domain'] = self.domain
        if self.endpoint is not None:
            result['endpoint'] = self.endpoint
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.password is not None:
            result['password'] = self.password
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('repo_type') is not None:
            self.repo_type = m.get('repo_type')
        if m.get('domain') is not None:
            self.domain = m.get('domain')
        if m.get('endpoint') is not None:
            self.endpoint = m.get('endpoint')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('password') is not None:
            self.password = m.get('password')
        return self


class CreateImageRepoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        repo_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 仓库ID
        self.repo_id = repo_id

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
        if self.repo_id is not None:
            result['repo_id'] = self.repo_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('repo_id') is not None:
            self.repo_id = m.get('repo_id')
        return self


class QueryImageReposRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        name: str = None,
        page: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 仓库名称
        self.name = name
        # 当前页
        self.page = page
        # 页大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.page, 'page')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.name is not None:
            result['name'] = self.name
        if self.page is not None:
            result['page'] = self.page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryImageReposResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        repos: List[ImageRepo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 镜像仓库列表
        self.repos = repos

    def validate(self):
        if self.repos:
            for k in self.repos:
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
        result['repos'] = []
        if self.repos is not None:
            for k in self.repos:
                result['repos'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.repos = []
        if m.get('repos') is not None:
            for k in m.get('repos'):
                temp_model = ImageRepo()
                self.repos.append(temp_model.from_map(k))
        return self


class DeleteImageRepoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        repo_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 镜像仓库ID
        self.repo_id = repo_id

    def validate(self):
        self.validate_required(self.repo_id, 'repo_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.repo_id is not None:
            result['repo_id'] = self.repo_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('repo_id') is not None:
            self.repo_id = m.get('repo_id')
        return self


class DeleteImageRepoResponse(TeaModel):
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
        # 成功与否
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


class GetImageRiskdetailurlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        image: str = None,
        app_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 镜像地址
        self.image = image
        # 应用名称
        self.app_name = app_name

    def validate(self):
        self.validate_required(self.image, 'image')
        self.validate_required(self.app_name, 'app_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.image is not None:
            result['image'] = self.image
        if self.app_name is not None:
            result['app_name'] = self.app_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('image') is not None:
            self.image = m.get('image')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        return self


class GetImageRiskdetailurlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 镜像漏洞详情展示地址
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
        if m.get('url') is not None:
            self.url = m.get('url')
        return self


class CreateImageReposcanstrategyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        repo_id: str = None,
        projects: List[str] = None,
        repositories: List[str] = None,
        image_begin_time: str = None,
        crontab: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 仓库ID
        self.repo_id = repo_id
        # 项目列表
        self.projects = projects
        # 仓库列表
        self.repositories = repositories
        # 镜像开始时间
        self.image_begin_time = image_begin_time
        # 定时crontab
        self.crontab = crontab

    def validate(self):
        self.validate_required(self.repo_id, 'repo_id')
        if self.image_begin_time is not None:
            self.validate_pattern(self.image_begin_time, 'image_begin_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.crontab, 'crontab')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.repo_id is not None:
            result['repo_id'] = self.repo_id
        if self.projects is not None:
            result['projects'] = self.projects
        if self.repositories is not None:
            result['repositories'] = self.repositories
        if self.image_begin_time is not None:
            result['image_begin_time'] = self.image_begin_time
        if self.crontab is not None:
            result['crontab'] = self.crontab
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('repo_id') is not None:
            self.repo_id = m.get('repo_id')
        if m.get('projects') is not None:
            self.projects = m.get('projects')
        if m.get('repositories') is not None:
            self.repositories = m.get('repositories')
        if m.get('image_begin_time') is not None:
            self.image_begin_time = m.get('image_begin_time')
        if m.get('crontab') is not None:
            self.crontab = m.get('crontab')
        return self


class CreateImageReposcanstrategyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        cronjob_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 定时任务ID
        self.cronjob_id = cronjob_id

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
        if self.cronjob_id is not None:
            result['cronjob_id'] = self.cronjob_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('cronjob_id') is not None:
            self.cronjob_id = m.get('cronjob_id')
        return self


class QueryImagerepoProjectsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        repo_id: str = None,
        page: int = None,
        page_size: int = None,
        project_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 仓库ID
        self.repo_id = repo_id
        # 当前页
        self.page = page
        # 页大小
        self.page_size = page_size
        # 仓库名称
        self.project_name = project_name

    def validate(self):
        self.validate_required(self.repo_id, 'repo_id')
        self.validate_required(self.page, 'page')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.repo_id is not None:
            result['repo_id'] = self.repo_id
        if self.page is not None:
            result['page'] = self.page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.project_name is not None:
            result['project_name'] = self.project_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('repo_id') is not None:
            self.repo_id = m.get('repo_id')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        return self


class QueryImagerepoProjectsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        projects: List[RepoProject] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 项目列表
        self.projects = projects

    def validate(self):
        if self.projects:
            for k in self.projects:
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
        result['projects'] = []
        if self.projects is not None:
            for k in self.projects:
                result['projects'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.projects = []
        if m.get('projects') is not None:
            for k in m.get('projects'):
                temp_model = RepoProject()
                self.projects.append(temp_model.from_map(k))
        return self


class QueryImagerepoRepositoriesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        repo_id: str = None,
        project_id: str = None,
        page: int = None,
        page_size: int = None,
        repository_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 仓库ID
        self.repo_id = repo_id
        # 项目ID
        self.project_id = project_id
        # 当前页
        self.page = page
        # 页大小
        self.page_size = page_size
        # 仓库名称
        self.repository_name = repository_name

    def validate(self):
        self.validate_required(self.repo_id, 'repo_id')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.page, 'page')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.repo_id is not None:
            result['repo_id'] = self.repo_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.page is not None:
            result['page'] = self.page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.repository_name is not None:
            result['repository_name'] = self.repository_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('repo_id') is not None:
            self.repo_id = m.get('repo_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('repository_name') is not None:
            self.repository_name = m.get('repository_name')
        return self


class QueryImagerepoRepositoriesResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        repositories: List[Repository] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 仓库列表
        self.repositories = repositories

    def validate(self):
        if self.repositories:
            for k in self.repositories:
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
        result['repositories'] = []
        if self.repositories is not None:
            for k in self.repositories:
                result['repositories'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.repositories = []
        if m.get('repositories') is not None:
            for k in m.get('repositories'):
                temp_model = Repository()
                self.repositories.append(temp_model.from_map(k))
        return self


class UpdateImageRepoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        repo_id: str = None,
        user_name: str = None,
        password: str = None,
        name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 仓库ID
        self.repo_id = repo_id
        # 用户名
        self.user_name = user_name
        # 密码
        self.password = password
        # 仓库名称
        self.name = name

    def validate(self):
        self.validate_required(self.repo_id, 'repo_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.repo_id is not None:
            result['repo_id'] = self.repo_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.password is not None:
            result['password'] = self.password
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('repo_id') is not None:
            self.repo_id = m.get('repo_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('password') is not None:
            self.password = m.get('password')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class UpdateImageRepoResponse(TeaModel):
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
        # 操作是否成功
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


class GetImageRepoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        repo_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # repo ID
        self.repo_id = repo_id

    def validate(self):
        self.validate_required(self.repo_id, 'repo_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.repo_id is not None:
            result['repo_id'] = self.repo_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('repo_id') is not None:
            self.repo_id = m.get('repo_id')
        return self


class GetImageRepoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        image_repo: ImageRepo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 镜像仓库详情
        self.image_repo = image_repo

    def validate(self):
        if self.image_repo:
            self.image_repo.validate()

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
        if self.image_repo is not None:
            result['image_repo'] = self.image_repo.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('image_repo') is not None:
            temp_model = ImageRepo()
            self.image_repo = temp_model.from_map(m['image_repo'])
        return self


class VerifyImageRepoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        repo_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # repo_id
        self.repo_id = repo_id

    def validate(self):
        self.validate_required(self.repo_id, 'repo_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.repo_id is not None:
            result['repo_id'] = self.repo_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('repo_id') is not None:
            self.repo_id = m.get('repo_id')
        return self


class VerifyImageRepoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        repo_id: str = None,
        state: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 仓库ID
        self.repo_id = repo_id
        # 状态
        self.state = state

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
        if self.repo_id is not None:
            result['repo_id'] = self.repo_id
        if self.state is not None:
            result['state'] = self.state
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('repo_id') is not None:
            self.repo_id = m.get('repo_id')
        if m.get('state') is not None:
            self.state = m.get('state')
        return self


class QueryImageReposcanstrategiesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        repo_id: str = None,
        page: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 仓库ID
        self.repo_id = repo_id
        # 当前页
        self.page = page
        # 页大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.repo_id, 'repo_id')
        self.validate_required(self.page, 'page')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.repo_id is not None:
            result['repo_id'] = self.repo_id
        if self.page is not None:
            result['page'] = self.page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('repo_id') is not None:
            self.repo_id = m.get('repo_id')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryImageReposcanstrategiesResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        repo_strategies: List[RepoScanStrategy] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 镜像扫描策略
        self.repo_strategies = repo_strategies

    def validate(self):
        if self.repo_strategies:
            for k in self.repo_strategies:
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
        result['repo_strategies'] = []
        if self.repo_strategies is not None:
            for k in self.repo_strategies:
                result['repo_strategies'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.repo_strategies = []
        if m.get('repo_strategies') is not None:
            for k in m.get('repo_strategies'):
                temp_model = RepoScanStrategy()
                self.repo_strategies.append(temp_model.from_map(k))
        return self


class DeleteImageReposcanstrategyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        strategy_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 策略ID
        self.strategy_id = strategy_id

    def validate(self):
        self.validate_required(self.strategy_id, 'strategy_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.strategy_id is not None:
            result['strategy_id'] = self.strategy_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('strategy_id') is not None:
            self.strategy_id = m.get('strategy_id')
        return self


class DeleteImageReposcanstrategyResponse(TeaModel):
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


class UpdateImageReposcanstrategyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        strategy_id: str = None,
        projects: List[str] = None,
        repositories: List[str] = None,
        image_begin_time: str = None,
        crontab: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 策略ID
        self.strategy_id = strategy_id
        # 项目列表
        self.projects = projects
        # 仓库列表
        self.repositories = repositories
        # 镜像开始时间
        self.image_begin_time = image_begin_time
        # 定时描述
        self.crontab = crontab

    def validate(self):
        self.validate_required(self.strategy_id, 'strategy_id')
        if self.image_begin_time is not None:
            self.validate_pattern(self.image_begin_time, 'image_begin_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.strategy_id is not None:
            result['strategy_id'] = self.strategy_id
        if self.projects is not None:
            result['projects'] = self.projects
        if self.repositories is not None:
            result['repositories'] = self.repositories
        if self.image_begin_time is not None:
            result['image_begin_time'] = self.image_begin_time
        if self.crontab is not None:
            result['crontab'] = self.crontab
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('strategy_id') is not None:
            self.strategy_id = m.get('strategy_id')
        if m.get('projects') is not None:
            self.projects = m.get('projects')
        if m.get('repositories') is not None:
            self.repositories = m.get('repositories')
        if m.get('image_begin_time') is not None:
            self.image_begin_time = m.get('image_begin_time')
        if m.get('crontab') is not None:
            self.crontab = m.get('crontab')
        return self


class UpdateImageReposcanstrategyResponse(TeaModel):
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
        # 更新成功
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


class SkipClusterBaselineRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        cluster_id: str = None,
        name: str = None,
        namespace: str = None,
        resource_id: str = None,
        kind: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群id
        self.cluster_id = cluster_id
        # 资源名称
        self.name = name
        # 资源命名空间
        self.namespace = namespace
        # 资源id
        self.resource_id = resource_id
        # 资源类型
        self.kind = kind

    def validate(self):
        self.validate_required(self.cluster_id, 'cluster_id')
        self.validate_required(self.resource_id, 'resource_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.name is not None:
            result['name'] = self.name
        if self.namespace is not None:
            result['namespace'] = self.namespace
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        if self.kind is not None:
            result['kind'] = self.kind
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('namespace') is not None:
            self.namespace = m.get('namespace')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        if m.get('kind') is not None:
            self.kind = m.get('kind')
        return self


class SkipClusterBaselineResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        resource_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 资源id
        self.resource_id = resource_id

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
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        return self


