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


class OpenNode(TeaModel):
    def __init__(
        self,
        node_id: str = None,
        parent_node_id: str = None,
        slot_key: str = None,
        slot_value: str = None,
        level: int = None,
        sort_order: int = None,
        gmt_create: str = None,
        children: str = None,
    ):
        # node ID
        self.node_id = node_id
        # parent node ID
        self.parent_node_id = parent_node_id
        # slot key
        self.slot_key = slot_key
        # slot value
        self.slot_value = slot_value
        # level
        self.level = level
        # sort订单
        self.sort_order = sort_order
        # gmt create
        self.gmt_create = gmt_create
        # children
        self.children = children

    def validate(self):
        self.validate_required(self.node_id, 'node_id')
        self.validate_required(self.parent_node_id, 'parent_node_id')
        self.validate_required(self.slot_key, 'slot_key')
        self.validate_required(self.slot_value, 'slot_value')
        self.validate_required(self.level, 'level')
        self.validate_required(self.sort_order, 'sort_order')
        self.validate_required(self.gmt_create, 'gmt_create')
        self.validate_required(self.children, 'children')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.parent_node_id is not None:
            result['parent_node_id'] = self.parent_node_id
        if self.slot_key is not None:
            result['slot_key'] = self.slot_key
        if self.slot_value is not None:
            result['slot_value'] = self.slot_value
        if self.level is not None:
            result['level'] = self.level
        if self.sort_order is not None:
            result['sort_order'] = self.sort_order
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.children is not None:
            result['children'] = self.children
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('parent_node_id') is not None:
            self.parent_node_id = m.get('parent_node_id')
        if m.get('slot_key') is not None:
            self.slot_key = m.get('slot_key')
        if m.get('slot_value') is not None:
            self.slot_value = m.get('slot_value')
        if m.get('level') is not None:
            self.level = m.get('level')
        if m.get('sort_order') is not None:
            self.sort_order = m.get('sort_order')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('children') is not None:
            self.children = m.get('children')
        return self


