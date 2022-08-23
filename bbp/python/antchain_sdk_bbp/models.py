# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel
from typing import List, BinaryIO


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


class BusinessRecordsPairs(TeaModel):
    def __init__(
        self,
        business_code: str = None,
        public_key: str = None,
    ):
        # 业务编码
        self.business_code = business_code
        # 业务公钥
        self.public_key = public_key

    def validate(self):
        self.validate_required(self.business_code, 'business_code')
        self.validate_required(self.public_key, 'public_key')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.business_code is not None:
            result['business_code'] = self.business_code
        if self.public_key is not None:
            result['public_key'] = self.public_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('business_code') is not None:
            self.business_code = m.get('business_code')
        if m.get('public_key') is not None:
            self.public_key = m.get('public_key')
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


class Assessment(TeaModel):
    def __init__(
        self,
        sup_code: str = None,
        sup_name: str = None,
        job_number: str = None,
        name: str = None,
        assessment_num: int = None,
        level: str = None,
        create_date: str = None,
        creator: str = None,
        score_date: str = None,
        resultstate: str = None,
        workplace: str = None,
        resultdate: str = None,
        resultby: str = None,
        remark: str = None,
    ):
        # 供应商
        self.sup_code = sup_code
        # 供应商B
        self.sup_name = sup_name
        # 员工号
        self.job_number = job_number
        # 员工姓名
        self.name = name
        # 考核分数
        self.assessment_num = assessment_num
        # 级别
        self.level = level
        # 创建时间
        self.create_date = create_date
        # 管理员
        self.creator = creator
        # 202103
        self.score_date = score_date
        # 结果状态
        self.resultstate = resultstate
        # 工作地点
        self.workplace = workplace
        # 状态更新时间
        self.resultdate = resultdate
        # 确认人
        self.resultby = resultby
        # 备注
        self.remark = remark

    def validate(self):
        self.validate_required(self.sup_code, 'sup_code')
        self.validate_required(self.sup_name, 'sup_name')
        self.validate_required(self.job_number, 'job_number')
        self.validate_required(self.assessment_num, 'assessment_num')
        self.validate_required(self.level, 'level')
        self.validate_required(self.create_date, 'create_date')
        self.validate_required(self.score_date, 'score_date')
        self.validate_required(self.resultstate, 'resultstate')
        self.validate_required(self.resultdate, 'resultdate')
        self.validate_required(self.resultby, 'resultby')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sup_code is not None:
            result['sup_code'] = self.sup_code
        if self.sup_name is not None:
            result['sup_name'] = self.sup_name
        if self.job_number is not None:
            result['job_number'] = self.job_number
        if self.name is not None:
            result['name'] = self.name
        if self.assessment_num is not None:
            result['assessment_num'] = self.assessment_num
        if self.level is not None:
            result['level'] = self.level
        if self.create_date is not None:
            result['create_date'] = self.create_date
        if self.creator is not None:
            result['creator'] = self.creator
        if self.score_date is not None:
            result['score_date'] = self.score_date
        if self.resultstate is not None:
            result['resultstate'] = self.resultstate
        if self.workplace is not None:
            result['workplace'] = self.workplace
        if self.resultdate is not None:
            result['resultdate'] = self.resultdate
        if self.resultby is not None:
            result['resultby'] = self.resultby
        if self.remark is not None:
            result['remark'] = self.remark
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sup_code') is not None:
            self.sup_code = m.get('sup_code')
        if m.get('sup_name') is not None:
            self.sup_name = m.get('sup_name')
        if m.get('job_number') is not None:
            self.job_number = m.get('job_number')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('assessment_num') is not None:
            self.assessment_num = m.get('assessment_num')
        if m.get('level') is not None:
            self.level = m.get('level')
        if m.get('create_date') is not None:
            self.create_date = m.get('create_date')
        if m.get('creator') is not None:
            self.creator = m.get('creator')
        if m.get('score_date') is not None:
            self.score_date = m.get('score_date')
        if m.get('resultstate') is not None:
            self.resultstate = m.get('resultstate')
        if m.get('workplace') is not None:
            self.workplace = m.get('workplace')
        if m.get('resultdate') is not None:
            self.resultdate = m.get('resultdate')
        if m.get('resultby') is not None:
            self.resultby = m.get('resultby')
        if m.get('remark') is not None:
            self.remark = m.get('remark')
        return self


