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


class PersonData(TeaModel):
    def __init__(
        self,
        user_name: str = None,
        id_card: str = None,
        phone: str = None,
        mask_model: str = None,
    ):
        # 姓名
        self.user_name = user_name
        # 待修复 sha256 加密身份证号
        self.id_card = id_card
        # 手机号
        self.phone = phone
        # 身份证号加密方式
        self.mask_model = mask_model

    def validate(self):
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.id_card, 'id_card')

    def to_map(self):
        result = dict()
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.id_card is not None:
            result['id_card'] = self.id_card
        if self.phone is not None:
            result['phone'] = self.phone
        if self.mask_model is not None:
            result['mask_model'] = self.mask_model
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('id_card') is not None:
            self.id_card = m.get('id_card')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('mask_model') is not None:
            self.mask_model = m.get('mask_model')
        return self


class RepairData(TeaModel):
    def __init__(
        self,
        repair_status: str = None,
        id_card: str = None,
        user_name: str = None,
        case_no: str = None,
        result_list_number: int = None,
    ):
        # 修复结果状态：“RPS001”: 不可外呼，”RPS002":可以 外呼
        self.repair_status = repair_status
        # 身份证号
        self.id_card = id_card
        # 姓名：显示的姓名为修复请求的 待修复人名
        self.user_name = user_name
        # 案件编号，特定使用运营商页面平台产生
        self.case_no = case_no
        # 修复号码数量
        self.result_list_number = result_list_number

    def validate(self):
        self.validate_required(self.repair_status, 'repair_status')
        self.validate_required(self.id_card, 'id_card')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.result_list_number, 'result_list_number')

    def to_map(self):
        result = dict()
        if self.repair_status is not None:
            result['repair_status'] = self.repair_status
        if self.id_card is not None:
            result['id_card'] = self.id_card
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.case_no is not None:
            result['case_no'] = self.case_no
        if self.result_list_number is not None:
            result['result_list_number'] = self.result_list_number
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('repair_status') is not None:
            self.repair_status = m.get('repair_status')
        if m.get('id_card') is not None:
            self.id_card = m.get('id_card')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('case_no') is not None:
            self.case_no = m.get('case_no')
        if m.get('result_list_number') is not None:
            self.result_list_number = m.get('result_list_number')
        return self


class PredictRequest(TeaModel):
    def __init__(
        self,
        external_asset_detail_id: str = None,
        cert_no_md_5: str = None,
        payback_amount: str = None,
        payback_num: str = None,
        overdue_day: int = None,
        cert_no: str = None,
        prediction_score: str = None,
    ):
        # 资产明细ID
        self.external_asset_detail_id = external_asset_detail_id
        # 身份证号码MD5
        self.cert_no_md_5 = cert_no_md_5
        # 已还总额,默认0
        self.payback_amount = payback_amount
        # 已还期数，默认0
        self.payback_num = payback_num
        # 逾期月数
        self.overdue_day = overdue_day
        # 身份证号
        self.cert_no = cert_no
        # 支付宝内部预测分数
        self.prediction_score = prediction_score

    def validate(self):
        self.validate_required(self.cert_no_md_5, 'cert_no_md_5')

    def to_map(self):
        result = dict()
        if self.external_asset_detail_id is not None:
            result['external_asset_detail_id'] = self.external_asset_detail_id
        if self.cert_no_md_5 is not None:
            result['cert_no_md5'] = self.cert_no_md_5
        if self.payback_amount is not None:
            result['payback_amount'] = self.payback_amount
        if self.payback_num is not None:
            result['payback_num'] = self.payback_num
        if self.overdue_day is not None:
            result['overdue_day'] = self.overdue_day
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.prediction_score is not None:
            result['prediction_score'] = self.prediction_score
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('external_asset_detail_id') is not None:
            self.external_asset_detail_id = m.get('external_asset_detail_id')
        if m.get('cert_no_md5') is not None:
            self.cert_no_md_5 = m.get('cert_no_md5')
        if m.get('payback_amount') is not None:
            self.payback_amount = m.get('payback_amount')
        if m.get('payback_num') is not None:
            self.payback_num = m.get('payback_num')
        if m.get('overdue_day') is not None:
            self.overdue_day = m.get('overdue_day')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('prediction_score') is not None:
            self.prediction_score = m.get('prediction_score')
        return self


