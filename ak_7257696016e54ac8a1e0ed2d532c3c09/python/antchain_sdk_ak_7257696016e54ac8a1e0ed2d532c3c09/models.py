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


class AuthorizeRecordsPairs(TeaModel):
    def __init__(
        self,
        auth_business_code: str = None,
        auth_business_secret: str = None,
    ):
        # 授权业务
        self.auth_business_code = auth_business_code
        # 授权密钥
        self.auth_business_secret = auth_business_secret

    def validate(self):
        self.validate_required(self.auth_business_code, 'auth_business_code')
        self.validate_required(self.auth_business_secret, 'auth_business_secret')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_business_code is not None:
            result['auth_business_code'] = self.auth_business_code
        if self.auth_business_secret is not None:
            result['auth_business_secret'] = self.auth_business_secret
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_business_code') is not None:
            self.auth_business_code = m.get('auth_business_code')
        if m.get('auth_business_secret') is not None:
            self.auth_business_secret = m.get('auth_business_secret')
        return self


class OperateAntchainBbpInsuranceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        mechanism_code: str = None,
        policy_encryption_context: str = None,
        policy_no: str = None,
        thirdpart_sku: str = None,
        mechanism_name: str = None,
        insurance_type: str = None,
        source_uid: str = None,
        source: str = None,
        user_name: str = None,
        user_type: str = None,
        user_phonenumber: str = None,
        user_cert_no: str = None,
        extend: str = None,
        policy_effect_time: int = None,
        policy_invalid_time: int = None,
        policy_total_amount: int = None,
        policy_total_stage: int = None,
        policy_pay_date: int = None,
        policy_paid_stage: int = None,
        policy_stage_aver_amount: int = None,
        order_time: int = None,
        operation: str = None,
        claim_order_no: str = None,
        claim_apply_time: int = None,
        claim_pay_time: int = None,
        claim_apply_amount: int = None,
        claim_amount: int = None,
        authorize_records: List[AuthorizeRecordsPairs] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 保司编码
        self.mechanism_code = mechanism_code
        # 保单加密信息
        self.policy_encryption_context = policy_encryption_context
        # 保单号
        self.policy_no = policy_no
        # 保险产品SKU
        self.thirdpart_sku = thirdpart_sku
        # 保险公司名称
        self.mechanism_name = mechanism_name
        # 保单种类，险种
        self.insurance_type = insurance_type
        # 来源uid，此处指天猫id
        self.source_uid = source_uid
        # 订单来源
        self.source = source
        # 投保人
        self.user_name = user_name
        # 投保人类型  自然人/公司
        self.user_type = user_type
        # 投保人电话号码
        self.user_phonenumber = user_phonenumber
        # 投保人证件号
        self.user_cert_no = user_cert_no
        # 拓展信息
        self.extend = extend
        # 保单生效时间（毫秒值）
        self.policy_effect_time = policy_effect_time
        # 保单失效时间（毫秒值）
        self.policy_invalid_time = policy_invalid_time
        # 订单总金额 BigDecimal
        self.policy_total_amount = policy_total_amount
        # 订单总期数（一次性付款用1）
        self.policy_total_stage = policy_total_stage
        # 保费支付日期（毫秒值）
        self.policy_pay_date = policy_pay_date
        # 已支付保费期数（1代表1期）
        self.policy_paid_stage = policy_paid_stage
        # 每一期保费金额BigDecimal
        self.policy_stage_aver_amount = policy_stage_aver_amount
        # 订单时间（毫秒值）
        self.order_time = order_time
        # 操作类型
        # 下单 支付 理赔 退单
        self.operation = operation
        # 赔付单号(对于赔付操作来说是必填项)
        self.claim_order_no = claim_order_no
        # 理赔申请时间 理赔操作必填
        self.claim_apply_time = claim_apply_time
        # 理赔赔付时间 理赔操作必填
        self.claim_pay_time = claim_pay_time
        # 理赔申请金额BigDecimal，单位元，保留小数点两位  理赔操作必填
        self.claim_apply_amount = claim_apply_amount
        # 理赔金额BigDecimal，理赔操作必填
        self.claim_amount = claim_amount
        # 授权列表
        self.authorize_records = authorize_records

    def validate(self):
        self.validate_required(self.mechanism_code, 'mechanism_code')
        self.validate_required(self.policy_encryption_context, 'policy_encryption_context')
        self.validate_required(self.policy_no, 'policy_no')
        self.validate_required(self.thirdpart_sku, 'thirdpart_sku')
        self.validate_required(self.user_type, 'user_type')
        self.validate_required(self.policy_effect_time, 'policy_effect_time')
        self.validate_required(self.policy_invalid_time, 'policy_invalid_time')
        self.validate_required(self.policy_total_amount, 'policy_total_amount')
        self.validate_required(self.policy_total_stage, 'policy_total_stage')
        self.validate_required(self.policy_pay_date, 'policy_pay_date')
        if self.authorize_records:
            for k in self.authorize_records:
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
        if self.mechanism_code is not None:
            result['mechanism_code'] = self.mechanism_code
        if self.policy_encryption_context is not None:
            result['policy_encryption_context'] = self.policy_encryption_context
        if self.policy_no is not None:
            result['policy_no'] = self.policy_no
        if self.thirdpart_sku is not None:
            result['thirdpart_sku'] = self.thirdpart_sku
        if self.mechanism_name is not None:
            result['mechanism_name'] = self.mechanism_name
        if self.insurance_type is not None:
            result['insurance_type'] = self.insurance_type
        if self.source_uid is not None:
            result['source_uid'] = self.source_uid
        if self.source is not None:
            result['source'] = self.source
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.user_phonenumber is not None:
            result['user_phonenumber'] = self.user_phonenumber
        if self.user_cert_no is not None:
            result['user_cert_no'] = self.user_cert_no
        if self.extend is not None:
            result['extend'] = self.extend
        if self.policy_effect_time is not None:
            result['policy_effect_time'] = self.policy_effect_time
        if self.policy_invalid_time is not None:
            result['policy_invalid_time'] = self.policy_invalid_time
        if self.policy_total_amount is not None:
            result['policy_total_amount'] = self.policy_total_amount
        if self.policy_total_stage is not None:
            result['policy_total_stage'] = self.policy_total_stage
        if self.policy_pay_date is not None:
            result['policy_pay_date'] = self.policy_pay_date
        if self.policy_paid_stage is not None:
            result['policy_paid_stage'] = self.policy_paid_stage
        if self.policy_stage_aver_amount is not None:
            result['policy_stage_aver_amount'] = self.policy_stage_aver_amount
        if self.order_time is not None:
            result['order_time'] = self.order_time
        if self.operation is not None:
            result['operation'] = self.operation
        if self.claim_order_no is not None:
            result['claim_order_no'] = self.claim_order_no
        if self.claim_apply_time is not None:
            result['claim_apply_time'] = self.claim_apply_time
        if self.claim_pay_time is not None:
            result['claim_pay_time'] = self.claim_pay_time
        if self.claim_apply_amount is not None:
            result['claim_apply_amount'] = self.claim_apply_amount
        if self.claim_amount is not None:
            result['claim_amount'] = self.claim_amount
        result['authorize_records'] = []
        if self.authorize_records is not None:
            for k in self.authorize_records:
                result['authorize_records'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('mechanism_code') is not None:
            self.mechanism_code = m.get('mechanism_code')
        if m.get('policy_encryption_context') is not None:
            self.policy_encryption_context = m.get('policy_encryption_context')
        if m.get('policy_no') is not None:
            self.policy_no = m.get('policy_no')
        if m.get('thirdpart_sku') is not None:
            self.thirdpart_sku = m.get('thirdpart_sku')
        if m.get('mechanism_name') is not None:
            self.mechanism_name = m.get('mechanism_name')
        if m.get('insurance_type') is not None:
            self.insurance_type = m.get('insurance_type')
        if m.get('source_uid') is not None:
            self.source_uid = m.get('source_uid')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('user_phonenumber') is not None:
            self.user_phonenumber = m.get('user_phonenumber')
        if m.get('user_cert_no') is not None:
            self.user_cert_no = m.get('user_cert_no')
        if m.get('extend') is not None:
            self.extend = m.get('extend')
        if m.get('policy_effect_time') is not None:
            self.policy_effect_time = m.get('policy_effect_time')
        if m.get('policy_invalid_time') is not None:
            self.policy_invalid_time = m.get('policy_invalid_time')
        if m.get('policy_total_amount') is not None:
            self.policy_total_amount = m.get('policy_total_amount')
        if m.get('policy_total_stage') is not None:
            self.policy_total_stage = m.get('policy_total_stage')
        if m.get('policy_pay_date') is not None:
            self.policy_pay_date = m.get('policy_pay_date')
        if m.get('policy_paid_stage') is not None:
            self.policy_paid_stage = m.get('policy_paid_stage')
        if m.get('policy_stage_aver_amount') is not None:
            self.policy_stage_aver_amount = m.get('policy_stage_aver_amount')
        if m.get('order_time') is not None:
            self.order_time = m.get('order_time')
        if m.get('operation') is not None:
            self.operation = m.get('operation')
        if m.get('claim_order_no') is not None:
            self.claim_order_no = m.get('claim_order_no')
        if m.get('claim_apply_time') is not None:
            self.claim_apply_time = m.get('claim_apply_time')
        if m.get('claim_pay_time') is not None:
            self.claim_pay_time = m.get('claim_pay_time')
        if m.get('claim_apply_amount') is not None:
            self.claim_apply_amount = m.get('claim_apply_amount')
        if m.get('claim_amount') is not None:
            self.claim_amount = m.get('claim_amount')
        self.authorize_records = []
        if m.get('authorize_records') is not None:
            for k in m.get('authorize_records'):
                temp_model = AuthorizeRecordsPairs()
                self.authorize_records.append(temp_model.from_map(k))
        return self


class OperateAntchainBbpInsuranceResponse(TeaModel):
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


