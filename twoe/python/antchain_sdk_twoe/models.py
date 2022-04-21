# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel


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


class EvidenceInfo(TeaModel):
    def __init__(
        self,
        forensic_type: str = None,
        forensic_timestamp: int = None,
        evidence_timestamp: int = None,
        evidence_file_hash: str = None,
        evidence_file_size: int = None,
        evidence_file_url: str = None,
        thumbnail_url: str = None,
        longitude: str = None,
        latitude: str = None,
        tx_hash: str = None,
        notary_office: str = None,
        notary_url: str = None,
        notary_cert_no: str = None,
        tsr: str = None,
    ):
        # 取证类型
        # PHOTO 照片
        # VIDEO 视频
        # STREAM 流
        self.forensic_type = forensic_type
        # 取证时间戳
        self.forensic_timestamp = forensic_timestamp
        # 形成证据时间戳
        self.evidence_timestamp = evidence_timestamp
        # 证据哈希值
        self.evidence_file_hash = evidence_file_hash
        # 证据大小，byte
        self.evidence_file_size = evidence_file_size
        # 证据视频/照片下载链接
        self.evidence_file_url = evidence_file_url
        # 缩略图链接
        self.thumbnail_url = thumbnail_url
        # 取证经度，根据是否需要自清洁决定
        self.longitude = longitude
        # 取证纬度，根据是否需要自清洁决定
        self.latitude = latitude
        # 统一证据编号，根据是否需要上链决定
        self.tx_hash = tx_hash
        # 公证处，根据是否需要公证决定
        self.notary_office = notary_office
        # 存证证明文件链接，根据是否需要公证决定
        self.notary_url = notary_url
        # 存证证明文件编号，根据是否需要公证决定
        self.notary_cert_no = notary_cert_no
        # 可信时间戳，根据是否需要时间戳决定，JSON类型字符串
        self.tsr = tsr

    def validate(self):
        self.validate_required(self.forensic_type, 'forensic_type')
        self.validate_required(self.forensic_timestamp, 'forensic_timestamp')
        self.validate_required(self.evidence_timestamp, 'evidence_timestamp')
        self.validate_required(self.evidence_file_hash, 'evidence_file_hash')
        self.validate_required(self.evidence_file_size, 'evidence_file_size')
        self.validate_required(self.evidence_file_url, 'evidence_file_url')
        self.validate_required(self.thumbnail_url, 'thumbnail_url')

    def to_map(self):
        result = dict()
        if self.forensic_type is not None:
            result['forensic_type'] = self.forensic_type
        if self.forensic_timestamp is not None:
            result['forensic_timestamp'] = self.forensic_timestamp
        if self.evidence_timestamp is not None:
            result['evidence_timestamp'] = self.evidence_timestamp
        if self.evidence_file_hash is not None:
            result['evidence_file_hash'] = self.evidence_file_hash
        if self.evidence_file_size is not None:
            result['evidence_file_size'] = self.evidence_file_size
        if self.evidence_file_url is not None:
            result['evidence_file_url'] = self.evidence_file_url
        if self.thumbnail_url is not None:
            result['thumbnail_url'] = self.thumbnail_url
        if self.longitude is not None:
            result['longitude'] = self.longitude
        if self.latitude is not None:
            result['latitude'] = self.latitude
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.notary_office is not None:
            result['notary_office'] = self.notary_office
        if self.notary_url is not None:
            result['notary_url'] = self.notary_url
        if self.notary_cert_no is not None:
            result['notary_cert_no'] = self.notary_cert_no
        if self.tsr is not None:
            result['tsr'] = self.tsr
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('forensic_type') is not None:
            self.forensic_type = m.get('forensic_type')
        if m.get('forensic_timestamp') is not None:
            self.forensic_timestamp = m.get('forensic_timestamp')
        if m.get('evidence_timestamp') is not None:
            self.evidence_timestamp = m.get('evidence_timestamp')
        if m.get('evidence_file_hash') is not None:
            self.evidence_file_hash = m.get('evidence_file_hash')
        if m.get('evidence_file_size') is not None:
            self.evidence_file_size = m.get('evidence_file_size')
        if m.get('evidence_file_url') is not None:
            self.evidence_file_url = m.get('evidence_file_url')
        if m.get('thumbnail_url') is not None:
            self.thumbnail_url = m.get('thumbnail_url')
        if m.get('longitude') is not None:
            self.longitude = m.get('longitude')
        if m.get('latitude') is not None:
            self.latitude = m.get('latitude')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('notary_office') is not None:
            self.notary_office = m.get('notary_office')
        if m.get('notary_url') is not None:
            self.notary_url = m.get('notary_url')
        if m.get('notary_cert_no') is not None:
            self.notary_cert_no = m.get('notary_cert_no')
        if m.get('tsr') is not None:
            self.tsr = m.get('tsr')
        return self


class GetTokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        uid: str = None,
        cert_type: str = None,
        cert_name: str = None,
        cert_no: str = None,
        mobile_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 支付宝用户id
        self.uid = uid
        # 证件类型。可选，根据是否需要上链公证决定
        self.cert_type = cert_type
        # 证件姓名。可选，根据是否需要上链公证决定。
        self.cert_name = cert_name
        # 证件编号。可选，根据是否需要上链公证决定。
        self.cert_no = cert_no
        # 手机号。可选，根据是否需要上链公证决定。
        self.mobile_no = mobile_no

    def validate(self):
        self.validate_required(self.uid, 'uid')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.uid is not None:
            result['uid'] = self.uid
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.mobile_no is not None:
            result['mobile_no'] = self.mobile_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('uid') is not None:
            self.uid = m.get('uid')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('mobile_no') is not None:
            self.mobile_no = m.get('mobile_no')
        return self


class GetTokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        auth_token: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 小程序取证服务授权信令
        self.auth_token = auth_token

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
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        return self


class QueryEvidenceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        session_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # session编号
        self.session_id = session_id

    def validate(self):
        self.validate_required(self.session_id, 'session_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.session_id is not None:
            result['session_id'] = self.session_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        return self


class QueryEvidenceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        session_id: str = None,
        status: str = None,
        data: EvidenceInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # session编号
        self.session_id = session_id
        # 取证状态
        self.status = status
        # 证据信息，只有当status为EVIDENCE时返回，否则为null
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
        if self.session_id is not None:
            result['session_id'] = self.session_id
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
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('data') is not None:
            temp_model = EvidenceInfo()
            self.data = temp_model.from_map(m['data'])
        return self