class PredictResponse(TeaModel):
    def __init__(
        self,
        external_asset_detail_id: str = None,
        probability_0: str = None,
        probability_1: str = None,
        cert_no_md_5: str = None,
        mobile_md_5: str = None,
        level: str = None,
        prediction_score: str = None,
        cert_no: str = None,
    ):
        # 资产明细ID
        self.external_asset_detail_id = external_asset_detail_id
        # 反向指标
        self.probability_0 = probability_0
        # 正向指标
        self.probability_1 = probability_1
        # 身份证号码MD5
        self.cert_no_md_5 = cert_no_md_5
        # 身份证号码MD5
        self.mobile_md_5 = mobile_md_5
        # 可选值，A,B,C
        self.level = level
        # 内部特征预测分数
        self.prediction_score = prediction_score
        # 身份证号码
        self.cert_no = cert_no

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.external_asset_detail_id is not None:
            result['external_asset_detail_id'] = self.external_asset_detail_id
        if self.probability_0 is not None:
            result['probability0'] = self.probability_0
        if self.probability_1 is not None:
            result['probability1'] = self.probability_1
        if self.cert_no_md_5 is not None:
            result['cert_no_md5'] = self.cert_no_md_5
        if self.mobile_md_5 is not None:
            result['mobile_md5'] = self.mobile_md_5
        if self.level is not None:
            result['level'] = self.level
        if self.prediction_score is not None:
            result['prediction_score'] = self.prediction_score
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('external_asset_detail_id') is not None:
            self.external_asset_detail_id = m.get('external_asset_detail_id')
        if m.get('probability0') is not None:
            self.probability_0 = m.get('probability0')
        if m.get('probability1') is not None:
            self.probability_1 = m.get('probability1')
        if m.get('cert_no_md5') is not None:
            self.cert_no_md_5 = m.get('cert_no_md5')
        if m.get('mobile_md5') is not None:
            self.mobile_md_5 = m.get('mobile_md5')
        if m.get('level') is not None:
            self.level = m.get('level')
        if m.get('prediction_score') is not None:
            self.prediction_score = m.get('prediction_score')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        return self


