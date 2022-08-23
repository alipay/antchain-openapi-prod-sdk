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


class InfoSecHitDetectItem(TeaModel):
    def __init__(
        self,
        detect_type_code: str = None,
        hit_detect_resource: str = None,
        hit_content: str = None,
        detect_resource_level: str = None,
    ):
        # 123
        self.detect_type_code = detect_type_code
        # 123
        self.hit_detect_resource = hit_detect_resource
        # 123
        self.hit_content = hit_content
        # 123
        self.detect_resource_level = detect_resource_level

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.detect_type_code is not None:
            result['detect_type_code'] = self.detect_type_code
        if self.hit_detect_resource is not None:
            result['hit_detect_resource'] = self.hit_detect_resource
        if self.hit_content is not None:
            result['hit_content'] = self.hit_content
        if self.detect_resource_level is not None:
            result['detect_resource_level'] = self.detect_resource_level
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('detect_type_code') is not None:
            self.detect_type_code = m.get('detect_type_code')
        if m.get('hit_detect_resource') is not None:
            self.hit_detect_resource = m.get('hit_detect_resource')
        if m.get('hit_content') is not None:
            self.hit_content = m.get('hit_content')
        if m.get('detect_resource_level') is not None:
            self.detect_resource_level = m.get('detect_resource_level')
        return self


class SecurityRiskContentResultGetResponse(TeaModel):
    def __init__(
        self,
        hit_detect_items: List[InfoSecHitDetectItem] = None,
        result_action: str = None,
    ):
        # 命中次数
        self.hit_detect_items = hit_detect_items
        # 返回结果
        self.result_action = result_action

    def validate(self):
        if self.hit_detect_items:
            for k in self.hit_detect_items:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['hit_detect_items'] = []
        if self.hit_detect_items is not None:
            for k in self.hit_detect_items:
                result['hit_detect_items'].append(k.to_map() if k else None)
        if self.result_action is not None:
            result['result_action'] = self.result_action
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.hit_detect_items = []
        if m.get('hit_detect_items') is not None:
            for k in m.get('hit_detect_items'):
                temp_model = InfoSecHitDetectItem()
                self.hit_detect_items.append(temp_model.from_map(k))
        if m.get('result_action') is not None:
            self.result_action = m.get('result_action')
        return self


class NameValuePair(TeaModel):
    def __init__(
        self,
        name: str = None,
        value: str = None,
    ):
        # 键名
        self.name = name
        # 键值
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


