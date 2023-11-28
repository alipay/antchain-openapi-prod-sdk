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


class LiveVideos(TeaModel):
    def __init__(
        self,
        live_id: str = None,
        scene_id: str = None,
        section_id: str = None,
        url: str = None,
        is_temp: bool = None,
        occurrence_time_stamp: int = None,
    ):
        # 蚂蚁数字人平台直播id
        self.live_id = live_id
        # 场景id
        self.scene_id = scene_id
        # 视频片段id
        self.section_id = section_id
        # 视频地址
        self.url = url
        # 是否插播，默认false
        self.is_temp = is_temp
        # 触发插播行为的时间戳，当isTemp为true时，存在该值
        self.occurrence_time_stamp = occurrence_time_stamp

    def validate(self):
        self.validate_required(self.live_id, 'live_id')
        self.validate_required(self.scene_id, 'scene_id')
        self.validate_required(self.section_id, 'section_id')
        self.validate_required(self.url, 'url')
        self.validate_required(self.is_temp, 'is_temp')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.live_id is not None:
            result['live_id'] = self.live_id
        if self.scene_id is not None:
            result['scene_id'] = self.scene_id
        if self.section_id is not None:
            result['section_id'] = self.section_id
        if self.url is not None:
            result['url'] = self.url
        if self.is_temp is not None:
            result['is_temp'] = self.is_temp
        if self.occurrence_time_stamp is not None:
            result['occurrence_time_stamp'] = self.occurrence_time_stamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('live_id') is not None:
            self.live_id = m.get('live_id')
        if m.get('scene_id') is not None:
            self.scene_id = m.get('scene_id')
        if m.get('section_id') is not None:
            self.section_id = m.get('section_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('is_temp') is not None:
            self.is_temp = m.get('is_temp')
        if m.get('occurrence_time_stamp') is not None:
            self.occurrence_time_stamp = m.get('occurrence_time_stamp')
        return self


class ListUniversalsaasDigitalhumanLiveVideoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        live_id: str = None,
        video_type: str = None,
        biz_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # bUC_Weh3
        self.tenant_code = tenant_code
        # 蚂蚁数字人平台直播id
        self.live_id = live_id
        # all全部、normal常规、temporary临时插播
        self.video_type = video_type
        # 业务标识
        self.biz_name = biz_name

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.live_id, 'live_id')
        self.validate_required(self.video_type, 'video_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.live_id is not None:
            result['live_id'] = self.live_id
        if self.video_type is not None:
            result['video_type'] = self.video_type
        if self.biz_name is not None:
            result['biz_name'] = self.biz_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('live_id') is not None:
            self.live_id = m.get('live_id')
        if m.get('video_type') is not None:
            self.video_type = m.get('video_type')
        if m.get('biz_name') is not None:
            self.biz_name = m.get('biz_name')
        return self


class ListUniversalsaasDigitalhumanLiveVideoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        data: List[LiveVideos] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果状态
        self.success = success
        # 直播视频列表
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
        if self.success is not None:
            result['success'] = self.success
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
        if m.get('success') is not None:
            self.success = m.get('success')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = LiveVideos()
                self.data.append(temp_model.from_map(k))
        return self


