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


class BlockInfo(TeaModel):
    def __init__(
        self,
        biz_id: str = None,
        block_hash: str = None,
        parent_hash: str = None,
        height: int = None,
        timestamp: int = None,
        biz_data: str = None,
        transaction_size: int = None,
        version: str = None,
        size: int = None,
    ):
        # 区块链唯一性标识
        self.biz_id = biz_id
        # 区块哈希
        self.block_hash = block_hash
        # 上一个区块的hash
        self.parent_hash = parent_hash
        # 块高
        self.height = height
        # 出块时间
        self.timestamp = timestamp
        # 业务数据
        self.biz_data = biz_data
        # 包含交易数
        self.transaction_size = transaction_size
        # 版本
        self.version = version
        # size
        self.size = size

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.block_hash, 'block_hash')
        self.validate_required(self.parent_hash, 'parent_hash')
        self.validate_required(self.height, 'height')
        self.validate_required(self.timestamp, 'timestamp')
        self.validate_required(self.biz_data, 'biz_data')
        self.validate_required(self.transaction_size, 'transaction_size')
        self.validate_required(self.version, 'version')
        self.validate_required(self.size, 'size')

    def to_map(self):
        result = dict()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.block_hash is not None:
            result['block_hash'] = self.block_hash
        if self.parent_hash is not None:
            result['parent_hash'] = self.parent_hash
        if self.height is not None:
            result['height'] = self.height
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.biz_data is not None:
            result['biz_data'] = self.biz_data
        if self.transaction_size is not None:
            result['transaction_size'] = self.transaction_size
        if self.version is not None:
            result['version'] = self.version
        if self.size is not None:
            result['size'] = self.size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('block_hash') is not None:
            self.block_hash = m.get('block_hash')
        if m.get('parent_hash') is not None:
            self.parent_hash = m.get('parent_hash')
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('biz_data') is not None:
            self.biz_data = m.get('biz_data')
        if m.get('transaction_size') is not None:
            self.transaction_size = m.get('transaction_size')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('size') is not None:
            self.size = m.get('size')
        return self


class Institution(TeaModel):
    def __init__(
        self,
        code: str = None,
        name: str = None,
    ):
        # 人行联行号/行政地区编码
        self.code = code
        # 银行全称/行政地区名称
        self.name = name

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.name, 'name')

    def to_map(self):
        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class AntiPiracyResultObject(TeaModel):
    def __init__(
        self,
        infr_host: str = None,
        infr_time: int = None,
        infr_title: str = None,
        infr_url: str = None,
        production_type: str = None,
        similarity: str = None,
    ):
        # 侵权主体
        self.infr_host = infr_host
        # 侵权内容上传时间，number of milliseconds since the epoch of 1970-01-01T00:00:00Z
        self.infr_time = infr_time
        # 侵权标题
        self.infr_title = infr_title
        # 侵权网址
        self.infr_url = infr_url
        # 默认值：VIDEO
        self.production_type = production_type
        # 相似度
        self.similarity = similarity

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.infr_host is not None:
            result['infr_host'] = self.infr_host
        if self.infr_time is not None:
            result['infr_time'] = self.infr_time
        if self.infr_title is not None:
            result['infr_title'] = self.infr_title
        if self.infr_url is not None:
            result['infr_url'] = self.infr_url
        if self.production_type is not None:
            result['production_type'] = self.production_type
        if self.similarity is not None:
            result['similarity'] = self.similarity
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('infr_host') is not None:
            self.infr_host = m.get('infr_host')
        if m.get('infr_time') is not None:
            self.infr_time = m.get('infr_time')
        if m.get('infr_title') is not None:
            self.infr_title = m.get('infr_title')
        if m.get('infr_url') is not None:
            self.infr_url = m.get('infr_url')
        if m.get('production_type') is not None:
            self.production_type = m.get('production_type')
        if m.get('similarity') is not None:
            self.similarity = m.get('similarity')
        return self


class HitDetectItems(TeaModel):
    def __init__(
        self,
        detect_type_code: str = None,
        hit_detect_resource: str = None,
        hit_content: str = None,
        detect_resource_level: str = None,
    ):
        # RULEORMODEL("RULEORMODEL", "规则或模型"), KEYWORDS("KEYWORDS", "关键字检测 "), REPEAT_MODEL("REPEAT_MODEL", "防重复模型"), REGEX("regex", "正则表达式"), URL("url", "URL检测"), SEXY_PIC("sexyPic", "黄图检测"), SAMPLE_PIC("samplePic", "样图检测"), OCR("ocr", "图文识别"), PICTURE_FACE("picture_face","图片人脸检测"), QRCODE("QRCode", "二维码检测"), MDP_MODEL("mdpModel", "mdp检测"), ANTI_SPAM_MODEL("anti_spam_model", "反垃圾模型");
        self.detect_type_code = detect_type_code
        # 命中的检测项的资源： 如命中关键字，则存关键字，如命中正则表达式，则保存正则表达式
        self.hit_detect_resource = hit_detect_resource
        # 保存被命中的内容： 如正则表达式，则保存被正则表达式命中的内容
        self.hit_content = hit_content
        # 级别
        self.detect_resource_level = detect_resource_level

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.detect_type_code is not None:
            result['detect_type_code'] = self.detect_type_code
        if self.hit_detect_resource is not None:
            result['hit_detect_resource'] = self.hit_detect_resource
        if self.hit_content is not None:
            result['hit_content'] = self.hit_content
        if self.detect_resource_level is not None:
            result['detect_resource_level'] = self.detect_resource_level
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('detect_type_code') is not None:
            self.detect_type_code = m.get('detect_type_code')
        if m.get('hit_detect_resource') is not None:
            self.hit_detect_resource = m.get('hit_detect_resource')
        if m.get('hit_content') is not None:
            self.hit_content = m.get('hit_content')
        if m.get('detect_resource_level') is not None:
            self.detect_resource_level = m.get('detect_resource_level')
        return self


class BizInfo(TeaModel):
    def __init__(
        self,
        client_tenent: str = None,
        code: str = None,
        product_code: str = None,
    ):
        # BPWZPFCN
        self.client_tenent = client_tenent
        # 业务代码
        self.code = code
        # 内部产品码
        self.product_code = product_code

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.client_tenent is not None:
            result['client_tenent'] = self.client_tenent
        if self.code is not None:
            result['code'] = self.code
        if self.product_code is not None:
            result['product_code'] = self.product_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('client_tenent') is not None:
            self.client_tenent = m.get('client_tenent')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        return self


class DidDocServicesInfo(TeaModel):
    def __init__(
        self,
        extension: str = None,
        id: str = None,
        service_endpoint: str = None,
        type: str = None,
    ):
        # 服务的扩展字段
        self.extension = extension
        # 服务ID，必须保证该服务ID在did doc中是唯一的。对于保留类型服务： DidAuthService， 有且只能有一个，并且id必须为didauth-1； VerifiableClaimRepository， 有且只有一个，并且id必须为vcrepository-1;
        self.id = id
        # 服务的可访问地址
        self.service_endpoint = service_endpoint
        # 服务类型，必须是已经注册的服务类型，或者是默认保留的服务类型
        self.type = type

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.service_endpoint, 'service_endpoint')
        self.validate_required(self.type, 'type')

    def to_map(self):
        result = dict()
        if self.extension is not None:
            result['extension'] = self.extension
        if self.id is not None:
            result['id'] = self.id
        if self.service_endpoint is not None:
            result['service_endpoint'] = self.service_endpoint
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('extension') is not None:
            self.extension = m.get('extension')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('service_endpoint') is not None:
            self.service_endpoint = m.get('service_endpoint')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class UpdateBmpbrowserPrivilegeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        phone_numbers: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # bizid
        self.bizid = bizid
        # 取消查看权限的支付宝电话号码集合
        self.phone_numbers = phone_numbers

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.phone_numbers, 'phone_numbers')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.phone_numbers is not None:
            result['phone_numbers'] = self.phone_numbers
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('phone_numbers') is not None:
            self.phone_numbers = m.get('phone_numbers')
        return self


class UpdateBmpbrowserPrivilegeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 批量更新权限成功与否
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


class QueryIndividualidInternalmaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_info: BizInfo = None,
        cert_no: str = None,
        mobile: str = None,
        name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用于内部统计的参数，外部用户请忽略
        self.biz_info = biz_info
        # 被核验人身份证号码后四位
        self.cert_no = cert_no
        # 被核验人手机号码
        self.mobile = mobile
        # 被核验人姓名的一部分
        self.name = name

    def validate(self):
        self.validate_required(self.biz_info, 'biz_info')
        if self.biz_info:
            self.biz_info.validate()
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.mobile, 'mobile')
        self.validate_required(self.name, 'name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(m['biz_info'])
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class QueryIndividualidInternalmaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        accepted: bool = None,
        verify_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否通过
        self.accepted = accepted
        # 
        self.verify_url = verify_url

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
        if self.verify_url is not None:
            result['verify_url'] = self.verify_url
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
        if m.get('verify_url') is not None:
            self.verify_url = m.get('verify_url')
        return self


class QueryEnterpriseidInternalfourmetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_info: BizInfo = None,
        ep_cert_name: str = None,
        ep_cert_no: str = None,
        ep_cert_type: str = None,
        legal_person_cert_name: str = None,
        legal_person_cert_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用于内部统计的参数，外部用户请忽略
        self.biz_info = biz_info
        # 企业名称
        self.ep_cert_name = ep_cert_name
        # 企业证件号
        self.ep_cert_no = ep_cert_no
        # 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
        self.ep_cert_type = ep_cert_type
        # 法人姓名
        self.legal_person_cert_name = legal_person_cert_name
        # 企业法人身份证号码
        self.legal_person_cert_no = legal_person_cert_no

    def validate(self):
        self.validate_required(self.biz_info, 'biz_info')
        if self.biz_info:
            self.biz_info.validate()
        self.validate_required(self.ep_cert_name, 'ep_cert_name')
        self.validate_required(self.ep_cert_no, 'ep_cert_no')
        self.validate_required(self.ep_cert_type, 'ep_cert_type')
        self.validate_required(self.legal_person_cert_name, 'legal_person_cert_name')
        self.validate_required(self.legal_person_cert_no, 'legal_person_cert_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        if self.ep_cert_name is not None:
            result['ep_cert_name'] = self.ep_cert_name
        if self.ep_cert_no is not None:
            result['ep_cert_no'] = self.ep_cert_no
        if self.ep_cert_type is not None:
            result['ep_cert_type'] = self.ep_cert_type
        if self.legal_person_cert_name is not None:
            result['legal_person_cert_name'] = self.legal_person_cert_name
        if self.legal_person_cert_no is not None:
            result['legal_person_cert_no'] = self.legal_person_cert_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(m['biz_info'])
        if m.get('ep_cert_name') is not None:
            self.ep_cert_name = m.get('ep_cert_name')
        if m.get('ep_cert_no') is not None:
            self.ep_cert_no = m.get('ep_cert_no')
        if m.get('ep_cert_type') is not None:
            self.ep_cert_type = m.get('ep_cert_type')
        if m.get('legal_person_cert_name') is not None:
            self.legal_person_cert_name = m.get('legal_person_cert_name')
        if m.get('legal_person_cert_no') is not None:
            self.legal_person_cert_no = m.get('legal_person_cert_no')
        return self


class QueryEnterpriseidInternalfourmetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        enterprise_status: str = None,
        open_time: str = None,
        passed: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 企业经营状态
        self.enterprise_status = enterprise_status
        # 营业期限
        self.open_time = open_time
        # 认证是否通过
        self.passed = passed

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
        if self.enterprise_status is not None:
            result['enterprise_status'] = self.enterprise_status
        if self.open_time is not None:
            result['open_time'] = self.open_time
        if self.passed is not None:
            result['passed'] = self.passed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('enterprise_status') is not None:
            self.enterprise_status = m.get('enterprise_status')
        if m.get('open_time') is not None:
            self.open_time = m.get('open_time')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        return self


class QueryEnterpriseidInternalthreemetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_info: BizInfo = None,
        ep_cert_name: str = None,
        ep_cert_no: str = None,
        ep_cert_type: str = None,
        legal_person_cert_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用于内部统计的参数，外部用户请忽略
        self.biz_info = biz_info
        # 企业名称
        self.ep_cert_name = ep_cert_name
        # 企业证件号
        self.ep_cert_no = ep_cert_no
        # 证件类型
        self.ep_cert_type = ep_cert_type
        # 法人姓名
        self.legal_person_cert_name = legal_person_cert_name

    def validate(self):
        if self.biz_info:
            self.biz_info.validate()
        self.validate_required(self.ep_cert_name, 'ep_cert_name')
        self.validate_required(self.ep_cert_no, 'ep_cert_no')
        self.validate_required(self.ep_cert_type, 'ep_cert_type')
        self.validate_required(self.legal_person_cert_name, 'legal_person_cert_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        if self.ep_cert_name is not None:
            result['ep_cert_name'] = self.ep_cert_name
        if self.ep_cert_no is not None:
            result['ep_cert_no'] = self.ep_cert_no
        if self.ep_cert_type is not None:
            result['ep_cert_type'] = self.ep_cert_type
        if self.legal_person_cert_name is not None:
            result['legal_person_cert_name'] = self.legal_person_cert_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(m['biz_info'])
        if m.get('ep_cert_name') is not None:
            self.ep_cert_name = m.get('ep_cert_name')
        if m.get('ep_cert_no') is not None:
            self.ep_cert_no = m.get('ep_cert_no')
        if m.get('ep_cert_type') is not None:
            self.ep_cert_type = m.get('ep_cert_type')
        if m.get('legal_person_cert_name') is not None:
            self.legal_person_cert_name = m.get('legal_person_cert_name')
        return self


class QueryEnterpriseidInternalthreemetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        enterprise_status: str = None,
        open_time: str = None,
        passed: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 经营状态
        self.enterprise_status = enterprise_status
        # 营业期限
        self.open_time = open_time
        # 认证是否通过
        self.passed = passed

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
        if self.enterprise_status is not None:
            result['enterprise_status'] = self.enterprise_status
        if self.open_time is not None:
            result['open_time'] = self.open_time
        if self.passed is not None:
            result['passed'] = self.passed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('enterprise_status') is not None:
            self.enterprise_status = m.get('enterprise_status')
        if m.get('open_time') is not None:
            self.open_time = m.get('open_time')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        return self


class QueryEnterpriseidInternaltwometaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_info: BizInfo = None,
        ep_cert_name: str = None,
        ep_cert_no: str = None,
        ep_cert_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用于内部统计的参数，外部用户请忽略
        self.biz_info = biz_info
        # 企业名称
        self.ep_cert_name = ep_cert_name
        # 企业证件号
        self.ep_cert_no = ep_cert_no
        # 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码
        self.ep_cert_type = ep_cert_type

    def validate(self):
        self.validate_required(self.biz_info, 'biz_info')
        if self.biz_info:
            self.biz_info.validate()
        self.validate_required(self.ep_cert_name, 'ep_cert_name')
        self.validate_required(self.ep_cert_no, 'ep_cert_no')
        self.validate_required(self.ep_cert_type, 'ep_cert_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        if self.ep_cert_name is not None:
            result['ep_cert_name'] = self.ep_cert_name
        if self.ep_cert_no is not None:
            result['ep_cert_no'] = self.ep_cert_no
        if self.ep_cert_type is not None:
            result['ep_cert_type'] = self.ep_cert_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(m['biz_info'])
        if m.get('ep_cert_name') is not None:
            self.ep_cert_name = m.get('ep_cert_name')
        if m.get('ep_cert_no') is not None:
            self.ep_cert_no = m.get('ep_cert_no')
        if m.get('ep_cert_type') is not None:
            self.ep_cert_type = m.get('ep_cert_type')
        return self


class QueryEnterpriseidInternaltwometaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        enterprise_status: str = None,
        open_time: str = None,
        passed: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 经营状态
        self.enterprise_status = enterprise_status
        # 营业期限
        self.open_time = open_time
        # 认证是否通过
        self.passed = passed

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
        if self.enterprise_status is not None:
            result['enterprise_status'] = self.enterprise_status
        if self.open_time is not None:
            result['open_time'] = self.open_time
        if self.passed is not None:
            result['passed'] = self.passed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('enterprise_status') is not None:
            self.enterprise_status = m.get('enterprise_status')
        if m.get('open_time') is not None:
            self.open_time = m.get('open_time')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        return self


class InitEnterpriseidFaceauthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ep_cert_name: str = None,
        ep_cert_no: str = None,
        ep_cert_type: str = None,
        legal_person_cert_name: str = None,
        legal_person_cert_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业名称
        self.ep_cert_name = ep_cert_name
        # 企业证件号
        self.ep_cert_no = ep_cert_no
        # 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
        self.ep_cert_type = ep_cert_type
        # 企业法人姓名
        self.legal_person_cert_name = legal_person_cert_name
        # 企业法人身份证号（目前只支持身份证号）
        self.legal_person_cert_no = legal_person_cert_no

    def validate(self):
        self.validate_required(self.ep_cert_name, 'ep_cert_name')
        self.validate_required(self.ep_cert_no, 'ep_cert_no')
        self.validate_required(self.ep_cert_type, 'ep_cert_type')
        self.validate_required(self.legal_person_cert_name, 'legal_person_cert_name')
        self.validate_required(self.legal_person_cert_no, 'legal_person_cert_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ep_cert_name is not None:
            result['ep_cert_name'] = self.ep_cert_name
        if self.ep_cert_no is not None:
            result['ep_cert_no'] = self.ep_cert_no
        if self.ep_cert_type is not None:
            result['ep_cert_type'] = self.ep_cert_type
        if self.legal_person_cert_name is not None:
            result['legal_person_cert_name'] = self.legal_person_cert_name
        if self.legal_person_cert_no is not None:
            result['legal_person_cert_no'] = self.legal_person_cert_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ep_cert_name') is not None:
            self.ep_cert_name = m.get('ep_cert_name')
        if m.get('ep_cert_no') is not None:
            self.ep_cert_no = m.get('ep_cert_no')
        if m.get('ep_cert_type') is not None:
            self.ep_cert_type = m.get('ep_cert_type')
        if m.get('legal_person_cert_name') is not None:
            self.legal_person_cert_name = m.get('legal_person_cert_name')
        if m.get('legal_person_cert_no') is not None:
            self.legal_person_cert_no = m.get('legal_person_cert_no')
        return self


class InitEnterpriseidFaceauthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 本次认证的业务唯一性标示
        self.biz_no = biz_no

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
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        return self


class QueryEnterpriseidFaceauthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 认证的唯一性标示
        self.biz_no = biz_no

    def validate(self):
        self.validate_required(self.biz_no, 'biz_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        return self


class QueryEnterpriseidFaceauthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_no: str = None,
        failed_code: str = None,
        failed_message: str = None,
        passed: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 认证的唯一性标示
        self.biz_no = biz_no
        # 认证失败错误码
        self.failed_code = failed_code
        # 认证失败原因信息
        self.failed_message = failed_message
        # 是否认证通过
        self.passed = passed

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
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.failed_code is not None:
            result['failed_code'] = self.failed_code
        if self.failed_message is not None:
            result['failed_message'] = self.failed_message
        if self.passed is not None:
            result['passed'] = self.passed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('failed_code') is not None:
            self.failed_code = m.get('failed_code')
        if m.get('failed_message') is not None:
            self.failed_message = m.get('failed_message')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        return self


class QueryIndividualidInternalfourmetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bank_card_no: str = None,
        biz_info: BizInfo = None,
        cert_no: str = None,
        mobile: str = None,
        name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 被核验人银行卡号
        self.bank_card_no = bank_card_no
        # 用于内部统计的参数，外部用户请忽略
        self.biz_info = biz_info
        # 被核验人身份证号码
        self.cert_no = cert_no
        # 被核验人手机号码
        self.mobile = mobile
        # 被核验人姓名
        self.name = name

    def validate(self):
        self.validate_required(self.bank_card_no, 'bank_card_no')
        self.validate_required(self.biz_info, 'biz_info')
        if self.biz_info:
            self.biz_info.validate()
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.mobile, 'mobile')
        self.validate_required(self.name, 'name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bank_card_no is not None:
            result['bank_card_no'] = self.bank_card_no
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bank_card_no') is not None:
            self.bank_card_no = m.get('bank_card_no')
        if m.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(m['biz_info'])
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class QueryIndividualidInternalfourmetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        accepted: bool = None,
        verify_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否通过
        self.accepted = accepted
        # 
        self.verify_url = verify_url

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
        if self.verify_url is not None:
            result['verify_url'] = self.verify_url
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
        if m.get('verify_url') is not None:
            self.verify_url = m.get('verify_url')
        return self


class QueryIndividualidInternalthreemetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_info: BizInfo = None,
        cert_no: str = None,
        mobile: str = None,
        name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用于内部统计的参数，外部用户请忽略
        self.biz_info = biz_info
        # 被核验人身份证号码
        self.cert_no = cert_no
        # 被核验人手机号码
        self.mobile = mobile
        # 被核验人姓名
        self.name = name

    def validate(self):
        self.validate_required(self.biz_info, 'biz_info')
        if self.biz_info:
            self.biz_info.validate()
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.mobile, 'mobile')
        self.validate_required(self.name, 'name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(m['biz_info'])
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class QueryIndividualidInternalthreemetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        accepted: bool = None,
        verify_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否通过
        self.accepted = accepted
        # 
        self.verify_url = verify_url

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
        if self.verify_url is not None:
            result['verify_url'] = self.verify_url
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
        if m.get('verify_url') is not None:
            self.verify_url = m.get('verify_url')
        return self


class QueryIndividualidInternaltwometaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_info: BizInfo = None,
        cert_no: str = None,
        name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用于内部统计的参数，外部用户请忽略
        self.biz_info = biz_info
        # 被核验人身份证号码
        self.cert_no = cert_no
        # 被核验人姓名
        self.name = name

    def validate(self):
        self.validate_required(self.biz_info, 'biz_info')
        if self.biz_info:
            self.biz_info.validate()
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.name, 'name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(m['biz_info'])
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class QueryIndividualidInternaltwometaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        accepted: bool = None,
        verify_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否通过
        self.accepted = accepted
        # 
        self.verify_url = verify_url

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
        if self.verify_url is not None:
            result['verify_url'] = self.verify_url
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
        if m.get('verify_url') is not None:
            self.verify_url = m.get('verify_url')
        return self


class CreateBaicorpInternalevaluationasyncRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        biz_info: BizInfo = None,
        callback: str = None,
        callback_param: str = None,
        custom_id: str = None,
        entity_data: str = None,
        entity_type: str = None,
        entity_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景ID
        self.biz_id = biz_id
        # 内部的业务代码
        self.biz_info = biz_info
        # 回调地址。由于存在异步调用，部分结果通过回调返回数据。例如图片和视频。
        self.callback = callback
        # 回调参数
        self.callback_param = callback_param
        # 业务自定义id，便于识别返回数据对应关系
        self.custom_id = custom_id
        # 待检测内容RAW数据，目前仅用于text类型，entity_url和entity_data不可同时存在
        self.entity_data = entity_data
        # 待评估内容类型
        self.entity_type = entity_type
        # 检测内容url，支持HTTPS, entity_url和entity_data不可同时存在
        self.entity_url = entity_url

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.biz_info, 'biz_info')
        if self.biz_info:
            self.biz_info.validate()
        self.validate_required(self.custom_id, 'custom_id')
        self.validate_required(self.entity_type, 'entity_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        if self.callback is not None:
            result['callback'] = self.callback
        if self.callback_param is not None:
            result['callback_param'] = self.callback_param
        if self.custom_id is not None:
            result['custom_id'] = self.custom_id
        if self.entity_data is not None:
            result['entity_data'] = self.entity_data
        if self.entity_type is not None:
            result['entity_type'] = self.entity_type
        if self.entity_url is not None:
            result['entity_url'] = self.entity_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(m['biz_info'])
        if m.get('callback') is not None:
            self.callback = m.get('callback')
        if m.get('callback_param') is not None:
            self.callback_param = m.get('callback_param')
        if m.get('custom_id') is not None:
            self.custom_id = m.get('custom_id')
        if m.get('entity_data') is not None:
            self.entity_data = m.get('entity_data')
        if m.get('entity_type') is not None:
            self.entity_type = m.get('entity_type')
        if m.get('entity_url') is not None:
            self.entity_url = m.get('entity_url')
        return self


class CreateBaicorpInternalevaluationasyncResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content_score: str = None,
        content_score_desc: str = None,
        custom_id: str = None,
        repeat_reason: str = None,
        repeat_result: bool = None,
        risk_result: str = None,
        risk_result_desc: str = None,
        task_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 内容质量分
        self.content_score = content_score
        # 质量分描述
        self.content_score_desc = content_score_desc
        # 业务自定义id
        self.custom_id = custom_id
        # 导致重复的原因
        self.repeat_reason = repeat_reason
        # 是否重复
        self.repeat_result = repeat_result
        # 风险识别结果
        self.risk_result = risk_result
        # 风险识别结果描述
        self.risk_result_desc = risk_result_desc
        # 监测任务ID
        self.task_id = task_id

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
        if self.content_score is not None:
            result['content_score'] = self.content_score
        if self.content_score_desc is not None:
            result['content_score_desc'] = self.content_score_desc
        if self.custom_id is not None:
            result['custom_id'] = self.custom_id
        if self.repeat_reason is not None:
            result['repeat_reason'] = self.repeat_reason
        if self.repeat_result is not None:
            result['repeat_result'] = self.repeat_result
        if self.risk_result is not None:
            result['risk_result'] = self.risk_result
        if self.risk_result_desc is not None:
            result['risk_result_desc'] = self.risk_result_desc
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('content_score') is not None:
            self.content_score = m.get('content_score')
        if m.get('content_score_desc') is not None:
            self.content_score_desc = m.get('content_score_desc')
        if m.get('custom_id') is not None:
            self.custom_id = m.get('custom_id')
        if m.get('repeat_reason') is not None:
            self.repeat_reason = m.get('repeat_reason')
        if m.get('repeat_result') is not None:
            self.repeat_result = m.get('repeat_result')
        if m.get('risk_result') is not None:
            self.risk_result = m.get('risk_result')
        if m.get('risk_result_desc') is not None:
            self.risk_result_desc = m.get('risk_result_desc')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class CreateBaicorpInternalmonitorasyncRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        biz_info: BizInfo = None,
        broadcast_time: int = None,
        custom_id: str = None,
        entity_data: str = None,
        entity_type: str = None,
        entity_url: str = None,
        key_words: List[str] = None,
        matched_duration: int = None,
        monitor_duration: int = None,
        monitor_frequency: int = None,
        monitor_scope: List[str] = None,
        notify_url: str = None,
        provider_id: str = None,
        start_date: int = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景id
        self.biz_id = biz_id
        # 用于内部业务统计的信息
        self.biz_info = biz_info
        # 监测传播时间，单位暂定天
        self.broadcast_time = broadcast_time
        # 基于安全考虑，填充NonceId
        self.custom_id = custom_id
        # 待检测内容RAW数据
        self.entity_data = entity_data
        # 待监测内容类型
        self.entity_type = entity_type
        # 待检测内容url，支持HTTP和OSS，OSS从默认源拉取,input_url和input_data不可同时存在
        self.entity_url = entity_url
        # 监测输入的多个关键词
        self.key_words = key_words
        # 匹配时长，单位秒
        self.matched_duration = matched_duration
        # 监测时长，单位为天
        self.monitor_duration = monitor_duration
        # 监测频次，单位暂定天
        self.monitor_frequency = monitor_frequency
        # 监测范围
        self.monitor_scope = monitor_scope
        # 监测事件发送时的回调通知URL，若为空则不发送通知，24小时内最少发送成功一次
        self.notify_url = notify_url
        # provider id
        self.provider_id = provider_id
        # 监测启动日期，若为空，则立刻开始，从1970开始的毫秒数。
        self.start_date = start_date
        # 业务方任务id，业务方保证唯一
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.biz_info, 'biz_info')
        if self.biz_info:
            self.biz_info.validate()
        self.validate_required(self.entity_type, 'entity_type')
        self.validate_required(self.key_words, 'key_words')
        self.validate_required(self.monitor_frequency, 'monitor_frequency')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        if self.broadcast_time is not None:
            result['broadcast_time'] = self.broadcast_time
        if self.custom_id is not None:
            result['custom_id'] = self.custom_id
        if self.entity_data is not None:
            result['entity_data'] = self.entity_data
        if self.entity_type is not None:
            result['entity_type'] = self.entity_type
        if self.entity_url is not None:
            result['entity_url'] = self.entity_url
        if self.key_words is not None:
            result['key_words'] = self.key_words
        if self.matched_duration is not None:
            result['matched_duration'] = self.matched_duration
        if self.monitor_duration is not None:
            result['monitor_duration'] = self.monitor_duration
        if self.monitor_frequency is not None:
            result['monitor_frequency'] = self.monitor_frequency
        if self.monitor_scope is not None:
            result['monitor_scope'] = self.monitor_scope
        if self.notify_url is not None:
            result['notify_url'] = self.notify_url
        if self.provider_id is not None:
            result['provider_id'] = self.provider_id
        if self.start_date is not None:
            result['start_date'] = self.start_date
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(m['biz_info'])
        if m.get('broadcast_time') is not None:
            self.broadcast_time = m.get('broadcast_time')
        if m.get('custom_id') is not None:
            self.custom_id = m.get('custom_id')
        if m.get('entity_data') is not None:
            self.entity_data = m.get('entity_data')
        if m.get('entity_type') is not None:
            self.entity_type = m.get('entity_type')
        if m.get('entity_url') is not None:
            self.entity_url = m.get('entity_url')
        if m.get('key_words') is not None:
            self.key_words = m.get('key_words')
        if m.get('matched_duration') is not None:
            self.matched_duration = m.get('matched_duration')
        if m.get('monitor_duration') is not None:
            self.monitor_duration = m.get('monitor_duration')
        if m.get('monitor_frequency') is not None:
            self.monitor_frequency = m.get('monitor_frequency')
        if m.get('monitor_scope') is not None:
            self.monitor_scope = m.get('monitor_scope')
        if m.get('notify_url') is not None:
            self.notify_url = m.get('notify_url')
        if m.get('provider_id') is not None:
            self.provider_id = m.get('provider_id')
        if m.get('start_date') is not None:
            self.start_date = m.get('start_date')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class CreateBaicorpInternalmonitorasyncResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        monitor_duration: int = None,
        start_date: int = None,
        task_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 检测时长，单位为天
        self.monitor_duration = monitor_duration
        # 监测启动日期，若为空，则立刻开始，从1970开始的毫秒数。
        self.start_date = start_date
        # 业务方任务id，业务方保证唯一
        self.task_id = task_id

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
        if self.monitor_duration is not None:
            result['monitor_duration'] = self.monitor_duration
        if self.start_date is not None:
            result['start_date'] = self.start_date
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('monitor_duration') is not None:
            self.monitor_duration = m.get('monitor_duration')
        if m.get('start_date') is not None:
            self.start_date = m.get('start_date')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryBaicorpInternalevaluationasyncRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        biz_info: BizInfo = None,
        custom_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 产品ID
        self.biz_id = biz_id
        # bizinfo
        self.biz_info = biz_info
        # 基于安全考虑，填充NonceId
        self.custom_id = custom_id
        # 监测任务Id
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.biz_info, 'biz_info')
        if self.biz_info:
            self.biz_info.validate()
        self.validate_required(self.custom_id, 'custom_id')
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        if self.custom_id is not None:
            result['custom_id'] = self.custom_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(m['biz_info'])
        if m.get('custom_id') is not None:
            self.custom_id = m.get('custom_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryBaicorpInternalevaluationasyncResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        custom_id: str = None,
        risk_result: str = None,
        risk_result_desc: str = None,
        task_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务自定义id
        self.custom_id = custom_id
        # 风险识别结果
        self.risk_result = risk_result
        # 风险识别结果描述
        self.risk_result_desc = risk_result_desc
        # 监测任务ID
        self.task_id = task_id

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
        if self.custom_id is not None:
            result['custom_id'] = self.custom_id
        if self.risk_result is not None:
            result['risk_result'] = self.risk_result
        if self.risk_result_desc is not None:
            result['risk_result_desc'] = self.risk_result_desc
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('custom_id') is not None:
            self.custom_id = m.get('custom_id')
        if m.get('risk_result') is not None:
            self.risk_result = m.get('risk_result')
        if m.get('risk_result_desc') is not None:
            self.risk_result_desc = m.get('risk_result_desc')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryBaicorpInternalmonitorasyncRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务方产品ID
        self.biz_id = biz_id
        # 业务方任务id，业务方保证唯一
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryBaicorpInternalmonitorasyncResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[AntiPiracyResultObject] = None,
        err_msg: str = None,
        status: str = None,
        task_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据
        self.data = data
        # 如果字段status == "failed"，该字段保存相关错误信息
        self.err_msg = err_msg
        # success 数据入库成功，后续处于被检测状态；
        # continue 数据处于被检测状态，data 字段包含监测结果
        # failed 任务失败
        self.status = status
        # 任务ID
        self.task_id = task_id

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
        if self.err_msg is not None:
            result['err_msg'] = self.err_msg
        if self.status is not None:
            result['status'] = self.status
        if self.task_id is not None:
            result['task_id'] = self.task_id
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
                temp_model = AntiPiracyResultObject()
                self.data.append(temp_model.from_map(k))
        if m.get('err_msg') is not None:
            self.err_msg = m.get('err_msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class CertifyEnterpriseidFaceauthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_no: str = None,
        callback_url: str = None,
        redirect_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 认证的唯一性标示
        self.biz_no = biz_no
        # 回调通知地址
        self.callback_url = callback_url
        # 认证完成后回跳地址
        # 
        self.redirect_url = redirect_url

    def validate(self):
        self.validate_required(self.biz_no, 'biz_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.callback_url is not None:
            result['callback_url'] = self.callback_url
        if self.redirect_url is not None:
            result['redirect_url'] = self.redirect_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('callback_url') is not None:
            self.callback_url = m.get('callback_url')
        if m.get('redirect_url') is not None:
            self.redirect_url = m.get('redirect_url')
        return self


class CertifyEnterpriseidFaceauthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_no: str = None,
        verify_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 认证的唯一性标示
        # 
        self.biz_no = biz_no
        # 认证url
        # 
        self.verify_url = verify_url

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
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.verify_url is not None:
            result['verify_url'] = self.verify_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('verify_url') is not None:
            self.verify_url = m.get('verify_url')
        return self


class InitIndividualidFaceauthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cert_name: str = None,
        cert_no: str = None,
        biz_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 姓名
        self.cert_name = cert_name
        # 身份证号
        self.cert_no = cert_no
        # 认证方式,FACE表示在支付宝内进行认证,FACE_SDK表示在客户的应用中进行认证
        # 默认为FACE
        self.biz_code = biz_code

    def validate(self):
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
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
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        return self


class InitIndividualidFaceauthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        certify_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 认证的唯一性id
        self.certify_id = certify_id

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
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        return self


class CertifyIndividualidFaceauthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        callback_url: str = None,
        certify_id: str = None,
        redirect_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 回调通知地址
        self.callback_url = callback_url
        # 认证的唯一性id
        self.certify_id = certify_id
        # 认证完成后回跳地址
        # 
        self.redirect_url = redirect_url

    def validate(self):
        self.validate_required(self.certify_id, 'certify_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.callback_url is not None:
            result['callback_url'] = self.callback_url
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        if self.redirect_url is not None:
            result['redirect_url'] = self.redirect_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('callback_url') is not None:
            self.callback_url = m.get('callback_url')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('redirect_url') is not None:
            self.redirect_url = m.get('redirect_url')
        return self


class CertifyIndividualidFaceauthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        certify_id: str = None,
        verify_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 认证的唯一性id
        self.certify_id = certify_id
        # 认证url
        self.verify_url = verify_url

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
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        if self.verify_url is not None:
            result['verify_url'] = self.verify_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('verify_url') is not None:
            self.verify_url = m.get('verify_url')
        return self


class QueryIndividualidFaceauthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        certify_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 认证的唯一性id
        self.certify_id = certify_id

    def validate(self):
        self.validate_required(self.certify_id, 'certify_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        return self


class QueryIndividualidFaceauthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        certify_id: str = None,
        passed: bool = None,
        finished: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 认证的唯一性id
        # 
        self.certify_id = certify_id
        # 是否认证通过
        self.passed = passed
        # 用户是否完成刷脸
        self.finished = finished

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
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        if self.passed is not None:
            result['passed'] = self.passed
        if self.finished is not None:
            result['finished'] = self.finished
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        if m.get('finished') is not None:
            self.finished = m.get('finished')
        return self


class GetDataserviceBlockchainheightRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 区块链的唯一性标示
        self.bizid = bizid

    def validate(self):
        self.validate_required(self.bizid, 'bizid')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        return self


class GetDataserviceBlockchainheightResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 区块链块高
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


class GetDataserviceTransactioncountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 区块链唯一性标示
        self.bizid = bizid

    def validate(self):
        self.validate_required(self.bizid, 'bizid')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        return self


class GetDataserviceTransactioncountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易总数
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


class GetDataserviceTransactioninfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        hash: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 区块链唯一性标识
        self.bizid = bizid
        # 交易hash
        self.hash = hash

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.hash, 'hash')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.hash is not None:
            result['hash'] = self.hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        return self


class GetDataserviceTransactioninfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        bizid: str = None,
        category: int = None,
        create_time: int = None,
        from_hash: str = None,
        hash: str = None,
        height: int = None,
        to_hash: str = None,
        type: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 区块链唯一性标识
        self.bizid = bizid
        # category
        self.category = category
        # 交易发起时间
        self.create_time = create_time
        # 交易发起方哈希
        self.from_hash = from_hash
        # 交易哈希
        self.hash = hash
        # 块高
        self.height = height
        # 交易接收方哈希
        self.to_hash = to_hash
        # 交易类型
        self.type = type

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
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.category is not None:
            result['category'] = self.category
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.from_hash is not None:
            result['from_hash'] = self.from_hash
        if self.hash is not None:
            result['hash'] = self.hash
        if self.height is not None:
            result['height'] = self.height
        if self.to_hash is not None:
            result['to_hash'] = self.to_hash
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('category') is not None:
            self.category = m.get('category')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('from_hash') is not None:
            self.from_hash = m.get('from_hash')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('to_hash') is not None:
            self.to_hash = m.get('to_hash')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class ListDataserviceLastblocksRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 区块链唯一性标识
        self.bizid = bizid
        # 区块个数
        self.size = size

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.size, 'size')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.size is not None:
            result['size'] = self.size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('size') is not None:
            self.size = m.get('size')
        return self


class ListDataserviceLastblocksResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        last_block_list: List[BlockInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 区块信息
        self.last_block_list = last_block_list

    def validate(self):
        if self.last_block_list:
            for k in self.last_block_list:
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
        result['last_block_list'] = []
        if self.last_block_list is not None:
            for k in self.last_block_list:
                result['last_block_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.last_block_list = []
        if m.get('last_block_list') is not None:
            for k in m.get('last_block_list'):
                temp_model = BlockInfo()
                self.last_block_list.append(temp_model.from_map(k))
        return self


class GetTasAttestationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        algorithm: str = None,
        cert_req: bool = None,
        compress: bool = None,
        rid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 摘要算法默认，（sha256或者sm3 默认sm3）
        self.algorithm = algorithm
        # tsr中是否保存证书，true表示保存，false表示不保存（默认为false）
        self.cert_req = cert_req
        # 返回tsr是否压缩精简，true表示要压缩精简，false表示不压缩精简 （默认为true）
        self.compress = compress
        # 事物hash(支持sha256或sm3摘要算法),长度64个字符。
        self.rid = rid

    def validate(self):
        self.validate_required(self.rid, 'rid')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.algorithm is not None:
            result['algorithm'] = self.algorithm
        if self.cert_req is not None:
            result['cert_req'] = self.cert_req
        if self.compress is not None:
            result['compress'] = self.compress
        if self.rid is not None:
            result['rid'] = self.rid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('algorithm') is not None:
            self.algorithm = m.get('algorithm')
        if m.get('cert_req') is not None:
            self.cert_req = m.get('cert_req')
        if m.get('compress') is not None:
            self.compress = m.get('compress')
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        return self


class GetTasAttestationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ctsr: str = None,
        sn: str = None,
        ts: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 精简后的时间戳完整编码（在校验时需要提交）
        self.ctsr = ctsr
        # serialNumber，凭证编号 （在校验的时需要先填写凭证编号）
        self.sn = sn
        # 时间信息，从1970年1月1日起至当前时间的毫秒数(13位数字)
        self.ts = ts

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
        if self.ctsr is not None:
            result['ctsr'] = self.ctsr
        if self.sn is not None:
            result['sn'] = self.sn
        if self.ts is not None:
            result['ts'] = self.ts
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ctsr') is not None:
            self.ctsr = m.get('ctsr')
        if m.get('sn') is not None:
            self.sn = m.get('sn')
        if m.get('ts') is not None:
            self.ts = m.get('ts')
        return self


class VerifyTasCtsrRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ctsr: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求时间凭证接口返回的ctsr参数
        self.ctsr = ctsr

    def validate(self):
        self.validate_required(self.ctsr, 'ctsr')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ctsr is not None:
            result['ctsr'] = self.ctsr
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ctsr') is not None:
            self.ctsr = m.get('ctsr')
        return self


class VerifyTasCtsrResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        app_name: str = None,
        company_name: str = None,
        desc: str = None,
        hash_value: str = None,
        sn: str = None,
        ts: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 应用名
        self.app_name = app_name
        # 公司名
        self.company_name = company_name
        # 事务步骤的描述
        self.desc = desc
        # 请求时间凭证时传入的事物hash
        self.hash_value = hash_value
        # serialNumber，凭证编号 （在校验的时需要先填写凭证编号）
        self.sn = sn
        # 时间信息，从1970年1月1日起至当前时间的毫秒数(13位数字)
        self.ts = ts

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
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.desc is not None:
            result['desc'] = self.desc
        if self.hash_value is not None:
            result['hash_value'] = self.hash_value
        if self.sn is not None:
            result['sn'] = self.sn
        if self.ts is not None:
            result['ts'] = self.ts
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('hash_value') is not None:
            self.hash_value = m.get('hash_value')
        if m.get('sn') is not None:
            self.sn = m.get('sn')
        if m.get('ts') is not None:
            self.ts = m.get('ts')
        return self


class GetTasCertificateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sn: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # serialNumber，凭证编号 （在校验的时需要先填写凭证编号）
        self.sn = sn

    def validate(self):
        self.validate_required(self.sn, 'sn')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sn is not None:
            result['sn'] = self.sn
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sn') is not None:
            self.sn = m.get('sn')
        return self


class GetTasCertificateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 下载pdf格式证书的临时url
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
        if m.get('url') is not None:
            self.url = m.get('url')
        return self


class GetTasTransactionattestationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        rid: str = None,
        algorithm: str = None,
        compress: bool = None,
        cert_req: bool = None,
        trans_id: str = None,
        desc: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 事物hash(支持sha256或sm3摘要算法)
        # 长度64个字符。
        self.rid = rid
        # 摘要算法默认，（sha256或者sm3 默认sm3）
        self.algorithm = algorithm
        # 返回tsr是否压缩精简，true表示要压缩精简，false表示不压缩精简 （默认为true）
        self.compress = compress
        # tsr中是否保存证书，true表示保存，false表示不保存（默认为false）
        self.cert_req = cert_req
        # 事务id，允许大小写数字且小于十位的字符串
        self.trans_id = trans_id
        # 对事务的描述，长度小于20位
        self.desc = desc

    def validate(self):
        self.validate_required(self.rid, 'rid')
        self.validate_required(self.trans_id, 'trans_id')
        self.validate_required(self.desc, 'desc')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.rid is not None:
            result['rid'] = self.rid
        if self.algorithm is not None:
            result['algorithm'] = self.algorithm
        if self.compress is not None:
            result['compress'] = self.compress
        if self.cert_req is not None:
            result['cert_req'] = self.cert_req
        if self.trans_id is not None:
            result['trans_id'] = self.trans_id
        if self.desc is not None:
            result['desc'] = self.desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        if m.get('algorithm') is not None:
            self.algorithm = m.get('algorithm')
        if m.get('compress') is not None:
            self.compress = m.get('compress')
        if m.get('cert_req') is not None:
            self.cert_req = m.get('cert_req')
        if m.get('trans_id') is not None:
            self.trans_id = m.get('trans_id')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        return self


class GetTasTransactionattestationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sn: str = None,
        ctsr: str = None,
        ts: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # serialNumber，凭证编号 （在校验的时需要先填写凭证编号）
        self.sn = sn
        # 精简后的时间戳完整编码（在校验时需要提交）
        self.ctsr = ctsr
        # 时间信息，从1970年1月1日起至当前时间的毫秒数(13位数字)
        self.ts = ts

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
        if self.sn is not None:
            result['sn'] = self.sn
        if self.ctsr is not None:
            result['ctsr'] = self.ctsr
        if self.ts is not None:
            result['ts'] = self.ts
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sn') is not None:
            self.sn = m.get('sn')
        if m.get('ctsr') is not None:
            self.ctsr = m.get('ctsr')
        if m.get('ts') is not None:
            self.ts = m.get('ts')
        return self


class QueryEverifyFourmetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ep_cert_name: str = None,
        ep_cert_no: str = None,
        legal_person_cert_name: str = None,
        legal_person_cert_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 某某有限公司
        self.ep_cert_name = ep_cert_name
        # 企业证件号
        self.ep_cert_no = ep_cert_no
        # 法人姓名
        self.legal_person_cert_name = legal_person_cert_name
        # 企业法人身份证号码
        self.legal_person_cert_no = legal_person_cert_no

    def validate(self):
        self.validate_required(self.ep_cert_name, 'ep_cert_name')
        self.validate_required(self.ep_cert_no, 'ep_cert_no')
        self.validate_required(self.legal_person_cert_name, 'legal_person_cert_name')
        self.validate_required(self.legal_person_cert_no, 'legal_person_cert_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ep_cert_name is not None:
            result['ep_cert_name'] = self.ep_cert_name
        if self.ep_cert_no is not None:
            result['ep_cert_no'] = self.ep_cert_no
        if self.legal_person_cert_name is not None:
            result['legal_person_cert_name'] = self.legal_person_cert_name
        if self.legal_person_cert_no is not None:
            result['legal_person_cert_no'] = self.legal_person_cert_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ep_cert_name') is not None:
            self.ep_cert_name = m.get('ep_cert_name')
        if m.get('ep_cert_no') is not None:
            self.ep_cert_no = m.get('ep_cert_no')
        if m.get('legal_person_cert_name') is not None:
            self.legal_person_cert_name = m.get('legal_person_cert_name')
        if m.get('legal_person_cert_no') is not None:
            self.legal_person_cert_no = m.get('legal_person_cert_no')
        return self


class QueryEverifyFourmetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        enterprise_status: str = None,
        open_time: str = None,
        passed: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 0:核验成功
        # 1:企业信息有误
        # 2:企业非正常营业
        self.code = code
        # 企业经营状态
        self.enterprise_status = enterprise_status
        # 营业期限
        self.open_time = open_time
        # 认证是否通过
        self.passed = passed

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
        if self.enterprise_status is not None:
            result['enterprise_status'] = self.enterprise_status
        if self.open_time is not None:
            result['open_time'] = self.open_time
        if self.passed is not None:
            result['passed'] = self.passed
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
        if m.get('enterprise_status') is not None:
            self.enterprise_status = m.get('enterprise_status')
        if m.get('open_time') is not None:
            self.open_time = m.get('open_time')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        return self


class QueryEverifyThreemetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ep_cert_name: str = None,
        ep_cert_no: str = None,
        legal_person_cert_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业名称
        self.ep_cert_name = ep_cert_name
        # 企业证件号
        self.ep_cert_no = ep_cert_no
        # 法人姓名
        self.legal_person_cert_name = legal_person_cert_name

    def validate(self):
        self.validate_required(self.ep_cert_name, 'ep_cert_name')
        self.validate_required(self.ep_cert_no, 'ep_cert_no')
        self.validate_required(self.legal_person_cert_name, 'legal_person_cert_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ep_cert_name is not None:
            result['ep_cert_name'] = self.ep_cert_name
        if self.ep_cert_no is not None:
            result['ep_cert_no'] = self.ep_cert_no
        if self.legal_person_cert_name is not None:
            result['legal_person_cert_name'] = self.legal_person_cert_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ep_cert_name') is not None:
            self.ep_cert_name = m.get('ep_cert_name')
        if m.get('ep_cert_no') is not None:
            self.ep_cert_no = m.get('ep_cert_no')
        if m.get('legal_person_cert_name') is not None:
            self.legal_person_cert_name = m.get('legal_person_cert_name')
        return self


class QueryEverifyThreemetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        enterprise_status: str = None,
        open_time: str = None,
        passed: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 0:核验成功
        # 1:企业信息有误
        # 2:企业非正常营业
        self.code = code
        # 经营状态
        self.enterprise_status = enterprise_status
        # 营业期限
        self.open_time = open_time
        # 认证是否通过
        self.passed = passed

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
        if self.enterprise_status is not None:
            result['enterprise_status'] = self.enterprise_status
        if self.open_time is not None:
            result['open_time'] = self.open_time
        if self.passed is not None:
            result['passed'] = self.passed
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
        if m.get('enterprise_status') is not None:
            self.enterprise_status = m.get('enterprise_status')
        if m.get('open_time') is not None:
            self.open_time = m.get('open_time')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        return self


class QueryEverifyTwometaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ep_cert_name: str = None,
        ep_cert_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业名称
        self.ep_cert_name = ep_cert_name
        # 企业证件号
        self.ep_cert_no = ep_cert_no

    def validate(self):
        self.validate_required(self.ep_cert_name, 'ep_cert_name')
        self.validate_required(self.ep_cert_no, 'ep_cert_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
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
        if m.get('ep_cert_name') is not None:
            self.ep_cert_name = m.get('ep_cert_name')
        if m.get('ep_cert_no') is not None:
            self.ep_cert_no = m.get('ep_cert_no')
        return self


class QueryEverifyTwometaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        enterprise_status: str = None,
        open_time: str = None,
        passed: bool = None,
        code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 经营状态
        self.enterprise_status = enterprise_status
        # 营业期限
        self.open_time = open_time
        # 认证是否通过
        self.passed = passed
        # 0:核验成功
        # 1:企业信息有误
        # 2:企业非正常营业
        self.code = code

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
        if self.enterprise_status is not None:
            result['enterprise_status'] = self.enterprise_status
        if self.open_time is not None:
            result['open_time'] = self.open_time
        if self.passed is not None:
            result['passed'] = self.passed
        if self.code is not None:
            result['code'] = self.code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('enterprise_status') is not None:
            self.enterprise_status = m.get('enterprise_status')
        if m.get('open_time') is not None:
            self.open_time = m.get('open_time')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        if m.get('code') is not None:
            self.code = m.get('code')
        return self


class QueryBaicorpInternalsearchlibraryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        account_id: str = None,
        biz_id: str = None,
        company_id: str = None,
        content_id: str = None,
        custom_id: str = None,
        entity_data: str = None,
        entity_desc: str = None,
        entity_type: str = None,
        entity_url: str = None,
        timestamp: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 账户ID，账户粒度ID。
        self.account_id = account_id
        # 产品ID
        self.biz_id = biz_id
        # 商户ID，即平台用户ID。
        self.company_id = company_id
        # 内容ID
        self.content_id = content_id
        # 基于安全考虑，填充NonceId
        self.custom_id = custom_id
        # 待检测内容的raw data，这期暂不使用
        self.entity_data = entity_data
        # 待检测字段的描述信息，包括标题、描述或关键词，json格式字符串
        self.entity_desc = entity_desc
        # 待检测内容类型，[TEXT, PICTURE, VIDEO, HTML]
        self.entity_type = entity_type
        # 1、待检测内容oss url（后续可以扩展为非oss的文件url）
        # 2、假如使用AK访问，此处填写fileid。
        self.entity_url = entity_url
        # 时间戳
        self.timestamp = timestamp

    def validate(self):
        self.validate_required(self.account_id, 'account_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.company_id, 'company_id')
        self.validate_required(self.content_id, 'content_id')
        self.validate_required(self.custom_id, 'custom_id')
        self.validate_required(self.entity_type, 'entity_type')
        self.validate_required(self.entity_url, 'entity_url')
        self.validate_required(self.timestamp, 'timestamp')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.company_id is not None:
            result['company_id'] = self.company_id
        if self.content_id is not None:
            result['content_id'] = self.content_id
        if self.custom_id is not None:
            result['custom_id'] = self.custom_id
        if self.entity_data is not None:
            result['entity_data'] = self.entity_data
        if self.entity_desc is not None:
            result['entity_desc'] = self.entity_desc
        if self.entity_type is not None:
            result['entity_type'] = self.entity_type
        if self.entity_url is not None:
            result['entity_url'] = self.entity_url
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        if m.get('content_id') is not None:
            self.content_id = m.get('content_id')
        if m.get('custom_id') is not None:
            self.custom_id = m.get('custom_id')
        if m.get('entity_data') is not None:
            self.entity_data = m.get('entity_data')
        if m.get('entity_desc') is not None:
            self.entity_desc = m.get('entity_desc')
        if m.get('entity_type') is not None:
            self.entity_type = m.get('entity_type')
        if m.get('entity_url') is not None:
            self.entity_url = m.get('entity_url')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        return self


class QueryBaicorpInternalsearchlibraryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        custom_id: str = None,
        model_info: str = None,
        repeat_info: str = None,
        similarity_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # NoucelId
        self.custom_id = custom_id
        # 采用的模型以及版本说明
        self.model_info = model_info
        # 重复列表，json list格式
        self.repeat_info = repeat_info
        # 相似度信息列表，json list格式
        self.similarity_info = similarity_info

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
        if self.custom_id is not None:
            result['custom_id'] = self.custom_id
        if self.model_info is not None:
            result['model_info'] = self.model_info
        if self.repeat_info is not None:
            result['repeat_info'] = self.repeat_info
        if self.similarity_info is not None:
            result['similarity_info'] = self.similarity_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('custom_id') is not None:
            self.custom_id = m.get('custom_id')
        if m.get('model_info') is not None:
            self.model_info = m.get('model_info')
        if m.get('repeat_info') is not None:
            self.repeat_info = m.get('repeat_info')
        if m.get('similarity_info') is not None:
            self.similarity_info = m.get('similarity_info')
        return self


class UpdateBaicorpInternalsearchlibraryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        account_id: str = None,
        biz_id: str = None,
        company_id: str = None,
        content_id: str = None,
        custom_id: str = None,
        entity_data: str = None,
        entity_desc: str = None,
        entity_type: str = None,
        entity_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 账户ID，账户粒度ID。
        self.account_id = account_id
        # 产品ID，[BANQUAN, PAIPAI]
        self.biz_id = biz_id
        # 商户ID，即平台用户ID。
        self.company_id = company_id
        # 内容ID
        self.content_id = content_id
        # 
        # 基于安全考虑，填充NonceId。
        self.custom_id = custom_id
        # 待检测内容的raw data，这期暂不使用
        self.entity_data = entity_data
        # 待检测字段的描述信息，包括标题、描述或关键词，json格式字符串。
        self.entity_desc = entity_desc
        # 待检测内容类型，[TEXT, PICTURE, VIDEO, HTML]
        self.entity_type = entity_type
        # 1.待检测内容oss url（后续可以扩展为非oss的文件url）。
        # 2.假如使用AK访问，此处填写fileid。
        self.entity_url = entity_url

    def validate(self):
        self.validate_required(self.account_id, 'account_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.company_id, 'company_id')
        self.validate_required(self.content_id, 'content_id')
        self.validate_required(self.custom_id, 'custom_id')
        self.validate_required(self.entity_data, 'entity_data')
        self.validate_required(self.entity_desc, 'entity_desc')
        self.validate_required(self.entity_type, 'entity_type')
        self.validate_required(self.entity_url, 'entity_url')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.company_id is not None:
            result['company_id'] = self.company_id
        if self.content_id is not None:
            result['content_id'] = self.content_id
        if self.custom_id is not None:
            result['custom_id'] = self.custom_id
        if self.entity_data is not None:
            result['entity_data'] = self.entity_data
        if self.entity_desc is not None:
            result['entity_desc'] = self.entity_desc
        if self.entity_type is not None:
            result['entity_type'] = self.entity_type
        if self.entity_url is not None:
            result['entity_url'] = self.entity_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        if m.get('content_id') is not None:
            self.content_id = m.get('content_id')
        if m.get('custom_id') is not None:
            self.custom_id = m.get('custom_id')
        if m.get('entity_data') is not None:
            self.entity_data = m.get('entity_data')
        if m.get('entity_desc') is not None:
            self.entity_desc = m.get('entity_desc')
        if m.get('entity_type') is not None:
            self.entity_type = m.get('entity_type')
        if m.get('entity_url') is not None:
            self.entity_url = m.get('entity_url')
        return self


class UpdateBaicorpInternalsearchlibraryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        custom_id: str = None,
        update_result: str = None,
        update_desc: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # NounceId
        self.custom_id = custom_id
        # 更新是否成功
        self.update_result = update_result
        # 更新描述、更新失败原因
        self.update_desc = update_desc

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
        if self.custom_id is not None:
            result['custom_id'] = self.custom_id
        if self.update_result is not None:
            result['update_result'] = self.update_result
        if self.update_desc is not None:
            result['update_desc'] = self.update_desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('custom_id') is not None:
            self.custom_id = m.get('custom_id')
        if m.get('update_result') is not None:
            self.update_result = m.get('update_result')
        if m.get('update_desc') is not None:
            self.update_desc = m.get('update_desc')
        return self


class QueryEpayauthRootbankRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bank_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 支持全称，或部分名称 如果不传名称，系统默认将返回热门银行，如果用户期望的银行不是热门银行，可以建议用户输入银行名称进行查询。
        self.bank_name = bank_name

    def validate(self):
        self.validate_required(self.bank_name, 'bank_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bank_name is not None:
            result['bank_name'] = self.bank_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bank_name') is not None:
            self.bank_name = m.get('bank_name')
        return self


class QueryEpayauthRootbankResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        bank_details: List[Institution] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 银行列表
        self.bank_details = bank_details

    def validate(self):
        if self.bank_details:
            for k in self.bank_details:
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
        result['bank_details'] = []
        if self.bank_details is not None:
            for k in self.bank_details:
                result['bank_details'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.bank_details = []
        if m.get('bank_details') is not None:
            for k in m.get('bank_details'):
                temp_model = Institution()
                self.bank_details.append(temp_model.from_map(k))
        return self


class QueryYdapplyprotEcapplyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cert_no: str = None,
        mobile: str = None,
        user_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户证件号码
        self.cert_no = cert_no
        # 用户手机号码
        self.mobile = mobile
        # 用户姓名
        self.user_name = user_name

    def validate(self):
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.mobile, 'mobile')
        self.validate_required(self.user_name, 'user_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.user_name is not None:
            result['user_name'] = self.user_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        return self


class QueryYdapplyprotEcapplyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        passed: bool = None,
        score: str = None,
        strategies: List[str] = None,
        decision: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 核验是否通过
        self.passed = passed
        # 风险分
        self.score = score
        # 命中的策略列表
        self.strategies = strategies
        # 风险决策结果
        self.decision = decision

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
        if self.passed is not None:
            result['passed'] = self.passed
        if self.score is not None:
            result['score'] = self.score
        if self.strategies is not None:
            result['strategies'] = self.strategies
        if self.decision is not None:
            result['decision'] = self.decision
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('strategies') is not None:
            self.strategies = m.get('strategies')
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        return self


class QueryYdpacprotEcpacRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        mobile: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户手机号
        self.mobile = mobile

    def validate(self):
        self.validate_required(self.mobile, 'mobile')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.mobile is not None:
            result['mobile'] = self.mobile
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        return self


class QueryYdpacprotEcpacResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        passed: bool = None,
        score: str = None,
        strategies: List[str] = None,
        decision: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 认证是否通过
        self.passed = passed
        # 模型分数
        self.score = score
        # 命中策略列表
        self.strategies = strategies
        # 风险决策结果
        self.decision = decision

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
        if self.passed is not None:
            result['passed'] = self.passed
        if self.score is not None:
            result['score'] = self.score
        if self.strategies is not None:
            result['strategies'] = self.strategies
        if self.decision is not None:
            result['decision'] = self.decision
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('strategies') is not None:
            self.strategies = m.get('strategies')
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        return self


class QueryYdauthprotTwometaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cert_no: str = None,
        user_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 被核验用户的身份证号
        self.cert_no = cert_no
        # 被核验用户的姓名
        self.user_name = user_name

    def validate(self):
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.user_name, 'user_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.user_name is not None:
            result['user_name'] = self.user_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        return self


class QueryYdauthprotTwometaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        passed: bool = None,
        score: str = None,
        strategies: List[str] = None,
        decision: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 核验是否通过
        self.passed = passed
        # 风险分
        self.score = score
        # 命中的策略列表
        self.strategies = strategies
        # 风险决策结果
        self.decision = decision

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
        if self.passed is not None:
            result['passed'] = self.passed
        if self.score is not None:
            result['score'] = self.score
        if self.strategies is not None:
            result['strategies'] = self.strategies
        if self.decision is not None:
            result['decision'] = self.decision
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('strategies') is not None:
            self.strategies = m.get('strategies')
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        return self


class QueryYdauthprotThreemetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cert_no: str = None,
        mobile: str = None,
        user_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 被核验用户的身份证号
        self.cert_no = cert_no
        # 被核验用户的手机号
        self.mobile = mobile
        # 被核验用户姓名
        self.user_name = user_name

    def validate(self):
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.mobile, 'mobile')
        self.validate_required(self.user_name, 'user_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.user_name is not None:
            result['user_name'] = self.user_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        return self


class QueryYdauthprotThreemetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        passed: bool = None,
        score: str = None,
        strategies: List[str] = None,
        decision: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 核验是否通过
        self.passed = passed
        # 风险分
        self.score = score
        # 命中的策略列表
        self.strategies = strategies
        # 风险决策结果
        self.decision = decision

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
        if self.passed is not None:
            result['passed'] = self.passed
        if self.score is not None:
            result['score'] = self.score
        if self.strategies is not None:
            result['strategies'] = self.strategies
        if self.decision is not None:
            result['decision'] = self.decision
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('strategies') is not None:
            self.strategies = m.get('strategies')
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        return self


class QueryYdauthprotFourmetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        card_no: str = None,
        cert_no: str = None,
        mobile: str = None,
        user_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 被核验用户的银行卡号
        self.card_no = card_no
        # 被核验用户的身份证号
        self.cert_no = cert_no
        # 被核验用户的手机号
        self.mobile = mobile
        # 被核验用户的姓名
        self.user_name = user_name

    def validate(self):
        self.validate_required(self.card_no, 'card_no')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.mobile, 'mobile')
        self.validate_required(self.user_name, 'user_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.card_no is not None:
            result['card_no'] = self.card_no
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.user_name is not None:
            result['user_name'] = self.user_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('card_no') is not None:
            self.card_no = m.get('card_no')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        return self


class QueryYdauthprotFourmetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        passed: bool = None,
        score: str = None,
        strategies: List[str] = None,
        decision: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 核验是否通过
        self.passed = passed
        # 风险分
        self.score = score
        # 命中的策略列表
        self.strategies = strategies
        # 风险决策结果
        self.decision = decision

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
        if self.passed is not None:
            result['passed'] = self.passed
        if self.score is not None:
            result['score'] = self.score
        if self.strategies is not None:
            result['strategies'] = self.strategies
        if self.decision is not None:
            result['decision'] = self.decision
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('strategies') is not None:
            self.strategies = m.get('strategies')
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        return self


class QueryYdmktprotEcmarketcampaignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        mobile: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户手机号
        self.mobile = mobile

    def validate(self):
        self.validate_required(self.mobile, 'mobile')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.mobile is not None:
            result['mobile'] = self.mobile
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        return self


class QueryYdmktprotEcmarketcampaignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        passed: bool = None,
        score: str = None,
        strategies: List[str] = None,
        decision: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 核验是否通过
        self.passed = passed
        # 风险分
        self.score = score
        # 命中的策略列表
        self.strategies = strategies
        # 风险决策结果
        self.decision = decision

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
        if self.passed is not None:
            result['passed'] = self.passed
        if self.score is not None:
            result['score'] = self.score
        if self.strategies is not None:
            result['strategies'] = self.strategies
        if self.decision is not None:
            result['decision'] = self.decision
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('strategies') is not None:
            self.strategies = m.get('strategies')
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        return self


class QueryYdregprotEcregisterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        mobile: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户手机号
        self.mobile = mobile

    def validate(self):
        self.validate_required(self.mobile, 'mobile')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.mobile is not None:
            result['mobile'] = self.mobile
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        return self


class QueryYdregprotEcregisterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        passed: bool = None,
        score: str = None,
        strategies: List[str] = None,
        decision: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否核验通过
        self.passed = passed
        # 风险分
        self.score = score
        # 命中的策略列表
        self.strategies = strategies
        # 风险决策结果
        self.decision = decision

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
        if self.passed is not None:
            result['passed'] = self.passed
        if self.score is not None:
            result['score'] = self.score
        if self.strategies is not None:
            result['strategies'] = self.strategies
        if self.decision is not None:
            result['decision'] = self.decision
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('strategies') is not None:
            self.strategies = m.get('strategies')
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        return self


class QueryEpayauthBranchbankRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bank_name: str = None,
        district_code: str = None,
        root_bank_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 银行名称，支持全称，或部分名称
        # bank_name和district_code至少有一个不为空
        self.bank_name = bank_name
        # 行政地区编码
        # bank_name和district_code至少有一个不为空
        self.district_code = district_code
        # 总行联行号
        self.root_bank_code = root_bank_code

    def validate(self):
        self.validate_required(self.root_bank_code, 'root_bank_code')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bank_name is not None:
            result['bank_name'] = self.bank_name
        if self.district_code is not None:
            result['district_code'] = self.district_code
        if self.root_bank_code is not None:
            result['root_bank_code'] = self.root_bank_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bank_name') is not None:
            self.bank_name = m.get('bank_name')
        if m.get('district_code') is not None:
            self.district_code = m.get('district_code')
        if m.get('root_bank_code') is not None:
            self.root_bank_code = m.get('root_bank_code')
        return self


class QueryEpayauthBranchbankResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        bank_details: List[Institution] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # Institution列表
        self.bank_details = bank_details

    def validate(self):
        if self.bank_details:
            for k in self.bank_details:
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
        result['bank_details'] = []
        if self.bank_details is not None:
            for k in self.bank_details:
                result['bank_details'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.bank_details = []
        if m.get('bank_details') is not None:
            for k in m.get('bank_details'):
                temp_model = Institution()
                self.bank_details.append(temp_model.from_map(k))
        return self


class QueryEpayauthDistrictRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        parent_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 父级行政地区编码。 不填则默认查询省级行政地区编码，支持省市县三级查询。
        self.parent_code = parent_code

    def validate(self):
        self.validate_required(self.parent_code, 'parent_code')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.parent_code is not None:
            result['parent_code'] = self.parent_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('parent_code') is not None:
            self.parent_code = m.get('parent_code')
        return self


class QueryEpayauthDistrictResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        district_details: List[Institution] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # District列表
        self.district_details = district_details

    def validate(self):
        if self.district_details:
            for k in self.district_details:
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
        result['district_details'] = []
        if self.district_details is not None:
            for k in self.district_details:
                result['district_details'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.district_details = []
        if m.get('district_details') is not None:
            for k in m.get('district_details'):
                temp_model = Institution()
                self.district_details.append(temp_model.from_map(k))
        return self


class InitEpayauthVerifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bank_card_no: str = None,
        bank_code: str = None,
        callback_url: str = None,
        ep_cert_name: str = None,
        ep_cert_no: str = None,
        legal_person_cert_name: str = None,
        legal_person_cert_no: str = None,
        mobile: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待认证银行卡号
        # 
        self.bank_card_no = bank_card_no
        # 人行联行号
        self.bank_code = bank_code
        # 回调通知地址
        self.callback_url = callback_url
        # 企业名称
        self.ep_cert_name = ep_cert_name
        # 企业证件号
        self.ep_cert_no = ep_cert_no
        # 法人姓名
        self.legal_person_cert_name = legal_person_cert_name
        # 企业法人身份证号码
        self.legal_person_cert_no = legal_person_cert_no
        # 手机号码 用于接收打款验证通知短信
        self.mobile = mobile

    def validate(self):
        self.validate_required(self.bank_card_no, 'bank_card_no')
        self.validate_required(self.bank_code, 'bank_code')
        self.validate_required(self.callback_url, 'callback_url')
        self.validate_required(self.ep_cert_name, 'ep_cert_name')
        self.validate_required(self.ep_cert_no, 'ep_cert_no')
        self.validate_required(self.legal_person_cert_name, 'legal_person_cert_name')
        self.validate_required(self.legal_person_cert_no, 'legal_person_cert_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bank_card_no is not None:
            result['bank_card_no'] = self.bank_card_no
        if self.bank_code is not None:
            result['bank_code'] = self.bank_code
        if self.callback_url is not None:
            result['callback_url'] = self.callback_url
        if self.ep_cert_name is not None:
            result['ep_cert_name'] = self.ep_cert_name
        if self.ep_cert_no is not None:
            result['ep_cert_no'] = self.ep_cert_no
        if self.legal_person_cert_name is not None:
            result['legal_person_cert_name'] = self.legal_person_cert_name
        if self.legal_person_cert_no is not None:
            result['legal_person_cert_no'] = self.legal_person_cert_no
        if self.mobile is not None:
            result['mobile'] = self.mobile
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bank_card_no') is not None:
            self.bank_card_no = m.get('bank_card_no')
        if m.get('bank_code') is not None:
            self.bank_code = m.get('bank_code')
        if m.get('callback_url') is not None:
            self.callback_url = m.get('callback_url')
        if m.get('ep_cert_name') is not None:
            self.ep_cert_name = m.get('ep_cert_name')
        if m.get('ep_cert_no') is not None:
            self.ep_cert_no = m.get('ep_cert_no')
        if m.get('legal_person_cert_name') is not None:
            self.legal_person_cert_name = m.get('legal_person_cert_name')
        if m.get('legal_person_cert_no') is not None:
            self.legal_person_cert_no = m.get('legal_person_cert_no')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        return self


class InitEpayauthVerifyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        verify_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 2017070610120520200000000051240001626725
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
        if m.get('verify_id') is not None:
            self.verify_id = m.get('verify_id')
        return self


class QueryEpayauthVerifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        amount: str = None,
        currency: str = None,
        verify_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 打款金额，只支持两位小数点的正数，单位：元
        self.amount = amount
        # 支付币种
        self.currency = currency
        # 打款验证ID 打款验证受理后生成的一个唯一标识
        self.verify_id = verify_id

    def validate(self):
        self.validate_required(self.amount, 'amount')
        self.validate_required(self.currency, 'currency')
        self.validate_required(self.verify_id, 'verify_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.amount is not None:
            result['amount'] = self.amount
        if self.currency is not None:
            result['currency'] = self.currency
        if self.verify_id is not None:
            result['verify_id'] = self.verify_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('verify_id') is not None:
            self.verify_id = m.get('verify_id')
        return self


class QueryEpayauthVerifyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        valid: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 验证是否成功
        self.valid = valid

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
        if self.valid is not None:
            result['valid'] = self.valid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('valid') is not None:
            self.valid = m.get('valid')
        return self


class QueryBmpbrowserTransactionqrcodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        contract_id: str = None,
        hash: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 蚂蚁区块链的唯一链id
        self.bizid = bizid
        # 链上合约id
        self.contract_id = contract_id
        # 蚂蚁区块链的链上交易hash值
        self.hash = hash

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.hash, 'hash')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.contract_id is not None:
            result['contract_id'] = self.contract_id
        if self.hash is not None:
            result['hash'] = self.hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('contract_id') is not None:
            self.contract_id = m.get('contract_id')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        return self


class QueryBmpbrowserTransactionqrcodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        qr_code_download_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易二维码二进制内容的Base64编码
        self.qr_code_download_url = qr_code_download_url

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
        if self.qr_code_download_url is not None:
            result['qr_code_download_url'] = self.qr_code_download_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('qr_code_download_url') is not None:
            self.qr_code_download_url = m.get('qr_code_download_url')
        return self


class AddBmpbrowserPrivilegeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        phone_numbers: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 蚂蚁区块链的唯一链id
        self.bizid = bizid
        # 授权查看权限的支付宝电话号码集合
        self.phone_numbers = phone_numbers

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.phone_numbers, 'phone_numbers')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.phone_numbers is not None:
            result['phone_numbers'] = self.phone_numbers
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('phone_numbers') is not None:
            self.phone_numbers = m.get('phone_numbers')
        return self


class AddBmpbrowserPrivilegeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 批量添加权限成功与否
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


class QueryIdcocrIdcardRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        image_content: str = None,
        side: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 身份证图片base64编码内容
        self.image_content = image_content
        # face: 身份证正面
        # back: 身份证反面
        self.side = side

    def validate(self):
        self.validate_required(self.image_content, 'image_content')
        self.validate_required(self.side, 'side')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.image_content is not None:
            result['image_content'] = self.image_content
        if self.side is not None:
            result['side'] = self.side
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('image_content') is not None:
            self.image_content = m.get('image_content')
        if m.get('side') is not None:
            self.side = m.get('side')
        return self


class QueryIdcocrIdcardResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        address: str = None,
        birth: str = None,
        error_content: str = None,
        num: str = None,
        sex: str = None,
        success: bool = None,
        end_date: str = None,
        issue: str = None,
        start_date: str = None,
        nationality: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 地址
        self.address = address
        # 出生年月日
        self.birth = birth
        # 信息抽取失败后详细错误原因
        self.error_content = error_content
        # 身份证号码
        self.num = num
        # 性别：男/女
        self.sex = sex
        # 解析成功
        self.success = success
        # 有效期截止时间
        self.end_date = end_date
        # 公安局分案
        self.issue = issue
        # 有效期开始时间
        self.start_date = start_date
        # 民族
        self.nationality = nationality

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
        if self.address is not None:
            result['address'] = self.address
        if self.birth is not None:
            result['birth'] = self.birth
        if self.error_content is not None:
            result['error_content'] = self.error_content
        if self.num is not None:
            result['num'] = self.num
        if self.sex is not None:
            result['sex'] = self.sex
        if self.success is not None:
            result['success'] = self.success
        if self.end_date is not None:
            result['end_date'] = self.end_date
        if self.issue is not None:
            result['issue'] = self.issue
        if self.start_date is not None:
            result['start_date'] = self.start_date
        if self.nationality is not None:
            result['nationality'] = self.nationality
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('birth') is not None:
            self.birth = m.get('birth')
        if m.get('error_content') is not None:
            self.error_content = m.get('error_content')
        if m.get('num') is not None:
            self.num = m.get('num')
        if m.get('sex') is not None:
            self.sex = m.get('sex')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('end_date') is not None:
            self.end_date = m.get('end_date')
        if m.get('issue') is not None:
            self.issue = m.get('issue')
        if m.get('start_date') is not None:
            self.start_date = m.get('start_date')
        if m.get('nationality') is not None:
            self.nationality = m.get('nationality')
        return self


class InitCaCertificateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_uuid: str = None,
        command: str = None,
        config_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务唯一性uuid，用于后续的证书查询
        self.biz_uuid = biz_uuid
        # 证书请求(CSR)
        self.command = command
        # 8B75D2EEDF1658CC9C1B7C05AA600856  区块链-baasplus平台对外持牌证书服务场景
        # 2D25EFFD786590991542CAE2D14CB18E   区块链-baasplus平台对外非持牌证书服务场景
        self.config_id = config_id

    def validate(self):
        self.validate_required(self.biz_uuid, 'biz_uuid')
        self.validate_required(self.command, 'command')
        self.validate_required(self.config_id, 'config_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_uuid is not None:
            result['biz_uuid'] = self.biz_uuid
        if self.command is not None:
            result['command'] = self.command
        if self.config_id is not None:
            result['config_id'] = self.config_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_uuid') is not None:
            self.biz_uuid = m.get('biz_uuid')
        if m.get('command') is not None:
            self.command = m.get('command')
        if m.get('config_id') is not None:
            self.config_id = m.get('config_id')
        return self


class InitCaCertificateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        cert_sn: str = None,
        p_10: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 证书序列号
        self.cert_sn = cert_sn
        # 证书内容
        self.p_10 = p_10

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
        if self.cert_sn is not None:
            result['cert_sn'] = self.cert_sn
        if self.p_10 is not None:
            result['p10'] = self.p_10
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('cert_sn') is not None:
            self.cert_sn = m.get('cert_sn')
        if m.get('p10') is not None:
            self.p_10 = m.get('p10')
        return self


class InitContentriskInternalRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        audio_urls: str = None,
        biz_info: BizInfo = None,
        link_urls: str = None,
        picture_urls: str = None,
        scene_code: str = None,
        text: str = None,
        video_urls: str = None,
        account_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 进行识别的音频地址
        self.audio_urls = audio_urls
        # 内部字段
        self.biz_info = biz_info
        # 待校验连接
        self.link_urls = link_urls
        # 图片连接
        self.picture_urls = picture_urls
        # 场景码
        self.scene_code = scene_code
        # 待校验文本
        self.text = text
        # 进行识别的视频地址
        self.video_urls = video_urls
        # 用户id
        self.account_id = account_id

    def validate(self):
        self.validate_required(self.biz_info, 'biz_info')
        if self.biz_info:
            self.biz_info.validate()
        self.validate_required(self.scene_code, 'scene_code')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.audio_urls is not None:
            result['audio_urls'] = self.audio_urls
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        if self.link_urls is not None:
            result['link_urls'] = self.link_urls
        if self.picture_urls is not None:
            result['picture_urls'] = self.picture_urls
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.text is not None:
            result['text'] = self.text
        if self.video_urls is not None:
            result['video_urls'] = self.video_urls
        if self.account_id is not None:
            result['account_id'] = self.account_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('audio_urls') is not None:
            self.audio_urls = m.get('audio_urls')
        if m.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(m['biz_info'])
        if m.get('link_urls') is not None:
            self.link_urls = m.get('link_urls')
        if m.get('picture_urls') is not None:
            self.picture_urls = m.get('picture_urls')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('text') is not None:
            self.text = m.get('text')
        if m.get('video_urls') is not None:
            self.video_urls = m.get('video_urls')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        return self


class InitContentriskInternalResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        app_scene_data_id: str = None,
        event_id: str = None,
        hit_detect_items: List[HitDetectItems] = None,
        need_query: str = None,
        result_action: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 内容ID，用于查询异步识别结果时作为查询ID
        self.app_scene_data_id = app_scene_data_id
        # 内容安全同步检测返回的事件id，用于异步获取检测结果
        self.event_id = event_id
        # 命中结果详情
        self.hit_detect_items = hit_detect_items
        # 是否需要进行异步查询的标志位 need: 需要等待60秒之后进行异步查询 no_need: 不需要，已经同步返回结果
        self.need_query = need_query
        # PASSED("数据识别通过，可以在网站上正常显示")
        # 
        # REJECTED("被拒绝的数据，比如内容出现违禁词；不能出现在我们网站上")
        # 
        # CC("CC表示用户发表数据后，提示成功，自己能看到这条消息，但其它人接收不到本条消息或看不见这条消息。")
        # 
        # DELETE("删除数据, 为了不扩大化数据的传播，删除历史已经发出去的数据。")
        # 
        # REPLACE("替换部分词为 ***")
        # 
        # WARNING("提示数据，表示内容存在可疑，提示用户操作")
        # 
        # RECOVER("恢复数据，将误判断的内容，恢复回来")
        self.result_action = result_action

    def validate(self):
        if self.hit_detect_items:
            for k in self.hit_detect_items:
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
        if self.app_scene_data_id is not None:
            result['app_scene_data_id'] = self.app_scene_data_id
        if self.event_id is not None:
            result['event_id'] = self.event_id
        result['hit_detect_items'] = []
        if self.hit_detect_items is not None:
            for k in self.hit_detect_items:
                result['hit_detect_items'].append(k.to_map() if k else None)
        if self.need_query is not None:
            result['need_query'] = self.need_query
        if self.result_action is not None:
            result['result_action'] = self.result_action
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('app_scene_data_id') is not None:
            self.app_scene_data_id = m.get('app_scene_data_id')
        if m.get('event_id') is not None:
            self.event_id = m.get('event_id')
        self.hit_detect_items = []
        if m.get('hit_detect_items') is not None:
            for k in m.get('hit_detect_items'):
                temp_model = HitDetectItems()
                self.hit_detect_items.append(temp_model.from_map(k))
        if m.get('need_query') is not None:
            self.need_query = m.get('need_query')
        if m.get('result_action') is not None:
            self.result_action = m.get('result_action')
        return self


class QueryContentriskInternalRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene_code: str = None,
        app_scene_data_id: str = None,
        biz_info: BizInfo = None,
        event_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码
        self.scene_code = scene_code
        # 内容业务ID，用于进行异步识别结果的索引查询
        self.app_scene_data_id = app_scene_data_id
        # 内部参数
        self.biz_info = biz_info
        # 内容检测事件id，根据此id查询异步检测结果
        self.event_id = event_id

    def validate(self):
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.app_scene_data_id, 'app_scene_data_id')
        self.validate_required(self.biz_info, 'biz_info')
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.app_scene_data_id is not None:
            result['app_scene_data_id'] = self.app_scene_data_id
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        if self.event_id is not None:
            result['event_id'] = self.event_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('app_scene_data_id') is not None:
            self.app_scene_data_id = m.get('app_scene_data_id')
        if m.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(m['biz_info'])
        if m.get('event_id') is not None:
            self.event_id = m.get('event_id')
        return self


class QueryContentriskInternalResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        hit_detect_items: List[HitDetectItems] = None,
        result_action: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 命中结果详情
        self.hit_detect_items = hit_detect_items
        # PASSED("数据识别通过，可以在网站上正常显示") REJECTED("被拒绝的数据，比如内容出现违禁词；不能出现在我们网站上")
        self.result_action = result_action

    def validate(self):
        if self.hit_detect_items:
            for k in self.hit_detect_items:
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
        result['hit_detect_items'] = []
        if self.hit_detect_items is not None:
            for k in self.hit_detect_items:
                result['hit_detect_items'].append(k.to_map() if k else None)
        if self.result_action is not None:
            result['result_action'] = self.result_action
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.hit_detect_items = []
        if m.get('hit_detect_items') is not None:
            for k in m.get('hit_detect_items'):
                temp_model = HitDetectItems()
                self.hit_detect_items.append(temp_model.from_map(k))
        if m.get('result_action') is not None:
            self.result_action = m.get('result_action')
        return self


class InitIndividualidImageauthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cert_name: str = None,
        cert_no: str = None,
        encoded_facial_picture_front: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 姓名
        self.cert_name = cert_name
        # 身份证号
        self.cert_no = cert_no
        # Base64编码的人脸正面照片
        self.encoded_facial_picture_front = encoded_facial_picture_front

    def validate(self):
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.encoded_facial_picture_front, 'encoded_facial_picture_front')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.encoded_facial_picture_front is not None:
            result['encoded_facial_picture_front'] = self.encoded_facial_picture_front
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
        if m.get('encoded_facial_picture_front') is not None:
            self.encoded_facial_picture_front = m.get('encoded_facial_picture_front')
        return self


class InitIndividualidImageauthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        certify_id: str = None,
        passed: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 认证的唯一性id
        self.certify_id = certify_id
        # 认证是否成功
        self.passed = passed

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
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        if self.passed is not None:
            result['passed'] = self.passed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        return self


class AddIotcseAccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 序列化的json string
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class AddIotcseAccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        raw_response: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回
        self.raw_response = raw_response

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
        if self.raw_response is not None:
            result['raw_response'] = self.raw_response
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('raw_response') is not None:
            self.raw_response = m.get('raw_response')
        return self


class SaveIotcseEvidenceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 序列化的json string
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class SaveIotcseEvidenceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        raw_response: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回
        self.raw_response = raw_response

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
        if self.raw_response is not None:
            result['raw_response'] = self.raw_response
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('raw_response') is not None:
            self.raw_response = m.get('raw_response')
        return self


class QueryIotcseEvidenceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 序列化的json string
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class QueryIotcseEvidenceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        raw_response: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回
        self.raw_response = raw_response

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
        if self.raw_response is not None:
            result['raw_response'] = self.raw_response
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('raw_response') is not None:
            self.raw_response = m.get('raw_response')
        return self


class CreateDidCorporatedidagentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        extension_info: str = None,
        indexs: List[str] = None,
        owner_name: str = None,
        owner_uid: str = None,
        services: List[DidDocServicesInfo] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 扩展字段
        # { "nation": "CN", //企业注册地址 "type": "LimitedCompany", //企业类型 "name": "演示用户名", //必选字段，企业名 "licenceNo": "1111", //营业执照 "address": "1111", //企业地址 "parentName": "", //<-必选字段 业务方名 需要提前协商 "linkType": "indirect", //<- 连接类型，direct直链企业， indirect间链企业 "certifyDate": "2019-1-1", //证书颁发时间 "licenceExpireDate": "2020-1-1", //证书到期时间 "businessScope": "1111", //企业经营范围 "businessAddress": "1111", //企业经营地址 "corporateBusinessType": 0, //<- 企业类型：0 一般企业， 1 个人商户 "channelName": "" //<- 必选字段 业务渠道 需要提前沟通 }
        self.extension_info = extension_info
        # 所有需要关联的外键，外键必须已did auth key controller的did作为前缀+“sidekey:”+外键
        self.indexs = indexs
        # 企业名称
        self.owner_name = owner_name
        # 自定义企业唯一id，企业在自有模式下的唯一号bid的hash值，调用者需要保证其唯一性
        self.owner_uid = owner_uid
        # 携带自己定义的服务类型
        self.services = services

    def validate(self):
        self.validate_required(self.extension_info, 'extension_info')
        self.validate_required(self.owner_uid, 'owner_uid')
        if self.services:
            for k in self.services:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.extension_info is not None:
            result['extension_info'] = self.extension_info
        if self.indexs is not None:
            result['indexs'] = self.indexs
        if self.owner_name is not None:
            result['owner_name'] = self.owner_name
        if self.owner_uid is not None:
            result['owner_uid'] = self.owner_uid
        result['services'] = []
        if self.services is not None:
            for k in self.services:
                result['services'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('extension_info') is not None:
            self.extension_info = m.get('extension_info')
        if m.get('indexs') is not None:
            self.indexs = m.get('indexs')
        if m.get('owner_name') is not None:
            self.owner_name = m.get('owner_name')
        if m.get('owner_uid') is not None:
            self.owner_uid = m.get('owner_uid')
        self.services = []
        if m.get('services') is not None:
            for k in m.get('services'):
                temp_model = DidDocServicesInfo()
                self.services.append(temp_model.from_map(k))
        return self


class CreateDidCorporatedidagentResponse(TeaModel):
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
        # 生成的did字符串
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


class InitIndividualidFaceauthinternalRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_code: str = None,
        cert_name: str = None,
        cert_no: str = None,
        biz_info: BizInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 认证方式,FACE表示在支付宝内进行认证,FACE_SDK表示在客户的应用中进行认证 默认为FACE
        self.biz_code = biz_code
        # 姓名
        self.cert_name = cert_name
        # 身份证号
        self.cert_no = cert_no
        # 内部字段
        self.biz_info = biz_info

    def validate(self):
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.biz_info, 'biz_info')
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(m['biz_info'])
        return self


class InitIndividualidFaceauthinternalResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        certify_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 认证的唯一性id
        self.certify_id = certify_id

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
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        return self


class CertifyIndividualidFaceauthinternalRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        callback_url: str = None,
        certify_id: str = None,
        redirect_url: str = None,
        biz_info: BizInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 回调通知地址
        self.callback_url = callback_url
        # 认证的唯一性id
        # 
        self.certify_id = certify_id
        # 认证完成后回跳地址
        self.redirect_url = redirect_url
        # 内部字段
        self.biz_info = biz_info

    def validate(self):
        self.validate_required(self.certify_id, 'certify_id')
        self.validate_required(self.biz_info, 'biz_info')
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.callback_url is not None:
            result['callback_url'] = self.callback_url
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        if self.redirect_url is not None:
            result['redirect_url'] = self.redirect_url
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('callback_url') is not None:
            self.callback_url = m.get('callback_url')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('redirect_url') is not None:
            self.redirect_url = m.get('redirect_url')
        if m.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(m['biz_info'])
        return self


class CertifyIndividualidFaceauthinternalResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        certify_id: str = None,
        verify_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 认证的唯一性id
        self.certify_id = certify_id
        # 认证url
        self.verify_url = verify_url

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
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        if self.verify_url is not None:
            result['verify_url'] = self.verify_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('verify_url') is not None:
            self.verify_url = m.get('verify_url')
        return self


class QueryIndividualidFaceauthinternalRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_info: BizInfo = None,
        certify_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 内部字段
        self.biz_info = biz_info
        # 认证的唯一性id
        self.certify_id = certify_id

    def validate(self):
        self.validate_required(self.biz_info, 'biz_info')
        if self.biz_info:
            self.biz_info.validate()
        self.validate_required(self.certify_id, 'certify_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(m['biz_info'])
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        return self


class QueryIndividualidFaceauthinternalResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        certify_id: str = None,
        passed: bool = None,
        finished: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 认证的唯一性id
        self.certify_id = certify_id
        # 是否认证通过
        self.passed = passed
        # 用户是否完成刷脸
        self.finished = finished

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
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        if self.passed is not None:
            result['passed'] = self.passed
        if self.finished is not None:
            result['finished'] = self.finished
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        if m.get('finished') is not None:
            self.finished = m.get('finished')
        return self


class InitEnterpriseidFaceauthinternalRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ep_cert_name: str = None,
        ep_cert_no: str = None,
        ep_cert_type: str = None,
        legal_person_cert_name: str = None,
        legal_person_cert_no: str = None,
        biz_info: BizInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业名称
        self.ep_cert_name = ep_cert_name
        # 企业证件号
        self.ep_cert_no = ep_cert_no
        # 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
        self.ep_cert_type = ep_cert_type
        # 企业法人姓名
        self.legal_person_cert_name = legal_person_cert_name
        # 企业法人身份证号（目前只支持身份证号）
        # 
        self.legal_person_cert_no = legal_person_cert_no
        # 内部字段
        self.biz_info = biz_info

    def validate(self):
        self.validate_required(self.ep_cert_name, 'ep_cert_name')
        self.validate_required(self.ep_cert_no, 'ep_cert_no')
        self.validate_required(self.ep_cert_type, 'ep_cert_type')
        self.validate_required(self.legal_person_cert_name, 'legal_person_cert_name')
        self.validate_required(self.legal_person_cert_no, 'legal_person_cert_no')
        self.validate_required(self.biz_info, 'biz_info')
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ep_cert_name is not None:
            result['ep_cert_name'] = self.ep_cert_name
        if self.ep_cert_no is not None:
            result['ep_cert_no'] = self.ep_cert_no
        if self.ep_cert_type is not None:
            result['ep_cert_type'] = self.ep_cert_type
        if self.legal_person_cert_name is not None:
            result['legal_person_cert_name'] = self.legal_person_cert_name
        if self.legal_person_cert_no is not None:
            result['legal_person_cert_no'] = self.legal_person_cert_no
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ep_cert_name') is not None:
            self.ep_cert_name = m.get('ep_cert_name')
        if m.get('ep_cert_no') is not None:
            self.ep_cert_no = m.get('ep_cert_no')
        if m.get('ep_cert_type') is not None:
            self.ep_cert_type = m.get('ep_cert_type')
        if m.get('legal_person_cert_name') is not None:
            self.legal_person_cert_name = m.get('legal_person_cert_name')
        if m.get('legal_person_cert_no') is not None:
            self.legal_person_cert_no = m.get('legal_person_cert_no')
        if m.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(m['biz_info'])
        return self


class InitEnterpriseidFaceauthinternalResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 本次认证的业务唯一性标示
        # 
        self.biz_no = biz_no

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
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        return self


class CertifyEnterpriseidFaceauthinternalRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_info: BizInfo = None,
        biz_no: str = None,
        callback_url: str = None,
        redirect_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 内部字段
        self.biz_info = biz_info
        # 认证的唯一性标示
        self.biz_no = biz_no
        # 回调通知地址
        # 
        self.callback_url = callback_url
        # https://www.example.com/redircet
        self.redirect_url = redirect_url

    def validate(self):
        self.validate_required(self.biz_info, 'biz_info')
        if self.biz_info:
            self.biz_info.validate()
        self.validate_required(self.biz_no, 'biz_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.callback_url is not None:
            result['callback_url'] = self.callback_url
        if self.redirect_url is not None:
            result['redirect_url'] = self.redirect_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(m['biz_info'])
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('callback_url') is not None:
            self.callback_url = m.get('callback_url')
        if m.get('redirect_url') is not None:
            self.redirect_url = m.get('redirect_url')
        return self


class CertifyEnterpriseidFaceauthinternalResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_no: str = None,
        verify_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 认证的唯一性标示
        self.biz_no = biz_no
        # 认证url
        self.verify_url = verify_url

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
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.verify_url is not None:
            result['verify_url'] = self.verify_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('verify_url') is not None:
            self.verify_url = m.get('verify_url')
        return self


class QueryEverifyTwometainternalRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ep_cert_name: str = None,
        ep_cert_no: str = None,
        biz_info: BizInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业名称
        # 
        self.ep_cert_name = ep_cert_name
        # 企业证件号
        # 
        self.ep_cert_no = ep_cert_no
        # 内部字段
        self.biz_info = biz_info

    def validate(self):
        self.validate_required(self.ep_cert_name, 'ep_cert_name')
        self.validate_required(self.ep_cert_no, 'ep_cert_no')
        self.validate_required(self.biz_info, 'biz_info')
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ep_cert_name is not None:
            result['ep_cert_name'] = self.ep_cert_name
        if self.ep_cert_no is not None:
            result['ep_cert_no'] = self.ep_cert_no
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ep_cert_name') is not None:
            self.ep_cert_name = m.get('ep_cert_name')
        if m.get('ep_cert_no') is not None:
            self.ep_cert_no = m.get('ep_cert_no')
        if m.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(m['biz_info'])
        return self


class QueryEverifyTwometainternalResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        enterprise_status: str = None,
        open_time: str = None,
        passed: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 0:核验成功 1:企业信息有误 2:企业非正常营业
        self.code = code
        # 经营状态
        # 
        self.enterprise_status = enterprise_status
        # 营业期限
        # 
        self.open_time = open_time
        # 认证是否通过
        self.passed = passed

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
        if self.enterprise_status is not None:
            result['enterprise_status'] = self.enterprise_status
        if self.open_time is not None:
            result['open_time'] = self.open_time
        if self.passed is not None:
            result['passed'] = self.passed
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
        if m.get('enterprise_status') is not None:
            self.enterprise_status = m.get('enterprise_status')
        if m.get('open_time') is not None:
            self.open_time = m.get('open_time')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        return self


class QueryEverifyThreemetainternalRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ep_cert_name: str = None,
        ep_cert_no: str = None,
        legal_person_cert_name: str = None,
        biz_info: BizInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业名称
        # 
        self.ep_cert_name = ep_cert_name
        # 企业证件号
        # 
        self.ep_cert_no = ep_cert_no
        # 法人姓名
        self.legal_person_cert_name = legal_person_cert_name
        # 内部字段
        self.biz_info = biz_info

    def validate(self):
        self.validate_required(self.ep_cert_name, 'ep_cert_name')
        self.validate_required(self.ep_cert_no, 'ep_cert_no')
        self.validate_required(self.legal_person_cert_name, 'legal_person_cert_name')
        self.validate_required(self.biz_info, 'biz_info')
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ep_cert_name is not None:
            result['ep_cert_name'] = self.ep_cert_name
        if self.ep_cert_no is not None:
            result['ep_cert_no'] = self.ep_cert_no
        if self.legal_person_cert_name is not None:
            result['legal_person_cert_name'] = self.legal_person_cert_name
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ep_cert_name') is not None:
            self.ep_cert_name = m.get('ep_cert_name')
        if m.get('ep_cert_no') is not None:
            self.ep_cert_no = m.get('ep_cert_no')
        if m.get('legal_person_cert_name') is not None:
            self.legal_person_cert_name = m.get('legal_person_cert_name')
        if m.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(m['biz_info'])
        return self


class QueryEverifyThreemetainternalResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        enterprise_status: str = None,
        open_time: str = None,
        passed: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 0:核验成功 1:企业信息有误 2:企业非正常营业
        self.code = code
        # 经营状态
        # 
        self.enterprise_status = enterprise_status
        # 营业期限
        # 
        self.open_time = open_time
        # 认证是否通过
        # 
        self.passed = passed

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
        if self.enterprise_status is not None:
            result['enterprise_status'] = self.enterprise_status
        if self.open_time is not None:
            result['open_time'] = self.open_time
        if self.passed is not None:
            result['passed'] = self.passed
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
        if m.get('enterprise_status') is not None:
            self.enterprise_status = m.get('enterprise_status')
        if m.get('open_time') is not None:
            self.open_time = m.get('open_time')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        return self


class QueryEverifyFourmetainternalRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ep_cert_name: str = None,
        ep_cert_no: str = None,
        legal_person_cert_name: str = None,
        legal_person_cert_no: str = None,
        biz_info: BizInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业名称
        self.ep_cert_name = ep_cert_name
        # 企业证件号
        # 
        self.ep_cert_no = ep_cert_no
        # 法人姓名
        # 
        self.legal_person_cert_name = legal_person_cert_name
        # 企业法人身份证号码
        # 
        self.legal_person_cert_no = legal_person_cert_no
        # 内部字段
        self.biz_info = biz_info

    def validate(self):
        self.validate_required(self.ep_cert_name, 'ep_cert_name')
        self.validate_required(self.ep_cert_no, 'ep_cert_no')
        self.validate_required(self.legal_person_cert_name, 'legal_person_cert_name')
        self.validate_required(self.legal_person_cert_no, 'legal_person_cert_no')
        self.validate_required(self.biz_info, 'biz_info')
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ep_cert_name is not None:
            result['ep_cert_name'] = self.ep_cert_name
        if self.ep_cert_no is not None:
            result['ep_cert_no'] = self.ep_cert_no
        if self.legal_person_cert_name is not None:
            result['legal_person_cert_name'] = self.legal_person_cert_name
        if self.legal_person_cert_no is not None:
            result['legal_person_cert_no'] = self.legal_person_cert_no
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ep_cert_name') is not None:
            self.ep_cert_name = m.get('ep_cert_name')
        if m.get('ep_cert_no') is not None:
            self.ep_cert_no = m.get('ep_cert_no')
        if m.get('legal_person_cert_name') is not None:
            self.legal_person_cert_name = m.get('legal_person_cert_name')
        if m.get('legal_person_cert_no') is not None:
            self.legal_person_cert_no = m.get('legal_person_cert_no')
        if m.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(m['biz_info'])
        return self


class QueryEverifyFourmetainternalResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        enterprise_status: str = None,
        open_time: str = None,
        passed: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 0:核验成功 1:企业信息有误 2:企业非正常营业
        # 
        self.code = code
        # 企业经营状态
        # 
        self.enterprise_status = enterprise_status
        # 营业期限
        # 
        self.open_time = open_time
        # 认证是否通过
        # 
        self.passed = passed

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
        if self.enterprise_status is not None:
            result['enterprise_status'] = self.enterprise_status
        if self.open_time is not None:
            result['open_time'] = self.open_time
        if self.passed is not None:
            result['passed'] = self.passed
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
        if m.get('enterprise_status') is not None:
            self.enterprise_status = m.get('enterprise_status')
        if m.get('open_time') is not None:
            self.open_time = m.get('open_time')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        return self


class QueryEnterpriseidFaceauthinternalRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_no: str = None,
        biz_info: BizInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 认证的唯一性标示
        self.biz_no = biz_no
        # 内部字段
        self.biz_info = biz_info

    def validate(self):
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.biz_info, 'biz_info')
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(m['biz_info'])
        return self


class QueryEnterpriseidFaceauthinternalResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_no: str = None,
        failed_code: str = None,
        failed_message: str = None,
        passed: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 
        # 认证的唯一性标示
        self.biz_no = biz_no
        # 认证失败错误码
        # 
        self.failed_code = failed_code
        # 认证失败原因信息
        # 
        self.failed_message = failed_message
        # 是否认证通过
        self.passed = passed

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
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.failed_code is not None:
            result['failed_code'] = self.failed_code
        if self.failed_message is not None:
            result['failed_message'] = self.failed_message
        if self.passed is not None:
            result['passed'] = self.passed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('failed_code') is not None:
            self.failed_code = m.get('failed_code')
        if m.get('failed_message') is not None:
            self.failed_message = m.get('failed_message')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        return self


class AddIotcseThingsdidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 序列化的json string
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class AddIotcseThingsdidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        raw_response: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 暂无
        self.raw_response = raw_response

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
        if self.raw_response is not None:
            result['raw_response'] = self.raw_response
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('raw_response') is not None:
            self.raw_response = m.get('raw_response')
        return self


class UpdateIotcseThingsdidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 暂无
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class UpdateIotcseThingsdidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        raw_response: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 暂无
        self.raw_response = raw_response

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
        if self.raw_response is not None:
            result['raw_response'] = self.raw_response
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('raw_response') is not None:
            self.raw_response = m.get('raw_response')
        return self


class QueryIotcseThingsdidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 暂无
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class QueryIotcseThingsdidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        raw_response: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 暂无
        self.raw_response = raw_response

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
        if self.raw_response is not None:
            result['raw_response'] = self.raw_response
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('raw_response') is not None:
            self.raw_response = m.get('raw_response')
        return self


class QueryIotcseAsyncprocessRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # {"key":"value"}
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class QueryIotcseAsyncprocessResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        raw_response: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 暂无
        self.raw_response = raw_response

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
        if self.raw_response is not None:
            result['raw_response'] = self.raw_response
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('raw_response') is not None:
            self.raw_response = m.get('raw_response')
        return self


class ExecIotcseGroupRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 暂无
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class ExecIotcseGroupResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        raw_response: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 暂无
        self.raw_response = raw_response

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
        if self.raw_response is not None:
            result['raw_response'] = self.raw_response
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('raw_response') is not None:
            self.raw_response = m.get('raw_response')
        return self


class QueryIotcseGroupdeviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 暂无
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class QueryIotcseGroupdeviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        raw_response: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 暂无
        self.raw_response = raw_response

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
        if self.raw_response is not None:
            result['raw_response'] = self.raw_response
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('raw_response') is not None:
            self.raw_response = m.get('raw_response')
        return self


class QueryIotcseDevicegroupRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 暂无
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class QueryIotcseDevicegroupResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        raw_response: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 暂无
        self.raw_response = raw_response

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
        if self.raw_response is not None:
            result['raw_response'] = self.raw_response
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('raw_response') is not None:
            self.raw_response = m.get('raw_response')
        return self


class QueryIotcseTenantdeviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 暂无
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class QueryIotcseTenantdeviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        raw_response: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 暂无
        self.raw_response = raw_response

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
        if self.raw_response is not None:
            result['raw_response'] = self.raw_response
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('raw_response') is not None:
            self.raw_response = m.get('raw_response')
        return self


class UpdateIotcseDevicestatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 暂无
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class UpdateIotcseDevicestatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        raw_response: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 暂无
        self.raw_response = raw_response

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
        if self.raw_response is not None:
            result['raw_response'] = self.raw_response
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('raw_response') is not None:
            self.raw_response = m.get('raw_response')
        return self


class QueryIotcseDevicemodelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 暂无
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class QueryIotcseDevicemodelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        raw_response: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 暂无
        self.raw_response = raw_response

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
        if self.raw_response is not None:
            result['raw_response'] = self.raw_response
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('raw_response') is not None:
            self.raw_response = m.get('raw_response')
        return self


class UpdateIotcseDevicespaceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 暂无
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class UpdateIotcseDevicespaceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        raw_response: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 暂无
        self.raw_response = raw_response

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
        if self.raw_response is not None:
            result['raw_response'] = self.raw_response
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('raw_response') is not None:
            self.raw_response = m.get('raw_response')
        return self


class QueryIotcseEvidencebatchRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 暂无
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class QueryIotcseEvidencebatchResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        raw_response: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 暂无
        self.raw_response = raw_response

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
        if self.raw_response is not None:
            result['raw_response'] = self.raw_response
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('raw_response') is not None:
            self.raw_response = m.get('raw_response')
        return self


class QueryBlocrBusinesslicenseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        image_raw: str = None,
        image_url: str = None,
        source: str = None,
        trace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件二进制内容 + base64
        self.image_raw = image_raw
        # 图片下载url
        self.image_url = image_url
        # 服务调用来源(需要咨询服务提供方)
        self.source = source
        # 单次调用唯一标示，用于异常问题排查，调用方需要负责生成并且记录在调用日志里
        self.trace_id = trace_id

    def validate(self):
        self.validate_required(self.source, 'source')
        self.validate_required(self.trace_id, 'trace_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.image_raw is not None:
            result['image_raw'] = self.image_raw
        if self.image_url is not None:
            result['image_url'] = self.image_url
        if self.source is not None:
            result['source'] = self.source
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('image_raw') is not None:
            self.image_raw = m.get('image_raw')
        if m.get('image_url') is not None:
            self.image_url = m.get('image_url')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        return self


class QueryBlocrBusinesslicenseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        algo_msg: str = None,
        algo_ret: int = None,
        message: str = None,
        result: str = None,
        ret: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 算法错误信息
        self.algo_msg = algo_msg
        # 算法异常错误码
        self.algo_ret = algo_ret
        # 框架错误信息
        self.message = message
        # 算法结果,JSON String
        self.result = result
        # 框架inference服务错误码，0为正常
        self.ret = ret

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
        if self.algo_msg is not None:
            result['algo_msg'] = self.algo_msg
        if self.algo_ret is not None:
            result['algo_ret'] = self.algo_ret
        if self.message is not None:
            result['message'] = self.message
        if self.result is not None:
            result['result'] = self.result
        if self.ret is not None:
            result['ret'] = self.ret
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('algo_msg') is not None:
            self.algo_msg = m.get('algo_msg')
        if m.get('algo_ret') is not None:
            self.algo_ret = m.get('algo_ret')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('ret') is not None:
            self.ret = m.get('ret')
        return self


class QueryInvoicesocrVatinvoiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        image_raw: str = None,
        image_url: str = None,
        source: str = None,
        trace_id: str = None,
        file_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件二进制内容 + base64
        self.image_raw = image_raw
        # 图片下载url
        self.image_url = image_url
        # 服务调用来源(需要咨询服务提供方)
        self.source = source
        # 单次调用唯一标示，用于异常问题排查，调用方需要负责生成并且记录在调用日志里
        self.trace_id = trace_id
        # 目前只支持pdf、jpg两种file_type的识别能力，根据具体传入的发票的格式传入正确的值
        self.file_type = file_type

    def validate(self):
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.file_type, 'file_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.image_raw is not None:
            result['image_raw'] = self.image_raw
        if self.image_url is not None:
            result['image_url'] = self.image_url
        if self.source is not None:
            result['source'] = self.source
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.file_type is not None:
            result['file_type'] = self.file_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('image_raw') is not None:
            self.image_raw = m.get('image_raw')
        if m.get('image_url') is not None:
            self.image_url = m.get('image_url')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        return self


class QueryInvoicesocrVatinvoiceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        algo_msg: str = None,
        algo_ret: str = None,
        message: str = None,
        result: str = None,
        ret: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 算法错误信息
        self.algo_msg = algo_msg
        # 算法异常错误码
        # 
        self.algo_ret = algo_ret
        # 框架错误信息
        # 
        self.message = message
        # 算法结果,JSON String
        self.result = result
        # 框架inference服务错误码，0为正常
        self.ret = ret

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
        if self.algo_msg is not None:
            result['algo_msg'] = self.algo_msg
        if self.algo_ret is not None:
            result['algo_ret'] = self.algo_ret
        if self.message is not None:
            result['message'] = self.message
        if self.result is not None:
            result['result'] = self.result
        if self.ret is not None:
            result['ret'] = self.ret
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('algo_msg') is not None:
            self.algo_msg = m.get('algo_msg')
        if m.get('algo_ret') is not None:
            self.algo_ret = m.get('algo_ret')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('ret') is not None:
            self.ret = m.get('ret')
        return self


class QueryBmpbrowserPrivilegeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        phone_number: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 蚂蚁区块链的唯一链id
        # 
        self.bizid = bizid
        # 查看权限的支付宝电话号码
        # 
        self.phone_number = phone_number

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.phone_number, 'phone_number')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.phone_number is not None:
            result['phone_number'] = self.phone_number
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('phone_number') is not None:
            self.phone_number = m.get('phone_number')
        return self


class QueryBmpbrowserPrivilegeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 权限成功与否
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


class CancelBmpbrowserPrivilegeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        phone_numbers: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 蚂蚁区块链的唯一链id
        # 
        self.bizid = bizid
        # 取消查看权限的支付宝电话号码集合
        # 
        self.phone_numbers = phone_numbers

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.phone_numbers, 'phone_numbers')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.phone_numbers is not None:
            result['phone_numbers'] = self.phone_numbers
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('phone_numbers') is not None:
            self.phone_numbers = m.get('phone_numbers')
        return self


class CancelBmpbrowserPrivilegeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 批量取消权限成功与否
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


