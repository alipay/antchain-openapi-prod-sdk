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


class OperateDivideTransInModel(TeaModel):
    def __init__(
        self,
        trans_in_user_id: str = None,
        divide_amount: int = None,
    ):
        # 分账收入方支付宝用户id, 支付宝2088id
        self.trans_in_user_id = trans_in_user_id
        # 分账金额，单位为分 大于0
        self.divide_amount = divide_amount

    def validate(self):
        self.validate_required(self.trans_in_user_id, 'trans_in_user_id')
        self.validate_required(self.divide_amount, 'divide_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.trans_in_user_id is not None:
            result['trans_in_user_id'] = self.trans_in_user_id
        if self.divide_amount is not None:
            result['divide_amount'] = self.divide_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('trans_in_user_id') is not None:
            self.trans_in_user_id = m.get('trans_in_user_id')
        if m.get('divide_amount') is not None:
            self.divide_amount = m.get('divide_amount')
        return self


class RepayStrategy(TeaModel):
    def __init__(
        self,
        pay_day: str = None,
        term_index: int = None,
        rental_money: int = None,
        operate_divide_flag: str = None,
        operate_divide_trans_in_list: List[OperateDivideTransInModel] = None,
    ):
        # 应付租金时间，精确到天 格式为yyyy-MM-dd
        self.pay_day = pay_day
        # 用户还款期数，从1开始
        self.term_index = term_index
        # 应付租金，精确到分，即1234表示12.34元 大于0
        self.rental_money = rental_money
        # 是否经营分账, Y-是、N-否 为空代表否
        self.operate_divide_flag = operate_divide_flag
        # 经营分账收入方列表
        # 当operateDivideFlag 为Y时必填
        self.operate_divide_trans_in_list = operate_divide_trans_in_list

    def validate(self):
        self.validate_required(self.pay_day, 'pay_day')
        self.validate_required(self.term_index, 'term_index')
        self.validate_required(self.rental_money, 'rental_money')
        if self.operate_divide_trans_in_list:
            for k in self.operate_divide_trans_in_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.pay_day is not None:
            result['pay_day'] = self.pay_day
        if self.term_index is not None:
            result['term_index'] = self.term_index
        if self.rental_money is not None:
            result['rental_money'] = self.rental_money
        if self.operate_divide_flag is not None:
            result['operate_divide_flag'] = self.operate_divide_flag
        result['operate_divide_trans_in_list'] = []
        if self.operate_divide_trans_in_list is not None:
            for k in self.operate_divide_trans_in_list:
                result['operate_divide_trans_in_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pay_day') is not None:
            self.pay_day = m.get('pay_day')
        if m.get('term_index') is not None:
            self.term_index = m.get('term_index')
        if m.get('rental_money') is not None:
            self.rental_money = m.get('rental_money')
        if m.get('operate_divide_flag') is not None:
            self.operate_divide_flag = m.get('operate_divide_flag')
        self.operate_divide_trans_in_list = []
        if m.get('operate_divide_trans_in_list') is not None:
            for k in m.get('operate_divide_trans_in_list'):
                temp_model = OperateDivideTransInModel()
                self.operate_divide_trans_in_list.append(temp_model.from_map(k))
        return self


class OrderInfoReq(TeaModel):
    def __init__(
        self,
        order_create_time: str = None,
        order_pay_subject: str = None,
        rent_term: int = None,
        rent_unit: str = None,
        total_rent_money: int = None,
    ):
        # 订单创建时间
        self.order_create_time = order_create_time
        # 订单付款主题
        self.order_pay_subject = order_pay_subject
        # 总租期
        # 总租期最小值为1
        # 总租期最大值为60
        self.rent_term = rent_term
        # 租期单位
        # MONTH : 月
        # DAY : 天
        self.rent_unit = rent_unit
        # 租金总额 单位/分
        # 最小值为1
        self.total_rent_money = total_rent_money

    def validate(self):
        self.validate_required(self.order_create_time, 'order_create_time')
        if self.order_create_time is not None:
            self.validate_pattern(self.order_create_time, 'order_create_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.order_pay_subject, 'order_pay_subject')
        self.validate_required(self.rent_term, 'rent_term')
        self.validate_required(self.total_rent_money, 'total_rent_money')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_create_time is not None:
            result['order_create_time'] = self.order_create_time
        if self.order_pay_subject is not None:
            result['order_pay_subject'] = self.order_pay_subject
        if self.rent_term is not None:
            result['rent_term'] = self.rent_term
        if self.rent_unit is not None:
            result['rent_unit'] = self.rent_unit
        if self.total_rent_money is not None:
            result['total_rent_money'] = self.total_rent_money
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_create_time') is not None:
            self.order_create_time = m.get('order_create_time')
        if m.get('order_pay_subject') is not None:
            self.order_pay_subject = m.get('order_pay_subject')
        if m.get('rent_term') is not None:
            self.rent_term = m.get('rent_term')
        if m.get('rent_unit') is not None:
            self.rent_unit = m.get('rent_unit')
        if m.get('total_rent_money') is not None:
            self.total_rent_money = m.get('total_rent_money')
        return self


class OrderPromise(TeaModel):
    def __init__(
        self,
        grace_period_days: int = None,
        punishment_type: str = None,
        pay_period: int = None,
        lease_alipay_uid: str = None,
        repay_strategy_list: List[RepayStrategy] = None,
    ):
        # 宽限期/天
        # 不传默认为0
        self.grace_period_days = grace_period_days
        # 罚息类型
        # NONE : 没有罚息  PENALTY_FEE： 罚息（暂不支持）
        self.punishment_type = punishment_type
        # 租期
        # 租期最小值为1
        self.pay_period = pay_period
        # 租赁公司支付宝UID
        self.lease_alipay_uid = lease_alipay_uid
        # 还款策略
        # repayStrategyList长度 == payPeriod
        self.repay_strategy_list = repay_strategy_list

    def validate(self):
        self.validate_required(self.pay_period, 'pay_period')
        self.validate_required(self.lease_alipay_uid, 'lease_alipay_uid')
        self.validate_required(self.repay_strategy_list, 'repay_strategy_list')
        if self.repay_strategy_list:
            for k in self.repay_strategy_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.grace_period_days is not None:
            result['grace_period_days'] = self.grace_period_days
        if self.punishment_type is not None:
            result['punishment_type'] = self.punishment_type
        if self.pay_period is not None:
            result['pay_period'] = self.pay_period
        if self.lease_alipay_uid is not None:
            result['lease_alipay_uid'] = self.lease_alipay_uid
        result['repay_strategy_list'] = []
        if self.repay_strategy_list is not None:
            for k in self.repay_strategy_list:
                result['repay_strategy_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('grace_period_days') is not None:
            self.grace_period_days = m.get('grace_period_days')
        if m.get('punishment_type') is not None:
            self.punishment_type = m.get('punishment_type')
        if m.get('pay_period') is not None:
            self.pay_period = m.get('pay_period')
        if m.get('lease_alipay_uid') is not None:
            self.lease_alipay_uid = m.get('lease_alipay_uid')
        self.repay_strategy_list = []
        if m.get('repay_strategy_list') is not None:
            for k in m.get('repay_strategy_list'):
                temp_model = RepayStrategy()
                self.repay_strategy_list.append(temp_model.from_map(k))
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


class OrderFullInfoReq(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        mobile_phone: str = None,
        product_id: str = None,
        merchant_id: str = None,
        merchant_name: str = None,
        biz_scene: str = None,
        biz_type: str = None,
        sign_mode: str = None,
        order_info: OrderInfoReq = None,
        promise_info: OrderPromise = None,
    ):
        # 订单号
        # 
        self.order_id = order_id
        # 手机号
        self.mobile_phone = mobile_phone
        # 产品ID=实际产品ID#版本 prod#1
        # 
        self.product_id = product_id
        # 商户的统一社会信用代码
        self.merchant_id = merchant_id
        # 商户公司名字
        self.merchant_name = merchant_name
        # 业务场景 默认为CHARGING_BY_TERM
        # CHARGING_BY_ORDER : 整单结算
        # CHARGING_BY_TERM : 分期结算
        # CHARGING_BY_TERM_INDIRECT : 间联模式使用，分期结算
        # CHARGING_BY_PROFIT : 分润结算
        self.biz_scene = biz_scene
        # 业务类型 LEASE : 租赁 （默认） INSTALLMENT: 分期付款
        # 
        self.biz_type = biz_type
        # 签署模式 NONE : 灵活签约
        self.sign_mode = sign_mode
        # 主订单信息
        self.order_info = order_info
        # 订单还款计划
        self.promise_info = promise_info

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.mobile_phone, 'mobile_phone')
        self.validate_required(self.product_id, 'product_id')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.merchant_name, 'merchant_name')
        self.validate_required(self.biz_scene, 'biz_scene')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.sign_mode, 'sign_mode')
        self.validate_required(self.order_info, 'order_info')
        if self.order_info:
            self.order_info.validate()
        self.validate_required(self.promise_info, 'promise_info')
        if self.promise_info:
            self.promise_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.mobile_phone is not None:
            result['mobile_phone'] = self.mobile_phone
        if self.product_id is not None:
            result['product_id'] = self.product_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.biz_scene is not None:
            result['biz_scene'] = self.biz_scene
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.sign_mode is not None:
            result['sign_mode'] = self.sign_mode
        if self.order_info is not None:
            result['order_info'] = self.order_info.to_map()
        if self.promise_info is not None:
            result['promise_info'] = self.promise_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('mobile_phone') is not None:
            self.mobile_phone = m.get('mobile_phone')
        if m.get('product_id') is not None:
            self.product_id = m.get('product_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('sign_mode') is not None:
            self.sign_mode = m.get('sign_mode')
        if m.get('order_info') is not None:
            temp_model = OrderInfoReq()
            self.order_info = temp_model.from_map(m['order_info'])
        if m.get('promise_info') is not None:
            temp_model = OrderPromise()
            self.promise_info = temp_model.from_map(m['promise_info'])
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


class CheckOmngRiskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        mobile_phone: str = None,
        product_id: str = None,
        merchant_id: str = None,
        merchant_name: str = None,
        biz_scene: str = None,
        biz_type: str = None,
        sign_mode: str = None,
        order_info: OrderInfoReq = None,
        promise_info: OrderPromise = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_id = order_id
        # 手机号
        self.mobile_phone = mobile_phone
        # 产品ID=实际产品ID#版本
        # prod#1
        self.product_id = product_id
        # 商户的统一社会信用代码
        self.merchant_id = merchant_id
        # 商户公司名字
        self.merchant_name = merchant_name
        # 业务场景
        # 默认为CHARGING_BY_TERM
        # 
        # CHARGING_BY_ORDER : 整单结算
        # CHARGING_BY_TERM : 分期结算
        # CHARGING_BY_TERM_INDIRECT : 间联模式使用，分期结算
        # CHARGING_BY_PROFIT : 分润结算
        self.biz_scene = biz_scene
        # 业务类型
        # LEASE : 租赁 （默认）
        # INSTALLMENT: 分期付款
        # 
        self.biz_type = biz_type
        # 签署模式
        # NONE : 灵活签约
        self.sign_mode = sign_mode
        # 主订单信息
        self.order_info = order_info
        # 订单还款计划
        self.promise_info = promise_info

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.mobile_phone, 'mobile_phone')
        self.validate_required(self.product_id, 'product_id')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.merchant_name, 'merchant_name')
        self.validate_required(self.order_info, 'order_info')
        if self.order_info:
            self.order_info.validate()
        self.validate_required(self.promise_info, 'promise_info')
        if self.promise_info:
            self.promise_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.mobile_phone is not None:
            result['mobile_phone'] = self.mobile_phone
        if self.product_id is not None:
            result['product_id'] = self.product_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.biz_scene is not None:
            result['biz_scene'] = self.biz_scene
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.sign_mode is not None:
            result['sign_mode'] = self.sign_mode
        if self.order_info is not None:
            result['order_info'] = self.order_info.to_map()
        if self.promise_info is not None:
            result['promise_info'] = self.promise_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('mobile_phone') is not None:
            self.mobile_phone = m.get('mobile_phone')
        if m.get('product_id') is not None:
            self.product_id = m.get('product_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('sign_mode') is not None:
            self.sign_mode = m.get('sign_mode')
        if m.get('order_info') is not None:
            temp_model = OrderInfoReq()
            self.order_info = temp_model.from_map(m['order_info'])
        if m.get('promise_info') is not None:
            temp_model = OrderPromise()
            self.promise_info = temp_model.from_map(m['promise_info'])
        return self


class CheckOmngRiskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        info_str: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权串
        self.info_str = info_str

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
        if self.info_str is not None:
            result['info_str'] = self.info_str
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('info_str') is not None:
            self.info_str = m.get('info_str')
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
        ext_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部发放订单号
        self.out_grant_order_no = out_grant_order_no
        # 扩展信息
        self.ext_info = ext_info

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
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('out_grant_order_no') is not None:
            self.out_grant_order_no = m.get('out_grant_order_no')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
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


