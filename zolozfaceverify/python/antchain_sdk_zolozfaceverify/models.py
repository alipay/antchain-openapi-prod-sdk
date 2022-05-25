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


class MeteringDataDetail(TeaModel):
    def __init__(
        self,
        identify_passed_pv: int = None,
        identify_succeed_pv: int = None,
        metering_type: str = None,
        prod_start_pv: int = None,
        query_passed_pv: int = None,
        query_succeed_pv: int = None,
        usable_passed_pv: int = None,
        usable_start_pv: int = None,
    ):
        # 比对通过
        self.identify_passed_pv = identify_passed_pv
        # 上传服务端成功
        self.identify_succeed_pv = identify_succeed_pv
        # 计量类型
        self.metering_type = metering_type
        # 产品渲染（SDK唤起）
        self.prod_start_pv = prod_start_pv
        # 查询结果通过
        self.query_passed_pv = query_passed_pv
        # 发起查询
        self.query_succeed_pv = query_succeed_pv
        # 可用性检查通过
        self.usable_passed_pv = usable_passed_pv
        # 可用性检查开始
        self.usable_start_pv = usable_start_pv

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.identify_passed_pv is not None:
            result['identify_passed_pv'] = self.identify_passed_pv
        if self.identify_succeed_pv is not None:
            result['identify_succeed_pv'] = self.identify_succeed_pv
        if self.metering_type is not None:
            result['metering_type'] = self.metering_type
        if self.prod_start_pv is not None:
            result['prod_start_pv'] = self.prod_start_pv
        if self.query_passed_pv is not None:
            result['query_passed_pv'] = self.query_passed_pv
        if self.query_succeed_pv is not None:
            result['query_succeed_pv'] = self.query_succeed_pv
        if self.usable_passed_pv is not None:
            result['usable_passed_pv'] = self.usable_passed_pv
        if self.usable_start_pv is not None:
            result['usable_start_pv'] = self.usable_start_pv
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('identify_passed_pv') is not None:
            self.identify_passed_pv = m.get('identify_passed_pv')
        if m.get('identify_succeed_pv') is not None:
            self.identify_succeed_pv = m.get('identify_succeed_pv')
        if m.get('metering_type') is not None:
            self.metering_type = m.get('metering_type')
        if m.get('prod_start_pv') is not None:
            self.prod_start_pv = m.get('prod_start_pv')
        if m.get('query_passed_pv') is not None:
            self.query_passed_pv = m.get('query_passed_pv')
        if m.get('query_succeed_pv') is not None:
            self.query_succeed_pv = m.get('query_succeed_pv')
        if m.get('usable_passed_pv') is not None:
            self.usable_passed_pv = m.get('usable_passed_pv')
        if m.get('usable_start_pv') is not None:
            self.usable_start_pv = m.get('usable_start_pv')
        return self


class MeteringData(TeaModel):
    def __init__(
        self,
        end_time: str = None,
        metering_data_detail_list: List[MeteringDataDetail] = None,
        start_time: str = None,
    ):
        # endTime
        self.end_time = end_time
        # metering_data_detail_list
        self.metering_data_detail_list = metering_data_detail_list
        # startTime
        self.start_time = start_time

    def validate(self):
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.metering_data_detail_list:
            for k in self.metering_data_detail_list:
                if k:
                    k.validate()
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.end_time is not None:
            result['end_time'] = self.end_time
        result['metering_data_detail_list'] = []
        if self.metering_data_detail_list is not None:
            for k in self.metering_data_detail_list:
                result['metering_data_detail_list'].append(k.to_map() if k else None)
        if self.start_time is not None:
            result['start_time'] = self.start_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        self.metering_data_detail_list = []
        if m.get('metering_data_detail_list') is not None:
            for k in m.get('metering_data_detail_list'):
                temp_model = MeteringDataDetail()
                self.metering_data_detail_list.append(temp_model.from_map(k))
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        return self


class ExecFaceauthAlgorithmRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        channel: str = None,
        img_str: str = None,
        img_type: str = None,
        scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务ID
        self.biz_id = biz_id
        # 渠道
        self.channel = channel
        # base64图片
        self.img_str = img_str
        # Pano类型
        self.img_type = img_type
        # 场景
        self.scene = scene

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.channel, 'channel')
        self.validate_required(self.img_str, 'img_str')
        self.validate_required(self.img_type, 'img_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.channel is not None:
            result['channel'] = self.channel
        if self.img_str is not None:
            result['img_str'] = self.img_str
        if self.img_type is not None:
            result['img_type'] = self.img_type
        if self.scene is not None:
            result['scene'] = self.scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('img_str') is not None:
            self.img_str = m.get('img_str')
        if m.get('img_type') is not None:
            self.img_type = m.get('img_type')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        return self


class ExecFaceauthAlgorithmResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        algo_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 算法结果，json格式
        self.algo_result = algo_result

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
        if self.algo_result is not None:
            result['algo_result'] = self.algo_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('algo_result') is not None:
            self.algo_result = m.get('algo_result')
        return self


class FaceFaceauthInitializeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        extern_param: str = None,
        identity_param: str = None,
        metainfo: str = None,
        operation_type: str = None,
        ref_img: str = None,
        ref_img_oss_obj: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
        self.biz_id = biz_id
        # 预留扩展业务参数
        self.extern_param = extern_param
        # 用户身份信息
        self.identity_param = identity_param
        # metainfo环境参数
        self.metainfo = metainfo
        # 操作类型
        self.operation_type = operation_type
        # 比对源图片
        self.ref_img = ref_img
        # 比对源图片oss中转
        self.ref_img_oss_obj = ref_img_oss_obj

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.identity_param, 'identity_param')
        self.validate_required(self.metainfo, 'metainfo')
        self.validate_required(self.ref_img_oss_obj, 'ref_img_oss_obj')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.identity_param is not None:
            result['identity_param'] = self.identity_param
        if self.metainfo is not None:
            result['metainfo'] = self.metainfo
        if self.operation_type is not None:
            result['operation_type'] = self.operation_type
        if self.ref_img is not None:
            result['ref_img'] = self.ref_img
        if self.ref_img_oss_obj is not None:
            result['ref_img_oss_obj'] = self.ref_img_oss_obj
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('identity_param') is not None:
            self.identity_param = m.get('identity_param')
        if m.get('metainfo') is not None:
            self.metainfo = m.get('metainfo')
        if m.get('operation_type') is not None:
            self.operation_type = m.get('operation_type')
        if m.get('ref_img') is not None:
            self.ref_img = m.get('ref_img')
        if m.get('ref_img_oss_obj') is not None:
            self.ref_img_oss_obj = m.get('ref_img_oss_obj')
        return self


class FaceFaceauthInitializeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        extern_info: str = None,
        result_code_sub: str = None,
        result_msg_sub: str = None,
        zim_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.extern_info = extern_info
        # 产品结果明细，不影响决策
        self.result_code_sub = result_code_sub
        # result_code_sub对应的文案
        self.result_msg_sub = result_msg_sub
        # 实人认证id
        self.zim_id = zim_id

    def validate(self):
        self.validate_required(self.extern_info, 'extern_info')
        self.validate_required(self.result_code_sub, 'result_code_sub')
        self.validate_required(self.result_msg_sub, 'result_msg_sub')
        self.validate_required(self.zim_id, 'zim_id')

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        if self.result_code_sub is not None:
            result['result_code_sub'] = self.result_code_sub
        if self.result_msg_sub is not None:
            result['result_msg_sub'] = self.result_msg_sub
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        return self


class FaceFaceauthQueryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        extern_param: str = None,
        zim_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务单据号，用于核对和排查
        self.biz_id = biz_id
        # 预留扩展业务参数
        self.extern_param = extern_param
        # zimId，用于查询认证结果
        self.zim_id = zim_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.zim_id, 'zim_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        return self


class FaceFaceauthQueryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        extern_info: str = None,
        result_code_sub: str = None,
        result_msg_sub: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.extern_info = extern_info
        # 产品结果明细，不影响决策
        self.result_code_sub = result_code_sub
        # result_code_sub对应的文案
        self.result_msg_sub = result_msg_sub

    def validate(self):
        self.validate_required(self.extern_info, 'extern_info')
        self.validate_required(self.result_code_sub, 'result_code_sub')
        self.validate_required(self.result_msg_sub, 'result_msg_sub')

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        if self.result_code_sub is not None:
            result['result_code_sub'] = self.result_code_sub
        if self.result_msg_sub is not None:
            result['result_msg_sub'] = self.result_msg_sub
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        return self


class IdentityFaceauthServermodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        auth_img: str = None,
        auth_img_type: str = None,
        biz_id: str = None,
        extern_param: str = None,
        identity_param: str = None,
        operation_type: str = None,
        ref_img: str = None,
        auth_img_oss_obj: str = None,
        ref_img_oss_obj: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 活体照片，base64编码
        self.auth_img = auth_img
        # BLOB：使用客户端透传的BLOB数据
        # IMAGE：正常图片模式
        self.auth_img_type = auth_img_type
        # 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
        self.biz_id = biz_id
        # 预留扩展业务参数
        self.extern_param = extern_param
        # 用户身份信息
        self.identity_param = identity_param
        # 操作类型，NORMAL正常模式，CUSTOM用户自定义比对源
        self.operation_type = operation_type
        # 比对源照片，base64编码
        self.ref_img = ref_img
        # 活体照片oss中转方式上传
        self.auth_img_oss_obj = auth_img_oss_obj
        # 比对源照片oss中转方式上传
        self.ref_img_oss_obj = ref_img_oss_obj

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.auth_img is not None:
            result['auth_img'] = self.auth_img
        if self.auth_img_type is not None:
            result['auth_img_type'] = self.auth_img_type
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.identity_param is not None:
            result['identity_param'] = self.identity_param
        if self.operation_type is not None:
            result['operation_type'] = self.operation_type
        if self.ref_img is not None:
            result['ref_img'] = self.ref_img
        if self.auth_img_oss_obj is not None:
            result['auth_img_oss_obj'] = self.auth_img_oss_obj
        if self.ref_img_oss_obj is not None:
            result['ref_img_oss_obj'] = self.ref_img_oss_obj
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('auth_img') is not None:
            self.auth_img = m.get('auth_img')
        if m.get('auth_img_type') is not None:
            self.auth_img_type = m.get('auth_img_type')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('identity_param') is not None:
            self.identity_param = m.get('identity_param')
        if m.get('operation_type') is not None:
            self.operation_type = m.get('operation_type')
        if m.get('ref_img') is not None:
            self.ref_img = m.get('ref_img')
        if m.get('auth_img_oss_obj') is not None:
            self.auth_img_oss_obj = m.get('auth_img_oss_obj')
        if m.get('ref_img_oss_obj') is not None:
            self.ref_img_oss_obj = m.get('ref_img_oss_obj')
        return self


class IdentityFaceauthServermodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        extern_info: str = None,
        result_code_sub: str = None,
        result_msg_sub: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.extern_info = extern_info
        # 产品结果明细，不影响决策
        self.result_code_sub = result_code_sub
        # 明细返回码对应的文案
        self.result_msg_sub = result_msg_sub

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
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        if self.result_code_sub is not None:
            result['result_code_sub'] = self.result_code_sub
        if self.result_msg_sub is not None:
            result['result_msg_sub'] = self.result_msg_sub
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        return self


class InitializeFaceauthWebRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        extern_param: str = None,
        identity_param: str = None,
        metainfo: str = None,
        operation_type: str = None,
        ref_img: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
        self.biz_id = biz_id
        # 预留扩展业务参数
        self.extern_param = extern_param
        # 用户身份信息
        self.identity_param = identity_param
        # metainfo环境参数
        self.metainfo = metainfo
        # 操作类型
        self.operation_type = operation_type
        # 比对源图片
        self.ref_img = ref_img

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.identity_param is not None:
            result['identity_param'] = self.identity_param
        if self.metainfo is not None:
            result['metainfo'] = self.metainfo
        if self.operation_type is not None:
            result['operation_type'] = self.operation_type
        if self.ref_img is not None:
            result['ref_img'] = self.ref_img
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('identity_param') is not None:
            self.identity_param = m.get('identity_param')
        if m.get('metainfo') is not None:
            self.metainfo = m.get('metainfo')
        if m.get('operation_type') is not None:
            self.operation_type = m.get('operation_type')
        if m.get('ref_img') is not None:
            self.ref_img = m.get('ref_img')
        return self


class InitializeFaceauthWebResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        extern_info: str = None,
        result_code_sub: str = None,
        result_msg_sub: str = None,
        zim_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.extern_info = extern_info
        # 产品结果明细，不影响决策
        self.result_code_sub = result_code_sub
        # result_code_sub对应的文案
        self.result_msg_sub = result_msg_sub
        # 实人认证id
        self.zim_id = zim_id

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
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        if self.result_code_sub is not None:
            result['result_code_sub'] = self.result_code_sub
        if self.result_msg_sub is not None:
            result['result_msg_sub'] = self.result_msg_sub
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        return self


class QueryFaceauthWebRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        extern_param: str = None,
        zim_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务单据号，用于核对和排查问题
        self.biz_id = biz_id
        # 预留扩展业务参数
        self.extern_param = extern_param
        # zimId，用于查询认证结果
        self.zim_id = zim_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.zim_id, 'zim_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        return self


class QueryFaceauthWebResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        extern_info: str = None,
        result_code_sub: str = None,
        result_msg_sub: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.extern_info = extern_info
        # 产品结果明细，不影响决策
        self.result_code_sub = result_code_sub
        # result_code_sub对应的文案
        self.result_msg_sub = result_msg_sub

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
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        if self.result_code_sub is not None:
            result['result_code_sub'] = self.result_code_sub
        if self.result_msg_sub is not None:
            result['result_msg_sub'] = self.result_msg_sub
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        return self


class QueryFaceauthMeteringRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        end_time: str = None,
        merchant_id: str = None,
        metering_type: str = None,
        start_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务流水号
        self.biz_id = biz_id
        # 截止时间（整小时）
        self.end_time = end_time
        # 初始化接口传入的二级商户id
        self.merchant_id = merchant_id
        # 需要查询的计量类型
        # 实名新用户:realNameNewUser
        # 实名老用户:realNameOldUser
        # 匿名注册:anonymousEnroll
        # 匿名比对:anonymousAuth
        # 
        self.metering_type = metering_type
        # 起始时间（整小时）
        self.start_time = start_time

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.end_time, 'end_time')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.start_time, 'start_time')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.metering_type is not None:
            result['metering_type'] = self.metering_type
        if self.start_time is not None:
            result['start_time'] = self.start_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('metering_type') is not None:
            self.metering_type = m.get('metering_type')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        return self


class QueryFaceauthMeteringResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        metering_data: MeteringData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 计量数据
        self.metering_data = metering_data

    def validate(self):
        if self.metering_data:
            self.metering_data.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.metering_data is not None:
            result['metering_data'] = self.metering_data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('metering_data') is not None:
            temp_model = MeteringData()
            self.metering_data = temp_model.from_map(m['metering_data'])
        return self


class InitFaceauthFaceLiteRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        extern_param: str = None,
        identity_param: str = None,
        metainfo: str = None,
        operation_type: str = None,
        ref_img: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
        self.biz_id = biz_id
        # 预留扩展业务参数
        self.extern_param = extern_param
        # 用户身份信息
        self.identity_param = identity_param
        # metainfo环境参数
        self.metainfo = metainfo
        # 操作类型
        self.operation_type = operation_type
        # 比对源图片
        self.ref_img = ref_img

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.identity_param, 'identity_param')
        self.validate_required(self.metainfo, 'metainfo')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.identity_param is not None:
            result['identity_param'] = self.identity_param
        if self.metainfo is not None:
            result['metainfo'] = self.metainfo
        if self.operation_type is not None:
            result['operation_type'] = self.operation_type
        if self.ref_img is not None:
            result['ref_img'] = self.ref_img
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('identity_param') is not None:
            self.identity_param = m.get('identity_param')
        if m.get('metainfo') is not None:
            self.metainfo = m.get('metainfo')
        if m.get('operation_type') is not None:
            self.operation_type = m.get('operation_type')
        if m.get('ref_img') is not None:
            self.ref_img = m.get('ref_img')
        return self


class InitFaceauthFaceLiteResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        extern_info: str = None,
        protocol: str = None,
        result_code_sub: str = None,
        result_msg_sub: str = None,
        zim_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 扩展结果
        self.extern_info = extern_info
        # 人脸协议
        self.protocol = protocol
        # 产品结果明细，不影响决策
        self.result_code_sub = result_code_sub
        # 明细返回码对应的文案
        self.result_msg_sub = result_msg_sub
        # 刷脸认证唯一标识。如果初始化失败则为空，可通过返回码分析具体原因
        self.zim_id = zim_id

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
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        if self.protocol is not None:
            result['protocol'] = self.protocol
        if self.result_code_sub is not None:
            result['result_code_sub'] = self.result_code_sub
        if self.result_msg_sub is not None:
            result['result_msg_sub'] = self.result_msg_sub
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        if m.get('protocol') is not None:
            self.protocol = m.get('protocol')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        return self


class QueryFaceauthDataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        data_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务ID
        self.biz_id = biz_id
        # 数据地址
        self.data_url = data_url

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.data_url, 'data_url')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.data_url is not None:
            result['data_url'] = self.data_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('data_url') is not None:
            self.data_url = m.get('data_url')
        return self


class QueryFaceauthDataResponse(TeaModel):
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
        # 查询结果详情
        self.data = data

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


class ExecAuthenticationCustomerFaceabilityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ability: str = None,
        alg_ver: str = None,
        auth_img: str = None,
        biz_id: str = None,
        scene_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # extract(提取特征)、sex(检测性别)、rect(人脸矩形框识别)
        self.ability = ability
        # 算法版本
        self.alg_ver = alg_ver
        # 图片encode base64 String
        self.auth_img = auth_img
        # 业务接入方生成，唯一ID
        self.biz_id = biz_id
        # 场景码
        self.scene_code = scene_code

    def validate(self):
        self.validate_required(self.ability, 'ability')
        self.validate_required(self.alg_ver, 'alg_ver')
        self.validate_required(self.auth_img, 'auth_img')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.scene_code, 'scene_code')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ability is not None:
            result['ability'] = self.ability
        if self.alg_ver is not None:
            result['alg_ver'] = self.alg_ver
        if self.auth_img is not None:
            result['auth_img'] = self.auth_img
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ability') is not None:
            self.ability = m.get('ability')
        if m.get('alg_ver') is not None:
            self.alg_ver = m.get('alg_ver')
        if m.get('auth_img') is not None:
            self.auth_img = m.get('auth_img')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        return self


class ExecAuthenticationCustomerFaceabilityResponse(TeaModel):
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


class InitFaceauthZimRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_data: str = None,
        channel: str = None,
        merchant: str = None,
        meta_info: str = None,
        produce_node: str = None,
        product_name: str = None,
        zim_id: str = None,
        zim_principal: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务参数
        self.biz_data = biz_data
        # 渠道
        self.channel = channel
        # 商户
        self.merchant = merchant
        # 环境参数
        self.meta_info = meta_info
        # 产品节点
        self.produce_node = produce_node
        # 产品名称
        self.product_name = product_name
        # 实人认证id
        self.zim_id = zim_id
        # 身份信息参数
        self.zim_principal = zim_principal

    def validate(self):
        self.validate_required(self.meta_info, 'meta_info')
        self.validate_required(self.zim_id, 'zim_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_data is not None:
            result['biz_data'] = self.biz_data
        if self.channel is not None:
            result['channel'] = self.channel
        if self.merchant is not None:
            result['merchant'] = self.merchant
        if self.meta_info is not None:
            result['meta_info'] = self.meta_info
        if self.produce_node is not None:
            result['produce_node'] = self.produce_node
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
        if self.zim_principal is not None:
            result['zim_principal'] = self.zim_principal
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_data') is not None:
            self.biz_data = m.get('biz_data')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('merchant') is not None:
            self.merchant = m.get('merchant')
        if m.get('meta_info') is not None:
            self.meta_info = m.get('meta_info')
        if m.get('produce_node') is not None:
            self.produce_node = m.get('produce_node')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        if m.get('zim_principal') is not None:
            self.zim_principal = m.get('zim_principal')
        return self


class InitFaceauthZimResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ext_params: str = None,
        message: str = None,
        protocol: str = None,
        ret_code: str = None,
        ret_code_sub: str = None,
        ret_message_sub: str = None,
        zimi_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.ext_params = ext_params
        # 描述
        self.message = message
        # 协议
        self.protocol = protocol
        # 返回码
        self.ret_code = ret_code
        # 明细返回码
        self.ret_code_sub = ret_code_sub
        # 明细返回码对应的文案
        self.ret_message_sub = ret_message_sub
        # 实人认证id
        self.zimi_id = zimi_id

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
        if self.ext_params is not None:
            result['ext_params'] = self.ext_params
        if self.message is not None:
            result['message'] = self.message
        if self.protocol is not None:
            result['protocol'] = self.protocol
        if self.ret_code is not None:
            result['ret_code'] = self.ret_code
        if self.ret_code_sub is not None:
            result['ret_code_sub'] = self.ret_code_sub
        if self.ret_message_sub is not None:
            result['ret_message_sub'] = self.ret_message_sub
        if self.zimi_id is not None:
            result['zimi_id'] = self.zimi_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ext_params') is not None:
            self.ext_params = m.get('ext_params')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('protocol') is not None:
            self.protocol = m.get('protocol')
        if m.get('ret_code') is not None:
            self.ret_code = m.get('ret_code')
        if m.get('ret_code_sub') is not None:
            self.ret_code_sub = m.get('ret_code_sub')
        if m.get('ret_message_sub') is not None:
            self.ret_message_sub = m.get('ret_message_sub')
        if m.get('zimi_id') is not None:
            self.zimi_id = m.get('zimi_id')
        return self


class VerifyFaceauthZimRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        extern_param: str = None,
        zim_data: str = None,
        zim_id: str = None,
        zim_data_oss_obj: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 扩展信息,Map的json格式
        self.extern_param = extern_param
        # 人脸业务参数
        self.zim_data = zim_data
        # 实人认证id
        self.zim_id = zim_id
        # zim_data可通过oss方式中转
        self.zim_data_oss_obj = zim_data_oss_obj

    def validate(self):
        self.validate_required(self.zim_data, 'zim_data')
        self.validate_required(self.zim_id, 'zim_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.zim_data is not None:
            result['zim_data'] = self.zim_data
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
        if self.zim_data_oss_obj is not None:
            result['zim_data_oss_obj'] = self.zim_data_oss_obj
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('zim_data') is not None:
            self.zim_data = m.get('zim_data')
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        if m.get('zim_data_oss_obj') is not None:
            self.zim_data_oss_obj = m.get('zim_data_oss_obj')
        return self


class VerifyFaceauthZimResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ext_params: str = None,
        has_next: str = None,
        next_protocol: str = None,
        product_ret_code: str = None,
        ret_code_sub: str = None,
        ret_message_sub: str = None,
        validation_ret_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.ext_params = ext_params
        # ""
        self.has_next = has_next
        # ""
        self.next_protocol = next_protocol
        # 产品返回明细码
        self.product_ret_code = product_ret_code
        # 明细返回码
        self.ret_code_sub = ret_code_sub
        # 明细返回码对应的文案
        self.ret_message_sub = ret_message_sub
        # 验证返回明细码
        self.validation_ret_code = validation_ret_code

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
        if self.ext_params is not None:
            result['ext_params'] = self.ext_params
        if self.has_next is not None:
            result['has_next'] = self.has_next
        if self.next_protocol is not None:
            result['next_protocol'] = self.next_protocol
        if self.product_ret_code is not None:
            result['product_ret_code'] = self.product_ret_code
        if self.ret_code_sub is not None:
            result['ret_code_sub'] = self.ret_code_sub
        if self.ret_message_sub is not None:
            result['ret_message_sub'] = self.ret_message_sub
        if self.validation_ret_code is not None:
            result['validation_ret_code'] = self.validation_ret_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ext_params') is not None:
            self.ext_params = m.get('ext_params')
        if m.get('has_next') is not None:
            self.has_next = m.get('has_next')
        if m.get('next_protocol') is not None:
            self.next_protocol = m.get('next_protocol')
        if m.get('product_ret_code') is not None:
            self.product_ret_code = m.get('product_ret_code')
        if m.get('ret_code_sub') is not None:
            self.ret_code_sub = m.get('ret_code_sub')
        if m.get('ret_message_sub') is not None:
            self.ret_message_sub = m.get('ret_message_sub')
        if m.get('validation_ret_code') is not None:
            self.validation_ret_code = m.get('validation_ret_code')
        return self


class RecognizeFaceauthOcrRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_context: str = None,
        data_type: str = None,
        extern_param: str = None,
        side: str = None,
        zim_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据内容
        self.data_context = data_context
        # 数据类型：OSS_ADDR/BASE64_JPG
        self.data_type = data_type
        # 扩展字段
        self.extern_param = extern_param
        # face: 身份证正面 back: 身份证反面 缺省值是：face
        # 
        self.side = side
        # zimid
        self.zim_id = zim_id

    def validate(self):
        self.validate_required(self.data_context, 'data_context')
        self.validate_required(self.data_type, 'data_type')
        self.validate_required(self.side, 'side')
        self.validate_required(self.zim_id, 'zim_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_context is not None:
            result['data_context'] = self.data_context
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.side is not None:
            result['side'] = self.side
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_context') is not None:
            self.data_context = m.get('data_context')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('side') is not None:
            self.side = m.get('side')
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        return self


class RecognizeFaceauthOcrResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        extern_info: str = None,
        ocr_info: str = None,
        ret_code: str = None,
        ret_code_sub: str = None,
        ret_message_sub: str = None,
        side: str = None,
        zim_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # Map的json格式,预留
        self.extern_info = extern_info
        # Map的json格式：里面存储ocr识别的结果：
        # 
        # name:姓名
        # 
        # sex：性别
        # 
        # num：身份证号码
        # 
        # birth：出生年月日
        # 
        # address：地址
        # 
        # nationality：名族
        # 
        # start_date：身份证有效期开始时间
        # 
        # end_date：身份证有效期截止时间
        # 
        # issue：备案公安局
        self.ocr_info = ocr_info
        # 返回码
        self.ret_code = ret_code
        # 业务返回码
        # 
        self.ret_code_sub = ret_code_sub
        # 业务返回码描述
        # 
        self.ret_message_sub = ret_message_sub
        # face: 身份证正面 back: 身份证反面 缺省值是：face
        # 
        self.side = side
        # zimid
        self.zim_id = zim_id

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
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        if self.ocr_info is not None:
            result['ocr_info'] = self.ocr_info
        if self.ret_code is not None:
            result['ret_code'] = self.ret_code
        if self.ret_code_sub is not None:
            result['ret_code_sub'] = self.ret_code_sub
        if self.ret_message_sub is not None:
            result['ret_message_sub'] = self.ret_message_sub
        if self.side is not None:
            result['side'] = self.side
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        if m.get('ocr_info') is not None:
            self.ocr_info = m.get('ocr_info')
        if m.get('ret_code') is not None:
            self.ret_code = m.get('ret_code')
        if m.get('ret_code_sub') is not None:
            self.ret_code_sub = m.get('ret_code_sub')
        if m.get('ret_message_sub') is not None:
            self.ret_message_sub = m.get('ret_message_sub')
        if m.get('side') is not None:
            self.side = m.get('side')
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        return self


class InitFaceauthWebsdkRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        extern_param: str = None,
        identity_param: str = None,
        metainfo: str = None,
        operation_type: str = None,
        ref_img: str = None,
        ref_img_oss_obj: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
        self.biz_id = biz_id
        # 预留扩展业务参数
        self.extern_param = extern_param
        # 用户身份信息
        self.identity_param = identity_param
        # metainfo环境参数
        self.metainfo = metainfo
        # 操作类型
        self.operation_type = operation_type
        # 比对源图片
        self.ref_img = ref_img
        # 比对源照片oss方式中转
        self.ref_img_oss_obj = ref_img_oss_obj

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.identity_param is not None:
            result['identity_param'] = self.identity_param
        if self.metainfo is not None:
            result['metainfo'] = self.metainfo
        if self.operation_type is not None:
            result['operation_type'] = self.operation_type
        if self.ref_img is not None:
            result['ref_img'] = self.ref_img
        if self.ref_img_oss_obj is not None:
            result['ref_img_oss_obj'] = self.ref_img_oss_obj
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('identity_param') is not None:
            self.identity_param = m.get('identity_param')
        if m.get('metainfo') is not None:
            self.metainfo = m.get('metainfo')
        if m.get('operation_type') is not None:
            self.operation_type = m.get('operation_type')
        if m.get('ref_img') is not None:
            self.ref_img = m.get('ref_img')
        if m.get('ref_img_oss_obj') is not None:
            self.ref_img_oss_obj = m.get('ref_img_oss_obj')
        return self


class InitFaceauthWebsdkResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        extern_info: str = None,
        result_code_sub: str = None,
        result_msg_sub: str = None,
        zim_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.extern_info = extern_info
        # 产品结果明细，不影响决策
        self.result_code_sub = result_code_sub
        # result_code_sub对应的文案
        self.result_msg_sub = result_msg_sub
        # 实人认证id
        self.zim_id = zim_id

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
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        if self.result_code_sub is not None:
            result['result_code_sub'] = self.result_code_sub
        if self.result_msg_sub is not None:
            result['result_msg_sub'] = self.result_msg_sub
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        return self


class QueryFaceauthWebsdkRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        extern_param: str = None,
        zim_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务单据号，用于核对和排查问题
        self.biz_id = biz_id
        # 预留扩展业务参数
        self.extern_param = extern_param
        # zimId，用于查询认证结果
        self.zim_id = zim_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.zim_id, 'zim_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        return self


class QueryFaceauthWebsdkResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        extern_info: str = None,
        result_code_sub: str = None,
        result_msg_sub: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.extern_info = extern_info
        # 产品结果明细，不影响决策
        self.result_code_sub = result_code_sub
        # result_code_sub对应的文案
        self.result_msg_sub = result_msg_sub

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
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        if self.result_code_sub is not None:
            result['result_code_sub'] = self.result_code_sub
        if self.result_msg_sub is not None:
            result['result_msg_sub'] = self.result_msg_sub
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        return self


class QueryFaceauthFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        zim_id: str = None,
        extern_param: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # zoloz认证会话主键
        self.zim_id = zim_id
        # 预留扩展业务参数
        self.extern_param = extern_param

    def validate(self):
        self.validate_required(self.zim_id, 'zim_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        return self


class QueryFaceauthFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        extern_info: str = None,
        result_code_sub: str = None,
        result_msg_sub: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.extern_info = extern_info
        # 结果码
        self.result_code_sub = result_code_sub
        # result_code_sub对应的文案
        self.result_msg_sub = result_msg_sub

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
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        if self.result_code_sub is not None:
            result['result_code_sub'] = self.result_code_sub
        if self.result_msg_sub is not None:
            result['result_msg_sub'] = self.result_msg_sub
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        return self


class InitFaceauthFaceplusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        identity_param: str = None,
        metainfo: str = None,
        extern_param: str = None,
        operation_type: str = None,
        ref_img: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务唯一单号
        self.biz_id = biz_id
        # 身份，需要公钥加密
        self.identity_param = identity_param
        # 客户端采集
        self.metainfo = metainfo
        # 外部参数
        self.extern_param = extern_param
        # 操作类型
        self.operation_type = operation_type
        # 比对源图片
        self.ref_img = ref_img

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.identity_param, 'identity_param')
        self.validate_required(self.metainfo, 'metainfo')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.identity_param is not None:
            result['identity_param'] = self.identity_param
        if self.metainfo is not None:
            result['metainfo'] = self.metainfo
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.operation_type is not None:
            result['operation_type'] = self.operation_type
        if self.ref_img is not None:
            result['ref_img'] = self.ref_img
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('identity_param') is not None:
            self.identity_param = m.get('identity_param')
        if m.get('metainfo') is not None:
            self.metainfo = m.get('metainfo')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('operation_type') is not None:
            self.operation_type = m.get('operation_type')
        if m.get('ref_img') is not None:
            self.ref_img = m.get('ref_img')
        return self


class InitFaceauthFaceplusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        zim_id: str = None,
        result_code_sub: str = None,
        result_msg_sub: str = None,
        extern_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 认证会话唯一标识
        self.zim_id = zim_id
        # 结果码
        self.result_code_sub = result_code_sub
        # 结果信息
        self.result_msg_sub = result_msg_sub
        # 外部参数
        self.extern_info = extern_info

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
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
        if self.result_code_sub is not None:
            result['result_code_sub'] = self.result_code_sub
        if self.result_msg_sub is not None:
            result['result_msg_sub'] = self.result_msg_sub
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
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        return self


class QueryFaceauthFaceplusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        zim_id: str = None,
        biz_id: str = None,
        extern_param: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 认证会话唯一标识
        self.zim_id = zim_id
        # 唯一单号
        self.biz_id = biz_id
        # 外部参数
        self.extern_param = extern_param

    def validate(self):
        self.validate_required(self.zim_id, 'zim_id')
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        return self


class QueryFaceauthFaceplusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_code_sub: str = None,
        result_msg_sub: str = None,
        extern_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果码
        self.result_code_sub = result_code_sub
        # 结果信息
        self.result_msg_sub = result_msg_sub
        # 外部参数
        self.extern_info = extern_info

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
        if self.result_code_sub is not None:
            result['result_code_sub'] = self.result_code_sub
        if self.result_msg_sub is not None:
            result['result_msg_sub'] = self.result_msg_sub
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
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        return self


class InitFaceauthFaceWishRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        identity_param: str = None,
        metainfo: str = None,
        extern_param: str = None,
        operation_type: str = None,
        ref_img_oss_obj: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
        self.biz_id = biz_id
        # 身份，需要公钥加密
        self.identity_param = identity_param
        # 客户端采集
        self.metainfo = metainfo
        # 外部参数
        self.extern_param = extern_param
        # 操作类型
        self.operation_type = operation_type
        # 比对源图片oss中转
        self.ref_img_oss_obj = ref_img_oss_obj

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.identity_param, 'identity_param')
        self.validate_required(self.metainfo, 'metainfo')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.identity_param is not None:
            result['identity_param'] = self.identity_param
        if self.metainfo is not None:
            result['metainfo'] = self.metainfo
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.operation_type is not None:
            result['operation_type'] = self.operation_type
        if self.ref_img_oss_obj is not None:
            result['ref_img_oss_obj'] = self.ref_img_oss_obj
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('identity_param') is not None:
            self.identity_param = m.get('identity_param')
        if m.get('metainfo') is not None:
            self.metainfo = m.get('metainfo')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('operation_type') is not None:
            self.operation_type = m.get('operation_type')
        if m.get('ref_img_oss_obj') is not None:
            self.ref_img_oss_obj = m.get('ref_img_oss_obj')
        return self


class InitFaceauthFaceWishResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        zim_id: str = None,
        extern_info: str = None,
        result_code_sub: str = None,
        result_msg_sub: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 实人认证id
        self.zim_id = zim_id
        # 预留扩展结果
        self.extern_info = extern_info
        # 结果码
        self.result_code_sub = result_code_sub
        # 结果信息
        self.result_msg_sub = result_msg_sub

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
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        if self.result_code_sub is not None:
            result['result_code_sub'] = self.result_code_sub
        if self.result_msg_sub is not None:
            result['result_msg_sub'] = self.result_msg_sub
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        return self


class VerifyFaceauthVideoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        auth_img: str = None,
        auth_img_type: str = None,
        biz_id: str = None,
        extern_param: str = None,
        identity_param: str = None,
        operation_type: str = None,
        ref_img: str = None,
        auth_img_oss_obj: str = None,
        ref_img_oss_obj: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 活体照片，base64编码
        self.auth_img = auth_img
        # BLOB：使用客户端透传的BLOB数据 IMAGE：正常图片模式
        self.auth_img_type = auth_img_type
        # 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
        self.biz_id = biz_id
        # 预留扩展业务参数
        self.extern_param = extern_param
        # 用户身份信息
        self.identity_param = identity_param
        # 操作类型，NORMAL正常模式，CUSTOM用户自定义比对源
        self.operation_type = operation_type
        # 比对源照片，base64编码
        self.ref_img = ref_img
        # 活体照片oss中转方式上传
        self.auth_img_oss_obj = auth_img_oss_obj
        # 比对源照片oss中转方式上传
        self.ref_img_oss_obj = ref_img_oss_obj

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.auth_img is not None:
            result['auth_img'] = self.auth_img
        if self.auth_img_type is not None:
            result['auth_img_type'] = self.auth_img_type
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.identity_param is not None:
            result['identity_param'] = self.identity_param
        if self.operation_type is not None:
            result['operation_type'] = self.operation_type
        if self.ref_img is not None:
            result['ref_img'] = self.ref_img
        if self.auth_img_oss_obj is not None:
            result['auth_img_oss_obj'] = self.auth_img_oss_obj
        if self.ref_img_oss_obj is not None:
            result['ref_img_oss_obj'] = self.ref_img_oss_obj
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('auth_img') is not None:
            self.auth_img = m.get('auth_img')
        if m.get('auth_img_type') is not None:
            self.auth_img_type = m.get('auth_img_type')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('identity_param') is not None:
            self.identity_param = m.get('identity_param')
        if m.get('operation_type') is not None:
            self.operation_type = m.get('operation_type')
        if m.get('ref_img') is not None:
            self.ref_img = m.get('ref_img')
        if m.get('auth_img_oss_obj') is not None:
            self.auth_img_oss_obj = m.get('auth_img_oss_obj')
        if m.get('ref_img_oss_obj') is not None:
            self.ref_img_oss_obj = m.get('ref_img_oss_obj')
        return self


class VerifyFaceauthVideoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        extern_info: str = None,
        result_code_sub: str = None,
        result_msg_sub: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.extern_info = extern_info
        # 产品结果明细，不影响决策
        self.result_code_sub = result_code_sub
        # 明细返回码对应的文案
        self.result_msg_sub = result_msg_sub

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
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        if self.result_code_sub is not None:
            result['result_code_sub'] = self.result_code_sub
        if self.result_msg_sub is not None:
            result['result_msg_sub'] = self.result_msg_sub
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        return self


