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


class SettleOrderRoyaltyDetail(TeaModel):
    def __init__(
        self,
        amount: int = None,
        execute_time: str = None,
        trans_out_account: str = None,
        trans_in_account: str = None,
    ):
        # 分账金额，单位：分
        self.amount = amount
        # 分账执行时间
        self.execute_time = execute_time
        # 分账转出账号
        self.trans_out_account = trans_out_account
        # 分账转入账号
        self.trans_in_account = trans_in_account

    def validate(self):
        self.validate_required(self.amount, 'amount')
        self.validate_required(self.execute_time, 'execute_time')
        self.validate_required(self.trans_out_account, 'trans_out_account')
        self.validate_required(self.trans_in_account, 'trans_in_account')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.amount is not None:
            result['amount'] = self.amount
        if self.execute_time is not None:
            result['execute_time'] = self.execute_time
        if self.trans_out_account is not None:
            result['trans_out_account'] = self.trans_out_account
        if self.trans_in_account is not None:
            result['trans_in_account'] = self.trans_in_account
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('execute_time') is not None:
            self.execute_time = m.get('execute_time')
        if m.get('trans_out_account') is not None:
            self.trans_out_account = m.get('trans_out_account')
        if m.get('trans_in_account') is not None:
            self.trans_in_account = m.get('trans_in_account')
        return self


