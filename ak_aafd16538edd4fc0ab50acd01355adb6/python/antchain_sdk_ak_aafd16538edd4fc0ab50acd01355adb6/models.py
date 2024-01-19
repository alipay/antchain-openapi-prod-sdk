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


class RiskEvaluationAgreementExtRequest(TeaModel):
    def __init__(
        self,
        type: str = None,
        file_type: str = None,
        content: str = None,
    ):
        # URL：文件地址
        # CONTENT:Base64的文件流
        # 
        self.type = type
        # 文件类型
        # PDF
        self.file_type = file_type
        # type为url是传入文件地址
        # type为CONTENT时传入Base64文件内容编码
        # 
        self.content = content

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.content, 'content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class RiskEvaluationDistrictExtRequest(TeaModel):
    def __init__(
        self,
        city_code: str = None,
        prov_code: str = None,
    ):
        # 地区编码
        self.city_code = city_code
        # 省级编码
        self.prov_code = prov_code

    def validate(self):
        self.validate_required(self.city_code, 'city_code')
        self.validate_required(self.prov_code, 'prov_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.city_code is not None:
            result['city_code'] = self.city_code
        if self.prov_code is not None:
            result['prov_code'] = self.prov_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('city_code') is not None:
            self.city_code = m.get('city_code')
        if m.get('prov_code') is not None:
            self.prov_code = m.get('prov_code')
        return self


class RiskEvaluationExtendInfoRequest(TeaModel):
    def __init__(
        self,
        agreement_list: List[RiskEvaluationAgreementExtRequest] = None,
        district_ext: RiskEvaluationDistrictExtRequest = None,
    ):
        # 协议集合
        self.agreement_list = agreement_list
        # 地区请求
        self.district_ext = district_ext

    def validate(self):
        self.validate_required(self.agreement_list, 'agreement_list')
        if self.agreement_list:
            for k in self.agreement_list:
                if k:
                    k.validate()
        self.validate_required(self.district_ext, 'district_ext')
        if self.district_ext:
            self.district_ext.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['agreement_list'] = []
        if self.agreement_list is not None:
            for k in self.agreement_list:
                result['agreement_list'].append(k.to_map() if k else None)
        if self.district_ext is not None:
            result['district_ext'] = self.district_ext.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.agreement_list = []
        if m.get('agreement_list') is not None:
            for k in m.get('agreement_list'):
                temp_model = RiskEvaluationAgreementExtRequest()
                self.agreement_list.append(temp_model.from_map(k))
        if m.get('district_ext') is not None:
            temp_model = RiskEvaluationDistrictExtRequest()
            self.district_ext = temp_model.from_map(m['district_ext'])
        return self


class ImportDataBccCompanyPersonRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        xm: str = None,
        sfzh: str = None,
        sjgxsj: str = None,
        sjmlmc: str = None,
        sjssbm: str = None,
        cyzgzh: str = None,
        cylb: str = None,
        pydw: str = None,
        ggsy: str = None,
        ggrqq: str = None,
        ggrqz: str = None,
        data_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 姓名
        self.xm = xm
        # 身份证号
        self.sfzh = sfzh
        # 数据更新时间
        self.sjgxsj = sjgxsj
        # 数据目录名称
        self.sjmlmc = sjmlmc
        # 数据所属部门
        self.sjssbm = sjssbm
        # 从业资格证号
        self.cyzgzh = cyzgzh
        # 从业类别
        self.cylb = cylb
        # 聘用单位
        self.pydw = pydw
        # 公告事由
        self.ggsy = ggsy
        # 公告日期起
        self.ggrqq = ggrqq
        # 公告日期止
        self.ggrqz = ggrqz
        # 企信链所需---企信链控制台数据管理列表页中每个数据的唯一码
        self.data_name = data_name

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
        if self.xm is not None:
            result['xm'] = self.xm
        if self.sfzh is not None:
            result['sfzh'] = self.sfzh
        if self.sjgxsj is not None:
            result['sjgxsj'] = self.sjgxsj
        if self.sjmlmc is not None:
            result['sjmlmc'] = self.sjmlmc
        if self.sjssbm is not None:
            result['sjssbm'] = self.sjssbm
        if self.cyzgzh is not None:
            result['cyzgzh'] = self.cyzgzh
        if self.cylb is not None:
            result['cylb'] = self.cylb
        if self.pydw is not None:
            result['pydw'] = self.pydw
        if self.ggsy is not None:
            result['ggsy'] = self.ggsy
        if self.ggrqq is not None:
            result['ggrqq'] = self.ggrqq
        if self.ggrqz is not None:
            result['ggrqz'] = self.ggrqz
        if self.data_name is not None:
            result['data_name'] = self.data_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('xm') is not None:
            self.xm = m.get('xm')
        if m.get('sfzh') is not None:
            self.sfzh = m.get('sfzh')
        if m.get('sjgxsj') is not None:
            self.sjgxsj = m.get('sjgxsj')
        if m.get('sjmlmc') is not None:
            self.sjmlmc = m.get('sjmlmc')
        if m.get('sjssbm') is not None:
            self.sjssbm = m.get('sjssbm')
        if m.get('cyzgzh') is not None:
            self.cyzgzh = m.get('cyzgzh')
        if m.get('cylb') is not None:
            self.cylb = m.get('cylb')
        if m.get('pydw') is not None:
            self.pydw = m.get('pydw')
        if m.get('ggsy') is not None:
            self.ggsy = m.get('ggsy')
        if m.get('ggrqq') is not None:
            self.ggrqq = m.get('ggrqq')
        if m.get('ggrqz') is not None:
            self.ggrqz = m.get('ggrqz')
        if m.get('data_name') is not None:
            self.data_name = m.get('data_name')
        return self


class ImportDataBccCompanyPersonResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data_key: str = None,
        data_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据模型唯一key
        self.data_key = data_key
        # 模型码
        self.data_code = data_code

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
        if self.data_key is not None:
            result['data_key'] = self.data_key
        if self.data_code is not None:
            result['data_code'] = self.data_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('data_key') is not None:
            self.data_key = m.get('data_key')
        if m.get('data_code') is not None:
            self.data_code = m.get('data_code')
        return self


class AuthBlockchainTaxRiskEvaluationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        identity_id: str = None,
        identity_name: str = None,
        enterprise_id: str = None,
        enterprise_name: str = None,
        identity_type: str = None,
        auth_type: str = None,
        order_no: str = None,
        sub_tenant: str = None,
        extend_info: RiskEvaluationExtendInfoRequest = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 个人身份证号
        self.identity_id = identity_id
        # 个人姓名
        self.identity_name = identity_name
        # 企业的统一社会信用编码
        self.enterprise_id = enterprise_id
        # 企业的名称
        self.enterprise_name = enterprise_name
        # 企业或者个人企业：ENTERPRISE  个人：PERSONAL
        # 
        self.identity_type = identity_type
        # 授权的业务类型
        self.auth_type = auth_type
        # 授权订单号
        self.order_no = order_no
        # 子渠道渠道编码，需要同步蚂蚁，由蚂蚁设置。如果是银行本身，可不填
        # 备注：如果同一信贷客户在不同银行的调用需要严格区分，分别授权
        # 
        self.sub_tenant = sub_tenant
        # 扩展信息
        self.extend_info = extend_info

    def validate(self):
        self.validate_required(self.identity_id, 'identity_id')
        if self.identity_id is not None:
            self.validate_max_length(self.identity_id, 'identity_id', 30)
        if self.identity_name is not None:
            self.validate_max_length(self.identity_name, 'identity_name', 128)
        if self.enterprise_id is not None:
            self.validate_max_length(self.enterprise_id, 'enterprise_id', 64)
        self.validate_required(self.identity_type, 'identity_type')
        self.validate_required(self.auth_type, 'auth_type')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.extend_info, 'extend_info')
        if self.extend_info:
            self.extend_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.identity_id is not None:
            result['identity_id'] = self.identity_id
        if self.identity_name is not None:
            result['identity_name'] = self.identity_name
        if self.enterprise_id is not None:
            result['enterprise_id'] = self.enterprise_id
        if self.enterprise_name is not None:
            result['enterprise_name'] = self.enterprise_name
        if self.identity_type is not None:
            result['identity_type'] = self.identity_type
        if self.auth_type is not None:
            result['auth_type'] = self.auth_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.sub_tenant is not None:
            result['sub_tenant'] = self.sub_tenant
        if self.extend_info is not None:
            result['extend_info'] = self.extend_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('identity_id') is not None:
            self.identity_id = m.get('identity_id')
        if m.get('identity_name') is not None:
            self.identity_name = m.get('identity_name')
        if m.get('enterprise_id') is not None:
            self.enterprise_id = m.get('enterprise_id')
        if m.get('enterprise_name') is not None:
            self.enterprise_name = m.get('enterprise_name')
        if m.get('identity_type') is not None:
            self.identity_type = m.get('identity_type')
        if m.get('auth_type') is not None:
            self.auth_type = m.get('auth_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('sub_tenant') is not None:
            self.sub_tenant = m.get('sub_tenant')
        if m.get('extend_info') is not None:
            temp_model = RiskEvaluationExtendInfoRequest()
            self.extend_info = temp_model.from_map(m['extend_info'])
        return self


class AuthBlockchainTaxRiskEvaluationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_no: str = None,
        auth_success: bool = None,
        expire_time: int = None,
        auth_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权订单订单号
        self.order_no = order_no
        # 是否授权成功true是，false否
        self.auth_success = auth_success
        # 过期时间，unix时间戳 毫秒
        self.expire_time = expire_time
        # 授权时间，unix时间戳 毫秒
        self.auth_time = auth_time

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
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.auth_success is not None:
            result['auth_success'] = self.auth_success
        if self.expire_time is not None:
            result['expire_time'] = self.expire_time
        if self.auth_time is not None:
            result['auth_time'] = self.auth_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('auth_success') is not None:
            self.auth_success = m.get('auth_success')
        if m.get('expire_time') is not None:
            self.expire_time = m.get('expire_time')
        if m.get('auth_time') is not None:
            self.auth_time = m.get('auth_time')
        return self


class QueryBlockchainTaxRiskEvaluationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_request_id: str = None,
        identity_id: str = None,
        auth_type: str = None,
        order_no: str = None,
        inst_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求流水号(必填),调用方保证每次请求号唯一，受理方用来校验唯一性，同一受理号返回请求结果一致
        self.biz_request_id = biz_request_id
        # 信贷用户的纳税人识别号或者身份证号
        self.identity_id = identity_id
        # 授权类型
        self.auth_type = auth_type
        # 授权订单号
        self.order_no = order_no
        # 机构编码
        self.inst_code = inst_code

    def validate(self):
        self.validate_required(self.biz_request_id, 'biz_request_id')
        self.validate_required(self.identity_id, 'identity_id')
        self.validate_required(self.auth_type, 'auth_type')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.inst_code, 'inst_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_request_id is not None:
            result['biz_request_id'] = self.biz_request_id
        if self.identity_id is not None:
            result['identity_id'] = self.identity_id
        if self.auth_type is not None:
            result['auth_type'] = self.auth_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.inst_code is not None:
            result['inst_code'] = self.inst_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_request_id') is not None:
            self.biz_request_id = m.get('biz_request_id')
        if m.get('identity_id') is not None:
            self.identity_id = m.get('identity_id')
        if m.get('auth_type') is not None:
            self.auth_type = m.get('auth_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('inst_code') is not None:
            self.inst_code = m.get('inst_code')
        return self


class QueryBlockchainTaxRiskEvaluationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        query_time: str = None,
        null_data_flag: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # unix秒时间戳,查询时间，用来对账使用
        self.query_time = query_time
        # 是否查的，空数据标识
        self.null_data_flag = null_data_flag

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
        if self.query_time is not None:
            result['query_time'] = self.query_time
        if self.null_data_flag is not None:
            result['null_data_flag'] = self.null_data_flag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('query_time') is not None:
            self.query_time = m.get('query_time')
        if m.get('null_data_flag') is not None:
            self.null_data_flag = m.get('null_data_flag')
        return self


class SyncBlockchainTaxRiskEvaluationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_request_id: str = None,
        identity_id: str = None,
        auth_type: str = None,
        order_no: str = None,
        inst_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求流水号(必填),调用方保证每次请求号唯一，受理方用来校验唯一性，同一受理号返回请求结果一致
        self.biz_request_id = biz_request_id
        # 信贷用户的纳税人识别号或者身份证号
        self.identity_id = identity_id
        # 授权类型
        self.auth_type = auth_type
        # 授权订单号
        self.order_no = order_no
        # 机构编码
        self.inst_code = inst_code

    def validate(self):
        self.validate_required(self.biz_request_id, 'biz_request_id')
        self.validate_required(self.identity_id, 'identity_id')
        self.validate_required(self.auth_type, 'auth_type')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.inst_code, 'inst_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_request_id is not None:
            result['biz_request_id'] = self.biz_request_id
        if self.identity_id is not None:
            result['identity_id'] = self.identity_id
        if self.auth_type is not None:
            result['auth_type'] = self.auth_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.inst_code is not None:
            result['inst_code'] = self.inst_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_request_id') is not None:
            self.biz_request_id = m.get('biz_request_id')
        if m.get('identity_id') is not None:
            self.identity_id = m.get('identity_id')
        if m.get('auth_type') is not None:
            self.auth_type = m.get('auth_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('inst_code') is not None:
            self.inst_code = m.get('inst_code')
        return self


class SyncBlockchainTaxRiskEvaluationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        query_time: str = None,
        biz_content: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 1322324243	unix秒时间戳,查询时间，用来对账使用
        self.query_time = query_time
        # 内容，List<JsonObject>
        self.biz_content = biz_content

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
        if self.query_time is not None:
            result['query_time'] = self.query_time
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('query_time') is not None:
            self.query_time = m.get('query_time')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class StartBlockchainTaxRiskEvaluationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        identity_id: str = None,
        identity_name: str = None,
        enterprise_id: str = None,
        enterprise_name: str = None,
        identity_type: str = None,
        auth_type: str = None,
        order_no: str = None,
        biz_request_id: str = None,
        sub_tenant: str = None,
        extend_info: RiskEvaluationExtendInfoRequest = None,
        search_model: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 个人身份证号
        self.identity_id = identity_id
        # 个人姓名
        self.identity_name = identity_name
        # 企业的统一社会信用编码
        self.enterprise_id = enterprise_id
        # 某某某公司
        self.enterprise_name = enterprise_name
        # 企业或者个人企业：ENTERPRISE 个人：PERSONAL
        self.identity_type = identity_type
        # 101
        self.auth_type = auth_type
        # 授权订单号
        self.order_no = order_no
        # 请求流水号(必填),调用 方保证每次请求号唯   一，受理方用来校验唯 一性，同一受理号返回 请求结果一致
        self.biz_request_id = biz_request_id
        # 子渠道渠道编码，需要同步蚂蚁，由蚂蚁设置。如果是银行本身，可不填 备注：如果同一信贷客户在不同银行的调用需要严格区分，分别授权
        self.sub_tenant = sub_tenant
        # 扩展信息
        self.extend_info = extend_info
        # 查询模式，SINGLE_CITY 查到第一个城市就结束，ALL_CITY 查询所有城市，默认ALL_CITY
        self.search_model = search_model

    def validate(self):
        self.validate_required(self.identity_id, 'identity_id')
        self.validate_required(self.identity_type, 'identity_type')
        self.validate_required(self.auth_type, 'auth_type')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.biz_request_id, 'biz_request_id')
        self.validate_required(self.sub_tenant, 'sub_tenant')
        self.validate_required(self.extend_info, 'extend_info')
        if self.extend_info:
            self.extend_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.identity_id is not None:
            result['identity_id'] = self.identity_id
        if self.identity_name is not None:
            result['identity_name'] = self.identity_name
        if self.enterprise_id is not None:
            result['enterprise_id'] = self.enterprise_id
        if self.enterprise_name is not None:
            result['enterprise_name'] = self.enterprise_name
        if self.identity_type is not None:
            result['identity_type'] = self.identity_type
        if self.auth_type is not None:
            result['auth_type'] = self.auth_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.biz_request_id is not None:
            result['biz_request_id'] = self.biz_request_id
        if self.sub_tenant is not None:
            result['sub_tenant'] = self.sub_tenant
        if self.extend_info is not None:
            result['extend_info'] = self.extend_info.to_map()
        if self.search_model is not None:
            result['search_model'] = self.search_model
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('identity_id') is not None:
            self.identity_id = m.get('identity_id')
        if m.get('identity_name') is not None:
            self.identity_name = m.get('identity_name')
        if m.get('enterprise_id') is not None:
            self.enterprise_id = m.get('enterprise_id')
        if m.get('enterprise_name') is not None:
            self.enterprise_name = m.get('enterprise_name')
        if m.get('identity_type') is not None:
            self.identity_type = m.get('identity_type')
        if m.get('auth_type') is not None:
            self.auth_type = m.get('auth_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('biz_request_id') is not None:
            self.biz_request_id = m.get('biz_request_id')
        if m.get('sub_tenant') is not None:
            self.sub_tenant = m.get('sub_tenant')
        if m.get('extend_info') is not None:
            temp_model = RiskEvaluationExtendInfoRequest()
            self.extend_info = temp_model.from_map(m['extend_info'])
        if m.get('search_model') is not None:
            self.search_model = m.get('search_model')
        return self


class StartBlockchainTaxRiskEvaluationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_no: str = None,
        auth_success: str = None,
        expire_time: int = None,
        auth_time: int = None,
        predict_prov_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权订单订单号
        self.order_no = order_no
        # 是否授权成功true是，false否
        self.auth_success = auth_success
        # 过期时间，unix时间戳 毫秒
        self.expire_time = expire_time
        # 授权时间，unix时间戳 毫秒
        self.auth_time = auth_time
        # 预测的常驻省份
        self.predict_prov_code = predict_prov_code

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
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.auth_success is not None:
            result['auth_success'] = self.auth_success
        if self.expire_time is not None:
            result['expire_time'] = self.expire_time
        if self.auth_time is not None:
            result['auth_time'] = self.auth_time
        if self.predict_prov_code is not None:
            result['predict_prov_code'] = self.predict_prov_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('auth_success') is not None:
            self.auth_success = m.get('auth_success')
        if m.get('expire_time') is not None:
            self.expire_time = m.get('expire_time')
        if m.get('auth_time') is not None:
            self.auth_time = m.get('auth_time')
        if m.get('predict_prov_code') is not None:
            self.predict_prov_code = m.get('predict_prov_code')
        return self


