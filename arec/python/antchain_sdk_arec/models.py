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


class Person(TeaModel):
    def __init__(
        self,
        address: str = None,
        cert_no: str = None,
        cert_type: str = None,
        cm_no: str = None,
        email: str = None,
        cert_back_pic_oss_key: str = None,
        cert_front_pic_oss_key: str = None,
        mobile: str = None,
        name: str = None,
        post_code: str = None,
    ):
        # 身份证地址
        self.address = address
        # 居民身份证号
        self.cert_no = cert_no
        # 证件类型,比如：ID_CARD=身份证
        self.cert_type = cert_type
        # 客户编号
        self.cm_no = cm_no
        # 电子邮箱
        self.email = email
        # 证件反面照片oss存储路径
        self.cert_back_pic_oss_key = cert_back_pic_oss_key
        # 证件正面照片OSS存储路径
        self.cert_front_pic_oss_key = cert_front_pic_oss_key
        # 手机号
        self.mobile = mobile
        # 客户姓名
        self.name = name
        # 身份证所在地邮编
        self.post_code = post_code

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.address is not None:
            result['address'] = self.address
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.cm_no is not None:
            result['cm_no'] = self.cm_no
        if self.email is not None:
            result['email'] = self.email
        if self.cert_back_pic_oss_key is not None:
            result['cert_back_pic_oss_key'] = self.cert_back_pic_oss_key
        if self.cert_front_pic_oss_key is not None:
            result['cert_front_pic_oss_key'] = self.cert_front_pic_oss_key
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.name is not None:
            result['name'] = self.name
        if self.post_code is not None:
            result['post_code'] = self.post_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('cm_no') is not None:
            self.cm_no = m.get('cm_no')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('cert_back_pic_oss_key') is not None:
            self.cert_back_pic_oss_key = m.get('cert_back_pic_oss_key')
        if m.get('cert_front_pic_oss_key') is not None:
            self.cert_front_pic_oss_key = m.get('cert_front_pic_oss_key')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('post_code') is not None:
            self.post_code = m.get('post_code')
        return self


class EntityBasicInfo(TeaModel):
    def __init__(
        self,
        name: str = None,
        cert_type: str = None,
        cert_no: str = None,
    ):
        # 名称
        self.name = name
        # 证件类型，可选值：ID_CARD,BUSINESS_LICENSE,UNIFIED_SOCIAL_CODE
        self.cert_type = cert_type
        # 证件号码
        self.cert_no = cert_no

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.cert_type, 'cert_type')
        self.validate_required(self.cert_no, 'cert_no')

    def to_map(self):
        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        return self


class ArSignField(TeaModel):
    def __init__(
        self,
        pos_page: str = None,
        pos_x: str = None,
        pos_y: str = None,
        sign_date_pos_page: str = None,
        sign_date_pos_x: str = None,
        sign_date_pos_y: str = None,
    ):
        # 签署页
        self.pos_page = pos_page
        # 签署区x坐标
        self.pos_x = pos_x
        # 签署区y坐标
        self.pos_y = pos_y
        # 签署日期签署页
        self.sign_date_pos_page = sign_date_pos_page
        # 签署日期的签署坐标x
        self.sign_date_pos_x = sign_date_pos_x
        # 签署日期签署坐标y
        self.sign_date_pos_y = sign_date_pos_y

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.pos_page is not None:
            result['pos_page'] = self.pos_page
        if self.pos_x is not None:
            result['pos_x'] = self.pos_x
        if self.pos_y is not None:
            result['pos_y'] = self.pos_y
        if self.sign_date_pos_page is not None:
            result['sign_date_pos_page'] = self.sign_date_pos_page
        if self.sign_date_pos_x is not None:
            result['sign_date_pos_x'] = self.sign_date_pos_x
        if self.sign_date_pos_y is not None:
            result['sign_date_pos_y'] = self.sign_date_pos_y
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pos_page') is not None:
            self.pos_page = m.get('pos_page')
        if m.get('pos_x') is not None:
            self.pos_x = m.get('pos_x')
        if m.get('pos_y') is not None:
            self.pos_y = m.get('pos_y')
        if m.get('sign_date_pos_page') is not None:
            self.sign_date_pos_page = m.get('sign_date_pos_page')
        if m.get('sign_date_pos_x') is not None:
            self.sign_date_pos_x = m.get('sign_date_pos_x')
        if m.get('sign_date_pos_y') is not None:
            self.sign_date_pos_y = m.get('sign_date_pos_y')
        return self


