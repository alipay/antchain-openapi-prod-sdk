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


class ALiYunPagination(TeaModel):
    def __init__(
        self,
        page_size: int = None,
        page_number: int = None,
        total_count: int = None,
    ):
        # 分页大小
        self.page_size = page_size
        # 分页编号
        self.page_number = page_number
        # 总数大小
        self.total_count = total_count

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class ALiYunCertificateApplication(TeaModel):
    def __init__(
        self,
        ant_chain_id: str = None,
        bid: str = None,
        createtime: int = None,
        status: str = None,
        updatetime: int = None,
        username: str = None,
    ):
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # bid
        self.bid = bid
        # createtime
        self.createtime = createtime
        # status
        self.status = status
        # updatetime
        self.updatetime = updatetime
        # username
        self.username = username

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.bid is not None:
            result['bid'] = self.bid
        if self.createtime is not None:
            result['createtime'] = self.createtime
        if self.status is not None:
            result['status'] = self.status
        if self.updatetime is not None:
            result['updatetime'] = self.updatetime
        if self.username is not None:
            result['username'] = self.username
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('bid') is not None:
            self.bid = m.get('bid')
        if m.get('createtime') is not None:
            self.createtime = m.get('createtime')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('updatetime') is not None:
            self.updatetime = m.get('updatetime')
        if m.get('username') is not None:
            self.username = m.get('username')
        return self


class ALiYunDownloadPath(TeaModel):
    def __init__(
        self,
        ca_crt_url: str = None,
        client_crt_url: str = None,
        sdk_url: str = None,
        trust_ca_url: str = None,
    ):
        # ca_crt_url
        self.ca_crt_url = ca_crt_url
        # client_crt_url
        self.client_crt_url = client_crt_url
        # sdk_url
        self.sdk_url = sdk_url
        # trust_ca_url
        self.trust_ca_url = trust_ca_url

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ca_crt_url is not None:
            result['ca_crt_url'] = self.ca_crt_url
        if self.client_crt_url is not None:
            result['client_crt_url'] = self.client_crt_url
        if self.sdk_url is not None:
            result['sdk_url'] = self.sdk_url
        if self.trust_ca_url is not None:
            result['trust_ca_url'] = self.trust_ca_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ca_crt_url') is not None:
            self.ca_crt_url = m.get('ca_crt_url')
        if m.get('client_crt_url') is not None:
            self.client_crt_url = m.get('client_crt_url')
        if m.get('sdk_url') is not None:
            self.sdk_url = m.get('sdk_url')
        if m.get('trust_ca_url') is not None:
            self.trust_ca_url = m.get('trust_ca_url')
        return self


class ALiYunChainDownload(TeaModel):
    def __init__(
        self,
        download_path: ALiYunDownloadPath = None,
        private_key: str = None,
    ):
        # download_path
        self.download_path = download_path
        # private_key
        self.private_key = private_key

    def validate(self):
        if self.download_path:
            self.download_path.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.download_path is not None:
            result['download_path'] = self.download_path.to_map()
        if self.private_key is not None:
            result['private_key'] = self.private_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('download_path') is not None:
            temp_model = ALiYunDownloadPath()
            self.download_path = temp_model.from_map(m['download_path'])
        if m.get('private_key') is not None:
            self.private_key = m.get('private_key')
        return self


class ALiYunCertificateApplications(TeaModel):
    def __init__(
        self,
        certificate_applications: List[ALiYunCertificateApplication] = None,
        pagination: ALiYunPagination = None,
    ):
        # certificate_application
        self.certificate_applications = certificate_applications
        # pagination
        self.pagination = pagination

    def validate(self):
        if self.certificate_applications:
            for k in self.certificate_applications:
                if k:
                    k.validate()
        if self.pagination:
            self.pagination.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['certificate_applications'] = []
        if self.certificate_applications is not None:
            for k in self.certificate_applications:
                result['certificate_applications'].append(k.to_map() if k else None)
        if self.pagination is not None:
            result['pagination'] = self.pagination.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.certificate_applications = []
        if m.get('certificate_applications') is not None:
            for k in m.get('certificate_applications'):
                temp_model = ALiYunCertificateApplication()
                self.certificate_applications.append(temp_model.from_map(k))
        if m.get('pagination') is not None:
            temp_model = ALiYunPagination()
            self.pagination = temp_model.from_map(m['pagination'])
        return self


class ApplyBaasChainCertAntRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ant_chain_id: str = None,
        common_name: str = None,
        consortium_id: str = None,
        country_name: str = None,
        locality_name: str = None,
        organization_name: str = None,
        organization_unit_name: str = None,
        password: str = None,
        region_id: str = None,
        state_or_province_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # common_name
        self.common_name = common_name
        # consortium_id
        self.consortium_id = consortium_id
        # country_name
        self.country_name = country_name
        # locality_name
        self.locality_name = locality_name
        # organization_name
        self.organization_name = organization_name
        # organization_unit_name
        self.organization_unit_name = organization_unit_name
        # password
        self.password = password
        # region_id
        self.region_id = region_id
        # state_or_province_name
        self.state_or_province_name = state_or_province_name

    def validate(self):
        self.validate_required(self.ant_chain_id, 'ant_chain_id')
        self.validate_required(self.common_name, 'common_name')
        self.validate_required(self.consortium_id, 'consortium_id')
        self.validate_required(self.country_name, 'country_name')
        self.validate_required(self.locality_name, 'locality_name')
        self.validate_required(self.organization_name, 'organization_name')
        self.validate_required(self.organization_unit_name, 'organization_unit_name')
        self.validate_required(self.password, 'password')
        self.validate_required(self.state_or_province_name, 'state_or_province_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.common_name is not None:
            result['common_name'] = self.common_name
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        if self.country_name is not None:
            result['country_name'] = self.country_name
        if self.locality_name is not None:
            result['locality_name'] = self.locality_name
        if self.organization_name is not None:
            result['organization_name'] = self.organization_name
        if self.organization_unit_name is not None:
            result['organization_unit_name'] = self.organization_unit_name
        if self.password is not None:
            result['password'] = self.password
        if self.region_id is not None:
            result['region_id'] = self.region_id
        if self.state_or_province_name is not None:
            result['state_or_province_name'] = self.state_or_province_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('common_name') is not None:
            self.common_name = m.get('common_name')
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        if m.get('country_name') is not None:
            self.country_name = m.get('country_name')
        if m.get('locality_name') is not None:
            self.locality_name = m.get('locality_name')
        if m.get('organization_name') is not None:
            self.organization_name = m.get('organization_name')
        if m.get('organization_unit_name') is not None:
            self.organization_unit_name = m.get('organization_unit_name')
        if m.get('password') is not None:
            self.password = m.get('password')
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        if m.get('state_or_province_name') is not None:
            self.state_or_province_name = m.get('state_or_province_name')
        return self


class ApplyBaasChainCertAntResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ALiYunChainDownload = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # result
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

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
            result['result'] = self.result.to_map()
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
            temp_model = ALiYunChainDownload()
            self.result = temp_model.from_map(m['result'])
        return self


class CreateBaasChainCertAntRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ant_chain_id: str = None,
        region_id: str = None,
        upload_req: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # region_id
        self.region_id = region_id
        # upload_req
        self.upload_req = upload_req

    def validate(self):
        self.validate_required(self.ant_chain_id, 'ant_chain_id')
        self.validate_required(self.upload_req, 'upload_req')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.region_id is not None:
            result['region_id'] = self.region_id
        if self.upload_req is not None:
            result['upload_req'] = self.upload_req
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        if m.get('upload_req') is not None:
            self.upload_req = m.get('upload_req')
        return self


class CreateBaasChainCertAntResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # result
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


class DownloadBaasChainCertAntRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ant_chain_id: str = None,
        region_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # region_id
        self.region_id = region_id

    def validate(self):
        self.validate_required(self.ant_chain_id, 'ant_chain_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.region_id is not None:
            result['region_id'] = self.region_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        return self


class DownloadBaasChainCertAntResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ALiYunDownloadPath = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # result
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

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
            result['result'] = self.result.to_map()
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
            temp_model = ALiYunDownloadPath()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryBaasChainCertAntRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ant_chain_id: str = None,
        page_number: int = None,
        page_size: int = None,
        region_id: str = None,
        status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # page_number
        self.page_number = page_number
        # page_size
        self.page_size = page_size
        # region_id
        self.region_id = region_id
        # status
        self.status = status

    def validate(self):
        self.validate_required(self.ant_chain_id, 'ant_chain_id')
        self.validate_required(self.page_number, 'page_number')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.region_id is not None:
            result['region_id'] = self.region_id
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class QueryBaasChainCertAntResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ALiYunCertificateApplications = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # result
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

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
            result['result'] = self.result.to_map()
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
            temp_model = ALiYunCertificateApplications()
            self.result = temp_model.from_map(m['result'])
        return self


class ReinitBaasChainCertAntRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ant_chain_id: str = None,
        region_id: str = None,
        username: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # region_id
        self.region_id = region_id
        # username
        self.username = username

    def validate(self):
        self.validate_required(self.ant_chain_id, 'ant_chain_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.region_id is not None:
            result['region_id'] = self.region_id
        if self.username is not None:
            result['username'] = self.username
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        if m.get('username') is not None:
            self.username = m.get('username')
        return self


class ReinitBaasChainCertAntResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # result
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


