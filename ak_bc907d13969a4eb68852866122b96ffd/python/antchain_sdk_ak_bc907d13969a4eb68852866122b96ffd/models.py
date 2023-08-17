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


class MapObject(TeaModel):
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


class TaskTemplateOptionConfig(TeaModel):
    def __init__(
        self,
        defaultresult: str = None,
        rule: str = None,
        preoptions: List[str] = None,
    ):
        # defaultresult
        self.defaultresult = defaultresult
        # rule
        self.rule = rule
        # 预制选项，针对填空题的输入题目
        self.preoptions = preoptions

    def validate(self):
        self.validate_required(self.defaultresult, 'defaultresult')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.defaultresult is not None:
            result['defaultresult'] = self.defaultresult
        if self.rule is not None:
            result['rule'] = self.rule
        if self.preoptions is not None:
            result['preoptions'] = self.preoptions
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('defaultresult') is not None:
            self.defaultresult = m.get('defaultresult')
        if m.get('rule') is not None:
            self.rule = m.get('rule')
        if m.get('preoptions') is not None:
            self.preoptions = m.get('preoptions')
        return self


class Groups(TeaModel):
    def __init__(
        self,
        groupid: str = None,
        groupname: str = None,
    ):
        # groupid
        self.groupid = groupid
        # groupname
        self.groupname = groupname

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.groupid is not None:
            result['groupid'] = self.groupid
        if self.groupname is not None:
            result['groupname'] = self.groupname
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('groupid') is not None:
            self.groupid = m.get('groupid')
        if m.get('groupname') is not None:
            self.groupname = m.get('groupname')
        return self


class TemplateOptionMap(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: TaskTemplateOptionConfig = None,
    ):
        # Map<String, TaskTemplateOptionConfig> templateOptionMap中的key
        self.key = key
        # TaskTemplateOptionConfig
        self.value = value

    def validate(self):
        if self.value:
            self.value.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

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
            temp_model = TaskTemplateOptionConfig()
            self.value = temp_model.from_map(m['value'])
        return self