class ArTemplate(TeaModel):
    def __init__(
        self,
        ar_tp_no: str = None,
        ar_tp_version: int = None,
        ar_type: str = None,
        myc_tp_id: str = None,
        name: str = None,
        org_no: str = None,
        org_type: str = None,
        pdf_oss_key: str = None,
        var_json: str = None,
        sign_area_json: str = None,
    ):
        # 合同模版号
        self.ar_tp_no = ar_tp_no
        # 合同版本
        self.ar_tp_version = ar_tp_version
        # 合同模版类型，比如：CT_AUTH_HOUSE_QUERY=房屋查询授权合同
        self.ar_type = ar_type
        # 区块链智能合同的合同模版号
        self.myc_tp_id = myc_tp_id
        # 合同名称
        self.name = name
        # 合同模版归属机构编号
        self.org_no = org_no
        # 合同模版归属机构类型，比如：BANK=银行
        self.org_type = org_type
        # 合同模版OSS存储路径
        self.pdf_oss_key = pdf_oss_key
        # 合同变量,Map<String,String>的json格式
        self.var_json = var_json
        # 签署区设置
        self.sign_area_json = sign_area_json

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.ar_tp_no is not None:
            result['ar_tp_no'] = self.ar_tp_no
        if self.ar_tp_version is not None:
            result['ar_tp_version'] = self.ar_tp_version
        if self.ar_type is not None:
            result['ar_type'] = self.ar_type
        if self.myc_tp_id is not None:
            result['myc_tp_id'] = self.myc_tp_id
        if self.name is not None:
            result['name'] = self.name
        if self.org_no is not None:
            result['org_no'] = self.org_no
        if self.org_type is not None:
            result['org_type'] = self.org_type
        if self.pdf_oss_key is not None:
            result['pdf_oss_key'] = self.pdf_oss_key
        if self.var_json is not None:
            result['var_json'] = self.var_json
        if self.sign_area_json is not None:
            result['sign_area_json'] = self.sign_area_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ar_tp_no') is not None:
            self.ar_tp_no = m.get('ar_tp_no')
        if m.get('ar_tp_version') is not None:
            self.ar_tp_version = m.get('ar_tp_version')
        if m.get('ar_type') is not None:
            self.ar_type = m.get('ar_type')
        if m.get('myc_tp_id') is not None:
            self.myc_tp_id = m.get('myc_tp_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('org_no') is not None:
            self.org_no = m.get('org_no')
        if m.get('org_type') is not None:
            self.org_type = m.get('org_type')
        if m.get('pdf_oss_key') is not None:
            self.pdf_oss_key = m.get('pdf_oss_key')
        if m.get('var_json') is not None:
            self.var_json = m.get('var_json')
        if m.get('sign_area_json') is not None:
            self.sign_area_json = m.get('sign_area_json')
        return self


class HouseMgInfo(TeaModel):
    def __init__(
        self,
        debt_amount: str = None,
        debt_amount_currency: str = None,
        mortgagee_cert_no: str = None,
        mortgagee_cert_type: str = None,
        mortgagee_name: str = None,
        debt_end_date: str = None,
        debt_start_date: str = None,
        registered_date: str = None,
        house_no: str = None,
    ):
        # 债权金额，人民币默认单位元，保留两位小数点
        self.debt_amount = debt_amount
        # 债权金额货币类型，比如：CNY=人民币
        self.debt_amount_currency = debt_amount_currency
        # 抵押权人证件号码
        self.mortgagee_cert_no = mortgagee_cert_no
        # 抵押权人证件类型,比如：UNIFIED_SOCIAL_CODE=统一社会信用代码
        self.mortgagee_cert_type = mortgagee_cert_type
        # 抵押权人名称
        self.mortgagee_name = mortgagee_name
        # 履债结束日期
        self.debt_end_date = debt_end_date
        # 履债起始日期
        self.debt_start_date = debt_start_date
        # 登记时间
        self.registered_date = registered_date
        # 房产链内部房产编号
        self.house_no = house_no

    def validate(self):
        if self.debt_end_date is not None:
            self.validate_pattern(self.debt_end_date, 'debt_end_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.debt_start_date is not None:
            self.validate_pattern(self.debt_start_date, 'debt_start_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.registered_date is not None:
            self.validate_pattern(self.registered_date, 'registered_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.debt_amount is not None:
            result['debt_amount'] = self.debt_amount
        if self.debt_amount_currency is not None:
            result['debt_amount_currency'] = self.debt_amount_currency
        if self.mortgagee_cert_no is not None:
            result['mortgagee_cert_no'] = self.mortgagee_cert_no
        if self.mortgagee_cert_type is not None:
            result['mortgagee_cert_type'] = self.mortgagee_cert_type
        if self.mortgagee_name is not None:
            result['mortgagee_name'] = self.mortgagee_name
        if self.debt_end_date is not None:
            result['debt_end_date'] = self.debt_end_date
        if self.debt_start_date is not None:
            result['debt_start_date'] = self.debt_start_date
        if self.registered_date is not None:
            result['registered_date'] = self.registered_date
        if self.house_no is not None:
            result['house_no'] = self.house_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('debt_amount') is not None:
            self.debt_amount = m.get('debt_amount')
        if m.get('debt_amount_currency') is not None:
            self.debt_amount_currency = m.get('debt_amount_currency')
        if m.get('mortgagee_cert_no') is not None:
            self.mortgagee_cert_no = m.get('mortgagee_cert_no')
        if m.get('mortgagee_cert_type') is not None:
            self.mortgagee_cert_type = m.get('mortgagee_cert_type')
        if m.get('mortgagee_name') is not None:
            self.mortgagee_name = m.get('mortgagee_name')
        if m.get('debt_end_date') is not None:
            self.debt_end_date = m.get('debt_end_date')
        if m.get('debt_start_date') is not None:
            self.debt_start_date = m.get('debt_start_date')
        if m.get('registered_date') is not None:
            self.registered_date = m.get('registered_date')
        if m.get('house_no') is not None:
            self.house_no = m.get('house_no')
        return self


class HouseRestrictionInfo(TeaModel):
    def __init__(
        self,
        applicant: str = None,
        restriction_end_date: str = None,
        restriction_start_date: str = None,
        from_org_name: str = None,
        register_time: str = None,
        restricted_amount: str = None,
        restricted_amount_currency: str = None,
        restriction_no: str = None,
        house_no: str = None,
    ):
        # 申请人
        # 
        self.applicant = applicant
        # 限制结束日期
        self.restriction_end_date = restriction_end_date
        # 限制起始日期
        self.restriction_start_date = restriction_start_date
        # 来文单位
        self.from_org_name = from_org_name
        # 登记时间
        self.register_time = register_time
        # 限制金额，人民币默认单位元，保留两位小数点
        self.restricted_amount = restricted_amount
        # 限制金额货币类型，比如：CNY=人民币
        self.restricted_amount_currency = restricted_amount_currency
        # 限制文号
        self.restriction_no = restriction_no
        # 房产链内部房产编号
        self.house_no = house_no

    def validate(self):
        if self.restriction_end_date is not None:
            self.validate_pattern(self.restriction_end_date, 'restriction_end_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.restriction_start_date is not None:
            self.validate_pattern(self.restriction_start_date, 'restriction_start_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.register_time is not None:
            self.validate_pattern(self.register_time, 'register_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.applicant is not None:
            result['applicant'] = self.applicant
        if self.restriction_end_date is not None:
            result['restriction_end_date'] = self.restriction_end_date
        if self.restriction_start_date is not None:
            result['restriction_start_date'] = self.restriction_start_date
        if self.from_org_name is not None:
            result['from_org_name'] = self.from_org_name
        if self.register_time is not None:
            result['register_time'] = self.register_time
        if self.restricted_amount is not None:
            result['restricted_amount'] = self.restricted_amount
        if self.restricted_amount_currency is not None:
            result['restricted_amount_currency'] = self.restricted_amount_currency
        if self.restriction_no is not None:
            result['restriction_no'] = self.restriction_no
        if self.house_no is not None:
            result['house_no'] = self.house_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('applicant') is not None:
            self.applicant = m.get('applicant')
        if m.get('restriction_end_date') is not None:
            self.restriction_end_date = m.get('restriction_end_date')
        if m.get('restriction_start_date') is not None:
            self.restriction_start_date = m.get('restriction_start_date')
        if m.get('from_org_name') is not None:
            self.from_org_name = m.get('from_org_name')
        if m.get('register_time') is not None:
            self.register_time = m.get('register_time')
        if m.get('restricted_amount') is not None:
            self.restricted_amount = m.get('restricted_amount')
        if m.get('restricted_amount_currency') is not None:
            self.restricted_amount_currency = m.get('restricted_amount_currency')
        if m.get('restriction_no') is not None:
            self.restriction_no = m.get('restriction_no')
        if m.get('house_no') is not None:
            self.house_no = m.get('house_no')
        return self


class SignInfo(TeaModel):
    def __init__(
        self,
        signer: EntityBasicInfo = None,
        sign_type: str = None,
        sign_page: int = None,
        sign_position_x: str = None,
        sign_position_y: str = None,
    ):
        # 签署人
        self.signer = signer
        # 签署类型，可选值：SINGLE_PAGE、CROSS_PAGE
        self.sign_type = sign_type
        # 签署页码
        self.sign_page = sign_page
        # 签署x坐标
        self.sign_position_x = sign_position_x
        # 签署y坐标
        self.sign_position_y = sign_position_y

    def validate(self):
        self.validate_required(self.signer, 'signer')
        if self.signer:
            self.signer.validate()
        self.validate_required(self.sign_type, 'sign_type')
        self.validate_required(self.sign_page, 'sign_page')
        self.validate_required(self.sign_position_x, 'sign_position_x')
        self.validate_required(self.sign_position_y, 'sign_position_y')

    def to_map(self):
        result = dict()
        if self.signer is not None:
            result['signer'] = self.signer.to_map()
        if self.sign_type is not None:
            result['sign_type'] = self.sign_type
        if self.sign_page is not None:
            result['sign_page'] = self.sign_page
        if self.sign_position_x is not None:
            result['sign_position_x'] = self.sign_position_x
        if self.sign_position_y is not None:
            result['sign_position_y'] = self.sign_position_y
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('signer') is not None:
            temp_model = EntityBasicInfo()
            self.signer = temp_model.from_map(m['signer'])
        if m.get('sign_type') is not None:
            self.sign_type = m.get('sign_type')
        if m.get('sign_page') is not None:
            self.sign_page = m.get('sign_page')
        if m.get('sign_position_x') is not None:
            self.sign_position_x = m.get('sign_position_x')
        if m.get('sign_position_y') is not None:
            self.sign_position_y = m.get('sign_position_y')
        return self


class ArSignConfig(TeaModel):
    def __init__(
        self,
        ar_signer_type: str = None,
        ar_sign_fields: List[ArSignField] = None,
        signer: Person = None,
    ):
        # 签约者类型，比如：BANK=银行
        self.ar_signer_type = ar_signer_type
        # 签署区列表
        self.ar_sign_fields = ar_sign_fields
        # 签署人
        self.signer = signer

    def validate(self):
        if self.ar_sign_fields:
            for k in self.ar_sign_fields:
                if k:
                    k.validate()
        if self.signer:
            self.signer.validate()

    def to_map(self):
        result = dict()
        if self.ar_signer_type is not None:
            result['ar_signer_type'] = self.ar_signer_type
        result['ar_sign_fields'] = []
        if self.ar_sign_fields is not None:
            for k in self.ar_sign_fields:
                result['ar_sign_fields'].append(k.to_map() if k else None)
        if self.signer is not None:
            result['signer'] = self.signer.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ar_signer_type') is not None:
            self.ar_signer_type = m.get('ar_signer_type')
        self.ar_sign_fields = []
        if m.get('ar_sign_fields') is not None:
            for k in m.get('ar_sign_fields'):
                temp_model = ArSignField()
                self.ar_sign_fields.append(temp_model.from_map(k))
        if m.get('signer') is not None:
            temp_model = Person()
            self.signer = temp_model.from_map(m['signer'])
        return self


class HouseOwner(TeaModel):
    def __init__(
        self,
        name: str = None,
        cert_type: str = None,
        cert_no: str = None,
        mobile: str = None,
        cert_front_pic_oss_key: str = None,
        cert_back_pic_oss_key: str = None,
        obligee_type: str = None,
        obligee_role: str = None,
        ownership_status: str = None,
        house_cert_type: str = None,
        house_cert_no: str = None,
        rights_rate: str = None,
        cm_no: str = None,
        house_no: str = None,
    ):
        # 姓名
        self.name = name
        # 证件类型
        self.cert_type = cert_type
        # 证件号
        self.cert_no = cert_no
        # 手机号
        self.mobile = mobile
        # 身份证正面照片存储路径
        self.cert_front_pic_oss_key = cert_front_pic_oss_key
        # 身份证反面照片存储路径
        self.cert_back_pic_oss_key = cert_back_pic_oss_key
        # 权利人主体类型，PERSON=个人
        self.obligee_type = obligee_type
        # 权利人类型
        self.obligee_role = obligee_role
        # 共有情况
        self.ownership_status = ownership_status
        # 权证类型
        self.house_cert_type = house_cert_type
        # 权证号
        self.house_cert_no = house_cert_no
        # 权利比例
        self.rights_rate = rights_rate
        # 房产链内部客户编号
        self.cm_no = cm_no
        # 房产链内部房产编号
        self.house_no = house_no

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.cert_front_pic_oss_key is not None:
            result['cert_front_pic_oss_key'] = self.cert_front_pic_oss_key
        if self.cert_back_pic_oss_key is not None:
            result['cert_back_pic_oss_key'] = self.cert_back_pic_oss_key
        if self.obligee_type is not None:
            result['obligee_type'] = self.obligee_type
        if self.obligee_role is not None:
            result['obligee_role'] = self.obligee_role
        if self.ownership_status is not None:
            result['ownership_status'] = self.ownership_status
        if self.house_cert_type is not None:
            result['house_cert_type'] = self.house_cert_type
        if self.house_cert_no is not None:
            result['house_cert_no'] = self.house_cert_no
        if self.rights_rate is not None:
            result['rights_rate'] = self.rights_rate
        if self.cm_no is not None:
            result['cm_no'] = self.cm_no
        if self.house_no is not None:
            result['house_no'] = self.house_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('cert_front_pic_oss_key') is not None:
            self.cert_front_pic_oss_key = m.get('cert_front_pic_oss_key')
        if m.get('cert_back_pic_oss_key') is not None:
            self.cert_back_pic_oss_key = m.get('cert_back_pic_oss_key')
        if m.get('obligee_type') is not None:
            self.obligee_type = m.get('obligee_type')
        if m.get('obligee_role') is not None:
            self.obligee_role = m.get('obligee_role')
        if m.get('ownership_status') is not None:
            self.ownership_status = m.get('ownership_status')
        if m.get('house_cert_type') is not None:
            self.house_cert_type = m.get('house_cert_type')
        if m.get('house_cert_no') is not None:
            self.house_cert_no = m.get('house_cert_no')
        if m.get('rights_rate') is not None:
            self.rights_rate = m.get('rights_rate')
        if m.get('cm_no') is not None:
            self.cm_no = m.get('cm_no')
        if m.get('house_no') is not None:
            self.house_no = m.get('house_no')
        return self


class Agreement(TeaModel):
    def __init__(
        self,
        ar_archive_oss_path: str = None,
        ar_no: str = None,
        ar_template: ArTemplate = None,
        ar_type: str = None,
        ar_signer_roles: List[str] = None,
        ar_var_value_json: str = None,
        myc_file_no: str = None,
        out_ar_no: str = None,
        proc_no: str = None,
        sign_time: str = None,
        status: str = None,
        un_sign_ar_archive_oss_path: str = None,
        ar_generate_type: str = None,
        ct_sign_configs: List[ArSignConfig] = None,
        org_sign_configs: List[ArSignConfig] = None,
        org_sign_status: str = None,
        org_sign_time: str = None,
        org_ar_archive_oss_path: str = None,
        final_ar_archive_oss_path: str = None,
    ):
        # 电子合同pdf文件存储路径
        self.ar_archive_oss_path = ar_archive_oss_path
        # 合同编号
        self.ar_no = ar_no
        # 合同模版
        self.ar_template = ar_template
        # 合同类型，比如：房屋查询授权合同
        self.ar_type = ar_type
        # 需要签署合同的角色列表，如：BANK,HOUSE_OWNER,BORROWER
        self.ar_signer_roles = ar_signer_roles
        # 合同模版需要的变量和值集合,Map<String,String>的json格式
        self.ar_var_value_json = ar_var_value_json
        # 区块链智能合同合同文件号
        self.myc_file_no = myc_file_no
        # 外部合同编号(银行生成)
        self.out_ar_no = out_ar_no
        # 合同签署流程编号
        self.proc_no = proc_no
        # 合同签署时间
        self.sign_time = sign_time
        # 签署状态，比如：SUCC=签署完成
        self.status = status
        # 待签署的合同文档oss存储路径，仅当不动产合同才有
        self.un_sign_ar_archive_oss_path = un_sign_ar_archive_oss_path
        # 合同生成方式，AR_TP=模版
        self.ar_generate_type = ar_generate_type
        # 智能合同部分的签署区设置
        self.ct_sign_configs = ct_sign_configs
        # 机构自主签署部分的签署区设置
        self.org_sign_configs = org_sign_configs
        # 机构签署状态，SUCC=签署完成
        self.org_sign_status = org_sign_status
        # 机构签署完成时间
        self.org_sign_time = org_sign_time
        # 机构签署完成后的合同存储路径
        self.org_ar_archive_oss_path = org_ar_archive_oss_path
        # 最终签署完成的合同存储路径
        self.final_ar_archive_oss_path = final_ar_archive_oss_path

    def validate(self):
        if self.ar_template:
            self.ar_template.validate()
        if self.sign_time is not None:
            self.validate_pattern(self.sign_time, 'sign_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.ct_sign_configs:
            for k in self.ct_sign_configs:
                if k:
                    k.validate()
        if self.org_sign_configs:
            for k in self.org_sign_configs:
                if k:
                    k.validate()
        if self.org_sign_time is not None:
            self.validate_pattern(self.org_sign_time, 'org_sign_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.ar_archive_oss_path is not None:
            result['ar_archive_oss_path'] = self.ar_archive_oss_path
        if self.ar_no is not None:
            result['ar_no'] = self.ar_no
        if self.ar_template is not None:
            result['ar_template'] = self.ar_template.to_map()
        if self.ar_type is not None:
            result['ar_type'] = self.ar_type
        if self.ar_signer_roles is not None:
            result['ar_signer_roles'] = self.ar_signer_roles
        if self.ar_var_value_json is not None:
            result['ar_var_value_json'] = self.ar_var_value_json
        if self.myc_file_no is not None:
            result['myc_file_no'] = self.myc_file_no
        if self.out_ar_no is not None:
            result['out_ar_no'] = self.out_ar_no
        if self.proc_no is not None:
            result['proc_no'] = self.proc_no
        if self.sign_time is not None:
            result['sign_time'] = self.sign_time
        if self.status is not None:
            result['status'] = self.status
        if self.un_sign_ar_archive_oss_path is not None:
            result['un_sign_ar_archive_oss_path'] = self.un_sign_ar_archive_oss_path
        if self.ar_generate_type is not None:
            result['ar_generate_type'] = self.ar_generate_type
        result['ct_sign_configs'] = []
        if self.ct_sign_configs is not None:
            for k in self.ct_sign_configs:
                result['ct_sign_configs'].append(k.to_map() if k else None)
        result['org_sign_configs'] = []
        if self.org_sign_configs is not None:
            for k in self.org_sign_configs:
                result['org_sign_configs'].append(k.to_map() if k else None)
        if self.org_sign_status is not None:
            result['org_sign_status'] = self.org_sign_status
        if self.org_sign_time is not None:
            result['org_sign_time'] = self.org_sign_time
        if self.org_ar_archive_oss_path is not None:
            result['org_ar_archive_oss_path'] = self.org_ar_archive_oss_path
        if self.final_ar_archive_oss_path is not None:
            result['final_ar_archive_oss_path'] = self.final_ar_archive_oss_path
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ar_archive_oss_path') is not None:
            self.ar_archive_oss_path = m.get('ar_archive_oss_path')
        if m.get('ar_no') is not None:
            self.ar_no = m.get('ar_no')
        if m.get('ar_template') is not None:
            temp_model = ArTemplate()
            self.ar_template = temp_model.from_map(m['ar_template'])
        if m.get('ar_type') is not None:
            self.ar_type = m.get('ar_type')
        if m.get('ar_signer_roles') is not None:
            self.ar_signer_roles = m.get('ar_signer_roles')
        if m.get('ar_var_value_json') is not None:
            self.ar_var_value_json = m.get('ar_var_value_json')
        if m.get('myc_file_no') is not None:
            self.myc_file_no = m.get('myc_file_no')
        if m.get('out_ar_no') is not None:
            self.out_ar_no = m.get('out_ar_no')
        if m.get('proc_no') is not None:
            self.proc_no = m.get('proc_no')
        if m.get('sign_time') is not None:
            self.sign_time = m.get('sign_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('un_sign_ar_archive_oss_path') is not None:
            self.un_sign_ar_archive_oss_path = m.get('un_sign_ar_archive_oss_path')
        if m.get('ar_generate_type') is not None:
            self.ar_generate_type = m.get('ar_generate_type')
        self.ct_sign_configs = []
        if m.get('ct_sign_configs') is not None:
            for k in m.get('ct_sign_configs'):
                temp_model = ArSignConfig()
                self.ct_sign_configs.append(temp_model.from_map(k))
        self.org_sign_configs = []
        if m.get('org_sign_configs') is not None:
            for k in m.get('org_sign_configs'):
                temp_model = ArSignConfig()
                self.org_sign_configs.append(temp_model.from_map(k))
        if m.get('org_sign_status') is not None:
            self.org_sign_status = m.get('org_sign_status')
        if m.get('org_sign_time') is not None:
            self.org_sign_time = m.get('org_sign_time')
        if m.get('org_ar_archive_oss_path') is not None:
            self.org_ar_archive_oss_path = m.get('org_ar_archive_oss_path')
        if m.get('final_ar_archive_oss_path') is not None:
            self.final_ar_archive_oss_path = m.get('final_ar_archive_oss_path')
        return self


class MgCert(TeaModel):
    def __init__(
        self,
        house_no: str = None,
        location: str = None,
        mg_cert_no: str = None,
        new_other_right_cert_no: str = None,
        new_other_right_cert_path: str = None,
        new_other_right_cert_type: str = None,
        mortgagee_json: str = None,
        mortgagor_json: str = None,
        proof: str = None,
        other: str = None,
        supplement: str = None,
        license_number: str = None,
        printer: str = None,
        print_time: str = None,
        issuer: str = None,
        issuance_time: str = None,
        district_code: str = None,
        province_code: str = None,
        house_unit_code: str = None,
        released: str = None,
        mg_release_order_no: str = None,
        reg_cert_type: str = None,
        issuing_authority: str = None,
        debt_amt: str = None,
        mg_right_start_date: str = None,
        mg_right_end_date: str = None,
        mortgage_type: str = None,
    ):
        # 房产编号
        self.house_no = house_no
        # 坐落
        self.location = location
        # 抵押登记回执编号
        self.mg_cert_no = mg_cert_no
        # 新他项权证号
        self.new_other_right_cert_no = new_other_right_cert_no
        # 新他项权证电子证照地址
        self.new_other_right_cert_path = new_other_right_cert_path
        # 新他项权证类型，比如：MORTGAGE_REG_CERT=不动产登记证明(抵押权登记)
        self.new_other_right_cert_type = new_other_right_cert_type
        # 权利人
        self.mortgagee_json = mortgagee_json
        # 抵押义务人
        self.mortgagor_json = mortgagor_json
        # 证明权力或事项
        self.proof = proof
        # 不动产返回其他信息
        self.other = other
        # 不动产返回附记信息
        self.supplement = supplement
        # 发证工本号
        self.license_number = license_number
        # 缮证人
        self.printer = printer
        # 缮证时间
        self.print_time = print_time
        # 发证人
        self.issuer = issuer
        # 发证时间
        self.issuance_time = issuance_time
        # 区县代码
        self.district_code = district_code
        # 省编号
        self.province_code = province_code
        # 不动产单元号
        self.house_unit_code = house_unit_code
        # 是否在房产链已解抵
        self.released = released
        # 房产链内部解抵押单号
        self.mg_release_order_no = mg_release_order_no
        # 登记证明种类,MORTGAGE=抵押权证明
        self.reg_cert_type = reg_cert_type
        # 发证机关
        self.issuing_authority = issuing_authority
        # 债权金额
        self.debt_amt = debt_amt
        # 抵押权开始时间
        self.mg_right_start_date = mg_right_start_date
        # 抵押权结束日期
        self.mg_right_end_date = mg_right_end_date
        # 抵押方式，MAX_AMOUNT_MORT=最高额抵押
        self.mortgage_type = mortgage_type

    def validate(self):
        if self.print_time is not None:
            self.validate_pattern(self.print_time, 'print_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.issuance_time is not None:
            self.validate_pattern(self.issuance_time, 'issuance_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.mg_right_start_date is not None:
            self.validate_pattern(self.mg_right_start_date, 'mg_right_start_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.mg_right_end_date is not None:
            self.validate_pattern(self.mg_right_end_date, 'mg_right_end_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.house_no is not None:
            result['house_no'] = self.house_no
        if self.location is not None:
            result['location'] = self.location
        if self.mg_cert_no is not None:
            result['mg_cert_no'] = self.mg_cert_no
        if self.new_other_right_cert_no is not None:
            result['new_other_right_cert_no'] = self.new_other_right_cert_no
        if self.new_other_right_cert_path is not None:
            result['new_other_right_cert_path'] = self.new_other_right_cert_path
        if self.new_other_right_cert_type is not None:
            result['new_other_right_cert_type'] = self.new_other_right_cert_type
        if self.mortgagee_json is not None:
            result['mortgagee_json'] = self.mortgagee_json
        if self.mortgagor_json is not None:
            result['mortgagor_json'] = self.mortgagor_json
        if self.proof is not None:
            result['proof'] = self.proof
        if self.other is not None:
            result['other'] = self.other
        if self.supplement is not None:
            result['supplement'] = self.supplement
        if self.license_number is not None:
            result['license_number'] = self.license_number
        if self.printer is not None:
            result['printer'] = self.printer
        if self.print_time is not None:
            result['print_time'] = self.print_time
        if self.issuer is not None:
            result['issuer'] = self.issuer
        if self.issuance_time is not None:
            result['issuance_time'] = self.issuance_time
        if self.district_code is not None:
            result['district_code'] = self.district_code
        if self.province_code is not None:
            result['province_code'] = self.province_code
        if self.house_unit_code is not None:
            result['house_unit_code'] = self.house_unit_code
        if self.released is not None:
            result['released'] = self.released
        if self.mg_release_order_no is not None:
            result['mg_release_order_no'] = self.mg_release_order_no
        if self.reg_cert_type is not None:
            result['reg_cert_type'] = self.reg_cert_type
        if self.issuing_authority is not None:
            result['issuing_authority'] = self.issuing_authority
        if self.debt_amt is not None:
            result['debt_amt'] = self.debt_amt
        if self.mg_right_start_date is not None:
            result['mg_right_start_date'] = self.mg_right_start_date
        if self.mg_right_end_date is not None:
            result['mg_right_end_date'] = self.mg_right_end_date
        if self.mortgage_type is not None:
            result['mortgage_type'] = self.mortgage_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('house_no') is not None:
            self.house_no = m.get('house_no')
        if m.get('location') is not None:
            self.location = m.get('location')
        if m.get('mg_cert_no') is not None:
            self.mg_cert_no = m.get('mg_cert_no')
        if m.get('new_other_right_cert_no') is not None:
            self.new_other_right_cert_no = m.get('new_other_right_cert_no')
        if m.get('new_other_right_cert_path') is not None:
            self.new_other_right_cert_path = m.get('new_other_right_cert_path')
        if m.get('new_other_right_cert_type') is not None:
            self.new_other_right_cert_type = m.get('new_other_right_cert_type')
        if m.get('mortgagee_json') is not None:
            self.mortgagee_json = m.get('mortgagee_json')
        if m.get('mortgagor_json') is not None:
            self.mortgagor_json = m.get('mortgagor_json')
        if m.get('proof') is not None:
            self.proof = m.get('proof')
        if m.get('other') is not None:
            self.other = m.get('other')
        if m.get('supplement') is not None:
            self.supplement = m.get('supplement')
        if m.get('license_number') is not None:
            self.license_number = m.get('license_number')
        if m.get('printer') is not None:
            self.printer = m.get('printer')
        if m.get('print_time') is not None:
            self.print_time = m.get('print_time')
        if m.get('issuer') is not None:
            self.issuer = m.get('issuer')
        if m.get('issuance_time') is not None:
            self.issuance_time = m.get('issuance_time')
        if m.get('district_code') is not None:
            self.district_code = m.get('district_code')
        if m.get('province_code') is not None:
            self.province_code = m.get('province_code')
        if m.get('house_unit_code') is not None:
            self.house_unit_code = m.get('house_unit_code')
        if m.get('released') is not None:
            self.released = m.get('released')
        if m.get('mg_release_order_no') is not None:
            self.mg_release_order_no = m.get('mg_release_order_no')
        if m.get('reg_cert_type') is not None:
            self.reg_cert_type = m.get('reg_cert_type')
        if m.get('issuing_authority') is not None:
            self.issuing_authority = m.get('issuing_authority')
        if m.get('debt_amt') is not None:
            self.debt_amt = m.get('debt_amt')
        if m.get('mg_right_start_date') is not None:
            self.mg_right_start_date = m.get('mg_right_start_date')
        if m.get('mg_right_end_date') is not None:
            self.mg_right_end_date = m.get('mg_right_end_date')
        if m.get('mortgage_type') is not None:
            self.mortgage_type = m.get('mortgage_type')
        return self


class Bank(TeaModel):
    def __init__(
        self,
        address: str = None,
        bank_no: str = None,
        legal_person_cert_no: str = None,
        legal_person_mobile: str = None,
        legal_person_name: str = None,
        level: str = None,
        myc_org_id: str = None,
        name: str = None,
        oss_base_fold: str = None,
        cert_no: str = None,
        parent_bank_no: str = None,
        pdn_did: str = None,
        pub_key: str = None,
        tenant_id: str = None,
        legal_person_cert_type: str = None,
        auth_callback_url: str = None,
        mg_callback_url: str = None,
        bk_callback_url: str = None,
        cert_type: str = None,
    ):
        # 地址
        self.address = address
        # 银行编号
        self.bank_no = bank_no
        # 法人证件号
        self.legal_person_cert_no = legal_person_cert_no
        # 法人手机号
        self.legal_person_mobile = legal_person_mobile
        # 法人姓名
        self.legal_person_name = legal_person_name
        # 行内级别，比如：SUB_BRANCH=支行
        self.level = level
        # 蚂蚁智能合同的机构id
        self.myc_org_id = myc_org_id
        # 银行名称
        self.name = name
        # OSS存储跟路径
        self.oss_base_fold = oss_base_fold
        # 银行证件号
        self.cert_no = cert_no
        # 上级行号，比如支行对应的分行
        self.parent_bank_no = parent_bank_no
        # 蚂蚁链隐私数据网络的身份id
        self.pdn_did = pdn_did
        # 公钥
        self.pub_key = pub_key
        # 租户ID
        self.tenant_id = tenant_id
        # 法人证件类型，比如：ID_CARD=身份证
        self.legal_person_cert_type = legal_person_cert_type
        # 授权合同签署后小程序端的回跳地址
        self.auth_callback_url = auth_callback_url
        # 抵押登记相关合同签署后小程序端的回跳地址
        self.mg_callback_url = mg_callback_url
        # 银行接收房产链通知接口地址
        self.bk_callback_url = bk_callback_url
        # 银行证件类型
        self.cert_type = cert_type

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.address is not None:
            result['address'] = self.address
        if self.bank_no is not None:
            result['bank_no'] = self.bank_no
        if self.legal_person_cert_no is not None:
            result['legal_person_cert_no'] = self.legal_person_cert_no
        if self.legal_person_mobile is not None:
            result['legal_person_mobile'] = self.legal_person_mobile
        if self.legal_person_name is not None:
            result['legal_person_name'] = self.legal_person_name
        if self.level is not None:
            result['level'] = self.level
        if self.myc_org_id is not None:
            result['myc_org_id'] = self.myc_org_id
        if self.name is not None:
            result['name'] = self.name
        if self.oss_base_fold is not None:
            result['oss_base_fold'] = self.oss_base_fold
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.parent_bank_no is not None:
            result['parent_bank_no'] = self.parent_bank_no
        if self.pdn_did is not None:
            result['pdn_did'] = self.pdn_did
        if self.pub_key is not None:
            result['pub_key'] = self.pub_key
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.legal_person_cert_type is not None:
            result['legal_person_cert_type'] = self.legal_person_cert_type
        if self.auth_callback_url is not None:
            result['auth_callback_url'] = self.auth_callback_url
        if self.mg_callback_url is not None:
            result['mg_callback_url'] = self.mg_callback_url
        if self.bk_callback_url is not None:
            result['bk_callback_url'] = self.bk_callback_url
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('bank_no') is not None:
            self.bank_no = m.get('bank_no')
        if m.get('legal_person_cert_no') is not None:
            self.legal_person_cert_no = m.get('legal_person_cert_no')
        if m.get('legal_person_mobile') is not None:
            self.legal_person_mobile = m.get('legal_person_mobile')
        if m.get('legal_person_name') is not None:
            self.legal_person_name = m.get('legal_person_name')
        if m.get('level') is not None:
            self.level = m.get('level')
        if m.get('myc_org_id') is not None:
            self.myc_org_id = m.get('myc_org_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('oss_base_fold') is not None:
            self.oss_base_fold = m.get('oss_base_fold')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('parent_bank_no') is not None:
            self.parent_bank_no = m.get('parent_bank_no')
        if m.get('pdn_did') is not None:
            self.pdn_did = m.get('pdn_did')
        if m.get('pub_key') is not None:
            self.pub_key = m.get('pub_key')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('legal_person_cert_type') is not None:
            self.legal_person_cert_type = m.get('legal_person_cert_type')
        if m.get('auth_callback_url') is not None:
            self.auth_callback_url = m.get('auth_callback_url')
        if m.get('mg_callback_url') is not None:
            self.mg_callback_url = m.get('mg_callback_url')
        if m.get('bk_callback_url') is not None:
            self.bk_callback_url = m.get('bk_callback_url')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        return self


class Archive(TeaModel):
    def __init__(
        self,
        archive_hash: str = None,
        archive_type: str = None,
        bank_oss_key: str = None,
        oss_key: str = None,
        out_biz_no: str = None,
        owner_no: str = None,
        owner_type: str = None,
        rtc_oss_key: str = None,
        scene: str = None,
        rcp_oss_key: str = None,
        loan_assist_platform_oss_key: str = None,
    ):
        # 附件内容的Hash值
        self.archive_hash = archive_hash
        # 附件材料类型，比如：AT_SUOYOUQUANZHENG=房屋所有权证
        self.archive_type = archive_type
        # 移动后到银行目录下的oss存储路径
        self.bank_oss_key = bank_oss_key
        # 附件KEY，也是oss的存储路径，原始保存路径
        self.oss_key = oss_key
        # 附件来源外部业务单号
        self.out_biz_no = out_biz_no
        # 机构编号
        self.owner_no = owner_no
        # 附件材料归属机构类型，比如：BANK=银行
        self.owner_type = owner_type
        # 移动到不动产中心目录下的oss存储路径
        self.rtc_oss_key = rtc_oss_key
        # 材料附件来源场景，比如：ASS_BK_APPLY=银行申请抵押提交
        self.scene = scene
        # 房产链平台的存储路径
        self.rcp_oss_key = rcp_oss_key
        # 助贷平台的访问路径
        self.loan_assist_platform_oss_key = loan_assist_platform_oss_key

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.archive_hash is not None:
            result['archive_hash'] = self.archive_hash
        if self.archive_type is not None:
            result['archive_type'] = self.archive_type
        if self.bank_oss_key is not None:
            result['bank_oss_key'] = self.bank_oss_key
        if self.oss_key is not None:
            result['oss_key'] = self.oss_key
        if self.out_biz_no is not None:
            result['out_biz_no'] = self.out_biz_no
        if self.owner_no is not None:
            result['owner_no'] = self.owner_no
        if self.owner_type is not None:
            result['owner_type'] = self.owner_type
        if self.rtc_oss_key is not None:
            result['rtc_oss_key'] = self.rtc_oss_key
        if self.scene is not None:
            result['scene'] = self.scene
        if self.rcp_oss_key is not None:
            result['rcp_oss_key'] = self.rcp_oss_key
        if self.loan_assist_platform_oss_key is not None:
            result['loan_assist_platform_oss_key'] = self.loan_assist_platform_oss_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('archive_hash') is not None:
            self.archive_hash = m.get('archive_hash')
        if m.get('archive_type') is not None:
            self.archive_type = m.get('archive_type')
        if m.get('bank_oss_key') is not None:
            self.bank_oss_key = m.get('bank_oss_key')
        if m.get('oss_key') is not None:
            self.oss_key = m.get('oss_key')
        if m.get('out_biz_no') is not None:
            self.out_biz_no = m.get('out_biz_no')
        if m.get('owner_no') is not None:
            self.owner_no = m.get('owner_no')
        if m.get('owner_type') is not None:
            self.owner_type = m.get('owner_type')
        if m.get('rtc_oss_key') is not None:
            self.rtc_oss_key = m.get('rtc_oss_key')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('rcp_oss_key') is not None:
            self.rcp_oss_key = m.get('rcp_oss_key')
        if m.get('loan_assist_platform_oss_key') is not None:
            self.loan_assist_platform_oss_key = m.get('loan_assist_platform_oss_key')
        return self


class House(TeaModel):
    def __init__(
        self,
        area_code: str = None,
        claimed: str = None,
        file_recorded: str = None,
        house_cert_no: str = None,
        house_cert_type: str = None,
        house_code: str = None,
        house_mg_infos: List[HouseMgInfo] = None,
        house_no: str = None,
        house_owners: List[HouseOwner] = None,
        house_restriction_infos: List[HouseRestrictionInfo] = None,
        house_unit_code: str = None,
        house_unit_codes: List[str] = None,
        invisible_house_owners: List[HouseOwner] = None,
        location: str = None,
        mortgaged: str = None,
        ownership_status: str = None,
        query_time: str = None,
        realty_usage: str = None,
        seized: str = None,
        sharing_land_area: str = None,
        sharing_land_area_unit: str = None,
        house_owner_cm_no: str = None,
        structure_area: str = None,
        structure_area_unit: str = None,
        rights_nature: str = None,
        rights_type: str = None,
        house_nature: str = None,
        land_cert_no: str = None,
        land_usage: str = None,
        land_nature: str = None,
        land_use_start_date: str = None,
        land_use_end_date: str = None,
        total_floor: str = None,
        its_floor: str = None,
        built_year: str = None,
        reg_date: str = None,
        cert_remark: str = None,
        cert_status: str = None,
    ):
        # 房屋所在区/县地区编码
        self.area_code = area_code
        # 是否有异议，Y-是，N-否
        self.claimed = claimed
        # 是否有文件备案
        self.file_recorded = file_recorded
        # 产证编号
        self.house_cert_no = house_cert_no
        # 权证类型，比如：HOUSE_CERT=房屋所有权证
        self.house_cert_type = house_cert_type
        # 房产编号
        self.house_code = house_code
        # 抵押信息列表
        self.house_mg_infos = house_mg_infos
        # 房产编号
        self.house_no = house_no
        # 产权人列表
        self.house_owners = house_owners
        # 限制信息列表
        self.house_restriction_infos = house_restriction_infos
        # 不动产单元号
        self.house_unit_code = house_unit_code
        # 不动产单元号，待废弃字段
        self.house_unit_codes = house_unit_codes
        # 隐形产权人列表
        self.invisible_house_owners = invisible_house_owners
        # 房屋所在地址信息
        self.location = location
        # 是否有抵押，Y-是，N-否
        self.mortgaged = mortgaged
        # 共有情况,比如：SHARE_COOWNER=共同共有
        self.ownership_status = ownership_status
        # 数据获取时间
        self.query_time = query_time
        # 用途,比如：HOUSE=住宅
        self.realty_usage = realty_usage
        # 是否有查封：Y-是，N-否
        self.seized = seized
        # 土地分摊面积
        self.sharing_land_area = sharing_land_area
        # 土地分摊面积单位，比如：SQUARE_METER=平方米
        self.sharing_land_area_unit = sharing_land_area_unit
        # 当前产证归属的房产链产权人内部编号
        self.house_owner_cm_no = house_owner_cm_no
        # 建筑面积
        self.structure_area = structure_area
        # 建筑面积单位，比如：SQUARE_METER=平方米
        self.structure_area_unit = structure_area_unit
        # 权利性质
        self.rights_nature = rights_nature
        # 权利类型,STATE_OWNED_CONSTRUCTION_LAND_AND_BUILDING=国有建设用地使用权/房屋（构筑物）所有权
        self.rights_type = rights_type
        # 房屋性质,COMMERCIAL_HOUSING=商品房
        self.house_nature = house_nature
        # 土地证号
        self.land_cert_no = land_cert_no
        # 土地用途
        self.land_usage = land_usage
        # 土地性质,SELL=出让
        self.land_nature = land_nature
        # 土地使用权开始日期
        self.land_use_start_date = land_use_start_date
        # 土地使用权终止日期
        self.land_use_end_date = land_use_end_date
        # 总层数
        self.total_floor = total_floor
        # 所在层
        self.its_floor = its_floor
        # 建造年份
        self.built_year = built_year
        # 登薄日期
        self.reg_date = reg_date
        # 证书附记备注
        self.cert_remark = cert_remark
        # 证书状态描述
        self.cert_status = cert_status

    def validate(self):
        if self.house_mg_infos:
            for k in self.house_mg_infos:
                if k:
                    k.validate()
        if self.house_owners:
            for k in self.house_owners:
                if k:
                    k.validate()
        if self.house_restriction_infos:
            for k in self.house_restriction_infos:
                if k:
                    k.validate()
        if self.invisible_house_owners:
            for k in self.invisible_house_owners:
                if k:
                    k.validate()
        if self.query_time is not None:
            self.validate_pattern(self.query_time, 'query_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.land_use_start_date is not None:
            self.validate_pattern(self.land_use_start_date, 'land_use_start_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.land_use_end_date is not None:
            self.validate_pattern(self.land_use_end_date, 'land_use_end_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.reg_date is not None:
            self.validate_pattern(self.reg_date, 'reg_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.area_code is not None:
            result['area_code'] = self.area_code
        if self.claimed is not None:
            result['claimed'] = self.claimed
        if self.file_recorded is not None:
            result['file_recorded'] = self.file_recorded
        if self.house_cert_no is not None:
            result['house_cert_no'] = self.house_cert_no
        if self.house_cert_type is not None:
            result['house_cert_type'] = self.house_cert_type
        if self.house_code is not None:
            result['house_code'] = self.house_code
        result['house_mg_infos'] = []
        if self.house_mg_infos is not None:
            for k in self.house_mg_infos:
                result['house_mg_infos'].append(k.to_map() if k else None)
        if self.house_no is not None:
            result['house_no'] = self.house_no
        result['house_owners'] = []
        if self.house_owners is not None:
            for k in self.house_owners:
                result['house_owners'].append(k.to_map() if k else None)
        result['house_restriction_infos'] = []
        if self.house_restriction_infos is not None:
            for k in self.house_restriction_infos:
                result['house_restriction_infos'].append(k.to_map() if k else None)
        if self.house_unit_code is not None:
            result['house_unit_code'] = self.house_unit_code
        if self.house_unit_codes is not None:
            result['house_unit_codes'] = self.house_unit_codes
        result['invisible_house_owners'] = []
        if self.invisible_house_owners is not None:
            for k in self.invisible_house_owners:
                result['invisible_house_owners'].append(k.to_map() if k else None)
        if self.location is not None:
            result['location'] = self.location
        if self.mortgaged is not None:
            result['mortgaged'] = self.mortgaged
        if self.ownership_status is not None:
            result['ownership_status'] = self.ownership_status
        if self.query_time is not None:
            result['query_time'] = self.query_time
        if self.realty_usage is not None:
            result['realty_usage'] = self.realty_usage
        if self.seized is not None:
            result['seized'] = self.seized
        if self.sharing_land_area is not None:
            result['sharing_land_area'] = self.sharing_land_area
        if self.sharing_land_area_unit is not None:
            result['sharing_land_area_unit'] = self.sharing_land_area_unit
        if self.house_owner_cm_no is not None:
            result['house_owner_cm_no'] = self.house_owner_cm_no
        if self.structure_area is not None:
            result['structure_area'] = self.structure_area
        if self.structure_area_unit is not None:
            result['structure_area_unit'] = self.structure_area_unit
        if self.rights_nature is not None:
            result['rights_nature'] = self.rights_nature
        if self.rights_type is not None:
            result['rights_type'] = self.rights_type
        if self.house_nature is not None:
            result['house_nature'] = self.house_nature
        if self.land_cert_no is not None:
            result['land_cert_no'] = self.land_cert_no
        if self.land_usage is not None:
            result['land_usage'] = self.land_usage
        if self.land_nature is not None:
            result['land_nature'] = self.land_nature
        if self.land_use_start_date is not None:
            result['land_use_start_date'] = self.land_use_start_date
        if self.land_use_end_date is not None:
            result['land_use_end_date'] = self.land_use_end_date
        if self.total_floor is not None:
            result['total_floor'] = self.total_floor
        if self.its_floor is not None:
            result['its_floor'] = self.its_floor
        if self.built_year is not None:
            result['built_year'] = self.built_year
        if self.reg_date is not None:
            result['reg_date'] = self.reg_date
        if self.cert_remark is not None:
            result['cert_remark'] = self.cert_remark
        if self.cert_status is not None:
            result['cert_status'] = self.cert_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('area_code') is not None:
            self.area_code = m.get('area_code')
        if m.get('claimed') is not None:
            self.claimed = m.get('claimed')
        if m.get('file_recorded') is not None:
            self.file_recorded = m.get('file_recorded')
        if m.get('house_cert_no') is not None:
            self.house_cert_no = m.get('house_cert_no')
        if m.get('house_cert_type') is not None:
            self.house_cert_type = m.get('house_cert_type')
        if m.get('house_code') is not None:
            self.house_code = m.get('house_code')
        self.house_mg_infos = []
        if m.get('house_mg_infos') is not None:
            for k in m.get('house_mg_infos'):
                temp_model = HouseMgInfo()
                self.house_mg_infos.append(temp_model.from_map(k))
        if m.get('house_no') is not None:
            self.house_no = m.get('house_no')
        self.house_owners = []
        if m.get('house_owners') is not None:
            for k in m.get('house_owners'):
                temp_model = HouseOwner()
                self.house_owners.append(temp_model.from_map(k))
        self.house_restriction_infos = []
        if m.get('house_restriction_infos') is not None:
            for k in m.get('house_restriction_infos'):
                temp_model = HouseRestrictionInfo()
                self.house_restriction_infos.append(temp_model.from_map(k))
        if m.get('house_unit_code') is not None:
            self.house_unit_code = m.get('house_unit_code')
        if m.get('house_unit_codes') is not None:
            self.house_unit_codes = m.get('house_unit_codes')
        self.invisible_house_owners = []
        if m.get('invisible_house_owners') is not None:
            for k in m.get('invisible_house_owners'):
                temp_model = HouseOwner()
                self.invisible_house_owners.append(temp_model.from_map(k))
        if m.get('location') is not None:
            self.location = m.get('location')
        if m.get('mortgaged') is not None:
            self.mortgaged = m.get('mortgaged')
        if m.get('ownership_status') is not None:
            self.ownership_status = m.get('ownership_status')
        if m.get('query_time') is not None:
            self.query_time = m.get('query_time')
        if m.get('realty_usage') is not None:
            self.realty_usage = m.get('realty_usage')
        if m.get('seized') is not None:
            self.seized = m.get('seized')
        if m.get('sharing_land_area') is not None:
            self.sharing_land_area = m.get('sharing_land_area')
        if m.get('sharing_land_area_unit') is not None:
            self.sharing_land_area_unit = m.get('sharing_land_area_unit')
        if m.get('house_owner_cm_no') is not None:
            self.house_owner_cm_no = m.get('house_owner_cm_no')
        if m.get('structure_area') is not None:
            self.structure_area = m.get('structure_area')
        if m.get('structure_area_unit') is not None:
            self.structure_area_unit = m.get('structure_area_unit')
        if m.get('rights_nature') is not None:
            self.rights_nature = m.get('rights_nature')
        if m.get('rights_type') is not None:
            self.rights_type = m.get('rights_type')
        if m.get('house_nature') is not None:
            self.house_nature = m.get('house_nature')
        if m.get('land_cert_no') is not None:
            self.land_cert_no = m.get('land_cert_no')
        if m.get('land_usage') is not None:
            self.land_usage = m.get('land_usage')
        if m.get('land_nature') is not None:
            self.land_nature = m.get('land_nature')
        if m.get('land_use_start_date') is not None:
            self.land_use_start_date = m.get('land_use_start_date')
        if m.get('land_use_end_date') is not None:
            self.land_use_end_date = m.get('land_use_end_date')
        if m.get('total_floor') is not None:
            self.total_floor = m.get('total_floor')
        if m.get('its_floor') is not None:
            self.its_floor = m.get('its_floor')
        if m.get('built_year') is not None:
            self.built_year = m.get('built_year')
        if m.get('reg_date') is not None:
            self.reg_date = m.get('reg_date')
        if m.get('cert_remark') is not None:
            self.cert_remark = m.get('cert_remark')
        if m.get('cert_status') is not None:
            self.cert_status = m.get('cert_status')
        return self


class ArSignTask(TeaModel):
    def __init__(
        self,
        cert_no: str = None,
        cert_type: str = None,
        cm_no: str = None,
        name: str = None,
        proc_no: str = None,
        sign_url: str = None,
        status: str = None,
        myc_account_id: str = None,
    ):
        # 证件号
        self.cert_no = cert_no
        # 证件类型，比如：ID_CARD=身份证
        self.cert_type = cert_type
        # 客户编号
        self.cm_no = cm_no
        # 姓名
        self.name = name
        # 签署流程编号
        self.proc_no = proc_no
        # 合同签署地址
        self.sign_url = sign_url
        # 签署状态 ，比如：INIT=待签署
        self.status = status
        # 智慧合同签署账号id
        self.myc_account_id = myc_account_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.cm_no is not None:
            result['cm_no'] = self.cm_no
        if self.name is not None:
            result['name'] = self.name
        if self.proc_no is not None:
            result['proc_no'] = self.proc_no
        if self.sign_url is not None:
            result['sign_url'] = self.sign_url
        if self.status is not None:
            result['status'] = self.status
        if self.myc_account_id is not None:
            result['myc_account_id'] = self.myc_account_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('cm_no') is not None:
            self.cm_no = m.get('cm_no')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('proc_no') is not None:
            self.proc_no = m.get('proc_no')
        if m.get('sign_url') is not None:
            self.sign_url = m.get('sign_url')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('myc_account_id') is not None:
            self.myc_account_id = m.get('myc_account_id')
        return self


class OrgSigning(TeaModel):
    def __init__(
        self,
        org_seal_id: str = None,
        org_sign_page_no: int = None,
        org_sign_coordinate_x: str = None,
        org_sign_coordinate_y: str = None,
    ):
        # 企业印章ID，如不填写则使用企业默认印章，如果无默认印章则报错
        self.org_seal_id = org_seal_id
        # 机构签署页码，从第1页开始
        # 
        # 
        self.org_sign_page_no = org_sign_page_no
        # 机构签署页位置的X坐标，企业盖章页位置的X坐标值，为距离左边边界的位置，单位为PX
        # 
        # 
        self.org_sign_coordinate_x = org_sign_coordinate_x
        # 机构签署页位置的Y坐标，企业盖章页位置的Y坐标值，为距离下边界的位置，单位为PX。关于签署位置 XY 坐标的计算方法请参考文档：https://antchain.antgroup.com/docs/11/155164，注意XY为签署区中心的点的坐标，需要考虑前后距离防止遮挡文字。
        self.org_sign_coordinate_y = org_sign_coordinate_y

    def validate(self):
        self.validate_required(self.org_sign_page_no, 'org_sign_page_no')
        self.validate_required(self.org_sign_coordinate_x, 'org_sign_coordinate_x')
        self.validate_required(self.org_sign_coordinate_y, 'org_sign_coordinate_y')

    def to_map(self):
        result = dict()
        if self.org_seal_id is not None:
            result['org_seal_id'] = self.org_seal_id
        if self.org_sign_page_no is not None:
            result['org_sign_page_no'] = self.org_sign_page_no
        if self.org_sign_coordinate_x is not None:
            result['org_sign_coordinate_x'] = self.org_sign_coordinate_x
        if self.org_sign_coordinate_y is not None:
            result['org_sign_coordinate_y'] = self.org_sign_coordinate_y
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('org_seal_id') is not None:
            self.org_seal_id = m.get('org_seal_id')
        if m.get('org_sign_page_no') is not None:
            self.org_sign_page_no = m.get('org_sign_page_no')
        if m.get('org_sign_coordinate_x') is not None:
            self.org_sign_coordinate_x = m.get('org_sign_coordinate_x')
        if m.get('org_sign_coordinate_y') is not None:
            self.org_sign_coordinate_y = m.get('org_sign_coordinate_y')
        return self


class PersonalSigning(TeaModel):
    def __init__(
        self,
        personal_id: str = None,
        personal_seal_id: str = None,
        personal_sign_page_no: int = None,
        personal_sign_coordinate_x: str = None,
        personal_sign_coordinate_y: str = None,
    ):
        # 数字房产账户 ID
        # 
        self.personal_id = personal_id
        # 个人印章 ID，如不填写则使用个人默认印章，如果无默认印章则报错
        self.personal_seal_id = personal_seal_id
        # 个人签署页码，本签名最终签署到协议哪一页
        self.personal_sign_page_no = personal_sign_page_no
        # 个人签署页位置的X坐标，为距离左侧边界的位置，单位为PX
        self.personal_sign_coordinate_x = personal_sign_coordinate_x
        # 个人签署页位置的Y坐标，为距离下边界的位置，单位为PX，计算方法同上。关于签署位置 XY 坐标的计算方法请参考文档：https://antchain.antgroup.com/docs/11/155164，注意XY为签署区中心的点的坐标，需要考虑前后距离防止遮挡文字。
        self.personal_sign_coordinate_y = personal_sign_coordinate_y

    def validate(self):
        self.validate_required(self.personal_id, 'personal_id')
        self.validate_required(self.personal_sign_page_no, 'personal_sign_page_no')
        self.validate_required(self.personal_sign_coordinate_x, 'personal_sign_coordinate_x')
        self.validate_required(self.personal_sign_coordinate_y, 'personal_sign_coordinate_y')

    def to_map(self):
        result = dict()
        if self.personal_id is not None:
            result['personal_id'] = self.personal_id
        if self.personal_seal_id is not None:
            result['personal_seal_id'] = self.personal_seal_id
        if self.personal_sign_page_no is not None:
            result['personal_sign_page_no'] = self.personal_sign_page_no
        if self.personal_sign_coordinate_x is not None:
            result['personal_sign_coordinate_x'] = self.personal_sign_coordinate_x
        if self.personal_sign_coordinate_y is not None:
            result['personal_sign_coordinate_y'] = self.personal_sign_coordinate_y
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('personal_id') is not None:
            self.personal_id = m.get('personal_id')
        if m.get('personal_seal_id') is not None:
            self.personal_seal_id = m.get('personal_seal_id')
        if m.get('personal_sign_page_no') is not None:
            self.personal_sign_page_no = m.get('personal_sign_page_no')
        if m.get('personal_sign_coordinate_x') is not None:
            self.personal_sign_coordinate_x = m.get('personal_sign_coordinate_x')
        if m.get('personal_sign_coordinate_y') is not None:
            self.personal_sign_coordinate_y = m.get('personal_sign_coordinate_y')
        return self


class SignTask(TeaModel):
    def __init__(
        self,
        file_path: str = None,
        sign_info_list: List[SignInfo] = None,
        sign_document_type: str = None,
    ):
        # 文件路径
        self.file_path = file_path
        # 签署信息列表
        self.sign_info_list = sign_info_list
        # 签署文档类型，支持类型：APPLY_FORM("申请表")、INQUIRY_FORM("询问表")、MORT_CONTACT("抵押合同")、OTHER_CONTACT("其他合同")
        self.sign_document_type = sign_document_type

    def validate(self):
        self.validate_required(self.file_path, 'file_path')
        self.validate_required(self.sign_info_list, 'sign_info_list')
        if self.sign_info_list:
            for k in self.sign_info_list:
                if k:
                    k.validate()
        self.validate_required(self.sign_document_type, 'sign_document_type')

    def to_map(self):
        result = dict()
        if self.file_path is not None:
            result['file_path'] = self.file_path
        result['sign_info_list'] = []
        if self.sign_info_list is not None:
            for k in self.sign_info_list:
                result['sign_info_list'].append(k.to_map() if k else None)
        if self.sign_document_type is not None:
            result['sign_document_type'] = self.sign_document_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_path') is not None:
            self.file_path = m.get('file_path')
        self.sign_info_list = []
        if m.get('sign_info_list') is not None:
            for k in m.get('sign_info_list'):
                temp_model = SignInfo()
                self.sign_info_list.append(temp_model.from_map(k))
        if m.get('sign_document_type') is not None:
            self.sign_document_type = m.get('sign_document_type')
        return self


class SignTaskProfile(TeaModel):
    def __init__(
        self,
        sign_task_list: List[SignTask] = None,
    ):
        # 签署任务列表
        self.sign_task_list = sign_task_list

    def validate(self):
        self.validate_required(self.sign_task_list, 'sign_task_list')
        if self.sign_task_list:
            for k in self.sign_task_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        result['sign_task_list'] = []
        if self.sign_task_list is not None:
            for k in self.sign_task_list:
                result['sign_task_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.sign_task_list = []
        if m.get('sign_task_list') is not None:
            for k in m.get('sign_task_list'):
                temp_model = SignTask()
                self.sign_task_list.append(temp_model.from_map(k))
        return self


class HqOrder(TeaModel):
    def __init__(
        self,
        house_query_order_no: str = None,
        status: str = None,
        scene: str = None,
        out_biz_no: str = None,
        loan_assist_platform: str = None,
        bank_no: str = None,
        bank_name: str = None,
        rtc_no: str = None,
        rtc_name: str = None,
        house_cert_type: str = None,
        house_cert_no: str = None,
        start_time: str = None,
        end_time: str = None,
        fail_code: str = None,
        fail_desc: str = None,
        branch_bank: Bank = None,
        house: House = None,
    ):
        # 房产链房产查询单号
        self.house_query_order_no = house_query_order_no
        # 房产链房产查询单状态
        self.status = status
        # 房产查询场景,NO_AUTH_QUERY=无授权直查
        self.scene = scene
        # 2334898983498394838C
        self.out_biz_no = out_biz_no
        # 助贷平台
        self.loan_assist_platform = loan_assist_platform
        # 房产链内部银行编号
        self.bank_no = bank_no
        # 银行名称
        self.bank_name = bank_name
        # 房产链内部不动产中心编号
        self.rtc_no = rtc_no
        # 不动产中心名称
        self.rtc_name = rtc_name
        # 房产权证类型
        self.house_cert_type = house_cert_type
        # 权证编号(短号)
        self.house_cert_no = house_cert_no
        # 房产查询单生成时间
        self.start_time = start_time
        # 房产查询单结束时间
        self.end_time = end_time
        # 房产查询失败原因，MF_REALTY_NOT_EXISTS=房产信息不存在
        self.fail_code = fail_code
        # 房产查询失败描述
        self.fail_desc = fail_desc
        # 业务办理分支行
        self.branch_bank = branch_bank
        # 房产信息
        self.house = house

    def validate(self):
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.branch_bank:
            self.branch_bank.validate()
        if self.house:
            self.house.validate()

    def to_map(self):
        result = dict()
        if self.house_query_order_no is not None:
            result['house_query_order_no'] = self.house_query_order_no
        if self.status is not None:
            result['status'] = self.status
        if self.scene is not None:
            result['scene'] = self.scene
        if self.out_biz_no is not None:
            result['out_biz_no'] = self.out_biz_no
        if self.loan_assist_platform is not None:
            result['loan_assist_platform'] = self.loan_assist_platform
        if self.bank_no is not None:
            result['bank_no'] = self.bank_no
        if self.bank_name is not None:
            result['bank_name'] = self.bank_name
        if self.rtc_no is not None:
            result['rtc_no'] = self.rtc_no
        if self.rtc_name is not None:
            result['rtc_name'] = self.rtc_name
        if self.house_cert_type is not None:
            result['house_cert_type'] = self.house_cert_type
        if self.house_cert_no is not None:
            result['house_cert_no'] = self.house_cert_no
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.fail_code is not None:
            result['fail_code'] = self.fail_code
        if self.fail_desc is not None:
            result['fail_desc'] = self.fail_desc
        if self.branch_bank is not None:
            result['branch_bank'] = self.branch_bank.to_map()
        if self.house is not None:
            result['house'] = self.house.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('house_query_order_no') is not None:
            self.house_query_order_no = m.get('house_query_order_no')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('out_biz_no') is not None:
            self.out_biz_no = m.get('out_biz_no')
        if m.get('loan_assist_platform') is not None:
            self.loan_assist_platform = m.get('loan_assist_platform')
        if m.get('bank_no') is not None:
            self.bank_no = m.get('bank_no')
        if m.get('bank_name') is not None:
            self.bank_name = m.get('bank_name')
        if m.get('rtc_no') is not None:
            self.rtc_no = m.get('rtc_no')
        if m.get('rtc_name') is not None:
            self.rtc_name = m.get('rtc_name')
        if m.get('house_cert_type') is not None:
            self.house_cert_type = m.get('house_cert_type')
        if m.get('house_cert_no') is not None:
            self.house_cert_no = m.get('house_cert_no')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('fail_code') is not None:
            self.fail_code = m.get('fail_code')
        if m.get('fail_desc') is not None:
            self.fail_desc = m.get('fail_desc')
        if m.get('branch_bank') is not None:
            temp_model = Bank()
            self.branch_bank = temp_model.from_map(m['branch_bank'])
        if m.get('house') is not None:
            temp_model = House()
            self.house = temp_model.from_map(m['house'])
        return self


class RealtyBasicInfo(TeaModel):
    def __init__(
        self,
        realty_cert_type: str = None,
        realty_cert_no: str = None,
        location: str = None,
        obligee_list: List[EntityBasicInfo] = None,
    ):
        # 权证类型，可选值：HOUSE_OWNERSHIP_CERT,OTHER_RIGHT_CERT,REALTY_OWNERSHIP_CERT,MORTGAGE_REG_CERT
        self.realty_cert_type = realty_cert_type
        # 权证号码
        self.realty_cert_no = realty_cert_no
        # 坐落位置
        self.location = location
        # 权利人列表
        self.obligee_list = obligee_list

    def validate(self):
        self.validate_required(self.realty_cert_type, 'realty_cert_type')
        self.validate_required(self.realty_cert_no, 'realty_cert_no')
        self.validate_required(self.location, 'location')
        if self.obligee_list:
            for k in self.obligee_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.realty_cert_type is not None:
            result['realty_cert_type'] = self.realty_cert_type
        if self.realty_cert_no is not None:
            result['realty_cert_no'] = self.realty_cert_no
        if self.location is not None:
            result['location'] = self.location
        result['obligee_list'] = []
        if self.obligee_list is not None:
            for k in self.obligee_list:
                result['obligee_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('realty_cert_type') is not None:
            self.realty_cert_type = m.get('realty_cert_type')
        if m.get('realty_cert_no') is not None:
            self.realty_cert_no = m.get('realty_cert_no')
        if m.get('location') is not None:
            self.location = m.get('location')
        self.obligee_list = []
        if m.get('obligee_list') is not None:
            for k in m.get('obligee_list'):
                temp_model = EntityBasicInfo()
                self.obligee_list.append(temp_model.from_map(k))
        return self


class OtherRightInfo(TeaModel):
    def __init__(
        self,
        realty_cert_type: str = None,
        realty_cert_no: str = None,
        obligee: EntityBasicInfo = None,
        old_other_realty_cert_no: str = None,
        location: str = None,
        new_other_right_cert_type: str = None,
        new_other_right_cert_no: str = None,
        new_other_right_cert_path: str = None,
    ):
        # 权证类型，可选值：PROP_RIGHT_CERT("房地产权证")、HOUSE_PROP_RIGHT_CERT("房屋所有权证")、HOUSE_OWNERSHIP_CERT("房屋所有权证")、 OTHER_RIGHT_CERT("房屋他项权证")、REALTY_OWNERSHIP_CERT("不动产权证")、 MORTGAGE_REG_CERT("不动产登记证明(抵押权登记)")
        self.realty_cert_type = realty_cert_type
        # 权证号码
        self.realty_cert_no = realty_cert_no
        # 权利人
        self.obligee = obligee
        # 原他项权证号
        self.old_other_realty_cert_no = old_other_realty_cert_no
        # 坐落
        self.location = location
        # 新他项权证类型，可选值：PROP_RIGHT_CERT("房地产权证")、HOUSE_PROP_RIGHT_CERT("房屋所有权证")、HOUSE_OWNERSHIP_CERT("房屋所有权证")、 OTHER_RIGHT_CERT("房屋他项权证")、REALTY_OWNERSHIP_CERT("不动产权证")、 MORTGAGE_REG_CERT("不动产登记证明(抵押权登记)")
        self.new_other_right_cert_type = new_other_right_cert_type
        # 新他项权证号
        self.new_other_right_cert_no = new_other_right_cert_no
        # 新他项权证电子证照地址，他项权证电子证照上传到房产链的路径
        self.new_other_right_cert_path = new_other_right_cert_path

    def validate(self):
        self.validate_required(self.realty_cert_type, 'realty_cert_type')
        self.validate_required(self.realty_cert_no, 'realty_cert_no')
        self.validate_required(self.obligee, 'obligee')
        if self.obligee:
            self.obligee.validate()
        self.validate_required(self.location, 'location')
        self.validate_required(self.new_other_right_cert_type, 'new_other_right_cert_type')
        self.validate_required(self.new_other_right_cert_no, 'new_other_right_cert_no')
        self.validate_required(self.new_other_right_cert_path, 'new_other_right_cert_path')

    def to_map(self):
        result = dict()
        if self.realty_cert_type is not None:
            result['realty_cert_type'] = self.realty_cert_type
        if self.realty_cert_no is not None:
            result['realty_cert_no'] = self.realty_cert_no
        if self.obligee is not None:
            result['obligee'] = self.obligee.to_map()
        if self.old_other_realty_cert_no is not None:
            result['old_other_realty_cert_no'] = self.old_other_realty_cert_no
        if self.location is not None:
            result['location'] = self.location
        if self.new_other_right_cert_type is not None:
            result['new_other_right_cert_type'] = self.new_other_right_cert_type
        if self.new_other_right_cert_no is not None:
            result['new_other_right_cert_no'] = self.new_other_right_cert_no
        if self.new_other_right_cert_path is not None:
            result['new_other_right_cert_path'] = self.new_other_right_cert_path
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('realty_cert_type') is not None:
            self.realty_cert_type = m.get('realty_cert_type')
        if m.get('realty_cert_no') is not None:
            self.realty_cert_no = m.get('realty_cert_no')
        if m.get('obligee') is not None:
            temp_model = EntityBasicInfo()
            self.obligee = temp_model.from_map(m['obligee'])
        if m.get('old_other_realty_cert_no') is not None:
            self.old_other_realty_cert_no = m.get('old_other_realty_cert_no')
        if m.get('location') is not None:
            self.location = m.get('location')
        if m.get('new_other_right_cert_type') is not None:
            self.new_other_right_cert_type = m.get('new_other_right_cert_type')
        if m.get('new_other_right_cert_no') is not None:
            self.new_other_right_cert_no = m.get('new_other_right_cert_no')
        if m.get('new_other_right_cert_path') is not None:
            self.new_other_right_cert_path = m.get('new_other_right_cert_path')
        return self


class Contract(TeaModel):
    def __init__(
        self,
        document_id: str = None,
        contract_name: str = None,
        archived_file_url: str = None,
    ):
        # 文件 ID
        self.document_id = document_id
        # 参数指定合同文件名称
        self.contract_name = contract_name
        # 合同文件的URL下载路径，有效期1小时
        self.archived_file_url = archived_file_url

    def validate(self):
        self.validate_required(self.document_id, 'document_id')
        self.validate_required(self.contract_name, 'contract_name')

    def to_map(self):
        result = dict()
        if self.document_id is not None:
            result['document_id'] = self.document_id
        if self.contract_name is not None:
            result['contract_name'] = self.contract_name
        if self.archived_file_url is not None:
            result['archived_file_url'] = self.archived_file_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('document_id') is not None:
            self.document_id = m.get('document_id')
        if m.get('contract_name') is not None:
            self.contract_name = m.get('contract_name')
        if m.get('archived_file_url') is not None:
            self.archived_file_url = m.get('archived_file_url')
        return self


class MaterialFileInfo(TeaModel):
    def __init__(
        self,
        file_path: str = None,
        material_id: str = None,
        material_name: str = None,
        material_type: str = None,
        material_category: str = None,
        copies_number: int = None,
        page: int = None,
    ):
        # 文件路径
        self.file_path = file_path
        # 材料ID，默认值为2，代表身份证明
        self.material_id = material_id
        # 材料名称
        self.material_name = material_name
        # 材料类型，取值范围：1--申请文件，2--业务表格，3--证照，4--申请人像，5--受理回执单 ，6--缴款通知书，7--抵押登记证明，8--原证照，9--银行内部审批材料，10--网上申办凭证
        self.material_type = material_type
        # 材料类别，取值范围：1--原件，2--复印件，3--原件和复印件，4--申请人像，10--原证照
        self.material_category = material_category
        # 材料份数
        self.copies_number = copies_number
        # 材料页数
        self.page = page

    def validate(self):
        self.validate_required(self.file_path, 'file_path')
        self.validate_required(self.material_id, 'material_id')
        self.validate_required(self.material_name, 'material_name')
        self.validate_required(self.copies_number, 'copies_number')
        self.validate_required(self.page, 'page')

    def to_map(self):
        result = dict()
        if self.file_path is not None:
            result['file_path'] = self.file_path
        if self.material_id is not None:
            result['material_id'] = self.material_id
        if self.material_name is not None:
            result['material_name'] = self.material_name
        if self.material_type is not None:
            result['material_type'] = self.material_type
        if self.material_category is not None:
            result['material_category'] = self.material_category
        if self.copies_number is not None:
            result['copies_number'] = self.copies_number
        if self.page is not None:
            result['page'] = self.page
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_path') is not None:
            self.file_path = m.get('file_path')
        if m.get('material_id') is not None:
            self.material_id = m.get('material_id')
        if m.get('material_name') is not None:
            self.material_name = m.get('material_name')
        if m.get('material_type') is not None:
            self.material_type = m.get('material_type')
        if m.get('material_category') is not None:
            self.material_category = m.get('material_category')
        if m.get('copies_number') is not None:
            self.copies_number = m.get('copies_number')
        if m.get('page') is not None:
            self.page = m.get('page')
        return self


class RtcCommonResult(TeaModel):
    def __init__(
        self,
        status: str = None,
        code: str = None,
        message: str = None,
    ):
        # 响应状态，包括值：S-成功，F-失败，已知的异常，U-未知，未知的异常或状态
        self.status = status
        # 结果码
        self.code = code
        # 返回消息
        self.message = message

    def validate(self):
        self.validate_required(self.status, 'status')
        self.validate_required(self.code, 'code')

    def to_map(self):
        result = dict()
        if self.status is not None:
            result['status'] = self.status
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class ContractSigning(TeaModel):
    def __init__(
        self,
        contract_name: str = None,
        file_path: str = None,
        org_sign_list: List[OrgSigning] = None,
        personal_sign_list: List[PersonalSigning] = None,
    ):
        # 本合同文件的名称
        self.contract_name = contract_name
        # 待签署文件存放在的可读取路径，参数具体内容根据调用方约定，比如内容为OSS路径时，数字房产访问OSS下载文件。
        self.file_path = file_path
        # 机构签署记录列表，可设置多个机构的签署区
        self.org_sign_list = org_sign_list
        # 个人签署记录的列表形式，可设置多个个人的签署区
        self.personal_sign_list = personal_sign_list

    def validate(self):
        self.validate_required(self.contract_name, 'contract_name')
        self.validate_required(self.file_path, 'file_path')
        self.validate_required(self.org_sign_list, 'org_sign_list')
        if self.org_sign_list:
            for k in self.org_sign_list:
                if k:
                    k.validate()
        self.validate_required(self.personal_sign_list, 'personal_sign_list')
        if self.personal_sign_list:
            for k in self.personal_sign_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.contract_name is not None:
            result['contract_name'] = self.contract_name
        if self.file_path is not None:
            result['file_path'] = self.file_path
        result['org_sign_list'] = []
        if self.org_sign_list is not None:
            for k in self.org_sign_list:
                result['org_sign_list'].append(k.to_map() if k else None)
        result['personal_sign_list'] = []
        if self.personal_sign_list is not None:
            for k in self.personal_sign_list:
                result['personal_sign_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('contract_name') is not None:
            self.contract_name = m.get('contract_name')
        if m.get('file_path') is not None:
            self.file_path = m.get('file_path')
        self.org_sign_list = []
        if m.get('org_sign_list') is not None:
            for k in m.get('org_sign_list'):
                temp_model = OrgSigning()
                self.org_sign_list.append(temp_model.from_map(k))
        self.personal_sign_list = []
        if m.get('personal_sign_list') is not None:
            for k in m.get('personal_sign_list'):
                temp_model = PersonalSigning()
                self.personal_sign_list.append(temp_model.from_map(k))
        return self


class Amount(TeaModel):
    def __init__(
        self,
        code: str = None,
        value: str = None,
    ):
        # 币种代码，如CNY代表人民币
        self.code = code
        # 币种金额，如200.00，人民币以元为单位，保留两位小数
        self.value = value

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.value, 'value')

    def to_map(self):
        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class MgOrder(TeaModel):
    def __init__(
        self,
        agreements: List[Agreement] = None,
        archives: List[Archive] = None,
        auth_ar_sign_task: ArSignTask = None,
        bank_name: str = None,
        bank_no: str = None,
        cert_no: str = None,
        cert_type: str = None,
        cm_no: str = None,
        end_time: str = None,
        fail_code: str = None,
        fail_desc: str = None,
        house: House = None,
        init_ar_var_value_json: str = None,
        marriage: str = None,
        mg_ar_sign_tasks: List[ArSignTask] = None,
        mg_cert: MgCert = None,
        mg_order_no: str = None,
        name: str = None,
        out_biz_no: str = None,
        reg_apply_date: str = None,
        reg_reason: str = None,
        reg_reason_remark: str = None,
        reg_rights: str = None,
        reg_type: str = None,
        rtc_mg_order_no: str = None,
        rtc_name: str = None,
        rtc_no: str = None,
        spouse_cm_no: str = None,
        start_ar_var_value_json: str = None,
        start_time: str = None,
        status: str = None,
        extend_json: str = None,
        loan_assist_platform: str = None,
        branch_bank: Bank = None,
    ):
        # 已签署的合同列表
        self.agreements = agreements
        # 附件材料列表
        self.archives = archives
        # 房屋授权查询合同签署任务
        self.auth_ar_sign_task = auth_ar_sign_task
        # 银行名称
        self.bank_name = bank_name
        # 银行编号
        self.bank_no = bank_no
        # 借款人身份证号
        self.cert_no = cert_no
        # 证件类型，比如：ID_CARD=身份证
        self.cert_type = cert_type
        # 借款人编号
        self.cm_no = cm_no
        # 抵押登记结束日期
        self.end_time = end_time
        # 抵押登记失败类型，比如：MF_REALTY_NOT_EXISTS=房产信息不存在
        self.fail_code = fail_code
        # 抵押登记错误信息描述
        self.fail_desc = fail_desc
        # 不动产返回房产信息
        self.house = house
        # 确认预抵押登记时的所有合同变量和值的结合,Map<Sting,String>的json格式
        self.init_ar_var_value_json = init_ar_var_value_json
        # 借款人婚姻状况，比如：MARRIED=已婚
        self.marriage = marriage
        # 抵押登记相关合同签署任务列表
        self.mg_ar_sign_tasks = mg_ar_sign_tasks
        # 抵押登记回执
        self.mg_cert = mg_cert
        # 抵押单号
        self.mg_order_no = mg_order_no
        # 借款人身份证
        self.name = name
        # 银行的业务编号
        self.out_biz_no = out_biz_no
        # 抵押登记申请日期
        self.reg_apply_date = reg_apply_date
        # 登记设立原因，比如：LOAN=借贷
        self.reg_reason = reg_reason
        # 登记设立原因描述
        self.reg_reason_remark = reg_reason_remark
        # 登记权利,比如：MORTGAGE_RIGHTS=抵押权
        self.reg_rights = reg_rights
        # 登记类型，比如：FIRST_REG=首次登记
        self.reg_type = reg_type
        # 不动产中心的抵押登记号
        self.rtc_mg_order_no = rtc_mg_order_no
        # 不动产登记中心名称
        self.rtc_name = rtc_name
        # 不动产登记中心编号
        self.rtc_no = rtc_no
        # 借款人配偶客户编号
        self.spouse_cm_no = spouse_cm_no
        # 发起抵押登记时的所有合同变量和值的结合,Map<Sting,String>的json格式
        self.start_ar_var_value_json = start_ar_var_value_json
        # 抵押登记发起日期
        self.start_time = start_time
        # 抵押单状态 ，比如：MG_ING=抵押登记中
        self.status = status
        # 扩展字段
        self.extend_json = extend_json
        # 助贷平台
        self.loan_assist_platform = loan_assist_platform
        # 办理业务分支行
        self.branch_bank = branch_bank

    def validate(self):
        if self.agreements:
            for k in self.agreements:
                if k:
                    k.validate()
        if self.archives:
            for k in self.archives:
                if k:
                    k.validate()
        if self.auth_ar_sign_task:
            self.auth_ar_sign_task.validate()
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.house:
            self.house.validate()
        if self.mg_ar_sign_tasks:
            for k in self.mg_ar_sign_tasks:
                if k:
                    k.validate()
        if self.mg_cert:
            self.mg_cert.validate()
        if self.reg_apply_date is not None:
            self.validate_pattern(self.reg_apply_date, 'reg_apply_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.branch_bank:
            self.branch_bank.validate()

    def to_map(self):
        result = dict()
        result['agreements'] = []
        if self.agreements is not None:
            for k in self.agreements:
                result['agreements'].append(k.to_map() if k else None)
        result['archives'] = []
        if self.archives is not None:
            for k in self.archives:
                result['archives'].append(k.to_map() if k else None)
        if self.auth_ar_sign_task is not None:
            result['auth_ar_sign_task'] = self.auth_ar_sign_task.to_map()
        if self.bank_name is not None:
            result['bank_name'] = self.bank_name
        if self.bank_no is not None:
            result['bank_no'] = self.bank_no
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.cm_no is not None:
            result['cm_no'] = self.cm_no
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.fail_code is not None:
            result['fail_code'] = self.fail_code
        if self.fail_desc is not None:
            result['fail_desc'] = self.fail_desc
        if self.house is not None:
            result['house'] = self.house.to_map()
        if self.init_ar_var_value_json is not None:
            result['init_ar_var_value_json'] = self.init_ar_var_value_json
        if self.marriage is not None:
            result['marriage'] = self.marriage
        result['mg_ar_sign_tasks'] = []
        if self.mg_ar_sign_tasks is not None:
            for k in self.mg_ar_sign_tasks:
                result['mg_ar_sign_tasks'].append(k.to_map() if k else None)
        if self.mg_cert is not None:
            result['mg_cert'] = self.mg_cert.to_map()
        if self.mg_order_no is not None:
            result['mg_order_no'] = self.mg_order_no
        if self.name is not None:
            result['name'] = self.name
        if self.out_biz_no is not None:
            result['out_biz_no'] = self.out_biz_no
        if self.reg_apply_date is not None:
            result['reg_apply_date'] = self.reg_apply_date
        if self.reg_reason is not None:
            result['reg_reason'] = self.reg_reason
        if self.reg_reason_remark is not None:
            result['reg_reason_remark'] = self.reg_reason_remark
        if self.reg_rights is not None:
            result['reg_rights'] = self.reg_rights
        if self.reg_type is not None:
            result['reg_type'] = self.reg_type
        if self.rtc_mg_order_no is not None:
            result['rtc_mg_order_no'] = self.rtc_mg_order_no
        if self.rtc_name is not None:
            result['rtc_name'] = self.rtc_name
        if self.rtc_no is not None:
            result['rtc_no'] = self.rtc_no
        if self.spouse_cm_no is not None:
            result['spouse_cm_no'] = self.spouse_cm_no
        if self.start_ar_var_value_json is not None:
            result['start_ar_var_value_json'] = self.start_ar_var_value_json
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.status is not None:
            result['status'] = self.status
        if self.extend_json is not None:
            result['extend_json'] = self.extend_json
        if self.loan_assist_platform is not None:
            result['loan_assist_platform'] = self.loan_assist_platform
        if self.branch_bank is not None:
            result['branch_bank'] = self.branch_bank.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.agreements = []
        if m.get('agreements') is not None:
            for k in m.get('agreements'):
                temp_model = Agreement()
                self.agreements.append(temp_model.from_map(k))
        self.archives = []
        if m.get('archives') is not None:
            for k in m.get('archives'):
                temp_model = Archive()
                self.archives.append(temp_model.from_map(k))
        if m.get('auth_ar_sign_task') is not None:
            temp_model = ArSignTask()
            self.auth_ar_sign_task = temp_model.from_map(m['auth_ar_sign_task'])
        if m.get('bank_name') is not None:
            self.bank_name = m.get('bank_name')
        if m.get('bank_no') is not None:
            self.bank_no = m.get('bank_no')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('cm_no') is not None:
            self.cm_no = m.get('cm_no')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('fail_code') is not None:
            self.fail_code = m.get('fail_code')
        if m.get('fail_desc') is not None:
            self.fail_desc = m.get('fail_desc')
        if m.get('house') is not None:
            temp_model = House()
            self.house = temp_model.from_map(m['house'])
        if m.get('init_ar_var_value_json') is not None:
            self.init_ar_var_value_json = m.get('init_ar_var_value_json')
        if m.get('marriage') is not None:
            self.marriage = m.get('marriage')
        self.mg_ar_sign_tasks = []
        if m.get('mg_ar_sign_tasks') is not None:
            for k in m.get('mg_ar_sign_tasks'):
                temp_model = ArSignTask()
                self.mg_ar_sign_tasks.append(temp_model.from_map(k))
        if m.get('mg_cert') is not None:
            temp_model = MgCert()
            self.mg_cert = temp_model.from_map(m['mg_cert'])
        if m.get('mg_order_no') is not None:
            self.mg_order_no = m.get('mg_order_no')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('out_biz_no') is not None:
            self.out_biz_no = m.get('out_biz_no')
        if m.get('reg_apply_date') is not None:
            self.reg_apply_date = m.get('reg_apply_date')
        if m.get('reg_reason') is not None:
            self.reg_reason = m.get('reg_reason')
        if m.get('reg_reason_remark') is not None:
            self.reg_reason_remark = m.get('reg_reason_remark')
        if m.get('reg_rights') is not None:
            self.reg_rights = m.get('reg_rights')
        if m.get('reg_type') is not None:
            self.reg_type = m.get('reg_type')
        if m.get('rtc_mg_order_no') is not None:
            self.rtc_mg_order_no = m.get('rtc_mg_order_no')
        if m.get('rtc_name') is not None:
            self.rtc_name = m.get('rtc_name')
        if m.get('rtc_no') is not None:
            self.rtc_no = m.get('rtc_no')
        if m.get('spouse_cm_no') is not None:
            self.spouse_cm_no = m.get('spouse_cm_no')
        if m.get('start_ar_var_value_json') is not None:
            self.start_ar_var_value_json = m.get('start_ar_var_value_json')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('extend_json') is not None:
            self.extend_json = m.get('extend_json')
        if m.get('loan_assist_platform') is not None:
            self.loan_assist_platform = m.get('loan_assist_platform')
        if m.get('branch_bank') is not None:
            temp_model = Bank()
            self.branch_bank = temp_model.from_map(m['branch_bank'])
        return self


class BankOperator(TeaModel):
    def __init__(
        self,
        op_no: str = None,
        name: str = None,
        cert_type: str = None,
        cert_no: str = None,
        mobile: str = None,
    ):
        # 网办操作员工号
        self.op_no = op_no
        # 姓名
        self.name = name
        # 证件类型
        self.cert_type = cert_type
        # 证件号
        self.cert_no = cert_no
        # 手机号
        self.mobile = mobile

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.op_no is not None:
            result['op_no'] = self.op_no
        if self.name is not None:
            result['name'] = self.name
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.mobile is not None:
            result['mobile'] = self.mobile
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('op_no') is not None:
            self.op_no = m.get('op_no')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        return self


class RealtyCenter(TeaModel):
    def __init__(
        self,
        address: str = None,
        name: str = None,
        out_rtc_no: str = None,
        pdn_did: str = None,
        pub_key: str = None,
        rtc_no: str = None,
    ):
        # 不动产中心地址
        self.address = address
        # 不动产中心名称
        self.name = name
        # 外部不动产中心编号(不动产中心提供)
        self.out_rtc_no = out_rtc_no
        # 蚂蚁链身份id
        self.pdn_did = pdn_did
        # 公钥
        self.pub_key = pub_key
        # 不动产中心编号
        self.rtc_no = rtc_no

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.address is not None:
            result['address'] = self.address
        if self.name is not None:
            result['name'] = self.name
        if self.out_rtc_no is not None:
            result['out_rtc_no'] = self.out_rtc_no
        if self.pdn_did is not None:
            result['pdn_did'] = self.pdn_did
        if self.pub_key is not None:
            result['pub_key'] = self.pub_key
        if self.rtc_no is not None:
            result['rtc_no'] = self.rtc_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('out_rtc_no') is not None:
            self.out_rtc_no = m.get('out_rtc_no')
        if m.get('pdn_did') is not None:
            self.pdn_did = m.get('pdn_did')
        if m.get('pub_key') is not None:
            self.pub_key = m.get('pub_key')
        if m.get('rtc_no') is not None:
            self.rtc_no = m.get('rtc_no')
        return self


class MgReleaseOrder(TeaModel):
    def __init__(
        self,
        mg_release_order_no: str = None,
        rtc_mg_release_order_no: str = None,
        out_biz_no: str = None,
        other_right_cert_no: str = None,
        wipe_mortgage_reason: str = None,
        status: str = None,
        bank_no: str = None,
        bank_name: str = None,
        rtc_no: str = None,
        rtc_name: str = None,
        branch_bank: Bank = None,
        house: House = None,
        agreements: List[Agreement] = None,
        archives: List[Archive] = None,
        start_time: str = None,
        end_time: str = None,
        fail_code: str = None,
        fail_desc: str = None,
        loan_assist_platform: str = None,
    ):
        # 解抵押单号
        self.mg_release_order_no = mg_release_order_no
        # 不动产中心解抵押单号
        self.rtc_mg_release_order_no = rtc_mg_release_order_no
        # 机构侧业务单号
        self.out_biz_no = out_biz_no
        # 抵押登记权证号(他项权证号)
        self.other_right_cert_no = other_right_cert_no
        # 抵押权消灭原因,OAN_FINISHED=借款已结清或主债权已灭失
        self.wipe_mortgage_reason = wipe_mortgage_reason
        # 解抵押状态
        self.status = status
        # 房产链内部银行编号
        self.bank_no = bank_no
        # 银行名称
        self.bank_name = bank_name
        # 房产链内部不动产中心编号
        self.rtc_no = rtc_no
        # 不动产中心名称
        self.rtc_name = rtc_name
        # 办理业务分支行
        self.branch_bank = branch_bank
        # 解抵押的房产信息
        self.house = house
        # 解抵押的合同列表
        self.agreements = agreements
        # 解抵押相关的附件材料
        self.archives = archives
        # 解抵押单据生成时间
        self.start_time = start_time
        # 解抵押单据结束时间
        self.end_time = end_time
        # 解抵押失败code,MGR_AR_SIGN_FAIL=解抵押合同签署失败
        self.fail_code = fail_code
        # 解抵押失败原因描述
        self.fail_desc = fail_desc
        # 助贷平台
        self.loan_assist_platform = loan_assist_platform

    def validate(self):
        if self.branch_bank:
            self.branch_bank.validate()
        if self.house:
            self.house.validate()
        if self.agreements:
            for k in self.agreements:
                if k:
                    k.validate()
        if self.archives:
            for k in self.archives:
                if k:
                    k.validate()
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.mg_release_order_no is not None:
            result['mg_release_order_no'] = self.mg_release_order_no
        if self.rtc_mg_release_order_no is not None:
            result['rtc_mg_release_order_no'] = self.rtc_mg_release_order_no
        if self.out_biz_no is not None:
            result['out_biz_no'] = self.out_biz_no
        if self.other_right_cert_no is not None:
            result['other_right_cert_no'] = self.other_right_cert_no
        if self.wipe_mortgage_reason is not None:
            result['wipe_mortgage_reason'] = self.wipe_mortgage_reason
        if self.status is not None:
            result['status'] = self.status
        if self.bank_no is not None:
            result['bank_no'] = self.bank_no
        if self.bank_name is not None:
            result['bank_name'] = self.bank_name
        if self.rtc_no is not None:
            result['rtc_no'] = self.rtc_no
        if self.rtc_name is not None:
            result['rtc_name'] = self.rtc_name
        if self.branch_bank is not None:
            result['branch_bank'] = self.branch_bank.to_map()
        if self.house is not None:
            result['house'] = self.house.to_map()
        result['agreements'] = []
        if self.agreements is not None:
            for k in self.agreements:
                result['agreements'].append(k.to_map() if k else None)
        result['archives'] = []
        if self.archives is not None:
            for k in self.archives:
                result['archives'].append(k.to_map() if k else None)
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.fail_code is not None:
            result['fail_code'] = self.fail_code
        if self.fail_desc is not None:
            result['fail_desc'] = self.fail_desc
        if self.loan_assist_platform is not None:
            result['loan_assist_platform'] = self.loan_assist_platform
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('mg_release_order_no') is not None:
            self.mg_release_order_no = m.get('mg_release_order_no')
        if m.get('rtc_mg_release_order_no') is not None:
            self.rtc_mg_release_order_no = m.get('rtc_mg_release_order_no')
        if m.get('out_biz_no') is not None:
            self.out_biz_no = m.get('out_biz_no')
        if m.get('other_right_cert_no') is not None:
            self.other_right_cert_no = m.get('other_right_cert_no')
        if m.get('wipe_mortgage_reason') is not None:
            self.wipe_mortgage_reason = m.get('wipe_mortgage_reason')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('bank_no') is not None:
            self.bank_no = m.get('bank_no')
        if m.get('bank_name') is not None:
            self.bank_name = m.get('bank_name')
        if m.get('rtc_no') is not None:
            self.rtc_no = m.get('rtc_no')
        if m.get('rtc_name') is not None:
            self.rtc_name = m.get('rtc_name')
        if m.get('branch_bank') is not None:
            temp_model = Bank()
            self.branch_bank = temp_model.from_map(m['branch_bank'])
        if m.get('house') is not None:
            temp_model = House()
            self.house = temp_model.from_map(m['house'])
        self.agreements = []
        if m.get('agreements') is not None:
            for k in m.get('agreements'):
                temp_model = Agreement()
                self.agreements.append(temp_model.from_map(k))
        self.archives = []
        if m.get('archives') is not None:
            for k in m.get('archives'):
                temp_model = Archive()
                self.archives.append(temp_model.from_map(k))
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('fail_code') is not None:
            self.fail_code = m.get('fail_code')
        if m.get('fail_desc') is not None:
            self.fail_desc = m.get('fail_desc')
        if m.get('loan_assist_platform') is not None:
            self.loan_assist_platform = m.get('loan_assist_platform')
        return self


class ArchiveInfo(TeaModel):
    def __init__(
        self,
        oss_key: str = None,
        type: str = None,
        hash: str = None,
    ):
        # 附件存储OSS路径
        self.oss_key = oss_key
        # 附件材料类型，比如：AT_SUOYOUQUANZHENG=房屋所有权证
        self.type = type
        # 附件内容摘要
        self.hash = hash

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.oss_key is not None:
            result['oss_key'] = self.oss_key
        if self.type is not None:
            result['type'] = self.type
        if self.hash is not None:
            result['hash'] = self.hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('oss_key') is not None:
            self.oss_key = m.get('oss_key')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        return self


class MortGuaranteeInfo(TeaModel):
    def __init__(
        self,
        conflict_handle_method: str = None,
        evaluation_amt: str = None,
        evaluation_amt_currency: str = None,
        guarantee_scope_json: List[str] = None,
        guarantee_scope_note: str = None,
        mortgage_type: str = None,
        debt_amt: str = None,
        debt_amt_currency: str = None,
        debt_end_date: str = None,
        debt_start_date: str = None,
        mort_realty_property: str = None,
        ar_debt_amt_currency: str = None,
        ar_debt_amt: str = None,
        mg_order_no: str = None,
    ):
        # 争议处理方式,比如：COUNT_PROCEEDING=有管辖权的人民法院提起诉讼
        self.conflict_handle_method = conflict_handle_method
        # 评估价值，人民币默认单位为元，小数点保留2位
        self.evaluation_amt = evaluation_amt
        # 评估价值货币类型,比如：CNY=人民币
        self.evaluation_amt_currency = evaluation_amt_currency
        # 担保范围列表,比如：MAIN_CLAIM=主债权
        self.guarantee_scope_json = guarantee_scope_json
        # 担保范围备注
        self.guarantee_scope_note = guarantee_scope_note
        # 抵押方式，比如：MAX_AMOUNT_MORT=最高额抵押权
        self.mortgage_type = mortgage_type
        # 被担保主债权数额,人民币默认单位元，保留两位小数点
        self.debt_amt = debt_amt
        # 被担保主债权数额货币类型，比如：CNY=人民币
        self.debt_amt_currency = debt_amt_currency
        # 履债结束日期
        self.debt_end_date = debt_end_date
        # 履债起始日期
        self.debt_start_date = debt_start_date
        # 抵押物属性,比如：REGISTED_BUILDING=已建成并登记发证建筑物
        self.mort_realty_property = mort_realty_property
        # 合同债权金额币种
        self.ar_debt_amt_currency = ar_debt_amt_currency
        # 合同债权金额
        self.ar_debt_amt = ar_debt_amt
        # 房产链内部抵押单号
        self.mg_order_no = mg_order_no

    def validate(self):
        if self.debt_end_date is not None:
            self.validate_pattern(self.debt_end_date, 'debt_end_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.debt_start_date is not None:
            self.validate_pattern(self.debt_start_date, 'debt_start_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.conflict_handle_method is not None:
            result['conflict_handle_method'] = self.conflict_handle_method
        if self.evaluation_amt is not None:
            result['evaluation_amt'] = self.evaluation_amt
        if self.evaluation_amt_currency is not None:
            result['evaluation_amt_currency'] = self.evaluation_amt_currency
        if self.guarantee_scope_json is not None:
            result['guarantee_scope_json'] = self.guarantee_scope_json
        if self.guarantee_scope_note is not None:
            result['guarantee_scope_note'] = self.guarantee_scope_note
        if self.mortgage_type is not None:
            result['mortgage_type'] = self.mortgage_type
        if self.debt_amt is not None:
            result['debt_amt'] = self.debt_amt
        if self.debt_amt_currency is not None:
            result['debt_amt_currency'] = self.debt_amt_currency
        if self.debt_end_date is not None:
            result['debt_end_date'] = self.debt_end_date
        if self.debt_start_date is not None:
            result['debt_start_date'] = self.debt_start_date
        if self.mort_realty_property is not None:
            result['mort_realty_property'] = self.mort_realty_property
        if self.ar_debt_amt_currency is not None:
            result['ar_debt_amt_currency'] = self.ar_debt_amt_currency
        if self.ar_debt_amt is not None:
            result['ar_debt_amt'] = self.ar_debt_amt
        if self.mg_order_no is not None:
            result['mg_order_no'] = self.mg_order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('conflict_handle_method') is not None:
            self.conflict_handle_method = m.get('conflict_handle_method')
        if m.get('evaluation_amt') is not None:
            self.evaluation_amt = m.get('evaluation_amt')
        if m.get('evaluation_amt_currency') is not None:
            self.evaluation_amt_currency = m.get('evaluation_amt_currency')
        if m.get('guarantee_scope_json') is not None:
            self.guarantee_scope_json = m.get('guarantee_scope_json')
        if m.get('guarantee_scope_note') is not None:
            self.guarantee_scope_note = m.get('guarantee_scope_note')
        if m.get('mortgage_type') is not None:
            self.mortgage_type = m.get('mortgage_type')
        if m.get('debt_amt') is not None:
            self.debt_amt = m.get('debt_amt')
        if m.get('debt_amt_currency') is not None:
            self.debt_amt_currency = m.get('debt_amt_currency')
        if m.get('debt_end_date') is not None:
            self.debt_end_date = m.get('debt_end_date')
        if m.get('debt_start_date') is not None:
            self.debt_start_date = m.get('debt_start_date')
        if m.get('mort_realty_property') is not None:
            self.mort_realty_property = m.get('mort_realty_property')
        if m.get('ar_debt_amt_currency') is not None:
            self.ar_debt_amt_currency = m.get('ar_debt_amt_currency')
        if m.get('ar_debt_amt') is not None:
            self.ar_debt_amt = m.get('ar_debt_amt')
        if m.get('mg_order_no') is not None:
            self.mg_order_no = m.get('mg_order_no')
        return self


class StartRcpHqRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene: str = None,
        loan_assist_platform: str = None,
        bank_no: str = None,
        out_biz_no: str = None,
        house: House = None,
        house_owner: HouseOwner = None,
        branch_bank: Bank = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.product_instance_id = product_instance_id
        # 房产查询场景,NO_AUTH_QUERY=无授权直查
        self.scene = scene
        # 助贷平台
        self.loan_assist_platform = loan_assist_platform
        # 房产链内部银行编号
        self.bank_no = bank_no
        # 外部业务单号
        self.out_biz_no = out_biz_no
        # 房产信息
        self.house = house
        # 查询产权
        self.house_owner = house_owner
        # 办理业务分支行
        self.branch_bank = branch_bank

    def validate(self):
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.loan_assist_platform, 'loan_assist_platform')
        self.validate_required(self.bank_no, 'bank_no')
        self.validate_required(self.out_biz_no, 'out_biz_no')
        self.validate_required(self.house, 'house')
        if self.house:
            self.house.validate()
        self.validate_required(self.house_owner, 'house_owner')
        if self.house_owner:
            self.house_owner.validate()
        self.validate_required(self.branch_bank, 'branch_bank')
        if self.branch_bank:
            self.branch_bank.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.scene is not None:
            result['scene'] = self.scene
        if self.loan_assist_platform is not None:
            result['loan_assist_platform'] = self.loan_assist_platform
        if self.bank_no is not None:
            result['bank_no'] = self.bank_no
        if self.out_biz_no is not None:
            result['out_biz_no'] = self.out_biz_no
        if self.house is not None:
            result['house'] = self.house.to_map()
        if self.house_owner is not None:
            result['house_owner'] = self.house_owner.to_map()
        if self.branch_bank is not None:
            result['branch_bank'] = self.branch_bank.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('loan_assist_platform') is not None:
            self.loan_assist_platform = m.get('loan_assist_platform')
        if m.get('bank_no') is not None:
            self.bank_no = m.get('bank_no')
        if m.get('out_biz_no') is not None:
            self.out_biz_no = m.get('out_biz_no')
        if m.get('house') is not None:
            temp_model = House()
            self.house = temp_model.from_map(m['house'])
        if m.get('house_owner') is not None:
            temp_model = HouseOwner()
            self.house_owner = temp_model.from_map(m['house_owner'])
        if m.get('branch_bank') is not None:
            temp_model = Bank()
            self.branch_bank = temp_model.from_map(m['branch_bank'])
        return self


class StartRcpHqResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        hq_order_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 异常信息的文本描述
        self.result_code = result_code
        self.result_msg = result_msg
        # 房产链房产查询单号
        self.hq_order_no = hq_order_no

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
        if self.hq_order_no is not None:
            result['hq_order_no'] = self.hq_order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('hq_order_no') is not None:
            self.hq_order_no = m.get('hq_order_no')
        return self


class GetRcpHqRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bank_no: str = None,
        hq_order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.product_instance_id = product_instance_id
        # 房产链内部银行编号
        self.bank_no = bank_no
        # 房产查询单号
        self.hq_order_no = hq_order_no

    def validate(self):
        self.validate_required(self.bank_no, 'bank_no')
        self.validate_required(self.hq_order_no, 'hq_order_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bank_no is not None:
            result['bank_no'] = self.bank_no
        if self.hq_order_no is not None:
            result['hq_order_no'] = self.hq_order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bank_no') is not None:
            self.bank_no = m.get('bank_no')
        if m.get('hq_order_no') is not None:
            self.hq_order_no = m.get('hq_order_no')
        return self


class GetRcpHqResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        hq_order: HqOrder = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 异常信息的文本描述
        self.result_code = result_code
        self.result_msg = result_msg
        # 房产查询单明细
        self.hq_order = hq_order

    def validate(self):
        if self.hq_order:
            self.hq_order.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.hq_order is not None:
            result['hq_order'] = self.hq_order.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('hq_order') is not None:
            temp_model = HqOrder()
            self.hq_order = temp_model.from_map(m['hq_order'])
        return self


class StartRcpMgrRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        loan_assist_platform: str = None,
        bank_no: str = None,
        out_biz_no: str = None,
        other_right_cert_no: str = None,
        wipe_mortgage_reason: str = None,
        house: House = None,
        branch_bank: Bank = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.product_instance_id = product_instance_id
        # 助贷平台
        self.loan_assist_platform = loan_assist_platform
        # 房产链内部银行编号
        self.bank_no = bank_no
        # 外部业务单号
        self.out_biz_no = out_biz_no
        # 不动产颁发的他项权证号
        self.other_right_cert_no = other_right_cert_no
        # 抵押权消灭原因,OAN_FINISHED=借款已结清或主债权已灭失
        self.wipe_mortgage_reason = wipe_mortgage_reason
        # 解抵押的房产信息
        self.house = house
        # 办理业务分支行
        self.branch_bank = branch_bank

    def validate(self):
        self.validate_required(self.loan_assist_platform, 'loan_assist_platform')
        self.validate_required(self.bank_no, 'bank_no')
        self.validate_required(self.out_biz_no, 'out_biz_no')
        self.validate_required(self.other_right_cert_no, 'other_right_cert_no')
        self.validate_required(self.wipe_mortgage_reason, 'wipe_mortgage_reason')
        self.validate_required(self.house, 'house')
        if self.house:
            self.house.validate()
        self.validate_required(self.branch_bank, 'branch_bank')
        if self.branch_bank:
            self.branch_bank.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.loan_assist_platform is not None:
            result['loan_assist_platform'] = self.loan_assist_platform
        if self.bank_no is not None:
            result['bank_no'] = self.bank_no
        if self.out_biz_no is not None:
            result['out_biz_no'] = self.out_biz_no
        if self.other_right_cert_no is not None:
            result['other_right_cert_no'] = self.other_right_cert_no
        if self.wipe_mortgage_reason is not None:
            result['wipe_mortgage_reason'] = self.wipe_mortgage_reason
        if self.house is not None:
            result['house'] = self.house.to_map()
        if self.branch_bank is not None:
            result['branch_bank'] = self.branch_bank.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('loan_assist_platform') is not None:
            self.loan_assist_platform = m.get('loan_assist_platform')
        if m.get('bank_no') is not None:
            self.bank_no = m.get('bank_no')
        if m.get('out_biz_no') is not None:
            self.out_biz_no = m.get('out_biz_no')
        if m.get('other_right_cert_no') is not None:
            self.other_right_cert_no = m.get('other_right_cert_no')
        if m.get('wipe_mortgage_reason') is not None:
            self.wipe_mortgage_reason = m.get('wipe_mortgage_reason')
        if m.get('house') is not None:
            temp_model = House()
            self.house = temp_model.from_map(m['house'])
        if m.get('branch_bank') is not None:
            temp_model = Bank()
            self.branch_bank = temp_model.from_map(m['branch_bank'])
        return self


class StartRcpMgrResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        mg_release_order_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 异常信息的文本描述
        self.result_code = result_code
        self.result_msg = result_msg
        # 解抵押单号
        self.mg_release_order_no = mg_release_order_no

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
        if self.mg_release_order_no is not None:
            result['mg_release_order_no'] = self.mg_release_order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('mg_release_order_no') is not None:
            self.mg_release_order_no = m.get('mg_release_order_no')
        return self


class ConfirmRcpMgrRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        loan_assist_platform: str = None,
        bank_no: str = None,
        mg_release_order_no: str = None,
        result: str = None,
        fail_code: str = None,
        fail_desc: str = None,
        agreements: List[Agreement] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.product_instance_id = product_instance_id
        # 助贷平台
        self.loan_assist_platform = loan_assist_platform
        # 房产链内部银行编号
        self.bank_no = bank_no
        # 解抵押单号
        self.mg_release_order_no = mg_release_order_no
        # Y=继续解抵押,N=终止解抵押
        self.result = result
        # 终止解抵押原因码
        self.fail_code = fail_code
        # 终止解抵押原因描述
        self.fail_desc = fail_desc
        # 银行签署完成的解抵押合同列表
        self.agreements = agreements

    def validate(self):
        self.validate_required(self.loan_assist_platform, 'loan_assist_platform')
        self.validate_required(self.bank_no, 'bank_no')
        self.validate_required(self.mg_release_order_no, 'mg_release_order_no')
        self.validate_required(self.result, 'result')
        self.validate_required(self.agreements, 'agreements')
        if self.agreements:
            for k in self.agreements:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.loan_assist_platform is not None:
            result['loan_assist_platform'] = self.loan_assist_platform
        if self.bank_no is not None:
            result['bank_no'] = self.bank_no
        if self.mg_release_order_no is not None:
            result['mg_release_order_no'] = self.mg_release_order_no
        if self.result is not None:
            result['result'] = self.result
        if self.fail_code is not None:
            result['fail_code'] = self.fail_code
        if self.fail_desc is not None:
            result['fail_desc'] = self.fail_desc
        result['agreements'] = []
        if self.agreements is not None:
            for k in self.agreements:
                result['agreements'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('loan_assist_platform') is not None:
            self.loan_assist_platform = m.get('loan_assist_platform')
        if m.get('bank_no') is not None:
            self.bank_no = m.get('bank_no')
        if m.get('mg_release_order_no') is not None:
            self.mg_release_order_no = m.get('mg_release_order_no')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('fail_code') is not None:
            self.fail_code = m.get('fail_code')
        if m.get('fail_desc') is not None:
            self.fail_desc = m.get('fail_desc')
        self.agreements = []
        if m.get('agreements') is not None:
            for k in m.get('agreements'):
                temp_model = Agreement()
                self.agreements.append(temp_model.from_map(k))
        return self


class ConfirmRcpMgrResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 异常信息的文本描述
        self.result_code = result_code
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


class GetRcpMgrRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bank_no: str = None,
        mg_release_order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.product_instance_id = product_instance_id
        # 房产链内部银行编号
        self.bank_no = bank_no
        # 房产链解抵押单号
        self.mg_release_order_no = mg_release_order_no

    def validate(self):
        self.validate_required(self.bank_no, 'bank_no')
        self.validate_required(self.mg_release_order_no, 'mg_release_order_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bank_no is not None:
            result['bank_no'] = self.bank_no
        if self.mg_release_order_no is not None:
            result['mg_release_order_no'] = self.mg_release_order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bank_no') is not None:
            self.bank_no = m.get('bank_no')
        if m.get('mg_release_order_no') is not None:
            self.mg_release_order_no = m.get('mg_release_order_no')
        return self


class GetRcpMgrResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        mg_release_order: MgReleaseOrder = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 异常信息的文本描述
        self.result_code = result_code
        self.result_msg = result_msg
        # 解抵押单明细
        self.mg_release_order = mg_release_order

    def validate(self):
        if self.mg_release_order:
            self.mg_release_order.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.mg_release_order is not None:
            result['mg_release_order'] = self.mg_release_order.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('mg_release_order') is not None:
            temp_model = MgReleaseOrder()
            self.mg_release_order = temp_model.from_map(m['mg_release_order'])
        return self


class StartRcpMgRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        agreements: List[Agreement] = None,
        archives: List[Archive] = None,
        ar_var_value_json: str = None,
        bank_no: str = None,
        borrower: Person = None,
        extend_json: str = None,
        house: House = None,
        marital_status: str = None,
        out_biz_no: str = None,
        reg_reason: str = None,
        reg_reason_remark: str = None,
        reg_rights: str = None,
        reg_type: str = None,
        spouse: Person = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.product_instance_id = product_instance_id
        # 待签署的合同列表
        self.agreements = agreements
        # 材料清单列表
        self.archives = archives
        # 合同变量和值的全集，Map<String,String>的json格式
        self.ar_var_value_json = ar_var_value_json
        # 银行编号
        self.bank_no = bank_no
        # 借款人
        self.borrower = borrower
        # 扩展字段
        self.extend_json = extend_json
        # 抵押房产
        self.house = house
        # 婚姻状况,比如：MARRIED=已婚
        self.marital_status = marital_status
        # 外部业务单号，银行提供
        self.out_biz_no = out_biz_no
        # 登记设立原因，比如：LOAN=借贷
        self.reg_reason = reg_reason
        # 登记设立原因备注
        self.reg_reason_remark = reg_reason_remark
        # 登记权利,比如：MORTGAGE_RIGHTS=抵押权
        self.reg_rights = reg_rights
        # 登记类型，比如：FIRST_REG=首次登记
        self.reg_type = reg_type
        # 配偶
        self.spouse = spouse

    def validate(self):
        self.validate_required(self.agreements, 'agreements')
        if self.agreements:
            for k in self.agreements:
                if k:
                    k.validate()
        if self.archives:
            for k in self.archives:
                if k:
                    k.validate()
        self.validate_required(self.ar_var_value_json, 'ar_var_value_json')
        self.validate_required(self.bank_no, 'bank_no')
        self.validate_required(self.borrower, 'borrower')
        if self.borrower:
            self.borrower.validate()
        self.validate_required(self.house, 'house')
        if self.house:
            self.house.validate()
        self.validate_required(self.marital_status, 'marital_status')
        self.validate_required(self.out_biz_no, 'out_biz_no')
        self.validate_required(self.reg_reason, 'reg_reason')
        self.validate_required(self.reg_rights, 'reg_rights')
        self.validate_required(self.reg_type, 'reg_type')
        if self.spouse:
            self.spouse.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        result['agreements'] = []
        if self.agreements is not None:
            for k in self.agreements:
                result['agreements'].append(k.to_map() if k else None)
        result['archives'] = []
        if self.archives is not None:
            for k in self.archives:
                result['archives'].append(k.to_map() if k else None)
        if self.ar_var_value_json is not None:
            result['ar_var_value_json'] = self.ar_var_value_json
        if self.bank_no is not None:
            result['bank_no'] = self.bank_no
        if self.borrower is not None:
            result['borrower'] = self.borrower.to_map()
        if self.extend_json is not None:
            result['extend_json'] = self.extend_json
        if self.house is not None:
            result['house'] = self.house.to_map()
        if self.marital_status is not None:
            result['marital_status'] = self.marital_status
        if self.out_biz_no is not None:
            result['out_biz_no'] = self.out_biz_no
        if self.reg_reason is not None:
            result['reg_reason'] = self.reg_reason
        if self.reg_reason_remark is not None:
            result['reg_reason_remark'] = self.reg_reason_remark
        if self.reg_rights is not None:
            result['reg_rights'] = self.reg_rights
        if self.reg_type is not None:
            result['reg_type'] = self.reg_type
        if self.spouse is not None:
            result['spouse'] = self.spouse.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.agreements = []
        if m.get('agreements') is not None:
            for k in m.get('agreements'):
                temp_model = Agreement()
                self.agreements.append(temp_model.from_map(k))
        self.archives = []
        if m.get('archives') is not None:
            for k in m.get('archives'):
                temp_model = Archive()
                self.archives.append(temp_model.from_map(k))
        if m.get('ar_var_value_json') is not None:
            self.ar_var_value_json = m.get('ar_var_value_json')
        if m.get('bank_no') is not None:
            self.bank_no = m.get('bank_no')
        if m.get('borrower') is not None:
            temp_model = Person()
            self.borrower = temp_model.from_map(m['borrower'])
        if m.get('extend_json') is not None:
            self.extend_json = m.get('extend_json')
        if m.get('house') is not None:
            temp_model = House()
            self.house = temp_model.from_map(m['house'])
        if m.get('marital_status') is not None:
            self.marital_status = m.get('marital_status')
        if m.get('out_biz_no') is not None:
            self.out_biz_no = m.get('out_biz_no')
        if m.get('reg_reason') is not None:
            self.reg_reason = m.get('reg_reason')
        if m.get('reg_reason_remark') is not None:
            self.reg_reason_remark = m.get('reg_reason_remark')
        if m.get('reg_rights') is not None:
            self.reg_rights = m.get('reg_rights')
        if m.get('reg_type') is not None:
            self.reg_type = m.get('reg_type')
        if m.get('spouse') is not None:
            temp_model = Person()
            self.spouse = temp_model.from_map(m['spouse'])
        return self


class StartRcpMgResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        mg_order_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 异常信息的文本描述
        self.result_code = result_code
        self.result_msg = result_msg
        # 抵押单号
        self.mg_order_no = mg_order_no

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
        if self.mg_order_no is not None:
            result['mg_order_no'] = self.mg_order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('mg_order_no') is not None:
            self.mg_order_no = m.get('mg_order_no')
        return self


class GetRcpMgRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bank_no: str = None,
        mg_order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.product_instance_id = product_instance_id
        # 银行编号
        self.bank_no = bank_no
        # 抵押单号
        self.mg_order_no = mg_order_no

    def validate(self):
        self.validate_required(self.bank_no, 'bank_no')
        self.validate_required(self.mg_order_no, 'mg_order_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bank_no is not None:
            result['bank_no'] = self.bank_no
        if self.mg_order_no is not None:
            result['mg_order_no'] = self.mg_order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bank_no') is not None:
            self.bank_no = m.get('bank_no')
        if m.get('mg_order_no') is not None:
            self.mg_order_no = m.get('mg_order_no')
        return self


class GetRcpMgResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        mg_order: MgOrder = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 异常信息的文本描述
        self.result_code = result_code
        self.result_msg = result_msg
        # 抵押单
        self.mg_order = mg_order

    def validate(self):
        if self.mg_order:
            self.mg_order.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.mg_order is not None:
            result['mg_order'] = self.mg_order.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('mg_order') is not None:
            temp_model = MgOrder()
            self.mg_order = temp_model.from_map(m['mg_order'])
        return self


class ConfirmRcpMgRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bank_no: str = None,
        mg_order_no: str = None,
        result: str = None,
        fail_code: str = None,
        fail_desc: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.product_instance_id = product_instance_id
        # 银行编号
        self.bank_no = bank_no
        # 抵押单号
        self.mg_order_no = mg_order_no
        # 确认抵押登记结果，Y:继续,N:中止抵押
        self.result = result
        # 银行返回的中止抵押原因code
        self.fail_code = fail_code
        # 银行反馈的中止抵押原因描述
        self.fail_desc = fail_desc

    def validate(self):
        self.validate_required(self.bank_no, 'bank_no')
        self.validate_required(self.mg_order_no, 'mg_order_no')
        self.validate_required(self.result, 'result')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bank_no is not None:
            result['bank_no'] = self.bank_no
        if self.mg_order_no is not None:
            result['mg_order_no'] = self.mg_order_no
        if self.result is not None:
            result['result'] = self.result
        if self.fail_code is not None:
            result['fail_code'] = self.fail_code
        if self.fail_desc is not None:
            result['fail_desc'] = self.fail_desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bank_no') is not None:
            self.bank_no = m.get('bank_no')
        if m.get('mg_order_no') is not None:
            self.mg_order_no = m.get('mg_order_no')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('fail_code') is not None:
            self.fail_code = m.get('fail_code')
        if m.get('fail_desc') is not None:
            self.fail_desc = m.get('fail_desc')
        return self


class ConfirmRcpMgResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 异常信息的文本描述
        self.result_code = result_code
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


class InitRcpMgRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bank_no: str = None,
        mg_order_no: str = None,
        result: str = None,
        fail_code: str = None,
        fail_desc: str = None,
        ar_var_value_json: str = None,
        mg_order_mort_guarantee: MortGuaranteeInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.product_instance_id = product_instance_id
        # 银行编号
        self.bank_no = bank_no
        # 抵押单号
        self.mg_order_no = mg_order_no
        # 确认预抵押结论，Y-表示继续，N-表示中止
        self.result = result
        # 中止抵押的原因code
        self.fail_code = fail_code
        # 中止抵押的原因描述
        self.fail_desc = fail_desc
        # 抵押登记相关合同变量和值全集，Map<String,String>的json格式
        self.ar_var_value_json = ar_var_value_json
        # 抵押担保信息
        self.mg_order_mort_guarantee = mg_order_mort_guarantee

    def validate(self):
        self.validate_required(self.bank_no, 'bank_no')
        self.validate_required(self.mg_order_no, 'mg_order_no')
        self.validate_required(self.result, 'result')
        self.validate_required(self.ar_var_value_json, 'ar_var_value_json')
        self.validate_required(self.mg_order_mort_guarantee, 'mg_order_mort_guarantee')
        if self.mg_order_mort_guarantee:
            self.mg_order_mort_guarantee.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bank_no is not None:
            result['bank_no'] = self.bank_no
        if self.mg_order_no is not None:
            result['mg_order_no'] = self.mg_order_no
        if self.result is not None:
            result['result'] = self.result
        if self.fail_code is not None:
            result['fail_code'] = self.fail_code
        if self.fail_desc is not None:
            result['fail_desc'] = self.fail_desc
        if self.ar_var_value_json is not None:
            result['ar_var_value_json'] = self.ar_var_value_json
        if self.mg_order_mort_guarantee is not None:
            result['mg_order_mort_guarantee'] = self.mg_order_mort_guarantee.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bank_no') is not None:
            self.bank_no = m.get('bank_no')
        if m.get('mg_order_no') is not None:
            self.mg_order_no = m.get('mg_order_no')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('fail_code') is not None:
            self.fail_code = m.get('fail_code')
        if m.get('fail_desc') is not None:
            self.fail_desc = m.get('fail_desc')
        if m.get('ar_var_value_json') is not None:
            self.ar_var_value_json = m.get('ar_var_value_json')
        if m.get('mg_order_mort_guarantee') is not None:
            temp_model = MortGuaranteeInfo()
            self.mg_order_mort_guarantee = temp_model.from_map(m['mg_order_mort_guarantee'])
        return self


class InitRcpMgResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 异常信息的文本描述
        self.result_code = result_code
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


class StartRcpMgvtwoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        loan_assist_platform: str = None,
        bank_no: str = None,
        out_biz_no: str = None,
        borrower: Person = None,
        marital_status: str = None,
        spouse: Person = None,
        house: House = None,
        agreements: List[Agreement] = None,
        ar_expire_time: str = None,
        mg_order_mort_guarantee: MortGuaranteeInfo = None,
        branch_bank: Bank = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.product_instance_id = product_instance_id
        # 助贷平台
        self.loan_assist_platform = loan_assist_platform
        # 房产链内部银行编号
        self.bank_no = bank_no
        # 外部业务单号
        self.out_biz_no = out_biz_no
        # 借款人
        self.borrower = borrower
        # 婚姻状况
        self.marital_status = marital_status
        # 借款人配偶
        self.spouse = spouse
        # 房产信息
        self.house = house
        # 待签合同列表
        self.agreements = agreements
        # 客户签署合同过期时间
        self.ar_expire_time = ar_expire_time
        # 抵押担保信息
        self.mg_order_mort_guarantee = mg_order_mort_guarantee
        # 办理业务分支行
        self.branch_bank = branch_bank

    def validate(self):
        if self.borrower:
            self.borrower.validate()
        if self.spouse:
            self.spouse.validate()
        if self.house:
            self.house.validate()
        if self.agreements:
            for k in self.agreements:
                if k:
                    k.validate()
        if self.ar_expire_time is not None:
            self.validate_pattern(self.ar_expire_time, 'ar_expire_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.mg_order_mort_guarantee:
            self.mg_order_mort_guarantee.validate()
        if self.branch_bank:
            self.branch_bank.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.loan_assist_platform is not None:
            result['loan_assist_platform'] = self.loan_assist_platform
        if self.bank_no is not None:
            result['bank_no'] = self.bank_no
        if self.out_biz_no is not None:
            result['out_biz_no'] = self.out_biz_no
        if self.borrower is not None:
            result['borrower'] = self.borrower.to_map()
        if self.marital_status is not None:
            result['marital_status'] = self.marital_status
        if self.spouse is not None:
            result['spouse'] = self.spouse.to_map()
        if self.house is not None:
            result['house'] = self.house.to_map()
        result['agreements'] = []
        if self.agreements is not None:
            for k in self.agreements:
                result['agreements'].append(k.to_map() if k else None)
        if self.ar_expire_time is not None:
            result['ar_expire_time'] = self.ar_expire_time
        if self.mg_order_mort_guarantee is not None:
            result['mg_order_mort_guarantee'] = self.mg_order_mort_guarantee.to_map()
        if self.branch_bank is not None:
            result['branch_bank'] = self.branch_bank.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('loan_assist_platform') is not None:
            self.loan_assist_platform = m.get('loan_assist_platform')
        if m.get('bank_no') is not None:
            self.bank_no = m.get('bank_no')
        if m.get('out_biz_no') is not None:
            self.out_biz_no = m.get('out_biz_no')
        if m.get('borrower') is not None:
            temp_model = Person()
            self.borrower = temp_model.from_map(m['borrower'])
        if m.get('marital_status') is not None:
            self.marital_status = m.get('marital_status')
        if m.get('spouse') is not None:
            temp_model = Person()
            self.spouse = temp_model.from_map(m['spouse'])
        if m.get('house') is not None:
            temp_model = House()
            self.house = temp_model.from_map(m['house'])
        self.agreements = []
        if m.get('agreements') is not None:
            for k in m.get('agreements'):
                temp_model = Agreement()
                self.agreements.append(temp_model.from_map(k))
        if m.get('ar_expire_time') is not None:
            self.ar_expire_time = m.get('ar_expire_time')
        if m.get('mg_order_mort_guarantee') is not None:
            temp_model = MortGuaranteeInfo()
            self.mg_order_mort_guarantee = temp_model.from_map(m['mg_order_mort_guarantee'])
        if m.get('branch_bank') is not None:
            temp_model = Bank()
            self.branch_bank = temp_model.from_map(m['branch_bank'])
        return self


class StartRcpMgvtwoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        mg_order_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 异常信息的文本描述
        self.result_code = result_code
        self.result_msg = result_msg
        # 房产链抵押单号
        self.mg_order_no = mg_order_no

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
        if self.mg_order_no is not None:
            result['mg_order_no'] = self.mg_order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('mg_order_no') is not None:
            self.mg_order_no = m.get('mg_order_no')
        return self


class ConfirmRcpMgvtwoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        loan_assist_platform: str = None,
        bank_no: str = None,
        mg_order_no: str = None,
        result: str = None,
        fail_code: str = None,
        fail_desc: str = None,
        borrower: Person = None,
        marital_status: str = None,
        spouse: Person = None,
        agreements: List[Agreement] = None,
        archives: List[Archive] = None,
        reg_rights: str = None,
        reg_type: str = None,
        reg_reason: str = None,
        reg_reason_remark: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.product_instance_id = product_instance_id
        # 助贷平台
        self.loan_assist_platform = loan_assist_platform
        # 房产链内部银行编号
        self.bank_no = bank_no
        # 房产链抵押单号
        self.mg_order_no = mg_order_no
        # 确认抵押结果，Y:继续抵押,N:终止抵押
        self.result = result
        # 终止抵押原因code
        self.fail_code = fail_code
        # 终止抵押原因desc
        self.fail_desc = fail_desc
        # 借款人
        self.borrower = borrower
        # 婚姻状况,MARRIED=已婚
        self.marital_status = marital_status
        # 借款人配偶
        self.spouse = spouse
        # 银行签署完成的合同列表
        self.agreements = agreements
        # 确认抵押需要的影印材料列表
        self.archives = archives
        # 登记权利类型，MORTGAGE_RIGHTS=抵押权
        self.reg_rights = reg_rights
        # 登记类型,FIRSTMAXGAGE_BIZTYPE=不动产抵押权首次登记(最高额抵押)
        self.reg_type = reg_type
        # 登记设立原因,LOAN=借贷
        self.reg_reason = reg_reason
        # 登记设立原因备注
        self.reg_reason_remark = reg_reason_remark

    def validate(self):
        self.validate_required(self.loan_assist_platform, 'loan_assist_platform')
        self.validate_required(self.bank_no, 'bank_no')
        self.validate_required(self.mg_order_no, 'mg_order_no')
        self.validate_required(self.result, 'result')
        self.validate_required(self.borrower, 'borrower')
        if self.borrower:
            self.borrower.validate()
        self.validate_required(self.marital_status, 'marital_status')
        if self.spouse:
            self.spouse.validate()
        self.validate_required(self.agreements, 'agreements')
        if self.agreements:
            for k in self.agreements:
                if k:
                    k.validate()
        self.validate_required(self.archives, 'archives')
        if self.archives:
            for k in self.archives:
                if k:
                    k.validate()
        self.validate_required(self.reg_rights, 'reg_rights')
        self.validate_required(self.reg_type, 'reg_type')
        self.validate_required(self.reg_reason, 'reg_reason')
        self.validate_required(self.reg_reason_remark, 'reg_reason_remark')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.loan_assist_platform is not None:
            result['loan_assist_platform'] = self.loan_assist_platform
        if self.bank_no is not None:
            result['bank_no'] = self.bank_no
        if self.mg_order_no is not None:
            result['mg_order_no'] = self.mg_order_no
        if self.result is not None:
            result['result'] = self.result
        if self.fail_code is not None:
            result['fail_code'] = self.fail_code
        if self.fail_desc is not None:
            result['fail_desc'] = self.fail_desc
        if self.borrower is not None:
            result['borrower'] = self.borrower.to_map()
        if self.marital_status is not None:
            result['marital_status'] = self.marital_status
        if self.spouse is not None:
            result['spouse'] = self.spouse.to_map()
        result['agreements'] = []
        if self.agreements is not None:
            for k in self.agreements:
                result['agreements'].append(k.to_map() if k else None)
        result['archives'] = []
        if self.archives is not None:
            for k in self.archives:
                result['archives'].append(k.to_map() if k else None)
        if self.reg_rights is not None:
            result['reg_rights'] = self.reg_rights
        if self.reg_type is not None:
            result['reg_type'] = self.reg_type
        if self.reg_reason is not None:
            result['reg_reason'] = self.reg_reason
        if self.reg_reason_remark is not None:
            result['reg_reason_remark'] = self.reg_reason_remark
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('loan_assist_platform') is not None:
            self.loan_assist_platform = m.get('loan_assist_platform')
        if m.get('bank_no') is not None:
            self.bank_no = m.get('bank_no')
        if m.get('mg_order_no') is not None:
            self.mg_order_no = m.get('mg_order_no')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('fail_code') is not None:
            self.fail_code = m.get('fail_code')
        if m.get('fail_desc') is not None:
            self.fail_desc = m.get('fail_desc')
        if m.get('borrower') is not None:
            temp_model = Person()
            self.borrower = temp_model.from_map(m['borrower'])
        if m.get('marital_status') is not None:
            self.marital_status = m.get('marital_status')
        if m.get('spouse') is not None:
            temp_model = Person()
            self.spouse = temp_model.from_map(m['spouse'])
        self.agreements = []
        if m.get('agreements') is not None:
            for k in m.get('agreements'):
                temp_model = Agreement()
                self.agreements.append(temp_model.from_map(k))
        self.archives = []
        if m.get('archives') is not None:
            for k in m.get('archives'):
                temp_model = Archive()
                self.archives.append(temp_model.from_map(k))
        if m.get('reg_rights') is not None:
            self.reg_rights = m.get('reg_rights')
        if m.get('reg_type') is not None:
            self.reg_type = m.get('reg_type')
        if m.get('reg_reason') is not None:
            self.reg_reason = m.get('reg_reason')
        if m.get('reg_reason_remark') is not None:
            self.reg_reason_remark = m.get('reg_reason_remark')
        return self


class ConfirmRcpMgvtwoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 异常信息的文本描述
        self.result_code = result_code
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


class CloseRcpMgvtwoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        loan_assist_platform: str = None,
        bank_no: str = None,
        mg_order_no: str = None,
        fail_code: str = None,
        fail_desc: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.product_instance_id = product_instance_id
        # 助贷平台
        self.loan_assist_platform = loan_assist_platform
        # 房产链内部银行编号
        self.bank_no = bank_no
        # 房产链抵押单
        self.mg_order_no = mg_order_no
        # 终止抵押原因码
        self.fail_code = fail_code
        # 终止抵押原因描述
        self.fail_desc = fail_desc

    def validate(self):
        self.validate_required(self.loan_assist_platform, 'loan_assist_platform')
        self.validate_required(self.bank_no, 'bank_no')
        self.validate_required(self.mg_order_no, 'mg_order_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.loan_assist_platform is not None:
            result['loan_assist_platform'] = self.loan_assist_platform
        if self.bank_no is not None:
            result['bank_no'] = self.bank_no
        if self.mg_order_no is not None:
            result['mg_order_no'] = self.mg_order_no
        if self.fail_code is not None:
            result['fail_code'] = self.fail_code
        if self.fail_desc is not None:
            result['fail_desc'] = self.fail_desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('loan_assist_platform') is not None:
            self.loan_assist_platform = m.get('loan_assist_platform')
        if m.get('bank_no') is not None:
            self.bank_no = m.get('bank_no')
        if m.get('mg_order_no') is not None:
            self.mg_order_no = m.get('mg_order_no')
        if m.get('fail_code') is not None:
            self.fail_code = m.get('fail_code')
        if m.get('fail_desc') is not None:
            self.fail_desc = m.get('fail_desc')
        return self


class CloseRcpMgvtwoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 异常信息的文本描述
        self.result_code = result_code
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


class GetRcpMgvtwoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bank_no: str = None,
        mg_order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.product_instance_id = product_instance_id
        # 房产链内部银行编号
        self.bank_no = bank_no
        # 房产链内部抵押单号
        self.mg_order_no = mg_order_no

    def validate(self):
        self.validate_required(self.bank_no, 'bank_no')
        self.validate_required(self.mg_order_no, 'mg_order_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bank_no is not None:
            result['bank_no'] = self.bank_no
        if self.mg_order_no is not None:
            result['mg_order_no'] = self.mg_order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bank_no') is not None:
            self.bank_no = m.get('bank_no')
        if m.get('mg_order_no') is not None:
            self.mg_order_no = m.get('mg_order_no')
        return self


class GetRcpMgvtwoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        mg_order: MgOrder = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 异常信息的文本描述
        self.result_code = result_code
        self.result_msg = result_msg
        # 抵押单明细
        self.mg_order = mg_order

    def validate(self):
        if self.mg_order:
            self.mg_order.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.mg_order is not None:
            result['mg_order'] = self.mg_order.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('mg_order') is not None:
            temp_model = MgOrder()
            self.mg_order = temp_model.from_map(m['mg_order'])
        return self


class AuthRcpRtcRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        apply_biz_id: str = None,
        sign_task_profile: SignTaskProfile = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.product_instance_id = product_instance_id
        # 申办业务号
        self.apply_biz_id = apply_biz_id
        # 签署任务描述
        self.sign_task_profile = sign_task_profile

    def validate(self):
        self.validate_required(self.apply_biz_id, 'apply_biz_id')
        self.validate_required(self.sign_task_profile, 'sign_task_profile')
        if self.sign_task_profile:
            self.sign_task_profile.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.apply_biz_id is not None:
            result['apply_biz_id'] = self.apply_biz_id
        if self.sign_task_profile is not None:
            result['sign_task_profile'] = self.sign_task_profile.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('apply_biz_id') is not None:
            self.apply_biz_id = m.get('apply_biz_id')
        if m.get('sign_task_profile') is not None:
            temp_model = SignTaskProfile()
            self.sign_task_profile = temp_model.from_map(m['sign_task_profile'])
        return self


class AuthRcpRtcResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 异常信息的文本描述
        self.result_code = result_code
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


class FinishRcpRtcRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        apply_biz_id: str = None,
        biz_status: str = None,
        biz_type: str = None,
        debt_amount: Amount = None,
        debt_end_date: str = None,
        debt_start_date: str = None,
        evaluation_amount: Amount = None,
        mortgagee: EntityBasicInfo = None,
        mortgage_type: str = None,
        other_right_info: OtherRightInfo = None,
        registered_date: str = None,
        material_file_list: List[MaterialFileInfo] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.product_instance_id = product_instance_id
        # 申办业务号
        self.apply_biz_id = apply_biz_id
        # 业务状态，可选值：PENDING("审核中")、CANCELLED("已撤回")、DONE("已办结")、REJECTED("已退件")、NEED_MORE_MATERIAL("待补件")
        self.biz_status = biz_status
        # 业务类型，可选值：FIRST_BIZTYPE("不动产抵押权首次登记(普通抵押)"),、EGAGECANCEL_BIZTYPE("不动产抵押权注销登记")、FIRSTMAXGAGE_BIZTYPE("不动产抵押权首次登记(最高额抵押)")
        self.biz_type = biz_type
        # 被担保主债权数额
        self.debt_amount = debt_amount
        # 履债结束日期，格式为：yyyy-MM-dd
        self.debt_end_date = debt_end_date
        # 履债开始日期，格式为：yyyy-MM-dd
        self.debt_start_date = debt_start_date
        # 评估价值
        self.evaluation_amount = evaluation_amount
        # 抵押权人
        self.mortgagee = mortgagee
        # 抵押方式，可选值： NORMAL_MORT("一般抵押权")、MAX_AMOUNT_MORT("最高额抵押权")
        self.mortgage_type = mortgage_type
        # 他项权证信息
        self.other_right_info = other_right_info
        # 登记日期，格式为：yyyy-MM-dd
        self.registered_date = registered_date
        # 材料文件列表，待缴费时必填）当业务状态为待缴费时，本材料文件列表会返回缴款通知书。
        self.material_file_list = material_file_list

    def validate(self):
        self.validate_required(self.apply_biz_id, 'apply_biz_id')
        self.validate_required(self.biz_status, 'biz_status')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.debt_amount, 'debt_amount')
        if self.debt_amount:
            self.debt_amount.validate()
        if self.evaluation_amount:
            self.evaluation_amount.validate()
        self.validate_required(self.mortgagee, 'mortgagee')
        if self.mortgagee:
            self.mortgagee.validate()
        self.validate_required(self.mortgage_type, 'mortgage_type')
        self.validate_required(self.other_right_info, 'other_right_info')
        if self.other_right_info:
            self.other_right_info.validate()
        self.validate_required(self.registered_date, 'registered_date')
        if self.material_file_list:
            for k in self.material_file_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.apply_biz_id is not None:
            result['apply_biz_id'] = self.apply_biz_id
        if self.biz_status is not None:
            result['biz_status'] = self.biz_status
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.debt_amount is not None:
            result['debt_amount'] = self.debt_amount.to_map()
        if self.debt_end_date is not None:
            result['debt_end_date'] = self.debt_end_date
        if self.debt_start_date is not None:
            result['debt_start_date'] = self.debt_start_date
        if self.evaluation_amount is not None:
            result['evaluation_amount'] = self.evaluation_amount.to_map()
        if self.mortgagee is not None:
            result['mortgagee'] = self.mortgagee.to_map()
        if self.mortgage_type is not None:
            result['mortgage_type'] = self.mortgage_type
        if self.other_right_info is not None:
            result['other_right_info'] = self.other_right_info.to_map()
        if self.registered_date is not None:
            result['registered_date'] = self.registered_date
        result['material_file_list'] = []
        if self.material_file_list is not None:
            for k in self.material_file_list:
                result['material_file_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('apply_biz_id') is not None:
            self.apply_biz_id = m.get('apply_biz_id')
        if m.get('biz_status') is not None:
            self.biz_status = m.get('biz_status')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('debt_amount') is not None:
            temp_model = Amount()
            self.debt_amount = temp_model.from_map(m['debt_amount'])
        if m.get('debt_end_date') is not None:
            self.debt_end_date = m.get('debt_end_date')
        if m.get('debt_start_date') is not None:
            self.debt_start_date = m.get('debt_start_date')
        if m.get('evaluation_amount') is not None:
            temp_model = Amount()
            self.evaluation_amount = temp_model.from_map(m['evaluation_amount'])
        if m.get('mortgagee') is not None:
            temp_model = EntityBasicInfo()
            self.mortgagee = temp_model.from_map(m['mortgagee'])
        if m.get('mortgage_type') is not None:
            self.mortgage_type = m.get('mortgage_type')
        if m.get('other_right_info') is not None:
            temp_model = OtherRightInfo()
            self.other_right_info = temp_model.from_map(m['other_right_info'])
        if m.get('registered_date') is not None:
            self.registered_date = m.get('registered_date')
        self.material_file_list = []
        if m.get('material_file_list') is not None:
            for k in m.get('material_file_list'):
                temp_model = MaterialFileInfo()
                self.material_file_list.append(temp_model.from_map(k))
        return self


class FinishRcpRtcResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 异常信息的文本描述
        self.result_code = result_code
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


class FinishRcpNingboRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ywh: str = None,
        bdcdyh: str = None,
        bdcdjzmh: str = None,
        zmqlhsx: str = None,
        qlr: str = None,
        ywr: str = None,
        zl: str = None,
        qt: str = None,
        fj: str = None,
        fzgbh: str = None,
        szr: str = None,
        szsj: str = None,
        fzr: str = None,
        fzsj: str = None,
        fzjg: str = None,
        qxdm: int = None,
        sbh: str = None,
        djzmzl: str = None,
        djzmfile: str = None,
        zqse: str = None,
        qlqssj: str = None,
        qljssj: str = None,
        dyfs: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.product_instance_id = product_instance_id
        # 业务号，银行抵押登记申请接口中生成并传递给不动产的业务号
        self.ywh = ywh
        # 不动产单元号，如14-2-1802
        self.bdcdyh = bdcdyh
        # 不动产登记证明号
        self.bdcdjzmh = bdcdjzmh
        # 证明权利或事项
        self.zmqlhsx = zmqlhsx
        # 权利人
        self.qlr = qlr
        # 义务人
        self.ywr = ywr
        # 坐落
        self.zl = zl
        # 其他
        self.qt = qt
        # 附记
        self.fj = fj
        # 发证工本号
        self.fzgbh = fzgbh
        # 缮证人
        self.szr = szr
        # 缮证时间
        self.szsj = szsj
        # 发证人
        self.fzr = fzr
        # 发证时间
        self.fzsj = fzsj
        # 发证机关
        self.fzjg = fzjg
        # 区县代码
        self.qxdm = qxdm
        # 省编号
        self.sbh = sbh
        # 登记证明种类
        self.djzmzl = djzmzl
        # 电子版文件字符串
        self.djzmfile = djzmfile
        # 债权数额，单位:万元
        self.zqse = zqse
        # 抵押权起始日期，格式：“yyyy-MM-dd”
        self.qlqssj = qlqssj
        # 抵押权结束日期，格式：“yyyy-MM-dd”
        self.qljssj = qljssj
        # 抵押方式
        self.dyfs = dyfs

    def validate(self):
        self.validate_required(self.ywh, 'ywh')
        self.validate_required(self.bdcdyh, 'bdcdyh')
        self.validate_required(self.bdcdjzmh, 'bdcdjzmh')
        self.validate_required(self.zmqlhsx, 'zmqlhsx')
        self.validate_required(self.qlr, 'qlr')
        self.validate_required(self.ywr, 'ywr')
        self.validate_required(self.zl, 'zl')
        self.validate_required(self.fj, 'fj')
        self.validate_required(self.fzgbh, 'fzgbh')
        self.validate_required(self.szr, 'szr')
        self.validate_required(self.szsj, 'szsj')
        self.validate_required(self.fzr, 'fzr')
        self.validate_required(self.fzsj, 'fzsj')
        self.validate_required(self.fzjg, 'fzjg')
        self.validate_required(self.qxdm, 'qxdm')
        self.validate_required(self.sbh, 'sbh')
        self.validate_required(self.djzmzl, 'djzmzl')
        self.validate_required(self.djzmfile, 'djzmfile')
        self.validate_required(self.zqse, 'zqse')
        self.validate_required(self.qlqssj, 'qlqssj')
        self.validate_required(self.qljssj, 'qljssj')
        self.validate_required(self.dyfs, 'dyfs')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ywh is not None:
            result['ywh'] = self.ywh
        if self.bdcdyh is not None:
            result['bdcdyh'] = self.bdcdyh
        if self.bdcdjzmh is not None:
            result['bdcdjzmh'] = self.bdcdjzmh
        if self.zmqlhsx is not None:
            result['zmqlhsx'] = self.zmqlhsx
        if self.qlr is not None:
            result['qlr'] = self.qlr
        if self.ywr is not None:
            result['ywr'] = self.ywr
        if self.zl is not None:
            result['zl'] = self.zl
        if self.qt is not None:
            result['qt'] = self.qt
        if self.fj is not None:
            result['fj'] = self.fj
        if self.fzgbh is not None:
            result['fzgbh'] = self.fzgbh
        if self.szr is not None:
            result['szr'] = self.szr
        if self.szsj is not None:
            result['szsj'] = self.szsj
        if self.fzr is not None:
            result['fzr'] = self.fzr
        if self.fzsj is not None:
            result['fzsj'] = self.fzsj
        if self.fzjg is not None:
            result['fzjg'] = self.fzjg
        if self.qxdm is not None:
            result['qxdm'] = self.qxdm
        if self.sbh is not None:
            result['sbh'] = self.sbh
        if self.djzmzl is not None:
            result['djzmzl'] = self.djzmzl
        if self.djzmfile is not None:
            result['djzmfile'] = self.djzmfile
        if self.zqse is not None:
            result['zqse'] = self.zqse
        if self.qlqssj is not None:
            result['qlqssj'] = self.qlqssj
        if self.qljssj is not None:
            result['qljssj'] = self.qljssj
        if self.dyfs is not None:
            result['dyfs'] = self.dyfs
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ywh') is not None:
            self.ywh = m.get('ywh')
        if m.get('bdcdyh') is not None:
            self.bdcdyh = m.get('bdcdyh')
        if m.get('bdcdjzmh') is not None:
            self.bdcdjzmh = m.get('bdcdjzmh')
        if m.get('zmqlhsx') is not None:
            self.zmqlhsx = m.get('zmqlhsx')
        if m.get('qlr') is not None:
            self.qlr = m.get('qlr')
        if m.get('ywr') is not None:
            self.ywr = m.get('ywr')
        if m.get('zl') is not None:
            self.zl = m.get('zl')
        if m.get('qt') is not None:
            self.qt = m.get('qt')
        if m.get('fj') is not None:
            self.fj = m.get('fj')
        if m.get('fzgbh') is not None:
            self.fzgbh = m.get('fzgbh')
        if m.get('szr') is not None:
            self.szr = m.get('szr')
        if m.get('szsj') is not None:
            self.szsj = m.get('szsj')
        if m.get('fzr') is not None:
            self.fzr = m.get('fzr')
        if m.get('fzsj') is not None:
            self.fzsj = m.get('fzsj')
        if m.get('fzjg') is not None:
            self.fzjg = m.get('fzjg')
        if m.get('qxdm') is not None:
            self.qxdm = m.get('qxdm')
        if m.get('sbh') is not None:
            self.sbh = m.get('sbh')
        if m.get('djzmzl') is not None:
            self.djzmzl = m.get('djzmzl')
        if m.get('djzmfile') is not None:
            self.djzmfile = m.get('djzmfile')
        if m.get('zqse') is not None:
            self.zqse = m.get('zqse')
        if m.get('qlqssj') is not None:
            self.qlqssj = m.get('qlqssj')
        if m.get('qljssj') is not None:
            self.qljssj = m.get('qljssj')
        if m.get('dyfs') is not None:
            self.dyfs = m.get('dyfs')
        return self


class FinishRcpNingboResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 异常信息的文本描述
        self.result_code = result_code
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


class RefuseRcpNingboRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        timestamp: str = None,
        ywh: str = None,
        zt: str = None,
        bz: str = None,
        czr: str = None,
        czsj: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.product_instance_id = product_instance_id
        # 请求时间，是以long类型的字符串
        self.timestamp = timestamp
        # 业务号
        self.ywh = ywh
        # 状态：1—审核通过（开始受理），2—驳回
        # 
        self.zt = zt
        # 备注，驳回原因
        self.bz = bz
        # 操作人
        self.czr = czr
        # 操作时间 yyyy-MM-dd HH:mm:ss
        self.czsj = czsj

    def validate(self):
        self.validate_required(self.timestamp, 'timestamp')
        self.validate_required(self.ywh, 'ywh')
        self.validate_required(self.zt, 'zt')
        self.validate_required(self.bz, 'bz')
        self.validate_required(self.czr, 'czr')
        self.validate_required(self.czsj, 'czsj')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.ywh is not None:
            result['ywh'] = self.ywh
        if self.zt is not None:
            result['zt'] = self.zt
        if self.bz is not None:
            result['bz'] = self.bz
        if self.czr is not None:
            result['czr'] = self.czr
        if self.czsj is not None:
            result['czsj'] = self.czsj
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('ywh') is not None:
            self.ywh = m.get('ywh')
        if m.get('zt') is not None:
            self.zt = m.get('zt')
        if m.get('bz') is not None:
            self.bz = m.get('bz')
        if m.get('czr') is not None:
            self.czr = m.get('czr')
        if m.get('czsj') is not None:
            self.czsj = m.get('czsj')
        return self


class RefuseRcpNingboResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 异常信息的文本描述
        self.result_code = result_code
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


class CreateRealtytradeOrgRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        cert_type: str = None,
        cert_no: str = None,
        manager_cert_type: str = None,
        manager_cert_no: str = None,
        manager_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.product_instance_id = product_instance_id
        # 公司名称的全称
        self.name = name
        # 机构证件类型，默认为：CRED_ORG_USCC（统一社会信用代码），证件类型详见 https://tech.antfin.com/docs/2/155166
        self.cert_type = cert_type
        # 证件类型对应的证件号码
        self.cert_no = cert_no
        # 经办人的证件类型，默认为身份证，值为：CRED_PSN_CH_IDCARD
        self.manager_cert_type = manager_cert_type
        # 经办人的证件号码
        # 
        # 
        self.manager_cert_no = manager_cert_no
        # 经办人的姓名
        # 
        # 
        self.manager_name = manager_name

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.manager_cert_no, 'manager_cert_no')
        self.validate_required(self.manager_name, 'manager_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.name is not None:
            result['name'] = self.name
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.manager_cert_type is not None:
            result['manager_cert_type'] = self.manager_cert_type
        if self.manager_cert_no is not None:
            result['manager_cert_no'] = self.manager_cert_no
        if self.manager_name is not None:
            result['manager_name'] = self.manager_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('manager_cert_type') is not None:
            self.manager_cert_type = m.get('manager_cert_type')
        if m.get('manager_cert_no') is not None:
            self.manager_cert_no = m.get('manager_cert_no')
        if m.get('manager_name') is not None:
            self.manager_name = m.get('manager_name')
        return self


class CreateRealtytradeOrgResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        org_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 异常信息的文本描述
        self.result_code = result_code
        self.result_msg = result_msg
        # 本机构在数字房产平台的唯一ID
        # 
        # 
        self.org_id = org_id

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
        if self.org_id is not None:
            result['org_id'] = self.org_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        return self


class CreateRealtytradeOrgsealRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        org_id: str = None,
        template_type: str = None,
        seal_color: str = None,
        center_pattern: str = None,
        horizontal_title: str = None,
        last_title: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.product_instance_id = product_instance_id
        # 企业账户注册时返回的机构ID
        self.org_id = org_id
        # 印章样式说明，Round-圆章，Oval-椭圆章，默认Round
        self.template_type = template_type
        # 印章颜色，ed-红色，Blue-蓝色，Black-黑色，默认Red
        self.seal_color = seal_color
        # 中心图案类型，Star-圆形有五角星，None-圆形无五角星，默认None
        self.center_pattern = center_pattern
        # 企业用章说明，可设置0-8个字，企业名称超出25个字后，不支持设置横向文
        self.horizontal_title = horizontal_title
        # 企业用章日期范围等，可设置0-20个字，企业企业名称超出25个字后，不支持设置下弦文
        self.last_title = last_title

    def validate(self):
        self.validate_required(self.org_id, 'org_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.org_id is not None:
            result['org_id'] = self.org_id
        if self.template_type is not None:
            result['template_type'] = self.template_type
        if self.seal_color is not None:
            result['seal_color'] = self.seal_color
        if self.center_pattern is not None:
            result['center_pattern'] = self.center_pattern
        if self.horizontal_title is not None:
            result['horizontal_title'] = self.horizontal_title
        if self.last_title is not None:
            result['last_title'] = self.last_title
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        if m.get('template_type') is not None:
            self.template_type = m.get('template_type')
        if m.get('seal_color') is not None:
            self.seal_color = m.get('seal_color')
        if m.get('center_pattern') is not None:
            self.center_pattern = m.get('center_pattern')
        if m.get('horizontal_title') is not None:
            self.horizontal_title = m.get('horizontal_title')
        if m.get('last_title') is not None:
            self.last_title = m.get('last_title')
        return self


class CreateRealtytradeOrgsealResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        org_seal_id: str = None,
        url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 异常信息的文本描述
        self.result_code = result_code
        self.result_msg = result_msg
        # 企业印章 ID
        self.org_seal_id = org_seal_id
        # 印章图片下载URL地址，1个小时内有效
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
        if self.org_seal_id is not None:
            result['org_seal_id'] = self.org_seal_id
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
        if m.get('org_seal_id') is not None:
            self.org_seal_id = m.get('org_seal_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        return self


class CreateRealtytradePersonalRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        cert_type: str = None,
        cert_no: str = None,
        telephone: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.product_instance_id = product_instance_id
        # 姓名
        self.name = name
        # 证件类型详见 https://tech.antfin.com/docs/2/155166，默认为CRED_PSN_CH_IDCARD（身份证类型）
        self.cert_type = cert_type
        # 证件号码
        self.cert_no = cert_no
        # 手机号码
        self.telephone = telephone

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.telephone, 'telephone')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.name is not None:
            result['name'] = self.name
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.telephone is not None:
            result['telephone'] = self.telephone
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('telephone') is not None:
            self.telephone = m.get('telephone')
        return self


class CreateRealtytradePersonalResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        personal_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 异常信息的文本描述
        self.result_code = result_code
        self.result_msg = result_msg
        # 个人在数字房产平台的唯一ID
        self.personal_id = personal_id

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
        if self.personal_id is not None:
            result['personal_id'] = self.personal_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('personal_id') is not None:
            self.personal_id = m.get('personal_id')
        return self


class CreateRealtytradePersonalsealRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        personal_id: str = None,
        picture_data: str = None,
        seal_height: int = None,
        seal_width: int = None,
        transparentizing: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.product_instance_id = product_instance_id
        # 个人在数字房产平台的唯一ID
        self.personal_id = personal_id
        # 图片data，BASE64 编码后图片信息，图片原始格式必须为 png
        self.picture_data = picture_data
        # 印章高度，单位为px，默认95
        self.seal_height = seal_height
        # 印章宽度，单位为px，默认95
        self.seal_width = seal_width
        # 否对图片进行透明化处理，默认false。仅对图片整体做透明化处理，无法去除图片背景。
        self.transparentizing = transparentizing

    def validate(self):
        self.validate_required(self.personal_id, 'personal_id')
        self.validate_required(self.picture_data, 'picture_data')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.personal_id is not None:
            result['personal_id'] = self.personal_id
        if self.picture_data is not None:
            result['picture_data'] = self.picture_data
        if self.seal_height is not None:
            result['seal_height'] = self.seal_height
        if self.seal_width is not None:
            result['seal_width'] = self.seal_width
        if self.transparentizing is not None:
            result['transparentizing'] = self.transparentizing
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('personal_id') is not None:
            self.personal_id = m.get('personal_id')
        if m.get('picture_data') is not None:
            self.picture_data = m.get('picture_data')
        if m.get('seal_height') is not None:
            self.seal_height = m.get('seal_height')
        if m.get('seal_width') is not None:
            self.seal_width = m.get('seal_width')
        if m.get('transparentizing') is not None:
            self.transparentizing = m.get('transparentizing')
        return self


class CreateRealtytradePersonalsealResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        personal_seal_id: str = None,
        url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 异常信息的文本描述
        self.result_code = result_code
        self.result_msg = result_msg
        # 个人印章 ID
        self.personal_seal_id = personal_seal_id
        # 印章图片下载URL地址，1个小时内有效
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
        if self.personal_seal_id is not None:
            result['personal_seal_id'] = self.personal_seal_id
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
        if m.get('personal_seal_id') is not None:
            self.personal_seal_id = m.get('personal_seal_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        return self


class StartRealtytradeSigningRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        org_id: str = None,
        description: str = None,
        contract_list: List[ContractSigning] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.product_instance_id = product_instance_id
        # 机构账号 ID
        self.org_id = org_id
        # 业务描述,描述本次合同文档加载业务
        self.description = description
        # 合同及签署信息列表
        self.contract_list = contract_list

    def validate(self):
        self.validate_required(self.org_id, 'org_id')
        self.validate_required(self.description, 'description')
        self.validate_required(self.contract_list, 'contract_list')
        if self.contract_list:
            for k in self.contract_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.org_id is not None:
            result['org_id'] = self.org_id
        if self.description is not None:
            result['description'] = self.description
        result['contract_list'] = []
        if self.contract_list is not None:
            for k in self.contract_list:
                result['contract_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        self.contract_list = []
        if m.get('contract_list') is not None:
            for k in m.get('contract_list'):
                temp_model = ContractSigning()
                self.contract_list.append(temp_model.from_map(k))
        return self


class StartRealtytradeSigningResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        process_id: str = None,
        contract_list: List[Contract] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 异常信息的文本描述
        self.result_code = result_code
        self.result_msg = result_msg
        # 签署流程 ID
        self.process_id = process_id
        # 签署中的多个合同文件信息
        self.contract_list = contract_list

    def validate(self):
        if self.contract_list:
            for k in self.contract_list:
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
        if self.process_id is not None:
            result['process_id'] = self.process_id
        result['contract_list'] = []
        if self.contract_list is not None:
            for k in self.contract_list:
                result['contract_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('process_id') is not None:
            self.process_id = m.get('process_id')
        self.contract_list = []
        if m.get('contract_list') is not None:
            for k in m.get('contract_list'):
                temp_model = Contract()
                self.contract_list.append(temp_model.from_map(k))
        return self


class QueryRealtytradeSigningRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        process_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 集群ID
        self.product_instance_id = product_instance_id
        # 签署流程 ID
        # 
        self.process_id = process_id

    def validate(self):
        self.validate_required(self.process_id, 'process_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.process_id is not None:
            result['process_id'] = self.process_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('process_id') is not None:
            self.process_id = m.get('process_id')
        return self


class QueryRealtytradeSigningResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        process_id: str = None,
        status: str = None,
        signing_result: str = None,
        contract_list: List[Contract] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 异常信息的文本描述
        self.result_code = result_code
        self.result_msg = result_msg
        # 签署流程 ID
        self.process_id = process_id
        # 签署流程状态，包括值为：Initial、Pending、Ready、Started、Finish
        self.status = status
        # 签署结果，包括值为：2-完成，所有签署人完成签署，3-撤销，发起方撤销签署任务，5-过期（签署截止日到期后触发），7-拒签
        self.signing_result = signing_result
        # 合同信息列表，列表描述本流程中的多个文件详情，只有签署结果为完成时才有合同的归档文件下载路径：archived_file_url
        self.contract_list = contract_list

    def validate(self):
        if self.contract_list:
            for k in self.contract_list:
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
        if self.process_id is not None:
            result['process_id'] = self.process_id
        if self.status is not None:
            result['status'] = self.status
        if self.signing_result is not None:
            result['signing_result'] = self.signing_result
        result['contract_list'] = []
        if self.contract_list is not None:
            for k in self.contract_list:
                result['contract_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('process_id') is not None:
            self.process_id = m.get('process_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('signing_result') is not None:
            self.signing_result = m.get('signing_result')
        self.contract_list = []
        if m.get('contract_list') is not None:
            for k in m.get('contract_list'):
                temp_model = Contract()
                self.contract_list.append(temp_model.from_map(k))
        return self