class GwValidateProduct(TeaModel):
    def __init__(
        self,
        product_code: str = None,
        group: str = None,
        product_params: List[NameValuePair] = None,
    ):
        # 核审产品码，支持多种核身产品。
        # ZK_FACE_VERIFY：人脸识别
        self.product_code = product_code
        # 产品渲染方式：H5、NATIVE 或 PC
        self.group = group
        # 核身产品参数，因网关限制，暂只支持Map<String,String>
        self.product_params = product_params

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.group, 'group')
        if self.product_params:
            for k in self.product_params:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.group is not None:
            result['group'] = self.group
        result['product_params'] = []
        if self.product_params is not None:
            for k in self.product_params:
                result['product_params'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('group') is not None:
            self.group = m.get('group')
        self.product_params = []
        if m.get('product_params') is not None:
            for k in m.get('product_params'):
                temp_model = NameValuePair()
                self.product_params.append(temp_model.from_map(k))
        return self


class InfoSecContentQueryResult(TeaModel):
    def __init__(
        self,
        detect_resource_level: str = None,
        detect_type_code: str = None,
        hit_content: str = None,
        hit_detect_resource: str = None,
    ):
        # 检测来源等级
        self.detect_resource_level = detect_resource_level
        # 检测结果类型
        self.detect_type_code = detect_type_code
        # 命中内容
        self.hit_content = hit_content
        # 检测命中来源
        self.hit_detect_resource = hit_detect_resource

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.detect_resource_level is not None:
            result['detect_resource_level'] = self.detect_resource_level
        if self.detect_type_code is not None:
            result['detect_type_code'] = self.detect_type_code
        if self.hit_content is not None:
            result['hit_content'] = self.hit_content
        if self.hit_detect_resource is not None:
            result['hit_detect_resource'] = self.hit_detect_resource
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('detect_resource_level') is not None:
            self.detect_resource_level = m.get('detect_resource_level')
        if m.get('detect_type_code') is not None:
            self.detect_type_code = m.get('detect_type_code')
        if m.get('hit_content') is not None:
            self.hit_content = m.get('hit_content')
        if m.get('hit_detect_resource') is not None:
            self.hit_detect_resource = m.get('hit_detect_resource')
        return self


class ContentQueryResultModel(TeaModel):
    def __init__(
        self,
        code: int = None,
        err_msg: str = None,
        model: SecurityRiskContentResultGetResponse = None,
    ):
        # 返回结果码
        self.code = code
        # 返回错误码
        self.err_msg = err_msg
        # 返回结果
        self.model = model

    def validate(self):
        if self.model:
            self.model.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.err_msg is not None:
            result['err_msg'] = self.err_msg
        if self.model is not None:
            result['model'] = self.model.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('err_msg') is not None:
            self.err_msg = m.get('err_msg')
        if m.get('model') is not None:
            temp_model = SecurityRiskContentResultGetResponse()
            self.model = temp_model.from_map(m['model'])
        return self


class CustomerAuthResult(TeaModel):
    def __init__(
        self,
        acc_id: str = None,
        code: str = None,
        customer_id: str = None,
        did: str = None,
        enterprise_status: str = None,
        open_time: str = None,
        pass_: bool = None,
        dis_req_msg_id: str = None,
    ):
        # 账户ID
        self.acc_id = acc_id
        # 返回code 0:核验成功 1:企业信息有误 2:企业非正常营业
        self.code = code
        # 客户ID
        self.customer_id = customer_id
        # 客户did
        self.did = did
        # 验证状态
        self.enterprise_status = enterprise_status
        # 开业时间
        self.open_time = open_time
        # 认证结果，是否通过
        self.pass_ = pass_
        # 业务ID
        self.dis_req_msg_id = dis_req_msg_id

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.open_time, 'open_time')
        self.validate_required(self.pass_, 'pass_')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.acc_id is not None:
            result['acc_id'] = self.acc_id
        if self.code is not None:
            result['code'] = self.code
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.did is not None:
            result['did'] = self.did
        if self.enterprise_status is not None:
            result['enterprise_status'] = self.enterprise_status
        if self.open_time is not None:
            result['open_time'] = self.open_time
        if self.pass_ is not None:
            result['pass'] = self.pass_
        if self.dis_req_msg_id is not None:
            result['dis_req_msg_id'] = self.dis_req_msg_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('acc_id') is not None:
            self.acc_id = m.get('acc_id')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('enterprise_status') is not None:
            self.enterprise_status = m.get('enterprise_status')
        if m.get('open_time') is not None:
            self.open_time = m.get('open_time')
        if m.get('pass') is not None:
            self.pass_ = m.get('pass')
        if m.get('dis_req_msg_id') is not None:
            self.dis_req_msg_id = m.get('dis_req_msg_id')
        return self


class HoloxCheckResult(TeaModel):
    def __init__(
        self,
        sucess: bool = None,
        id: str = None,
        scene_code: str = None,
        result_code: str = None,
        error_code: str = None,
        result_message: str = None,
        warn_action: str = None,
        content_property_output_result_map: str = None,
        hit_result_items: str = None,
    ):
        # 是否成功
        self.sucess = sucess
        # 本次调用id
        self.id = id
        # 场景码
        self.scene_code = scene_code
        # 结果码
        self.result_code = result_code
        # 错误码
        self.error_code = error_code
        # 结果信息
        self.result_message = result_message
        # 213
        self.warn_action = warn_action
        # 123
        self.content_property_output_result_map = content_property_output_result_map
        # 213
        self.hit_result_items = hit_result_items

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.content_property_output_result_map, 'content_property_output_result_map')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sucess is not None:
            result['sucess'] = self.sucess
        if self.id is not None:
            result['id'] = self.id
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.result_message is not None:
            result['result_message'] = self.result_message
        if self.warn_action is not None:
            result['warn_action'] = self.warn_action
        if self.content_property_output_result_map is not None:
            result['content_property_output_result_map'] = self.content_property_output_result_map
        if self.hit_result_items is not None:
            result['hit_result_items'] = self.hit_result_items
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sucess') is not None:
            self.sucess = m.get('sucess')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('result_message') is not None:
            self.result_message = m.get('result_message')
        if m.get('warn_action') is not None:
            self.warn_action = m.get('warn_action')
        if m.get('content_property_output_result_map') is not None:
            self.content_property_output_result_map = m.get('content_property_output_result_map')
        if m.get('hit_result_items') is not None:
            self.hit_result_items = m.get('hit_result_items')
        return self


class InfoSecContentQuery(TeaModel):
    def __init__(
        self,
        app_scene: str = None,
        app_scene_data_id: str = None,
        event_id: str = None,
    ):
        # 123
        self.app_scene = app_scene
        # 123
        self.app_scene_data_id = app_scene_data_id
        # 123
        self.event_id = event_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.app_scene is not None:
            result['app_scene'] = self.app_scene
        if self.app_scene_data_id is not None:
            result['app_scene_data_id'] = self.app_scene_data_id
        if self.event_id is not None:
            result['event_id'] = self.event_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app_scene') is not None:
            self.app_scene = m.get('app_scene')
        if m.get('app_scene_data_id') is not None:
            self.app_scene_data_id = m.get('app_scene_data_id')
        if m.get('event_id') is not None:
            self.event_id = m.get('event_id')
        return self