class Exif(TeaModel):
    def __init__(
        self,
        exif: List[MapObject] = None,
    ):
        # exif
        self.exif = exif

    def validate(self):
        self.validate_required(self.exif, 'exif')
        if self.exif:
            for k in self.exif:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['exif'] = []
        if self.exif is not None:
            for k in self.exif:
                result['exif'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.exif = []
        if m.get('exif') is not None:
            for k in m.get('exif'):
                temp_model = MapObject()
                self.exif.append(temp_model.from_map(k))
        return self


class User(TeaModel):
    def __init__(
        self,
        accountno: str = None,
        username: str = None,
        accountsource: str = None,
        userid: str = None,
    ):
        # 接入标注系统的用户ID
        self.accountno = accountno
        # 用户名称
        self.username = username
        # 用户来源
        self.accountsource = accountsource
        # UserId
        self.userid = userid

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.accountno is not None:
            result['accountno'] = self.accountno
        if self.username is not None:
            result['username'] = self.username
        if self.accountsource is not None:
            result['accountsource'] = self.accountsource
        if self.userid is not None:
            result['userid'] = self.userid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('accountno') is not None:
            self.accountno = m.get('accountno')
        if m.get('username') is not None:
            self.username = m.get('username')
        if m.get('accountsource') is not None:
            self.accountsource = m.get('accountsource')
        if m.get('userid') is not None:
            self.userid = m.get('userid')
        return self


class Admins(TeaModel):
    def __init__(
        self,
        users: List[User] = None,
        groups: List[Groups] = None,
    ):
        # 管理员列表
        self.users = users
        # 组ID
        self.groups = groups

    def validate(self):
        if self.users:
            for k in self.users:
                if k:
                    k.validate()
        if self.groups:
            for k in self.groups:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['users'] = []
        if self.users is not None:
            for k in self.users:
                result['users'].append(k.to_map() if k else None)
        result['groups'] = []
        if self.groups is not None:
            for k in self.groups:
                result['groups'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.users = []
        if m.get('users') is not None:
            for k in m.get('users'):
                temp_model = User()
                self.users.append(temp_model.from_map(k))
        self.groups = []
        if m.get('groups') is not None:
            for k in m.get('groups'):
                temp_model = Groups()
                self.groups.append(temp_model.from_map(k))
        return self


class DownloadMarkResult(TeaModel):
    def __init__(
        self,
        taskid: str = None,
        runinstid: str = None,
        msgid: str = None,
    ):
        # TaskId
        self.taskid = taskid
        # RunInstId
        self.runinstid = runinstid
        # msgid
        self.msgid = msgid

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.taskid is not None:
            result['taskid'] = self.taskid
        if self.runinstid is not None:
            result['runinstid'] = self.runinstid
        if self.msgid is not None:
            result['msgid'] = self.msgid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('taskid') is not None:
            self.taskid = m.get('taskid')
        if m.get('runinstid') is not None:
            self.runinstid = m.get('runinstid')
        if m.get('msgid') is not None:
            self.msgid = m.get('msgid')
        return self


class ITagTaskWorkflowConfig(TeaModel):
    def __init__(
        self,
        nodename: str = None,
        users: List[User] = None,
        groups: List[Groups] = None,
        exif: Exif = None,
    ):
        # 标注阶段
        self.nodename = nodename
        # 标注人员列表
        self.users = users
        # 分组
        self.groups = groups
        # 扩展参数，例如质检抽样的比例，0~100 %\
        self.exif = exif

    def validate(self):
        if self.users:
            for k in self.users:
                if k:
                    k.validate()
        if self.groups:
            for k in self.groups:
                if k:
                    k.validate()
        if self.exif:
            self.exif.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.nodename is not None:
            result['nodename'] = self.nodename
        result['users'] = []
        if self.users is not None:
            for k in self.users:
                result['users'].append(k.to_map() if k else None)
        result['groups'] = []
        if self.groups is not None:
            for k in self.groups:
                result['groups'].append(k.to_map() if k else None)
        if self.exif is not None:
            result['exif'] = self.exif.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('nodename') is not None:
            self.nodename = m.get('nodename')
        self.users = []
        if m.get('users') is not None:
            for k in m.get('users'):
                temp_model = User()
                self.users.append(temp_model.from_map(k))
        self.groups = []
        if m.get('groups') is not None:
            for k in m.get('groups'):
                temp_model = Groups()
                self.groups.append(temp_model.from_map(k))
        if m.get('exif') is not None:
            temp_model = Exif()
            self.exif = temp_model.from_map(m['exif'])
        return self


class TaskTemplateConfig(TeaModel):
    def __init__(
        self,
        templateoptionmap: TemplateOptionMap = None,
    ):
        # templateoptionmap
        self.templateoptionmap = templateoptionmap

    def validate(self):
        self.validate_required(self.templateoptionmap, 'templateoptionmap')
        if self.templateoptionmap:
            self.templateoptionmap.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.templateoptionmap is not None:
            result['templateoptionmap'] = self.templateoptionmap.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('templateoptionmap') is not None:
            temp_model = TemplateOptionMap()
            self.templateoptionmap = temp_model.from_map(m['templateoptionmap'])
        return self


class DatasetProxyRelations(TeaModel):
    def __init__(
        self,
        source: str = None,
        datasetid: str = None,
        datasettype: str = None,
        sourcebizid: str = None,
    ):
        # 来源
        self.source = source
        # iTAG数据集的ID
        self.datasetid = datasetid
        # 标注类型
        self.datasettype = datasettype
        # SourceBizId
        self.sourcebizid = sourcebizid

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.source is not None:
            result['source'] = self.source
        if self.datasetid is not None:
            result['datasetid'] = self.datasetid
        if self.datasettype is not None:
            result['datasettype'] = self.datasettype
        if self.sourcebizid is not None:
            result['sourcebizid'] = self.sourcebizid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('datasetid') is not None:
            self.datasetid = m.get('datasetid')
        if m.get('datasettype') is not None:
            self.datasettype = m.get('datasettype')
        if m.get('sourcebizid') is not None:
            self.sourcebizid = m.get('sourcebizid')
        return self


class ProcessResult(TeaModel):
    def __init__(
        self,
        node: str = None,
        totalitem: int = None,
        finisheditem: int = None,
        totalsubtask: int = None,
        finishedsubtask: int = None,
    ):
        # Node
        self.node = node
        # totalitem
        self.totalitem = totalitem
        # finisheditem
        self.finisheditem = finisheditem
        # TotalSubTask
        self.totalsubtask = totalsubtask
        # FinishedSubTask
        self.finishedsubtask = finishedsubtask

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.node is not None:
            result['node'] = self.node
        if self.totalitem is not None:
            result['totalitem'] = self.totalitem
        if self.finisheditem is not None:
            result['finisheditem'] = self.finisheditem
        if self.totalsubtask is not None:
            result['totalsubtask'] = self.totalsubtask
        if self.finishedsubtask is not None:
            result['finishedsubtask'] = self.finishedsubtask
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('node') is not None:
            self.node = m.get('node')
        if m.get('totalitem') is not None:
            self.totalitem = m.get('totalitem')
        if m.get('finisheditem') is not None:
            self.finisheditem = m.get('finisheditem')
        if m.get('totalsubtask') is not None:
            self.totalsubtask = m.get('totalsubtask')
        if m.get('finishedsubtask') is not None:
            self.finishedsubtask = m.get('finishedsubtask')
        return self


class RunRet(TeaModel):
    def __init__(
        self,
        taskid: str = None,
        subtaskdistdt: str = None,
        requestid: str = None,
        taskname: str = None,
        msgsenddt: str = None,
        msgid: str = None,
        resultlink: str = None,
    ):
        # taskid
        self.taskid = taskid
        # subtaskdistdt
        self.subtaskdistdt = subtaskdistdt
        # requestid
        self.requestid = requestid
        # taskname
        self.taskname = taskname
        # msgsenddt
        self.msgsenddt = msgsenddt
        # msgid
        self.msgid = msgid
        # resultlink
        self.resultlink = resultlink

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.taskid is not None:
            result['taskid'] = self.taskid
        if self.subtaskdistdt is not None:
            result['subtaskdistdt'] = self.subtaskdistdt
        if self.requestid is not None:
            result['requestid'] = self.requestid
        if self.taskname is not None:
            result['taskname'] = self.taskname
        if self.msgsenddt is not None:
            result['msgsenddt'] = self.msgsenddt
        if self.msgid is not None:
            result['msgid'] = self.msgid
        if self.resultlink is not None:
            result['resultlink'] = self.resultlink
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('taskid') is not None:
            self.taskid = m.get('taskid')
        if m.get('subtaskdistdt') is not None:
            self.subtaskdistdt = m.get('subtaskdistdt')
        if m.get('requestid') is not None:
            self.requestid = m.get('requestid')
        if m.get('taskname') is not None:
            self.taskname = m.get('taskname')
        if m.get('msgsenddt') is not None:
            self.msgsenddt = m.get('msgsenddt')
        if m.get('msgid') is not None:
            self.msgid = m.get('msgid')
        if m.get('resultlink') is not None:
            self.resultlink = m.get('resultlink')
        return self


class BizInfo(TeaModel):
    def __init__(
        self,
        bizcode: str = None,
        bizno: int = None,
    ):
        # 业务码
        self.bizcode = bizcode
        # 可使用时间戳来防止重复
        self.bizno = bizno

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.bizcode is not None:
            result['bizcode'] = self.bizcode
        if self.bizno is not None:
            result['bizno'] = self.bizno
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('bizcode') is not None:
            self.bizcode = m.get('bizcode')
        if m.get('bizno') is not None:
            self.bizno = m.get('bizno')
        return self


class AssignConfig(TeaModel):
    def __init__(
        self,
        assigntype: str = None,
        assignsubtaskcount: int = None,
    ):
        # AVG_SIZE
        self.assigntype = assigntype
        # AssignSubTaskCount
        self.assignsubtaskcount = assignsubtaskcount

    def validate(self):
        self.validate_required(self.assigntype, 'assigntype')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.assigntype is not None:
            result['assigntype'] = self.assigntype
        if self.assignsubtaskcount is not None:
            result['assignsubtaskcount'] = self.assignsubtaskcount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('assigntype') is not None:
            self.assigntype = m.get('assigntype')
        if m.get('assignsubtaskcount') is not None:
            self.assignsubtaskcount = m.get('assignsubtaskcount')
        return self


class AuthItagAntitagAcmRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        accountno: str = None,
        accountsource: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 第三方平台用户ID
        self.accountno = accountno
        # 用户来源
        self.accountsource = accountsource

    def validate(self):
        self.validate_required(self.accountno, 'accountno')
        self.validate_required(self.accountsource, 'accountsource')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.accountno is not None:
            result['accountno'] = self.accountno
        if self.accountsource is not None:
            result['accountsource'] = self.accountsource
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('accountno') is not None:
            self.accountno = m.get('accountno')
        if m.get('accountsource') is not None:
            self.accountsource = m.get('accountsource')
        return self


class AuthItagAntitagAcmResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        reqmsgid: str = None,
        resultcode: str = None,
        resultmsg: str = None,
        accesstoken: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 消息ID
        self.reqmsgid = reqmsgid
        # 结果码
        self.resultcode = resultcode
        # 结果消息
        self.resultmsg = resultmsg
        # 授权码
        self.accesstoken = accesstoken

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
        if self.reqmsgid is not None:
            result['reqmsgid'] = self.reqmsgid
        if self.resultcode is not None:
            result['resultcode'] = self.resultcode
        if self.resultmsg is not None:
            result['resultmsg'] = self.resultmsg
        if self.accesstoken is not None:
            result['accesstoken'] = self.accesstoken
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('reqmsgid') is not None:
            self.reqmsgid = m.get('reqmsgid')
        if m.get('resultcode') is not None:
            self.resultcode = m.get('resultcode')
        if m.get('resultmsg') is not None:
            self.resultmsg = m.get('resultmsg')
        if m.get('accesstoken') is not None:
            self.accesstoken = m.get('accesstoken')
        return self


class CreateItagAntitagTaskRequestRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        taskname: str = None,
        templateid: str = None,
        projectid: str = None,
        assignconfig: AssignConfig = None,
        taskworkflow: ITagTaskWorkflowConfig = None,
        admins: List[Admins] = None,
        datasetproxyrelations: List[DatasetProxyRelations] = None,
        bizinfo: BizInfo = None,
        tasktemplateconfig: TaskTemplateConfig = None,
        exif: Exif = None,
        tntinstid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # taskname
        self.taskname = taskname
        # templateid
        self.templateid = templateid
        # projectid
        self.projectid = projectid
        # AssignConfig
        self.assignconfig = assignconfig
        # TaskWorkFlow
        self.taskworkflow = taskworkflow
        # admins
        self.admins = admins
        # datasetproxyrelations
        self.datasetproxyrelations = datasetproxyrelations
        # bizinfo
        self.bizinfo = bizinfo
        # tasktemplateconfig
        self.tasktemplateconfig = tasktemplateconfig
        # Exif
        self.exif = exif
        # tntinstid
        self.tntinstid = tntinstid

    def validate(self):
        if self.assignconfig:
            self.assignconfig.validate()
        if self.taskworkflow:
            self.taskworkflow.validate()
        if self.admins:
            for k in self.admins:
                if k:
                    k.validate()
        if self.datasetproxyrelations:
            for k in self.datasetproxyrelations:
                if k:
                    k.validate()
        if self.bizinfo:
            self.bizinfo.validate()
        if self.tasktemplateconfig:
            self.tasktemplateconfig.validate()
        if self.exif:
            self.exif.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.taskname is not None:
            result['taskname'] = self.taskname
        if self.templateid is not None:
            result['templateid'] = self.templateid
        if self.projectid is not None:
            result['projectid'] = self.projectid
        if self.assignconfig is not None:
            result['assignconfig'] = self.assignconfig.to_map()
        if self.taskworkflow is not None:
            result['taskworkflow'] = self.taskworkflow.to_map()
        result['admins'] = []
        if self.admins is not None:
            for k in self.admins:
                result['admins'].append(k.to_map() if k else None)
        result['datasetproxyrelations'] = []
        if self.datasetproxyrelations is not None:
            for k in self.datasetproxyrelations:
                result['datasetproxyrelations'].append(k.to_map() if k else None)
        if self.bizinfo is not None:
            result['bizinfo'] = self.bizinfo.to_map()
        if self.tasktemplateconfig is not None:
            result['tasktemplateconfig'] = self.tasktemplateconfig.to_map()
        if self.exif is not None:
            result['exif'] = self.exif.to_map()
        if self.tntinstid is not None:
            result['tntinstid'] = self.tntinstid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('taskname') is not None:
            self.taskname = m.get('taskname')
        if m.get('templateid') is not None:
            self.templateid = m.get('templateid')
        if m.get('projectid') is not None:
            self.projectid = m.get('projectid')
        if m.get('assignconfig') is not None:
            temp_model = AssignConfig()
            self.assignconfig = temp_model.from_map(m['assignconfig'])
        if m.get('taskworkflow') is not None:
            temp_model = ITagTaskWorkflowConfig()
            self.taskworkflow = temp_model.from_map(m['taskworkflow'])
        self.admins = []
        if m.get('admins') is not None:
            for k in m.get('admins'):
                temp_model = Admins()
                self.admins.append(temp_model.from_map(k))
        self.datasetproxyrelations = []
        if m.get('datasetproxyrelations') is not None:
            for k in m.get('datasetproxyrelations'):
                temp_model = DatasetProxyRelations()
                self.datasetproxyrelations.append(temp_model.from_map(k))
        if m.get('bizinfo') is not None:
            temp_model = BizInfo()
            self.bizinfo = temp_model.from_map(m['bizinfo'])
        if m.get('tasktemplateconfig') is not None:
            temp_model = TaskTemplateConfig()
            self.tasktemplateconfig = temp_model.from_map(m['tasktemplateconfig'])
        if m.get('exif') is not None:
            temp_model = Exif()
            self.exif = temp_model.from_map(m['exif'])
        if m.get('tntinstid') is not None:
            self.tntinstid = m.get('tntinstid')
        return self


class CreateItagAntitagTaskRequestResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        taskid: str = None,
        flowrunid: str = None,
        msgid: str = None,
        slavemsgid: str = None,
        reftaskid: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # taskId
        self.taskid = taskid
        # flowrunid
        self.flowrunid = flowrunid
        # msgid
        self.msgid = msgid
        # slavemsgid
        self.slavemsgid = slavemsgid
        # reftaskid
        self.reftaskid = reftaskid

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
        if self.taskid is not None:
            result['taskid'] = self.taskid
        if self.flowrunid is not None:
            result['flowrunid'] = self.flowrunid
        if self.msgid is not None:
            result['msgid'] = self.msgid
        if self.slavemsgid is not None:
            result['slavemsgid'] = self.slavemsgid
        if self.reftaskid is not None:
            result['reftaskid'] = self.reftaskid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('taskid') is not None:
            self.taskid = m.get('taskid')
        if m.get('flowrunid') is not None:
            self.flowrunid = m.get('flowrunid')
        if m.get('msgid') is not None:
            self.msgid = m.get('msgid')
        if m.get('slavemsgid') is not None:
            self.slavemsgid = m.get('slavemsgid')
        if m.get('reftaskid') is not None:
            self.reftaskid = m.get('reftaskid')
        return self


class ExportItagAntitagTaskDownloadRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tntinstid: str = None,
        taskid: str = None,
        encode: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # iTAG租户id
        self.tntinstid = tntinstid
        # TaskId
        self.taskid = taskid
        # Encode
        self.encode = encode

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
        if self.tntinstid is not None:
            result['tntinstid'] = self.tntinstid
        if self.taskid is not None:
            result['taskid'] = self.taskid
        if self.encode is not None:
            result['encode'] = self.encode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tntinstid') is not None:
            self.tntinstid = m.get('tntinstid')
        if m.get('taskid') is not None:
            self.taskid = m.get('taskid')
        if m.get('encode') is not None:
            self.encode = m.get('encode')
        return self


class ExportItagAntitagTaskDownloadResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        requestid: str = None,
        succ: str = None,
        code: str = None,
        msg: str = None,
        errinfo: str = None,
        result: DownloadMarkResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # RequestId
        self.requestid = requestid
        # Succ
        self.succ = succ
        # Code
        self.code = code
        # Msg
        self.msg = msg
        # errinfo
        self.errinfo = errinfo
        # result
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.requestid is not None:
            result['requestid'] = self.requestid
        if self.succ is not None:
            result['succ'] = self.succ
        if self.code is not None:
            result['code'] = self.code
        if self.msg is not None:
            result['msg'] = self.msg
        if self.errinfo is not None:
            result['errinfo'] = self.errinfo
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
        if m.get('requestid') is not None:
            self.requestid = m.get('requestid')
        if m.get('succ') is not None:
            self.succ = m.get('succ')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('errinfo') is not None:
            self.errinfo = m.get('errinfo')
        if m.get('result') is not None:
            temp_model = DownloadMarkResult()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryItagAntitagTaskDownloadRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tntinstid: str = None,
        runinstid: str = None,
        taskid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # iTAG租户ID
        self.tntinstid = tntinstid
        # runinstid
        self.runinstid = runinstid
        # 任务ID
        self.taskid = taskid

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
        if self.tntinstid is not None:
            result['tntinstid'] = self.tntinstid
        if self.runinstid is not None:
            result['runinstid'] = self.runinstid
        if self.taskid is not None:
            result['taskid'] = self.taskid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tntinstid') is not None:
            self.tntinstid = m.get('tntinstid')
        if m.get('runinstid') is not None:
            self.runinstid = m.get('runinstid')
        if m.get('taskid') is not None:
            self.taskid = m.get('taskid')
        return self


class QueryItagAntitagTaskDownloadResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        requestid: str = None,
        code: str = None,
        msg: str = None,
        succ: str = None,
        errinfo: str = None,
        runret: RunRet = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # requestid
        self.requestid = requestid
        # code
        self.code = code
        # msg
        self.msg = msg
        # succ
        self.succ = succ
        # errinfo
        self.errinfo = errinfo
        # runret
        self.runret = runret

    def validate(self):
        if self.runret:
            self.runret.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.requestid is not None:
            result['requestid'] = self.requestid
        if self.code is not None:
            result['code'] = self.code
        if self.msg is not None:
            result['msg'] = self.msg
        if self.succ is not None:
            result['succ'] = self.succ
        if self.errinfo is not None:
            result['errinfo'] = self.errinfo
        if self.runret is not None:
            result['runret'] = self.runret.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('requestid') is not None:
            self.requestid = m.get('requestid')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('succ') is not None:
            self.succ = m.get('succ')
        if m.get('errinfo') is not None:
            self.errinfo = m.get('errinfo')
        if m.get('runret') is not None:
            temp_model = RunRet()
            self.runret = temp_model.from_map(m['runret'])
        return self


class QueryItagAntitagTaskProcessRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tntinstid: str = None,
        taskid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # TntInstId
        self.tntinstid = tntinstid
        # taskid
        self.taskid = taskid

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
        if self.tntinstid is not None:
            result['tntinstid'] = self.tntinstid
        if self.taskid is not None:
            result['taskid'] = self.taskid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tntinstid') is not None:
            self.tntinstid = m.get('tntinstid')
        if m.get('taskid') is not None:
            self.taskid = m.get('taskid')
        return self


class QueryItagAntitagTaskProcessResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        requestid: str = None,
        code: str = None,
        msg: str = None,
        succ: str = None,
        result: ProcessResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # requestid
        self.requestid = requestid
        # Code
        self.code = code
        # Msg
        self.msg = msg
        # succ
        self.succ = succ
        # ProcessResult
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.requestid is not None:
            result['requestid'] = self.requestid
        if self.code is not None:
            result['code'] = self.code
        if self.msg is not None:
            result['msg'] = self.msg
        if self.succ is not None:
            result['succ'] = self.succ
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
        if m.get('requestid') is not None:
            self.requestid = m.get('requestid')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('succ') is not None:
            self.succ = m.get('succ')
        if m.get('result') is not None:
            temp_model = ProcessResult()
            self.result = temp_model.from_map(m['result'])
        return self


class RegisterItagAntitagUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        accountno: str = None,
        accountsource: str = None,
        email: str = None,
        phone: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 名称
        self.name = name
        # 第三方系统用户账号ID
        self.accountno = accountno
        # 用户来源
        self.accountsource = accountsource
        # 邮箱
        self.email = email
        # 电话
        self.phone = phone

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.accountno, 'accountno')
        self.validate_required(self.accountsource, 'accountsource')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.name is not None:
            result['name'] = self.name
        if self.accountno is not None:
            result['accountno'] = self.accountno
        if self.accountsource is not None:
            result['accountsource'] = self.accountsource
        if self.email is not None:
            result['email'] = self.email
        if self.phone is not None:
            result['phone'] = self.phone
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('accountno') is not None:
            self.accountno = m.get('accountno')
        if m.get('accountsource') is not None:
            self.accountsource = m.get('accountsource')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        return self


class RegisterItagAntitagUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        requestid: str = None,
        code: int = None,
        errmsg: str = None,
        msg: str = None,
        result: str = None,
        succ: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求ID
        self.requestid = requestid
        # 结果码
        self.code = code
        # 错误信息
        self.errmsg = errmsg
        # 结果消息
        self.msg = msg
        # 标注平台userid
        self.result = result
        # 结果
        self.succ = succ

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
        if self.requestid is not None:
            result['requestid'] = self.requestid
        if self.code is not None:
            result['code'] = self.code
        if self.errmsg is not None:
            result['errmsg'] = self.errmsg
        if self.msg is not None:
            result['msg'] = self.msg
        if self.result is not None:
            result['result'] = self.result
        if self.succ is not None:
            result['succ'] = self.succ
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('requestid') is not None:
            self.requestid = m.get('requestid')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('errmsg') is not None:
            self.errmsg = m.get('errmsg')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('succ') is not None:
            self.succ = m.get('succ')
        return self


class AddItagAntitagUserTntRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tntinstid: str = None,
        accountno: str = None,
        accountsource: str = None,
        role: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 标注平台的租户ID
        self.tntinstid = tntinstid
        # 第三方账号
        self.accountno = accountno
        # 用户来源
        self.accountsource = accountsource
        # 角色，枚举值：ADMIN|SUPER_ADMIN|ADMINISTRATOR|LEADER|OPERATOR, 默认OPERATOR",
        self.role = role

    def validate(self):
        self.validate_required(self.tntinstid, 'tntinstid')
        self.validate_required(self.accountno, 'accountno')
        self.validate_required(self.accountsource, 'accountsource')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tntinstid is not None:
            result['tntinstid'] = self.tntinstid
        if self.accountno is not None:
            result['accountno'] = self.accountno
        if self.accountsource is not None:
            result['accountsource'] = self.accountsource
        if self.role is not None:
            result['role'] = self.role
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tntinstid') is not None:
            self.tntinstid = m.get('tntinstid')
        if m.get('accountno') is not None:
            self.accountno = m.get('accountno')
        if m.get('accountsource') is not None:
            self.accountsource = m.get('accountsource')
        if m.get('role') is not None:
            self.role = m.get('role')
        return self


class AddItagAntitagUserTntResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tntinstid: str = None,
        role: str = None,
        result: User = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # TntInstId
        self.tntinstid = tntinstid
        # 角色，枚举值：ADMIN|SUPER_ADMIN|ADMINISTRATOR|LEADER|OPERATOR, 默认OPERATOR",
        self.role = role
        # 用户信息
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.tntinstid is not None:
            result['tntinstid'] = self.tntinstid
        if self.role is not None:
            result['role'] = self.role
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
        if m.get('tntinstid') is not None:
            self.tntinstid = m.get('tntinstid')
        if m.get('role') is not None:
            self.role = m.get('role')
        if m.get('result') is not None:
            temp_model = User()
            self.result = temp_model.from_map(m['result'])
        return self


class CreateItagAntitagTaskJsonRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        params: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 创建任务参数，格式为JSON
        self.params = params

    def validate(self):
        self.validate_required(self.params, 'params')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.params is not None:
            result['params'] = self.params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('params') is not None:
            self.params = m.get('params')
        return self


class CreateItagAntitagTaskJsonResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        msg: str = None,
        requestid: str = None,
        succ: str = None,
        taskid: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果码
        self.code = code
        # 消息体
        self.msg = msg
        # 请求ID
        self.requestid = requestid
        # 成功标识
        self.succ = succ
        # 任务ID
        self.taskid = taskid

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
        if self.code is not None:
            result['code'] = self.code
        if self.msg is not None:
            result['msg'] = self.msg
        if self.requestid is not None:
            result['requestid'] = self.requestid
        if self.succ is not None:
            result['succ'] = self.succ
        if self.taskid is not None:
            result['taskid'] = self.taskid
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('requestid') is not None:
            self.requestid = m.get('requestid')
        if m.get('succ') is not None:
            self.succ = m.get('succ')
        if m.get('taskid') is not None:
            self.taskid = m.get('taskid')
        return self


