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


class IdentifyPointReq(TeaModel):
    def __init__(
        self,
        identify_point_name: str = None,
        identify_point_code: str = None,
        identify_point_img: str = None,
    ):
        # 鉴定点名称
        self.identify_point_name = identify_point_name
        # 鉴定点编号
        self.identify_point_code = identify_point_code
        # 鉴定商品此鉴定点的图片
        self.identify_point_img = identify_point_img

    def validate(self):
        self.validate_required(self.identify_point_name, 'identify_point_name')
        self.validate_required(self.identify_point_code, 'identify_point_code')
        self.validate_required(self.identify_point_img, 'identify_point_img')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.identify_point_name is not None:
            result['identify_point_name'] = self.identify_point_name
        if self.identify_point_code is not None:
            result['identify_point_code'] = self.identify_point_code
        if self.identify_point_img is not None:
            result['identify_point_img'] = self.identify_point_img
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('identify_point_name') is not None:
            self.identify_point_name = m.get('identify_point_name')
        if m.get('identify_point_code') is not None:
            self.identify_point_code = m.get('identify_point_code')
        if m.get('identify_point_img') is not None:
            self.identify_point_img = m.get('identify_point_img')
        return self


class IdentifyPointResp(TeaModel):
    def __init__(
        self,
        identify_point_name: str = None,
        order: int = None,
        identify_point_code: str = None,
        label_img: str = None,
        example_img: str = None,
        is_required: bool = None,
    ):
        # 鉴定点名称
        self.identify_point_name = identify_point_name
        # 鉴定点序号
        self.order = order
        # 鉴定点编号
        self.identify_point_code = identify_point_code
        # 标签图片oss链接
        self.label_img = label_img
        # 示例图片oss链接
        self.example_img = example_img
        # 是否必传鉴定点
        self.is_required = is_required

    def validate(self):
        self.validate_required(self.identify_point_name, 'identify_point_name')
        self.validate_required(self.order, 'order')
        self.validate_required(self.identify_point_code, 'identify_point_code')
        self.validate_required(self.label_img, 'label_img')
        self.validate_required(self.example_img, 'example_img')
        self.validate_required(self.is_required, 'is_required')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.identify_point_name is not None:
            result['identify_point_name'] = self.identify_point_name
        if self.order is not None:
            result['order'] = self.order
        if self.identify_point_code is not None:
            result['identify_point_code'] = self.identify_point_code
        if self.label_img is not None:
            result['label_img'] = self.label_img
        if self.example_img is not None:
            result['example_img'] = self.example_img
        if self.is_required is not None:
            result['is_required'] = self.is_required
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('identify_point_name') is not None:
            self.identify_point_name = m.get('identify_point_name')
        if m.get('order') is not None:
            self.order = m.get('order')
        if m.get('identify_point_code') is not None:
            self.identify_point_code = m.get('identify_point_code')
        if m.get('label_img') is not None:
            self.label_img = m.get('label_img')
        if m.get('example_img') is not None:
            self.example_img = m.get('example_img')
        if m.get('is_required') is not None:
            self.is_required = m.get('is_required')
        return self


class IdentifyPointResultResp(TeaModel):
    def __init__(
        self,
        identify_point_name: str = None,
        identify_point_code: str = None,
        identify_point_img: str = None,
        identify_point_result: str = None,
    ):
        # 234
        self.identify_point_name = identify_point_name
        # 鉴定点唯一编号
        self.identify_point_code = identify_point_code
        # 鉴定点图片
        self.identify_point_img = identify_point_img
        # 鉴定点的鉴定结果
        # SUCCESS：符合鉴定标准
        # FAILED：不符合鉴定标准
        # NOT_IDENTIFY：无法鉴定
        self.identify_point_result = identify_point_result

    def validate(self):
        self.validate_required(self.identify_point_name, 'identify_point_name')
        self.validate_required(self.identify_point_code, 'identify_point_code')
        self.validate_required(self.identify_point_img, 'identify_point_img')
        self.validate_required(self.identify_point_result, 'identify_point_result')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.identify_point_name is not None:
            result['identify_point_name'] = self.identify_point_name
        if self.identify_point_code is not None:
            result['identify_point_code'] = self.identify_point_code
        if self.identify_point_img is not None:
            result['identify_point_img'] = self.identify_point_img
        if self.identify_point_result is not None:
            result['identify_point_result'] = self.identify_point_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('identify_point_name') is not None:
            self.identify_point_name = m.get('identify_point_name')
        if m.get('identify_point_code') is not None:
            self.identify_point_code = m.get('identify_point_code')
        if m.get('identify_point_img') is not None:
            self.identify_point_img = m.get('identify_point_img')
        if m.get('identify_point_result') is not None:
            self.identify_point_result = m.get('identify_point_result')
        return self


class QueryIdentifypointRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        category_name: str = None,
        brand_name: str = None,
        style_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 品类名称
        self.category_name = category_name
        # 品牌名称
        self.brand_name = brand_name
        # 款式名称
        self.style_name = style_name

    def validate(self):
        self.validate_required(self.category_name, 'category_name')
        self.validate_required(self.brand_name, 'brand_name')
        self.validate_required(self.style_name, 'style_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.category_name is not None:
            result['category_name'] = self.category_name
        if self.brand_name is not None:
            result['brand_name'] = self.brand_name
        if self.style_name is not None:
            result['style_name'] = self.style_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('category_name') is not None:
            self.category_name = m.get('category_name')
        if m.get('brand_name') is not None:
            self.brand_name = m.get('brand_name')
        if m.get('style_name') is not None:
            self.style_name = m.get('style_name')
        return self


class QueryIdentifypointResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        category_name: str = None,
        brand_name: str = None,
        style_name: str = None,
        style_code: str = None,
        at_least_num: int = None,
        identify_point_list: List[IdentifyPointResp] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 品类名称
        self.category_name = category_name
        # 品牌名称
        self.brand_name = brand_name
        # 款式名称
        self.style_name = style_name
        # 款式编号
        self.style_code = style_code
        # 至少上传鉴定点数量
        self.at_least_num = at_least_num
        # 鉴定点信息列表
        self.identify_point_list = identify_point_list

    def validate(self):
        if self.identify_point_list:
            for k in self.identify_point_list:
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
        if self.category_name is not None:
            result['category_name'] = self.category_name
        if self.brand_name is not None:
            result['brand_name'] = self.brand_name
        if self.style_name is not None:
            result['style_name'] = self.style_name
        if self.style_code is not None:
            result['style_code'] = self.style_code
        if self.at_least_num is not None:
            result['at_least_num'] = self.at_least_num
        result['identify_point_list'] = []
        if self.identify_point_list is not None:
            for k in self.identify_point_list:
                result['identify_point_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('category_name') is not None:
            self.category_name = m.get('category_name')
        if m.get('brand_name') is not None:
            self.brand_name = m.get('brand_name')
        if m.get('style_name') is not None:
            self.style_name = m.get('style_name')
        if m.get('style_code') is not None:
            self.style_code = m.get('style_code')
        if m.get('at_least_num') is not None:
            self.at_least_num = m.get('at_least_num')
        self.identify_point_list = []
        if m.get('identify_point_list') is not None:
            for k in m.get('identify_point_list'):
                temp_model = IdentifyPointResp()
                self.identify_point_list.append(temp_model.from_map(k))
        return self


class OperateIdentifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        category_name: str = None,
        brand_name: str = None,
        style_name: str = None,
        style_code: str = None,
        identify_point_list: List[IdentifyPointReq] = None,
        identify_point_img_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 品类名称
        self.category_name = category_name
        # 品牌名称
        self.brand_name = brand_name
        # 款式名称
        self.style_name = style_name
        # 款式编号
        self.style_code = style_code
        # 鉴定点信息列表
        self.identify_point_list = identify_point_list
        # 鉴定点图片列表，当不能提供完整鉴定点信息列表时，可根据鉴定点查询接口出参中order字段将图片直接放入列表中
        self.identify_point_img_list = identify_point_img_list

    def validate(self):
        self.validate_required(self.category_name, 'category_name')
        self.validate_required(self.brand_name, 'brand_name')
        self.validate_required(self.style_name, 'style_name')
        if self.identify_point_list:
            for k in self.identify_point_list:
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
        if self.category_name is not None:
            result['category_name'] = self.category_name
        if self.brand_name is not None:
            result['brand_name'] = self.brand_name
        if self.style_name is not None:
            result['style_name'] = self.style_name
        if self.style_code is not None:
            result['style_code'] = self.style_code
        result['identify_point_list'] = []
        if self.identify_point_list is not None:
            for k in self.identify_point_list:
                result['identify_point_list'].append(k.to_map() if k else None)
        if self.identify_point_img_list is not None:
            result['identify_point_img_list'] = self.identify_point_img_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('category_name') is not None:
            self.category_name = m.get('category_name')
        if m.get('brand_name') is not None:
            self.brand_name = m.get('brand_name')
        if m.get('style_name') is not None:
            self.style_name = m.get('style_name')
        if m.get('style_code') is not None:
            self.style_code = m.get('style_code')
        self.identify_point_list = []
        if m.get('identify_point_list') is not None:
            for k in m.get('identify_point_list'):
                temp_model = IdentifyPointReq()
                self.identify_point_list.append(temp_model.from_map(k))
        if m.get('identify_point_img_list') is not None:
            self.identify_point_img_list = m.get('identify_point_img_list')
        return self


class OperateIdentifyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        identify_number: str = None,
        category_name: str = None,
        brand_name: str = None,
        style_name: str = None,
        identify_result: str = None,
        identify_desc: str = None,
        identify_point_result_list: List[IdentifyPointResultResp] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 鉴定单编号
        self.identify_number = identify_number
        # 品类名称
        self.category_name = category_name
        # 品牌名称
        self.brand_name = brand_name
        # 款式名称
        self.style_name = style_name
        # 整体鉴定结果
        # SUCCESS：符合鉴定标准
        # FAILED：不符合鉴定标准
        # NOT_IDENTIFY：无法鉴定
        self.identify_result = identify_result
        # 鉴定描述
        self.identify_desc = identify_desc
        # 鉴定点结果列表
        self.identify_point_result_list = identify_point_result_list

    def validate(self):
        if self.identify_point_result_list:
            for k in self.identify_point_result_list:
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
        if self.identify_number is not None:
            result['identify_number'] = self.identify_number
        if self.category_name is not None:
            result['category_name'] = self.category_name
        if self.brand_name is not None:
            result['brand_name'] = self.brand_name
        if self.style_name is not None:
            result['style_name'] = self.style_name
        if self.identify_result is not None:
            result['identify_result'] = self.identify_result
        if self.identify_desc is not None:
            result['identify_desc'] = self.identify_desc
        result['identify_point_result_list'] = []
        if self.identify_point_result_list is not None:
            for k in self.identify_point_result_list:
                result['identify_point_result_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('identify_number') is not None:
            self.identify_number = m.get('identify_number')
        if m.get('category_name') is not None:
            self.category_name = m.get('category_name')
        if m.get('brand_name') is not None:
            self.brand_name = m.get('brand_name')
        if m.get('style_name') is not None:
            self.style_name = m.get('style_name')
        if m.get('identify_result') is not None:
            self.identify_result = m.get('identify_result')
        if m.get('identify_desc') is not None:
            self.identify_desc = m.get('identify_desc')
        self.identify_point_result_list = []
        if m.get('identify_point_result_list') is not None:
            for k in m.get('identify_point_result_list'):
                temp_model = IdentifyPointResultResp()
                self.identify_point_result_list.append(temp_model.from_map(k))
        return self


class OperateFileuploadGetsignedurlRequest(TeaModel):
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


class OperateFileuploadGetsignedurlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        file_id: str = None,
        oss_url: str = None,
        oss_key: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文件ID(用于 提交数据进行AI鉴定 时图片对应的属性值)
        self.file_id = file_id
        # oss上传文件链接
        self.oss_url = oss_url
        # oss上传文件时的ossKey值
        self.oss_key = oss_key

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
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.oss_url is not None:
            result['oss_url'] = self.oss_url
        if self.oss_key is not None:
            result['oss_key'] = self.oss_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('oss_url') is not None:
            self.oss_url = m.get('oss_url')
        if m.get('oss_key') is not None:
            self.oss_key = m.get('oss_key')
        return self


