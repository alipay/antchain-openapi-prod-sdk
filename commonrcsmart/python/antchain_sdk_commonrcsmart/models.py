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


class ContentRiskDetailVO(TeaModel):
    def __init__(
        self,
        risk_level: str = None,
        notice: str = None,
        viola_words: str = None,
    ):
        # 风险等级
        self.risk_level = risk_level
        # 风险提示
        self.notice = notice
        # 命中词
        self.viola_words = viola_words

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.risk_level is not None:
            result['risk_level'] = self.risk_level
        if self.notice is not None:
            result['notice'] = self.notice
        if self.viola_words is not None:
            result['viola_words'] = self.viola_words
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('risk_level') is not None:
            self.risk_level = m.get('risk_level')
        if m.get('notice') is not None:
            self.notice = m.get('notice')
        if m.get('viola_words') is not None:
            self.viola_words = m.get('viola_words')
        return self


class TextDataVO(TeaModel):
    def __init__(
        self,
        text: str = None,
    ):
        # 审核文本内容
        self.text = text

    def validate(self):
        self.validate_required(self.text, 'text')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.text is not None:
            result['text'] = self.text
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('text') is not None:
            self.text = m.get('text')
        return self


class ImageApprovalResultVO(TeaModel):
    def __init__(
        self,
        result: str = None,
        result_url: str = None,
        risk_detail_vo_list: List[ContentRiskDetailVO] = None,
    ):
        # 机审结果
        self.result = result
        # 图片审核结果的url
        self.result_url = result_url
        # 审核结果详情
        self.risk_detail_vo_list = risk_detail_vo_list

    def validate(self):
        self.validate_required(self.result, 'result')
        if self.risk_detail_vo_list:
            for k in self.risk_detail_vo_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.result is not None:
            result['result'] = self.result
        if self.result_url is not None:
            result['result_url'] = self.result_url
        result['risk_detail_vo_list'] = []
        if self.risk_detail_vo_list is not None:
            for k in self.risk_detail_vo_list:
                result['risk_detail_vo_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('result_url') is not None:
            self.result_url = m.get('result_url')
        self.risk_detail_vo_list = []
        if m.get('risk_detail_vo_list') is not None:
            for k in m.get('risk_detail_vo_list'):
                temp_model = ContentRiskDetailVO()
                self.risk_detail_vo_list.append(temp_model.from_map(k))
        return self


class DataVo(TeaModel):
    def __init__(
        self,
        url: str = None,
        file_type: str = None,
    ):
        # 文件审核地址
        self.url = url
        # 文件类型
        self.file_type = file_type

    def validate(self):
        self.validate_required(self.url, 'url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.url is not None:
            result['url'] = self.url
        if self.file_type is not None:
            result['file_type'] = self.file_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        return self


class RcSmartResponse(TeaModel):
    def __init__(
        self,
        code: str = None,
        msg: str = None,
        sub_code: str = None,
        sub_msg: str = None,
        retry: bool = None,
    ):
        # 结果码
        self.code = code
        # 返回码描述
        self.msg = msg
        # 业务处理结果码
        self.sub_code = sub_code
        # 返回的提示信息
        self.sub_msg = sub_msg
        # 可否重试
        self.retry = retry

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.msg, 'msg')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.msg is not None:
            result['msg'] = self.msg
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        if self.retry is not None:
            result['retry'] = self.retry
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        if m.get('retry') is not None:
            self.retry = m.get('retry')
        return self


class MessageApprovalResultVO(TeaModel):
    def __init__(
        self,
        result: str = None,
        risk_detail_vo_list: List[ContentRiskDetailVO] = None,
    ):
        # 机审结果
        self.result = result
        # 审核结果详情
        self.risk_detail_vo_list = risk_detail_vo_list

    def validate(self):
        self.validate_required(self.result, 'result')
        self.validate_required(self.risk_detail_vo_list, 'risk_detail_vo_list')
        if self.risk_detail_vo_list:
            for k in self.risk_detail_vo_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.result is not None:
            result['result'] = self.result
        result['risk_detail_vo_list'] = []
        if self.risk_detail_vo_list is not None:
            for k in self.risk_detail_vo_list:
                result['risk_detail_vo_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('result') is not None:
            self.result = m.get('result')
        self.risk_detail_vo_list = []
        if m.get('risk_detail_vo_list') is not None:
            for k in m.get('risk_detail_vo_list'):
                temp_model = ContentRiskDetailVO()
                self.risk_detail_vo_list.append(temp_model.from_map(k))
        return self


class ConfirmRcApprovalMessageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request_id: str = None,
        scenes: List[str] = None,
        text_data: TextDataVO = None,
        login_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求ID
        self.request_id = request_id
        # 审核场景列表
        self.scenes = scenes
        # 审核文本内容
        self.text_data = text_data
        # 登录账号，默认使用主账号
        self.login_name = login_name

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.scenes, 'scenes')
        self.validate_required(self.text_data, 'text_data')
        if self.text_data:
            self.text_data.validate()

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
        if self.scenes is not None:
            result['scenes'] = self.scenes
        if self.text_data is not None:
            result['text_data'] = self.text_data.to_map()
        if self.login_name is not None:
            result['login_name'] = self.login_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('scenes') is not None:
            self.scenes = m.get('scenes')
        if m.get('text_data') is not None:
            temp_model = TextDataVO()
            self.text_data = temp_model.from_map(m['text_data'])
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        return self


class ConfirmRcApprovalMessageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        rc_smart_response: RcSmartResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 审核结果基类
        self.rc_smart_response = rc_smart_response

    def validate(self):
        if self.rc_smart_response:
            self.rc_smart_response.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.rc_smart_response is not None:
            result['rc_smart_response'] = self.rc_smart_response.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('rc_smart_response') is not None:
            temp_model = RcSmartResponse()
            self.rc_smart_response = temp_model.from_map(m['rc_smart_response'])
        return self


class QueryRcApprovalMessageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        orig_request_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 原审核请求ID
        self.orig_request_id = orig_request_id

    def validate(self):
        self.validate_required(self.orig_request_id, 'orig_request_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.orig_request_id is not None:
            result['orig_request_id'] = self.orig_request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('orig_request_id') is not None:
            self.orig_request_id = m.get('orig_request_id')
        return self


class QueryRcApprovalMessageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        rc_smart_response: RcSmartResponse = None,
        result_vo: MessageApprovalResultVO = None,
        page_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 审核结果基类
        self.rc_smart_response = rc_smart_response
        # 通用版文本审核结果
        self.result_vo = result_vo
        # 审核结果页
        self.page_url = page_url

    def validate(self):
        if self.rc_smart_response:
            self.rc_smart_response.validate()
        if self.result_vo:
            self.result_vo.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.rc_smart_response is not None:
            result['rc_smart_response'] = self.rc_smart_response.to_map()
        if self.result_vo is not None:
            result['result_vo'] = self.result_vo.to_map()
        if self.page_url is not None:
            result['page_url'] = self.page_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('rc_smart_response') is not None:
            temp_model = RcSmartResponse()
            self.rc_smart_response = temp_model.from_map(m['rc_smart_response'])
        if m.get('result_vo') is not None:
            temp_model = MessageApprovalResultVO()
            self.result_vo = temp_model.from_map(m['result_vo'])
        if m.get('page_url') is not None:
            self.page_url = m.get('page_url')
        return self


class ConfirmRcApprovalImageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request_id: str = None,
        scenes: List[str] = None,
        data_vo: DataVo = None,
        login_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求ID
        self.request_id = request_id
        # 审核场景列表
        self.scenes = scenes
        # 审核文件内容
        self.data_vo = data_vo
        # 登录账号；默认使用主账号
        self.login_name = login_name

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.scenes, 'scenes')
        self.validate_required(self.data_vo, 'data_vo')
        if self.data_vo:
            self.data_vo.validate()

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
        if self.scenes is not None:
            result['scenes'] = self.scenes
        if self.data_vo is not None:
            result['data_vo'] = self.data_vo.to_map()
        if self.login_name is not None:
            result['login_name'] = self.login_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('scenes') is not None:
            self.scenes = m.get('scenes')
        if m.get('data_vo') is not None:
            temp_model = DataVo()
            self.data_vo = temp_model.from_map(m['data_vo'])
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        return self


class ConfirmRcApprovalImageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        rc_smart_response: RcSmartResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 审核结果基类
        self.rc_smart_response = rc_smart_response

    def validate(self):
        if self.rc_smart_response:
            self.rc_smart_response.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.rc_smart_response is not None:
            result['rc_smart_response'] = self.rc_smart_response.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('rc_smart_response') is not None:
            temp_model = RcSmartResponse()
            self.rc_smart_response = temp_model.from_map(m['rc_smart_response'])
        return self


class QueryRcApprovalImageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        orig_request_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 原审核请求ID
        self.orig_request_id = orig_request_id

    def validate(self):
        self.validate_required(self.orig_request_id, 'orig_request_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.orig_request_id is not None:
            result['orig_request_id'] = self.orig_request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('orig_request_id') is not None:
            self.orig_request_id = m.get('orig_request_id')
        return self


class QueryRcApprovalImageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        rc_smart_response: RcSmartResponse = None,
        result_vo: ImageApprovalResultVO = None,
        page_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 审核结果基类
        self.rc_smart_response = rc_smart_response
        # 通用版图片审核结果
        self.result_vo = result_vo
        # 审核结果页
        self.page_url = page_url

    def validate(self):
        if self.rc_smart_response:
            self.rc_smart_response.validate()
        if self.result_vo:
            self.result_vo.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.rc_smart_response is not None:
            result['rc_smart_response'] = self.rc_smart_response.to_map()
        if self.result_vo is not None:
            result['result_vo'] = self.result_vo.to_map()
        if self.page_url is not None:
            result['page_url'] = self.page_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('rc_smart_response') is not None:
            temp_model = RcSmartResponse()
            self.rc_smart_response = temp_model.from_map(m['rc_smart_response'])
        if m.get('result_vo') is not None:
            temp_model = ImageApprovalResultVO()
            self.result_vo = temp_model.from_map(m['result_vo'])
        if m.get('page_url') is not None:
            self.page_url = m.get('page_url')
        return self