class BatchRepairData(TeaModel):
    def __init__(
        self,
        repair_batch_status: str = None,
        repair_time: str = None,
        repair_datas: List[RepairData] = None,
    ):
        # "RPBS001":待修复,"RPBS002": 修 复 中 "RPBS003": 已 修 复,"RPBS004":修复失败
        self.repair_batch_status = repair_batch_status
        # 修复时间
        self.repair_time = repair_time
        # 参见RepairData
        self.repair_datas = repair_datas

    def validate(self):
        self.validate_required(self.repair_batch_status, 'repair_batch_status')
        self.validate_required(self.repair_time, 'repair_time')
        if self.repair_time is not None:
            self.validate_pattern(self.repair_time, 'repair_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.repair_datas, 'repair_datas')
        if self.repair_datas:
            for k in self.repair_datas:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.repair_batch_status is not None:
            result['repair_batch_status'] = self.repair_batch_status
        if self.repair_time is not None:
            result['repair_time'] = self.repair_time
        result['repair_datas'] = []
        if self.repair_datas is not None:
            for k in self.repair_datas:
                result['repair_datas'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('repair_batch_status') is not None:
            self.repair_batch_status = m.get('repair_batch_status')
        if m.get('repair_time') is not None:
            self.repair_time = m.get('repair_time')
        self.repair_datas = []
        if m.get('repair_datas') is not None:
            for k in m.get('repair_datas'):
                temp_model = RepairData()
                self.repair_datas.append(temp_model.from_map(k))
        return self


class DetailInfo(TeaModel):
    def __init__(
        self,
        person_data: PersonData = None,
        repair_status: str = None,
        expire_time: str = None,
        count: int = None,
    ):
        # 修复人
        self.person_data = person_data
        # “0”: 修复中，”1":修复失败,”2":修复成功,”3":修复出错
        self.repair_status = repair_status
        # 修复结果过期时间
        self.expire_time = expire_time
        # 修复结果数
        self.count = count

    def validate(self):
        self.validate_required(self.person_data, 'person_data')
        if self.person_data:
            self.person_data.validate()
        self.validate_required(self.repair_status, 'repair_status')
        self.validate_required(self.expire_time, 'expire_time')
        if self.expire_time is not None:
            self.validate_pattern(self.expire_time, 'expire_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.count, 'count')

    def to_map(self):
        result = dict()
        if self.person_data is not None:
            result['person_data'] = self.person_data.to_map()
        if self.repair_status is not None:
            result['repair_status'] = self.repair_status
        if self.expire_time is not None:
            result['expire_time'] = self.expire_time
        if self.count is not None:
            result['count'] = self.count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('person_data') is not None:
            temp_model = PersonData()
            self.person_data = temp_model.from_map(m['person_data'])
        if m.get('repair_status') is not None:
            self.repair_status = m.get('repair_status')
        if m.get('expire_time') is not None:
            self.expire_time = m.get('expire_time')
        if m.get('count') is not None:
            self.count = m.get('count')
        return self


class BindData(TeaModel):
    def __init__(
        self,
        tel_x: str = None,
        bind_id: str = None,
    ):
        # 虚拟小号（实际拨打以返回的 telX 为主）
        self.tel_x = tel_x
        # 该次绑定唯一 id
        self.bind_id = bind_id

    def validate(self):
        self.validate_required(self.tel_x, 'tel_x')
        self.validate_required(self.bind_id, 'bind_id')

    def to_map(self):
        result = dict()
        if self.tel_x is not None:
            result['tel_x'] = self.tel_x
        if self.bind_id is not None:
            result['bind_id'] = self.bind_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tel_x') is not None:
            self.tel_x = m.get('tel_x')
        if m.get('bind_id') is not None:
            self.bind_id = m.get('bind_id')
        return self


class BatchInfo(TeaModel):
    def __init__(
        self,
        batch_id: str = None,
    ):
        # 修复的批次号
        self.batch_id = batch_id

    def validate(self):
        self.validate_required(self.batch_id, 'batch_id')

    def to_map(self):
        result = dict()
        if self.batch_id is not None:
            result['batch_id'] = self.batch_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('batch_id') is not None:
            self.batch_id = m.get('batch_id')
        return self


class QueryPredictRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data: List[PredictRequest] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待预测请求体列表
        self.data = data

    def validate(self):
        self.validate_required(self.data, 'data')
        if self.data:
            for k in self.data:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = PredictRequest()
                self.data.append(temp_model.from_map(k))
        return self


class QueryPredictResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[PredictResponse] = None,
        return_rate: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预测结果返回列表
        self.data = data
        # 资产包的回款率
        self.return_rate = return_rate

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        if self.return_rate is not None:
            result['return_rate'] = self.return_rate
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = PredictResponse()
                self.data.append(temp_model.from_map(k))
        if m.get('return_rate') is not None:
            self.return_rate = m.get('return_rate')
        return self


class StartSlxfRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data: List[PersonData] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待修复人list
        self.data = data

    def validate(self):
        self.validate_required(self.data, 'data')
        if self.data:
            for k in self.data:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = PersonData()
                self.data.append(temp_model.from_map(k))
        return self


class StartSlxfResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BatchInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回批次，JSON对象， 比如：{batchId:xxxxx}
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
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
            temp_model = BatchInfo()
            self.data = temp_model.from_map(m['data'])
        return self


class PullSlxfRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        batch_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # {"batchId":"xxx"}
        self.batch_id = batch_id

    def validate(self):
        self.validate_required(self.batch_id, 'batch_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.batch_id is not None:
            result['batch_id'] = self.batch_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('batch_id') is not None:
            self.batch_id = m.get('batch_id')
        return self


class PullSlxfResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BatchRepairData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 参考结构体类型
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
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
            temp_model = BatchRepairData()
            self.data = temp_model.from_map(m['data'])
        return self


class QuerySlxfRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        batch_id: str = None,
        id_card: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 修复批次号
        self.batch_id = batch_id
        # Sha256 加密后的身 份证号
        self.id_card = id_card

    def validate(self):
        self.validate_required(self.batch_id, 'batch_id')
        self.validate_required(self.id_card, 'id_card')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.batch_id is not None:
            result['batch_id'] = self.batch_id
        if self.id_card is not None:
            result['id_card'] = self.id_card
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('batch_id') is not None:
            self.batch_id = m.get('batch_id')
        if m.get('id_card') is not None:
            self.id_card = m.get('id_card')
        return self


class QuerySlxfResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 其中数组中的每一项 为 脱 敏 手 机 号 码 unicomCustomerId ，请求外呼 时使用
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


class BindSlxfRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        batch_id: str = None,
        id_card: str = None,
        unicom_customer_id: str = None,
        seat_number: str = None,
        show_number: str = None,
        tel_x: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 修复批次号
        self.batch_id = batch_id
        # 待 修 复 sha256 加 密身份证号
        self.id_card = id_card
        # 脱敏后手机号码加密串， 需要拨打的该手机号码
        self.unicom_customer_id = unicom_customer_id
        # 主叫号码，号码要求备案
        self.seat_number = seat_number
        # 外显号，外显号要求在外 显号池中
        self.show_number = show_number
        # 虚拟小号， 线下分 配
        self.tel_x = tel_x

    def validate(self):
        self.validate_required(self.batch_id, 'batch_id')
        self.validate_required(self.id_card, 'id_card')
        self.validate_required(self.unicom_customer_id, 'unicom_customer_id')
        self.validate_required(self.seat_number, 'seat_number')
        self.validate_required(self.show_number, 'show_number')
        self.validate_required(self.tel_x, 'tel_x')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.batch_id is not None:
            result['batch_id'] = self.batch_id
        if self.id_card is not None:
            result['id_card'] = self.id_card
        if self.unicom_customer_id is not None:
            result['unicom_customer_id'] = self.unicom_customer_id
        if self.seat_number is not None:
            result['seat_number'] = self.seat_number
        if self.show_number is not None:
            result['show_number'] = self.show_number
        if self.tel_x is not None:
            result['tel_x'] = self.tel_x
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('batch_id') is not None:
            self.batch_id = m.get('batch_id')
        if m.get('id_card') is not None:
            self.id_card = m.get('id_card')
        if m.get('unicom_customer_id') is not None:
            self.unicom_customer_id = m.get('unicom_customer_id')
        if m.get('seat_number') is not None:
            self.seat_number = m.get('seat_number')
        if m.get('show_number') is not None:
            self.show_number = m.get('show_number')
        if m.get('tel_x') is not None:
            self.tel_x = m.get('tel_x')
        return self


class BindSlxfResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BindData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # "data": {"telX": "xxx","bindId": "xxx" }
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
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
            temp_model = BindData()
            self.data = temp_model.from_map(m['data'])
        return self


class UnbindSlxfRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bind_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 绑定唯一 id
        self.bind_id = bind_id

    def validate(self):
        self.validate_required(self.bind_id, 'bind_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bind_id is not None:
            result['bind_id'] = self.bind_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bind_id') is not None:
            self.bind_id = m.get('bind_id')
        return self


class UnbindSlxfResponse(TeaModel):
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


class StartMyslxfRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        repair_people_list: List[PersonData] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待修复人列表
        self.repair_people_list = repair_people_list

    def validate(self):
        self.validate_required(self.repair_people_list, 'repair_people_list')
        if self.repair_people_list:
            for k in self.repair_people_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        result['repair_people_list'] = []
        if self.repair_people_list is not None:
            for k in self.repair_people_list:
                result['repair_people_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.repair_people_list = []
        if m.get('repair_people_list') is not None:
            for k in m.get('repair_people_list'):
                temp_model = PersonData()
                self.repair_people_list.append(temp_model.from_map(k))
        return self


class StartMyslxfResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        batch_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 修复批次ID
        self.batch_id = batch_id

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
        if self.batch_id is not None:
            result['batch_id'] = self.batch_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('batch_id') is not None:
            self.batch_id = m.get('batch_id')
        return self


class BatchqueryMyslxfRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        batch_id: str = None,
        repair_people_list: List[PersonData] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 修复批次ID
        self.batch_id = batch_id
        # 查询修复人的列表
        self.repair_people_list = repair_people_list

    def validate(self):
        self.validate_required(self.batch_id, 'batch_id')
        self.validate_required(self.repair_people_list, 'repair_people_list')
        if self.repair_people_list:
            for k in self.repair_people_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.batch_id is not None:
            result['batch_id'] = self.batch_id
        result['repair_people_list'] = []
        if self.repair_people_list is not None:
            for k in self.repair_people_list:
                result['repair_people_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('batch_id') is not None:
            self.batch_id = m.get('batch_id')
        self.repair_people_list = []
        if m.get('repair_people_list') is not None:
            for k in m.get('repair_people_list'):
                temp_model = PersonData()
                self.repair_people_list.append(temp_model.from_map(k))
        return self


class BatchqueryMyslxfResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        detail_info_list: List[DetailInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 修复结果列表
        self.detail_info_list = detail_info_list

    def validate(self):
        if self.detail_info_list:
            for k in self.detail_info_list:
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
        result['detail_info_list'] = []
        if self.detail_info_list is not None:
            for k in self.detail_info_list:
                result['detail_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.detail_info_list = []
        if m.get('detail_info_list') is not None:
            for k in m.get('detail_info_list'):
                temp_model = DetailInfo()
                self.detail_info_list.append(temp_model.from_map(k))
        return self


class BindMyslxfRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        batch_id: str = None,
        id_card: str = None,
        seq: int = None,
        call_number: str = None,
        display_number: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 批次ID
        self.batch_id = batch_id
        # 身份证号码
        self.id_card = id_card
        # 绑定哪个手机号码，需要提供修复结果的序号，从1开始。
        self.seq = seq
        # 呼叫号码。必须预先注册
        self.call_number = call_number
        # 外显号码，必须预先平台注册
        self.display_number = display_number

    def validate(self):
        self.validate_required(self.batch_id, 'batch_id')
        self.validate_required(self.id_card, 'id_card')
        self.validate_required(self.seq, 'seq')
        self.validate_required(self.call_number, 'call_number')
        self.validate_required(self.display_number, 'display_number')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.batch_id is not None:
            result['batch_id'] = self.batch_id
        if self.id_card is not None:
            result['id_card'] = self.id_card
        if self.seq is not None:
            result['seq'] = self.seq
        if self.call_number is not None:
            result['call_number'] = self.call_number
        if self.display_number is not None:
            result['display_number'] = self.display_number
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('batch_id') is not None:
            self.batch_id = m.get('batch_id')
        if m.get('id_card') is not None:
            self.id_card = m.get('id_card')
        if m.get('seq') is not None:
            self.seq = m.get('seq')
        if m.get('call_number') is not None:
            self.call_number = m.get('call_number')
        if m.get('display_number') is not None:
            self.display_number = m.get('display_number')
        return self


class BindMyslxfResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        bind_id: str = None,
        expire_time: str = None,
        virtual_number: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 绑定ID
        self.bind_id = bind_id
        # 绑定过期时间
        self.expire_time = expire_time
        # 绑定的虚拟号码
        self.virtual_number = virtual_number

    def validate(self):
        if self.expire_time is not None:
            self.validate_pattern(self.expire_time, 'expire_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.bind_id is not None:
            result['bind_id'] = self.bind_id
        if self.expire_time is not None:
            result['expire_time'] = self.expire_time
        if self.virtual_number is not None:
            result['virtual_number'] = self.virtual_number
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('bind_id') is not None:
            self.bind_id = m.get('bind_id')
        if m.get('expire_time') is not None:
            self.expire_time = m.get('expire_time')
        if m.get('virtual_number') is not None:
            self.virtual_number = m.get('virtual_number')
        return self


class UnbindMyslxfRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bind_id: str = None,
        batch_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 绑定ID
        self.bind_id = bind_id
        # 批次ID
        self.batch_id = batch_id

    def validate(self):
        self.validate_required(self.bind_id, 'bind_id')
        self.validate_required(self.batch_id, 'batch_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bind_id is not None:
            result['bind_id'] = self.bind_id
        if self.batch_id is not None:
            result['batch_id'] = self.batch_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bind_id') is not None:
            self.bind_id = m.get('bind_id')
        if m.get('batch_id') is not None:
            self.batch_id = m.get('batch_id')
        return self


class UnbindMyslxfResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 解绑结果
        self.result = result

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


