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


class SoldSpecInstance(TeaModel):
    def __init__(
        self,
        spec_code: str = None,
        spec_instance_id: str = None,
        status: str = None,
        start_time: str = None,
        plan_stop_time: str = None,
        actual_stop_time: str = None,
        merchant_id: str = None,
        num: int = None,
        spec_type: str = None,
        res_code: str = None,
        context: str = None,
    ):
        # 规格码
        self.spec_code = spec_code
        # 规格实例id
        self.spec_instance_id = spec_instance_id
        # 规格实例运行状态.
        # STARTED 正常有效、STOPPED 停服、STAETED_IN_ARR 欠费运行中......
        self.status = status
        # 实例生效时间
        self.start_time = start_time
        # 实例计划停服时间
        self.plan_stop_time = plan_stop_time
        # 实例实际停服时间
        self.actual_stop_time = actual_stop_time
        # 购买规格实例的商户id(商业中台用来唯一标识商户的id)
        self.merchant_id = merchant_id
        # 购买数量
        self.num = num
        # 商品规格售卖类型：按量付费（POST）、资源包（BAG）、包年包月（PRE）
        self.spec_type = spec_type
        # 资源（包）code
        self.res_code = res_code
        # 其他上下文信息，kv结构，本先新增，后面有新新增可以放在这里面，不用再升级接口
        self.context = context

    def validate(self):
        self.validate_required(self.spec_code, 'spec_code')
        self.validate_required(self.spec_instance_id, 'spec_instance_id')
        self.validate_required(self.status, 'status')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.plan_stop_time is not None:
            self.validate_pattern(self.plan_stop_time, 'plan_stop_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.actual_stop_time is not None:
            self.validate_pattern(self.actual_stop_time, 'actual_stop_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.num, 'num')
        self.validate_required(self.spec_type, 'spec_type')
        if self.res_code is not None:
            self.validate_max_length(self.res_code, 'res_code', 128)
        if self.context is not None:
            self.validate_max_length(self.context, 'context', 2048)

    def to_map(self):
        result = dict()
        if self.spec_code is not None:
            result['spec_code'] = self.spec_code
        if self.spec_instance_id is not None:
            result['spec_instance_id'] = self.spec_instance_id
        if self.status is not None:
            result['status'] = self.status
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.plan_stop_time is not None:
            result['plan_stop_time'] = self.plan_stop_time
        if self.actual_stop_time is not None:
            result['actual_stop_time'] = self.actual_stop_time
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.num is not None:
            result['num'] = self.num
        if self.spec_type is not None:
            result['spec_type'] = self.spec_type
        if self.res_code is not None:
            result['res_code'] = self.res_code
        if self.context is not None:
            result['context'] = self.context
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('spec_code') is not None:
            self.spec_code = m.get('spec_code')
        if m.get('spec_instance_id') is not None:
            self.spec_instance_id = m.get('spec_instance_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('plan_stop_time') is not None:
            self.plan_stop_time = m.get('plan_stop_time')
        if m.get('actual_stop_time') is not None:
            self.actual_stop_time = m.get('actual_stop_time')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('num') is not None:
            self.num = m.get('num')
        if m.get('spec_type') is not None:
            self.spec_type = m.get('spec_type')
        if m.get('res_code') is not None:
            self.res_code = m.get('res_code')
        if m.get('context') is not None:
            self.context = m.get('context')
        return self


class PushMeterPeriodicusageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        domain_code: str = None,
        spec_code: str = None,
        resource_code: str = None,
        spec_instance_id: str = None,
        data: str = None,
        gmt_meter_begin: str = None,
        gmt_meter_end: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 计量域编码
        self.domain_code = domain_code
        # 规格编码
        self.spec_code = spec_code
        # 
        # 资源编码
        self.resource_code = resource_code
        # 规格实例id
        self.spec_instance_id = spec_instance_id
        # 计量数据，json string格式字符串
        self.data = data
        # 计量数据对应的发生周期开始时间yyyyMMddHHmmss格式
        self.gmt_meter_begin = gmt_meter_begin
        # 计量数据对应的发生周期开始时间yyyyMMddHHmmss格式
        self.gmt_meter_end = gmt_meter_end

    def validate(self):
        self.validate_required(self.domain_code, 'domain_code')
        if self.domain_code is not None:
            self.validate_max_length(self.domain_code, 'domain_code', 128)
        self.validate_required(self.spec_code, 'spec_code')
        if self.spec_code is not None:
            self.validate_max_length(self.spec_code, 'spec_code', 128)
        self.validate_required(self.resource_code, 'resource_code')
        if self.resource_code is not None:
            self.validate_max_length(self.resource_code, 'resource_code', 128)
        self.validate_required(self.spec_instance_id, 'spec_instance_id')
        if self.spec_instance_id is not None:
            self.validate_max_length(self.spec_instance_id, 'spec_instance_id', 128)
        self.validate_required(self.data, 'data')
        self.validate_required(self.gmt_meter_begin, 'gmt_meter_begin')
        self.validate_required(self.gmt_meter_end, 'gmt_meter_end')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.domain_code is not None:
            result['domain_code'] = self.domain_code
        if self.spec_code is not None:
            result['spec_code'] = self.spec_code
        if self.resource_code is not None:
            result['resource_code'] = self.resource_code
        if self.spec_instance_id is not None:
            result['spec_instance_id'] = self.spec_instance_id
        if self.data is not None:
            result['data'] = self.data
        if self.gmt_meter_begin is not None:
            result['gmt_meter_begin'] = self.gmt_meter_begin
        if self.gmt_meter_end is not None:
            result['gmt_meter_end'] = self.gmt_meter_end
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('domain_code') is not None:
            self.domain_code = m.get('domain_code')
        if m.get('spec_code') is not None:
            self.spec_code = m.get('spec_code')
        if m.get('resource_code') is not None:
            self.resource_code = m.get('resource_code')
        if m.get('spec_instance_id') is not None:
            self.spec_instance_id = m.get('spec_instance_id')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('gmt_meter_begin') is not None:
            self.gmt_meter_begin = m.get('gmt_meter_begin')
        if m.get('gmt_meter_end') is not None:
            self.gmt_meter_end = m.get('gmt_meter_end')
        return self


class PushMeterPeriodicusageResponse(TeaModel):
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


class PushMeterRealtimeusageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_id: str = None,
        domain_code: str = None,
        spec_code: str = None,
        resource_code: str = None,
        spec_instance_id: str = None,
        data: str = None,
        gmt_meter: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求id，防重用
        self.request_id = request_id
        # 计量域编码
        self.domain_code = domain_code
        # 规格编码
        self.spec_code = spec_code
        # 资源编码
        self.resource_code = resource_code
        # 规格实例id
        self.spec_instance_id = spec_instance_id
        # 计量数据，json string格式字符串
        self.data = data
        # 计量数据发生时间
        self.gmt_meter = gmt_meter

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        if self.request_id is not None:
            self.validate_max_length(self.request_id, 'request_id', 64)
        self.validate_required(self.domain_code, 'domain_code')
        if self.domain_code is not None:
            self.validate_max_length(self.domain_code, 'domain_code', 128)
        self.validate_required(self.spec_code, 'spec_code')
        if self.spec_code is not None:
            self.validate_max_length(self.spec_code, 'spec_code', 128)
        self.validate_required(self.resource_code, 'resource_code')
        if self.resource_code is not None:
            self.validate_max_length(self.resource_code, 'resource_code', 128)
        self.validate_required(self.spec_instance_id, 'spec_instance_id')
        if self.spec_instance_id is not None:
            self.validate_max_length(self.spec_instance_id, 'spec_instance_id', 128)
        self.validate_required(self.data, 'data')
        self.validate_required(self.gmt_meter, 'gmt_meter')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.domain_code is not None:
            result['domain_code'] = self.domain_code
        if self.spec_code is not None:
            result['spec_code'] = self.spec_code
        if self.resource_code is not None:
            result['resource_code'] = self.resource_code
        if self.spec_instance_id is not None:
            result['spec_instance_id'] = self.spec_instance_id
        if self.data is not None:
            result['data'] = self.data
        if self.gmt_meter is not None:
            result['gmt_meter'] = self.gmt_meter
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('domain_code') is not None:
            self.domain_code = m.get('domain_code')
        if m.get('spec_code') is not None:
            self.spec_code = m.get('spec_code')
        if m.get('resource_code') is not None:
            self.resource_code = m.get('resource_code')
        if m.get('spec_instance_id') is not None:
            self.spec_instance_id = m.get('spec_instance_id')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('gmt_meter') is not None:
            self.gmt_meter = m.get('gmt_meter')
        return self


class PushMeterRealtimeusageResponse(TeaModel):
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


class QueryTradecoreMerchantinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        merchant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 商业中台唯一标识商户的id
        self.merchant_id = merchant_id

    def validate(self):
        self.validate_required(self.merchant_id, 'merchant_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class QueryTradecoreMerchantinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        merchant_name: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商户的名称
        self.merchant_name = merchant_name

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
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        return self


class BatchqueryTradecoreSoldspecinstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        merchant_id: str = None,
        merchant_login_main_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 商业中台用来唯一标记商户的id merchant_id 与 merchant_login_main_id至少填一个
        self.merchant_id = merchant_id
        # 商户(买家)登录主账号user_id， merchant_id 与 merchant_login_main_id至少填一个
        self.merchant_login_main_id = merchant_login_main_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.merchant_login_main_id is not None:
            result['merchant_login_main_id'] = self.merchant_login_main_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('merchant_login_main_id') is not None:
            self.merchant_login_main_id = m.get('merchant_login_main_id')
        return self


class BatchqueryTradecoreSoldspecinstanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sold_spec_instances: List[SoldSpecInstance] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 某开发商已售给某商户的所有规格实例信息
        self.sold_spec_instances = sold_spec_instances

    def validate(self):
        if self.sold_spec_instances:
            for k in self.sold_spec_instances:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['sold_spec_instances'] = []
        if self.sold_spec_instances is not None:
            for k in self.sold_spec_instances:
                result['sold_spec_instances'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.sold_spec_instances = []
        if m.get('sold_spec_instances') is not None:
            for k in m.get('sold_spec_instances'):
                temp_model = SoldSpecInstance()
                self.sold_spec_instances.append(temp_model.from_map(k))
        return self


