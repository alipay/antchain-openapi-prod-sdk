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


class CaSystemMainBodyRequest(TeaModel):
    def __init__(
        self,
        pos_page: int = None,
        pos_x: str = None,
        pos_y: str = None,
    ):
        # 签署页码
        self.pos_page = pos_page
        # 签署区位置横坐标
        self.pos_x = pos_x
        # 签署区位置纵坐标
        self.pos_y = pos_y

    def validate(self):
        self.validate_required(self.pos_page, 'pos_page')
        self.validate_required(self.pos_x, 'pos_x')
        self.validate_required(self.pos_y, 'pos_y')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.pos_page is not None:
            result['pos_page'] = self.pos_page
        if self.pos_x is not None:
            result['pos_x'] = self.pos_x
        if self.pos_y is not None:
            result['pos_y'] = self.pos_y
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pos_page') is not None:
            self.pos_page = m.get('pos_page')
        if m.get('pos_x') is not None:
            self.pos_x = m.get('pos_x')
        if m.get('pos_y') is not None:
            self.pos_y = m.get('pos_y')
        return self


class CaSystemCrossPageRequest(TeaModel):
    def __init__(
        self,
        pos_page_start: int = None,
        pos_page_end: int = None,
        pos_x: str = None,
        pos_y: str = None,
    ):
        # 签署页码
        self.pos_page_start = pos_page_start
        # 结束页码（供骑缝章使用）
        self.pos_page_end = pos_page_end
        # 签署区位置横坐标
        self.pos_x = pos_x
        # 签署区位置纵坐标
        self.pos_y = pos_y

    def validate(self):
        self.validate_required(self.pos_page_start, 'pos_page_start')
        self.validate_required(self.pos_page_end, 'pos_page_end')
        self.validate_required(self.pos_x, 'pos_x')
        self.validate_required(self.pos_y, 'pos_y')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.pos_page_start is not None:
            result['pos_page_start'] = self.pos_page_start
        if self.pos_page_end is not None:
            result['pos_page_end'] = self.pos_page_end
        if self.pos_x is not None:
            result['pos_x'] = self.pos_x
        if self.pos_y is not None:
            result['pos_y'] = self.pos_y
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pos_page_start') is not None:
            self.pos_page_start = m.get('pos_page_start')
        if m.get('pos_page_end') is not None:
            self.pos_page_end = m.get('pos_page_end')
        if m.get('pos_x') is not None:
            self.pos_x = m.get('pos_x')
        if m.get('pos_y') is not None:
            self.pos_y = m.get('pos_y')
        return self


class CaSystemSignAreaRequest(TeaModel):
    def __init__(
        self,
        seal_id: str = None,
        location_type: str = None,
        position_type: str = None,
        system_cross_page_request: CaSystemCrossPageRequest = None,
        system_main_body_request: CaSystemMainBodyRequest = None,
    ):
        # 印章id,联系签署中心获取
        self.seal_id = seal_id
        # 用印对齐类型,TOP_LEFT("TOP_LEFT", "左上角对齐"), BOTTOM_LEFT("BOTTOM_LEFT", "左下角对齐"), CENTER("CENTER", "xy值是印章的中心"), TOP_RIGHT("TOP_RIGHT", "xy值是印章右上角"), BOTTOM_RIGHT("BOTTOM_RIGHT", "xy值是印章右下角")
        self.location_type = location_type
        # 签署位置类型，1-正文，2-骑缝
        self.position_type = position_type
        # 骑缝章信息，需要盖骑缝章的时候 请传递此参数
        self.system_cross_page_request = system_cross_page_request
        # 正文章信息，正文章模式必填
        self.system_main_body_request = system_main_body_request

    def validate(self):
        self.validate_required(self.location_type, 'location_type')
        self.validate_required(self.position_type, 'position_type')
        if self.system_cross_page_request:
            self.system_cross_page_request.validate()
        if self.system_main_body_request:
            self.system_main_body_request.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.seal_id is not None:
            result['seal_id'] = self.seal_id
        if self.location_type is not None:
            result['location_type'] = self.location_type
        if self.position_type is not None:
            result['position_type'] = self.position_type
        if self.system_cross_page_request is not None:
            result['system_cross_page_request'] = self.system_cross_page_request.to_map()
        if self.system_main_body_request is not None:
            result['system_main_body_request'] = self.system_main_body_request.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('seal_id') is not None:
            self.seal_id = m.get('seal_id')
        if m.get('location_type') is not None:
            self.location_type = m.get('location_type')
        if m.get('position_type') is not None:
            self.position_type = m.get('position_type')
        if m.get('system_cross_page_request') is not None:
            temp_model = CaSystemCrossPageRequest()
            self.system_cross_page_request = temp_model.from_map(m['system_cross_page_request'])
        if m.get('system_main_body_request') is not None:
            temp_model = CaSystemMainBodyRequest()
            self.system_main_body_request = temp_model.from_map(m['system_main_body_request'])
        return self


