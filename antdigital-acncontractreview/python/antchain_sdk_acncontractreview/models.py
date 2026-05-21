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


class ContractFile(TeaModel):
    def __init__(
        self,
        file_name: str = None,
        file_url: str = None,
        file_type: str = None,
    ):
        # 文件名称
        self.file_name = file_name
        # 文件下载地址
        self.file_url = file_url
        # 文件类型，如 docx、pdf
        self.file_type = file_type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_url is not None:
            result['file_url'] = self.file_url
        if self.file_type is not None:
            result['file_type'] = self.file_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        return self


class AuditRecordItem(TeaModel):
    def __init__(
        self,
        audit_id: str = None,
        status: str = None,
        contract_file_name: str = None,
        creator_work_no: str = None,
        creator_name: str = None,
        baseline_library_name: str = None,
        bu_id: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        original_file: ContractFile = None,
        final_file: ContractFile = None,
    ):
        # 审核id
        self.audit_id = audit_id
        # 状态
        self.status = status
        # 合同名称
        self.contract_file_name = contract_file_name
        # 创建人id
        self.creator_work_no = creator_work_no
        # 创建人名称
        self.creator_name = creator_name
        # 基准线库名称
        self.baseline_library_name = baseline_library_name
        # 基准线id
        self.bu_id = bu_id
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified
        # 原始文件
        self.original_file = original_file
        # 当前编辑文件（定稿文件）
        self.final_file = final_file

    def validate(self):
        self.validate_required(self.audit_id, 'audit_id')
        self.validate_required(self.status, 'status')
        self.validate_required(self.contract_file_name, 'contract_file_name')
        self.validate_required(self.creator_work_no, 'creator_work_no')
        self.validate_required(self.creator_name, 'creator_name')
        self.validate_required(self.baseline_library_name, 'baseline_library_name')
        self.validate_required(self.bu_id, 'bu_id')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.original_file:
            self.original_file.validate()
        if self.final_file:
            self.final_file.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.audit_id is not None:
            result['audit_id'] = self.audit_id
        if self.status is not None:
            result['status'] = self.status
        if self.contract_file_name is not None:
            result['contract_file_name'] = self.contract_file_name
        if self.creator_work_no is not None:
            result['creator_work_no'] = self.creator_work_no
        if self.creator_name is not None:
            result['creator_name'] = self.creator_name
        if self.baseline_library_name is not None:
            result['baseline_library_name'] = self.baseline_library_name
        if self.bu_id is not None:
            result['bu_id'] = self.bu_id
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.original_file is not None:
            result['original_file'] = self.original_file.to_map()
        if self.final_file is not None:
            result['final_file'] = self.final_file.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('audit_id') is not None:
            self.audit_id = m.get('audit_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('contract_file_name') is not None:
            self.contract_file_name = m.get('contract_file_name')
        if m.get('creator_work_no') is not None:
            self.creator_work_no = m.get('creator_work_no')
        if m.get('creator_name') is not None:
            self.creator_name = m.get('creator_name')
        if m.get('baseline_library_name') is not None:
            self.baseline_library_name = m.get('baseline_library_name')
        if m.get('bu_id') is not None:
            self.bu_id = m.get('bu_id')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('original_file') is not None:
            temp_model = ContractFile()
            self.original_file = temp_model.from_map(m['original_file'])
        if m.get('final_file') is not None:
            temp_model = ContractFile()
            self.final_file = temp_model.from_map(m['final_file'])
        return self


class QueryAntcloudContractaiAuditRecordRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        page_no: int = None,
        page_size: int = None,
        contract_file_name: str = None,
        create_start_time: str = None,
        create_end_time: str = None,
        status: str = None,
        creator_work_no: str = None,
        creator_name: str = None,
        baseline_library_name: str = None,
        end_customer_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 当前页
        self.page_no = page_no
        # 页大小
        self.page_size = page_size
        # 合同名称
        self.contract_file_name = contract_file_name
        # 开始时间
        self.create_start_time = create_start_time
        # 结束时间
        self.create_end_time = create_end_time
        # PROCESSING：合同审核任务已提交，正在异步处理中
        # SUCCESS：合同审核已完成，结果可查询
        # FAIL：合同审核过程中发生错误，审核失败
        # FINALIZED：合同已完成定稿操作，生成最终版本
        self.status = status
        # 创建人id
        self.creator_work_no = creator_work_no
        # 创建人名称
        self.creator_name = creator_name
        # 基准线库名称
        self.baseline_library_name = baseline_library_name
        # 终端客户id
        self.end_customer_id = end_customer_id

    def validate(self):
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')
        if self.create_start_time is not None:
            self.validate_pattern(self.create_start_time, 'create_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.create_end_time is not None:
            self.validate_pattern(self.create_end_time, 'create_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.contract_file_name is not None:
            result['contract_file_name'] = self.contract_file_name
        if self.create_start_time is not None:
            result['create_start_time'] = self.create_start_time
        if self.create_end_time is not None:
            result['create_end_time'] = self.create_end_time
        if self.status is not None:
            result['status'] = self.status
        if self.creator_work_no is not None:
            result['creator_work_no'] = self.creator_work_no
        if self.creator_name is not None:
            result['creator_name'] = self.creator_name
        if self.baseline_library_name is not None:
            result['baseline_library_name'] = self.baseline_library_name
        if self.end_customer_id is not None:
            result['end_customer_id'] = self.end_customer_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('contract_file_name') is not None:
            self.contract_file_name = m.get('contract_file_name')
        if m.get('create_start_time') is not None:
            self.create_start_time = m.get('create_start_time')
        if m.get('create_end_time') is not None:
            self.create_end_time = m.get('create_end_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('creator_work_no') is not None:
            self.creator_work_no = m.get('creator_work_no')
        if m.get('creator_name') is not None:
            self.creator_name = m.get('creator_name')
        if m.get('baseline_library_name') is not None:
            self.baseline_library_name = m.get('baseline_library_name')
        if m.get('end_customer_id') is not None:
            self.end_customer_id = m.get('end_customer_id')
        return self


class QueryAntcloudContractaiAuditRecordResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_no: int = None,
        page_size: int = None,
        total_count: int = None,
        records: List[AuditRecordItem] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前页
        self.page_no = page_no
        # 页大小
        self.page_size = page_size
        # 总记录数
        self.total_count = total_count
        # 审核记录
        self.records = records

    def validate(self):
        if self.records:
            for k in self.records:
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
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_count is not None:
            result['total_count'] = self.total_count
        result['records'] = []
        if self.records is not None:
            for k in self.records:
                result['records'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        self.records = []
        if m.get('records') is not None:
            for k in m.get('records'):
                temp_model = AuditRecordItem()
                self.records.append(temp_model.from_map(k))
        return self