class RdsAnalyzeRequest(TeaModel):
    def __init__(
        self,
        appid: str = None,
        biz_no: str = None,
        scene: str = None,
        token: str = None,
        data: str = None,
        extra: str = None,
    ):
        # 123
        self.appid = appid
        # 123
        self.biz_no = biz_no
        # 213
        self.scene = scene
        # 123
        self.token = token
        # 123
        self.data = data
        # 123
        self.extra = extra

    def validate(self):
        self.validate_required(self.appid, 'appid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.appid is not None:
            result['appid'] = self.appid
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.scene is not None:
            result['scene'] = self.scene
        if self.token is not None:
            result['token'] = self.token
        if self.data is not None:
            result['data'] = self.data
        if self.extra is not None:
            result['extra'] = self.extra
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('appid') is not None:
            self.appid = m.get('appid')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('extra') is not None:
            self.extra = m.get('extra')
        return self


class SecurityUniformRequest(TeaModel):
    def __init__(
        self,
        token: str = None,
        biz_id: str = None,
        params: str = None,
    ):
        # 123
        self.token = token
        # 123
        self.biz_id = biz_id
        # 132
        self.params = params

    def validate(self):
        self.validate_required(self.token, 'token')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.params, 'params')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.token is not None:
            result['token'] = self.token
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.params is not None:
            result['params'] = self.params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('params') is not None:
            self.params = m.get('params')
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
        self.validate_required(self.key, 'key')

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


