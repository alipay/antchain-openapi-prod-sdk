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


class ResemblePositionData(TeaModel):
    def __init__(
        self,
        start_position: int = None,
        end_position: int = None,
    ):
        # 起始位置
        self.start_position = start_position
        # 结束位置
        self.end_position = end_position

    def validate(self):
        self.validate_required(self.start_position, 'start_position')
        self.validate_required(self.end_position, 'end_position')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.start_position is not None:
            result['start_position'] = self.start_position
        if self.end_position is not None:
            result['end_position'] = self.end_position
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('start_position') is not None:
            self.start_position = m.get('start_position')
        if m.get('end_position') is not None:
            self.end_position = m.get('end_position')
        return self


class NotaryUser(TeaModel):
    def __init__(
        self,
        user_type: str = None,
        user_name: str = None,
        user_account: str = None,
        cert_type: str = None,
        cert_no: str = None,
        phone: str = None,
        legal_person_name: str = None,
        legal_person_cert_no: str = None,
        legal_person_cert_type: str = None,
        cert_front_file: str = None,
        cert_back_file: str = None,
        enterprise_cert_file: str = None,
    ):
        # 用户类型
        self.user_type = user_type
        # 用户名称
        self.user_name = user_name
        # 用户账号
        self.user_account = user_account
        # 证件类型
        self.cert_type = cert_type
        # 证件号
        self.cert_no = cert_no
        # 联系电话
        self.phone = phone
        # 法定代表人姓名,用户类型为机构时必填
        self.legal_person_name = legal_person_name
        # 法定代表人证件号码,用户类型为机构时必填
        self.legal_person_cert_no = legal_person_cert_no
        # 法定代表人证件类型
        self.legal_person_cert_type = legal_person_cert_type
        # 身份证正面
        self.cert_front_file = cert_front_file
        # 身份证反面
        self.cert_back_file = cert_back_file
        # 企业营业执照
        self.enterprise_cert_file = enterprise_cert_file

    def validate(self):
        self.validate_required(self.user_type, 'user_type')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.cert_type, 'cert_type')
        self.validate_required(self.cert_no, 'cert_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_account is not None:
            result['user_account'] = self.user_account
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.phone is not None:
            result['phone'] = self.phone
        if self.legal_person_name is not None:
            result['legal_person_name'] = self.legal_person_name
        if self.legal_person_cert_no is not None:
            result['legal_person_cert_no'] = self.legal_person_cert_no
        if self.legal_person_cert_type is not None:
            result['legal_person_cert_type'] = self.legal_person_cert_type
        if self.cert_front_file is not None:
            result['cert_front_file'] = self.cert_front_file
        if self.cert_back_file is not None:
            result['cert_back_file'] = self.cert_back_file
        if self.enterprise_cert_file is not None:
            result['enterprise_cert_file'] = self.enterprise_cert_file
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_account') is not None:
            self.user_account = m.get('user_account')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('legal_person_name') is not None:
            self.legal_person_name = m.get('legal_person_name')
        if m.get('legal_person_cert_no') is not None:
            self.legal_person_cert_no = m.get('legal_person_cert_no')
        if m.get('legal_person_cert_type') is not None:
            self.legal_person_cert_type = m.get('legal_person_cert_type')
        if m.get('cert_front_file') is not None:
            self.cert_front_file = m.get('cert_front_file')
        if m.get('cert_back_file') is not None:
            self.cert_back_file = m.get('cert_back_file')
        if m.get('enterprise_cert_file') is not None:
            self.enterprise_cert_file = m.get('enterprise_cert_file')
        return self


class Reason(TeaModel):
    def __init__(
        self,
        reason_id: str = None,
        reason_name: str = None,
        comment: str = None,
        sort: int = None,
        is_need_attachment: bool = None,
    ):
        # 事由ID
        self.reason_id = reason_id
        # 事由名称
        self.reason_name = reason_name
        # 附件文字说明
        self.comment = comment
        # 排序
        self.sort = sort
        # 是否必须上传附件
        self.is_need_attachment = is_need_attachment

    def validate(self):
        self.validate_required(self.reason_id, 'reason_id')
        self.validate_required(self.reason_name, 'reason_name')
        self.validate_required(self.comment, 'comment')
        self.validate_required(self.sort, 'sort')
        self.validate_required(self.is_need_attachment, 'is_need_attachment')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.reason_id is not None:
            result['reason_id'] = self.reason_id
        if self.reason_name is not None:
            result['reason_name'] = self.reason_name
        if self.comment is not None:
            result['comment'] = self.comment
        if self.sort is not None:
            result['sort'] = self.sort
        if self.is_need_attachment is not None:
            result['is_need_attachment'] = self.is_need_attachment
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('reason_id') is not None:
            self.reason_id = m.get('reason_id')
        if m.get('reason_name') is not None:
            self.reason_name = m.get('reason_name')
        if m.get('comment') is not None:
            self.comment = m.get('comment')
        if m.get('sort') is not None:
            self.sort = m.get('sort')
        if m.get('is_need_attachment') is not None:
            self.is_need_attachment = m.get('is_need_attachment')
        return self


class ResembleDetail(TeaModel):
    def __init__(
        self,
        score: str = None,
        length: str = None,
        type: str = None,
        query_position_data: ResemblePositionData = None,
        match_position_data: ResemblePositionData = None,
    ):
        # 相似分数
        self.score = score
        # 长度
        self.length = length
        # 明细类型，例如VIDEO_SEGMENT表示视频区间相似
        self.type = type
        # 查询源文件的位置信息
        self.query_position_data = query_position_data
        # 相似文件的位置信息
        self.match_position_data = match_position_data

    def validate(self):
        self.validate_required(self.score, 'score')
        self.validate_required(self.type, 'type')
        self.validate_required(self.query_position_data, 'query_position_data')
        if self.query_position_data:
            self.query_position_data.validate()
        self.validate_required(self.match_position_data, 'match_position_data')
        if self.match_position_data:
            self.match_position_data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.score is not None:
            result['score'] = self.score
        if self.length is not None:
            result['length'] = self.length
        if self.type is not None:
            result['type'] = self.type
        if self.query_position_data is not None:
            result['query_position_data'] = self.query_position_data.to_map()
        if self.match_position_data is not None:
            result['match_position_data'] = self.match_position_data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('length') is not None:
            self.length = m.get('length')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('query_position_data') is not None:
            temp_model = ResemblePositionData()
            self.query_position_data = temp_model.from_map(m['query_position_data'])
        if m.get('match_position_data') is not None:
            temp_model = ResemblePositionData()
            self.match_position_data = temp_model.from_map(m['match_position_data'])
        return self


class DeliveryInfo(TeaModel):
    def __init__(
        self,
        receive_name: str = None,
        contact: str = None,
        province: str = None,
        city: str = None,
        area: str = None,
        address: str = None,
        email: str = None,
    ):
        # 收件人姓名
        self.receive_name = receive_name
        # 联系电话
        self.contact = contact
        # 省（需要接收纸质文件时必填）
        self.province = province
        # 市（需要接收纸质文件时必填）
        self.city = city
        # 区（需要接收纸质文件时必填）
        self.area = area
        # 详细地址（需要接收纸质文件时必填）
        self.address = address
        # 电子邮箱（需要接收电子文件时必填）
        self.email = email

    def validate(self):
        self.validate_required(self.receive_name, 'receive_name')
        self.validate_required(self.contact, 'contact')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.receive_name is not None:
            result['receive_name'] = self.receive_name
        if self.contact is not None:
            result['contact'] = self.contact
        if self.province is not None:
            result['province'] = self.province
        if self.city is not None:
            result['city'] = self.city
        if self.area is not None:
            result['area'] = self.area
        if self.address is not None:
            result['address'] = self.address
        if self.email is not None:
            result['email'] = self.email
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('receive_name') is not None:
            self.receive_name = m.get('receive_name')
        if m.get('contact') is not None:
            self.contact = m.get('contact')
        if m.get('province') is not None:
            self.province = m.get('province')
        if m.get('city') is not None:
            self.city = m.get('city')
        if m.get('area') is not None:
            self.area = m.get('area')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('email') is not None:
            self.email = m.get('email')
        return self


class ResembleRiskData(TeaModel):
    def __init__(
        self,
        work_id: str = None,
        work_name: str = None,
        work_type: str = None,
        score: str = None,
        work_file_id: str = None,
        resemble_details: List[ResembleDetail] = None,
    ):
        # 重复作品ID
        self.work_id = work_id
        # 相似作品的名称
        self.work_name = work_name
        # 相似作品的类型
        self.work_type = work_type
        # 相似值
        self.score = score
        # 相似作品下载凭证
        self.work_file_id = work_file_id
        # 相似明细
        self.resemble_details = resemble_details

    def validate(self):
        self.validate_required(self.work_id, 'work_id')
        if self.resemble_details:
            for k in self.resemble_details:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.work_id is not None:
            result['work_id'] = self.work_id
        if self.work_name is not None:
            result['work_name'] = self.work_name
        if self.work_type is not None:
            result['work_type'] = self.work_type
        if self.score is not None:
            result['score'] = self.score
        if self.work_file_id is not None:
            result['work_file_id'] = self.work_file_id
        result['resemble_details'] = []
        if self.resemble_details is not None:
            for k in self.resemble_details:
                result['resemble_details'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('work_id') is not None:
            self.work_id = m.get('work_id')
        if m.get('work_name') is not None:
            self.work_name = m.get('work_name')
        if m.get('work_type') is not None:
            self.work_type = m.get('work_type')
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('work_file_id') is not None:
            self.work_file_id = m.get('work_file_id')
        self.resemble_details = []
        if m.get('resemble_details') is not None:
            for k in m.get('resemble_details'):
                temp_model = ResembleDetail()
                self.resemble_details.append(temp_model.from_map(k))
        return self


class ContentRiskData(TeaModel):
    def __init__(
        self,
        risk_name: str = None,
        risk_result: bool = None,
    ):
        # 风险名称
        self.risk_name = risk_name
        # 风险是否通过审查
        self.risk_result = risk_result

    def validate(self):
        self.validate_required(self.risk_name, 'risk_name')
        self.validate_required(self.risk_result, 'risk_result')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.risk_name is not None:
            result['risk_name'] = self.risk_name
        if self.risk_result is not None:
            result['risk_result'] = self.risk_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('risk_name') is not None:
            self.risk_name = m.get('risk_name')
        if m.get('risk_result') is not None:
            self.risk_result = m.get('risk_result')
        return self


class LabelRiskData(TeaModel):
    def __init__(
        self,
        label_name: str = None,
        is_match: bool = None,
        match_value: str = None,
    ):
        # 识别出的标签名称
        self.label_name = label_name
        # 识别出的标签是否与用户选择的标签匹配
        self.is_match = is_match
        # 识别出的标签匹配度
        self.match_value = match_value

    def validate(self):
        self.validate_required(self.label_name, 'label_name')
        self.validate_required(self.is_match, 'is_match')
        self.validate_required(self.match_value, 'match_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.label_name is not None:
            result['label_name'] = self.label_name
        if self.is_match is not None:
            result['is_match'] = self.is_match
        if self.match_value is not None:
            result['match_value'] = self.match_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('label_name') is not None:
            self.label_name = m.get('label_name')
        if m.get('is_match') is not None:
            self.is_match = m.get('is_match')
        if m.get('match_value') is not None:
            self.match_value = m.get('match_value')
        return self


class FeeDetail(TeaModel):
    def __init__(
        self,
        fee_desc: str = None,
        amount: str = None,
    ):
        # 费用描述
        self.fee_desc = fee_desc
        # 费用
        self.amount = amount

    def validate(self):
        self.validate_required(self.fee_desc, 'fee_desc')
        self.validate_required(self.amount, 'amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.fee_desc is not None:
            result['fee_desc'] = self.fee_desc
        if self.amount is not None:
            result['amount'] = self.amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('fee_desc') is not None:
            self.fee_desc = m.get('fee_desc')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        return self


class EvidInfo(TeaModel):
    def __init__(
        self,
        evidence_id: str = None,
        witness: NotaryUser = None,
    ):
        # 取证ID
        self.evidence_id = evidence_id
        # 取证人
        self.witness = witness

    def validate(self):
        self.validate_required(self.evidence_id, 'evidence_id')
        self.validate_required(self.witness, 'witness')
        if self.witness:
            self.witness.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        if self.witness is not None:
            result['witness'] = self.witness.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        if m.get('witness') is not None:
            temp_model = NotaryUser()
            self.witness = temp_model.from_map(m['witness'])
        return self


class NotaryOrderRule(TeaModel):
    def __init__(
        self,
        order_type: str = None,
    ):
        # 公证出证支持公证书类型
        self.order_type = order_type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_type is not None:
            result['order_type'] = self.order_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_type') is not None:
            self.order_type = m.get('order_type')
        return self


class MonitorProviderCapability(TeaModel):
    def __init__(
        self,
        provider_id: str = None,
        provider_name: str = None,
        provider_description: str = None,
        is_provided: bool = None,
    ):
        # 供应商id
        self.provider_id = provider_id
        # 供应商名称
        self.provider_name = provider_name
        # 供应商描述
        self.provider_description = provider_description
        # 是否推荐供应商
        self.is_provided = is_provided

    def validate(self):
        self.validate_required(self.provider_id, 'provider_id')
        self.validate_required(self.provider_name, 'provider_name')
        self.validate_required(self.provider_description, 'provider_description')
        self.validate_required(self.is_provided, 'is_provided')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.provider_id is not None:
            result['provider_id'] = self.provider_id
        if self.provider_name is not None:
            result['provider_name'] = self.provider_name
        if self.provider_description is not None:
            result['provider_description'] = self.provider_description
        if self.is_provided is not None:
            result['is_provided'] = self.is_provided
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('provider_id') is not None:
            self.provider_id = m.get('provider_id')
        if m.get('provider_name') is not None:
            self.provider_name = m.get('provider_name')
        if m.get('provider_description') is not None:
            self.provider_description = m.get('provider_description')
        if m.get('is_provided') is not None:
            self.is_provided = m.get('is_provided')
        return self


class ScreenshotInfo(TeaModel):
    def __init__(
        self,
        process_log_file: str = None,
        process_log_file_hash: str = None,
        check_log_file: str = None,
        check_log_file_hash: str = None,
        screenshot_file: str = None,
        screenshot_file_hash: str = None,
        log_zip_file_hash: str = None,
        log_zip_tx_hash: str = None,
    ):
        # 全链路取证日志文件下载链接
        self.process_log_file = process_log_file
        # 全链路取证日志文件哈希
        self.process_log_file_hash = process_log_file_hash
        # 自清洁文件下载链接
        self.check_log_file = check_log_file
        # 自清洁文件哈希
        self.check_log_file_hash = check_log_file_hash
        # 网页截图文件下载链接
        self.screenshot_file = screenshot_file
        # 网页截图文件哈希
        self.screenshot_file_hash = screenshot_file_hash
        # 日志打包文件hash
        self.log_zip_file_hash = log_zip_file_hash
        # 日志文件上链hash
        self.log_zip_tx_hash = log_zip_tx_hash

    def validate(self):
        self.validate_required(self.screenshot_file, 'screenshot_file')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.process_log_file is not None:
            result['process_log_file'] = self.process_log_file
        if self.process_log_file_hash is not None:
            result['process_log_file_hash'] = self.process_log_file_hash
        if self.check_log_file is not None:
            result['check_log_file'] = self.check_log_file
        if self.check_log_file_hash is not None:
            result['check_log_file_hash'] = self.check_log_file_hash
        if self.screenshot_file is not None:
            result['screenshot_file'] = self.screenshot_file
        if self.screenshot_file_hash is not None:
            result['screenshot_file_hash'] = self.screenshot_file_hash
        if self.log_zip_file_hash is not None:
            result['log_zip_file_hash'] = self.log_zip_file_hash
        if self.log_zip_tx_hash is not None:
            result['log_zip_tx_hash'] = self.log_zip_tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('process_log_file') is not None:
            self.process_log_file = m.get('process_log_file')
        if m.get('process_log_file_hash') is not None:
            self.process_log_file_hash = m.get('process_log_file_hash')
        if m.get('check_log_file') is not None:
            self.check_log_file = m.get('check_log_file')
        if m.get('check_log_file_hash') is not None:
            self.check_log_file_hash = m.get('check_log_file_hash')
        if m.get('screenshot_file') is not None:
            self.screenshot_file = m.get('screenshot_file')
        if m.get('screenshot_file_hash') is not None:
            self.screenshot_file_hash = m.get('screenshot_file_hash')
        if m.get('log_zip_file_hash') is not None:
            self.log_zip_file_hash = m.get('log_zip_file_hash')
        if m.get('log_zip_tx_hash') is not None:
            self.log_zip_tx_hash = m.get('log_zip_tx_hash')
        return self


class EvidenceWebUrlInfo(TeaModel):
    def __init__(
        self,
        web_url: str = None,
        title: str = None,
    ):
        # 取证网址
        self.web_url = web_url
        # 取证名称
        self.title = title

    def validate(self):
        self.validate_required(self.web_url, 'web_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.web_url is not None:
            result['web_url'] = self.web_url
        if self.title is not None:
            result['title'] = self.title
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('web_url') is not None:
            self.web_url = m.get('web_url')
        if m.get('title') is not None:
            self.title = m.get('title')
        return self


class ScreenInfo(TeaModel):
    def __init__(
        self,
        process_log_file: str = None,
        process_log_file_hash: str = None,
        check_log_file: str = None,
        check_log_file_hash: str = None,
        web_screenshot_file: str = None,
        web_screenshot_file_hash: str = None,
        web_source_file: str = None,
        web_source_file_hash: str = None,
        video_file: str = None,
        video_file_hash: str = None,
        extend_device_check_file: str = None,
        extend_device_check_file_hash: str = None,
        extend_device_process_file: str = None,
        extend_device_process_file_hash: str = None,
        log_zip_file_hash: str = None,
        log_zip_tx_hash: str = None,
    ):
        # 全链路取证日志文件下载链接
        self.process_log_file = process_log_file
        # 全链路取证日志文件哈希
        self.process_log_file_hash = process_log_file_hash
        # 自清洁文件下载地址
        self.check_log_file = check_log_file
        # 自清洁文件哈希
        self.check_log_file_hash = check_log_file_hash
        # 网页截图文件下载链接
        self.web_screenshot_file = web_screenshot_file
        # 网页截图文件哈希
        self.web_screenshot_file_hash = web_screenshot_file_hash
        # 网页源码文件下载链接
        self.web_source_file = web_source_file
        # 网页源码文件哈希
        self.web_source_file_hash = web_source_file_hash
        # 视频源文件下载链接
        self.video_file = video_file
        # 视频源文件哈希
        self.video_file_hash = video_file_hash
        # 手机自清洁文件下载链接
        self.extend_device_check_file = extend_device_check_file
        # 手机自清洁文件哈希
        self.extend_device_check_file_hash = extend_device_check_file_hash
        # 手机操作日志下载链接
        self.extend_device_process_file = extend_device_process_file
        # 手机操作日志哈希
        self.extend_device_process_file_hash = extend_device_process_file_hash
        # 日志打包文件hash
        self.log_zip_file_hash = log_zip_file_hash
        # 日志打包文件上链hash
        self.log_zip_tx_hash = log_zip_tx_hash

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.process_log_file is not None:
            result['process_log_file'] = self.process_log_file
        if self.process_log_file_hash is not None:
            result['process_log_file_hash'] = self.process_log_file_hash
        if self.check_log_file is not None:
            result['check_log_file'] = self.check_log_file
        if self.check_log_file_hash is not None:
            result['check_log_file_hash'] = self.check_log_file_hash
        if self.web_screenshot_file is not None:
            result['web_screenshot_file'] = self.web_screenshot_file
        if self.web_screenshot_file_hash is not None:
            result['web_screenshot_file_hash'] = self.web_screenshot_file_hash
        if self.web_source_file is not None:
            result['web_source_file'] = self.web_source_file
        if self.web_source_file_hash is not None:
            result['web_source_file_hash'] = self.web_source_file_hash
        if self.video_file is not None:
            result['video_file'] = self.video_file
        if self.video_file_hash is not None:
            result['video_file_hash'] = self.video_file_hash
        if self.extend_device_check_file is not None:
            result['extend_device_check_file'] = self.extend_device_check_file
        if self.extend_device_check_file_hash is not None:
            result['extend_device_check_file_hash'] = self.extend_device_check_file_hash
        if self.extend_device_process_file is not None:
            result['extend_device_process_file'] = self.extend_device_process_file
        if self.extend_device_process_file_hash is not None:
            result['extend_device_process_file_hash'] = self.extend_device_process_file_hash
        if self.log_zip_file_hash is not None:
            result['log_zip_file_hash'] = self.log_zip_file_hash
        if self.log_zip_tx_hash is not None:
            result['log_zip_tx_hash'] = self.log_zip_tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('process_log_file') is not None:
            self.process_log_file = m.get('process_log_file')
        if m.get('process_log_file_hash') is not None:
            self.process_log_file_hash = m.get('process_log_file_hash')
        if m.get('check_log_file') is not None:
            self.check_log_file = m.get('check_log_file')
        if m.get('check_log_file_hash') is not None:
            self.check_log_file_hash = m.get('check_log_file_hash')
        if m.get('web_screenshot_file') is not None:
            self.web_screenshot_file = m.get('web_screenshot_file')
        if m.get('web_screenshot_file_hash') is not None:
            self.web_screenshot_file_hash = m.get('web_screenshot_file_hash')
        if m.get('web_source_file') is not None:
            self.web_source_file = m.get('web_source_file')
        if m.get('web_source_file_hash') is not None:
            self.web_source_file_hash = m.get('web_source_file_hash')
        if m.get('video_file') is not None:
            self.video_file = m.get('video_file')
        if m.get('video_file_hash') is not None:
            self.video_file_hash = m.get('video_file_hash')
        if m.get('extend_device_check_file') is not None:
            self.extend_device_check_file = m.get('extend_device_check_file')
        if m.get('extend_device_check_file_hash') is not None:
            self.extend_device_check_file_hash = m.get('extend_device_check_file_hash')
        if m.get('extend_device_process_file') is not None:
            self.extend_device_process_file = m.get('extend_device_process_file')
        if m.get('extend_device_process_file_hash') is not None:
            self.extend_device_process_file_hash = m.get('extend_device_process_file_hash')
        if m.get('log_zip_file_hash') is not None:
            self.log_zip_file_hash = m.get('log_zip_file_hash')
        if m.get('log_zip_tx_hash') is not None:
            self.log_zip_tx_hash = m.get('log_zip_tx_hash')
        return self


class NotaryInvoiceInfo(TeaModel):
    def __init__(
        self,
        billing_type: str = None,
        invoice_type: str = None,
        subject_type: str = None,
        invoice_name: str = None,
        ratepayer_code: str = None,
        bank_type: str = None,
        bank_account: str = None,
        unit_address: str = None,
        unit_phone: str = None,
        delivery: DeliveryInfo = None,
    ):
        # 开票类型
        self.billing_type = billing_type
        # 发票类型
        self.invoice_type = invoice_type
        # 主体类型
        self.subject_type = subject_type
        # 发票抬头
        self.invoice_name = invoice_name
        # 纳税人识别号
        self.ratepayer_code = ratepayer_code
        # 开户行
        self.bank_type = bank_type
        # 开户行账号
        self.bank_account = bank_account
        # 单位地址
        self.unit_address = unit_address
        # 单位电话
        self.unit_phone = unit_phone
        # 发票收件信息
        self.delivery = delivery

    def validate(self):
        self.validate_required(self.billing_type, 'billing_type')
        self.validate_required(self.invoice_type, 'invoice_type')
        self.validate_required(self.subject_type, 'subject_type')
        self.validate_required(self.invoice_name, 'invoice_name')
        if self.delivery:
            self.delivery.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.billing_type is not None:
            result['billing_type'] = self.billing_type
        if self.invoice_type is not None:
            result['invoice_type'] = self.invoice_type
        if self.subject_type is not None:
            result['subject_type'] = self.subject_type
        if self.invoice_name is not None:
            result['invoice_name'] = self.invoice_name
        if self.ratepayer_code is not None:
            result['ratepayer_code'] = self.ratepayer_code
        if self.bank_type is not None:
            result['bank_type'] = self.bank_type
        if self.bank_account is not None:
            result['bank_account'] = self.bank_account
        if self.unit_address is not None:
            result['unit_address'] = self.unit_address
        if self.unit_phone is not None:
            result['unit_phone'] = self.unit_phone
        if self.delivery is not None:
            result['delivery'] = self.delivery.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('billing_type') is not None:
            self.billing_type = m.get('billing_type')
        if m.get('invoice_type') is not None:
            self.invoice_type = m.get('invoice_type')
        if m.get('subject_type') is not None:
            self.subject_type = m.get('subject_type')
        if m.get('invoice_name') is not None:
            self.invoice_name = m.get('invoice_name')
        if m.get('ratepayer_code') is not None:
            self.ratepayer_code = m.get('ratepayer_code')
        if m.get('bank_type') is not None:
            self.bank_type = m.get('bank_type')
        if m.get('bank_account') is not None:
            self.bank_account = m.get('bank_account')
        if m.get('unit_address') is not None:
            self.unit_address = m.get('unit_address')
        if m.get('unit_phone') is not None:
            self.unit_phone = m.get('unit_phone')
        if m.get('delivery') is not None:
            temp_model = DeliveryInfo()
            self.delivery = temp_model.from_map(m['delivery'])
        return self


class SaleDigestData(TeaModel):
    def __init__(
        self,
        hash: str = None,
        score: str = None,
    ):
        # 商品hash值
        self.hash = hash
        # 物料置信度
        self.score = score

    def validate(self):
        self.validate_required(self.hash, 'hash')
        self.validate_required(self.score, 'score')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.hash is not None:
            result['hash'] = self.hash
        if self.score is not None:
            result['score'] = self.score
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('score') is not None:
            self.score = m.get('score')
        return self


class EvidenceFile(TeaModel):
    def __init__(
        self,
        evidence_file_name: str = None,
        memo: str = None,
        evidence_file_type: str = None,
        evidence_file_size: int = None,
        duration: int = None,
        evidence_file_hash: str = None,
        file_url: str = None,
    ):
        # 证据文件名称
        self.evidence_file_name = evidence_file_name
        # 证据文件备注
        self.memo = memo
        # 文件类型
        self.evidence_file_type = evidence_file_type
        # 文件大小
        self.evidence_file_size = evidence_file_size
        # 文件时长（单位：秒）
        self.duration = duration
        # 证据文件指纹
        self.evidence_file_hash = evidence_file_hash
        # 文件url
        self.file_url = file_url

    def validate(self):
        self.validate_required(self.evidence_file_name, 'evidence_file_name')
        self.validate_required(self.memo, 'memo')
        self.validate_required(self.evidence_file_type, 'evidence_file_type')
        self.validate_required(self.evidence_file_size, 'evidence_file_size')
        self.validate_required(self.duration, 'duration')
        self.validate_required(self.evidence_file_hash, 'evidence_file_hash')
        self.validate_required(self.file_url, 'file_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.evidence_file_name is not None:
            result['evidence_file_name'] = self.evidence_file_name
        if self.memo is not None:
            result['memo'] = self.memo
        if self.evidence_file_type is not None:
            result['evidence_file_type'] = self.evidence_file_type
        if self.evidence_file_size is not None:
            result['evidence_file_size'] = self.evidence_file_size
        if self.duration is not None:
            result['duration'] = self.duration
        if self.evidence_file_hash is not None:
            result['evidence_file_hash'] = self.evidence_file_hash
        if self.file_url is not None:
            result['file_url'] = self.file_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('evidence_file_name') is not None:
            self.evidence_file_name = m.get('evidence_file_name')
        if m.get('memo') is not None:
            self.memo = m.get('memo')
        if m.get('evidence_file_type') is not None:
            self.evidence_file_type = m.get('evidence_file_type')
        if m.get('evidence_file_size') is not None:
            self.evidence_file_size = m.get('evidence_file_size')
        if m.get('duration') is not None:
            self.duration = m.get('duration')
        if m.get('evidence_file_hash') is not None:
            self.evidence_file_hash = m.get('evidence_file_hash')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        return self


class BidReason(TeaModel):
    def __init__(
        self,
        category_id: str = None,
        category_name: str = None,
        desc: str = None,
        file_upload_desc: str = None,
        rank: int = None,
        is_need_testify_file: bool = None,
        reason_array: List[Reason] = None,
    ):
        # 事由类别ID
        self.category_id = category_id
        # 分类名称
        self.category_name = category_name
        # 描述
        self.desc = desc
        # 文件上传描述
        self.file_upload_desc = file_upload_desc
        # 排序
        self.rank = rank
        # 是否必须上传证明文件
        self.is_need_testify_file = is_need_testify_file
        # reasonArray
        self.reason_array = reason_array

    def validate(self):
        self.validate_required(self.category_id, 'category_id')
        self.validate_required(self.category_name, 'category_name')
        self.validate_required(self.desc, 'desc')
        self.validate_required(self.file_upload_desc, 'file_upload_desc')
        self.validate_required(self.rank, 'rank')
        self.validate_required(self.is_need_testify_file, 'is_need_testify_file')
        self.validate_required(self.reason_array, 'reason_array')
        if self.reason_array:
            for k in self.reason_array:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.category_id is not None:
            result['category_id'] = self.category_id
        if self.category_name is not None:
            result['category_name'] = self.category_name
        if self.desc is not None:
            result['desc'] = self.desc
        if self.file_upload_desc is not None:
            result['file_upload_desc'] = self.file_upload_desc
        if self.rank is not None:
            result['rank'] = self.rank
        if self.is_need_testify_file is not None:
            result['is_need_testify_file'] = self.is_need_testify_file
        result['reason_array'] = []
        if self.reason_array is not None:
            for k in self.reason_array:
                result['reason_array'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('category_id') is not None:
            self.category_id = m.get('category_id')
        if m.get('category_name') is not None:
            self.category_name = m.get('category_name')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('file_upload_desc') is not None:
            self.file_upload_desc = m.get('file_upload_desc')
        if m.get('rank') is not None:
            self.rank = m.get('rank')
        if m.get('is_need_testify_file') is not None:
            self.is_need_testify_file = m.get('is_need_testify_file')
        self.reason_array = []
        if m.get('reason_array') is not None:
            for k in m.get('reason_array'):
                temp_model = Reason()
                self.reason_array.append(temp_model.from_map(k))
        return self


class EvidenceCertificateInfo(TeaModel):
    def __init__(
        self,
        certificate_no: str = None,
        certificate_time: str = None,
        certificate_hash: str = None,
        certificate_url: str = None,
    ):
        # 证书编号
        self.certificate_no = certificate_no
        # 上链时间
        self.certificate_time = certificate_time
        # 链上交易hash
        self.certificate_hash = certificate_hash
        # 证书下载url（有效期3天）
        self.certificate_url = certificate_url

    def validate(self):
        self.validate_required(self.certificate_no, 'certificate_no')
        self.validate_required(self.certificate_time, 'certificate_time')
        self.validate_required(self.certificate_hash, 'certificate_hash')
        self.validate_required(self.certificate_url, 'certificate_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.certificate_no is not None:
            result['certificate_no'] = self.certificate_no
        if self.certificate_time is not None:
            result['certificate_time'] = self.certificate_time
        if self.certificate_hash is not None:
            result['certificate_hash'] = self.certificate_hash
        if self.certificate_url is not None:
            result['certificate_url'] = self.certificate_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('certificate_no') is not None:
            self.certificate_no = m.get('certificate_no')
        if m.get('certificate_time') is not None:
            self.certificate_time = m.get('certificate_time')
        if m.get('certificate_hash') is not None:
            self.certificate_hash = m.get('certificate_hash')
        if m.get('certificate_url') is not None:
            self.certificate_url = m.get('certificate_url')
        return self


class ReceiveInfo(TeaModel):
    def __init__(
        self,
        copies: int = None,
        order_type: str = None,
        delivery_info: DeliveryInfo = None,
    ):
        # 纸质公证书份数
        self.copies = copies
        # 公证书类型
        self.order_type = order_type
        # 收件人信息
        self.delivery_info = delivery_info

    def validate(self):
        self.validate_required(self.order_type, 'order_type')
        self.validate_required(self.delivery_info, 'delivery_info')
        if self.delivery_info:
            self.delivery_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.copies is not None:
            result['copies'] = self.copies
        if self.order_type is not None:
            result['order_type'] = self.order_type
        if self.delivery_info is not None:
            result['delivery_info'] = self.delivery_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('copies') is not None:
            self.copies = m.get('copies')
        if m.get('order_type') is not None:
            self.order_type = m.get('order_type')
        if m.get('delivery_info') is not None:
            temp_model = DeliveryInfo()
            self.delivery_info = temp_model.from_map(m['delivery_info'])
        return self


class DayStatisticsInfo(TeaModel):
    def __init__(
        self,
        date: int = None,
        day_views: str = None,
        day_view_duration: str = None,
        day_average_view_duration: str = None,
        revenue: str = None,
    ):
        # 日期时间戳
        self.date = date
        # 日观看次数
        self.day_views = day_views
        # 日观看时长
        self.day_view_duration = day_view_duration
        # 日平均观看时长
        self.day_average_view_duration = day_average_view_duration
        # 日预计收入
        self.revenue = revenue

    def validate(self):
        self.validate_required(self.date, 'date')
        self.validate_required(self.day_views, 'day_views')
        self.validate_required(self.day_view_duration, 'day_view_duration')
        self.validate_required(self.day_average_view_duration, 'day_average_view_duration')
        self.validate_required(self.revenue, 'revenue')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.date is not None:
            result['date'] = self.date
        if self.day_views is not None:
            result['day_views'] = self.day_views
        if self.day_view_duration is not None:
            result['day_view_duration'] = self.day_view_duration
        if self.day_average_view_duration is not None:
            result['day_average_view_duration'] = self.day_average_view_duration
        if self.revenue is not None:
            result['revenue'] = self.revenue
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('day_views') is not None:
            self.day_views = m.get('day_views')
        if m.get('day_view_duration') is not None:
            self.day_view_duration = m.get('day_view_duration')
        if m.get('day_average_view_duration') is not None:
            self.day_average_view_duration = m.get('day_average_view_duration')
        if m.get('revenue') is not None:
            self.revenue = m.get('revenue')
        return self


class ContainsImageInfo(TeaModel):
    def __init__(
        self,
        contains_image: bool = None,
        resolved_file_url: str = None,
    ):
        # 是否包含图片
        self.contains_image = contains_image
        # 包含图片，处理后的图片副件
        self.resolved_file_url = resolved_file_url

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.contains_image is not None:
            result['contains_image'] = self.contains_image
        if self.resolved_file_url is not None:
            result['resolved_file_url'] = self.resolved_file_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('contains_image') is not None:
            self.contains_image = m.get('contains_image')
        if m.get('resolved_file_url') is not None:
            self.resolved_file_url = m.get('resolved_file_url')
        return self


class SeriesDiagramErrorReason(TeaModel):
    def __init__(
        self,
        image_pdf_page_index: int = None,
        error: str = None,
        error_cn: str = None,
    ):
        # 系列图单个图片所属页码
        self.image_pdf_page_index = image_pdf_page_index
        # 错误原因英文
        self.error = error
        # 错误原因中文
        self.error_cn = error_cn

    def validate(self):
        self.validate_required(self.image_pdf_page_index, 'image_pdf_page_index')
        self.validate_required(self.error, 'error')
        self.validate_required(self.error_cn, 'error_cn')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.image_pdf_page_index is not None:
            result['image_pdf_page_index'] = self.image_pdf_page_index
        if self.error is not None:
            result['error'] = self.error
        if self.error_cn is not None:
            result['error_cn'] = self.error_cn
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('image_pdf_page_index') is not None:
            self.image_pdf_page_index = m.get('image_pdf_page_index')
        if m.get('error') is not None:
            self.error = m.get('error')
        if m.get('error_cn') is not None:
            self.error_cn = m.get('error_cn')
        return self


class VerifyStatementData(TeaModel):
    def __init__(
        self,
        statement_tx_hash: str = None,
        statement_file_id: str = None,
        statement_file_hash: str = None,
    ):
        # 权利声明书存证交易HASH
        self.statement_tx_hash = statement_tx_hash
        # 权利声明书文件ID（和statementFileId 二选一,如果都传使用statementFileHash）
        self.statement_file_id = statement_file_id
        # 权利声明书文件HASH（和statementFileId 二选一,如果都传使用statementFileHash）
        self.statement_file_hash = statement_file_hash

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.statement_tx_hash is not None:
            result['statement_tx_hash'] = self.statement_tx_hash
        if self.statement_file_id is not None:
            result['statement_file_id'] = self.statement_file_id
        if self.statement_file_hash is not None:
            result['statement_file_hash'] = self.statement_file_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('statement_tx_hash') is not None:
            self.statement_tx_hash = m.get('statement_tx_hash')
        if m.get('statement_file_id') is not None:
            self.statement_file_id = m.get('statement_file_id')
        if m.get('statement_file_hash') is not None:
            self.statement_file_hash = m.get('statement_file_hash')
        return self


class GoodSkuInfo(TeaModel):
    def __init__(
        self,
        sku_num: str = None,
        price: int = None,
    ):
        # 授权规格序号
        self.sku_num = sku_num
        # 授权规格价格(单位：分)
        self.price = price

    def validate(self):
        self.validate_required(self.sku_num, 'sku_num')
        self.validate_required(self.price, 'price')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sku_num is not None:
            result['sku_num'] = self.sku_num
        if self.price is not None:
            result['price'] = self.price
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sku_num') is not None:
            self.sku_num = m.get('sku_num')
        if m.get('price') is not None:
            self.price = m.get('price')
        return self


class OrderItem(TeaModel):
    def __init__(
        self,
        item_id: str = None,
        item_type: str = None,
    ):
        # 项目ID
        self.item_id = item_id
        # 项目类型（数登申请）
        self.item_type = item_type

    def validate(self):
        self.validate_required(self.item_id, 'item_id')
        self.validate_required(self.item_type, 'item_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.item_id is not None:
            result['item_id'] = self.item_id
        if self.item_type is not None:
            result['item_type'] = self.item_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('item_id') is not None:
            self.item_id = m.get('item_id')
        if m.get('item_type') is not None:
            self.item_type = m.get('item_type')
        return self


class ScreenshotCertificateResult(TeaModel):
    def __init__(
        self,
        evidence_type: str = None,
        status: str = None,
        screenshot_id: str = None,
        evidence_id: str = None,
        certificate_no: str = None,
        certificate_time: int = None,
        evidence_hash: str = None,
        evidence_tx_hash: str = None,
        certificate_file_url: str = None,
        screenshot_file_url: str = None,
        evidence_file_size: int = None,
        error_code: str = None,
        error_message: str = None,
    ):
        # 证据类型
        self.evidence_type = evidence_type
        # 证据状态
        self.status = status
        # 网页截取编号
        self.screenshot_id = screenshot_id
        # 证据编号
        self.evidence_id = evidence_id
        # 存证编号
        self.certificate_no = certificate_no
        # 上链时间
        self.certificate_time = certificate_time
        # 证据hash
        self.evidence_hash = evidence_hash
        # 链上交易hash
        self.evidence_tx_hash = evidence_tx_hash
        # 证书下载链接
        self.certificate_file_url = certificate_file_url
        # 截图文件下载链接
        self.screenshot_file_url = screenshot_file_url
        # 证据文件大小
        self.evidence_file_size = evidence_file_size
        # 错误码
        self.error_code = error_code
        # 错误信息
        self.error_message = error_message

    def validate(self):
        self.validate_required(self.evidence_type, 'evidence_type')
        self.validate_required(self.status, 'status')
        self.validate_required(self.screenshot_id, 'screenshot_id')
        self.validate_required(self.evidence_id, 'evidence_id')
        self.validate_required(self.certificate_no, 'certificate_no')
        self.validate_required(self.certificate_time, 'certificate_time')
        self.validate_required(self.evidence_hash, 'evidence_hash')
        self.validate_required(self.evidence_tx_hash, 'evidence_tx_hash')
        self.validate_required(self.certificate_file_url, 'certificate_file_url')
        self.validate_required(self.screenshot_file_url, 'screenshot_file_url')
        self.validate_required(self.evidence_file_size, 'evidence_file_size')
        self.validate_required(self.error_code, 'error_code')
        self.validate_required(self.error_message, 'error_message')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.evidence_type is not None:
            result['evidence_type'] = self.evidence_type
        if self.status is not None:
            result['status'] = self.status
        if self.screenshot_id is not None:
            result['screenshot_id'] = self.screenshot_id
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        if self.certificate_no is not None:
            result['certificate_no'] = self.certificate_no
        if self.certificate_time is not None:
            result['certificate_time'] = self.certificate_time
        if self.evidence_hash is not None:
            result['evidence_hash'] = self.evidence_hash
        if self.evidence_tx_hash is not None:
            result['evidence_tx_hash'] = self.evidence_tx_hash
        if self.certificate_file_url is not None:
            result['certificate_file_url'] = self.certificate_file_url
        if self.screenshot_file_url is not None:
            result['screenshot_file_url'] = self.screenshot_file_url
        if self.evidence_file_size is not None:
            result['evidence_file_size'] = self.evidence_file_size
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_message is not None:
            result['error_message'] = self.error_message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('evidence_type') is not None:
            self.evidence_type = m.get('evidence_type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('screenshot_id') is not None:
            self.screenshot_id = m.get('screenshot_id')
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        if m.get('certificate_no') is not None:
            self.certificate_no = m.get('certificate_no')
        if m.get('certificate_time') is not None:
            self.certificate_time = m.get('certificate_time')
        if m.get('evidence_hash') is not None:
            self.evidence_hash = m.get('evidence_hash')
        if m.get('evidence_tx_hash') is not None:
            self.evidence_tx_hash = m.get('evidence_tx_hash')
        if m.get('certificate_file_url') is not None:
            self.certificate_file_url = m.get('certificate_file_url')
        if m.get('screenshot_file_url') is not None:
            self.screenshot_file_url = m.get('screenshot_file_url')
        if m.get('evidence_file_size') is not None:
            self.evidence_file_size = m.get('evidence_file_size')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        return self


class NotaryPublicOffice(TeaModel):
    def __init__(
        self,
        code: str = None,
        name: str = None,
        province: str = None,
        city: str = None,
        org_name: str = None,
        belong: str = None,
        notary_order_rule: NotaryOrderRule = None,
        allow_certification: bool = None,
    ):
        # 公证处code
        self.code = code
        # 公证处名称
        self.name = name
        # 公证处所在省（直辖市）
        self.province = province
        # 公证处所在市
        self.city = city
        # 公证处完整名称
        self.org_name = org_name
        # 公证处隶属
        self.belong = belong
        # 公证处出证规则
        self.notary_order_rule = notary_order_rule
        # 是否允许出证
        self.allow_certification = allow_certification

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.province, 'province')
        self.validate_required(self.city, 'city')
        self.validate_required(self.org_name, 'org_name')
        self.validate_required(self.belong, 'belong')
        if self.notary_order_rule:
            self.notary_order_rule.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        if self.province is not None:
            result['province'] = self.province
        if self.city is not None:
            result['city'] = self.city
        if self.org_name is not None:
            result['org_name'] = self.org_name
        if self.belong is not None:
            result['belong'] = self.belong
        if self.notary_order_rule is not None:
            result['notary_order_rule'] = self.notary_order_rule.to_map()
        if self.allow_certification is not None:
            result['allow_certification'] = self.allow_certification
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('province') is not None:
            self.province = m.get('province')
        if m.get('city') is not None:
            self.city = m.get('city')
        if m.get('org_name') is not None:
            self.org_name = m.get('org_name')
        if m.get('belong') is not None:
            self.belong = m.get('belong')
        if m.get('notary_order_rule') is not None:
            temp_model = NotaryOrderRule()
            self.notary_order_rule = temp_model.from_map(m['notary_order_rule'])
        if m.get('allow_certification') is not None:
            self.allow_certification = m.get('allow_certification')
        return self


class NotaryFeeEvidTypeData(TeaModel):
    def __init__(
        self,
        evid_type_desc: str = None,
        evid_type_detail: str = None,
    ):
        # 证据类型描述
        self.evid_type_desc = evid_type_desc
        # 证据分类及数量详情
        self.evid_type_detail = evid_type_detail

    def validate(self):
        self.validate_required(self.evid_type_desc, 'evid_type_desc')
        self.validate_required(self.evid_type_detail, 'evid_type_detail')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.evid_type_desc is not None:
            result['evid_type_desc'] = self.evid_type_desc
        if self.evid_type_detail is not None:
            result['evid_type_detail'] = self.evid_type_detail
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('evid_type_desc') is not None:
            self.evid_type_desc = m.get('evid_type_desc')
        if m.get('evid_type_detail') is not None:
            self.evid_type_detail = m.get('evid_type_detail')
        return self


class DciPublicationInfo(TeaModel):
    def __init__(
        self,
        publication_status: str = None,
        first_publication_date: str = None,
        first_publication_place: str = None,
        first_publication_code: str = None,
    ):
        # 作品发表状态
        self.publication_status = publication_status
        # 首次发表日期
        self.first_publication_date = first_publication_date
        # 首次发表地址
        self.first_publication_place = first_publication_place
        # 首次发表地点地区编码
        self.first_publication_code = first_publication_code

    def validate(self):
        self.validate_required(self.publication_status, 'publication_status')
        self.validate_required(self.first_publication_date, 'first_publication_date')
        self.validate_required(self.first_publication_code, 'first_publication_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.publication_status is not None:
            result['publication_status'] = self.publication_status
        if self.first_publication_date is not None:
            result['first_publication_date'] = self.first_publication_date
        if self.first_publication_place is not None:
            result['first_publication_place'] = self.first_publication_place
        if self.first_publication_code is not None:
            result['first_publication_code'] = self.first_publication_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('publication_status') is not None:
            self.publication_status = m.get('publication_status')
        if m.get('first_publication_date') is not None:
            self.first_publication_date = m.get('first_publication_date')
        if m.get('first_publication_place') is not None:
            self.first_publication_place = m.get('first_publication_place')
        if m.get('first_publication_code') is not None:
            self.first_publication_code = m.get('first_publication_code')
        return self


class DciCreationInfo(TeaModel):
    def __init__(
        self,
        creation_nature: str = None,
        creation_completion_date: str = None,
        creation_completion_place: str = None,
        creation_completion_code: str = None,
    ):
        # 作品创作性质
        self.creation_nature = creation_nature
        # 创作完成日期
        self.creation_completion_date = creation_completion_date
        # 创作完成地点
        self.creation_completion_place = creation_completion_place
        # 作品创作地点地区编码
        self.creation_completion_code = creation_completion_code

    def validate(self):
        self.validate_required(self.creation_nature, 'creation_nature')
        self.validate_required(self.creation_completion_date, 'creation_completion_date')
        self.validate_required(self.creation_completion_code, 'creation_completion_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.creation_nature is not None:
            result['creation_nature'] = self.creation_nature
        if self.creation_completion_date is not None:
            result['creation_completion_date'] = self.creation_completion_date
        if self.creation_completion_place is not None:
            result['creation_completion_place'] = self.creation_completion_place
        if self.creation_completion_code is not None:
            result['creation_completion_code'] = self.creation_completion_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('creation_nature') is not None:
            self.creation_nature = m.get('creation_nature')
        if m.get('creation_completion_date') is not None:
            self.creation_completion_date = m.get('creation_completion_date')
        if m.get('creation_completion_place') is not None:
            self.creation_completion_place = m.get('creation_completion_place')
        if m.get('creation_completion_code') is not None:
            self.creation_completion_code = m.get('creation_completion_code')
        return self


class NotaryFeeItem(TeaModel):
    def __init__(
        self,
        fee_item_desc: str = None,
        fee_item_amount_rmb_fen: int = None,
        fee_detail_list: List[FeeDetail] = None,
    ):
        # 费用分项描述
        self.fee_item_desc = fee_item_desc
        # 费用分项金额(分)
        self.fee_item_amount_rmb_fen = fee_item_amount_rmb_fen
        # 费用分项详情列表
        self.fee_detail_list = fee_detail_list

    def validate(self):
        self.validate_required(self.fee_item_desc, 'fee_item_desc')
        self.validate_required(self.fee_item_amount_rmb_fen, 'fee_item_amount_rmb_fen')
        self.validate_required(self.fee_detail_list, 'fee_detail_list')
        if self.fee_detail_list:
            for k in self.fee_detail_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.fee_item_desc is not None:
            result['fee_item_desc'] = self.fee_item_desc
        if self.fee_item_amount_rmb_fen is not None:
            result['fee_item_amount_rmb_fen'] = self.fee_item_amount_rmb_fen
        result['fee_detail_list'] = []
        if self.fee_detail_list is not None:
            for k in self.fee_detail_list:
                result['fee_detail_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('fee_item_desc') is not None:
            self.fee_item_desc = m.get('fee_item_desc')
        if m.get('fee_item_amount_rmb_fen') is not None:
            self.fee_item_amount_rmb_fen = m.get('fee_item_amount_rmb_fen')
        self.fee_detail_list = []
        if m.get('fee_detail_list') is not None:
            for k in m.get('fee_detail_list'):
                temp_model = FeeDetail()
                self.fee_detail_list.append(temp_model.from_map(k))
        return self


class RightsInfo(TeaModel):
    def __init__(
        self,
        completed_time: int = None,
        completed_place: str = None,
        is_publish: bool = None,
        publish_time: int = None,
        publish_place: str = None,
        publish_web: str = None,
        is_author: bool = None,
        author_cert_name: str = None,
        author_cert_no: str = None,
    ):
        # 作品创作完成时间
        self.completed_time = completed_time
        # 作品创作完成地点（最长128个字符）
        self.completed_place = completed_place
        # 是否发表
        self.is_publish = is_publish
        # 发表时间（如果isPublish为true则必填）
        self.publish_time = publish_time
        # 发表地点（如果isPublish为true则必填，最长128个字符）
        self.publish_place = publish_place
        # 发表网址（如果isPublish为true则必填，最长1024个字符）
        self.publish_web = publish_web
        # 是否是作者
        self.is_author = is_author
        # 作者姓名（如果isAuthor为true则必填，最长32个字符）
        self.author_cert_name = author_cert_name
        # 作者身份证号（如果isAuthor为true则必填）
        self.author_cert_no = author_cert_no

    def validate(self):
        self.validate_required(self.completed_time, 'completed_time')
        self.validate_required(self.completed_place, 'completed_place')
        if self.completed_place is not None:
            self.validate_max_length(self.completed_place, 'completed_place', 128)
        self.validate_required(self.is_publish, 'is_publish')
        if self.publish_place is not None:
            self.validate_max_length(self.publish_place, 'publish_place', 128)
        if self.publish_web is not None:
            self.validate_max_length(self.publish_web, 'publish_web', 1024)
        self.validate_required(self.is_author, 'is_author')
        if self.author_cert_name is not None:
            self.validate_max_length(self.author_cert_name, 'author_cert_name', 32)
        if self.author_cert_no is not None:
            self.validate_max_length(self.author_cert_no, 'author_cert_no', 30)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.completed_time is not None:
            result['completed_time'] = self.completed_time
        if self.completed_place is not None:
            result['completed_place'] = self.completed_place
        if self.is_publish is not None:
            result['is_publish'] = self.is_publish
        if self.publish_time is not None:
            result['publish_time'] = self.publish_time
        if self.publish_place is not None:
            result['publish_place'] = self.publish_place
        if self.publish_web is not None:
            result['publish_web'] = self.publish_web
        if self.is_author is not None:
            result['is_author'] = self.is_author
        if self.author_cert_name is not None:
            result['author_cert_name'] = self.author_cert_name
        if self.author_cert_no is not None:
            result['author_cert_no'] = self.author_cert_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('completed_time') is not None:
            self.completed_time = m.get('completed_time')
        if m.get('completed_place') is not None:
            self.completed_place = m.get('completed_place')
        if m.get('is_publish') is not None:
            self.is_publish = m.get('is_publish')
        if m.get('publish_time') is not None:
            self.publish_time = m.get('publish_time')
        if m.get('publish_place') is not None:
            self.publish_place = m.get('publish_place')
        if m.get('publish_web') is not None:
            self.publish_web = m.get('publish_web')
        if m.get('is_author') is not None:
            self.is_author = m.get('is_author')
        if m.get('author_cert_name') is not None:
            self.author_cert_name = m.get('author_cert_name')
        if m.get('author_cert_no') is not None:
            self.author_cert_no = m.get('author_cert_no')
        return self


class VerifyUserData(TeaModel):
    def __init__(
        self,
        cert_name: str = None,
        cert_no: str = None,
        cert_type: str = None,
        register_person_tx_hash: str = None,
    ):
        # 证件名称
        self.cert_name = cert_name
        # 证件号码
        self.cert_no = cert_no
        # 证件类型
        self.cert_type = cert_type
        # 登记人信息存证交易HASH
        self.register_person_tx_hash = register_person_tx_hash

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.register_person_tx_hash is not None:
            result['register_person_tx_hash'] = self.register_person_tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('register_person_tx_hash') is not None:
            self.register_person_tx_hash = m.get('register_person_tx_hash')
        return self


class RefuseInfo(TeaModel):
    def __init__(
        self,
        reason: str = None,
        notification_path: str = None,
    ):
        # 拒绝理由/终止备注
        self.reason = reason
        # 不予办理决定书路径/终止决定书路径
        self.notification_path = notification_path

    def validate(self):
        self.validate_required(self.reason, 'reason')
        self.validate_required(self.notification_path, 'notification_path')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.reason is not None:
            result['reason'] = self.reason
        if self.notification_path is not None:
            result['notification_path'] = self.notification_path
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('reason') is not None:
            self.reason = m.get('reason')
        if m.get('notification_path') is not None:
            self.notification_path = m.get('notification_path')
        return self


class EvidenceUrlInfo(TeaModel):
    def __init__(
        self,
        url: str = None,
        auto_surfing_minute: int = None,
    ):
        # 取证网址
        self.url = url
        # 音视频取证时间
        self.auto_surfing_minute = auto_surfing_minute

    def validate(self):
        self.validate_required(self.url, 'url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.url is not None:
            result['url'] = self.url
        if self.auto_surfing_minute is not None:
            result['auto_surfing_minute'] = self.auto_surfing_minute
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('auto_surfing_minute') is not None:
            self.auto_surfing_minute = m.get('auto_surfing_minute')
        return self


class OverseaContentStatistics(TeaModel):
    def __init__(
        self,
        content_id: str = None,
        total_views: str = None,
        total_view_duration: str = None,
        total_average_view_duration: str = None,
        total_revenue: str = None,
        day_statistics_list: List[DayStatisticsInfo] = None,
    ):
        # 发布视频id
        self.content_id = content_id
        # 总观看次数
        self.total_views = total_views
        # 总观看时长
        self.total_view_duration = total_view_duration
        # 总平均观看时长
        self.total_average_view_duration = total_average_view_duration
        # 总预计收入
        self.total_revenue = total_revenue
        # 每日详细统计列表
        self.day_statistics_list = day_statistics_list

    def validate(self):
        self.validate_required(self.content_id, 'content_id')
        self.validate_required(self.total_views, 'total_views')
        self.validate_required(self.total_view_duration, 'total_view_duration')
        self.validate_required(self.total_average_view_duration, 'total_average_view_duration')
        self.validate_required(self.total_revenue, 'total_revenue')
        self.validate_required(self.day_statistics_list, 'day_statistics_list')
        if self.day_statistics_list:
            for k in self.day_statistics_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.content_id is not None:
            result['content_id'] = self.content_id
        if self.total_views is not None:
            result['total_views'] = self.total_views
        if self.total_view_duration is not None:
            result['total_view_duration'] = self.total_view_duration
        if self.total_average_view_duration is not None:
            result['total_average_view_duration'] = self.total_average_view_duration
        if self.total_revenue is not None:
            result['total_revenue'] = self.total_revenue
        result['day_statistics_list'] = []
        if self.day_statistics_list is not None:
            for k in self.day_statistics_list:
                result['day_statistics_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('content_id') is not None:
            self.content_id = m.get('content_id')
        if m.get('total_views') is not None:
            self.total_views = m.get('total_views')
        if m.get('total_view_duration') is not None:
            self.total_view_duration = m.get('total_view_duration')
        if m.get('total_average_view_duration') is not None:
            self.total_average_view_duration = m.get('total_average_view_duration')
        if m.get('total_revenue') is not None:
            self.total_revenue = m.get('total_revenue')
        self.day_statistics_list = []
        if m.get('day_statistics_list') is not None:
            for k in m.get('day_statistics_list'):
                temp_model = DayStatisticsInfo()
                self.day_statistics_list.append(temp_model.from_map(k))
        return self


class DirectMonitorResult(TeaModel):
    def __init__(
        self,
        monitor_result_id: str = None,
        similar_resource_url: str = None,
        similar_web_url: str = None,
        title: str = None,
        author: str = None,
        upload_time: str = None,
    ):
        # 监测结果id
        self.monitor_result_id = monitor_result_id
        # 相似的资源链接
        self.similar_resource_url = similar_resource_url
        # 相似资源所在的网址链接
        self.similar_web_url = similar_web_url
        # 资源标题
        self.title = title
        # 资源作者
        self.author = author
        # 资源上传时间，格式yyyy-MM-dd HH:mm:ss
        self.upload_time = upload_time

    def validate(self):
        self.validate_required(self.monitor_result_id, 'monitor_result_id')
        self.validate_required(self.similar_resource_url, 'similar_resource_url')
        self.validate_required(self.similar_web_url, 'similar_web_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.monitor_result_id is not None:
            result['monitor_result_id'] = self.monitor_result_id
        if self.similar_resource_url is not None:
            result['similar_resource_url'] = self.similar_resource_url
        if self.similar_web_url is not None:
            result['similar_web_url'] = self.similar_web_url
        if self.title is not None:
            result['title'] = self.title
        if self.author is not None:
            result['author'] = self.author
        if self.upload_time is not None:
            result['upload_time'] = self.upload_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('monitor_result_id') is not None:
            self.monitor_result_id = m.get('monitor_result_id')
        if m.get('similar_resource_url') is not None:
            self.similar_resource_url = m.get('similar_resource_url')
        if m.get('similar_web_url') is not None:
            self.similar_web_url = m.get('similar_web_url')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('author') is not None:
            self.author = m.get('author')
        if m.get('upload_time') is not None:
            self.upload_time = m.get('upload_time')
        return self


class SecurityData(TeaModel):
    def __init__(
        self,
        result: str = None,
        risk_data: List[str] = None,
    ):
        # 内容安全检查结果
        self.result = result
        # 有风险的内容
        self.risk_data = risk_data

    def validate(self):
        self.validate_required(self.result, 'result')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.result is not None:
            result['result'] = self.result
        if self.risk_data is not None:
            result['risk_data'] = self.risk_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('risk_data') is not None:
            self.risk_data = m.get('risk_data')
        return self


class InvoiceInfo(TeaModel):
    def __init__(
        self,
        invoice_type: str = None,
        invoice_header: str = None,
        taxpayer_number: str = None,
        registered_address: str = None,
        registered_tel: str = None,
        open_account_tel: str = None,
        open_account_bank: str = None,
        bank_account: str = None,
    ):
        # 发票类型 InvoiceTypeEnum目前只支持普票
        # (NORMAL,ELC,普票)
        # (SPECIAL,VAT,专票)
        self.invoice_type = invoice_type
        # 发票抬头（著作权人之一）
        self.invoice_header = invoice_header
        # 纳税人识别号（机构必填）
        self.taxpayer_number = taxpayer_number
        # 注册地址（专票必填）
        self.registered_address = registered_address
        # 注册电话（专票必填）
        self.registered_tel = registered_tel
        # 开户电话（专票必填）
        self.open_account_tel = open_account_tel
        # 开户银行（专票必填）
        self.open_account_bank = open_account_bank
        # 银行账号（专票必填）
        self.bank_account = bank_account

    def validate(self):
        self.validate_required(self.invoice_type, 'invoice_type')
        self.validate_required(self.invoice_header, 'invoice_header')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.invoice_type is not None:
            result['invoice_type'] = self.invoice_type
        if self.invoice_header is not None:
            result['invoice_header'] = self.invoice_header
        if self.taxpayer_number is not None:
            result['taxpayer_number'] = self.taxpayer_number
        if self.registered_address is not None:
            result['registered_address'] = self.registered_address
        if self.registered_tel is not None:
            result['registered_tel'] = self.registered_tel
        if self.open_account_tel is not None:
            result['open_account_tel'] = self.open_account_tel
        if self.open_account_bank is not None:
            result['open_account_bank'] = self.open_account_bank
        if self.bank_account is not None:
            result['bank_account'] = self.bank_account
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('invoice_type') is not None:
            self.invoice_type = m.get('invoice_type')
        if m.get('invoice_header') is not None:
            self.invoice_header = m.get('invoice_header')
        if m.get('taxpayer_number') is not None:
            self.taxpayer_number = m.get('taxpayer_number')
        if m.get('registered_address') is not None:
            self.registered_address = m.get('registered_address')
        if m.get('registered_tel') is not None:
            self.registered_tel = m.get('registered_tel')
        if m.get('open_account_tel') is not None:
            self.open_account_tel = m.get('open_account_tel')
        if m.get('open_account_bank') is not None:
            self.open_account_bank = m.get('open_account_bank')
        if m.get('bank_account') is not None:
            self.bank_account = m.get('bank_account')
        return self


class NotaryReceiveInfo(TeaModel):
    def __init__(
        self,
        order_type: str = None,
        receive_info: ReceiveInfo = None,
        invoice_info: NotaryInvoiceInfo = None,
    ):
        # 公证书类型
        self.order_type = order_type
        # 公证书送达信息
        self.receive_info = receive_info
        # 开票信息
        self.invoice_info = invoice_info

    def validate(self):
        self.validate_required(self.order_type, 'order_type')
        self.validate_required(self.receive_info, 'receive_info')
        if self.receive_info:
            self.receive_info.validate()
        if self.invoice_info:
            self.invoice_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_type is not None:
            result['order_type'] = self.order_type
        if self.receive_info is not None:
            result['receive_info'] = self.receive_info.to_map()
        if self.invoice_info is not None:
            result['invoice_info'] = self.invoice_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_type') is not None:
            self.order_type = m.get('order_type')
        if m.get('receive_info') is not None:
            temp_model = ReceiveInfo()
            self.receive_info = temp_model.from_map(m['receive_info'])
        if m.get('invoice_info') is not None:
            temp_model = NotaryInvoiceInfo()
            self.invoice_info = temp_model.from_map(m['invoice_info'])
        return self


class AccountData(TeaModel):
    def __init__(
        self,
        account_id: str = None,
        account_name: str = None,
        account_platform: str = None,
    ):
        # 账号id
        self.account_id = account_id
        # 账号名称
        self.account_name = account_name
        # 账号平台（支付宝，淘宝，微信，抖音等）
        self.account_platform = account_platform

    def validate(self):
        self.validate_required(self.account_id, 'account_id')
        self.validate_required(self.account_name, 'account_name')
        self.validate_required(self.account_platform, 'account_platform')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.account_name is not None:
            result['account_name'] = self.account_name
        if self.account_platform is not None:
            result['account_platform'] = self.account_platform
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('account_name') is not None:
            self.account_name = m.get('account_name')
        if m.get('account_platform') is not None:
            self.account_platform = m.get('account_platform')
        return self


class CopyrightCertInfo(TeaModel):
    def __init__(
        self,
        cert_no: str = None,
        cert_name: str = None,
        cert_type: str = None,
    ):
        # 证件号码
        self.cert_no = cert_no
        # 证件名称
        self.cert_name = cert_name
        # 证件类型
        self.cert_type = cert_type

    def validate(self):
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_type, 'cert_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        return self


class MonitorTask(TeaModel):
    def __init__(
        self,
        content_desc: str = None,
        content_title: str = None,
        file_length_in_second: int = None,
        keywords: List[str] = None,
        monitor_task_id: str = None,
        name: str = None,
        provider_id: str = None,
        result_count: int = None,
        scopes: List[str] = None,
        status: str = None,
        task_duration: int = None,
        task_end: int = None,
        task_start: int = None,
        file_type: str = None,
        file_size: int = None,
        submit_content: str = None,
        submit_type: str = None,
        failure_msg: str = None,
        failure_code: str = None,
    ):
        # 内容表述
        # 
        # 
        self.content_desc = content_desc
        # 监测任务标题
        # 
        # 
        self.content_title = content_title
        # 监测文件时长，主要用于视频监测、音频监测的时长记录
        self.file_length_in_second = file_length_in_second
        # 监测关键字
        # 
        # 
        self.keywords = keywords
        # 监测任务ID
        # 
        self.monitor_task_id = monitor_task_id
        # 任务名称
        # 
        # 
        self.name = name
        # 监测供应商id
        self.provider_id = provider_id
        # 监测结果数量
        # 
        # 
        self.result_count = result_count
        # 监测范围
        # 
        # 
        self.scopes = scopes
        # 任务状态
        # 
        # INIT
        # 
        # WORKING
        # 
        # FINISH
        # 
        # FAILURE
        # 
        # DELETE
        self.status = status
        # 监测时长(天)
        # 
        # 
        self.task_duration = task_duration
        # 任务结束时间
        # 
        # 
        self.task_end = task_end
        # 任务开始时间
        # 
        # 
        self.task_start = task_start
        # 文件类别
        # 
        # IMAGE
        # 
        # TEXT
        # 
        # VIDEO
        self.file_type = file_type
        # 文件大小
        self.file_size = file_size
        # submitType是url就是url地址 submitType 是file就是oss fileId
        self.submit_content = submit_content
        # 提交任务的类型:FILE/URL
        # 不填为FILE
        # FILE表示文件上传素材，URL表示上传URL
        self.submit_type = submit_type
        # 当status为failure时的具体错误信息（中文描述）
        self.failure_msg = failure_msg
        # 当status为failure时的具体错误信息（错误枚举）
        self.failure_code = failure_code

    def validate(self):
        self.validate_required(self.keywords, 'keywords')
        self.validate_required(self.monitor_task_id, 'monitor_task_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.scopes, 'scopes')
        self.validate_required(self.status, 'status')
        self.validate_required(self.task_duration, 'task_duration')
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.submit_content, 'submit_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.content_desc is not None:
            result['content_desc'] = self.content_desc
        if self.content_title is not None:
            result['content_title'] = self.content_title
        if self.file_length_in_second is not None:
            result['file_length_in_second'] = self.file_length_in_second
        if self.keywords is not None:
            result['keywords'] = self.keywords
        if self.monitor_task_id is not None:
            result['monitor_task_id'] = self.monitor_task_id
        if self.name is not None:
            result['name'] = self.name
        if self.provider_id is not None:
            result['provider_id'] = self.provider_id
        if self.result_count is not None:
            result['result_count'] = self.result_count
        if self.scopes is not None:
            result['scopes'] = self.scopes
        if self.status is not None:
            result['status'] = self.status
        if self.task_duration is not None:
            result['task_duration'] = self.task_duration
        if self.task_end is not None:
            result['task_end'] = self.task_end
        if self.task_start is not None:
            result['task_start'] = self.task_start
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.file_size is not None:
            result['file_size'] = self.file_size
        if self.submit_content is not None:
            result['submit_content'] = self.submit_content
        if self.submit_type is not None:
            result['submit_type'] = self.submit_type
        if self.failure_msg is not None:
            result['failure_msg'] = self.failure_msg
        if self.failure_code is not None:
            result['failure_code'] = self.failure_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('content_desc') is not None:
            self.content_desc = m.get('content_desc')
        if m.get('content_title') is not None:
            self.content_title = m.get('content_title')
        if m.get('file_length_in_second') is not None:
            self.file_length_in_second = m.get('file_length_in_second')
        if m.get('keywords') is not None:
            self.keywords = m.get('keywords')
        if m.get('monitor_task_id') is not None:
            self.monitor_task_id = m.get('monitor_task_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('provider_id') is not None:
            self.provider_id = m.get('provider_id')
        if m.get('result_count') is not None:
            self.result_count = m.get('result_count')
        if m.get('scopes') is not None:
            self.scopes = m.get('scopes')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('task_duration') is not None:
            self.task_duration = m.get('task_duration')
        if m.get('task_end') is not None:
            self.task_end = m.get('task_end')
        if m.get('task_start') is not None:
            self.task_start = m.get('task_start')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('file_size') is not None:
            self.file_size = m.get('file_size')
        if m.get('submit_content') is not None:
            self.submit_content = m.get('submit_content')
        if m.get('submit_type') is not None:
            self.submit_type = m.get('submit_type')
        if m.get('failure_msg') is not None:
            self.failure_msg = m.get('failure_msg')
        if m.get('failure_code') is not None:
            self.failure_code = m.get('failure_code')
        return self


class ExpressInfo(TeaModel):
    def __init__(
        self,
        type: str = None,
        name: str = None,
        phone: str = None,
        email: str = None,
        express_name: str = None,
        tracking_number: str = None,
        send_time: int = None,
    ):
        # 材料类型
        self.type = type
        # 收件人姓名
        self.name = name
        # 收件人电话号码
        self.phone = phone
        # 邮箱地址
        self.email = email
        # 快递名称
        self.express_name = express_name
        # 快递单号
        self.tracking_number = tracking_number
        # 材料发出时间戳
        self.send_time = send_time

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.name, 'name')
        self.validate_required(self.phone, 'phone')
        self.validate_required(self.email, 'email')
        self.validate_required(self.express_name, 'express_name')
        self.validate_required(self.tracking_number, 'tracking_number')
        self.validate_required(self.send_time, 'send_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.name is not None:
            result['name'] = self.name
        if self.phone is not None:
            result['phone'] = self.phone
        if self.email is not None:
            result['email'] = self.email
        if self.express_name is not None:
            result['express_name'] = self.express_name
        if self.tracking_number is not None:
            result['tracking_number'] = self.tracking_number
        if self.send_time is not None:
            result['send_time'] = self.send_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('express_name') is not None:
            self.express_name = m.get('express_name')
        if m.get('tracking_number') is not None:
            self.tracking_number = m.get('tracking_number')
        if m.get('send_time') is not None:
            self.send_time = m.get('send_time')
        return self


class PlayListEntity(TeaModel):
    def __init__(
        self,
        play_list_name: str = None,
        authorize_type: str = None,
        authorize_scope_type: str = None,
        protect_rights_type: str = None,
        protect_rights_scope_type: str = None,
        authorization_start_date: str = None,
        authorization_time_length: int = None,
        auth_platform: List[str] = None,
    ):
        # 播放列表名称，可包含多个视频
        self.play_list_name = play_list_name
        # 表示授权类型，仅支持EXCLUSIVE，表示独家
        # 默认EXCLUSIVE
        self.authorize_type = authorize_type
        # 授权类型范围，仅支持OVERSEA，表示全海外
        # 默认OVERSEA
        self.authorize_scope_type = authorize_scope_type
        # 维权类型，仅支持CONTAIN_PROTECT，表示包含维权
        # 默认CONTAIN_PROTECT
        self.protect_rights_type = protect_rights_type
        # 维权类型范围，仅支持OVERSEA，表示全海外
        # 默认OVERSEA
        self.protect_rights_scope_type = protect_rights_scope_type
        # 内容授权开始日期yyyy-MM-dd
        self.authorization_start_date = authorization_start_date
        # 内容授权时长,单位：年，目前支持1~3年，
        # 注意结束时间即开始时间 + 授权时长 不能早于当前时间
        self.authorization_time_length = authorization_time_length
        # 内容授权平台列表：
        # 默认授权平台都会进行运营，当前仅支持YOUTUBE
        self.auth_platform = auth_platform

    def validate(self):
        self.validate_required(self.play_list_name, 'play_list_name')
        self.validate_required(self.authorization_start_date, 'authorization_start_date')
        self.validate_required(self.authorization_time_length, 'authorization_time_length')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.play_list_name is not None:
            result['play_list_name'] = self.play_list_name
        if self.authorize_type is not None:
            result['authorize_type'] = self.authorize_type
        if self.authorize_scope_type is not None:
            result['authorize_scope_type'] = self.authorize_scope_type
        if self.protect_rights_type is not None:
            result['protect_rights_type'] = self.protect_rights_type
        if self.protect_rights_scope_type is not None:
            result['protect_rights_scope_type'] = self.protect_rights_scope_type
        if self.authorization_start_date is not None:
            result['authorization_start_date'] = self.authorization_start_date
        if self.authorization_time_length is not None:
            result['authorization_time_length'] = self.authorization_time_length
        if self.auth_platform is not None:
            result['auth_platform'] = self.auth_platform
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('play_list_name') is not None:
            self.play_list_name = m.get('play_list_name')
        if m.get('authorize_type') is not None:
            self.authorize_type = m.get('authorize_type')
        if m.get('authorize_scope_type') is not None:
            self.authorize_scope_type = m.get('authorize_scope_type')
        if m.get('protect_rights_type') is not None:
            self.protect_rights_type = m.get('protect_rights_type')
        if m.get('protect_rights_scope_type') is not None:
            self.protect_rights_scope_type = m.get('protect_rights_scope_type')
        if m.get('authorization_start_date') is not None:
            self.authorization_start_date = m.get('authorization_start_date')
        if m.get('authorization_time_length') is not None:
            self.authorization_time_length = m.get('authorization_time_length')
        if m.get('auth_platform') is not None:
            self.auth_platform = m.get('auth_platform')
        return self


class RecordScreenResult(TeaModel):
    def __init__(
        self,
        evidence_type: str = None,
        status: str = None,
        evidence_id: str = None,
        certificate_no: str = None,
        certificate_time: int = None,
        evidence_hash: str = None,
        evidence_tx_hash: str = None,
        certificate_file_url: str = None,
        evidence_files: List[EvidenceFile] = None,
        evidence_start_time: int = None,
        evidence_end_time: int = None,
        error_code: str = None,
        error_message: str = None,
        operate_url: str = None,
    ):
        # 取证类型(SCREEN_RECORDING：录屏取证)
        self.evidence_type = evidence_type
        # 取证状态
        self.status = status
        # 证据编号
        self.evidence_id = evidence_id
        # 存证编号
        self.certificate_no = certificate_no
        # 上链时间
        self.certificate_time = certificate_time
        # 证据hash
        self.evidence_hash = evidence_hash
        # 链上交易hash
        self.evidence_tx_hash = evidence_tx_hash
        # 证书文件下载地址
        self.certificate_file_url = certificate_file_url
        # 录屏取证文件列表
        self.evidence_files = evidence_files
        # 录屏开始时间
        self.evidence_start_time = evidence_start_time
        # 录屏结束时间
        self.evidence_end_time = evidence_end_time
        # 错误码
        self.error_code = error_code
        # 错误信息
        self.error_message = error_message
        # 云桌面url
        self.operate_url = operate_url

    def validate(self):
        self.validate_required(self.evidence_type, 'evidence_type')
        self.validate_required(self.status, 'status')
        self.validate_required(self.evidence_id, 'evidence_id')
        self.validate_required(self.certificate_no, 'certificate_no')
        self.validate_required(self.certificate_time, 'certificate_time')
        self.validate_required(self.evidence_hash, 'evidence_hash')
        self.validate_required(self.evidence_tx_hash, 'evidence_tx_hash')
        if self.evidence_files:
            for k in self.evidence_files:
                if k:
                    k.validate()
        self.validate_required(self.evidence_start_time, 'evidence_start_time')
        self.validate_required(self.evidence_end_time, 'evidence_end_time')
        self.validate_required(self.error_message, 'error_message')
        self.validate_required(self.operate_url, 'operate_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.evidence_type is not None:
            result['evidence_type'] = self.evidence_type
        if self.status is not None:
            result['status'] = self.status
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        if self.certificate_no is not None:
            result['certificate_no'] = self.certificate_no
        if self.certificate_time is not None:
            result['certificate_time'] = self.certificate_time
        if self.evidence_hash is not None:
            result['evidence_hash'] = self.evidence_hash
        if self.evidence_tx_hash is not None:
            result['evidence_tx_hash'] = self.evidence_tx_hash
        if self.certificate_file_url is not None:
            result['certificate_file_url'] = self.certificate_file_url
        result['evidence_files'] = []
        if self.evidence_files is not None:
            for k in self.evidence_files:
                result['evidence_files'].append(k.to_map() if k else None)
        if self.evidence_start_time is not None:
            result['evidence_start_time'] = self.evidence_start_time
        if self.evidence_end_time is not None:
            result['evidence_end_time'] = self.evidence_end_time
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.operate_url is not None:
            result['operate_url'] = self.operate_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('evidence_type') is not None:
            self.evidence_type = m.get('evidence_type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        if m.get('certificate_no') is not None:
            self.certificate_no = m.get('certificate_no')
        if m.get('certificate_time') is not None:
            self.certificate_time = m.get('certificate_time')
        if m.get('evidence_hash') is not None:
            self.evidence_hash = m.get('evidence_hash')
        if m.get('evidence_tx_hash') is not None:
            self.evidence_tx_hash = m.get('evidence_tx_hash')
        if m.get('certificate_file_url') is not None:
            self.certificate_file_url = m.get('certificate_file_url')
        self.evidence_files = []
        if m.get('evidence_files') is not None:
            for k in m.get('evidence_files'):
                temp_model = EvidenceFile()
                self.evidence_files.append(temp_model.from_map(k))
        if m.get('evidence_start_time') is not None:
            self.evidence_start_time = m.get('evidence_start_time')
        if m.get('evidence_end_time') is not None:
            self.evidence_end_time = m.get('evidence_end_time')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('operate_url') is not None:
            self.operate_url = m.get('operate_url')
        return self


class WorksInfo(TeaModel):
    def __init__(
        self,
        works_name: str = None,
        works_type: str = None,
        works_type_en: str = None,
    ):
        # 作品名称
        self.works_name = works_name
        # 作品类型
        self.works_type = works_type
        # 作品类型英文标识
        self.works_type_en = works_type_en

    def validate(self):
        self.validate_required(self.works_name, 'works_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.works_name is not None:
            result['works_name'] = self.works_name
        if self.works_type is not None:
            result['works_type'] = self.works_type
        if self.works_type_en is not None:
            result['works_type_en'] = self.works_type_en
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('works_name') is not None:
            self.works_name = m.get('works_name')
        if m.get('works_type') is not None:
            self.works_type = m.get('works_type')
        if m.get('works_type_en') is not None:
            self.works_type_en = m.get('works_type_en')
        return self


class DciRightInfo(TeaModel):
    def __init__(
        self,
        right_scope: str = None,
        right_obtain_way: str = None,
        ownership_way: str = None,
    ):
        # 作品权利范围
        self.right_scope = right_scope
        # 权利取得方式
        self.right_obtain_way = right_obtain_way
        # 权利归属方式
        self.ownership_way = ownership_way

    def validate(self):
        self.validate_required(self.right_scope, 'right_scope')
        self.validate_required(self.right_obtain_way, 'right_obtain_way')
        self.validate_required(self.ownership_way, 'ownership_way')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.right_scope is not None:
            result['right_scope'] = self.right_scope
        if self.right_obtain_way is not None:
            result['right_obtain_way'] = self.right_obtain_way
        if self.ownership_way is not None:
            result['ownership_way'] = self.ownership_way
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('right_scope') is not None:
            self.right_scope = m.get('right_scope')
        if m.get('right_obtain_way') is not None:
            self.right_obtain_way = m.get('right_obtain_way')
        if m.get('ownership_way') is not None:
            self.ownership_way = m.get('ownership_way')
        return self


class MonitorResult(TeaModel):
    def __init__(
        self,
        monitor_task_id: str = None,
        monitor_result_id: str = None,
        infr_url: str = None,
        infr_host: str = None,
        infr_title: str = None,
        infr_time: int = None,
        detail: str = None,
        poster: str = None,
        post_date: int = None,
        find_date: int = None,
        view_count: int = None,
        like_count: int = None,
        comment_count: int = None,
        repost_count: int = None,
        download_url: str = None,
        infr_feedback_time: int = None,
    ):
        # 监测任务ID
        # 
        self.monitor_task_id = monitor_task_id
        # 监测结果ID
        # 
        self.monitor_result_id = monitor_result_id
        # 侵权网址
        # 
        # 
        self.infr_url = infr_url
        # 侵权主体
        # 
        # 
        self.infr_host = infr_host
        # 侵权标题
        # 
        # 
        self.infr_title = infr_title
        # 侵权内容上传时间
        # 
        # 
        self.infr_time = infr_time
        # 侵权详情
        # 
        self.detail = detail
        # 发布者
        self.poster = poster
        # 侵权内容发布时间
        self.post_date = post_date
        # 侵权内容发现时间
        self.find_date = find_date
        # 观看数
        self.view_count = view_count
        # 点赞数
        self.like_count = like_count
        # 评论数
        self.comment_count = comment_count
        # 转发数
        self.repost_count = repost_count
        # 侵权文件下载链接
        self.download_url = download_url
        # 疑似侵权反馈时间
        self.infr_feedback_time = infr_feedback_time

    def validate(self):
        self.validate_required(self.monitor_task_id, 'monitor_task_id')
        self.validate_required(self.monitor_result_id, 'monitor_result_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.monitor_task_id is not None:
            result['monitor_task_id'] = self.monitor_task_id
        if self.monitor_result_id is not None:
            result['monitor_result_id'] = self.monitor_result_id
        if self.infr_url is not None:
            result['infr_url'] = self.infr_url
        if self.infr_host is not None:
            result['infr_host'] = self.infr_host
        if self.infr_title is not None:
            result['infr_title'] = self.infr_title
        if self.infr_time is not None:
            result['infr_time'] = self.infr_time
        if self.detail is not None:
            result['detail'] = self.detail
        if self.poster is not None:
            result['poster'] = self.poster
        if self.post_date is not None:
            result['post_date'] = self.post_date
        if self.find_date is not None:
            result['find_date'] = self.find_date
        if self.view_count is not None:
            result['view_count'] = self.view_count
        if self.like_count is not None:
            result['like_count'] = self.like_count
        if self.comment_count is not None:
            result['comment_count'] = self.comment_count
        if self.repost_count is not None:
            result['repost_count'] = self.repost_count
        if self.download_url is not None:
            result['download_url'] = self.download_url
        if self.infr_feedback_time is not None:
            result['infr_feedback_time'] = self.infr_feedback_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('monitor_task_id') is not None:
            self.monitor_task_id = m.get('monitor_task_id')
        if m.get('monitor_result_id') is not None:
            self.monitor_result_id = m.get('monitor_result_id')
        if m.get('infr_url') is not None:
            self.infr_url = m.get('infr_url')
        if m.get('infr_host') is not None:
            self.infr_host = m.get('infr_host')
        if m.get('infr_title') is not None:
            self.infr_title = m.get('infr_title')
        if m.get('infr_time') is not None:
            self.infr_time = m.get('infr_time')
        if m.get('detail') is not None:
            self.detail = m.get('detail')
        if m.get('poster') is not None:
            self.poster = m.get('poster')
        if m.get('post_date') is not None:
            self.post_date = m.get('post_date')
        if m.get('find_date') is not None:
            self.find_date = m.get('find_date')
        if m.get('view_count') is not None:
            self.view_count = m.get('view_count')
        if m.get('like_count') is not None:
            self.like_count = m.get('like_count')
        if m.get('comment_count') is not None:
            self.comment_count = m.get('comment_count')
        if m.get('repost_count') is not None:
            self.repost_count = m.get('repost_count')
        if m.get('download_url') is not None:
            self.download_url = m.get('download_url')
        if m.get('infr_feedback_time') is not None:
            self.infr_feedback_time = m.get('infr_feedback_time')
        return self


class UserData(TeaModel):
    def __init__(
        self,
        account: str = None,
        account_type: str = None,
        cert_name: str = None,
        cert_no: str = None,
        cert_type: str = None,
        contact_info: str = None,
        legal_person: str = None,
        reg_time: int = None,
        status: str = None,
        type: str = None,
    ):
        # 用户账号
        self.account = account
        # 账号类型
        self.account_type = account_type
        # 证件名称
        self.cert_name = cert_name
        # 证件号码
        self.cert_no = cert_no
        # 证件类型
        self.cert_type = cert_type
        # 联系方式
        self.contact_info = contact_info
        # 企业法人
        self.legal_person = legal_person
        # 注册时间
        self.reg_time = reg_time
        # 账号状态
        self.status = status
        # 用户类型
        self.type = type

    def validate(self):
        self.validate_required(self.account, 'account')
        self.validate_required(self.account_type, 'account_type')
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_type, 'cert_type')
        self.validate_required(self.reg_time, 'reg_time')
        self.validate_required(self.status, 'status')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.account is not None:
            result['account'] = self.account
        if self.account_type is not None:
            result['account_type'] = self.account_type
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.contact_info is not None:
            result['contact_info'] = self.contact_info
        if self.legal_person is not None:
            result['legal_person'] = self.legal_person
        if self.reg_time is not None:
            result['reg_time'] = self.reg_time
        if self.status is not None:
            result['status'] = self.status
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('account_type') is not None:
            self.account_type = m.get('account_type')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('contact_info') is not None:
            self.contact_info = m.get('contact_info')
        if m.get('legal_person') is not None:
            self.legal_person = m.get('legal_person')
        if m.get('reg_time') is not None:
            self.reg_time = m.get('reg_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class RecordScreenData(TeaModel):
    def __init__(
        self,
        error_reason: str = None,
        file_hash: str = None,
        gmt_end: int = None,
        gmt_start: int = None,
        os_version: str = None,
        screen_info: ScreenInfo = None,
        screen_zip: str = None,
        sw_version: str = None,
        tsr: str = None,
        tx_hash: str = None,
        file_size: int = None,
        block_height: int = None,
        timestamp: int = None,
        certificate_url: str = None,
        certificate_storage_no: str = None,
        zip_tx_hash: str = None,
        inventory: str = None,
        zip_file_hash: str = None,
        main_evidence_name: str = None,
        evidence_order_num: str = None,
        correction_url: str = None,
        gmt_ready: int = None,
    ):
        # 错误原因（状态为FAIL才有数据）
        self.error_reason = error_reason
        # 录屏文件Hash值
        self.file_hash = file_hash
        # 录屏结束时间
        self.gmt_end = gmt_end
        # 录屏开始时间
        self.gmt_start = gmt_start
        # OS版本号
        self.os_version = os_version
        # 录屏文件信息
        self.screen_info = screen_info
        # 证据包下载地址（状态为SUCCESS 才有数据）
        self.screen_zip = screen_zip
        # 录屏软件版本号
        self.sw_version = sw_version
        # 可信时间戳的返回对象
        self.tsr = tsr
        # 统一证据编号
        self.tx_hash = tx_hash
        # 录屏文件大小
        self.file_size = file_size
        # 录屏文件存证块高
        self.block_height = block_height
        # 录屏文件上链时间
        self.timestamp = timestamp
        # 录屏文件公证处证书下载链接
        self.certificate_url = certificate_url
        # 公证处证书编号
        self.certificate_storage_no = certificate_storage_no
        # 证据包存证交易hash
        self.zip_tx_hash = zip_tx_hash
        # 取证备注信息
        self.inventory = inventory
        # 证据包文件hash
        self.zip_file_hash = zip_file_hash
        # 主要核心证据文件名称
        self.main_evidence_name = main_evidence_name
        # 取证申请单号
        self.evidence_order_num = evidence_order_num
        # 补正说明函下载地址
        self.correction_url = correction_url
        # 录屏取证准备时间
        self.gmt_ready = gmt_ready

    def validate(self):
        self.validate_required(self.gmt_end, 'gmt_end')
        self.validate_required(self.gmt_start, 'gmt_start')
        self.validate_required(self.os_version, 'os_version')
        if self.screen_info:
            self.screen_info.validate()
        self.validate_required(self.sw_version, 'sw_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.error_reason is not None:
            result['error_reason'] = self.error_reason
        if self.file_hash is not None:
            result['file_hash'] = self.file_hash
        if self.gmt_end is not None:
            result['gmt_end'] = self.gmt_end
        if self.gmt_start is not None:
            result['gmt_start'] = self.gmt_start
        if self.os_version is not None:
            result['os_version'] = self.os_version
        if self.screen_info is not None:
            result['screen_info'] = self.screen_info.to_map()
        if self.screen_zip is not None:
            result['screen_zip'] = self.screen_zip
        if self.sw_version is not None:
            result['sw_version'] = self.sw_version
        if self.tsr is not None:
            result['tsr'] = self.tsr
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.file_size is not None:
            result['file_size'] = self.file_size
        if self.block_height is not None:
            result['block_height'] = self.block_height
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.certificate_url is not None:
            result['certificate_url'] = self.certificate_url
        if self.certificate_storage_no is not None:
            result['certificate_storage_no'] = self.certificate_storage_no
        if self.zip_tx_hash is not None:
            result['zip_tx_hash'] = self.zip_tx_hash
        if self.inventory is not None:
            result['inventory'] = self.inventory
        if self.zip_file_hash is not None:
            result['zip_file_hash'] = self.zip_file_hash
        if self.main_evidence_name is not None:
            result['main_evidence_name'] = self.main_evidence_name
        if self.evidence_order_num is not None:
            result['evidence_order_num'] = self.evidence_order_num
        if self.correction_url is not None:
            result['correction_url'] = self.correction_url
        if self.gmt_ready is not None:
            result['gmt_ready'] = self.gmt_ready
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('error_reason') is not None:
            self.error_reason = m.get('error_reason')
        if m.get('file_hash') is not None:
            self.file_hash = m.get('file_hash')
        if m.get('gmt_end') is not None:
            self.gmt_end = m.get('gmt_end')
        if m.get('gmt_start') is not None:
            self.gmt_start = m.get('gmt_start')
        if m.get('os_version') is not None:
            self.os_version = m.get('os_version')
        if m.get('screen_info') is not None:
            temp_model = ScreenInfo()
            self.screen_info = temp_model.from_map(m['screen_info'])
        if m.get('screen_zip') is not None:
            self.screen_zip = m.get('screen_zip')
        if m.get('sw_version') is not None:
            self.sw_version = m.get('sw_version')
        if m.get('tsr') is not None:
            self.tsr = m.get('tsr')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('file_size') is not None:
            self.file_size = m.get('file_size')
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('certificate_url') is not None:
            self.certificate_url = m.get('certificate_url')
        if m.get('certificate_storage_no') is not None:
            self.certificate_storage_no = m.get('certificate_storage_no')
        if m.get('zip_tx_hash') is not None:
            self.zip_tx_hash = m.get('zip_tx_hash')
        if m.get('inventory') is not None:
            self.inventory = m.get('inventory')
        if m.get('zip_file_hash') is not None:
            self.zip_file_hash = m.get('zip_file_hash')
        if m.get('main_evidence_name') is not None:
            self.main_evidence_name = m.get('main_evidence_name')
        if m.get('evidence_order_num') is not None:
            self.evidence_order_num = m.get('evidence_order_num')
        if m.get('correction_url') is not None:
            self.correction_url = m.get('correction_url')
        if m.get('gmt_ready') is not None:
            self.gmt_ready = m.get('gmt_ready')
        return self


class EvidenceThirdPartyInfo(TeaModel):
    def __init__(
        self,
        submit_time: str = None,
        system_url: str = None,
        account: str = None,
        system_name: str = None,
        login_time: str = None,
        login_ip: str = None,
    ):
        # 三方系统用户提交网址时间
        self.submit_time = submit_time
        # 三方系统地址
        self.system_url = system_url
        # 三方系统账号
        self.account = account
        # 三方系统名称
        self.system_name = system_name
        # 用户取证时登录的时间
        self.login_time = login_time
        # 用户取证时登录的IP
        self.login_ip = login_ip

    def validate(self):
        self.validate_required(self.submit_time, 'submit_time')
        if self.submit_time is not None:
            self.validate_pattern(self.submit_time, 'submit_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.system_url, 'system_url')
        self.validate_required(self.account, 'account')
        self.validate_required(self.system_name, 'system_name')
        self.validate_required(self.login_time, 'login_time')
        if self.login_time is not None:
            self.validate_pattern(self.login_time, 'login_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.login_ip, 'login_ip')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.submit_time is not None:
            result['submit_time'] = self.submit_time
        if self.system_url is not None:
            result['system_url'] = self.system_url
        if self.account is not None:
            result['account'] = self.account
        if self.system_name is not None:
            result['system_name'] = self.system_name
        if self.login_time is not None:
            result['login_time'] = self.login_time
        if self.login_ip is not None:
            result['login_ip'] = self.login_ip
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('submit_time') is not None:
            self.submit_time = m.get('submit_time')
        if m.get('system_url') is not None:
            self.system_url = m.get('system_url')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('system_name') is not None:
            self.system_name = m.get('system_name')
        if m.get('login_time') is not None:
            self.login_time = m.get('login_time')
        if m.get('login_ip') is not None:
            self.login_ip = m.get('login_ip')
        return self


class RecommendCategoryDetail(TeaModel):
    def __init__(
        self,
        recommend_work_category: str = None,
        category_similar_ratio: str = None,
        category_risk_rank: str = None,
    ):
        # 推荐分类类型
        self.recommend_work_category = recommend_work_category
        # 作品类型相似度，保留2位小数
        self.category_similar_ratio = category_similar_ratio
        # 作品类型风险等级
        self.category_risk_rank = category_risk_rank

    def validate(self):
        self.validate_required(self.recommend_work_category, 'recommend_work_category')
        self.validate_required(self.category_similar_ratio, 'category_similar_ratio')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.recommend_work_category is not None:
            result['recommend_work_category'] = self.recommend_work_category
        if self.category_similar_ratio is not None:
            result['category_similar_ratio'] = self.category_similar_ratio
        if self.category_risk_rank is not None:
            result['category_risk_rank'] = self.category_risk_rank
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('recommend_work_category') is not None:
            self.recommend_work_category = m.get('recommend_work_category')
        if m.get('category_similar_ratio') is not None:
            self.category_similar_ratio = m.get('category_similar_ratio')
        if m.get('category_risk_rank') is not None:
            self.category_risk_rank = m.get('category_risk_rank')
        return self


class DciUserAddressInfo(TeaModel):
    def __init__(
        self,
        country: str = None,
        province: str = None,
        city: str = None,
        district: str = None,
        town: str = None,
        road: str = None,
        road_no: str = None,
        address_detail: str = None,
    ):
        # 所在国家
        self.country = country
        # 所在省份
        self.province = province
        # 所在城市
        self.city = city
        # 识别出的地区
        self.district = district
        # 识别出的街道
        self.town = town
        # 识别出的路
        self.road = road
        # 识别出的路号牌
        self.road_no = road_no
        # 地址详情
        self.address_detail = address_detail

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.country is not None:
            result['country'] = self.country
        if self.province is not None:
            result['province'] = self.province
        if self.city is not None:
            result['city'] = self.city
        if self.district is not None:
            result['district'] = self.district
        if self.town is not None:
            result['town'] = self.town
        if self.road is not None:
            result['road'] = self.road
        if self.road_no is not None:
            result['road_no'] = self.road_no
        if self.address_detail is not None:
            result['address_detail'] = self.address_detail
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('country') is not None:
            self.country = m.get('country')
        if m.get('province') is not None:
            self.province = m.get('province')
        if m.get('city') is not None:
            self.city = m.get('city')
        if m.get('district') is not None:
            self.district = m.get('district')
        if m.get('town') is not None:
            self.town = m.get('town')
        if m.get('road') is not None:
            self.road = m.get('road')
        if m.get('road_no') is not None:
            self.road_no = m.get('road_no')
        if m.get('address_detail') is not None:
            self.address_detail = m.get('address_detail')
        return self


class ScreenshotData(TeaModel):
    def __init__(
        self,
        url: str = None,
        gmt_evidence: int = None,
        file_hash: str = None,
        file_size: int = None,
        tx_hash: str = None,
        block_height: int = None,
        timestamp: int = None,
        tsr: str = None,
        certificate_url: str = None,
        certificate_storage_no: str = None,
        tool_version: str = None,
        screenshot_zip: str = None,
        screenshot_info: ScreenshotInfo = None,
        head_title: str = None,
        zip_tx_hash: str = None,
        error_reason: str = None,
        error_reason_cn: str = None,
        zip_file_hash: str = None,
        main_evidence_name: str = None,
        evidence_order_num: str = None,
        gmt_evidence_start: int = None,
    ):
        # 取证地址
        self.url = url
        # 网页取证时间
        self.gmt_evidence = gmt_evidence
        # 网页取证文件Hash值
        self.file_hash = file_hash
        # 网页取证文件大小
        self.file_size = file_size
        # 统一证据编号
        self.tx_hash = tx_hash
        # 网页取证文件存证块高
        self.block_height = block_height
        # 网页取证文件上链时间
        self.timestamp = timestamp
        # 可信时间戳的返回对象
        self.tsr = tsr
        # 网页截图文件公证处证书下载链接
        self.certificate_url = certificate_url
        # 公证处证书编号
        self.certificate_storage_no = certificate_storage_no
        # 网页取证工具软件版本号
        self.tool_version = tool_version
        # 证据包下载地址（状态为SUCCESS 才有数据）
        self.screenshot_zip = screenshot_zip
        # 取证文件信息
        self.screenshot_info = screenshot_info
        # 网页title
        self.head_title = head_title
        # 证据包交易hash
        self.zip_tx_hash = zip_tx_hash
        # 网页取证失败原因
        self.error_reason = error_reason
        # 中文失败原因
        self.error_reason_cn = error_reason_cn
        # 证据包文件hash
        self.zip_file_hash = zip_file_hash
        # 核心证据文件名称
        self.main_evidence_name = main_evidence_name
        # 取证申请单号
        self.evidence_order_num = evidence_order_num
        # 取证开始时间
        self.gmt_evidence_start = gmt_evidence_start

    def validate(self):
        self.validate_required(self.url, 'url')
        if self.screenshot_info:
            self.screenshot_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.url is not None:
            result['url'] = self.url
        if self.gmt_evidence is not None:
            result['gmt_evidence'] = self.gmt_evidence
        if self.file_hash is not None:
            result['file_hash'] = self.file_hash
        if self.file_size is not None:
            result['file_size'] = self.file_size
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_height is not None:
            result['block_height'] = self.block_height
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.tsr is not None:
            result['tsr'] = self.tsr
        if self.certificate_url is not None:
            result['certificate_url'] = self.certificate_url
        if self.certificate_storage_no is not None:
            result['certificate_storage_no'] = self.certificate_storage_no
        if self.tool_version is not None:
            result['tool_version'] = self.tool_version
        if self.screenshot_zip is not None:
            result['screenshot_zip'] = self.screenshot_zip
        if self.screenshot_info is not None:
            result['screenshot_info'] = self.screenshot_info.to_map()
        if self.head_title is not None:
            result['head_title'] = self.head_title
        if self.zip_tx_hash is not None:
            result['zip_tx_hash'] = self.zip_tx_hash
        if self.error_reason is not None:
            result['error_reason'] = self.error_reason
        if self.error_reason_cn is not None:
            result['error_reason_cn'] = self.error_reason_cn
        if self.zip_file_hash is not None:
            result['zip_file_hash'] = self.zip_file_hash
        if self.main_evidence_name is not None:
            result['main_evidence_name'] = self.main_evidence_name
        if self.evidence_order_num is not None:
            result['evidence_order_num'] = self.evidence_order_num
        if self.gmt_evidence_start is not None:
            result['gmt_evidence_start'] = self.gmt_evidence_start
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('gmt_evidence') is not None:
            self.gmt_evidence = m.get('gmt_evidence')
        if m.get('file_hash') is not None:
            self.file_hash = m.get('file_hash')
        if m.get('file_size') is not None:
            self.file_size = m.get('file_size')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('tsr') is not None:
            self.tsr = m.get('tsr')
        if m.get('certificate_url') is not None:
            self.certificate_url = m.get('certificate_url')
        if m.get('certificate_storage_no') is not None:
            self.certificate_storage_no = m.get('certificate_storage_no')
        if m.get('tool_version') is not None:
            self.tool_version = m.get('tool_version')
        if m.get('screenshot_zip') is not None:
            self.screenshot_zip = m.get('screenshot_zip')
        if m.get('screenshot_info') is not None:
            temp_model = ScreenshotInfo()
            self.screenshot_info = temp_model.from_map(m['screenshot_info'])
        if m.get('head_title') is not None:
            self.head_title = m.get('head_title')
        if m.get('zip_tx_hash') is not None:
            self.zip_tx_hash = m.get('zip_tx_hash')
        if m.get('error_reason') is not None:
            self.error_reason = m.get('error_reason')
        if m.get('error_reason_cn') is not None:
            self.error_reason_cn = m.get('error_reason_cn')
        if m.get('zip_file_hash') is not None:
            self.zip_file_hash = m.get('zip_file_hash')
        if m.get('main_evidence_name') is not None:
            self.main_evidence_name = m.get('main_evidence_name')
        if m.get('evidence_order_num') is not None:
            self.evidence_order_num = m.get('evidence_order_num')
        if m.get('gmt_evidence_start') is not None:
            self.gmt_evidence_start = m.get('gmt_evidence_start')
        return self


class MonitorProviderType(TeaModel):
    def __init__(
        self,
        file_type: str = None,
        submit_type: str = None,
        file_format: str = None,
        monitor_providers: List[MonitorProviderCapability] = None,
    ):
        # 监测文件类型
        self.file_type = file_type
        # 提交类型
        self.submit_type = submit_type
        # 文件格式
        self.file_format = file_format
        # 支持的服务商列表，已排序
        self.monitor_providers = monitor_providers

    def validate(self):
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.submit_type, 'submit_type')
        self.validate_required(self.monitor_providers, 'monitor_providers')
        if self.monitor_providers:
            for k in self.monitor_providers:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.submit_type is not None:
            result['submit_type'] = self.submit_type
        if self.file_format is not None:
            result['file_format'] = self.file_format
        result['monitor_providers'] = []
        if self.monitor_providers is not None:
            for k in self.monitor_providers:
                result['monitor_providers'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('submit_type') is not None:
            self.submit_type = m.get('submit_type')
        if m.get('file_format') is not None:
            self.file_format = m.get('file_format')
        self.monitor_providers = []
        if m.get('monitor_providers') is not None:
            for k in m.get('monitor_providers'):
                temp_model = MonitorProviderCapability()
                self.monitor_providers.append(temp_model.from_map(k))
        return self


class EnterpriseLegalPersonInfo(TeaModel):
    def __init__(
        self,
        legal_person_cert_name: str = None,
        legal_person_cert_type: str = None,
        legal_person_cert_no: str = None,
    ):
        # 法人姓名
        self.legal_person_cert_name = legal_person_cert_name
        # 法人证件类型
        self.legal_person_cert_type = legal_person_cert_type
        # 法人证件号
        self.legal_person_cert_no = legal_person_cert_no

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.legal_person_cert_name is not None:
            result['legal_person_cert_name'] = self.legal_person_cert_name
        if self.legal_person_cert_type is not None:
            result['legal_person_cert_type'] = self.legal_person_cert_type
        if self.legal_person_cert_no is not None:
            result['legal_person_cert_no'] = self.legal_person_cert_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('legal_person_cert_name') is not None:
            self.legal_person_cert_name = m.get('legal_person_cert_name')
        if m.get('legal_person_cert_type') is not None:
            self.legal_person_cert_type = m.get('legal_person_cert_type')
        if m.get('legal_person_cert_no') is not None:
            self.legal_person_cert_no = m.get('legal_person_cert_no')
        return self


class ScreenshotResult(TeaModel):
    def __init__(
        self,
        screenshot_file_url: str = None,
        screenshot_id: str = None,
        screenshot_type: str = None,
        status: str = None,
        error_code: str = None,
        error_message: str = None,
        screenshot_name: str = None,
    ):
        # 截图文件下载链接
        self.screenshot_file_url = screenshot_file_url
        # 网页截取编号
        self.screenshot_id = screenshot_id
        # 取证类型(SCREENSHOT: 网页截图)
        self.screenshot_type = screenshot_type
        # 取证状态
        self.status = status
        # 错误码
        self.error_code = error_code
        # 错误信息
        self.error_message = error_message
        # 网页截取名称
        self.screenshot_name = screenshot_name

    def validate(self):
        self.validate_required(self.screenshot_file_url, 'screenshot_file_url')
        self.validate_required(self.screenshot_id, 'screenshot_id')
        self.validate_required(self.screenshot_type, 'screenshot_type')
        self.validate_required(self.status, 'status')
        self.validate_required(self.screenshot_name, 'screenshot_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.screenshot_file_url is not None:
            result['screenshot_file_url'] = self.screenshot_file_url
        if self.screenshot_id is not None:
            result['screenshot_id'] = self.screenshot_id
        if self.screenshot_type is not None:
            result['screenshot_type'] = self.screenshot_type
        if self.status is not None:
            result['status'] = self.status
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.screenshot_name is not None:
            result['screenshot_name'] = self.screenshot_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('screenshot_file_url') is not None:
            self.screenshot_file_url = m.get('screenshot_file_url')
        if m.get('screenshot_id') is not None:
            self.screenshot_id = m.get('screenshot_id')
        if m.get('screenshot_type') is not None:
            self.screenshot_type = m.get('screenshot_type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('screenshot_name') is not None:
            self.screenshot_name = m.get('screenshot_name')
        return self


class EvidenceResult(TeaModel):
    def __init__(
        self,
        evidence_id: str = None,
        evidence_type: str = None,
        notary_office: str = None,
        evidence_url: EvidenceWebUrlInfo = None,
        evidence_result_url: str = None,
        certificate_info: EvidenceCertificateInfo = None,
        evidence_start_time: int = None,
        status: str = None,
        code: str = None,
        message: str = None,
    ):
        # 取证编号
        self.evidence_id = evidence_id
        # 取证类型（LIVE：直播，VOD：点播）
        self.evidence_type = evidence_type
        # 公证处code
        self.notary_office = notary_office
        # 取证站点url信息
        self.evidence_url = evidence_url
        # 取证结果文件下载url（有效期3天）
        self.evidence_result_url = evidence_result_url
        # 存证证明信息
        self.certificate_info = certificate_info
        # 取证开始时间戳
        self.evidence_start_time = evidence_start_time
        # 取证状态(SUCCESS:成功, FAIL:取证失败)
        self.status = status
        # 处理结果码
        self.code = code
        # 处理结果信息
        self.message = message

    def validate(self):
        self.validate_required(self.evidence_id, 'evidence_id')
        self.validate_required(self.evidence_type, 'evidence_type')
        self.validate_required(self.notary_office, 'notary_office')
        self.validate_required(self.evidence_url, 'evidence_url')
        if self.evidence_url:
            self.evidence_url.validate()
        self.validate_required(self.evidence_result_url, 'evidence_result_url')
        self.validate_required(self.certificate_info, 'certificate_info')
        if self.certificate_info:
            self.certificate_info.validate()
        self.validate_required(self.evidence_start_time, 'evidence_start_time')
        self.validate_required(self.status, 'status')
        self.validate_required(self.message, 'message')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        if self.evidence_type is not None:
            result['evidence_type'] = self.evidence_type
        if self.notary_office is not None:
            result['notary_office'] = self.notary_office
        if self.evidence_url is not None:
            result['evidence_url'] = self.evidence_url.to_map()
        if self.evidence_result_url is not None:
            result['evidence_result_url'] = self.evidence_result_url
        if self.certificate_info is not None:
            result['certificate_info'] = self.certificate_info.to_map()
        if self.evidence_start_time is not None:
            result['evidence_start_time'] = self.evidence_start_time
        if self.status is not None:
            result['status'] = self.status
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        if m.get('evidence_type') is not None:
            self.evidence_type = m.get('evidence_type')
        if m.get('notary_office') is not None:
            self.notary_office = m.get('notary_office')
        if m.get('evidence_url') is not None:
            temp_model = EvidenceWebUrlInfo()
            self.evidence_url = temp_model.from_map(m['evidence_url'])
        if m.get('evidence_result_url') is not None:
            self.evidence_result_url = m.get('evidence_result_url')
        if m.get('certificate_info') is not None:
            temp_model = EvidenceCertificateInfo()
            self.certificate_info = temp_model.from_map(m['certificate_info'])
        if m.get('evidence_start_time') is not None:
            self.evidence_start_time = m.get('evidence_start_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class AdditionalFileInfo(TeaModel):
    def __init__(
        self,
        content_summary_file_id: str = None,
        ownership_file_ids: List[str] = None,
        portrait_auth_file_id: str = None,
        others_work_auth_file_id: str = None,
        other_file_id_list: List[str] = None,
        font_authorize_file_id: str = None,
    ):
        # 内容梗概文件fileId
        self.content_summary_file_id = content_summary_file_id
        # 权利归属证明文件
        self.ownership_file_ids = ownership_file_ids
        # 肖像权授权文件fileId
        self.portrait_auth_file_id = portrait_auth_file_id
        # 他人作品授权文件fileId
        self.others_work_auth_file_id = others_work_auth_file_id
        # 其他文件fileId列表
        self.other_file_id_list = other_file_id_list
        # 商用授权字体授权文件fileId
        self.font_authorize_file_id = font_authorize_file_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.content_summary_file_id is not None:
            result['content_summary_file_id'] = self.content_summary_file_id
        if self.ownership_file_ids is not None:
            result['ownership_file_ids'] = self.ownership_file_ids
        if self.portrait_auth_file_id is not None:
            result['portrait_auth_file_id'] = self.portrait_auth_file_id
        if self.others_work_auth_file_id is not None:
            result['others_work_auth_file_id'] = self.others_work_auth_file_id
        if self.other_file_id_list is not None:
            result['other_file_id_list'] = self.other_file_id_list
        if self.font_authorize_file_id is not None:
            result['font_authorize_file_id'] = self.font_authorize_file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('content_summary_file_id') is not None:
            self.content_summary_file_id = m.get('content_summary_file_id')
        if m.get('ownership_file_ids') is not None:
            self.ownership_file_ids = m.get('ownership_file_ids')
        if m.get('portrait_auth_file_id') is not None:
            self.portrait_auth_file_id = m.get('portrait_auth_file_id')
        if m.get('others_work_auth_file_id') is not None:
            self.others_work_auth_file_id = m.get('others_work_auth_file_id')
        if m.get('other_file_id_list') is not None:
            self.other_file_id_list = m.get('other_file_id_list')
        if m.get('font_authorize_file_id') is not None:
            self.font_authorize_file_id = m.get('font_authorize_file_id')
        return self


class AuthInfo(TeaModel):
    def __init__(
        self,
        right_code: str = None,
        region_code: str = None,
        usage_code: str = None,
        terminal_code: str = None,
        media_code: str = None,
        right_item_character: str = None,
        transfer_status: str = None,
    ):
        # 授权权利项
        self.right_code = right_code
        # 许可地域，默认中国境内，不包括香港等
        self.region_code = region_code
        # 许可方式
        self.usage_code = usage_code
        # 许可终端
        self.terminal_code = terminal_code
        # 传播媒介，默认互联网
        self.media_code = media_code
        # 是否独占,默认 普通专有 GENERAL
        self.right_item_character = right_item_character
        # 是否可转让,默认不可转让
        self.transfer_status = transfer_status

    def validate(self):
        self.validate_required(self.right_code, 'right_code')
        self.validate_required(self.usage_code, 'usage_code')
        self.validate_required(self.terminal_code, 'terminal_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.right_code is not None:
            result['right_code'] = self.right_code
        if self.region_code is not None:
            result['region_code'] = self.region_code
        if self.usage_code is not None:
            result['usage_code'] = self.usage_code
        if self.terminal_code is not None:
            result['terminal_code'] = self.terminal_code
        if self.media_code is not None:
            result['media_code'] = self.media_code
        if self.right_item_character is not None:
            result['right_item_character'] = self.right_item_character
        if self.transfer_status is not None:
            result['transfer_status'] = self.transfer_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('right_code') is not None:
            self.right_code = m.get('right_code')
        if m.get('region_code') is not None:
            self.region_code = m.get('region_code')
        if m.get('usage_code') is not None:
            self.usage_code = m.get('usage_code')
        if m.get('terminal_code') is not None:
            self.terminal_code = m.get('terminal_code')
        if m.get('media_code') is not None:
            self.media_code = m.get('media_code')
        if m.get('right_item_character') is not None:
            self.right_item_character = m.get('right_item_character')
        if m.get('transfer_status') is not None:
            self.transfer_status = m.get('transfer_status')
        return self


class ScreenCancelInfo(TeaModel):
    def __init__(
        self,
        cancel_in_min: int = None,
        cancel_attempt_left: int = None,
    ):
        # 允许放弃时长（分钟）
        self.cancel_in_min = cancel_in_min
        # 可用放弃次数
        self.cancel_attempt_left = cancel_attempt_left

    def validate(self):
        self.validate_required(self.cancel_in_min, 'cancel_in_min')
        self.validate_required(self.cancel_attempt_left, 'cancel_attempt_left')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cancel_in_min is not None:
            result['cancel_in_min'] = self.cancel_in_min
        if self.cancel_attempt_left is not None:
            result['cancel_attempt_left'] = self.cancel_attempt_left
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cancel_in_min') is not None:
            self.cancel_in_min = m.get('cancel_in_min')
        if m.get('cancel_attempt_left') is not None:
            self.cancel_attempt_left = m.get('cancel_attempt_left')
        return self


class ContactInfo(TeaModel):
    def __init__(
        self,
        contact_name: str = None,
        contact_phone: str = None,
    ):
        # 联系人
        self.contact_name = contact_name
        # 联系电话
        self.contact_phone = contact_phone

    def validate(self):
        self.validate_required(self.contact_name, 'contact_name')
        self.validate_required(self.contact_phone, 'contact_phone')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.contact_name is not None:
            result['contact_name'] = self.contact_name
        if self.contact_phone is not None:
            result['contact_phone'] = self.contact_phone
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('contact_name') is not None:
            self.contact_name = m.get('contact_name')
        if m.get('contact_phone') is not None:
            self.contact_phone = m.get('contact_phone')
        return self


class CertificateData(TeaModel):
    def __init__(
        self,
        task_id: str = None,
        user_id: str = None,
        dci_code: str = None,
        certificate_url: str = None,
    ):
        # 任务ID
        self.task_id = task_id
        # 版权用户UID
        self.user_id = user_id
        # DCI码
        self.dci_code = dci_code
        # 证书下载的链接地址
        self.certificate_url = certificate_url

    def validate(self):
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.dci_code, 'dci_code')
        self.validate_required(self.certificate_url, 'certificate_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.dci_code is not None:
            result['dci_code'] = self.dci_code
        if self.certificate_url is not None:
            result['certificate_url'] = self.certificate_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('dci_code') is not None:
            self.dci_code = m.get('dci_code')
        if m.get('certificate_url') is not None:
            self.certificate_url = m.get('certificate_url')
        return self


class ProxyData(TeaModel):
    def __init__(
        self,
        tenant_id: str = None,
        tenant_name: str = None,
        if_measure: bool = None,
    ):
        # 金融云租户id
        self.tenant_id = tenant_id
        # 租户名称
        self.tenant_name = tenant_name
        # 是否计量
        self.if_measure = if_measure

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.tenant_name, 'tenant_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.if_measure is not None:
            result['if_measure'] = self.if_measure
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('if_measure') is not None:
            self.if_measure = m.get('if_measure')
        return self


class NotaryApplyInfo(TeaModel):
    def __init__(
        self,
        org_id: str = None,
        evid_infos: List[EvidInfo] = None,
        bid_reason: BidReason = None,
        applicant_infos: List[NotaryUser] = None,
        operator_info: NotaryUser = None,
        warrant_file_list: List[str] = None,
        testify_file_list: List[str] = None,
        preservation_content: str = None,
        comments: str = None,
    ):
        # 公证处ID
        self.org_id = org_id
        # 取证人和取证信息列表
        self.evid_infos = evid_infos
        # 申办事由
        self.bid_reason = bid_reason
        # 申请人信息
        self.applicant_infos = applicant_infos
        # 经办人信息
        self.operator_info = operator_info
        # 授权书
        self.warrant_file_list = warrant_file_list
        # 权利证明材料
        self.testify_file_list = testify_file_list
        # 保全内容
        self.preservation_content = preservation_content
        # 用户申办备注
        self.comments = comments

    def validate(self):
        self.validate_required(self.org_id, 'org_id')
        self.validate_required(self.evid_infos, 'evid_infos')
        if self.evid_infos:
            for k in self.evid_infos:
                if k:
                    k.validate()
        self.validate_required(self.bid_reason, 'bid_reason')
        if self.bid_reason:
            self.bid_reason.validate()
        self.validate_required(self.applicant_infos, 'applicant_infos')
        if self.applicant_infos:
            for k in self.applicant_infos:
                if k:
                    k.validate()
        self.validate_required(self.operator_info, 'operator_info')
        if self.operator_info:
            self.operator_info.validate()
        self.validate_required(self.warrant_file_list, 'warrant_file_list')
        self.validate_required(self.testify_file_list, 'testify_file_list')
        self.validate_required(self.preservation_content, 'preservation_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.org_id is not None:
            result['org_id'] = self.org_id
        result['evid_infos'] = []
        if self.evid_infos is not None:
            for k in self.evid_infos:
                result['evid_infos'].append(k.to_map() if k else None)
        if self.bid_reason is not None:
            result['bid_reason'] = self.bid_reason.to_map()
        result['applicant_infos'] = []
        if self.applicant_infos is not None:
            for k in self.applicant_infos:
                result['applicant_infos'].append(k.to_map() if k else None)
        if self.operator_info is not None:
            result['operator_info'] = self.operator_info.to_map()
        if self.warrant_file_list is not None:
            result['warrant_file_list'] = self.warrant_file_list
        if self.testify_file_list is not None:
            result['testify_file_list'] = self.testify_file_list
        if self.preservation_content is not None:
            result['preservation_content'] = self.preservation_content
        if self.comments is not None:
            result['comments'] = self.comments
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        self.evid_infos = []
        if m.get('evid_infos') is not None:
            for k in m.get('evid_infos'):
                temp_model = EvidInfo()
                self.evid_infos.append(temp_model.from_map(k))
        if m.get('bid_reason') is not None:
            temp_model = BidReason()
            self.bid_reason = temp_model.from_map(m['bid_reason'])
        self.applicant_infos = []
        if m.get('applicant_infos') is not None:
            for k in m.get('applicant_infos'):
                temp_model = NotaryUser()
                self.applicant_infos.append(temp_model.from_map(k))
        if m.get('operator_info') is not None:
            temp_model = NotaryUser()
            self.operator_info = temp_model.from_map(m['operator_info'])
        if m.get('warrant_file_list') is not None:
            self.warrant_file_list = m.get('warrant_file_list')
        if m.get('testify_file_list') is not None:
            self.testify_file_list = m.get('testify_file_list')
        if m.get('preservation_content') is not None:
            self.preservation_content = m.get('preservation_content')
        if m.get('comments') is not None:
            self.comments = m.get('comments')
        return self


class VerifyEvidenceData(TeaModel):
    def __init__(
        self,
        process_log_tx_hash: str = None,
        check_log_tx_hash: str = None,
    ):
        # 操作日志交易HASH
        self.process_log_tx_hash = process_log_tx_hash
        # 自清洁日志交易HASH
        self.check_log_tx_hash = check_log_tx_hash

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.process_log_tx_hash is not None:
            result['process_log_tx_hash'] = self.process_log_tx_hash
        if self.check_log_tx_hash is not None:
            result['check_log_tx_hash'] = self.check_log_tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('process_log_tx_hash') is not None:
            self.process_log_tx_hash = m.get('process_log_tx_hash')
        if m.get('check_log_tx_hash') is not None:
            self.check_log_tx_hash = m.get('check_log_tx_hash')
        return self


class SignDocument(TeaModel):
    def __init__(
        self,
        sign_file: str = None,
        expire_time: int = None,
        sign_file_name: str = None,
        sign_file_desc: str = None,
        sign_file_hash: str = None,
        sign_file_type: str = None,
    ):
        # 签署文件
        self.sign_file = sign_file
        # 到期时间戳
        self.expire_time = expire_time
        # 签署文件名
        self.sign_file_name = sign_file_name
        # 签署文件描述
        self.sign_file_desc = sign_file_desc
        # 签署文件哈希
        self.sign_file_hash = sign_file_hash
        # 签署文件类型
        self.sign_file_type = sign_file_type

    def validate(self):
        self.validate_required(self.sign_file, 'sign_file')
        self.validate_required(self.expire_time, 'expire_time')
        self.validate_required(self.sign_file_name, 'sign_file_name')
        self.validate_required(self.sign_file_desc, 'sign_file_desc')
        self.validate_required(self.sign_file_hash, 'sign_file_hash')
        self.validate_required(self.sign_file_type, 'sign_file_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sign_file is not None:
            result['sign_file'] = self.sign_file
        if self.expire_time is not None:
            result['expire_time'] = self.expire_time
        if self.sign_file_name is not None:
            result['sign_file_name'] = self.sign_file_name
        if self.sign_file_desc is not None:
            result['sign_file_desc'] = self.sign_file_desc
        if self.sign_file_hash is not None:
            result['sign_file_hash'] = self.sign_file_hash
        if self.sign_file_type is not None:
            result['sign_file_type'] = self.sign_file_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sign_file') is not None:
            self.sign_file = m.get('sign_file')
        if m.get('expire_time') is not None:
            self.expire_time = m.get('expire_time')
        if m.get('sign_file_name') is not None:
            self.sign_file_name = m.get('sign_file_name')
        if m.get('sign_file_desc') is not None:
            self.sign_file_desc = m.get('sign_file_desc')
        if m.get('sign_file_hash') is not None:
            self.sign_file_hash = m.get('sign_file_hash')
        if m.get('sign_file_type') is not None:
            self.sign_file_type = m.get('sign_file_type')
        return self


class SaleData(TeaModel):
    def __init__(
        self,
        sale_digiest_data: SaleDigestData = None,
    ):
        # 摘要数据
        self.sale_digiest_data = sale_digiest_data

    def validate(self):
        self.validate_required(self.sale_digiest_data, 'sale_digiest_data')
        if self.sale_digiest_data:
            self.sale_digiest_data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sale_digiest_data is not None:
            result['sale_digiest_data'] = self.sale_digiest_data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sale_digiest_data') is not None:
            temp_model = SaleDigestData()
            self.sale_digiest_data = temp_model.from_map(m['sale_digiest_data'])
        return self


class GoodsInfo(TeaModel):
    def __init__(
        self,
        goods_id: str = None,
        goods_name: str = None,
        goods_status: str = None,
        classification: str = None,
        total_sold_num: int = None,
        standard_price_in_cent: int = None,
        title: str = None,
        auth_start_time: int = None,
        auth_end_time: int = None,
        publish_time: int = None,
    ):
        # 商品id
        self.goods_id = goods_id
        # 商品名称
        self.goods_name = goods_name
        # 商品状态
        self.goods_status = goods_status
        # 商品分类
        self.classification = classification
        # 售卖数量
        self.total_sold_num = total_sold_num
        # 售价（分）
        self.standard_price_in_cent = standard_price_in_cent
        # 商品标题
        self.title = title
        # 授权期限起始时间
        self.auth_start_time = auth_start_time
        # 授权期限结束时间
        self.auth_end_time = auth_end_time
        # 发布时间
        self.publish_time = publish_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.goods_id is not None:
            result['goods_id'] = self.goods_id
        if self.goods_name is not None:
            result['goods_name'] = self.goods_name
        if self.goods_status is not None:
            result['goods_status'] = self.goods_status
        if self.classification is not None:
            result['classification'] = self.classification
        if self.total_sold_num is not None:
            result['total_sold_num'] = self.total_sold_num
        if self.standard_price_in_cent is not None:
            result['standard_price_in_cent'] = self.standard_price_in_cent
        if self.title is not None:
            result['title'] = self.title
        if self.auth_start_time is not None:
            result['auth_start_time'] = self.auth_start_time
        if self.auth_end_time is not None:
            result['auth_end_time'] = self.auth_end_time
        if self.publish_time is not None:
            result['publish_time'] = self.publish_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('goods_id') is not None:
            self.goods_id = m.get('goods_id')
        if m.get('goods_name') is not None:
            self.goods_name = m.get('goods_name')
        if m.get('goods_status') is not None:
            self.goods_status = m.get('goods_status')
        if m.get('classification') is not None:
            self.classification = m.get('classification')
        if m.get('total_sold_num') is not None:
            self.total_sold_num = m.get('total_sold_num')
        if m.get('standard_price_in_cent') is not None:
            self.standard_price_in_cent = m.get('standard_price_in_cent')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('auth_start_time') is not None:
            self.auth_start_time = m.get('auth_start_time')
        if m.get('auth_end_time') is not None:
            self.auth_end_time = m.get('auth_end_time')
        if m.get('publish_time') is not None:
            self.publish_time = m.get('publish_time')
        return self


class ReviewData(TeaModel):
    def __init__(
        self,
        title_risk_data: List[ContentRiskData] = None,
        content_risk_data: List[ContentRiskData] = None,
        resemble_risk_data: List[ResembleRiskData] = None,
        label_risk_data: List[LabelRiskData] = None,
    ):
        # 作品名称安全识别结果
        self.title_risk_data = title_risk_data
        # 内容安全识别结果
        self.content_risk_data = content_risk_data
        # 作品相似识别结果
        self.resemble_risk_data = resemble_risk_data
        # 作品标签识别结果
        self.label_risk_data = label_risk_data

    def validate(self):
        if self.title_risk_data:
            for k in self.title_risk_data:
                if k:
                    k.validate()
        if self.content_risk_data:
            for k in self.content_risk_data:
                if k:
                    k.validate()
        if self.resemble_risk_data:
            for k in self.resemble_risk_data:
                if k:
                    k.validate()
        if self.label_risk_data:
            for k in self.label_risk_data:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['title_risk_data'] = []
        if self.title_risk_data is not None:
            for k in self.title_risk_data:
                result['title_risk_data'].append(k.to_map() if k else None)
        result['content_risk_data'] = []
        if self.content_risk_data is not None:
            for k in self.content_risk_data:
                result['content_risk_data'].append(k.to_map() if k else None)
        result['resemble_risk_data'] = []
        if self.resemble_risk_data is not None:
            for k in self.resemble_risk_data:
                result['resemble_risk_data'].append(k.to_map() if k else None)
        result['label_risk_data'] = []
        if self.label_risk_data is not None:
            for k in self.label_risk_data:
                result['label_risk_data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.title_risk_data = []
        if m.get('title_risk_data') is not None:
            for k in m.get('title_risk_data'):
                temp_model = ContentRiskData()
                self.title_risk_data.append(temp_model.from_map(k))
        self.content_risk_data = []
        if m.get('content_risk_data') is not None:
            for k in m.get('content_risk_data'):
                temp_model = ContentRiskData()
                self.content_risk_data.append(temp_model.from_map(k))
        self.resemble_risk_data = []
        if m.get('resemble_risk_data') is not None:
            for k in m.get('resemble_risk_data'):
                temp_model = ResembleRiskData()
                self.resemble_risk_data.append(temp_model.from_map(k))
        self.label_risk_data = []
        if m.get('label_risk_data') is not None:
            for k in m.get('label_risk_data'):
                temp_model = LabelRiskData()
                self.label_risk_data.append(temp_model.from_map(k))
        return self


class NotaryInfo(TeaModel):
    def __init__(
        self,
        notarial_deed_no: str = None,
        notary_paper_path: str = None,
        notary_time: str = None,
    ):
        # 公证书编号
        self.notarial_deed_no = notarial_deed_no
        # 电子公证书文件路径
        self.notary_paper_path = notary_paper_path
        # 公证书出证日期（yyyy-MM-dd）
        self.notary_time = notary_time

    def validate(self):
        self.validate_required(self.notarial_deed_no, 'notarial_deed_no')
        self.validate_required(self.notary_paper_path, 'notary_paper_path')
        self.validate_required(self.notary_time, 'notary_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.notarial_deed_no is not None:
            result['notarial_deed_no'] = self.notarial_deed_no
        if self.notary_paper_path is not None:
            result['notary_paper_path'] = self.notary_paper_path
        if self.notary_time is not None:
            result['notary_time'] = self.notary_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('notarial_deed_no') is not None:
            self.notarial_deed_no = m.get('notarial_deed_no')
        if m.get('notary_paper_path') is not None:
            self.notary_paper_path = m.get('notary_paper_path')
        if m.get('notary_time') is not None:
            self.notary_time = m.get('notary_time')
        return self


class DciExplanationInfo(TeaModel):
    def __init__(
        self,
        creation_purpose: str = None,
        creation_process: str = None,
        originality: str = None,
        font_copyright: str = None,
        font_types: List[str] = None,
    ):
        # 创作目的，描述作品创作的目的
        self.creation_purpose = creation_purpose
        # 创作过程，具体的创作过程
        self.creation_process = creation_process
        # 阐述作品的独创性
        self.originality = originality
        # 创作过程涉及到字体使用相关版权说明
        self.font_copyright = font_copyright
        # 创作过程涉及到字体使用相关版权说明
        # 
        self.font_types = font_types

    def validate(self):
        self.validate_required(self.creation_purpose, 'creation_purpose')
        self.validate_required(self.creation_process, 'creation_process')
        self.validate_required(self.originality, 'originality')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.creation_purpose is not None:
            result['creation_purpose'] = self.creation_purpose
        if self.creation_process is not None:
            result['creation_process'] = self.creation_process
        if self.originality is not None:
            result['originality'] = self.originality
        if self.font_copyright is not None:
            result['font_copyright'] = self.font_copyright
        if self.font_types is not None:
            result['font_types'] = self.font_types
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('creation_purpose') is not None:
            self.creation_purpose = m.get('creation_purpose')
        if m.get('creation_process') is not None:
            self.creation_process = m.get('creation_process')
        if m.get('originality') is not None:
            self.originality = m.get('originality')
        if m.get('font_copyright') is not None:
            self.font_copyright = m.get('font_copyright')
        if m.get('font_types') is not None:
            self.font_types = m.get('font_types')
        return self


class MonitorType(TeaModel):
    def __init__(
        self,
        file_type: str = None,
        submit_type: str = None,
    ):
        # 文件类型
        self.file_type = file_type
        # 提交类型
        self.submit_type = submit_type

    def validate(self):
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.submit_type, 'submit_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.submit_type is not None:
            result['submit_type'] = self.submit_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('submit_type') is not None:
            self.submit_type = m.get('submit_type')
        return self


class GetUploadurlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_name: str = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件名称
        self.file_name = file_name
        # 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.file_name, 'file_name')
        if self.file_name is not None:
            self.validate_max_length(self.file_name, 'file_name', 128)
        if self.client_token is not None:
            self.validate_max_length(self.client_token, 'client_token', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class GetUploadurlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        url: str = None,
        file_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权访问oss链接
        self.url = url
        # OSS 文件id
        self.file_id = file_id

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
        if self.url is not None:
            result['url'] = self.url
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class AddHashregisterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        hash: str = None,
        length: int = None,
        hash_type: str = None,
        type: str = None,
        name: str = None,
        memo: str = None,
        cert_name: str = None,
        cert_no: str = None,
        cert_type: str = None,
        create_certificate: bool = None,
        certificate_type: str = None,
        create_package: bool = None,
        org_id: str = None,
        phone_num: str = None,
        works_info: WorksInfo = None,
        create_statement: bool = None,
        rights_info: RightsInfo = None,
        manager_name: str = None,
        manager_no: str = None,
        ancillary_evidence: List[str] = None,
        copyright_owner_info: CopyrightCertInfo = None,
        client_token: str = None,
        feature_file_id: str = None,
        proxy_info: ProxyData = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件SHA256 hash
        self.hash = hash
        # 文件大小
        self.length = length
        # hash算法
        self.hash_type = hash_type
        # 文件类型
        self.type = type
        # 文件名称
        self.name = name
        # 备注
        self.memo = memo
        # 证件名称
        self.cert_name = cert_name
        # 证件号码
        self.cert_no = cert_no
        # 证件类型
        self.cert_type = cert_type
        # 是否自动创建公证保管函
        self.create_certificate = create_certificate
        # 证书类型
        self.certificate_type = certificate_type
        # 是否创建证据包，默认否
        self.create_package = create_package
        # 
        # 公证处Id
        self.org_id = org_id
        # 电话号码
        self.phone_num = phone_num
        # 作品信息
        self.works_info = works_info
        # 是否创建权利声明书（默认否，选是需要rightsInfo传递对应信息）
        self.create_statement = create_statement
        # 权利信息
        self.rights_info = rights_info
        # 企业经办人姓名（如果certType为BUSINESS_LICENSE并且createStatement为true则必传）
        self.manager_name = manager_name
        # 企业经办人身份证号（如果certType为BUSINESS_LICENSE并且createStatement为true则必传）
        self.manager_no = manager_no
        # 附属证据信息（最多5个文件，传递的是FileId）
        self.ancillary_evidence = ancillary_evidence
        # 著作权人信息
        self.copyright_owner_info = copyright_owner_info
        # 幂等字段
        self.client_token = client_token
        # 特征文件oss id
        self.feature_file_id = feature_file_id
        # 代理信息
        self.proxy_info = proxy_info

    def validate(self):
        self.validate_required(self.hash, 'hash')
        self.validate_required(self.length, 'length')
        self.validate_required(self.hash_type, 'hash_type')
        self.validate_required(self.type, 'type')
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 128)
        if self.memo is not None:
            self.validate_max_length(self.memo, 'memo', 512)
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_type, 'cert_type')
        if self.works_info:
            self.works_info.validate()
        if self.rights_info:
            self.rights_info.validate()
        if self.manager_name is not None:
            self.validate_max_length(self.manager_name, 'manager_name', 32)
        if self.manager_no is not None:
            self.validate_max_length(self.manager_no, 'manager_no', 30)
        if self.copyright_owner_info:
            self.copyright_owner_info.validate()
        if self.proxy_info:
            self.proxy_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.hash is not None:
            result['hash'] = self.hash
        if self.length is not None:
            result['length'] = self.length
        if self.hash_type is not None:
            result['hash_type'] = self.hash_type
        if self.type is not None:
            result['type'] = self.type
        if self.name is not None:
            result['name'] = self.name
        if self.memo is not None:
            result['memo'] = self.memo
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.create_certificate is not None:
            result['create_certificate'] = self.create_certificate
        if self.certificate_type is not None:
            result['certificate_type'] = self.certificate_type
        if self.create_package is not None:
            result['create_package'] = self.create_package
        if self.org_id is not None:
            result['org_id'] = self.org_id
        if self.phone_num is not None:
            result['phone_num'] = self.phone_num
        if self.works_info is not None:
            result['works_info'] = self.works_info.to_map()
        if self.create_statement is not None:
            result['create_statement'] = self.create_statement
        if self.rights_info is not None:
            result['rights_info'] = self.rights_info.to_map()
        if self.manager_name is not None:
            result['manager_name'] = self.manager_name
        if self.manager_no is not None:
            result['manager_no'] = self.manager_no
        if self.ancillary_evidence is not None:
            result['ancillary_evidence'] = self.ancillary_evidence
        if self.copyright_owner_info is not None:
            result['copyright_owner_info'] = self.copyright_owner_info.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.feature_file_id is not None:
            result['feature_file_id'] = self.feature_file_id
        if self.proxy_info is not None:
            result['proxy_info'] = self.proxy_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('length') is not None:
            self.length = m.get('length')
        if m.get('hash_type') is not None:
            self.hash_type = m.get('hash_type')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('memo') is not None:
            self.memo = m.get('memo')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('create_certificate') is not None:
            self.create_certificate = m.get('create_certificate')
        if m.get('certificate_type') is not None:
            self.certificate_type = m.get('certificate_type')
        if m.get('create_package') is not None:
            self.create_package = m.get('create_package')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        if m.get('phone_num') is not None:
            self.phone_num = m.get('phone_num')
        if m.get('works_info') is not None:
            temp_model = WorksInfo()
            self.works_info = temp_model.from_map(m['works_info'])
        if m.get('create_statement') is not None:
            self.create_statement = m.get('create_statement')
        if m.get('rights_info') is not None:
            temp_model = RightsInfo()
            self.rights_info = temp_model.from_map(m['rights_info'])
        if m.get('manager_name') is not None:
            self.manager_name = m.get('manager_name')
        if m.get('manager_no') is not None:
            self.manager_no = m.get('manager_no')
        if m.get('ancillary_evidence') is not None:
            self.ancillary_evidence = m.get('ancillary_evidence')
        if m.get('copyright_owner_info') is not None:
            temp_model = CopyrightCertInfo()
            self.copyright_owner_info = temp_model.from_map(m['copyright_owner_info'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('feature_file_id') is not None:
            self.feature_file_id = m.get('feature_file_id')
        if m.get('proxy_info') is not None:
            temp_model = ProxyData()
            self.proxy_info = temp_model.from_map(m['proxy_info'])
        return self


class AddHashregisterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        register_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 登记id
        self.register_id = register_id

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
        if self.register_id is not None:
            result['register_id'] = self.register_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('register_id') is not None:
            self.register_id = m.get('register_id')
        return self


class AddRegisterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_id: str = None,
        create_certificate: bool = None,
        certificate_type: str = None,
        create_package: bool = None,
        org_id: str = None,
        name: str = None,
        type: str = None,
        memo: str = None,
        cert_name: str = None,
        cert_no: str = None,
        cert_type: str = None,
        phone_num: str = None,
        works_info: WorksInfo = None,
        create_statement: bool = None,
        manager_name: str = None,
        manager_no: str = None,
        rights_info: RightsInfo = None,
        ancillary_evidence: List[str] = None,
        copyright_owner_info: CopyrightCertInfo = None,
        client_token: str = None,
        sync_info: AccountData = None,
        proxy_info: ProxyData = None,
        channel_terminal: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件oss id
        self.file_id = file_id
        # 是否自动创建公证书,默认否
        self.create_certificate = create_certificate
        # 证书类型
        self.certificate_type = certificate_type
        # 是否创建证据包，默认否
        self.create_package = create_package
        # 公证处id
        self.org_id = org_id
        # 文件名称
        self.name = name
        # 文件类型
        self.type = type
        # 备注
        self.memo = memo
        # 证件名称
        self.cert_name = cert_name
        # 证件号码
        self.cert_no = cert_no
        # 证件类型
        self.cert_type = cert_type
        # 电话号码
        self.phone_num = phone_num
        # 作品信息
        self.works_info = works_info
        # 是否创建权利声明书（默认否，选是需要rightsInfo传递对应信息）
        self.create_statement = create_statement
        # 企业经办人姓名（如果certType为BUSINESS_LICENSE并且createStatement为true则必传）
        self.manager_name = manager_name
        # 企业经办人身份证号（如果certType为BUSINESS_LICENSE并且createStatement为true则必传）
        self.manager_no = manager_no
        # 权利信息
        self.rights_info = rights_info
        # 附属证据信息（最多5个文件，传递的是FileId）
        self.ancillary_evidence = ancillary_evidence
        # 著作权人信息
        self.copyright_owner_info = copyright_owner_info
        # 幂等
        self.client_token = client_token
        # 同步账号信息
        self.sync_info = sync_info
        # 代理信息
        self.proxy_info = proxy_info
        # 渠道标签
        self.channel_terminal = channel_terminal

    def validate(self):
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 128)
        self.validate_required(self.type, 'type')
        if self.memo is not None:
            self.validate_max_length(self.memo, 'memo', 512)
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_type, 'cert_type')
        if self.works_info:
            self.works_info.validate()
        if self.manager_name is not None:
            self.validate_max_length(self.manager_name, 'manager_name', 32)
        if self.manager_no is not None:
            self.validate_max_length(self.manager_no, 'manager_no', 30)
        if self.rights_info:
            self.rights_info.validate()
        if self.copyright_owner_info:
            self.copyright_owner_info.validate()
        if self.sync_info:
            self.sync_info.validate()
        if self.proxy_info:
            self.proxy_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.create_certificate is not None:
            result['create_certificate'] = self.create_certificate
        if self.certificate_type is not None:
            result['certificate_type'] = self.certificate_type
        if self.create_package is not None:
            result['create_package'] = self.create_package
        if self.org_id is not None:
            result['org_id'] = self.org_id
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.memo is not None:
            result['memo'] = self.memo
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.phone_num is not None:
            result['phone_num'] = self.phone_num
        if self.works_info is not None:
            result['works_info'] = self.works_info.to_map()
        if self.create_statement is not None:
            result['create_statement'] = self.create_statement
        if self.manager_name is not None:
            result['manager_name'] = self.manager_name
        if self.manager_no is not None:
            result['manager_no'] = self.manager_no
        if self.rights_info is not None:
            result['rights_info'] = self.rights_info.to_map()
        if self.ancillary_evidence is not None:
            result['ancillary_evidence'] = self.ancillary_evidence
        if self.copyright_owner_info is not None:
            result['copyright_owner_info'] = self.copyright_owner_info.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.sync_info is not None:
            result['sync_info'] = self.sync_info.to_map()
        if self.proxy_info is not None:
            result['proxy_info'] = self.proxy_info.to_map()
        if self.channel_terminal is not None:
            result['channel_terminal'] = self.channel_terminal
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('create_certificate') is not None:
            self.create_certificate = m.get('create_certificate')
        if m.get('certificate_type') is not None:
            self.certificate_type = m.get('certificate_type')
        if m.get('create_package') is not None:
            self.create_package = m.get('create_package')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('memo') is not None:
            self.memo = m.get('memo')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('phone_num') is not None:
            self.phone_num = m.get('phone_num')
        if m.get('works_info') is not None:
            temp_model = WorksInfo()
            self.works_info = temp_model.from_map(m['works_info'])
        if m.get('create_statement') is not None:
            self.create_statement = m.get('create_statement')
        if m.get('manager_name') is not None:
            self.manager_name = m.get('manager_name')
        if m.get('manager_no') is not None:
            self.manager_no = m.get('manager_no')
        if m.get('rights_info') is not None:
            temp_model = RightsInfo()
            self.rights_info = temp_model.from_map(m['rights_info'])
        if m.get('ancillary_evidence') is not None:
            self.ancillary_evidence = m.get('ancillary_evidence')
        if m.get('copyright_owner_info') is not None:
            temp_model = CopyrightCertInfo()
            self.copyright_owner_info = temp_model.from_map(m['copyright_owner_info'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('sync_info') is not None:
            temp_model = AccountData()
            self.sync_info = temp_model.from_map(m['sync_info'])
        if m.get('proxy_info') is not None:
            temp_model = ProxyData()
            self.proxy_info = temp_model.from_map(m['proxy_info'])
        if m.get('channel_terminal') is not None:
            self.channel_terminal = m.get('channel_terminal')
        return self


class AddRegisterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        register_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 登记id
        self.register_id = register_id

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
        if self.register_id is not None:
            result['register_id'] = self.register_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('register_id') is not None:
            self.register_id = m.get('register_id')
        return self


class QueryRegisterstatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        register_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 登记id
        self.register_id = register_id

    def validate(self):
        self.validate_required(self.register_id, 'register_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.register_id is not None:
            result['register_id'] = self.register_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('register_id') is not None:
            self.register_id = m.get('register_id')
        return self


class QueryRegisterstatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
        timestamp: int = None,
        hash: str = None,
        tx_hash: str = None,
        block_height: int = None,
        tsr: str = None,
        certificate_url: str = None,
        certificate_storage_no: str = None,
        certificate_time_url: str = None,
        package_url: str = None,
        package_tx_hash: str = None,
        statement_url: str = None,
        security: SecurityData = None,
        correction_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 登记状态
        self.status = status
        # 存证时间
        self.timestamp = timestamp
        # 文件hash
        self.hash = hash
        # 统一证据编号（存证交易HASH）
        self.tx_hash = tx_hash
        # 存证块高
        self.block_height = block_height
        # tsr信息
        self.tsr = tsr
        # 公证处证书下载链接
        self.certificate_url = certificate_url
        # 公证处证书编号
        self.certificate_storage_no = certificate_storage_no
        # 授时中心证书下载链接
        self.certificate_time_url = certificate_time_url
        # 证据包下载地址（状态为SUCCESS并且请求要求生成证据包才有数据）
        self.package_url = package_url
        # 证据包存证交易HASH  注意只有生成了证据包才会返回
        self.package_tx_hash = package_tx_hash
        # 权利声明书下载地址 注意只有传递了权利信息并且生成了权利声明书才会返回
        self.statement_url = statement_url
        # 安全信息
        self.security = security
        # 保管函url
        self.correction_url = correction_url

    def validate(self):
        if self.security:
            self.security.validate()

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
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.hash is not None:
            result['hash'] = self.hash
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_height is not None:
            result['block_height'] = self.block_height
        if self.tsr is not None:
            result['tsr'] = self.tsr
        if self.certificate_url is not None:
            result['certificate_url'] = self.certificate_url
        if self.certificate_storage_no is not None:
            result['certificate_storage_no'] = self.certificate_storage_no
        if self.certificate_time_url is not None:
            result['certificate_time_url'] = self.certificate_time_url
        if self.package_url is not None:
            result['package_url'] = self.package_url
        if self.package_tx_hash is not None:
            result['package_tx_hash'] = self.package_tx_hash
        if self.statement_url is not None:
            result['statement_url'] = self.statement_url
        if self.security is not None:
            result['security'] = self.security.to_map()
        if self.correction_url is not None:
            result['correction_url'] = self.correction_url
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
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        if m.get('tsr') is not None:
            self.tsr = m.get('tsr')
        if m.get('certificate_url') is not None:
            self.certificate_url = m.get('certificate_url')
        if m.get('certificate_storage_no') is not None:
            self.certificate_storage_no = m.get('certificate_storage_no')
        if m.get('certificate_time_url') is not None:
            self.certificate_time_url = m.get('certificate_time_url')
        if m.get('package_url') is not None:
            self.package_url = m.get('package_url')
        if m.get('package_tx_hash') is not None:
            self.package_tx_hash = m.get('package_tx_hash')
        if m.get('statement_url') is not None:
            self.statement_url = m.get('statement_url')
        if m.get('security') is not None:
            temp_model = SecurityData()
            self.security = temp_model.from_map(m['security'])
        if m.get('correction_url') is not None:
            self.correction_url = m.get('correction_url')
        return self


class CreateCertificateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        register_id: str = None,
        certificate_type: str = None,
        features_type: str = None,
        org_id: str = None,
        proxy_info: ProxyData = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 版权登记id
        self.register_id = register_id
        # 证书类型
        self.certificate_type = certificate_type
        # 功能类型
        self.features_type = features_type
        # 公证处id
        self.org_id = org_id
        # 代理信息
        self.proxy_info = proxy_info

    def validate(self):
        self.validate_required(self.register_id, 'register_id')
        self.validate_required(self.certificate_type, 'certificate_type')
        self.validate_required(self.features_type, 'features_type')
        if self.proxy_info:
            self.proxy_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.register_id is not None:
            result['register_id'] = self.register_id
        if self.certificate_type is not None:
            result['certificate_type'] = self.certificate_type
        if self.features_type is not None:
            result['features_type'] = self.features_type
        if self.org_id is not None:
            result['org_id'] = self.org_id
        if self.proxy_info is not None:
            result['proxy_info'] = self.proxy_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('register_id') is not None:
            self.register_id = m.get('register_id')
        if m.get('certificate_type') is not None:
            self.certificate_type = m.get('certificate_type')
        if m.get('features_type') is not None:
            self.features_type = m.get('features_type')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        if m.get('proxy_info') is not None:
            temp_model = ProxyData()
            self.proxy_info = temp_model.from_map(m['proxy_info'])
        return self


class CreateCertificateResponse(TeaModel):
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
        # 生成证书结果
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


class GetCertificateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        certificate_type: str = None,
        features_type: str = None,
        register_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 证书类型
        self.certificate_type = certificate_type
        # 功能类型
        self.features_type = features_type
        # 版权登记id
        self.register_id = register_id

    def validate(self):
        self.validate_required(self.certificate_type, 'certificate_type')
        self.validate_required(self.features_type, 'features_type')
        self.validate_required(self.register_id, 'register_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.certificate_type is not None:
            result['certificate_type'] = self.certificate_type
        if self.features_type is not None:
            result['features_type'] = self.features_type
        if self.register_id is not None:
            result['register_id'] = self.register_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('certificate_type') is not None:
            self.certificate_type = m.get('certificate_type')
        if m.get('features_type') is not None:
            self.features_type = m.get('features_type')
        if m.get('register_id') is not None:
            self.register_id = m.get('register_id')
        return self


class GetCertificateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        url: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 证书下载链接
        self.url = url
        # 证书生成状态
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
        if self.url is not None:
            result['url'] = self.url
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
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class CreateMonitorTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        submit_content: str = None,
        submit_type: str = None,
        file_type: str = None,
        task_name: str = None,
        content_title: str = None,
        keywords: List[str] = None,
        content_desc: str = None,
        provider_id: str = None,
        scopes: List[str] = None,
        task_start: int = None,
        task_duration: int = None,
        proxy_info: ProxyData = None,
        client_token: str = None,
        origin_monitor_task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # submitType是url就传 url地址 submitType 是file就传 oss fileId
        self.submit_content = submit_content
        # 提交任务的类型:FILE/URL
        # 不填为FILE
        # FILE表示文件上传素材，URL表示上传URL
        self.submit_type = submit_type
        # 文件类别
        # 
        # IMAGE
        # 
        # TEXT
        # 
        # VIDEO
        self.file_type = file_type
        # 任务名称(不超过100字符)
        self.task_name = task_name
        # 监测任务标题(不超过100字符)
        self.content_title = content_title
        # 关键词(不超过200字符)
        self.keywords = keywords
        # 内容表述(不超过1000字符)
        self.content_desc = content_desc
        # 监测供应商id
        self.provider_id = provider_id
        # 监测范围 默认全部：ALL；PC网站：SITE；APP应用：APP
        self.scopes = scopes
        # 任务开始时间，如当前时间戳，不传则取服务器当前时间戳，单位毫秒
        self.task_start = task_start
        # 任务持续时间，单位天，默认90天
        # 
        # 一次性监测：0
        self.task_duration = task_duration
        # 代理信息
        self.proxy_info = proxy_info
        # 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
        self.client_token = client_token
        # 原监测任务id
        self.origin_monitor_task_id = origin_monitor_task_id

    def validate(self):
        self.validate_required(self.submit_content, 'submit_content')
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.task_name, 'task_name')
        self.validate_required(self.content_title, 'content_title')
        self.validate_required(self.keywords, 'keywords')
        if self.proxy_info:
            self.proxy_info.validate()
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.submit_content is not None:
            result['submit_content'] = self.submit_content
        if self.submit_type is not None:
            result['submit_type'] = self.submit_type
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.task_name is not None:
            result['task_name'] = self.task_name
        if self.content_title is not None:
            result['content_title'] = self.content_title
        if self.keywords is not None:
            result['keywords'] = self.keywords
        if self.content_desc is not None:
            result['content_desc'] = self.content_desc
        if self.provider_id is not None:
            result['provider_id'] = self.provider_id
        if self.scopes is not None:
            result['scopes'] = self.scopes
        if self.task_start is not None:
            result['task_start'] = self.task_start
        if self.task_duration is not None:
            result['task_duration'] = self.task_duration
        if self.proxy_info is not None:
            result['proxy_info'] = self.proxy_info.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.origin_monitor_task_id is not None:
            result['origin_monitor_task_id'] = self.origin_monitor_task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('submit_content') is not None:
            self.submit_content = m.get('submit_content')
        if m.get('submit_type') is not None:
            self.submit_type = m.get('submit_type')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('task_name') is not None:
            self.task_name = m.get('task_name')
        if m.get('content_title') is not None:
            self.content_title = m.get('content_title')
        if m.get('keywords') is not None:
            self.keywords = m.get('keywords')
        if m.get('content_desc') is not None:
            self.content_desc = m.get('content_desc')
        if m.get('provider_id') is not None:
            self.provider_id = m.get('provider_id')
        if m.get('scopes') is not None:
            self.scopes = m.get('scopes')
        if m.get('task_start') is not None:
            self.task_start = m.get('task_start')
        if m.get('task_duration') is not None:
            self.task_duration = m.get('task_duration')
        if m.get('proxy_info') is not None:
            temp_model = ProxyData()
            self.proxy_info = temp_model.from_map(m['proxy_info'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('origin_monitor_task_id') is not None:
            self.origin_monitor_task_id = m.get('origin_monitor_task_id')
        return self


class CreateMonitorTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        monitor_task_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 监测任务Id
        self.monitor_task_id = monitor_task_id

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
        if self.monitor_task_id is not None:
            result['monitor_task_id'] = self.monitor_task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('monitor_task_id') is not None:
            self.monitor_task_id = m.get('monitor_task_id')
        return self


class StopMonitorTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        monitor_task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 监测任务Id
        # 
        self.monitor_task_id = monitor_task_id

    def validate(self):
        self.validate_required(self.monitor_task_id, 'monitor_task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.monitor_task_id is not None:
            result['monitor_task_id'] = self.monitor_task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('monitor_task_id') is not None:
            self.monitor_task_id = m.get('monitor_task_id')
        return self


class StopMonitorTaskResponse(TeaModel):
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
        # 停止结果
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


class QueryMonitorTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        monitor_task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 监测任务Id
        # 
        self.monitor_task_id = monitor_task_id

    def validate(self):
        self.validate_required(self.monitor_task_id, 'monitor_task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.monitor_task_id is not None:
            result['monitor_task_id'] = self.monitor_task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('monitor_task_id') is not None:
            self.monitor_task_id = m.get('monitor_task_id')
        return self


class QueryMonitorTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        monitor_task: MonitorTask = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 监测任务信息
        # 
        # 
        self.monitor_task = monitor_task

    def validate(self):
        if self.monitor_task:
            self.monitor_task.validate()

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
        if self.monitor_task is not None:
            result['monitor_task'] = self.monitor_task.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('monitor_task') is not None:
            temp_model = MonitorTask()
            self.monitor_task = temp_model.from_map(m['monitor_task'])
        return self


class QueryMonitorResultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        monitor_task_id: str = None,
        page_index: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 监测任务Id
        self.monitor_task_id = monitor_task_id
        # 页序号(>0)
        # 
        # 
        self.page_index = page_index
        # 页大小(1-200)
        # 
        # 
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.monitor_task_id, 'monitor_task_id')
        self.validate_required(self.page_index, 'page_index')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.monitor_task_id is not None:
            result['monitor_task_id'] = self.monitor_task_id
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('monitor_task_id') is not None:
            self.monitor_task_id = m.get('monitor_task_id')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryMonitorResultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        monitor_result_list: List[MonitorResult] = None,
        page_index: int = None,
        page_size: int = None,
        result_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 监测任务信息
        self.monitor_result_list = monitor_result_list
        # 页序号(>0)
        self.page_index = page_index
        # 页大小(1-200)
        self.page_size = page_size
        # 监测结果数量
        self.result_count = result_count

    def validate(self):
        if self.monitor_result_list:
            for k in self.monitor_result_list:
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
        result['monitor_result_list'] = []
        if self.monitor_result_list is not None:
            for k in self.monitor_result_list:
                result['monitor_result_list'].append(k.to_map() if k else None)
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.result_count is not None:
            result['result_count'] = self.result_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.monitor_result_list = []
        if m.get('monitor_result_list') is not None:
            for k in m.get('monitor_result_list'):
                temp_model = MonitorResult()
                self.monitor_result_list.append(temp_model.from_map(k))
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('result_count') is not None:
            self.result_count = m.get('result_count')
        return self


class ListMonitorProviderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        monitor_types: List[MonitorType] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 需监测文件类型
        self.monitor_types = monitor_types

    def validate(self):
        self.validate_required(self.monitor_types, 'monitor_types')
        if self.monitor_types:
            for k in self.monitor_types:
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
        result['monitor_types'] = []
        if self.monitor_types is not None:
            for k in self.monitor_types:
                result['monitor_types'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.monitor_types = []
        if m.get('monitor_types') is not None:
            for k in m.get('monitor_types'):
                temp_model = MonitorType()
                self.monitor_types.append(temp_model.from_map(k))
        return self


class ListMonitorProviderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        provider_list: List[MonitorProviderType] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 监测能力提供方类型列表
        self.provider_list = provider_list

    def validate(self):
        if self.provider_list:
            for k in self.provider_list:
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
        result['provider_list'] = []
        if self.provider_list is not None:
            for k in self.provider_list:
                result['provider_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.provider_list = []
        if m.get('provider_list') is not None:
            for k in m.get('provider_list'):
                temp_model = MonitorProviderType()
                self.provider_list.append(temp_model.from_map(k))
        return self


class CreateRecodescreenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        memo: str = None,
        url: List[str] = None,
        type: str = None,
        area: str = None,
        screen_code: str = None,
        max_time_in_min: int = None,
        wait_in_min: int = None,
        cross_region: str = None,
        ip_type: str = None,
        callback_url: str = None,
        org_id: str = None,
        cert_name: str = None,
        cert_no: str = None,
        cert_type: str = None,
        legal_person_name: str = None,
        legal_person_no: str = None,
        agent: str = None,
        agent_no: str = None,
        phone_num: str = None,
        proxy_info: ProxyData = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 取证名称（最长128个字符）
        self.name = name
        # 取证备注（最长512个字符）
        self.memo = memo
        # 预校验网址和预打开网页（不能大于10条）
        self.url = url
        # 取证类型 具体见附录 RecordScreenType
        self.type = type
        # 取证服务器地域 具体见附录 RecordScreenArea
        self.area = area
        # 定制录屏桌面识别码，目前取值只有默认值：DEFAULT
        self.screen_code = screen_code
        # 最大录屏时间，maxTimeInMin不能小于6min，不能大于300min
        self.max_time_in_min = max_time_in_min
        # 服务器进入ready状态，指定时间未开始进入abort状态的等待时间，单位为分钟，默认1min，waitInMin不能小于1，不能大于10min
        self.wait_in_min = wait_in_min
        # 当所选地域无机器资源时，是否使用其它地域
        # 
        # 目前取值只有默认值：FORBID
        self.cross_region = cross_region
        # ip地域取值
        # 
        # 目前取值只有默认值：ANY
        self.ip_type = ip_type
        # 回调地址
        self.callback_url = callback_url
        # 公证处Id
        self.org_id = org_id
        # 取证人证件名称
        self.cert_name = cert_name
        # 
        # 取证人证件号码
        self.cert_no = cert_no
        # 取证人证件类型 具体见附录CertType
        self.cert_type = cert_type
        # 企业法人代表姓名(如果certType为BUSINESS_LICENSE 则必传)
        self.legal_person_name = legal_person_name
        # 企业法人代表身份证号(如果certType为BUSINESS_LICENSE 则必传)
        self.legal_person_no = legal_person_no
        # 企业用户取证人姓名(如果certType为BUSINESS_LICENSE 则必传)
        self.agent = agent
        # 企业用户取证人身份证号(如果certType为BUSINESS_LICENSE 则必传)
        self.agent_no = agent_no
        # 取证人电话号码，生成公证处证书需要，公证处需要作登记 格式范例：(86-573)2651630   或  (86)13738258505
        self.phone_num = phone_num
        # 代理信息
        self.proxy_info = proxy_info
        # 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 128)
        if self.memo is not None:
            self.validate_max_length(self.memo, 'memo', 512)
        self.validate_required(self.type, 'type')
        self.validate_required(self.area, 'area')
        self.validate_required(self.max_time_in_min, 'max_time_in_min')
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_type, 'cert_type')
        if self.proxy_info:
            self.proxy_info.validate()
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.name is not None:
            result['name'] = self.name
        if self.memo is not None:
            result['memo'] = self.memo
        if self.url is not None:
            result['url'] = self.url
        if self.type is not None:
            result['type'] = self.type
        if self.area is not None:
            result['area'] = self.area
        if self.screen_code is not None:
            result['screen_code'] = self.screen_code
        if self.max_time_in_min is not None:
            result['max_time_in_min'] = self.max_time_in_min
        if self.wait_in_min is not None:
            result['wait_in_min'] = self.wait_in_min
        if self.cross_region is not None:
            result['cross_region'] = self.cross_region
        if self.ip_type is not None:
            result['ip_type'] = self.ip_type
        if self.callback_url is not None:
            result['callback_url'] = self.callback_url
        if self.org_id is not None:
            result['org_id'] = self.org_id
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.legal_person_name is not None:
            result['legal_person_name'] = self.legal_person_name
        if self.legal_person_no is not None:
            result['legal_person_no'] = self.legal_person_no
        if self.agent is not None:
            result['agent'] = self.agent
        if self.agent_no is not None:
            result['agent_no'] = self.agent_no
        if self.phone_num is not None:
            result['phone_num'] = self.phone_num
        if self.proxy_info is not None:
            result['proxy_info'] = self.proxy_info.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('memo') is not None:
            self.memo = m.get('memo')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('area') is not None:
            self.area = m.get('area')
        if m.get('screen_code') is not None:
            self.screen_code = m.get('screen_code')
        if m.get('max_time_in_min') is not None:
            self.max_time_in_min = m.get('max_time_in_min')
        if m.get('wait_in_min') is not None:
            self.wait_in_min = m.get('wait_in_min')
        if m.get('cross_region') is not None:
            self.cross_region = m.get('cross_region')
        if m.get('ip_type') is not None:
            self.ip_type = m.get('ip_type')
        if m.get('callback_url') is not None:
            self.callback_url = m.get('callback_url')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('legal_person_name') is not None:
            self.legal_person_name = m.get('legal_person_name')
        if m.get('legal_person_no') is not None:
            self.legal_person_no = m.get('legal_person_no')
        if m.get('agent') is not None:
            self.agent = m.get('agent')
        if m.get('agent_no') is not None:
            self.agent_no = m.get('agent_no')
        if m.get('phone_num') is not None:
            self.phone_num = m.get('phone_num')
        if m.get('proxy_info') is not None:
            temp_model = ProxyData()
            self.proxy_info = temp_model.from_map(m['proxy_info'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class CreateRecodescreenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        evidence_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 取证id
        self.evidence_id = evidence_id

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
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        return self


class QueryRecodescreenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        evidence_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 取证id
        self.evidence_id = evidence_id

    def validate(self):
        self.validate_required(self.evidence_id, 'evidence_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        return self


class QueryRecodescreenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        evidence_id: str = None,
        status: str = None,
        operate_url: str = None,
        data: RecordScreenData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 取证id
        self.evidence_id = evidence_id
        # 取证状态 具体见附录 RecordScreenStatus
        self.status = status
        # 取证操作Url （状态为INIT和DOING 时返回 可以重复打开使用）
        self.operate_url = operate_url
        # 取证详情（状态为PACKAGING,SUCCESS,FAIL才有数据）
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
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        if self.status is not None:
            result['status'] = self.status
        if self.operate_url is not None:
            result['operate_url'] = self.operate_url
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
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('operate_url') is not None:
            self.operate_url = m.get('operate_url')
        if m.get('data') is not None:
            temp_model = RecordScreenData()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户token，从cookie或者重定向链接获取
        self.token = token

    def validate(self):
        self.validate_required(self.token, 'token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.token is not None:
            result['token'] = self.token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('token') is not None:
            self.token = m.get('token')
        return self


class QueryUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        login: bool = None,
        user: UserData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否登录
        self.login = login
        # 用户信息
        self.user = user

    def validate(self):
        if self.user:
            self.user.validate()

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
        if self.login is not None:
            result['login'] = self.login
        if self.user is not None:
            result['user'] = self.user.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('login') is not None:
            self.login = m.get('login')
        if m.get('user') is not None:
            temp_model = UserData()
            self.user = temp_model.from_map(m['user'])
        return self


class QueryUserListRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_index: int = None,
        page_size: int = None,
        status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 页码，从1开始
        self.page_index = page_index
        # 每页数据，1~100
        self.page_size = page_size
        # 用户状态
        self.status = status

    def validate(self):
        self.validate_required(self.page_index, 'page_index')
        if self.page_index is not None:
            self.validate_minimum(self.page_index, 'page_index', 1)
        self.validate_required(self.page_size, 'page_size')
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 100)
            self.validate_minimum(self.page_size, 'page_size', 1)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class QueryUserListResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_index: int = None,
        page_size: int = None,
        total_count: int = None,
        user_list: List[UserData] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 页码，从1开始
        self.page_index = page_index
        # 每页数据，1~100
        self.page_size = page_size
        # 总数量
        self.total_count = total_count
        # 用户信息列表
        self.user_list = user_list

    def validate(self):
        if self.user_list:
            for k in self.user_list:
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
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_count is not None:
            result['total_count'] = self.total_count
        result['user_list'] = []
        if self.user_list is not None:
            for k in self.user_list:
                result['user_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        self.user_list = []
        if m.get('user_list') is not None:
            for k in m.get('user_list'):
                temp_model = UserData()
                self.user_list.append(temp_model.from_map(k))
        return self


class CreateScreenshotRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        memo: str = None,
        url: str = None,
        org_id: str = None,
        cert_name: str = None,
        cert_no: str = None,
        cert_type: str = None,
        legal_person_name: str = None,
        legal_person_no: str = None,
        legal_person_type: str = None,
        agent_name: str = None,
        agent_no: str = None,
        phone_num: str = None,
        proxy_info: ProxyData = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 取证名称（最长128个字符）
        self.name = name
        # 取证备注（最长512个字符）
        self.memo = memo
        # 取证地址（最长2048个字符）
        self.url = url
        # 公证处Id
        self.org_id = org_id
        # 取证人证件名称
        self.cert_name = cert_name
        # 取证人证件号码
        self.cert_no = cert_no
        # 取证人证件类型
        self.cert_type = cert_type
        # 法人代表姓名(如果certType为BUSINESS_LICENSE 则必传)
        self.legal_person_name = legal_person_name
        # 法人代表身份证号(如果certType为BUSINESS_LICENSE 则必传)
        self.legal_person_no = legal_person_no
        # 法人证件类型
        self.legal_person_type = legal_person_type
        # 企业用户取证人姓名(如果certType为BUSINESS_LICENSE 则必传)
        self.agent_name = agent_name
        # 企业用户取证人身份证号(如果certType为BUSINESS_LICENSE 则必传)
        self.agent_no = agent_no
        # 取证人电话号码，生成公证处证书需要，公证处需要作登记 格式范例：(86-573)2651630   或  (86)13738258505
        self.phone_num = phone_num
        # 代理信息
        self.proxy_info = proxy_info
        # 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 128)
        if self.memo is not None:
            self.validate_max_length(self.memo, 'memo', 512)
        self.validate_required(self.url, 'url')
        if self.url is not None:
            self.validate_max_length(self.url, 'url', 2048)
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_type, 'cert_type')
        if self.proxy_info:
            self.proxy_info.validate()
        self.validate_required(self.client_token, 'client_token')
        if self.client_token is not None:
            self.validate_max_length(self.client_token, 'client_token', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.name is not None:
            result['name'] = self.name
        if self.memo is not None:
            result['memo'] = self.memo
        if self.url is not None:
            result['url'] = self.url
        if self.org_id is not None:
            result['org_id'] = self.org_id
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.legal_person_name is not None:
            result['legal_person_name'] = self.legal_person_name
        if self.legal_person_no is not None:
            result['legal_person_no'] = self.legal_person_no
        if self.legal_person_type is not None:
            result['legal_person_type'] = self.legal_person_type
        if self.agent_name is not None:
            result['agent_name'] = self.agent_name
        if self.agent_no is not None:
            result['agent_no'] = self.agent_no
        if self.phone_num is not None:
            result['phone_num'] = self.phone_num
        if self.proxy_info is not None:
            result['proxy_info'] = self.proxy_info.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('memo') is not None:
            self.memo = m.get('memo')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('legal_person_name') is not None:
            self.legal_person_name = m.get('legal_person_name')
        if m.get('legal_person_no') is not None:
            self.legal_person_no = m.get('legal_person_no')
        if m.get('legal_person_type') is not None:
            self.legal_person_type = m.get('legal_person_type')
        if m.get('agent_name') is not None:
            self.agent_name = m.get('agent_name')
        if m.get('agent_no') is not None:
            self.agent_no = m.get('agent_no')
        if m.get('phone_num') is not None:
            self.phone_num = m.get('phone_num')
        if m.get('proxy_info') is not None:
            temp_model = ProxyData()
            self.proxy_info = temp_model.from_map(m['proxy_info'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class CreateScreenshotResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        evidence_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 取证id
        self.evidence_id = evidence_id

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
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        return self


class QueryScreenshotRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        evidence_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 取证id
        self.evidence_id = evidence_id

    def validate(self):
        self.validate_required(self.evidence_id, 'evidence_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        return self


class QueryScreenshotResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        evidence_id: str = None,
        status: str = None,
        data: ScreenshotData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 取证id
        self.evidence_id = evidence_id
        # 取证状态
        self.status = status
        # 网页截图信息
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
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        if self.status is not None:
            result['status'] = self.status
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
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('data') is not None:
            temp_model = ScreenshotData()
            self.data = temp_model.from_map(m['data'])
        return self


class VerifyBlockchainRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tx_hash: str = None,
        file_hash: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 统一证据编号（存证交易HASH）
        self.tx_hash = tx_hash
        # 文件HASH，使用HEX的完整表示，如 6460c949f8a347eb...
        # 
        # (和fileId 二选一，必传一个，都传按fileHash为准)
        self.file_hash = file_hash

    def validate(self):
        self.validate_required(self.tx_hash, 'tx_hash')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.file_hash is not None:
            result['file_hash'] = self.file_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('file_hash') is not None:
            self.file_hash = m.get('file_hash')
        return self


class VerifyBlockchainResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        status: str = None,
        block_hash: str = None,
        block_height: int = None,
        data_type: str = None,
        timestamp: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 统一证据编号（存证交易HASH）
        self.tx_hash = tx_hash
        # 核验结果
        self.status = status
        # 所在区块hash
        self.block_hash = block_hash
        # 区块链高度
        self.block_height = block_height
        # 存证类型
        self.data_type = data_type
        # 存证时间
        self.timestamp = timestamp

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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.status is not None:
            result['status'] = self.status
        if self.block_hash is not None:
            result['block_hash'] = self.block_hash
        if self.block_height is not None:
            result['block_height'] = self.block_height
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('block_hash') is not None:
            self.block_hash = m.get('block_hash')
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        return self


class CreateRecordscreenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        memo: str = None,
        url: List[str] = None,
        type: str = None,
        area: str = None,
        screen_code: str = None,
        max_time_in_min: int = None,
        wait_in_min: int = None,
        cross_region: str = None,
        ip_type: str = None,
        callback_url: str = None,
        org_id: str = None,
        cert_name: str = None,
        cert_no: str = None,
        cert_type: str = None,
        legal_person_name: str = None,
        legal_person_no: str = None,
        legal_person_type: str = None,
        agent_name: str = None,
        agent_no: str = None,
        phone_num: str = None,
        automatic: bool = None,
        target_type: str = None,
        support_uac: bool = None,
        scripts_package_id: str = None,
        proxy_info: ProxyData = None,
        client_token: str = None,
        inventory: str = None,
        audio_video_infos: List[EvidenceUrlInfo] = None,
        screen_cancel_info: ScreenCancelInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 取证名称（最长128个字符）
        self.name = name
        # 取证备注（最长512个字符）
        self.memo = memo
        # 预校验网址和预打开网页（不能大于10条），如果automatic为true 则必填
        self.url = url
        # 取证类型 具体见附录 RecordScreenType
        self.type = type
        # 取证服务器地域 具体见附录 RecordScreenArea
        self.area = area
        # 定制录屏桌面识别码，目前取值只有默认值：DEFAULT
        self.screen_code = screen_code
        # 最大录屏时间，maxTimeInMin不能小于6min，不能大于300min
        self.max_time_in_min = max_time_in_min
        # 服务器进入ready状态，指定时间未开始进入abort状态的等待时间，单位为分钟，默认1min，waitInMin不能小于1，不能大于10min
        self.wait_in_min = wait_in_min
        # 当所选地域无机器资源时，是否使用其它地域 目前取值只有默认值：FORBID
        self.cross_region = cross_region
        # ip地域取值 目前取值只有默认值：ANY
        self.ip_type = ip_type
        # 回调地址
        self.callback_url = callback_url
        # 公证处Id
        self.org_id = org_id
        # 取证人证件名称
        self.cert_name = cert_name
        # 取证人证件号码
        self.cert_no = cert_no
        # 取证人证件类型 具体见附录CertType
        self.cert_type = cert_type
        # 企业法人代表姓名(如果certType为BUSINESS_LICENSE 则必传)
        self.legal_person_name = legal_person_name
        # 企业法人代表身份证号(如果certType为BUSINESS_LICENSE 则必传)
        self.legal_person_no = legal_person_no
        # 法人证件类型（非必传，默认IDENTITY_CARD）
        self.legal_person_type = legal_person_type
        # 企业用户取证人姓名(如果certType为BUSINESS_LICENSE 则必传)
        self.agent_name = agent_name
        # 企业用户取证人身份证号(如果certType为BUSINESS_LICENSE 则必传)
        self.agent_no = agent_no
        # 取证人电话号码，生成公证处证书需要，公证处需要作登记 格式范例：(86-573)2651630 或 (86)13738258505
        self.phone_num = phone_num
        # 是否自动化取证
        self.automatic = automatic
        # 取证目标类型： 微信公众号：WEIXIN_MP 其它：OTHER
        # 
        self.target_type = target_type
        # 是否支持UAC通行 默认false
        self.support_uac = support_uac
        # 取证脚本集Id
        self.scripts_package_id = scripts_package_id
        # 代理信息
        self.proxy_info = proxy_info
        # 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
        self.client_token = client_token
        # 其他取证网址
        self.inventory = inventory
        # 音视频取证信息
        self.audio_video_infos = audio_video_infos
        # 放弃取证信息
        self.screen_cancel_info = screen_cancel_info

    def validate(self):
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 128)
        if self.memo is not None:
            self.validate_max_length(self.memo, 'memo', 512)
        self.validate_required(self.type, 'type')
        self.validate_required(self.area, 'area')
        self.validate_required(self.max_time_in_min, 'max_time_in_min')
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_type, 'cert_type')
        if self.proxy_info:
            self.proxy_info.validate()
        self.validate_required(self.client_token, 'client_token')
        if self.audio_video_infos:
            for k in self.audio_video_infos:
                if k:
                    k.validate()
        if self.screen_cancel_info:
            self.screen_cancel_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.name is not None:
            result['name'] = self.name
        if self.memo is not None:
            result['memo'] = self.memo
        if self.url is not None:
            result['url'] = self.url
        if self.type is not None:
            result['type'] = self.type
        if self.area is not None:
            result['area'] = self.area
        if self.screen_code is not None:
            result['screen_code'] = self.screen_code
        if self.max_time_in_min is not None:
            result['max_time_in_min'] = self.max_time_in_min
        if self.wait_in_min is not None:
            result['wait_in_min'] = self.wait_in_min
        if self.cross_region is not None:
            result['cross_region'] = self.cross_region
        if self.ip_type is not None:
            result['ip_type'] = self.ip_type
        if self.callback_url is not None:
            result['callback_url'] = self.callback_url
        if self.org_id is not None:
            result['org_id'] = self.org_id
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.legal_person_name is not None:
            result['legal_person_name'] = self.legal_person_name
        if self.legal_person_no is not None:
            result['legal_person_no'] = self.legal_person_no
        if self.legal_person_type is not None:
            result['legal_person_type'] = self.legal_person_type
        if self.agent_name is not None:
            result['agent_name'] = self.agent_name
        if self.agent_no is not None:
            result['agent_no'] = self.agent_no
        if self.phone_num is not None:
            result['phone_num'] = self.phone_num
        if self.automatic is not None:
            result['automatic'] = self.automatic
        if self.target_type is not None:
            result['target_type'] = self.target_type
        if self.support_uac is not None:
            result['support_uac'] = self.support_uac
        if self.scripts_package_id is not None:
            result['scripts_package_id'] = self.scripts_package_id
        if self.proxy_info is not None:
            result['proxy_info'] = self.proxy_info.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.inventory is not None:
            result['inventory'] = self.inventory
        result['audio_video_infos'] = []
        if self.audio_video_infos is not None:
            for k in self.audio_video_infos:
                result['audio_video_infos'].append(k.to_map() if k else None)
        if self.screen_cancel_info is not None:
            result['screen_cancel_info'] = self.screen_cancel_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('memo') is not None:
            self.memo = m.get('memo')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('area') is not None:
            self.area = m.get('area')
        if m.get('screen_code') is not None:
            self.screen_code = m.get('screen_code')
        if m.get('max_time_in_min') is not None:
            self.max_time_in_min = m.get('max_time_in_min')
        if m.get('wait_in_min') is not None:
            self.wait_in_min = m.get('wait_in_min')
        if m.get('cross_region') is not None:
            self.cross_region = m.get('cross_region')
        if m.get('ip_type') is not None:
            self.ip_type = m.get('ip_type')
        if m.get('callback_url') is not None:
            self.callback_url = m.get('callback_url')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('legal_person_name') is not None:
            self.legal_person_name = m.get('legal_person_name')
        if m.get('legal_person_no') is not None:
            self.legal_person_no = m.get('legal_person_no')
        if m.get('legal_person_type') is not None:
            self.legal_person_type = m.get('legal_person_type')
        if m.get('agent_name') is not None:
            self.agent_name = m.get('agent_name')
        if m.get('agent_no') is not None:
            self.agent_no = m.get('agent_no')
        if m.get('phone_num') is not None:
            self.phone_num = m.get('phone_num')
        if m.get('automatic') is not None:
            self.automatic = m.get('automatic')
        if m.get('target_type') is not None:
            self.target_type = m.get('target_type')
        if m.get('support_uac') is not None:
            self.support_uac = m.get('support_uac')
        if m.get('scripts_package_id') is not None:
            self.scripts_package_id = m.get('scripts_package_id')
        if m.get('proxy_info') is not None:
            temp_model = ProxyData()
            self.proxy_info = temp_model.from_map(m['proxy_info'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('inventory') is not None:
            self.inventory = m.get('inventory')
        self.audio_video_infos = []
        if m.get('audio_video_infos') is not None:
            for k in m.get('audio_video_infos'):
                temp_model = EvidenceUrlInfo()
                self.audio_video_infos.append(temp_model.from_map(k))
        if m.get('screen_cancel_info') is not None:
            temp_model = ScreenCancelInfo()
            self.screen_cancel_info = temp_model.from_map(m['screen_cancel_info'])
        return self


class CreateRecordscreenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        evidence_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 取证id
        self.evidence_id = evidence_id

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
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        return self


class QueryRecordscreenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        evidence_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 取证id
        self.evidence_id = evidence_id

    def validate(self):
        self.validate_required(self.evidence_id, 'evidence_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        return self


class QueryRecordscreenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        evidence_id: str = None,
        status: str = None,
        operate_url: str = None,
        data: RecordScreenData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 取证id
        self.evidence_id = evidence_id
        # 取证状态 具体见附录 RecordScreenStatus
        self.status = status
        # 取证操作Url （状态为INIT和DOING 时返回 可以重复打开使用）
        self.operate_url = operate_url
        # 取证详情（状态为PACKAGING,SUCCESS,FAIL才有数据）
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
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        if self.status is not None:
            result['status'] = self.status
        if self.operate_url is not None:
            result['operate_url'] = self.operate_url
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
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('operate_url') is not None:
            self.operate_url = m.get('operate_url')
        if m.get('data') is not None:
            temp_model = RecordScreenData()
            self.data = temp_model.from_map(m['data'])
        return self


class ListNotaryRequest(TeaModel):
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


class ListNotaryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        notary_list: List[NotaryPublicOffice] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 公证处列表
        self.notary_list = notary_list

    def validate(self):
        if self.notary_list:
            for k in self.notary_list:
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
        result['notary_list'] = []
        if self.notary_list is not None:
            for k in self.notary_list:
                result['notary_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.notary_list = []
        if m.get('notary_list') is not None:
            for k in m.get('notary_list'):
                temp_model = NotaryPublicOffice()
                self.notary_list.append(temp_model.from_map(k))
        return self


class CreateDirectmonitorTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        submit_type: str = None,
        submit_content: str = None,
        file_name: str = None,
        file_type: str = None,
        detail_file_type: str = None,
        task_name: str = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 提交类型，FILE/URL
        # 
        self.submit_type = submit_type
        # submitType 是FILE就传 oss fileId，是URL就传url地址
        self.submit_content = submit_content
        # 文件名称
        self.file_name = file_name
        # 文件类别 IMAGE/TEXT/VIDEO/AUDIO
        # 
        self.file_type = file_type
        # 详细文件类型，在fileType为IMAGE时，当前仅支持MARKETING_IMAGE营销图片
        self.detail_file_type = detail_file_type
        # 定向监测任务名称
        self.task_name = task_name
        # 幂等号，用于保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.submit_type, 'submit_type')
        self.validate_required(self.submit_content, 'submit_content')
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.detail_file_type, 'detail_file_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.submit_type is not None:
            result['submit_type'] = self.submit_type
        if self.submit_content is not None:
            result['submit_content'] = self.submit_content
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.detail_file_type is not None:
            result['detail_file_type'] = self.detail_file_type
        if self.task_name is not None:
            result['task_name'] = self.task_name
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('submit_type') is not None:
            self.submit_type = m.get('submit_type')
        if m.get('submit_content') is not None:
            self.submit_content = m.get('submit_content')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('detail_file_type') is not None:
            self.detail_file_type = m.get('detail_file_type')
        if m.get('task_name') is not None:
            self.task_name = m.get('task_name')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class CreateDirectmonitorTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        monitor_task_id: str = None,
        is_exist_similar: bool = None,
        monitor_result_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 监测任务id
        self.monitor_task_id = monitor_task_id
        # 是否存在相似结果
        self.is_exist_similar = is_exist_similar
        # 监测结果总数量
        self.monitor_result_count = monitor_result_count

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
        if self.monitor_task_id is not None:
            result['monitor_task_id'] = self.monitor_task_id
        if self.is_exist_similar is not None:
            result['is_exist_similar'] = self.is_exist_similar
        if self.monitor_result_count is not None:
            result['monitor_result_count'] = self.monitor_result_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('monitor_task_id') is not None:
            self.monitor_task_id = m.get('monitor_task_id')
        if m.get('is_exist_similar') is not None:
            self.is_exist_similar = m.get('is_exist_similar')
        if m.get('monitor_result_count') is not None:
            self.monitor_result_count = m.get('monitor_result_count')
        return self


class QueryDirectmonitorResultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        monitor_task_id: str = None,
        page_size: int = None,
        page_index: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 监测任务id
        self.monitor_task_id = monitor_task_id
        # 页面大小(1-200)
        self.page_size = page_size
        # 页码(>0)
        self.page_index = page_index

    def validate(self):
        self.validate_required(self.monitor_task_id, 'monitor_task_id')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.page_index, 'page_index')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.monitor_task_id is not None:
            result['monitor_task_id'] = self.monitor_task_id
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page_index is not None:
            result['page_index'] = self.page_index
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('monitor_task_id') is not None:
            self.monitor_task_id = m.get('monitor_task_id')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        return self


class QueryDirectmonitorResultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        monitor_task_id: str = None,
        result_count: int = None,
        monitor_result_list: List[DirectMonitorResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 监测任务id
        self.monitor_task_id = monitor_task_id
        # 当前页面监测结果数量
        self.result_count = result_count
        # 监测结果列表
        self.monitor_result_list = monitor_result_list

    def validate(self):
        if self.monitor_result_list:
            for k in self.monitor_result_list:
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
        if self.monitor_task_id is not None:
            result['monitor_task_id'] = self.monitor_task_id
        if self.result_count is not None:
            result['result_count'] = self.result_count
        result['monitor_result_list'] = []
        if self.monitor_result_list is not None:
            for k in self.monitor_result_list:
                result['monitor_result_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('monitor_task_id') is not None:
            self.monitor_task_id = m.get('monitor_task_id')
        if m.get('result_count') is not None:
            self.result_count = m.get('result_count')
        self.monitor_result_list = []
        if m.get('monitor_result_list') is not None:
            for k in m.get('monitor_result_list'):
                temp_model = DirectMonitorResult()
                self.monitor_result_list.append(temp_model.from_map(k))
        return self


class CreateDciPreregistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        work_name: str = None,
        work_category: str = None,
        recommend_work_category: str = None,
        work_file_id: str = None,
        file_type: str = None,
        creation_info: DciCreationInfo = None,
        publication_info: DciPublicationInfo = None,
        author_name: str = None,
        author_signature: str = None,
        original_statement: str = None,
        right_info: DciRightInfo = None,
        pre_registration_true_will: str = None,
        dci_user_id: str = None,
        proxy_data: ProxyData = None,
        client_token: str = None,
        category_similar_ratio: str = None,
        category_risk_rank: str = None,
        copyright_owner_ids: List[str] = None,
        apply_type: str = None,
        channel_terminal: str = None,
        recommend_category_list: List[RecommendCategoryDetail] = None,
        customize_cert_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 作品名称
        self.work_name = work_name
        # 作品类型
        self.work_category = work_category
        # 推荐作品分类
        self.recommend_work_category = recommend_work_category
        # 作品oss文件Id
        self.work_file_id = work_file_id
        # 文件类型
        self.file_type = file_type
        # 创作信息
        self.creation_info = creation_info
        # 发表信息
        self.publication_info = publication_info
        # 作者姓名
        self.author_name = author_name
        # 作者署名
        self.author_signature = author_signature
        # 原创声明
        self.original_statement = original_statement
        # 权利信息
        self.right_info = right_info
        # 真实意愿表达信息
        self.pre_registration_true_will = pre_registration_true_will
        # dci用户id
        self.dci_user_id = dci_user_id
        # 代理信息
        self.proxy_data = proxy_data
        # 幂等字段
        self.client_token = client_token
        # 作品类型相似度
        self.category_similar_ratio = category_similar_ratio
        # 作品类型风险等级
        self.category_risk_rank = category_risk_rank
        # 著作权人用户id List
        self.copyright_owner_ids = copyright_owner_ids
        # DCI类型
        self.apply_type = apply_type
        # 渠道标签
        self.channel_terminal = channel_terminal
        # 推荐分类明细信息
        self.recommend_category_list = recommend_category_list
        # 证书样式ID
        self.customize_cert_id = customize_cert_id

    def validate(self):
        self.validate_required(self.work_name, 'work_name')
        self.validate_required(self.work_category, 'work_category')
        self.validate_required(self.work_file_id, 'work_file_id')
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.creation_info, 'creation_info')
        if self.creation_info:
            self.creation_info.validate()
        self.validate_required(self.publication_info, 'publication_info')
        if self.publication_info:
            self.publication_info.validate()
        self.validate_required(self.author_name, 'author_name')
        self.validate_required(self.right_info, 'right_info')
        if self.right_info:
            self.right_info.validate()
        self.validate_required(self.pre_registration_true_will, 'pre_registration_true_will')
        self.validate_required(self.dci_user_id, 'dci_user_id')
        if self.proxy_data:
            self.proxy_data.validate()
        self.validate_required(self.client_token, 'client_token')
        self.validate_required(self.copyright_owner_ids, 'copyright_owner_ids')
        if self.recommend_category_list:
            for k in self.recommend_category_list:
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
        if self.work_name is not None:
            result['work_name'] = self.work_name
        if self.work_category is not None:
            result['work_category'] = self.work_category
        if self.recommend_work_category is not None:
            result['recommend_work_category'] = self.recommend_work_category
        if self.work_file_id is not None:
            result['work_file_id'] = self.work_file_id
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.creation_info is not None:
            result['creation_info'] = self.creation_info.to_map()
        if self.publication_info is not None:
            result['publication_info'] = self.publication_info.to_map()
        if self.author_name is not None:
            result['author_name'] = self.author_name
        if self.author_signature is not None:
            result['author_signature'] = self.author_signature
        if self.original_statement is not None:
            result['original_statement'] = self.original_statement
        if self.right_info is not None:
            result['right_info'] = self.right_info.to_map()
        if self.pre_registration_true_will is not None:
            result['pre_registration_true_will'] = self.pre_registration_true_will
        if self.dci_user_id is not None:
            result['dci_user_id'] = self.dci_user_id
        if self.proxy_data is not None:
            result['proxy_data'] = self.proxy_data.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.category_similar_ratio is not None:
            result['category_similar_ratio'] = self.category_similar_ratio
        if self.category_risk_rank is not None:
            result['category_risk_rank'] = self.category_risk_rank
        if self.copyright_owner_ids is not None:
            result['copyright_owner_ids'] = self.copyright_owner_ids
        if self.apply_type is not None:
            result['apply_type'] = self.apply_type
        if self.channel_terminal is not None:
            result['channel_terminal'] = self.channel_terminal
        result['recommend_category_list'] = []
        if self.recommend_category_list is not None:
            for k in self.recommend_category_list:
                result['recommend_category_list'].append(k.to_map() if k else None)
        if self.customize_cert_id is not None:
            result['customize_cert_id'] = self.customize_cert_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('work_name') is not None:
            self.work_name = m.get('work_name')
        if m.get('work_category') is not None:
            self.work_category = m.get('work_category')
        if m.get('recommend_work_category') is not None:
            self.recommend_work_category = m.get('recommend_work_category')
        if m.get('work_file_id') is not None:
            self.work_file_id = m.get('work_file_id')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('creation_info') is not None:
            temp_model = DciCreationInfo()
            self.creation_info = temp_model.from_map(m['creation_info'])
        if m.get('publication_info') is not None:
            temp_model = DciPublicationInfo()
            self.publication_info = temp_model.from_map(m['publication_info'])
        if m.get('author_name') is not None:
            self.author_name = m.get('author_name')
        if m.get('author_signature') is not None:
            self.author_signature = m.get('author_signature')
        if m.get('original_statement') is not None:
            self.original_statement = m.get('original_statement')
        if m.get('right_info') is not None:
            temp_model = DciRightInfo()
            self.right_info = temp_model.from_map(m['right_info'])
        if m.get('pre_registration_true_will') is not None:
            self.pre_registration_true_will = m.get('pre_registration_true_will')
        if m.get('dci_user_id') is not None:
            self.dci_user_id = m.get('dci_user_id')
        if m.get('proxy_data') is not None:
            temp_model = ProxyData()
            self.proxy_data = temp_model.from_map(m['proxy_data'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('category_similar_ratio') is not None:
            self.category_similar_ratio = m.get('category_similar_ratio')
        if m.get('category_risk_rank') is not None:
            self.category_risk_rank = m.get('category_risk_rank')
        if m.get('copyright_owner_ids') is not None:
            self.copyright_owner_ids = m.get('copyright_owner_ids')
        if m.get('apply_type') is not None:
            self.apply_type = m.get('apply_type')
        if m.get('channel_terminal') is not None:
            self.channel_terminal = m.get('channel_terminal')
        self.recommend_category_list = []
        if m.get('recommend_category_list') is not None:
            for k in m.get('recommend_category_list'):
                temp_model = RecommendCategoryDetail()
                self.recommend_category_list.append(temp_model.from_map(k))
        if m.get('customize_cert_id') is not None:
            self.customize_cert_id = m.get('customize_cert_id')
        return self


class CreateDciPreregistrationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        dci_content_id: str = None,
        error_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # dci内容id
        self.dci_content_id = dci_content_id
        # 错误信息
        self.error_msg = error_msg

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
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class QueryDciPreregistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dci_user_id: str = None,
        dci_content_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # dci用户id
        self.dci_user_id = dci_user_id
        # dci内容id
        self.dci_content_id = dci_content_id

    def validate(self):
        self.validate_required(self.dci_content_id, 'dci_content_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.dci_user_id is not None:
            result['dci_user_id'] = self.dci_user_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dci_user_id') is not None:
            self.dci_user_id = m.get('dci_user_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        return self


class QueryDciPreregistrationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
        file_hash: str = None,
        file_hash_tx_hash: str = None,
        file_hash_block_height: str = None,
        dci_code: str = None,
        dci_code_tx_hash: str = None,
        dci_code_block_height: str = None,
        dci_code_file_tx_hash: str = None,
        dci_code_file_block_height: str = None,
        pre_reg_cert_tx_hash: str = None,
        pre_reg_cert_block_height: str = None,
        cancel_tx_hash: str = None,
        cancel_block_height: str = None,
        dci_code_tsr: str = None,
        dci_code_file_tsr: str = None,
        pre_reg_cert_tsr: str = None,
        pre_reg_cert_file_id: str = None,
        pre_reg_cert_file_hash: str = None,
        pre_reg_cert_url: str = None,
        png_file_id: str = None,
        apply_obtain_date: str = None,
        dci_code_obtain_date: str = None,
        error_reason: str = None,
        error_reason_cn: str = None,
        publication_url: str = None,
        apply_type: str = None,
        series_diagram_error_reason_list: List[SeriesDiagramErrorReason] = None,
        contains_image_info: ContainsImageInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预登记状态
        self.status = status
        # 文件哈希
        self.file_hash = file_hash
        # 文件哈希存证txHash
        self.file_hash_tx_hash = file_hash_tx_hash
        # 文件哈希存证区块高度
        self.file_hash_block_height = file_hash_block_height
        # dci编码
        self.dci_code = dci_code
        # DCI码存证txHash
        self.dci_code_tx_hash = dci_code_tx_hash
        # DCI码存证高度
        self.dci_code_block_height = dci_code_block_height
        # DCI码fileHash存证txHash
        self.dci_code_file_tx_hash = dci_code_file_tx_hash
        # DCI码fileHash存证高度
        self.dci_code_file_block_height = dci_code_file_block_height
        # 预登记证书txhash
        self.pre_reg_cert_tx_hash = pre_reg_cert_tx_hash
        # 预登记证书存证高度
        self.pre_reg_cert_block_height = pre_reg_cert_block_height
        # 预登记取消txHash
        self.cancel_tx_hash = cancel_tx_hash
        # 预登记取消存证高度
        self.cancel_block_height = cancel_block_height
        # dciCode的可信时间戳信息
        self.dci_code_tsr = dci_code_tsr
        # dciCode fileHash的可信时间戳信息
        self.dci_code_file_tsr = dci_code_file_tsr
        # 预登记证书可信时间戳信息
        self.pre_reg_cert_tsr = pre_reg_cert_tsr
        # 预登记证书oss fileId
        self.pre_reg_cert_file_id = pre_reg_cert_file_id
        # 预登记证书fileHash
        self.pre_reg_cert_file_hash = pre_reg_cert_file_hash
        # 预登记证书下载链接
        self.pre_reg_cert_url = pre_reg_cert_url
        # 预览图oss fileId
        self.png_file_id = png_file_id
        # 申请发码时间
        self.apply_obtain_date = apply_obtain_date
        # DCI码创建时间
        self.dci_code_obtain_date = dci_code_obtain_date
        # 错误原因
        self.error_reason = error_reason
        # 错误中文原因
        self.error_reason_cn = error_reason_cn
        # 公式地址
        self.publication_url = publication_url
        # DCI类型
        self.apply_type = apply_type
        # 系列图错误原因集合
        self.series_diagram_error_reason_list = series_diagram_error_reason_list
        # 作品是否包含图片信息
        self.contains_image_info = contains_image_info

    def validate(self):
        if self.series_diagram_error_reason_list:
            for k in self.series_diagram_error_reason_list:
                if k:
                    k.validate()
        if self.contains_image_info:
            self.contains_image_info.validate()

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
        if self.file_hash is not None:
            result['file_hash'] = self.file_hash
        if self.file_hash_tx_hash is not None:
            result['file_hash_tx_hash'] = self.file_hash_tx_hash
        if self.file_hash_block_height is not None:
            result['file_hash_block_height'] = self.file_hash_block_height
        if self.dci_code is not None:
            result['dci_code'] = self.dci_code
        if self.dci_code_tx_hash is not None:
            result['dci_code_tx_hash'] = self.dci_code_tx_hash
        if self.dci_code_block_height is not None:
            result['dci_code_block_height'] = self.dci_code_block_height
        if self.dci_code_file_tx_hash is not None:
            result['dci_code_file_tx_hash'] = self.dci_code_file_tx_hash
        if self.dci_code_file_block_height is not None:
            result['dci_code_file_block_height'] = self.dci_code_file_block_height
        if self.pre_reg_cert_tx_hash is not None:
            result['pre_reg_cert_tx_hash'] = self.pre_reg_cert_tx_hash
        if self.pre_reg_cert_block_height is not None:
            result['pre_reg_cert_block_height'] = self.pre_reg_cert_block_height
        if self.cancel_tx_hash is not None:
            result['cancel_tx_hash'] = self.cancel_tx_hash
        if self.cancel_block_height is not None:
            result['cancel_block_height'] = self.cancel_block_height
        if self.dci_code_tsr is not None:
            result['dci_code_tsr'] = self.dci_code_tsr
        if self.dci_code_file_tsr is not None:
            result['dci_code_file_tsr'] = self.dci_code_file_tsr
        if self.pre_reg_cert_tsr is not None:
            result['pre_reg_cert_tsr'] = self.pre_reg_cert_tsr
        if self.pre_reg_cert_file_id is not None:
            result['pre_reg_cert_file_id'] = self.pre_reg_cert_file_id
        if self.pre_reg_cert_file_hash is not None:
            result['pre_reg_cert_file_hash'] = self.pre_reg_cert_file_hash
        if self.pre_reg_cert_url is not None:
            result['pre_reg_cert_url'] = self.pre_reg_cert_url
        if self.png_file_id is not None:
            result['png_file_id'] = self.png_file_id
        if self.apply_obtain_date is not None:
            result['apply_obtain_date'] = self.apply_obtain_date
        if self.dci_code_obtain_date is not None:
            result['dci_code_obtain_date'] = self.dci_code_obtain_date
        if self.error_reason is not None:
            result['error_reason'] = self.error_reason
        if self.error_reason_cn is not None:
            result['error_reason_cn'] = self.error_reason_cn
        if self.publication_url is not None:
            result['publication_url'] = self.publication_url
        if self.apply_type is not None:
            result['apply_type'] = self.apply_type
        result['series_diagram_error_reason_list'] = []
        if self.series_diagram_error_reason_list is not None:
            for k in self.series_diagram_error_reason_list:
                result['series_diagram_error_reason_list'].append(k.to_map() if k else None)
        if self.contains_image_info is not None:
            result['contains_image_info'] = self.contains_image_info.to_map()
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
        if m.get('file_hash') is not None:
            self.file_hash = m.get('file_hash')
        if m.get('file_hash_tx_hash') is not None:
            self.file_hash_tx_hash = m.get('file_hash_tx_hash')
        if m.get('file_hash_block_height') is not None:
            self.file_hash_block_height = m.get('file_hash_block_height')
        if m.get('dci_code') is not None:
            self.dci_code = m.get('dci_code')
        if m.get('dci_code_tx_hash') is not None:
            self.dci_code_tx_hash = m.get('dci_code_tx_hash')
        if m.get('dci_code_block_height') is not None:
            self.dci_code_block_height = m.get('dci_code_block_height')
        if m.get('dci_code_file_tx_hash') is not None:
            self.dci_code_file_tx_hash = m.get('dci_code_file_tx_hash')
        if m.get('dci_code_file_block_height') is not None:
            self.dci_code_file_block_height = m.get('dci_code_file_block_height')
        if m.get('pre_reg_cert_tx_hash') is not None:
            self.pre_reg_cert_tx_hash = m.get('pre_reg_cert_tx_hash')
        if m.get('pre_reg_cert_block_height') is not None:
            self.pre_reg_cert_block_height = m.get('pre_reg_cert_block_height')
        if m.get('cancel_tx_hash') is not None:
            self.cancel_tx_hash = m.get('cancel_tx_hash')
        if m.get('cancel_block_height') is not None:
            self.cancel_block_height = m.get('cancel_block_height')
        if m.get('dci_code_tsr') is not None:
            self.dci_code_tsr = m.get('dci_code_tsr')
        if m.get('dci_code_file_tsr') is not None:
            self.dci_code_file_tsr = m.get('dci_code_file_tsr')
        if m.get('pre_reg_cert_tsr') is not None:
            self.pre_reg_cert_tsr = m.get('pre_reg_cert_tsr')
        if m.get('pre_reg_cert_file_id') is not None:
            self.pre_reg_cert_file_id = m.get('pre_reg_cert_file_id')
        if m.get('pre_reg_cert_file_hash') is not None:
            self.pre_reg_cert_file_hash = m.get('pre_reg_cert_file_hash')
        if m.get('pre_reg_cert_url') is not None:
            self.pre_reg_cert_url = m.get('pre_reg_cert_url')
        if m.get('png_file_id') is not None:
            self.png_file_id = m.get('png_file_id')
        if m.get('apply_obtain_date') is not None:
            self.apply_obtain_date = m.get('apply_obtain_date')
        if m.get('dci_code_obtain_date') is not None:
            self.dci_code_obtain_date = m.get('dci_code_obtain_date')
        if m.get('error_reason') is not None:
            self.error_reason = m.get('error_reason')
        if m.get('error_reason_cn') is not None:
            self.error_reason_cn = m.get('error_reason_cn')
        if m.get('publication_url') is not None:
            self.publication_url = m.get('publication_url')
        if m.get('apply_type') is not None:
            self.apply_type = m.get('apply_type')
        self.series_diagram_error_reason_list = []
        if m.get('series_diagram_error_reason_list') is not None:
            for k in m.get('series_diagram_error_reason_list'):
                temp_model = SeriesDiagramErrorReason()
                self.series_diagram_error_reason_list.append(temp_model.from_map(k))
        if m.get('contains_image_info') is not None:
            temp_model = ContainsImageInfo()
            self.contains_image_info = temp_model.from_map(m['contains_image_info'])
        return self


class AddDciUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cert_name: str = None,
        certificate_type: str = None,
        certificate_number: str = None,
        certificate_front_file_id: str = None,
        certificate_back_file_id: str = None,
        legal_person_cert_name: str = None,
        legal_person_cert_type: str = None,
        legal_person_cert_no: str = None,
        phone: str = None,
        area_type: str = None,
        proxy_data: ProxyData = None,
        copyright_certification_type: str = None,
        client_token: str = None,
        user_name: str = None,
        certificate_start_time: str = None,
        certificate_end_time: str = None,
        certificate_front_file_path: str = None,
        certificate_back_file_path: str = None,
        identity_start_time: str = None,
        user_type: str = None,
        address: str = None,
        long_term_valid: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户名称
        self.cert_name = cert_name
        # 证件类型
        self.certificate_type = certificate_type
        # 证件号
        self.certificate_number = certificate_number
        # 证件正面OSS fileId
        self.certificate_front_file_id = certificate_front_file_id
        # 证件反面OSS fileId
        self.certificate_back_file_id = certificate_back_file_id
        # 法人名称
        self.legal_person_cert_name = legal_person_cert_name
        # 法人证件类型
        self.legal_person_cert_type = legal_person_cert_type
        # 法人证件号
        self.legal_person_cert_no = legal_person_cert_no
        # 手机号
        self.phone = phone
        # 所属地区
        self.area_type = area_type
        # 代理信息
        self.proxy_data = proxy_data
        # 版权认证方式:UGC-用户生成内容，AIGC-AI生成内容，SOFTWARE_WORKS-软件作品认证，如果不传默认为UGC
        self.copyright_certification_type = copyright_certification_type
        # 幂等字段
        self.client_token = client_token
        # 用户名称废弃
        self.user_name = user_name
        # 证件有效期限起始日期
        self.certificate_start_time = certificate_start_time
        # 证件有效期限终止日期
        self.certificate_end_time = certificate_end_time
        # 证件正面OSS fileId废弃
        self.certificate_front_file_path = certificate_front_file_path
        # 证件反面OSS filePath废弃
        self.certificate_back_file_path = certificate_back_file_path
        # 用户身份开始时间
        self.identity_start_time = identity_start_time
        # 用户类型废弃
        self.user_type = user_type
        # 地址
        self.address = address
        # 证件是否长期有效
        self.long_term_valid = long_term_valid

    def validate(self):
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.certificate_type, 'certificate_type')
        self.validate_required(self.certificate_number, 'certificate_number')
        self.validate_required(self.certificate_front_file_id, 'certificate_front_file_id')
        self.validate_required(self.phone, 'phone')
        self.validate_required(self.area_type, 'area_type')
        if self.proxy_data:
            self.proxy_data.validate()
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.certificate_type is not None:
            result['certificate_type'] = self.certificate_type
        if self.certificate_number is not None:
            result['certificate_number'] = self.certificate_number
        if self.certificate_front_file_id is not None:
            result['certificate_front_file_id'] = self.certificate_front_file_id
        if self.certificate_back_file_id is not None:
            result['certificate_back_file_id'] = self.certificate_back_file_id
        if self.legal_person_cert_name is not None:
            result['legal_person_cert_name'] = self.legal_person_cert_name
        if self.legal_person_cert_type is not None:
            result['legal_person_cert_type'] = self.legal_person_cert_type
        if self.legal_person_cert_no is not None:
            result['legal_person_cert_no'] = self.legal_person_cert_no
        if self.phone is not None:
            result['phone'] = self.phone
        if self.area_type is not None:
            result['area_type'] = self.area_type
        if self.proxy_data is not None:
            result['proxy_data'] = self.proxy_data.to_map()
        if self.copyright_certification_type is not None:
            result['copyright_certification_type'] = self.copyright_certification_type
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.certificate_start_time is not None:
            result['certificate_start_time'] = self.certificate_start_time
        if self.certificate_end_time is not None:
            result['certificate_end_time'] = self.certificate_end_time
        if self.certificate_front_file_path is not None:
            result['certificate_front_file_path'] = self.certificate_front_file_path
        if self.certificate_back_file_path is not None:
            result['certificate_back_file_path'] = self.certificate_back_file_path
        if self.identity_start_time is not None:
            result['identity_start_time'] = self.identity_start_time
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.address is not None:
            result['address'] = self.address
        if self.long_term_valid is not None:
            result['long_term_valid'] = self.long_term_valid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('certificate_type') is not None:
            self.certificate_type = m.get('certificate_type')
        if m.get('certificate_number') is not None:
            self.certificate_number = m.get('certificate_number')
        if m.get('certificate_front_file_id') is not None:
            self.certificate_front_file_id = m.get('certificate_front_file_id')
        if m.get('certificate_back_file_id') is not None:
            self.certificate_back_file_id = m.get('certificate_back_file_id')
        if m.get('legal_person_cert_name') is not None:
            self.legal_person_cert_name = m.get('legal_person_cert_name')
        if m.get('legal_person_cert_type') is not None:
            self.legal_person_cert_type = m.get('legal_person_cert_type')
        if m.get('legal_person_cert_no') is not None:
            self.legal_person_cert_no = m.get('legal_person_cert_no')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('area_type') is not None:
            self.area_type = m.get('area_type')
        if m.get('proxy_data') is not None:
            temp_model = ProxyData()
            self.proxy_data = temp_model.from_map(m['proxy_data'])
        if m.get('copyright_certification_type') is not None:
            self.copyright_certification_type = m.get('copyright_certification_type')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('certificate_start_time') is not None:
            self.certificate_start_time = m.get('certificate_start_time')
        if m.get('certificate_end_time') is not None:
            self.certificate_end_time = m.get('certificate_end_time')
        if m.get('certificate_front_file_path') is not None:
            self.certificate_front_file_path = m.get('certificate_front_file_path')
        if m.get('certificate_back_file_path') is not None:
            self.certificate_back_file_path = m.get('certificate_back_file_path')
        if m.get('identity_start_time') is not None:
            self.identity_start_time = m.get('identity_start_time')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('long_term_valid') is not None:
            self.long_term_valid = m.get('long_term_valid')
        return self


class AddDciUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        dci_user_id: str = None,
        dci_user_status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # dci用户id
        self.dci_user_id = dci_user_id
        # dci用户状态
        self.dci_user_status = dci_user_status

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
        if self.dci_user_id is not None:
            result['dci_user_id'] = self.dci_user_id
        if self.dci_user_status is not None:
            result['dci_user_status'] = self.dci_user_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('dci_user_id') is not None:
            self.dci_user_id = m.get('dci_user_id')
        if m.get('dci_user_status') is not None:
            self.dci_user_status = m.get('dci_user_status')
        return self


class RetryDciPreregistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dci_user_id: str = None,
        dci_content_id: str = None,
        proxy_data: ProxyData = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # dci用户id
        self.dci_user_id = dci_user_id
        # dci内容id
        self.dci_content_id = dci_content_id
        # 代理信息
        self.proxy_data = proxy_data
        # 幂等信息
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.dci_user_id, 'dci_user_id')
        self.validate_required(self.dci_content_id, 'dci_content_id')
        self.validate_required(self.proxy_data, 'proxy_data')
        if self.proxy_data:
            self.proxy_data.validate()
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.dci_user_id is not None:
            result['dci_user_id'] = self.dci_user_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        if self.proxy_data is not None:
            result['proxy_data'] = self.proxy_data.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dci_user_id') is not None:
            self.dci_user_id = m.get('dci_user_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        if m.get('proxy_data') is not None:
            temp_model = ProxyData()
            self.proxy_data = temp_model.from_map(m['proxy_data'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class RetryDciPreregistrationResponse(TeaModel):
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


class QueryDciUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        certificate_type: str = None,
        certificate_number: str = None,
        phone: str = None,
        copyright_certification_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 证件类型
        self.certificate_type = certificate_type
        # 证件号
        self.certificate_number = certificate_number
        # 手机号
        self.phone = phone
        # 版权认证方式:UGC-用户生成内容，AIGC-AI生成内容，SOFTWARE_WORKS：软件作品认证，如果不传默认为UGC
        self.copyright_certification_type = copyright_certification_type

    def validate(self):
        self.validate_required(self.certificate_type, 'certificate_type')
        self.validate_required(self.certificate_number, 'certificate_number')
        self.validate_required(self.phone, 'phone')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.certificate_type is not None:
            result['certificate_type'] = self.certificate_type
        if self.certificate_number is not None:
            result['certificate_number'] = self.certificate_number
        if self.phone is not None:
            result['phone'] = self.phone
        if self.copyright_certification_type is not None:
            result['copyright_certification_type'] = self.copyright_certification_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('certificate_type') is not None:
            self.certificate_type = m.get('certificate_type')
        if m.get('certificate_number') is not None:
            self.certificate_number = m.get('certificate_number')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('copyright_certification_type') is not None:
            self.copyright_certification_type = m.get('copyright_certification_type')
        return self


class QueryDciUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        dci_user_id: str = None,
        dci_user_status: str = None,
        name: str = None,
        certificate_type: str = None,
        certificate_number: str = None,
        address: str = None,
        cert_start_time: str = None,
        cert_end_time: str = None,
        legal_person: str = None,
        phone: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # dci用户id
        self.dci_user_id = dci_user_id
        # dci用户状态
        self.dci_user_status = dci_user_status
        # 名称
        self.name = name
        # 证件类型
        self.certificate_type = certificate_type
        # 证件号
        self.certificate_number = certificate_number
        # 地址
        self.address = address
        # 证件有效期开始时间
        self.cert_start_time = cert_start_time
        # 证件有效期结束时间
        self.cert_end_time = cert_end_time
        # 法人名称
        self.legal_person = legal_person
        # 联系电话
        self.phone = phone

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
        if self.dci_user_id is not None:
            result['dci_user_id'] = self.dci_user_id
        if self.dci_user_status is not None:
            result['dci_user_status'] = self.dci_user_status
        if self.name is not None:
            result['name'] = self.name
        if self.certificate_type is not None:
            result['certificate_type'] = self.certificate_type
        if self.certificate_number is not None:
            result['certificate_number'] = self.certificate_number
        if self.address is not None:
            result['address'] = self.address
        if self.cert_start_time is not None:
            result['cert_start_time'] = self.cert_start_time
        if self.cert_end_time is not None:
            result['cert_end_time'] = self.cert_end_time
        if self.legal_person is not None:
            result['legal_person'] = self.legal_person
        if self.phone is not None:
            result['phone'] = self.phone
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('dci_user_id') is not None:
            self.dci_user_id = m.get('dci_user_id')
        if m.get('dci_user_status') is not None:
            self.dci_user_status = m.get('dci_user_status')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('certificate_type') is not None:
            self.certificate_type = m.get('certificate_type')
        if m.get('certificate_number') is not None:
            self.certificate_number = m.get('certificate_number')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('cert_start_time') is not None:
            self.cert_start_time = m.get('cert_start_time')
        if m.get('cert_end_time') is not None:
            self.cert_end_time = m.get('cert_end_time')
        if m.get('legal_person') is not None:
            self.legal_person = m.get('legal_person')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        return self


class QueryDciPreregpublicationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dci_content_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 作品id
        self.dci_content_id = dci_content_id

    def validate(self):
        self.validate_required(self.dci_content_id, 'dci_content_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        return self


class QueryDciPreregpublicationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        publication_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 供核验公示地址
        self.publication_url = publication_url

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
        if self.publication_url is not None:
            result['publication_url'] = self.publication_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('publication_url') is not None:
            self.publication_url = m.get('publication_url')
        return self


class UpdateDciUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dci_user_id: str = None,
        cert_front_file_id: str = None,
        cert_back_file_id: str = None,
        phone: str = None,
        client_token: str = None,
        copyright_certification_type: str = None,
        legal_person_info: EnterpriseLegalPersonInfo = None,
        long_term_valid: bool = None,
        certificate_start_time: str = None,
        certificate_end_time: str = None,
        identity_start_time: str = None,
        address: str = None,
        cert_name: str = None,
        certificate_number: str = None,
        certificate_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # dci用户ID
        self.dci_user_id = dci_user_id
        # 证件正面oss fileId
        self.cert_front_file_id = cert_front_file_id
        # 证件背面oss fileId
        self.cert_back_file_id = cert_back_file_id
        # 手机号
        self.phone = phone
        # 客户端令牌
        self.client_token = client_token
        # 版权认证方式:UGC-用户生成内容，AIGC-AI生成内容，SOFTWARE_WORKS-软件作品认证，如果不传默认为UGC
        self.copyright_certification_type = copyright_certification_type
        # 法人信息
        self.legal_person_info = legal_person_info
        # true,false
        self.long_term_valid = long_term_valid
        # 证件有效期开始时间
        self.certificate_start_time = certificate_start_time
        # 证件有效期终止时间
        self.certificate_end_time = certificate_end_time
        # 成立日期或出生日期
        self.identity_start_time = identity_start_time
        # 地址信息
        self.address = address
        # 著作权人名称
        self.cert_name = cert_name
        # 著作权人证件号
        self.certificate_number = certificate_number
        # 著作权人证件类型
        self.certificate_type = certificate_type

    def validate(self):
        self.validate_required(self.dci_user_id, 'dci_user_id')
        self.validate_required(self.cert_front_file_id, 'cert_front_file_id')
        if self.legal_person_info:
            self.legal_person_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.dci_user_id is not None:
            result['dci_user_id'] = self.dci_user_id
        if self.cert_front_file_id is not None:
            result['cert_front_file_id'] = self.cert_front_file_id
        if self.cert_back_file_id is not None:
            result['cert_back_file_id'] = self.cert_back_file_id
        if self.phone is not None:
            result['phone'] = self.phone
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.copyright_certification_type is not None:
            result['copyright_certification_type'] = self.copyright_certification_type
        if self.legal_person_info is not None:
            result['legal_person_info'] = self.legal_person_info.to_map()
        if self.long_term_valid is not None:
            result['long_term_valid'] = self.long_term_valid
        if self.certificate_start_time is not None:
            result['certificate_start_time'] = self.certificate_start_time
        if self.certificate_end_time is not None:
            result['certificate_end_time'] = self.certificate_end_time
        if self.identity_start_time is not None:
            result['identity_start_time'] = self.identity_start_time
        if self.address is not None:
            result['address'] = self.address
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.certificate_number is not None:
            result['certificate_number'] = self.certificate_number
        if self.certificate_type is not None:
            result['certificate_type'] = self.certificate_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dci_user_id') is not None:
            self.dci_user_id = m.get('dci_user_id')
        if m.get('cert_front_file_id') is not None:
            self.cert_front_file_id = m.get('cert_front_file_id')
        if m.get('cert_back_file_id') is not None:
            self.cert_back_file_id = m.get('cert_back_file_id')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('copyright_certification_type') is not None:
            self.copyright_certification_type = m.get('copyright_certification_type')
        if m.get('legal_person_info') is not None:
            temp_model = EnterpriseLegalPersonInfo()
            self.legal_person_info = temp_model.from_map(m['legal_person_info'])
        if m.get('long_term_valid') is not None:
            self.long_term_valid = m.get('long_term_valid')
        if m.get('certificate_start_time') is not None:
            self.certificate_start_time = m.get('certificate_start_time')
        if m.get('certificate_end_time') is not None:
            self.certificate_end_time = m.get('certificate_end_time')
        if m.get('identity_start_time') is not None:
            self.identity_start_time = m.get('identity_start_time')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('certificate_number') is not None:
            self.certificate_number = m.get('certificate_number')
        if m.get('certificate_type') is not None:
            self.certificate_type = m.get('certificate_type')
        return self


class UpdateDciUserResponse(TeaModel):
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


class CreateDciRegistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dci_content_id: str = None,
        explanation_info: DciExplanationInfo = None,
        additional_file_info: AdditionalFileInfo = None,
        invoice_info: InvoiceInfo = None,
        client_token: str = None,
        creation_statement: str = None,
        ancillary_evidence_path_list: List[str] = None,
        applyer_contact_info: ContactInfo = None,
        platform_contact_info: ContactInfo = None,
        right_scope_desc: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # DC123456
        self.dci_content_id = dci_content_id
        # 数登申请声明
        self.explanation_info = explanation_info
        # 补充文件相关信息
        self.additional_file_info = additional_file_info
        # 发票信息--当前支持普票
        self.invoice_info = invoice_info
        # 幂等字段
        self.client_token = client_token
        # 废弃待删除
        self.creation_statement = creation_statement
        # 废弃待删除
        self.ancillary_evidence_path_list = ancillary_evidence_path_list
        # 申领人联系信息
        self.applyer_contact_info = applyer_contact_info
        # 代理人联系信息
        self.platform_contact_info = platform_contact_info
        # 权利描述
        self.right_scope_desc = right_scope_desc

    def validate(self):
        self.validate_required(self.dci_content_id, 'dci_content_id')
        self.validate_required(self.explanation_info, 'explanation_info')
        if self.explanation_info:
            self.explanation_info.validate()
        if self.additional_file_info:
            self.additional_file_info.validate()
        if self.invoice_info:
            self.invoice_info.validate()
        self.validate_required(self.client_token, 'client_token')
        if self.applyer_contact_info:
            self.applyer_contact_info.validate()
        if self.platform_contact_info:
            self.platform_contact_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        if self.explanation_info is not None:
            result['explanation_info'] = self.explanation_info.to_map()
        if self.additional_file_info is not None:
            result['additional_file_info'] = self.additional_file_info.to_map()
        if self.invoice_info is not None:
            result['invoice_info'] = self.invoice_info.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.creation_statement is not None:
            result['creation_statement'] = self.creation_statement
        if self.ancillary_evidence_path_list is not None:
            result['ancillary_evidence_path_list'] = self.ancillary_evidence_path_list
        if self.applyer_contact_info is not None:
            result['applyer_contact_info'] = self.applyer_contact_info.to_map()
        if self.platform_contact_info is not None:
            result['platform_contact_info'] = self.platform_contact_info.to_map()
        if self.right_scope_desc is not None:
            result['right_scope_desc'] = self.right_scope_desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        if m.get('explanation_info') is not None:
            temp_model = DciExplanationInfo()
            self.explanation_info = temp_model.from_map(m['explanation_info'])
        if m.get('additional_file_info') is not None:
            temp_model = AdditionalFileInfo()
            self.additional_file_info = temp_model.from_map(m['additional_file_info'])
        if m.get('invoice_info') is not None:
            temp_model = InvoiceInfo()
            self.invoice_info = temp_model.from_map(m['invoice_info'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('creation_statement') is not None:
            self.creation_statement = m.get('creation_statement')
        if m.get('ancillary_evidence_path_list') is not None:
            self.ancillary_evidence_path_list = m.get('ancillary_evidence_path_list')
        if m.get('applyer_contact_info') is not None:
            temp_model = ContactInfo()
            self.applyer_contact_info = temp_model.from_map(m['applyer_contact_info'])
        if m.get('platform_contact_info') is not None:
            temp_model = ContactInfo()
            self.platform_contact_info = temp_model.from_map(m['platform_contact_info'])
        if m.get('right_scope_desc') is not None:
            self.right_scope_desc = m.get('right_scope_desc')
        return self


class CreateDciRegistrationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        digital_register_id: str = None,
        error_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数登申请id
        self.digital_register_id = digital_register_id
        # 错误信息
        self.error_msg = error_msg

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
        if self.digital_register_id is not None:
            result['digital_register_id'] = self.digital_register_id
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('digital_register_id') is not None:
            self.digital_register_id = m.get('digital_register_id')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class QueryDciRegistrationsubmitRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dci_content_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # dci内容id
        self.dci_content_id = dci_content_id

    def validate(self):
        self.validate_required(self.dci_content_id, 'dci_content_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        return self


class QueryDciRegistrationsubmitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content_status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数登提交状态
        self.content_status = content_status

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
        if self.content_status is not None:
            result['content_status'] = self.content_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('content_status') is not None:
            self.content_status = m.get('content_status')
        return self


class QueryDciRegistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        digital_register_id: str = None,
        dci_content_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数登申请id
        self.digital_register_id = digital_register_id
        # dci申领id
        self.dci_content_id = dci_content_id

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
        if self.digital_register_id is not None:
            result['digital_register_id'] = self.digital_register_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('digital_register_id') is not None:
            self.digital_register_id = m.get('digital_register_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        return self


class QueryDciRegistrationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content_status: str = None,
        register_cert_tx_hash: str = None,
        register_cert_block_height: str = None,
        register_cert_tsr: str = None,
        register_cert_png_file_id: str = None,
        register_sample_file_id: str = None,
        register_sample_png_file_id: str = None,
        register_download_times_left: int = None,
        error_reason: str = None,
        error_reason_cn: str = None,
        invoice_file_id_list: List[str] = None,
        apply_register_time: str = None,
        reg_number: str = None,
        digital_register_id: str = None,
        dci_content_id: str = None,
        digital_register_status: str = None,
        digital_register_apply_time: str = None,
        digital_register_completion_time: str = None,
        digital_register_cert_png_url: str = None,
        digital_register_sample_png_url: str = None,
        download_times_left: int = None,
        invoice_url_list: List[str] = None,
        fail_detail: str = None,
        amend_type: str = None,
        apply_form_url: str = None,
        flow_number: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 废弃待删除
        self.content_status = content_status
        # 废弃待删除
        self.register_cert_tx_hash = register_cert_tx_hash
        # 废弃待删除
        self.register_cert_block_height = register_cert_block_height
        # 废弃待删除
        self.register_cert_tsr = register_cert_tsr
        # 废弃待删除
        self.register_cert_png_file_id = register_cert_png_file_id
        # 废弃待删除
        self.register_sample_file_id = register_sample_file_id
        # 废弃待删除
        self.register_sample_png_file_id = register_sample_png_file_id
        # 废弃待删除
        self.register_download_times_left = register_download_times_left
        # 废弃待删除
        self.error_reason = error_reason
        # 废弃待删除
        self.error_reason_cn = error_reason_cn
        # 废弃待删除
        self.invoice_file_id_list = invoice_file_id_list
        # 废弃待删除
        self.apply_register_time = apply_register_time
        # 数登登记号
        self.reg_number = reg_number
        # 数登id
        self.digital_register_id = digital_register_id
        # dci申领id
        self.dci_content_id = dci_content_id
        # 数登状态
        self.digital_register_status = digital_register_status
        # 数登申请时间
        self.digital_register_apply_time = digital_register_apply_time
        # 数登完成时间
        self.digital_register_completion_time = digital_register_completion_time
        # 数登证书预览图url
        self.digital_register_cert_png_url = digital_register_cert_png_url
        # 样本证书预览图url
        self.digital_register_sample_png_url = digital_register_sample_png_url
        # 证书本月剩余下载次数
        self.download_times_left = download_times_left
        # 发票下载链接list
        self.invoice_url_list = invoice_url_list
        # 数登失败详情
        self.fail_detail = fail_detail
        # 补正类型
        self.amend_type = amend_type
        # 用户申请表url
        self.apply_form_url = apply_form_url
        # 数登流水号
        self.flow_number = flow_number

    def validate(self):
        if self.apply_register_time is not None:
            self.validate_pattern(self.apply_register_time, 'apply_register_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.digital_register_apply_time is not None:
            self.validate_pattern(self.digital_register_apply_time, 'digital_register_apply_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.digital_register_completion_time is not None:
            self.validate_pattern(self.digital_register_completion_time, 'digital_register_completion_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.content_status is not None:
            result['content_status'] = self.content_status
        if self.register_cert_tx_hash is not None:
            result['register_cert_tx_hash'] = self.register_cert_tx_hash
        if self.register_cert_block_height is not None:
            result['register_cert_block_height'] = self.register_cert_block_height
        if self.register_cert_tsr is not None:
            result['register_cert_tsr'] = self.register_cert_tsr
        if self.register_cert_png_file_id is not None:
            result['register_cert_png_file_id'] = self.register_cert_png_file_id
        if self.register_sample_file_id is not None:
            result['register_sample_file_id'] = self.register_sample_file_id
        if self.register_sample_png_file_id is not None:
            result['register_sample_png_file_id'] = self.register_sample_png_file_id
        if self.register_download_times_left is not None:
            result['register_download_times_left'] = self.register_download_times_left
        if self.error_reason is not None:
            result['error_reason'] = self.error_reason
        if self.error_reason_cn is not None:
            result['error_reason_cn'] = self.error_reason_cn
        if self.invoice_file_id_list is not None:
            result['invoice_file_id_list'] = self.invoice_file_id_list
        if self.apply_register_time is not None:
            result['apply_register_time'] = self.apply_register_time
        if self.reg_number is not None:
            result['reg_number'] = self.reg_number
        if self.digital_register_id is not None:
            result['digital_register_id'] = self.digital_register_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        if self.digital_register_status is not None:
            result['digital_register_status'] = self.digital_register_status
        if self.digital_register_apply_time is not None:
            result['digital_register_apply_time'] = self.digital_register_apply_time
        if self.digital_register_completion_time is not None:
            result['digital_register_completion_time'] = self.digital_register_completion_time
        if self.digital_register_cert_png_url is not None:
            result['digital_register_cert_png_url'] = self.digital_register_cert_png_url
        if self.digital_register_sample_png_url is not None:
            result['digital_register_sample_png_url'] = self.digital_register_sample_png_url
        if self.download_times_left is not None:
            result['download_times_left'] = self.download_times_left
        if self.invoice_url_list is not None:
            result['invoice_url_list'] = self.invoice_url_list
        if self.fail_detail is not None:
            result['fail_detail'] = self.fail_detail
        if self.amend_type is not None:
            result['amend_type'] = self.amend_type
        if self.apply_form_url is not None:
            result['apply_form_url'] = self.apply_form_url
        if self.flow_number is not None:
            result['flow_number'] = self.flow_number
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('content_status') is not None:
            self.content_status = m.get('content_status')
        if m.get('register_cert_tx_hash') is not None:
            self.register_cert_tx_hash = m.get('register_cert_tx_hash')
        if m.get('register_cert_block_height') is not None:
            self.register_cert_block_height = m.get('register_cert_block_height')
        if m.get('register_cert_tsr') is not None:
            self.register_cert_tsr = m.get('register_cert_tsr')
        if m.get('register_cert_png_file_id') is not None:
            self.register_cert_png_file_id = m.get('register_cert_png_file_id')
        if m.get('register_sample_file_id') is not None:
            self.register_sample_file_id = m.get('register_sample_file_id')
        if m.get('register_sample_png_file_id') is not None:
            self.register_sample_png_file_id = m.get('register_sample_png_file_id')
        if m.get('register_download_times_left') is not None:
            self.register_download_times_left = m.get('register_download_times_left')
        if m.get('error_reason') is not None:
            self.error_reason = m.get('error_reason')
        if m.get('error_reason_cn') is not None:
            self.error_reason_cn = m.get('error_reason_cn')
        if m.get('invoice_file_id_list') is not None:
            self.invoice_file_id_list = m.get('invoice_file_id_list')
        if m.get('apply_register_time') is not None:
            self.apply_register_time = m.get('apply_register_time')
        if m.get('reg_number') is not None:
            self.reg_number = m.get('reg_number')
        if m.get('digital_register_id') is not None:
            self.digital_register_id = m.get('digital_register_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        if m.get('digital_register_status') is not None:
            self.digital_register_status = m.get('digital_register_status')
        if m.get('digital_register_apply_time') is not None:
            self.digital_register_apply_time = m.get('digital_register_apply_time')
        if m.get('digital_register_completion_time') is not None:
            self.digital_register_completion_time = m.get('digital_register_completion_time')
        if m.get('digital_register_cert_png_url') is not None:
            self.digital_register_cert_png_url = m.get('digital_register_cert_png_url')
        if m.get('digital_register_sample_png_url') is not None:
            self.digital_register_sample_png_url = m.get('digital_register_sample_png_url')
        if m.get('download_times_left') is not None:
            self.download_times_left = m.get('download_times_left')
        if m.get('invoice_url_list') is not None:
            self.invoice_url_list = m.get('invoice_url_list')
        if m.get('fail_detail') is not None:
            self.fail_detail = m.get('fail_detail')
        if m.get('amend_type') is not None:
            self.amend_type = m.get('amend_type')
        if m.get('apply_form_url') is not None:
            self.apply_form_url = m.get('apply_form_url')
        if m.get('flow_number') is not None:
            self.flow_number = m.get('flow_number')
        return self


class GetDciRegistrationcertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        digital_register_id: str = None,
        client_token: str = None,
        dci_content_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数登申请id
        self.digital_register_id = digital_register_id
        # 幂等字段
        self.client_token = client_token
        # 废弃待删除
        self.dci_content_id = dci_content_id

    def validate(self):
        self.validate_required(self.digital_register_id, 'digital_register_id')
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.digital_register_id is not None:
            result['digital_register_id'] = self.digital_register_id
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('digital_register_id') is not None:
            self.digital_register_id = m.get('digital_register_id')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        return self


class GetDciRegistrationcertResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        cert_status: str = None,
        certificate_url: str = None,
        error_reason: str = None,
        error_reason_cn: str = None,
        digital_register_status: str = None,
        download_url: str = None,
        download_times_left: int = None,
        fail_detail: str = None,
        digital_register_cert_url: str = None,
        digital_register_sample_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 废弃待删除
        self.cert_status = cert_status
        # 废弃待删除
        self.certificate_url = certificate_url
        # 废弃待删除
        self.error_reason = error_reason
        # 废弃待删除
        self.error_reason_cn = error_reason_cn
        # 数登状态
        self.digital_register_status = digital_register_status
        # 数登证书&样本证书压缩包url
        self.download_url = download_url
        # 剩余下载次数
        self.download_times_left = download_times_left
        # 失败详情
        self.fail_detail = fail_detail
        # 数登证书下载链接
        self.digital_register_cert_url = digital_register_cert_url
        # 数登样本证书下载链接
        self.digital_register_sample_url = digital_register_sample_url

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
        if self.cert_status is not None:
            result['cert_status'] = self.cert_status
        if self.certificate_url is not None:
            result['certificate_url'] = self.certificate_url
        if self.error_reason is not None:
            result['error_reason'] = self.error_reason
        if self.error_reason_cn is not None:
            result['error_reason_cn'] = self.error_reason_cn
        if self.digital_register_status is not None:
            result['digital_register_status'] = self.digital_register_status
        if self.download_url is not None:
            result['download_url'] = self.download_url
        if self.download_times_left is not None:
            result['download_times_left'] = self.download_times_left
        if self.fail_detail is not None:
            result['fail_detail'] = self.fail_detail
        if self.digital_register_cert_url is not None:
            result['digital_register_cert_url'] = self.digital_register_cert_url
        if self.digital_register_sample_url is not None:
            result['digital_register_sample_url'] = self.digital_register_sample_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('cert_status') is not None:
            self.cert_status = m.get('cert_status')
        if m.get('certificate_url') is not None:
            self.certificate_url = m.get('certificate_url')
        if m.get('error_reason') is not None:
            self.error_reason = m.get('error_reason')
        if m.get('error_reason_cn') is not None:
            self.error_reason_cn = m.get('error_reason_cn')
        if m.get('digital_register_status') is not None:
            self.digital_register_status = m.get('digital_register_status')
        if m.get('download_url') is not None:
            self.download_url = m.get('download_url')
        if m.get('download_times_left') is not None:
            self.download_times_left = m.get('download_times_left')
        if m.get('fail_detail') is not None:
            self.fail_detail = m.get('fail_detail')
        if m.get('digital_register_cert_url') is not None:
            self.digital_register_cert_url = m.get('digital_register_cert_url')
        if m.get('digital_register_sample_url') is not None:
            self.digital_register_sample_url = m.get('digital_register_sample_url')
        return self


class QueryDciContentsecurityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        flow_number: str = None,
        client_token: str = None,
        task_id: str = None,
        work_name: str = None,
        work_hash: str = None,
        work_category: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID(数登流水号)
        self.flow_number = flow_number
        # 客户端令牌
        self.client_token = client_token
        # 任务Id, 已废弃
        self.task_id = task_id
        # 作品名，已废弃
        self.work_name = work_name
        # 作品Hash，已废弃
        self.work_hash = work_hash
        # 作品分类，已废弃
        self.work_category = work_category

    def validate(self):
        self.validate_required(self.flow_number, 'flow_number')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.flow_number is not None:
            result['flow_number'] = self.flow_number
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.work_name is not None:
            result['work_name'] = self.work_name
        if self.work_hash is not None:
            result['work_hash'] = self.work_hash
        if self.work_category is not None:
            result['work_category'] = self.work_category
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('flow_number') is not None:
            self.flow_number = m.get('flow_number')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('work_name') is not None:
            self.work_name = m.get('work_name')
        if m.get('work_hash') is not None:
            self.work_hash = m.get('work_hash')
        if m.get('work_category') is not None:
            self.work_category = m.get('work_category')
        return self


class QueryDciContentsecurityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        work_type: str = None,
        review_data: ReviewData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 作品类型
        self.work_type = work_type
        # 审查结果
        self.review_data = review_data

    def validate(self):
        if self.review_data:
            self.review_data.validate()

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
        if self.work_type is not None:
            result['work_type'] = self.work_type
        if self.review_data is not None:
            result['review_data'] = self.review_data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('work_type') is not None:
            self.work_type = m.get('work_type')
        if m.get('review_data') is not None:
            temp_model = ReviewData()
            self.review_data = temp_model.from_map(m['review_data'])
        return self


class CreateDciRegistrationcertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
        user_id: str = None,
        dci_code: str = None,
        reg_number: str = None,
        qr_code_url: str = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id
        # 版权用户ID
        self.user_id = user_id
        # DCI码
        self.dci_code = dci_code
        # 登记号
        self.reg_number = reg_number
        # 二维码
        self.qr_code_url = qr_code_url
        # 客户端token
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.dci_code, 'dci_code')
        self.validate_required(self.reg_number, 'reg_number')
        self.validate_required(self.qr_code_url, 'qr_code_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.dci_code is not None:
            result['dci_code'] = self.dci_code
        if self.reg_number is not None:
            result['reg_number'] = self.reg_number
        if self.qr_code_url is not None:
            result['qr_code_url'] = self.qr_code_url
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('dci_code') is not None:
            self.dci_code = m.get('dci_code')
        if m.get('reg_number') is not None:
            self.reg_number = m.get('reg_number')
        if m.get('qr_code_url') is not None:
            self.qr_code_url = m.get('qr_code_url')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class CreateDciRegistrationcertResponse(TeaModel):
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


class QueryDciRegistrationcertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryDciRegistrationcertResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        certificate_data: CertificateData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 证书信息
        self.certificate_data = certificate_data

    def validate(self):
        if self.certificate_data:
            self.certificate_data.validate()

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
        if self.certificate_data is not None:
            result['certificate_data'] = self.certificate_data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('certificate_data') is not None:
            temp_model = CertificateData()
            self.certificate_data = temp_model.from_map(m['certificate_data'])
        return self


class GetDciPayurlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        digital_register_id: str = None,
        client_token: str = None,
        dci_user_id: str = None,
        dci_content_id: str = None,
        pay_ment: str = None,
        invoice_info: InvoiceInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数登申请id
        self.digital_register_id = digital_register_id
        # 幂等字段
        self.client_token = client_token
        # 废弃待删除
        self.dci_user_id = dci_user_id
        # 废弃待删除
        self.dci_content_id = dci_content_id
        # 废弃待删除
        self.pay_ment = pay_ment
        # 废弃待删除
        self.invoice_info = invoice_info

    def validate(self):
        self.validate_required(self.digital_register_id, 'digital_register_id')
        self.validate_required(self.client_token, 'client_token')
        if self.invoice_info:
            self.invoice_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.digital_register_id is not None:
            result['digital_register_id'] = self.digital_register_id
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.dci_user_id is not None:
            result['dci_user_id'] = self.dci_user_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        if self.pay_ment is not None:
            result['pay_ment'] = self.pay_ment
        if self.invoice_info is not None:
            result['invoice_info'] = self.invoice_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('digital_register_id') is not None:
            self.digital_register_id = m.get('digital_register_id')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('dci_user_id') is not None:
            self.dci_user_id = m.get('dci_user_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        if m.get('pay_ment') is not None:
            self.pay_ment = m.get('pay_ment')
        if m.get('invoice_info') is not None:
            temp_model = InvoiceInfo()
            self.invoice_info = temp_model.from_map(m['invoice_info'])
        return self


class GetDciPayurlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pay_url: str = None,
        error_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 支付链接
        self.pay_url = pay_url
        # 错误信息
        self.error_msg = error_msg

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
        if self.pay_url is not None:
            result['pay_url'] = self.pay_url
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pay_url') is not None:
            self.pay_url = m.get('pay_url')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class QueryDciPayRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        digital_register_id: str = None,
        dci_user_id: str = None,
        dci_content_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数登申请id
        self.digital_register_id = digital_register_id
        # 废弃待删除
        self.dci_user_id = dci_user_id
        # 废弃待删除
        self.dci_content_id = dci_content_id

    def validate(self):
        self.validate_required(self.digital_register_id, 'digital_register_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.digital_register_id is not None:
            result['digital_register_id'] = self.digital_register_id
        if self.dci_user_id is not None:
            result['dci_user_id'] = self.dci_user_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('digital_register_id') is not None:
            self.digital_register_id = m.get('digital_register_id')
        if m.get('dci_user_id') is not None:
            self.dci_user_id = m.get('dci_user_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        return self


class QueryDciPayResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pay_status: str = None,
        pay_state: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 支付状态
        # （INIT 用户点击支付，待获取链接；GET_PAY_URL_FAIL 获取支付链接失败；PAY_FAIL 支付失败；TIMEOUT 支付超时；PAY_SUCCESS 支付成功；PAYING 支付中；PAY_EXCEPTION	支付异常，待重试）
        self.pay_status = pay_status
        # 废弃待删除
        self.pay_state = pay_state

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
        if self.pay_status is not None:
            result['pay_status'] = self.pay_status
        if self.pay_state is not None:
            result['pay_state'] = self.pay_state
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pay_status') is not None:
            self.pay_status = m.get('pay_status')
        if m.get('pay_state') is not None:
            self.pay_state = m.get('pay_state')
        return self


class CallbackDciPayresultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
        app_id: str = None,
        order_id: str = None,
        pay_ment: str = None,
        money: str = None,
        result_content: str = None,
        code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 与中心约定的任务ID，同一个作品可能会发起多次登记
        self.task_id = task_id
        # 平台Id
        self.app_id = app_id
        # 订单ID
        self.order_id = order_id
        # 支付方式 (ALIPAY,0,支付宝)
        self.pay_ment = pay_ment
        # 订单金额
        self.money = money
        # 结果描述，如：支付成功
        self.result_content = result_content
        # 状态，2001代表支付成功
        self.code = code

    def validate(self):
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.pay_ment, 'pay_ment')
        self.validate_required(self.money, 'money')
        self.validate_required(self.result_content, 'result_content')
        self.validate_required(self.code, 'code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.pay_ment is not None:
            result['pay_ment'] = self.pay_ment
        if self.money is not None:
            result['money'] = self.money
        if self.result_content is not None:
            result['result_content'] = self.result_content
        if self.code is not None:
            result['code'] = self.code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('pay_ment') is not None:
            self.pay_ment = m.get('pay_ment')
        if m.get('money') is not None:
            self.money = m.get('money')
        if m.get('result_content') is not None:
            self.result_content = m.get('result_content')
        if m.get('code') is not None:
            self.code = m.get('code')
        return self


class CallbackDciPayresultResponse(TeaModel):
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


class RefuseDciRegistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
        code: str = None,
        fail_detail: str = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id
        # 复审失败原因
        self.code = code
        # 失败详情
        self.fail_detail = fail_detail
        # 幂等字段
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.code, 'code')
        self.validate_required(self.fail_detail, 'fail_detail')
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.code is not None:
            result['code'] = self.code
        if self.fail_detail is not None:
            result['fail_detail'] = self.fail_detail
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('fail_detail') is not None:
            self.fail_detail = m.get('fail_detail')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class RefuseDciRegistrationResponse(TeaModel):
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


class QueryNotaryBidreasonRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        org_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 公证处 ID
        self.org_id = org_id

    def validate(self):
        self.validate_required(self.org_id, 'org_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.org_id is not None:
            result['org_id'] = self.org_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        return self


class QueryNotaryBidreasonResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        bid_reason_list: List[BidReason] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 申办事由列表
        self.bid_reason_list = bid_reason_list

    def validate(self):
        if self.bid_reason_list:
            for k in self.bid_reason_list:
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
        result['bid_reason_list'] = []
        if self.bid_reason_list is not None:
            for k in self.bid_reason_list:
                result['bid_reason_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.bid_reason_list = []
        if m.get('bid_reason_list') is not None:
            for k in m.get('bid_reason_list'):
                temp_model = BidReason()
                self.bid_reason_list.append(temp_model.from_map(k))
        return self


class QueryNotaryDocumenttosignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        applicant_list: List[NotaryUser] = None,
        agent: NotaryUser = None,
        receive_info: ReceiveInfo = None,
        preservation: str = None,
        org_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 申请人信息
        self.applicant_list = applicant_list
        # 经办人信息
        self.agent = agent
        # 送达信息
        self.receive_info = receive_info
        # 保全内容
        self.preservation = preservation
        # 公证处id
        self.org_id = org_id

    def validate(self):
        self.validate_required(self.applicant_list, 'applicant_list')
        if self.applicant_list:
            for k in self.applicant_list:
                if k:
                    k.validate()
        self.validate_required(self.agent, 'agent')
        if self.agent:
            self.agent.validate()
        self.validate_required(self.receive_info, 'receive_info')
        if self.receive_info:
            self.receive_info.validate()
        self.validate_required(self.preservation, 'preservation')
        self.validate_required(self.org_id, 'org_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        result['applicant_list'] = []
        if self.applicant_list is not None:
            for k in self.applicant_list:
                result['applicant_list'].append(k.to_map() if k else None)
        if self.agent is not None:
            result['agent'] = self.agent.to_map()
        if self.receive_info is not None:
            result['receive_info'] = self.receive_info.to_map()
        if self.preservation is not None:
            result['preservation'] = self.preservation
        if self.org_id is not None:
            result['org_id'] = self.org_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.applicant_list = []
        if m.get('applicant_list') is not None:
            for k in m.get('applicant_list'):
                temp_model = NotaryUser()
                self.applicant_list.append(temp_model.from_map(k))
        if m.get('agent') is not None:
            temp_model = NotaryUser()
            self.agent = temp_model.from_map(m['agent'])
        if m.get('receive_info') is not None:
            temp_model = ReceiveInfo()
            self.receive_info = temp_model.from_map(m['receive_info'])
        if m.get('preservation') is not None:
            self.preservation = m.get('preservation')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        return self


class QueryNotaryDocumenttosignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_document_list: List[SignDocument] = None,
        preview_time: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 需要用户签署的文件列表
        self.sign_document_list = sign_document_list
        # 生成文件的时间，需要在提交申办接口传入
        self.preview_time = preview_time

    def validate(self):
        if self.sign_document_list:
            for k in self.sign_document_list:
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
        result['sign_document_list'] = []
        if self.sign_document_list is not None:
            for k in self.sign_document_list:
                result['sign_document_list'].append(k.to_map() if k else None)
        if self.preview_time is not None:
            result['preview_time'] = self.preview_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.sign_document_list = []
        if m.get('sign_document_list') is not None:
            for k in m.get('sign_document_list'):
                temp_model = SignDocument()
                self.sign_document_list.append(temp_model.from_map(k))
        if m.get('preview_time') is not None:
            self.preview_time = m.get('preview_time')
        return self


class ApplyNotaryOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        notary_apply_info: NotaryApplyInfo = None,
        notary_receive_info: NotaryReceiveInfo = None,
        preview_time: int = None,
        agree_time: int = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 公证出证申请信息
        self.notary_apply_info = notary_apply_info
        # 公证出证收件信息
        self.notary_receive_info = notary_receive_info
        # 用户预览签署文件的时间
        self.preview_time = preview_time
        # 用户签署文件时间
        self.agree_time = agree_time
        # 客户端令牌
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.notary_apply_info, 'notary_apply_info')
        if self.notary_apply_info:
            self.notary_apply_info.validate()
        self.validate_required(self.notary_receive_info, 'notary_receive_info')
        if self.notary_receive_info:
            self.notary_receive_info.validate()
        self.validate_required(self.preview_time, 'preview_time')
        self.validate_required(self.agree_time, 'agree_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.notary_apply_info is not None:
            result['notary_apply_info'] = self.notary_apply_info.to_map()
        if self.notary_receive_info is not None:
            result['notary_receive_info'] = self.notary_receive_info.to_map()
        if self.preview_time is not None:
            result['preview_time'] = self.preview_time
        if self.agree_time is not None:
            result['agree_time'] = self.agree_time
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('notary_apply_info') is not None:
            temp_model = NotaryApplyInfo()
            self.notary_apply_info = temp_model.from_map(m['notary_apply_info'])
        if m.get('notary_receive_info') is not None:
            temp_model = NotaryReceiveInfo()
            self.notary_receive_info = temp_model.from_map(m['notary_receive_info'])
        if m.get('preview_time') is not None:
            self.preview_time = m.get('preview_time')
        if m.get('agree_time') is not None:
            self.agree_time = m.get('agree_time')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class ApplyNotaryOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        notary_order_id: str = None,
        order_status: str = None,
        pay_url: str = None,
        pay_url_expire_time: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 出证申请订单ID
        self.notary_order_id = notary_order_id
        # 订单状态
        self.order_status = order_status
        # 支付二维码链接
        self.pay_url = pay_url
        # 支付二维码过期时间
        self.pay_url_expire_time = pay_url_expire_time

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
        if self.notary_order_id is not None:
            result['notary_order_id'] = self.notary_order_id
        if self.order_status is not None:
            result['order_status'] = self.order_status
        if self.pay_url is not None:
            result['pay_url'] = self.pay_url
        if self.pay_url_expire_time is not None:
            result['pay_url_expire_time'] = self.pay_url_expire_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('notary_order_id') is not None:
            self.notary_order_id = m.get('notary_order_id')
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        if m.get('pay_url') is not None:
            self.pay_url = m.get('pay_url')
        if m.get('pay_url_expire_time') is not None:
            self.pay_url_expire_time = m.get('pay_url_expire_time')
        return self


class QueryNotaryPayurlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        notary_order_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单ID
        self.notary_order_id = notary_order_id

    def validate(self):
        self.validate_required(self.notary_order_id, 'notary_order_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.notary_order_id is not None:
            result['notary_order_id'] = self.notary_order_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('notary_order_id') is not None:
            self.notary_order_id = m.get('notary_order_id')
        return self


class QueryNotaryPayurlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pay_url: str = None,
        pay_url_expire_time: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 支付二维码链接
        self.pay_url = pay_url
        # 支付二维码链接到期时间
        self.pay_url_expire_time = pay_url_expire_time

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
        if self.pay_url is not None:
            result['pay_url'] = self.pay_url
        if self.pay_url_expire_time is not None:
            result['pay_url_expire_time'] = self.pay_url_expire_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pay_url') is not None:
            self.pay_url = m.get('pay_url')
        if m.get('pay_url_expire_time') is not None:
            self.pay_url_expire_time = m.get('pay_url_expire_time')
        return self


class QueryNotaryFeedetailRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        org_id: str = None,
        order_type: str = None,
        copies: int = None,
        evid_info_list: List[EvidInfo] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 公证处ID
        self.org_id = org_id
        # 公证书类型
        self.order_type = order_type
        # 纸质公证书份数
        self.copies = copies
        # 证据列表
        self.evid_info_list = evid_info_list

    def validate(self):
        self.validate_required(self.org_id, 'org_id')
        self.validate_required(self.order_type, 'order_type')
        self.validate_required(self.evid_info_list, 'evid_info_list')
        if self.evid_info_list:
            for k in self.evid_info_list:
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
        if self.org_id is not None:
            result['org_id'] = self.org_id
        if self.order_type is not None:
            result['order_type'] = self.order_type
        if self.copies is not None:
            result['copies'] = self.copies
        result['evid_info_list'] = []
        if self.evid_info_list is not None:
            for k in self.evid_info_list:
                result['evid_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        if m.get('order_type') is not None:
            self.order_type = m.get('order_type')
        if m.get('copies') is not None:
            self.copies = m.get('copies')
        self.evid_info_list = []
        if m.get('evid_info_list') is not None:
            for k in m.get('evid_info_list'):
                temp_model = EvidInfo()
                self.evid_info_list.append(temp_model.from_map(k))
        return self


class QueryNotaryFeedetailResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_price_rmb_fen: int = None,
        notary_fee_evid_type_data_list: List[NotaryFeeEvidTypeData] = None,
        notary_fee_item_list: List[NotaryFeeItem] = None,
        notary_fee_rule_list: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 本次公证出证需支付的总费用
        self.total_price_rmb_fen = total_price_rmb_fen
        # 本次申请中每一类证据的数量明细列表
        self.notary_fee_evid_type_data_list = notary_fee_evid_type_data_list
        # 本次需支付费用的分项明细列表
        self.notary_fee_item_list = notary_fee_item_list
        # 收费规则描述
        self.notary_fee_rule_list = notary_fee_rule_list

    def validate(self):
        if self.notary_fee_evid_type_data_list:
            for k in self.notary_fee_evid_type_data_list:
                if k:
                    k.validate()
        if self.notary_fee_item_list:
            for k in self.notary_fee_item_list:
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
        if self.total_price_rmb_fen is not None:
            result['total_price_rmb_fen'] = self.total_price_rmb_fen
        result['notary_fee_evid_type_data_list'] = []
        if self.notary_fee_evid_type_data_list is not None:
            for k in self.notary_fee_evid_type_data_list:
                result['notary_fee_evid_type_data_list'].append(k.to_map() if k else None)
        result['notary_fee_item_list'] = []
        if self.notary_fee_item_list is not None:
            for k in self.notary_fee_item_list:
                result['notary_fee_item_list'].append(k.to_map() if k else None)
        if self.notary_fee_rule_list is not None:
            result['notary_fee_rule_list'] = self.notary_fee_rule_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_price_rmb_fen') is not None:
            self.total_price_rmb_fen = m.get('total_price_rmb_fen')
        self.notary_fee_evid_type_data_list = []
        if m.get('notary_fee_evid_type_data_list') is not None:
            for k in m.get('notary_fee_evid_type_data_list'):
                temp_model = NotaryFeeEvidTypeData()
                self.notary_fee_evid_type_data_list.append(temp_model.from_map(k))
        self.notary_fee_item_list = []
        if m.get('notary_fee_item_list') is not None:
            for k in m.get('notary_fee_item_list'):
                temp_model = NotaryFeeItem()
                self.notary_fee_item_list.append(temp_model.from_map(k))
        if m.get('notary_fee_rule_list') is not None:
            self.notary_fee_rule_list = m.get('notary_fee_rule_list')
        return self


class QueryNotaryOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        notary_order_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # acrbasis订单ID
        self.notary_order_id = notary_order_id

    def validate(self):
        self.validate_required(self.notary_order_id, 'notary_order_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.notary_order_id is not None:
            result['notary_order_id'] = self.notary_order_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('notary_order_id') is not None:
            self.notary_order_id = m.get('notary_order_id')
        return self


class QueryNotaryOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
        pay_time: int = None,
        preview_time: int = None,
        pay_status: str = None,
        material_remarks: str = None,
        notary_info: NotaryInfo = None,
        reject_info: RefuseInfo = None,
        terminal_info: RefuseInfo = None,
        pay_type: str = None,
        payable_amount: int = None,
        paid_amount: int = None,
        notary_express_list: List[ExpressInfo] = None,
        invoice_express_list: List[ExpressInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单状态
        self.status = status
        # 支付状态最后更新时间戳
        self.pay_time = pay_time
        # 用户预览签署文件的时间戳
        self.preview_time = preview_time
        # 支付状态
        self.pay_status = pay_status
        # 补充材料说明，当需要补充材料时提供
        self.material_remarks = material_remarks
        # 出证的公证书信息
        self.notary_info = notary_info
        # 拒绝办理信息
        self.reject_info = reject_info
        # 终止信息
        self.terminal_info = terminal_info
        # 支付方式
        self.pay_type = pay_type
        # 用户应付的金额
        self.payable_amount = payable_amount
        # 用户实际支付的金额
        self.paid_amount = paid_amount
        # 公证处物流信息
        self.notary_express_list = notary_express_list
        # 发票物流信息
        self.invoice_express_list = invoice_express_list

    def validate(self):
        if self.notary_info:
            self.notary_info.validate()
        if self.reject_info:
            self.reject_info.validate()
        if self.terminal_info:
            self.terminal_info.validate()
        if self.notary_express_list:
            for k in self.notary_express_list:
                if k:
                    k.validate()
        if self.invoice_express_list:
            for k in self.invoice_express_list:
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
        if self.status is not None:
            result['status'] = self.status
        if self.pay_time is not None:
            result['pay_time'] = self.pay_time
        if self.preview_time is not None:
            result['preview_time'] = self.preview_time
        if self.pay_status is not None:
            result['pay_status'] = self.pay_status
        if self.material_remarks is not None:
            result['material_remarks'] = self.material_remarks
        if self.notary_info is not None:
            result['notary_info'] = self.notary_info.to_map()
        if self.reject_info is not None:
            result['reject_info'] = self.reject_info.to_map()
        if self.terminal_info is not None:
            result['terminal_info'] = self.terminal_info.to_map()
        if self.pay_type is not None:
            result['pay_type'] = self.pay_type
        if self.payable_amount is not None:
            result['payable_amount'] = self.payable_amount
        if self.paid_amount is not None:
            result['paid_amount'] = self.paid_amount
        result['notary_express_list'] = []
        if self.notary_express_list is not None:
            for k in self.notary_express_list:
                result['notary_express_list'].append(k.to_map() if k else None)
        result['invoice_express_list'] = []
        if self.invoice_express_list is not None:
            for k in self.invoice_express_list:
                result['invoice_express_list'].append(k.to_map() if k else None)
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
        if m.get('pay_time') is not None:
            self.pay_time = m.get('pay_time')
        if m.get('preview_time') is not None:
            self.preview_time = m.get('preview_time')
        if m.get('pay_status') is not None:
            self.pay_status = m.get('pay_status')
        if m.get('material_remarks') is not None:
            self.material_remarks = m.get('material_remarks')
        if m.get('notary_info') is not None:
            temp_model = NotaryInfo()
            self.notary_info = temp_model.from_map(m['notary_info'])
        if m.get('reject_info') is not None:
            temp_model = RefuseInfo()
            self.reject_info = temp_model.from_map(m['reject_info'])
        if m.get('terminal_info') is not None:
            temp_model = RefuseInfo()
            self.terminal_info = temp_model.from_map(m['terminal_info'])
        if m.get('pay_type') is not None:
            self.pay_type = m.get('pay_type')
        if m.get('payable_amount') is not None:
            self.payable_amount = m.get('payable_amount')
        if m.get('paid_amount') is not None:
            self.paid_amount = m.get('paid_amount')
        self.notary_express_list = []
        if m.get('notary_express_list') is not None:
            for k in m.get('notary_express_list'):
                temp_model = ExpressInfo()
                self.notary_express_list.append(temp_model.from_map(k))
        self.invoice_express_list = []
        if m.get('invoice_express_list') is not None:
            for k in m.get('invoice_express_list'):
                temp_model = ExpressInfo()
                self.invoice_express_list.append(temp_model.from_map(k))
        return self


class UploadNotaryAttachmentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        notary_order_id: str = None,
        material_file_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单ID
        self.notary_order_id = notary_order_id
        # 材料文件
        self.material_file_list = material_file_list

    def validate(self):
        self.validate_required(self.notary_order_id, 'notary_order_id')
        self.validate_required(self.material_file_list, 'material_file_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.notary_order_id is not None:
            result['notary_order_id'] = self.notary_order_id
        if self.material_file_list is not None:
            result['material_file_list'] = self.material_file_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('notary_order_id') is not None:
            self.notary_order_id = m.get('notary_order_id')
        if m.get('material_file_list') is not None:
            self.material_file_list = m.get('material_file_list')
        return self


class UploadNotaryAttachmentResponse(TeaModel):
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


class OperateNotaryOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        notary_order_id: str = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单ID
        self.notary_order_id = notary_order_id
        # 更新状态类型
        self.type = type

    def validate(self):
        self.validate_required(self.notary_order_id, 'notary_order_id')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.notary_order_id is not None:
            result['notary_order_id'] = self.notary_order_id
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('notary_order_id') is not None:
            self.notary_order_id = m.get('notary_order_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class OperateNotaryOrderResponse(TeaModel):
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


class QueryDciPreviewRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dci_preview_id: str = None,
        dci_basis_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # dci作品预览id
        self.dci_preview_id = dci_preview_id
        # basis的dci content id
        self.dci_basis_id = dci_basis_id

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
        if self.dci_preview_id is not None:
            result['dci_preview_id'] = self.dci_preview_id
        if self.dci_basis_id is not None:
            result['dci_basis_id'] = self.dci_basis_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dci_preview_id') is not None:
            self.dci_preview_id = m.get('dci_preview_id')
        if m.get('dci_basis_id') is not None:
            self.dci_basis_id = m.get('dci_basis_id')
        return self


class QueryDciPreviewResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        file_preview_status: str = None,
        file_part_preview_status: str = None,
        file_preview_url: str = None,
        file_part_preview_url: str = None,
        work_name: str = None,
        dci_code: str = None,
        file_type: str = None,
        query_time: str = None,
        reg_number: str = None,
        copyright_owner_names: List[str] = None,
        series_diagram_preview_list: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 作品预览处理状态
        self.file_preview_status = file_preview_status
        # 作品片段预览状态
        self.file_part_preview_status = file_part_preview_status
        # 作品预览处理结果
        self.file_preview_url = file_preview_url
        # 作品预览截取片段结果
        self.file_part_preview_url = file_part_preview_url
        # 作品名称
        self.work_name = work_name
        # dci码
        self.dci_code = dci_code
        # 文件类型
        self.file_type = file_type
        # 当前查询时间
        self.query_time = query_time
        # 数登登记号
        self.reg_number = reg_number
        # 著作权人名称列表
        self.copyright_owner_names = copyright_owner_names
        # 系列图预览地址
        self.series_diagram_preview_list = series_diagram_preview_list

    def validate(self):
        if self.query_time is not None:
            self.validate_pattern(self.query_time, 'query_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.file_preview_status is not None:
            result['file_preview_status'] = self.file_preview_status
        if self.file_part_preview_status is not None:
            result['file_part_preview_status'] = self.file_part_preview_status
        if self.file_preview_url is not None:
            result['file_preview_url'] = self.file_preview_url
        if self.file_part_preview_url is not None:
            result['file_part_preview_url'] = self.file_part_preview_url
        if self.work_name is not None:
            result['work_name'] = self.work_name
        if self.dci_code is not None:
            result['dci_code'] = self.dci_code
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.query_time is not None:
            result['query_time'] = self.query_time
        if self.reg_number is not None:
            result['reg_number'] = self.reg_number
        if self.copyright_owner_names is not None:
            result['copyright_owner_names'] = self.copyright_owner_names
        if self.series_diagram_preview_list is not None:
            result['series_diagram_preview_list'] = self.series_diagram_preview_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('file_preview_status') is not None:
            self.file_preview_status = m.get('file_preview_status')
        if m.get('file_part_preview_status') is not None:
            self.file_part_preview_status = m.get('file_part_preview_status')
        if m.get('file_preview_url') is not None:
            self.file_preview_url = m.get('file_preview_url')
        if m.get('file_part_preview_url') is not None:
            self.file_part_preview_url = m.get('file_part_preview_url')
        if m.get('work_name') is not None:
            self.work_name = m.get('work_name')
        if m.get('dci_code') is not None:
            self.dci_code = m.get('dci_code')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('query_time') is not None:
            self.query_time = m.get('query_time')
        if m.get('reg_number') is not None:
            self.reg_number = m.get('reg_number')
        if m.get('copyright_owner_names') is not None:
            self.copyright_owner_names = m.get('copyright_owner_names')
        if m.get('series_diagram_preview_list') is not None:
            self.series_diagram_preview_list = m.get('series_diagram_preview_list')
        return self


class RetryDciRegistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        digital_register_id: str = None,
        dci_content_id: str = None,
        explanation_info: DciExplanationInfo = None,
        additional_file_info: AdditionalFileInfo = None,
        client_token: str = None,
        right_scope_desc: str = None,
        applyer_contact_info: ContactInfo = None,
        platform_contact_info: ContactInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待补正数登申请id
        self.digital_register_id = digital_register_id
        # 替换dci申领id
        self.dci_content_id = dci_content_id
        # 数登申请声明
        self.explanation_info = explanation_info
        # 补充文件信息
        self.additional_file_info = additional_file_info
        # 幂等字段
        self.client_token = client_token
        # 权利描述
        self.right_scope_desc = right_scope_desc
        # 申领人联系信息
        self.applyer_contact_info = applyer_contact_info
        # 代理人联系信息
        self.platform_contact_info = platform_contact_info

    def validate(self):
        self.validate_required(self.digital_register_id, 'digital_register_id')
        self.validate_required(self.explanation_info, 'explanation_info')
        if self.explanation_info:
            self.explanation_info.validate()
        if self.additional_file_info:
            self.additional_file_info.validate()
        self.validate_required(self.client_token, 'client_token')
        if self.applyer_contact_info:
            self.applyer_contact_info.validate()
        if self.platform_contact_info:
            self.platform_contact_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.digital_register_id is not None:
            result['digital_register_id'] = self.digital_register_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        if self.explanation_info is not None:
            result['explanation_info'] = self.explanation_info.to_map()
        if self.additional_file_info is not None:
            result['additional_file_info'] = self.additional_file_info.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.right_scope_desc is not None:
            result['right_scope_desc'] = self.right_scope_desc
        if self.applyer_contact_info is not None:
            result['applyer_contact_info'] = self.applyer_contact_info.to_map()
        if self.platform_contact_info is not None:
            result['platform_contact_info'] = self.platform_contact_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('digital_register_id') is not None:
            self.digital_register_id = m.get('digital_register_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        if m.get('explanation_info') is not None:
            temp_model = DciExplanationInfo()
            self.explanation_info = temp_model.from_map(m['explanation_info'])
        if m.get('additional_file_info') is not None:
            temp_model = AdditionalFileInfo()
            self.additional_file_info = temp_model.from_map(m['additional_file_info'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('right_scope_desc') is not None:
            self.right_scope_desc = m.get('right_scope_desc')
        if m.get('applyer_contact_info') is not None:
            temp_model = ContactInfo()
            self.applyer_contact_info = temp_model.from_map(m['applyer_contact_info'])
        if m.get('platform_contact_info') is not None:
            temp_model = ContactInfo()
            self.platform_contact_info = temp_model.from_map(m['platform_contact_info'])
        return self


class RetryDciRegistrationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        error_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 错误信息
        self.error_msg = error_msg

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
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class CloseDciRegistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        digital_register_id: str = None,
        name: str = None,
        mobile_no: str = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数登id
        self.digital_register_id = digital_register_id
        # 退费人名称
        self.name = name
        # 联系手机号
        self.mobile_no = mobile_no
        # 幂等字段
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.digital_register_id, 'digital_register_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.mobile_no, 'mobile_no')
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.digital_register_id is not None:
            result['digital_register_id'] = self.digital_register_id
        if self.name is not None:
            result['name'] = self.name
        if self.mobile_no is not None:
            result['mobile_no'] = self.mobile_no
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('digital_register_id') is not None:
            self.digital_register_id = m.get('digital_register_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('mobile_no') is not None:
            self.mobile_no = m.get('mobile_no')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class CloseDciRegistrationResponse(TeaModel):
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


class AddDciUsernocertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        certificate_name: str = None,
        certificate_type: str = None,
        certificate_number: str = None,
        legal_person_cert_name: str = None,
        legal_person_cert_type: str = None,
        legal_person_cert_no: str = None,
        phone: str = None,
        proxy_data: ProxyData = None,
        client_token: str = None,
        copyright_certification_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户名称
        self.certificate_name = certificate_name
        # 证件类型
        self.certificate_type = certificate_type
        # 证件号
        self.certificate_number = certificate_number
        # 企业用户必填
        self.legal_person_cert_name = legal_person_cert_name
        # 企业用户必填
        self.legal_person_cert_type = legal_person_cert_type
        # 企业用户必填
        self.legal_person_cert_no = legal_person_cert_no
        # 手机号
        self.phone = phone
        # 代理信息
        self.proxy_data = proxy_data
        # 幂等字段
        self.client_token = client_token
        # 版权认证方式:UGC-用户生成内容，AIGC-AI生成内容，SOFTWARE_WORKS-软件作品认证，如果不传默认为UGC
        self.copyright_certification_type = copyright_certification_type

    def validate(self):
        self.validate_required(self.certificate_name, 'certificate_name')
        self.validate_required(self.certificate_type, 'certificate_type')
        self.validate_required(self.certificate_number, 'certificate_number')
        self.validate_required(self.phone, 'phone')
        if self.proxy_data:
            self.proxy_data.validate()
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.certificate_name is not None:
            result['certificate_name'] = self.certificate_name
        if self.certificate_type is not None:
            result['certificate_type'] = self.certificate_type
        if self.certificate_number is not None:
            result['certificate_number'] = self.certificate_number
        if self.legal_person_cert_name is not None:
            result['legal_person_cert_name'] = self.legal_person_cert_name
        if self.legal_person_cert_type is not None:
            result['legal_person_cert_type'] = self.legal_person_cert_type
        if self.legal_person_cert_no is not None:
            result['legal_person_cert_no'] = self.legal_person_cert_no
        if self.phone is not None:
            result['phone'] = self.phone
        if self.proxy_data is not None:
            result['proxy_data'] = self.proxy_data.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.copyright_certification_type is not None:
            result['copyright_certification_type'] = self.copyright_certification_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('certificate_name') is not None:
            self.certificate_name = m.get('certificate_name')
        if m.get('certificate_type') is not None:
            self.certificate_type = m.get('certificate_type')
        if m.get('certificate_number') is not None:
            self.certificate_number = m.get('certificate_number')
        if m.get('legal_person_cert_name') is not None:
            self.legal_person_cert_name = m.get('legal_person_cert_name')
        if m.get('legal_person_cert_type') is not None:
            self.legal_person_cert_type = m.get('legal_person_cert_type')
        if m.get('legal_person_cert_no') is not None:
            self.legal_person_cert_no = m.get('legal_person_cert_no')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('proxy_data') is not None:
            temp_model = ProxyData()
            self.proxy_data = temp_model.from_map(m['proxy_data'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('copyright_certification_type') is not None:
            self.copyright_certification_type = m.get('copyright_certification_type')
        return self


class AddDciUsernocertResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        dci_user_id: str = None,
        dci_user_status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # dci用户id
        self.dci_user_id = dci_user_id
        # dci用户状态
        self.dci_user_status = dci_user_status

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
        if self.dci_user_id is not None:
            result['dci_user_id'] = self.dci_user_id
        if self.dci_user_status is not None:
            result['dci_user_status'] = self.dci_user_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('dci_user_id') is not None:
            self.dci_user_id = m.get('dci_user_id')
        if m.get('dci_user_status') is not None:
            self.dci_user_status = m.get('dci_user_status')
        return self


class QueryDciSimilarfileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        work_file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件下载凭证
        self.work_file_id = work_file_id

    def validate(self):
        self.validate_required(self.work_file_id, 'work_file_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.work_file_id is not None:
            result['work_file_id'] = self.work_file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('work_file_id') is not None:
            self.work_file_id = m.get('work_file_id')
        return self


class QueryDciSimilarfileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        work_download_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文件下载链接
        self.work_download_url = work_download_url

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
        if self.work_download_url is not None:
            result['work_download_url'] = self.work_download_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('work_download_url') is not None:
            self.work_download_url = m.get('work_download_url')
        return self


class ApplyDciPromotionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        contact_name: str = None,
        contact_phone: str = None,
        dci_content_id: str = None,
        client_token: str = None,
        promotion_way: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联系人姓名
        self.contact_name = contact_name
        # 联系人电话
        self.contact_phone = contact_phone
        # dci ID
        self.dci_content_id = dci_content_id
        # 幂等字段
        self.client_token = client_token
        # 推广渠道
        self.promotion_way = promotion_way

    def validate(self):
        self.validate_required(self.contact_name, 'contact_name')
        self.validate_required(self.contact_phone, 'contact_phone')
        self.validate_required(self.dci_content_id, 'dci_content_id')
        self.validate_required(self.client_token, 'client_token')
        self.validate_required(self.promotion_way, 'promotion_way')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.contact_name is not None:
            result['contact_name'] = self.contact_name
        if self.contact_phone is not None:
            result['contact_phone'] = self.contact_phone
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.promotion_way is not None:
            result['promotion_way'] = self.promotion_way
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('contact_name') is not None:
            self.contact_name = m.get('contact_name')
        if m.get('contact_phone') is not None:
            self.contact_phone = m.get('contact_phone')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('promotion_way') is not None:
            self.promotion_way = m.get('promotion_way')
        return self


class ApplyDciPromotionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        api_task_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # basis数据ID
        self.api_task_id = api_task_id

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
        if self.api_task_id is not None:
            result['api_task_id'] = self.api_task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('api_task_id') is not None:
            self.api_task_id = m.get('api_task_id')
        return self


class QueryDciUserbyphoneRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        phone: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 手机号
        self.phone = phone

    def validate(self):
        self.validate_required(self.phone, 'phone')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.phone is not None:
            result['phone'] = self.phone
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        return self


class QueryDciUserbyphoneResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        dci_user_id: str = None,
        dci_user_status: str = None,
        name: str = None,
        certificate_type: str = None,
        certificate_number: str = None,
        address: str = None,
        cert_start_time: str = None,
        cert_end_time: str = None,
        legal_person: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # dci用户id
        # 
        self.dci_user_id = dci_user_id
        # dci用户状态
        # 
        self.dci_user_status = dci_user_status
        # 名称
        self.name = name
        # 证件类型
        # 
        self.certificate_type = certificate_type
        # 证件号
        # 
        self.certificate_number = certificate_number
        # 地址
        self.address = address
        # 证件有效期开始时间
        # 
        self.cert_start_time = cert_start_time
        # 证件有效期结束时间
        # 
        self.cert_end_time = cert_end_time
        # 法人名称
        # 
        self.legal_person = legal_person

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
        if self.dci_user_id is not None:
            result['dci_user_id'] = self.dci_user_id
        if self.dci_user_status is not None:
            result['dci_user_status'] = self.dci_user_status
        if self.name is not None:
            result['name'] = self.name
        if self.certificate_type is not None:
            result['certificate_type'] = self.certificate_type
        if self.certificate_number is not None:
            result['certificate_number'] = self.certificate_number
        if self.address is not None:
            result['address'] = self.address
        if self.cert_start_time is not None:
            result['cert_start_time'] = self.cert_start_time
        if self.cert_end_time is not None:
            result['cert_end_time'] = self.cert_end_time
        if self.legal_person is not None:
            result['legal_person'] = self.legal_person
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('dci_user_id') is not None:
            self.dci_user_id = m.get('dci_user_id')
        if m.get('dci_user_status') is not None:
            self.dci_user_status = m.get('dci_user_status')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('certificate_type') is not None:
            self.certificate_type = m.get('certificate_type')
        if m.get('certificate_number') is not None:
            self.certificate_number = m.get('certificate_number')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('cert_start_time') is not None:
            self.cert_start_time = m.get('cert_start_time')
        if m.get('cert_end_time') is not None:
            self.cert_end_time = m.get('cert_end_time')
        if m.get('legal_person') is not None:
            self.legal_person = m.get('legal_person')
        return self


class QueryTradeSaleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        query_text: str = None,
        query_scene: str = None,
        ext_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询文本
        self.query_text = query_text
        # 查询场景
        self.query_scene = query_scene
        # 扩展信息，JSON格式
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.query_text, 'query_text')
        if self.query_text is not None:
            self.validate_max_length(self.query_text, 'query_text', 2048)
        self.validate_required(self.query_scene, 'query_scene')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.query_text is not None:
            result['query_text'] = self.query_text
        if self.query_scene is not None:
            result['query_scene'] = self.query_scene
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('query_text') is not None:
            self.query_text = m.get('query_text')
        if m.get('query_scene') is not None:
            self.query_scene = m.get('query_scene')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class QueryTradeSaleResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sale_data_list: List[SaleData] = None,
        ext_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 匹配的商品信息
        self.sale_data_list = sale_data_list
        # 扩展信息JSON
        self.ext_info = ext_info

    def validate(self):
        if self.sale_data_list:
            for k in self.sale_data_list:
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
        result['sale_data_list'] = []
        if self.sale_data_list is not None:
            for k in self.sale_data_list:
                result['sale_data_list'].append(k.to_map() if k else None)
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.sale_data_list = []
        if m.get('sale_data_list') is not None:
            for k in m.get('sale_data_list'):
                temp_model = SaleData()
                self.sale_data_list.append(temp_model.from_map(k))
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class RegisterTradeUsageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        service_type: str = None,
        biz_type: str = None,
        ext_info: str = None,
        out_biz_no: str = None,
        file_type: str = None,
        reg_file_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 标识某个服务实体的唯一ID，例如dciContentId
        self.service_id = service_id
        # 服务类型，例如DCI、存证等
        self.service_type = service_type
        # 业务类型
        self.biz_type = biz_type
        # 扩展信息，JSON格式
        self.ext_info = ext_info
        # 调用方唯一业务标识
        self.out_biz_no = out_biz_no
        # 文件类型，例如音频、视频、图片
        self.file_type = file_type
        # 待登记的文件Url
        self.reg_file_url = reg_file_url

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.service_type, 'service_type')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.out_biz_no, 'out_biz_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.service_type is not None:
            result['service_type'] = self.service_type
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        if self.out_biz_no is not None:
            result['out_biz_no'] = self.out_biz_no
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.reg_file_url is not None:
            result['reg_file_url'] = self.reg_file_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('service_type') is not None:
            self.service_type = m.get('service_type')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        if m.get('out_biz_no') is not None:
            self.out_biz_no = m.get('out_biz_no')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('reg_file_url') is not None:
            self.reg_file_url = m.get('reg_file_url')
        return self


class RegisterTradeUsageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        register_id: str = None,
        status: str = None,
        ext_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 登记Id
        self.register_id = register_id
        # 登记状态
        self.status = status
        # 扩展信息
        self.ext_info = ext_info

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
        if self.register_id is not None:
            result['register_id'] = self.register_id
        if self.status is not None:
            result['status'] = self.status
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('register_id') is not None:
            self.register_id = m.get('register_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class CreateEvidenceUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cert_name: str = None,
        cert_no: str = None,
        user_type: str = None,
        legal_person_cert_name: str = None,
        legal_person_cert_no: str = None,
        operator_name: str = None,
        operator_cert_no: str = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 取证主体证件名称
        self.cert_name = cert_name
        # 取证主体证件号
        self.cert_no = cert_no
        # 用户类型（个人/企业）
        self.user_type = user_type
        # 法人姓名（企业用户必填）
        self.legal_person_cert_name = legal_person_cert_name
        # 法人证件号（企业用户必填）
        self.legal_person_cert_no = legal_person_cert_no
        # 取证操作人证件姓名（企业用户必填）
        self.operator_name = operator_name
        # 取证操作人证件号（企业用户必填）
        self.operator_cert_no = operator_cert_no
        # 幂等字段
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.user_type, 'user_type')
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.legal_person_cert_name is not None:
            result['legal_person_cert_name'] = self.legal_person_cert_name
        if self.legal_person_cert_no is not None:
            result['legal_person_cert_no'] = self.legal_person_cert_no
        if self.operator_name is not None:
            result['operator_name'] = self.operator_name
        if self.operator_cert_no is not None:
            result['operator_cert_no'] = self.operator_cert_no
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('legal_person_cert_name') is not None:
            self.legal_person_cert_name = m.get('legal_person_cert_name')
        if m.get('legal_person_cert_no') is not None:
            self.legal_person_cert_no = m.get('legal_person_cert_no')
        if m.get('operator_name') is not None:
            self.operator_name = m.get('operator_name')
        if m.get('operator_cert_no') is not None:
            self.operator_cert_no = m.get('operator_cert_no')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class CreateEvidenceUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        evidence_user_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 取证用户id
        self.evidence_user_id = evidence_user_id

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
        if self.evidence_user_id is not None:
            result['evidence_user_id'] = self.evidence_user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('evidence_user_id') is not None:
            self.evidence_user_id = m.get('evidence_user_id')
        return self


class CreateEvidenceScreenshotRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        evidence_user_id: str = None,
        notary_office: str = None,
        web_url: EvidenceWebUrlInfo = None,
        third_party_info: EvidenceThirdPartyInfo = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 取证用户id
        self.evidence_user_id = evidence_user_id
        # 取证公证处
        self.notary_office = notary_office
        # 取证网址信息
        self.web_url = web_url
        # 取证三方账号信息
        self.third_party_info = third_party_info
        # 幂等字段
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.evidence_user_id, 'evidence_user_id')
        self.validate_required(self.notary_office, 'notary_office')
        self.validate_required(self.web_url, 'web_url')
        if self.web_url:
            self.web_url.validate()
        self.validate_required(self.third_party_info, 'third_party_info')
        if self.third_party_info:
            self.third_party_info.validate()
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.evidence_user_id is not None:
            result['evidence_user_id'] = self.evidence_user_id
        if self.notary_office is not None:
            result['notary_office'] = self.notary_office
        if self.web_url is not None:
            result['web_url'] = self.web_url.to_map()
        if self.third_party_info is not None:
            result['third_party_info'] = self.third_party_info.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('evidence_user_id') is not None:
            self.evidence_user_id = m.get('evidence_user_id')
        if m.get('notary_office') is not None:
            self.notary_office = m.get('notary_office')
        if m.get('web_url') is not None:
            temp_model = EvidenceWebUrlInfo()
            self.web_url = temp_model.from_map(m['web_url'])
        if m.get('third_party_info') is not None:
            temp_model = EvidenceThirdPartyInfo()
            self.third_party_info = temp_model.from_map(m['third_party_info'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class CreateEvidenceScreenshotResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        screenshot_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 网页截图id
        self.screenshot_id = screenshot_id

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
        if self.screenshot_id is not None:
            result['screenshot_id'] = self.screenshot_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('screenshot_id') is not None:
            self.screenshot_id = m.get('screenshot_id')
        return self


class CreateEvidenceRegisterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        screenshot_id: str = None,
        evidence_name: str = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 网页截图id
        self.screenshot_id = screenshot_id
        # 取证名称
        self.evidence_name = evidence_name
        # 幂等字段
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.screenshot_id, 'screenshot_id')
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.screenshot_id is not None:
            result['screenshot_id'] = self.screenshot_id
        if self.evidence_name is not None:
            result['evidence_name'] = self.evidence_name
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('screenshot_id') is not None:
            self.screenshot_id = m.get('screenshot_id')
        if m.get('evidence_name') is not None:
            self.evidence_name = m.get('evidence_name')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class CreateEvidenceRegisterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        evidence_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 取证id
        self.evidence_id = evidence_id

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
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        return self


class CreateEvidenceRecordscreenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        evidence_user_id: str = None,
        notary_office: str = None,
        web_urls: List[EvidenceWebUrlInfo] = None,
        third_party_info: EvidenceThirdPartyInfo = None,
        area: str = None,
        max_time_in_min: int = None,
        wait_in_min: int = None,
        callback_url: str = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 取证名称
        self.name = name
        # 取证用户id
        self.evidence_user_id = evidence_user_id
        # 取证公证处
        self.notary_office = notary_office
        # 取证网址信息
        self.web_urls = web_urls
        # 取证三方账号信息
        self.third_party_info = third_party_info
        # 取证服务器地域
        self.area = area
        # 最大录屏时间（单位：分钟）
        self.max_time_in_min = max_time_in_min
        # 服务器进入ready状态，指定时间未开始进入abort状态的等待时间，单位为分钟，默认1min，waitInMin不能小于1，不能大于10min
        self.wait_in_min = wait_in_min
        # 回调地址
        self.callback_url = callback_url
        # 幂等字段
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.evidence_user_id, 'evidence_user_id')
        self.validate_required(self.notary_office, 'notary_office')
        if self.web_urls:
            for k in self.web_urls:
                if k:
                    k.validate()
        self.validate_required(self.third_party_info, 'third_party_info')
        if self.third_party_info:
            self.third_party_info.validate()
        self.validate_required(self.area, 'area')
        self.validate_required(self.max_time_in_min, 'max_time_in_min')
        self.validate_required(self.wait_in_min, 'wait_in_min')
        self.validate_required(self.callback_url, 'callback_url')
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.name is not None:
            result['name'] = self.name
        if self.evidence_user_id is not None:
            result['evidence_user_id'] = self.evidence_user_id
        if self.notary_office is not None:
            result['notary_office'] = self.notary_office
        result['web_urls'] = []
        if self.web_urls is not None:
            for k in self.web_urls:
                result['web_urls'].append(k.to_map() if k else None)
        if self.third_party_info is not None:
            result['third_party_info'] = self.third_party_info.to_map()
        if self.area is not None:
            result['area'] = self.area
        if self.max_time_in_min is not None:
            result['max_time_in_min'] = self.max_time_in_min
        if self.wait_in_min is not None:
            result['wait_in_min'] = self.wait_in_min
        if self.callback_url is not None:
            result['callback_url'] = self.callback_url
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('evidence_user_id') is not None:
            self.evidence_user_id = m.get('evidence_user_id')
        if m.get('notary_office') is not None:
            self.notary_office = m.get('notary_office')
        self.web_urls = []
        if m.get('web_urls') is not None:
            for k in m.get('web_urls'):
                temp_model = EvidenceWebUrlInfo()
                self.web_urls.append(temp_model.from_map(k))
        if m.get('third_party_info') is not None:
            temp_model = EvidenceThirdPartyInfo()
            self.third_party_info = temp_model.from_map(m['third_party_info'])
        if m.get('area') is not None:
            self.area = m.get('area')
        if m.get('max_time_in_min') is not None:
            self.max_time_in_min = m.get('max_time_in_min')
        if m.get('wait_in_min') is not None:
            self.wait_in_min = m.get('wait_in_min')
        if m.get('callback_url') is not None:
            self.callback_url = m.get('callback_url')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class CreateEvidenceRecordscreenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        record_screen_url: str = None,
        evidence_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 录屏取证操作url
        self.record_screen_url = record_screen_url
        # 取证id
        self.evidence_id = evidence_id

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
        if self.record_screen_url is not None:
            result['record_screen_url'] = self.record_screen_url
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('record_screen_url') is not None:
            self.record_screen_url = m.get('record_screen_url')
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        return self


class CancelTradeUsageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        out_biz_no: str = None,
        biz_type: str = None,
        ext_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部业务编号
        self.out_biz_no = out_biz_no
        # 业务类型，例如交易检索
        self.biz_type = biz_type
        # 扩展信息
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.out_biz_no, 'out_biz_no')
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
        if self.out_biz_no is not None:
            result['out_biz_no'] = self.out_biz_no
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('out_biz_no') is not None:
            self.out_biz_no = m.get('out_biz_no')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class CancelTradeUsageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        register_id: str = None,
        ext_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 登记Id
        self.register_id = register_id
        # 扩展信息
        self.ext_info = ext_info

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
        if self.register_id is not None:
            result['register_id'] = self.register_id
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('register_id') is not None:
            self.register_id = m.get('register_id')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class CreateEvidenceLiveRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        evidence_user_id: str = None,
        notary_office: str = None,
        type: str = None,
        web_url: EvidenceWebUrlInfo = None,
        client_token: str = None,
        profile_id: str = None,
        expected_duration: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 取证用户id
        self.evidence_user_id = evidence_user_id
        # 取证公证处
        self.notary_office = notary_office
        # 取证类型（通用直播取证：DEFAULT）
        self.type = type
        # 取证网址信息
        self.web_url = web_url
        # 幂等字段
        self.client_token = client_token
        # 主播 ID
        self.profile_id = profile_id
        # 预定时间：分钟，建议传值范围5-20分钟
        self.expected_duration = expected_duration

    def validate(self):
        self.validate_required(self.evidence_user_id, 'evidence_user_id')
        self.validate_required(self.notary_office, 'notary_office')
        self.validate_required(self.type, 'type')
        self.validate_required(self.web_url, 'web_url')
        if self.web_url:
            self.web_url.validate()
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.evidence_user_id is not None:
            result['evidence_user_id'] = self.evidence_user_id
        if self.notary_office is not None:
            result['notary_office'] = self.notary_office
        if self.type is not None:
            result['type'] = self.type
        if self.web_url is not None:
            result['web_url'] = self.web_url.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.profile_id is not None:
            result['profile_id'] = self.profile_id
        if self.expected_duration is not None:
            result['expected_duration'] = self.expected_duration
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('evidence_user_id') is not None:
            self.evidence_user_id = m.get('evidence_user_id')
        if m.get('notary_office') is not None:
            self.notary_office = m.get('notary_office')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('web_url') is not None:
            temp_model = EvidenceWebUrlInfo()
            self.web_url = temp_model.from_map(m['web_url'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('profile_id') is not None:
            self.profile_id = m.get('profile_id')
        if m.get('expected_duration') is not None:
            self.expected_duration = m.get('expected_duration')
        return self


class CreateEvidenceLiveResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        evidence_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 直播取证id
        self.evidence_id = evidence_id

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
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        return self


class CreateEvidenceVodRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        evidence_user_id: str = None,
        notary_office: str = None,
        type: str = None,
        web_url: EvidenceWebUrlInfo = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 取证用户id
        self.evidence_user_id = evidence_user_id
        # 公证处code
        self.notary_office = notary_office
        # 取证类型（通用点播取证：DEFAULT，快手点播取证：KUAISHOU）
        self.type = type
        # 待取证点播网站网址
        self.web_url = web_url
        # 幂等字段
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.evidence_user_id, 'evidence_user_id')
        self.validate_required(self.notary_office, 'notary_office')
        self.validate_required(self.type, 'type')
        self.validate_required(self.web_url, 'web_url')
        if self.web_url:
            self.web_url.validate()
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.evidence_user_id is not None:
            result['evidence_user_id'] = self.evidence_user_id
        if self.notary_office is not None:
            result['notary_office'] = self.notary_office
        if self.type is not None:
            result['type'] = self.type
        if self.web_url is not None:
            result['web_url'] = self.web_url.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('evidence_user_id') is not None:
            self.evidence_user_id = m.get('evidence_user_id')
        if m.get('notary_office') is not None:
            self.notary_office = m.get('notary_office')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('web_url') is not None:
            temp_model = EvidenceWebUrlInfo()
            self.web_url = temp_model.from_map(m['web_url'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class CreateEvidenceVodResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        evidence_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 取证编号
        self.evidence_id = evidence_id

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
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        return self


class GetTradeUsageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        service_type: str = None,
        ext_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 服务实体ID，例如DCI
        self.service_id = service_id
        # 服务类型
        self.service_type = service_type
        # 扩展信息
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.service_type, 'service_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.service_type is not None:
            result['service_type'] = self.service_type
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('service_type') is not None:
            self.service_type = m.get('service_type')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class GetTradeUsageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        register_id: str = None,
        status: str = None,
        ext_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易登记Id
        self.register_id = register_id
        # 登记状态
        self.status = status
        # 扩展信息
        self.ext_info = ext_info

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
        if self.register_id is not None:
            result['register_id'] = self.register_id
        if self.status is not None:
            result['status'] = self.status
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('register_id') is not None:
            self.register_id = m.get('register_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class GetEvidenceInfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        evidence_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 取证编号
        self.evidence_id = evidence_id

    def validate(self):
        self.validate_required(self.evidence_id, 'evidence_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        return self


class GetEvidenceInfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        evidence_id: str = None,
        evidence_type: str = None,
        status: str = None,
        notary_office: str = None,
        evidence_url: EvidenceWebUrlInfo = None,
        evidence_result_url: str = None,
        certificate_info: EvidenceCertificateInfo = None,
        evidence_error_code: str = None,
        evidence_error_msg: str = None,
        start_time: int = None,
        finish_time: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 取证编号
        self.evidence_id = evidence_id
        # 取证类型（LIVE：直播，VOD：点播）
        self.evidence_type = evidence_type
        # 取证状态（取证中：DOING，取证成功：SUCCESS，取证失败：FAIL）
        self.status = status
        # 公证处code
        self.notary_office = notary_office
        # 取证url信息
        self.evidence_url = evidence_url
        # 取证结果文件下载url（有效期3天）
        self.evidence_result_url = evidence_result_url
        # 存证证明信息
        self.certificate_info = certificate_info
        # 取证错误码
        self.evidence_error_code = evidence_error_code
        # 取证错误描述
        self.evidence_error_msg = evidence_error_msg
        # 取证开始时间
        self.start_time = start_time
        # 取证结束时间
        self.finish_time = finish_time

    def validate(self):
        if self.evidence_url:
            self.evidence_url.validate()
        if self.certificate_info:
            self.certificate_info.validate()

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
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        if self.evidence_type is not None:
            result['evidence_type'] = self.evidence_type
        if self.status is not None:
            result['status'] = self.status
        if self.notary_office is not None:
            result['notary_office'] = self.notary_office
        if self.evidence_url is not None:
            result['evidence_url'] = self.evidence_url.to_map()
        if self.evidence_result_url is not None:
            result['evidence_result_url'] = self.evidence_result_url
        if self.certificate_info is not None:
            result['certificate_info'] = self.certificate_info.to_map()
        if self.evidence_error_code is not None:
            result['evidence_error_code'] = self.evidence_error_code
        if self.evidence_error_msg is not None:
            result['evidence_error_msg'] = self.evidence_error_msg
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.finish_time is not None:
            result['finish_time'] = self.finish_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        if m.get('evidence_type') is not None:
            self.evidence_type = m.get('evidence_type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('notary_office') is not None:
            self.notary_office = m.get('notary_office')
        if m.get('evidence_url') is not None:
            temp_model = EvidenceWebUrlInfo()
            self.evidence_url = temp_model.from_map(m['evidence_url'])
        if m.get('evidence_result_url') is not None:
            self.evidence_result_url = m.get('evidence_result_url')
        if m.get('certificate_info') is not None:
            temp_model = EvidenceCertificateInfo()
            self.certificate_info = temp_model.from_map(m['certificate_info'])
        if m.get('evidence_error_code') is not None:
            self.evidence_error_code = m.get('evidence_error_code')
        if m.get('evidence_error_msg') is not None:
            self.evidence_error_msg = m.get('evidence_error_msg')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('finish_time') is not None:
            self.finish_time = m.get('finish_time')
        return self


class ReplaceDciRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dci_content_id: str = None,
        work_name: str = None,
        work_category: str = None,
        creation_info: DciCreationInfo = None,
        publication_info: DciPublicationInfo = None,
        dci_user_id: str = None,
        copyright_owner_ids: List[str] = None,
        author_name: str = None,
        author_signature: str = None,
        right_info: DciRightInfo = None,
        client_token: str = None,
        proxy_data: ProxyData = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # id
        self.dci_content_id = dci_content_id
        # 作品名称
        self.work_name = work_name
        # 作品类别
        self.work_category = work_category
        # 创作信息
        self.creation_info = creation_info
        # 发表信息
        self.publication_info = publication_info
        # 申领人id
        self.dci_user_id = dci_user_id
        # 著作权人
        self.copyright_owner_ids = copyright_owner_ids
        # 作者姓名
        self.author_name = author_name
        # 作者署名
        self.author_signature = author_signature
        # 权利信息
        self.right_info = right_info
        # 幂等字段
        self.client_token = client_token
        # 代理信息
        self.proxy_data = proxy_data

    def validate(self):
        self.validate_required(self.dci_content_id, 'dci_content_id')
        if self.creation_info:
            self.creation_info.validate()
        if self.publication_info:
            self.publication_info.validate()
        if self.right_info:
            self.right_info.validate()
        self.validate_required(self.client_token, 'client_token')
        if self.proxy_data:
            self.proxy_data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        if self.work_name is not None:
            result['work_name'] = self.work_name
        if self.work_category is not None:
            result['work_category'] = self.work_category
        if self.creation_info is not None:
            result['creation_info'] = self.creation_info.to_map()
        if self.publication_info is not None:
            result['publication_info'] = self.publication_info.to_map()
        if self.dci_user_id is not None:
            result['dci_user_id'] = self.dci_user_id
        if self.copyright_owner_ids is not None:
            result['copyright_owner_ids'] = self.copyright_owner_ids
        if self.author_name is not None:
            result['author_name'] = self.author_name
        if self.author_signature is not None:
            result['author_signature'] = self.author_signature
        if self.right_info is not None:
            result['right_info'] = self.right_info.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.proxy_data is not None:
            result['proxy_data'] = self.proxy_data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        if m.get('work_name') is not None:
            self.work_name = m.get('work_name')
        if m.get('work_category') is not None:
            self.work_category = m.get('work_category')
        if m.get('creation_info') is not None:
            temp_model = DciCreationInfo()
            self.creation_info = temp_model.from_map(m['creation_info'])
        if m.get('publication_info') is not None:
            temp_model = DciPublicationInfo()
            self.publication_info = temp_model.from_map(m['publication_info'])
        if m.get('dci_user_id') is not None:
            self.dci_user_id = m.get('dci_user_id')
        if m.get('copyright_owner_ids') is not None:
            self.copyright_owner_ids = m.get('copyright_owner_ids')
        if m.get('author_name') is not None:
            self.author_name = m.get('author_name')
        if m.get('author_signature') is not None:
            self.author_signature = m.get('author_signature')
        if m.get('right_info') is not None:
            temp_model = DciRightInfo()
            self.right_info = temp_model.from_map(m['right_info'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('proxy_data') is not None:
            temp_model = ProxyData()
            self.proxy_data = temp_model.from_map(m['proxy_data'])
        return self


class ReplaceDciResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        error_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 错误信息
        self.error_msg = error_msg

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
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class SubmitDciFeedbackRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        contact_name: str = None,
        contact_phone_number: str = None,
        message: str = None,
        client_token: str = None,
        feedback_type: str = None,
        email: str = None,
        proxy_data: ProxyData = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务ID
        self.service_id = service_id
        # 联系人
        self.contact_name = contact_name
        # 联系电话
        self.contact_phone_number = contact_phone_number
        # 申诉原因
        self.message = message
        # 幂等字段
        self.client_token = client_token
        # 反馈类型
        self.feedback_type = feedback_type
        # 邮箱
        self.email = email
        # 代理信息
        self.proxy_data = proxy_data

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.contact_name, 'contact_name')
        self.validate_required(self.contact_phone_number, 'contact_phone_number')
        self.validate_required(self.message, 'message')
        self.validate_required(self.client_token, 'client_token')
        self.validate_required(self.feedback_type, 'feedback_type')
        if self.proxy_data:
            self.proxy_data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.contact_name is not None:
            result['contact_name'] = self.contact_name
        if self.contact_phone_number is not None:
            result['contact_phone_number'] = self.contact_phone_number
        if self.message is not None:
            result['message'] = self.message
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.feedback_type is not None:
            result['feedback_type'] = self.feedback_type
        if self.email is not None:
            result['email'] = self.email
        if self.proxy_data is not None:
            result['proxy_data'] = self.proxy_data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('contact_name') is not None:
            self.contact_name = m.get('contact_name')
        if m.get('contact_phone_number') is not None:
            self.contact_phone_number = m.get('contact_phone_number')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('feedback_type') is not None:
            self.feedback_type = m.get('feedback_type')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('proxy_data') is not None:
            temp_model = ProxyData()
            self.proxy_data = temp_model.from_map(m['proxy_data'])
        return self


class SubmitDciFeedbackResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 记录ID
        self.id = id

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
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class QueryDciFeedbackRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 申诉ID
        self.id = id

    def validate(self):
        self.validate_required(self.id, 'id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class QueryDciFeedbackResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        feedback_status: str = None,
        dci_content_id: str = None,
        msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 申诉状态
        self.feedback_status = feedback_status
        # dciID
        self.dci_content_id = dci_content_id
        # 备注或失败原因
        self.msg = msg

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
        if self.feedback_status is not None:
            result['feedback_status'] = self.feedback_status
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        if self.msg is not None:
            result['msg'] = self.msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('feedback_status') is not None:
            self.feedback_status = m.get('feedback_status')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        return self


class ExecTradeCoverRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        out_biz_no: int = None,
        file_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 调用方唯一业务标识
        self.out_biz_no = out_biz_no
        # 需要抽取封面的文件url
        self.file_url = file_url

    def validate(self):
        self.validate_required(self.out_biz_no, 'out_biz_no')
        self.validate_required(self.file_url, 'file_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.out_biz_no is not None:
            result['out_biz_no'] = self.out_biz_no
        if self.file_url is not None:
            result['file_url'] = self.file_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('out_biz_no') is not None:
            self.out_biz_no = m.get('out_biz_no')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        return self


class ExecTradeCoverResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        out_biz_no: int = None,
        ext_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 调用方唯一业务标识
        self.out_biz_no = out_biz_no
        # 扩展信息
        self.ext_info = ext_info

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
        if self.out_biz_no is not None:
            result['out_biz_no'] = self.out_biz_no
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('out_biz_no') is not None:
            self.out_biz_no = m.get('out_biz_no')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class CreateOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        client_token: str = None,
        request_id: str = None,
        invoice_info: InvoiceInfo = None,
        order_item: List[OrderItem] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 幂等字段
        self.client_token = client_token
        # 幂等id
        self.request_id = request_id
        # 发票信息
        self.invoice_info = invoice_info
        # 订单明细列表
        self.order_item = order_item

    def validate(self):
        self.validate_required(self.client_token, 'client_token')
        self.validate_required(self.request_id, 'request_id')
        if self.invoice_info:
            self.invoice_info.validate()
        if self.order_item:
            for k in self.order_item:
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
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.invoice_info is not None:
            result['invoice_info'] = self.invoice_info.to_map()
        result['order_item'] = []
        if self.order_item is not None:
            for k in self.order_item:
                result['order_item'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('invoice_info') is not None:
            temp_model = InvoiceInfo()
            self.invoice_info = temp_model.from_map(m['invoice_info'])
        self.order_item = []
        if m.get('order_item') is not None:
            for k in m.get('order_item'):
                temp_model = OrderItem()
                self.order_item.append(temp_model.from_map(k))
        return self


class CreateOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        error_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用于查询支付链接
        self.order_id = order_id
        # 创建订单失败
        self.error_msg = error_msg

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
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class QueryOrderPayurlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')

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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        return self


class QueryOrderPayurlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pay_url: str = None,
        error_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 支付链接
        self.pay_url = pay_url
        # 查询支付链接失败
        self.error_msg = error_msg

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
        if self.pay_url is not None:
            result['pay_url'] = self.pay_url
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pay_url') is not None:
            self.pay_url = m.get('pay_url')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class AddContentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_id: str = None,
        title: str = None,
        type: str = None,
        keywords: List[str] = None,
        description: str = None,
        cover_file_id: str = None,
        play_list_entity: PlayListEntity = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件id
        self.file_id = file_id
        # 内容标题
        self.title = title
        # 文件类型
        self.type = type
        # 内容标签列表
        self.keywords = keywords
        # 内容描述
        self.description = description
        # 内容封面文件id
        self.cover_file_id = cover_file_id
        # 播放列表实体：包括名称和各种授权维权信息
        self.play_list_entity = play_list_entity
        # 客户端token，幂等号，用来保证并发请求幂等性
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.title, 'title')
        self.validate_required(self.type, 'type')
        self.validate_required(self.play_list_entity, 'play_list_entity')
        if self.play_list_entity:
            self.play_list_entity.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.title is not None:
            result['title'] = self.title
        if self.type is not None:
            result['type'] = self.type
        if self.keywords is not None:
            result['keywords'] = self.keywords
        if self.description is not None:
            result['description'] = self.description
        if self.cover_file_id is not None:
            result['cover_file_id'] = self.cover_file_id
        if self.play_list_entity is not None:
            result['play_list_entity'] = self.play_list_entity.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('keywords') is not None:
            self.keywords = m.get('keywords')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('cover_file_id') is not None:
            self.cover_file_id = m.get('cover_file_id')
        if m.get('play_list_entity') is not None:
            temp_model = PlayListEntity()
            self.play_list_entity = temp_model.from_map(m['play_list_entity'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class AddContentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 视频内容id
        self.content_id = content_id

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
        if self.content_id is not None:
            result['content_id'] = self.content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('content_id') is not None:
            self.content_id = m.get('content_id')
        return self


class QueryContentStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        content_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 视频内容id
        self.content_id = content_id

    def validate(self):
        self.validate_required(self.content_id, 'content_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.content_id is not None:
            result['content_id'] = self.content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('content_id') is not None:
            self.content_id = m.get('content_id')
        return self


class QueryContentStatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content_id: str = None,
        status: str = None,
        title: str = None,
        type: str = None,
        keywords: List[str] = None,
        description: str = None,
        cover_url: str = None,
        register_id: str = None,
        auth_pdf_url: str = None,
        play_list_name: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 视频内容id
        self.content_id = content_id
        # 视频状态
        self.status = status
        # 内容标题
        self.title = title
        # 内容类型
        self.type = type
        # 标签列表
        self.keywords = keywords
        # 内容描述
        self.description = description
        # 内容封面文件地址
        self.cover_url = cover_url
        # 存证id
        self.register_id = register_id
        # 内容授权合同文件地址
        self.auth_pdf_url = auth_pdf_url
        # 播放列表名称
        self.play_list_name = play_list_name

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
        if self.content_id is not None:
            result['content_id'] = self.content_id
        if self.status is not None:
            result['status'] = self.status
        if self.title is not None:
            result['title'] = self.title
        if self.type is not None:
            result['type'] = self.type
        if self.keywords is not None:
            result['keywords'] = self.keywords
        if self.description is not None:
            result['description'] = self.description
        if self.cover_url is not None:
            result['cover_url'] = self.cover_url
        if self.register_id is not None:
            result['register_id'] = self.register_id
        if self.auth_pdf_url is not None:
            result['auth_pdf_url'] = self.auth_pdf_url
        if self.play_list_name is not None:
            result['play_list_name'] = self.play_list_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('content_id') is not None:
            self.content_id = m.get('content_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('keywords') is not None:
            self.keywords = m.get('keywords')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('cover_url') is not None:
            self.cover_url = m.get('cover_url')
        if m.get('register_id') is not None:
            self.register_id = m.get('register_id')
        if m.get('auth_pdf_url') is not None:
            self.auth_pdf_url = m.get('auth_pdf_url')
        if m.get('play_list_name') is not None:
            self.play_list_name = m.get('play_list_name')
        return self


class QueryContentStatisticsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        content_id: str = None,
        start_time: int = None,
        end_time: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 内容id列表
        self.content_id = content_id
        # 起始日期时间戳
        self.start_time = start_time
        # 截止日期时间戳
        self.end_time = end_time

    def validate(self):
        self.validate_required(self.content_id, 'content_id')
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.content_id is not None:
            result['content_id'] = self.content_id
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('content_id') is not None:
            self.content_id = m.get('content_id')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        return self


class QueryContentStatisticsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_views: str = None,
        total_view_duration: str = None,
        total_average_view_duration: str = None,
        total_revenue: str = None,
        day_statistics_list: List[DayStatisticsInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总观看次数
        self.total_views = total_views
        # 总观看时长
        self.total_view_duration = total_view_duration
        # 总平均观看时长
        self.total_average_view_duration = total_average_view_duration
        # 总预计收入
        self.total_revenue = total_revenue
        # 每日详细统计列表
        self.day_statistics_list = day_statistics_list

    def validate(self):
        if self.day_statistics_list:
            for k in self.day_statistics_list:
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
        if self.total_views is not None:
            result['total_views'] = self.total_views
        if self.total_view_duration is not None:
            result['total_view_duration'] = self.total_view_duration
        if self.total_average_view_duration is not None:
            result['total_average_view_duration'] = self.total_average_view_duration
        if self.total_revenue is not None:
            result['total_revenue'] = self.total_revenue
        result['day_statistics_list'] = []
        if self.day_statistics_list is not None:
            for k in self.day_statistics_list:
                result['day_statistics_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_views') is not None:
            self.total_views = m.get('total_views')
        if m.get('total_view_duration') is not None:
            self.total_view_duration = m.get('total_view_duration')
        if m.get('total_average_view_duration') is not None:
            self.total_average_view_duration = m.get('total_average_view_duration')
        if m.get('total_revenue') is not None:
            self.total_revenue = m.get('total_revenue')
        self.day_statistics_list = []
        if m.get('day_statistics_list') is not None:
            for k in m.get('day_statistics_list'):
                temp_model = DayStatisticsInfo()
                self.day_statistics_list.append(temp_model.from_map(k))
        return self


class QueryContentBatchstatisticsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        content_id_list: List[str] = None,
        start_time: int = None,
        end_time: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 内容id列表
        self.content_id_list = content_id_list
        # 起始日期时间戳
        self.start_time = start_time
        # 截止日期时间戳
        self.end_time = end_time

    def validate(self):
        self.validate_required(self.content_id_list, 'content_id_list')
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.content_id_list is not None:
            result['content_id_list'] = self.content_id_list
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('content_id_list') is not None:
            self.content_id_list = m.get('content_id_list')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        return self


class QueryContentBatchstatisticsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        oversea_content_statistics_list: List[OverseaContentStatistics] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 出海视频统计数据列表
        self.oversea_content_statistics_list = oversea_content_statistics_list

    def validate(self):
        if self.oversea_content_statistics_list:
            for k in self.oversea_content_statistics_list:
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
        result['oversea_content_statistics_list'] = []
        if self.oversea_content_statistics_list is not None:
            for k in self.oversea_content_statistics_list:
                result['oversea_content_statistics_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.oversea_content_statistics_list = []
        if m.get('oversea_content_statistics_list') is not None:
            for k in m.get('oversea_content_statistics_list'):
                temp_model = OverseaContentStatistics()
                self.oversea_content_statistics_list.append(temp_model.from_map(k))
        return self


class PublishGoodRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_id: str = None,
        title: str = None,
        goods_name: str = None,
        classification: str = None,
        standard_price_in_cent: int = None,
        goods_status: str = None,
        publish_time: int = None,
        auth_start_time: int = None,
        auth_end_time: int = None,
        is_author: bool = None,
        author_cert_name: str = None,
        author_cert_no: str = None,
        client_token: str = None,
        auth_info: List[AuthInfo] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件id,最长64个字符
        self.file_id = file_id
        # 商品标题，最长64个字符
        self.title = title
        # 商品名称
        self.goods_name = goods_name
        # 商品分类
        self.classification = classification
        # 售价（分）
        self.standard_price_in_cent = standard_price_in_cent
        # 上架/下架，默认上架
        self.goods_status = goods_status
        # 发布时间，默认直接发布
        self.publish_time = publish_time
        # 授权期限起始时间
        self.auth_start_time = auth_start_time
        # 授权期限结束时间（传-1 则为永久）
        self.auth_end_time = auth_end_time
        # 是否是作者
        self.is_author = is_author
        # 作者姓名，如果isAuthor为false则必填，最长30个字符
        self.author_cert_name = author_cert_name
        # 作者身份证号,如果isAuthor为false则必填
        self.author_cert_no = author_cert_no
        # 幂等号，可以保证请求的幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
        self.client_token = client_token
        # 授权信息
        self.auth_info = auth_info

    def validate(self):
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.title, 'title')
        self.validate_required(self.goods_name, 'goods_name')
        self.validate_required(self.standard_price_in_cent, 'standard_price_in_cent')
        self.validate_required(self.auth_start_time, 'auth_start_time')
        self.validate_required(self.auth_end_time, 'auth_end_time')
        self.validate_required(self.is_author, 'is_author')
        self.validate_required(self.auth_info, 'auth_info')
        if self.auth_info:
            for k in self.auth_info:
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
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.title is not None:
            result['title'] = self.title
        if self.goods_name is not None:
            result['goods_name'] = self.goods_name
        if self.classification is not None:
            result['classification'] = self.classification
        if self.standard_price_in_cent is not None:
            result['standard_price_in_cent'] = self.standard_price_in_cent
        if self.goods_status is not None:
            result['goods_status'] = self.goods_status
        if self.publish_time is not None:
            result['publish_time'] = self.publish_time
        if self.auth_start_time is not None:
            result['auth_start_time'] = self.auth_start_time
        if self.auth_end_time is not None:
            result['auth_end_time'] = self.auth_end_time
        if self.is_author is not None:
            result['is_author'] = self.is_author
        if self.author_cert_name is not None:
            result['author_cert_name'] = self.author_cert_name
        if self.author_cert_no is not None:
            result['author_cert_no'] = self.author_cert_no
        if self.client_token is not None:
            result['client_token'] = self.client_token
        result['auth_info'] = []
        if self.auth_info is not None:
            for k in self.auth_info:
                result['auth_info'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('goods_name') is not None:
            self.goods_name = m.get('goods_name')
        if m.get('classification') is not None:
            self.classification = m.get('classification')
        if m.get('standard_price_in_cent') is not None:
            self.standard_price_in_cent = m.get('standard_price_in_cent')
        if m.get('goods_status') is not None:
            self.goods_status = m.get('goods_status')
        if m.get('publish_time') is not None:
            self.publish_time = m.get('publish_time')
        if m.get('auth_start_time') is not None:
            self.auth_start_time = m.get('auth_start_time')
        if m.get('auth_end_time') is not None:
            self.auth_end_time = m.get('auth_end_time')
        if m.get('is_author') is not None:
            self.is_author = m.get('is_author')
        if m.get('author_cert_name') is not None:
            self.author_cert_name = m.get('author_cert_name')
        if m.get('author_cert_no') is not None:
            self.author_cert_no = m.get('author_cert_no')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        self.auth_info = []
        if m.get('auth_info') is not None:
            for k in m.get('auth_info'):
                temp_model = AuthInfo()
                self.auth_info.append(temp_model.from_map(k))
        return self


class PublishGoodResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pubilsh_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发布id
        self.pubilsh_id = pubilsh_id

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
        if self.pubilsh_id is not None:
            result['pubilsh_id'] = self.pubilsh_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pubilsh_id') is not None:
            self.pubilsh_id = m.get('pubilsh_id')
        return self


class QueryGoodsPublishRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        pubilsh_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 发布id
        self.pubilsh_id = pubilsh_id

    def validate(self):
        self.validate_required(self.pubilsh_id, 'pubilsh_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.pubilsh_id is not None:
            result['pubilsh_id'] = self.pubilsh_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('pubilsh_id') is not None:
            self.pubilsh_id = m.get('pubilsh_id')
        return self


class QueryGoodsPublishResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pubilsh_id: str = None,
        publish_status: str = None,
        goods_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发布id
        self.pubilsh_id = pubilsh_id
        # 发布状态
        self.publish_status = publish_status
        # 商品id
        self.goods_id = goods_id

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
        if self.pubilsh_id is not None:
            result['pubilsh_id'] = self.pubilsh_id
        if self.publish_status is not None:
            result['publish_status'] = self.publish_status
        if self.goods_id is not None:
            result['goods_id'] = self.goods_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pubilsh_id') is not None:
            self.pubilsh_id = m.get('pubilsh_id')
        if m.get('publish_status') is not None:
            self.publish_status = m.get('publish_status')
        if m.get('goods_id') is not None:
            self.goods_id = m.get('goods_id')
        return self


class UpdateGoodsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        goods_id: str = None,
        standard_price_in_cent: int = None,
        goods_status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商品id
        self.goods_id = goods_id
        # 商品价格（分）
        self.standard_price_in_cent = standard_price_in_cent
        # 商品状态:上架，下架
        self.goods_status = goods_status

    def validate(self):
        self.validate_required(self.goods_id, 'goods_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.goods_id is not None:
            result['goods_id'] = self.goods_id
        if self.standard_price_in_cent is not None:
            result['standard_price_in_cent'] = self.standard_price_in_cent
        if self.goods_status is not None:
            result['goods_status'] = self.goods_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('goods_id') is not None:
            self.goods_id = m.get('goods_id')
        if m.get('standard_price_in_cent') is not None:
            self.standard_price_in_cent = m.get('standard_price_in_cent')
        if m.get('goods_status') is not None:
            self.goods_status = m.get('goods_status')
        return self


class UpdateGoodsResponse(TeaModel):
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


class QueryGoodsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        goods_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商品id
        self.goods_id = goods_id

    def validate(self):
        self.validate_required(self.goods_id, 'goods_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.goods_id is not None:
            result['goods_id'] = self.goods_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('goods_id') is not None:
            self.goods_id = m.get('goods_id')
        return self


class QueryGoodsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        goods_info: GoodsInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商品信息
        self.goods_info = goods_info

    def validate(self):
        if self.goods_info:
            self.goods_info.validate()

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
        if self.goods_info is not None:
            result['goods_info'] = self.goods_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('goods_info') is not None:
            temp_model = GoodsInfo()
            self.goods_info = temp_model.from_map(m['goods_info'])
        return self


