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


class CategoryVO(TeaModel):
    def __init__(
        self,
        id: int = None,
        site_id: int = None,
        site: str = None,
        language: str = None,
        title: str = None,
        type: int = None,
        show_type: int = None,
        sort: int = None,
        level: int = None,
        ext_id: str = None,
        parent_id: str = None,
        source_type: int = None,
        version: str = None,
        catalogue_type: int = None,
    ):
        # 内部id
        self.id = id
        # 内容库id
        self.site_id = site_id
        # 站点
        self.site = site
        # language
        self.language = language
        # title
        self.title = title
        # 类型
        self.type = type
        # 展示类型 1为左侧展示2为列表展示
        self.show_type = show_type
        # 排序
        self.sort = sort
        # 目录层级
        self.level = level
        # 外标id
        self.ext_id = ext_id
        # 父id
        self.parent_id = parent_id
        # 来源类型
        self.source_type = source_type
        # 版本
        self.version = version
        # 语雀目录有无数据判定
        self.catalogue_type = catalogue_type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.site_id is not None:
            result['site_id'] = self.site_id
        if self.site is not None:
            result['site'] = self.site
        if self.language is not None:
            result['language'] = self.language
        if self.title is not None:
            result['title'] = self.title
        if self.type is not None:
            result['type'] = self.type
        if self.show_type is not None:
            result['show_type'] = self.show_type
        if self.sort is not None:
            result['sort'] = self.sort
        if self.level is not None:
            result['level'] = self.level
        if self.ext_id is not None:
            result['ext_id'] = self.ext_id
        if self.parent_id is not None:
            result['parent_id'] = self.parent_id
        if self.source_type is not None:
            result['source_type'] = self.source_type
        if self.version is not None:
            result['version'] = self.version
        if self.catalogue_type is not None:
            result['catalogue_type'] = self.catalogue_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('site_id') is not None:
            self.site_id = m.get('site_id')
        if m.get('site') is not None:
            self.site = m.get('site')
        if m.get('language') is not None:
            self.language = m.get('language')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('show_type') is not None:
            self.show_type = m.get('show_type')
        if m.get('sort') is not None:
            self.sort = m.get('sort')
        if m.get('level') is not None:
            self.level = m.get('level')
        if m.get('ext_id') is not None:
            self.ext_id = m.get('ext_id')
        if m.get('parent_id') is not None:
            self.parent_id = m.get('parent_id')
        if m.get('source_type') is not None:
            self.source_type = m.get('source_type')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('catalogue_type') is not None:
            self.catalogue_type = m.get('catalogue_type')
        return self


class NoviceMustSee(TeaModel):
    def __init__(
        self,
        novice_must_see_explain: str = None,
        novice_must_see_title_1: str = None,
        novice_must_see_address_1: str = None,
        novice_must_see_title_2: str = None,
        novice_must_see_address_2: str = None,
        novice_must_see_title_3: str = None,
        novice_must_see_address_3: str = None,
    ):
        # novice_must_see_explain
        self.novice_must_see_explain = novice_must_see_explain
        # novice_must_see_title1
        self.novice_must_see_title_1 = novice_must_see_title_1
        # novice_must_see_address1
        self.novice_must_see_address_1 = novice_must_see_address_1
        # novice_must_see_title2
        self.novice_must_see_title_2 = novice_must_see_title_2
        # novice_must_see_address2
        self.novice_must_see_address_2 = novice_must_see_address_2
        # novice_must_see_title3
        self.novice_must_see_title_3 = novice_must_see_title_3
        # novice_must_see_address3
        self.novice_must_see_address_3 = novice_must_see_address_3

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.novice_must_see_explain is not None:
            result['novice_must_see_explain'] = self.novice_must_see_explain
        if self.novice_must_see_title_1 is not None:
            result['novice_must_see_title1'] = self.novice_must_see_title_1
        if self.novice_must_see_address_1 is not None:
            result['novice_must_see_address1'] = self.novice_must_see_address_1
        if self.novice_must_see_title_2 is not None:
            result['novice_must_see_title2'] = self.novice_must_see_title_2
        if self.novice_must_see_address_2 is not None:
            result['novice_must_see_address2'] = self.novice_must_see_address_2
        if self.novice_must_see_title_3 is not None:
            result['novice_must_see_title3'] = self.novice_must_see_title_3
        if self.novice_must_see_address_3 is not None:
            result['novice_must_see_address3'] = self.novice_must_see_address_3
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('novice_must_see_explain') is not None:
            self.novice_must_see_explain = m.get('novice_must_see_explain')
        if m.get('novice_must_see_title1') is not None:
            self.novice_must_see_title_1 = m.get('novice_must_see_title1')
        if m.get('novice_must_see_address1') is not None:
            self.novice_must_see_address_1 = m.get('novice_must_see_address1')
        if m.get('novice_must_see_title2') is not None:
            self.novice_must_see_title_2 = m.get('novice_must_see_title2')
        if m.get('novice_must_see_address2') is not None:
            self.novice_must_see_address_2 = m.get('novice_must_see_address2')
        if m.get('novice_must_see_title3') is not None:
            self.novice_must_see_title_3 = m.get('novice_must_see_title3')
        if m.get('novice_must_see_address3') is not None:
            self.novice_must_see_address_3 = m.get('novice_must_see_address3')
        return self