class KbUploadFileItem(TeaModel):
    def __init__(
        self,
        document_id: str = None,
        file_name: str = None,
        original_name: str = None,
        file_type: str = None,
        file_md_5: str = None,
        oss_url: str = None,
        oss_provider: str = None,
        source: str = None,
        source_ext: str = None,
    ):
        # document ID
        self.document_id = document_id
        # file名称
        self.file_name = file_name
        # original名称
        self.original_name = original_name
        # file类型
        self.file_type = file_type
        # file md5
        self.file_md_5 = file_md_5
        # oss url
        self.oss_url = oss_url
        # oss provider
        self.oss_provider = oss_provider
        # source
        self.source = source
        # source ext
        self.source_ext = source_ext

    def validate(self):
        self.validate_required(self.document_id, 'document_id')
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.original_name, 'original_name')
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.file_md_5, 'file_md_5')
        self.validate_required(self.oss_url, 'oss_url')
        self.validate_required(self.oss_provider, 'oss_provider')
        self.validate_required(self.source, 'source')
        self.validate_required(self.source_ext, 'source_ext')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.document_id is not None:
            result['document_id'] = self.document_id
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.original_name is not None:
            result['original_name'] = self.original_name
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.file_md_5 is not None:
            result['file_md5'] = self.file_md_5
        if self.oss_url is not None:
            result['oss_url'] = self.oss_url
        if self.oss_provider is not None:
            result['oss_provider'] = self.oss_provider
        if self.source is not None:
            result['source'] = self.source
        if self.source_ext is not None:
            result['source_ext'] = self.source_ext
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('document_id') is not None:
            self.document_id = m.get('document_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('original_name') is not None:
            self.original_name = m.get('original_name')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('file_md5') is not None:
            self.file_md_5 = m.get('file_md5')
        if m.get('oss_url') is not None:
            self.oss_url = m.get('oss_url')
        if m.get('oss_provider') is not None:
            self.oss_provider = m.get('oss_provider')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('source_ext') is not None:
            self.source_ext = m.get('source_ext')
        return self


class RecallDataDetail(TeaModel):
    def __init__(
        self,
        docname: str = None,
        content: str = None,
        rerankscore: int = None,
        rerankrank: int = None,
        score: int = None,
        title: str = None,
        knowledgebaseids: str = None,
        knowledgebasetag: str = None,
    ):
        # 文件名
        self.docname = docname
        # 片段内容
        self.content = content
        # 重排得分
        self.rerankscore = rerankscore
        # 重排位次
        self.rerankrank = rerankrank
        # 综合得分
        self.score = score
        # chunk标题
        self.title = title
        # 知识库id
        self.knowledgebaseids = knowledgebaseids
        # official 官方知识库、custom个人知识库
        self.knowledgebasetag = knowledgebasetag

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.docname is not None:
            result['docname'] = self.docname
        if self.content is not None:
            result['content'] = self.content
        if self.rerankscore is not None:
            result['rerankscore'] = self.rerankscore
        if self.rerankrank is not None:
            result['rerankrank'] = self.rerankrank
        if self.score is not None:
            result['score'] = self.score
        if self.title is not None:
            result['title'] = self.title
        if self.knowledgebaseids is not None:
            result['knowledgebaseids'] = self.knowledgebaseids
        if self.knowledgebasetag is not None:
            result['knowledgebasetag'] = self.knowledgebasetag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('docname') is not None:
            self.docname = m.get('docname')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('rerankscore') is not None:
            self.rerankscore = m.get('rerankscore')
        if m.get('rerankrank') is not None:
            self.rerankrank = m.get('rerankrank')
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('knowledgebaseids') is not None:
            self.knowledgebaseids = m.get('knowledgebaseids')
        if m.get('knowledgebasetag') is not None:
            self.knowledgebasetag = m.get('knowledgebasetag')
        return self


class DocumentDTO(TeaModel):
    def __init__(
        self,
        id: str = None,
        name: str = None,
        file_size: str = None,
        file_type: str = None,
        oss_url: str = None,
        md_5: str = None,
        status: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        oss_provider: str = None,
        vector_store_map_id: str = None,
    ):
        # id
        self.id = id
        # 文件名
        self.name = name
        # 文件大小
        self.file_size = file_size
        # 文件类型
        self.file_type = file_type
        # 文件地址
        self.oss_url = oss_url
        # md5
        self.md_5 = md_5
        # 状态
        self.status = status
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified
        # 文件提供方
        self.oss_provider = oss_provider
        # 向量库映射ID
        self.vector_store_map_id = vector_store_map_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.file_size is not None:
            result['file_size'] = self.file_size
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.oss_url is not None:
            result['oss_url'] = self.oss_url
        if self.md_5 is not None:
            result['md5'] = self.md_5
        if self.status is not None:
            result['status'] = self.status
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.oss_provider is not None:
            result['oss_provider'] = self.oss_provider
        if self.vector_store_map_id is not None:
            result['vector_store_map_id'] = self.vector_store_map_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('file_size') is not None:
            self.file_size = m.get('file_size')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('oss_url') is not None:
            self.oss_url = m.get('oss_url')
        if m.get('md5') is not None:
            self.md_5 = m.get('md5')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('oss_provider') is not None:
            self.oss_provider = m.get('oss_provider')
        if m.get('vector_store_map_id') is not None:
            self.vector_store_map_id = m.get('vector_store_map_id')
        return self


class FileItem(TeaModel):
    def __init__(
        self,
        document_id: str = None,
        file_name: str = None,
        file_type: str = None,
        oss_url: str = None,
        oss_provider: str = None,
        source: str = None,
        source_ext: str = None,
    ):
        # 文件 id
        self.document_id = document_id
        # 文件名
        self.file_name = file_name
        # 文件类型
        self.file_type = file_type
        # OSS文件地址
        self.oss_url = oss_url
        # OSS提供方
        self.oss_provider = oss_provider
        # 文档来源
        self.source = source
        # 文档来源方对文档的额外描述信息
        self.source_ext = source_ext

    def validate(self):
        self.validate_required(self.document_id, 'document_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.document_id is not None:
            result['document_id'] = self.document_id
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.oss_url is not None:
            result['oss_url'] = self.oss_url
        if self.oss_provider is not None:
            result['oss_provider'] = self.oss_provider
        if self.source is not None:
            result['source'] = self.source
        if self.source_ext is not None:
            result['source_ext'] = self.source_ext
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('document_id') is not None:
            self.document_id = m.get('document_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('oss_url') is not None:
            self.oss_url = m.get('oss_url')
        if m.get('oss_provider') is not None:
            self.oss_provider = m.get('oss_provider')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('source_ext') is not None:
            self.source_ext = m.get('source_ext')
        return self


class TreeDetailResponse(TeaModel):
    def __init__(
        self,
        name: str = None,
        id: str = None,
        description: str = None,
        version: str = None,
        activeversion: str = None,
        tenanttag: str = None,
    ):
        # 知识库名称
        self.name = name
        # 知识库id
        self.id = id
        # 知识库描述
        self.description = description
        # 当前最新版本
        self.version = version
        # 当前激活的版本号，未激活任何版本时为 null
        self.activeversion = activeversion
        # 官方知识库数据为 "official",否则 null
        self.tenanttag = tenanttag

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.id is not None:
            result['id'] = self.id
        if self.description is not None:
            result['description'] = self.description
        if self.version is not None:
            result['version'] = self.version
        if self.activeversion is not None:
            result['activeversion'] = self.activeversion
        if self.tenanttag is not None:
            result['tenanttag'] = self.tenanttag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('activeversion') is not None:
            self.activeversion = m.get('activeversion')
        if m.get('tenanttag') is not None:
            self.tenanttag = m.get('tenanttag')
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


class QueryKnowledgeRagRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        query: str = None,
        knowledge_base_ids: List[str] = None,
        topk: int = None,
        include_references: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户问题
        self.query = query
        # 知识库id
        self.knowledge_base_ids = knowledge_base_ids
        # 召回个数
        self.topk = topk
        # 是否包含引用来源
        self.include_references = include_references

    def validate(self):
        self.validate_required(self.query, 'query')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.query is not None:
            result['query'] = self.query
        if self.knowledge_base_ids is not None:
            result['knowledge_base_ids'] = self.knowledge_base_ids
        if self.topk is not None:
            result['topk'] = self.topk
        if self.include_references is not None:
            result['include_references'] = self.include_references
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('query') is not None:
            self.query = m.get('query')
        if m.get('knowledge_base_ids') is not None:
            self.knowledge_base_ids = m.get('knowledge_base_ids')
        if m.get('topk') is not None:
            self.topk = m.get('topk')
        if m.get('include_references') is not None:
            self.include_references = m.get('include_references')
        return self


class QueryKnowledgeRagResponse(TeaModel):
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


class QueryEnergyknowledgeRagRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        query: str = None,
        knowledge_base_ids: List[str] = None,
        topk: int = None,
        include_references: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户问题
        self.query = query
        # 指定查询的知识库id
        self.knowledge_base_ids = knowledge_base_ids
        # 召回数量
        self.topk = topk
        # 是否返回引用docid
        self.include_references = include_references

    def validate(self):
        self.validate_required(self.query, 'query')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.query is not None:
            result['query'] = self.query
        if self.knowledge_base_ids is not None:
            result['knowledge_base_ids'] = self.knowledge_base_ids
        if self.topk is not None:
            result['topk'] = self.topk
        if self.include_references is not None:
            result['include_references'] = self.include_references
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('query') is not None:
            self.query = m.get('query')
        if m.get('knowledge_base_ids') is not None:
            self.knowledge_base_ids = m.get('knowledge_base_ids')
        if m.get('topk') is not None:
            self.topk = m.get('topk')
        if m.get('include_references') is not None:
            self.include_references = m.get('include_references')
        return self


class QueryEnergyknowledgeRagResponse(TeaModel):
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


class QueryEnergyknowledgeRagrecallRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        query: str = None,
        knowledgebaseids: List[str] = None,
        includereferences: bool = None,
        topk: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # rag检索问题
        self.query = query
        # 召回的知识库id
        self.knowledgebaseids = knowledgebaseids
        # 是否包含召回文件名，默认true
        self.includereferences = includereferences
        # 召回条数，默认5
        self.topk = topk

    def validate(self):
        self.validate_required(self.query, 'query')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.query is not None:
            result['query'] = self.query
        if self.knowledgebaseids is not None:
            result['knowledgebaseids'] = self.knowledgebaseids
        if self.includereferences is not None:
            result['includereferences'] = self.includereferences
        if self.topk is not None:
            result['topk'] = self.topk
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('query') is not None:
            self.query = m.get('query')
        if m.get('knowledgebaseids') is not None:
            self.knowledgebaseids = m.get('knowledgebaseids')
        if m.get('includereferences') is not None:
            self.includereferences = m.get('includereferences')
        if m.get('topk') is not None:
            self.topk = m.get('topk')
        return self


class QueryEnergyknowledgeRagrecallResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        datalist: List[RecallDataDetail] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 出参数据
        self.datalist = datalist

    def validate(self):
        if self.datalist:
            for k in self.datalist:
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
        result['datalist'] = []
        if self.datalist is not None:
            for k in self.datalist:
                result['datalist'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.datalist = []
        if m.get('datalist') is not None:
            for k in m.get('datalist'):
                temp_model = RecallDataDetail()
                self.datalist.append(temp_model.from_map(k))
        return self


class QueryKmKnowledgelistRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        keyword: str = None,
        page_size: int = None,
        page: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库名称搜索关键词
        self.keyword = keyword
        # 一页数据条数
        self.page_size = page_size
        # 页号
        self.page = page

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
        if self.keyword is not None:
            result['keyword'] = self.keyword
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page is not None:
            result['page'] = self.page
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('keyword') is not None:
            self.keyword = m.get('keyword')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page') is not None:
            self.page = m.get('page')
        return self


class QueryKmKnowledgelistResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        datalist: TreeDetailResponse = None,
        totalrecords: int = None,
        trees: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 知识库datalist
        self.datalist = datalist
        # 总数据量
        self.totalrecords = totalrecords
        # 知识库树列表JSON数组(元素字段见语雀文档)
        self.trees = trees

    def validate(self):
        if self.datalist:
            self.datalist.validate()

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
        if self.datalist is not None:
            result['datalist'] = self.datalist.to_map()
        if self.totalrecords is not None:
            result['totalrecords'] = self.totalrecords
        if self.trees is not None:
            result['trees'] = self.trees
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('datalist') is not None:
            temp_model = TreeDetailResponse()
            self.datalist = temp_model.from_map(m['datalist'])
        if m.get('totalrecords') is not None:
            self.totalrecords = m.get('totalrecords')
        if m.get('trees') is not None:
            self.trees = m.get('trees')
        return self


class DeleteKmNodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tree_id: str = None,
        node_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.tree_id = tree_id
        # 节点ID
        self.node_id = node_id

    def validate(self):
        self.validate_required(self.tree_id, 'tree_id')
        self.validate_required(self.node_id, 'node_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.node_id is not None:
            result['node_id'] = self.node_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        return self


class DeleteKmNodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success

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
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class DetailKmTreeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tree_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.tree_id = tree_id

    def validate(self):
        self.validate_required(self.tree_id, 'tree_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        return self


class DetailKmTreeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tree_id: str = None,
        name: str = None,
        description: str = None,
        icon: str = None,
        version: str = None,
        active_version: str = None,
        node_count: int = None,
        document_count: int = None,
        graph_enabled: bool = None,
        compile_task_count: int = None,
        root_node_json: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        tenant_tag: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 知识库ID
        self.tree_id = tree_id
        # 知识库名称
        self.name = name
        # 知识库描述
        self.description = description
        # 知识库图标
        self.icon = icon
        # 最新版本号(无版本为空)
        self.version = version
        # 当前激活版本号(未激活为空)
        self.active_version = active_version
        # 节点总数
        self.node_count = node_count
        # 文档总数
        self.document_count = document_count
        # 是否开启图谱编译
        self.graph_enabled = graph_enabled
        # 处理中(未终态)编译任务数(仅图谱开启返回)
        self.compile_task_count = compile_task_count
        # 根节点树JSON文本(OpenNode字段定义见文档)
        self.root_node_json = root_node_json
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified
        # 租户标签(官方租户数据为official)
        self.tenant_tag = tenant_tag

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
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.icon is not None:
            result['icon'] = self.icon
        if self.version is not None:
            result['version'] = self.version
        if self.active_version is not None:
            result['active_version'] = self.active_version
        if self.node_count is not None:
            result['node_count'] = self.node_count
        if self.document_count is not None:
            result['document_count'] = self.document_count
        if self.graph_enabled is not None:
            result['graph_enabled'] = self.graph_enabled
        if self.compile_task_count is not None:
            result['compile_task_count'] = self.compile_task_count
        if self.root_node_json is not None:
            result['root_node_json'] = self.root_node_json
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.tenant_tag is not None:
            result['tenant_tag'] = self.tenant_tag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('icon') is not None:
            self.icon = m.get('icon')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('active_version') is not None:
            self.active_version = m.get('active_version')
        if m.get('node_count') is not None:
            self.node_count = m.get('node_count')
        if m.get('document_count') is not None:
            self.document_count = m.get('document_count')
        if m.get('graph_enabled') is not None:
            self.graph_enabled = m.get('graph_enabled')
        if m.get('compile_task_count') is not None:
            self.compile_task_count = m.get('compile_task_count')
        if m.get('root_node_json') is not None:
            self.root_node_json = m.get('root_node_json')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('tenant_tag') is not None:
            self.tenant_tag = m.get('tenant_tag')
        return self


class BatchimportKmDocumentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tree_id: str = None,
        node_id: str = None,
        task_ext: str = None,
        files: List[KbUploadFileItem] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.tree_id = tree_id
        # 挂载目标节点ID
        self.node_id = node_id
        # 任务扩展号
        self.task_ext = task_ext
        # 待入库文件列表(files.1.file_name点号形式)
        self.files = files

    def validate(self):
        self.validate_required(self.tree_id, 'tree_id')
        self.validate_required(self.node_id, 'node_id')
        self.validate_required(self.files, 'files')
        if self.files:
            for k in self.files:
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
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.task_ext is not None:
            result['task_ext'] = self.task_ext
        result['files'] = []
        if self.files is not None:
            for k in self.files:
                result['files'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('task_ext') is not None:
            self.task_ext = m.get('task_ext')
        self.files = []
        if m.get('files') is not None:
            for k in m.get('files'):
                temp_model = KbUploadFileItem()
                self.files.append(temp_model.from_map(k))
        return self


class BatchimportKmDocumentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success_count: int = None,
        failed_count: int = None,
        skip_count: int = None,
        documents: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 成功数量
        self.success_count = success_count
        # 失败数量
        self.failed_count = failed_count
        # 跳过数量(MD5重复)
        self.skip_count = skip_count
        # 入库成功文档JSON数组(KbDocumentDTO字段定义见文档)
        self.documents = documents

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
        if self.success_count is not None:
            result['success_count'] = self.success_count
        if self.failed_count is not None:
            result['failed_count'] = self.failed_count
        if self.skip_count is not None:
            result['skip_count'] = self.skip_count
        if self.documents is not None:
            result['documents'] = self.documents
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success_count') is not None:
            self.success_count = m.get('success_count')
        if m.get('failed_count') is not None:
            self.failed_count = m.get('failed_count')
        if m.get('skip_count') is not None:
            self.skip_count = m.get('skip_count')
        if m.get('documents') is not None:
            self.documents = m.get('documents')
        return self


class CreateKmTreeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        description: str = None,
        icon: str = None,
        schema_json: str = None,
        graph_enabled: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库名称
        self.name = name
        # 知识库描述
        self.description = description
        # 知识库图标
        self.icon = icon
        # 图谱本体Schema JSON
        self.schema_json = schema_json
        # 是否开启图谱编译
        self.graph_enabled = graph_enabled

    def validate(self):
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.icon is not None:
            result['icon'] = self.icon
        if self.schema_json is not None:
            result['schema_json'] = self.schema_json
        if self.graph_enabled is not None:
            result['graph_enabled'] = self.graph_enabled
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('icon') is not None:
            self.icon = m.get('icon')
        if m.get('schema_json') is not None:
            self.schema_json = m.get('schema_json')
        if m.get('graph_enabled') is not None:
            self.graph_enabled = m.get('graph_enabled')
        return self


class CreateKmTreeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tree_id: str = None,
        root_node_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 知识库ID
        self.tree_id = tree_id
        # 根节点ID
        self.root_node_id = root_node_id

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
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.root_node_id is not None:
            result['root_node_id'] = self.root_node_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('root_node_id') is not None:
            self.root_node_id = m.get('root_node_id')
        return self


class UpdateKmNodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tree_id: str = None,
        node_id: str = None,
        slot_key: str = None,
        slot_value: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.tree_id = tree_id
        # 节点ID
        self.node_id = node_id
        # 节点键名
        self.slot_key = slot_key
        # 节点值
        self.slot_value = slot_value

    def validate(self):
        self.validate_required(self.tree_id, 'tree_id')
        self.validate_required(self.node_id, 'node_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.slot_key is not None:
            result['slot_key'] = self.slot_key
        if self.slot_value is not None:
            result['slot_value'] = self.slot_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('slot_key') is not None:
            self.slot_key = m.get('slot_key')
        if m.get('slot_value') is not None:
            self.slot_value = m.get('slot_value')
        return self


class UpdateKmNodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success

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
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class UpdateKmTreeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tree_id: str = None,
        name: str = None,
        description: str = None,
        icon: str = None,
        schema_json: str = None,
        graph_enabled: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.tree_id = tree_id
        # 知识库名称
        self.name = name
        # 知识库描述
        self.description = description
        # 知识库图标
        self.icon = icon
        # 图谱本体Schema JSON
        self.schema_json = schema_json
        # 是否开启图谱编译
        self.graph_enabled = graph_enabled

    def validate(self):
        self.validate_required(self.tree_id, 'tree_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.icon is not None:
            result['icon'] = self.icon
        if self.schema_json is not None:
            result['schema_json'] = self.schema_json
        if self.graph_enabled is not None:
            result['graph_enabled'] = self.graph_enabled
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('icon') is not None:
            self.icon = m.get('icon')
        if m.get('schema_json') is not None:
            self.schema_json = m.get('schema_json')
        if m.get('graph_enabled') is not None:
            self.graph_enabled = m.get('graph_enabled')
        return self


class UpdateKmTreeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success

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
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class SchemaKmTreeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tree_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.tree_id = tree_id

    def validate(self):
        self.validate_required(self.tree_id, 'tree_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        return self


class SchemaKmTreeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        kb_id: str = None,
        schema_json: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 知识库ID
        self.kb_id = kb_id
        # 图谱本体Schema JSON文本
        self.schema_json = schema_json

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
        if self.kb_id is not None:
            result['kb_id'] = self.kb_id
        if self.schema_json is not None:
            result['schema_json'] = self.schema_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('kb_id') is not None:
            self.kb_id = m.get('kb_id')
        if m.get('schema_json') is not None:
            self.schema_json = m.get('schema_json')
        return self


class CreateKmNodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tree_id: str = None,
        parent_node_id: str = None,
        slot_key: str = None,
        slot_value: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.tree_id = tree_id
        # 父节点ID
        self.parent_node_id = parent_node_id
        # 节点键名(最长50)
        self.slot_key = slot_key
        # 节点值(最长100)
        self.slot_value = slot_value

    def validate(self):
        self.validate_required(self.tree_id, 'tree_id')
        self.validate_required(self.parent_node_id, 'parent_node_id')
        self.validate_required(self.slot_key, 'slot_key')
        self.validate_required(self.slot_value, 'slot_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.parent_node_id is not None:
            result['parent_node_id'] = self.parent_node_id
        if self.slot_key is not None:
            result['slot_key'] = self.slot_key
        if self.slot_value is not None:
            result['slot_value'] = self.slot_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('parent_node_id') is not None:
            self.parent_node_id = m.get('parent_node_id')
        if m.get('slot_key') is not None:
            self.slot_key = m.get('slot_key')
        if m.get('slot_value') is not None:
            self.slot_value = m.get('slot_value')
        return self


class CreateKmNodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        node_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 新节点ID
        self.node_id = node_id

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
        if self.node_id is not None:
            result['node_id'] = self.node_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        return self


class ListKmDocumentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tree_id: str = None,
        node_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.tree_id = tree_id
        # 节点ID
        self.node_id = node_id

    def validate(self):
        self.validate_required(self.tree_id, 'tree_id')
        self.validate_required(self.node_id, 'node_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.node_id is not None:
            result['node_id'] = self.node_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        return self


class ListKmDocumentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        documents: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 节点文档JSON数组(KbDocumentDTO字段定义见文档)
        self.documents = documents

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
        if self.documents is not None:
            result['documents'] = self.documents
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('documents') is not None:
            self.documents = m.get('documents')
        return self


class UnmountKmDocumentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tree_id: str = None,
        node_id: str = None,
        vector_store_map_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.tree_id = tree_id
        # 节点ID
        self.node_id = node_id
        # 向量库映射ID
        self.vector_store_map_id = vector_store_map_id

    def validate(self):
        self.validate_required(self.tree_id, 'tree_id')
        self.validate_required(self.node_id, 'node_id')
        self.validate_required(self.vector_store_map_id, 'vector_store_map_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.vector_store_map_id is not None:
            result['vector_store_map_id'] = self.vector_store_map_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('vector_store_map_id') is not None:
            self.vector_store_map_id = m.get('vector_store_map_id')
        return self


class UnmountKmDocumentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success

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
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class PreviewKmDocumentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tree_id: str = None,
        node_id: str = None,
        doc_map_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.tree_id = tree_id
        # 节点ID
        self.node_id = node_id
        # 文档挂载映射ID
        self.doc_map_id = doc_map_id

    def validate(self):
        self.validate_required(self.tree_id, 'tree_id')
        self.validate_required(self.node_id, 'node_id')
        self.validate_required(self.doc_map_id, 'doc_map_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.doc_map_id is not None:
            result['doc_map_id'] = self.doc_map_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('doc_map_id') is not None:
            self.doc_map_id = m.get('doc_map_id')
        return self


class PreviewKmDocumentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        document_id: str = None,
        document_name: str = None,
        file_type: str = None,
        content: str = None,
        oss_preview_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文档ID
        self.document_id = document_id
        # 文档名
        self.document_name = document_name
        # 文件类型
        self.file_type = file_type
        # 文档Markdown正文
        self.content = content
        # OSS预览地址
        self.oss_preview_url = oss_preview_url

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
        if self.document_id is not None:
            result['document_id'] = self.document_id
        if self.document_name is not None:
            result['document_name'] = self.document_name
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.content is not None:
            result['content'] = self.content
        if self.oss_preview_url is not None:
            result['oss_preview_url'] = self.oss_preview_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('document_id') is not None:
            self.document_id = m.get('document_id')
        if m.get('document_name') is not None:
            self.document_name = m.get('document_name')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('oss_preview_url') is not None:
            self.oss_preview_url = m.get('oss_preview_url')
        return self


class SegmentsKmDocumentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tree_id: str = None,
        node_id: str = None,
        doc_map_id: str = None,
        keyword: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.tree_id = tree_id
        # 节点ID
        self.node_id = node_id
        # 文档挂载映射ID
        self.doc_map_id = doc_map_id
        # 切片内容关键词
        self.keyword = keyword

    def validate(self):
        self.validate_required(self.tree_id, 'tree_id')
        self.validate_required(self.node_id, 'node_id')
        self.validate_required(self.doc_map_id, 'doc_map_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.doc_map_id is not None:
            result['doc_map_id'] = self.doc_map_id
        if self.keyword is not None:
            result['keyword'] = self.keyword
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('doc_map_id') is not None:
            self.doc_map_id = m.get('doc_map_id')
        if m.get('keyword') is not None:
            self.keyword = m.get('keyword')
        return self


class SegmentsKmDocumentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_count: int = None,
        segments: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 切片总数
        self.total_count = total_count
        # 切片JSON数组(KbSegmentItem字段定义见文档)
        self.segments = segments

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
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.segments is not None:
            result['segments'] = self.segments
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('segments') is not None:
            self.segments = m.get('segments')
        return self


class SearchKmDocumentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tree_id: str = None,
        keyword: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.tree_id = tree_id
        # 搜索关键词
        self.keyword = keyword

    def validate(self):
        self.validate_required(self.tree_id, 'tree_id')
        self.validate_required(self.keyword, 'keyword')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.keyword is not None:
            result['keyword'] = self.keyword
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('keyword') is not None:
            self.keyword = m.get('keyword')
        return self


class SearchKmDocumentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        items: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 搜索结果JSON数组(KbSearchItem字段定义见文档)
        self.items = items

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
        if self.items is not None:
            result['items'] = self.items
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('items') is not None:
            self.items = m.get('items')
        return self


class CreateKmVersionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tree_id: str = None,
        description: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.tree_id = tree_id
        # 版本描述
        self.description = description

    def validate(self):
        self.validate_required(self.tree_id, 'tree_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.description is not None:
            result['description'] = self.description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        return self


class CreateKmVersionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        version_id: str = None,
        tree_id: str = None,
        version: str = None,
        status: str = None,
        total_task_count: int = None,
        completed_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 版本ID
        self.version_id = version_id
        # 知识库ID
        self.tree_id = tree_id
        # 版本号
        self.version = version
        # 版本状态
        self.status = status
        # 发布任务总数
        self.total_task_count = total_task_count
        # 已完成任务数
        self.completed_count = completed_count

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
        if self.version_id is not None:
            result['version_id'] = self.version_id
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.version is not None:
            result['version'] = self.version
        if self.status is not None:
            result['status'] = self.status
        if self.total_task_count is not None:
            result['total_task_count'] = self.total_task_count
        if self.completed_count is not None:
            result['completed_count'] = self.completed_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('version_id') is not None:
            self.version_id = m.get('version_id')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('total_task_count') is not None:
            self.total_task_count = m.get('total_task_count')
        if m.get('completed_count') is not None:
            self.completed_count = m.get('completed_count')
        return self


class ListKmVersionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tree_id: str = None,
        page: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.tree_id = tree_id
        # 页码(1起)
        self.page = page
        # 每页条数(上限100)
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.tree_id, 'tree_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.page is not None:
            result['page'] = self.page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListKmVersionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_records: int = None,
        versions: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 版本总数
        self.total_records = total_records
        # 版本JSON数组(KbVersionItem字段定义见文档)
        self.versions = versions

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
        if self.total_records is not None:
            result['total_records'] = self.total_records
        if self.versions is not None:
            result['versions'] = self.versions
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_records') is not None:
            self.total_records = m.get('total_records')
        if m.get('versions') is not None:
            self.versions = m.get('versions')
        return self


class DetailKmVersionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        version_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 版本ID
        self.version_id = version_id

    def validate(self):
        self.validate_required(self.version_id, 'version_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.version_id is not None:
            result['version_id'] = self.version_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('version_id') is not None:
            self.version_id = m.get('version_id')
        return self


class DetailKmVersionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        version_id: str = None,
        tree_id: str = None,
        version: str = None,
        description: str = None,
        snapshot: str = None,
        doc_count: int = None,
        node_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 版本ID
        self.version_id = version_id
        # 知识库ID
        self.tree_id = tree_id
        # 版本号
        self.version = version
        # 版本描述
        self.description = description
        # 版本快照JSON文本(树结构全文)
        self.snapshot = snapshot
        # 文档数
        self.doc_count = doc_count
        # 节点数
        self.node_count = node_count

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
        if self.version_id is not None:
            result['version_id'] = self.version_id
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.version is not None:
            result['version'] = self.version
        if self.description is not None:
            result['description'] = self.description
        if self.snapshot is not None:
            result['snapshot'] = self.snapshot
        if self.doc_count is not None:
            result['doc_count'] = self.doc_count
        if self.node_count is not None:
            result['node_count'] = self.node_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('version_id') is not None:
            self.version_id = m.get('version_id')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('snapshot') is not None:
            self.snapshot = m.get('snapshot')
        if m.get('doc_count') is not None:
            self.doc_count = m.get('doc_count')
        if m.get('node_count') is not None:
            self.node_count = m.get('node_count')
        return self


class NextKmVersionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tree_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.tree_id = tree_id

    def validate(self):
        self.validate_required(self.tree_id, 'tree_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        return self


class NextKmVersionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tree_id: str = None,
        next_version: str = None,
        node_count: int = None,
        document_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 知识库ID
        self.tree_id = tree_id
        # 下一个版本号
        self.next_version = next_version
        # 节点数
        self.node_count = node_count
        # 文档数
        self.document_count = document_count

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
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.next_version is not None:
            result['next_version'] = self.next_version
        if self.node_count is not None:
            result['node_count'] = self.node_count
        if self.document_count is not None:
            result['document_count'] = self.document_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('next_version') is not None:
            self.next_version = m.get('next_version')
        if m.get('node_count') is not None:
            self.node_count = m.get('node_count')
        if m.get('document_count') is not None:
            self.document_count = m.get('document_count')
        return self


class ActivateKmVersionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tree_id: str = None,
        version_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.tree_id = tree_id
        # 目标版本ID
        self.version_id = version_id

    def validate(self):
        self.validate_required(self.tree_id, 'tree_id')
        self.validate_required(self.version_id, 'version_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.version_id is not None:
            result['version_id'] = self.version_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('version_id') is not None:
            self.version_id = m.get('version_id')
        return self


class ActivateKmVersionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        active_version_id: str = None,
        active_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success
        # 当前激活版本ID
        self.active_version_id = active_version_id
        # 激活时间
        self.active_time = active_time

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
        if self.success is not None:
            result['success'] = self.success
        if self.active_version_id is not None:
            result['active_version_id'] = self.active_version_id
        if self.active_time is not None:
            result['active_time'] = self.active_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('active_version_id') is not None:
            self.active_version_id = m.get('active_version_id')
        if m.get('active_time') is not None:
            self.active_time = m.get('active_time')
        return self


class NodeKgGraphRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        kb_id: str = None,
        node_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.kb_id = kb_id
        # 节点ID
        self.node_id = node_id

    def validate(self):
        self.validate_required(self.kb_id, 'kb_id')
        self.validate_required(self.node_id, 'node_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.kb_id is not None:
            result['kb_id'] = self.kb_id
        if self.node_id is not None:
            result['node_id'] = self.node_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('kb_id') is not None:
            self.kb_id = m.get('kb_id')
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        return self


class NodeKgGraphResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        node: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 节点详情JSON(KbGraphNode字段定义含邻域与属性)
        self.node = node

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
        if self.node is not None:
            result['node'] = self.node
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('node') is not None:
            self.node = m.get('node')
        return self


class CategoriesKgGraphRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        kb_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.kb_id = kb_id

    def validate(self):
        self.validate_required(self.kb_id, 'kb_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.kb_id is not None:
            result['kb_id'] = self.kb_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('kb_id') is not None:
            self.kb_id = m.get('kb_id')
        return self


class CategoriesKgGraphResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        categories: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分类JSON数组(KbGraphCategory字段定义见文档)
        self.categories = categories

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
        if self.categories is not None:
            result['categories'] = self.categories
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('categories') is not None:
            self.categories = m.get('categories')
        return self


class RetryKgCompileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 编译任务ID
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class RetryKgCompileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        kb_id: str = None,
        document_id: str = None,
        status: str = None,
        retry_count: int = None,
        progress: int = None,
        failed_reason: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 编译任务ID
        self.task_id = task_id
        # 知识库ID
        self.kb_id = kb_id
        # 关联文档ID
        self.document_id = document_id
        # 任务状态
        self.status = status
        # 已重试次数
        self.retry_count = retry_count
        # 任务进度
        self.progress = progress
        # 失败原因
        self.failed_reason = failed_reason

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.kb_id is not None:
            result['kb_id'] = self.kb_id
        if self.document_id is not None:
            result['document_id'] = self.document_id
        if self.status is not None:
            result['status'] = self.status
        if self.retry_count is not None:
            result['retry_count'] = self.retry_count
        if self.progress is not None:
            result['progress'] = self.progress
        if self.failed_reason is not None:
            result['failed_reason'] = self.failed_reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('kb_id') is not None:
            self.kb_id = m.get('kb_id')
        if m.get('document_id') is not None:
            self.document_id = m.get('document_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('retry_count') is not None:
            self.retry_count = m.get('retry_count')
        if m.get('progress') is not None:
            self.progress = m.get('progress')
        if m.get('failed_reason') is not None:
            self.failed_reason = m.get('failed_reason')
        return self


class ListKgCompileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        kb_id: str = None,
        keyword: str = None,
        task_tag: str = None,
        page: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.kb_id = kb_id
        # 文档名称关键词
        self.keyword = keyword
        # 任务标签
        self.task_tag = task_tag
        # 页码(1起)
        self.page = page
        # 每页条数
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.kb_id, 'kb_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.kb_id is not None:
            result['kb_id'] = self.kb_id
        if self.keyword is not None:
            result['keyword'] = self.keyword
        if self.task_tag is not None:
            result['task_tag'] = self.task_tag
        if self.page is not None:
            result['page'] = self.page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('kb_id') is not None:
            self.kb_id = m.get('kb_id')
        if m.get('keyword') is not None:
            self.keyword = m.get('keyword')
        if m.get('task_tag') is not None:
            self.task_tag = m.get('task_tag')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListKgCompileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        tasks: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务总数
        self.total = total
        # 任务JSON数组(KbCompileTaskItem字段定义见文档)
        self.tasks = tasks

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
        if self.total is not None:
            result['total'] = self.total
        if self.tasks is not None:
            result['tasks'] = self.tasks
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('tasks') is not None:
            self.tasks = m.get('tasks')
        return self


class ExtractschemaKmDocumentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        kb_id: str = None,
        file_key: str = None,
        file_type: str = None,
        oss_provider: str = None,
        description: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.kb_id = kb_id
        # OSS文件Key
        self.file_key = file_key
        # 文件类型
        self.file_type = file_type
        # OSS提供方
        self.oss_provider = oss_provider
        # 抽取目标描述
        self.description = description

    def validate(self):
        self.validate_required(self.kb_id, 'kb_id')
        self.validate_required(self.file_key, 'file_key')
        self.validate_required(self.file_type, 'file_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.kb_id is not None:
            result['kb_id'] = self.kb_id
        if self.file_key is not None:
            result['file_key'] = self.file_key
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.oss_provider is not None:
            result['oss_provider'] = self.oss_provider
        if self.description is not None:
            result['description'] = self.description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('kb_id') is not None:
            self.kb_id = m.get('kb_id')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('oss_provider') is not None:
            self.oss_provider = m.get('oss_provider')
        if m.get('description') is not None:
            self.description = m.get('description')
        return self


class ExtractschemaKmDocumentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        schema_json: str = None,
        file_content: str = None,
        success: bool = None,
        error_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 生成的本体Schema JSON
        self.schema_json = schema_json
        # 文件内容摘要
        self.file_content = file_content
        # 是否成功
        self.success = success
        # 失败原因
        self.error_msg = error_msg

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
        if self.schema_json is not None:
            result['schema_json'] = self.schema_json
        if self.file_content is not None:
            result['file_content'] = self.file_content
        if self.success is not None:
            result['success'] = self.success
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('schema_json') is not None:
            self.schema_json = m.get('schema_json')
        if m.get('file_content') is not None:
            self.file_content = m.get('file_content')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class RankKmNodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tree_id: str = None,
        parent_node_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.tree_id = tree_id
        # 父节点ID(空为顶层)
        self.parent_node_id = parent_node_id

    def validate(self):
        self.validate_required(self.tree_id, 'tree_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.parent_node_id is not None:
            result['parent_node_id'] = self.parent_node_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('parent_node_id') is not None:
            self.parent_node_id = m.get('parent_node_id')
        return self


class RankKmNodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success

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
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class ReorderKmNodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tree_id: str = None,
        parent_node_id: str = None,
        node_ids: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.tree_id = tree_id
        # 父节点ID(空为顶层)
        self.parent_node_id = parent_node_id
        # 按新顺序排列的节点ID(逗号分隔)
        self.node_ids = node_ids

    def validate(self):
        self.validate_required(self.tree_id, 'tree_id')
        self.validate_required(self.node_ids, 'node_ids')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.parent_node_id is not None:
            result['parent_node_id'] = self.parent_node_id
        if self.node_ids is not None:
            result['node_ids'] = self.node_ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('parent_node_id') is not None:
            self.parent_node_id = m.get('parent_node_id')
        if m.get('node_ids') is not None:
            self.node_ids = m.get('node_ids')
        return self


class ReorderKmNodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success

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
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class RetrieveKgGraphRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        kb_id: str = None,
        entity_types: str = None,
        relation_types: str = None,
        show_isolated: bool = None,
        include_anchors: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.kb_id = kb_id
        # 限定实体类型集合(逗号分隔)
        self.entity_types = entity_types
        # 限定关系类型集合(逗号分隔)
        self.relation_types = relation_types
        # 是否包含孤立节点
        self.show_isolated = show_isolated
        # 是否包含锚点节点
        self.include_anchors = include_anchors

    def validate(self):
        self.validate_required(self.kb_id, 'kb_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.kb_id is not None:
            result['kb_id'] = self.kb_id
        if self.entity_types is not None:
            result['entity_types'] = self.entity_types
        if self.relation_types is not None:
            result['relation_types'] = self.relation_types
        if self.show_isolated is not None:
            result['show_isolated'] = self.show_isolated
        if self.include_anchors is not None:
            result['include_anchors'] = self.include_anchors
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('kb_id') is not None:
            self.kb_id = m.get('kb_id')
        if m.get('entity_types') is not None:
            self.entity_types = m.get('entity_types')
        if m.get('relation_types') is not None:
            self.relation_types = m.get('relation_types')
        if m.get('show_isolated') is not None:
            self.show_isolated = m.get('show_isolated')
        if m.get('include_anchors') is not None:
            self.include_anchors = m.get('include_anchors')
        return self


class RetrieveKgGraphResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        truncated: bool = None,
        nodes: str = None,
        edges: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果是否被截断
        self.truncated = truncated
        # 节点JSON数组(KbGraphNode字段定义见文档)
        self.nodes = nodes
        # 关系JSON数组(KbGraphEdge字段定义见文档)
        self.edges = edges

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
        if self.truncated is not None:
            result['truncated'] = self.truncated
        if self.nodes is not None:
            result['nodes'] = self.nodes
        if self.edges is not None:
            result['edges'] = self.edges
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('truncated') is not None:
            self.truncated = m.get('truncated')
        if m.get('nodes') is not None:
            self.nodes = m.get('nodes')
        if m.get('edges') is not None:
            self.edges = m.get('edges')
        return self


class SortKmNodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tree_id: str = None,
        parent_node_id: str = None,
        node_ids: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.tree_id = tree_id
        # 父节点ID(空为顶层)
        self.parent_node_id = parent_node_id
        # 按新顺序排列的节点ID(逗号分隔)
        self.node_ids = node_ids

    def validate(self):
        self.validate_required(self.tree_id, 'tree_id')
        self.validate_required(self.node_ids, 'node_ids')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.parent_node_id is not None:
            result['parent_node_id'] = self.parent_node_id
        if self.node_ids is not None:
            result['node_ids'] = self.node_ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('parent_node_id') is not None:
            self.parent_node_id = m.get('parent_node_id')
        if m.get('node_ids') is not None:
            self.node_ids = m.get('node_ids')
        return self


class SortKmNodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success

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
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryKgGraphRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        kb_id: str = None,
        entity_types: str = None,
        relation_types: str = None,
        show_isolated: bool = None,
        include_anchors: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.kb_id = kb_id
        # 限定实体类型集合(逗号分隔)
        self.entity_types = entity_types
        # 限定关系类型集合(逗号分隔)
        self.relation_types = relation_types
        # 是否包含孤立节点
        self.show_isolated = show_isolated
        # 是否包含锚点节点
        self.include_anchors = include_anchors

    def validate(self):
        self.validate_required(self.kb_id, 'kb_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.kb_id is not None:
            result['kb_id'] = self.kb_id
        if self.entity_types is not None:
            result['entity_types'] = self.entity_types
        if self.relation_types is not None:
            result['relation_types'] = self.relation_types
        if self.show_isolated is not None:
            result['show_isolated'] = self.show_isolated
        if self.include_anchors is not None:
            result['include_anchors'] = self.include_anchors
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('kb_id') is not None:
            self.kb_id = m.get('kb_id')
        if m.get('entity_types') is not None:
            self.entity_types = m.get('entity_types')
        if m.get('relation_types') is not None:
            self.relation_types = m.get('relation_types')
        if m.get('show_isolated') is not None:
            self.show_isolated = m.get('show_isolated')
        if m.get('include_anchors') is not None:
            self.include_anchors = m.get('include_anchors')
        return self


class QueryKgGraphResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        truncated: bool = None,
        nodes: str = None,
        edges: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果是否被截断
        self.truncated = truncated
        # 节点JSON数组(KbGraphNode字段定义见文档)
        self.nodes = nodes
        # 关系JSON数组(KbGraphEdge字段定义见文档)
        self.edges = edges

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
        if self.truncated is not None:
            result['truncated'] = self.truncated
        if self.nodes is not None:
            result['nodes'] = self.nodes
        if self.edges is not None:
            result['edges'] = self.edges
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('truncated') is not None:
            self.truncated = m.get('truncated')
        if m.get('nodes') is not None:
            self.nodes = m.get('nodes')
        if m.get('edges') is not None:
            self.edges = m.get('edges')
        return self


class FileuploadKmDocumentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # string
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.file_id, 'file_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class FileuploadKmDocumentResponse(TeaModel):
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


