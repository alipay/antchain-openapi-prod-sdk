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


class RuleDetail(TeaModel):
    def __init__(
        self,
        type: str = None,
        fie_id: str = None,
        level: str = None,
        qualifications: str = None,
        price_bd: int = None,
        fob_price: int = None,
        price_tj: int = None,
        price_bj: int = None,
        numpeople: int = None,
    ):
        # 项目类别
        self.type = type
        # 领域
        self.fie_id = fie_id
        # 级别
        self.level = level
        # 资质
        self.qualifications = qualifications
        # 保定报价
        self.price_bd = price_bd
        # 离岸价格
        self.fob_price = fob_price
        # 离岸价格
        self.price_tj = price_tj
        # 北京报价
        self.price_bj = price_bj
        # 最少提供人数
        self.numpeople = numpeople

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.fie_id, 'fie_id')
        self.validate_required(self.level, 'level')
        self.validate_required(self.qualifications, 'qualifications')
        self.validate_required(self.price_bd, 'price_bd')
        self.validate_required(self.fob_price, 'fob_price')
        self.validate_required(self.price_tj, 'price_tj')
        self.validate_required(self.price_bj, 'price_bj')
        self.validate_required(self.numpeople, 'numpeople')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.fie_id is not None:
            result['fie_id'] = self.fie_id
        if self.level is not None:
            result['level'] = self.level
        if self.qualifications is not None:
            result['qualifications'] = self.qualifications
        if self.price_bd is not None:
            result['price_bd'] = self.price_bd
        if self.fob_price is not None:
            result['fob_price'] = self.fob_price
        if self.price_tj is not None:
            result['price_tj'] = self.price_tj
        if self.price_bj is not None:
            result['price_bj'] = self.price_bj
        if self.numpeople is not None:
            result['numpeople'] = self.numpeople
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('fie_id') is not None:
            self.fie_id = m.get('fie_id')
        if m.get('level') is not None:
            self.level = m.get('level')
        if m.get('qualifications') is not None:
            self.qualifications = m.get('qualifications')
        if m.get('price_bd') is not None:
            self.price_bd = m.get('price_bd')
        if m.get('fob_price') is not None:
            self.fob_price = m.get('fob_price')
        if m.get('price_tj') is not None:
            self.price_tj = m.get('price_tj')
        if m.get('price_bj') is not None:
            self.price_bj = m.get('price_bj')
        if m.get('numpeople') is not None:
            self.numpeople = m.get('numpeople')
        return self