class QueryMap(TeaModel):
    def __init__(
        self,
        name: str = None,
        value: List[NameValuePair] = None,
    ):
        # 查询枚举：QueryTypeEnum
        self.name = name
        # 查询参数
        self.value = value

    def validate(self):
        self.validate_required(self.name, 'name')
        if self.value:
            for k in self.value:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        result['value'] = []
        if self.value is not None:
            for k in self.value:
                result['value'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        self.value = []
        if m.get('value') is not None:
            for k in m.get('value'):
                temp_model = NameValuePair()
                self.value.append(temp_model.from_map(k))
        return self


class InsuranceRecordModel(TeaModel):
    def __init__(
        self,
        mechanism_code: str = None,
        policy_no: str = None,
        third_part_sku: str = None,
        mechanism_name: str = None,
        insurance_type: str = None,
        source_uid: str = None,
        source: str = None,
        user_type: str = None,
        extend: str = None,
        policy_effect_time: str = None,
        policy_invalid_time: str = None,
        policy_total_amount: int = None,
        policy_pay_date: str = None,
        policy_total_stage: int = None,
        policy_stage_aver_amount: int = None,
        policy_paid_stage: int = None,
        order_time: str = None,
        activity_code: str = None,
        authorization_type: int = None,
    ):
        # 保司编码
        self.mechanism_code = mechanism_code
        # 保单号
        self.policy_no = policy_no
        # 保险产品SKU
        self.third_part_sku = third_part_sku
        # 保司机构名称
        self.mechanism_name = mechanism_name
        # 保险类型
        self.insurance_type = insurance_type
        # 用户ID，天猫uid
        self.source_uid = source_uid
        # 渠道来源 TIANMAO（天猫）
        self.source = source
        # 用户类型 PERSON
        self.user_type = user_type
        # 扩展信息 （保单附件路径）
        self.extend = extend
        # 保单生效时间
        self.policy_effect_time = policy_effect_time
        # 保单失效时间
        self.policy_invalid_time = policy_invalid_time
        # 订单总金额 单位为分
        self.policy_total_amount = policy_total_amount
        # 保费支付日期
        self.policy_pay_date = policy_pay_date
        # 保单支付总期数
        self.policy_total_stage = policy_total_stage
        # 每期支付金额
        self.policy_stage_aver_amount = policy_stage_aver_amount
        # 保单已支付期数
        self.policy_paid_stage = policy_paid_stage
        # 订单时间
        self.order_time = order_time
        # 活动码 赠险/商业险
        self.activity_code = activity_code
        # 授权类型 0 非授权 1 授权
        self.authorization_type = authorization_type

    def validate(self):
        self.validate_required(self.mechanism_code, 'mechanism_code')
        self.validate_required(self.policy_no, 'policy_no')
        self.validate_required(self.insurance_type, 'insurance_type')
        self.validate_required(self.source_uid, 'source_uid')
        self.validate_required(self.source, 'source')
        self.validate_required(self.user_type, 'user_type')
        self.validate_required(self.policy_effect_time, 'policy_effect_time')
        if self.policy_effect_time is not None:
            self.validate_pattern(self.policy_effect_time, 'policy_effect_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.policy_invalid_time, 'policy_invalid_time')
        if self.policy_invalid_time is not None:
            self.validate_pattern(self.policy_invalid_time, 'policy_invalid_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.policy_total_amount, 'policy_total_amount')
        self.validate_required(self.policy_pay_date, 'policy_pay_date')
        if self.policy_pay_date is not None:
            self.validate_pattern(self.policy_pay_date, 'policy_pay_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.policy_total_stage, 'policy_total_stage')
        self.validate_required(self.order_time, 'order_time')
        if self.order_time is not None:
            self.validate_pattern(self.order_time, 'order_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.authorization_type, 'authorization_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.mechanism_code is not None:
            result['mechanism_code'] = self.mechanism_code
        if self.policy_no is not None:
            result['policy_no'] = self.policy_no
        if self.third_part_sku is not None:
            result['third_part_sku'] = self.third_part_sku
        if self.mechanism_name is not None:
            result['mechanism_name'] = self.mechanism_name
        if self.insurance_type is not None:
            result['insurance_type'] = self.insurance_type
        if self.source_uid is not None:
            result['source_uid'] = self.source_uid
        if self.source is not None:
            result['source'] = self.source
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.extend is not None:
            result['extend'] = self.extend
        if self.policy_effect_time is not None:
            result['policy_effect_time'] = self.policy_effect_time
        if self.policy_invalid_time is not None:
            result['policy_invalid_time'] = self.policy_invalid_time
        if self.policy_total_amount is not None:
            result['policy_total_amount'] = self.policy_total_amount
        if self.policy_pay_date is not None:
            result['policy_pay_date'] = self.policy_pay_date
        if self.policy_total_stage is not None:
            result['policy_total_stage'] = self.policy_total_stage
        if self.policy_stage_aver_amount is not None:
            result['policy_stage_aver_amount'] = self.policy_stage_aver_amount
        if self.policy_paid_stage is not None:
            result['policy_paid_stage'] = self.policy_paid_stage
        if self.order_time is not None:
            result['order_time'] = self.order_time
        if self.activity_code is not None:
            result['activity_code'] = self.activity_code
        if self.authorization_type is not None:
            result['authorization_type'] = self.authorization_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('mechanism_code') is not None:
            self.mechanism_code = m.get('mechanism_code')
        if m.get('policy_no') is not None:
            self.policy_no = m.get('policy_no')
        if m.get('third_part_sku') is not None:
            self.third_part_sku = m.get('third_part_sku')
        if m.get('mechanism_name') is not None:
            self.mechanism_name = m.get('mechanism_name')
        if m.get('insurance_type') is not None:
            self.insurance_type = m.get('insurance_type')
        if m.get('source_uid') is not None:
            self.source_uid = m.get('source_uid')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('extend') is not None:
            self.extend = m.get('extend')
        if m.get('policy_effect_time') is not None:
            self.policy_effect_time = m.get('policy_effect_time')
        if m.get('policy_invalid_time') is not None:
            self.policy_invalid_time = m.get('policy_invalid_time')
        if m.get('policy_total_amount') is not None:
            self.policy_total_amount = m.get('policy_total_amount')
        if m.get('policy_pay_date') is not None:
            self.policy_pay_date = m.get('policy_pay_date')
        if m.get('policy_total_stage') is not None:
            self.policy_total_stage = m.get('policy_total_stage')
        if m.get('policy_stage_aver_amount') is not None:
            self.policy_stage_aver_amount = m.get('policy_stage_aver_amount')
        if m.get('policy_paid_stage') is not None:
            self.policy_paid_stage = m.get('policy_paid_stage')
        if m.get('order_time') is not None:
            self.order_time = m.get('order_time')
        if m.get('activity_code') is not None:
            self.activity_code = m.get('activity_code')
        if m.get('authorization_type') is not None:
            self.authorization_type = m.get('authorization_type')
        return self


class Attendance(TeaModel):
    def __init__(
        self,
        sup_code: str = None,
        sup_name: str = None,
        job_number: str = None,
        name: str = None,
        attendance_num: int = None,
        level: str = None,
        create_date: str = None,
        creator: str = None,
        score_date: str = None,
        resultstate: str = None,
        workplace: str = None,
        resultdate: str = None,
        resultby: str = None,
        remark: str = None,
    ):
        # 供应商编码
        self.sup_code = sup_code
        # 供应商A
        self.sup_name = sup_name
        # 员工编号
        self.job_number = job_number
        # 名字
        self.name = name
        # 考勤信息
        self.attendance_num = attendance_num
        # 级别
        self.level = level
        # 创建时间
        self.create_date = create_date
        # 创建者
        self.creator = creator
        # 时间
        self.score_date = score_date
        # 结果状态
        self.resultstate = resultstate
        # 工作地点
        self.workplace = workplace
        # 结果时间
        self.resultdate = resultdate
        # 确认人
        self.resultby = resultby
        # 备注
        self.remark = remark

    def validate(self):
        self.validate_required(self.sup_code, 'sup_code')
        self.validate_required(self.job_number, 'job_number')
        self.validate_required(self.attendance_num, 'attendance_num')
        self.validate_required(self.create_date, 'create_date')
        self.validate_required(self.score_date, 'score_date')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sup_code is not None:
            result['sup_code'] = self.sup_code
        if self.sup_name is not None:
            result['sup_name'] = self.sup_name
        if self.job_number is not None:
            result['job_number'] = self.job_number
        if self.name is not None:
            result['name'] = self.name
        if self.attendance_num is not None:
            result['attendance_num'] = self.attendance_num
        if self.level is not None:
            result['level'] = self.level
        if self.create_date is not None:
            result['create_date'] = self.create_date
        if self.creator is not None:
            result['creator'] = self.creator
        if self.score_date is not None:
            result['score_date'] = self.score_date
        if self.resultstate is not None:
            result['resultstate'] = self.resultstate
        if self.workplace is not None:
            result['workplace'] = self.workplace
        if self.resultdate is not None:
            result['resultdate'] = self.resultdate
        if self.resultby is not None:
            result['resultby'] = self.resultby
        if self.remark is not None:
            result['remark'] = self.remark
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sup_code') is not None:
            self.sup_code = m.get('sup_code')
        if m.get('sup_name') is not None:
            self.sup_name = m.get('sup_name')
        if m.get('job_number') is not None:
            self.job_number = m.get('job_number')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('attendance_num') is not None:
            self.attendance_num = m.get('attendance_num')
        if m.get('level') is not None:
            self.level = m.get('level')
        if m.get('create_date') is not None:
            self.create_date = m.get('create_date')
        if m.get('creator') is not None:
            self.creator = m.get('creator')
        if m.get('score_date') is not None:
            self.score_date = m.get('score_date')
        if m.get('resultstate') is not None:
            self.resultstate = m.get('resultstate')
        if m.get('workplace') is not None:
            self.workplace = m.get('workplace')
        if m.get('resultdate') is not None:
            self.resultdate = m.get('resultdate')
        if m.get('resultby') is not None:
            self.resultby = m.get('resultby')
        if m.get('remark') is not None:
            self.remark = m.get('remark')
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


class XNameValuePair(TeaModel):
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


class AuthCustomerRequest(TeaModel):
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
        extension_info: List[NameValuePair] = None,
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
        # 
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
        # 客户支付宝ID，如有则填。
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
            for k in self.extension_info:
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
        result['extension_info'] = []
        if self.extension_info is not None:
            for k in self.extension_info:
                result['extension_info'].append(k.to_map() if k else None)
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
        self.extension_info = []
        if m.get('extension_info') is not None:
            for k in m.get('extension_info'):
                temp_model = NameValuePair()
                self.extension_info.append(temp_model.from_map(k))
        return self


class AuthCustomerResponse(TeaModel):
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
        # 客户认证结果
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


class CreateCustomerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_code: str = None,
        customer_type: str = None,
        name: str = None,
        cert_no: str = None,
        cert_type: str = None,
        legal_person_cert_name: str = None,
        legal_person_cert_no: str = None,
        legal_person_cert_no_type: str = None,
        is_auth: bool = None,
        business_role: str = None,
        alipay_uid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务渠道，需提前申请产品码
        self.biz_code = biz_code
        # 客户类型：ENTERPRISE-企业, PERSON-个人
        # 
        self.customer_type = customer_type
        # 客户名称
        self.name = name
        # 客户证件号码，企业/个人均可
        self.cert_no = cert_no
        # 客户证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
        self.cert_type = cert_type
        # 法人姓名
        # 
        self.legal_person_cert_name = legal_person_cert_name
        # 法人证件号码
        # 
        self.legal_person_cert_no = legal_person_cert_no
        # 法人证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
        self.legal_person_cert_no_type = legal_person_cert_no_type
        # 是否需要先认证再注册，默认不认证。
        self.is_auth = is_auth
        # 业务角色： 买方，卖方，机构，合作伙伴
        self.business_role = business_role
        # 客户支付宝ID，如有则填。
        self.alipay_uid = alipay_uid

    def validate(self):
        self.validate_required(self.biz_code, 'biz_code')
        self.validate_required(self.customer_type, 'customer_type')
        self.validate_required(self.name, 'name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_type, 'cert_type')
        self.validate_required(self.legal_person_cert_no_type, 'legal_person_cert_no_type')
        self.validate_required(self.is_auth, 'is_auth')

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
        if self.customer_type is not None:
            result['customer_type'] = self.customer_type
        if self.name is not None:
            result['name'] = self.name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.legal_person_cert_name is not None:
            result['legal_person_cert_name'] = self.legal_person_cert_name
        if self.legal_person_cert_no is not None:
            result['legal_person_cert_no'] = self.legal_person_cert_no
        if self.legal_person_cert_no_type is not None:
            result['legal_person_cert_no_type'] = self.legal_person_cert_no_type
        if self.is_auth is not None:
            result['is_auth'] = self.is_auth
        if self.business_role is not None:
            result['business_role'] = self.business_role
        if self.alipay_uid is not None:
            result['alipay_uid'] = self.alipay_uid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('customer_type') is not None:
            self.customer_type = m.get('customer_type')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('legal_person_cert_name') is not None:
            self.legal_person_cert_name = m.get('legal_person_cert_name')
        if m.get('legal_person_cert_no') is not None:
            self.legal_person_cert_no = m.get('legal_person_cert_no')
        if m.get('legal_person_cert_no_type') is not None:
            self.legal_person_cert_no_type = m.get('legal_person_cert_no_type')
        if m.get('is_auth') is not None:
            self.is_auth = m.get('is_auth')
        if m.get('business_role') is not None:
            self.business_role = m.get('business_role')
        if m.get('alipay_uid') is not None:
            self.alipay_uid = m.get('alipay_uid')
        return self


class CreateCustomerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        customer_id: str = None,
        acc_id: str = None,
        auth_four_elements_response: CustomerAuthResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 统一客户ID
        self.customer_id = customer_id
        # 统一账户ID
        self.acc_id = acc_id
        # 客户认证结果
        self.auth_four_elements_response = auth_four_elements_response

    def validate(self):
        if self.auth_four_elements_response:
            self.auth_four_elements_response.validate()

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
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.acc_id is not None:
            result['acc_id'] = self.acc_id
        if self.auth_four_elements_response is not None:
            result['auth_four_elements_response'] = self.auth_four_elements_response.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('acc_id') is not None:
            self.acc_id = m.get('acc_id')
        if m.get('auth_four_elements_response') is not None:
            temp_model = CustomerAuthResult()
            self.auth_four_elements_response = temp_model.from_map(m['auth_four_elements_response'])
        return self


class QueryCustomerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        condition_map: List[QueryMap] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询内容
        self.condition_map = condition_map

    def validate(self):
        self.validate_required(self.condition_map, 'condition_map')
        if self.condition_map:
            for k in self.condition_map:
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
        result['condition_map'] = []
        if self.condition_map is not None:
            for k in self.condition_map:
                result['condition_map'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.condition_map = []
        if m.get('condition_map') is not None:
            for k in m.get('condition_map'):
                temp_model = QueryMap()
                self.condition_map.append(temp_model.from_map(k))
        return self


class QueryCustomerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[NameValuePair] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询结果
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
                temp_model = NameValuePair()
                self.result.append(temp_model.from_map(k))
        return self


class InitVerifyRequest(TeaModel):
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


class InitVerifyResponse(TeaModel):
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


class StartVerifyRequest(TeaModel):
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


class StartVerifyResponse(TeaModel):
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


class CheckVerifyRequest(TeaModel):
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


class CheckVerifyResponse(TeaModel):
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


class VerifyMetaRequest(TeaModel):
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


class VerifyMetaResponse(TeaModel):
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


class QueryEnterpriseBusinessinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_code: str = None,
        ep_cert_name: str = None,
        ep_cert_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码
        self.biz_code = biz_code
        # 企业名称
        self.ep_cert_name = ep_cert_name
        # 企业唯一编码
        self.ep_cert_no = ep_cert_no

    def validate(self):
        self.validate_required(self.biz_code, 'biz_code')
        self.validate_required(self.ep_cert_name, 'ep_cert_name')
        self.validate_required(self.ep_cert_no, 'ep_cert_no')

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
        return self


class QueryEnterpriseBusinessinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        signature: str = None,
        industry_code: str = None,
        industry_name: str = None,
        industry_phy_code: str = None,
        industry_phy_name: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签名之后的结果
        self.signature = signature
        # 国民经济行业代码
        self.industry_code = industry_code
        # 国民经济行业名称
        self.industry_name = industry_name
        # 行业门类代码
        self.industry_phy_code = industry_phy_code
        # 行业门类名称
        self.industry_phy_name = industry_phy_name

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
        if self.signature is not None:
            result['signature'] = self.signature
        if self.industry_code is not None:
            result['industry_code'] = self.industry_code
        if self.industry_name is not None:
            result['industry_name'] = self.industry_name
        if self.industry_phy_code is not None:
            result['industry_phy_code'] = self.industry_phy_code
        if self.industry_phy_name is not None:
            result['industry_phy_name'] = self.industry_phy_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        if m.get('industry_code') is not None:
            self.industry_code = m.get('industry_code')
        if m.get('industry_name') is not None:
            self.industry_name = m.get('industry_name')
        if m.get('industry_phy_code') is not None:
            self.industry_phy_code = m.get('industry_phy_code')
        if m.get('industry_phy_name') is not None:
            self.industry_phy_name = m.get('industry_phy_name')
        return self


class QueryGwtestRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        timeout: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 超时时间 毫秒
        self.timeout = timeout

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
        if self.timeout is not None:
            result['timeout'] = self.timeout
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        return self


class QueryGwtestResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        stauts: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果码
        self.stauts = stauts

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
        if self.stauts is not None:
            result['stauts'] = self.stauts
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('stauts') is not None:
            self.stauts = m.get('stauts')
        return self


class ApplyContractRuleRequest(TeaModel):
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


class ApplyContractRuleResponse(TeaModel):
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


class GetContractRuleRequest(TeaModel):
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


class GetContractRuleResponse(TeaModel):
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


class UploadStaffAttendanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        attendance: Attendance = None,
        biz_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 考勤信息
        self.attendance = attendance
        # uuid就行
        self.biz_id = biz_id

    def validate(self):
        self.validate_required(self.attendance, 'attendance')
        if self.attendance:
            self.attendance.validate()
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
        if self.attendance is not None:
            result['attendance'] = self.attendance.to_map()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('attendance') is not None:
            temp_model = Attendance()
            self.attendance = temp_model.from_map(m['attendance'])
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        return self


class UploadStaffAttendanceResponse(TeaModel):
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


class QueryStaffAttendanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        job_number: str = None,
        score_dates: List[str] = None,
        sup_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 员工工号
        self.job_number = job_number
        # 考勤月份
        self.score_dates = score_dates
        # 供应商
        self.sup_code = sup_code

    def validate(self):
        self.validate_required(self.job_number, 'job_number')
        self.validate_required(self.score_dates, 'score_dates')
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
        if self.job_number is not None:
            result['job_number'] = self.job_number
        if self.score_dates is not None:
            result['score_dates'] = self.score_dates
        if self.sup_code is not None:
            result['sup_code'] = self.sup_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('job_number') is not None:
            self.job_number = m.get('job_number')
        if m.get('score_dates') is not None:
            self.score_dates = m.get('score_dates')
        if m.get('sup_code') is not None:
            self.sup_code = m.get('sup_code')
        return self


class QueryStaffAttendanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        attendance: List[Attendance] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 考勤信息查询
        self.attendance = attendance

    def validate(self):
        if self.attendance:
            for k in self.attendance:
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
        result['attendance'] = []
        if self.attendance is not None:
            for k in self.attendance:
                result['attendance'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.attendance = []
        if m.get('attendance') is not None:
            for k in m.get('attendance'):
                temp_model = Attendance()
                self.attendance.append(temp_model.from_map(k))
        return self


class UploadStaffAssessmentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        time_stamp: int = None,
        assessment: Assessment = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求时间
        self.time_stamp = time_stamp
        # 考核信息
        self.assessment = assessment

    def validate(self):
        self.validate_required(self.time_stamp, 'time_stamp')
        self.validate_required(self.assessment, 'assessment')
        if self.assessment:
            self.assessment.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.time_stamp is not None:
            result['time_stamp'] = self.time_stamp
        if self.assessment is not None:
            result['assessment'] = self.assessment.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('time_stamp') is not None:
            self.time_stamp = m.get('time_stamp')
        if m.get('assessment') is not None:
            temp_model = Assessment()
            self.assessment = temp_model.from_map(m['assessment'])
        return self


class UploadStaffAssessmentResponse(TeaModel):
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


class QueryStaffAssessmentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        job_number: str = None,
        score_dates: List[str] = None,
        sup_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 员工工号
        self.job_number = job_number
        # 考核月份
        self.score_dates = score_dates
        # 供应商
        self.sup_code = sup_code

    def validate(self):
        self.validate_required(self.job_number, 'job_number')
        self.validate_required(self.score_dates, 'score_dates')
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
        if self.job_number is not None:
            result['job_number'] = self.job_number
        if self.score_dates is not None:
            result['score_dates'] = self.score_dates
        if self.sup_code is not None:
            result['sup_code'] = self.sup_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('job_number') is not None:
            self.job_number = m.get('job_number')
        if m.get('score_dates') is not None:
            self.score_dates = m.get('score_dates')
        if m.get('sup_code') is not None:
            self.sup_code = m.get('sup_code')
        return self


class QueryStaffAssessmentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        assessments: List[Assessment] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 考核结果
        self.assessments = assessments

    def validate(self):
        if self.assessments:
            for k in self.assessments:
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
        result['assessments'] = []
        if self.assessments is not None:
            for k in self.assessments:
                result['assessments'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.assessments = []
        if m.get('assessments') is not None:
            for k in m.get('assessments'):
                temp_model = Assessment()
                self.assessments.append(temp_model.from_map(k))
        return self


class ExecContractReconciliationRequest(TeaModel):
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


class ExecContractReconciliationResponse(TeaModel):
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


class ConfirmContractReconciliationRequest(TeaModel):
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


class ConfirmContractReconciliationResponse(TeaModel):
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


class QueryContractReconciliationRequest(TeaModel):
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


class QueryContractReconciliationResponse(TeaModel):
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


class VerifyCustomerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_code: str = None,
        alipay_uid: str = None,
        person_name: str = None,
        person_phone: str = None,
        person_cert_no: str = None,
        person_cert_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码
        self.biz_code = biz_code
        # 支付宝uid
        self.alipay_uid = alipay_uid
        # 个人名称
        self.person_name = person_name
        # 个人联系电话
        self.person_phone = person_phone
        # 核验证件号
        self.person_cert_no = person_cert_no
        # 个人身份类型  RESIDENT（身份证）
        self.person_cert_type = person_cert_type

    def validate(self):
        self.validate_required(self.alipay_uid, 'alipay_uid')

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
        if self.alipay_uid is not None:
            result['alipay_uid'] = self.alipay_uid
        if self.person_name is not None:
            result['person_name'] = self.person_name
        if self.person_phone is not None:
            result['person_phone'] = self.person_phone
        if self.person_cert_no is not None:
            result['person_cert_no'] = self.person_cert_no
        if self.person_cert_type is not None:
            result['person_cert_type'] = self.person_cert_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('alipay_uid') is not None:
            self.alipay_uid = m.get('alipay_uid')
        if m.get('person_name') is not None:
            self.person_name = m.get('person_name')
        if m.get('person_phone') is not None:
            self.person_phone = m.get('person_phone')
        if m.get('person_cert_no') is not None:
            self.person_cert_no = m.get('person_cert_no')
        if m.get('person_cert_type') is not None:
            self.person_cert_type = m.get('person_cert_type')
        return self


class VerifyCustomerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        did: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户生成的did
        self.did = did

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
        if self.did is not None:
            result['did'] = self.did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('did') is not None:
            self.did = m.get('did')
        return self


class MatchDidAccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_code: str = None,
        uid: str = None,
        did: str = None,
        chain_id: str = None,
        chain_account: str = None,
        kms_key_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码(YYX)
        self.biz_code = biz_code
        # 支付宝uid
        self.uid = uid
        # 分布式id ，双向check
        self.did = did
        # 链id
        self.chain_id = chain_id
        # 链账户
        self.chain_account = chain_account
        # 托管情况下包含
        self.kms_key_id = kms_key_id

    def validate(self):
        self.validate_required(self.biz_code, 'biz_code')
        self.validate_required(self.uid, 'uid')
        self.validate_required(self.did, 'did')
        self.validate_required(self.chain_account, 'chain_account')

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
        if self.uid is not None:
            result['uid'] = self.uid
        if self.did is not None:
            result['did'] = self.did
        if self.chain_id is not None:
            result['chain_id'] = self.chain_id
        if self.chain_account is not None:
            result['chain_account'] = self.chain_account
        if self.kms_key_id is not None:
            result['kms_key_id'] = self.kms_key_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('uid') is not None:
            self.uid = m.get('uid')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('chain_id') is not None:
            self.chain_id = m.get('chain_id')
        if m.get('chain_account') is not None:
            self.chain_account = m.get('chain_account')
        if m.get('kms_key_id') is not None:
            self.kms_key_id = m.get('kms_key_id')
        return self


class MatchDidAccountResponse(TeaModel):
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


class MatchDidAssetsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_code: str = None,
        uid: str = None,
        did: str = None,
        chain_id: str = None,
        chain_account: str = None,
        contract: str = None,
        contract_type: int = None,
        assert_type: str = None,
        block_number: str = None,
        tx_index: str = None,
        long_index: str = None,
        assert_name: str = None,
        assert_data: str = None,
        assert_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码(YYX)
        self.biz_code = biz_code
        # 支付宝uid
        self.uid = uid
        # 分布式id ，双向check
        self.did = did
        # 链id
        self.chain_id = chain_id
        # 链账户
        self.chain_account = chain_account
        # 链资产地址 HASH
        self.contract = contract
        # 合约类型 0-WASM
        self.contract_type = contract_type
        # 资产类型
        self.assert_type = assert_type
        # 上次资产发生变更的区块高度
        self.block_number = block_number
        # 上次资产发生变更的序号
        self.tx_index = tx_index
        # 上次资产发生变更的交易序列号
        self.long_index = long_index
        # 资产名称
        self.assert_name = assert_name
        # 资产信息（资产描述信息）
        self.assert_data = assert_data
        # 资产ID
        self.assert_id = assert_id

    def validate(self):
        self.validate_required(self.biz_code, 'biz_code')
        self.validate_required(self.uid, 'uid')
        self.validate_required(self.did, 'did')
        self.validate_required(self.chain_account, 'chain_account')
        self.validate_required(self.contract, 'contract')
        self.validate_required(self.contract_type, 'contract_type')
        self.validate_required(self.assert_type, 'assert_type')
        self.validate_required(self.tx_index, 'tx_index')
        self.validate_required(self.long_index, 'long_index')
        self.validate_required(self.assert_name, 'assert_name')
        self.validate_required(self.assert_data, 'assert_data')
        self.validate_required(self.assert_id, 'assert_id')

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
        if self.uid is not None:
            result['uid'] = self.uid
        if self.did is not None:
            result['did'] = self.did
        if self.chain_id is not None:
            result['chain_id'] = self.chain_id
        if self.chain_account is not None:
            result['chain_account'] = self.chain_account
        if self.contract is not None:
            result['contract'] = self.contract
        if self.contract_type is not None:
            result['contract_type'] = self.contract_type
        if self.assert_type is not None:
            result['assert_type'] = self.assert_type
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.tx_index is not None:
            result['tx_index'] = self.tx_index
        if self.long_index is not None:
            result['long_index'] = self.long_index
        if self.assert_name is not None:
            result['assert_name'] = self.assert_name
        if self.assert_data is not None:
            result['assert_data'] = self.assert_data
        if self.assert_id is not None:
            result['assert_id'] = self.assert_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('uid') is not None:
            self.uid = m.get('uid')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('chain_id') is not None:
            self.chain_id = m.get('chain_id')
        if m.get('chain_account') is not None:
            self.chain_account = m.get('chain_account')
        if m.get('contract') is not None:
            self.contract = m.get('contract')
        if m.get('contract_type') is not None:
            self.contract_type = m.get('contract_type')
        if m.get('assert_type') is not None:
            self.assert_type = m.get('assert_type')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('tx_index') is not None:
            self.tx_index = m.get('tx_index')
        if m.get('long_index') is not None:
            self.long_index = m.get('long_index')
        if m.get('assert_name') is not None:
            self.assert_name = m.get('assert_name')
        if m.get('assert_data') is not None:
            self.assert_data = m.get('assert_data')
        if m.get('assert_id') is not None:
            self.assert_id = m.get('assert_id')
        return self


class MatchDidAssetsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        assert_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 资产id
        self.assert_id = assert_id

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
        if self.assert_id is not None:
            result['assert_id'] = self.assert_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('assert_id') is not None:
            self.assert_id = m.get('assert_id')
        return self


class CreateDidCustomerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_code: str = None,
        uid: str = None,
        person_name: str = None,
        person_phone: str = None,
        person_cert_no: str = None,
        person_cert_type: str = None,
        account_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码
        self.biz_code = biz_code
        # 账户uid
        self.uid = uid
        # 个人名称
        self.person_name = person_name
        # 个人联系电话
        self.person_phone = person_phone
        # 核验证件号
        self.person_cert_no = person_cert_no
        # 个人身份类型
        self.person_cert_type = person_cert_type
        # 账户uid类型 Alipay/Alibaba
        self.account_type = account_type

    def validate(self):
        self.validate_required(self.biz_code, 'biz_code')
        self.validate_required(self.uid, 'uid')
        self.validate_required(self.account_type, 'account_type')

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
        if self.uid is not None:
            result['uid'] = self.uid
        if self.person_name is not None:
            result['person_name'] = self.person_name
        if self.person_phone is not None:
            result['person_phone'] = self.person_phone
        if self.person_cert_no is not None:
            result['person_cert_no'] = self.person_cert_no
        if self.person_cert_type is not None:
            result['person_cert_type'] = self.person_cert_type
        if self.account_type is not None:
            result['account_type'] = self.account_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('uid') is not None:
            self.uid = m.get('uid')
        if m.get('person_name') is not None:
            self.person_name = m.get('person_name')
        if m.get('person_phone') is not None:
            self.person_phone = m.get('person_phone')
        if m.get('person_cert_no') is not None:
            self.person_cert_no = m.get('person_cert_no')
        if m.get('person_cert_type') is not None:
            self.person_cert_type = m.get('person_cert_type')
        if m.get('account_type') is not None:
            self.account_type = m.get('account_type')
        return self


class CreateDidCustomerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        did: str = None,
        nickname: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户生成的did	用户的did
        self.did = did
        # 用户昵称
        self.nickname = nickname

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
        if self.did is not None:
            result['did'] = self.did
        if self.nickname is not None:
            result['nickname'] = self.nickname
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('nickname') is not None:
            self.nickname = m.get('nickname')
        return self


class CreateDidEnterpriseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_code: str = None,
        enterprise_code: str = None,
        enterprise_name: str = None,
        cert_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码
        self.biz_code = biz_code
        # 企业唯一编码
        self.enterprise_code = enterprise_code
        # 企业名称
        self.enterprise_name = enterprise_name
        # ORG_CERT 全国组织机构代码证书
        self.cert_type = cert_type

    def validate(self):
        self.validate_required(self.biz_code, 'biz_code')
        self.validate_required(self.enterprise_code, 'enterprise_code')

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
        if self.enterprise_code is not None:
            result['enterprise_code'] = self.enterprise_code
        if self.enterprise_name is not None:
            result['enterprise_name'] = self.enterprise_name
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('enterprise_code') is not None:
            self.enterprise_code = m.get('enterprise_code')
        if m.get('enterprise_name') is not None:
            self.enterprise_name = m.get('enterprise_name')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        return self


class CreateDidEnterpriseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        did: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 企业用户生成的did
        self.did = did

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
        if self.did is not None:
            result['did'] = self.did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('did') is not None:
            self.did = m.get('did')
        return self


class InitInsuranceUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        business_code: str = None,
        third_part_id: str = None,
        channel: str = None,
        burieds: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 保司编码
        self.business_code = business_code
        # 三方Id，此处为天猫id
        self.third_part_id = third_part_id
        # 来源渠道，TIANMAO（天猫）
        self.channel = channel
        # 埋点信息，JSON格式字符串
        self.burieds = burieds

    def validate(self):
        self.validate_required(self.business_code, 'business_code')
        self.validate_required(self.third_part_id, 'third_part_id')
        self.validate_required(self.channel, 'channel')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.business_code is not None:
            result['business_code'] = self.business_code
        if self.third_part_id is not None:
            result['third_part_id'] = self.third_part_id
        if self.channel is not None:
            result['channel'] = self.channel
        if self.burieds is not None:
            result['burieds'] = self.burieds
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('business_code') is not None:
            self.business_code = m.get('business_code')
        if m.get('third_part_id') is not None:
            self.third_part_id = m.get('third_part_id')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('burieds') is not None:
            self.burieds = m.get('burieds')
        return self


class InitInsuranceUserResponse(TeaModel):
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


class QueryInsuranceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        mechanism_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 保司编码
        self.mechanism_code = mechanism_code

    def validate(self):
        self.validate_required(self.mechanism_code, 'mechanism_code')

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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('mechanism_code') is not None:
            self.mechanism_code = m.get('mechanism_code')
        return self


class QueryInsuranceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        business_authorize_records: List[BusinessRecordsPairs] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务授权列表
        self.business_authorize_records = business_authorize_records

    def validate(self):
        if self.business_authorize_records:
            for k in self.business_authorize_records:
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
        result['business_authorize_records'] = []
        if self.business_authorize_records is not None:
            for k in self.business_authorize_records:
                result['business_authorize_records'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.business_authorize_records = []
        if m.get('business_authorize_records') is not None:
            for k in m.get('business_authorize_records'):
                temp_model = BusinessRecordsPairs()
                self.business_authorize_records.append(temp_model.from_map(k))
        return self


class OperateInsuranceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        mechanism_code: str = None,
        policy_encryption_context: str = None,
        policy_no: str = None,
        third_part_sku: str = None,
        mechanism_name: str = None,
        insurance_type: str = None,
        source_uid: str = None,
        source: str = None,
        user_name: str = None,
        user_type: str = None,
        user_phone_number: str = None,
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
        authorize_records: List[AuthorizeRecordsPairs] = None,
        activity_code: str = None,
        authorization_type: int = None,
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
        self.third_part_sku = third_part_sku
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
        self.user_phone_number = user_phone_number
        # 投保人证件号
        self.user_cert_no = user_cert_no
        # 拓展信息
        self.extend = extend
        # 保单生效时间（毫秒值）
        self.policy_effect_time = policy_effect_time
        # 保单失效时间（毫秒值）
        self.policy_invalid_time = policy_invalid_time
        # 订单总金额 整型，以分为单位，50000分 = 500.00元
        self.policy_total_amount = policy_total_amount
        # 订单总期数（一次性付款用1）
        self.policy_total_stage = policy_total_stage
        # 保费支付日期（毫秒值）
        self.policy_pay_date = policy_pay_date
        # 已支付保费期数（1代表1期）
        self.policy_paid_stage = policy_paid_stage
        # 每一期保费金额，整型，以分为单位，50000分 = 500.00元
        self.policy_stage_aver_amount = policy_stage_aver_amount
        # 订单时间（毫秒值）
        self.order_time = order_time
        # 操作类型
        # 下单 支付 理赔 退单
        self.operation = operation
        # 授权列表
        self.authorize_records = authorize_records
        # 活动码/赠险码
        self.activity_code = activity_code
        # 授权类型 1-已授权 2-未授权
        self.authorization_type = authorization_type

    def validate(self):
        self.validate_required(self.insurance_type, 'insurance_type')
        self.validate_required(self.source_uid, 'source_uid')
        if self.authorize_records:
            for k in self.authorize_records:
                if k:
                    k.validate()
        self.validate_required(self.authorization_type, 'authorization_type')

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
        if self.third_part_sku is not None:
            result['third_part_sku'] = self.third_part_sku
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
        if self.user_phone_number is not None:
            result['user_phone_number'] = self.user_phone_number
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
        result['authorize_records'] = []
        if self.authorize_records is not None:
            for k in self.authorize_records:
                result['authorize_records'].append(k.to_map() if k else None)
        if self.activity_code is not None:
            result['activity_code'] = self.activity_code
        if self.authorization_type is not None:
            result['authorization_type'] = self.authorization_type
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
        if m.get('third_part_sku') is not None:
            self.third_part_sku = m.get('third_part_sku')
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
        if m.get('user_phone_number') is not None:
            self.user_phone_number = m.get('user_phone_number')
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
        self.authorize_records = []
        if m.get('authorize_records') is not None:
            for k in m.get('authorize_records'):
                temp_model = AuthorizeRecordsPairs()
                self.authorize_records.append(temp_model.from_map(k))
        if m.get('activity_code') is not None:
            self.activity_code = m.get('activity_code')
        if m.get('authorization_type') is not None:
            self.authorization_type = m.get('authorization_type')
        return self


class OperateInsuranceResponse(TeaModel):
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


class UploadInsuranceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        mechanism_code: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 保司编码
        self.mechanism_code = mechanism_code
        # 附件信息
        # 
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.mechanism_code, 'mechanism_code')
        self.validate_required(self.file_id, 'file_id')

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
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('mechanism_code') is not None:
            self.mechanism_code = m.get('mechanism_code')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class UploadInsuranceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        file_biz_type: str = None,
        file_name: str = None,
        oss_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文件类型
        self.file_biz_type = file_biz_type
        # 文件名称
        self.file_name = file_name
        # 文件访问路径
        self.oss_url = oss_url

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
        if self.file_biz_type is not None:
            result['file_biz_type'] = self.file_biz_type
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.oss_url is not None:
            result['oss_url'] = self.oss_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('file_biz_type') is not None:
            self.file_biz_type = m.get('file_biz_type')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('oss_url') is not None:
            self.oss_url = m.get('oss_url')
        return self


class SyncInsuranceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        mechanism_code: str = None,
        policy_encryption_context: str = None,
        policy_no: str = None,
        third_part_sku: str = None,
        mechanism_name: str = None,
        insurance_type: str = None,
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
        # 理赔加密信息
        self.policy_encryption_context = policy_encryption_context
        # 保单号
        self.policy_no = policy_no
        # 保险产品SKU
        self.third_part_sku = third_part_sku
        # 保司名称
        self.mechanism_name = mechanism_name
        # 保单种类，险种
        self.insurance_type = insurance_type
        # 操作类型
        # 下单 支付 理赔 退单
        self.operation = operation
        # 赔付单号
        self.claim_order_no = claim_order_no
        # 理赔申请时间（毫秒值）
        self.claim_apply_time = claim_apply_time
        # 理赔赔付时间（毫秒值）
        self.claim_pay_time = claim_pay_time
        # 理赔申请金额，整型，以分为单位，50000分 = 500.00元
        self.claim_apply_amount = claim_apply_amount
        # 理赔金额，整型，以分为单位，50000分 = 500.00元
        self.claim_amount = claim_amount
        # 授权列表
        self.authorize_records = authorize_records

    def validate(self):
        self.validate_required(self.mechanism_code, 'mechanism_code')
        self.validate_required(self.policy_encryption_context, 'policy_encryption_context')
        self.validate_required(self.policy_no, 'policy_no')
        self.validate_required(self.claim_order_no, 'claim_order_no')
        self.validate_required(self.claim_apply_time, 'claim_apply_time')
        self.validate_required(self.claim_pay_time, 'claim_pay_time')
        self.validate_required(self.claim_apply_amount, 'claim_apply_amount')
        self.validate_required(self.claim_amount, 'claim_amount')
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
        if self.third_part_sku is not None:
            result['third_part_sku'] = self.third_part_sku
        if self.mechanism_name is not None:
            result['mechanism_name'] = self.mechanism_name
        if self.insurance_type is not None:
            result['insurance_type'] = self.insurance_type
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
        if m.get('third_part_sku') is not None:
            self.third_part_sku = m.get('third_part_sku')
        if m.get('mechanism_name') is not None:
            self.mechanism_name = m.get('mechanism_name')
        if m.get('insurance_type') is not None:
            self.insurance_type = m.get('insurance_type')
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


class SyncInsuranceResponse(TeaModel):
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


class CancelInsuranceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        policy_no: str = None,
        policy_end_time: int = None,
        reason_for_quit: str = None,
        quit_total_amount: int = None,
        extend: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 原保单号
        self.policy_no = policy_no
        # 保单终止日期 毫秒值
        self.policy_end_time = policy_end_time
        # 退保原因
        self.reason_for_quit = reason_for_quit
        # 退保保费金额，单位分
        self.quit_total_amount = quit_total_amount
        # 扩展信息
        self.extend = extend

    def validate(self):
        self.validate_required(self.policy_no, 'policy_no')
        self.validate_required(self.policy_end_time, 'policy_end_time')
        self.validate_required(self.reason_for_quit, 'reason_for_quit')
        self.validate_required(self.quit_total_amount, 'quit_total_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.policy_no is not None:
            result['policy_no'] = self.policy_no
        if self.policy_end_time is not None:
            result['policy_end_time'] = self.policy_end_time
        if self.reason_for_quit is not None:
            result['reason_for_quit'] = self.reason_for_quit
        if self.quit_total_amount is not None:
            result['quit_total_amount'] = self.quit_total_amount
        if self.extend is not None:
            result['extend'] = self.extend
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('policy_no') is not None:
            self.policy_no = m.get('policy_no')
        if m.get('policy_end_time') is not None:
            self.policy_end_time = m.get('policy_end_time')
        if m.get('reason_for_quit') is not None:
            self.reason_for_quit = m.get('reason_for_quit')
        if m.get('quit_total_amount') is not None:
            self.quit_total_amount = m.get('quit_total_amount')
        if m.get('extend') is not None:
            self.extend = m.get('extend')
        return self


class CancelInsuranceResponse(TeaModel):
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


class QueryInsuranceRecordsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        source_uid: str = None,
        mechanism_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 第三方Id，此处为天猫uid
        self.source_uid = source_uid
        # 保司编码
        self.mechanism_code = mechanism_code

    def validate(self):
        self.validate_required(self.source_uid, 'source_uid')
        self.validate_required(self.mechanism_code, 'mechanism_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.source_uid is not None:
            result['source_uid'] = self.source_uid
        if self.mechanism_code is not None:
            result['mechanism_code'] = self.mechanism_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('source_uid') is not None:
            self.source_uid = m.get('source_uid')
        if m.get('mechanism_code') is not None:
            self.mechanism_code = m.get('mechanism_code')
        return self


class QueryInsuranceRecordsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        insurance_records_list: List[InsuranceRecordModel] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户保单信息集合
        self.insurance_records_list = insurance_records_list

    def validate(self):
        if self.insurance_records_list:
            for k in self.insurance_records_list:
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
        result['insurance_records_list'] = []
        if self.insurance_records_list is not None:
            for k in self.insurance_records_list:
                result['insurance_records_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.insurance_records_list = []
        if m.get('insurance_records_list') is not None:
            for k in m.get('insurance_records_list'):
                temp_model = InsuranceRecordModel()
                self.insurance_records_list.append(temp_model.from_map(k))
        return self


class QueryInsuranceChainRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        source_uid: str = None,
        policy_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 第三方Id，此处为天猫uid
        self.source_uid = source_uid
        # 保单号
        self.policy_no = policy_no

    def validate(self):
        self.validate_required(self.source_uid, 'source_uid')
        self.validate_required(self.policy_no, 'policy_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.source_uid is not None:
            result['source_uid'] = self.source_uid
        if self.policy_no is not None:
            result['policy_no'] = self.policy_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('source_uid') is not None:
            self.source_uid = m.get('source_uid')
        if m.get('policy_no') is not None:
            self.policy_no = m.get('policy_no')
        return self


class QueryInsuranceChainResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        merchanism_code: str = None,
        source: str = None,
        insurace_type: str = None,
        insurance_context: str = None,
        insurance_claim_context: str = None,
        insurance_surrender_context: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 保司编码
        self.merchanism_code = merchanism_code
        # 订单来源 TIANMAO
        self.source = source
        # 保险类型
        self.insurace_type = insurace_type
        # 保单加密信息（加密数据，由保司持有密钥）
        self.insurance_context = insurance_context
        # 退保保单信息（加密数据，由保司持有密钥）
        self.insurance_claim_context = insurance_claim_context
        # 保单理赔信息（加密数据，由保司持有密钥）
        self.insurance_surrender_context = insurance_surrender_context

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
        if self.merchanism_code is not None:
            result['merchanism_code'] = self.merchanism_code
        if self.source is not None:
            result['source'] = self.source
        if self.insurace_type is not None:
            result['insurace_type'] = self.insurace_type
        if self.insurance_context is not None:
            result['insurance_context'] = self.insurance_context
        if self.insurance_claim_context is not None:
            result['insurance_claim_context'] = self.insurance_claim_context
        if self.insurance_surrender_context is not None:
            result['insurance_surrender_context'] = self.insurance_surrender_context
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('merchanism_code') is not None:
            self.merchanism_code = m.get('merchanism_code')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('insurace_type') is not None:
            self.insurace_type = m.get('insurace_type')
        if m.get('insurance_context') is not None:
            self.insurance_context = m.get('insurance_context')
        if m.get('insurance_claim_context') is not None:
            self.insurance_claim_context = m.get('insurance_claim_context')
        if m.get('insurance_surrender_context') is not None:
            self.insurance_surrender_context = m.get('insurance_surrender_context')
        return self


class CreateAntcloudGatewayxFileUploadRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        api_code: str = None,
        file_label: str = None,
        file_metadata: str = None,
        file_name: str = None,
        mime_type: str = None,
        api_cluster: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 上传文件作用的openapi method
        self.api_code = api_code
        # 文件标签，多个标签;分割
        self.file_label = file_label
        # 自定义的文件元数据
        self.file_metadata = file_metadata
        # 文件名，不传则随机生成文件名
        self.file_name = file_name
        # 文件的多媒体类型
        self.mime_type = mime_type
        # 产品方的api归属集群，即productInstanceId
        self.api_cluster = api_cluster

    def validate(self):
        self.validate_required(self.api_code, 'api_code')
        if self.file_label is not None:
            self.validate_max_length(self.file_label, 'file_label', 100)
        if self.file_metadata is not None:
            self.validate_max_length(self.file_metadata, 'file_metadata', 1000)
        if self.file_name is not None:
            self.validate_max_length(self.file_name, 'file_name', 100)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.api_code is not None:
            result['api_code'] = self.api_code
        if self.file_label is not None:
            result['file_label'] = self.file_label
        if self.file_metadata is not None:
            result['file_metadata'] = self.file_metadata
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.mime_type is not None:
            result['mime_type'] = self.mime_type
        if self.api_cluster is not None:
            result['api_cluster'] = self.api_cluster
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('api_code') is not None:
            self.api_code = m.get('api_code')
        if m.get('file_label') is not None:
            self.file_label = m.get('file_label')
        if m.get('file_metadata') is not None:
            self.file_metadata = m.get('file_metadata')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('mime_type') is not None:
            self.mime_type = m.get('mime_type')
        if m.get('api_cluster') is not None:
            self.api_cluster = m.get('api_cluster')
        return self


class CreateAntcloudGatewayxFileUploadResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        expired_time: str = None,
        file_id: str = None,
        upload_headers: List[XNameValuePair] = None,
        upload_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 上传有效期
        self.expired_time = expired_time
        # 32位文件唯一id
        self.file_id = file_id
        # 放入http请求头里
        self.upload_headers = upload_headers
        # 文件上传地址
        self.upload_url = upload_url

    def validate(self):
        if self.expired_time is not None:
            self.validate_pattern(self.expired_time, 'expired_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.upload_headers:
            for k in self.upload_headers:
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
        if self.expired_time is not None:
            result['expired_time'] = self.expired_time
        if self.file_id is not None:
            result['file_id'] = self.file_id
        result['upload_headers'] = []
        if self.upload_headers is not None:
            for k in self.upload_headers:
                result['upload_headers'].append(k.to_map() if k else None)
        if self.upload_url is not None:
            result['upload_url'] = self.upload_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('expired_time') is not None:
            self.expired_time = m.get('expired_time')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        self.upload_headers = []
        if m.get('upload_headers') is not None:
            for k in m.get('upload_headers'):
                temp_model = XNameValuePair()
                self.upload_headers.append(temp_model.from_map(k))
        if m.get('upload_url') is not None:
            self.upload_url = m.get('upload_url')
        return self