class CorporateContacts(TeaModel):
    def __init__(
        self,
        job_title: str = None,
        real_name: str = None,
        mobile_phone: str = None,
        email: str = None,
    ):
        # 职务
        self.job_title = job_title
        # 姓名
        self.real_name = real_name
        # 电话
        self.mobile_phone = mobile_phone
        # 邮箱
        self.email = email

    def validate(self):
        self.validate_required(self.real_name, 'real_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.job_title is not None:
            result['job_title'] = self.job_title
        if self.real_name is not None:
            result['real_name'] = self.real_name
        if self.mobile_phone is not None:
            result['mobile_phone'] = self.mobile_phone
        if self.email is not None:
            result['email'] = self.email
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('job_title') is not None:
            self.job_title = m.get('job_title')
        if m.get('real_name') is not None:
            self.real_name = m.get('real_name')
        if m.get('mobile_phone') is not None:
            self.mobile_phone = m.get('mobile_phone')
        if m.get('email') is not None:
            self.email = m.get('email')
        return self


class PopularDocument(TeaModel):
    def __init__(
        self,
        popular_document_title: str = None,
        popular_document_id: str = None,
        popular_document_info: str = None,
        children: List[CategoryVO] = None,
    ):
        # popular_document_title
        self.popular_document_title = popular_document_title
        # popular_document_id
        self.popular_document_id = popular_document_id
        # popular_document_info
        self.popular_document_info = popular_document_info
        # children
        self.children = children

    def validate(self):
        self.validate_required(self.children, 'children')
        if self.children:
            for k in self.children:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.popular_document_title is not None:
            result['popular_document_title'] = self.popular_document_title
        if self.popular_document_id is not None:
            result['popular_document_id'] = self.popular_document_id
        if self.popular_document_info is not None:
            result['popular_document_info'] = self.popular_document_info
        result['children'] = []
        if self.children is not None:
            for k in self.children:
                result['children'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('popular_document_title') is not None:
            self.popular_document_title = m.get('popular_document_title')
        if m.get('popular_document_id') is not None:
            self.popular_document_id = m.get('popular_document_id')
        if m.get('popular_document_info') is not None:
            self.popular_document_info = m.get('popular_document_info')
        self.children = []
        if m.get('children') is not None:
            for k in m.get('children'):
                temp_model = CategoryVO()
                self.children.append(temp_model.from_map(k))
        return self


class BusinessRequest(TeaModel):
    def __init__(
        self,
        customer_name: str = None,
        customer_id: str = None,
        business_name: str = None,
        business_id: str = None,
        business_status: str = None,
        business_explain: str = None,
        source: str = None,
        business_date: str = None,
        tenant: str = None,
        creator: str = None,
        creator_nick: str = None,
    ):
        # 客户名称
        self.customer_name = customer_name
        # 客户id
        self.customer_id = customer_id
        # 商机名称
        self.business_name = business_name
        # 商机ID
        self.business_id = business_id
        # 未开通(INIT)/开通中(OPENING/已开通(OPEN)/使用中(USING)/闲置中(IDLE)/已关闭(CLOSE)
        self.business_status = business_status
        # 商机说明
        self.business_explain = business_explain
        # 线索来源
        self.source = source
        # 商机时间
        self.business_date = business_date
        # 租户
        self.tenant = tenant
        # 创建人工号
        self.creator = creator
        # 创建人花名
        self.creator_nick = creator_nick

    def validate(self):
        self.validate_required(self.customer_name, 'customer_name')
        self.validate_required(self.customer_id, 'customer_id')
        self.validate_required(self.business_name, 'business_name')
        self.validate_required(self.business_id, 'business_id')
        self.validate_required(self.business_status, 'business_status')
        self.validate_required(self.source, 'source')
        self.validate_required(self.business_date, 'business_date')
        if self.business_date is not None:
            self.validate_pattern(self.business_date, 'business_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.tenant, 'tenant')
        self.validate_required(self.creator, 'creator')
        self.validate_required(self.creator_nick, 'creator_nick')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.customer_name is not None:
            result['customer_name'] = self.customer_name
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.business_name is not None:
            result['business_name'] = self.business_name
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.business_status is not None:
            result['business_status'] = self.business_status
        if self.business_explain is not None:
            result['business_explain'] = self.business_explain
        if self.source is not None:
            result['source'] = self.source
        if self.business_date is not None:
            result['business_date'] = self.business_date
        if self.tenant is not None:
            result['tenant'] = self.tenant
        if self.creator is not None:
            result['creator'] = self.creator
        if self.creator_nick is not None:
            result['creator_nick'] = self.creator_nick
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('customer_name') is not None:
            self.customer_name = m.get('customer_name')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('business_name') is not None:
            self.business_name = m.get('business_name')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('business_status') is not None:
            self.business_status = m.get('business_status')
        if m.get('business_explain') is not None:
            self.business_explain = m.get('business_explain')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('business_date') is not None:
            self.business_date = m.get('business_date')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        if m.get('creator') is not None:
            self.creator = m.get('creator')
        if m.get('creator_nick') is not None:
            self.creator_nick = m.get('creator_nick')
        return self


class Attachment(TeaModel):
    def __init__(
        self,
        file_id: str = None,
        filename: str = None,
        url: str = None,
    ):
        # 文件唯一标识，作为幂等字段
        self.file_id = file_id
        # 文件名称，用作展示
        self.filename = filename
        # 访问地址
        self.url = url

    def validate(self):
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.url, 'url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.filename is not None:
            result['filename'] = self.filename
        if self.url is not None:
            result['url'] = self.url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('filename') is not None:
            self.filename = m.get('filename')
        if m.get('url') is not None:
            self.url = m.get('url')
        return self


class PageContext(TeaModel):
    def __init__(
        self,
        page_id: str = None,
        page_title: str = None,
    ):
        # 页面di
        self.page_id = page_id
        # 页面标题
        self.page_title = page_title

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_id is not None:
            result['page_id'] = self.page_id
        if self.page_title is not None:
            result['page_title'] = self.page_title
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_id') is not None:
            self.page_id = m.get('page_id')
        if m.get('page_title') is not None:
            self.page_title = m.get('page_title')
        return self


class Asset(TeaModel):
    def __init__(
        self,
        asset_id: str = None,
        status: str = None,
        asset_info: str = None,
    ):
        # 资产标识，作为幂等单号
        self.asset_id = asset_id
        # VALID - 生效；INVALID - 作废
        self.status = status
        # 资产详情，自定义展示
        self.asset_info = asset_info

    def validate(self):
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.status, 'status')
        self.validate_required(self.asset_info, 'asset_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.status is not None:
            result['status'] = self.status
        if self.asset_info is not None:
            result['asset_info'] = self.asset_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('asset_info') is not None:
            self.asset_info = m.get('asset_info')
        return self


class CategoryLocalVO(TeaModel):
    def __init__(
        self,
        id: int = None,
        site_id: int = None,
        title: str = None,
        type: int = None,
        sort: int = None,
        level: int = None,
        parent_id: str = None,
        source_type: int = None,
        show_type: int = None,
        ext_id: str = None,
        shie_id: int = None,
        status: int = None,
        deleted: int = None,
        tree: str = None,
        green: int = None,
        site_code: str = None,
        created_time: str = None,
        modified_time: str = None,
        is_catalogue: bool = None,
    ):
        # id
        self.id = id
        # siteId
        self.site_id = site_id
        # title
        self.title = title
        # type
        self.type = type
        # sort
        self.sort = sort
        # level
        self.level = level
        # parent_id
        self.parent_id = parent_id
        # sourceType
        self.source_type = source_type
        # show_type
        self.show_type = show_type
        # ext_id
        self.ext_id = ext_id
        # shield
        self.shie_id = shie_id
        # status
        self.status = status
        # deleted
        self.deleted = deleted
        # tree
        self.tree = tree
        # green
        self.green = green
        # site_code
        self.site_code = site_code
        # created_time
        self.created_time = created_time
        # modified_time
        self.modified_time = modified_time
        # isCatalogue
        self.is_catalogue = is_catalogue

    def validate(self):
        if self.created_time is not None:
            self.validate_pattern(self.created_time, 'created_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.modified_time is not None:
            self.validate_pattern(self.modified_time, 'modified_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.site_id is not None:
            result['site_id'] = self.site_id
        if self.title is not None:
            result['title'] = self.title
        if self.type is not None:
            result['type'] = self.type
        if self.sort is not None:
            result['sort'] = self.sort
        if self.level is not None:
            result['level'] = self.level
        if self.parent_id is not None:
            result['parent_id'] = self.parent_id
        if self.source_type is not None:
            result['source_type'] = self.source_type
        if self.show_type is not None:
            result['show_type'] = self.show_type
        if self.ext_id is not None:
            result['ext_id'] = self.ext_id
        if self.shie_id is not None:
            result['shie_id'] = self.shie_id
        if self.status is not None:
            result['status'] = self.status
        if self.deleted is not None:
            result['deleted'] = self.deleted
        if self.tree is not None:
            result['tree'] = self.tree
        if self.green is not None:
            result['green'] = self.green
        if self.site_code is not None:
            result['site_code'] = self.site_code
        if self.created_time is not None:
            result['created_time'] = self.created_time
        if self.modified_time is not None:
            result['modified_time'] = self.modified_time
        if self.is_catalogue is not None:
            result['is_catalogue'] = self.is_catalogue
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('site_id') is not None:
            self.site_id = m.get('site_id')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('sort') is not None:
            self.sort = m.get('sort')
        if m.get('level') is not None:
            self.level = m.get('level')
        if m.get('parent_id') is not None:
            self.parent_id = m.get('parent_id')
        if m.get('source_type') is not None:
            self.source_type = m.get('source_type')
        if m.get('show_type') is not None:
            self.show_type = m.get('show_type')
        if m.get('ext_id') is not None:
            self.ext_id = m.get('ext_id')
        if m.get('shie_id') is not None:
            self.shie_id = m.get('shie_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('deleted') is not None:
            self.deleted = m.get('deleted')
        if m.get('tree') is not None:
            self.tree = m.get('tree')
        if m.get('green') is not None:
            self.green = m.get('green')
        if m.get('site_code') is not None:
            self.site_code = m.get('site_code')
        if m.get('created_time') is not None:
            self.created_time = m.get('created_time')
        if m.get('modified_time') is not None:
            self.modified_time = m.get('modified_time')
        if m.get('is_catalogue') is not None:
            self.is_catalogue = m.get('is_catalogue')
        return self


class ClueInformationReq(TeaModel):
    def __init__(
        self,
        title: str = None,
        status: str = None,
        created_user_nick: str = None,
        description: str = None,
        customer_name: str = None,
        biz_line: str = None,
        customer_location: str = None,
        corporate_contacts: List[CorporateContacts] = None,
        customer_industry: str = None,
        revenue_scale: str = None,
        social_credit_code: str = None,
        source: str = None,
        customer_id: str = None,
        tenant: str = None,
    ):
        # 线索标题
        self.title = title
        # 线索跟进状态   INIT:待确认 CONTACTED:跟进中 CLOSED:线索终止 TRANSFER:已转交 BUSINESS:转商机
        self.status = status
        # 线索跟进人  工号
        self.created_user_nick = created_user_nick
        # 线索描述
        self.description = description
        # 客户名称
        self.customer_name = customer_name
        # 业务线
        self.biz_line = biz_line
        # 客户地址
        self.customer_location = customer_location
        # 公司联系人
        self.corporate_contacts = corporate_contacts
        # 客户所在行业
        self.customer_industry = customer_industry
        # 客户营收规模
        self.revenue_scale = revenue_scale
        # 社会信用代码
        self.social_credit_code = social_credit_code
        # 线索来源
        self.source = source
        # 客户ID
        self.customer_id = customer_id
        # 多租户模型。线索服务化的租户模型。请联系线索服务管理员提供。固定值。
        self.tenant = tenant

    def validate(self):
        self.validate_required(self.title, 'title')
        self.validate_required(self.status, 'status')
        self.validate_required(self.created_user_nick, 'created_user_nick')
        self.validate_required(self.description, 'description')
        self.validate_required(self.customer_name, 'customer_name')
        self.validate_required(self.biz_line, 'biz_line')
        self.validate_required(self.customer_location, 'customer_location')
        if self.corporate_contacts:
            for k in self.corporate_contacts:
                if k:
                    k.validate()
        self.validate_required(self.customer_industry, 'customer_industry')
        self.validate_required(self.source, 'source')
        self.validate_required(self.tenant, 'tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.title is not None:
            result['title'] = self.title
        if self.status is not None:
            result['status'] = self.status
        if self.created_user_nick is not None:
            result['created_user_nick'] = self.created_user_nick
        if self.description is not None:
            result['description'] = self.description
        if self.customer_name is not None:
            result['customer_name'] = self.customer_name
        if self.biz_line is not None:
            result['biz_line'] = self.biz_line
        if self.customer_location is not None:
            result['customer_location'] = self.customer_location
        result['corporate_contacts'] = []
        if self.corporate_contacts is not None:
            for k in self.corporate_contacts:
                result['corporate_contacts'].append(k.to_map() if k else None)
        if self.customer_industry is not None:
            result['customer_industry'] = self.customer_industry
        if self.revenue_scale is not None:
            result['revenue_scale'] = self.revenue_scale
        if self.social_credit_code is not None:
            result['social_credit_code'] = self.social_credit_code
        if self.source is not None:
            result['source'] = self.source
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.tenant is not None:
            result['tenant'] = self.tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('created_user_nick') is not None:
            self.created_user_nick = m.get('created_user_nick')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('customer_name') is not None:
            self.customer_name = m.get('customer_name')
        if m.get('biz_line') is not None:
            self.biz_line = m.get('biz_line')
        if m.get('customer_location') is not None:
            self.customer_location = m.get('customer_location')
        self.corporate_contacts = []
        if m.get('corporate_contacts') is not None:
            for k in m.get('corporate_contacts'):
                temp_model = CorporateContacts()
                self.corporate_contacts.append(temp_model.from_map(k))
        if m.get('customer_industry') is not None:
            self.customer_industry = m.get('customer_industry')
        if m.get('revenue_scale') is not None:
            self.revenue_scale = m.get('revenue_scale')
        if m.get('social_credit_code') is not None:
            self.social_credit_code = m.get('social_credit_code')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        return self


class ContentObjVO(TeaModel):
    def __init__(
        self,
        novice_must_sees: List[NoviceMustSee] = None,
        popular_document: List[PopularDocument] = None,
        product_presentation: str = None,
    ):
        # novice_must_sees
        self.novice_must_sees = novice_must_sees
        # popular_document
        self.popular_document = popular_document
        # product_presentation
        self.product_presentation = product_presentation

    def validate(self):
        if self.novice_must_sees:
            for k in self.novice_must_sees:
                if k:
                    k.validate()
        if self.popular_document:
            for k in self.popular_document:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['novice_must_sees'] = []
        if self.novice_must_sees is not None:
            for k in self.novice_must_sees:
                result['novice_must_sees'].append(k.to_map() if k else None)
        result['popular_document'] = []
        if self.popular_document is not None:
            for k in self.popular_document:
                result['popular_document'].append(k.to_map() if k else None)
        if self.product_presentation is not None:
            result['product_presentation'] = self.product_presentation
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.novice_must_sees = []
        if m.get('novice_must_sees') is not None:
            for k in m.get('novice_must_sees'):
                temp_model = NoviceMustSee()
                self.novice_must_sees.append(temp_model.from_map(k))
        self.popular_document = []
        if m.get('popular_document') is not None:
            for k in m.get('popular_document'):
                temp_model = PopularDocument()
                self.popular_document.append(temp_model.from_map(k))
        if m.get('product_presentation') is not None:
            self.product_presentation = m.get('product_presentation')
        return self


class Coupon(TeaModel):
    def __init__(
        self,
        id: int = None,
        display_name: str = None,
        name: str = None,
        type: str = None,
        amount: str = None,
        used_amount: str = None,
        status: str = None,
        start_time: str = None,
        end_time: str = None,
        youhui_template_id: int = None,
        discount_rate: str = None,
        full_amount: str = None,
        usage_count: int = None,
        used_count: int = None,
        product_list: str = None,
        order_type_list: str = None,
        currency: str = None,
        high_precision_amount: str = None,
        high_precision_used_amount: str = None,
        high_precision_available_amount: str = None,
    ):
        # 优惠券ID
        self.id = id
        # 优惠券名称,前端展示
        self.display_name = display_name
        # 优惠券模板名称
        self.name = name
        # 优惠券类型，VOUCHER：抵用券;CERTAIN：满减券；DISCOUNT：折扣券
        self.type = type
        # 优惠券总金额，单位（分）。可使用优惠金额为amount-used_amount
        self.amount = amount
        # 已使用金额，单位（分）。
        self.used_amount = used_amount
        # 状态，AVAILABLE-有效/EXPIRED-已过期/EXHAUSTED-已用完/ABANDONED-已作废
        self.status = status
        # 有效期开始时间
        self.start_time = start_time
        # 有效期结束时间
        self.end_time = end_time
        # 模板id
        self.youhui_template_id = youhui_template_id
        # 优惠券=折扣券时使用，如0.75
        self.discount_rate = discount_rate
        # 优惠券类型=满减券时使用，如满2000元
        self.full_amount = full_amount
        # 可以使用的总次数
        self.usage_count = usage_count
        # 已使用次数（冻结次数）
        self.used_count = used_count
        # 适用产品：通用/ECS/RDS
        self.product_list = product_list
        # 适用订单类型
        self.order_type_list = order_type_list
        # 币种CurrencyCode CNY 代表人民币 USD代表美元
        self.currency = currency
        # 高精度总金额，单位元。可用金额 high_precision_available_amount = 总金额 high_precision_amount - 已使用金额 high_precision_used_amount
        self.high_precision_amount = high_precision_amount
        # 单位元
        self.high_precision_used_amount = high_precision_used_amount
        # 单位元
        self.high_precision_available_amount = high_precision_available_amount

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.display_name, 'display_name')
        self.validate_required(self.name, 'name')
        self.validate_required(self.type, 'type')
        self.validate_required(self.status, 'status')
        self.validate_required(self.start_time, 'start_time')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.end_time, 'end_time')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.youhui_template_id, 'youhui_template_id')
        self.validate_required(self.usage_count, 'usage_count')
        self.validate_required(self.used_count, 'used_count')
        self.validate_required(self.product_list, 'product_list')
        self.validate_required(self.order_type_list, 'order_type_list')
        self.validate_required(self.currency, 'currency')
        self.validate_required(self.high_precision_amount, 'high_precision_amount')
        self.validate_required(self.high_precision_used_amount, 'high_precision_used_amount')
        self.validate_required(self.high_precision_available_amount, 'high_precision_available_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.display_name is not None:
            result['display_name'] = self.display_name
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.amount is not None:
            result['amount'] = self.amount
        if self.used_amount is not None:
            result['used_amount'] = self.used_amount
        if self.status is not None:
            result['status'] = self.status
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.youhui_template_id is not None:
            result['youhui_template_id'] = self.youhui_template_id
        if self.discount_rate is not None:
            result['discount_rate'] = self.discount_rate
        if self.full_amount is not None:
            result['full_amount'] = self.full_amount
        if self.usage_count is not None:
            result['usage_count'] = self.usage_count
        if self.used_count is not None:
            result['used_count'] = self.used_count
        if self.product_list is not None:
            result['product_list'] = self.product_list
        if self.order_type_list is not None:
            result['order_type_list'] = self.order_type_list
        if self.currency is not None:
            result['currency'] = self.currency
        if self.high_precision_amount is not None:
            result['high_precision_amount'] = self.high_precision_amount
        if self.high_precision_used_amount is not None:
            result['high_precision_used_amount'] = self.high_precision_used_amount
        if self.high_precision_available_amount is not None:
            result['high_precision_available_amount'] = self.high_precision_available_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('used_amount') is not None:
            self.used_amount = m.get('used_amount')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('youhui_template_id') is not None:
            self.youhui_template_id = m.get('youhui_template_id')
        if m.get('discount_rate') is not None:
            self.discount_rate = m.get('discount_rate')
        if m.get('full_amount') is not None:
            self.full_amount = m.get('full_amount')
        if m.get('usage_count') is not None:
            self.usage_count = m.get('usage_count')
        if m.get('used_count') is not None:
            self.used_count = m.get('used_count')
        if m.get('product_list') is not None:
            self.product_list = m.get('product_list')
        if m.get('order_type_list') is not None:
            self.order_type_list = m.get('order_type_list')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('high_precision_amount') is not None:
            self.high_precision_amount = m.get('high_precision_amount')
        if m.get('high_precision_used_amount') is not None:
            self.high_precision_used_amount = m.get('high_precision_used_amount')
        if m.get('high_precision_available_amount') is not None:
            self.high_precision_available_amount = m.get('high_precision_available_amount')
        return self


class QueryCouponRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        template_id: str = None,
        scope: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID
        self.tenant_id = tenant_id
        # 优惠券模板ID
        self.template_id = template_id
        # 查询范围，有效：AVAILABLE / 全部: ALL；不传默认查询有效
        self.scope = scope

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_id, 'template_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.scope is not None:
            result['scope'] = self.scope
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('scope') is not None:
            self.scope = m.get('scope')
        return self


class QueryCouponResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        coupon_list: List[Coupon] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 优惠券列表
        self.coupon_list = coupon_list

    def validate(self):
        if self.coupon_list:
            for k in self.coupon_list:
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
        result['coupon_list'] = []
        if self.coupon_list is not None:
            for k in self.coupon_list:
                result['coupon_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.coupon_list = []
        if m.get('coupon_list') is not None:
            for k in m.get('coupon_list'):
                temp_model = Coupon()
                self.coupon_list.append(temp_model.from_map(k))
        return self


class SendCouponRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        biz_no: str = None,
        tenant_id: str = None,
        template_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 外部业务流水号，用于幂等判断
        self.biz_no = biz_no
        # 租户ID
        self.tenant_id = tenant_id
        # 优惠券模板ID，营销后台申请获取
        self.template_id = template_id

    def validate(self):
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_id, 'template_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_id is not None:
            result['template_id'] = self.template_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        return self


class SendCouponResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        coupon_id: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 优惠券id
        self.coupon_id = coupon_id

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
        if self.coupon_id is not None:
            result['coupon_id'] = self.coupon_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('coupon_id') is not None:
            self.coupon_id = m.get('coupon_id')
        return self


class CreateLeadClueRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request: ClueInformationReq = None,
        source: str = None,
        customer_name: str = None,
        tenant_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 补登线索,客户信息
        self.request = request
        # 线索来源
        self.source = source
        # 企业名称
        self.customer_name = customer_name
        # 多租户模型。线索服务化的租户模型。请联系线索服务管理员提供。固定值。
        # tenant+source+customerName唯一确定一条线索。
        self.tenant_name = tenant_name

    def validate(self):
        self.validate_required(self.request, 'request')
        if self.request:
            self.request.validate()
        self.validate_required(self.source, 'source')
        self.validate_required(self.customer_name, 'customer_name')
        self.validate_required(self.tenant_name, 'tenant_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request is not None:
            result['request'] = self.request.to_map()
        if self.source is not None:
            result['source'] = self.source
        if self.customer_name is not None:
            result['customer_name'] = self.customer_name
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request') is not None:
            temp_model = ClueInformationReq()
            self.request = temp_model.from_map(m['request'])
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('customer_name') is not None:
            self.customer_name = m.get('customer_name')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        return self


class CreateLeadClueResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: bool = None,
        customer_id: str = None,
        lead_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 成功与否
        self.result = result
        # 客户id，行业线自己的会员id
        self.customer_id = customer_id
        # 线索id，中台侧线索唯一号
        self.lead_id = lead_id

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
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.lead_id is not None:
            result['lead_id'] = self.lead_id
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
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('lead_id') is not None:
            self.lead_id = m.get('lead_id')
        return self


class AddLeadBusinessRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request: List[BusinessRequest] = None,
        tenant_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 商机信息
        self.request = request
        # 线索服务化，多租户模型
        self.tenant_name = tenant_name

    def validate(self):
        self.validate_required(self.request, 'request')
        if self.request:
            for k in self.request:
                if k:
                    k.validate()
        self.validate_required(self.tenant_name, 'tenant_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        result['request'] = []
        if self.request is not None:
            for k in self.request:
                result['request'].append(k.to_map() if k else None)
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        self.request = []
        if m.get('request') is not None:
            for k in m.get('request'):
                temp_model = BusinessRequest()
                self.request.append(temp_model.from_map(k))
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        return self


class AddLeadBusinessResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: bool = None,
        business_ids: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 
        self.result = result
        # 新增的商机列表。正常情况下会返回新增的商机列表
        self.business_ids = business_ids

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
        if self.business_ids is not None:
            result['business_ids'] = self.business_ids
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
        if m.get('business_ids') is not None:
            self.business_ids = m.get('business_ids')
        return self


class QueryCouponPageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        product_codes: str = None,
        coupon_type: str = None,
        page_no: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID
        self.tenant_id = tenant_id
        # 商品code
        self.product_codes = product_codes
        # 优惠券类型:VOUCHER 抵用券, CERTAIN 满减券,DISCOUNT 折扣券
        # 
        self.coupon_type = coupon_type
        # 当前页，默认第一页
        self.page_no = page_no
        # 每页显示数量，默认10条
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.product_codes, 'product_codes')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.product_codes is not None:
            result['product_codes'] = self.product_codes
        if self.coupon_type is not None:
            result['coupon_type'] = self.coupon_type
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('product_codes') is not None:
            self.product_codes = m.get('product_codes')
        if m.get('coupon_type') is not None:
            self.coupon_type = m.get('coupon_type')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryCouponPageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        coupon_list: List[Coupon] = None,
        current_page: int = None,
        page_size: int = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 优惠券列表
        self.coupon_list = coupon_list
        # 当前页
        self.current_page = current_page
        # 每页显示行数
        self.page_size = page_size
        # 总数量
        self.total_count = total_count

    def validate(self):
        if self.coupon_list:
            for k in self.coupon_list:
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
        result['coupon_list'] = []
        if self.coupon_list is not None:
            for k in self.coupon_list:
                result['coupon_list'].append(k.to_map() if k else None)
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.coupon_list = []
        if m.get('coupon_list') is not None:
            for k in m.get('coupon_list'):
                temp_model = Coupon()
                self.coupon_list.append(temp_model.from_map(k))
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class QueryCouponPagelistRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        product_codes: str = None,
        coupon_type: str = None,
        page_no: int = None,
        page_size: int = None,
        currency: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID
        self.tenant_id = tenant_id
        # 商品code
        # 可多选 多个产品间用 , 分隔  如
        # ABC,DEF,GHI
        self.product_codes = product_codes
        # 优惠券类型:VOUCHER 抵用券, CERTAIN 满减券,DISCOUNT 折扣券
        # 
        self.coupon_type = coupon_type
        # 当前页，默认第一页
        self.page_no = page_no
        # 每页显示数量，默认10条
        # 
        self.page_size = page_size
        # 币种，不传默认CNY人民币。
        self.currency = currency

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.product_codes, 'product_codes')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.product_codes is not None:
            result['product_codes'] = self.product_codes
        if self.coupon_type is not None:
            result['coupon_type'] = self.coupon_type
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.currency is not None:
            result['currency'] = self.currency
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('product_codes') is not None:
            self.product_codes = m.get('product_codes')
        if m.get('coupon_type') is not None:
            self.coupon_type = m.get('coupon_type')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        return self


class QueryCouponPagelistResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        coupon_list: List[Coupon] = None,
        current_page: int = None,
        page_size: int = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 优惠券列表
        self.coupon_list = coupon_list
        # 当前页
        # 
        self.current_page = current_page
        # 每页显示行数
        # 
        self.page_size = page_size
        # 总数量
        # 
        self.total_count = total_count

    def validate(self):
        if self.coupon_list:
            for k in self.coupon_list:
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
        result['coupon_list'] = []
        if self.coupon_list is not None:
            for k in self.coupon_list:
                result['coupon_list'].append(k.to_map() if k else None)
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.coupon_list = []
        if m.get('coupon_list') is not None:
            for k in m.get('coupon_list'):
                temp_model = Coupon()
                self.coupon_list.append(temp_model.from_map(k))
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class QueryYouhuiTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        youhui_template_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 优惠券模板ID
        self.youhui_template_id = youhui_template_id

    def validate(self):
        self.validate_required(self.youhui_template_id, 'youhui_template_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.youhui_template_id is not None:
            result['youhui_template_id'] = self.youhui_template_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('youhui_template_id') is not None:
            self.youhui_template_id = m.get('youhui_template_id')
        return self


class QueryYouhuiTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        t_type: str = None,
        currency: str = None,
        id: int = None,
        t_name: str = None,
        t_use_scene: str = None,
        t_start_time: str = None,
        t_end_time: str = None,
        yh_max_release: str = None,
        yh_type: str = None,
        yh_certain_money: str = None,
        yh_amount: str = None,
        yh_discount_rate: str = None,
        yh_usage_count: str = None,
        yh_validity_type: str = None,
        yh_start_time: str = None,
        yh_end_time: str = None,
        yh_relative_second: int = None,
        yh_per_limit_num: int = None,
        yh_universal_type: str = None,
        t_status: str = None,
        yh_control_type: str = None,
        t_reason: str = None,
        yh_description: str = None,
        t_creator: str = None,
        t_modifier: str = None,
        t_gmt_create: str = None,
        t_gmt_modified: str = None,
        item_code_set: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模板类型:APPLY, NORMAL
        self.t_type = t_type
        # 币种
        self.currency = currency
        # 模板ID
        self.id = id
        # 模板名称
        self.t_name = t_name
        # 使用场景
        self.t_use_scene = t_use_scene
        # 模板开始时间
        self.t_start_time = t_start_time
        # 模板有效结束时间
        self.t_end_time = t_end_time
        # 优惠券允许发放的总数量
        self.yh_max_release = yh_max_release
        # 券类型
        self.yh_type = yh_type
        # 满减条件金额(单位:元)， 如满200
        self.yh_certain_money = yh_certain_money
        # 生成券的面额(单位:元)
        self.yh_amount = yh_amount
        # 折扣， 如: 0.75 取值范围(0, 1)
        self.yh_discount_rate = yh_discount_rate
        # 优惠券使用次数 , 0表示无限制
        self.yh_usage_count = yh_usage_count
        # 相对时间，绝对时间ABSOLUTE/RELATIVE
        self.yh_validity_type = yh_validity_type
        # 优惠券开始时间 yhValidityType=ABSOLUTE 不能为空, 精确到秒
        self.yh_start_time = yh_start_time
        # 有效期结束时间， yhValidityType=ABSOLUTE 不能为空, 精确到秒
        self.yh_end_time = yh_end_time
        # 有效时间——相对（单位秒），如果start_time为空，优惠券的有效期从生成的当天开始计算， 如果start_time不为空，优惠关的有效期从start_time开始算
        self.yh_relative_second = yh_relative_second
        # 每人限领数量
        self.yh_per_limit_num = yh_per_limit_num
        # 优惠券通用类型，UNIVERSAL通用券；NONUNIVERSAL非通用券
        self.yh_universal_type = yh_universal_type
        # 模板状态 APPROVED审批通过，生效中
        self.t_status = t_status
        # 优惠券发券总额、总数量控制
        self.yh_control_type = yh_control_type
        # 申请原因
        self.t_reason = t_reason
        # 优惠条件备注，显示用
        self.yh_description = yh_description
        # 创建人, 系统操作为 应用名, 员工操作设置为工号
        self.t_creator = t_creator
        # 最后修改人, 系统操作为 应用名, 员工操作设置为工号
        self.t_modifier = t_modifier
        # 创建时间
        self.t_gmt_create = t_gmt_create
        # 最后修改时间
        self.t_gmt_modified = t_gmt_modified
        # 商品规格CODE。 限定商品类型时， 适用的商品集合， 通用券( yhUniversalType=NONUNIVERSAL)不能为空
        self.item_code_set = item_code_set

    def validate(self):
        if self.t_start_time is not None:
            self.validate_pattern(self.t_start_time, 't_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.t_end_time is not None:
            self.validate_pattern(self.t_end_time, 't_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.yh_start_time is not None:
            self.validate_pattern(self.yh_start_time, 'yh_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.yh_end_time is not None:
            self.validate_pattern(self.yh_end_time, 'yh_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.t_gmt_create is not None:
            self.validate_pattern(self.t_gmt_create, 't_gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.t_gmt_modified is not None:
            self.validate_pattern(self.t_gmt_modified, 't_gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.t_type is not None:
            result['t_type'] = self.t_type
        if self.currency is not None:
            result['currency'] = self.currency
        if self.id is not None:
            result['id'] = self.id
        if self.t_name is not None:
            result['t_name'] = self.t_name
        if self.t_use_scene is not None:
            result['t_use_scene'] = self.t_use_scene
        if self.t_start_time is not None:
            result['t_start_time'] = self.t_start_time
        if self.t_end_time is not None:
            result['t_end_time'] = self.t_end_time
        if self.yh_max_release is not None:
            result['yh_max_release'] = self.yh_max_release
        if self.yh_type is not None:
            result['yh_type'] = self.yh_type
        if self.yh_certain_money is not None:
            result['yh_certain_money'] = self.yh_certain_money
        if self.yh_amount is not None:
            result['yh_amount'] = self.yh_amount
        if self.yh_discount_rate is not None:
            result['yh_discount_rate'] = self.yh_discount_rate
        if self.yh_usage_count is not None:
            result['yh_usage_count'] = self.yh_usage_count
        if self.yh_validity_type is not None:
            result['yh_validity_type'] = self.yh_validity_type
        if self.yh_start_time is not None:
            result['yh_start_time'] = self.yh_start_time
        if self.yh_end_time is not None:
            result['yh_end_time'] = self.yh_end_time
        if self.yh_relative_second is not None:
            result['yh_relative_second'] = self.yh_relative_second
        if self.yh_per_limit_num is not None:
            result['yh_per_limit_num'] = self.yh_per_limit_num
        if self.yh_universal_type is not None:
            result['yh_universal_type'] = self.yh_universal_type
        if self.t_status is not None:
            result['t_status'] = self.t_status
        if self.yh_control_type is not None:
            result['yh_control_type'] = self.yh_control_type
        if self.t_reason is not None:
            result['t_reason'] = self.t_reason
        if self.yh_description is not None:
            result['yh_description'] = self.yh_description
        if self.t_creator is not None:
            result['t_creator'] = self.t_creator
        if self.t_modifier is not None:
            result['t_modifier'] = self.t_modifier
        if self.t_gmt_create is not None:
            result['t_gmt_create'] = self.t_gmt_create
        if self.t_gmt_modified is not None:
            result['t_gmt_modified'] = self.t_gmt_modified
        if self.item_code_set is not None:
            result['item_code_set'] = self.item_code_set
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('t_type') is not None:
            self.t_type = m.get('t_type')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('t_name') is not None:
            self.t_name = m.get('t_name')
        if m.get('t_use_scene') is not None:
            self.t_use_scene = m.get('t_use_scene')
        if m.get('t_start_time') is not None:
            self.t_start_time = m.get('t_start_time')
        if m.get('t_end_time') is not None:
            self.t_end_time = m.get('t_end_time')
        if m.get('yh_max_release') is not None:
            self.yh_max_release = m.get('yh_max_release')
        if m.get('yh_type') is not None:
            self.yh_type = m.get('yh_type')
        if m.get('yh_certain_money') is not None:
            self.yh_certain_money = m.get('yh_certain_money')
        if m.get('yh_amount') is not None:
            self.yh_amount = m.get('yh_amount')
        if m.get('yh_discount_rate') is not None:
            self.yh_discount_rate = m.get('yh_discount_rate')
        if m.get('yh_usage_count') is not None:
            self.yh_usage_count = m.get('yh_usage_count')
        if m.get('yh_validity_type') is not None:
            self.yh_validity_type = m.get('yh_validity_type')
        if m.get('yh_start_time') is not None:
            self.yh_start_time = m.get('yh_start_time')
        if m.get('yh_end_time') is not None:
            self.yh_end_time = m.get('yh_end_time')
        if m.get('yh_relative_second') is not None:
            self.yh_relative_second = m.get('yh_relative_second')
        if m.get('yh_per_limit_num') is not None:
            self.yh_per_limit_num = m.get('yh_per_limit_num')
        if m.get('yh_universal_type') is not None:
            self.yh_universal_type = m.get('yh_universal_type')
        if m.get('t_status') is not None:
            self.t_status = m.get('t_status')
        if m.get('yh_control_type') is not None:
            self.yh_control_type = m.get('yh_control_type')
        if m.get('t_reason') is not None:
            self.t_reason = m.get('t_reason')
        if m.get('yh_description') is not None:
            self.yh_description = m.get('yh_description')
        if m.get('t_creator') is not None:
            self.t_creator = m.get('t_creator')
        if m.get('t_modifier') is not None:
            self.t_modifier = m.get('t_modifier')
        if m.get('t_gmt_create') is not None:
            self.t_gmt_create = m.get('t_gmt_create')
        if m.get('t_gmt_modified') is not None:
            self.t_gmt_modified = m.get('t_gmt_modified')
        if m.get('item_code_set') is not None:
            self.item_code_set = m.get('item_code_set')
        return self


class SendCouponAnnotatedRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        template_id: str = None,
        biz_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID
        self.tenant_id = tenant_id
        # 优惠券模板ID
        self.template_id = template_id
        # 幂等号
        self.biz_no = biz_no

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_id, 'template_id')
        self.validate_required(self.biz_no, 'biz_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        return self


class SendCouponAnnotatedResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        coupon_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 优惠券id
        self.coupon_id = coupon_id

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
        if self.coupon_id is not None:
            result['coupon_id'] = self.coupon_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('coupon_id') is not None:
            self.coupon_id = m.get('coupon_id')
        return self


class QueryDocRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        id: str = None,
        site_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 文档id
        self.id = id
        # 内容id
        self.site_id = site_id

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.site_id, 'site_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.id is not None:
            result['id'] = self.id
        if self.site_id is not None:
            result['site_id'] = self.site_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('site_id') is not None:
            self.site_id = m.get('site_id')
        return self


class QueryDocResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        id: int = None,
        doc_id: str = None,
        title: str = None,
        site: str = None,
        language: str = None,
        content: str = None,
        source_type: int = None,
        ext_modified_time: int = None,
        key_words: str = None,
        show_type: int = None,
        page_context: List[PageContext] = None,
        content_obj: List[ContentObjVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 内部id
        self.id = id
        # 文档id
        self.doc_id = doc_id
        # 文档标题
        self.title = title
        # 站点
        self.site = site
        # 语言code
        self.language = language
        # 内容
        self.content = content
        # 类型
        self.source_type = source_type
        # 最后修改时间
        self.ext_modified_time = ext_modified_time
        # 关键字
        self.key_words = key_words
        # 显示类型
        self.show_type = show_type
        # 页面上下文
        self.page_context = page_context
        # 内容对象
        # 
        # 
        self.content_obj = content_obj

    def validate(self):
        if self.page_context:
            for k in self.page_context:
                if k:
                    k.validate()
        if self.content_obj:
            for k in self.content_obj:
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
        if self.id is not None:
            result['id'] = self.id
        if self.doc_id is not None:
            result['doc_id'] = self.doc_id
        if self.title is not None:
            result['title'] = self.title
        if self.site is not None:
            result['site'] = self.site
        if self.language is not None:
            result['language'] = self.language
        if self.content is not None:
            result['content'] = self.content
        if self.source_type is not None:
            result['source_type'] = self.source_type
        if self.ext_modified_time is not None:
            result['ext_modified_time'] = self.ext_modified_time
        if self.key_words is not None:
            result['key_words'] = self.key_words
        if self.show_type is not None:
            result['show_type'] = self.show_type
        result['page_context'] = []
        if self.page_context is not None:
            for k in self.page_context:
                result['page_context'].append(k.to_map() if k else None)
        result['content_obj'] = []
        if self.content_obj is not None:
            for k in self.content_obj:
                result['content_obj'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('doc_id') is not None:
            self.doc_id = m.get('doc_id')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('site') is not None:
            self.site = m.get('site')
        if m.get('language') is not None:
            self.language = m.get('language')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('source_type') is not None:
            self.source_type = m.get('source_type')
        if m.get('ext_modified_time') is not None:
            self.ext_modified_time = m.get('ext_modified_time')
        if m.get('key_words') is not None:
            self.key_words = m.get('key_words')
        if m.get('show_type') is not None:
            self.show_type = m.get('show_type')
        self.page_context = []
        if m.get('page_context') is not None:
            for k in m.get('page_context'):
                temp_model = PageContext()
                self.page_context.append(temp_model.from_map(k))
        self.content_obj = []
        if m.get('content_obj') is not None:
            for k in m.get('content_obj'):
                temp_model = ContentObjVO()
                self.content_obj.append(temp_model.from_map(k))
        return self


class QueryDocChildRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        id: str = None,
        site_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 文档id
        self.id = id
        # 目录id
        self.site_id = site_id

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.site_id, 'site_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.id is not None:
            result['id'] = self.id
        if self.site_id is not None:
            result['site_id'] = self.site_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('site_id') is not None:
            self.site_id = m.get('site_id')
        return self


class QueryDocChildResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        id: int = None,
        site_id: int = None,
        site: str = None,
        language: str = None,
        title: str = None,
        type: int = None,
        show_type: int = None,
        sort: int = None,
        level: int = None,
        ext_id: str = None,
        parent_id: str = None,
        source_type: int = None,
        version: str = None,
        catalogue_type: int = None,
        children: List[CategoryVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 内部id
        self.id = id
        # 内容库id
        self.site_id = site_id
        # 站点
        self.site = site
        # 语言code
        self.language = language
        # 名称
        self.title = title
        # 类型
        self.type = type
        # 展示类型 1为左侧展示2为列表展示
        self.show_type = show_type
        # 排序
        self.sort = sort
        # 目录层级
        self.level = level
        # 外标id
        self.ext_id = ext_id
        # 父id
        self.parent_id = parent_id
        # 来源类型
        self.source_type = source_type
        # 版本
        self.version = version
        # 语雀目录有无数据判定
        self.catalogue_type = catalogue_type
        # children
        self.children = children

    def validate(self):
        if self.children:
            for k in self.children:
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
        if self.id is not None:
            result['id'] = self.id
        if self.site_id is not None:
            result['site_id'] = self.site_id
        if self.site is not None:
            result['site'] = self.site
        if self.language is not None:
            result['language'] = self.language
        if self.title is not None:
            result['title'] = self.title
        if self.type is not None:
            result['type'] = self.type
        if self.show_type is not None:
            result['show_type'] = self.show_type
        if self.sort is not None:
            result['sort'] = self.sort
        if self.level is not None:
            result['level'] = self.level
        if self.ext_id is not None:
            result['ext_id'] = self.ext_id
        if self.parent_id is not None:
            result['parent_id'] = self.parent_id
        if self.source_type is not None:
            result['source_type'] = self.source_type
        if self.version is not None:
            result['version'] = self.version
        if self.catalogue_type is not None:
            result['catalogue_type'] = self.catalogue_type
        result['children'] = []
        if self.children is not None:
            for k in self.children:
                result['children'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('site_id') is not None:
            self.site_id = m.get('site_id')
        if m.get('site') is not None:
            self.site = m.get('site')
        if m.get('language') is not None:
            self.language = m.get('language')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('show_type') is not None:
            self.show_type = m.get('show_type')
        if m.get('sort') is not None:
            self.sort = m.get('sort')
        if m.get('level') is not None:
            self.level = m.get('level')
        if m.get('ext_id') is not None:
            self.ext_id = m.get('ext_id')
        if m.get('parent_id') is not None:
            self.parent_id = m.get('parent_id')
        if m.get('source_type') is not None:
            self.source_type = m.get('source_type')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('catalogue_type') is not None:
            self.catalogue_type = m.get('catalogue_type')
        self.children = []
        if m.get('children') is not None:
            for k in m.get('children'):
                temp_model = CategoryVO()
                self.children.append(temp_model.from_map(k))
        return self


class QueryCouponAvaliableRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        product_codes: List[str] = None,
        coupon_type: str = None,
        biz_time: str = None,
        currency: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID
        self.tenant_id = tenant_id
        # 商品code
        self.product_codes = product_codes
        # 优惠券类型:VOUCHER 抵用券, CERTAIN 满减券,DISCOUNT 折扣券
        self.coupon_type = coupon_type
        # 业务发生时间
        self.biz_time = biz_time
        # 交易币种 CNY 人民币 USD美元
        self.currency = currency

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.product_codes, 'product_codes')
        self.validate_required(self.biz_time, 'biz_time')
        if self.biz_time is not None:
            self.validate_pattern(self.biz_time, 'biz_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.currency, 'currency')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.product_codes is not None:
            result['product_codes'] = self.product_codes
        if self.coupon_type is not None:
            result['coupon_type'] = self.coupon_type
        if self.biz_time is not None:
            result['biz_time'] = self.biz_time
        if self.currency is not None:
            result['currency'] = self.currency
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('product_codes') is not None:
            self.product_codes = m.get('product_codes')
        if m.get('coupon_type') is not None:
            self.coupon_type = m.get('coupon_type')
        if m.get('biz_time') is not None:
            self.biz_time = m.get('biz_time')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        return self


class QueryCouponAvaliableResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        coupon_list: List[Coupon] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 优惠券列表
        self.coupon_list = coupon_list

    def validate(self):
        if self.coupon_list:
            for k in self.coupon_list:
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
        result['coupon_list'] = []
        if self.coupon_list is not None:
            for k in self.coupon_list:
                result['coupon_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.coupon_list = []
        if m.get('coupon_list') is not None:
            for k in m.get('coupon_list'):
                temp_model = Coupon()
                self.coupon_list.append(temp_model.from_map(k))
        return self


class SubmitActivityInformationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        activity_id: str = None,
        activity_channel: str = None,
        activity_form_data: str = None,
        submit_date: str = None,
        information_id: str = None,
        attachments: List[Attachment] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 活动标识
        self.activity_id = activity_id
        # 渠道编码
        self.activity_channel = activity_channel
        # 活动表单
        self.activity_form_data = activity_form_data
        # 提交时间，ISO_DATE_TIME 时间格式
        self.submit_date = submit_date
        # 情报标识，存在则更新
        self.information_id = information_id
        # 可选附件
        self.attachments = attachments

    def validate(self):
        self.validate_required(self.activity_id, 'activity_id')
        self.validate_required(self.activity_channel, 'activity_channel')
        self.validate_required(self.activity_form_data, 'activity_form_data')
        if self.attachments:
            for k in self.attachments:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.activity_id is not None:
            result['activity_id'] = self.activity_id
        if self.activity_channel is not None:
            result['activity_channel'] = self.activity_channel
        if self.activity_form_data is not None:
            result['activity_form_data'] = self.activity_form_data
        if self.submit_date is not None:
            result['submit_date'] = self.submit_date
        if self.information_id is not None:
            result['information_id'] = self.information_id
        result['attachments'] = []
        if self.attachments is not None:
            for k in self.attachments:
                result['attachments'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('activity_id') is not None:
            self.activity_id = m.get('activity_id')
        if m.get('activity_channel') is not None:
            self.activity_channel = m.get('activity_channel')
        if m.get('activity_form_data') is not None:
            self.activity_form_data = m.get('activity_form_data')
        if m.get('submit_date') is not None:
            self.submit_date = m.get('submit_date')
        if m.get('information_id') is not None:
            self.information_id = m.get('information_id')
        self.attachments = []
        if m.get('attachments') is not None:
            for k in m.get('attachments'):
                temp_model = Attachment()
                self.attachments.append(temp_model.from_map(k))
        return self


class SubmitActivityInformationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        information_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 情报标识
        self.information_id = information_id

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
        if self.information_id is not None:
            result['information_id'] = self.information_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('information_id') is not None:
            self.information_id = m.get('information_id')
        return self


class SyncActivityAssetsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        information_id: str = None,
        attachments: List[Attachment] = None,
        assets: List[Asset] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 情报标识
        self.information_id = information_id
        # 附件信息
        self.attachments = attachments
        # 资产详情列表
        self.assets = assets

    def validate(self):
        self.validate_required(self.information_id, 'information_id')
        self.validate_required(self.attachments, 'attachments')
        if self.attachments:
            for k in self.attachments:
                if k:
                    k.validate()
        self.validate_required(self.assets, 'assets')
        if self.assets:
            for k in self.assets:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.information_id is not None:
            result['information_id'] = self.information_id
        result['attachments'] = []
        if self.attachments is not None:
            for k in self.attachments:
                result['attachments'].append(k.to_map() if k else None)
        result['assets'] = []
        if self.assets is not None:
            for k in self.assets:
                result['assets'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('information_id') is not None:
            self.information_id = m.get('information_id')
        self.attachments = []
        if m.get('attachments') is not None:
            for k in m.get('attachments'):
                temp_model = Attachment()
                self.attachments.append(temp_model.from_map(k))
        self.assets = []
        if m.get('assets') is not None:
            for k in m.get('assets'):
                temp_model = Asset()
                self.assets.append(temp_model.from_map(k))
        return self


class SyncActivityAssetsResponse(TeaModel):
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