class RdslibAntcaptchaservice(TeaModel):
    def __init__(
        self,
        success: bool = None,
        message: str = None,
        data: str = None,
    ):
        # 是否请求成功
        self.success = success
        # 相应信息
        self.message = message
        # 返回数据
        self.data = data

    def validate(self):
        self.validate_required(self.success, 'success')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.message is not None:
            result['message'] = self.message
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class SecurityUniformResponse(TeaModel):
    def __init__(
        self,
        success: bool = None,
        code: str = None,
        message: str = None,
        token: str = None,
        biz_id: str = None,
        data: str = None,
    ):
        # 是否成功
        self.success = success
        # 123
        self.code = code
        # 123
        self.message = message
        # 123
        self.token = token
        # 123
        self.biz_id = biz_id
        # 123
        self.data = data

    def validate(self):
        self.validate_required(self.success, 'success')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.token is not None:
            result['token'] = self.token
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class HoloxCheckEvent(TeaModel):
    def __init__(
        self,
        sucess: bool = None,
        id: str = None,
        app_code: str = None,
        scene_code: str = None,
        product_code: str = None,
        channel: str = None,
        app_scene_data_id: str = None,
        account_type: str = None,
        user_id: str = None,
        reciever_id: str = None,
        publish_date: str = None,
        is_test: bool = None,
        is_load_test: bool = None,
        is_fusing: bool = None,
        scene_type: str = None,
        content_data: str = None,
        event_data: str = None,
    ):
        # 是否成功
        self.sucess = sucess
        # 123
        self.id = id
        # 12
        self.app_code = app_code
        # 123
        self.scene_code = scene_code
        # 12
        self.product_code = product_code
        # 123
        self.channel = channel
        # 123
        self.app_scene_data_id = app_scene_data_id
        # 123
        self.account_type = account_type
        # 123
        self.user_id = user_id
        # 123
        self.reciever_id = reciever_id
        # 123
        self.publish_date = publish_date
        # 123
        self.is_test = is_test
        # 123
        self.is_load_test = is_load_test
        # 123
        self.is_fusing = is_fusing
        # 123
        self.scene_type = scene_type
        # 123
        self.content_data = content_data
        # 123
        self.event_data = event_data

    def validate(self):
        self.validate_required(self.sucess, 'sucess')
        self.validate_required(self.id, 'id')
        self.validate_required(self.app_code, 'app_code')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.channel, 'channel')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.reciever_id, 'reciever_id')
        self.validate_required(self.publish_date, 'publish_date')
        self.validate_required(self.is_test, 'is_test')
        self.validate_required(self.is_load_test, 'is_load_test')
        self.validate_required(self.is_fusing, 'is_fusing')
        self.validate_required(self.scene_type, 'scene_type')
        self.validate_required(self.content_data, 'content_data')
        self.validate_required(self.event_data, 'event_data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sucess is not None:
            result['sucess'] = self.sucess
        if self.id is not None:
            result['id'] = self.id
        if self.app_code is not None:
            result['app_code'] = self.app_code
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.channel is not None:
            result['channel'] = self.channel
        if self.app_scene_data_id is not None:
            result['app_scene_data_id'] = self.app_scene_data_id
        if self.account_type is not None:
            result['account_type'] = self.account_type
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.reciever_id is not None:
            result['reciever_id'] = self.reciever_id
        if self.publish_date is not None:
            result['publish_date'] = self.publish_date
        if self.is_test is not None:
            result['is_test'] = self.is_test
        if self.is_load_test is not None:
            result['is_load_test'] = self.is_load_test
        if self.is_fusing is not None:
            result['is_fusing'] = self.is_fusing
        if self.scene_type is not None:
            result['scene_type'] = self.scene_type
        if self.content_data is not None:
            result['content_data'] = self.content_data
        if self.event_data is not None:
            result['event_data'] = self.event_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sucess') is not None:
            self.sucess = m.get('sucess')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('app_code') is not None:
            self.app_code = m.get('app_code')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('app_scene_data_id') is not None:
            self.app_scene_data_id = m.get('app_scene_data_id')
        if m.get('account_type') is not None:
            self.account_type = m.get('account_type')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('reciever_id') is not None:
            self.reciever_id = m.get('reciever_id')
        if m.get('publish_date') is not None:
            self.publish_date = m.get('publish_date')
        if m.get('is_test') is not None:
            self.is_test = m.get('is_test')
        if m.get('is_load_test') is not None:
            self.is_load_test = m.get('is_load_test')
        if m.get('is_fusing') is not None:
            self.is_fusing = m.get('is_fusing')
        if m.get('scene_type') is not None:
            self.scene_type = m.get('scene_type')
        if m.get('content_data') is not None:
            self.content_data = m.get('content_data')
        if m.get('event_data') is not None:
            self.event_data = m.get('event_data')
        return self


class GwVerifyViewResult(TeaModel):
    def __init__(
        self,
        verify_id: str = None,
        product_code: str = None,
        group: str = None,
        response_params: List[NameValuePair] = None,
        success: bool = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 核身上下文id
        self.verify_id = verify_id
        # 核审产品码，支持多种核身产品。 ZK_FACE_VERIFY：人脸识别
        self.product_code = product_code
        # 核身分组
        self.group = group
        # 返回结果
        self.response_params = response_params
        # 核身渲染是否调用成功
        self.success = success
        # 返回码
        self.result_code = result_code
        # 返回信息
        self.result_msg = result_msg

    def validate(self):
        self.validate_required(self.verify_id, 'verify_id')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.group, 'group')
        self.validate_required(self.response_params, 'response_params')
        if self.response_params:
            for k in self.response_params:
                if k:
                    k.validate()
        self.validate_required(self.success, 'success')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.verify_id is not None:
            result['verify_id'] = self.verify_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.group is not None:
            result['group'] = self.group
        result['response_params'] = []
        if self.response_params is not None:
            for k in self.response_params:
                result['response_params'].append(k.to_map() if k else None)
        if self.success is not None:
            result['success'] = self.success
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('verify_id') is not None:
            self.verify_id = m.get('verify_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('group') is not None:
            self.group = m.get('group')
        self.response_params = []
        if m.get('response_params') is not None:
            for k in m.get('response_params'):
                temp_model = NameValuePair()
                self.response_params.append(temp_model.from_map(k))
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class GwVerifyScene(TeaModel):
    def __init__(
        self,
        system_name: str = None,
        biz_product: str = None,
        biz_prod_node: str = None,
        access_channel: str = None,
        language: str = None,
    ):
        # 调用方系统名
        self.system_name = system_name
        # 业务方产品
        self.biz_product = biz_product
        # 业务产品节点
        self.biz_prod_node = biz_prod_node
        # 业务接入渠道
        self.access_channel = access_channel
        # 业务调用场景的语言版本、CHINESE("中文", "chi")、ENG("英文", "en")
        self.language = language

    def validate(self):
        self.validate_required(self.system_name, 'system_name')
        self.validate_required(self.biz_product, 'biz_product')
        self.validate_required(self.biz_prod_node, 'biz_prod_node')
        self.validate_required(self.access_channel, 'access_channel')
        self.validate_required(self.language, 'language')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.system_name is not None:
            result['system_name'] = self.system_name
        if self.biz_product is not None:
            result['biz_product'] = self.biz_product
        if self.biz_prod_node is not None:
            result['biz_prod_node'] = self.biz_prod_node
        if self.access_channel is not None:
            result['access_channel'] = self.access_channel
        if self.language is not None:
            result['language'] = self.language
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('system_name') is not None:
            self.system_name = m.get('system_name')
        if m.get('biz_product') is not None:
            self.biz_product = m.get('biz_product')
        if m.get('biz_prod_node') is not None:
            self.biz_prod_node = m.get('biz_prod_node')
        if m.get('access_channel') is not None:
            self.access_channel = m.get('access_channel')
        if m.get('language') is not None:
            self.language = m.get('language')
        return self


class InitAntchainBbpVerifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        verify_scene: GwVerifyScene = None,
        biz_id: str = None,
        extern_params: List[NameValuePair] = None,
        callback_enum: str = None,
        validate_flows: List[GwValidateProduct] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 接入场景（主要由接入系统、接入产品、产品节点三部分组成）
        self.verify_scene = verify_scene
        # 调用方传入，唯一标识一笔业务，核身平台将bizId与核身token进行绑定，用作防串改校验
        self.biz_id = biz_id
        # 调用方传入，存放业务扩展参数（callback参数也写入此）
        self.extern_params = extern_params
        # 调用方传入，指定核身完成后的回调类型
        self.callback_enum = callback_enum
        # 核身产品列表
        self.validate_flows = validate_flows

    def validate(self):
        self.validate_required(self.verify_scene, 'verify_scene')
        if self.verify_scene:
            self.verify_scene.validate()
        self.validate_required(self.biz_id, 'biz_id')
        if self.extern_params:
            for k in self.extern_params:
                if k:
                    k.validate()
        self.validate_required(self.validate_flows, 'validate_flows')
        if self.validate_flows:
            for k in self.validate_flows:
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
        if self.verify_scene is not None:
            result['verify_scene'] = self.verify_scene.to_map()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        result['extern_params'] = []
        if self.extern_params is not None:
            for k in self.extern_params:
                result['extern_params'].append(k.to_map() if k else None)
        if self.callback_enum is not None:
            result['callback_enum'] = self.callback_enum
        result['validate_flows'] = []
        if self.validate_flows is not None:
            for k in self.validate_flows:
                result['validate_flows'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('verify_scene') is not None:
            temp_model = GwVerifyScene()
            self.verify_scene = temp_model.from_map(m['verify_scene'])
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        self.extern_params = []
        if m.get('extern_params') is not None:
            for k in m.get('extern_params'):
                temp_model = NameValuePair()
                self.extern_params.append(temp_model.from_map(k))
        if m.get('callback_enum') is not None:
            self.callback_enum = m.get('callback_enum')
        self.validate_flows = []
        if m.get('validate_flows') is not None:
            for k in m.get('validate_flows'):
                temp_model = GwValidateProduct()
                self.validate_flows.append(temp_model.from_map(k))
        return self


class InitAntchainBbpVerifyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        verify_id: str = None,
        verify_url: str = None,
        verify_status: str = None,
        valid_prod: List[GwValidateProduct] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 核身id
        self.verify_id = verify_id
        # 核身请求地址url
        self.verify_url = verify_url
        # 核身处理状态:INITIAL、PROCESSING、SUCCESS、EXPIRED、FAIL
        self.verify_status = verify_status
        # 可用产品集合
        self.valid_prod = valid_prod

    def validate(self):
        if self.valid_prod:
            for k in self.valid_prod:
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
        if self.verify_id is not None:
            result['verify_id'] = self.verify_id
        if self.verify_url is not None:
            result['verify_url'] = self.verify_url
        if self.verify_status is not None:
            result['verify_status'] = self.verify_status
        result['valid_prod'] = []
        if self.valid_prod is not None:
            for k in self.valid_prod:
                result['valid_prod'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('verify_id') is not None:
            self.verify_id = m.get('verify_id')
        if m.get('verify_url') is not None:
            self.verify_url = m.get('verify_url')
        if m.get('verify_status') is not None:
            self.verify_status = m.get('verify_status')
        self.valid_prod = []
        if m.get('valid_prod') is not None:
            for k in m.get('valid_prod'):
                temp_model = GwValidateProduct()
                self.valid_prod.append(temp_model.from_map(k))
        return self


class StartAntchainBbpVerifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        verify_id: str = None,
        group: str = None,
        product_action: str = None,
        biz_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 核身上下文id
        self.verify_id = verify_id
        # 核身模块分组
        self.group = group
        # 核身动作：view-渲染，verify-校验，repeat-重新发送
        self.product_action = product_action
        # 业务id
        self.biz_id = biz_id

    def validate(self):
        self.validate_required(self.verify_id, 'verify_id')
        self.validate_required(self.group, 'group')
        self.validate_required(self.product_action, 'product_action')
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.verify_id is not None:
            result['verify_id'] = self.verify_id
        if self.group is not None:
            result['group'] = self.group
        if self.product_action is not None:
            result['product_action'] = self.product_action
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('verify_id') is not None:
            self.verify_id = m.get('verify_id')
        if m.get('group') is not None:
            self.group = m.get('group')
        if m.get('product_action') is not None:
            self.product_action = m.get('product_action')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        return self


class StartAntchainBbpVerifyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[GwVerifyViewResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 核身渲染结果
        self.result = result

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
                temp_model = GwVerifyViewResult()
                self.result.append(temp_model.from_map(k))
        return self


class CheckAntchainBbpVerifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        verify_id: str = None,
        group: str = None,
        product_action: str = None,
        biz_id: str = None,
        product_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 核身上下文id
        self.verify_id = verify_id
        # 核身模块分组
        self.group = group
        # 核身动作：view-渲染，verify-校验，repeat-重新发送
        self.product_action = product_action
        # 业务id
        self.biz_id = biz_id
        # 核身产品码
        self.product_code = product_code

    def validate(self):
        self.validate_required(self.verify_id, 'verify_id')
        self.validate_required(self.group, 'group')
        self.validate_required(self.product_action, 'product_action')
        self.validate_required(self.biz_id, 'biz_id')
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
        if self.verify_id is not None:
            result['verify_id'] = self.verify_id
        if self.group is not None:
            result['group'] = self.group
        if self.product_action is not None:
            result['product_action'] = self.product_action
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('verify_id') is not None:
            self.verify_id = m.get('verify_id')
        if m.get('group') is not None:
            self.group = m.get('group')
        if m.get('product_action') is not None:
            self.product_action = m.get('product_action')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        return self


class CheckAntchainBbpVerifyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 核身结果枚举：PASS-核身成功，INITIAL-初始化，PROCESS-处理中，FAIL-失败
        self.status = status

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
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class RunAntchainSaasMarketServiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        product_code: str = None,
        service_code: str = None,
        sub_service_code: str = None,
        service_version: str = None,
        params: List[KeyValuePair] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务方传入，幂等用。
        self.biz_id = biz_id
        # saas产品code
        self.product_code = product_code
        # 服务code
        self.service_code = service_code
        # 子服务code
        self.sub_service_code = sub_service_code
        # 服务版本
        self.service_version = service_version
        # 业务参数，map格式
        self.params = params

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.service_code, 'service_code')
        self.validate_required(self.service_version, 'service_version')
        if self.params:
            for k in self.params:
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
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.service_code is not None:
            result['service_code'] = self.service_code
        if self.sub_service_code is not None:
            result['sub_service_code'] = self.sub_service_code
        if self.service_version is not None:
            result['service_version'] = self.service_version
        result['params'] = []
        if self.params is not None:
            for k in self.params:
                result['params'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('service_code') is not None:
            self.service_code = m.get('service_code')
        if m.get('sub_service_code') is not None:
            self.sub_service_code = m.get('sub_service_code')
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        self.params = []
        if m.get('params') is not None:
            for k in m.get('params'):
                temp_model = KeyValuePair()
                self.params.append(temp_model.from_map(k))
        return self


class RunAntchainSaasMarketServiceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_data: List[KeyValuePair] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 服务调用结果
        self.result_data = result_data

    def validate(self):
        if self.result_data:
            for k in self.result_data:
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
        result['result_data'] = []
        if self.result_data is not None:
            for k in self.result_data:
                result['result_data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result_data = []
        if m.get('result_data') is not None:
            for k in m.get('result_data'):
                temp_model = KeyValuePair()
                self.result_data.append(temp_model.from_map(k))
        return self


class QueryAntchainSaasMarketSolutionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        solution_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 解决方案code
        self.solution_code = solution_code

    def validate(self):
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
        if self.solution_code is not None:
            result['solution_code'] = self.solution_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('solution_code') is not None:
            self.solution_code = m.get('solution_code')
        return self


class QueryAntchainSaasMarketSolutionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_data: List[KeyValuePair] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询结果
        self.result_data = result_data

    def validate(self):
        if self.result_data:
            for k in self.result_data:
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
        result['result_data'] = []
        if self.result_data is not None:
            for k in self.result_data:
                result['result_data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result_data = []
        if m.get('result_data') is not None:
            for k in m.get('result_data'):
                temp_model = KeyValuePair()
                self.result_data.append(temp_model.from_map(k))
        return self


class VerifyAntchainBbpMetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_code: str = None,
        ep_cert_name: str = None,
        ep_cert_no: str = None,
        ep_cert_no_type: str = None,
        legal_person_cert_name: str = None,
        legal_person_cert_no: str = None,
        legal_person_cert_no_type: str = None,
        owner_name: str = None,
        owner_uid: str = None,
        biz_id: str = None,
        channel: str = None,
        certify_enum: str = None,
        alipay_uid: str = None,
        person_name: str = None,
        person_cert_no: str = None,
        person_cert_type: str = None,
        extension_info: NameValuePair = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 预留业务code
        self.biz_code = biz_code
        # 企业名称
        self.ep_cert_name = ep_cert_name
        # 企业证件号码
        self.ep_cert_no = ep_cert_no
        # 企业证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
        self.ep_cert_no_type = ep_cert_no_type
        # 法人姓名
        self.legal_person_cert_name = legal_person_cert_name
        # 法人证件号码
        self.legal_person_cert_no = legal_person_cert_no
        # 法人证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
        self.legal_person_cert_no_type = legal_person_cert_no_type
        # 系统名称
        self.owner_name = owner_name
        # 系统租户ID
        self.owner_uid = owner_uid
        # 业务唯一ID
        self.biz_id = biz_id
        # 业务渠道，需提前申请产品码
        self.channel = channel
        # 认证类型：ENTERPRISE-企业, PERSON-个人
        self.certify_enum = certify_enum
        # 客户支付宝ID
        self.alipay_uid = alipay_uid
        # 个人姓名，用于个人认证
        self.person_name = person_name
        # 个人证件号码
        self.person_cert_no = person_cert_no
        # 个人证件类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
        self.person_cert_type = person_cert_type
        # 扩展信息
        self.extension_info = extension_info

    def validate(self):
        self.validate_required(self.ep_cert_name, 'ep_cert_name')
        self.validate_required(self.ep_cert_no, 'ep_cert_no')
        self.validate_required(self.ep_cert_no_type, 'ep_cert_no_type')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.channel, 'channel')
        self.validate_required(self.certify_enum, 'certify_enum')
        if self.extension_info:
            self.extension_info.validate()

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
        if self.ep_cert_name is not None:
            result['ep_cert_name'] = self.ep_cert_name
        if self.ep_cert_no is not None:
            result['ep_cert_no'] = self.ep_cert_no
        if self.ep_cert_no_type is not None:
            result['ep_cert_no_type'] = self.ep_cert_no_type
        if self.legal_person_cert_name is not None:
            result['legal_person_cert_name'] = self.legal_person_cert_name
        if self.legal_person_cert_no is not None:
            result['legal_person_cert_no'] = self.legal_person_cert_no
        if self.legal_person_cert_no_type is not None:
            result['legal_person_cert_no_type'] = self.legal_person_cert_no_type
        if self.owner_name is not None:
            result['owner_name'] = self.owner_name
        if self.owner_uid is not None:
            result['owner_uid'] = self.owner_uid
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.channel is not None:
            result['channel'] = self.channel
        if self.certify_enum is not None:
            result['certify_enum'] = self.certify_enum
        if self.alipay_uid is not None:
            result['alipay_uid'] = self.alipay_uid
        if self.person_name is not None:
            result['person_name'] = self.person_name
        if self.person_cert_no is not None:
            result['person_cert_no'] = self.person_cert_no
        if self.person_cert_type is not None:
            result['person_cert_type'] = self.person_cert_type
        if self.extension_info is not None:
            result['extension_info'] = self.extension_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('ep_cert_name') is not None:
            self.ep_cert_name = m.get('ep_cert_name')
        if m.get('ep_cert_no') is not None:
            self.ep_cert_no = m.get('ep_cert_no')
        if m.get('ep_cert_no_type') is not None:
            self.ep_cert_no_type = m.get('ep_cert_no_type')
        if m.get('legal_person_cert_name') is not None:
            self.legal_person_cert_name = m.get('legal_person_cert_name')
        if m.get('legal_person_cert_no') is not None:
            self.legal_person_cert_no = m.get('legal_person_cert_no')
        if m.get('legal_person_cert_no_type') is not None:
            self.legal_person_cert_no_type = m.get('legal_person_cert_no_type')
        if m.get('owner_name') is not None:
            self.owner_name = m.get('owner_name')
        if m.get('owner_uid') is not None:
            self.owner_uid = m.get('owner_uid')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('certify_enum') is not None:
            self.certify_enum = m.get('certify_enum')
        if m.get('alipay_uid') is not None:
            self.alipay_uid = m.get('alipay_uid')
        if m.get('person_name') is not None:
            self.person_name = m.get('person_name')
        if m.get('person_cert_no') is not None:
            self.person_cert_no = m.get('person_cert_no')
        if m.get('person_cert_type') is not None:
            self.person_cert_type = m.get('person_cert_type')
        if m.get('extension_info') is not None:
            temp_model = NameValuePair()
            self.extension_info = temp_model.from_map(m['extension_info'])
        return self


class VerifyAntchainBbpMetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: CustomerAuthResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 要素认证结果
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
            temp_model = CustomerAuthResult()
            self.result = temp_model.from_map(m['result'])
        return self


class BindDemoAaaBbbCccRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 123
        self.data = data

    def validate(self):
        self.validate_required(self.data, 'data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class BindDemoAaaBbbCccResponse(TeaModel):
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


class CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        holox_check_event: HoloxCheckEvent = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 123
        self.holox_check_event = holox_check_event
        # 123
        self.service_version = service_version

    def validate(self):
        if self.holox_check_event:
            self.holox_check_event.validate()
        self.validate_required(self.service_version, 'service_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.holox_check_event is not None:
            result['holox_check_event'] = self.holox_check_event.to_map()
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('holox_check_event') is not None:
            temp_model = HoloxCheckEvent()
            self.holox_check_event = temp_model.from_map(m['holox_check_event'])
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: HoloxCheckResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 大安全风控接口返回结果
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
            temp_model = HoloxCheckResult()
            self.data = temp_model.from_map(m['data'])
        return self


class QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        security_uniform_request: SecurityUniformRequest = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 123
        self.security_uniform_request = security_uniform_request
        # 123
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.security_uniform_request, 'security_uniform_request')
        if self.security_uniform_request:
            self.security_uniform_request.validate()
        self.validate_required(self.service_version, 'service_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.security_uniform_request is not None:
            result['security_uniform_request'] = self.security_uniform_request.to_map()
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('security_uniform_request') is not None:
            temp_model = SecurityUniformRequest()
            self.security_uniform_request = temp_model.from_map(m['security_uniform_request'])
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: SecurityUniformResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
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
            temp_model = SecurityUniformResponse()
            self.data = temp_model.from_map(m['data'])
        return self


class CheckSaasSecurityRdsRdsserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        rds_service_check_request: str = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 123
        self.rds_service_check_request = rds_service_check_request
        # 服务版本
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.rds_service_check_request, 'rds_service_check_request')
        self.validate_required(self.service_version, 'service_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.rds_service_check_request is not None:
            result['rds_service_check_request'] = self.rds_service_check_request
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('rds_service_check_request') is not None:
            self.rds_service_check_request = m.get('rds_service_check_request')
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class CheckSaasSecurityRdsRdsserviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否是机器
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


class QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        infosec_content_query: InfoSecContentQuery = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 123
        self.infosec_content_query = infosec_content_query
        # 123
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.infosec_content_query, 'infosec_content_query')
        if self.infosec_content_query:
            self.infosec_content_query.validate()
        self.validate_required(self.service_version, 'service_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.infosec_content_query is not None:
            result['infosec_content_query'] = self.infosec_content_query.to_map()
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('infosec_content_query') is not None:
            temp_model = InfoSecContentQuery()
            self.infosec_content_query = temp_model.from_map(m['infosec_content_query'])
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: InfoSecContentQueryResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回回调结果
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
            temp_model = InfoSecContentQueryResult()
            self.data = temp_model.from_map(m['data'])
        return self


class VerifySaasSecurityRdslibAntcaptchaserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        rds_analyze_request: RdsAnalyzeRequest = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 123
        self.rds_analyze_request = rds_analyze_request
        # 服务版本
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.rds_analyze_request, 'rds_analyze_request')
        if self.rds_analyze_request:
            self.rds_analyze_request.validate()
        self.validate_required(self.service_version, 'service_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.rds_analyze_request is not None:
            result['rds_analyze_request'] = self.rds_analyze_request.to_map()
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('rds_analyze_request') is not None:
            temp_model = RdsAnalyzeRequest()
            self.rds_analyze_request = temp_model.from_map(m['rds_analyze_request'])
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class VerifySaasSecurityRdslibAntcaptchaserviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: RdslibAntcaptchaservice = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否是机器人
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
            temp_model = RdslibAntcaptchaservice()
            self.data = temp_model.from_map(m['data'])
        return self


class QuerySaasSecurityTscenterUmidqueryserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        token_id: str = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户token id
        self.token_id = token_id
        # 服务版本
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.token_id, 'token_id')
        self.validate_required(self.service_version, 'service_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.token_id is not None:
            result['token_id'] = self.token_id
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('token_id') is not None:
            self.token_id = m.get('token_id')
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class QuerySaasSecurityTscenterUmidqueryserviceResponse(TeaModel):
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
        # 返回的umid
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


class QuerySaasSecurityInfosecOpencheckservicequeryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        event: str = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询参数
        self.event = event
        # 服务版本
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.event, 'event')
        self.validate_required(self.service_version, 'service_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.event is not None:
            result['event'] = self.event
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('event') is not None:
            self.event = m.get('event')
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class QuerySaasSecurityInfosecOpencheckservicequeryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ContentQueryResultModel = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 大安全内容检测接口返回结果
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
            temp_model = ContentQueryResultModel()
            self.data = temp_model.from_map(m['data'])
        return self


