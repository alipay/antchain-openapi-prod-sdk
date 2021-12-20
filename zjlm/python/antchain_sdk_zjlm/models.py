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


class FileInfoModelResponse(TeaModel):
    def __init__(
        self,
        file_name: str = None,
        alias_name: str = None,
        file_type: str = None,
        oss_url: str = None,
    ):
        # 文件名称
        self.file_name = file_name
        # 文件别名
        self.alias_name = alias_name
        # 文件类型
        self.file_type = file_type
        # 文件访问url 地址
        self.oss_url = oss_url

    def validate(self):
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.alias_name, 'alias_name')
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.oss_url, 'oss_url')

    def to_map(self):
        result = dict()
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.alias_name is not None:
            result['alias_name'] = self.alias_name
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.oss_url is not None:
            result['oss_url'] = self.oss_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('alias_name') is not None:
            self.alias_name = m.get('alias_name')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('oss_url') is not None:
            self.oss_url = m.get('oss_url')
        return self


class QiaReportTraceResponse(TeaModel):
    def __init__(
        self,
        qi_id: str = None,
        qi_org_name: str = None,
        tx_hash: str = None,
        qi_start_time: str = None,
        qi_end_time: str = None,
        certification_files: List[FileInfoModelResponse] = None,
        biz_type: str = None,
        qi_status: str = None,
        qi_tag_key: str = None,
        qi_tag_name: str = None,
    ):
        # 任务编号
        self.qi_id = qi_id
        # 颁发机构
        self.qi_org_name = qi_org_name
        # 区块链,哈希值
        self.tx_hash = tx_hash
        # 有效期开始
        self.qi_start_time = qi_start_time
        # 有效期结束
        self.qi_end_time = qi_end_time
        # 认证证书资料
        self.certification_files = certification_files
        # 报告类型
        # * REPORT, 报告认证
        # * NEWSTANDARD, 新标质检
        self.biz_type = biz_type
        # 报告状态
        # * PASS 已通过
        self.qi_status = qi_status
        # 标签key
        self.qi_tag_key = qi_tag_key
        # 标签名
        self.qi_tag_name = qi_tag_name

    def validate(self):
        self.validate_required(self.qi_id, 'qi_id')
        self.validate_required(self.qi_org_name, 'qi_org_name')
        self.validate_required(self.tx_hash, 'tx_hash')
        self.validate_required(self.qi_start_time, 'qi_start_time')
        if self.qi_start_time is not None:
            self.validate_pattern(self.qi_start_time, 'qi_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.qi_end_time, 'qi_end_time')
        if self.qi_end_time is not None:
            self.validate_pattern(self.qi_end_time, 'qi_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.certification_files, 'certification_files')
        if self.certification_files:
            for k in self.certification_files:
                if k:
                    k.validate()
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.qi_status, 'qi_status')
        self.validate_required(self.qi_tag_key, 'qi_tag_key')
        self.validate_required(self.qi_tag_name, 'qi_tag_name')

    def to_map(self):
        result = dict()
        if self.qi_id is not None:
            result['qi_id'] = self.qi_id
        if self.qi_org_name is not None:
            result['qi_org_name'] = self.qi_org_name
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.qi_start_time is not None:
            result['qi_start_time'] = self.qi_start_time
        if self.qi_end_time is not None:
            result['qi_end_time'] = self.qi_end_time
        result['certification_files'] = []
        if self.certification_files is not None:
            for k in self.certification_files:
                result['certification_files'].append(k.to_map() if k else None)
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.qi_status is not None:
            result['qi_status'] = self.qi_status
        if self.qi_tag_key is not None:
            result['qi_tag_key'] = self.qi_tag_key
        if self.qi_tag_name is not None:
            result['qi_tag_name'] = self.qi_tag_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('qi_id') is not None:
            self.qi_id = m.get('qi_id')
        if m.get('qi_org_name') is not None:
            self.qi_org_name = m.get('qi_org_name')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('qi_start_time') is not None:
            self.qi_start_time = m.get('qi_start_time')
        if m.get('qi_end_time') is not None:
            self.qi_end_time = m.get('qi_end_time')
        self.certification_files = []
        if m.get('certification_files') is not None:
            for k in m.get('certification_files'):
                temp_model = FileInfoModelResponse()
                self.certification_files.append(temp_model.from_map(k))
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('qi_status') is not None:
            self.qi_status = m.get('qi_status')
        if m.get('qi_tag_key') is not None:
            self.qi_tag_key = m.get('qi_tag_key')
        if m.get('qi_tag_name') is not None:
            self.qi_tag_name = m.get('qi_tag_name')
        return self


class QueryTraceapiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sku: str = None,
        shop_id: str = None,
        tag_key: str = None,
        tenant_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商品编码
        self.sku = sku
        # 11
        self.shop_id = shop_id
        # 11
        self.tag_key = tag_key
        # 222
        self.tenant_code = tenant_code

    def validate(self):
        self.validate_required(self.sku, 'sku')
        self.validate_required(self.shop_id, 'shop_id')
        self.validate_required(self.tenant_code, 'tenant_code')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sku is not None:
            result['sku'] = self.sku
        if self.shop_id is not None:
            result['shop_id'] = self.shop_id
        if self.tag_key is not None:
            result['tag_key'] = self.tag_key
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sku') is not None:
            self.sku = m.get('sku')
        if m.get('shop_id') is not None:
            self.shop_id = m.get('shop_id')
        if m.get('tag_key') is not None:
            self.tag_key = m.get('tag_key')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        return self


class QueryTraceapiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[QiaReportTraceResponse] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 成功数据
        self.data = data

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
                temp_model = QiaReportTraceResponse()
                self.data.append(temp_model.from_map(k))
        return self