class CaSystemSignFileRequest(TeaModel):
    def __init__(
        self,
        file_id: str = None,
        system_sign_area_request_list: List[CaSystemSignAreaRequest] = None,
    ):
        # 签署文件id,和签署文件列表fileId呼应
        self.file_id = file_id
        # 签署文件列表（包含印模和签署区域）
        self.system_sign_area_request_list = system_sign_area_request_list

    def validate(self):
        self.validate_required(self.system_sign_area_request_list, 'system_sign_area_request_list')
        if self.system_sign_area_request_list:
            for k in self.system_sign_area_request_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.file_id is not None:
            result['file_id'] = self.file_id
        result['system_sign_area_request_list'] = []
        if self.system_sign_area_request_list is not None:
            for k in self.system_sign_area_request_list:
                result['system_sign_area_request_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        self.system_sign_area_request_list = []
        if m.get('system_sign_area_request_list') is not None:
            for k in m.get('system_sign_area_request_list'):
                temp_model = CaSystemSignAreaRequest()
                self.system_sign_area_request_list.append(temp_model.from_map(k))
        return self


class CaSignFileRequest(TeaModel):
    def __init__(
        self,
        file_name: str = None,
        file_id: str = None,
    ):
        # 文件名称
        self.file_name = file_name
        # 文件id,映射唯一的文件。多文件签署场景下，fileId必须唯一且和文件一一对应
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.file_id, 'file_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class SignatoryInfo(TeaModel):
    def __init__(
        self,
        pos_page: str = None,
        pos_x: str = None,
        pos_y: str = None,
        width: str = None,
    ):
        # 页码信息 （骑缝签署页码为1-2这种，其余情况都是数字）
        self.pos_page = pos_page
        # x坐标
        self.pos_x = pos_x
        # y坐标
        self.pos_y = pos_y
        # 签署区宽 (默认为100)
        self.width = width

    def validate(self):
        self.validate_required(self.pos_page, 'pos_page')
        self.validate_required(self.pos_x, 'pos_x')
        self.validate_required(self.pos_y, 'pos_y')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.pos_page is not None:
            result['pos_page'] = self.pos_page
        if self.pos_x is not None:
            result['pos_x'] = self.pos_x
        if self.pos_y is not None:
            result['pos_y'] = self.pos_y
        if self.width is not None:
            result['width'] = self.width
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pos_page') is not None:
            self.pos_page = m.get('pos_page')
        if m.get('pos_x') is not None:
            self.pos_x = m.get('pos_x')
        if m.get('pos_y') is not None:
            self.pos_y = m.get('pos_y')
        if m.get('width') is not None:
            self.width = m.get('width')
        return self


class CaSignFileResult(TeaModel):
    def __init__(
        self,
        file_name: str = None,
        file_key: str = None,
        file_id: str = None,
        http_file_url: str = None,
    ):
        # 文件名称
        self.file_name = file_name
        # 文件osskey
        self.file_key = file_key
        # 文件id
        self.file_id = file_id
        # 文件http链接
        self.http_file_url = http_file_url

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_key is not None:
            result['file_key'] = self.file_key
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.http_file_url is not None:
            result['http_file_url'] = self.http_file_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('http_file_url') is not None:
            self.http_file_url = m.get('http_file_url')
        return self


class CaSignUserInfoRequest(TeaModel):
    def __init__(
        self,
        sign_user_type: str = None,
        signer_name: str = None,
        signer_cert_type: str = None,
        signer_cert_number: str = None,
        sign_sub_type: str = None,
        authorized: str = None,
        auth_signer_name: str = None,
        auth_signer_cert_type: str = None,
        auth_signer_cert_number: str = None,
        mobile: str = None,
        email: str = None,
        order: str = None,
        auto_sign: bool = None,
        system_sign_file_request_list: List[CaSystemSignFileRequest] = None,
    ):
        # 用户类型个人:PERSON 机构:ORG
        self.sign_user_type = sign_user_type
        # 签署方名称，个人传真实姓名：张三 机构传机构正确的名称：xxx责任有限公司
        self.signer_name = signer_name
        # 授权签署时的签署人证件类型,签署方证件类型 CRED_PSN_CH_IDCARD(大陆身份证) CRED_ORG_USCC(统一社会信用代码)
        self.signer_cert_type = signer_cert_type
        # 签署方证件号码,签署方证件号码： 个人传递身份证件号 企业传递统一社会信用编码
        self.signer_cert_number = signer_cert_number
        # 企业子类型,signUserType为org时必选 企业子类型 * BUS("BUS", "企业"), * SINGLE("SINGLE", "个体工商户"), * GOV("GOV", "党政机关"), * INST("INST", "事业单位"), * COMMON("COMMON", "社会组织"), * OTHER("OTHER", "其他组织")
        self.sign_sub_type = sign_sub_type
        # 是否指定授权人签署
        self.authorized = authorized
        # authorized=1时必填,签署方名称
        self.auth_signer_name = auth_signer_name
        # authorized=1 时必填,授权签署时的签署人证件类型
        self.auth_signer_cert_type = auth_signer_cert_type
        # authorized=1 时必填,授权签署方证件号码
        self.auth_signer_cert_number = auth_signer_cert_number
        # 手机号，用于发送签署短信
        self.mobile = mobile
        # 邮箱联系方式
        self.email = email
        # 签署顺序，默认-1无签署顺序
        self.order = order
        # 是否自动签署,ture为需要自动签署，false为手动签署
        self.auto_sign = auto_sign
        # 签署文件列表（包含印模和签署区域）
        self.system_sign_file_request_list = system_sign_file_request_list

    def validate(self):
        self.validate_required(self.sign_user_type, 'sign_user_type')
        self.validate_required(self.signer_name, 'signer_name')
        self.validate_required(self.signer_cert_type, 'signer_cert_type')
        self.validate_required(self.signer_cert_number, 'signer_cert_number')
        self.validate_required(self.auto_sign, 'auto_sign')
        self.validate_required(self.system_sign_file_request_list, 'system_sign_file_request_list')
        if self.system_sign_file_request_list:
            for k in self.system_sign_file_request_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sign_user_type is not None:
            result['sign_user_type'] = self.sign_user_type
        if self.signer_name is not None:
            result['signer_name'] = self.signer_name
        if self.signer_cert_type is not None:
            result['signer_cert_type'] = self.signer_cert_type
        if self.signer_cert_number is not None:
            result['signer_cert_number'] = self.signer_cert_number
        if self.sign_sub_type is not None:
            result['sign_sub_type'] = self.sign_sub_type
        if self.authorized is not None:
            result['authorized'] = self.authorized
        if self.auth_signer_name is not None:
            result['auth_signer_name'] = self.auth_signer_name
        if self.auth_signer_cert_type is not None:
            result['auth_signer_cert_type'] = self.auth_signer_cert_type
        if self.auth_signer_cert_number is not None:
            result['auth_signer_cert_number'] = self.auth_signer_cert_number
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.email is not None:
            result['email'] = self.email
        if self.order is not None:
            result['order'] = self.order
        if self.auto_sign is not None:
            result['auto_sign'] = self.auto_sign
        result['system_sign_file_request_list'] = []
        if self.system_sign_file_request_list is not None:
            for k in self.system_sign_file_request_list:
                result['system_sign_file_request_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sign_user_type') is not None:
            self.sign_user_type = m.get('sign_user_type')
        if m.get('signer_name') is not None:
            self.signer_name = m.get('signer_name')
        if m.get('signer_cert_type') is not None:
            self.signer_cert_type = m.get('signer_cert_type')
        if m.get('signer_cert_number') is not None:
            self.signer_cert_number = m.get('signer_cert_number')
        if m.get('sign_sub_type') is not None:
            self.sign_sub_type = m.get('sign_sub_type')
        if m.get('authorized') is not None:
            self.authorized = m.get('authorized')
        if m.get('auth_signer_name') is not None:
            self.auth_signer_name = m.get('auth_signer_name')
        if m.get('auth_signer_cert_type') is not None:
            self.auth_signer_cert_type = m.get('auth_signer_cert_type')
        if m.get('auth_signer_cert_number') is not None:
            self.auth_signer_cert_number = m.get('auth_signer_cert_number')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('order') is not None:
            self.order = m.get('order')
        if m.get('auto_sign') is not None:
            self.auto_sign = m.get('auto_sign')
        self.system_sign_file_request_list = []
        if m.get('system_sign_file_request_list') is not None:
            for k in m.get('system_sign_file_request_list'):
                temp_model = CaSystemSignFileRequest()
                self.system_sign_file_request_list.append(temp_model.from_map(k))
        return self


class CaSignOperatorResult(TeaModel):
    def __init__(
        self,
        sign_user_id: str = None,
        sign_cert_no: str = None,
        sign_cert_name: str = None,
        sign_cert_type: str = None,
        authorized: int = None,
        authorize_time: str = None,
        auth_person_cert_no: str = None,
        auth_person_cert_name: str = None,
        auth_person_cert_type: str = None,
        fail_info: str = None,
        status: str = None,
        sign_time: str = None,
        our_corp: int = None,
        mobile_number: str = None,
        email_address: str = None,
    ):
        # 签署方UserId
        self.sign_user_id = sign_user_id
        # 签署方证件号
        self.sign_cert_no = sign_cert_no
        # 签署方证件名称
        self.sign_cert_name = sign_cert_name
        # 签署方证件类型
        self.sign_cert_type = sign_cert_type
        # 是否授权
        self.authorized = authorized
        # 授权时间
        self.authorize_time = authorize_time
        # 授权人证件号码
        self.auth_person_cert_no = auth_person_cert_no
        # 授权人证件名称
        self.auth_person_cert_name = auth_person_cert_name
        # 授权人证件类型
        self.auth_person_cert_type = auth_person_cert_type
        # 签署失败原因
        self.fail_info = fail_info
        # SIGNNED
        self.status = status
        # 签署时间
        self.sign_time = sign_time
        # 是否我方公司
        self.our_corp = our_corp
        # 电话联系方式，脱敏显示
        self.mobile_number = mobile_number
        # 邮件联系地址，脱敏展示返回
        self.email_address = email_address

    def validate(self):
        self.validate_required(self.sign_user_id, 'sign_user_id')
        self.validate_required(self.sign_cert_name, 'sign_cert_name')
        if self.authorize_time is not None:
            self.validate_pattern(self.authorize_time, 'authorize_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.sign_time is not None:
            self.validate_pattern(self.sign_time, 'sign_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sign_user_id is not None:
            result['sign_user_id'] = self.sign_user_id
        if self.sign_cert_no is not None:
            result['sign_cert_no'] = self.sign_cert_no
        if self.sign_cert_name is not None:
            result['sign_cert_name'] = self.sign_cert_name
        if self.sign_cert_type is not None:
            result['sign_cert_type'] = self.sign_cert_type
        if self.authorized is not None:
            result['authorized'] = self.authorized
        if self.authorize_time is not None:
            result['authorize_time'] = self.authorize_time
        if self.auth_person_cert_no is not None:
            result['auth_person_cert_no'] = self.auth_person_cert_no
        if self.auth_person_cert_name is not None:
            result['auth_person_cert_name'] = self.auth_person_cert_name
        if self.auth_person_cert_type is not None:
            result['auth_person_cert_type'] = self.auth_person_cert_type
        if self.fail_info is not None:
            result['fail_info'] = self.fail_info
        if self.status is not None:
            result['status'] = self.status
        if self.sign_time is not None:
            result['sign_time'] = self.sign_time
        if self.our_corp is not None:
            result['our_corp'] = self.our_corp
        if self.mobile_number is not None:
            result['mobile_number'] = self.mobile_number
        if self.email_address is not None:
            result['email_address'] = self.email_address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sign_user_id') is not None:
            self.sign_user_id = m.get('sign_user_id')
        if m.get('sign_cert_no') is not None:
            self.sign_cert_no = m.get('sign_cert_no')
        if m.get('sign_cert_name') is not None:
            self.sign_cert_name = m.get('sign_cert_name')
        if m.get('sign_cert_type') is not None:
            self.sign_cert_type = m.get('sign_cert_type')
        if m.get('authorized') is not None:
            self.authorized = m.get('authorized')
        if m.get('authorize_time') is not None:
            self.authorize_time = m.get('authorize_time')
        if m.get('auth_person_cert_no') is not None:
            self.auth_person_cert_no = m.get('auth_person_cert_no')
        if m.get('auth_person_cert_name') is not None:
            self.auth_person_cert_name = m.get('auth_person_cert_name')
        if m.get('auth_person_cert_type') is not None:
            self.auth_person_cert_type = m.get('auth_person_cert_type')
        if m.get('fail_info') is not None:
            self.fail_info = m.get('fail_info')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('sign_time') is not None:
            self.sign_time = m.get('sign_time')
        if m.get('our_corp') is not None:
            self.our_corp = m.get('our_corp')
        if m.get('mobile_number') is not None:
            self.mobile_number = m.get('mobile_number')
        if m.get('email_address') is not None:
            self.email_address = m.get('email_address')
        return self


class CaSignUrlResult(TeaModel):
    def __init__(
        self,
        sign_cert_name: str = None,
        sign_cert_no: str = None,
        sign_user_id: str = None,
        encrypt_sign_cert_no: str = None,
        sign_url: str = None,
    ):
        # 签署方名称
        self.sign_cert_name = sign_cert_name
        # 签署方证件号（脱敏）
        self.sign_cert_no = sign_cert_no
        # 签署方id
        self.sign_user_id = sign_user_id
        # 加密后的签署方证件号(用来关联签署方的签署链接)
        self.encrypt_sign_cert_no = encrypt_sign_cert_no
        # 签署链接
        self.sign_url = sign_url

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sign_cert_name is not None:
            result['sign_cert_name'] = self.sign_cert_name
        if self.sign_cert_no is not None:
            result['sign_cert_no'] = self.sign_cert_no
        if self.sign_user_id is not None:
            result['sign_user_id'] = self.sign_user_id
        if self.encrypt_sign_cert_no is not None:
            result['encrypt_sign_cert_no'] = self.encrypt_sign_cert_no
        if self.sign_url is not None:
            result['sign_url'] = self.sign_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sign_cert_name') is not None:
            self.sign_cert_name = m.get('sign_cert_name')
        if m.get('sign_cert_no') is not None:
            self.sign_cert_no = m.get('sign_cert_no')
        if m.get('sign_user_id') is not None:
            self.sign_user_id = m.get('sign_user_id')
        if m.get('encrypt_sign_cert_no') is not None:
            self.encrypt_sign_cert_no = m.get('encrypt_sign_cert_no')
        if m.get('sign_url') is not None:
            self.sign_url = m.get('sign_url')
        return self


class SignUrlResp(TeaModel):
    def __init__(
        self,
        type: int = None,
        name: str = None,
        cert_no: str = None,
        url: str = None,
        short_url: str = None,
        sign_filed_id: str = None,
    ):
        # 0-企业 1-用户
        self.type = type
        # 企业名称或用户姓名
        self.name = name
        # 社会信用代码或身份证号
        self.cert_no = cert_no
        # 手动签署url（长链接）
        self.url = url
        # 手动签署url(端链接)
        self.short_url = short_url
        # 电子合同签署区id
        self.sign_filed_id = sign_filed_id

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.name, 'name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.sign_filed_id, 'sign_filed_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.name is not None:
            result['name'] = self.name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.url is not None:
            result['url'] = self.url
        if self.short_url is not None:
            result['short_url'] = self.short_url
        if self.sign_filed_id is not None:
            result['sign_filed_id'] = self.sign_filed_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('short_url') is not None:
            self.short_url = m.get('short_url')
        if m.get('sign_filed_id') is not None:
            self.sign_filed_id = m.get('sign_filed_id')
        return self


class FailOrderInfo(TeaModel):
    def __init__(
        self,
        order_no: str = None,
        fail_reason: str = None,
    ):
        # 退保失败订单号
        self.order_no = order_no
        # 失败原因
        self.fail_reason = fail_reason

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.fail_reason, 'fail_reason')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.fail_reason is not None:
            result['fail_reason'] = self.fail_reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('fail_reason') is not None:
            self.fail_reason = m.get('fail_reason')
        return self


class SignUserInfo(TeaModel):
    def __init__(
        self,
        id_number: str = None,
        name: str = None,
        sign_area_list: List[SignatoryInfo] = None,
    ):
        # 身份证号
        self.id_number = id_number
        # 姓名
        self.name = name
        # 签署区列表
        self.sign_area_list = sign_area_list

    def validate(self):
        self.validate_required(self.id_number, 'id_number')
        self.validate_required(self.name, 'name')
        self.validate_required(self.sign_area_list, 'sign_area_list')
        if self.sign_area_list:
            for k in self.sign_area_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id_number is not None:
            result['id_number'] = self.id_number
        if self.name is not None:
            result['name'] = self.name
        result['sign_area_list'] = []
        if self.sign_area_list is not None:
            for k in self.sign_area_list:
                result['sign_area_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id_number') is not None:
            self.id_number = m.get('id_number')
        if m.get('name') is not None:
            self.name = m.get('name')
        self.sign_area_list = []
        if m.get('sign_area_list') is not None:
            for k in m.get('sign_area_list'):
                temp_model = SignatoryInfo()
                self.sign_area_list.append(temp_model.from_map(k))
        return self


class ContractSignResponse(TeaModel):
    def __init__(
        self,
        flow_id: str = None,
        sign_url_list: List[SignUrlResp] = None,
    ):
        # 流程id
        self.flow_id = flow_id
        # 签署链接数组
        self.sign_url_list = sign_url_list

    def validate(self):
        self.validate_required(self.flow_id, 'flow_id')
        self.validate_required(self.sign_url_list, 'sign_url_list')
        if self.sign_url_list:
            for k in self.sign_url_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        result['sign_url_list'] = []
        if self.sign_url_list is not None:
            for k in self.sign_url_list:
                result['sign_url_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        self.sign_url_list = []
        if m.get('sign_url_list') is not None:
            for k in m.get('sign_url_list'):
                temp_model = SignUrlResp()
                self.sign_url_list.append(temp_model.from_map(k))
        return self


class InsureProductInfo(TeaModel):
    def __init__(
        self,
        name: str = None,
        product_id: str = None,
        insurance_type_code: str = None,
        recom_flow_no: str = None,
        premium: int = None,
        sum_insured: int = None,
    ):
        # 产品名称
        self.name = name
        # 产品id
        self.product_id = product_id
        # 险种编码:
        # ACCIDENT: 意外险
        # EMPLOYER: 雇主险
        self.insurance_type_code = insurance_type_code
        # 推荐编码
        self.recom_flow_no = recom_flow_no
        # 最低价格（分）
        self.premium = premium
        # 保额（分）
        self.sum_insured = sum_insured

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.product_id, 'product_id')
        self.validate_required(self.insurance_type_code, 'insurance_type_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.product_id is not None:
            result['product_id'] = self.product_id
        if self.insurance_type_code is not None:
            result['insurance_type_code'] = self.insurance_type_code
        if self.recom_flow_no is not None:
            result['recom_flow_no'] = self.recom_flow_no
        if self.premium is not None:
            result['premium'] = self.premium
        if self.sum_insured is not None:
            result['sum_insured'] = self.sum_insured
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('product_id') is not None:
            self.product_id = m.get('product_id')
        if m.get('insurance_type_code') is not None:
            self.insurance_type_code = m.get('insurance_type_code')
        if m.get('recom_flow_no') is not None:
            self.recom_flow_no = m.get('recom_flow_no')
        if m.get('premium') is not None:
            self.premium = m.get('premium')
        if m.get('sum_insured') is not None:
            self.sum_insured = m.get('sum_insured')
        return self


class CaSubSignResult(TeaModel):
    def __init__(
        self,
        sub_biz_no: str = None,
        sign_task_id: str = None,
        our_user_id: str = None,
        related_business: bool = None,
        ca_sign_url_result_list: List[CaSignUrlResult] = None,
    ):
        # 子业务流水号
        self.sub_biz_no = sub_biz_no
        # 子任务id
        self.sign_task_id = sign_task_id
        # 我方签署方id
        self.our_user_id = our_user_id
        # 是否关联业务 true:关联 false：不关联
        self.related_business = related_business
        # 签署链接结果列表
        self.ca_sign_url_result_list = ca_sign_url_result_list

    def validate(self):
        if self.ca_sign_url_result_list:
            for k in self.ca_sign_url_result_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sub_biz_no is not None:
            result['sub_biz_no'] = self.sub_biz_no
        if self.sign_task_id is not None:
            result['sign_task_id'] = self.sign_task_id
        if self.our_user_id is not None:
            result['our_user_id'] = self.our_user_id
        if self.related_business is not None:
            result['related_business'] = self.related_business
        result['ca_sign_url_result_list'] = []
        if self.ca_sign_url_result_list is not None:
            for k in self.ca_sign_url_result_list:
                result['ca_sign_url_result_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sub_biz_no') is not None:
            self.sub_biz_no = m.get('sub_biz_no')
        if m.get('sign_task_id') is not None:
            self.sign_task_id = m.get('sign_task_id')
        if m.get('our_user_id') is not None:
            self.our_user_id = m.get('our_user_id')
        if m.get('related_business') is not None:
            self.related_business = m.get('related_business')
        self.ca_sign_url_result_list = []
        if m.get('ca_sign_url_result_list') is not None:
            for k in m.get('ca_sign_url_result_list'):
                temp_model = CaSignUrlResult()
                self.ca_sign_url_result_list.append(temp_model.from_map(k))
        return self


class TemplateFieldConfigRequest(TeaModel):
    def __init__(
        self,
        type: int = None,
        field_name: str = None,
        field_name_desc: str = None,
        field_value: str = None,
    ):
        # 字段拥有者（1个人，2客户，3人资服务商）
        self.type = type
        # 字段名称（英文：identityName、identityNumber、phoneNumber、positionName、salary、salaryNumber、examineStandard、projectDesc）
        self.field_name = field_name
        # 字段名称描述（中文名：姓名、身份证号、手机号、职位、薪资、薪数、考核标准、项目描述）
        self.field_name_desc = field_name_desc
        # 字段值
        self.field_value = field_value

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.field_name, 'field_name')
        self.validate_required(self.field_name_desc, 'field_name_desc')
        self.validate_required(self.field_value, 'field_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.field_name is not None:
            result['field_name'] = self.field_name
        if self.field_name_desc is not None:
            result['field_name_desc'] = self.field_name_desc
        if self.field_value is not None:
            result['field_value'] = self.field_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('field_name') is not None:
            self.field_name = m.get('field_name')
        if m.get('field_name_desc') is not None:
            self.field_name_desc = m.get('field_name_desc')
        if m.get('field_value') is not None:
            self.field_value = m.get('field_value')
        return self


class CaSignTaskResult(TeaModel):
    def __init__(
        self,
        sub_biz_no: str = None,
        sign_task_id: str = None,
        sign_task_status: str = None,
        sign_file_result_list: List[CaSignFileResult] = None,
        sign_operator_result_list: List[CaSignOperatorResult] = None,
    ):
        # 子任务流水号
        self.sub_biz_no = sub_biz_no
        # 签署子任务id
        self.sign_task_id = sign_task_id
        # 签署子任务的状态
        self.sign_task_status = sign_task_status
        # 签署完成的文件列表
        self.sign_file_result_list = sign_file_result_list
        # 签署人状态列表
        self.sign_operator_result_list = sign_operator_result_list

    def validate(self):
        self.validate_required(self.sub_biz_no, 'sub_biz_no')
        self.validate_required(self.sign_task_id, 'sign_task_id')
        if self.sign_file_result_list:
            for k in self.sign_file_result_list:
                if k:
                    k.validate()
        if self.sign_operator_result_list:
            for k in self.sign_operator_result_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sub_biz_no is not None:
            result['sub_biz_no'] = self.sub_biz_no
        if self.sign_task_id is not None:
            result['sign_task_id'] = self.sign_task_id
        if self.sign_task_status is not None:
            result['sign_task_status'] = self.sign_task_status
        result['sign_file_result_list'] = []
        if self.sign_file_result_list is not None:
            for k in self.sign_file_result_list:
                result['sign_file_result_list'].append(k.to_map() if k else None)
        result['sign_operator_result_list'] = []
        if self.sign_operator_result_list is not None:
            for k in self.sign_operator_result_list:
                result['sign_operator_result_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sub_biz_no') is not None:
            self.sub_biz_no = m.get('sub_biz_no')
        if m.get('sign_task_id') is not None:
            self.sign_task_id = m.get('sign_task_id')
        if m.get('sign_task_status') is not None:
            self.sign_task_status = m.get('sign_task_status')
        self.sign_file_result_list = []
        if m.get('sign_file_result_list') is not None:
            for k in m.get('sign_file_result_list'):
                temp_model = CaSignFileResult()
                self.sign_file_result_list.append(temp_model.from_map(k))
        self.sign_operator_result_list = []
        if m.get('sign_operator_result_list') is not None:
            for k in m.get('sign_operator_result_list'):
                temp_model = CaSignOperatorResult()
                self.sign_operator_result_list.append(temp_model.from_map(k))
        return self


class CaSignTaskRequest(TeaModel):
    def __init__(
        self,
        sub_biz_no: str = None,
        description: str = None,
        sign_user_info_request_list: List[CaSignUserInfoRequest] = None,
        sign_file_request_list: List[CaSignFileRequest] = None,
    ):
        # 子业务流水号
        self.sub_biz_no = sub_biz_no
        # 任务描述
        self.description = description
        # 签署人信息
        self.sign_user_info_request_list = sign_user_info_request_list
        # 待签署文件列表
        self.sign_file_request_list = sign_file_request_list

    def validate(self):
        self.validate_required(self.sub_biz_no, 'sub_biz_no')
        self.validate_required(self.description, 'description')
        self.validate_required(self.sign_user_info_request_list, 'sign_user_info_request_list')
        if self.sign_user_info_request_list:
            for k in self.sign_user_info_request_list:
                if k:
                    k.validate()
        if self.sign_file_request_list:
            for k in self.sign_file_request_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sub_biz_no is not None:
            result['sub_biz_no'] = self.sub_biz_no
        if self.description is not None:
            result['description'] = self.description
        result['sign_user_info_request_list'] = []
        if self.sign_user_info_request_list is not None:
            for k in self.sign_user_info_request_list:
                result['sign_user_info_request_list'].append(k.to_map() if k else None)
        result['sign_file_request_list'] = []
        if self.sign_file_request_list is not None:
            for k in self.sign_file_request_list:
                result['sign_file_request_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sub_biz_no') is not None:
            self.sub_biz_no = m.get('sub_biz_no')
        if m.get('description') is not None:
            self.description = m.get('description')
        self.sign_user_info_request_list = []
        if m.get('sign_user_info_request_list') is not None:
            for k in m.get('sign_user_info_request_list'):
                temp_model = CaSignUserInfoRequest()
                self.sign_user_info_request_list.append(temp_model.from_map(k))
        self.sign_file_request_list = []
        if m.get('sign_file_request_list') is not None:
            for k in m.get('sign_file_request_list'):
                temp_model = CaSignFileRequest()
                self.sign_file_request_list.append(temp_model.from_map(k))
        return self


class InsureEmployeeInfo(TeaModel):
    def __init__(
        self,
        name: str = None,
        cert_no: str = None,
        mobile: str = None,
        extra_msg: str = None,
    ):
        # 姓名
        self.name = name
        # 身份证号
        self.cert_no = cert_no
        # 手机号
        self.mobile = mobile
        # 额外信息
        self.extra_msg = extra_msg

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.mobile, 'mobile')
        self.validate_required(self.extra_msg, 'extra_msg')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.extra_msg is not None:
            result['extra_msg'] = self.extra_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('extra_msg') is not None:
            self.extra_msg = m.get('extra_msg')
        return self


class SignEnterpriseInfo(TeaModel):
    def __init__(
        self,
        organization_name: str = None,
        uscc: str = None,
        name: str = None,
        id_number: str = None,
        sign_type: int = None,
        sign_area_list: List[SignatoryInfo] = None,
    ):
        # 公司名称
        self.organization_name = organization_name
        # 社会统一信用代码
        self.uscc = uscc
        # 法人姓名
        self.name = name
        # 法人身份证号码
        self.id_number = id_number
        # 签署模式0、自动签署1、手动签署（用户只能手动）
        # 
        self.sign_type = sign_type
        # 签署区列表
        self.sign_area_list = sign_area_list

    def validate(self):
        self.validate_required(self.organization_name, 'organization_name')
        self.validate_required(self.uscc, 'uscc')
        self.validate_required(self.name, 'name')
        self.validate_required(self.id_number, 'id_number')
        self.validate_required(self.sign_type, 'sign_type')
        self.validate_required(self.sign_area_list, 'sign_area_list')
        if self.sign_area_list:
            for k in self.sign_area_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.organization_name is not None:
            result['organization_name'] = self.organization_name
        if self.uscc is not None:
            result['uscc'] = self.uscc
        if self.name is not None:
            result['name'] = self.name
        if self.id_number is not None:
            result['id_number'] = self.id_number
        if self.sign_type is not None:
            result['sign_type'] = self.sign_type
        result['sign_area_list'] = []
        if self.sign_area_list is not None:
            for k in self.sign_area_list:
                result['sign_area_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('organization_name') is not None:
            self.organization_name = m.get('organization_name')
        if m.get('uscc') is not None:
            self.uscc = m.get('uscc')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('id_number') is not None:
            self.id_number = m.get('id_number')
        if m.get('sign_type') is not None:
            self.sign_type = m.get('sign_type')
        self.sign_area_list = []
        if m.get('sign_area_list') is not None:
            for k in m.get('sign_area_list'):
                temp_model = SignatoryInfo()
                self.sign_area_list.append(temp_model.from_map(k))
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


class SignAntsaasStaffingcContractSendRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        out_biz_no: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
        contract_type: int = None,
        contract_name: str = None,
        contract_file_type: str = None,
        simple_form_fields: str = None,
        sign_platform: str = None,
        sign_user_list: List[SignUserInfo] = None,
        sign_enterprise_list: List[SignEnterpriseInfo] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 需要确保唯一（定位订单）
        self.out_biz_no = out_biz_no
        # 合同或模版文件
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id
        # 合同类型（1合同文件 2合同模板）
        self.contract_type = contract_type
        # 合同名称, 必须带上文件名后缀。 .dpf .doc .docx
        self.contract_name = contract_name
        # 合同文件类型 （pdf、word）
        self.contract_file_type = contract_file_type
        # 合同模版参数，json格式，以key value格式存储，合同类型属于模板必填
        self.simple_form_fields = simple_form_fields
        # 签署平台（ALIPAY或H5）
        self.sign_platform = sign_platform
        # 合同用户信息列表
        self.sign_user_list = sign_user_list
        # 合同企业信息列表
        self.sign_enterprise_list = sign_enterprise_list

    def validate(self):
        self.validate_required(self.out_biz_no, 'out_biz_no')
        self.validate_required(self.contract_type, 'contract_type')
        self.validate_required(self.contract_name, 'contract_name')
        self.validate_required(self.contract_file_type, 'contract_file_type')
        self.validate_required(self.sign_platform, 'sign_platform')
        self.validate_required(self.sign_user_list, 'sign_user_list')
        if self.sign_user_list:
            for k in self.sign_user_list:
                if k:
                    k.validate()
        self.validate_required(self.sign_enterprise_list, 'sign_enterprise_list')
        if self.sign_enterprise_list:
            for k in self.sign_enterprise_list:
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
        if self.out_biz_no is not None:
            result['out_biz_no'] = self.out_biz_no
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.contract_type is not None:
            result['contract_type'] = self.contract_type
        if self.contract_name is not None:
            result['contract_name'] = self.contract_name
        if self.contract_file_type is not None:
            result['contract_file_type'] = self.contract_file_type
        if self.simple_form_fields is not None:
            result['simple_form_fields'] = self.simple_form_fields
        if self.sign_platform is not None:
            result['sign_platform'] = self.sign_platform
        result['sign_user_list'] = []
        if self.sign_user_list is not None:
            for k in self.sign_user_list:
                result['sign_user_list'].append(k.to_map() if k else None)
        result['sign_enterprise_list'] = []
        if self.sign_enterprise_list is not None:
            for k in self.sign_enterprise_list:
                result['sign_enterprise_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('out_biz_no') is not None:
            self.out_biz_no = m.get('out_biz_no')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('contract_type') is not None:
            self.contract_type = m.get('contract_type')
        if m.get('contract_name') is not None:
            self.contract_name = m.get('contract_name')
        if m.get('contract_file_type') is not None:
            self.contract_file_type = m.get('contract_file_type')
        if m.get('simple_form_fields') is not None:
            self.simple_form_fields = m.get('simple_form_fields')
        if m.get('sign_platform') is not None:
            self.sign_platform = m.get('sign_platform')
        self.sign_user_list = []
        if m.get('sign_user_list') is not None:
            for k in m.get('sign_user_list'):
                temp_model = SignUserInfo()
                self.sign_user_list.append(temp_model.from_map(k))
        self.sign_enterprise_list = []
        if m.get('sign_enterprise_list') is not None:
            for k in m.get('sign_enterprise_list'):
                temp_model = SignEnterpriseInfo()
                self.sign_enterprise_list.append(temp_model.from_map(k))
        return self


class SignAntsaasStaffingcContractSendResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response: ContractSignResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发起签约返回结果
        self.response = response

    def validate(self):
        if self.response:
            self.response.validate()

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
        if self.response is not None:
            result['response'] = self.response.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response') is not None:
            temp_model = ContractSignResponse()
            self.response = temp_model.from_map(m['response'])
        return self


class QueryAntsaasStaffingcContractSignRequest(TeaModel):
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
        self.flow_id = flow_id

    def validate(self):
        self.validate_required(self.flow_id, 'flow_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

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


class QueryAntsaasStaffingcContractSignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        flow_id: str = None,
        contract_validity: int = None,
        flow_desc: str = None,
        flow_start_time: str = None,
        flow_end_time: str = None,
        flow_status: int = None,
        file_id: str = None,
        file_name: str = None,
        file_url: str = None,
        sign_url_list: List[SignUrlResp] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 流程id
        self.flow_id = flow_id
        # 文件有效截止日期
        self.contract_validity = contract_validity
        # 流程描述
        self.flow_desc = flow_desc
        # 流程开始时间
        self.flow_start_time = flow_start_time
        # 流程结束时间
        self.flow_end_time = flow_end_time
        # 流程状态（0-草稿、1-签署中、2-完成、3-撤销、4-终止、5-过期、6-删除、7-拒签）
        self.flow_status = flow_status
        # 合同文件id
        self.file_id = file_id
        # 合同文件名称
        self.file_name = file_name
        # 合同文件下载地址（1小时内有效）
        self.file_url = file_url
        # 如果未签署，将返回签署链接
        self.sign_url_list = sign_url_list

    def validate(self):
        if self.sign_url_list:
            for k in self.sign_url_list:
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
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.contract_validity is not None:
            result['contract_validity'] = self.contract_validity
        if self.flow_desc is not None:
            result['flow_desc'] = self.flow_desc
        if self.flow_start_time is not None:
            result['flow_start_time'] = self.flow_start_time
        if self.flow_end_time is not None:
            result['flow_end_time'] = self.flow_end_time
        if self.flow_status is not None:
            result['flow_status'] = self.flow_status
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_url is not None:
            result['file_url'] = self.file_url
        result['sign_url_list'] = []
        if self.sign_url_list is not None:
            for k in self.sign_url_list:
                result['sign_url_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('contract_validity') is not None:
            self.contract_validity = m.get('contract_validity')
        if m.get('flow_desc') is not None:
            self.flow_desc = m.get('flow_desc')
        if m.get('flow_start_time') is not None:
            self.flow_start_time = m.get('flow_start_time')
        if m.get('flow_end_time') is not None:
            self.flow_end_time = m.get('flow_end_time')
        if m.get('flow_status') is not None:
            self.flow_status = m.get('flow_status')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        self.sign_url_list = []
        if m.get('sign_url_list') is not None:
            for k in m.get('sign_url_list'):
                temp_model = SignUrlResp()
                self.sign_url_list.append(temp_model.from_map(k))
        return self


class QueryAntsaasStaffingcEpcertificationUrlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 一次认证的唯一标识,在商户调用认证初始化接口的时候获取
        # (如果接口创建接口发生未知异常，可使用out_biz_no替代，查询状态）
        self.biz_no = biz_no

    def validate(self):
        self.validate_required(self.biz_no, 'biz_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

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


class QueryAntsaasStaffingcEpcertificationUrlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_body: str = None,
        biz_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # // 响应为表单格式，可嵌入页面，具体以返回的结果为准
        self.result_body = result_body
        # 订单号（但入参为out_biz_no时传入）
        self.biz_no = biz_no

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
        if self.result_body is not None:
            result['result_body'] = self.result_body
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
        if m.get('result_body') is not None:
            self.result_body = m.get('result_body')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        return self


class CreateAntsaasStaffingcEpcertificationAuthorizeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        out_biz_no: str = None,
        ep_name: str = None,
        ep_cert_no: str = None,
        return_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 需要保证唯一，外部订单号
        self.out_biz_no = out_biz_no
        # 企业全称
        self.ep_name = ep_name
        # 统一社会信用代码或营业执照注册号
        self.ep_cert_no = ep_cert_no
        # 认证完成后，跳转到指定url地址
        self.return_url = return_url

    def validate(self):
        self.validate_required(self.out_biz_no, 'out_biz_no')
        self.validate_required(self.ep_name, 'ep_name')
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
        if self.out_biz_no is not None:
            result['out_biz_no'] = self.out_biz_no
        if self.ep_name is not None:
            result['ep_name'] = self.ep_name
        if self.ep_cert_no is not None:
            result['ep_cert_no'] = self.ep_cert_no
        if self.return_url is not None:
            result['return_url'] = self.return_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('out_biz_no') is not None:
            self.out_biz_no = m.get('out_biz_no')
        if m.get('ep_name') is not None:
            self.ep_name = m.get('ep_name')
        if m.get('ep_cert_no') is not None:
            self.ep_cert_no = m.get('ep_cert_no')
        if m.get('return_url') is not None:
            self.return_url = m.get('return_url')
        return self


class CreateAntsaasStaffingcEpcertificationAuthorizeResponse(TeaModel):
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
        # 一次认证的唯一标识
        self.biz_no = biz_no

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


class QueryAntsaasStaffingcEpcertificationRiskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_no: str = None,
        ep_name: str = None,
        ep_cert_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 一次认证的唯一标识,在调用认证初始化接口的时候获取
        self.biz_no = biz_no
        # 企业全称
        self.ep_name = ep_name
        # 统一社会信用代码或营业执照注册号
        self.ep_cert_no = ep_cert_no

    def validate(self):
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.ep_name, 'ep_name')
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
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.ep_name is not None:
            result['ep_name'] = self.ep_name
        if self.ep_cert_no is not None:
            result['ep_cert_no'] = self.ep_cert_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('ep_name') is not None:
            self.ep_name = m.get('ep_name')
        if m.get('ep_cert_no') is not None:
            self.ep_cert_no = m.get('ep_cert_no')
        return self


class QueryAntsaasStaffingcEpcertificationRiskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        certify_status: str = None,
        auth_status: str = None,
        ep_name: str = None,
        ep_cert_no: str = None,
        user_name: str = None,
        certify_person_card_no_postfix: str = None,
        certify_fail_reasons: List[str] = None,
        risk_identify_result: List[str] = None,
        shell_company_level: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 认证状态，取值如下： SUCCESS，代表成功 INIT，代表初始化 CERTIFYING，代表认证中 FAIL，代表失败
        self.certify_status = certify_status
        # 授权状态，从用户授权开始计时，时间窗口3天 取值如下： SUCCESS，代表用户已授权 FAIL，代表用户未授权或授权失效
        self.auth_status = auth_status
        # 企业全称，字段auth_status为SUCCESS时返回
        self.ep_name = ep_name
        # 统一社会信用代码或营业执照注册号，字段auth_status为SUCCESS时返回
        self.ep_cert_no = ep_cert_no
        # 法人认证姓名，字段auth_status为SUCCESS时返回
        self.user_name = user_name
        # 法人认证身份证号
        self.certify_person_card_no_postfix = certify_person_card_no_postfix
        # 认证失败原因列表，当certify_status=FAIL时返回
        self.certify_fail_reasons = certify_fail_reasons
        # 认证风险识别结果集合
        # 枚举值
        # 低风险认证: CERTIFICATION_LOW_RISK
        # 中风险认证: CERTIFICATION_MID_RISK2
        # 高风险认证: CERTIFICATION_HIGH_RISK
        # 批量注册: ONE_ADDR_MULTI_COMP
        # 经营异常: OPERATION_ABNORMAL
        # 交叉任职: CROSS_POSITION
        # 涉嫌洗钱: SUSPECTED_MONEY_LAUNDERING
        # 空壳公司: SHELL_COMPANY
        # 失信被执行: BREACH_PROMISE_EXECUTION
        # 严重违法失信: SERIOUS_BREACH_TRUST
        # 行政处罚: ADMINISTRATIVE_SANCTION
        # 司法冻结: JUDICIAL_FREEZE
        # 违规违禁: VIOLATION_BAN
        # 信贷逾期: CREDIT_OVERDUE
        # 多头借贷: LONG_BORROWING
        # 疑似欺诈: SUSPECTED_FRAUD
        # 疑似涉赌博: SUSPECTED_GAMBLING
        # 企业芝麻证: LI_XIN_CERTIFICATE
        self.risk_identify_result = risk_identify_result
        # 空壳企业等级，描述企业空壳程度。
        # 枚举值
        # 优秀企业，没有空壳企业的常见特征，且有很多正向特征证明其正常经营: A+\
        # 较为优秀的企业，没有空壳企业的常见特征，且有较多正向特征证明其正常经营: A
        # 较为优秀的企业，几乎没有空壳企业的常见特征，或者有较多正向特征证明其正常经营: B
        # 普通企业，一般没有空壳企业的常见特征，或者有很少量能反映其正常经营的数据: M+\
        # 普通企业或者新注册的企业，一般没有空壳企业的常见特征，但是也没有太多能反映其在正常生产经营的数据: M
        # 普通企业，一般没有明显空壳企业的常见特征，也没有太多能反映其在正常生产经营的数据，可能和空壳企业有少量交集: M-\
        # 较差企业，有部分空壳企业特征，可能有较少能反映其在正常生产经营的数据。建议这部分企业酌情考虑风险: C+\
        # 差企业，有较多空壳企业特征，几乎没有能反映其在正常生产经营的数据: C
        # 差企业，有很多明显空壳企业特征，几乎没有能反映其在正常生产经营的数据: D
        self.shell_company_level = shell_company_level

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
        if self.certify_status is not None:
            result['certify_status'] = self.certify_status
        if self.auth_status is not None:
            result['auth_status'] = self.auth_status
        if self.ep_name is not None:
            result['ep_name'] = self.ep_name
        if self.ep_cert_no is not None:
            result['ep_cert_no'] = self.ep_cert_no
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.certify_person_card_no_postfix is not None:
            result['certify_person_card_no_postfix'] = self.certify_person_card_no_postfix
        if self.certify_fail_reasons is not None:
            result['certify_fail_reasons'] = self.certify_fail_reasons
        if self.risk_identify_result is not None:
            result['risk_identify_result'] = self.risk_identify_result
        if self.shell_company_level is not None:
            result['shell_company_level'] = self.shell_company_level
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('certify_status') is not None:
            self.certify_status = m.get('certify_status')
        if m.get('auth_status') is not None:
            self.auth_status = m.get('auth_status')
        if m.get('ep_name') is not None:
            self.ep_name = m.get('ep_name')
        if m.get('ep_cert_no') is not None:
            self.ep_cert_no = m.get('ep_cert_no')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('certify_person_card_no_postfix') is not None:
            self.certify_person_card_no_postfix = m.get('certify_person_card_no_postfix')
        if m.get('certify_fail_reasons') is not None:
            self.certify_fail_reasons = m.get('certify_fail_reasons')
        if m.get('risk_identify_result') is not None:
            self.risk_identify_result = m.get('risk_identify_result')
        if m.get('shell_company_level') is not None:
            self.shell_company_level = m.get('shell_company_level')
        return self


class ApplyAntsaasStaffingcInsureSignurlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        enterprise_name: str = None,
        social_credit_code: str = None,
        auth_account: str = None,
        mobile: str = None,
        out_biz_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业名称
        self.enterprise_name = enterprise_name
        # 社会信用代码
        self.social_credit_code = social_credit_code
        # 签约支付宝账号（企业支付宝是邮箱）
        self.auth_account = auth_account
        # 联系手机号（用于接收投保失败等短信通知）
        self.mobile = mobile
        # 外部业务号(64长度以内）
        # 
        self.out_biz_no = out_biz_no

    def validate(self):
        self.validate_required(self.enterprise_name, 'enterprise_name')
        self.validate_required(self.social_credit_code, 'social_credit_code')
        self.validate_required(self.auth_account, 'auth_account')
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
        if self.enterprise_name is not None:
            result['enterprise_name'] = self.enterprise_name
        if self.social_credit_code is not None:
            result['social_credit_code'] = self.social_credit_code
        if self.auth_account is not None:
            result['auth_account'] = self.auth_account
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.out_biz_no is not None:
            result['out_biz_no'] = self.out_biz_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('enterprise_name') is not None:
            self.enterprise_name = m.get('enterprise_name')
        if m.get('social_credit_code') is not None:
            self.social_credit_code = m.get('social_credit_code')
        if m.get('auth_account') is not None:
            self.auth_account = m.get('auth_account')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('out_biz_no') is not None:
            self.out_biz_no = m.get('out_biz_no')
        return self


class ApplyAntsaasStaffingcInsureSignurlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签约地址
        self.sign_url = sign_url

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
        if self.sign_url is not None:
            result['sign_url'] = self.sign_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_url') is not None:
            self.sign_url = m.get('sign_url')
        return self


class ListAntsaasStaffingcInsureProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        enterprise_name: str = None,
        social_credit_code: str = None,
        biz_code: str = None,
        insurance_type_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业名称
        self.enterprise_name = enterprise_name
        # 统一社会信用代码
        self.social_credit_code = social_credit_code
        # 保险场景码:
        # FLEXIBLE_EMPLOYMENT-日单（实时生效）
        # INITIATIVE_EMPLOYMENT-长期（次日0点生效）
        self.biz_code = biz_code
        # 险种编码:
        # ACCIDENT: 意外险
        # EMPLOYER_LIABILITY: 雇主险
        self.insurance_type_code = insurance_type_code

    def validate(self):
        self.validate_required(self.enterprise_name, 'enterprise_name')
        self.validate_required(self.social_credit_code, 'social_credit_code')
        self.validate_required(self.biz_code, 'biz_code')
        self.validate_required(self.insurance_type_code, 'insurance_type_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.enterprise_name is not None:
            result['enterprise_name'] = self.enterprise_name
        if self.social_credit_code is not None:
            result['social_credit_code'] = self.social_credit_code
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.insurance_type_code is not None:
            result['insurance_type_code'] = self.insurance_type_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('enterprise_name') is not None:
            self.enterprise_name = m.get('enterprise_name')
        if m.get('social_credit_code') is not None:
            self.social_credit_code = m.get('social_credit_code')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('insurance_type_code') is not None:
            self.insurance_type_code = m.get('insurance_type_code')
        return self


class ListAntsaasStaffingcInsureProductResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        product_list: List[InsureProductInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 保险产品列表
        self.product_list = product_list

    def validate(self):
        if self.product_list:
            for k in self.product_list:
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
        result['product_list'] = []
        if self.product_list is not None:
            for k in self.product_list:
                result['product_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.product_list = []
        if m.get('product_list') is not None:
            for k in m.get('product_list'):
                temp_model = InsureProductInfo()
                self.product_list.append(temp_model.from_map(k))
        return self


class QueryAntsaasStaffingcInsurePriceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        enterprise_name: str = None,
        social_credit_code: str = None,
        product_id: str = None,
        job_code: str = None,
        period: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业名称
        self.enterprise_name = enterprise_name
        # 统一社会信用代码
        self.social_credit_code = social_credit_code
        # 产品ID
        self.product_id = product_id
        # 职业编码:
        # default-1-一类职业;
        # default-2-二类职业;
        # default-3-三类职业;
        # default-4-四类职业;
        self.job_code = job_code
        # 周期：
        # 1D、
        # 30D、
        # 360D
        self.period = period

    def validate(self):
        self.validate_required(self.enterprise_name, 'enterprise_name')
        self.validate_required(self.social_credit_code, 'social_credit_code')
        self.validate_required(self.product_id, 'product_id')
        self.validate_required(self.job_code, 'job_code')
        self.validate_required(self.period, 'period')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.enterprise_name is not None:
            result['enterprise_name'] = self.enterprise_name
        if self.social_credit_code is not None:
            result['social_credit_code'] = self.social_credit_code
        if self.product_id is not None:
            result['product_id'] = self.product_id
        if self.job_code is not None:
            result['job_code'] = self.job_code
        if self.period is not None:
            result['period'] = self.period
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('enterprise_name') is not None:
            self.enterprise_name = m.get('enterprise_name')
        if m.get('social_credit_code') is not None:
            self.social_credit_code = m.get('social_credit_code')
        if m.get('product_id') is not None:
            self.product_id = m.get('product_id')
        if m.get('job_code') is not None:
            self.job_code = m.get('job_code')
        if m.get('period') is not None:
            self.period = m.get('period')
        return self


class QueryAntsaasStaffingcInsurePriceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        price: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 价格
        self.price = price

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
        if self.price is not None:
            result['price'] = self.price
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('price') is not None:
            self.price = m.get('price')
        return self


class SendAntsaasStaffingcInsureRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        out_biz_no: str = None,
        enterprise_name: str = None,
        social_credit_code: str = None,
        biz_code: str = None,
        insurance_type_code: str = None,
        product_id: str = None,
        job_code: str = None,
        period: str = None,
        recom_flow_no: str = None,
        address: str = None,
        employee_list: List[InsureEmployeeInfo] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部业务号（幂等、异步通知回传）
        self.out_biz_no = out_biz_no
        # 企业名称
        self.enterprise_name = enterprise_name
        # 统一社会信用代码
        self.social_credit_code = social_credit_code
        # 保险场景码:
        # FLEXIBLE_EMPLOYMENT-日单（实时生效）
        # INITIATIVE_EMPLOYMENT- 长期（次日0点生效）
        self.biz_code = biz_code
        # 投保的险种编码:
        # ACCIDENT: 意外险,
        # EMPLOYER_LIABILITY: 雇主险
        self.insurance_type_code = insurance_type_code
        # 产品ID
        self.product_id = product_id
        # 职业编码:
        # default-1-一类职业;
        # default-2-二类职业;
        # default-3-三类职业;
        # default-4-四类职业;
        # default-5-五类职业（雇主险60万和80万保额暂不支持）
        self.job_code = job_code
        # 保障周期：30D、360D（bizCode为长期时必传）
        self.period = period
        # 推荐编码
        self.recom_flow_no = recom_flow_no
        # 地址（bizCode为日单必传）
        self.address = address
        # 投保人列表，extra_msg需传递out_sub_biz_no，外部明细业务号（投保结果通知会回传，自行定义）
        self.employee_list = employee_list

    def validate(self):
        self.validate_required(self.out_biz_no, 'out_biz_no')
        self.validate_required(self.enterprise_name, 'enterprise_name')
        self.validate_required(self.social_credit_code, 'social_credit_code')
        self.validate_required(self.biz_code, 'biz_code')
        self.validate_required(self.insurance_type_code, 'insurance_type_code')
        self.validate_required(self.product_id, 'product_id')
        self.validate_required(self.job_code, 'job_code')
        self.validate_required(self.employee_list, 'employee_list')
        if self.employee_list:
            for k in self.employee_list:
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
        if self.out_biz_no is not None:
            result['out_biz_no'] = self.out_biz_no
        if self.enterprise_name is not None:
            result['enterprise_name'] = self.enterprise_name
        if self.social_credit_code is not None:
            result['social_credit_code'] = self.social_credit_code
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.insurance_type_code is not None:
            result['insurance_type_code'] = self.insurance_type_code
        if self.product_id is not None:
            result['product_id'] = self.product_id
        if self.job_code is not None:
            result['job_code'] = self.job_code
        if self.period is not None:
            result['period'] = self.period
        if self.recom_flow_no is not None:
            result['recom_flow_no'] = self.recom_flow_no
        if self.address is not None:
            result['address'] = self.address
        result['employee_list'] = []
        if self.employee_list is not None:
            for k in self.employee_list:
                result['employee_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('out_biz_no') is not None:
            self.out_biz_no = m.get('out_biz_no')
        if m.get('enterprise_name') is not None:
            self.enterprise_name = m.get('enterprise_name')
        if m.get('social_credit_code') is not None:
            self.social_credit_code = m.get('social_credit_code')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('insurance_type_code') is not None:
            self.insurance_type_code = m.get('insurance_type_code')
        if m.get('product_id') is not None:
            self.product_id = m.get('product_id')
        if m.get('job_code') is not None:
            self.job_code = m.get('job_code')
        if m.get('period') is not None:
            self.period = m.get('period')
        if m.get('recom_flow_no') is not None:
            self.recom_flow_no = m.get('recom_flow_no')
        if m.get('address') is not None:
            self.address = m.get('address')
        self.employee_list = []
        if m.get('employee_list') is not None:
            for k in m.get('employee_list'):
                temp_model = InsureEmployeeInfo()
                self.employee_list.append(temp_model.from_map(k))
        return self


class SendAntsaasStaffingcInsureResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        fail_employee_list: List[InsureEmployeeInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 投保失败人员信息，extra_msg会返回failReason，投保失败原因
        self.fail_employee_list = fail_employee_list

    def validate(self):
        if self.fail_employee_list:
            for k in self.fail_employee_list:
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
        result['fail_employee_list'] = []
        if self.fail_employee_list is not None:
            for k in self.fail_employee_list:
                result['fail_employee_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.fail_employee_list = []
        if m.get('fail_employee_list') is not None:
            for k in m.get('fail_employee_list'):
                temp_model = InsureEmployeeInfo()
                self.fail_employee_list.append(temp_model.from_map(k))
        return self


class SendAntsaasStaffingcInsureRefundRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        out_biz_no: str = None,
        enterprise_name: str = None,
        social_credit_code: str = None,
        order_no_list: List[int] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部业务号
        self.out_biz_no = out_biz_no
        # 企业名称
        self.enterprise_name = enterprise_name
        # 统一社会信用代码
        self.social_credit_code = social_credit_code
        # 退保订单号列表
        self.order_no_list = order_no_list

    def validate(self):
        self.validate_required(self.out_biz_no, 'out_biz_no')
        self.validate_required(self.enterprise_name, 'enterprise_name')
        self.validate_required(self.social_credit_code, 'social_credit_code')
        self.validate_required(self.order_no_list, 'order_no_list')

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
        if self.enterprise_name is not None:
            result['enterprise_name'] = self.enterprise_name
        if self.social_credit_code is not None:
            result['social_credit_code'] = self.social_credit_code
        if self.order_no_list is not None:
            result['order_no_list'] = self.order_no_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('out_biz_no') is not None:
            self.out_biz_no = m.get('out_biz_no')
        if m.get('enterprise_name') is not None:
            self.enterprise_name = m.get('enterprise_name')
        if m.get('social_credit_code') is not None:
            self.social_credit_code = m.get('social_credit_code')
        if m.get('order_no_list') is not None:
            self.order_no_list = m.get('order_no_list')
        return self


class SendAntsaasStaffingcInsureRefundResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        fail_order_info_list: List[FailOrderInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 失败原因列表
        self.fail_order_info_list = fail_order_info_list

    def validate(self):
        if self.fail_order_info_list:
            for k in self.fail_order_info_list:
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
        result['fail_order_info_list'] = []
        if self.fail_order_info_list is not None:
            for k in self.fail_order_info_list:
                result['fail_order_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.fail_order_info_list = []
        if m.get('fail_order_info_list') is not None:
            for k in m.get('fail_order_info_list'):
                temp_model = FailOrderInfo()
                self.fail_order_info_list.append(temp_model.from_map(k))
        return self


class SignAntsaasStaffingcContractCaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_name: str = None,
        biz_no: str = None,
        sign_version: str = None,
        sign_task_request_list: List[CaSignTaskRequest] = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
        template_secret_key: str = None,
        template_field_config_request_list: List[TemplateFieldConfigRequest] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务名称
        self.biz_name = biz_name
        # 业务编号
        self.biz_no = biz_no
        # 版本
        self.sign_version = sign_version
        # 签署任务信息
        self.sign_task_request_list = sign_task_request_list
        # 通过文件API上传的文件的file_id
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id
        # 合同模板密钥:若为合同模板该值必填,否则不需要填写
        self.template_secret_key = template_secret_key
        # 模板填充字段集合
        self.template_field_config_request_list = template_field_config_request_list

    def validate(self):
        self.validate_required(self.biz_name, 'biz_name')
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.sign_version, 'sign_version')
        self.validate_required(self.sign_task_request_list, 'sign_task_request_list')
        if self.sign_task_request_list:
            for k in self.sign_task_request_list:
                if k:
                    k.validate()
        if self.template_field_config_request_list:
            for k in self.template_field_config_request_list:
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
        if self.biz_name is not None:
            result['biz_name'] = self.biz_name
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.sign_version is not None:
            result['sign_version'] = self.sign_version
        result['sign_task_request_list'] = []
        if self.sign_task_request_list is not None:
            for k in self.sign_task_request_list:
                result['sign_task_request_list'].append(k.to_map() if k else None)
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.template_secret_key is not None:
            result['template_secret_key'] = self.template_secret_key
        result['template_field_config_request_list'] = []
        if self.template_field_config_request_list is not None:
            for k in self.template_field_config_request_list:
                result['template_field_config_request_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_name') is not None:
            self.biz_name = m.get('biz_name')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('sign_version') is not None:
            self.sign_version = m.get('sign_version')
        self.sign_task_request_list = []
        if m.get('sign_task_request_list') is not None:
            for k in m.get('sign_task_request_list'):
                temp_model = CaSignTaskRequest()
                self.sign_task_request_list.append(temp_model.from_map(k))
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('template_secret_key') is not None:
            self.template_secret_key = m.get('template_secret_key')
        self.template_field_config_request_list = []
        if m.get('template_field_config_request_list') is not None:
            for k in m.get('template_field_config_request_list'):
                temp_model = TemplateFieldConfigRequest()
                self.template_field_config_request_list.append(temp_model.from_map(k))
        return self


class SignAntsaasStaffingcContractCaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_flow_id: str = None,
        biz_no: str = None,
        sub_ant_sign_result_list: List[CaSubSignResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签约流程id
        self.sign_flow_id = sign_flow_id
        # 业务流水号
        self.biz_no = biz_no
        # 用印子任务受理流水
        self.sub_ant_sign_result_list = sub_ant_sign_result_list

    def validate(self):
        if self.sub_ant_sign_result_list:
            for k in self.sub_ant_sign_result_list:
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
        if self.sign_flow_id is not None:
            result['sign_flow_id'] = self.sign_flow_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        result['sub_ant_sign_result_list'] = []
        if self.sub_ant_sign_result_list is not None:
            for k in self.sub_ant_sign_result_list:
                result['sub_ant_sign_result_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_flow_id') is not None:
            self.sign_flow_id = m.get('sign_flow_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        self.sub_ant_sign_result_list = []
        if m.get('sub_ant_sign_result_list') is not None:
            for k in m.get('sub_ant_sign_result_list'):
                temp_model = CaSubSignResult()
                self.sub_ant_sign_result_list.append(temp_model.from_map(k))
        return self


class QueryAntsaasStaffingcContractCaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sign_flow_id: str = None,
        sign_task_id: str = None,
        biz_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 签署流程ID,传值默认查询签署流程下全部任务状态
        self.sign_flow_id = sign_flow_id
        # 签署任务id
        self.sign_task_id = sign_task_id
        # 业务唯一流水号
        self.biz_no = biz_no

    def validate(self):
        self.validate_required(self.sign_flow_id, 'sign_flow_id')
        self.validate_required(self.sign_task_id, 'sign_task_id')
        self.validate_required(self.biz_no, 'biz_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sign_flow_id is not None:
            result['sign_flow_id'] = self.sign_flow_id
        if self.sign_task_id is not None:
            result['sign_task_id'] = self.sign_task_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sign_flow_id') is not None:
            self.sign_flow_id = m.get('sign_flow_id')
        if m.get('sign_task_id') is not None:
            self.sign_task_id = m.get('sign_task_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        return self


class QueryAntsaasStaffingcContractCaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_flow_id: str = None,
        status: str = None,
        biz_no: str = None,
        ant_sign_task_result_list: List[CaSignTaskResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签署流程ID
        self.sign_flow_id = sign_flow_id
        # 签署流程状态
        self.status = status
        # 业务流水号
        self.biz_no = biz_no
        # 签署任务结果列表
        self.ant_sign_task_result_list = ant_sign_task_result_list

    def validate(self):
        if self.ant_sign_task_result_list:
            for k in self.ant_sign_task_result_list:
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
        if self.sign_flow_id is not None:
            result['sign_flow_id'] = self.sign_flow_id
        if self.status is not None:
            result['status'] = self.status
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        result['ant_sign_task_result_list'] = []
        if self.ant_sign_task_result_list is not None:
            for k in self.ant_sign_task_result_list:
                result['ant_sign_task_result_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_flow_id') is not None:
            self.sign_flow_id = m.get('sign_flow_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        self.ant_sign_task_result_list = []
        if m.get('ant_sign_task_result_list') is not None:
            for k in m.get('ant_sign_task_result_list'):
                temp_model = CaSignTaskResult()
                self.ant_sign_task_result_list.append(temp_model.from_map(k))
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


