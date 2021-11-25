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


class FileDefine(TeaModel):
    def __init__(
        self,
        biz_id: str = None,
        file_name: str = None,
        size: int = None,
        osskey: str = None,
        type: str = None,
        url: str = None,
    ):
        # 调用方设定，保证文件唯一性。
        # 
        # 
        self.biz_id = biz_id
        # 文件名称
        self.file_name = file_name
        # 文件大小
        self.size = size
        # 文件key
        self.osskey = osskey
        # 文件类型
        self.type = type
        # 预览链接
        self.url = url

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.osskey, 'osskey')
        self.validate_required(self.type, 'type')

    def to_map(self):
        result = dict()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.size is not None:
            result['size'] = self.size
        if self.osskey is not None:
            result['osskey'] = self.osskey
        if self.type is not None:
            result['type'] = self.type
        if self.url is not None:
            result['url'] = self.url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('size') is not None:
            self.size = m.get('size')
        if m.get('osskey') is not None:
            self.osskey = m.get('osskey')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('url') is not None:
            self.url = m.get('url')
        return self


class Award(TeaModel):
    def __init__(
        self,
        award_name: str = None,
        award_level: str = None,
        issue_date: str = None,
        effect_start_date: str = None,
        effect_end_date: str = None,
        file_defines: List[FileDefine] = None,
        award_id: str = None,
    ):
        # 奖项名称
        # 
        # 
        self.award_name = award_name
        # 奖项级别（参见附录十四）
        # 
        # 
        self.award_level = award_level
        # 颁发日期（yyyy）
        # 
        # 
        self.issue_date = issue_date
        # 有效开始日期（yyyy-MM-dd）
        # 
        # 
        self.effect_start_date = effect_start_date
        # 有效结束日期（yyyy-MM-dd）
        # 
        # 
        self.effect_end_date = effect_end_date
        # 文件信息，支持上传多个文件
        # 
        # 
        self.file_defines = file_defines
        # key
        self.award_id = award_id

    def validate(self):
        self.validate_required(self.award_name, 'award_name')
        self.validate_required(self.award_level, 'award_level')
        self.validate_required(self.issue_date, 'issue_date')
        self.validate_required(self.effect_start_date, 'effect_start_date')
        self.validate_required(self.effect_end_date, 'effect_end_date')
        self.validate_required(self.file_defines, 'file_defines')
        if self.file_defines:
            for k in self.file_defines:
                if k:
                    k.validate()
        self.validate_required(self.award_id, 'award_id')

    def to_map(self):
        result = dict()
        if self.award_name is not None:
            result['award_name'] = self.award_name
        if self.award_level is not None:
            result['award_level'] = self.award_level
        if self.issue_date is not None:
            result['issue_date'] = self.issue_date
        if self.effect_start_date is not None:
            result['effect_start_date'] = self.effect_start_date
        if self.effect_end_date is not None:
            result['effect_end_date'] = self.effect_end_date
        result['file_defines'] = []
        if self.file_defines is not None:
            for k in self.file_defines:
                result['file_defines'].append(k.to_map() if k else None)
        if self.award_id is not None:
            result['award_id'] = self.award_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('award_name') is not None:
            self.award_name = m.get('award_name')
        if m.get('award_level') is not None:
            self.award_level = m.get('award_level')
        if m.get('issue_date') is not None:
            self.issue_date = m.get('issue_date')
        if m.get('effect_start_date') is not None:
            self.effect_start_date = m.get('effect_start_date')
        if m.get('effect_end_date') is not None:
            self.effect_end_date = m.get('effect_end_date')
        self.file_defines = []
        if m.get('file_defines') is not None:
            for k in m.get('file_defines'):
                temp_model = FileDefine()
                self.file_defines.append(temp_model.from_map(k))
        if m.get('award_id') is not None:
            self.award_id = m.get('award_id')
        return self


class Construction(TeaModel):
    def __init__(
        self,
        cert_num: str = None,
        issuing_authority: str = None,
        cert_type: str = None,
        level: str = None,
        effect_start_date: str = None,
        effect_end_date: str = None,
        file_defines: List[FileDefine] = None,
        construction_id: str = None,
        cert_name: str = None,
    ):
        # 证书编号
        # 
        # 
        self.cert_num = cert_num
        # 发证机关
        # 
        # 
        self.issuing_authority = issuing_authority
        # 资质类别
        self.cert_type = cert_type
        # 等级
        self.level = level
        # 有效期开始日期（yyyy-MM-dd）
        # 
        # 
        self.effect_start_date = effect_start_date
        # 有效期结束日期（yyyy-MM-dd）
        # 
        # 
        self.effect_end_date = effect_end_date
        # 文件
        self.file_defines = file_defines
        # key
        self.construction_id = construction_id
        # 证件名称
        self.cert_name = cert_name

    def validate(self):
        self.validate_required(self.cert_num, 'cert_num')
        self.validate_required(self.issuing_authority, 'issuing_authority')
        self.validate_required(self.cert_type, 'cert_type')
        self.validate_required(self.level, 'level')
        self.validate_required(self.effect_start_date, 'effect_start_date')
        self.validate_required(self.effect_end_date, 'effect_end_date')
        if self.file_defines:
            for k in self.file_defines:
                if k:
                    k.validate()
        self.validate_required(self.construction_id, 'construction_id')
        self.validate_required(self.cert_name, 'cert_name')

    def to_map(self):
        result = dict()
        if self.cert_num is not None:
            result['cert_num'] = self.cert_num
        if self.issuing_authority is not None:
            result['issuing_authority'] = self.issuing_authority
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.level is not None:
            result['level'] = self.level
        if self.effect_start_date is not None:
            result['effect_start_date'] = self.effect_start_date
        if self.effect_end_date is not None:
            result['effect_end_date'] = self.effect_end_date
        result['file_defines'] = []
        if self.file_defines is not None:
            for k in self.file_defines:
                result['file_defines'].append(k.to_map() if k else None)
        if self.construction_id is not None:
            result['construction_id'] = self.construction_id
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cert_num') is not None:
            self.cert_num = m.get('cert_num')
        if m.get('issuing_authority') is not None:
            self.issuing_authority = m.get('issuing_authority')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('level') is not None:
            self.level = m.get('level')
        if m.get('effect_start_date') is not None:
            self.effect_start_date = m.get('effect_start_date')
        if m.get('effect_end_date') is not None:
            self.effect_end_date = m.get('effect_end_date')
        self.file_defines = []
        if m.get('file_defines') is not None:
            for k in m.get('file_defines'):
                temp_model = FileDefine()
                self.file_defines.append(temp_model.from_map(k))
        if m.get('construction_id') is not None:
            self.construction_id = m.get('construction_id')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        return self


