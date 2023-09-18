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


class DeviceRiskReportResultData(TeaModel):
    def __init__(
        self,
        webrtc_url: str = None,
        a_dynamic_swi: str = None,
        dynamic_interval: str = None,
        color: str = None,
        os: str = None,
        dynamic_cmd: str = None,
        time_interval: str = None,
        dynamic_trace: str = None,
        dynamic_num: str = None,
        result_type: str = None,
    ):
        # webrtc_url
        self.webrtc_url = webrtc_url
        # a_dynamic_swi
        self.a_dynamic_swi = a_dynamic_swi
        # dynamic_interval
        self.dynamic_interval = dynamic_interval
        # color
        self.color = color
        # os
        self.os = os
        # dynamic_cmd
        self.dynamic_cmd = dynamic_cmd
        # time_interval
        self.time_interval = time_interval
        # dynamic_trace
        self.dynamic_trace = dynamic_trace
        # dynamic_num
        self.dynamic_num = dynamic_num
        # result_type
        self.result_type = result_type

    def validate(self):
        self.validate_required(self.webrtc_url, 'webrtc_url')
        self.validate_required(self.a_dynamic_swi, 'a_dynamic_swi')
        self.validate_required(self.dynamic_interval, 'dynamic_interval')
        self.validate_required(self.color, 'color')
        self.validate_required(self.os, 'os')
        self.validate_required(self.dynamic_cmd, 'dynamic_cmd')
        self.validate_required(self.time_interval, 'time_interval')
        self.validate_required(self.dynamic_trace, 'dynamic_trace')
        self.validate_required(self.dynamic_num, 'dynamic_num')
        self.validate_required(self.result_type, 'result_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.webrtc_url is not None:
            result['webrtc_url'] = self.webrtc_url
        if self.a_dynamic_swi is not None:
            result['a_dynamic_swi'] = self.a_dynamic_swi
        if self.dynamic_interval is not None:
            result['dynamic_interval'] = self.dynamic_interval
        if self.color is not None:
            result['color'] = self.color
        if self.os is not None:
            result['os'] = self.os
        if self.dynamic_cmd is not None:
            result['dynamic_cmd'] = self.dynamic_cmd
        if self.time_interval is not None:
            result['time_interval'] = self.time_interval
        if self.dynamic_trace is not None:
            result['dynamic_trace'] = self.dynamic_trace
        if self.dynamic_num is not None:
            result['dynamic_num'] = self.dynamic_num
        if self.result_type is not None:
            result['result_type'] = self.result_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('webrtc_url') is not None:
            self.webrtc_url = m.get('webrtc_url')
        if m.get('a_dynamic_swi') is not None:
            self.a_dynamic_swi = m.get('a_dynamic_swi')
        if m.get('dynamic_interval') is not None:
            self.dynamic_interval = m.get('dynamic_interval')
        if m.get('color') is not None:
            self.color = m.get('color')
        if m.get('os') is not None:
            self.os = m.get('os')
        if m.get('dynamic_cmd') is not None:
            self.dynamic_cmd = m.get('dynamic_cmd')
        if m.get('time_interval') is not None:
            self.time_interval = m.get('time_interval')
        if m.get('dynamic_trace') is not None:
            self.dynamic_trace = m.get('dynamic_trace')
        if m.get('dynamic_num') is not None:
            self.dynamic_num = m.get('dynamic_num')
        if m.get('result_type') is not None:
            self.result_type = m.get('result_type')
        return self


class RuntimeProtectConfig(TeaModel):
    def __init__(
        self,
        anti_signature: int = None,
        anti_debug: int = None,
        anti_hook: int = None,
        anti_inject: int = None,
        anti_emulator: int = None,
        anti_root: int = None,
        anti_multi_app: int = None,
    ):
        # 重打包,签名校验,AndroidManifest防篡改,签名文件保护,0为检测到风险退出,1不处理
        self.anti_signature = anti_signature
        # 防调试,0为检测到风险退出,1不处理
        self.anti_debug = anti_debug
        # 防hook,0为检测到风险退出,1不处理
        self.anti_hook = anti_hook
        # 防注入,防内存dump,防内存数据修改,读取,0为检测到风险退出,1不处理
        self.anti_inject = anti_inject
        # 模拟器检查,0为检测到风险退出,1不处理
        self.anti_emulator = anti_emulator
        # 防root,0为检测到风险退出,1不处理
        self.anti_root = anti_root
        # 防多开软件运行,0为检测到风险退出,1不处理
        self.anti_multi_app = anti_multi_app

    def validate(self):
        self.validate_required(self.anti_signature, 'anti_signature')
        self.validate_required(self.anti_debug, 'anti_debug')
        self.validate_required(self.anti_hook, 'anti_hook')
        self.validate_required(self.anti_inject, 'anti_inject')
        self.validate_required(self.anti_emulator, 'anti_emulator')
        self.validate_required(self.anti_root, 'anti_root')
        self.validate_required(self.anti_multi_app, 'anti_multi_app')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.anti_signature is not None:
            result['anti_signature'] = self.anti_signature
        if self.anti_debug is not None:
            result['anti_debug'] = self.anti_debug
        if self.anti_hook is not None:
            result['anti_hook'] = self.anti_hook
        if self.anti_inject is not None:
            result['anti_inject'] = self.anti_inject
        if self.anti_emulator is not None:
            result['anti_emulator'] = self.anti_emulator
        if self.anti_root is not None:
            result['anti_root'] = self.anti_root
        if self.anti_multi_app is not None:
            result['anti_multi_app'] = self.anti_multi_app
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('anti_signature') is not None:
            self.anti_signature = m.get('anti_signature')
        if m.get('anti_debug') is not None:
            self.anti_debug = m.get('anti_debug')
        if m.get('anti_hook') is not None:
            self.anti_hook = m.get('anti_hook')
        if m.get('anti_inject') is not None:
            self.anti_inject = m.get('anti_inject')
        if m.get('anti_emulator') is not None:
            self.anti_emulator = m.get('anti_emulator')
        if m.get('anti_root') is not None:
            self.anti_root = m.get('anti_root')
        if m.get('anti_multi_app') is not None:
            self.anti_multi_app = m.get('anti_multi_app')
        return self


class FaceShieldResult(TeaModel):
    def __init__(
        self,
        apdid_token: str = None,
        risk_level: int = None,
        risk_desc: str = None,
        sug_action: str = None,
    ):
        # 设备token
        # 
        self.apdid_token = apdid_token
        # 风险等级，-1参数异常，0无风险，1-3表示低、中、高
        # 
        self.risk_level = risk_level
        # 风险描述，对风险等级的补充
        # 
        self.risk_desc = risk_desc
        # 处理的建议，如PAAS
        self.sug_action = sug_action

    def validate(self):
        self.validate_required(self.apdid_token, 'apdid_token')
        self.validate_required(self.risk_level, 'risk_level')
        self.validate_required(self.risk_desc, 'risk_desc')
        self.validate_required(self.sug_action, 'sug_action')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.apdid_token is not None:
            result['apdid_token'] = self.apdid_token
        if self.risk_level is not None:
            result['risk_level'] = self.risk_level
        if self.risk_desc is not None:
            result['risk_desc'] = self.risk_desc
        if self.sug_action is not None:
            result['sug_action'] = self.sug_action
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('apdid_token') is not None:
            self.apdid_token = m.get('apdid_token')
        if m.get('risk_level') is not None:
            self.risk_level = m.get('risk_level')
        if m.get('risk_desc') is not None:
            self.risk_desc = m.get('risk_desc')
        if m.get('sug_action') is not None:
            self.sug_action = m.get('sug_action')
        return self


class FileTokenForUpload(TeaModel):
    def __init__(
        self,
        access_id: str = None,
        dir: str = None,
        expire: str = None,
        host: str = None,
        policy: str = None,
        signature: str = None,
    ):
        # ·
        self.access_id = access_id
        # dir
        self.dir = dir
        # expire
        self.expire = expire
        # host
        self.host = host
        # policy
        self.policy = policy
        # signature
        self.signature = signature

    def validate(self):
        self.validate_required(self.access_id, 'access_id')
        self.validate_required(self.dir, 'dir')
        self.validate_required(self.expire, 'expire')
        self.validate_required(self.host, 'host')
        self.validate_required(self.policy, 'policy')
        self.validate_required(self.signature, 'signature')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.access_id is not None:
            result['access_id'] = self.access_id
        if self.dir is not None:
            result['dir'] = self.dir
        if self.expire is not None:
            result['expire'] = self.expire
        if self.host is not None:
            result['host'] = self.host
        if self.policy is not None:
            result['policy'] = self.policy
        if self.signature is not None:
            result['signature'] = self.signature
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('access_id') is not None:
            self.access_id = m.get('access_id')
        if m.get('dir') is not None:
            self.dir = m.get('dir')
        if m.get('expire') is not None:
            self.expire = m.get('expire')
        if m.get('host') is not None:
            self.host = m.get('host')
        if m.get('policy') is not None:
            self.policy = m.get('policy')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        return self


class ExtendData(TeaModel):
    def __init__(
        self,
        user_id: str = None,
        cert_name: str = None,
    ):
        # user_id
        self.user_id = user_id
        # cert_name
        self.cert_name = cert_name

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.cert_name, 'cert_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        return self


class HardeningTaskResponse(TeaModel):
    def __init__(
        self,
        task_id: str = None,
        status: int = None,
        after_md_five: str = None,
        after_size: int = None,
    ):
        # 加固任务的 ID，后续用来轮询调用
        self.task_id = task_id
        # 加固任务的状态
        self.status = status
        # 加固后 APK/ABB 的 MD5
        self.after_md_five = after_md_five
        # 加固后 APK/ABB 的大小
        self.after_size = after_size

    def validate(self):
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.status, 'status')
        self.validate_required(self.after_md_five, 'after_md_five')
        self.validate_required(self.after_size, 'after_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.status is not None:
            result['status'] = self.status
        if self.after_md_five is not None:
            result['after_md_five'] = self.after_md_five
        if self.after_size is not None:
            result['after_size'] = self.after_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('after_md_five') is not None:
            self.after_md_five = m.get('after_md_five')
        if m.get('after_size') is not None:
            self.after_size = m.get('after_size')
        return self


class MarketingRiskData(TeaModel):
    def __init__(
        self,
        risk_level: int = None,
        sug_action: str = None,
        risk_labels: List[str] = None,
    ):
        # risk_level
        self.risk_level = risk_level
        # sug_action
        self.sug_action = sug_action
        # `
        self.risk_labels = risk_labels

    def validate(self):
        self.validate_required(self.risk_level, 'risk_level')
        self.validate_required(self.sug_action, 'sug_action')
        self.validate_required(self.risk_labels, 'risk_labels')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.risk_level is not None:
            result['risk_level'] = self.risk_level
        if self.sug_action is not None:
            result['sug_action'] = self.sug_action
        if self.risk_labels is not None:
            result['risk_labels'] = self.risk_labels
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('risk_level') is not None:
            self.risk_level = m.get('risk_level')
        if m.get('sug_action') is not None:
            self.sug_action = m.get('sug_action')
        if m.get('risk_labels') is not None:
            self.risk_labels = m.get('risk_labels')
        return self


class ZolozAlertTaskBO(TeaModel):
    def __init__(
        self,
        request_id: str = None,
        decision: str = None,
        status: str = None,
        task_id: str = None,
        type: str = None,
        user_id: str = None,
        source: str = None,
        crr_risk_level: str = None,
        create_time: str = None,
        update_time: str = None,
        modifier: str = None,
    ):
        # request_id
        self.request_id = request_id
        # decision
        self.decision = decision
        # status
        self.status = status
        # taskId
        self.task_id = task_id
        # type
        self.type = type
        # userId
        self.user_id = user_id
        # source
        self.source = source
        # crrRiskLevel
        self.crr_risk_level = crr_risk_level
        # createTime
        self.create_time = create_time
        # updateTime
        self.update_time = update_time
        # modifier
        self.modifier = modifier

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.decision, 'decision')
        self.validate_required(self.status, 'status')
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.type, 'type')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.source, 'source')
        self.validate_required(self.crr_risk_level, 'crr_risk_level')
        self.validate_required(self.create_time, 'create_time')
        if self.create_time is not None:
            self.validate_pattern(self.create_time, 'create_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.update_time, 'update_time')
        if self.update_time is not None:
            self.validate_pattern(self.update_time, 'update_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.modifier, 'modifier')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.decision is not None:
            result['decision'] = self.decision
        if self.status is not None:
            result['status'] = self.status
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.type is not None:
            result['type'] = self.type
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.source is not None:
            result['source'] = self.source
        if self.crr_risk_level is not None:
            result['crr_risk_level'] = self.crr_risk_level
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.update_time is not None:
            result['update_time'] = self.update_time
        if self.modifier is not None:
            result['modifier'] = self.modifier
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('crr_risk_level') is not None:
            self.crr_risk_level = m.get('crr_risk_level')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        if m.get('modifier') is not None:
            self.modifier = m.get('modifier')
        return self


class DeviceRiskResp(TeaModel):
    def __init__(
        self,
        apdid: str = None,
        apdid_token: str = None,
        risk_level: int = None,
        risk_desc: str = None,
        sug_action: str = None,
        risk_labels: List[str] = None,
    ):
        # apdid
        self.apdid = apdid
        # apdid
        self.apdid_token = apdid_token
        # riskLevel
        self.risk_level = risk_level
        # risk_desc
        self.risk_desc = risk_desc
        # sug_action
        self.sug_action = sug_action
        # risk_labels
        self.risk_labels = risk_labels

    def validate(self):
        self.validate_required(self.apdid, 'apdid')
        self.validate_required(self.apdid_token, 'apdid_token')
        self.validate_required(self.risk_level, 'risk_level')
        self.validate_required(self.risk_desc, 'risk_desc')
        self.validate_required(self.sug_action, 'sug_action')
        self.validate_required(self.risk_labels, 'risk_labels')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.apdid is not None:
            result['apdid'] = self.apdid
        if self.apdid_token is not None:
            result['apdid_token'] = self.apdid_token
        if self.risk_level is not None:
            result['risk_level'] = self.risk_level
        if self.risk_desc is not None:
            result['risk_desc'] = self.risk_desc
        if self.sug_action is not None:
            result['sug_action'] = self.sug_action
        if self.risk_labels is not None:
            result['risk_labels'] = self.risk_labels
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('apdid') is not None:
            self.apdid = m.get('apdid')
        if m.get('apdid_token') is not None:
            self.apdid_token = m.get('apdid_token')
        if m.get('risk_level') is not None:
            self.risk_level = m.get('risk_level')
        if m.get('risk_desc') is not None:
            self.risk_desc = m.get('risk_desc')
        if m.get('sug_action') is not None:
            self.sug_action = m.get('sug_action')
        if m.get('risk_labels') is not None:
            self.risk_labels = m.get('risk_labels')
        return self


class DeviceRiskReportResult(TeaModel):
    def __init__(
        self,
        success: bool = None,
        result_code: str = None,
        result_status: str = None,
        apdid: str = None,
        token: str = None,
        current_time: str = None,
        version: str = None,
        vkey_switch: str = None,
        bug_track_switch: str = None,
        app_list_ver: str = None,
        dynamic_key: str = None,
        result_data: DeviceRiskReportResultData = None,
    ):
        # success
        self.success = success
        # result_code
        self.result_code = result_code
        # result_status
        self.result_status = result_status
        # apdid
        self.apdid = apdid
        # token
        self.token = token
        # current_time
        self.current_time = current_time
        # version
        self.version = version
        # vkey_switch
        self.vkey_switch = vkey_switch
        # bug_track_switch
        self.bug_track_switch = bug_track_switch
        # app_list_ver
        self.app_list_ver = app_list_ver
        # dynamic_key
        self.dynamic_key = dynamic_key
        # result_data
        self.result_data = result_data

    def validate(self):
        self.validate_required(self.success, 'success')
        self.validate_required(self.result_code, 'result_code')
        self.validate_required(self.result_status, 'result_status')
        self.validate_required(self.apdid, 'apdid')
        self.validate_required(self.token, 'token')
        self.validate_required(self.current_time, 'current_time')
        self.validate_required(self.version, 'version')
        self.validate_required(self.vkey_switch, 'vkey_switch')
        self.validate_required(self.bug_track_switch, 'bug_track_switch')
        self.validate_required(self.app_list_ver, 'app_list_ver')
        self.validate_required(self.dynamic_key, 'dynamic_key')
        self.validate_required(self.result_data, 'result_data')
        if self.result_data:
            self.result_data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_status is not None:
            result['result_status'] = self.result_status
        if self.apdid is not None:
            result['apdid'] = self.apdid
        if self.token is not None:
            result['token'] = self.token
        if self.current_time is not None:
            result['current_time'] = self.current_time
        if self.version is not None:
            result['version'] = self.version
        if self.vkey_switch is not None:
            result['vkey_switch'] = self.vkey_switch
        if self.bug_track_switch is not None:
            result['bug_track_switch'] = self.bug_track_switch
        if self.app_list_ver is not None:
            result['app_list_ver'] = self.app_list_ver
        if self.dynamic_key is not None:
            result['dynamic_key'] = self.dynamic_key
        if self.result_data is not None:
            result['result_data'] = self.result_data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_status') is not None:
            self.result_status = m.get('result_status')
        if m.get('apdid') is not None:
            self.apdid = m.get('apdid')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('current_time') is not None:
            self.current_time = m.get('current_time')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('vkey_switch') is not None:
            self.vkey_switch = m.get('vkey_switch')
        if m.get('bug_track_switch') is not None:
            self.bug_track_switch = m.get('bug_track_switch')
        if m.get('app_list_ver') is not None:
            self.app_list_ver = m.get('app_list_ver')
        if m.get('dynamic_key') is not None:
            self.dynamic_key = m.get('dynamic_key')
        if m.get('result_data') is not None:
            temp_model = DeviceRiskReportResultData()
            self.result_data = temp_model.from_map(m['result_data'])
        return self


class ClassMethodConfig(TeaModel):
    def __init__(
        self,
        class_name: str = None,
        methods: str = None,
    ):
        # 加固类名
        self.class_name = class_name
        # 方法集合，使用英文逗号分隔
        self.methods = methods

    def validate(self):
        self.validate_required(self.class_name, 'class_name')
        self.validate_required(self.methods, 'methods')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.class_name is not None:
            result['class_name'] = self.class_name
        if self.methods is not None:
            result['methods'] = self.methods
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('class_name') is not None:
            self.class_name = m.get('class_name')
        if m.get('methods') is not None:
            self.methods = m.get('methods')
        return self


class HitResults(TeaModel):
    def __init__(
        self,
        result_code: str = None,
        result_status: str = None,
        result_message: str = None,
    ):
        # Reason for the screening decision. See more details in API-specific result codes.
        self.result_code = result_code
        # Result status. Possible values and their meanings are as below:
        # 
        # "S": successful
        # 
        # "F": failed
        # 
        # "U": unknown issue
        self.result_status = result_status
        # Result message.
        # 
        # See more details in API-specific result codes.
        self.result_message = result_message

    def validate(self):
        self.validate_required(self.result_code, 'result_code')
        self.validate_required(self.result_status, 'result_status')
        self.validate_required(self.result_message, 'result_message')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_status is not None:
            result['result_status'] = self.result_status
        if self.result_message is not None:
            result['result_message'] = self.result_message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_status') is not None:
            self.result_status = m.get('result_status')
        if m.get('result_message') is not None:
            self.result_message = m.get('result_message')
        return self


class MarketingRiskSecurityData(TeaModel):
    def __init__(
        self,
        apdid_token: str = None,
        signature: str = None,
        solution_risk_code: str = None,
    ):
        # apdid_token
        self.apdid_token = apdid_token
        # signature
        self.signature = signature
        # solution_risk_code
        self.solution_risk_code = solution_risk_code

    def validate(self):
        self.validate_required(self.apdid_token, 'apdid_token')
        self.validate_required(self.signature, 'signature')
        self.validate_required(self.solution_risk_code, 'solution_risk_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.apdid_token is not None:
            result['apdid_token'] = self.apdid_token
        if self.signature is not None:
            result['signature'] = self.signature
        if self.solution_risk_code is not None:
            result['solution_risk_code'] = self.solution_risk_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('apdid_token') is not None:
            self.apdid_token = m.get('apdid_token')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        if m.get('solution_risk_code') is not None:
            self.solution_risk_code = m.get('solution_risk_code')
        return self


class CreateBlueshieldSecuritypictureRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        client_name: str = None,
        os_type: str = None,
        package_name: str = None,
        cert_sign: str = None,
        app_key_data: str = None,
        security_data: str = None,
        extra_data: str = None,
        white_box_data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用名
        # 
        self.app_name = app_name
        # 客户名
        # 
        self.client_name = client_name
        # 操作系统
        # 
        self.os_type = os_type
        # 包名
        # 
        self.package_name = package_name
        # 签名信息
        # 
        self.cert_sign = cert_sign
        # 签名秘钥内容
        # 
        self.app_key_data = app_key_data
        # 加密秘钥内容
        # 
        self.security_data = security_data
        # 自定义秘钥内容
        # 
        self.extra_data = extra_data
        # 白盒秘钥内容
        # 
        self.white_box_data = white_box_data

    def validate(self):
        self.validate_required(self.client_name, 'client_name')
        self.validate_required(self.os_type, 'os_type')
        self.validate_required(self.package_name, 'package_name')

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
        if self.client_name is not None:
            result['client_name'] = self.client_name
        if self.os_type is not None:
            result['os_type'] = self.os_type
        if self.package_name is not None:
            result['package_name'] = self.package_name
        if self.cert_sign is not None:
            result['cert_sign'] = self.cert_sign
        if self.app_key_data is not None:
            result['app_key_data'] = self.app_key_data
        if self.security_data is not None:
            result['security_data'] = self.security_data
        if self.extra_data is not None:
            result['extra_data'] = self.extra_data
        if self.white_box_data is not None:
            result['white_box_data'] = self.white_box_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('client_name') is not None:
            self.client_name = m.get('client_name')
        if m.get('os_type') is not None:
            self.os_type = m.get('os_type')
        if m.get('package_name') is not None:
            self.package_name = m.get('package_name')
        if m.get('cert_sign') is not None:
            self.cert_sign = m.get('cert_sign')
        if m.get('app_key_data') is not None:
            self.app_key_data = m.get('app_key_data')
        if m.get('security_data') is not None:
            self.security_data = m.get('security_data')
        if m.get('extra_data') is not None:
            self.extra_data = m.get('extra_data')
        if m.get('white_box_data') is not None:
            self.white_box_data = m.get('white_box_data')
        return self


class CreateBlueshieldSecuritypictureResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        file_name: str = None,
        body_base_64: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 执行是否成功
        # 
        self.success = success
        # 生成的图片文件名
        # 
        self.file_name = file_name
        # body base 64
        # 
        self.body_base_64 = body_base_64

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
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.body_base_64 is not None:
            result['body_base64'] = self.body_base_64
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
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('body_base64') is not None:
            self.body_base_64 = m.get('body_base64')
        return self


class QueryFaceshieldNativeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        client_id: str = None,
        apdid_token: str = None,
        aop_data: str = None,
        signature: str = None,
        sign_factor: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户id，标识客户来源
        # 
        self.client_id = client_id
        # 设备token
        # 
        self.apdid_token = apdid_token
        # 切面数据（JSON，详见下方）
        self.aop_data = aop_data
        # 签名信息	否（和切面二选一即可）
        # 
        self.signature = signature
        # 签名因子（和切面二选一即可）
        # 
        self.sign_factor = sign_factor

    def validate(self):
        self.validate_required(self.client_id, 'client_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.client_id is not None:
            result['client_id'] = self.client_id
        if self.apdid_token is not None:
            result['apdid_token'] = self.apdid_token
        if self.aop_data is not None:
            result['aop_data'] = self.aop_data
        if self.signature is not None:
            result['signature'] = self.signature
        if self.sign_factor is not None:
            result['sign_factor'] = self.sign_factor
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('client_id') is not None:
            self.client_id = m.get('client_id')
        if m.get('apdid_token') is not None:
            self.apdid_token = m.get('apdid_token')
        if m.get('aop_data') is not None:
            self.aop_data = m.get('aop_data')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        if m.get('sign_factor') is not None:
            self.sign_factor = m.get('sign_factor')
        return self


class QueryFaceshieldNativeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        code: int = None,
        message: str = None,
        request_id: str = None,
        data: FaceShieldResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # true成功，false失败
        # 
        self.success = success
        # 请求码，200成功，其他失败，具体见错误码
        # 
        self.code = code
        # 错误时的返回信息
        # 
        self.message = message
        # 请求时传入的，若没有传，则系统自动生成
        # 
        self.request_id = request_id
        # apdidToken String 设备token riskLevel String 风险等级，-1参数异常，0无风险，1-3表示低、中、高 riskDesc String 风险描述，对风险等级的补充 sugAction String 处理的建议，如PAAS
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
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.request_id is not None:
            result['request_id'] = self.request_id
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
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('data') is not None:
            temp_model = FaceShieldResult()
            self.data = temp_model.from_map(m['data'])
        return self


class SubmitAshieldHardeningtaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_url: str = None,
        so_protect: str = None,
        so_protect_config: str = None,
        assets_protect: str = None,
        assets_protect_confing: str = None,
        runtime_protect_config: RuntimeProtectConfig = None,
        enable_life_func: str = None,
        javatoc_jni_config: List[ClassMethodConfig] = None,
        ext_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # APK,ABB 上传后的地址
        self.file_url = file_url
        # 开启so加固
        self.so_protect = so_protect
        # 开启so加固后,设置的so加固配置文件,默认对apk中libs目录下所有so进行加固,以逗号分隔
        self.so_protect_config = so_protect_config
        # 开启对assets下的资源文件进行加固
        self.assets_protect = assets_protect
        # 开启assets加固后,指定要对apk中assets目录下的哪些文件做加固,默认对assets下所有的文件进行保护,以逗号分隔
        self.assets_protect_confing = assets_protect_confing
        # 开启运行时保护,需要填写的参数,具体参数见下方,json格式
        self.runtime_protect_config = runtime_protect_config
        # 对生命周期函数进行java2jni保护
        self.enable_life_func = enable_life_func
        # java2jni配置文件
        self.javatoc_jni_config = javatoc_jni_config
        # 扩展信息,json字符串,暂不使用
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.file_url, 'file_url')
        if self.runtime_protect_config:
            self.runtime_protect_config.validate()
        if self.javatoc_jni_config:
            for k in self.javatoc_jni_config:
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
        if self.file_url is not None:
            result['file_url'] = self.file_url
        if self.so_protect is not None:
            result['so_protect'] = self.so_protect
        if self.so_protect_config is not None:
            result['so_protect_config'] = self.so_protect_config
        if self.assets_protect is not None:
            result['assets_protect'] = self.assets_protect
        if self.assets_protect_confing is not None:
            result['assets_protect_confing'] = self.assets_protect_confing
        if self.runtime_protect_config is not None:
            result['runtime_protect_config'] = self.runtime_protect_config.to_map()
        if self.enable_life_func is not None:
            result['enable_life_func'] = self.enable_life_func
        result['javatoc_jni_config'] = []
        if self.javatoc_jni_config is not None:
            for k in self.javatoc_jni_config:
                result['javatoc_jni_config'].append(k.to_map() if k else None)
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        if m.get('so_protect') is not None:
            self.so_protect = m.get('so_protect')
        if m.get('so_protect_config') is not None:
            self.so_protect_config = m.get('so_protect_config')
        if m.get('assets_protect') is not None:
            self.assets_protect = m.get('assets_protect')
        if m.get('assets_protect_confing') is not None:
            self.assets_protect_confing = m.get('assets_protect_confing')
        if m.get('runtime_protect_config') is not None:
            temp_model = RuntimeProtectConfig()
            self.runtime_protect_config = temp_model.from_map(m['runtime_protect_config'])
        if m.get('enable_life_func') is not None:
            self.enable_life_func = m.get('enable_life_func')
        self.javatoc_jni_config = []
        if m.get('javatoc_jni_config') is not None:
            for k in m.get('javatoc_jni_config'):
                temp_model = ClassMethodConfig()
                self.javatoc_jni_config.append(temp_model.from_map(k))
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class SubmitAshieldHardeningtaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        request_id: str = None,
        res_success: bool = None,
        res_code: str = None,
        res_message: str = None,
        res_data: HardeningTaskResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求id
        self.request_id = request_id
        # 查询是否成功
        self.res_success = res_success
        # SUCCESS为成功,其他为失败
        self.res_code = res_code
        # 返回信息描述
        self.res_message = res_message
        # 返回的具体对象
        self.res_data = res_data

    def validate(self):
        if self.res_data:
            self.res_data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.res_success is not None:
            result['res_success'] = self.res_success
        if self.res_code is not None:
            result['res_code'] = self.res_code
        if self.res_message is not None:
            result['res_message'] = self.res_message
        if self.res_data is not None:
            result['res_data'] = self.res_data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('res_success') is not None:
            self.res_success = m.get('res_success')
        if m.get('res_code') is not None:
            self.res_code = m.get('res_code')
        if m.get('res_message') is not None:
            self.res_message = m.get('res_message')
        if m.get('res_data') is not None:
            temp_model = HardeningTaskResponse()
            self.res_data = temp_model.from_map(m['res_data'])
        return self


class QueryDeviceriskFingerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        apdid_token: str = None,
        client_id: str = None,
        terminal_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # apdid_token
        self.apdid_token = apdid_token
        # client_id
        self.client_id = client_id
        # terminal_type
        self.terminal_type = terminal_type

    def validate(self):
        self.validate_required(self.apdid_token, 'apdid_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.apdid_token is not None:
            result['apdid_token'] = self.apdid_token
        if self.client_id is not None:
            result['client_id'] = self.client_id
        if self.terminal_type is not None:
            result['terminal_type'] = self.terminal_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('apdid_token') is not None:
            self.apdid_token = m.get('apdid_token')
        if m.get('client_id') is not None:
            self.client_id = m.get('client_id')
        if m.get('terminal_type') is not None:
            self.terminal_type = m.get('terminal_type')
        return self


class QueryDeviceriskFingerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: int = None,
        message: str = None,
        request_id: str = None,
        success: bool = None,
        data: DeviceRiskResp = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # code
        self.code = code
        # message
        self.message = message
        # request_id
        self.request_id = request_id
        # success
        self.success = success
        # data
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
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.request_id is not None:
            result['request_id'] = self.request_id
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
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('data') is not None:
            temp_model = DeviceRiskResp()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryDeviceriskDeviceriskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        apdid_token: str = None,
        client_id: str = None,
        app_id: str = None,
        env_id: str = None,
        tenant_id: str = None,
        merchant_id: str = None,
        app_name: str = None,
        terminal_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # apdid_token
        self.apdid_token = apdid_token
        # client_id
        self.client_id = client_id
        # app_id
        self.app_id = app_id
        # env_id
        self.env_id = env_id
        # tenant_id
        self.tenant_id = tenant_id
        # merchant_id
        self.merchant_id = merchant_id
        # app_name
        self.app_name = app_name
        # terminal_type
        self.terminal_type = terminal_type

    def validate(self):
        self.validate_required(self.apdid_token, 'apdid_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.apdid_token is not None:
            result['apdid_token'] = self.apdid_token
        if self.client_id is not None:
            result['client_id'] = self.client_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.terminal_type is not None:
            result['terminal_type'] = self.terminal_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('apdid_token') is not None:
            self.apdid_token = m.get('apdid_token')
        if m.get('client_id') is not None:
            self.client_id = m.get('client_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('terminal_type') is not None:
            self.terminal_type = m.get('terminal_type')
        return self


class QueryDeviceriskDeviceriskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: int = None,
        message: str = None,
        request_id: str = None,
        success: bool = None,
        data: DeviceRiskResp = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # code
        self.code = code
        # message
        self.message = message
        # request_id
        self.request_id = request_id
        # success
        self.success = success
        # data
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
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.request_id is not None:
            result['request_id'] = self.request_id
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
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('data') is not None:
            temp_model = DeviceRiskResp()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryFaceshieldWebRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        client_id: str = None,
        apdid_token: str = None,
        aop_data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户id，标识客户来源
        # 
        self.client_id = client_id
        # apdid_token
        self.apdid_token = apdid_token
        # aop_data
        self.aop_data = aop_data

    def validate(self):
        self.validate_required(self.client_id, 'client_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.client_id is not None:
            result['client_id'] = self.client_id
        if self.apdid_token is not None:
            result['apdid_token'] = self.apdid_token
        if self.aop_data is not None:
            result['aop_data'] = self.aop_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('client_id') is not None:
            self.client_id = m.get('client_id')
        if m.get('apdid_token') is not None:
            self.apdid_token = m.get('apdid_token')
        if m.get('aop_data') is not None:
            self.aop_data = m.get('aop_data')
        return self


class QueryFaceshieldWebResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        code: int = None,
        message: str = None,
        request_id: str = None,
        data: FaceShieldResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # success
        self.success = success
        # 请求码，200成功，其他失败，具体见错误码
        # 
        self.code = code
        # 错误时的返回信息
        # 
        self.message = message
        # 请求时传入的，若没有传，则系统自动生成
        # 
        self.request_id = request_id
        # data
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
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.request_id is not None:
            result['request_id'] = self.request_id
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
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('data') is not None:
            temp_model = FaceShieldResult()
            self.data = temp_model.from_map(m['data'])
        return self


class SubmitDeviceriskReportRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request_data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # request_data
        self.request_data = request_data

    def validate(self):
        self.validate_required(self.request_data, 'request_data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.request_data is not None:
            result['request_data'] = self.request_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request_data') is not None:
            self.request_data = m.get('request_data')
        return self


class SubmitDeviceriskReportResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        apdid: str = None,
        token: str = None,
        current_time: str = None,
        version: str = None,
        vkey_switch: str = None,
        bug_track_switch: str = None,
        app_list_ver: str = None,
        dynamic_key: str = None,
        result_data: DeviceRiskReportResultData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # success
        self.success = success
        # apdid
        self.apdid = apdid
        # token
        self.token = token
        # current_time
        self.current_time = current_time
        # version
        self.version = version
        # vkey_switch
        self.vkey_switch = vkey_switch
        # bug_track_switch
        self.bug_track_switch = bug_track_switch
        # app_list_ver
        self.app_list_ver = app_list_ver
        # dynamic_key
        self.dynamic_key = dynamic_key
        # result_data
        self.result_data = result_data

    def validate(self):
        if self.result_data:
            self.result_data.validate()

    def to_map(self):
        _map = super().to_map()
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
        if self.apdid is not None:
            result['apdid'] = self.apdid
        if self.token is not None:
            result['token'] = self.token
        if self.current_time is not None:
            result['current_time'] = self.current_time
        if self.version is not None:
            result['version'] = self.version
        if self.vkey_switch is not None:
            result['vkey_switch'] = self.vkey_switch
        if self.bug_track_switch is not None:
            result['bug_track_switch'] = self.bug_track_switch
        if self.app_list_ver is not None:
            result['app_list_ver'] = self.app_list_ver
        if self.dynamic_key is not None:
            result['dynamic_key'] = self.dynamic_key
        if self.result_data is not None:
            result['result_data'] = self.result_data.to_map()
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
        if m.get('apdid') is not None:
            self.apdid = m.get('apdid')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('current_time') is not None:
            self.current_time = m.get('current_time')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('vkey_switch') is not None:
            self.vkey_switch = m.get('vkey_switch')
        if m.get('bug_track_switch') is not None:
            self.bug_track_switch = m.get('bug_track_switch')
        if m.get('app_list_ver') is not None:
            self.app_list_ver = m.get('app_list_ver')
        if m.get('dynamic_key') is not None:
            self.dynamic_key = m.get('dynamic_key')
        if m.get('result_data') is not None:
            temp_model = DeviceRiskReportResultData()
            self.result_data = temp_model.from_map(m['result_data'])
        return self


class QueryEaglepromoMarketingriskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        security_data: MarketingRiskSecurityData = None,
        sign_factor: str = None,
        client_id: str = None,
        request_id: str = None,
        biz_code: str = None,
        terminal_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # security_data
        self.security_data = security_data
        # sign_factor
        self.sign_factor = sign_factor
        # client_id
        self.client_id = client_id
        # request_id
        self.request_id = request_id
        # biz_code
        self.biz_code = biz_code
        # terminal_type
        self.terminal_type = terminal_type

    def validate(self):
        self.validate_required(self.security_data, 'security_data')
        if self.security_data:
            self.security_data.validate()
        self.validate_required(self.sign_factor, 'sign_factor')
        self.validate_required(self.client_id, 'client_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.security_data is not None:
            result['security_data'] = self.security_data.to_map()
        if self.sign_factor is not None:
            result['sign_factor'] = self.sign_factor
        if self.client_id is not None:
            result['client_id'] = self.client_id
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.terminal_type is not None:
            result['terminal_type'] = self.terminal_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('security_data') is not None:
            temp_model = MarketingRiskSecurityData()
            self.security_data = temp_model.from_map(m['security_data'])
        if m.get('sign_factor') is not None:
            self.sign_factor = m.get('sign_factor')
        if m.get('client_id') is not None:
            self.client_id = m.get('client_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('terminal_type') is not None:
            self.terminal_type = m.get('terminal_type')
        return self


class QueryEaglepromoMarketingriskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        message: str = None,
        code: int = None,
        data: MarketingRiskData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # success
        self.success = success
        # message
        self.message = message
        # code
        self.code = code
        # data
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
        if self.message is not None:
            result['message'] = self.message
        if self.code is not None:
            result['code'] = self.code
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
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('data') is not None:
            temp_model = MarketingRiskData()
            self.data = temp_model.from_map(m['data'])
        return self


class SubmitAmlcloudAnalyzeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_code: str = None,
        tenant_id: str = None,
        tnt_inst_id: str = None,
        extend_data: ExtendData = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # biz_code
        self.biz_code = biz_code
        # tenant_id
        self.tenant_id = tenant_id
        # tnt_inst_id
        self.tnt_inst_id = tnt_inst_id
        # extendData
        self.extend_data = extend_data

    def validate(self):
        self.validate_required(self.biz_code, 'biz_code')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.tnt_inst_id, 'tnt_inst_id')
        self.validate_required(self.extend_data, 'extend_data')
        if self.extend_data:
            self.extend_data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.tnt_inst_id is not None:
            result['tnt_inst_id'] = self.tnt_inst_id
        if self.extend_data is not None:
            result['extend_data'] = self.extend_data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('tnt_inst_id') is not None:
            self.tnt_inst_id = m.get('tnt_inst_id')
        if m.get('extend_data') is not None:
            temp_model = ExtendData()
            self.extend_data = temp_model.from_map(m['extend_data'])
        return self


class SubmitAmlcloudAnalyzeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        request_id: str = None,
        decision: str = None,
        hit_results: HitResults = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # Unique business ID for tracing purposes
        self.request_id = request_id
        # Screening decisions:
        # 
        # ACCEPT: Did not hit any watchlist
        # 
        # REJECT: Hit some watchlists
        # 
        # REVIEW: Potentially hit some watchlists
        self.decision = decision
        # Hit details
        self.hit_results = hit_results

    def validate(self):
        if self.hit_results:
            self.hit_results.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.decision is not None:
            result['decision'] = self.decision
        if self.hit_results is not None:
            result['hit_results'] = self.hit_results.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        if m.get('hit_results') is not None:
            temp_model = HitResults()
            self.hit_results = temp_model.from_map(m['hit_results'])
        return self


class QueryAmlcloudAnalyzeRequest(TeaModel):
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


class QueryAmlcloudAnalyzeResponse(TeaModel):
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


class QueryAmlcloudCheckcaseresultRequest(TeaModel):
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


class QueryAmlcloudCheckcaseresultResponse(TeaModel):
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


class SubmitAmlcloudCheckcaseresultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request_id: str = None,
        tenant_id: str = None,
        source: str = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求ID，业务的唯一标识，用于追踪业务。
        self.request_id = request_id
        # 客户的租户ID
        self.tenant_id = tenant_id
        # 任务来源。取值如下：
        # ● REALTIME：来源于扫描信息接口。
        # ● BATCH：来源于数据仓库。
        # ● ALL：包含以上所有的任务来源
        self.source = source
        # 任务类型。取值如下：
        # ● PEP：政治高风险人物。
        # ● SANCTION：制裁名单。
        # ● NEGATIVE_NEWS：负面新闻。
        # ● INTERNAL_LIST：自定义名单。
        # ● EDD：加强尽职调查。
        # ● ALL：包含以上所有的任务类型。
        self.type = type

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.source, 'source')
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
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.source is not None:
            result['source'] = self.source
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class SubmitAmlcloudCheckcaseresultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        case_details: List[ZolozAlertTaskBO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务结果详情
        self.case_details = case_details

    def validate(self):
        if self.case_details:
            for k in self.case_details:
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
        result['case_details'] = []
        if self.case_details is not None:
            for k in self.case_details:
                result['case_details'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.case_details = []
        if m.get('case_details') is not None:
            for k in m.get('case_details'):
                temp_model = ZolozAlertTaskBO()
                self.case_details.append(temp_model.from_map(k))
        return self


class QueryAmlclouduatAnalyzeRequest(TeaModel):
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


class QueryAmlclouduatAnalyzeResponse(TeaModel):
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


class QueryAmlclouduatCheckcaseresultRequest(TeaModel):
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


class QueryAmlclouduatCheckcaseresultResponse(TeaModel):
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


class GetAshieldFiletokenRequest(TeaModel):
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


class GetAshieldFiletokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        request_id: str = None,
        res_success: bool = None,
        res_code: str = None,
        res_message: str = None,
        res_data: FileTokenForUpload = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # ·
        self.request_id = request_id
        # res_success
        self.res_success = res_success
        # res_code
        self.res_code = res_code
        # res_message
        self.res_message = res_message
        # ·
        self.res_data = res_data

    def validate(self):
        if self.res_data:
            self.res_data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.res_success is not None:
            result['res_success'] = self.res_success
        if self.res_code is not None:
            result['res_code'] = self.res_code
        if self.res_message is not None:
            result['res_message'] = self.res_message
        if self.res_data is not None:
            result['res_data'] = self.res_data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('res_success') is not None:
            self.res_success = m.get('res_success')
        if m.get('res_code') is not None:
            self.res_code = m.get('res_code')
        if m.get('res_message') is not None:
            self.res_message = m.get('res_message')
        if m.get('res_data') is not None:
            temp_model = FileTokenForUpload()
            self.res_data = temp_model.from_map(m['res_data'])
        return self


class GetAshieldHardeningtaskprocessRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 加固任务 ID
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


class GetAshieldHardeningtaskprocessResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        request_id: str = None,
        res_success: bool = None,
        res_code: str = None,
        res_message: str = None,
        res_data: HardeningTaskResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求id
        self.request_id = request_id
        # 查询是否成功
        self.res_success = res_success
        # SUCCESS为成功，其他为失败
        self.res_code = res_code
        # 返回信息描述
        self.res_message = res_message
        # 返回的具体对象
        self.res_data = res_data

    def validate(self):
        if self.res_data:
            self.res_data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.res_success is not None:
            result['res_success'] = self.res_success
        if self.res_code is not None:
            result['res_code'] = self.res_code
        if self.res_message is not None:
            result['res_message'] = self.res_message
        if self.res_data is not None:
            result['res_data'] = self.res_data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('res_success') is not None:
            self.res_success = m.get('res_success')
        if m.get('res_code') is not None:
            self.res_code = m.get('res_code')
        if m.get('res_message') is not None:
            self.res_message = m.get('res_message')
        if m.get('res_data') is not None:
            temp_model = HardeningTaskResponse()
            self.res_data = temp_model.from_map(m['res_data'])
        return self


class GetAshieldHardeningresultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 加固任务 ID
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


class GetAshieldHardeningresultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        request_id: str = None,
        res_success: bool = None,
        res_code: str = None,
        res_message: str = None,
        res_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求id
        self.request_id = request_id
        # 查询是否成功
        self.res_success = res_success
        # SUCCESS为成功，其他为失败
        self.res_code = res_code
        # 返回信息描述
        self.res_message = res_message
        # 返回的下载链接
        self.res_data = res_data

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
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.res_success is not None:
            result['res_success'] = self.res_success
        if self.res_code is not None:
            result['res_code'] = self.res_code
        if self.res_message is not None:
            result['res_message'] = self.res_message
        if self.res_data is not None:
            result['res_data'] = self.res_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('res_success') is not None:
            self.res_success = m.get('res_success')
        if m.get('res_code') is not None:
            self.res_code = m.get('res_code')
        if m.get('res_message') is not None:
            self.res_message = m.get('res_message')
        if m.get('res_data') is not None:
            self.res_data = m.get('res_data')
        return self


class GetAshieldHardeninglogRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 加固任务 ID
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


class GetAshieldHardeninglogResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        request_id: str = None,
        res_success: bool = None,
        res_code: str = None,
        res_message: str = None,
        res_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求id
        self.request_id = request_id
        # 查询是否成功
        self.res_success = res_success
        # SUCCESS为成功，其他为失败
        self.res_code = res_code
        # 返回信息描述
        self.res_message = res_message
        # 返回的下载链接
        self.res_data = res_data

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
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.res_success is not None:
            result['res_success'] = self.res_success
        if self.res_code is not None:
            result['res_code'] = self.res_code
        if self.res_message is not None:
            result['res_message'] = self.res_message
        if self.res_data is not None:
            result['res_data'] = self.res_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('res_success') is not None:
            self.res_success = m.get('res_success')
        if m.get('res_code') is not None:
            self.res_code = m.get('res_code')
        if m.get('res_message') is not None:
            self.res_message = m.get('res_message')
        if m.get('res_data') is not None:
            self.res_data = m.get('res_data')
        return self


class QueryDeviceriskRisklabelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        apdid_token: str = None,
        client_id: str = None,
        terminal_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # apdid_token
        self.apdid_token = apdid_token
        # client_id
        self.client_id = client_id
        # terminal_type
        self.terminal_type = terminal_type

    def validate(self):
        self.validate_required(self.apdid_token, 'apdid_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.apdid_token is not None:
            result['apdid_token'] = self.apdid_token
        if self.client_id is not None:
            result['client_id'] = self.client_id
        if self.terminal_type is not None:
            result['terminal_type'] = self.terminal_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('apdid_token') is not None:
            self.apdid_token = m.get('apdid_token')
        if m.get('client_id') is not None:
            self.client_id = m.get('client_id')
        if m.get('terminal_type') is not None:
            self.terminal_type = m.get('terminal_type')
        return self


class QueryDeviceriskRisklabelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: int = None,
        message: str = None,
        request_id: str = None,
        success: bool = None,
        data: DeviceRiskResp = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # code
        self.code = code
        # message
        self.message = message
        # request_id
        self.request_id = request_id
        # success
        self.success = success
        # data
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
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.request_id is not None:
            result['request_id'] = self.request_id
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
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('data') is not None:
            temp_model = DeviceRiskResp()
            self.data = temp_model.from_map(m['data'])
        return self


class SubmitAshieldPeriodhardeningtaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_url: str = None,
        so_protect: str = None,
        so_protect_config: str = None,
        assets_protect: str = None,
        assets_protect_confing: str = None,
        runtime_protect_config: RuntimeProtectConfig = None,
        enable_life_func: str = None,
        javatoc_jni_config: List[ClassMethodConfig] = None,
        ext_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # APK,ABB 上传后的地址
        self.file_url = file_url
        # 开启so加固
        self.so_protect = so_protect
        # 开启so加固后,设置的so加固配置文件,默认对apk中libs目录下所有so进行加固,以逗号分隔
        self.so_protect_config = so_protect_config
        # 开启对assets下的资源文件进行加固
        self.assets_protect = assets_protect
        # 开启assets加固后,指定要对apk中assets目录下的哪些文件做加固,默认对assets下所有的文件进行保护,以逗号分隔
        self.assets_protect_confing = assets_protect_confing
        # 开启运行时保护,需要填写的参数,具体参数见下方,json格式
        self.runtime_protect_config = runtime_protect_config
        # 对生命周期函数进行java2jni保护
        self.enable_life_func = enable_life_func
        # java2jni配置文件
        self.javatoc_jni_config = javatoc_jni_config
        # 扩展信息,json字符串,暂不使用
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.file_url, 'file_url')
        if self.runtime_protect_config:
            self.runtime_protect_config.validate()
        if self.javatoc_jni_config:
            for k in self.javatoc_jni_config:
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
        if self.file_url is not None:
            result['file_url'] = self.file_url
        if self.so_protect is not None:
            result['so_protect'] = self.so_protect
        if self.so_protect_config is not None:
            result['so_protect_config'] = self.so_protect_config
        if self.assets_protect is not None:
            result['assets_protect'] = self.assets_protect
        if self.assets_protect_confing is not None:
            result['assets_protect_confing'] = self.assets_protect_confing
        if self.runtime_protect_config is not None:
            result['runtime_protect_config'] = self.runtime_protect_config.to_map()
        if self.enable_life_func is not None:
            result['enable_life_func'] = self.enable_life_func
        result['javatoc_jni_config'] = []
        if self.javatoc_jni_config is not None:
            for k in self.javatoc_jni_config:
                result['javatoc_jni_config'].append(k.to_map() if k else None)
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        if m.get('so_protect') is not None:
            self.so_protect = m.get('so_protect')
        if m.get('so_protect_config') is not None:
            self.so_protect_config = m.get('so_protect_config')
        if m.get('assets_protect') is not None:
            self.assets_protect = m.get('assets_protect')
        if m.get('assets_protect_confing') is not None:
            self.assets_protect_confing = m.get('assets_protect_confing')
        if m.get('runtime_protect_config') is not None:
            temp_model = RuntimeProtectConfig()
            self.runtime_protect_config = temp_model.from_map(m['runtime_protect_config'])
        if m.get('enable_life_func') is not None:
            self.enable_life_func = m.get('enable_life_func')
        self.javatoc_jni_config = []
        if m.get('javatoc_jni_config') is not None:
            for k in m.get('javatoc_jni_config'):
                temp_model = ClassMethodConfig()
                self.javatoc_jni_config.append(temp_model.from_map(k))
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class SubmitAshieldPeriodhardeningtaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        request_id: str = None,
        res_success: bool = None,
        res_code: str = None,
        res_message: str = None,
        res_data: HardeningTaskResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求id
        self.request_id = request_id
        # 查询是否成功
        self.res_success = res_success
        # SUCCESS为成功,其他为失败
        self.res_code = res_code
        # 返回信息描述
        self.res_message = res_message
        # 返回的具体对象
        self.res_data = res_data

    def validate(self):
        if self.res_data:
            self.res_data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.res_success is not None:
            result['res_success'] = self.res_success
        if self.res_code is not None:
            result['res_code'] = self.res_code
        if self.res_message is not None:
            result['res_message'] = self.res_message
        if self.res_data is not None:
            result['res_data'] = self.res_data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('res_success') is not None:
            self.res_success = m.get('res_success')
        if m.get('res_code') is not None:
            self.res_code = m.get('res_code')
        if m.get('res_message') is not None:
            self.res_message = m.get('res_message')
        if m.get('res_data') is not None:
            temp_model = HardeningTaskResponse()
            self.res_data = temp_model.from_map(m['res_data'])
        return self


