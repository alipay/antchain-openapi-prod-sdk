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
        _map = super().to_map()
        if _map is not None:
            return _map

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
        _map = super().to_map()
        if _map is not None:
            return _map

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
        _map = super().to_map()
        if _map is not None:
            return _map

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
        _map = super().to_map()
        if _map is not None:
            return _map

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
        _map = super().to_map()
        if _map is not None:
            return _map

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
        _map = super().to_map()
        if _map is not None:
            return _map

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
        _map = super().to_map()
        if _map is not None:
            return _map

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
        _map = super().to_map()
        if _map is not None:
            return _map

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
        _map = super().to_map()
        if _map is not None:
            return _map

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


class StartBlockchainArecRcpMgrRequest(TeaModel):
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
        mg_release_order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
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
        # 解抵押单号
        self.mg_release_order_no = mg_release_order_no

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
        _map = super().to_map()
        if _map is not None:
            return _map

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
        if self.mg_release_order_no is not None:
            result['mg_release_order_no'] = self.mg_release_order_no
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
        if m.get('mg_release_order_no') is not None:
            self.mg_release_order_no = m.get('mg_release_order_no')
        return self


class StartBlockchainArecRcpMgrResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        mg_release_order_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 解抵押单号
        self.mg_release_order_no = mg_release_order_no

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


class ConfirmBlockchainArecRcpMgrRequest(TeaModel):
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
        _map = super().to_map()
        if _map is not None:
            return _map

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


class ConfirmBlockchainArecRcpMgrResponse(TeaModel):
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


