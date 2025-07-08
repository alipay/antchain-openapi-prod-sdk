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


class RiskData(TeaModel):
    def __init__(
        self,
        result_key: str = None,
        result_value: str = None,
    ):
        # 模型/标签编号
        self.result_key = result_key
        # 模型分/标签值
        self.result_value = result_value

    def validate(self):
        self.validate_required(self.result_key, 'result_key')
        self.validate_required(self.result_value, 'result_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.result_key is not None:
            result['result_key'] = self.result_key
        if self.result_value is not None:
            result['result_value'] = self.result_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('result_key') is not None:
            self.result_key = m.get('result_key')
        if m.get('result_value') is not None:
            self.result_value = m.get('result_value')
        return self


class ResponseHead(TeaModel):
    def __init__(
        self,
        request_id: str = None,
    ):
        # 请求唯一标识
        self.request_id = request_id

    def validate(self):
        self.validate_required(self.request_id, 'request_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class SpuPictureInfo(TeaModel):
    def __init__(
        self,
        main_pic: str = None,
        detail_pic: List[str] = None,
    ):
        # spu主图url
        self.main_pic = main_pic
        # spu详情图片url
        self.detail_pic = detail_pic

    def validate(self):
        self.validate_required(self.main_pic, 'main_pic')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.main_pic is not None:
            result['main_pic'] = self.main_pic
        if self.detail_pic is not None:
            result['detail_pic'] = self.detail_pic
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('main_pic') is not None:
            self.main_pic = m.get('main_pic')
        if m.get('detail_pic') is not None:
            self.detail_pic = m.get('detail_pic')
        return self


class BizParam(TeaModel):
    def __init__(
        self,
        param_key: str = None,
        param_value: str = None,
    ):
        # 参数类型枚举，mobile、cert、biz_license
        self.param_key = param_key
        # 值，如加密后的手机号
        self.param_value = param_value

    def validate(self):
        self.validate_required(self.param_key, 'param_key')
        self.validate_required(self.param_value, 'param_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.param_key is not None:
            result['param_key'] = self.param_key
        if self.param_value is not None:
            result['param_value'] = self.param_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('param_key') is not None:
            self.param_key = m.get('param_key')
        if m.get('param_value') is not None:
            self.param_value = m.get('param_value')
        return self


class CctSubCheckLabel(TeaModel):
    def __init__(
        self,
        sub_label: str = None,
        rate: int = None,
    ):
        # sub_label
        self.sub_label = sub_label
        # rate
        self.rate = rate

    def validate(self):
        self.validate_required(self.sub_label, 'sub_label')
        self.validate_required(self.rate, 'rate')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sub_label is not None:
            result['sub_label'] = self.sub_label
        if self.rate is not None:
            result['rate'] = self.rate
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sub_label') is not None:
            self.sub_label = m.get('sub_label')
        if m.get('rate') is not None:
            self.rate = m.get('rate')
        return self


class RiskModel(TeaModel):
    def __init__(
        self,
        model_name: str = None,
        model_value: str = None,
        model_comment: str = None,
    ):
        # 标签名称
        self.model_name = model_name
        # 风险值
        self.model_value = model_value
        # 风险标签描述
        self.model_comment = model_comment

    def validate(self):
        self.validate_required(self.model_name, 'model_name')
        self.validate_required(self.model_value, 'model_value')
        self.validate_required(self.model_comment, 'model_comment')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.model_name is not None:
            result['model_name'] = self.model_name
        if self.model_value is not None:
            result['model_value'] = self.model_value
        if self.model_comment is not None:
            result['model_comment'] = self.model_comment
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('model_name') is not None:
            self.model_name = m.get('model_name')
        if m.get('model_value') is not None:
            self.model_value = m.get('model_value')
        if m.get('model_comment') is not None:
            self.model_comment = m.get('model_comment')
        return self


class RiskResult(TeaModel):
    def __init__(
        self,
        risk_data: List[RiskData] = None,
        solution_code: str = None,
    ):
        # 数据列表
        self.risk_data = risk_data
        # 解决方案编码
        self.solution_code = solution_code

    def validate(self):
        self.validate_required(self.risk_data, 'risk_data')
        if self.risk_data:
            for k in self.risk_data:
                if k:
                    k.validate()
        self.validate_required(self.solution_code, 'solution_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['risk_data'] = []
        if self.risk_data is not None:
            for k in self.risk_data:
                result['risk_data'].append(k.to_map() if k else None)
        if self.solution_code is not None:
            result['solution_code'] = self.solution_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.risk_data = []
        if m.get('risk_data') is not None:
            for k in m.get('risk_data'):
                temp_model = RiskData()
                self.risk_data.append(temp_model.from_map(k))
        if m.get('solution_code') is not None:
            self.solution_code = m.get('solution_code')
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
        self.apdid_token = apdid_token
        # 风险等级，-1参数异常，0无风险，1-3表示低、中、高
        self.risk_level = risk_level
        # 风险描述，对风险等级的补充
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


class SimSalesInfo(TeaModel):
    def __init__(
        self,
        sales_id: str = None,
    ):
        # 销售对外业务id
        self.sales_id = sales_id

    def validate(self):
        self.validate_required(self.sales_id, 'sales_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sales_id is not None:
            result['sales_id'] = self.sales_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sales_id') is not None:
            self.sales_id = m.get('sales_id')
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
        # .
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


class FaceVerifyResultData(TeaModel):
    def __init__(
        self,
        request_id: str = None,
        passed: str = None,
        material_info: str = None,
    ):
        # 请求唯一标识Id
        self.request_id = request_id
        # 认证是否通过
        self.passed = passed
        # faceOcclusion:面部遮挡信息；true为有面部遮挡，false为无面部遮挡
        self.material_info = material_info

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.passed, 'passed')
        self.validate_required(self.material_info, 'material_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.passed is not None:
            result['passed'] = self.passed
        if self.material_info is not None:
            result['material_info'] = self.material_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        if m.get('material_info') is not None:
            self.material_info = m.get('material_info')
        return self


class IdentityData(TeaModel):
    def __init__(
        self,
        is_risk: str = None,
        risk_type: str = None,
        ext_info: str = None,
    ):
        # 风险等级，枚举值： 0：低风险（打扰率＞10%） 1：中风险（5%＜打扰率≤10%） 2：高风险（打扰率≤5%）
        self.is_risk = is_risk
        # 风险类型，枚举值及对应含义： ● PS：图片被PS篡改 ● SCREEN_PHOTO：屏幕翻拍 ● SCREENSHOT：截屏图片 ● COLOR_PRINT：彩打复印 ● WATERMARK：水印 ● FACE_SIMILAR：人脸相似 ● BACKGROUND_SIMILAR：背景相似 ● SIGNATURE_SIMILAR：证件手写签名相似 格式：以英文逗号分隔，如样例
        self.risk_type = risk_type
        # 附加字段,json格式字符串
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.is_risk, 'is_risk')
        self.validate_required(self.risk_type, 'risk_type')
        self.validate_required(self.ext_info, 'ext_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.is_risk is not None:
            result['is_risk'] = self.is_risk
        if self.risk_type is not None:
            result['risk_type'] = self.risk_type
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('is_risk') is not None:
            self.is_risk = m.get('is_risk')
        if m.get('risk_type') is not None:
            self.risk_type = m.get('risk_type')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
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


class EtcVehicleInfo(TeaModel):
    def __init__(
        self,
        vehicle_id: str = None,
        order_id: str = None,
        biz_agreement_no: str = None,
        order_status: str = None,
        device_no: str = None,
        deduct_sign_status: str = None,
        first_actived_time: str = None,
        service_exp: str = None,
        device_status: str = None,
        device_status_detail: str = None,
        device_biz_time: str = None,
    ):
        # 车辆id
        self.vehicle_id = vehicle_id
        # etc申请单号
        self.order_id = order_id
        # etc平台扣款协议号
        self.biz_agreement_no = biz_agreement_no
        # etc申请单状态
        # ORDER_CREATE:订单创建;ORDER_SYNCED:订单已同步;SUCCESS_ACTIVATE:订单已激活;UNMOUNTING:注销中;UNMOUNTED:已注销;
        self.order_status = order_status
        # 用户ETC设备OBU号，当order_status为SUCCESS_ACTIVATE及以后状态时，必选
        self.device_no = device_no
        # 代扣签约状态，当传入waybill_no且匹配到对应运单时，deduct_sign_status必选
        # 待签约: WAIT_SIGN
        # 已签约: SIGNED
        # 已解约: UNSIGN
        self.deduct_sign_status = deduct_sign_status
        # 设备首次激活时间
        self.first_actived_time = first_actived_time
        # 合约到期时间
        self.service_exp = service_exp
        # etc设备状态，USABLE-设备激活可用（可上高速正常使用）PENDING-设备激活挂起（限制消费） UNUSABLE-设备异常不可用
        self.device_status = device_status
        # 设备状态明细，能清楚说明etc设备此时状态（/卡签注销/卡签挂失/已过户/维修中/黑名单/卡过期/欠费/标签脱落/设备报警/正常/ETC停用等）
        self.device_status_detail = device_status_detail
        # 设备状态触发的具体时间
        self.device_biz_time = device_biz_time

    def validate(self):
        self.validate_required(self.vehicle_id, 'vehicle_id')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.biz_agreement_no, 'biz_agreement_no')
        self.validate_required(self.order_status, 'order_status')
        if self.first_actived_time is not None:
            self.validate_pattern(self.first_actived_time, 'first_actived_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.service_exp is not None:
            self.validate_pattern(self.service_exp, 'service_exp', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.device_biz_time is not None:
            self.validate_pattern(self.device_biz_time, 'device_biz_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.vehicle_id is not None:
            result['vehicle_id'] = self.vehicle_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.biz_agreement_no is not None:
            result['biz_agreement_no'] = self.biz_agreement_no
        if self.order_status is not None:
            result['order_status'] = self.order_status
        if self.device_no is not None:
            result['device_no'] = self.device_no
        if self.deduct_sign_status is not None:
            result['deduct_sign_status'] = self.deduct_sign_status
        if self.first_actived_time is not None:
            result['first_actived_time'] = self.first_actived_time
        if self.service_exp is not None:
            result['service_exp'] = self.service_exp
        if self.device_status is not None:
            result['device_status'] = self.device_status
        if self.device_status_detail is not None:
            result['device_status_detail'] = self.device_status_detail
        if self.device_biz_time is not None:
            result['device_biz_time'] = self.device_biz_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('vehicle_id') is not None:
            self.vehicle_id = m.get('vehicle_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('biz_agreement_no') is not None:
            self.biz_agreement_no = m.get('biz_agreement_no')
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        if m.get('device_no') is not None:
            self.device_no = m.get('device_no')
        if m.get('deduct_sign_status') is not None:
            self.deduct_sign_status = m.get('deduct_sign_status')
        if m.get('first_actived_time') is not None:
            self.first_actived_time = m.get('first_actived_time')
        if m.get('service_exp') is not None:
            self.service_exp = m.get('service_exp')
        if m.get('device_status') is not None:
            self.device_status = m.get('device_status')
        if m.get('device_status_detail') is not None:
            self.device_status_detail = m.get('device_status_detail')
        if m.get('device_biz_time') is not None:
            self.device_biz_time = m.get('device_biz_time')
        return self


class IifaaEkytResponse(TeaModel):
    def __init__(
        self,
        head: ResponseHead = None,
        biz_res: str = None,
    ):
        # 响应头
        self.head = head
        # 业务响应结果
        self.biz_res = biz_res

    def validate(self):
        self.validate_required(self.head, 'head')
        if self.head:
            self.head.validate()
        self.validate_required(self.biz_res, 'biz_res')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.head is not None:
            result['head'] = self.head.to_map()
        if self.biz_res is not None:
            result['biz_res'] = self.biz_res
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('head') is not None:
            temp_model = ResponseHead()
            self.head = temp_model.from_map(m['head'])
        if m.get('biz_res') is not None:
            self.biz_res = m.get('biz_res')
        return self


class BizQueryParam(TeaModel):
    def __init__(
        self,
        biz_params: List[BizParam] = None,
    ):
        # 参数列表，数组
        self.biz_params = biz_params

    def validate(self):
        self.validate_required(self.biz_params, 'biz_params')
        if self.biz_params:
            for k in self.biz_params:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['biz_params'] = []
        if self.biz_params is not None:
            for k in self.biz_params:
                result['biz_params'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.biz_params = []
        if m.get('biz_params') is not None:
            for k in m.get('biz_params'):
                temp_model = BizParam()
                self.biz_params.append(temp_model.from_map(k))
        return self


class TrustSignInitData(TeaModel):
    def __init__(
        self,
        request_id: str = None,
        sign_unique_id: str = None,
    ):
        # 请求唯一标识Id
        self.request_id = request_id
        # 签约秘钥
        self.sign_unique_id = sign_unique_id

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.sign_unique_id, 'sign_unique_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.sign_unique_id is not None:
            result['sign_unique_id'] = self.sign_unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('sign_unique_id') is not None:
            self.sign_unique_id = m.get('sign_unique_id')
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


class SimOrderInfo(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        sales_id: str = None,
        sn: str = None,
        mobile_no: str = None,
        order_time: str = None,
        payment_type: str = None,
        payment_time: str = None,
        total_amount: str = None,
        status: str = None,
        sku_name: str = None,
        vehicle_model: str = None,
        color: str = None,
        accessories: str = None,
        images: str = None,
        extra_info: str = None,
    ):
        # 订单ID
        self.order_id = order_id
        # 必填	销售id
        self.sales_id = sales_id
        # 车辆SN号
        self.sn = sn
        # 用户手机号
        self.mobile_no = mobile_no
        # 订单时间，格式yyyy-MM-dd HH:mm:ss
        self.order_time = order_time
        # 支付类型，枚举值FULL（全额付款）, INSTALLMENT（分期付款）
        self.payment_type = payment_type
        # 支付时间，格式yyyy-MM-dd HH:mm:ss
        self.payment_time = payment_time
        # 总金额，单位元
        self.total_amount = total_amount
        # 订单状态，枚举值
        # UNPAID（未支付），
        # PAID（已支付），
        # CANCEL（订单取消），
        # PENDING（支付中），
        # FAILED（支付失败）
        self.status = status
        # 车辆SKU名字
        self.sku_name = sku_name
        # 车型
        self.vehicle_model = vehicle_model
        # 颜色
        self.color = color
        # 配件信息，逗号分隔
        self.accessories = accessories
        # 图片json
        self.images = images
        # 拓展字段，json格式
        self.extra_info = extra_info

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.sales_id, 'sales_id')
        self.validate_required(self.order_time, 'order_time')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.sales_id is not None:
            result['sales_id'] = self.sales_id
        if self.sn is not None:
            result['sn'] = self.sn
        if self.mobile_no is not None:
            result['mobile_no'] = self.mobile_no
        if self.order_time is not None:
            result['order_time'] = self.order_time
        if self.payment_type is not None:
            result['payment_type'] = self.payment_type
        if self.payment_time is not None:
            result['payment_time'] = self.payment_time
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.status is not None:
            result['status'] = self.status
        if self.sku_name is not None:
            result['sku_name'] = self.sku_name
        if self.vehicle_model is not None:
            result['vehicle_model'] = self.vehicle_model
        if self.color is not None:
            result['color'] = self.color
        if self.accessories is not None:
            result['accessories'] = self.accessories
        if self.images is not None:
            result['images'] = self.images
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('sales_id') is not None:
            self.sales_id = m.get('sales_id')
        if m.get('sn') is not None:
            self.sn = m.get('sn')
        if m.get('mobile_no') is not None:
            self.mobile_no = m.get('mobile_no')
        if m.get('order_time') is not None:
            self.order_time = m.get('order_time')
        if m.get('payment_type') is not None:
            self.payment_type = m.get('payment_type')
        if m.get('payment_time') is not None:
            self.payment_time = m.get('payment_time')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('sku_name') is not None:
            self.sku_name = m.get('sku_name')
        if m.get('vehicle_model') is not None:
            self.vehicle_model = m.get('vehicle_model')
        if m.get('color') is not None:
            self.color = m.get('color')
        if m.get('accessories') is not None:
            self.accessories = m.get('accessories')
        if m.get('images') is not None:
            self.images = m.get('images')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        return self


class SimSkuInfo(TeaModel):
    def __init__(
        self,
        sku_id: str = None,
        sku_name: str = None,
        price: str = None,
        store_price: str = None,
        vehicle_model: str = None,
        range_km: str = None,
        keywords: str = None,
        colors: str = None,
        accessories: str = None,
        images: str = None,
        store_id: str = None,
        sku_description: str = None,
    ):
        # sku对外id
        self.sku_id = sku_id
        # sku名称
        self.sku_name = sku_name
        # sku官方指导价：单位为元
        self.price = price
        # sku门店优惠价：单位为元
        self.store_price = store_price
        # 车型
        self.vehicle_model = vehicle_model
        # 续航里程
        self.range_km = range_km
        # 关键词，逗号分隔
        self.keywords = keywords
        # 颜色，逗号分隔
        self.colors = colors
        # 配件信息，逗号分隔
        self.accessories = accessories
        # 图片url json
        self.images = images
        # 门店id
        self.store_id = store_id
        # 车型描述
        self.sku_description = sku_description

    def validate(self):
        self.validate_required(self.sku_id, 'sku_id')
        self.validate_required(self.sku_name, 'sku_name')
        self.validate_required(self.price, 'price')
        self.validate_required(self.store_price, 'store_price')
        self.validate_required(self.vehicle_model, 'vehicle_model')
        self.validate_required(self.range_km, 'range_km')
        self.validate_required(self.keywords, 'keywords')
        self.validate_required(self.colors, 'colors')
        self.validate_required(self.accessories, 'accessories')
        self.validate_required(self.images, 'images')
        self.validate_required(self.store_id, 'store_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        if self.sku_name is not None:
            result['sku_name'] = self.sku_name
        if self.price is not None:
            result['price'] = self.price
        if self.store_price is not None:
            result['store_price'] = self.store_price
        if self.vehicle_model is not None:
            result['vehicle_model'] = self.vehicle_model
        if self.range_km is not None:
            result['range_km'] = self.range_km
        if self.keywords is not None:
            result['keywords'] = self.keywords
        if self.colors is not None:
            result['colors'] = self.colors
        if self.accessories is not None:
            result['accessories'] = self.accessories
        if self.images is not None:
            result['images'] = self.images
        if self.store_id is not None:
            result['store_id'] = self.store_id
        if self.sku_description is not None:
            result['sku_description'] = self.sku_description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sku_id') is not None:
            self.sku_id = m.get('sku_id')
        if m.get('sku_name') is not None:
            self.sku_name = m.get('sku_name')
        if m.get('price') is not None:
            self.price = m.get('price')
        if m.get('store_price') is not None:
            self.store_price = m.get('store_price')
        if m.get('vehicle_model') is not None:
            self.vehicle_model = m.get('vehicle_model')
        if m.get('range_km') is not None:
            self.range_km = m.get('range_km')
        if m.get('keywords') is not None:
            self.keywords = m.get('keywords')
        if m.get('colors') is not None:
            self.colors = m.get('colors')
        if m.get('accessories') is not None:
            self.accessories = m.get('accessories')
        if m.get('images') is not None:
            self.images = m.get('images')
        if m.get('store_id') is not None:
            self.store_id = m.get('store_id')
        if m.get('sku_description') is not None:
            self.sku_description = m.get('sku_description')
        return self


class TrustSignQueryData(TeaModel):
    def __init__(
        self,
        request_id: str = None,
        order_status: str = None,
        solution_code: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        file_list: List[str] = None,
    ):
        # 请求唯一标识Id
        self.request_id = request_id
        # 订单状态
        self.order_status = order_status
        # 签约方案码
        self.solution_code = solution_code
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified
        # 签约文件列表
        self.file_list = file_list

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.order_status, 'order_status')
        self.validate_required(self.solution_code, 'solution_code')
        self.validate_required(self.gmt_create, 'gmt_create')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        self.validate_required(self.file_list, 'file_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.order_status is not None:
            result['order_status'] = self.order_status
        if self.solution_code is not None:
            result['solution_code'] = self.solution_code
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.file_list is not None:
            result['file_list'] = self.file_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        if m.get('solution_code') is not None:
            self.solution_code = m.get('solution_code')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('file_list') is not None:
            self.file_list = m.get('file_list')
        return self


class RequestHead(TeaModel):
    def __init__(
        self,
        request_id: str = None,
        secret_id: str = None,
        product_code: str = None,
        format_type: str = None,
        online_flag: bool = None,
    ):
        # 请求唯一标识
        self.request_id = request_id
        # 客户身份标识ID
        self.secret_id = secret_id
        # 客户签约产品code
        self.product_code = product_code
        # response输出类型，默认json
        self.format_type = format_type
        # false
        self.online_flag = online_flag

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.secret_id, 'secret_id')
        self.validate_required(self.product_code, 'product_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.secret_id is not None:
            result['secret_id'] = self.secret_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.format_type is not None:
            result['format_type'] = self.format_type
        if self.online_flag is not None:
            result['online_flag'] = self.online_flag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('secret_id') is not None:
            self.secret_id = m.get('secret_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('format_type') is not None:
            self.format_type = m.get('format_type')
        if m.get('online_flag') is not None:
            self.online_flag = m.get('online_flag')
        return self


class DcpInfo(TeaModel):
    def __init__(
        self,
        dcp_tenant_id: str = None,
        dcp_name: str = None,
    ):
        # 企业入驻租户ID
        self.dcp_tenant_id = dcp_tenant_id
        # 企业名称
        self.dcp_name = dcp_name

    def validate(self):
        self.validate_required(self.dcp_tenant_id, 'dcp_tenant_id')
        self.validate_required(self.dcp_name, 'dcp_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.dcp_tenant_id is not None:
            result['dcp_tenant_id'] = self.dcp_tenant_id
        if self.dcp_name is not None:
            result['dcp_name'] = self.dcp_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('dcp_tenant_id') is not None:
            self.dcp_tenant_id = m.get('dcp_tenant_id')
        if m.get('dcp_name') is not None:
            self.dcp_name = m.get('dcp_name')
        return self


class InsureInfo(TeaModel):
    def __init__(
        self,
        modify_time: str = None,
        product_code: str = None,
        insure_product: str = None,
        insure_price: str = None,
        insure_type: str = None,
        pay_type: str = None,
        insure_period: str = None,
        policy_status: str = None,
        operate_type: str = None,
        insure_comp_credit_no: str = None,
    ):
        # 保单时间
        self.modify_time = modify_time
        # 蚂蚁L5产品code
        self.product_code = product_code
        # 保险产品code
        self.insure_product = insure_product
        # 保险产品价格
        self.insure_price = insure_price
        # 保险品种
        self.insure_type = insure_type
        # 付款方式
        self.pay_type = pay_type
        # 保险期数
        self.insure_period = insure_period
        # 保单状态
        self.policy_status = policy_status
        # 操作类型
        self.operate_type = operate_type
        # 保司信用代码
        self.insure_comp_credit_no = insure_comp_credit_no

    def validate(self):
        self.validate_required(self.modify_time, 'modify_time')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.insure_product, 'insure_product')
        self.validate_required(self.insure_price, 'insure_price')
        self.validate_required(self.insure_type, 'insure_type')
        self.validate_required(self.pay_type, 'pay_type')
        self.validate_required(self.insure_period, 'insure_period')
        self.validate_required(self.policy_status, 'policy_status')
        self.validate_required(self.operate_type, 'operate_type')
        self.validate_required(self.insure_comp_credit_no, 'insure_comp_credit_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.modify_time is not None:
            result['modify_time'] = self.modify_time
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.insure_product is not None:
            result['insure_product'] = self.insure_product
        if self.insure_price is not None:
            result['insure_price'] = self.insure_price
        if self.insure_type is not None:
            result['insure_type'] = self.insure_type
        if self.pay_type is not None:
            result['pay_type'] = self.pay_type
        if self.insure_period is not None:
            result['insure_period'] = self.insure_period
        if self.policy_status is not None:
            result['policy_status'] = self.policy_status
        if self.operate_type is not None:
            result['operate_type'] = self.operate_type
        if self.insure_comp_credit_no is not None:
            result['insure_comp_credit_no'] = self.insure_comp_credit_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('modify_time') is not None:
            self.modify_time = m.get('modify_time')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('insure_product') is not None:
            self.insure_product = m.get('insure_product')
        if m.get('insure_price') is not None:
            self.insure_price = m.get('insure_price')
        if m.get('insure_type') is not None:
            self.insure_type = m.get('insure_type')
        if m.get('pay_type') is not None:
            self.pay_type = m.get('pay_type')
        if m.get('insure_period') is not None:
            self.insure_period = m.get('insure_period')
        if m.get('policy_status') is not None:
            self.policy_status = m.get('policy_status')
        if m.get('operate_type') is not None:
            self.operate_type = m.get('operate_type')
        if m.get('insure_comp_credit_no') is not None:
            self.insure_comp_credit_no = m.get('insure_comp_credit_no')
        return self


class RiskQueryData(TeaModel):
    def __init__(
        self,
        risk_score: str = None,
        risk_labels: List[str] = None,
    ):
        # 风险评分
        self.risk_score = risk_score
        # 风险标签
        self.risk_labels = risk_labels

    def validate(self):
        self.validate_required(self.risk_score, 'risk_score')
        self.validate_required(self.risk_labels, 'risk_labels')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.risk_score is not None:
            result['risk_score'] = self.risk_score
        if self.risk_labels is not None:
            result['risk_labels'] = self.risk_labels
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('risk_score') is not None:
            self.risk_score = m.get('risk_score')
        if m.get('risk_labels') is not None:
            self.risk_labels = m.get('risk_labels')
        return self


class SimSpuInfo(TeaModel):
    def __init__(
        self,
        spu_id: str = None,
        spu_name: str = None,
        spu_picture_info: SpuPictureInfo = None,
    ):
        # SPU ID
        self.spu_id = spu_id
        # spu名称
        self.spu_name = spu_name
        # spu图片信息
        self.spu_picture_info = spu_picture_info

    def validate(self):
        self.validate_required(self.spu_id, 'spu_id')
        self.validate_required(self.spu_name, 'spu_name')
        self.validate_required(self.spu_picture_info, 'spu_picture_info')
        if self.spu_picture_info:
            self.spu_picture_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.spu_id is not None:
            result['spu_id'] = self.spu_id
        if self.spu_name is not None:
            result['spu_name'] = self.spu_name
        if self.spu_picture_info is not None:
            result['spu_picture_info'] = self.spu_picture_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('spu_id') is not None:
            self.spu_id = m.get('spu_id')
        if m.get('spu_name') is not None:
            self.spu_name = m.get('spu_name')
        if m.get('spu_picture_info') is not None:
            temp_model = SpuPictureInfo()
            self.spu_picture_info = temp_model.from_map(m['spu_picture_info'])
        return self


class KeyValueMap(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: str = None,
    ):
        # key-value中的key
        self.key = key
        # key-value中的value
        self.value = value

    def validate(self):
        if self.key is not None:
            self.validate_max_length(self.key, 'key', 100)
        if self.value is not None:
            self.validate_max_length(self.value, 'value', 1000)

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


class FaceVerifyInitData(TeaModel):
    def __init__(
        self,
        request_id: str = None,
        certify_id: str = None,
        certify_url: str = None,
    ):
        # 请求唯一标识Id
        self.request_id = request_id
        # 可信实人认证的唯一标识
        self.certify_id = certify_id
        # 认证流程入口 URL
        self.certify_url = certify_url

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.certify_id, 'certify_id')
        self.validate_required(self.certify_url, 'certify_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        if self.certify_url is not None:
            result['certify_url'] = self.certify_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('certify_url') is not None:
            self.certify_url = m.get('certify_url')
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
        # apdid_token
        self.apdid_token = apdid_token
        # risk_level
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


class Paginator(TeaModel):
    def __init__(
        self,
        page: int = None,
        items_per_page: int = None,
        items: int = None,
    ):
        # 当前页
        self.page = page
        # 单页项数
        self.items_per_page = items_per_page
        # 总项数
        self.items = items

    def validate(self):
        self.validate_required(self.page, 'page')
        self.validate_required(self.items_per_page, 'items_per_page')
        self.validate_required(self.items, 'items')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page is not None:
            result['page'] = self.page
        if self.items_per_page is not None:
            result['items_per_page'] = self.items_per_page
        if self.items is not None:
            result['items'] = self.items
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('items_per_page') is not None:
            self.items_per_page = m.get('items_per_page')
        if m.get('items') is not None:
            self.items = m.get('items')
        return self


class CctDataMap(TeaModel):
    def __init__(
        self,
        text: List[str] = None,
        picture: List[str] = None,
    ):
        # text
        self.text = text
        # PICTURE
        self.picture = picture

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.text is not None:
            result['text'] = self.text
        if self.picture is not None:
            result['picture'] = self.picture
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('text') is not None:
            self.text = m.get('text')
        if m.get('picture') is not None:
            self.picture = m.get('picture')
        return self


class SimStoreInfo(TeaModel):
    def __init__(
        self,
        store_id: str = None,
        store_name: str = None,
        is_sign: bool = None,
        sign_url: str = None,
    ):
        # 门店对外业务id
        self.store_id = store_id
        # 门店名称
        self.store_name = store_name
        # 是否签约 true已签约/false未签约
        self.is_sign = is_sign
        # 支付宝H5签约链接 未签约时非空
        self.sign_url = sign_url

    def validate(self):
        self.validate_required(self.store_id, 'store_id')
        self.validate_required(self.store_name, 'store_name')
        self.validate_required(self.is_sign, 'is_sign')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.store_id is not None:
            result['store_id'] = self.store_id
        if self.store_name is not None:
            result['store_name'] = self.store_name
        if self.is_sign is not None:
            result['is_sign'] = self.is_sign
        if self.sign_url is not None:
            result['sign_url'] = self.sign_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('store_id') is not None:
            self.store_id = m.get('store_id')
        if m.get('store_name') is not None:
            self.store_name = m.get('store_name')
        if m.get('is_sign') is not None:
            self.is_sign = m.get('is_sign')
        if m.get('sign_url') is not None:
            self.sign_url = m.get('sign_url')
        return self


class SignInfo(TeaModel):
    def __init__(
        self,
        employee_cert_no: str = None,
        employee_card_no: str = None,
        account_book_id: str = None,
        status: str = None,
        sign_time: str = None,
        terminate_time: str = None,
        effect_time: str = None,
        expire_time: str = None,
        payment_amount: str = None,
    ):
        # 司机证件号
        self.employee_cert_no = employee_cert_no
        # 灵工卡号
        self.employee_card_no = employee_card_no
        # 借贷专户ID，用于后续资金相关操作
        self.account_book_id = account_book_id
        # 签约状态，枚举值
        # ● SIGNED：已签约【灵工卡状态正常，可入金出金】
        # ● TERMINATED：已解约【不可入金出金】
        self.status = status
        # 签约时间 "yyyy-MM-dd HH:mm:ss"
        self.sign_time = sign_time
        # 解约时间 "yyyy-MM-dd HH:mm:ss"
        self.terminate_time = terminate_time
        # 签约协议生效时间
        self.effect_time = effect_time
        # 签约协议解约时间
        self.expire_time = expire_time
        # 月租金额：单位为元
        self.payment_amount = payment_amount

    def validate(self):
        self.validate_required(self.employee_cert_no, 'employee_cert_no')
        self.validate_required(self.employee_card_no, 'employee_card_no')
        self.validate_required(self.account_book_id, 'account_book_id')
        self.validate_required(self.status, 'status')
        self.validate_required(self.effect_time, 'effect_time')
        self.validate_required(self.expire_time, 'expire_time')
        self.validate_required(self.payment_amount, 'payment_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.employee_cert_no is not None:
            result['employee_cert_no'] = self.employee_cert_no
        if self.employee_card_no is not None:
            result['employee_card_no'] = self.employee_card_no
        if self.account_book_id is not None:
            result['account_book_id'] = self.account_book_id
        if self.status is not None:
            result['status'] = self.status
        if self.sign_time is not None:
            result['sign_time'] = self.sign_time
        if self.terminate_time is not None:
            result['terminate_time'] = self.terminate_time
        if self.effect_time is not None:
            result['effect_time'] = self.effect_time
        if self.expire_time is not None:
            result['expire_time'] = self.expire_time
        if self.payment_amount is not None:
            result['payment_amount'] = self.payment_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('employee_cert_no') is not None:
            self.employee_cert_no = m.get('employee_cert_no')
        if m.get('employee_card_no') is not None:
            self.employee_card_no = m.get('employee_card_no')
        if m.get('account_book_id') is not None:
            self.account_book_id = m.get('account_book_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('sign_time') is not None:
            self.sign_time = m.get('sign_time')
        if m.get('terminate_time') is not None:
            self.terminate_time = m.get('terminate_time')
        if m.get('effect_time') is not None:
            self.effect_time = m.get('effect_time')
        if m.get('expire_time') is not None:
            self.expire_time = m.get('expire_time')
        if m.get('payment_amount') is not None:
            self.payment_amount = m.get('payment_amount')
        return self


class RiskAssessResult(TeaModel):
    def __init__(
        self,
        risk_value: str = None,
        risk_score: str = None,
        model_infos: RiskModel = None,
    ):
        # 风险评估结果
        self.risk_value = risk_value
        # 风险评估分数
        self.risk_score = risk_score
        # 风险评估标签
        self.model_infos = model_infos

    def validate(self):
        self.validate_required(self.risk_value, 'risk_value')
        self.validate_required(self.risk_score, 'risk_score')
        self.validate_required(self.model_infos, 'model_infos')
        if self.model_infos:
            self.model_infos.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.risk_value is not None:
            result['risk_value'] = self.risk_value
        if self.risk_score is not None:
            result['risk_score'] = self.risk_score
        if self.model_infos is not None:
            result['model_infos'] = self.model_infos.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('risk_value') is not None:
            self.risk_value = m.get('risk_value')
        if m.get('risk_score') is not None:
            self.risk_score = m.get('risk_score')
        if m.get('model_infos') is not None:
            temp_model = RiskModel()
            self.model_infos = temp_model.from_map(m['model_infos'])
        return self


class CctDetectCheckLabel(TeaModel):
    def __init__(
        self,
        label: str = None,
        rate: int = None,
        sub_labels: List[CctSubCheckLabel] = None,
        details: str = None,
    ):
        # label
        self.label = label
        # rate
        self.rate = rate
        # subLabels
        self.sub_labels = sub_labels
        # details
        self.details = details

    def validate(self):
        self.validate_required(self.label, 'label')
        self.validate_required(self.rate, 'rate')
        self.validate_required(self.sub_labels, 'sub_labels')
        if self.sub_labels:
            for k in self.sub_labels:
                if k:
                    k.validate()
        self.validate_required(self.details, 'details')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.label is not None:
            result['label'] = self.label
        if self.rate is not None:
            result['rate'] = self.rate
        result['sub_labels'] = []
        if self.sub_labels is not None:
            for k in self.sub_labels:
                result['sub_labels'].append(k.to_map() if k else None)
        if self.details is not None:
            result['details'] = self.details
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('label') is not None:
            self.label = m.get('label')
        if m.get('rate') is not None:
            self.rate = m.get('rate')
        self.sub_labels = []
        if m.get('sub_labels') is not None:
            for k in m.get('sub_labels'):
                temp_model = CctSubCheckLabel()
                self.sub_labels.append(temp_model.from_map(k))
        if m.get('details') is not None:
            self.details = m.get('details')
        return self


class RiskAssessData(TeaModel):
    def __init__(
        self,
        head: ResponseHead = None,
        risk_result: str = None,
    ):
        # 响应头
        self.head = head
        # 风险评估结果
        self.risk_result = risk_result

    def validate(self):
        self.validate_required(self.head, 'head')
        if self.head:
            self.head.validate()
        self.validate_required(self.risk_result, 'risk_result')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.head is not None:
            result['head'] = self.head.to_map()
        if self.risk_result is not None:
            result['risk_result'] = self.risk_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('head') is not None:
            temp_model = ResponseHead()
            self.head = temp_model.from_map(m['head'])
        if m.get('risk_result') is not None:
            self.risk_result = m.get('risk_result')
        return self


class ResultList(TeaModel):
    def __init__(
        self,
        risk_results: List[RiskResult] = None,
        biz_params: List[BizParam] = None,
    ):
        # 结果列表
        self.risk_results = risk_results
        # 入参列表，数组
        self.biz_params = biz_params

    def validate(self):
        self.validate_required(self.risk_results, 'risk_results')
        if self.risk_results:
            for k in self.risk_results:
                if k:
                    k.validate()
        self.validate_required(self.biz_params, 'biz_params')
        if self.biz_params:
            for k in self.biz_params:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['risk_results'] = []
        if self.risk_results is not None:
            for k in self.risk_results:
                result['risk_results'].append(k.to_map() if k else None)
        result['biz_params'] = []
        if self.biz_params is not None:
            for k in self.biz_params:
                result['biz_params'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.risk_results = []
        if m.get('risk_results') is not None:
            for k in m.get('risk_results'):
                temp_model = RiskResult()
                self.risk_results.append(temp_model.from_map(k))
        self.biz_params = []
        if m.get('biz_params') is not None:
            for k in m.get('biz_params'):
                temp_model = BizParam()
                self.biz_params.append(temp_model.from_map(k))
        return self


class EtcTripInfo(TeaModel):
    def __init__(
        self,
        out_order_id: str = None,
        trip_start_time: str = None,
        trip_end_time: str = None,
        start_station_name: str = None,
        end_station_name: str = None,
        sub_type: str = None,
        sub_scene: str = None,
        total_amount: str = None,
        trip_id: str = None,
        trade_no: str = None,
    ):
        # 发行方扣款订单号
        self.out_order_id = out_order_id
        # 行程开始时间
        self.trip_start_time = trip_start_time
        # 行程结束时间
        self.trip_end_time = trip_end_time
        # 1、收费站入口名称 2、格式为省份+收费站名，比如“黑龙江瓦盆窑西站”
        self.start_station_name = start_station_name
        # 1、收费站出口名称 2、格式为省份+收费站名，比如“黑龙江瓦盆窑西站”
        self.end_station_name = end_station_name
        # HIGHWAY_TYPE：高速交易场景类型，对应具体交易场景[ETC_HIGHWAY,ETC_HIGHWAY_OPEN] EXPAND_TYPE：拓展消费交易类型，对应具体交易场景 [ETC_PARKING,ETC_GAS,ETC_SERVICE_AREA,ETC_MUNICIPAL_SERVICE]
        self.sub_type = sub_type
        # ETC_HIGHWAY：ETC封闭式高速公路； ETC_HIGHWAY_OPEN：ETC开放式高速公路； ETC_PARKING：ETC停车场； ETC_GAS：ETC加油站； ETC_SERVICE_AREA：ETC服务区； ETC_MUNICIPAL_SERVICE：ETC市政服务
        self.sub_scene = sub_scene
        # 商户扣费的总金额：单位为元，精确到小数点后两位
        self.total_amount = total_amount
        # 行程id
        self.trip_id = trip_id
        # 交易单号
        self.trade_no = trade_no

    def validate(self):
        if self.trip_start_time is not None:
            self.validate_pattern(self.trip_start_time, 'trip_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.trip_end_time is not None:
            self.validate_pattern(self.trip_end_time, 'trip_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.out_order_id is not None:
            result['out_order_id'] = self.out_order_id
        if self.trip_start_time is not None:
            result['trip_start_time'] = self.trip_start_time
        if self.trip_end_time is not None:
            result['trip_end_time'] = self.trip_end_time
        if self.start_station_name is not None:
            result['start_station_name'] = self.start_station_name
        if self.end_station_name is not None:
            result['end_station_name'] = self.end_station_name
        if self.sub_type is not None:
            result['sub_type'] = self.sub_type
        if self.sub_scene is not None:
            result['sub_scene'] = self.sub_scene
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.trip_id is not None:
            result['trip_id'] = self.trip_id
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('out_order_id') is not None:
            self.out_order_id = m.get('out_order_id')
        if m.get('trip_start_time') is not None:
            self.trip_start_time = m.get('trip_start_time')
        if m.get('trip_end_time') is not None:
            self.trip_end_time = m.get('trip_end_time')
        if m.get('start_station_name') is not None:
            self.start_station_name = m.get('start_station_name')
        if m.get('end_station_name') is not None:
            self.end_station_name = m.get('end_station_name')
        if m.get('sub_type') is not None:
            self.sub_type = m.get('sub_type')
        if m.get('sub_scene') is not None:
            self.sub_scene = m.get('sub_scene')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('trip_id') is not None:
            self.trip_id = m.get('trip_id')
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        return self


class SimCampaignInfo(TeaModel):
    def __init__(
        self,
        campaign_id: str = None,
        campaign_name: str = None,
        image_url: str = None,
        content: str = None,
    ):
        # 营销活动id
        self.campaign_id = campaign_id
        # 营销活动名
        self.campaign_name = campaign_name
        # 营销图片
        self.image_url = image_url
        # 营销活动内容
        self.content = content

    def validate(self):
        self.validate_required(self.campaign_id, 'campaign_id')
        self.validate_required(self.campaign_name, 'campaign_name')
        self.validate_required(self.image_url, 'image_url')
        self.validate_required(self.content, 'content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.campaign_id is not None:
            result['campaign_id'] = self.campaign_id
        if self.campaign_name is not None:
            result['campaign_name'] = self.campaign_name
        if self.image_url is not None:
            result['image_url'] = self.image_url
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('campaign_id') is not None:
            self.campaign_id = m.get('campaign_id')
        if m.get('campaign_name') is not None:
            self.campaign_name = m.get('campaign_name')
        if m.get('image_url') is not None:
            self.image_url = m.get('image_url')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class RunGeneralRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request: str = None,
        service_name: str = None,
        ext_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务请求数据，json格式
        self.request = request
        # 要调用的具体的服务名称
        self.service_name = service_name
        # 扩展信息
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.request, 'request')
        self.validate_required(self.service_name, 'service_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.request is not None:
            result['request'] = self.request
        if self.service_name is not None:
            result['service_name'] = self.service_name
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request') is not None:
            self.request = m.get('request')
        if m.get('service_name') is not None:
            self.service_name = m.get('service_name')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class RunGeneralResponse(TeaModel):
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
        # 业务响应数据，json格式
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


class ExecEkytInsureRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        insure_info_list_str: str = None,
        signature: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 保险信息list的jsonStr
        self.insure_info_list_str = insure_info_list_str
        # 对insure_info_list_str的签名
        self.signature = signature

    def validate(self):
        self.validate_required(self.insure_info_list_str, 'insure_info_list_str')
        self.validate_required(self.signature, 'signature')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.insure_info_list_str is not None:
            result['insure_info_list_str'] = self.insure_info_list_str
        if self.signature is not None:
            result['signature'] = self.signature
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('insure_info_list_str') is not None:
            self.insure_info_list_str = m.get('insure_info_list_str')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        return self


class ExecEkytInsureResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success
        # 投保结果list的jsonStr
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
        if self.success is not None:
            result['success'] = self.success
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
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class ListDcpRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        outer_order_no: str = None,
        extern_param: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
        self.outer_order_no = outer_order_no
        # 扩展信息，预留字段
        self.extern_param = extern_param

    def validate(self):
        self.validate_required(self.outer_order_no, 'outer_order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.outer_order_no is not None:
            result['outer_order_no'] = self.outer_order_no
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('outer_order_no') is not None:
            self.outer_order_no = m.get('outer_order_no')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        return self


class ListDcpResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        dcp_info_list: List[DcpInfo] = None,
        extern_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求方租户所关联的所有入驻的车队企业信息列表
        self.dcp_info_list = dcp_info_list
        # json格式字符串扩展信息，预留字段。
        self.extern_info = extern_info

    def validate(self):
        if self.dcp_info_list:
            for k in self.dcp_info_list:
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
        result['dcp_info_list'] = []
        if self.dcp_info_list is not None:
            for k in self.dcp_info_list:
                result['dcp_info_list'].append(k.to_map() if k else None)
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.dcp_info_list = []
        if m.get('dcp_info_list') is not None:
            for k in m.get('dcp_info_list'):
                temp_model = DcpInfo()
                self.dcp_info_list.append(temp_model.from_map(k))
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        return self


class ListDcpAccountbookRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        outer_order_no: str = None,
        dcp_tenant_id: str = None,
        extern_param: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
        self.outer_order_no = outer_order_no
        # 企业入驻租户ID
        self.dcp_tenant_id = dcp_tenant_id
        # 扩展信息，预留字段
        self.extern_param = extern_param

    def validate(self):
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.dcp_tenant_id, 'dcp_tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.outer_order_no is not None:
            result['outer_order_no'] = self.outer_order_no
        if self.dcp_tenant_id is not None:
            result['dcp_tenant_id'] = self.dcp_tenant_id
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('outer_order_no') is not None:
            self.outer_order_no = m.get('outer_order_no')
        if m.get('dcp_tenant_id') is not None:
            self.dcp_tenant_id = m.get('dcp_tenant_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        return self


class ListDcpAccountbookResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_info_list: List[SignInfo] = None,
        extern_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求车队企业关联的所有司机签约信息列表
        self.sign_info_list = sign_info_list
        # json格式字符串扩展信息，预留字段。
        self.extern_info = extern_info

    def validate(self):
        if self.sign_info_list:
            for k in self.sign_info_list:
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
        result['sign_info_list'] = []
        if self.sign_info_list is not None:
            for k in self.sign_info_list:
                result['sign_info_list'].append(k.to_map() if k else None)
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.sign_info_list = []
        if m.get('sign_info_list') is not None:
            for k in m.get('sign_info_list'):
                temp_model = SignInfo()
                self.sign_info_list.append(temp_model.from_map(k))
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        return self


class QueryEtcVehicleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        outer_order_no: str = None,
        corp_vehicle_id: str = None,
        plate_no: str = None,
        plate_color: str = None,
        waybill_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
        self.outer_order_no = outer_order_no
        # 企业侧车辆编号
        self.corp_vehicle_id = corp_vehicle_id
        # 车牌号码
        self.plate_no = plate_no
        # 车牌颜色，枚举值
        # 蓝: BLUE
        # 黄: YELLOW
        # 黑: BLACK
        # 白: WHITE
        # 绿: GREEN
        self.plate_color = plate_color
        # 企业运单号，唯一值
        self.waybill_no = waybill_no

    def validate(self):
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.corp_vehicle_id, 'corp_vehicle_id')
        self.validate_required(self.plate_no, 'plate_no')
        self.validate_required(self.plate_color, 'plate_color')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.outer_order_no is not None:
            result['outer_order_no'] = self.outer_order_no
        if self.corp_vehicle_id is not None:
            result['corp_vehicle_id'] = self.corp_vehicle_id
        if self.plate_no is not None:
            result['plate_no'] = self.plate_no
        if self.plate_color is not None:
            result['plate_color'] = self.plate_color
        if self.waybill_no is not None:
            result['waybill_no'] = self.waybill_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('outer_order_no') is not None:
            self.outer_order_no = m.get('outer_order_no')
        if m.get('corp_vehicle_id') is not None:
            self.corp_vehicle_id = m.get('corp_vehicle_id')
        if m.get('plate_no') is not None:
            self.plate_no = m.get('plate_no')
        if m.get('plate_color') is not None:
            self.plate_color = m.get('plate_color')
        if m.get('waybill_no') is not None:
            self.waybill_no = m.get('waybill_no')
        return self


class QueryEtcVehicleResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        etc_vehicle: EtcVehicleInfo = None,
        extern_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求方租户所关联的车辆入驻信息
        self.etc_vehicle = etc_vehicle
        # json格式字符串扩展信息，预留字段。
        self.extern_info = extern_info

    def validate(self):
        if self.etc_vehicle:
            self.etc_vehicle.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.etc_vehicle is not None:
            result['etc_vehicle'] = self.etc_vehicle.to_map()
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('etc_vehicle') is not None:
            temp_model = EtcVehicleInfo()
            self.etc_vehicle = temp_model.from_map(m['etc_vehicle'])
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        return self


class UploadEtcWaybillRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        outer_order_no: str = None,
        corp_vehicle_id: str = None,
        plate_no: str = None,
        plate_color: str = None,
        waybill_no: str = None,
        waybill_status: str = None,
        waybill_start_time: str = None,
        waybill_end_time: str = None,
        waybill_start_address: str = None,
        waybill_end_address: str = None,
        waybill_fee: str = None,
        highway_fee: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
        self.outer_order_no = outer_order_no
        # 企业侧车辆编号
        self.corp_vehicle_id = corp_vehicle_id
        # 车牌号码
        self.plate_no = plate_no
        # 车牌颜色，枚举值
        # 蓝: BLUE
        # 黄: YELLOW
        # 黑: BLACK
        # 白: WHITE
        # 绿: GREEN
        self.plate_color = plate_color
        # 企业运单号，唯一值
        self.waybill_no = waybill_no
        # 企业运单状态，枚举值
        # 进行中: IN_PROGRESS
        # 已完成: COMPLETED
        # 已取消: CANCELED
        self.waybill_status = waybill_status
        # 运单开始时间
        # 【必选条件】当传入waybill_status，且waybill_status= IN_PROGRESS时必选
        self.waybill_start_time = waybill_start_time
        # 企业运单结束时间
        # 【必选条件】当传入waybill_status，且waybill_status=COMPLETED时必选
        self.waybill_end_time = waybill_end_time
        # 运单开始地址
        # 【必选条件】当传入waybill_status，且waybill_status= IN_PROGRESS时必选
        self.waybill_start_address = waybill_start_address
        # 运单结束地址，运单目的地
        # 【必选条件】当传入waybill_status，且waybill_status=COMPLETED时必选
        self.waybill_end_address = waybill_end_address
        # 运单总费用，单位元，精确到两位小数
        # 【必选条件】当传入waybill_status，且waybill_status=COMPLETED时必选
        self.waybill_fee = waybill_fee
        # 高速通行费用，单位元，精确到两位小数
        self.highway_fee = highway_fee

    def validate(self):
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.corp_vehicle_id, 'corp_vehicle_id')
        self.validate_required(self.plate_no, 'plate_no')
        self.validate_required(self.plate_color, 'plate_color')
        self.validate_required(self.waybill_no, 'waybill_no')
        self.validate_required(self.waybill_status, 'waybill_status')
        if self.waybill_start_time is not None:
            self.validate_pattern(self.waybill_start_time, 'waybill_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.waybill_end_time is not None:
            self.validate_pattern(self.waybill_end_time, 'waybill_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.outer_order_no is not None:
            result['outer_order_no'] = self.outer_order_no
        if self.corp_vehicle_id is not None:
            result['corp_vehicle_id'] = self.corp_vehicle_id
        if self.plate_no is not None:
            result['plate_no'] = self.plate_no
        if self.plate_color is not None:
            result['plate_color'] = self.plate_color
        if self.waybill_no is not None:
            result['waybill_no'] = self.waybill_no
        if self.waybill_status is not None:
            result['waybill_status'] = self.waybill_status
        if self.waybill_start_time is not None:
            result['waybill_start_time'] = self.waybill_start_time
        if self.waybill_end_time is not None:
            result['waybill_end_time'] = self.waybill_end_time
        if self.waybill_start_address is not None:
            result['waybill_start_address'] = self.waybill_start_address
        if self.waybill_end_address is not None:
            result['waybill_end_address'] = self.waybill_end_address
        if self.waybill_fee is not None:
            result['waybill_fee'] = self.waybill_fee
        if self.highway_fee is not None:
            result['highway_fee'] = self.highway_fee
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('outer_order_no') is not None:
            self.outer_order_no = m.get('outer_order_no')
        if m.get('corp_vehicle_id') is not None:
            self.corp_vehicle_id = m.get('corp_vehicle_id')
        if m.get('plate_no') is not None:
            self.plate_no = m.get('plate_no')
        if m.get('plate_color') is not None:
            self.plate_color = m.get('plate_color')
        if m.get('waybill_no') is not None:
            self.waybill_no = m.get('waybill_no')
        if m.get('waybill_status') is not None:
            self.waybill_status = m.get('waybill_status')
        if m.get('waybill_start_time') is not None:
            self.waybill_start_time = m.get('waybill_start_time')
        if m.get('waybill_end_time') is not None:
            self.waybill_end_time = m.get('waybill_end_time')
        if m.get('waybill_start_address') is not None:
            self.waybill_start_address = m.get('waybill_start_address')
        if m.get('waybill_end_address') is not None:
            self.waybill_end_address = m.get('waybill_end_address')
        if m.get('waybill_fee') is not None:
            self.waybill_fee = m.get('waybill_fee')
        if m.get('highway_fee') is not None:
            self.highway_fee = m.get('highway_fee')
        return self


class UploadEtcWaybillResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_id: str = None,
        extern_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 运单记录号
        self.biz_id = biz_id
        # json格式字符串扩展信息，预留字段。
        self.extern_info = extern_info

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
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        return self


class QueryEtcTripRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        outer_order_no: str = None,
        corp_vehicle_id: str = None,
        plate_no: str = None,
        plate_color: str = None,
        waybill_no: str = None,
        page_num: int = None,
        page_size: int = None,
        start_time: str = None,
        end_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
        self.outer_order_no = outer_order_no
        # 企业侧车辆编号
        self.corp_vehicle_id = corp_vehicle_id
        # 车牌号码
        self.plate_no = plate_no
        # 车牌颜色，蓝: BLUE 黄: YELLOW 黑: BLACK 白: WHITE 绿: GREEN
        self.plate_color = plate_color
        # 企业运单号，唯一值
        self.waybill_no = waybill_no
        # 当前页码
        # 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
        self.page_num = page_num
        # 每页数据条数
        # 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
        self.page_size = page_size
        # 行程查询开始时间
        # 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
        self.start_time = start_time
        # 行程查询结束时间
        # 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
        # 
        self.end_time = end_time

    def validate(self):
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.corp_vehicle_id, 'corp_vehicle_id')
        self.validate_required(self.plate_no, 'plate_no')
        self.validate_required(self.plate_color, 'plate_color')
        self.validate_required(self.waybill_no, 'waybill_no')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.outer_order_no is not None:
            result['outer_order_no'] = self.outer_order_no
        if self.corp_vehicle_id is not None:
            result['corp_vehicle_id'] = self.corp_vehicle_id
        if self.plate_no is not None:
            result['plate_no'] = self.plate_no
        if self.plate_color is not None:
            result['plate_color'] = self.plate_color
        if self.waybill_no is not None:
            result['waybill_no'] = self.waybill_no
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('outer_order_no') is not None:
            self.outer_order_no = m.get('outer_order_no')
        if m.get('corp_vehicle_id') is not None:
            self.corp_vehicle_id = m.get('corp_vehicle_id')
        if m.get('plate_no') is not None:
            self.plate_no = m.get('plate_no')
        if m.get('plate_color') is not None:
            self.plate_color = m.get('plate_color')
        if m.get('waybill_no') is not None:
            self.waybill_no = m.get('waybill_no')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        return self


class QueryEtcTripResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_page: int = None,
        total_size: int = None,
        page_num: int = None,
        page_size: int = None,
        has_next: bool = None,
        trip_list: List[EtcTripInfo] = None,
        extern_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总页数
        self.total_page = total_page
        # 总记录数
        self.total_size = total_size
        # 当前页码
        # 
        self.page_num = page_num
        # 每页条数
        self.page_size = page_size
        # 是否还有下一页
        self.has_next = has_next
        # 请求方租户所关联的行程单据列表
        self.trip_list = trip_list
        # json格式字符串扩展信息，预留字段。
        self.extern_info = extern_info

    def validate(self):
        if self.trip_list:
            for k in self.trip_list:
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
        if self.total_page is not None:
            result['total_page'] = self.total_page
        if self.total_size is not None:
            result['total_size'] = self.total_size
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.has_next is not None:
            result['has_next'] = self.has_next
        result['trip_list'] = []
        if self.trip_list is not None:
            for k in self.trip_list:
                result['trip_list'].append(k.to_map() if k else None)
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        if m.get('total_size') is not None:
            self.total_size = m.get('total_size')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('has_next') is not None:
            self.has_next = m.get('has_next')
        self.trip_list = []
        if m.get('trip_list') is not None:
            for k in m.get('trip_list'):
                temp_model = EtcTripInfo()
                self.trip_list.append(temp_model.from_map(k))
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        return self


class InitSimLoginRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备编号
        self.device_id = device_id

    def validate(self):
        self.validate_required(self.device_id, 'device_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.device_id is not None:
            result['device_id'] = self.device_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        return self


class InitSimLoginResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        url: str = None,
        token: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 支付宝登录url
        self.url = url
        # 登录token
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
        if self.url is not None:
            result['url'] = self.url
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
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('token') is not None:
            self.token = m.get('token')
        return self


class QuerySimLoginRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
        token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备编号
        self.device_id = device_id
        # 登录态token
        self.token = token

    def validate(self):
        self.validate_required(self.device_id, 'device_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.token is not None:
            result['token'] = self.token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('token') is not None:
            self.token = m.get('token')
        return self


class QuerySimLoginResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        login_result: str = None,
        login_msg: str = None,
        activated: bool = None,
        activate_time: str = None,
        login_time: str = None,
        store_info: SimStoreInfo = None,
        sales_info: SimSalesInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 登录结果
        # NO_RESULT：暂无登录结果
        # EXPIRED：token过期
        # ACTIVATE_OK：激活成功，店长首次登录成功
        # LOGIN_OK：登录成功
        # USER_NOT_EXIST：用户不存在
        # STORE_NOT_ACTIVATED：门店未激活
        self.login_result = login_result
        # 登录结果中文信息
        self.login_msg = login_msg
        # 是否已经激活
        self.activated = activated
        # 激活时间，格式yyyy-MM-dd HH:mm:ss
        self.activate_time = activate_time
        # 登录/激活时间，格式yyyy-MM-dd HH:mm:ss
        self.login_time = login_time
        # 当前登录的门店信息
        self.store_info = store_info
        # 当前登录的销售信息
        self.sales_info = sales_info

    def validate(self):
        if self.store_info:
            self.store_info.validate()
        if self.sales_info:
            self.sales_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.login_result is not None:
            result['login_result'] = self.login_result
        if self.login_msg is not None:
            result['login_msg'] = self.login_msg
        if self.activated is not None:
            result['activated'] = self.activated
        if self.activate_time is not None:
            result['activate_time'] = self.activate_time
        if self.login_time is not None:
            result['login_time'] = self.login_time
        if self.store_info is not None:
            result['store_info'] = self.store_info.to_map()
        if self.sales_info is not None:
            result['sales_info'] = self.sales_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('login_result') is not None:
            self.login_result = m.get('login_result')
        if m.get('login_msg') is not None:
            self.login_msg = m.get('login_msg')
        if m.get('activated') is not None:
            self.activated = m.get('activated')
        if m.get('activate_time') is not None:
            self.activate_time = m.get('activate_time')
        if m.get('login_time') is not None:
            self.login_time = m.get('login_time')
        if m.get('store_info') is not None:
            temp_model = SimStoreInfo()
            self.store_info = temp_model.from_map(m['store_info'])
        if m.get('sales_info') is not None:
            temp_model = SimSalesInfo()
            self.sales_info = temp_model.from_map(m['sales_info'])
        return self


class ListSimCampaignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备编号
        self.device_id = device_id

    def validate(self):
        self.validate_required(self.device_id, 'device_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.device_id is not None:
            result['device_id'] = self.device_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        return self


class ListSimCampaignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        campaign_list: List[SimCampaignInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 营销活动列表
        self.campaign_list = campaign_list

    def validate(self):
        if self.campaign_list:
            for k in self.campaign_list:
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
        result['campaign_list'] = []
        if self.campaign_list is not None:
            for k in self.campaign_list:
                result['campaign_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.campaign_list = []
        if m.get('campaign_list') is not None:
            for k in m.get('campaign_list'):
                temp_model = SimCampaignInfo()
                self.campaign_list.append(temp_model.from_map(k))
        return self


class QuerySimSkuRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
        sn: str = None,
        sku_id_list: List[str] = None,
        token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备编号
        self.device_id = device_id
        # 车辆SN，与skuId二选一
        self.sn = sn
        # sku对外id列表，与sn二选一
        self.sku_id_list = sku_id_list
        # 登录态token
        self.token = token

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
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
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.sn is not None:
            result['sn'] = self.sn
        if self.sku_id_list is not None:
            result['sku_id_list'] = self.sku_id_list
        if self.token is not None:
            result['token'] = self.token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('sn') is not None:
            self.sn = m.get('sn')
        if m.get('sku_id_list') is not None:
            self.sku_id_list = m.get('sku_id_list')
        if m.get('token') is not None:
            self.token = m.get('token')
        return self


class QuerySimSkuResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sku_info_list: List[SimSkuInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 车辆SKU，如果查无返回空列表
        self.sku_info_list = sku_info_list

    def validate(self):
        if self.sku_info_list:
            for k in self.sku_info_list:
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
        result['sku_info_list'] = []
        if self.sku_info_list is not None:
            for k in self.sku_info_list:
                result['sku_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.sku_info_list = []
        if m.get('sku_info_list') is not None:
            for k in m.get('sku_info_list'):
                temp_model = SimSkuInfo()
                self.sku_info_list.append(temp_model.from_map(k))
        return self


class ListSimSkuRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
        spu_id: str = None,
        page_no: int = None,
        page_size: int = None,
        token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备编号
        self.device_id = device_id
        # SPU ID
        self.spu_id = spu_id
        # 请求的页数
        self.page_no = page_no
        # 单页项数
        self.page_size = page_size
        # 登录态token
        self.token = token

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')
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
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.spu_id is not None:
            result['spu_id'] = self.spu_id
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.token is not None:
            result['token'] = self.token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('spu_id') is not None:
            self.spu_id = m.get('spu_id')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('token') is not None:
            self.token = m.get('token')
        return self


class ListSimSkuResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        paginator: Paginator = None,
        sku_info_list: List[SimSkuInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分页器
        self.paginator = paginator
        # 车辆SKU列表
        self.sku_info_list = sku_info_list

    def validate(self):
        if self.paginator:
            self.paginator.validate()
        if self.sku_info_list:
            for k in self.sku_info_list:
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
        if self.paginator is not None:
            result['paginator'] = self.paginator.to_map()
        result['sku_info_list'] = []
        if self.sku_info_list is not None:
            for k in self.sku_info_list:
                result['sku_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('paginator') is not None:
            temp_model = Paginator()
            self.paginator = temp_model.from_map(m['paginator'])
        self.sku_info_list = []
        if m.get('sku_info_list') is not None:
            for k in m.get('sku_info_list'):
                temp_model = SimSkuInfo()
                self.sku_info_list.append(temp_model.from_map(k))
        return self


class CreateSimOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
        sku_id: str = None,
        sn: str = None,
        color: str = None,
        token: str = None,
        extra_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备编号
        self.device_id = device_id
        # sku id
        self.sku_id = sku_id
        # 车辆sn号
        self.sn = sn
        # 颜色
        self.color = color
        # 登录态token
        self.token = token
        # 扩展信息
        self.extra_info = extra_info

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.sku_id, 'sku_id')
        self.validate_required(self.color, 'color')
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
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        if self.sn is not None:
            result['sn'] = self.sn
        if self.color is not None:
            result['color'] = self.color
        if self.token is not None:
            result['token'] = self.token
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('sku_id') is not None:
            self.sku_id = m.get('sku_id')
        if m.get('sn') is not None:
            self.sn = m.get('sn')
        if m.get('color') is not None:
            self.color = m.get('color')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        return self


class CreateSimOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        miniapp_link: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单号
        self.order_id = order_id
        # 支付宝小程序链接
        self.miniapp_link = miniapp_link

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
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.miniapp_link is not None:
            result['miniapp_link'] = self.miniapp_link
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('miniapp_link') is not None:
            self.miniapp_link = m.get('miniapp_link')
        return self


class QuerySimOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
        order_id: str = None,
        token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备编号
        self.device_id = device_id
        # 订单号
        self.order_id = order_id
        # 登录态token
        self.token = token

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.order_id, 'order_id')
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
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.token is not None:
            result['token'] = self.token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('token') is not None:
            self.token = m.get('token')
        return self


class QuerySimOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_info: SimOrderInfo = None,
        miniapp_link: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单信息，如果查无返回空对象
        self.order_info = order_info
        # 小程序链接
        self.miniapp_link = miniapp_link

    def validate(self):
        if self.order_info:
            self.order_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.order_info is not None:
            result['order_info'] = self.order_info.to_map()
        if self.miniapp_link is not None:
            result['miniapp_link'] = self.miniapp_link
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order_info') is not None:
            temp_model = SimOrderInfo()
            self.order_info = temp_model.from_map(m['order_info'])
        if m.get('miniapp_link') is not None:
            self.miniapp_link = m.get('miniapp_link')
        return self


class ListSimOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
        page_no: int = None,
        page_size: int = None,
        token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备编号
        self.device_id = device_id
        # 请求的页数
        self.page_no = page_no
        # 单页项数
        self.page_size = page_size
        # 登录态token
        self.token = token

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')
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
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.token is not None:
            result['token'] = self.token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('token') is not None:
            self.token = m.get('token')
        return self


class ListSimOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        paginator: Paginator = None,
        order_info_list: List[SimOrderInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分页器
        self.paginator = paginator
        # 订单信息列表
        self.order_info_list = order_info_list

    def validate(self):
        if self.paginator:
            self.paginator.validate()
        if self.order_info_list:
            for k in self.order_info_list:
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
        if self.paginator is not None:
            result['paginator'] = self.paginator.to_map()
        result['order_info_list'] = []
        if self.order_info_list is not None:
            for k in self.order_info_list:
                result['order_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('paginator') is not None:
            temp_model = Paginator()
            self.paginator = temp_model.from_map(m['paginator'])
        self.order_info_list = []
        if m.get('order_info_list') is not None:
            for k in m.get('order_info_list'):
                temp_model = SimOrderInfo()
                self.order_info_list.append(temp_model.from_map(k))
        return self


class CancelSimOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
        order_id: str = None,
        token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备编号
        self.device_id = device_id
        # 订单号
        self.order_id = order_id
        # 登录态token
        self.token = token

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.order_id, 'order_id')
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
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.token is not None:
            result['token'] = self.token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('token') is not None:
            self.token = m.get('token')
        return self


class CancelSimOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        order_info: SimOrderInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否取消成功
        self.success = success
        # 更新后订单信息，如果查无返回空对象
        self.order_info = order_info

    def validate(self):
        if self.order_info:
            self.order_info.validate()

    def to_map(self):
        _map = super().to_map()
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
        if self.order_info is not None:
            result['order_info'] = self.order_info.to_map()
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
        if m.get('order_info') is not None:
            temp_model = SimOrderInfo()
            self.order_info = temp_model.from_map(m['order_info'])
        return self


class PullSimSkuRequest(TeaModel):
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
        # 请求的页数
        self.page_no = page_no
        # 单页项数
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


class PullSimSkuResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        paginator: Paginator = None,
        sku_info_list: List[SimSkuInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分页器
        self.paginator = paginator
        # 车辆SKU列表
        self.sku_info_list = sku_info_list

    def validate(self):
        if self.paginator:
            self.paginator.validate()
        if self.sku_info_list:
            for k in self.sku_info_list:
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
        if self.paginator is not None:
            result['paginator'] = self.paginator.to_map()
        result['sku_info_list'] = []
        if self.sku_info_list is not None:
            for k in self.sku_info_list:
                result['sku_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('paginator') is not None:
            temp_model = Paginator()
            self.paginator = temp_model.from_map(m['paginator'])
        self.sku_info_list = []
        if m.get('sku_info_list') is not None:
            for k in m.get('sku_info_list'):
                temp_model = SimSkuInfo()
                self.sku_info_list.append(temp_model.from_map(k))
        return self


class ConfirmSimOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
        order_id: str = None,
        token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备id
        self.device_id = device_id
        # 订单号
        self.order_id = order_id
        # 登录态token
        self.token = token

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.order_id, 'order_id')
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
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.token is not None:
            result['token'] = self.token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('token') is not None:
            self.token = m.get('token')
        return self


class ConfirmSimOrderResponse(TeaModel):
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


class UploadSimQrcodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
        token: str = None,
        vehicle_model: str = None,
        parse_type: str = None,
        base_64data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备号
        self.device_id = device_id
        # 登录态token
        self.token = token
        # 车型
        self.vehicle_model = vehicle_model
        # 解析类型
        self.parse_type = parse_type
        # base64后的图象数据
        self.base_64data = base_64data

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.token, 'token')
        self.validate_required(self.vehicle_model, 'vehicle_model')
        self.validate_required(self.parse_type, 'parse_type')
        self.validate_required(self.base_64data, 'base_64data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.token is not None:
            result['token'] = self.token
        if self.vehicle_model is not None:
            result['vehicle_model'] = self.vehicle_model
        if self.parse_type is not None:
            result['parse_type'] = self.parse_type
        if self.base_64data is not None:
            result['base64_data'] = self.base_64data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('vehicle_model') is not None:
            self.vehicle_model = m.get('vehicle_model')
        if m.get('parse_type') is not None:
            self.parse_type = m.get('parse_type')
        if m.get('base64_data') is not None:
            self.base_64data = m.get('base64_data')
        return self


class UploadSimQrcodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        parsed_content: str = None,
        extra_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 解析后结果
        self.parsed_content = parsed_content
        # 非必填	json字符串，扩展预留
        self.extra_info = extra_info

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
        if self.parsed_content is not None:
            result['parsed_content'] = self.parsed_content
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('parsed_content') is not None:
            self.parsed_content = m.get('parsed_content')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        return self


class QuerySpuListRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
        page_no: int = None,
        page_size: int = None,
        token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备编号
        self.device_id = device_id
        # 请求的页数
        self.page_no = page_no
        # 单页项数
        self.page_size = page_size
        # 登录态token
        self.token = token

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')
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
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.token is not None:
            result['token'] = self.token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('token') is not None:
            self.token = m.get('token')
        return self


class QuerySpuListResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        spu_info_list: List[SimSpuInfo] = None,
        paginator: Paginator = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # SPU信息
        self.spu_info_list = spu_info_list
        # 分页参数
        self.paginator = paginator

    def validate(self):
        if self.spu_info_list:
            for k in self.spu_info_list:
                if k:
                    k.validate()
        if self.paginator:
            self.paginator.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['spu_info_list'] = []
        if self.spu_info_list is not None:
            for k in self.spu_info_list:
                result['spu_info_list'].append(k.to_map() if k else None)
        if self.paginator is not None:
            result['paginator'] = self.paginator.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.spu_info_list = []
        if m.get('spu_info_list') is not None:
            for k in m.get('spu_info_list'):
                temp_model = SimSpuInfo()
                self.spu_info_list.append(temp_model.from_map(k))
        if m.get('paginator') is not None:
            temp_model = Paginator()
            self.paginator = temp_model.from_map(m['paginator'])
        return self


class QueryLoginSignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
        token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备编号
        self.device_id = device_id
        # 登录态token
        self.token = token

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
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
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.token is not None:
            result['token'] = self.token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('token') is not None:
            self.token = m.get('token')
        return self


class QueryLoginSignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        store_info: SimStoreInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 门店签约信息
        self.store_info = store_info

    def validate(self):
        if self.store_info:
            self.store_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.store_info is not None:
            result['store_info'] = self.store_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('store_info') is not None:
            temp_model = SimStoreInfo()
            self.store_info = temp_model.from_map(m['store_info'])
        return self


class ResetOrderLinkRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
        order_id: str = None,
        token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备编号
        self.device_id = device_id
        # 订单号
        self.order_id = order_id
        # 登录态token
        self.token = token

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.order_id, 'order_id')
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
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.token is not None:
            result['token'] = self.token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('token') is not None:
            self.token = m.get('token')
        return self


class ResetOrderLinkResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        miniapp_link: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 小程序地址
        self.miniapp_link = miniapp_link

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
        if self.miniapp_link is not None:
            result['miniapp_link'] = self.miniapp_link
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('miniapp_link') is not None:
            self.miniapp_link = m.get('miniapp_link')
        return self


class UploadSimRiskdataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
        token: str = None,
        upload_type: str = None,
        tuid: str = None,
        tuid_photo: str = None,
        frame_no: str = None,
        frame_no_photo: str = None,
        group_photo: str = None,
        bill_photo: str = None,
        license_plate_photo: str = None,
        order_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备ID
        self.device_id = device_id
        # 登录态token
        self.token = token
        # 上报类型
        self.upload_type = upload_type
        # 智能中控id
        self.tuid = tuid
        # 中控照片，base64后的图象数据
        self.tuid_photo = tuid_photo
        # 车架号
        self.frame_no = frame_no
        # 车架号照片，base64后的图象数据
        self.frame_no_photo = frame_no_photo
        # 人车合影（销售+用户），base64后的图象数据
        self.group_photo = group_photo
        # 单据照片（发票/收据），base64后的图象数据
        self.bill_photo = bill_photo
        # 上牌照片，base64后的图象数据
        self.license_plate_photo = license_plate_photo
        # 订单ID
        self.order_id = order_id

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.token, 'token')
        self.validate_required(self.upload_type, 'upload_type')
        self.validate_required(self.order_id, 'order_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.token is not None:
            result['token'] = self.token
        if self.upload_type is not None:
            result['upload_type'] = self.upload_type
        if self.tuid is not None:
            result['tuid'] = self.tuid
        if self.tuid_photo is not None:
            result['tuid_photo'] = self.tuid_photo
        if self.frame_no is not None:
            result['frame_no'] = self.frame_no
        if self.frame_no_photo is not None:
            result['frame_no_photo'] = self.frame_no_photo
        if self.group_photo is not None:
            result['group_photo'] = self.group_photo
        if self.bill_photo is not None:
            result['bill_photo'] = self.bill_photo
        if self.license_plate_photo is not None:
            result['license_plate_photo'] = self.license_plate_photo
        if self.order_id is not None:
            result['order_id'] = self.order_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('upload_type') is not None:
            self.upload_type = m.get('upload_type')
        if m.get('tuid') is not None:
            self.tuid = m.get('tuid')
        if m.get('tuid_photo') is not None:
            self.tuid_photo = m.get('tuid_photo')
        if m.get('frame_no') is not None:
            self.frame_no = m.get('frame_no')
        if m.get('frame_no_photo') is not None:
            self.frame_no_photo = m.get('frame_no_photo')
        if m.get('group_photo') is not None:
            self.group_photo = m.get('group_photo')
        if m.get('bill_photo') is not None:
            self.bill_photo = m.get('bill_photo')
        if m.get('license_plate_photo') is not None:
            self.license_plate_photo = m.get('license_plate_photo')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        return self


class UploadSimRiskdataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        extra_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # json字符串，扩展预留
        self.extra_info = extra_info

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
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        return self


class CreateBssecpicRequest(TeaModel):
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
        self.app_name = app_name
        # 客户名
        self.client_name = client_name
        # 操作系统
        self.os_type = os_type
        # 包名
        self.package_name = package_name
        # 签名信息
        self.cert_sign = cert_sign
        # 签名秘钥内容
        self.app_key_data = app_key_data
        # 加密秘钥内容
        self.security_data = security_data
        # 自定义秘钥内容
        self.extra_data = extra_data
        # 白盒秘钥内容
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


class CreateBssecpicResponse(TeaModel):
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
        # 是否成功
        self.success = success
        # 返回文件名
        self.file_name = file_name
        # 返回文件的内容base64
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
        raas_products: str = None,
        raas_second_tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用名
        self.app_name = app_name
        # 客户名
        self.client_name = client_name
        # 操作系统
        self.os_type = os_type
        # 包名
        self.package_name = package_name
        # 签名信息
        self.cert_sign = cert_sign
        # 签名秘钥内容
        self.app_key_data = app_key_data
        # 加密秘钥内容
        self.security_data = security_data
        # 自定义秘钥内容
        self.extra_data = extra_data
        # 白盒秘钥内容
        self.white_box_data = white_box_data
        # raas产品码列表
        self.raas_products = raas_products
        # 直接透传的二级租户，可选
        self.raas_second_tenant = raas_second_tenant

    def validate(self):
        self.validate_required(self.client_name, 'client_name')
        self.validate_required(self.os_type, 'os_type')
        self.validate_required(self.package_name, 'package_name')
        self.validate_required(self.raas_products, 'raas_products')

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
        if self.raas_products is not None:
            result['raas_products'] = self.raas_products
        if self.raas_second_tenant is not None:
            result['raas_second_tenant'] = self.raas_second_tenant
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
        if m.get('raas_products') is not None:
            self.raas_products = m.get('raas_products')
        if m.get('raas_second_tenant') is not None:
            self.raas_second_tenant = m.get('raas_second_tenant')
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
        self.success = success
        # 生成的图片文件名
        self.file_name = file_name
        # body base 64
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
        raas_products: str = None,
        raas_second_tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户id，标识客户来源
        self.client_id = client_id
        # 设备token
        self.apdid_token = apdid_token
        # 切面数据（JSON，详见下方）
        # {
        # "sessionId": "zimId"	//人脸的bizID
        # "rId": "rId"	//在获取活体方法人脸下发的bisToken
        # "keyInfoHash": "keyInfoHash"	//关键信息hash
        # "pictureHash": "人脸图片的hash"	//解密出来的人脸图片做hash
        # "rData": "xxx"	//客户端在zimInit和zimValidate带上去的业务风险数据
        # }
        self.aop_data = aop_data
        # 否（和切面二选一即可）
        self.signature = signature
        # 签名因子（和切面二选一即可）
        self.sign_factor = sign_factor
        # RaaS租户
        self.raas_products = raas_products
        # raas二级租户
        self.raas_second_tenant = raas_second_tenant

    def validate(self):
        self.validate_required(self.client_id, 'client_id')
        self.validate_required(self.raas_products, 'raas_products')

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
        if self.raas_products is not None:
            result['raas_products'] = self.raas_products
        if self.raas_second_tenant is not None:
            result['raas_second_tenant'] = self.raas_second_tenant
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
        if m.get('raas_products') is not None:
            self.raas_products = m.get('raas_products')
        if m.get('raas_second_tenant') is not None:
            self.raas_second_tenant = m.get('raas_second_tenant')
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
        self.success = success
        # 请求码，200成功，其他失败，具体见错误码
        self.code = code
        # 错误时的返回信息
        self.message = message
        # 请求时传入的，若没有传，则系统自动生成
        self.request_id = request_id
        # apdidToken	String	设备token
        # riskLevel	String	风险等级，-1参数异常，0无风险，1-3表示低、中、高
        # riskDesc	String	风险描述，对风险等级的补充
        # sugAction	String	处理的建议，如PAAS
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


class QueryFaceshieldWebRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        client_id: str = None,
        apdid_token: str = None,
        aop_data: str = None,
        raas_products: str = None,
        raas_second_tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户id，标识客户来源
        self.client_id = client_id
        # 设备token
        self.apdid_token = apdid_token
        # 切面数据（JSON，详见下方）
        self.aop_data = aop_data
        # RaaS租户
        # 
        self.raas_products = raas_products
        # raas二级租户
        # 
        self.raas_second_tenant = raas_second_tenant

    def validate(self):
        self.validate_required(self.client_id, 'client_id')
        self.validate_required(self.raas_products, 'raas_products')

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
        if self.raas_products is not None:
            result['raas_products'] = self.raas_products
        if self.raas_second_tenant is not None:
            result['raas_second_tenant'] = self.raas_second_tenant
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
        if m.get('raas_products') is not None:
            self.raas_products = m.get('raas_products')
        if m.get('raas_second_tenant') is not None:
            self.raas_second_tenant = m.get('raas_second_tenant')
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


class InitIifaaDeviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        corp_code: str = None,
        device_type: str = None,
        device_info: str = None,
        product_code: str = None,
        pub_key: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 产商code
        self.corp_code = corp_code
        # 设备类型
        self.device_type = device_type
        # 设备信息
        self.device_info = device_info
        # 产品code
        self.product_code = product_code
        # 用于加密回传数据的公钥
        self.pub_key = pub_key

    def validate(self):
        self.validate_required(self.corp_code, 'corp_code')
        self.validate_required(self.device_type, 'device_type')
        self.validate_required(self.device_info, 'device_info')
        self.validate_required(self.product_code, 'product_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.corp_code is not None:
            result['corp_code'] = self.corp_code
        if self.device_type is not None:
            result['device_type'] = self.device_type
        if self.device_info is not None:
            result['device_info'] = self.device_info
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.pub_key is not None:
            result['pub_key'] = self.pub_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('corp_code') is not None:
            self.corp_code = m.get('corp_code')
        if m.get('device_type') is not None:
            self.device_type = m.get('device_type')
        if m.get('device_info') is not None:
            self.device_info = m.get('device_info')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('pub_key') is not None:
            self.pub_key = m.get('pub_key')
        return self


class InitIifaaDeviceResponse(TeaModel):
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


class RecognizeIifaaDeviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tuid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备唯一ID
        self.tuid = tuid

    def validate(self):
        self.validate_required(self.tuid, 'tuid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tuid is not None:
            result['tuid'] = self.tuid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tuid') is not None:
            self.tuid = m.get('tuid')
        return self


class RecognizeIifaaDeviceResponse(TeaModel):
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


class VerifyIifaaDeviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cipher_text: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待验证的数据
        self.cipher_text = cipher_text

    def validate(self):
        self.validate_required(self.cipher_text, 'cipher_text')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cipher_text is not None:
            result['cipher_text'] = self.cipher_text
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cipher_text') is not None:
            self.cipher_text = m.get('cipher_text')
        return self


class VerifyIifaaDeviceResponse(TeaModel):
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
        # 验证结果
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


class RegisterIifaaCorpRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        corp_code: str = None,
        corp_name: str = None,
        product_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 产商code
        self.corp_code = corp_code
        # 产商名称
        self.corp_name = corp_name
        # 产商签约code
        self.product_code = product_code

    def validate(self):
        self.validate_required(self.corp_code, 'corp_code')
        self.validate_required(self.corp_name, 'corp_name')
        self.validate_required(self.product_code, 'product_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.corp_code is not None:
            result['corp_code'] = self.corp_code
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        if self.product_code is not None:
            result['product_code'] = self.product_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('corp_code') is not None:
            self.corp_code = m.get('corp_code')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        return self


class RegisterIifaaCorpResponse(TeaModel):
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
        # 产商注册结果
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


class DeprecateIifaaDeviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tuid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备唯一ID
        self.tuid = tuid

    def validate(self):
        self.validate_required(self.tuid, 'tuid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tuid is not None:
            result['tuid'] = self.tuid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tuid') is not None:
            self.tuid = m.get('tuid')
        return self


class DeprecateIifaaDeviceResponse(TeaModel):
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
        # 设备擦除结果
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


class RunXhunterSpiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request: str = None,
        service_name: str = None,
        ext_info: str = None,
        raas_products: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # json
        self.request = request
        # XHUNTER_ISV_STANDARD
        self.service_name = service_name
        # json
        self.ext_info = ext_info
        # raas_products
        self.raas_products = raas_products

    def validate(self):
        self.validate_required(self.request, 'request')
        self.validate_required(self.service_name, 'service_name')
        self.validate_required(self.raas_products, 'raas_products')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.request is not None:
            result['request'] = self.request
        if self.service_name is not None:
            result['service_name'] = self.service_name
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        if self.raas_products is not None:
            result['raas_products'] = self.raas_products
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request') is not None:
            self.request = m.get('request')
        if m.get('service_name') is not None:
            self.service_name = m.get('service_name')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        if m.get('raas_products') is not None:
            self.raas_products = m.get('raas_products')
        return self


class RunXhunterSpiResponse(TeaModel):
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
        # response
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


class ExecIifaaInsureRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        insure_info_list_str: str = None,
        signature: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 保险信息list的jsonStr
        self.insure_info_list_str = insure_info_list_str
        # 对insure_info_list_str的签名，使用十六进制字符串编码
        self.signature = signature

    def validate(self):
        self.validate_required(self.insure_info_list_str, 'insure_info_list_str')
        self.validate_required(self.signature, 'signature')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.insure_info_list_str is not None:
            result['insure_info_list_str'] = self.insure_info_list_str
        if self.signature is not None:
            result['signature'] = self.signature
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('insure_info_list_str') is not None:
            self.insure_info_list_str = m.get('insure_info_list_str')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        return self


class ExecIifaaInsureResponse(TeaModel):
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
        # 投保结果list的jsonStr
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


class QueryCctPictureRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request: str = None,
        raas_products: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # InfoSecAnalyzeSyncContent json
        self.request = request
        # RaaS产品码
        self.raas_products = raas_products

    def validate(self):
        self.validate_required(self.request, 'request')
        self.validate_required(self.raas_products, 'raas_products')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.request is not None:
            result['request'] = self.request
        if self.raas_products is not None:
            result['raas_products'] = self.raas_products
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request') is not None:
            self.request = m.get('request')
        if m.get('raas_products') is not None:
            self.raas_products = m.get('raas_products')
        return self


class QueryCctPictureResponse(TeaModel):
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
        # InfoSecAnalyzeSyncContent json
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


class RecognizeCctAnalyzeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        channel: str = None,
        content_type: str = None,
        user_id: str = None,
        request_id: str = None,
        data_map: CctDataMap = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # channel
        self.channel = channel
        # content_type
        self.content_type = content_type
        # user_id
        self.user_id = user_id
        # request_id
        self.request_id = request_id
        # data_map
        self.data_map = data_map

    def validate(self):
        self.validate_required(self.channel, 'channel')
        self.validate_required(self.content_type, 'content_type')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.data_map, 'data_map')
        if self.data_map:
            self.data_map.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.channel is not None:
            result['channel'] = self.channel
        if self.content_type is not None:
            result['content_type'] = self.content_type
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.data_map is not None:
            result['data_map'] = self.data_map.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('content_type') is not None:
            self.content_type = m.get('content_type')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('data_map') is not None:
            temp_model = CctDataMap()
            self.data_map = temp_model.from_map(m['data_map'])
        return self


class RecognizeCctAnalyzeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_request_id: str = None,
        suggestion: str = None,
        detect_labels: List[CctDetectCheckLabel] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # biz_request_id
        self.biz_request_id = biz_request_id
        # suggestion
        self.suggestion = suggestion
        # detect_labels
        self.detect_labels = detect_labels

    def validate(self):
        if self.detect_labels:
            for k in self.detect_labels:
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
        if self.biz_request_id is not None:
            result['biz_request_id'] = self.biz_request_id
        if self.suggestion is not None:
            result['suggestion'] = self.suggestion
        result['detect_labels'] = []
        if self.detect_labels is not None:
            for k in self.detect_labels:
                result['detect_labels'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_request_id') is not None:
            self.biz_request_id = m.get('biz_request_id')
        if m.get('suggestion') is not None:
            self.suggestion = m.get('suggestion')
        self.detect_labels = []
        if m.get('detect_labels') is not None:
            for k in m.get('detect_labels'):
                temp_model = CctDetectCheckLabel()
                self.detect_labels.append(temp_model.from_map(k))
        return self


class QueryRiskGeneralRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_code: str = None,
        encrypted_nonce: str = None,
        customer_id: str = None,
        biz_query_params: List[BizQueryParam] = None,
        ext_data: str = None,
        user_authorization: str = None,
        encrypt_method: str = None,
        encrypted_body: str = None,
        hash_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # x
        self.data_code = data_code
        # AES加密使用的随机数，对该随机数使用RaaS数据服务的公钥进行加密，随后传入；
        self.encrypted_nonce = encrypted_nonce
        # ISV的终端客户编码、征信机构的终端客户编码、公司内部部门ID，可以定制数据输出。
        self.customer_id = customer_id
        # 业务请求入参，兼容批量调用
        self.biz_query_params = biz_query_params
        # 拓展输入字段,
        self.ext_data = ext_data
        # 用于标记是否获得用户授权。
        # 1:获得授权（默认）
        # 0:未获得授权
        self.user_authorization = user_authorization
        # 默认AES128，后续可选SM2等国密
        self.encrypt_method = encrypt_method
        # 整个包体加密，二选一
        self.encrypted_body = encrypted_body
        # hash_type
        self.hash_type = hash_type

    def validate(self):
        self.validate_required(self.data_code, 'data_code')
        self.validate_required(self.encrypted_nonce, 'encrypted_nonce')
        self.validate_required(self.biz_query_params, 'biz_query_params')
        if self.biz_query_params:
            for k in self.biz_query_params:
                if k:
                    k.validate()
        self.validate_required(self.user_authorization, 'user_authorization')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_code is not None:
            result['data_code'] = self.data_code
        if self.encrypted_nonce is not None:
            result['encrypted_nonce'] = self.encrypted_nonce
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        result['biz_query_params'] = []
        if self.biz_query_params is not None:
            for k in self.biz_query_params:
                result['biz_query_params'].append(k.to_map() if k else None)
        if self.ext_data is not None:
            result['ext_data'] = self.ext_data
        if self.user_authorization is not None:
            result['user_authorization'] = self.user_authorization
        if self.encrypt_method is not None:
            result['encrypt_method'] = self.encrypt_method
        if self.encrypted_body is not None:
            result['encrypted_body'] = self.encrypted_body
        if self.hash_type is not None:
            result['hash_type'] = self.hash_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_code') is not None:
            self.data_code = m.get('data_code')
        if m.get('encrypted_nonce') is not None:
            self.encrypted_nonce = m.get('encrypted_nonce')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        self.biz_query_params = []
        if m.get('biz_query_params') is not None:
            for k in m.get('biz_query_params'):
                temp_model = BizQueryParam()
                self.biz_query_params.append(temp_model.from_map(k))
        if m.get('ext_data') is not None:
            self.ext_data = m.get('ext_data')
        if m.get('user_authorization') is not None:
            self.user_authorization = m.get('user_authorization')
        if m.get('encrypt_method') is not None:
            self.encrypt_method = m.get('encrypt_method')
        if m.get('encrypted_body') is not None:
            self.encrypted_body = m.get('encrypted_body')
        if m.get('hash_type') is not None:
            self.hash_type = m.get('hash_type')
        return self


class QueryRiskGeneralResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        meter: bool = None,
        meter_count: int = None,
        result_list: List[ResultList] = None,
        ext_data: str = None,
        found: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否计费
        self.meter = meter
        # 批量调用情况下的计费数量
        self.meter_count = meter_count
        # 风险咨询结果的批量查询结果
        self.result_list = result_list
        # 拓展输出字段
        self.ext_data = ext_data
        # 是否查得
        self.found = found

    def validate(self):
        if self.result_list:
            for k in self.result_list:
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
        if self.meter is not None:
            result['meter'] = self.meter
        if self.meter_count is not None:
            result['meter_count'] = self.meter_count
        result['result_list'] = []
        if self.result_list is not None:
            for k in self.result_list:
                result['result_list'].append(k.to_map() if k else None)
        if self.ext_data is not None:
            result['ext_data'] = self.ext_data
        if self.found is not None:
            result['found'] = self.found
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('meter') is not None:
            self.meter = m.get('meter')
        if m.get('meter_count') is not None:
            self.meter_count = m.get('meter_count')
        self.result_list = []
        if m.get('result_list') is not None:
            for k in m.get('result_list'):
                temp_model = ResultList()
                self.result_list.append(temp_model.from_map(k))
        if m.get('ext_data') is not None:
            self.ext_data = m.get('ext_data')
        if m.get('found') is not None:
            self.found = m.get('found')
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


class QueryEkytDriverRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        head: RequestHead = None,
        request: str = None,
        signature: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 接口请求head
        self.head = head
        # 请求业务参数，加密之后的密文信息
        self.request = request
        # 请求数据签名值
        self.signature = signature

    def validate(self):
        self.validate_required(self.head, 'head')
        if self.head:
            self.head.validate()
        self.validate_required(self.request, 'request')
        self.validate_required(self.signature, 'signature')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.head is not None:
            result['head'] = self.head.to_map()
        if self.request is not None:
            result['request'] = self.request
        if self.signature is not None:
            result['signature'] = self.signature
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('head') is not None:
            temp_model = RequestHead()
            self.head = temp_model.from_map(m['head'])
        if m.get('request') is not None:
            self.request = m.get('request')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        return self


class QueryEkytDriverResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        message: str = None,
        data: IifaaEkytResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 接口响应结果
        self.success = success
        # 接口响应描述
        self.message = message
        # 接口响应数据
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
        if m.get('data') is not None:
            temp_model = IifaaEkytResponse()
            self.data = temp_model.from_map(m['data'])
        return self


class ApplyIifaaDevicekeyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        head: RequestHead = None,
        request: str = None,
        signature: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求头
        self.head = head
        # 业务参数
        self.request = request
        # 签名
        self.signature = signature

    def validate(self):
        self.validate_required(self.head, 'head')
        if self.head:
            self.head.validate()
        self.validate_required(self.request, 'request')
        self.validate_required(self.signature, 'signature')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.head is not None:
            result['head'] = self.head.to_map()
        if self.request is not None:
            result['request'] = self.request
        if self.signature is not None:
            result['signature'] = self.signature
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('head') is not None:
            temp_model = RequestHead()
            self.head = temp_model.from_map(m['head'])
        if m.get('request') is not None:
            self.request = m.get('request')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        return self


class ApplyIifaaDevicekeyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        message: str = None,
        data: IifaaEkytResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 响应结果
        self.success = success
        # 结果描述
        self.message = message
        # 业务响应结果
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
        if m.get('data') is not None:
            temp_model = IifaaEkytResponse()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryDeviceplusRiskqueryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        client_id: str = None,
        scene_code: str = None,
        phone_number: str = None,
        phone_number_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户id
        self.client_id = client_id
        # 场景码
        self.scene_code = scene_code
        # 加密电话号码
        self.phone_number = phone_number
        # 电话号码加密类型, 明文: 0; MD5加密: 1; SHA256: 2
        self.phone_number_type = phone_number_type

    def validate(self):
        self.validate_required(self.client_id, 'client_id')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.phone_number, 'phone_number')
        self.validate_required(self.phone_number_type, 'phone_number_type')

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
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.phone_number is not None:
            result['phone_number'] = self.phone_number
        if self.phone_number_type is not None:
            result['phone_number_type'] = self.phone_number_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('client_id') is not None:
            self.client_id = m.get('client_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('phone_number') is not None:
            self.phone_number = m.get('phone_number')
        if m.get('phone_number_type') is not None:
            self.phone_number_type = m.get('phone_number_type')
        return self


class QueryDeviceplusRiskqueryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        code: int = None,
        message: str = None,
        request_id: str = None,
        data: RiskQueryData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success
        # 返回码
        self.code = code
        # 返回信息
        self.message = message
        # 供nearx排查的链路业务请求id
        self.request_id = request_id
        # 风险咨询信息
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
            temp_model = RiskQueryData()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryDeviceplusMpaasRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        model_id: str = None,
        workspace_id: str = None,
        app_id: str = None,
        scene_code: str = None,
        phone_number: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 评分模型id
        self.model_id = model_id
        # mpaas环境id
        self.workspace_id = workspace_id
        # mpaas应用id
        self.app_id = app_id
        # 场景码
        self.scene_code = scene_code
        # 加密电话号码
        self.phone_number = phone_number

    def validate(self):
        self.validate_required(self.model_id, 'model_id')
        self.validate_required(self.workspace_id, 'workspace_id')
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.phone_number, 'phone_number')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.phone_number is not None:
            result['phone_number'] = self.phone_number
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('phone_number') is not None:
            self.phone_number = m.get('phone_number')
        return self


class QueryDeviceplusMpaasResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        code: int = None,
        message: str = None,
        request_id: str = None,
        data: RiskQueryData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success
        # 返回码
        self.code = code
        # 返回信息
        self.message = message
        # 供nearx排查的链路业务请求id
        self.request_id = request_id
        # 风险咨询信息
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
            temp_model = RiskQueryData()
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
        # .
        self.request_id = request_id
        # res_success
        self.res_success = res_success
        # res_code
        self.res_code = res_code
        # res_message
        self.res_message = res_message
        # .
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


class InitEkytTrustsignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        head: RequestHead = None,
        sign_user: str = None,
        rect_id: str = None,
        solution_code: str = None,
        out_order_no: str = None,
        app_id: str = None,
        user_authorization: str = None,
        ext_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求头
        self.head = head
        # 签约用户信息
        self.sign_user = sign_user
        # 控件key-value
        self.rect_id = rect_id
        # 签约方案码
        self.solution_code = solution_code
        # 发起签约的外部流水号
        self.out_order_no = out_order_no
        # 小程序appId
        self.app_id = app_id
        # 用户授权标识
        self.user_authorization = user_authorization
        # 扩展信息
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.head, 'head')
        if self.head:
            self.head.validate()
        self.validate_required(self.sign_user, 'sign_user')
        self.validate_required(self.solution_code, 'solution_code')
        self.validate_required(self.out_order_no, 'out_order_no')
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.user_authorization, 'user_authorization')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.head is not None:
            result['head'] = self.head.to_map()
        if self.sign_user is not None:
            result['sign_user'] = self.sign_user
        if self.rect_id is not None:
            result['rect_id'] = self.rect_id
        if self.solution_code is not None:
            result['solution_code'] = self.solution_code
        if self.out_order_no is not None:
            result['out_order_no'] = self.out_order_no
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.user_authorization is not None:
            result['user_authorization'] = self.user_authorization
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('head') is not None:
            temp_model = RequestHead()
            self.head = temp_model.from_map(m['head'])
        if m.get('sign_user') is not None:
            self.sign_user = m.get('sign_user')
        if m.get('rect_id') is not None:
            self.rect_id = m.get('rect_id')
        if m.get('solution_code') is not None:
            self.solution_code = m.get('solution_code')
        if m.get('out_order_no') is not None:
            self.out_order_no = m.get('out_order_no')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('user_authorization') is not None:
            self.user_authorization = m.get('user_authorization')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class InitEkytTrustsignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        message: str = None,
        data: TrustSignInitData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 响应结果
        self.success = success
        # 结果描述
        self.message = message
        # 可信签约初始化数据
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
        if m.get('data') is not None:
            temp_model = TrustSignInitData()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryEkytTrustsignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        head: RequestHead = None,
        app_id: str = None,
        out_order_no: str = None,
        solution_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求头
        self.head = head
        # 小程序appId
        self.app_id = app_id
        # 发起签约的外部流水号
        self.out_order_no = out_order_no
        # 签约方案码
        self.solution_code = solution_code

    def validate(self):
        self.validate_required(self.head, 'head')
        if self.head:
            self.head.validate()
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.out_order_no, 'out_order_no')
        self.validate_required(self.solution_code, 'solution_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.head is not None:
            result['head'] = self.head.to_map()
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.out_order_no is not None:
            result['out_order_no'] = self.out_order_no
        if self.solution_code is not None:
            result['solution_code'] = self.solution_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('head') is not None:
            temp_model = RequestHead()
            self.head = temp_model.from_map(m['head'])
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('out_order_no') is not None:
            self.out_order_no = m.get('out_order_no')
        if m.get('solution_code') is not None:
            self.solution_code = m.get('solution_code')
        return self


class QueryEkytTrustsignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        message: str = None,
        data: TrustSignQueryData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 响应结果
        self.success = success
        # 结果描述
        self.message = message
        # 可信签约签约单数据
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
        if m.get('data') is not None:
            temp_model = TrustSignQueryData()
            self.data = temp_model.from_map(m['data'])
        return self


class InitEkytFaceverifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        head: RequestHead = None,
        cert_name: str = None,
        cert_no: str = None,
        enc_type: str = None,
        outer_order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求头
        self.head = head
        # 姓名
        self.cert_name = cert_name
        # 身份证号
        self.cert_no = cert_no
        # 加密方式；0：明文；1：RSA；2：SM2
        self.enc_type = enc_type
        # 商户请求的唯一标识
        self.outer_order_no = outer_order_no

    def validate(self):
        self.validate_required(self.head, 'head')
        if self.head:
            self.head.validate()
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.outer_order_no, 'outer_order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.head is not None:
            result['head'] = self.head.to_map()
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.enc_type is not None:
            result['enc_type'] = self.enc_type
        if self.outer_order_no is not None:
            result['outer_order_no'] = self.outer_order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('head') is not None:
            temp_model = RequestHead()
            self.head = temp_model.from_map(m['head'])
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('enc_type') is not None:
            self.enc_type = m.get('enc_type')
        if m.get('outer_order_no') is not None:
            self.outer_order_no = m.get('outer_order_no')
        return self


class InitEkytFaceverifyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        message: str = None,
        data: FaceVerifyInitData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 响应结果
        self.success = success
        # 结果描述
        self.message = message
        # 人脸核身初始化数据
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
        if m.get('data') is not None:
            temp_model = FaceVerifyInitData()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryEkytFaceverifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        head: RequestHead = None,
        certify_id: str = None,
        outer_order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求头
        self.head = head
        # 可信实人认证的唯一标识
        self.certify_id = certify_id
        # 商户请求的唯一标识
        self.outer_order_no = outer_order_no

    def validate(self):
        self.validate_required(self.head, 'head')
        if self.head:
            self.head.validate()
        self.validate_required(self.certify_id, 'certify_id')
        self.validate_required(self.outer_order_no, 'outer_order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.head is not None:
            result['head'] = self.head.to_map()
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        if self.outer_order_no is not None:
            result['outer_order_no'] = self.outer_order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('head') is not None:
            temp_model = RequestHead()
            self.head = temp_model.from_map(m['head'])
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('outer_order_no') is not None:
            self.outer_order_no = m.get('outer_order_no')
        return self


class QueryEkytFaceverifyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        message: str = None,
        data: FaceVerifyResultData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 响应结果
        self.success = success
        # 结果描述
        self.message = message
        # 人脸核身结果数据
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
        if m.get('data') is not None:
            temp_model = FaceVerifyResultData()
            self.data = temp_model.from_map(m['data'])
        return self


class ImportYhllRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        shop_uuid: str = None,
        name: str = None,
        description: str = None,
        good_type: str = None,
        template_name: str = None,
        industry: str = None,
        address: str = None,
        city_code: str = None,
        longitude: str = None,
        latitude: str = None,
        coordinate_range: str = None,
        total: int = None,
        place_holder: str = None,
        ext_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # shopUuid
        self.shop_uuid = shop_uuid
        # 名称
        self.name = name
        # 描述
        self.description = description
        # 任务类型
        self.good_type = good_type
        # 模板名
        self.template_name = template_name
        # 行业
        self.industry = industry
        # 地址
        self.address = address
        # 城市代码
        self.city_code = city_code
        # 经度
        self.longitude = longitude
        # 纬度
        self.latitude = latitude
        # 坐标范围
        self.coordinate_range = coordinate_range
        # 总量
        self.total = total
        # 模板替换符
        self.place_holder = place_holder
        # 补充信息
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.shop_uuid, 'shop_uuid')
        self.validate_required(self.name, 'name')
        self.validate_required(self.description, 'description')
        self.validate_required(self.good_type, 'good_type')
        self.validate_required(self.template_name, 'template_name')
        self.validate_required(self.industry, 'industry')
        self.validate_required(self.address, 'address')
        self.validate_required(self.city_code, 'city_code')
        self.validate_required(self.total, 'total')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.shop_uuid is not None:
            result['shop_uuid'] = self.shop_uuid
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.good_type is not None:
            result['good_type'] = self.good_type
        if self.template_name is not None:
            result['template_name'] = self.template_name
        if self.industry is not None:
            result['industry'] = self.industry
        if self.address is not None:
            result['address'] = self.address
        if self.city_code is not None:
            result['city_code'] = self.city_code
        if self.longitude is not None:
            result['longitude'] = self.longitude
        if self.latitude is not None:
            result['latitude'] = self.latitude
        if self.coordinate_range is not None:
            result['coordinate_range'] = self.coordinate_range
        if self.total is not None:
            result['total'] = self.total
        if self.place_holder is not None:
            result['place_holder'] = self.place_holder
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('shop_uuid') is not None:
            self.shop_uuid = m.get('shop_uuid')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('good_type') is not None:
            self.good_type = m.get('good_type')
        if m.get('template_name') is not None:
            self.template_name = m.get('template_name')
        if m.get('industry') is not None:
            self.industry = m.get('industry')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('city_code') is not None:
            self.city_code = m.get('city_code')
        if m.get('longitude') is not None:
            self.longitude = m.get('longitude')
        if m.get('latitude') is not None:
            self.latitude = m.get('latitude')
        if m.get('coordinate_range') is not None:
            self.coordinate_range = m.get('coordinate_range')
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('place_holder') is not None:
            self.place_holder = m.get('place_holder')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class ImportYhllResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        uuid: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # uuid
        self.uuid = uuid

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
        if self.uuid is not None:
            result['uuid'] = self.uuid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('uuid') is not None:
            self.uuid = m.get('uuid')
        return self


class QueryYhllRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        city_code: str = None,
        uuid: str = None,
        page_size: int = None,
        page_num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 城市编码
        self.city_code = city_code
        # uuid
        self.uuid = uuid
        # page size
        self.page_size = page_size
        # page number
        self.page_num = page_num

    def validate(self):
        self.validate_required(self.city_code, 'city_code')
        self.validate_required(self.uuid, 'uuid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.city_code is not None:
            result['city_code'] = self.city_code
        if self.uuid is not None:
            result['uuid'] = self.uuid
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page_num is not None:
            result['page_num'] = self.page_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('city_code') is not None:
            self.city_code = m.get('city_code')
        if m.get('uuid') is not None:
            self.uuid = m.get('uuid')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        return self


class QueryYhllResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        open_task_result_list: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # total
        self.total = total
        # open_task_result_list
        self.open_task_result_list = open_task_result_list

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
        if self.total is not None:
            result['total'] = self.total
        if self.open_task_result_list is not None:
            result['open_task_result_list'] = self.open_task_result_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('open_task_result_list') is not None:
            self.open_task_result_list = m.get('open_task_result_list')
        return self


class QueryGuardAskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        session_id: str = None,
        request_id: str = None,
        service_code: str = None,
        question: str = None,
        question_format: str = None,
        scene_code: str = None,
        app_code: str = None,
        raas_products: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 会话ID，用于匹配多轮对话上下文
        self.session_id = session_id
        # 数据唯一标识，能够根据该值定位到该条数据
        self.request_id = request_id
        # serviceCode
        self.service_code = service_code
        # 当前提问内容，最大长度10000个字符。
        self.question = question
        # 提问内容类型，纯文本: PLAINTEXT，图片url: PICTURE_URL
        self.question_format = question_format
        # scene_code
        self.scene_code = scene_code
        # app_code
        self.app_code = app_code
        # raas_products
        self.raas_products = raas_products

    def validate(self):
        self.validate_required(self.session_id, 'session_id')
        if self.session_id is not None:
            self.validate_max_length(self.session_id, 'session_id', 128)
        self.validate_required(self.request_id, 'request_id')
        if self.request_id is not None:
            self.validate_max_length(self.request_id, 'request_id', 64)
        self.validate_required(self.service_code, 'service_code')
        self.validate_required(self.question, 'question')
        if self.question is not None:
            self.validate_max_length(self.question, 'question', 10000)
        if self.question_format is not None:
            self.validate_max_length(self.question_format, 'question_format', 32)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.service_code is not None:
            result['service_code'] = self.service_code
        if self.question is not None:
            result['question'] = self.question
        if self.question_format is not None:
            result['question_format'] = self.question_format
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.app_code is not None:
            result['app_code'] = self.app_code
        if self.raas_products is not None:
            result['raas_products'] = self.raas_products
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('service_code') is not None:
            self.service_code = m.get('service_code')
        if m.get('question') is not None:
            self.question = m.get('question')
        if m.get('question_format') is not None:
            self.question_format = m.get('question_format')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('app_code') is not None:
            self.app_code = m.get('app_code')
        if m.get('raas_products') is not None:
            self.raas_products = m.get('raas_products')
        return self


class QueryGuardAskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        request_id: str = None,
        safe: bool = None,
        action_code: str = None,
        action_msg: str = None,
        session_action: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 检测数据ID
        self.request_id = request_id
        # 是否安全无风险，true: 安全无风险，false: 有风险
        self.safe = safe
        # 安全动作，拦截: BLOCK，安全代答: SECURITY_ANSWER，红色GPT安全代答: REDGPT_ANSWER，安全提示增强: SECURITY_PROMPT
        self.action_code = action_code
        # 安全动作相关文案
        self.action_msg = action_msg
        # 会话动作，终止会话: END_SESSION，撤回提问: RECALL_QUERY
        self.session_action = session_action

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
        if self.safe is not None:
            result['safe'] = self.safe
        if self.action_code is not None:
            result['action_code'] = self.action_code
        if self.action_msg is not None:
            result['action_msg'] = self.action_msg
        if self.session_action is not None:
            result['session_action'] = self.session_action
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
        if m.get('safe') is not None:
            self.safe = m.get('safe')
        if m.get('action_code') is not None:
            self.action_code = m.get('action_code')
        if m.get('action_msg') is not None:
            self.action_msg = m.get('action_msg')
        if m.get('session_action') is not None:
            self.session_action = m.get('session_action')
        return self


class QueryGuardAnswerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        session_id: str = None,
        request_id: str = None,
        service_code: str = None,
        answer: str = None,
        question: str = None,
        question_format: str = None,
        answer_format: str = None,
        scene_code: str = None,
        app_code: str = None,
        raas_products: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 会话ID，用于匹配多轮对话上下文
        self.session_id = session_id
        # 数据唯一标识，能够根据该值定位到该条数据
        self.request_id = request_id
        # service_code
        self.service_code = service_code
        # 作为一个人工智能语言模型，我还没有学习到相关信息，不过我觉得梦里啥都有，建议您保持充分的睡眠。
        self.answer = answer
        # 作为一个解梦者，你的任务是解释以下梦境:[上证30000点，没错，是三万不是三千]。根据梦中出现的符号和主题，请提供一份客观且基于事实的解释。
        self.question = question
        # 纯文本: PLAINTEXT，图片url: PICTURE_URL
        self.question_format = question_format
        # 纯文本: PLAINTEXT
        # 图片url: PICTURE_URL
        self.answer_format = answer_format
        # scene_code
        self.scene_code = scene_code
        # app_code
        self.app_code = app_code
        # raas_products
        self.raas_products = raas_products

    def validate(self):
        self.validate_required(self.session_id, 'session_id')
        if self.session_id is not None:
            self.validate_max_length(self.session_id, 'session_id', 128)
        self.validate_required(self.request_id, 'request_id')
        if self.request_id is not None:
            self.validate_max_length(self.request_id, 'request_id', 64)
        self.validate_required(self.service_code, 'service_code')
        if self.service_code is not None:
            self.validate_max_length(self.service_code, 'service_code', 128)
        self.validate_required(self.answer, 'answer')
        if self.answer is not None:
            self.validate_max_length(self.answer, 'answer', 10000)
        if self.question is not None:
            self.validate_max_length(self.question, 'question', 800)
        if self.question_format is not None:
            self.validate_max_length(self.question_format, 'question_format', 32)
        if self.answer_format is not None:
            self.validate_max_length(self.answer_format, 'answer_format', 32)
        if self.scene_code is not None:
            self.validate_max_length(self.scene_code, 'scene_code', 128)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.service_code is not None:
            result['service_code'] = self.service_code
        if self.answer is not None:
            result['answer'] = self.answer
        if self.question is not None:
            result['question'] = self.question
        if self.question_format is not None:
            result['question_format'] = self.question_format
        if self.answer_format is not None:
            result['answer_format'] = self.answer_format
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.app_code is not None:
            result['app_code'] = self.app_code
        if self.raas_products is not None:
            result['raas_products'] = self.raas_products
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('service_code') is not None:
            self.service_code = m.get('service_code')
        if m.get('answer') is not None:
            self.answer = m.get('answer')
        if m.get('question') is not None:
            self.question = m.get('question')
        if m.get('question_format') is not None:
            self.question_format = m.get('question_format')
        if m.get('answer_format') is not None:
            self.answer_format = m.get('answer_format')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('app_code') is not None:
            self.app_code = m.get('app_code')
        if m.get('raas_products') is not None:
            self.raas_products = m.get('raas_products')
        return self


class QueryGuardAnswerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        request_id: str = None,
        safe: bool = None,
        action_code: str = None,
        action_msg: str = None,
        session_action: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 检测数据ID
        self.request_id = request_id
        # 是否安全无风险
        self.safe = safe
        # 拦截: BLOCK
        # 安全代答: SECURITY_ANSWER
        # 红色GPT安全代答: REDGPT_ANSWER
        # 回答里补充安全提示: SECURITY_TIP
        self.action_code = action_code
        # 安全提示增强的文案、安全代答的回答、回答里补充的安全提示
        self.action_msg = action_msg
        # 终止会话: END_SESSION
        # 撤回提问: RECALL_QUERY
        self.session_action = session_action

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
        if self.safe is not None:
            result['safe'] = self.safe
        if self.action_code is not None:
            result['action_code'] = self.action_code
        if self.action_msg is not None:
            result['action_msg'] = self.action_msg
        if self.session_action is not None:
            result['session_action'] = self.session_action
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
        if m.get('safe') is not None:
            self.safe = m.get('safe')
        if m.get('action_code') is not None:
            self.action_code = m.get('action_code')
        if m.get('action_msg') is not None:
            self.action_msg = m.get('action_msg')
        if m.get('session_action') is not None:
            self.session_action = m.get('session_action')
        return self


class DeleteIifaaDigitalkeyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        head: RequestHead = None,
        request: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求头
        self.head = head
        # 业务参数
        self.request = request

    def validate(self):
        self.validate_required(self.head, 'head')
        if self.head:
            self.head.validate()
        self.validate_required(self.request, 'request')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.head is not None:
            result['head'] = self.head.to_map()
        if self.request is not None:
            result['request'] = self.request
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('head') is not None:
            temp_model = RequestHead()
            self.head = temp_model.from_map(m['head'])
        if m.get('request') is not None:
            self.request = m.get('request')
        return self


class DeleteIifaaDigitalkeyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回值
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


class CheckOpticalIdentifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        reserved_data: str = None,
        image_url: str = None,
        image_content: str = None,
        raas_products: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # json数据，包含tenantId,sceneId,outBizId,fakeType,certType
        self.reserved_data = reserved_data
        # 图片链接,image_url和image_content 2选1优先选择image_content
        self.image_url = image_url
        # base64编码的图片,image_url和image_content 2选1，优先选择image_content
        self.image_content = image_content
        # raas产品码
        self.raas_products = raas_products

    def validate(self):
        self.validate_required(self.reserved_data, 'reserved_data')
        self.validate_required(self.raas_products, 'raas_products')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.reserved_data is not None:
            result['reserved_data'] = self.reserved_data
        if self.image_url is not None:
            result['image_url'] = self.image_url
        if self.image_content is not None:
            result['image_content'] = self.image_content
        if self.raas_products is not None:
            result['raas_products'] = self.raas_products
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('reserved_data') is not None:
            self.reserved_data = m.get('reserved_data')
        if m.get('image_url') is not None:
            self.image_url = m.get('image_url')
        if m.get('image_content') is not None:
            self.image_content = m.get('image_content')
        if m.get('raas_products') is not None:
            self.raas_products = m.get('raas_products')
        return self


class CheckOpticalIdentifyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: IdentityData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 光鉴智能凭证响应结果
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
            temp_model = IdentityData()
            self.data = temp_model.from_map(m['data'])
        return self


