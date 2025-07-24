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


class OrderDetail(TeaModel):
    def __init__(
        self,
        voucher_code: str = None,
    ):
        # 凭证编号
        self.voucher_code = voucher_code

    def validate(self):
        self.validate_required(self.voucher_code, 'voucher_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.voucher_code is not None:
            result['voucher_code'] = self.voucher_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('voucher_code') is not None:
            self.voucher_code = m.get('voucher_code')
        return self


class CommonResponse(TeaModel):
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
        # 
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


class RightsGrantResultVO(TeaModel):
    def __init__(
        self,
        expire_time: str = None,
        effect_time: str = None,
        grant_status: str = None,
        order_details: List[OrderDetail] = None,
    ):
        # 过期时间
        self.expire_time = expire_time
        # 生效时间
        self.effect_time = effect_time
        # 发放状态：
        # GRANTING：发放处理中 GRANT_SUCCESS：发放成功 GRANT_FAIL：发放失败
        self.grant_status = grant_status
        # 订单详情列表
        self.order_details = order_details

    def validate(self):
        if self.expire_time is not None:
            self.validate_pattern(self.expire_time, 'expire_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.effect_time is not None:
            self.validate_pattern(self.effect_time, 'effect_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.grant_status, 'grant_status')
        if self.order_details:
            for k in self.order_details:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.expire_time is not None:
            result['expire_time'] = self.expire_time
        if self.effect_time is not None:
            result['effect_time'] = self.effect_time
        if self.grant_status is not None:
            result['grant_status'] = self.grant_status
        result['order_details'] = []
        if self.order_details is not None:
            for k in self.order_details:
                result['order_details'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('expire_time') is not None:
            self.expire_time = m.get('expire_time')
        if m.get('effect_time') is not None:
            self.effect_time = m.get('effect_time')
        if m.get('grant_status') is not None:
            self.grant_status = m.get('grant_status')
        self.order_details = []
        if m.get('order_details') is not None:
            for k in m.get('order_details'):
                temp_model = OrderDetail()
                self.order_details.append(temp_model.from_map(k))
        return self


class SubmitRightsprodGrantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        phone_number: str = None,
        merchant_no: str = None,
        rights_code: str = None,
        grant_num: int = None,
        face_value: str = None,
        out_grant_order_no: str = None,
        ext_info: str = None,
        grant_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 2088xxxx123
        self.user_id = user_id
        # 用户手机号
        self.phone_number = phone_number
        # 商户编号
        self.merchant_no = merchant_no
        # 权益编码
        self.rights_code = rights_code
        # 发放数量
        self.grant_num = grant_num
        # 面额，动态面额类型必传
        self.face_value = face_value
        # 外部发放订单号
        self.out_grant_order_no = out_grant_order_no
        # 扩展信息
        self.ext_info = ext_info
        # 发放信息,如活动ID等信息
        self.grant_info = grant_info

    def validate(self):
        self.validate_required(self.rights_code, 'rights_code')
        self.validate_required(self.grant_num, 'grant_num')
        self.validate_required(self.out_grant_order_no, 'out_grant_order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.phone_number is not None:
            result['phone_number'] = self.phone_number
        if self.merchant_no is not None:
            result['merchant_no'] = self.merchant_no
        if self.rights_code is not None:
            result['rights_code'] = self.rights_code
        if self.grant_num is not None:
            result['grant_num'] = self.grant_num
        if self.face_value is not None:
            result['face_value'] = self.face_value
        if self.out_grant_order_no is not None:
            result['out_grant_order_no'] = self.out_grant_order_no
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        if self.grant_info is not None:
            result['grant_info'] = self.grant_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('phone_number') is not None:
            self.phone_number = m.get('phone_number')
        if m.get('merchant_no') is not None:
            self.merchant_no = m.get('merchant_no')
        if m.get('rights_code') is not None:
            self.rights_code = m.get('rights_code')
        if m.get('grant_num') is not None:
            self.grant_num = m.get('grant_num')
        if m.get('face_value') is not None:
            self.face_value = m.get('face_value')
        if m.get('out_grant_order_no') is not None:
            self.out_grant_order_no = m.get('out_grant_order_no')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        if m.get('grant_info') is not None:
            self.grant_info = m.get('grant_info')
        return self


class SubmitRightsprodGrantResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        rights_grant_result: RightsGrantResultVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 权益发放结果
        self.rights_grant_result = rights_grant_result

    def validate(self):
        if self.rights_grant_result:
            self.rights_grant_result.validate()

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
        if self.rights_grant_result is not None:
            result['rights_grant_result'] = self.rights_grant_result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('rights_grant_result') is not None:
            temp_model = RightsGrantResultVO()
            self.rights_grant_result = temp_model.from_map(m['rights_grant_result'])
        return self


class QueryRightsprodGrantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        out_grant_order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部发放订单号
        self.out_grant_order_no = out_grant_order_no

    def validate(self):
        self.validate_required(self.out_grant_order_no, 'out_grant_order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.out_grant_order_no is not None:
            result['out_grant_order_no'] = self.out_grant_order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('out_grant_order_no') is not None:
            self.out_grant_order_no = m.get('out_grant_order_no')
        return self


class QueryRightsprodGrantResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        rights_grant_result: RightsGrantResultVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 权益发放结果
        self.rights_grant_result = rights_grant_result

    def validate(self):
        if self.rights_grant_result:
            self.rights_grant_result.validate()

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
        if self.rights_grant_result is not None:
            result['rights_grant_result'] = self.rights_grant_result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('rights_grant_result') is not None:
            temp_model = RightsGrantResultVO()
            self.rights_grant_result = temp_model.from_map(m['rights_grant_result'])
        return self