class Assure(TeaModel):
    def __init__(
        self,
        assure_id: str = None,
        file_defines: List[FileDefine] = None,
    ):
        # 担保ID
        # 
        # 
        self.assure_id = assure_id
        # 文件信息，支持上传多个文件
        # 
        # 
        self.file_defines = file_defines

    def validate(self):
        self.validate_required(self.assure_id, 'assure_id')
        self.validate_required(self.file_defines, 'file_defines')
        if self.file_defines:
            for k in self.file_defines:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.assure_id is not None:
            result['assure_id'] = self.assure_id
        result['file_defines'] = []
        if self.file_defines is not None:
            for k in self.file_defines:
                result['file_defines'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('assure_id') is not None:
            self.assure_id = m.get('assure_id')
        self.file_defines = []
        if m.get('file_defines') is not None:
            for k in m.get('file_defines'):
                temp_model = FileDefine()
                self.file_defines.append(temp_model.from_map(k))
        return self


class BankCert(TeaModel):
    def __init__(
        self,
        bank_account: str = None,
        bank_name: str = None,
        file_defines: List[FileDefine] = None,
    ):
        # 银行账号
        # 
        # 
        self.bank_account = bank_account
        # 银行名称
        # 
        # 
        self.bank_name = bank_name
        # 文件信息，支持上传多个文件
        # 
        # 
        self.file_defines = file_defines

    def validate(self):
        self.validate_required(self.bank_account, 'bank_account')
        self.validate_required(self.bank_name, 'bank_name')
        self.validate_required(self.file_defines, 'file_defines')
        if self.file_defines:
            for k in self.file_defines:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.bank_account is not None:
            result['bank_account'] = self.bank_account
        if self.bank_name is not None:
            result['bank_name'] = self.bank_name
        result['file_defines'] = []
        if self.file_defines is not None:
            for k in self.file_defines:
                result['file_defines'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('bank_account') is not None:
            self.bank_account = m.get('bank_account')
        if m.get('bank_name') is not None:
            self.bank_name = m.get('bank_name')
        self.file_defines = []
        if m.get('file_defines') is not None:
            for k in m.get('file_defines'):
                temp_model = FileDefine()
                self.file_defines.append(temp_model.from_map(k))
        return self


class AccountResult(TeaModel):
    def __init__(
        self,
        acc_result_id: str = None,
        file_defines: List[FileDefine] = None,
    ):
        # 财报ID
        # 
        # 
        self.acc_result_id = acc_result_id
        # 文件信息，支持上传多个文件
        # 
        # 
        self.file_defines = file_defines

    def validate(self):
        self.validate_required(self.acc_result_id, 'acc_result_id')
        self.validate_required(self.file_defines, 'file_defines')
        if self.file_defines:
            for k in self.file_defines:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.acc_result_id is not None:
            result['acc_result_id'] = self.acc_result_id
        result['file_defines'] = []
        if self.file_defines is not None:
            for k in self.file_defines:
                result['file_defines'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('acc_result_id') is not None:
            self.acc_result_id = m.get('acc_result_id')
        self.file_defines = []
        if m.get('file_defines') is not None:
            for k in m.get('file_defines'):
                temp_model = FileDefine()
                self.file_defines.append(temp_model.from_map(k))
        return self


class RefFirm(TeaModel):
    def __init__(
        self,
        firm_user_id: int = None,
        did: str = None,
        firm_address: str = None,
        firm_cert_status: str = None,
        industry_type: str = None,
        cert_reg_no: str = None,
        cert_reg_file_id: str = None,
        cert_reg_file_type: str = None,
        lp_cert_type: str = None,
        lp_cert_no: str = None,
        lp_name: str = None,
        lp_cert_file_front_id: str = None,
        lp_cert_file_front_type: str = None,
        lp_cert_file_reverse_id: str = None,
        lp_cert_file_reverse_type: str = None,
        constructions: List[Construction] = None,
        firm_name: str = None,
        refer_type: str = None,
        account_results: List[AccountResult] = None,
        assures: List[Assure] = None,
        awards: List[Award] = None,
        bank_cert: BankCert = None,
        firm_type: str = None,
        bank_cert_status: bool = None,
        construction_status: bool = None,
        account_result_status: bool = None,
        award_status: bool = None,
    ):
        # 企业Id
        # 
        # 
        self.firm_user_id = firm_user_id
        # did
        self.did = did
        # 
        # 企业所在地
        self.firm_address = firm_address
        # 企业认证状态
        self.firm_cert_status = firm_cert_status
        # 行业类型
        self.industry_type = industry_type
        # 企业营业执照注册号
        # 
        # 
        self.cert_reg_no = cert_reg_no
        # 营业执照文件osskey
        # 
        # 
        self.cert_reg_file_id = cert_reg_file_id
        # 营业文件类型(JPEG,JPG)
        # 
        # 
        self.cert_reg_file_type = cert_reg_file_type
        # 法定代表人证件类型
        self.lp_cert_type = lp_cert_type
        # 法人证件号码
        # 
        self.lp_cert_no = lp_cert_no
        # 法人姓名
        # 
        # 
        self.lp_name = lp_name
        # 法人身份证正面图片字节信息，osskeyId
        # 
        # 
        self.lp_cert_file_front_id = lp_cert_file_front_id
        # 法人身份证正面图片文件类型
        # 
        # 
        self.lp_cert_file_front_type = lp_cert_file_front_type
        # 企业法人证件反面图片，osskeyId
        # 
        # 
        self.lp_cert_file_reverse_id = lp_cert_file_reverse_id
        # 法人身份证反面图片文件类型
        # 
        # 
        self.lp_cert_file_reverse_type = lp_cert_file_reverse_type
        # 施工资质
        # 
        # 
        self.constructions = constructions
        # 企业名称
        # 
        # 
        self.firm_name = firm_name
        # 关联关系 （参见附录三）
        # 
        # 
        self.refer_type = refer_type
        # 资信-财报
        # 
        # 
        self.account_results = account_results
        # 资信-担保
        # 
        # 
        self.assures = assures
        # 奖项
        # 
        # 
        self.awards = awards
        # 银行授信
        # 
        # 
        self.bank_cert = bank_cert
        # 类型
        self.firm_type = firm_type
        # 银行授信状态
        self.bank_cert_status = bank_cert_status
        # 资质证书状态
        self.construction_status = construction_status
        # 资信-财报状态
        self.account_result_status = account_result_status
        # 奖项状态
        self.award_status = award_status

    def validate(self):
        self.validate_required(self.firm_user_id, 'firm_user_id')
        self.validate_required(self.did, 'did')
        self.validate_required(self.firm_address, 'firm_address')
        self.validate_required(self.firm_cert_status, 'firm_cert_status')
        self.validate_required(self.industry_type, 'industry_type')
        self.validate_required(self.cert_reg_no, 'cert_reg_no')
        self.validate_required(self.cert_reg_file_id, 'cert_reg_file_id')
        self.validate_required(self.cert_reg_file_type, 'cert_reg_file_type')
        self.validate_required(self.lp_cert_type, 'lp_cert_type')
        self.validate_required(self.lp_cert_no, 'lp_cert_no')
        self.validate_required(self.lp_name, 'lp_name')
        self.validate_required(self.lp_cert_file_front_id, 'lp_cert_file_front_id')
        self.validate_required(self.lp_cert_file_front_type, 'lp_cert_file_front_type')
        self.validate_required(self.lp_cert_file_reverse_id, 'lp_cert_file_reverse_id')
        self.validate_required(self.lp_cert_file_reverse_type, 'lp_cert_file_reverse_type')
        self.validate_required(self.constructions, 'constructions')
        if self.constructions:
            for k in self.constructions:
                if k:
                    k.validate()
        self.validate_required(self.firm_name, 'firm_name')
        self.validate_required(self.refer_type, 'refer_type')
        self.validate_required(self.account_results, 'account_results')
        if self.account_results:
            for k in self.account_results:
                if k:
                    k.validate()
        self.validate_required(self.assures, 'assures')
        if self.assures:
            for k in self.assures:
                if k:
                    k.validate()
        self.validate_required(self.awards, 'awards')
        if self.awards:
            for k in self.awards:
                if k:
                    k.validate()
        self.validate_required(self.bank_cert, 'bank_cert')
        if self.bank_cert:
            self.bank_cert.validate()
        self.validate_required(self.firm_type, 'firm_type')
        self.validate_required(self.account_result_status, 'account_result_status')

    def to_map(self):
        result = dict()
        if self.firm_user_id is not None:
            result['firm_user_id'] = self.firm_user_id
        if self.did is not None:
            result['did'] = self.did
        if self.firm_address is not None:
            result['firm_address'] = self.firm_address
        if self.firm_cert_status is not None:
            result['firm_cert_status'] = self.firm_cert_status
        if self.industry_type is not None:
            result['industry_type'] = self.industry_type
        if self.cert_reg_no is not None:
            result['cert_reg_no'] = self.cert_reg_no
        if self.cert_reg_file_id is not None:
            result['cert_reg_file_id'] = self.cert_reg_file_id
        if self.cert_reg_file_type is not None:
            result['cert_reg_file_type'] = self.cert_reg_file_type
        if self.lp_cert_type is not None:
            result['lp_cert_type'] = self.lp_cert_type
        if self.lp_cert_no is not None:
            result['lp_cert_no'] = self.lp_cert_no
        if self.lp_name is not None:
            result['lp_name'] = self.lp_name
        if self.lp_cert_file_front_id is not None:
            result['lp_cert_file_front_id'] = self.lp_cert_file_front_id
        if self.lp_cert_file_front_type is not None:
            result['lp_cert_file_front_type'] = self.lp_cert_file_front_type
        if self.lp_cert_file_reverse_id is not None:
            result['lp_cert_file_reverse_id'] = self.lp_cert_file_reverse_id
        if self.lp_cert_file_reverse_type is not None:
            result['lp_cert_file_reverse_type'] = self.lp_cert_file_reverse_type
        result['constructions'] = []
        if self.constructions is not None:
            for k in self.constructions:
                result['constructions'].append(k.to_map() if k else None)
        if self.firm_name is not None:
            result['firm_name'] = self.firm_name
        if self.refer_type is not None:
            result['refer_type'] = self.refer_type
        result['account_results'] = []
        if self.account_results is not None:
            for k in self.account_results:
                result['account_results'].append(k.to_map() if k else None)
        result['assures'] = []
        if self.assures is not None:
            for k in self.assures:
                result['assures'].append(k.to_map() if k else None)
        result['awards'] = []
        if self.awards is not None:
            for k in self.awards:
                result['awards'].append(k.to_map() if k else None)
        if self.bank_cert is not None:
            result['bank_cert'] = self.bank_cert.to_map()
        if self.firm_type is not None:
            result['firm_type'] = self.firm_type
        if self.bank_cert_status is not None:
            result['bank_cert_status'] = self.bank_cert_status
        if self.construction_status is not None:
            result['construction_status'] = self.construction_status
        if self.account_result_status is not None:
            result['account_result_status'] = self.account_result_status
        if self.award_status is not None:
            result['award_status'] = self.award_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('firm_user_id') is not None:
            self.firm_user_id = m.get('firm_user_id')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('firm_address') is not None:
            self.firm_address = m.get('firm_address')
        if m.get('firm_cert_status') is not None:
            self.firm_cert_status = m.get('firm_cert_status')
        if m.get('industry_type') is not None:
            self.industry_type = m.get('industry_type')
        if m.get('cert_reg_no') is not None:
            self.cert_reg_no = m.get('cert_reg_no')
        if m.get('cert_reg_file_id') is not None:
            self.cert_reg_file_id = m.get('cert_reg_file_id')
        if m.get('cert_reg_file_type') is not None:
            self.cert_reg_file_type = m.get('cert_reg_file_type')
        if m.get('lp_cert_type') is not None:
            self.lp_cert_type = m.get('lp_cert_type')
        if m.get('lp_cert_no') is not None:
            self.lp_cert_no = m.get('lp_cert_no')
        if m.get('lp_name') is not None:
            self.lp_name = m.get('lp_name')
        if m.get('lp_cert_file_front_id') is not None:
            self.lp_cert_file_front_id = m.get('lp_cert_file_front_id')
        if m.get('lp_cert_file_front_type') is not None:
            self.lp_cert_file_front_type = m.get('lp_cert_file_front_type')
        if m.get('lp_cert_file_reverse_id') is not None:
            self.lp_cert_file_reverse_id = m.get('lp_cert_file_reverse_id')
        if m.get('lp_cert_file_reverse_type') is not None:
            self.lp_cert_file_reverse_type = m.get('lp_cert_file_reverse_type')
        self.constructions = []
        if m.get('constructions') is not None:
            for k in m.get('constructions'):
                temp_model = Construction()
                self.constructions.append(temp_model.from_map(k))
        if m.get('firm_name') is not None:
            self.firm_name = m.get('firm_name')
        if m.get('refer_type') is not None:
            self.refer_type = m.get('refer_type')
        self.account_results = []
        if m.get('account_results') is not None:
            for k in m.get('account_results'):
                temp_model = AccountResult()
                self.account_results.append(temp_model.from_map(k))
        self.assures = []
        if m.get('assures') is not None:
            for k in m.get('assures'):
                temp_model = Assure()
                self.assures.append(temp_model.from_map(k))
        self.awards = []
        if m.get('awards') is not None:
            for k in m.get('awards'):
                temp_model = Award()
                self.awards.append(temp_model.from_map(k))
        if m.get('bank_cert') is not None:
            temp_model = BankCert()
            self.bank_cert = temp_model.from_map(m['bank_cert'])
        if m.get('firm_type') is not None:
            self.firm_type = m.get('firm_type')
        if m.get('bank_cert_status') is not None:
            self.bank_cert_status = m.get('bank_cert_status')
        if m.get('construction_status') is not None:
            self.construction_status = m.get('construction_status')
        if m.get('account_result_status') is not None:
            self.account_result_status = m.get('account_result_status')
        if m.get('award_status') is not None:
            self.award_status = m.get('award_status')
        return self


class ContractFlowSigner(TeaModel):
    def __init__(
        self,
        signer_account_id: str = None,
        signer_authorized_account_id: str = None,
        signer_authorized_account_name: str = None,
        signer_authorized_account_real_name: bool = None,
        signer_authorized_account_type: int = None,
        signer_name: str = None,
        signer_real_name: bool = None,
        sign_order: int = None,
        sign_status: int = None,
        third_order_no: str = None,
    ):
        # 签署人账号id
        # 
        self.signer_account_id = signer_account_id
        # 签约主体的账号id（个人/企业）；如签署人本签署，则返回签署人账号id；如签署人代机构签署，则返回机构账号id
        # 
        self.signer_authorized_account_id = signer_authorized_account_id
        # 签约主体名称
        # 
        self.signer_authorized_account_name = signer_authorized_account_name
        # 签署主体是否已实名
        # 
        self.signer_authorized_account_real_name = signer_authorized_account_real_name
        # 签署主体类型, 0-个人, 1-机构
        # 
        self.signer_authorized_account_type = signer_authorized_account_type
        # 签署人名称
        # 
        self.signer_name = signer_name
        # 签署人是否已实名
        # 
        self.signer_real_name = signer_real_name
        # 签署顺序
        # 
        self.sign_order = sign_order
        # 签署状态, 0-待签, 1-未签, 2-已签 3-待审批 4-拒签
        # 
        self.sign_status = sign_status
        # 本次签署任务对应指定的第三方业务流水号id，当存在多个第三方业务流水号id时，返回多个，并逗号隔开
        # 
        self.third_order_no = third_order_no

    def validate(self):
        self.validate_required(self.signer_account_id, 'signer_account_id')
        self.validate_required(self.signer_authorized_account_id, 'signer_authorized_account_id')
        self.validate_required(self.signer_authorized_account_name, 'signer_authorized_account_name')
        self.validate_required(self.signer_authorized_account_real_name, 'signer_authorized_account_real_name')
        self.validate_required(self.signer_authorized_account_type, 'signer_authorized_account_type')
        self.validate_required(self.signer_name, 'signer_name')
        self.validate_required(self.signer_real_name, 'signer_real_name')
        self.validate_required(self.sign_order, 'sign_order')
        self.validate_required(self.sign_status, 'sign_status')
        self.validate_required(self.third_order_no, 'third_order_no')

    def to_map(self):
        result = dict()
        if self.signer_account_id is not None:
            result['signer_account_id'] = self.signer_account_id
        if self.signer_authorized_account_id is not None:
            result['signer_authorized_account_id'] = self.signer_authorized_account_id
        if self.signer_authorized_account_name is not None:
            result['signer_authorized_account_name'] = self.signer_authorized_account_name
        if self.signer_authorized_account_real_name is not None:
            result['signer_authorized_account_real_name'] = self.signer_authorized_account_real_name
        if self.signer_authorized_account_type is not None:
            result['signer_authorized_account_type'] = self.signer_authorized_account_type
        if self.signer_name is not None:
            result['signer_name'] = self.signer_name
        if self.signer_real_name is not None:
            result['signer_real_name'] = self.signer_real_name
        if self.sign_order is not None:
            result['sign_order'] = self.sign_order
        if self.sign_status is not None:
            result['sign_status'] = self.sign_status
        if self.third_order_no is not None:
            result['third_order_no'] = self.third_order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('signer_account_id') is not None:
            self.signer_account_id = m.get('signer_account_id')
        if m.get('signer_authorized_account_id') is not None:
            self.signer_authorized_account_id = m.get('signer_authorized_account_id')
        if m.get('signer_authorized_account_name') is not None:
            self.signer_authorized_account_name = m.get('signer_authorized_account_name')
        if m.get('signer_authorized_account_real_name') is not None:
            self.signer_authorized_account_real_name = m.get('signer_authorized_account_real_name')
        if m.get('signer_authorized_account_type') is not None:
            self.signer_authorized_account_type = m.get('signer_authorized_account_type')
        if m.get('signer_name') is not None:
            self.signer_name = m.get('signer_name')
        if m.get('signer_real_name') is not None:
            self.signer_real_name = m.get('signer_real_name')
        if m.get('sign_order') is not None:
            self.sign_order = m.get('sign_order')
        if m.get('sign_status') is not None:
            self.sign_status = m.get('sign_status')
        if m.get('third_order_no') is not None:
            self.third_order_no = m.get('third_order_no')
        return self


class UserDetailData(TeaModel):
    def __init__(
        self,
        user_id: int = None,
        did: str = None,
        login_id: str = None,
        user_name: str = None,
        user_type: str = None,
        account_type: str = None,
        cert_status: str = None,
        email: str = None,
        telphone: str = None,
        cert_type: str = None,
        cert_num: str = None,
        cert_file_front_id: str = None,
        cert_file_front_type: str = None,
        cert_file_reverse_id: str = None,
        cert_file_reverse_type: str = None,
        ref_firms: List[RefFirm] = None,
        seal_flag: bool = None,
    ):
        # 账户Id
        self.user_id = user_id
        # 统一身份id
        # 
        # 
        self.did = did
        # 账户名
        # 
        # 
        self.login_id = login_id
        # 用户姓名
        # 
        # 
        self.user_name = user_name
        # 用户类型
        self.user_type = user_type
        # 账户类型
        self.account_type = account_type
        # 个人认证状态
        self.cert_status = cert_status
        # 邮箱
        self.email = email
        # 手机号
        self.telphone = telphone
        # 个人证件类型
        self.cert_type = cert_type
        # 证件号码
        # 
        self.cert_num = cert_num
        # cert_file_front_id
        self.cert_file_front_id = cert_file_front_id
        # 个人证件正面类型
        self.cert_file_front_type = cert_file_front_type
        # 个人证件反面图片，osskeyId
        # 
        # 
        self.cert_file_reverse_id = cert_file_reverse_id
        # 个人证件反面类型。JPG
        # 
        # 
        self.cert_file_reverse_type = cert_file_reverse_type
        # 关联企业信息
        # 
        # 
        self.ref_firms = ref_firms
        # 是否有印章
        self.seal_flag = seal_flag

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.did, 'did')
        self.validate_required(self.login_id, 'login_id')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.user_type, 'user_type')
        self.validate_required(self.account_type, 'account_type')
        self.validate_required(self.cert_status, 'cert_status')
        self.validate_required(self.email, 'email')
        self.validate_required(self.telphone, 'telphone')
        self.validate_required(self.cert_type, 'cert_type')
        self.validate_required(self.cert_num, 'cert_num')
        self.validate_required(self.cert_file_front_id, 'cert_file_front_id')
        self.validate_required(self.cert_file_front_type, 'cert_file_front_type')
        self.validate_required(self.cert_file_reverse_id, 'cert_file_reverse_id')
        self.validate_required(self.cert_file_reverse_type, 'cert_file_reverse_type')
        self.validate_required(self.ref_firms, 'ref_firms')
        if self.ref_firms:
            for k in self.ref_firms:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.did is not None:
            result['did'] = self.did
        if self.login_id is not None:
            result['login_id'] = self.login_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.account_type is not None:
            result['account_type'] = self.account_type
        if self.cert_status is not None:
            result['cert_status'] = self.cert_status
        if self.email is not None:
            result['email'] = self.email
        if self.telphone is not None:
            result['telphone'] = self.telphone
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.cert_num is not None:
            result['cert_num'] = self.cert_num
        if self.cert_file_front_id is not None:
            result['cert_file_front_id'] = self.cert_file_front_id
        if self.cert_file_front_type is not None:
            result['cert_file_front_type'] = self.cert_file_front_type
        if self.cert_file_reverse_id is not None:
            result['cert_file_reverse_id'] = self.cert_file_reverse_id
        if self.cert_file_reverse_type is not None:
            result['cert_file_reverse_type'] = self.cert_file_reverse_type
        result['ref_firms'] = []
        if self.ref_firms is not None:
            for k in self.ref_firms:
                result['ref_firms'].append(k.to_map() if k else None)
        if self.seal_flag is not None:
            result['seal_flag'] = self.seal_flag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('login_id') is not None:
            self.login_id = m.get('login_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('account_type') is not None:
            self.account_type = m.get('account_type')
        if m.get('cert_status') is not None:
            self.cert_status = m.get('cert_status')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('telphone') is not None:
            self.telphone = m.get('telphone')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('cert_num') is not None:
            self.cert_num = m.get('cert_num')
        if m.get('cert_file_front_id') is not None:
            self.cert_file_front_id = m.get('cert_file_front_id')
        if m.get('cert_file_front_type') is not None:
            self.cert_file_front_type = m.get('cert_file_front_type')
        if m.get('cert_file_reverse_id') is not None:
            self.cert_file_reverse_id = m.get('cert_file_reverse_id')
        if m.get('cert_file_reverse_type') is not None:
            self.cert_file_reverse_type = m.get('cert_file_reverse_type')
        self.ref_firms = []
        if m.get('ref_firms') is not None:
            for k in m.get('ref_firms'):
                temp_model = RefFirm()
                self.ref_firms.append(temp_model.from_map(k))
        if m.get('seal_flag') is not None:
            self.seal_flag = m.get('seal_flag')
        return self


class TokenData(TeaModel):
    def __init__(
        self,
        access_token: str = None,
        token_type: str = None,
        expiresln: int = None,
        refresh_token: str = None,
        session_id: str = None,
    ):
        # 授权token
        self.access_token = access_token
        # 授权类型
        self.token_type = token_type
        # 过期时间
        self.expiresln = expiresln
        # 重新刷新Token
        self.refresh_token = refresh_token
        # sessionid
        self.session_id = session_id

    def validate(self):
        self.validate_required(self.access_token, 'access_token')
        self.validate_required(self.token_type, 'token_type')
        self.validate_required(self.expiresln, 'expiresln')
        self.validate_required(self.refresh_token, 'refresh_token')

    def to_map(self):
        result = dict()
        if self.access_token is not None:
            result['access_token'] = self.access_token
        if self.token_type is not None:
            result['token_type'] = self.token_type
        if self.expiresln is not None:
            result['expiresln'] = self.expiresln
        if self.refresh_token is not None:
            result['refresh_token'] = self.refresh_token
        if self.session_id is not None:
            result['session_id'] = self.session_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        if m.get('token_type') is not None:
            self.token_type = m.get('token_type')
        if m.get('expiresln') is not None:
            self.expiresln = m.get('expiresln')
        if m.get('refresh_token') is not None:
            self.refresh_token = m.get('refresh_token')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        return self


class ContractDocAddress(TeaModel):
    def __init__(
        self,
        file_id: str = None,
        file_name: str = None,
        file_url: str = None,
        tx_hash: str = None,
    ):
        # 电子合同文档ID
        # 
        self.file_id = file_id
        # 电子合同文档名称，默认文件名称
        # 
        self.file_name = file_name
        # 电子合同下载文档地址, 有效时间1小时
        # 
        self.file_url = file_url
        # 链上hash
        self.tx_hash = tx_hash

    def validate(self):
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.file_url, 'file_url')

    def to_map(self):
        result = dict()
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_url is not None:
            result['file_url'] = self.file_url
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class WorkersBaseInfo(TeaModel):
    def __init__(
        self,
        full_name: str = None,
        id_card: str = None,
        id_card_start_date: str = None,
        id_card_end_date: str = None,
        workers_did: str = None,
        mobile_no: str = None,
        work_type: List[str] = None,
        work_state: str = None,
        enter_time: str = None,
        quit_time: str = None,
        compensation: str = None,
    ):
        # 姓名
        self.full_name = full_name
        # 身份证号
        self.id_card = id_card
        # 身份证有效期起
        self.id_card_start_date = id_card_start_date
        # 身份证有效期止
        self.id_card_end_date = id_card_end_date
        # 农民工个人did（实名认证后才有工号id）
        self.workers_did = workers_did
        # 手机号
        self.mobile_no = mobile_no
        # 工种
        self.work_type = work_type
        # 工作状态   [1.进场   2.退场]
        self.work_state = work_state
        # 进场时间
        self.enter_time = enter_time
        # 退场时间
        self.quit_time = quit_time
        # 合同薪资（单位：元）
        self.compensation = compensation

    def validate(self):
        self.validate_required(self.full_name, 'full_name')
        self.validate_required(self.id_card, 'id_card')
        if self.id_card_start_date is not None:
            self.validate_pattern(self.id_card_start_date, 'id_card_start_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.id_card_end_date is not None:
            self.validate_pattern(self.id_card_end_date, 'id_card_end_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.work_type, 'work_type')
        self.validate_required(self.enter_time, 'enter_time')
        if self.enter_time is not None:
            self.validate_pattern(self.enter_time, 'enter_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.quit_time is not None:
            self.validate_pattern(self.quit_time, 'quit_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.full_name is not None:
            result['full_name'] = self.full_name
        if self.id_card is not None:
            result['id_card'] = self.id_card
        if self.id_card_start_date is not None:
            result['id_card_start_date'] = self.id_card_start_date
        if self.id_card_end_date is not None:
            result['id_card_end_date'] = self.id_card_end_date
        if self.workers_did is not None:
            result['workers_did'] = self.workers_did
        if self.mobile_no is not None:
            result['mobile_no'] = self.mobile_no
        if self.work_type is not None:
            result['work_type'] = self.work_type
        if self.work_state is not None:
            result['work_state'] = self.work_state
        if self.enter_time is not None:
            result['enter_time'] = self.enter_time
        if self.quit_time is not None:
            result['quit_time'] = self.quit_time
        if self.compensation is not None:
            result['compensation'] = self.compensation
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('full_name') is not None:
            self.full_name = m.get('full_name')
        if m.get('id_card') is not None:
            self.id_card = m.get('id_card')
        if m.get('id_card_start_date') is not None:
            self.id_card_start_date = m.get('id_card_start_date')
        if m.get('id_card_end_date') is not None:
            self.id_card_end_date = m.get('id_card_end_date')
        if m.get('workers_did') is not None:
            self.workers_did = m.get('workers_did')
        if m.get('mobile_no') is not None:
            self.mobile_no = m.get('mobile_no')
        if m.get('work_type') is not None:
            self.work_type = m.get('work_type')
        if m.get('work_state') is not None:
            self.work_state = m.get('work_state')
        if m.get('enter_time') is not None:
            self.enter_time = m.get('enter_time')
        if m.get('quit_time') is not None:
            self.quit_time = m.get('quit_time')
        if m.get('compensation') is not None:
            self.compensation = m.get('compensation')
        return self


class ContractSignField(TeaModel):
    def __init__(
        self,
        account_id: str = None,
        file_id: str = None,
        signfield_id: str = None,
    ):
        # account_id
        self.account_id = account_id
        # file_id
        self.file_id = file_id
        # signfield_id
        self.signfield_id = signfield_id

    def validate(self):
        self.validate_required(self.account_id, 'account_id')
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.signfield_id, 'signfield_id')

    def to_map(self):
        result = dict()
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.signfield_id is not None:
            result['signfield_id'] = self.signfield_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('signfield_id') is not None:
            self.signfield_id = m.get('signfield_id')
        return self


class WorkersWagePayment(TeaModel):
    def __init__(
        self,
        pay_ym: str = None,
        pay_wages: str = None,
    ):
        # 薪资年月
        self.pay_ym = pay_ym
        # 工资是否发放[已发放 未发放]
        self.pay_wages = pay_wages

    def validate(self):
        self.validate_required(self.pay_ym, 'pay_ym')
        if self.pay_ym is not None:
            self.validate_pattern(self.pay_ym, 'pay_ym', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.pay_wages, 'pay_wages')

    def to_map(self):
        result = dict()
        if self.pay_ym is not None:
            result['pay_y_m'] = self.pay_ym
        if self.pay_wages is not None:
            result['pay_wages'] = self.pay_wages
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pay_y_m') is not None:
            self.pay_ym = m.get('pay_y_m')
        if m.get('pay_wages') is not None:
            self.pay_wages = m.get('pay_wages')
        return self


class UserData(TeaModel):
    def __init__(
        self,
        login_id: str = None,
        user_id: int = None,
        user_type: str = None,
        user_name: str = None,
        ref_firms: List[RefFirm] = None,
        cert_status: str = None,
        account_type: str = None,
        did: str = None,
    ):
        # 账号id
        self.login_id = login_id
        # 账号id
        self.user_id = user_id
        # 用户类型
        self.user_type = user_type
        # 用户姓名
        self.user_name = user_name
        # 关联企业
        self.ref_firms = ref_firms
        # 认证状态
        self.cert_status = cert_status
        # 账户类别
        self.account_type = account_type
        # did
        self.did = did

    def validate(self):
        self.validate_required(self.login_id, 'login_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.user_type, 'user_type')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.ref_firms, 'ref_firms')
        if self.ref_firms:
            for k in self.ref_firms:
                if k:
                    k.validate()
        self.validate_required(self.cert_status, 'cert_status')
        self.validate_required(self.account_type, 'account_type')
        self.validate_required(self.did, 'did')

    def to_map(self):
        result = dict()
        if self.login_id is not None:
            result['login_id'] = self.login_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.user_name is not None:
            result['user_name'] = self.user_name
        result['ref_firms'] = []
        if self.ref_firms is not None:
            for k in self.ref_firms:
                result['ref_firms'].append(k.to_map() if k else None)
        if self.cert_status is not None:
            result['cert_status'] = self.cert_status
        if self.account_type is not None:
            result['account_type'] = self.account_type
        if self.did is not None:
            result['did'] = self.did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('login_id') is not None:
            self.login_id = m.get('login_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        self.ref_firms = []
        if m.get('ref_firms') is not None:
            for k in m.get('ref_firms'):
                temp_model = RefFirm()
                self.ref_firms.append(temp_model.from_map(k))
        if m.get('cert_status') is not None:
            self.cert_status = m.get('cert_status')
        if m.get('account_type') is not None:
            self.account_type = m.get('account_type')
        if m.get('did') is not None:
            self.did = m.get('did')
        return self


class Contractaccountapplication(TeaModel):
    def __init__(
        self,
        email: str = None,
        id_number: str = None,
        id_type: str = None,
        mobile: str = None,
        name: str = None,
        user_id: str = None,
    ):
        # 邮箱
        self.email = email
        # 身份证号码
        self.id_number = id_number
        # 身份证类型
        self.id_type = id_type
        # 电话号
        self.mobile = mobile
        # 姓名
        self.name = name
        # 用户id
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.email, 'email')
        self.validate_required(self.id_number, 'id_number')
        self.validate_required(self.id_type, 'id_type')
        self.validate_required(self.mobile, 'mobile')
        self.validate_required(self.name, 'name')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.email is not None:
            result['email'] = self.email
        if self.id_number is not None:
            result['id_number'] = self.id_number
        if self.id_type is not None:
            result['id_type'] = self.id_type
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.name is not None:
            result['name'] = self.name
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('id_number') is not None:
            self.id_number = m.get('id_number')
        if m.get('id_type') is not None:
            self.id_type = m.get('id_type')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class ContractNotaryInfo(TeaModel):
    def __init__(
        self,
        content_hash: str = None,
        doc_id: str = None,
        transaction_id: str = None,
        tx_hash: str = None,
    ):
        # 存证的内容哈希值
        # 
        self.content_hash = content_hash
        # 存证相关联的文档ID
        # 
        self.doc_id = doc_id
        # 存证事务ID
        # 
        self.transaction_id = transaction_id
        # 存证地址
        self.tx_hash = tx_hash

    def validate(self):
        self.validate_required(self.content_hash, 'content_hash')
        self.validate_required(self.doc_id, 'doc_id')
        self.validate_required(self.transaction_id, 'transaction_id')
        self.validate_required(self.tx_hash, 'tx_hash')

    def to_map(self):
        result = dict()
        if self.content_hash is not None:
            result['content_hash'] = self.content_hash
        if self.doc_id is not None:
            result['doc_id'] = self.doc_id
        if self.transaction_id is not None:
            result['transaction_id'] = self.transaction_id
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('content_hash') is not None:
            self.content_hash = m.get('content_hash')
        if m.get('doc_id') is not None:
            self.doc_id = m.get('doc_id')
        if m.get('transaction_id') is not None:
            self.transaction_id = m.get('transaction_id')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class ContractSignFieldApplication(TeaModel):
    def __init__(
        self,
        add_sign_time: bool = None,
        authorized_account_id: str = None,
        file_id: str = None,
        order: str = None,
        pos_page: str = None,
        pos_x: str = None,
        seal_id: str = None,
        third_order_no: str = None,
        pos_y: str = None,
        width: str = None,
        sign_type: int = None,
    ):
        # add_sign_time
        self.add_sign_time = add_sign_time
        # authorized_account_id
        self.authorized_account_id = authorized_account_id
        # file_id
        self.file_id = file_id
        # order
        self.order = order
        # pos_page
        self.pos_page = pos_page
        # pos_x
        self.pos_x = pos_x
        # seal_id
        self.seal_id = seal_id
        # third_order_no
        self.third_order_no = third_order_no
        # pos_y
        self.pos_y = pos_y
        # width
        self.width = width
        # signType
        self.sign_type = sign_type

    def validate(self):
        self.validate_required(self.authorized_account_id, 'authorized_account_id')
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.pos_page, 'pos_page')
        self.validate_required(self.pos_x, 'pos_x')
        self.validate_required(self.pos_y, 'pos_y')

    def to_map(self):
        result = dict()
        if self.add_sign_time is not None:
            result['add_sign_time'] = self.add_sign_time
        if self.authorized_account_id is not None:
            result['authorized_account_id'] = self.authorized_account_id
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.order is not None:
            result['order'] = self.order
        if self.pos_page is not None:
            result['pos_page'] = self.pos_page
        if self.pos_x is not None:
            result['pos_x'] = self.pos_x
        if self.seal_id is not None:
            result['seal_id'] = self.seal_id
        if self.third_order_no is not None:
            result['third_order_no'] = self.third_order_no
        if self.pos_y is not None:
            result['pos_y'] = self.pos_y
        if self.width is not None:
            result['width'] = self.width
        if self.sign_type is not None:
            result['sign_type'] = self.sign_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('add_sign_time') is not None:
            self.add_sign_time = m.get('add_sign_time')
        if m.get('authorized_account_id') is not None:
            self.authorized_account_id = m.get('authorized_account_id')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('order') is not None:
            self.order = m.get('order')
        if m.get('pos_page') is not None:
            self.pos_page = m.get('pos_page')
        if m.get('pos_x') is not None:
            self.pos_x = m.get('pos_x')
        if m.get('seal_id') is not None:
            self.seal_id = m.get('seal_id')
        if m.get('third_order_no') is not None:
            self.third_order_no = m.get('third_order_no')
        if m.get('pos_y') is not None:
            self.pos_y = m.get('pos_y')
        if m.get('width') is not None:
            self.width = m.get('width')
        if m.get('sign_type') is not None:
            self.sign_type = m.get('sign_type')
        return self


class ContractHandSignFieldApplication(TeaModel):
    def __init__(
        self,
        account_id: str = None,
        file_id: str = None,
        order: int = None,
        pos_page: str = None,
        pos_x: str = None,
        pos_y: str = None,
        seal_id: str = None,
        sign_date_bean_type: int = None,
        sign_date_font_size: int = None,
        sign_date_format: str = None,
        sign_date_pos_page: int = None,
        sign_date_pos_x: str = None,
        sign_date_pos_y: str = None,
        sign_type: int = None,
        third_order_no: str = None,
        width: str = None,
        seal_ids: List[str] = None,
        sign_field_type: int = None,
    ):
        # account_id
        self.account_id = account_id
        # file_id
        self.file_id = file_id
        # order
        self.order = order
        # pos_page
        self.pos_page = pos_page
        # posX
        self.pos_x = pos_x
        # posY
        self.pos_y = pos_y
        # sealId
        self.seal_id = seal_id
        # signDateBeanType
        self.sign_date_bean_type = sign_date_bean_type
        # signDateFontSize
        self.sign_date_font_size = sign_date_font_size
        # sign_date_format
        self.sign_date_format = sign_date_format
        # signDatePosPage
        self.sign_date_pos_page = sign_date_pos_page
        # signDatePosX
        self.sign_date_pos_x = sign_date_pos_x
        # sign_date_pos_y
        self.sign_date_pos_y = sign_date_pos_y
        # sign_type
        self.sign_type = sign_type
        # third_order_no
        self.third_order_no = third_order_no
        # width
        self.width = width
        # seal_ids
        self.seal_ids = seal_ids
        # 签名字段type
        self.sign_field_type = sign_field_type

    def validate(self):
        self.validate_required(self.account_id, 'account_id')
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.sign_date_bean_type, 'sign_date_bean_type')
        self.validate_required(self.sign_date_font_size, 'sign_date_font_size')

    def to_map(self):
        result = dict()
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.order is not None:
            result['order'] = self.order
        if self.pos_page is not None:
            result['pos_page'] = self.pos_page
        if self.pos_x is not None:
            result['pos_x'] = self.pos_x
        if self.pos_y is not None:
            result['pos_y'] = self.pos_y
        if self.seal_id is not None:
            result['seal_id'] = self.seal_id
        if self.sign_date_bean_type is not None:
            result['sign_date_bean_type'] = self.sign_date_bean_type
        if self.sign_date_font_size is not None:
            result['sign_date_font_size'] = self.sign_date_font_size
        if self.sign_date_format is not None:
            result['sign_date_format'] = self.sign_date_format
        if self.sign_date_pos_page is not None:
            result['sign_date_pos_page'] = self.sign_date_pos_page
        if self.sign_date_pos_x is not None:
            result['sign_date_pos_x'] = self.sign_date_pos_x
        if self.sign_date_pos_y is not None:
            result['sign_date_pos_y'] = self.sign_date_pos_y
        if self.sign_type is not None:
            result['sign_type'] = self.sign_type
        if self.third_order_no is not None:
            result['third_order_no'] = self.third_order_no
        if self.width is not None:
            result['width'] = self.width
        if self.seal_ids is not None:
            result['seal_ids'] = self.seal_ids
        if self.sign_field_type is not None:
            result['sign_field_type'] = self.sign_field_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('order') is not None:
            self.order = m.get('order')
        if m.get('pos_page') is not None:
            self.pos_page = m.get('pos_page')
        if m.get('pos_x') is not None:
            self.pos_x = m.get('pos_x')
        if m.get('pos_y') is not None:
            self.pos_y = m.get('pos_y')
        if m.get('seal_id') is not None:
            self.seal_id = m.get('seal_id')
        if m.get('sign_date_bean_type') is not None:
            self.sign_date_bean_type = m.get('sign_date_bean_type')
        if m.get('sign_date_font_size') is not None:
            self.sign_date_font_size = m.get('sign_date_font_size')
        if m.get('sign_date_format') is not None:
            self.sign_date_format = m.get('sign_date_format')
        if m.get('sign_date_pos_page') is not None:
            self.sign_date_pos_page = m.get('sign_date_pos_page')
        if m.get('sign_date_pos_x') is not None:
            self.sign_date_pos_x = m.get('sign_date_pos_x')
        if m.get('sign_date_pos_y') is not None:
            self.sign_date_pos_y = m.get('sign_date_pos_y')
        if m.get('sign_type') is not None:
            self.sign_type = m.get('sign_type')
        if m.get('third_order_no') is not None:
            self.third_order_no = m.get('third_order_no')
        if m.get('width') is not None:
            self.width = m.get('width')
        if m.get('seal_ids') is not None:
            self.seal_ids = m.get('seal_ids')
        if m.get('sign_field_type') is not None:
            self.sign_field_type = m.get('sign_field_type')
        return self


class WorkersCheckAttendance(TeaModel):
    def __init__(
        self,
        attendance_type: str = None,
        clock_in_time: str = None,
    ):
        # 考勤类型  [1.入场 2.退场]
        self.attendance_type = attendance_type
        # 打卡时间
        self.clock_in_time = clock_in_time

    def validate(self):
        self.validate_required(self.attendance_type, 'attendance_type')
        self.validate_required(self.clock_in_time, 'clock_in_time')
        if self.clock_in_time is not None:
            self.validate_pattern(self.clock_in_time, 'clock_in_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.attendance_type is not None:
            result['attendance_type'] = self.attendance_type
        if self.clock_in_time is not None:
            result['clock_in_time'] = self.clock_in_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('attendance_type') is not None:
            self.attendance_type = m.get('attendance_type')
        if m.get('clock_in_time') is not None:
            self.clock_in_time = m.get('clock_in_time')
        return self


class ContractSignFieldDetail(TeaModel):
    def __init__(
        self,
        actor_indentity_type: int = None,
        add_time: int = None,
        assigned_posbean: bool = None,
        assigned_seal: bool = None,
        authorized_account_id: str = None,
        auto_execute: bool = None,
        execute_failed_reason: str = None,
        file_id: str = None,
        flow_id: str = None,
        order: int = None,
        pos_page: str = None,
        pos_x: str = None,
        pos_y: str = None,
        seal_file_key: str = None,
        seal_id: str = None,
        seal_type: str = None,
        signer_account_id: str = None,
        signfield_id: str = None,
        sign_type: int = None,
        status: int = None,
        status_description: str = None,
        width: str = None,
    ):
        # 签约主体类别，0-个人，1-机构，默认0,2 是不限
        self.actor_indentity_type = actor_indentity_type
        # 添加时间
        self.add_time = add_time
        # 是否指定位置，TRUE表示不允许更新位置，配置项，无默认值
        self.assigned_posbean = assigned_posbean
        # 是否指定印章数据，TRUE表示不允许更新印章，配置项，无默认值
        self.assigned_seal = assigned_seal
        # 签约主体账号标识，将使用该主体账号对应的数字证书完成本次签署，如：当存在签署操作人代某机构签署时，需要传入该机构的账号id
        self.authorized_account_id = authorized_account_id
        # 是否自动执行，TRUE需要静默授权，配置项，无默认值
        self.auto_execute = auto_execute
        # 执行失败原因
        self.execute_failed_reason = execute_failed_reason
        # 文件file id
        self.file_id = file_id
        # 流程id
        self.flow_id = flow_id
        # 签署区顺序，默认1,且不小于1，顺序越小越先处理
        self.order = order
        # 页码信息，可以_,_或_-_分割
        self.pos_page = pos_page
        # x坐标
        self.pos_x = pos_x
        # y坐标
        self.pos_y = pos_y
        # 印章文件file key
        self.seal_file_key = seal_file_key
        # 印章id
        self.seal_id = seal_id
        # 印章类型，支持多种类型时逗号分割，0-手绘印章，1-模版印章，为空不限制
        self.seal_type = seal_type
        # 签署操作人个人账号标识，即操作本次签署的个人，如需e签宝通知用户签署，则系统向该账号下绑定的手机、邮箱发送签署链接
        self.signer_account_id = signer_account_id
        # 签署区Id
        self.signfield_id = signfield_id
        # 签署类型，0-不限，1-单页签署，2-骑缝签署,4-关键字签署，默认1
        self.sign_type = sign_type
        # 签署区状态（0："等待执行，1："执行中"，2："执行失败"，3："审批中"，4： "执行完成")
        self.status = status
        # 状态描述
        self.status_description = status_description
        # 签署区宽
        self.width = width

    def validate(self):
        self.validate_required(self.actor_indentity_type, 'actor_indentity_type')
        self.validate_required(self.add_time, 'add_time')
        self.validate_required(self.assigned_posbean, 'assigned_posbean')
        self.validate_required(self.assigned_seal, 'assigned_seal')
        self.validate_required(self.authorized_account_id, 'authorized_account_id')
        self.validate_required(self.auto_execute, 'auto_execute')
        self.validate_required(self.execute_failed_reason, 'execute_failed_reason')
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.flow_id, 'flow_id')
        self.validate_required(self.order, 'order')
        self.validate_required(self.pos_page, 'pos_page')
        self.validate_required(self.pos_x, 'pos_x')
        self.validate_required(self.pos_y, 'pos_y')
        self.validate_required(self.seal_file_key, 'seal_file_key')
        self.validate_required(self.seal_id, 'seal_id')
        self.validate_required(self.seal_type, 'seal_type')
        self.validate_required(self.signer_account_id, 'signer_account_id')
        self.validate_required(self.signfield_id, 'signfield_id')
        self.validate_required(self.sign_type, 'sign_type')
        self.validate_required(self.status, 'status')
        self.validate_required(self.status_description, 'status_description')
        self.validate_required(self.width, 'width')

    def to_map(self):
        result = dict()
        if self.actor_indentity_type is not None:
            result['actor_indentity_type'] = self.actor_indentity_type
        if self.add_time is not None:
            result['add_time'] = self.add_time
        if self.assigned_posbean is not None:
            result['assigned_posbean'] = self.assigned_posbean
        if self.assigned_seal is not None:
            result['assigned_seal'] = self.assigned_seal
        if self.authorized_account_id is not None:
            result['authorized_account_id'] = self.authorized_account_id
        if self.auto_execute is not None:
            result['auto_execute'] = self.auto_execute
        if self.execute_failed_reason is not None:
            result['execute_failed_reason'] = self.execute_failed_reason
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.order is not None:
            result['order'] = self.order
        if self.pos_page is not None:
            result['pos_page'] = self.pos_page
        if self.pos_x is not None:
            result['pos_x'] = self.pos_x
        if self.pos_y is not None:
            result['pos_y'] = self.pos_y
        if self.seal_file_key is not None:
            result['seal_file_key'] = self.seal_file_key
        if self.seal_id is not None:
            result['seal_id'] = self.seal_id
        if self.seal_type is not None:
            result['seal_type'] = self.seal_type
        if self.signer_account_id is not None:
            result['signer_account_id'] = self.signer_account_id
        if self.signfield_id is not None:
            result['signfield_id'] = self.signfield_id
        if self.sign_type is not None:
            result['sign_type'] = self.sign_type
        if self.status is not None:
            result['status'] = self.status
        if self.status_description is not None:
            result['status_description'] = self.status_description
        if self.width is not None:
            result['width'] = self.width
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('actor_indentity_type') is not None:
            self.actor_indentity_type = m.get('actor_indentity_type')
        if m.get('add_time') is not None:
            self.add_time = m.get('add_time')
        if m.get('assigned_posbean') is not None:
            self.assigned_posbean = m.get('assigned_posbean')
        if m.get('assigned_seal') is not None:
            self.assigned_seal = m.get('assigned_seal')
        if m.get('authorized_account_id') is not None:
            self.authorized_account_id = m.get('authorized_account_id')
        if m.get('auto_execute') is not None:
            self.auto_execute = m.get('auto_execute')
        if m.get('execute_failed_reason') is not None:
            self.execute_failed_reason = m.get('execute_failed_reason')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('order') is not None:
            self.order = m.get('order')
        if m.get('pos_page') is not None:
            self.pos_page = m.get('pos_page')
        if m.get('pos_x') is not None:
            self.pos_x = m.get('pos_x')
        if m.get('pos_y') is not None:
            self.pos_y = m.get('pos_y')
        if m.get('seal_file_key') is not None:
            self.seal_file_key = m.get('seal_file_key')
        if m.get('seal_id') is not None:
            self.seal_id = m.get('seal_id')
        if m.get('seal_type') is not None:
            self.seal_type = m.get('seal_type')
        if m.get('signer_account_id') is not None:
            self.signer_account_id = m.get('signer_account_id')
        if m.get('signfield_id') is not None:
            self.signfield_id = m.get('signfield_id')
        if m.get('sign_type') is not None:
            self.sign_type = m.get('sign_type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('status_description') is not None:
            self.status_description = m.get('status_description')
        if m.get('width') is not None:
            self.width = m.get('width')
        return self


class ContractPaymentOrderInfo(TeaModel):
    def __init__(
        self,
        pay_date: int = None,
        pay_money: int = None,
        trigger_immediately: int = None,
    ):
        # 代扣触发时间，精确到毫秒 java.lang.System#currentTimeMillis()
        # 
        self.pay_date = pay_date
        # 代扣金额，整数 精确到分
        # 
        self.pay_money = pay_money
        # 是否用户签署成功后立即触发第一期代扣
        # 
        self.trigger_immediately = trigger_immediately

    def validate(self):
        self.validate_required(self.pay_date, 'pay_date')
        self.validate_required(self.pay_money, 'pay_money')

    def to_map(self):
        result = dict()
        if self.pay_date is not None:
            result['pay_date'] = self.pay_date
        if self.pay_money is not None:
            result['pay_money'] = self.pay_money
        if self.trigger_immediately is not None:
            result['trigger_immediately'] = self.trigger_immediately
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pay_date') is not None:
            self.pay_date = m.get('pay_date')
        if m.get('pay_money') is not None:
            self.pay_money = m.get('pay_money')
        if m.get('trigger_immediately') is not None:
            self.trigger_immediately = m.get('trigger_immediately')
        return self


class FileInfo(TeaModel):
    def __init__(
        self,
        biz_id: str = None,
        file_str: str = None,
        file_name: str = None,
        file_size: int = None,
        file_type: str = None,
    ):
        # 业务id
        self.biz_id = biz_id
        # 财报文件，base64
        self.file_str = file_str
        # 文件名称（企业财报.jpg）
        self.file_name = file_name
        # 文件大小(byte长度)
        self.file_size = file_size
        # 文件类型(jpg)
        self.file_type = file_type

    def validate(self):
        self.validate_required(self.file_str, 'file_str')
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.file_size, 'file_size')
        self.validate_required(self.file_type, 'file_type')

    def to_map(self):
        result = dict()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.file_str is not None:
            result['file_str'] = self.file_str
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_size is not None:
            result['file_size'] = self.file_size
        if self.file_type is not None:
            result['file_type'] = self.file_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('file_str') is not None:
            self.file_str = m.get('file_str')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_size') is not None:
            self.file_size = m.get('file_size')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        return self


class ContractDocument(TeaModel):
    def __init__(
        self,
        encryption: int = None,
        file_id: str = None,
        file_name: str = None,
        file_password: str = None,
    ):
        # 是否加密，0-不加密，1-加，默认0
        # 
        self.encryption = encryption
        # 电子合同文档的ID
        # 
        self.file_id = file_id
        # 电子合同文档名称，默认文件名称
        # 
        self.file_name = file_name
        # 电子合同文档密码, 如果encryption值为1, 文档密码不能为空，默认没有密码
        # 
        self.file_password = file_password

    def validate(self):
        self.validate_required(self.file_id, 'file_id')

    def to_map(self):
        result = dict()
        if self.encryption is not None:
            result['encryption'] = self.encryption
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_password is not None:
            result['file_password'] = self.file_password
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('encryption') is not None:
            self.encryption = m.get('encryption')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_password') is not None:
            self.file_password = m.get('file_password')
        return self


class OneStepSignField(TeaModel):
    def __init__(
        self,
        account_id: str = None,
        file_id: str = None,
        order: int = None,
        pos_page: str = None,
        pos_x: str = None,
        pos_y: str = None,
        seal_id: str = None,
        sign_date_bean_type: int = None,
        sign_date_font_size: int = None,
        sign_date_format: str = None,
        sign_date_pos_page: int = None,
        sign_date_pos_x: str = None,
        sign_date_pos_y: str = None,
        sign_type: int = None,
        third_order_no: str = None,
        width: str = None,
        auto_execute: bool = None,
    ):
        # accountId
        self.account_id = account_id
        # file_id
        self.file_id = file_id
        # order
        self.order = order
        # posPage
        self.pos_page = pos_page
        # posX
        self.pos_x = pos_x
        # posY
        self.pos_y = pos_y
        # sealId
        self.seal_id = seal_id
        # sign_date_bean_type
        self.sign_date_bean_type = sign_date_bean_type
        # sign_date_font_size
        self.sign_date_font_size = sign_date_font_size
        # sign_date_format
        self.sign_date_format = sign_date_format
        # sign_date_pos_page
        self.sign_date_pos_page = sign_date_pos_page
        # sign_date_pos_x
        self.sign_date_pos_x = sign_date_pos_x
        # 
        self.sign_date_pos_y = sign_date_pos_y
        # signType
        self.sign_type = sign_type
        # third_order_no
        self.third_order_no = third_order_no
        # width
        self.width = width
        # auto_execute
        self.auto_execute = auto_execute

    def validate(self):
        self.validate_required(self.account_id, 'account_id')
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.pos_page, 'pos_page')
        self.validate_required(self.pos_x, 'pos_x')
        self.validate_required(self.pos_y, 'pos_y')

    def to_map(self):
        result = dict()
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.order is not None:
            result['order'] = self.order
        if self.pos_page is not None:
            result['pos_page'] = self.pos_page
        if self.pos_x is not None:
            result['pos_x'] = self.pos_x
        if self.pos_y is not None:
            result['pos_y'] = self.pos_y
        if self.seal_id is not None:
            result['seal_id'] = self.seal_id
        if self.sign_date_bean_type is not None:
            result['sign_date_bean_type'] = self.sign_date_bean_type
        if self.sign_date_font_size is not None:
            result['sign_date_font_size'] = self.sign_date_font_size
        if self.sign_date_format is not None:
            result['sign_date_format'] = self.sign_date_format
        if self.sign_date_pos_page is not None:
            result['sign_date_pos_page'] = self.sign_date_pos_page
        if self.sign_date_pos_x is not None:
            result['sign_date_pos_x'] = self.sign_date_pos_x
        if self.sign_date_pos_y is not None:
            result['sign_date_pos_y'] = self.sign_date_pos_y
        if self.sign_type is not None:
            result['sign_type'] = self.sign_type
        if self.third_order_no is not None:
            result['third_order_no'] = self.third_order_no
        if self.width is not None:
            result['width'] = self.width
        if self.auto_execute is not None:
            result['auto_execute'] = self.auto_execute
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('order') is not None:
            self.order = m.get('order')
        if m.get('pos_page') is not None:
            self.pos_page = m.get('pos_page')
        if m.get('pos_x') is not None:
            self.pos_x = m.get('pos_x')
        if m.get('pos_y') is not None:
            self.pos_y = m.get('pos_y')
        if m.get('seal_id') is not None:
            self.seal_id = m.get('seal_id')
        if m.get('sign_date_bean_type') is not None:
            self.sign_date_bean_type = m.get('sign_date_bean_type')
        if m.get('sign_date_font_size') is not None:
            self.sign_date_font_size = m.get('sign_date_font_size')
        if m.get('sign_date_format') is not None:
            self.sign_date_format = m.get('sign_date_format')
        if m.get('sign_date_pos_page') is not None:
            self.sign_date_pos_page = m.get('sign_date_pos_page')
        if m.get('sign_date_pos_x') is not None:
            self.sign_date_pos_x = m.get('sign_date_pos_x')
        if m.get('sign_date_pos_y') is not None:
            self.sign_date_pos_y = m.get('sign_date_pos_y')
        if m.get('sign_type') is not None:
            self.sign_type = m.get('sign_type')
        if m.get('third_order_no') is not None:
            self.third_order_no = m.get('third_order_no')
        if m.get('width') is not None:
            self.width = m.get('width')
        if m.get('auto_execute') is not None:
            self.auto_execute = m.get('auto_execute')
        return self


class CertifyLPDTO(TeaModel):
    def __init__(
        self,
        certify_id: str = None,
        qr_url: str = None,
        img_url: str = None,
        ratio: str = None,
        expires: int = None,
    ):
        # 认证id
        self.certify_id = certify_id
        # 二维码url
        self.qr_url = qr_url
        # 二维码中的Logo的图片地址
        self.img_url = img_url
        # 二维码中Logo缩放的比例系数，如5表示长宽最小值的1/5
        self.ratio = ratio
        # 过期时间戳，单位毫秒
        self.expires = expires

    def validate(self):
        self.validate_required(self.certify_id, 'certify_id')
        self.validate_required(self.qr_url, 'qr_url')
        self.validate_required(self.img_url, 'img_url')
        self.validate_required(self.ratio, 'ratio')
        self.validate_required(self.expires, 'expires')

    def to_map(self):
        result = dict()
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        if self.qr_url is not None:
            result['qr_url'] = self.qr_url
        if self.img_url is not None:
            result['img_url'] = self.img_url
        if self.ratio is not None:
            result['ratio'] = self.ratio
        if self.expires is not None:
            result['expires'] = self.expires
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('qr_url') is not None:
            self.qr_url = m.get('qr_url')
        if m.get('img_url') is not None:
            self.img_url = m.get('img_url')
        if m.get('ratio') is not None:
            self.ratio = m.get('ratio')
        if m.get('expires') is not None:
            self.expires = m.get('expires')
        return self


class Contractsignflowconfig(TeaModel):
    def __init__(
        self,
        notice_developer_url: str = None,
        notice_type: str = None,
        redirect_url: str = None,
        sign_platform: str = None,
        redirect_url_on_failure: str = None,
        free_signature: bool = None,
    ):
        # 回调通知地址 ,默认取项目配置通知地址
        # 
        self.notice_developer_url = notice_developer_url
        # 通知方式，逗号分割，1-短信，2-邮件 。默认值1，请务必请选择一个通知方式，否则客户将接收不到流程的签署通知和审批通知，如果流程需要审批，将导致审批无法完成；如果客户需要不通知，可以设置notice_type为""
        # 
        self.notice_type = notice_type
        # 签署成功或者流程结束后的默认重定向地址，默认签署完成停在当前页面
        # 
        self.redirect_url = redirect_url
        # 签署成功或者流程结束后的默认重定向地址，默认签署完成停在当前页面
        # 
        self.sign_platform = sign_platform
        # 签署失败时的跳转地址，如果不做单独配置，默认与redirect_url一致（配合twc.notary.contract.signflow.create接口使用）
        # 
        self.redirect_url_on_failure = redirect_url_on_failure
        # 是否允许自由签署，默认false（配合twc.notary.contract.signflow.create接口使用）
        # 
        self.free_signature = free_signature

    def validate(self):
        self.validate_required(self.notice_type, 'notice_type')

    def to_map(self):
        result = dict()
        if self.notice_developer_url is not None:
            result['notice_developer_url'] = self.notice_developer_url
        if self.notice_type is not None:
            result['notice_type'] = self.notice_type
        if self.redirect_url is not None:
            result['redirect_url'] = self.redirect_url
        if self.sign_platform is not None:
            result['sign_platform'] = self.sign_platform
        if self.redirect_url_on_failure is not None:
            result['redirect_url_on_failure'] = self.redirect_url_on_failure
        if self.free_signature is not None:
            result['free_signature'] = self.free_signature
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('notice_developer_url') is not None:
            self.notice_developer_url = m.get('notice_developer_url')
        if m.get('notice_type') is not None:
            self.notice_type = m.get('notice_type')
        if m.get('redirect_url') is not None:
            self.redirect_url = m.get('redirect_url')
        if m.get('sign_platform') is not None:
            self.sign_platform = m.get('sign_platform')
        if m.get('redirect_url_on_failure') is not None:
            self.redirect_url_on_failure = m.get('redirect_url_on_failure')
        if m.get('free_signature') is not None:
            self.free_signature = m.get('free_signature')
        return self


class BandCert(TeaModel):
    def __init__(
        self,
        bank_account: str = None,
        bank_name: str = None,
        file_defines: List[FileDefine] = None,
    ):
        # 银行账号
        # 
        # 
        self.bank_account = bank_account
        # 银行名称
        # 
        # 
        self.bank_name = bank_name
        # 文件信息，支持上传多个文件
        # 
        # 
        self.file_defines = file_defines

    def validate(self):
        self.validate_required(self.bank_account, 'bank_account')
        self.validate_required(self.bank_name, 'bank_name')
        self.validate_required(self.file_defines, 'file_defines')
        if self.file_defines:
            for k in self.file_defines:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.bank_account is not None:
            result['bank_account'] = self.bank_account
        if self.bank_name is not None:
            result['bank_name'] = self.bank_name
        result['file_defines'] = []
        if self.file_defines is not None:
            for k in self.file_defines:
                result['file_defines'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('bank_account') is not None:
            self.bank_account = m.get('bank_account')
        if m.get('bank_name') is not None:
            self.bank_name = m.get('bank_name')
        self.file_defines = []
        if m.get('file_defines') is not None:
            for k in m.get('file_defines'):
                temp_model = FileDefine()
                self.file_defines.append(temp_model.from_map(k))
        return self


class SecurityFundDto(TeaModel):
    def __init__(
        self,
        type: str = None,
        amount: str = None,
    ):
        # 保证金类型
        self.type = type
        # 金额
        self.amount = amount

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.amount, 'amount')

    def to_map(self):
        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.amount is not None:
            result['amount'] = self.amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        return self


class PartyBFirmDto(TeaModel):
    def __init__(
        self,
        party_bbidder_code: str = None,
        party_bname: str = None,
        party_baudit_did: str = None,
    ):
        # 乙方统一社会信用代码
        self.party_bbidder_code = party_bbidder_code
        # 乙方名称
        self.party_bname = party_bname
        # 乙方授权代表Did
        self.party_baudit_did = party_baudit_did

    def validate(self):
        self.validate_required(self.party_bbidder_code, 'party_bbidder_code')
        self.validate_required(self.party_bname, 'party_bname')
        self.validate_required(self.party_baudit_did, 'party_baudit_did')

    def to_map(self):
        result = dict()
        if self.party_bbidder_code is not None:
            result['party_b_bidder_code'] = self.party_bbidder_code
        if self.party_bname is not None:
            result['party_b_name'] = self.party_bname
        if self.party_baudit_did is not None:
            result['party_b_audit_did'] = self.party_baudit_did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('party_b_bidder_code') is not None:
            self.party_bbidder_code = m.get('party_b_bidder_code')
        if m.get('party_b_name') is not None:
            self.party_bname = m.get('party_b_name')
        if m.get('party_b_audit_did') is not None:
            self.party_baudit_did = m.get('party_b_audit_did')
        return self


class Contractorganizationapplication(TeaModel):
    def __init__(
        self,
        id_number: str = None,
        id_type: str = None,
        legal_person: str = None,
        legal_person_id: str = None,
        name: str = None,
        organization_id: str = None,
    ):
        # 执照号码
        self.id_number = id_number
        # 执照类型
        self.id_type = id_type
        # 法人名称
        self.legal_person = legal_person
        # 法人证件号
        self.legal_person_id = legal_person_id
        # 企业名称
        self.name = name
        # 组织id
        self.organization_id = organization_id

    def validate(self):
        self.validate_required(self.id_number, 'id_number')
        self.validate_required(self.id_type, 'id_type')
        self.validate_required(self.legal_person, 'legal_person')
        self.validate_required(self.legal_person_id, 'legal_person_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.organization_id, 'organization_id')

    def to_map(self):
        result = dict()
        if self.id_number is not None:
            result['id_number'] = self.id_number
        if self.id_type is not None:
            result['id_type'] = self.id_type
        if self.legal_person is not None:
            result['legal_person'] = self.legal_person
        if self.legal_person_id is not None:
            result['legal_person_id'] = self.legal_person_id
        if self.name is not None:
            result['name'] = self.name
        if self.organization_id is not None:
            result['organization_id'] = self.organization_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id_number') is not None:
            self.id_number = m.get('id_number')
        if m.get('id_type') is not None:
            self.id_type = m.get('id_type')
        if m.get('legal_person') is not None:
            self.legal_person = m.get('legal_person')
        if m.get('legal_person_id') is not None:
            self.legal_person_id = m.get('legal_person_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('organization_id') is not None:
            self.organization_id = m.get('organization_id')
        return self


class VerifyUserPwdRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        login_id: str = None,
        password: str = None,
        expires: int = None,
        tenant_id: str = None,
        pubkey_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 登录账号
        self.login_id = login_id
        # 登录密码
        self.password = password
        # 过期时间指定(单位 秒)，默认30分钟
        self.expires = expires
        # 租户id
        self.tenant_id = tenant_id
        # 公钥名称
        self.pubkey_name = pubkey_name

    def validate(self):
        self.validate_required(self.login_id, 'login_id')
        self.validate_required(self.password, 'password')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.pubkey_name, 'pubkey_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.login_id is not None:
            result['login_id'] = self.login_id
        if self.password is not None:
            result['password'] = self.password
        if self.expires is not None:
            result['expires'] = self.expires
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.pubkey_name is not None:
            result['pubkey_name'] = self.pubkey_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('login_id') is not None:
            self.login_id = m.get('login_id')
        if m.get('password') is not None:
            self.password = m.get('password')
        if m.get('expires') is not None:
            self.expires = m.get('expires')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('pubkey_name') is not None:
            self.pubkey_name = m.get('pubkey_name')
        return self


class VerifyUserPwdResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: TokenData = None,
        user_id: int = None,
        did: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回数据
        self.data = data
        # 用户id返回值
        self.user_id = user_id
        # did
        self.did = did

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
        if self.user_id is not None:
            result['user_id'] = self.user_id
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
        if m.get('data') is not None:
            temp_model = TokenData()
            self.data = temp_model.from_map(m['data'])
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('did') is not None:
            self.did = m.get('did')
        return self


class ApplyUserSmsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        telphone: str = None,
        expires: int = None,
        intervals: int = None,
        send_direct: int = None,
        tenant_id: str = None,
        email: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 邮箱 or 短信 二选一
        self.telphone = telphone
        # 过期时间（单位：秒），默认30分钟
        self.expires = expires
        # 重发短信时间（单位：S），默认60s
        self.intervals = intervals
        # 是否立刻发发送短信(1 立刻发送 0 等待业务触发)
        self.send_direct = send_direct
        # 租户id
        self.tenant_id = tenant_id
        # 邮箱
        self.email = email

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.telphone is not None:
            result['telphone'] = self.telphone
        if self.expires is not None:
            result['expires'] = self.expires
        if self.intervals is not None:
            result['intervals'] = self.intervals
        if self.send_direct is not None:
            result['send_direct'] = self.send_direct
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.email is not None:
            result['email'] = self.email
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('telphone') is not None:
            self.telphone = m.get('telphone')
        if m.get('expires') is not None:
            self.expires = m.get('expires')
        if m.get('intervals') is not None:
            self.intervals = m.get('intervals')
        if m.get('send_direct') is not None:
            self.send_direct = m.get('send_direct')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('email') is not None:
            self.email = m.get('email')
        return self


class ApplyUserSmsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sms_resend_url: str = None,
        verify_id: str = None,
        did: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 短信重新触发url
        # 
        # 
        self.sms_resend_url = sms_resend_url
        # 核验id
        # 
        # 
        self.verify_id = verify_id
        # did_24c93459216945468fdf1d899c521910
        self.did = did

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
        if self.sms_resend_url is not None:
            result['sms_resend_url'] = self.sms_resend_url
        if self.verify_id is not None:
            result['verify_id'] = self.verify_id
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
        if m.get('sms_resend_url') is not None:
            self.sms_resend_url = m.get('sms_resend_url')
        if m.get('verify_id') is not None:
            self.verify_id = m.get('verify_id')
        if m.get('did') is not None:
            self.did = m.get('did')
        return self


class VerifyUserSmsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        verify_id: str = None,
        check_code: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 核验id，sms_login_apply 产生
        self.verify_id = verify_id
        # 短信code
        self.check_code = check_code
        # 租户id
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.verify_id, 'verify_id')
        self.validate_required(self.check_code, 'check_code')
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.verify_id is not None:
            result['verify_id'] = self.verify_id
        if self.check_code is not None:
            result['check_code'] = self.check_code
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('verify_id') is not None:
            self.verify_id = m.get('verify_id')
        if m.get('check_code') is not None:
            self.check_code = m.get('check_code')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class VerifyUserSmsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: TokenData = None,
        user_id: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回数据
        self.data = data
        # 新增userId返回值
        self.user_id = user_id

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
        if self.user_id is not None:
            result['user_id'] = self.user_id
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
            temp_model = TokenData()
            self.data = temp_model.from_map(m['data'])
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class AuthUserRefRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        operator_id: int = None,
        ref_user_id: int = None,
        access_token: str = None,
        set_default: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 操作员id，一般是C类用户
        self.operator_id = operator_id
        # 待登录的B类账号id
        self.ref_user_id = ref_user_id
        # operatorId 用户登录时对应的accessToken
        # 
        # 
        self.access_token = access_token
        # 是否设为默认企业(1 设置默认企业 0 切换临时企业)
        # 
        # 
        self.set_default = set_default

    def validate(self):
        self.validate_required(self.operator_id, 'operator_id')
        self.validate_required(self.ref_user_id, 'ref_user_id')
        self.validate_required(self.access_token, 'access_token')
        self.validate_required(self.set_default, 'set_default')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        if self.ref_user_id is not None:
            result['ref_user_id'] = self.ref_user_id
        if self.access_token is not None:
            result['access_token'] = self.access_token
        if self.set_default is not None:
            result['set_default'] = self.set_default
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        if m.get('ref_user_id') is not None:
            self.ref_user_id = m.get('ref_user_id')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        if m.get('set_default') is not None:
            self.set_default = m.get('set_default')
        return self


class AuthUserRefResponse(TeaModel):
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


class CloseUserLoginRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: int = None,
        tenant_id: str = None,
        access_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 账号id
        self.user_id = user_id
        # 租户id
        self.tenant_id = tenant_id
        # accessToken
        self.access_token = access_token

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.access_token, 'access_token')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.access_token is not None:
            result['access_token'] = self.access_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        return self


class CloseUserLoginResponse(TeaModel):
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


class CreateUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        login_id: str = None,
        password: str = None,
        tenant_id: str = None,
        user_type: str = None,
        user_name: str = None,
        telphone: str = None,
        email: str = None,
        creator_user_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 登录名称
        self.login_id = login_id
        # 非登录账号无需密码
        self.password = password
        # 租户id
        self.tenant_id = tenant_id
        # 用户类型
        self.user_type = user_type
        # 用户名称
        self.user_name = user_name
        # 手机号码
        self.telphone = telphone
        # 用户邮箱
        self.email = email
        # 创建者,一般是C创建B类账号。非提其他主体创建，可以不传
        self.creator_user_id = creator_user_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.user_type, 'user_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.login_id is not None:
            result['login_id'] = self.login_id
        if self.password is not None:
            result['password'] = self.password
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.telphone is not None:
            result['telphone'] = self.telphone
        if self.email is not None:
            result['email'] = self.email
        if self.creator_user_id is not None:
            result['creator_user_id'] = self.creator_user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('login_id') is not None:
            self.login_id = m.get('login_id')
        if m.get('password') is not None:
            self.password = m.get('password')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('telphone') is not None:
            self.telphone = m.get('telphone')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('creator_user_id') is not None:
            self.creator_user_id = m.get('creator_user_id')
        return self


class CreateUserResponse(TeaModel):
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


class GetUserCurrentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: int = None,
        tenant_id: str = None,
        query_options: List[str] = None,
        firm_user_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 账号id
        self.user_id = user_id
        # 租户id
        self.tenant_id = tenant_id
        # 不传默认是 BASE_INFO
        # BASE_INFO 基本信息
        # ORG_CERT_FILE 企业图片
        # LP_CERT_FILE 法人图片
        self.query_options = query_options
        # 企业用户userId
        self.firm_user_id = firm_user_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.query_options is not None:
            result['query_options'] = self.query_options
        if self.firm_user_id is not None:
            result['firm_user_id'] = self.firm_user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('query_options') is not None:
            self.query_options = m.get('query_options')
        if m.get('firm_user_id') is not None:
            self.firm_user_id = m.get('firm_user_id')
        return self


class GetUserCurrentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: UserDetailData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回数据
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
            temp_model = UserDetailData()
            self.data = temp_model.from_map(m['data'])
        return self


class VerifyFirmRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: int = None,
        firm_name: str = None,
        firm_type: str = None,
        cert_reg_no: str = None,
        cert_reg_file_id: str = None,
        lp_cert_type: str = None,
        lp_cert_no: str = None,
        lp_cert_file_front_id: str = None,
        lp_cert_file_reverse_id: str = None,
        cert_reg_file_type: str = None,
        lp_cert_file_front_type: str = None,
        lp_cert_file_reverse_type: str = None,
        lp_name: str = None,
        tenant_id: str = None,
        industry_type: str = None,
        firm_address: str = None,
        operation_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 账号id
        self.user_id = user_id
        # 企业名称
        self.firm_name = firm_name
        # 企业类型
        self.firm_type = firm_type
        # 企业营业执照注册号
        self.cert_reg_no = cert_reg_no
        # 企业营业执照图片，osskey
        self.cert_reg_file_id = cert_reg_file_id
        # 法人证件类型
        self.lp_cert_type = lp_cert_type
        # 证件号码
        self.lp_cert_no = lp_cert_no
        # 企业法人证件正面图片
        self.lp_cert_file_front_id = lp_cert_file_front_id
        # 企业法人证件反面图片
        # 
        # 
        self.lp_cert_file_reverse_id = lp_cert_file_reverse_id
        # JPEG,JPG
        self.cert_reg_file_type = cert_reg_file_type
        # JPG
        self.lp_cert_file_front_type = lp_cert_file_front_type
        # 身份证反面文件类型
        self.lp_cert_file_reverse_type = lp_cert_file_reverse_type
        # 法人姓名
        self.lp_name = lp_name
        # 租户信息
        self.tenant_id = tenant_id
        # 行业类型
        self.industry_type = industry_type
        # 公司所在地
        self.firm_address = firm_address
        # 提交类型
        self.operation_type = operation_type

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.operation_type, 'operation_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.firm_name is not None:
            result['firm_name'] = self.firm_name
        if self.firm_type is not None:
            result['firm_type'] = self.firm_type
        if self.cert_reg_no is not None:
            result['cert_reg_no'] = self.cert_reg_no
        if self.cert_reg_file_id is not None:
            result['cert_reg_file_id'] = self.cert_reg_file_id
        if self.lp_cert_type is not None:
            result['lp_cert_type'] = self.lp_cert_type
        if self.lp_cert_no is not None:
            result['lp_cert_no'] = self.lp_cert_no
        if self.lp_cert_file_front_id is not None:
            result['lp_cert_file_front_id'] = self.lp_cert_file_front_id
        if self.lp_cert_file_reverse_id is not None:
            result['lp_cert_file_reverse_id'] = self.lp_cert_file_reverse_id
        if self.cert_reg_file_type is not None:
            result['cert_reg_file_type'] = self.cert_reg_file_type
        if self.lp_cert_file_front_type is not None:
            result['lp_cert_file_front_type'] = self.lp_cert_file_front_type
        if self.lp_cert_file_reverse_type is not None:
            result['lp_cert_file_reverse_type'] = self.lp_cert_file_reverse_type
        if self.lp_name is not None:
            result['lp_name'] = self.lp_name
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.industry_type is not None:
            result['industry_type'] = self.industry_type
        if self.firm_address is not None:
            result['firm_address'] = self.firm_address
        if self.operation_type is not None:
            result['operation_type'] = self.operation_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('firm_name') is not None:
            self.firm_name = m.get('firm_name')
        if m.get('firm_type') is not None:
            self.firm_type = m.get('firm_type')
        if m.get('cert_reg_no') is not None:
            self.cert_reg_no = m.get('cert_reg_no')
        if m.get('cert_reg_file_id') is not None:
            self.cert_reg_file_id = m.get('cert_reg_file_id')
        if m.get('lp_cert_type') is not None:
            self.lp_cert_type = m.get('lp_cert_type')
        if m.get('lp_cert_no') is not None:
            self.lp_cert_no = m.get('lp_cert_no')
        if m.get('lp_cert_file_front_id') is not None:
            self.lp_cert_file_front_id = m.get('lp_cert_file_front_id')
        if m.get('lp_cert_file_reverse_id') is not None:
            self.lp_cert_file_reverse_id = m.get('lp_cert_file_reverse_id')
        if m.get('cert_reg_file_type') is not None:
            self.cert_reg_file_type = m.get('cert_reg_file_type')
        if m.get('lp_cert_file_front_type') is not None:
            self.lp_cert_file_front_type = m.get('lp_cert_file_front_type')
        if m.get('lp_cert_file_reverse_type') is not None:
            self.lp_cert_file_reverse_type = m.get('lp_cert_file_reverse_type')
        if m.get('lp_name') is not None:
            self.lp_name = m.get('lp_name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('industry_type') is not None:
            self.industry_type = m.get('industry_type')
        if m.get('firm_address') is not None:
            self.firm_address = m.get('firm_address')
        if m.get('operation_type') is not None:
            self.operation_type = m.get('operation_type')
        return self


class VerifyFirmResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        did: str = None,
        certify_lp_dto: CertifyLPDTO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 企业分布式did
        self.did = did
        # 法人认证信息
        self.certify_lp_dto = certify_lp_dto

    def validate(self):
        if self.certify_lp_dto:
            self.certify_lp_dto.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.did is not None:
            result['did'] = self.did
        if self.certify_lp_dto is not None:
            result['certify_lp_dto'] = self.certify_lp_dto.to_map()
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
        if m.get('certify_lp_dto') is not None:
            temp_model = CertifyLPDTO()
            self.certify_lp_dto = temp_model.from_map(m['certify_lp_dto'])
        return self


class VerifyUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: int = None,
        name: str = None,
        cert_type: str = None,
        cert_num: str = None,
        cert_file_front_id: str = None,
        cert_file_reverse_id: str = None,
        cert_file_front_type: str = None,
        cert_file_reverse_type: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 账号id
        self.user_id = user_id
        # 个人名称
        self.name = name
        # 证件类型
        self.cert_type = cert_type
        # 证件号码
        self.cert_num = cert_num
        # 个人证件正面图片,osskey值
        # 
        self.cert_file_front_id = cert_file_front_id
        # 个人证件反面图片,oss的key值
        self.cert_file_reverse_id = cert_file_reverse_id
        # JPG
        self.cert_file_front_type = cert_file_front_type
        # 个人证件文件反面，文件类型
        self.cert_file_reverse_type = cert_file_reverse_type
        # 租户id
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.cert_type, 'cert_type')
        self.validate_required(self.cert_num, 'cert_num')
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.name is not None:
            result['name'] = self.name
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.cert_num is not None:
            result['cert_num'] = self.cert_num
        if self.cert_file_front_id is not None:
            result['cert_file_front_id'] = self.cert_file_front_id
        if self.cert_file_reverse_id is not None:
            result['cert_file_reverse_id'] = self.cert_file_reverse_id
        if self.cert_file_front_type is not None:
            result['cert_file_front_type'] = self.cert_file_front_type
        if self.cert_file_reverse_type is not None:
            result['cert_file_reverse_type'] = self.cert_file_reverse_type
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('cert_num') is not None:
            self.cert_num = m.get('cert_num')
        if m.get('cert_file_front_id') is not None:
            self.cert_file_front_id = m.get('cert_file_front_id')
        if m.get('cert_file_reverse_id') is not None:
            self.cert_file_reverse_id = m.get('cert_file_reverse_id')
        if m.get('cert_file_front_type') is not None:
            self.cert_file_front_type = m.get('cert_file_front_type')
        if m.get('cert_file_reverse_type') is not None:
            self.cert_file_reverse_type = m.get('cert_file_reverse_type')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class VerifyUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        did: str = None,
        certify_lp_dto: CertifyLPDTO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 验证成功，颁发个人did
        self.did = did
        # 个人二维码认证信息
        self.certify_lp_dto = certify_lp_dto

    def validate(self):
        if self.certify_lp_dto:
            self.certify_lp_dto.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.did is not None:
            result['did'] = self.did
        if self.certify_lp_dto is not None:
            result['certify_lp_dto'] = self.certify_lp_dto.to_map()
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
        if m.get('certify_lp_dto') is not None:
            temp_model = CertifyLPDTO()
            self.certify_lp_dto = temp_model.from_map(m['certify_lp_dto'])
        return self


class RecognizeOcrFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_id: str = None,
        file_type: str = None,
        cert_type: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件id
        self.file_id = file_id
        # 文件类型
        self.file_type = file_type
        # 证件类型
        self.cert_type = cert_type
        # 租户id
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.cert_type, 'cert_type')
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class RecognizeOcrFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        parse_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 解析数据结果，对应不同证件
        self.parse_data = parse_data

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
        if self.parse_data is not None:
            result['parse_data'] = self.parse_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('parse_data') is not None:
            self.parse_data = m.get('parse_data')
        return self


class CertifyCertifyFirmmetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        tenant_id: str = None,
        firm_name: str = None,
        cert_no: str = None,
        lp_cert_name: str = None,
        lp_cert_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 自定义唯一id
        self.biz_id = biz_id
        # 租户类型
        self.tenant_id = tenant_id
        # 企业名称
        self.firm_name = firm_name
        # 企业营业执照号
        self.cert_no = cert_no
        # 法人姓名
        self.lp_cert_name = lp_cert_name
        # 法人身份证号
        self.lp_cert_no = lp_cert_no

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.firm_name, 'firm_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.lp_cert_name, 'lp_cert_name')
        self.validate_required(self.lp_cert_no, 'lp_cert_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.firm_name is not None:
            result['firm_name'] = self.firm_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.lp_cert_name is not None:
            result['lp_cert_name'] = self.lp_cert_name
        if self.lp_cert_no is not None:
            result['lp_cert_no'] = self.lp_cert_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('firm_name') is not None:
            self.firm_name = m.get('firm_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('lp_cert_name') is not None:
            self.lp_cert_name = m.get('lp_cert_name')
        if m.get('lp_cert_no') is not None:
            self.lp_cert_no = m.get('lp_cert_no')
        return self


class CertifyCertifyFirmmetaResponse(TeaModel):
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
        # 企业did
        self.did = did

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


class CertifyCertifyPersonmetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        tenant_id: str = None,
        user_name: str = None,
        user_cert_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 自定义唯一id
        self.biz_id = biz_id
        # 租户类型
        self.tenant_id = tenant_id
        # 姓名
        self.user_name = user_name
        # 身份证号
        self.user_cert_no = user_cert_no

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.user_cert_no, 'user_cert_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_cert_no is not None:
            result['user_cert_no'] = self.user_cert_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_cert_no') is not None:
            self.user_cert_no = m.get('user_cert_no')
        return self


class CertifyCertifyPersonmetaResponse(TeaModel):
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
        # 个人did
        self.did = did

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


class CertifyCertifyFaceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        tenant_id: str = None,
        user_name: str = None,
        user_cert_no: str = None,
        front_callback_url: str = None,
        back_callback_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 自定义唯一id
        self.biz_id = biz_id
        # 租户类型
        self.tenant_id = tenant_id
        # 姓名
        self.user_name = user_name
        # 身份证号
        self.user_cert_no = user_cert_no
        # 前端页面回调地址
        self.front_callback_url = front_callback_url
        # 后端接口回调地址
        self.back_callback_url = back_callback_url

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.user_cert_no, 'user_cert_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_cert_no is not None:
            result['user_cert_no'] = self.user_cert_no
        if self.front_callback_url is not None:
            result['front_callback_url'] = self.front_callback_url
        if self.back_callback_url is not None:
            result['back_callback_url'] = self.back_callback_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_cert_no') is not None:
            self.user_cert_no = m.get('user_cert_no')
        if m.get('front_callback_url') is not None:
            self.front_callback_url = m.get('front_callback_url')
        if m.get('back_callback_url') is not None:
            self.back_callback_url = m.get('back_callback_url')
        return self


class CertifyCertifyFaceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        redirect_url: str = None,
        verify_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 跳转url
        self.redirect_url = redirect_url
        # 校验id
        self.verify_id = verify_id

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
        if self.redirect_url is not None:
            result['redirect_url'] = self.redirect_url
        if self.verify_id is not None:
            result['verify_id'] = self.verify_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('redirect_url') is not None:
            self.redirect_url = m.get('redirect_url')
        if m.get('verify_id') is not None:
            self.verify_id = m.get('verify_id')
        return self


class QueryQueryFacecertifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        tenant_id: str = None,
        verify_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 自定义唯一id
        self.biz_id = biz_id
        # 租户类型
        self.tenant_id = tenant_id
        # 校验id
        self.verify_id = verify_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.verify_id, 'verify_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.verify_id is not None:
            result['verify_id'] = self.verify_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('verify_id') is not None:
            self.verify_id = m.get('verify_id')
        return self


class QueryQueryFacecertifyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        verify_status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success
        # 认证状态
        # VERIFY_SUCCESS：认证成功
        # VERIFY_PROCESSING：正在认证
        # VERIFY_FAILED：认证失败
        self.verify_status = verify_status

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
        if self.success is not None:
            result['success'] = self.success
        if self.verify_status is not None:
            result['verify_status'] = self.verify_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('verify_status') is not None:
            self.verify_status = m.get('verify_status')
        return self


class SwitchSwitchFirmidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: int = None,
        firm_id: int = None,
        session_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 账号id
        self.user_id = user_id
        # 企业id
        self.firm_id = firm_id
        # 登录sessionId
        self.session_id = session_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.firm_id, 'firm_id')
        self.validate_required(self.session_id, 'session_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.firm_id is not None:
            result['firm_id'] = self.firm_id
        if self.session_id is not None:
            result['session_id'] = self.session_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('firm_id') is not None:
            self.firm_id = m.get('firm_id')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        return self


class SwitchSwitchFirmidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        error_code: str = None,
        error_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success
        # 结果码
        self.error_code = error_code
        # 结果消息
        self.error_msg = error_msg

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
        if self.success is not None:
            result['success'] = self.success
        if self.error_code is not None:
            result['error_code'] = self.error_code
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
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class QueryQueryFirmfinancialRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        firm_id: int = None,
        tenant_id: str = None,
        query_options: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业Id
        self.firm_id = firm_id
        # 租户信息
        self.tenant_id = tenant_id
        # 查询类型（1：查询状态，2：财报信息）
        self.query_options = query_options

    def validate(self):
        self.validate_required(self.firm_id, 'firm_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.query_options, 'query_options')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.firm_id is not None:
            result['firm_id'] = self.firm_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.query_options is not None:
            result['query_options'] = self.query_options
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('firm_id') is not None:
            self.firm_id = m.get('firm_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('query_options') is not None:
            self.query_options = m.get('query_options')
        return self


class QueryQueryFirmfinancialResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        error_code: str = None,
        error_msg: str = None,
        status: bool = None,
        account_result: List[FileInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success
        # 结果码
        self.error_code = error_code
        # 结果消息
        self.error_msg = error_msg
        # 财报状态(true已上传，false未上传)
        self.status = status
        # 查询结果
        self.account_result = account_result

    def validate(self):
        if self.account_result:
            for k in self.account_result:
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
        if self.success is not None:
            result['success'] = self.success
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        if self.status is not None:
            result['status'] = self.status
        result['account_result'] = []
        if self.account_result is not None:
            for k in self.account_result:
                result['account_result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        self.account_result = []
        if m.get('account_result') is not None:
            for k in m.get('account_result'):
                temp_model = FileInfo()
                self.account_result.append(temp_model.from_map(k))
        return self


class SwitchSwitchFirmfinancialRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        firm_id: int = None,
        tenant_id: str = None,
        operation_type: str = None,
        biz_id: str = None,
        file_info: FileInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业id
        self.firm_id = firm_id
        # 租户类型
        self.tenant_id = tenant_id
        # 操作类型（新增：add，删除：delete)
        self.operation_type = operation_type
        # 业务id
        self.biz_id = biz_id
        # 财报信息
        self.file_info = file_info

    def validate(self):
        self.validate_required(self.firm_id, 'firm_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.operation_type, 'operation_type')
        if self.file_info:
            self.file_info.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.firm_id is not None:
            result['firm_id'] = self.firm_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.operation_type is not None:
            result['operation_type'] = self.operation_type
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.file_info is not None:
            result['file_info'] = self.file_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('firm_id') is not None:
            self.firm_id = m.get('firm_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('operation_type') is not None:
            self.operation_type = m.get('operation_type')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('file_info') is not None:
            temp_model = FileInfo()
            self.file_info = temp_model.from_map(m['file_info'])
        return self


class SwitchSwitchFirmfinancialResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        error_code: str = None,
        error_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success
        # 结果码
        self.error_code = error_code
        # 结果消息
        self.error_msg = error_msg

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
        if self.success is not None:
            result['success'] = self.success
        if self.error_code is not None:
            result['error_code'] = self.error_code
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
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class CreateDidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        tenant_type: str = None,
        cert_type: str = None,
        cert_reg_num: str = None,
        legal_name: str = None,
        legal_cert_num: str = None,
        firm_name: str = None,
        email: str = None,
        cert_num: str = None,
        phone: str = None,
        name: str = None,
        user_did: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # ⾃定义唯⼀id
        self.biz_id = biz_id
        # 租户类型
        # 
        self.tenant_type = tenant_type
        # 认证类型，企业：FIRM，个人：PERSON
        self.cert_type = cert_type
        # 企业营业执照号(当认证类型为企业时为必传)
        self.cert_reg_num = cert_reg_num
        # 法人姓名
        self.legal_name = legal_name
        # 法人身份证号
        self.legal_cert_num = legal_cert_num
        # 企业名称(当认证类型为企业时为必传)
        self.firm_name = firm_name
        # 个人email
        self.email = email
        # 个人身份证号
        self.cert_num = cert_num
        # 个人手机号
        self.phone = phone
        # 个人姓名
        self.name = name
        # 个人did(当认证类型为企业时为必传)
        self.user_did = user_did

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.tenant_type, 'tenant_type')
        self.validate_required(self.cert_type, 'cert_type')
        self.validate_required(self.cert_num, 'cert_num')
        self.validate_required(self.name, 'name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.tenant_type is not None:
            result['tenant_type'] = self.tenant_type
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.cert_reg_num is not None:
            result['cert_reg_num'] = self.cert_reg_num
        if self.legal_name is not None:
            result['legal_name'] = self.legal_name
        if self.legal_cert_num is not None:
            result['legal_cert_num'] = self.legal_cert_num
        if self.firm_name is not None:
            result['firm_name'] = self.firm_name
        if self.email is not None:
            result['email'] = self.email
        if self.cert_num is not None:
            result['cert_num'] = self.cert_num
        if self.phone is not None:
            result['phone'] = self.phone
        if self.name is not None:
            result['name'] = self.name
        if self.user_did is not None:
            result['user_did'] = self.user_did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('tenant_type') is not None:
            self.tenant_type = m.get('tenant_type')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('cert_reg_num') is not None:
            self.cert_reg_num = m.get('cert_reg_num')
        if m.get('legal_name') is not None:
            self.legal_name = m.get('legal_name')
        if m.get('legal_cert_num') is not None:
            self.legal_cert_num = m.get('legal_cert_num')
        if m.get('firm_name') is not None:
            self.firm_name = m.get('firm_name')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('cert_num') is not None:
            self.cert_num = m.get('cert_num')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        return self


class CreateDidResponse(TeaModel):
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
        # 企业did/个人did
        self.did = did

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


class CreateContractPlatformRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        creator: Contractaccountapplication = None,
        platform: Contractorganizationapplication = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 创建个人
        self.creator = creator
        # 合同企业信息
        self.platform = platform

    def validate(self):
        self.validate_required(self.creator, 'creator')
        if self.creator:
            self.creator.validate()
        self.validate_required(self.platform, 'platform')
        if self.platform:
            self.platform.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.creator is not None:
            result['creator'] = self.creator.to_map()
        if self.platform is not None:
            result['platform'] = self.platform.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('creator') is not None:
            temp_model = Contractaccountapplication()
            self.creator = temp_model.from_map(m['creator'])
        if m.get('platform') is not None:
            temp_model = Contractorganizationapplication()
            self.platform = temp_model.from_map(m['platform'])
        return self


class CreateContractPlatformResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: int = None,
        creator_id: str = None,
        message: str = None,
        platform_id: str = None,
        secret: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务码，0表示成功
        # 
        self.code = code
        # 创建人ID
        # 
        self.creator_id = creator_id
        # 业务码信息
        # 
        self.message = message
        # 平台方ID
        # 
        self.platform_id = platform_id
        # 平台用户与智能合同服务间鉴权使用的密钥
        # 
        self.secret = secret

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
        if self.code is not None:
            result['code'] = self.code
        if self.creator_id is not None:
            result['creator_id'] = self.creator_id
        if self.message is not None:
            result['message'] = self.message
        if self.platform_id is not None:
            result['platform_id'] = self.platform_id
        if self.secret is not None:
            result['secret'] = self.secret
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('creator_id') is not None:
            self.creator_id = m.get('creator_id')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('platform_id') is not None:
            self.platform_id = m.get('platform_id')
        if m.get('secret') is not None:
            self.secret = m.get('secret')
        return self


class AddContractDocumentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        docs: List[ContractDocument] = None,
        flow_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待签署文件
        self.docs = docs
        # 流程ID
        self.flow_id = flow_id

    def validate(self):
        self.validate_required(self.docs, 'docs')
        if self.docs:
            for k in self.docs:
                if k:
                    k.validate()
        self.validate_required(self.flow_id, 'flow_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        result['docs'] = []
        if self.docs is not None:
            for k in self.docs:
                result['docs'].append(k.to_map() if k else None)
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.docs = []
        if m.get('docs') is not None:
            for k in m.get('docs'):
                temp_model = ContractDocument()
                self.docs.append(temp_model.from_map(k))
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        return self


class AddContractDocumentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: int = None,
        message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务码，0表示成功
        self.code = code
        # 业务码信息
        self.message = message

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
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class AddContractFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        simple_form_fields: str = None,
        template_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件名称
        # 
        self.name = name
        # 输入项填充内容，以key:value传入
        # 
        self.simple_form_fields = simple_form_fields
        # 模板编号
        # 
        self.template_id = template_id

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.simple_form_fields, 'simple_form_fields')
        self.validate_required(self.template_id, 'template_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.name is not None:
            result['name'] = self.name
        if self.simple_form_fields is not None:
            result['simple_form_fields'] = self.simple_form_fields
        if self.template_id is not None:
            result['template_id'] = self.template_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('simple_form_fields') is not None:
            self.simple_form_fields = m.get('simple_form_fields')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        return self


class AddContractFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        download_url: str = None,
        file_id: str = None,
        file_name: str = None,
        code: int = None,
        message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文件下载地址，有效期一小时
        # 
        self.download_url = download_url
        # 文件id
        # 
        self.file_id = file_id
        # 文件名称
        # 
        self.file_name = file_name
        # 业务码，0表示成功
        self.code = code
        # 业务码信息
        self.message = message

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
        if self.download_url is not None:
            result['download_url'] = self.download_url
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('download_url') is not None:
            self.download_url = m.get('download_url')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class ApplyContractCallbackkeyRequest(TeaModel):
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


class ApplyContractCallbackkeyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        key: str = None,
        code: int = None,
        message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 加签使用的key
        # 
        self.key = key
        # 业务码，0表示成功
        self.code = code
        # 业务码信息
        self.message = message

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
        if self.key is not None:
            result['key'] = self.key
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class AuthContractSignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        account_id: str = None,
        deadline: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权人DID，即个人账号DID或机构账号DID
        # 
        self.account_id = account_id
        # 授权截止时间, 格式为yyyy-MM-dd HH:mm:ss，默认无限期
        # 
        self.deadline = deadline

    def validate(self):
        self.validate_required(self.account_id, 'account_id')
        self.validate_required(self.deadline, 'deadline')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.deadline is not None:
            result['deadline'] = self.deadline
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('deadline') is not None:
            self.deadline = m.get('deadline')
        return self


class AuthContractSignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        accepted: bool = None,
        code: int = None,
        message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务数据, 是否授权成功
        # 
        self.accepted = accepted
        # 业务码，0表示成功
        # 
        self.code = code
        # 业务码信息
        # 
        self.message = message

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
        if self.accepted is not None:
            result['accepted'] = self.accepted
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('accepted') is not None:
            self.accepted = m.get('accepted')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class CreateContractTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        content_md_5: str = None,
        content_type: str = None,
        convert_2pdf: bool = None,
        file_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 模板文件md5值，再做base64编码
        # 
        self.content_md_5 = content_md_5
        # 目标文件的MIME类型
        # 
        self.content_type = content_type
        # 是否需要转成pdf，如果模板文件为.doc/.docx 传true，为pdf传false
        # 
        self.convert_2pdf = convert_2pdf
        # 文件名称，必须带扩展名如:.pdf,.doc,.docx
        # 
        self.file_name = file_name

    def validate(self):
        self.validate_required(self.content_md_5, 'content_md_5')
        self.validate_required(self.content_type, 'content_type')
        self.validate_required(self.convert_2pdf, 'convert_2pdf')
        self.validate_required(self.file_name, 'file_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.content_md_5 is not None:
            result['content_md5'] = self.content_md_5
        if self.content_type is not None:
            result['content_type'] = self.content_type
        if self.convert_2pdf is not None:
            result['convert2_pdf'] = self.convert_2pdf
        if self.file_name is not None:
            result['file_name'] = self.file_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('content_md5') is not None:
            self.content_md_5 = m.get('content_md5')
        if m.get('content_type') is not None:
            self.content_type = m.get('content_type')
        if m.get('convert2_pdf') is not None:
            self.convert_2pdf = m.get('convert2_pdf')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        return self


class CreateContractTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: int = None,
        message: str = None,
        template_id: str = None,
        upload_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务码，0表示成功
        # 
        self.code = code
        # 业务码信息
        # 
        self.message = message
        # 模板ID
        # 
        self.template_id = template_id
        # 文件直传地址，需要用此上传地址使用put方式上传文件，只有文件上传后模板才可用
        # 
        self.upload_url = upload_url

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
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.template_id is not None:
            result['template_id'] = self.template_id
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
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('upload_url') is not None:
            self.upload_url = m.get('upload_url')
        return self


class CreateContractSignflowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        auto_archive: bool = None,
        auto_deduction_force: bool = None,
        business_scene: str = None,
        contract_sign_flow_config: Contractsignflowconfig = None,
        initiator_account_id: str = None,
        initiator_authorized_account_id: str = None,
        repayment_order_info: List[ContractPaymentOrderInfo] = None,
        sign_platform: str = None,
        sign_validity: int = None,
        payer_tuid: str = None,
        payee_tuid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 是否自动归档，默认false 如设置为true，则在流程开启后，当所有签署人签署完毕，系统自动将流程归档，状态变为“已完成”状态，在流程状态为“已完成”前，可随时添加签署人；如设置为false，则在调用流程开启后，需主动调用签署流程归档接口，将流程状...
        # 
        self.auto_archive = auto_archive
        # 是否强制代扣
        # 
        self.auto_deduction_force = auto_deduction_force
        # 文件主题
        # 
        self.business_scene = business_scene
        # 合同签名配置
        self.contract_sign_flow_config = contract_sign_flow_config
        # 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
        # 
        self.initiator_account_id = initiator_account_id
        # 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
        # 
        self.initiator_authorized_account_id = initiator_authorized_account_id
        # 代扣信息
        self.repayment_order_info = repayment_order_info
        # 签署平台，ALIPAY（支付宝小程序）或H5
        # 
        self.sign_platform = sign_platform
        # 签署有效截止日期，毫秒，默认3天失效
        # 
        self.sign_validity = sign_validity
        # 付款方ID（个人）
        # 
        self.payer_tuid = payer_tuid
        # 收款方ID(机构)
        # 
        self.payee_tuid = payee_tuid

    def validate(self):
        self.validate_required(self.auto_deduction_force, 'auto_deduction_force')
        self.validate_required(self.business_scene, 'business_scene')
        self.validate_required(self.contract_sign_flow_config, 'contract_sign_flow_config')
        if self.contract_sign_flow_config:
            self.contract_sign_flow_config.validate()
        self.validate_required(self.repayment_order_info, 'repayment_order_info')
        if self.repayment_order_info:
            for k in self.repayment_order_info:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.auto_archive is not None:
            result['auto_archive'] = self.auto_archive
        if self.auto_deduction_force is not None:
            result['auto_deduction_force'] = self.auto_deduction_force
        if self.business_scene is not None:
            result['business_scene'] = self.business_scene
        if self.contract_sign_flow_config is not None:
            result['contract_sign_flow_config'] = self.contract_sign_flow_config.to_map()
        if self.initiator_account_id is not None:
            result['initiator_account_id'] = self.initiator_account_id
        if self.initiator_authorized_account_id is not None:
            result['initiator_authorized_account_id'] = self.initiator_authorized_account_id
        result['repayment_order_info'] = []
        if self.repayment_order_info is not None:
            for k in self.repayment_order_info:
                result['repayment_order_info'].append(k.to_map() if k else None)
        if self.sign_platform is not None:
            result['sign_platform'] = self.sign_platform
        if self.sign_validity is not None:
            result['sign_validity'] = self.sign_validity
        if self.payer_tuid is not None:
            result['payer_tuid'] = self.payer_tuid
        if self.payee_tuid is not None:
            result['payee_tuid'] = self.payee_tuid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('auto_archive') is not None:
            self.auto_archive = m.get('auto_archive')
        if m.get('auto_deduction_force') is not None:
            self.auto_deduction_force = m.get('auto_deduction_force')
        if m.get('business_scene') is not None:
            self.business_scene = m.get('business_scene')
        if m.get('contract_sign_flow_config') is not None:
            temp_model = Contractsignflowconfig()
            self.contract_sign_flow_config = temp_model.from_map(m['contract_sign_flow_config'])
        if m.get('initiator_account_id') is not None:
            self.initiator_account_id = m.get('initiator_account_id')
        if m.get('initiator_authorized_account_id') is not None:
            self.initiator_authorized_account_id = m.get('initiator_authorized_account_id')
        self.repayment_order_info = []
        if m.get('repayment_order_info') is not None:
            for k in m.get('repayment_order_info'):
                temp_model = ContractPaymentOrderInfo()
                self.repayment_order_info.append(temp_model.from_map(k))
        if m.get('sign_platform') is not None:
            self.sign_platform = m.get('sign_platform')
        if m.get('sign_validity') is not None:
            self.sign_validity = m.get('sign_validity')
        if m.get('payer_tuid') is not None:
            self.payer_tuid = m.get('payer_tuid')
        if m.get('payee_tuid') is not None:
            self.payee_tuid = m.get('payee_tuid')
        return self


class CreateContractSignflowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: int = None,
        flow_id: str = None,
        message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务码，0表示成功
        # 
        self.code = code
        # 签约流程ID
        self.flow_id = flow_id
        # 业务码信息
        # 
        self.message = message

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
        if self.code is not None:
            result['code'] = self.code
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class GetContractFileuploadurlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        account_id: str = None,
        content_md_5: str = None,
        content_type: str = None,
        convert_2pdf: str = None,
        file_name: str = None,
        file_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 所属账号did，即个人账号id或机构账号id，如不传，则默认属于对接平台
        # 
        self.account_id = account_id
        # 先计算文件md5值，在对该md5值进行base64编码
        # 
        self.content_md_5 = content_md_5
        # 目标文件的MIME类型
        # 
        self.content_type = content_type
        # 是否转换成pdf文档，默认false，代表不做转换。转换是异步行为，如果指定要转换，需要调用查询文件信息接口查询状态，转换完成后才可使用。
        # 
        self.convert_2pdf = convert_2pdf
        # 文件名称（必须带上文件扩展名，不然会导致后续发起流程校验过不去 示例：合同.pdf ）
        # 
        self.file_name = file_name
        # 文件大小，单位byte
        # 
        self.file_size = file_size

    def validate(self):
        self.validate_required(self.content_md_5, 'content_md_5')
        self.validate_required(self.content_type, 'content_type')
        self.validate_required(self.convert_2pdf, 'convert_2pdf')
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.file_size, 'file_size')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.content_md_5 is not None:
            result['content_md5'] = self.content_md_5
        if self.content_type is not None:
            result['content_type'] = self.content_type
        if self.convert_2pdf is not None:
            result['convert_2_pdf'] = self.convert_2pdf
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_size is not None:
            result['file_size'] = self.file_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('content_md5') is not None:
            self.content_md_5 = m.get('content_md5')
        if m.get('content_type') is not None:
            self.content_type = m.get('content_type')
        if m.get('convert_2_pdf') is not None:
            self.convert_2pdf = m.get('convert_2_pdf')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_size') is not None:
            self.file_size = m.get('file_size')
        return self


class GetContractFileuploadurlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: int = None,
        file_id: str = None,
        message: str = None,
        upload_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务码，0表示成功
        # 
        self.code = code
        # 文件Id
        # 
        self.file_id = file_id
        # 文件直传地址, 可以重复使用，但是只能传一样的文件，有效期一小时
        # 
        self.message = message
        # 上传url
        self.upload_url = upload_url

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
        if self.code is not None:
            result['code'] = self.code
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.message is not None:
            result['message'] = self.message
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
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('upload_url') is not None:
            self.upload_url = m.get('upload_url')
        return self


class AddContractSignfieldRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        flow_id: str = None,
        signfields: List[ContractSignFieldApplication] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 签署流程ID
        # 
        self.flow_id = flow_id
        # 合同签约字段集合
        self.signfields = signfields

    def validate(self):
        self.validate_required(self.flow_id, 'flow_id')
        self.validate_required(self.signfields, 'signfields')
        if self.signfields:
            for k in self.signfields:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        result['signfields'] = []
        if self.signfields is not None:
            for k in self.signfields:
                result['signfields'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        self.signfields = []
        if m.get('signfields') is not None:
            for k in m.get('signfields'):
                temp_model = ContractSignFieldApplication()
                self.signfields.append(temp_model.from_map(k))
        return self


class AddContractSignfieldResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: int = None,
        message: str = None,
        signfields: List[ContractSignField] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务码，0表示成功
        # 
        self.code = code
        # 业务码信息
        # 
        self.message = message
        # 合同签约返回值
        self.signfields = signfields

    def validate(self):
        if self.signfields:
            for k in self.signfields:
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
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        result['signfields'] = []
        if self.signfields is not None:
            for k in self.signfields:
                result['signfields'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        self.signfields = []
        if m.get('signfields') is not None:
            for k in m.get('signfields'):
                temp_model = ContractSignField()
                self.signfields.append(temp_model.from_map(k))
        return self


class CreateContractHandsignfieldRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        flow_id: str = None,
        sign_fields: List[ContractHandSignFieldApplication] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 流程id
        # 
        self.flow_id = flow_id
        # 签名参数
        self.sign_fields = sign_fields

    def validate(self):
        self.validate_required(self.flow_id, 'flow_id')
        self.validate_required(self.sign_fields, 'sign_fields')
        if self.sign_fields:
            for k in self.sign_fields:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        result['sign_fields'] = []
        if self.sign_fields is not None:
            for k in self.sign_fields:
                result['sign_fields'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        self.sign_fields = []
        if m.get('sign_fields') is not None:
            for k in m.get('sign_fields'):
                temp_model = ContractHandSignFieldApplication()
                self.sign_fields.append(temp_model.from_map(k))
        return self


class CreateContractHandsignfieldResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: int = None,
        message: str = None,
        signfields: List[ContractSignField] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务码，0表示成功
        # 
        self.code = code
        # 业务码信息
        # 
        self.message = message
        # 签署区列表数据
        # 
        self.signfields = signfields

    def validate(self):
        if self.signfields:
            for k in self.signfields:
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
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        result['signfields'] = []
        if self.signfields is not None:
            for k in self.signfields:
                result['signfields'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        self.signfields = []
        if m.get('signfields') is not None:
            for k in m.get('signfields'):
                temp_model = ContractSignField()
                self.signfields.append(temp_model.from_map(k))
        return self


class StartContractFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        flow_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 流程ID
        # 
        self.flow_id = flow_id

    def validate(self):
        self.validate_required(self.flow_id, 'flow_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        return self


class StartContractFlowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: int = None,
        message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务码，0表示成功
        # 
        self.code = code
        # 业务码信息
        # 
        self.message = message

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
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class GetContractSignurlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        account_id: str = None,
        flow_id: str = None,
        organize_id: str = None,
        short_url: bool = None,
        agent_account_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 签署人账号id
        # 
        self.account_id = account_id
        # 流程id
        # 
        self.flow_id = flow_id
        # 默认为空，返回的任务链接仅包含签署人本人需要签署的任务； 传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务； 传入指定机构id，则返回的任务链接包含签署人“本人+指定代签机构”的签署任务
        # 
        self.organize_id = organize_id
        # 是否需要同时返回短链接，默认为false
        # 
        self.short_url = short_url
        # 客户账户id
        self.agent_account_id = agent_account_id

    def validate(self):
        self.validate_required(self.account_id, 'account_id')
        self.validate_required(self.flow_id, 'flow_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.organize_id is not None:
            result['organize_id'] = self.organize_id
        if self.short_url is not None:
            result['short_url'] = self.short_url
        if self.agent_account_id is not None:
            result['agent_account_id'] = self.agent_account_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('organize_id') is not None:
            self.organize_id = m.get('organize_id')
        if m.get('short_url') is not None:
            self.short_url = m.get('short_url')
        if m.get('agent_account_id') is not None:
            self.agent_account_id = m.get('agent_account_id')
        return self


class GetContractSignurlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: int = None,
        message: str = None,
        short_url: str = None,
        url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务码，0表示成功
        # 
        self.code = code
        # 业务码信息
        # 
        self.message = message
        # 短链地址
        # 
        self.short_url = short_url
        # 长链地址
        # 
        self.url = url

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
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.short_url is not None:
            result['short_url'] = self.short_url
        if self.url is not None:
            result['url'] = self.url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('short_url') is not None:
            self.short_url = m.get('short_url')
        if m.get('url') is not None:
            self.url = m.get('url')
        return self


class DownloadContractDocumentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        flow_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 流程ID
        # 
        self.flow_id = flow_id

    def validate(self):
        self.validate_required(self.flow_id, 'flow_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        return self


class DownloadContractDocumentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        docs: List[ContractDocAddress] = None,
        code: int = None,
        message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文档下载地址
        self.docs = docs
        # 业务码，0表示成功
        self.code = code
        # 业务码信息
        self.message = message

    def validate(self):
        if self.docs:
            for k in self.docs:
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
        result['docs'] = []
        if self.docs is not None:
            for k in self.docs:
                result['docs'].append(k.to_map() if k else None)
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.docs = []
        if m.get('docs') is not None:
            for k in m.get('docs'):
                temp_model = ContractDocAddress()
                self.docs.append(temp_model.from_map(k))
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class SaveContractFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        flow_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 流程ID
        # 
        self.flow_id = flow_id

    def validate(self):
        self.validate_required(self.flow_id, 'flow_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        return self


class SaveContractFlowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: int = None,
        message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务码，0表示成功
        # 
        self.code = code
        # 业务码信息
        # 
        self.message = message

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
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class QueryContractFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        flow_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 流程id
        # 
        self.flow_id = flow_id

    def validate(self):
        self.validate_required(self.flow_id, 'flow_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        return self


class QueryContractFlowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        auto_archive: bool = None,
        business_scene: str = None,
        code: int = None,
        config_info: Contractsignflowconfig = None,
        contract_remind: int = None,
        contract_validity: int = None,
        flow_desc: str = None,
        flow_end_time: str = None,
        flow_id: str = None,
        flow_start_time: str = None,
        flow_status: int = None,
        initiator_account_id: str = None,
        initiator_authorized_account_id: str = None,
        message: str = None,
        sign_validity: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否自动归档
        # 
        self.auto_archive = auto_archive
        # 文件主题
        # 
        self.business_scene = business_scene
        # 业务码，0表示成功
        # 
        self.code = code
        # 流程配置信息
        # 
        self.config_info = config_info
        # 文件到期前，提前多少小时提醒续签
        # 
        self.contract_remind = contract_remind
        # 文件有效截止日期
        # 
        self.contract_validity = contract_validity
        # 流程描述, 如果流程已拒签或已撤回, 并且存在拒签或撤回原因, 流程描述显示为原因, 否则默认为流程状态描述
        # 
        self.flow_desc = flow_desc
        # 流程结束时间
        # 
        self.flow_end_time = flow_end_time
        # 流程ID
        # 
        self.flow_id = flow_id
        # 流程开始时间
        # 
        self.flow_start_time = flow_start_time
        # 流程状态,0-草稿 1-签署中 2-完成 3-撤销 4-终止 5-过期 6-删除 7-拒签
        # 
        self.flow_status = flow_status
        # 发起人账户id
        # 
        self.initiator_account_id = initiator_account_id
        # 发起方主体id
        # 
        self.initiator_authorized_account_id = initiator_authorized_account_id
        # 业务码信息
        # 
        self.message = message
        # 签署有效截止日期
        self.sign_validity = sign_validity

    def validate(self):
        if self.config_info:
            self.config_info.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.auto_archive is not None:
            result['auto_archive'] = self.auto_archive
        if self.business_scene is not None:
            result['business_scene'] = self.business_scene
        if self.code is not None:
            result['code'] = self.code
        if self.config_info is not None:
            result['config_info'] = self.config_info.to_map()
        if self.contract_remind is not None:
            result['contract_remind'] = self.contract_remind
        if self.contract_validity is not None:
            result['contract_validity'] = self.contract_validity
        if self.flow_desc is not None:
            result['flow_desc'] = self.flow_desc
        if self.flow_end_time is not None:
            result['flow_end_time'] = self.flow_end_time
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.flow_start_time is not None:
            result['flow_start_time'] = self.flow_start_time
        if self.flow_status is not None:
            result['flow_status'] = self.flow_status
        if self.initiator_account_id is not None:
            result['initiator_account_id'] = self.initiator_account_id
        if self.initiator_authorized_account_id is not None:
            result['initiator_authorized_account_id'] = self.initiator_authorized_account_id
        if self.message is not None:
            result['message'] = self.message
        if self.sign_validity is not None:
            result['sign_validity'] = self.sign_validity
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('auto_archive') is not None:
            self.auto_archive = m.get('auto_archive')
        if m.get('business_scene') is not None:
            self.business_scene = m.get('business_scene')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('config_info') is not None:
            temp_model = Contractsignflowconfig()
            self.config_info = temp_model.from_map(m['config_info'])
        if m.get('contract_remind') is not None:
            self.contract_remind = m.get('contract_remind')
        if m.get('contract_validity') is not None:
            self.contract_validity = m.get('contract_validity')
        if m.get('flow_desc') is not None:
            self.flow_desc = m.get('flow_desc')
        if m.get('flow_end_time') is not None:
            self.flow_end_time = m.get('flow_end_time')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('flow_start_time') is not None:
            self.flow_start_time = m.get('flow_start_time')
        if m.get('flow_status') is not None:
            self.flow_status = m.get('flow_status')
        if m.get('initiator_account_id') is not None:
            self.initiator_account_id = m.get('initiator_account_id')
        if m.get('initiator_authorized_account_id') is not None:
            self.initiator_authorized_account_id = m.get('initiator_authorized_account_id')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('sign_validity') is not None:
            self.sign_validity = m.get('sign_validity')
        return self


class GetContractFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件id
        # 
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.file_id, 'file_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class GetContractFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: int = None,
        download_url: str = None,
        file_id: str = None,
        message: str = None,
        name: str = None,
        pdf_total_pages: int = None,
        size: int = None,
        status: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务码，0表示成功
        # 
        self.code = code
        # 下载地址
        # 
        self.download_url = download_url
        # 文件id
        # 
        self.file_id = file_id
        # 业务码信息
        # 
        self.message = message
        # 文件名称
        # 
        self.name = name
        # pdf文件总页数,仅当文件类型为pdf时有值
        # 
        self.pdf_total_pages = pdf_total_pages
        # 文件大小，单位byte
        # 
        self.size = size
        # 文件状态, 0:文件未上传；1:文件上传中 ；2：文件上传已完成,；3：文件上传失败 ；4：文件等待转pdf ；5：文件已转换pdf 。
        # 
        self.status = status

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
        if self.code is not None:
            result['code'] = self.code
        if self.download_url is not None:
            result['download_url'] = self.download_url
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.message is not None:
            result['message'] = self.message
        if self.name is not None:
            result['name'] = self.name
        if self.pdf_total_pages is not None:
            result['pdf_total_pages'] = self.pdf_total_pages
        if self.size is not None:
            result['size'] = self.size
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
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('download_url') is not None:
            self.download_url = m.get('download_url')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('pdf_total_pages') is not None:
            self.pdf_total_pages = m.get('pdf_total_pages')
        if m.get('size') is not None:
            self.size = m.get('size')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class QueryContractNotaryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        flow_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 签署流程ID
        self.flow_id = flow_id

    def validate(self):
        self.validate_required(self.flow_id, 'flow_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        return self


class QueryContractNotaryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: int = None,
        message: str = None,
        notaries: List[ContractNotaryInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务码，0表示成功
        # 
        self.code = code
        # 业务码信息
        # 
        self.message = message
        # 存证信息列表
        self.notaries = notaries

    def validate(self):
        if self.notaries:
            for k in self.notaries:
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
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        result['notaries'] = []
        if self.notaries is not None:
            for k in self.notaries:
                result['notaries'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        self.notaries = []
        if m.get('notaries') is not None:
            for k in m.get('notaries'):
                temp_model = ContractNotaryInfo()
                self.notaries.append(temp_model.from_map(k))
        return self


class CreateContractAccountsealimageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        account_id: str = None,
        alias: str = None,
        data: str = None,
        height: int = None,
        transparent_flag: bool = None,
        type: str = None,
        width: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户id
        # 
        self.account_id = account_id
        # 印章别名
        # 
        self.alias = alias
        # 印章数据，base64格式字符串，不包含格式前缀
        # 
        self.data = data
        # 印章高度, 个人默认95px, 机构默认159px
        # 
        self.height = height
        # 是否对图片进行透明化处理，默认false。仅对图片整体做透明化处理，无法去除图片背景
        # 
        self.transparent_flag = transparent_flag
        # 印章数据类型，BASE64：base64格式
        # 
        self.type = type
        # 印章宽度, 个人默认95px, 机构默认159px
        # 
        self.width = width

    def validate(self):
        self.validate_required(self.account_id, 'account_id')
        self.validate_required(self.data, 'data')
        self.validate_required(self.type, 'type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.alias is not None:
            result['alias'] = self.alias
        if self.data is not None:
            result['data'] = self.data
        if self.height is not None:
            result['height'] = self.height
        if self.transparent_flag is not None:
            result['transparent_flag'] = self.transparent_flag
        if self.type is not None:
            result['type'] = self.type
        if self.width is not None:
            result['width'] = self.width
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('alias') is not None:
            self.alias = m.get('alias')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('transparent_flag') is not None:
            self.transparent_flag = m.get('transparent_flag')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('width') is not None:
            self.width = m.get('width')
        return self


class CreateContractAccountsealimageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        file_key: str = None,
        height: int = None,
        seal_id: str = None,
        url: str = None,
        width: int = None,
        code: int = None,
        message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 印章fileKey
        # 
        self.file_key = file_key
        # 印章高度
        # 
        self.height = height
        # 印章id
        # 
        self.seal_id = seal_id
        # 印章下载地址, 有效时间1小时
        # 
        self.url = url
        # 印章宽度
        # 
        self.width = width
        # 业务码，0表示成功
        self.code = code
        # 业务码信息
        self.message = message

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
        if self.file_key is not None:
            result['file_key'] = self.file_key
        if self.height is not None:
            result['height'] = self.height
        if self.seal_id is not None:
            result['seal_id'] = self.seal_id
        if self.url is not None:
            result['url'] = self.url
        if self.width is not None:
            result['width'] = self.width
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('seal_id') is not None:
            self.seal_id = m.get('seal_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('width') is not None:
            self.width = m.get('width')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class CreateContractOnestepflowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        auto_archive: bool = None,
        auto_initiate: bool = None,
        business_scene: str = None,
        comment: str = None,
        contract_sign_flow_config: Contractsignflowconfig = None,
        docs: List[ContractDocument] = None,
        initiator_account_id: str = None,
        initiator_authorized_account_id: str = None,
        sign_fields: List[OneStepSignField] = None,
        sign_platform: str = None,
        sign_validity: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 是否自动归档，默认false。
        # 
        self.auto_archive = auto_archive
        # 是否自动开启，默认false。
        # 
        self.auto_initiate = auto_initiate
        # 文件主题
        # 
        self.business_scene = business_scene
        # 流程备注
        # 
        self.comment = comment
        # 流程配置
        self.contract_sign_flow_config = contract_sign_flow_config
        # 合同文件
        self.docs = docs
        # 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
        # 
        self.initiator_account_id = initiator_account_id
        # 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
        # 
        self.initiator_authorized_account_id = initiator_authorized_account_id
        # 签署操作人个人账号标识，即操作本次签署的个人
        # 
        self.sign_fields = sign_fields
        # 签署平台，ALIPAY（支付宝小程序）或H5，默认H5
        # 
        self.sign_platform = sign_platform
        # 签署有效截止日期，毫秒，默认3天失效
        # 
        self.sign_validity = sign_validity

    def validate(self):
        self.validate_required(self.business_scene, 'business_scene')
        self.validate_required(self.contract_sign_flow_config, 'contract_sign_flow_config')
        if self.contract_sign_flow_config:
            self.contract_sign_flow_config.validate()
        self.validate_required(self.docs, 'docs')
        if self.docs:
            for k in self.docs:
                if k:
                    k.validate()
        self.validate_required(self.sign_fields, 'sign_fields')
        if self.sign_fields:
            for k in self.sign_fields:
                if k:
                    k.validate()
        self.validate_required(self.sign_validity, 'sign_validity')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.auto_archive is not None:
            result['auto_archive'] = self.auto_archive
        if self.auto_initiate is not None:
            result['auto_initiate'] = self.auto_initiate
        if self.business_scene is not None:
            result['business_scene'] = self.business_scene
        if self.comment is not None:
            result['comment'] = self.comment
        if self.contract_sign_flow_config is not None:
            result['contract_sign_flow_config'] = self.contract_sign_flow_config.to_map()
        result['docs'] = []
        if self.docs is not None:
            for k in self.docs:
                result['docs'].append(k.to_map() if k else None)
        if self.initiator_account_id is not None:
            result['initiator_account_id'] = self.initiator_account_id
        if self.initiator_authorized_account_id is not None:
            result['initiator_authorized_account_id'] = self.initiator_authorized_account_id
        result['sign_fields'] = []
        if self.sign_fields is not None:
            for k in self.sign_fields:
                result['sign_fields'].append(k.to_map() if k else None)
        if self.sign_platform is not None:
            result['sign_platform'] = self.sign_platform
        if self.sign_validity is not None:
            result['sign_validity'] = self.sign_validity
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('auto_archive') is not None:
            self.auto_archive = m.get('auto_archive')
        if m.get('auto_initiate') is not None:
            self.auto_initiate = m.get('auto_initiate')
        if m.get('business_scene') is not None:
            self.business_scene = m.get('business_scene')
        if m.get('comment') is not None:
            self.comment = m.get('comment')
        if m.get('contract_sign_flow_config') is not None:
            temp_model = Contractsignflowconfig()
            self.contract_sign_flow_config = temp_model.from_map(m['contract_sign_flow_config'])
        self.docs = []
        if m.get('docs') is not None:
            for k in m.get('docs'):
                temp_model = ContractDocument()
                self.docs.append(temp_model.from_map(k))
        if m.get('initiator_account_id') is not None:
            self.initiator_account_id = m.get('initiator_account_id')
        if m.get('initiator_authorized_account_id') is not None:
            self.initiator_authorized_account_id = m.get('initiator_authorized_account_id')
        self.sign_fields = []
        if m.get('sign_fields') is not None:
            for k in m.get('sign_fields'):
                temp_model = OneStepSignField()
                self.sign_fields.append(temp_model.from_map(k))
        if m.get('sign_platform') is not None:
            self.sign_platform = m.get('sign_platform')
        if m.get('sign_validity') is not None:
            self.sign_validity = m.get('sign_validity')
        return self


class CreateContractOnestepflowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: int = None,
        flow_id: str = None,
        message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务码，0表示成功
        # 
        self.code = code
        # 流程ID
        # 
        self.flow_id = flow_id
        # 业务码信息
        # 
        self.message = message

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
        if self.code is not None:
            result['code'] = self.code
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class QueryContractFlowsignerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        flow_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 流程id
        # 
        self.flow_id = flow_id

    def validate(self):
        self.validate_required(self.flow_id, 'flow_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        return self


class QueryContractFlowsignerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: int = None,
        message: str = None,
        signers: List[ContractFlowSigner] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务码，0表示成功
        # 
        self.code = code
        # 业务码信息
        # 
        self.message = message
        # 签署人信息
        self.signers = signers

    def validate(self):
        if self.signers:
            for k in self.signers:
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
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        result['signers'] = []
        if self.signers is not None:
            for k in self.signers:
                result['signers'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        self.signers = []
        if m.get('signers') is not None:
            for k in m.get('signers'):
                temp_model = ContractFlowSigner()
                self.signers.append(temp_model.from_map(k))
        return self


class QueryContractSignfieldsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        account_id: str = None,
        flow_id: str = None,
        signfield_ids: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 账号id，默认所有签署人
        self.account_id = account_id
        # 流程id
        self.flow_id = flow_id
        # 指定签署区id列表，逗号分割，默认所有签署区
        self.signfield_ids = signfield_ids

    def validate(self):
        self.validate_required(self.flow_id, 'flow_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.signfield_ids is not None:
            result['signfield_ids'] = self.signfield_ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('signfield_ids') is not None:
            self.signfield_ids = m.get('signfield_ids')
        return self


class QueryContractSignfieldsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: int = None,
        message: str = None,
        signfields: List[ContractSignFieldDetail] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务码，0表示成功
        self.code = code
        # 业务码信息
        self.message = message
        # 签署区列表数据
        self.signfields = signfields

    def validate(self):
        if self.signfields:
            for k in self.signfields:
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
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        result['signfields'] = []
        if self.signfields is not None:
            for k in self.signfields:
                result['signfields'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        self.signfields = []
        if m.get('signfields') is not None:
            for k in m.get('signfields'):
                temp_model = ContractSignFieldDetail()
                self.signfields.append(temp_model.from_map(k))
        return self


class DeleteContractSignerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        account_id: str = None,
        flow_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 签署人ID
        self.account_id = account_id
        # 流程id
        self.flow_id = flow_id

    def validate(self):
        self.validate_required(self.account_id, 'account_id')
        self.validate_required(self.flow_id, 'flow_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        return self


class DeleteContractSignerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: int = None,
        message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务码，0表示成功
        self.code = code
        # 业务码信息
        self.message = message

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
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class SyncEcpCloudRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_code: str = None,
        param_map_json: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api_code
        self.api_code = api_code
        # param_map_json
        self.param_map_json = param_map_json

    def validate(self):
        self.validate_required(self.api_code, 'api_code')
        self.validate_required(self.param_map_json, 'param_map_json')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_code is not None:
            result['api_code'] = self.api_code
        if self.param_map_json is not None:
            result['param_map_json'] = self.param_map_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('api_code') is not None:
            self.api_code = m.get('api_code')
        if m.get('param_map_json') is not None:
            self.param_map_json = m.get('param_map_json')
        return self


class SyncEcpCloudResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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


class CreateOauthUrlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        callback_url: str = None,
        login_channel: str = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 回调地址
        self.callback_url = callback_url
        # 登录渠道(web,h5)
        self.login_channel = login_channel
        # 客户端口令
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.callback_url, 'callback_url')
        self.validate_required(self.login_channel, 'login_channel')
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.callback_url is not None:
            result['callback_url'] = self.callback_url
        if self.login_channel is not None:
            result['login_channel'] = self.login_channel
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('callback_url') is not None:
            self.callback_url = m.get('callback_url')
        if m.get('login_channel') is not None:
            self.login_channel = m.get('login_channel')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class CreateOauthUrlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        oauth_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 验权url
        self.oauth_url = oauth_url

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
        if self.oauth_url is not None:
            result['oauth_url'] = self.oauth_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('oauth_url') is not None:
            self.oauth_url = m.get('oauth_url')
        return self


class GetOauthTokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        grant_type: str = None,
        auth_code: str = None,
        client_token: str = None,
        expires: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权类型
        self.grant_type = grant_type
        # 授权码
        self.auth_code = auth_code
        # client端申请oauth时的口令
        self.client_token = client_token
        # 过期时间
        self.expires = expires

    def validate(self):
        self.validate_required(self.grant_type, 'grant_type')
        self.validate_required(self.auth_code, 'auth_code')
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.grant_type is not None:
            result['grant_type'] = self.grant_type
        if self.auth_code is not None:
            result['auth_code'] = self.auth_code
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.expires is not None:
            result['expires'] = self.expires
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('grant_type') is not None:
            self.grant_type = m.get('grant_type')
        if m.get('auth_code') is not None:
            self.auth_code = m.get('auth_code')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('expires') is not None:
            self.expires = m.get('expires')
        return self


class GetOauthTokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: TokenData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回数据
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
            temp_model = TokenData()
            self.data = temp_model.from_map(m['data'])
        return self


class GetOauthTokendetailRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        access_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权token
        self.access_token = access_token

    def validate(self):
        self.validate_required(self.access_token, 'access_token')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.access_token is not None:
            result['access_token'] = self.access_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        return self


class GetOauthTokendetailResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        access_token: str = None,
        data_grant: UserData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权token
        self.access_token = access_token
        # 授权可查看的用户的信息
        self.data_grant = data_grant

    def validate(self):
        if self.data_grant:
            self.data_grant.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.access_token is not None:
            result['access_token'] = self.access_token
        if self.data_grant is not None:
            result['data_grant'] = self.data_grant.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        if m.get('data_grant') is not None:
            temp_model = UserData()
            self.data_grant = temp_model.from_map(m['data_grant'])
        return self


class CheckSessionAliveRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        session_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # sessionID
        self.session_id = session_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.session_id, 'session_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.session_id is not None:
            result['session_id'] = self.session_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        return self


class CheckSessionAliveResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        user_id: int = None,
        login_time: str = None,
        user_data: UserData = None,
        did: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户id
        self.user_id = user_id
        # 登录时间
        self.login_time = login_time
        # 添加用户类型
        self.user_data = user_data
        # did
        self.did = did

    def validate(self):
        if self.user_data:
            self.user_data.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.login_time is not None:
            result['login_time'] = self.login_time
        if self.user_data is not None:
            result['user_data'] = self.user_data.to_map()
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
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('login_time') is not None:
            self.login_time = m.get('login_time')
        if m.get('user_data') is not None:
            temp_model = UserData()
            self.user_data = temp_model.from_map(m['user_data'])
        if m.get('did') is not None:
            self.did = m.get('did')
        return self


class NotifyPartnerAsyncRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        partner_id: str = None,
        product_code: str = None,
        notify_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # ZHONGYI
        self.partner_id = partner_id
        # 产品code
        self.product_code = product_code
        # 通知内容
        # 
        self.notify_content = notify_content

    def validate(self):
        self.validate_required(self.partner_id, 'partner_id')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.notify_content, 'notify_content')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.partner_id is not None:
            result['partner_id'] = self.partner_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.notify_content is not None:
            result['notify_content'] = self.notify_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('partner_id') is not None:
            self.partner_id = m.get('partner_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('notify_content') is not None:
            self.notify_content = m.get('notify_content')
        return self


class NotifyPartnerAsyncResponse(TeaModel):
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


class CreateProjectBaseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: int = None,
        project_code: str = None,
        project_name: str = None,
        project_create_time: str = None,
        party_abidder_code: str = None,
        party_bbidder_code: str = None,
        region_code: str = None,
        project_type: str = None,
        start_time: str = None,
        end_time: str = None,
        project_price: str = None,
        fund_source: str = None,
        indus_category: str = None,
        project_address: str = None,
        disputeresolution_type: str = None,
        contribution_ratio: str = None,
        fund_impl: str = None,
        project_scale: str = None,
        bid_bond: str = None,
        contactor: str = None,
        contact_information: str = None,
        is_gcontruction: str = None,
        guarantee_type: str = None,
        conter_guar_agree_no: str = None,
        created_did: str = None,
        data_timestamp: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 唯一业务id
        self.project_id = project_id
        # 项目编号
        self.project_code = project_code
        # 项目名称
        self.project_name = project_name
        # 项目建立时间
        self.project_create_time = project_create_time
        # 建设单位统一社会信用代码
        self.party_abidder_code = party_abidder_code
        # 施工单位统一社会信用代码
        self.party_bbidder_code = party_bbidder_code
        # 项目所在行政区域代码
        self.region_code = region_code
        # 项目类型
        self.project_type = project_type
        # 拟开工时间
        self.start_time = start_time
        # 拟建成时间
        self.end_time = end_time
        # 工程造价（单位：元，精确小数点后6位）
        self.project_price = project_price
        # 资金来源
        self.fund_source = fund_source
        # 行业分类
        self.indus_category = indus_category
        # 项目地址
        self.project_address = project_address
        # 争议解决方式
        self.disputeresolution_type = disputeresolution_type
        # 资金落实比例
        self.contribution_ratio = contribution_ratio
        # 资金落实情况
        self.fund_impl = fund_impl
        # 项目规模
        self.project_scale = project_scale
        # 总投资额(单位：元，小数点后六位)
        self.bid_bond = bid_bond
        # 建设单位的项目联系人
        self.contactor = contactor
        # 建设单位的项目联系人联系方式
        self.contact_information = contact_information
        # 是否国有投资
        self.is_gcontruction = is_gcontruction
        # 担保方式
        self.guarantee_type = guarantee_type
        # 反担保协议编号
        self.conter_guar_agree_no = conter_guar_agree_no
        # 创建人did
        self.created_did = created_did
        # 数据时间戳
        self.data_timestamp = data_timestamp

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.project_code, 'project_code')
        self.validate_required(self.project_name, 'project_name')
        self.validate_required(self.project_create_time, 'project_create_time')
        if self.project_create_time is not None:
            self.validate_pattern(self.project_create_time, 'project_create_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.party_abidder_code, 'party_abidder_code')
        self.validate_required(self.party_bbidder_code, 'party_bbidder_code')
        self.validate_required(self.region_code, 'region_code')
        self.validate_required(self.project_type, 'project_type')
        self.validate_required(self.start_time, 'start_time')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.end_time, 'end_time')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.project_price, 'project_price')
        self.validate_required(self.fund_source, 'fund_source')
        self.validate_required(self.indus_category, 'indus_category')
        self.validate_required(self.project_address, 'project_address')
        self.validate_required(self.data_timestamp, 'data_timestamp')
        if self.data_timestamp is not None:
            self.validate_pattern(self.data_timestamp, 'data_timestamp', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.project_code is not None:
            result['project_code'] = self.project_code
        if self.project_name is not None:
            result['project_name'] = self.project_name
        if self.project_create_time is not None:
            result['project_create_time'] = self.project_create_time
        if self.party_abidder_code is not None:
            result['party_a_bidder_code'] = self.party_abidder_code
        if self.party_bbidder_code is not None:
            result['party_b_bidder_code'] = self.party_bbidder_code
        if self.region_code is not None:
            result['region_code'] = self.region_code
        if self.project_type is not None:
            result['project_type'] = self.project_type
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.project_price is not None:
            result['project_price'] = self.project_price
        if self.fund_source is not None:
            result['fund_source'] = self.fund_source
        if self.indus_category is not None:
            result['indus_category'] = self.indus_category
        if self.project_address is not None:
            result['project_address'] = self.project_address
        if self.disputeresolution_type is not None:
            result['disputeresolution_type'] = self.disputeresolution_type
        if self.contribution_ratio is not None:
            result['contribution_ratio'] = self.contribution_ratio
        if self.fund_impl is not None:
            result['fund_impl'] = self.fund_impl
        if self.project_scale is not None:
            result['project_scale'] = self.project_scale
        if self.bid_bond is not None:
            result['bid_bond'] = self.bid_bond
        if self.contactor is not None:
            result['contactor'] = self.contactor
        if self.contact_information is not None:
            result['contact_information'] = self.contact_information
        if self.is_gcontruction is not None:
            result['is_g_contruction'] = self.is_gcontruction
        if self.guarantee_type is not None:
            result['guarantee_type'] = self.guarantee_type
        if self.conter_guar_agree_no is not None:
            result['conter_guar_agree_no'] = self.conter_guar_agree_no
        if self.created_did is not None:
            result['created_did'] = self.created_did
        if self.data_timestamp is not None:
            result['data_timestamp'] = self.data_timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('project_code') is not None:
            self.project_code = m.get('project_code')
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        if m.get('project_create_time') is not None:
            self.project_create_time = m.get('project_create_time')
        if m.get('party_a_bidder_code') is not None:
            self.party_abidder_code = m.get('party_a_bidder_code')
        if m.get('party_b_bidder_code') is not None:
            self.party_bbidder_code = m.get('party_b_bidder_code')
        if m.get('region_code') is not None:
            self.region_code = m.get('region_code')
        if m.get('project_type') is not None:
            self.project_type = m.get('project_type')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('project_price') is not None:
            self.project_price = m.get('project_price')
        if m.get('fund_source') is not None:
            self.fund_source = m.get('fund_source')
        if m.get('indus_category') is not None:
            self.indus_category = m.get('indus_category')
        if m.get('project_address') is not None:
            self.project_address = m.get('project_address')
        if m.get('disputeresolution_type') is not None:
            self.disputeresolution_type = m.get('disputeresolution_type')
        if m.get('contribution_ratio') is not None:
            self.contribution_ratio = m.get('contribution_ratio')
        if m.get('fund_impl') is not None:
            self.fund_impl = m.get('fund_impl')
        if m.get('project_scale') is not None:
            self.project_scale = m.get('project_scale')
        if m.get('bid_bond') is not None:
            self.bid_bond = m.get('bid_bond')
        if m.get('contactor') is not None:
            self.contactor = m.get('contactor')
        if m.get('contact_information') is not None:
            self.contact_information = m.get('contact_information')
        if m.get('is_g_contruction') is not None:
            self.is_gcontruction = m.get('is_g_contruction')
        if m.get('guarantee_type') is not None:
            self.guarantee_type = m.get('guarantee_type')
        if m.get('conter_guar_agree_no') is not None:
            self.conter_guar_agree_no = m.get('conter_guar_agree_no')
        if m.get('created_did') is not None:
            self.created_did = m.get('created_did')
        if m.get('data_timestamp') is not None:
            self.data_timestamp = m.get('data_timestamp')
        return self


class CreateProjectBaseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 信息上链的哈希
        self.tx_hash = tx_hash

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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
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
        return self


class BatchcreateWorkersBaseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_code: str = None,
        worker_list: List[WorkersBaseInfo] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目编号
        self.project_code = project_code
        # 农民工基本信息
        self.worker_list = worker_list

    def validate(self):
        self.validate_required(self.project_code, 'project_code')
        self.validate_required(self.worker_list, 'worker_list')
        if self.worker_list:
            for k in self.worker_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_code is not None:
            result['project_code'] = self.project_code
        result['worker_list'] = []
        if self.worker_list is not None:
            for k in self.worker_list:
                result['worker_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_code') is not None:
            self.project_code = m.get('project_code')
        self.worker_list = []
        if m.get('worker_list') is not None:
            for k in m.get('worker_list'):
                temp_model = WorkersBaseInfo()
                self.worker_list.append(temp_model.from_map(k))
        return self


class BatchcreateWorkersBaseResponse(TeaModel):
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


class BatchcreateWorkersAttendanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_code: str = None,
        id_card: str = None,
        attendance_list: List[WorkersCheckAttendance] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目编号
        self.project_code = project_code
        # 身份证号
        self.id_card = id_card
        # 农民工考勤信息
        self.attendance_list = attendance_list

    def validate(self):
        self.validate_required(self.project_code, 'project_code')
        self.validate_required(self.id_card, 'id_card')
        self.validate_required(self.attendance_list, 'attendance_list')
        if self.attendance_list:
            for k in self.attendance_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_code is not None:
            result['project_code'] = self.project_code
        if self.id_card is not None:
            result['id_card'] = self.id_card
        result['attendance_list'] = []
        if self.attendance_list is not None:
            for k in self.attendance_list:
                result['attendance_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_code') is not None:
            self.project_code = m.get('project_code')
        if m.get('id_card') is not None:
            self.id_card = m.get('id_card')
        self.attendance_list = []
        if m.get('attendance_list') is not None:
            for k in m.get('attendance_list'):
                temp_model = WorkersCheckAttendance()
                self.attendance_list.append(temp_model.from_map(k))
        return self


class BatchcreateWorkersAttendanceResponse(TeaModel):
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


class BatchcreateWorkersWageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_code: str = None,
        id_card: str = None,
        wage_list: List[WorkersWagePayment] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目编号
        self.project_code = project_code
        # 身份证号
        self.id_card = id_card
        # 农民工工资发放信息
        self.wage_list = wage_list

    def validate(self):
        self.validate_required(self.project_code, 'project_code')
        self.validate_required(self.id_card, 'id_card')
        self.validate_required(self.wage_list, 'wage_list')
        if self.wage_list:
            for k in self.wage_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_code is not None:
            result['project_code'] = self.project_code
        if self.id_card is not None:
            result['id_card'] = self.id_card
        result['wage_list'] = []
        if self.wage_list is not None:
            for k in self.wage_list:
                result['wage_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_code') is not None:
            self.project_code = m.get('project_code')
        if m.get('id_card') is not None:
            self.id_card = m.get('id_card')
        self.wage_list = []
        if m.get('wage_list') is not None:
            for k in m.get('wage_list'):
                temp_model = WorkersWagePayment()
                self.wage_list.append(temp_model.from_map(k))
        return self


class BatchcreateWorkersWageResponse(TeaModel):
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


class CreateProjectFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_code: str = None,
        file_id: str = None,
        file_biz_id: str = None,
        file_code: str = None,
        file_name: str = None,
        file_type: str = None,
        extra_data: str = None,
        data_timestamp: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目编号
        self.project_code = project_code
        # 文件id
        self.file_id = file_id
        # 文件业务id
        self.file_biz_id = file_biz_id
        # 文件编号
        self.file_code = file_code
        # 文件名称
        self.file_name = file_name
        # 文件类型
        self.file_type = file_type
        # 扩展字段
        self.extra_data = extra_data
        # 数据时间戳
        self.data_timestamp = data_timestamp

    def validate(self):
        self.validate_required(self.project_code, 'project_code')
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.data_timestamp, 'data_timestamp')
        if self.data_timestamp is not None:
            self.validate_pattern(self.data_timestamp, 'data_timestamp', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_code is not None:
            result['project_code'] = self.project_code
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.file_biz_id is not None:
            result['file_biz_id'] = self.file_biz_id
        if self.file_code is not None:
            result['file_code'] = self.file_code
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.extra_data is not None:
            result['extra_data'] = self.extra_data
        if self.data_timestamp is not None:
            result['data_timestamp'] = self.data_timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_code') is not None:
            self.project_code = m.get('project_code')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('file_biz_id') is not None:
            self.file_biz_id = m.get('file_biz_id')
        if m.get('file_code') is not None:
            self.file_code = m.get('file_code')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('extra_data') is not None:
            self.extra_data = m.get('extra_data')
        if m.get('data_timestamp') is not None:
            self.data_timestamp = m.get('data_timestamp')
        return self


class CreateProjectFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 信息上链的哈希
        # 
        self.tx_hash = tx_hash

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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
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
        return self


class CreateContractBaseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_code: str = None,
        contract_info_id: int = None,
        contract_info_code: str = None,
        contract_name: str = None,
        contract_version: int = None,
        change_reason: str = None,
        contract_type: str = None,
        party_abidder_code: str = None,
        party_aname: str = None,
        party_aaudit_did: str = None,
        party_bfirm_dto_list: List[PartyBFirmDto] = None,
        contract_money: str = None,
        price_currency: str = None,
        price_unit: str = None,
        start_date: str = None,
        end_date: str = None,
        contract_sign_time: str = None,
        created_did: str = None,
        contract_file: str = None,
        evidence: str = None,
        tx_hash: str = None,
        data_timestamp: str = None,
        security_fund_dto_list: List[SecurityFundDto] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目编号
        self.project_code = project_code
        # 合同信息id
        self.contract_info_id = contract_info_id
        # 合同编号
        self.contract_info_code = contract_info_code
        # 合同名称
        self.contract_name = contract_name
        # 合同版本,从1起
        self.contract_version = contract_version
        # 变更原因（第一版不传值）
        self.change_reason = change_reason
        # 合同类型
        self.contract_type = contract_type
        # 甲方统一社会信用代码
        self.party_abidder_code = party_abidder_code
        # 甲方名称
        self.party_aname = party_aname
        # 甲方授权代表Did
        self.party_aaudit_did = party_aaudit_did
        # 乙方集合
        self.party_bfirm_dto_list = party_bfirm_dto_list
        # 合同金额
        self.contract_money = contract_money
        # 金额币种代码
        self.price_currency = price_currency
        # 金额单位
        self.price_unit = price_unit
        # 拟开工时间
        self.start_date = start_date
        # 拟建成时间
        self.end_date = end_date
        # 合同签署时间
        self.contract_sign_time = contract_sign_time
        # 创建人Did
        self.created_did = created_did
        # 合同文件
        self.contract_file = contract_file
        # 文件存证
        self.evidence = evidence
        # 存证txHash
        self.tx_hash = tx_hash
        # 数据时间戳
        self.data_timestamp = data_timestamp
        # 保证金对象集合
        self.security_fund_dto_list = security_fund_dto_list

    def validate(self):
        self.validate_required(self.project_code, 'project_code')
        self.validate_required(self.contract_info_id, 'contract_info_id')
        self.validate_required(self.contract_info_code, 'contract_info_code')
        self.validate_required(self.contract_name, 'contract_name')
        self.validate_required(self.contract_version, 'contract_version')
        self.validate_required(self.contract_type, 'contract_type')
        self.validate_required(self.party_abidder_code, 'party_abidder_code')
        self.validate_required(self.party_aname, 'party_aname')
        self.validate_required(self.party_aaudit_did, 'party_aaudit_did')
        self.validate_required(self.party_bfirm_dto_list, 'party_bfirm_dto_list')
        if self.party_bfirm_dto_list:
            for k in self.party_bfirm_dto_list:
                if k:
                    k.validate()
        self.validate_required(self.contract_money, 'contract_money')
        self.validate_required(self.price_currency, 'price_currency')
        self.validate_required(self.price_unit, 'price_unit')
        self.validate_required(self.start_date, 'start_date')
        if self.start_date is not None:
            self.validate_pattern(self.start_date, 'start_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.end_date, 'end_date')
        if self.end_date is not None:
            self.validate_pattern(self.end_date, 'end_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.contract_sign_time, 'contract_sign_time')
        if self.contract_sign_time is not None:
            self.validate_pattern(self.contract_sign_time, 'contract_sign_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.created_did, 'created_did')
        self.validate_required(self.contract_file, 'contract_file')
        self.validate_required(self.evidence, 'evidence')
        self.validate_required(self.data_timestamp, 'data_timestamp')
        if self.data_timestamp is not None:
            self.validate_pattern(self.data_timestamp, 'data_timestamp', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.security_fund_dto_list:
            for k in self.security_fund_dto_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_code is not None:
            result['project_code'] = self.project_code
        if self.contract_info_id is not None:
            result['contract_info_id'] = self.contract_info_id
        if self.contract_info_code is not None:
            result['contract_info_code'] = self.contract_info_code
        if self.contract_name is not None:
            result['contract_name'] = self.contract_name
        if self.contract_version is not None:
            result['contract_version'] = self.contract_version
        if self.change_reason is not None:
            result['change_reason'] = self.change_reason
        if self.contract_type is not None:
            result['contract_type'] = self.contract_type
        if self.party_abidder_code is not None:
            result['party_a_bidder_code'] = self.party_abidder_code
        if self.party_aname is not None:
            result['party_a_name'] = self.party_aname
        if self.party_aaudit_did is not None:
            result['party_a_audit_did'] = self.party_aaudit_did
        result['party_b_firm_dto_list'] = []
        if self.party_bfirm_dto_list is not None:
            for k in self.party_bfirm_dto_list:
                result['party_b_firm_dto_list'].append(k.to_map() if k else None)
        if self.contract_money is not None:
            result['contract_money'] = self.contract_money
        if self.price_currency is not None:
            result['price_currency'] = self.price_currency
        if self.price_unit is not None:
            result['price_unit'] = self.price_unit
        if self.start_date is not None:
            result['start_date'] = self.start_date
        if self.end_date is not None:
            result['end_date'] = self.end_date
        if self.contract_sign_time is not None:
            result['contract_sign_time'] = self.contract_sign_time
        if self.created_did is not None:
            result['created_did'] = self.created_did
        if self.contract_file is not None:
            result['contract_file'] = self.contract_file
        if self.evidence is not None:
            result['evidence'] = self.evidence
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.data_timestamp is not None:
            result['data_timestamp'] = self.data_timestamp
        result['security_fund_dto_list'] = []
        if self.security_fund_dto_list is not None:
            for k in self.security_fund_dto_list:
                result['security_fund_dto_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_code') is not None:
            self.project_code = m.get('project_code')
        if m.get('contract_info_id') is not None:
            self.contract_info_id = m.get('contract_info_id')
        if m.get('contract_info_code') is not None:
            self.contract_info_code = m.get('contract_info_code')
        if m.get('contract_name') is not None:
            self.contract_name = m.get('contract_name')
        if m.get('contract_version') is not None:
            self.contract_version = m.get('contract_version')
        if m.get('change_reason') is not None:
            self.change_reason = m.get('change_reason')
        if m.get('contract_type') is not None:
            self.contract_type = m.get('contract_type')
        if m.get('party_a_bidder_code') is not None:
            self.party_abidder_code = m.get('party_a_bidder_code')
        if m.get('party_a_name') is not None:
            self.party_aname = m.get('party_a_name')
        if m.get('party_a_audit_did') is not None:
            self.party_aaudit_did = m.get('party_a_audit_did')
        self.party_bfirm_dto_list = []
        if m.get('party_b_firm_dto_list') is not None:
            for k in m.get('party_b_firm_dto_list'):
                temp_model = PartyBFirmDto()
                self.party_bfirm_dto_list.append(temp_model.from_map(k))
        if m.get('contract_money') is not None:
            self.contract_money = m.get('contract_money')
        if m.get('price_currency') is not None:
            self.price_currency = m.get('price_currency')
        if m.get('price_unit') is not None:
            self.price_unit = m.get('price_unit')
        if m.get('start_date') is not None:
            self.start_date = m.get('start_date')
        if m.get('end_date') is not None:
            self.end_date = m.get('end_date')
        if m.get('contract_sign_time') is not None:
            self.contract_sign_time = m.get('contract_sign_time')
        if m.get('created_did') is not None:
            self.created_did = m.get('created_did')
        if m.get('contract_file') is not None:
            self.contract_file = m.get('contract_file')
        if m.get('evidence') is not None:
            self.evidence = m.get('evidence')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('data_timestamp') is not None:
            self.data_timestamp = m.get('data_timestamp')
        self.security_fund_dto_list = []
        if m.get('security_fund_dto_list') is not None:
            for k in m.get('security_fund_dto_list'):
                temp_model = SecurityFundDto()
                self.security_fund_dto_list.append(temp_model.from_map(k))
        return self


class CreateContractBaseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 信息上链的哈希
        self.tx_hash = tx_hash

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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
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
        return self


class CreateContractImplRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        contract_info_code: str = None,
        contract_impl_id: int = None,
        party_abidder_code: str = None,
        party_aaudit_did: str = None,
        party_aname: str = None,
        party_bbidder_code: str = None,
        party_baudit_did: str = None,
        party_bname: str = None,
        pay_money: str = None,
        price_currency: str = None,
        price_unit: str = None,
        remarks: str = None,
        payment_type: str = None,
        pay_time: str = None,
        created_did: str = None,
        file: str = None,
        data_timestamp: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合同编号,(确定是哪个合同的收付款，需要唯一标识id)
        self.contract_info_code = contract_info_code
        # 收付款id
        self.contract_impl_id = contract_impl_id
        # 付款方统一社会信用代码
        self.party_abidder_code = party_abidder_code
        # 付款方审核人Did
        self.party_aaudit_did = party_aaudit_did
        # 付款方名称
        self.party_aname = party_aname
        # 收款方统一社会信用代码
        self.party_bbidder_code = party_bbidder_code
        # 收款方审核人Did
        self.party_baudit_did = party_baudit_did
        # 收款方名称
        self.party_bname = party_bname
        # 拨付金额
        self.pay_money = pay_money
        # 金额币种代码
        self.price_currency = price_currency
        # 金额单位
        self.price_unit = price_unit
        # 支付说明
        self.remarks = remarks
        # 款项类型
        self.payment_type = payment_type
        # 拨付时间
        self.pay_time = pay_time
        # 创建人Did
        self.created_did = created_did
        # 付款凭证文件(文件Id)
        self.file = file
        # 数据时间戳
        self.data_timestamp = data_timestamp

    def validate(self):
        self.validate_required(self.contract_info_code, 'contract_info_code')
        self.validate_required(self.contract_impl_id, 'contract_impl_id')
        self.validate_required(self.party_abidder_code, 'party_abidder_code')
        self.validate_required(self.party_aaudit_did, 'party_aaudit_did')
        self.validate_required(self.party_aname, 'party_aname')
        self.validate_required(self.party_bbidder_code, 'party_bbidder_code')
        self.validate_required(self.party_bname, 'party_bname')
        self.validate_required(self.pay_money, 'pay_money')
        self.validate_required(self.price_currency, 'price_currency')
        self.validate_required(self.price_unit, 'price_unit')
        self.validate_required(self.remarks, 'remarks')
        self.validate_required(self.payment_type, 'payment_type')
        self.validate_required(self.pay_time, 'pay_time')
        if self.pay_time is not None:
            self.validate_pattern(self.pay_time, 'pay_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.created_did, 'created_did')
        self.validate_required(self.file, 'file')
        self.validate_required(self.data_timestamp, 'data_timestamp')
        if self.data_timestamp is not None:
            self.validate_pattern(self.data_timestamp, 'data_timestamp', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.contract_info_code is not None:
            result['contract_info_code'] = self.contract_info_code
        if self.contract_impl_id is not None:
            result['contract_impl_id'] = self.contract_impl_id
        if self.party_abidder_code is not None:
            result['party_a_bidder_code'] = self.party_abidder_code
        if self.party_aaudit_did is not None:
            result['party_a_audit_did'] = self.party_aaudit_did
        if self.party_aname is not None:
            result['party_a_name'] = self.party_aname
        if self.party_bbidder_code is not None:
            result['party_b_bidder_code'] = self.party_bbidder_code
        if self.party_baudit_did is not None:
            result['party_b_audit_did'] = self.party_baudit_did
        if self.party_bname is not None:
            result['party_b_name'] = self.party_bname
        if self.pay_money is not None:
            result['pay_money'] = self.pay_money
        if self.price_currency is not None:
            result['price_currency'] = self.price_currency
        if self.price_unit is not None:
            result['price_unit'] = self.price_unit
        if self.remarks is not None:
            result['remarks'] = self.remarks
        if self.payment_type is not None:
            result['payment_type'] = self.payment_type
        if self.pay_time is not None:
            result['pay_time'] = self.pay_time
        if self.created_did is not None:
            result['created_did'] = self.created_did
        if self.file is not None:
            result['file'] = self.file
        if self.data_timestamp is not None:
            result['data_timestamp'] = self.data_timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('contract_info_code') is not None:
            self.contract_info_code = m.get('contract_info_code')
        if m.get('contract_impl_id') is not None:
            self.contract_impl_id = m.get('contract_impl_id')
        if m.get('party_a_bidder_code') is not None:
            self.party_abidder_code = m.get('party_a_bidder_code')
        if m.get('party_a_audit_did') is not None:
            self.party_aaudit_did = m.get('party_a_audit_did')
        if m.get('party_a_name') is not None:
            self.party_aname = m.get('party_a_name')
        if m.get('party_b_bidder_code') is not None:
            self.party_bbidder_code = m.get('party_b_bidder_code')
        if m.get('party_b_audit_did') is not None:
            self.party_baudit_did = m.get('party_b_audit_did')
        if m.get('party_b_name') is not None:
            self.party_bname = m.get('party_b_name')
        if m.get('pay_money') is not None:
            self.pay_money = m.get('pay_money')
        if m.get('price_currency') is not None:
            self.price_currency = m.get('price_currency')
        if m.get('price_unit') is not None:
            self.price_unit = m.get('price_unit')
        if m.get('remarks') is not None:
            self.remarks = m.get('remarks')
        if m.get('payment_type') is not None:
            self.payment_type = m.get('payment_type')
        if m.get('pay_time') is not None:
            self.pay_time = m.get('pay_time')
        if m.get('created_did') is not None:
            self.created_did = m.get('created_did')
        if m.get('file') is not None:
            self.file = m.get('file')
        if m.get('data_timestamp') is not None:
            self.data_timestamp = m.get('data_timestamp')
        return self


class CreateContractImplResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 信息上链的哈希
        self.tx_hash = tx_hash

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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
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
        return self


class CreateUserCertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: int = None,
        name: str = None,
        cert_type: str = None,
        cert_num: str = None,
        cert_file_front: int = None,
        cert_file_front_type: str = None,
        cert_file_reverse: int = None,
        cert_file_reverse_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 云蚂账户id
        self.user_id = user_id
        # 姓名
        self.name = name
        # 个人证件类型
        self.cert_type = cert_type
        # 证件号码
        self.cert_num = cert_num
        # 个人证件正面图片文件id，应用侧fileId
        self.cert_file_front = cert_file_front
        # 个人证件正面类型。JPG
        self.cert_file_front_type = cert_file_front_type
        # 个人证件反面图片文件id，应用侧fileId
        self.cert_file_reverse = cert_file_reverse
        # 个人证件反面类型。JPG
        self.cert_file_reverse_type = cert_file_reverse_type

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.cert_type, 'cert_type')
        self.validate_required(self.cert_num, 'cert_num')
        self.validate_required(self.cert_file_front, 'cert_file_front')
        self.validate_required(self.cert_file_front_type, 'cert_file_front_type')
        self.validate_required(self.cert_file_reverse, 'cert_file_reverse')
        self.validate_required(self.cert_file_reverse_type, 'cert_file_reverse_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.name is not None:
            result['name'] = self.name
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.cert_num is not None:
            result['cert_num'] = self.cert_num
        if self.cert_file_front is not None:
            result['cert_file_front'] = self.cert_file_front
        if self.cert_file_front_type is not None:
            result['cert_file_front_type'] = self.cert_file_front_type
        if self.cert_file_reverse is not None:
            result['cert_file_reverse'] = self.cert_file_reverse
        if self.cert_file_reverse_type is not None:
            result['cert_file_reverse_type'] = self.cert_file_reverse_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('cert_num') is not None:
            self.cert_num = m.get('cert_num')
        if m.get('cert_file_front') is not None:
            self.cert_file_front = m.get('cert_file_front')
        if m.get('cert_file_front_type') is not None:
            self.cert_file_front_type = m.get('cert_file_front_type')
        if m.get('cert_file_reverse') is not None:
            self.cert_file_reverse = m.get('cert_file_reverse')
        if m.get('cert_file_reverse_type') is not None:
            self.cert_file_reverse_type = m.get('cert_file_reverse_type')
        return self


class CreateUserCertResponse(TeaModel):
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


class UpdateUserInfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: int = None,
        operation_type: str = None,
        email: str = None,
        telphone: str = None,
        user_cert_status: str = None,
        user_did: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 云蚂侧用户id
        # 
        self.user_id = user_id
        # 信息同步类型
        # 
        self.operation_type = operation_type
        # 用户邮箱
        # 
        self.email = email
        # 用户手机号码
        # 
        self.telphone = telphone
        # 个人认证状态
        # 
        self.user_cert_status = user_cert_status
        # 个人认证did
        # 
        self.user_did = user_did

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.operation_type, 'operation_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.operation_type is not None:
            result['operation_type'] = self.operation_type
        if self.email is not None:
            result['email'] = self.email
        if self.telphone is not None:
            result['telphone'] = self.telphone
        if self.user_cert_status is not None:
            result['user_cert_status'] = self.user_cert_status
        if self.user_did is not None:
            result['user_did'] = self.user_did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('operation_type') is not None:
            self.operation_type = m.get('operation_type')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('telphone') is not None:
            self.telphone = m.get('telphone')
        if m.get('user_cert_status') is not None:
            self.user_cert_status = m.get('user_cert_status')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        return self


class UpdateUserInfoResponse(TeaModel):
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


class CreateUserRegisterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        login_id: str = None,
        email: str = None,
        telphone: str = None,
        user_id: int = None,
        source: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 默认登录名称
        self.login_id = login_id
        # 用户邮箱
        self.email = email
        # 用户手机号码
        self.telphone = telphone
        # 云蚂侧用户id
        self.user_id = user_id
        # 来源 ： 1 APP注册，2 PC注册，3 后台添加
        self.source = source

    def validate(self):
        self.validate_required(self.login_id, 'login_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.source, 'source')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.login_id is not None:
            result['login_id'] = self.login_id
        if self.email is not None:
            result['email'] = self.email
        if self.telphone is not None:
            result['telphone'] = self.telphone
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.source is not None:
            result['source'] = self.source
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('login_id') is not None:
            self.login_id = m.get('login_id')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('telphone') is not None:
            self.telphone = m.get('telphone')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('source') is not None:
            self.source = m.get('source')
        return self


class CreateUserRegisterResponse(TeaModel):
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


class CreateFirmCertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        firm_id: int = None,
        firm_name: str = None,
        firm_type: str = None,
        industry_type: str = None,
        firm_address: str = None,
        cert_reg_no: str = None,
        cert_reg_file: int = None,
        cert_reg_file_type: str = None,
        lp_cert_type: str = None,
        lp_cert_no: str = None,
        lp_name: str = None,
        lp_cert_file_front: int = None,
        lp_cert_file_front_type: str = None,
        lp_cert_file_reverse: int = None,
        lp_cert_file_reverse_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 云蚂侧企业id
        self.firm_id = firm_id
        # 企业名称
        self.firm_name = firm_name
        # 企业类型
        self.firm_type = firm_type
        # 行业类型
        self.industry_type = industry_type
        # 企业地址省份
        self.firm_address = firm_address
        # 企业营业执照注册号
        self.cert_reg_no = cert_reg_no
        # 营业执照图片id，应用侧fileId
        self.cert_reg_file = cert_reg_file
        # 营业执照图片类型(JPEG,JPG)
        self.cert_reg_file_type = cert_reg_file_type
        # 法定代表人证件类型
        self.lp_cert_type = lp_cert_type
        # 法人证件号码
        self.lp_cert_no = lp_cert_no
        # 法人姓名
        self.lp_name = lp_name
        # 法人身份证正面图片id，应用侧FileId
        self.lp_cert_file_front = lp_cert_file_front
        # 法人身份证正面图片文件类型(JPEG,JPG)
        self.lp_cert_file_front_type = lp_cert_file_front_type
        # 法人身份证反面图片id，应用侧FileId
        self.lp_cert_file_reverse = lp_cert_file_reverse
        # 法人身份证反面图片id，应用侧FileId
        self.lp_cert_file_reverse_type = lp_cert_file_reverse_type

    def validate(self):
        self.validate_required(self.firm_id, 'firm_id')
        self.validate_required(self.firm_name, 'firm_name')
        self.validate_required(self.industry_type, 'industry_type')
        self.validate_required(self.firm_address, 'firm_address')
        self.validate_required(self.cert_reg_no, 'cert_reg_no')
        self.validate_required(self.cert_reg_file, 'cert_reg_file')
        self.validate_required(self.cert_reg_file_type, 'cert_reg_file_type')
        self.validate_required(self.lp_cert_type, 'lp_cert_type')
        self.validate_required(self.lp_cert_no, 'lp_cert_no')
        self.validate_required(self.lp_name, 'lp_name')
        self.validate_required(self.lp_cert_file_front, 'lp_cert_file_front')
        self.validate_required(self.lp_cert_file_front_type, 'lp_cert_file_front_type')
        self.validate_required(self.lp_cert_file_reverse, 'lp_cert_file_reverse')
        self.validate_required(self.lp_cert_file_reverse_type, 'lp_cert_file_reverse_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.firm_id is not None:
            result['firm_id'] = self.firm_id
        if self.firm_name is not None:
            result['firm_name'] = self.firm_name
        if self.firm_type is not None:
            result['firm_type'] = self.firm_type
        if self.industry_type is not None:
            result['industry_type'] = self.industry_type
        if self.firm_address is not None:
            result['firm_address'] = self.firm_address
        if self.cert_reg_no is not None:
            result['cert_reg_no'] = self.cert_reg_no
        if self.cert_reg_file is not None:
            result['cert_reg_file'] = self.cert_reg_file
        if self.cert_reg_file_type is not None:
            result['cert_reg_file_type'] = self.cert_reg_file_type
        if self.lp_cert_type is not None:
            result['lp_cert_type'] = self.lp_cert_type
        if self.lp_cert_no is not None:
            result['lp_cert_no'] = self.lp_cert_no
        if self.lp_name is not None:
            result['lp_name'] = self.lp_name
        if self.lp_cert_file_front is not None:
            result['lp_cert_file_front'] = self.lp_cert_file_front
        if self.lp_cert_file_front_type is not None:
            result['lp_cert_file_front_type'] = self.lp_cert_file_front_type
        if self.lp_cert_file_reverse is not None:
            result['lp_cert_file_reverse'] = self.lp_cert_file_reverse
        if self.lp_cert_file_reverse_type is not None:
            result['lp_cert_file_reverse_type'] = self.lp_cert_file_reverse_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('firm_id') is not None:
            self.firm_id = m.get('firm_id')
        if m.get('firm_name') is not None:
            self.firm_name = m.get('firm_name')
        if m.get('firm_type') is not None:
            self.firm_type = m.get('firm_type')
        if m.get('industry_type') is not None:
            self.industry_type = m.get('industry_type')
        if m.get('firm_address') is not None:
            self.firm_address = m.get('firm_address')
        if m.get('cert_reg_no') is not None:
            self.cert_reg_no = m.get('cert_reg_no')
        if m.get('cert_reg_file') is not None:
            self.cert_reg_file = m.get('cert_reg_file')
        if m.get('cert_reg_file_type') is not None:
            self.cert_reg_file_type = m.get('cert_reg_file_type')
        if m.get('lp_cert_type') is not None:
            self.lp_cert_type = m.get('lp_cert_type')
        if m.get('lp_cert_no') is not None:
            self.lp_cert_no = m.get('lp_cert_no')
        if m.get('lp_name') is not None:
            self.lp_name = m.get('lp_name')
        if m.get('lp_cert_file_front') is not None:
            self.lp_cert_file_front = m.get('lp_cert_file_front')
        if m.get('lp_cert_file_front_type') is not None:
            self.lp_cert_file_front_type = m.get('lp_cert_file_front_type')
        if m.get('lp_cert_file_reverse') is not None:
            self.lp_cert_file_reverse = m.get('lp_cert_file_reverse')
        if m.get('lp_cert_file_reverse_type') is not None:
            self.lp_cert_file_reverse_type = m.get('lp_cert_file_reverse_type')
        return self


class CreateFirmCertResponse(TeaModel):
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


class UpdateFirmInfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: int = None,
        operation_type: str = None,
        firm_id: int = None,
        firm_name: str = None,
        firm_cert_status: str = None,
        firm_did: str = None,
        refer_type: str = None,
        former_admin_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 云蚂侧用户id
        self.user_id = user_id
        # 信息同步类型
        self.operation_type = operation_type
        # 云蚂侧企业id
        self.firm_id = firm_id
        # 企业名称
        self.firm_name = firm_name
        # 企业认证状态
        self.firm_cert_status = firm_cert_status
        # 企业认证did
        self.firm_did = firm_did
        # 账户角色
        self.refer_type = refer_type
        # 云蚂侧原管理员账户id
        self.former_admin_id = former_admin_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.operation_type, 'operation_type')
        self.validate_required(self.firm_id, 'firm_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.operation_type is not None:
            result['operation_type'] = self.operation_type
        if self.firm_id is not None:
            result['firm_id'] = self.firm_id
        if self.firm_name is not None:
            result['firm_name'] = self.firm_name
        if self.firm_cert_status is not None:
            result['firm_cert_status'] = self.firm_cert_status
        if self.firm_did is not None:
            result['firm_did'] = self.firm_did
        if self.refer_type is not None:
            result['refer_type'] = self.refer_type
        if self.former_admin_id is not None:
            result['former_admin_id'] = self.former_admin_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('operation_type') is not None:
            self.operation_type = m.get('operation_type')
        if m.get('firm_id') is not None:
            self.firm_id = m.get('firm_id')
        if m.get('firm_name') is not None:
            self.firm_name = m.get('firm_name')
        if m.get('firm_cert_status') is not None:
            self.firm_cert_status = m.get('firm_cert_status')
        if m.get('firm_did') is not None:
            self.firm_did = m.get('firm_did')
        if m.get('refer_type') is not None:
            self.refer_type = m.get('refer_type')
        if m.get('former_admin_id') is not None:
            self.former_admin_id = m.get('former_admin_id')
        return self


class UpdateFirmInfoResponse(TeaModel):
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


class QueryChainTransactionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tx_hash: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据链上交易hash
        self.tx_hash = tx_hash

    def validate(self):
        self.validate_required(self.tx_hash, 'tx_hash')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class QueryChainTransactionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        block_number: int = None,
        timestamp: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据链上交易hash
        self.tx_hash = tx_hash
        # 数据块高
        self.block_number = block_number
        # 数据上链时间
        self.timestamp = timestamp

    def validate(self):
        if self.timestamp is not None:
            self.validate_pattern(self.timestamp, 'timestamp', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
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
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        return self