class GrantOrderDetail(TeaModel):
    def __init__(
        self,
        voucher_code: str = None,
        ext_info: str = None,
    ):
        # 券编码
        self.voucher_code = voucher_code
        # 发放扩展信息
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.voucher_code, 'voucher_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.voucher_code is not None:
            result['voucher_code'] = self.voucher_code
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('voucher_code') is not None:
            self.voucher_code = m.get('voucher_code')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class CallbackOrderSettlementRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        msg_type: str = None,
        trade_no: str = None,
        split_amount: int = None,
        settle_no: str = None,
        split_request_time: str = None,
        split_detail_list: List[SettleOrderRoyaltyDetail] = None,
        ext_info: str = None,
        msg_id: str = None,
        out_order_no: str = None,
        split_status: str = None,
        split_fail_reason: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # ASYNC_SETTLE_RESULT ：异步分账结果
        self.msg_type = msg_type
        # 支付交易号
        self.trade_no = trade_no
        # 分账金额，单位分
        self.split_amount = split_amount
        # 分账受理单号
        self.settle_no = settle_no
        # 分账受理时间
        self.split_request_time = split_request_time
        # 分账通知明细
        self.split_detail_list = split_detail_list
        # 扩展参数
        self.ext_info = ext_info
        # 消息唯一性判断，重试msgId不变
        self.msg_id = msg_id
        # 外部订单号(同一个outProductId唯一)
        self.out_order_no = out_order_no
        # 分账状态，SUCCESS成功，FAIL失败
        self.split_status = split_status
        # 分账失败原因，条件返回：splitStatus=FAIL 返回
        self.split_fail_reason = split_fail_reason

    def validate(self):
        self.validate_required(self.msg_type, 'msg_type')
        self.validate_required(self.trade_no, 'trade_no')
        self.validate_required(self.split_amount, 'split_amount')
        self.validate_required(self.settle_no, 'settle_no')
        self.validate_required(self.split_request_time, 'split_request_time')
        self.validate_required(self.split_detail_list, 'split_detail_list')
        if self.split_detail_list:
            for k in self.split_detail_list:
                if k:
                    k.validate()
        self.validate_required(self.msg_id, 'msg_id')
        self.validate_required(self.out_order_no, 'out_order_no')
        self.validate_required(self.split_status, 'split_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.msg_type is not None:
            result['msg_type'] = self.msg_type
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        if self.split_amount is not None:
            result['split_amount'] = self.split_amount
        if self.settle_no is not None:
            result['settle_no'] = self.settle_no
        if self.split_request_time is not None:
            result['split_request_time'] = self.split_request_time
        result['split_detail_list'] = []
        if self.split_detail_list is not None:
            for k in self.split_detail_list:
                result['split_detail_list'].append(k.to_map() if k else None)
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        if self.msg_id is not None:
            result['msg_id'] = self.msg_id
        if self.out_order_no is not None:
            result['out_order_no'] = self.out_order_no
        if self.split_status is not None:
            result['split_status'] = self.split_status
        if self.split_fail_reason is not None:
            result['split_fail_reason'] = self.split_fail_reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('msg_type') is not None:
            self.msg_type = m.get('msg_type')
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        if m.get('split_amount') is not None:
            self.split_amount = m.get('split_amount')
        if m.get('settle_no') is not None:
            self.settle_no = m.get('settle_no')
        if m.get('split_request_time') is not None:
            self.split_request_time = m.get('split_request_time')
        self.split_detail_list = []
        if m.get('split_detail_list') is not None:
            for k in m.get('split_detail_list'):
                temp_model = SettleOrderRoyaltyDetail()
                self.split_detail_list.append(temp_model.from_map(k))
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        if m.get('msg_id') is not None:
            self.msg_id = m.get('msg_id')
        if m.get('out_order_no') is not None:
            self.out_order_no = m.get('out_order_no')
        if m.get('split_status') is not None:
            self.split_status = m.get('split_status')
        if m.get('split_fail_reason') is not None:
            self.split_fail_reason = m.get('split_fail_reason')
        return self


class CallbackOrderSettlementResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 同步结果 success 同步成功,失败：fail
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
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
            self.result = m.get('result')
        return self


class PushRightsprodVoucherRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        rights_code: str = None,
        voucher_code: str = None,
        biz_type: str = None,
        status: str = None,
        out_trade_order_no: str = None,
        fail_msg: str = None,
        grant_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 权益编码
        self.rights_code = rights_code
        # 权益凭证编码/券码
        self.voucher_code = voucher_code
        # 业务类型
        # GRANT：发放
        # VERIFY：核销 GRANT_CANCEL：发放撤销 VERIFY_CANCEL：核销撤销 FREEZE：冻结
        # UNFREEZE：解冻
        self.biz_type = biz_type
        # FAIL：失败
        # SUCCESS：成功
        self.status = status
        # 外部订单号
        self.out_trade_order_no = out_trade_order_no
        # 失败信息
        self.fail_msg = fail_msg
        # 外部发放调用时传入信息
        self.grant_info = grant_info

    def validate(self):
        self.validate_required(self.rights_code, 'rights_code')
        self.validate_required(self.voucher_code, 'voucher_code')
        self.validate_required(self.biz_type, 'biz_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.rights_code is not None:
            result['rights_code'] = self.rights_code
        if self.voucher_code is not None:
            result['voucher_code'] = self.voucher_code
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.status is not None:
            result['status'] = self.status
        if self.out_trade_order_no is not None:
            result['out_trade_order_no'] = self.out_trade_order_no
        if self.fail_msg is not None:
            result['fail_msg'] = self.fail_msg
        if self.grant_info is not None:
            result['grant_info'] = self.grant_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('rights_code') is not None:
            self.rights_code = m.get('rights_code')
        if m.get('voucher_code') is not None:
            self.voucher_code = m.get('voucher_code')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('out_trade_order_no') is not None:
            self.out_trade_order_no = m.get('out_trade_order_no')
        if m.get('fail_msg') is not None:
            self.fail_msg = m.get('fail_msg')
        if m.get('grant_info') is not None:
            self.grant_info = m.get('grant_info')
        return self


class PushRightsprodVoucherResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 同步结果  success 同步成功
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
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
            self.result = m.get('result')
        return self


class CallbackRightsprodStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        rights_code: str = None,
        voucher_code: str = None,
        status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 权益编码
        self.rights_code = rights_code
        # 券码
        self.voucher_code = voucher_code
        # 券变更状态
        # V_USE（使用）
        # V_REFUND（退款）
        # V_EXPIRE（过期）
        # V_INVALID（作废）
        self.status = status

    def validate(self):
        self.validate_required(self.rights_code, 'rights_code')
        self.validate_required(self.voucher_code, 'voucher_code')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.rights_code is not None:
            result['rights_code'] = self.rights_code
        if self.voucher_code is not None:
            result['voucher_code'] = self.voucher_code
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('rights_code') is not None:
            self.rights_code = m.get('rights_code')
        if m.get('voucher_code') is not None:
            self.voucher_code = m.get('voucher_code')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class CallbackRightsprodStatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 同步结果 success 同步成功
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
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
            self.result = m.get('result')
        return self


class CallbackRightsprodOperationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        rights_code: str = None,
        voucher_code: str = None,
        notify_id: str = None,
        biz_type: str = None,
        pay_order_no: str = None,
        face_amount: str = None,
        flux_amount: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 权益编码
        self.rights_code = rights_code
        # 券码
        self.voucher_code = voucher_code
        # 通知ID(幂等)
        self.notify_id = notify_id
        # 业务类型
        # V_REFUND（退款）
        # V_EXPIRE（过期）
        # V_INVALID（作废）
        # V_USE（使用）
        self.biz_type = biz_type
        # 支付订单号
        self.pay_order_no = pay_order_no
        # 券面额
        self.face_amount = face_amount
        # 流通金额（核销、退款时 金额）
        self.flux_amount = flux_amount

    def validate(self):
        self.validate_required(self.rights_code, 'rights_code')
        self.validate_required(self.voucher_code, 'voucher_code')
        self.validate_required(self.notify_id, 'notify_id')
        self.validate_required(self.biz_type, 'biz_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.rights_code is not None:
            result['rights_code'] = self.rights_code
        if self.voucher_code is not None:
            result['voucher_code'] = self.voucher_code
        if self.notify_id is not None:
            result['notify_id'] = self.notify_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.pay_order_no is not None:
            result['pay_order_no'] = self.pay_order_no
        if self.face_amount is not None:
            result['face_amount'] = self.face_amount
        if self.flux_amount is not None:
            result['flux_amount'] = self.flux_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('rights_code') is not None:
            self.rights_code = m.get('rights_code')
        if m.get('voucher_code') is not None:
            self.voucher_code = m.get('voucher_code')
        if m.get('notify_id') is not None:
            self.notify_id = m.get('notify_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('pay_order_no') is not None:
            self.pay_order_no = m.get('pay_order_no')
        if m.get('face_amount') is not None:
            self.face_amount = m.get('face_amount')
        if m.get('flux_amount') is not None:
            self.flux_amount = m.get('flux_amount')
        return self


class CallbackRightsprodOperationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 同步结果
        # success 为同步成功其他均为失败
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
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
            self.result = m.get('result')
        return self


class PushRightsprodGrantrightsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        phone_number: str = None,
        merchant_no: str = None,
        rights_code: str = None,
        grant_num: int = None,
        out_grant_order_no: str = None,
        grant_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户ID
        self.user_id = user_id
        # 手机号
        self.phone_number = phone_number
        # 商户编码
        self.merchant_no = merchant_no
        # 权益编码
        self.rights_code = rights_code
        # 发放数量，可根据权益信息grantMulti判断是否可发多张
        self.grant_num = grant_num
        # 外部发放订单号
        self.out_grant_order_no = out_grant_order_no
        # 发放扩展信息，如活动ID等信息，暂时可以不传
        self.grant_info = grant_info

    def validate(self):
        self.validate_required(self.rights_code, 'rights_code')
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
        if self.out_grant_order_no is not None:
            result['out_grant_order_no'] = self.out_grant_order_no
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
        if m.get('out_grant_order_no') is not None:
            self.out_grant_order_no = m.get('out_grant_order_no')
        if m.get('grant_info') is not None:
            self.grant_info = m.get('grant_info')
        return self


class PushRightsprodGrantrightsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        grant_status: str = None,
        expire_time: str = None,
        effect_time: str = None,
        order_details: List[GrantOrderDetail] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发放状态：
        # GRANTING：发放处理中 GRANT_SUCCESS：发放成功 GRANT_FAIL：发放失败
        self.grant_status = grant_status
        # 过期时间 yyyy-MM-dd HH:mm:ss
        self.expire_time = expire_time
        # 生效时间 yyyy-MM-dd HH:mm:ss
        self.effect_time = effect_time
        # 发放订单明细数据
        self.order_details = order_details

    def validate(self):
        if self.expire_time is not None:
            self.validate_pattern(self.expire_time, 'expire_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.effect_time is not None:
            self.validate_pattern(self.effect_time, 'effect_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.order_details:
            for k in self.order_details:
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
        if self.grant_status is not None:
            result['grant_status'] = self.grant_status
        if self.expire_time is not None:
            result['expire_time'] = self.expire_time
        if self.effect_time is not None:
            result['effect_time'] = self.effect_time
        result['order_details'] = []
        if self.order_details is not None:
            for k in self.order_details:
                result['order_details'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('grant_status') is not None:
            self.grant_status = m.get('grant_status')
        if m.get('expire_time') is not None:
            self.expire_time = m.get('expire_time')
        if m.get('effect_time') is not None:
            self.effect_time = m.get('effect_time')
        self.order_details = []
        if m.get('order_details') is not None:
            for k in m.get('order_details'):
                temp_model = GrantOrderDetail()
                self.order_details.append(temp_model.from_map(k))
        return self