class Reconciliation(TeaModel):
    def __init__(
        self,
        sup_code: str = None,
        sup_name: str = None,
        settlement_amount: int = None,
        confirm_date_gw: str = None,
        confirmer_gw: str = None,
        confirm_state_gw: str = None,
        confirm_date_sup: str = None,
        confirmer_sup: str = None,
        confirm_state_sup: str = None,
        socre_date: str = None,
    ):
        # 供应商
        self.sup_code = sup_code
        # 供应商名称
        self.sup_name = sup_name
        # 结算金额(单位分)
        self.settlement_amount = settlement_amount
        # 长城确认时间
        self.confirm_date_gw = confirm_date_gw
        # 长城方确认人
        self.confirmer_gw = confirmer_gw
        # 长城确认状态
        self.confirm_state_gw = confirm_state_gw
        # 服务方确认时间
        self.confirm_date_sup = confirm_date_sup
        # 服务方确认人
        self.confirmer_sup = confirmer_sup
        # 服务方确认状态
        self.confirm_state_sup = confirm_state_sup
        # 计算时间
        self.socre_date = socre_date

    def validate(self):
        self.validate_required(self.sup_code, 'sup_code')
        self.validate_required(self.sup_name, 'sup_name')
        self.validate_required(self.settlement_amount, 'settlement_amount')
        self.validate_required(self.confirm_date_gw, 'confirm_date_gw')
        self.validate_required(self.confirmer_gw, 'confirmer_gw')
        self.validate_required(self.confirm_state_gw, 'confirm_state_gw')
        self.validate_required(self.confirm_date_sup, 'confirm_date_sup')
        self.validate_required(self.confirmer_sup, 'confirmer_sup')
        self.validate_required(self.confirm_state_sup, 'confirm_state_sup')
        self.validate_required(self.socre_date, 'socre_date')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sup_code is not None:
            result['sup_code'] = self.sup_code
        if self.sup_name is not None:
            result['sup_name'] = self.sup_name
        if self.settlement_amount is not None:
            result['settlement_amount'] = self.settlement_amount
        if self.confirm_date_gw is not None:
            result['confirm_date_gw'] = self.confirm_date_gw
        if self.confirmer_gw is not None:
            result['confirmer_gw'] = self.confirmer_gw
        if self.confirm_state_gw is not None:
            result['confirm_state_gw'] = self.confirm_state_gw
        if self.confirm_date_sup is not None:
            result['confirm_date_sup'] = self.confirm_date_sup
        if self.confirmer_sup is not None:
            result['confirmer_sup'] = self.confirmer_sup
        if self.confirm_state_sup is not None:
            result['confirm_state_sup'] = self.confirm_state_sup
        if self.socre_date is not None:
            result['socre_date'] = self.socre_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sup_code') is not None:
            self.sup_code = m.get('sup_code')
        if m.get('sup_name') is not None:
            self.sup_name = m.get('sup_name')
        if m.get('settlement_amount') is not None:
            self.settlement_amount = m.get('settlement_amount')
        if m.get('confirm_date_gw') is not None:
            self.confirm_date_gw = m.get('confirm_date_gw')
        if m.get('confirmer_gw') is not None:
            self.confirmer_gw = m.get('confirmer_gw')
        if m.get('confirm_state_gw') is not None:
            self.confirm_state_gw = m.get('confirm_state_gw')
        if m.get('confirm_date_sup') is not None:
            self.confirm_date_sup = m.get('confirm_date_sup')
        if m.get('confirmer_sup') is not None:
            self.confirmer_sup = m.get('confirmer_sup')
        if m.get('confirm_state_sup') is not None:
            self.confirm_state_sup = m.get('confirm_state_sup')
        if m.get('socre_date') is not None:
            self.socre_date = m.get('socre_date')
        return self


class SpProvider(TeaModel):
    def __init__(
        self,
        sup_code: str = None,
        sup_name: str = None,
        file_name: str = None,
        file_code: str = None,
        hash_code: str = None,
        start_date: str = None,
        closing_date: str = None,
        file_path: str = None,
        create_date: str = None,
        creator: str = None,
    ):
        # 供应商编号
        self.sup_code = sup_code
        # 供应商名称
        self.sup_name = sup_name
        # 文件名称
        self.file_name = file_name
        # 文件code
        self.file_code = file_code
        # hash的值
        self.hash_code = hash_code
        # 开始时间
        self.start_date = start_date
        # 结束日期
        self.closing_date = closing_date
        # 文件路径
        self.file_path = file_path
        # 2021-03-04 11:16:23
        self.create_date = create_date
        # 创建者
        self.creator = creator

    def validate(self):
        self.validate_required(self.sup_code, 'sup_code')
        self.validate_required(self.sup_name, 'sup_name')
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.file_code, 'file_code')
        self.validate_required(self.hash_code, 'hash_code')
        self.validate_required(self.start_date, 'start_date')
        self.validate_required(self.closing_date, 'closing_date')
        self.validate_required(self.file_path, 'file_path')
        self.validate_required(self.create_date, 'create_date')
        self.validate_required(self.creator, 'creator')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sup_code is not None:
            result['sup_code'] = self.sup_code
        if self.sup_name is not None:
            result['sup_name'] = self.sup_name
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_code is not None:
            result['file_code'] = self.file_code
        if self.hash_code is not None:
            result['hash_code'] = self.hash_code
        if self.start_date is not None:
            result['start_date'] = self.start_date
        if self.closing_date is not None:
            result['closing_date'] = self.closing_date
        if self.file_path is not None:
            result['file_path'] = self.file_path
        if self.create_date is not None:
            result['create_date'] = self.create_date
        if self.creator is not None:
            result['creator'] = self.creator
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sup_code') is not None:
            self.sup_code = m.get('sup_code')
        if m.get('sup_name') is not None:
            self.sup_name = m.get('sup_name')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_code') is not None:
            self.file_code = m.get('file_code')
        if m.get('hash_code') is not None:
            self.hash_code = m.get('hash_code')
        if m.get('start_date') is not None:
            self.start_date = m.get('start_date')
        if m.get('closing_date') is not None:
            self.closing_date = m.get('closing_date')
        if m.get('file_path') is not None:
            self.file_path = m.get('file_path')
        if m.get('create_date') is not None:
            self.create_date = m.get('create_date')
        if m.get('creator') is not None:
            self.creator = m.get('creator')
        return self


class ApplyAntchainBbpContractRuleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sp_provider: SpProvider = None,
        rule_details: List[RuleDetail] = None,
        confirmer: str = None,
        confirm_date: str = None,
        confirm_status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 服务提供商
        self.sp_provider = sp_provider
        # 明细
        self.rule_details = rule_details
        # confirmer
        self.confirmer = confirmer
        # 确认时间
        self.confirm_date = confirm_date
        # confirm_status
        self.confirm_status = confirm_status

    def validate(self):
        self.validate_required(self.sp_provider, 'sp_provider')
        if self.sp_provider:
            self.sp_provider.validate()
        self.validate_required(self.rule_details, 'rule_details')
        if self.rule_details:
            for k in self.rule_details:
                if k:
                    k.validate()
        self.validate_required(self.confirmer, 'confirmer')
        self.validate_required(self.confirm_date, 'confirm_date')
        self.validate_required(self.confirm_status, 'confirm_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sp_provider is not None:
            result['sp_provider'] = self.sp_provider.to_map()
        result['rule_details'] = []
        if self.rule_details is not None:
            for k in self.rule_details:
                result['rule_details'].append(k.to_map() if k else None)
        if self.confirmer is not None:
            result['confirmer'] = self.confirmer
        if self.confirm_date is not None:
            result['confirm_date'] = self.confirm_date
        if self.confirm_status is not None:
            result['confirm_status'] = self.confirm_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sp_provider') is not None:
            temp_model = SpProvider()
            self.sp_provider = temp_model.from_map(m['sp_provider'])
        self.rule_details = []
        if m.get('rule_details') is not None:
            for k in m.get('rule_details'):
                temp_model = RuleDetail()
                self.rule_details.append(temp_model.from_map(k))
        if m.get('confirmer') is not None:
            self.confirmer = m.get('confirmer')
        if m.get('confirm_date') is not None:
            self.confirm_date = m.get('confirm_date')
        if m.get('confirm_status') is not None:
            self.confirm_status = m.get('confirm_status')
        return self


class ApplyAntchainBbpContractRuleResponse(TeaModel):
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


class GetAntchainBbpContractRuleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sup_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 服务商code
        self.sup_code = sup_code

    def validate(self):
        self.validate_required(self.sup_code, 'sup_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sup_code is not None:
            result['sup_code'] = self.sup_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sup_code') is not None:
            self.sup_code = m.get('sup_code')
        return self


class GetAntchainBbpContractRuleResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sp_provider: SpProvider = None,
        rule_details: List[RuleDetail] = None,
        confirmer: str = None,
        confirm_status: str = None,
        confirm_date: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 服务商
        self.sp_provider = sp_provider
        # 规则明细
        self.rule_details = rule_details
        # 确认人
        self.confirmer = confirmer
        # 确认状态
        self.confirm_status = confirm_status
        # 确认时间
        self.confirm_date = confirm_date

    def validate(self):
        if self.sp_provider:
            self.sp_provider.validate()
        if self.rule_details:
            for k in self.rule_details:
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
        if self.sp_provider is not None:
            result['sp_provider'] = self.sp_provider.to_map()
        result['rule_details'] = []
        if self.rule_details is not None:
            for k in self.rule_details:
                result['rule_details'].append(k.to_map() if k else None)
        if self.confirmer is not None:
            result['confirmer'] = self.confirmer
        if self.confirm_status is not None:
            result['confirm_status'] = self.confirm_status
        if self.confirm_date is not None:
            result['confirm_date'] = self.confirm_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sp_provider') is not None:
            temp_model = SpProvider()
            self.sp_provider = temp_model.from_map(m['sp_provider'])
        self.rule_details = []
        if m.get('rule_details') is not None:
            for k in m.get('rule_details'):
                temp_model = RuleDetail()
                self.rule_details.append(temp_model.from_map(k))
        if m.get('confirmer') is not None:
            self.confirmer = m.get('confirmer')
        if m.get('confirm_status') is not None:
            self.confirm_status = m.get('confirm_status')
        if m.get('confirm_date') is not None:
            self.confirm_date = m.get('confirm_date')
        return self


class ExecAntchainBbpContractReconciliationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sup_code: str = None,
        score_date: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 供应商
        self.sup_code = sup_code
        # 结算时间
        self.score_date = score_date

    def validate(self):
        self.validate_required(self.sup_code, 'sup_code')
        self.validate_required(self.score_date, 'score_date')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sup_code is not None:
            result['sup_code'] = self.sup_code
        if self.score_date is not None:
            result['score_date'] = self.score_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sup_code') is not None:
            self.sup_code = m.get('sup_code')
        if m.get('score_date') is not None:
            self.score_date = m.get('score_date')
        return self


class ExecAntchainBbpContractReconciliationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        reconciliation: Reconciliation = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结算单
        self.reconciliation = reconciliation

    def validate(self):
        if self.reconciliation:
            self.reconciliation.validate()

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
        if self.reconciliation is not None:
            result['reconciliation'] = self.reconciliation.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('reconciliation') is not None:
            temp_model = Reconciliation()
            self.reconciliation = temp_model.from_map(m['reconciliation'])
        return self


class ConfirmAntchainBbpContractReconciliationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sup_code: str = None,
        socre_date: str = None,
        confirm_type: str = None,
        confirmer: str = None,
        confirm_status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 服务商
        self.sup_code = sup_code
        # 确认时间
        self.socre_date = socre_date
        # 确认类型：1、长城  2、服务方
        self.confirm_type = confirm_type
        # 确认者
        self.confirmer = confirmer
        # 认证状态
        self.confirm_status = confirm_status

    def validate(self):
        self.validate_required(self.sup_code, 'sup_code')
        self.validate_required(self.socre_date, 'socre_date')
        self.validate_required(self.confirm_type, 'confirm_type')
        self.validate_required(self.confirmer, 'confirmer')
        self.validate_required(self.confirm_status, 'confirm_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sup_code is not None:
            result['sup_code'] = self.sup_code
        if self.socre_date is not None:
            result['socre_date'] = self.socre_date
        if self.confirm_type is not None:
            result['confirm_type'] = self.confirm_type
        if self.confirmer is not None:
            result['confirmer'] = self.confirmer
        if self.confirm_status is not None:
            result['confirm_status'] = self.confirm_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sup_code') is not None:
            self.sup_code = m.get('sup_code')
        if m.get('socre_date') is not None:
            self.socre_date = m.get('socre_date')
        if m.get('confirm_type') is not None:
            self.confirm_type = m.get('confirm_type')
        if m.get('confirmer') is not None:
            self.confirmer = m.get('confirmer')
        if m.get('confirm_status') is not None:
            self.confirm_status = m.get('confirm_status')
        return self


class ConfirmAntchainBbpContractReconciliationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        reconciliation: Reconciliation = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结算单
        self.reconciliation = reconciliation

    def validate(self):
        if self.reconciliation:
            self.reconciliation.validate()

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
        if self.reconciliation is not None:
            result['reconciliation'] = self.reconciliation.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('reconciliation') is not None:
            temp_model = Reconciliation()
            self.reconciliation = temp_model.from_map(m['reconciliation'])
        return self


class QueryAntchainBbpContractReconciliationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sup_code: str = None,
        score_dates: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 供应商code
        self.sup_code = sup_code
        # 月份
        self.score_dates = score_dates

    def validate(self):
        self.validate_required(self.sup_code, 'sup_code')
        self.validate_required(self.score_dates, 'score_dates')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sup_code is not None:
            result['sup_code'] = self.sup_code
        if self.score_dates is not None:
            result['score_dates'] = self.score_dates
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sup_code') is not None:
            self.sup_code = m.get('sup_code')
        if m.get('score_dates') is not None:
            self.score_dates = m.get('score_dates')
        return self


class QueryAntchainBbpContractReconciliationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        reconciliations: List[Reconciliation] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结算单
        self.reconciliations = reconciliations

    def validate(self):
        if self.reconciliations:
            for k in self.reconciliations:
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
        result['reconciliations'] = []
        if self.reconciliations is not None:
            for k in self.reconciliations:
                result['reconciliations'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.reconciliations = []
        if m.get('reconciliations') is not None:
            for k in m.get('reconciliations'):
                temp_model = Reconciliation()
                self.reconciliations.append(temp_model.from_map(k))
        return self


