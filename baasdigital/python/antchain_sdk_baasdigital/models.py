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


class DigitalProjectList(TeaModel):
    def __init__(
        self,
        project_id: str = None,
        name: str = None,
        description: str = None,
        project_status: str = None,
        create_time: int = None,
        symbol: str = None,
        amount: int = None,
    ):
        # 项目id
        self.project_id = project_id
        # 项目名称
        self.name = name
        # 项目描述
        self.description = description
        # 项目状态
        self.project_status = project_status
        # 创建时间戳
        self.create_time = create_time
        # 合约symbol
        self.symbol = symbol
        # 发行数量
        self.amount = amount

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.project_status is not None:
            result['project_status'] = self.project_status
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.symbol is not None:
            result['symbol'] = self.symbol
        if self.amount is not None:
            result['amount'] = self.amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('project_status') is not None:
            self.project_status = m.get('project_status')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('symbol') is not None:
            self.symbol = m.get('symbol')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        return self


class ResourceBundle(TeaModel):
    def __init__(
        self,
        uri: str = None,
        type: str = None,
        description: str = None,
    ):
        # 可公开访问的资源地址
        self.uri = uri
        # 上传资源时指定的资源类型
        self.type = type
        # 资源描述
        self.description = description

    def validate(self):
        self.validate_required(self.uri, 'uri')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.uri is not None:
            result['uri'] = self.uri
        if self.type is not None:
            result['type'] = self.type
        if self.description is not None:
            result['description'] = self.description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('uri') is not None:
            self.uri = m.get('uri')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('description') is not None:
            self.description = m.get('description')
        return self


class AccountInfo(TeaModel):
    def __init__(
        self,
        account: str = None,
        kms_id: str = None,
        tenant_id: str = None,
        sign_data: str = None,
    ):
        # 托管账户的账户名称，也是链上账户名称，交易发起方账户
        self.account = account
        # 托管账户对应的秘钥ID
        self.kms_id = kms_id
        # 托管账户对应的租户ID，默认为空，如有使用其他租户的托管账户时需指定
        self.tenant_id = tenant_id
        # 非托管模式下必须输入，客户端构建交易出的信息，base64编码
        self.sign_data = sign_data

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.account is not None:
            result['account'] = self.account
        if self.kms_id is not None:
            result['kms_id'] = self.kms_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.sign_data is not None:
            result['sign_data'] = self.sign_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('kms_id') is not None:
            self.kms_id = m.get('kms_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('sign_data') is not None:
            self.sign_data = m.get('sign_data')
        return self


class AliYunDigitalProjectListView(TeaModel):
    def __init__(
        self,
        page_index: int = None,
        page_size: int = None,
        total_size: int = None,
        project_list: List[DigitalProjectList] = None,
    ):
        # 分页编号
        self.page_index = page_index
        # 单页行数
        self.page_size = page_size
        # 数据总行数
        self.total_size = total_size
        # 查询结果列表
        self.project_list = project_list

    def validate(self):
        if self.project_list:
            for k in self.project_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_size is not None:
            result['total_size'] = self.total_size
        result['project_list'] = []
        if self.project_list is not None:
            for k in self.project_list:
                result['project_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_size') is not None:
            self.total_size = m.get('total_size')
        self.project_list = []
        if m.get('project_list') is not None:
            for k in m.get('project_list'):
                temp_model = DigitalProjectList()
                self.project_list.append(temp_model.from_map(k))
        return self


class DigitalProject(TeaModel):
    def __init__(
        self,
        project_id: str = None,
        biz_type: int = None,
        name: str = None,
        symbol: str = None,
        description: str = None,
        project_status: str = None,
        amount: int = None,
        asset_uri: str = None,
        limited_amount: bool = None,
        write_offable: bool = None,
        burnable: bool = None,
        owner_account: str = None,
        issuer_list: List[str] = None,
        writeoff_list: List[str] = None,
        create_time: int = None,
    ):
        # 数字权证项目id
        self.project_id = project_id
        # 模版类型
        # 1为共享型，2为独享型，3为高性能共享型，4为高性能独享型
        self.biz_type = biz_type
        # 数字权证项目名称
        self.name = name
        # 合约symbol
        self.symbol = symbol
        # 数字权证项目描述
        self.description = description
        # 项目状态：
        # deploy：已部署(可更新)
        # issue：已发布(不可更新)
        self.project_status = project_status
        # 项目发行权证的总数，高性能版本显示为0
        self.amount = amount
        # 权证的uri信息（共享tokenuri模式有该字段）
        self.asset_uri = asset_uri
        # 项目发行后权证数量是否可增发，高性能版本显示为支持
        # 
        self.limited_amount = limited_amount
        # 项目权证是否可核销
        self.write_offable = write_offable
        # 项目权证是否可销毁
        self.burnable = burnable
        # 项目管理员账户地址
        self.owner_account = owner_account
        # 项目核销员账户地址列表
        self.issuer_list = issuer_list
        # 项目核销员账户地址列表
        self.writeoff_list = writeoff_list
        # 合约创建时间
        self.create_time = create_time

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.name, 'name')
        self.validate_required(self.symbol, 'symbol')
        self.validate_required(self.description, 'description')
        self.validate_required(self.project_status, 'project_status')
        self.validate_required(self.amount, 'amount')
        self.validate_required(self.limited_amount, 'limited_amount')
        self.validate_required(self.write_offable, 'write_offable')
        self.validate_required(self.burnable, 'burnable')
        self.validate_required(self.owner_account, 'owner_account')
        self.validate_required(self.create_time, 'create_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.name is not None:
            result['name'] = self.name
        if self.symbol is not None:
            result['symbol'] = self.symbol
        if self.description is not None:
            result['description'] = self.description
        if self.project_status is not None:
            result['project_status'] = self.project_status
        if self.amount is not None:
            result['amount'] = self.amount
        if self.asset_uri is not None:
            result['asset_uri'] = self.asset_uri
        if self.limited_amount is not None:
            result['limited_amount'] = self.limited_amount
        if self.write_offable is not None:
            result['write_offable'] = self.write_offable
        if self.burnable is not None:
            result['burnable'] = self.burnable
        if self.owner_account is not None:
            result['owner_account'] = self.owner_account
        if self.issuer_list is not None:
            result['issuer_list'] = self.issuer_list
        if self.writeoff_list is not None:
            result['writeoff_list'] = self.writeoff_list
        if self.create_time is not None:
            result['create_time'] = self.create_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('symbol') is not None:
            self.symbol = m.get('symbol')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('project_status') is not None:
            self.project_status = m.get('project_status')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('asset_uri') is not None:
            self.asset_uri = m.get('asset_uri')
        if m.get('limited_amount') is not None:
            self.limited_amount = m.get('limited_amount')
        if m.get('write_offable') is not None:
            self.write_offable = m.get('write_offable')
        if m.get('burnable') is not None:
            self.burnable = m.get('burnable')
        if m.get('owner_account') is not None:
            self.owner_account = m.get('owner_account')
        if m.get('issuer_list') is not None:
            self.issuer_list = m.get('issuer_list')
        if m.get('writeoff_list') is not None:
            self.writeoff_list = m.get('writeoff_list')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        return self


class AssetUriDefinition(TeaModel):
    def __init__(
        self,
        name: str = None,
        description: str = None,
        image: str = None,
        external_url: str = None,
        background_color: str = None,
        animation_url: str = None,
        resource_bundle: List[ResourceBundle] = None,
        attributes: List[str] = None,
    ):
        # 数字权证名称
        self.name = name
        # 数字权证描述
        self.description = description
        # 该权证的图片地址
        self.image = image
        # 资产指向外部的链接
        self.external_url = external_url
        # 背景颜色, 16进制6位Hex
        self.background_color = background_color
        # 动态资源地址，可指向音视频资源，需先上传
        self.animation_url = animation_url
        # 资源集合，可定义多个组合资源，适合有多资源文件的资产
        self.resource_bundle = resource_bundle
        # 自定义的资产属性数组，数组元素需为json格式
        self.attributes = attributes

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.description, 'description')
        self.validate_required(self.image, 'image')
        if self.resource_bundle:
            for k in self.resource_bundle:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.image is not None:
            result['image'] = self.image
        if self.external_url is not None:
            result['external_url'] = self.external_url
        if self.background_color is not None:
            result['background_color'] = self.background_color
        if self.animation_url is not None:
            result['animation_url'] = self.animation_url
        result['resource_bundle'] = []
        if self.resource_bundle is not None:
            for k in self.resource_bundle:
                result['resource_bundle'].append(k.to_map() if k else None)
        if self.attributes is not None:
            result['attributes'] = self.attributes
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('image') is not None:
            self.image = m.get('image')
        if m.get('external_url') is not None:
            self.external_url = m.get('external_url')
        if m.get('background_color') is not None:
            self.background_color = m.get('background_color')
        if m.get('animation_url') is not None:
            self.animation_url = m.get('animation_url')
        self.resource_bundle = []
        if m.get('resource_bundle') is not None:
            for k in m.get('resource_bundle'):
                temp_model = ResourceBundle()
                self.resource_bundle.append(temp_model.from_map(k))
        if m.get('attributes') is not None:
            self.attributes = m.get('attributes')
        return self


class AliYunDigitalServiceInfo(TeaModel):
    def __init__(
        self,
        project_count: int = None,
        project_limit: int = None,
        storage_used: int = None,
        storage_limit: int = None,
        traffic_daily_used: int = None,
        traffic_daily_limit: int = None,
    ):
        # 项目总数
        self.project_count = project_count
        # 项目上限
        self.project_limit = project_limit
        # 资源存储使用量
        self.storage_used = storage_used
        # 资源存储容量上限
        self.storage_limit = storage_limit
        # 日访问流量
        self.traffic_daily_used = traffic_daily_used
        # 日流量上限
        self.traffic_daily_limit = traffic_daily_limit

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.project_count is not None:
            result['project_count'] = self.project_count
        if self.project_limit is not None:
            result['project_limit'] = self.project_limit
        if self.storage_used is not None:
            result['storage_used'] = self.storage_used
        if self.storage_limit is not None:
            result['storage_limit'] = self.storage_limit
        if self.traffic_daily_used is not None:
            result['traffic_daily_used'] = self.traffic_daily_used
        if self.traffic_daily_limit is not None:
            result['traffic_daily_limit'] = self.traffic_daily_limit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('project_count') is not None:
            self.project_count = m.get('project_count')
        if m.get('project_limit') is not None:
            self.project_limit = m.get('project_limit')
        if m.get('storage_used') is not None:
            self.storage_used = m.get('storage_used')
        if m.get('storage_limit') is not None:
            self.storage_limit = m.get('storage_limit')
        if m.get('traffic_daily_used') is not None:
            self.traffic_daily_used = m.get('traffic_daily_used')
        if m.get('traffic_daily_limit') is not None:
            self.traffic_daily_limit = m.get('traffic_daily_limit')
        return self


class JudgeAliyunServiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        consortium_id: str = None,
        bizid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.consortium_id = consortium_id
        # 蚂蚁链ID
        self.bizid = bizid

    def validate(self):
        self.validate_required(self.consortium_id, 'consortium_id')
        self.validate_required(self.bizid, 'bizid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        return self


class JudgeAliyunServiceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 0；未开通；
        # 1：开通中；
        # 2：已开通；
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


class OpenAliyunServiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        consortium_id: str = None,
        bizid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.consortium_id = consortium_id
        # 蚂蚁链ID
        self.bizid = bizid

    def validate(self):
        self.validate_required(self.consortium_id, 'consortium_id')
        self.validate_required(self.bizid, 'bizid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        return self


class OpenAliyunServiceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 1：开通中； 2：已开通；
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


class DetailAliyunServiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 蚂蚁链ID
        self.bizid = bizid

    def validate(self):
        self.validate_required(self.bizid, 'bizid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

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


class DetailAliyunServiceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: AliYunDigitalServiceInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数字权证服务详情
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
            temp_model = AliYunDigitalServiceInfo()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryAliyunProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        name: str = None,
        project_id: str = None,
        project_status: str = None,
        start_time: int = None,
        end_time: int = None,
        page_index: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 蚂蚁链ID
        self.bizid = bizid
        # 项目名称
        self.name = name
        # 项目id
        self.project_id = project_id
        # 项目状态
        self.project_status = project_status
        # 创建起始日期时间戳
        self.start_time = start_time
        # 创建结束时间戳
        self.end_time = end_time
        # 分页页码，默认0
        self.page_index = page_index
        # 单页数量，默认10
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.page_index, 'page_index')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.name is not None:
            result['name'] = self.name
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.project_status is not None:
            result['project_status'] = self.project_status
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('project_status') is not None:
            self.project_status = m.get('project_status')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryAliyunProjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: AliYunDigitalProjectListView = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 权证项目列表
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
            temp_model = AliYunDigitalProjectListView()
            self.result = temp_model.from_map(m['result'])
        return self


class CheckAliyunAccessRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链id
        self.bizid = bizid

    def validate(self):
        self.validate_required(self.bizid, 'bizid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

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


class CheckAliyunAccessResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否是数字权证链
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


class CheckAccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        account: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 账户名称
        self.account = account

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.account, 'account')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.account is not None:
            result['account'] = self.account
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('account') is not None:
            self.account = m.get('account')
        return self


class CheckAccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 账户存在且状态正常
        self.status = status

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


class CreateAccountKmsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        account: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链id
        self.bizid = bizid
        # 链账户名称，支持长度100以内的，大小写字母、数字、下划线、横线、@、点
        self.account = account
        # 托管账户所在的租户，默认为调用者的租户
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.account, 'account')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.account is not None:
            result['account'] = self.account
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class CreateAccountKmsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pub_key: str = None,
        my_kms_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 账户公钥
        self.pub_key = pub_key
        # 托管秘钥ID
        self.my_kms_id = my_kms_id

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
        if self.pub_key is not None:
            result['pub_key'] = self.pub_key
        if self.my_kms_id is not None:
            result['my_kms_id'] = self.my_kms_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pub_key') is not None:
            self.pub_key = m.get('pub_key')
        if m.get('my_kms_id') is not None:
            self.my_kms_id = m.get('my_kms_id')
        return self


class CreateResourcePolicyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        file_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 上传文件名，实际服务端文件名称会使用随机字符串，这里需上传指定后缀的文件
        self.file_name = file_name

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.file_name, 'file_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.file_name is not None:
            result['file_name'] = self.file_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        return self


class CreateResourcePolicyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        name: str = None,
        accessid: str = None,
        host: str = None,
        policy: str = None,
        signature: str = None,
        expire: str = None,
        mime_type: str = None,
        dir: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 最终上传至服务端的实际文件名称
        self.name = name
        # 用户请求的AccessKey ID
        self.accessid = accessid
        # 用户发送上传请求的域名。
        self.host = host
        # 用户表单上传的策略（Policy），Policy为经过Ba...
        self.policy = policy
        # 对Policy签名后的字符串
        self.signature = signature
        # 由服务器端指定的Policy过期时间，格式为Unix时间戳
        self.expire = expire
        # 文件类型
        self.mime_type = mime_type
        # 
        # 限制上传的文件名称
        self.dir = dir

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
        if self.name is not None:
            result['name'] = self.name
        if self.accessid is not None:
            result['accessid'] = self.accessid
        if self.host is not None:
            result['host'] = self.host
        if self.policy is not None:
            result['policy'] = self.policy
        if self.signature is not None:
            result['signature'] = self.signature
        if self.expire is not None:
            result['expire'] = self.expire
        if self.mime_type is not None:
            result['mime_type'] = self.mime_type
        if self.dir is not None:
            result['dir'] = self.dir
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('accessid') is not None:
            self.accessid = m.get('accessid')
        if m.get('host') is not None:
            self.host = m.get('host')
        if m.get('policy') is not None:
            self.policy = m.get('policy')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        if m.get('expire') is not None:
            self.expire = m.get('expire')
        if m.get('mime_type') is not None:
            self.mime_type = m.get('mime_type')
        if m.get('dir') is not None:
            self.dir = m.get('dir')
        return self


class CheckResourceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        real_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 创建资源上传规则url时生成的服务端文件名称
        self.real_name = real_name

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.real_name, 'real_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.real_name is not None:
            result['real_name'] = self.real_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('real_name') is not None:
            self.real_name = m.get('real_name')
        return self


class CheckResourceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        access_url: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 可公开访问的资源地址。为空则表示暂时无法访问
        self.access_url = access_url
        # upload：文件已上传
        # check：内容检测中
        # invalid：图片不可访问
        # pass：可公开访问
        # publish：已绑定至某个项目
        self.status = status

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
        if self.access_url is not None:
            result['access_url'] = self.access_url
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
        if m.get('access_url') is not None:
            self.access_url = m.get('access_url')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class CreateAsseturiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        asset_uri_definition: AssetUriDefinition = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 数字权证asset uri定义
        self.asset_uri_definition = asset_uri_definition

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.asset_uri_definition, 'asset_uri_definition')
        if self.asset_uri_definition:
            self.asset_uri_definition.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.asset_uri_definition is not None:
            result['asset_uri_definition'] = self.asset_uri_definition.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('asset_uri_definition') is not None:
            temp_model = AssetUriDefinition()
            self.asset_uri_definition = temp_model.from_map(m['asset_uri_definition'])
        return self


class CreateAsseturiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        access_uri: str = None,
        json_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 可公开访问的asseturi地址。
        self.access_uri = access_uri
        # assetUri文件内容
        self.json_info = json_info

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
        if self.access_uri is not None:
            result['access_uri'] = self.access_uri
        if self.json_info is not None:
            result['json_info'] = self.json_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('access_uri') is not None:
            self.access_uri = m.get('access_uri')
        if m.get('json_info') is not None:
            self.json_info = m.get('json_info')
        return self


class QueryProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        project_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 数字权证项目ID
        self.project_id = project_id

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.project_id, 'project_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.project_id is not None:
            result['project_id'] = self.project_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        return self


class QueryProjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: DigitalProject = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询单一数字权证项目返回信息
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
            temp_model = DigitalProject()
            self.result = temp_model.from_map(m['result'])
        return self


class CreateProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        name: str = None,
        symbol: str = None,
        description: str = None,
        biz_type: int = None,
        amount: int = None,
        asset_uri: str = None,
        limited_amount: bool = None,
        write_offable: bool = None,
        burnable: bool = None,
        owner_account: str = None,
        issuer_list: List[str] = None,
        writeoff_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 项目名称
        self.name = name
        # 数字合约symbol，biz_type为5(1155标准)时，可不输入。其他情况必须输入
        self.symbol = symbol
        # 数字权证项目描述信息
        self.description = description
        # 模版类型
        # 1为共享型，2为独享型，3为共享型(高性能)，4为独享型(高性能)
        # 5为1155标准
        self.biz_type = biz_type
        # 项目发行权证数量上限，普通版本需设置发行上限，高性能版本无需设置。
        self.amount = amount
        # 数字权证链接，共享时必须传入
        self.asset_uri = asset_uri
        # 是否可增发，普通版本需设置，高性能版本默认为可增发。
        self.limited_amount = limited_amount
        # 是否可核销
        self.write_offable = write_offable
        # 是否可销毁
        self.burnable = burnable
        # 项目管理者，必须是链上已存在的账户，只有管理者可以修改项目信息
        self.owner_account = owner_account
        # 发行者列表，必须是链上已经存在的账户，只有发行者具备权证发行权限。
        self.issuer_list = issuer_list
        # 核销者列表，必须是链上已经存在的账户，只有核销者才可以核销权证
        self.writeoff_list = writeoff_list

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 100)
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.write_offable, 'write_offable')
        self.validate_required(self.burnable, 'burnable')
        self.validate_required(self.owner_account, 'owner_account')
        self.validate_required(self.issuer_list, 'issuer_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.name is not None:
            result['name'] = self.name
        if self.symbol is not None:
            result['symbol'] = self.symbol
        if self.description is not None:
            result['description'] = self.description
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.amount is not None:
            result['amount'] = self.amount
        if self.asset_uri is not None:
            result['asset_uri'] = self.asset_uri
        if self.limited_amount is not None:
            result['limited_amount'] = self.limited_amount
        if self.write_offable is not None:
            result['write_offable'] = self.write_offable
        if self.burnable is not None:
            result['burnable'] = self.burnable
        if self.owner_account is not None:
            result['owner_account'] = self.owner_account
        if self.issuer_list is not None:
            result['issuer_list'] = self.issuer_list
        if self.writeoff_list is not None:
            result['writeoff_list'] = self.writeoff_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('symbol') is not None:
            self.symbol = m.get('symbol')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('asset_uri') is not None:
            self.asset_uri = m.get('asset_uri')
        if m.get('limited_amount') is not None:
            self.limited_amount = m.get('limited_amount')
        if m.get('write_offable') is not None:
            self.write_offable = m.get('write_offable')
        if m.get('burnable') is not None:
            self.burnable = m.get('burnable')
        if m.get('owner_account') is not None:
            self.owner_account = m.get('owner_account')
        if m.get('issuer_list') is not None:
            self.issuer_list = m.get('issuer_list')
        if m.get('writeoff_list') is not None:
            self.writeoff_list = m.get('writeoff_list')
        return self


class CreateProjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        project_id: str = None,
        hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 项目id
        self.project_id = project_id
        # 部署该项目到区块链的hash值
        self.hash = hash

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
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.hash is not None:
            result['hash'] = self.hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        return self


class UpdateProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        project_id: str = None,
        amount: int = None,
        limited_amount: bool = None,
        write_offable: bool = None,
        burnable: bool = None,
        account_info: AccountInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 数字权证项目ID
        self.project_id = project_id
        # 项目发行权证的总数上限。如果设置为可增发，则可以使用增发接口提高总数量上限。
        # 高性能版本不支持修改上限。
        self.amount = amount
        # 项目发行后权证数量是否可增发。
        # true:可增发
        # false:不可增发
        # 高性能版本不支持修改此配置
        self.limited_amount = limited_amount
        # 项目权证是否可核销。false:不可核销；true:可核销
        self.write_offable = write_offable
        # 项目权证是否可销毁。false:不可销毁；true:可销毁
        self.burnable = burnable
        # 托管账户信息(推荐)，托管和非拖管必选一种
        self.account_info = account_info

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.project_id, 'project_id')
        if self.amount is not None:
            self.validate_minimum(self.amount, 'amount', 1)
        self.validate_required(self.account_info, 'account_info')
        if self.account_info:
            self.account_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.amount is not None:
            result['amount'] = self.amount
        if self.limited_amount is not None:
            result['limited_amount'] = self.limited_amount
        if self.write_offable is not None:
            result['write_offable'] = self.write_offable
        if self.burnable is not None:
            result['burnable'] = self.burnable
        if self.account_info is not None:
            result['account_info'] = self.account_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('limited_amount') is not None:
            self.limited_amount = m.get('limited_amount')
        if m.get('write_offable') is not None:
            self.write_offable = m.get('write_offable')
        if m.get('burnable') is not None:
            self.burnable = m.get('burnable')
        if m.get('account_info') is not None:
            temp_model = AccountInfo()
            self.account_info = temp_model.from_map(m['account_info'])
        return self


class UpdateProjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否更新成功
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


class ExecContractIssueRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        project_id: str = None,
        trace_id: str = None,
        asset_id: str = None,
        asset_uri: str = None,
        to_account: str = None,
        account_info: AccountInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 数字权证项目ID
        self.project_id = project_id
        # 业务方请求唯一标识，用于异步查询交易情况
        self.trace_id = trace_id
        # 权证ID，线下生成，保证唯一，asset_id长度限制为64，只支持英文字符和数字
        self.asset_id = asset_id
        # 数字权证标准URI协议文件，权证信息
        self.asset_uri = asset_uri
        # 权证发行的目标账户
        self.to_account = to_account
        # 托管账户信息(推荐)，托管和非拖管必选一种
        self.account_info = account_info

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.asset_uri, 'asset_uri')
        self.validate_required(self.to_account, 'to_account')
        self.validate_required(self.account_info, 'account_info')
        if self.account_info:
            self.account_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.asset_uri is not None:
            result['asset_uri'] = self.asset_uri
        if self.to_account is not None:
            result['to_account'] = self.to_account
        if self.account_info is not None:
            result['account_info'] = self.account_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('asset_uri') is not None:
            self.asset_uri = m.get('asset_uri')
        if m.get('to_account') is not None:
            self.to_account = m.get('to_account')
        if m.get('account_info') is not None:
            temp_model = AccountInfo()
            self.account_info = temp_model.from_map(m['account_info'])
        return self


class ExecContractIssueResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trace_id: str = None,
        hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户端传入的请求唯一标识
        self.trace_id = trace_id
        # 交易hash，可通过hash查询上链结果
        self.hash = hash

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
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.hash is not None:
            result['hash'] = self.hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        return self


class ListProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链id
        self.bizid = bizid

    def validate(self):
        self.validate_required(self.bizid, 'bizid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

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


class ListProjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        id_list: List[str] = None,
        total: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 项目ID列表
        self.id_list = id_list
        # 链上项目总数
        self.total = total

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
        if self.id_list is not None:
            result['id_list'] = self.id_list
        if self.total is not None:
            result['total'] = self.total
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('id_list') is not None:
            self.id_list = m.get('id_list')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class QueryContractTransactionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        trace_id: str = None,
        tenant_id: str = None,
        hash: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链id
        self.bizid = bizid
        # 业务方请求唯一标识，用于异步查询交易情况。
        # trace_id 和hash至少选择一种，都输入时，使用trace_id查询
        self.trace_id = trace_id
        # 租户id，默认为空
        self.tenant_id = tenant_id
        # 查询的交易hash
        self.hash = hash

    def validate(self):
        self.validate_required(self.bizid, 'bizid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
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
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        return self


class QueryContractTransactionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        block_number: int = None,
        hash: str = None,
        input: str = None,
        timestamp: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易所在区块高度
        self.block_number = block_number
        # 交易hash
        self.hash = hash
        # 该笔交易输入参数(base64编码)
        self.input = input
        # 交易时间戳
        self.timestamp = timestamp

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
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.hash is not None:
            result['hash'] = self.hash
        if self.input is not None:
            result['input'] = self.input
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('input') is not None:
            self.input = m.get('input')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        return self


class QueryContractReceiptRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        trace_id: str = None,
        tenant_id: str = None,
        hash: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链id
        self.bizid = bizid
        # 业务方请求唯一标识，用于异步查询交易情况。 trace_id 和hash至少选择一种，都输入时，使用trace_id查询
        self.trace_id = trace_id
        # 租户id
        self.tenant_id = tenant_id
        # 查询的交易hash
        self.hash = hash

    def validate(self):
        self.validate_required(self.bizid, 'bizid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
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
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        return self


class QueryContractReceiptResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: int = None,
        block_number: int = None,
        hash: str = None,
        output: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果执行结果code，一般为0则表示交易执行成功，非0则表示交易执行过程中发送了异常
        self.result = result
        # 交易所在区块高度
        self.block_number = block_number
        # 交易hash
        self.hash = hash
        # 该笔交易执行的返回值(base64编码)，一般为合约方法中return的值
        self.output = output

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
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.hash is not None:
            result['hash'] = self.hash
        if self.output is not None:
            result['output'] = self.output
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
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('output') is not None:
            self.output = m.get('output')
        return self


class ExecContractAddsupplyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        project_id: str = None,
        trace_id: str = None,
        increase: int = None,
        account_info: AccountInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 数字权证项目ID
        self.project_id = project_id
        # 业务方请求唯一标识，用于异步查询交易情况
        self.trace_id = trace_id
        # 增发数值，非零
        self.increase = increase
        # 托管账户信息(推荐)，托管和非拖管必选一种
        self.account_info = account_info

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.increase, 'increase')
        if self.increase is not None:
            self.validate_minimum(self.increase, 'increase', 1)
        self.validate_required(self.account_info, 'account_info')
        if self.account_info:
            self.account_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.increase is not None:
            result['increase'] = self.increase
        if self.account_info is not None:
            result['account_info'] = self.account_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('increase') is not None:
            self.increase = m.get('increase')
        if m.get('account_info') is not None:
            temp_model = AccountInfo()
            self.account_info = temp_model.from_map(m['account_info'])
        return self


class ExecContractAddsupplyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trace_id: str = None,
        hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户端传入的请求唯一标识
        self.trace_id = trace_id
        # 交易hash，可通过hash查询上链结果
        self.hash = hash

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
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.hash is not None:
            result['hash'] = self.hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        return self


class ExecContractTransferRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        project_id: str = None,
        trace_id: str = None,
        from_: str = None,
        to: str = None,
        asset_id: str = None,
        account_info: AccountInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 数字权证项目ID
        self.project_id = project_id
        # 业务方请求唯一标识，用于异步查询交易情况
        self.trace_id = trace_id
        # 权证所有者账户
        self.from_ = from_
        # 转移的目标账户
        self.to = to
        # 转移的目标权证
        self.asset_id = asset_id
        # 托管账户信息(推荐)，托管和非拖管必选一种
        self.account_info = account_info

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.from_, 'from_')
        self.validate_required(self.to, 'to')
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.account_info, 'account_info')
        if self.account_info:
            self.account_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.account_info is not None:
            result['account_info'] = self.account_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('account_info') is not None:
            temp_model = AccountInfo()
            self.account_info = temp_model.from_map(m['account_info'])
        return self


class ExecContractTransferResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trace_id: str = None,
        hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户端传入的请求唯一标识
        self.trace_id = trace_id
        # 交易hash，可通过hash查询上链结果
        self.hash = hash

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
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.hash is not None:
            result['hash'] = self.hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        return self


class ExecContractWriteoffRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        project_id: str = None,
        trace_id: str = None,
        asset_id: str = None,
        account_info: AccountInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 数字权证项目ID
        self.project_id = project_id
        # 业务方请求唯一标识，用于异步查询交易情况
        self.trace_id = trace_id
        # 被核销的目标权证
        self.asset_id = asset_id
        # 托管账户信息(推荐)，托管和非拖管必选一种
        self.account_info = account_info

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.account_info, 'account_info')
        if self.account_info:
            self.account_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.account_info is not None:
            result['account_info'] = self.account_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('account_info') is not None:
            temp_model = AccountInfo()
            self.account_info = temp_model.from_map(m['account_info'])
        return self


class ExecContractWriteoffResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trace_id: str = None,
        hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户端传入的请求唯一标识
        self.trace_id = trace_id
        # 交易hash，可通过hash查询上链结果
        self.hash = hash

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
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.hash is not None:
            result['hash'] = self.hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        return self


class ExecContractBurnoffRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        project_id: str = None,
        trace_id: str = None,
        asset_id: str = None,
        account_info: AccountInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 数字权证项目ID
        self.project_id = project_id
        # 业务方请求唯一标识，用于异步查询交易情况
        self.trace_id = trace_id
        # 被销毁的目标权证
        self.asset_id = asset_id
        # 托管账户信息(推荐)，托管和非拖管必选一种
        self.account_info = account_info

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.account_info, 'account_info')
        if self.account_info:
            self.account_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.account_info is not None:
            result['account_info'] = self.account_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('account_info') is not None:
            temp_model = AccountInfo()
            self.account_info = temp_model.from_map(m['account_info'])
        return self


class ExecContractBurnoffResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trace_id: str = None,
        hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户端传入的请求唯一标识
        self.trace_id = trace_id
        # 交易hash，可通过hash查询上链结果
        self.hash = hash

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
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.hash is not None:
            result['hash'] = self.hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        return self


class QueryContractAssetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        project_id: str = None,
        trace_id: str = None,
        account: str = None,
        account_info: AccountInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 数字权证项目ID
        self.project_id = project_id
        # 业务方请求唯一标识，用于异步查询交易情况
        self.trace_id = trace_id
        # 查询的目标账户
        self.account = account
        # 托管账户信息(推荐)，托管和非拖管必选一种
        self.account_info = account_info

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.account, 'account')
        self.validate_required(self.account_info, 'account_info')
        if self.account_info:
            self.account_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.account is not None:
            result['account'] = self.account
        if self.account_info is not None:
            result['account_info'] = self.account_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('account_info') is not None:
            temp_model = AccountInfo()
            self.account_info = temp_model.from_map(m['account_info'])
        return self


class QueryContractAssetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trace_id: str = None,
        account: str = None,
        asset_id_list: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户端传入的请求唯一标识
        self.trace_id = trace_id
        # 客户端传入的查询账户
        self.account = account
        # 目标账户拥有的权证列表
        self.asset_id_list = asset_id_list

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
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.account is not None:
            result['account'] = self.account
        if self.asset_id_list is not None:
            result['asset_id_list'] = self.asset_id_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('asset_id_list') is not None:
            self.asset_id_list = m.get('asset_id_list')
        return self


class QueryContractAsseturiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        project_id: str = None,
        trace_id: str = None,
        asset_id: str = None,
        account_info: AccountInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 数字权证项目ID
        self.project_id = project_id
        # 业务方请求唯一标识，用于异步查询交易情况
        self.trace_id = trace_id
        # 查询的权证ID
        self.asset_id = asset_id
        # 托管账户信息(推荐)，托管和非拖管必选一种
        self.account_info = account_info

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.account_info, 'account_info')
        if self.account_info:
            self.account_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.account_info is not None:
            result['account_info'] = self.account_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('account_info') is not None:
            temp_model = AccountInfo()
            self.account_info = temp_model.from_map(m['account_info'])
        return self


class QueryContractAsseturiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trace_id: str = None,
        asset_id: str = None,
        asset_uri: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户端传入的请求唯一标识
        self.trace_id = trace_id
        # 客户端传入的权证id
        self.asset_id = asset_id
        # 数字权证绑定的标准URI协议文件，权证信息
        self.asset_uri = asset_uri

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
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.asset_uri is not None:
            result['asset_uri'] = self.asset_uri
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('asset_uri') is not None:
            self.asset_uri = m.get('asset_uri')
        return self


class ExecContractApproveRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        project_id: str = None,
        trace_id: str = None,
        asset_id: str = None,
        to_account: str = None,
        account_info: AccountInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 数字权证项目ID
        self.project_id = project_id
        # 业务方请求唯一标识，用于异步查询交易情况
        self.trace_id = trace_id
        # 被授权的目标权证
        self.asset_id = asset_id
        # 被授权的目标账户
        self.to_account = to_account
        # 托管账户信息(推荐)，托管和非拖管必选一种
        self.account_info = account_info

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.to_account, 'to_account')
        self.validate_required(self.account_info, 'account_info')
        if self.account_info:
            self.account_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.to_account is not None:
            result['to_account'] = self.to_account
        if self.account_info is not None:
            result['account_info'] = self.account_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('to_account') is not None:
            self.to_account = m.get('to_account')
        if m.get('account_info') is not None:
            temp_model = AccountInfo()
            self.account_info = temp_model.from_map(m['account_info'])
        return self


class ExecContractApproveResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trace_id: str = None,
        hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户端传入的请求唯一标识
        self.trace_id = trace_id
        # 交易hash，可通过hash查询上链结果
        self.hash = hash

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
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.hash is not None:
            result['hash'] = self.hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        return self


class CancelContractApproveRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        project_id: str = None,
        trace_id: str = None,
        asset_id: str = None,
        account_info: AccountInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 数字权证项目ID
        self.project_id = project_id
        # 业务方请求唯一标识，用于异步查询交易情况
        self.trace_id = trace_id
        # 被取消授权的目标权证ID
        self.asset_id = asset_id
        # 托管账户信息(推荐)，托管和非拖管必选一种
        self.account_info = account_info

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.account_info, 'account_info')
        if self.account_info:
            self.account_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.account_info is not None:
            result['account_info'] = self.account_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('account_info') is not None:
            temp_model = AccountInfo()
            self.account_info = temp_model.from_map(m['account_info'])
        return self


class CancelContractApproveResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trace_id: str = None,
        hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户端传入的请求唯一标识
        self.trace_id = trace_id
        # 交易hash，可通过hash查询上链结果
        self.hash = hash

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
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.hash is not None:
            result['hash'] = self.hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        return self


class SetContractRoleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        project_id: str = None,
        trace_id: str = None,
        account: str = None,
        role: str = None,
        account_info: AccountInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 数字权证项目ID
        self.project_id = project_id
        # 业务方请求唯一标识，用于异步查询交易情况
        self.trace_id = trace_id
        # 授权的目标账户
        self.account = account
        # 项目中的权证管理角色，目前支持两种：
        # 1.【issuer】发行者角色
        # 2.【writeoff】核销者
        # 输入不区分大小写
        self.role = role
        # 托管账户信息(推荐)，托管和非拖管必选一种
        self.account_info = account_info

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.account, 'account')
        self.validate_required(self.role, 'role')
        self.validate_required(self.account_info, 'account_info')
        if self.account_info:
            self.account_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.account is not None:
            result['account'] = self.account
        if self.role is not None:
            result['role'] = self.role
        if self.account_info is not None:
            result['account_info'] = self.account_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('role') is not None:
            self.role = m.get('role')
        if m.get('account_info') is not None:
            temp_model = AccountInfo()
            self.account_info = temp_model.from_map(m['account_info'])
        return self


class SetContractRoleResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trace_id: str = None,
        hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户端传入的请求唯一标识
        self.trace_id = trace_id
        # 交易hash，可通过hash查询上链结果
        self.hash = hash

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
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.hash is not None:
            result['hash'] = self.hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        return self


class CancelContractRoleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        project_id: str = None,
        trace_id: str = None,
        account: str = None,
        role: str = None,
        account_info: AccountInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 数字权证项目ID
        self.project_id = project_id
        # 业务方请求唯一标识，用于异步查询交易情况
        self.trace_id = trace_id
        # 被取消的目标账户
        self.account = account
        # 被取消的角色，目前支持两种：
        # 1.【issuer】发行者角色
        # 2.【writeoff】核销者
        # 输入不区分大小写
        self.role = role
        # 托管账户信息(推荐)，托管和非拖管必选一种
        self.account_info = account_info

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.account, 'account')
        self.validate_required(self.role, 'role')
        self.validate_required(self.account_info, 'account_info')
        if self.account_info:
            self.account_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.account is not None:
            result['account'] = self.account
        if self.role is not None:
            result['role'] = self.role
        if self.account_info is not None:
            result['account_info'] = self.account_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('role') is not None:
            self.role = m.get('role')
        if m.get('account_info') is not None:
            temp_model = AccountInfo()
            self.account_info = temp_model.from_map(m['account_info'])
        return self


class CancelContractRoleResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trace_id: str = None,
        hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户端传入的请求唯一标识
        self.trace_id = trace_id
        # 交易hash，可通过hash查询上链结果
        self.hash = hash

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
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.hash is not None:
            result['hash'] = self.hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        return self


class ExecContractBatchissueRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        project_id: str = None,
        trace_id: str = None,
        to_account: str = None,
        amount: int = None,
        account_info: AccountInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 数字权证项目ID
        self.project_id = project_id
        # 业务方请求唯一标识，用于异步查询交易情况
        self.trace_id = trace_id
        # 权证发行的目标账户
        self.to_account = to_account
        # 批量发行个数，单次最多发行20个，建议多次分批执行
        self.amount = amount
        # 托管账户信息(推荐)，托管和非拖管必选一种
        self.account_info = account_info

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.to_account, 'to_account')
        self.validate_required(self.amount, 'amount')
        if self.amount is not None:
            self.validate_minimum(self.amount, 'amount', 1)
        self.validate_required(self.account_info, 'account_info')
        if self.account_info:
            self.account_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.to_account is not None:
            result['to_account'] = self.to_account
        if self.amount is not None:
            result['amount'] = self.amount
        if self.account_info is not None:
            result['account_info'] = self.account_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('to_account') is not None:
            self.to_account = m.get('to_account')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('account_info') is not None:
            temp_model = AccountInfo()
            self.account_info = temp_model.from_map(m['account_info'])
        return self


class ExecContractBatchissueResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trace_id: str = None,
        hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户端传入的请求唯一标识
        self.trace_id = trace_id
        # 交易hash，可通过hash查询上链结果
        self.hash = hash

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
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.hash is not None:
            result['hash'] = self.hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        return self


class ExecContractListissueRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        project_id: str = None,
        trace_id: str = None,
        to_account: str = None,
        asset_list: List[str] = None,
        account_info: AccountInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链id
        self.bizid = bizid
        # 数字权证项目ID
        self.project_id = project_id
        # 业务方请求唯一标识，用于异步查询交易情况
        self.trace_id = trace_id
        # 权证发行的目标账户
        self.to_account = to_account
        # 批量发行的资产id列表，单次最多发20个，asset_id长度限制为64，只支持英文字符和数字
        self.asset_list = asset_list
        # 托管账户信息(推荐)，托管和非拖管必选一种
        self.account_info = account_info

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.to_account, 'to_account')
        self.validate_required(self.asset_list, 'asset_list')
        self.validate_required(self.account_info, 'account_info')
        if self.account_info:
            self.account_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.to_account is not None:
            result['to_account'] = self.to_account
        if self.asset_list is not None:
            result['asset_list'] = self.asset_list
        if self.account_info is not None:
            result['account_info'] = self.account_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('to_account') is not None:
            self.to_account = m.get('to_account')
        if m.get('asset_list') is not None:
            self.asset_list = m.get('asset_list')
        if m.get('account_info') is not None:
            temp_model = AccountInfo()
            self.account_info = temp_model.from_map(m['account_info'])
        return self


class ExecContractListissueResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trace_id: str = None,
        hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户端传入的请求唯一标识
        self.trace_id = trace_id
        # 交易hash，可通过hash查询上链结果
        # 
        self.hash = hash

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
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.hash is not None:
            result['hash'] = self.hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        return self


class QueryContractOwnerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        project_id: str = None,
        trace_id: str = None,
        asset_id: str = None,
        shard_id: str = None,
        account_info: AccountInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 数字权证项目ID
        self.project_id = project_id
        # 业务方请求唯一标识，用于异步查询交易情况
        self.trace_id = trace_id
        # 资产ID，如果是1155标准资产，则对应批次id
        self.asset_id = asset_id
        # 1155标准下，需要填入批次内具体的资产碎片id
        self.shard_id = shard_id
        # 托管账户信息(推荐)，托管和非拖管必选一种
        self.account_info = account_info

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.account_info, 'account_info')
        if self.account_info:
            self.account_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.shard_id is not None:
            result['shard_id'] = self.shard_id
        if self.account_info is not None:
            result['account_info'] = self.account_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('shard_id') is not None:
            self.shard_id = m.get('shard_id')
        if m.get('account_info') is not None:
            temp_model = AccountInfo()
            self.account_info = temp_model.from_map(m['account_info'])
        return self


class QueryContractOwnerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trace_id: str = None,
        account: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户端传入的请求唯一标识
        self.trace_id = trace_id
        # 该资产的拥有者
        self.account = account

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
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.account is not None:
            result['account'] = self.account
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('account') is not None:
            self.account = m.get('account')
        return self


class QueryContractStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        project_id: str = None,
        trace_id: str = None,
        asset_id: str = None,
        shard_id: str = None,
        account_info: AccountInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 数字权证项目ID
        self.project_id = project_id
        # 业务方请求唯一标识
        self.trace_id = trace_id
        # 资产ID，如果是1155标准资产，则对应批次id
        self.asset_id = asset_id
        # 1155标准下，需要填入批次内具体的资产碎片id
        self.shard_id = shard_id
        # 托管账户信息(推荐)，托管和非拖管必选一种
        self.account_info = account_info

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.account_info, 'account_info')
        if self.account_info:
            self.account_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.shard_id is not None:
            result['shard_id'] = self.shard_id
        if self.account_info is not None:
            result['account_info'] = self.account_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('shard_id') is not None:
            self.shard_id = m.get('shard_id')
        if m.get('account_info') is not None:
            temp_model = AccountInfo()
            self.account_info = temp_model.from_map(m['account_info'])
        return self


class QueryContractStatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trace_id: str = None,
        status: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户端传入的请求唯一标识
        self.trace_id = trace_id
        # 资产状态；0：可用；1：已核销；2：已销毁
        self.status = status

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
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
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
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class ExecMultiIssueRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        project_id: str = None,
        trace_id: str = None,
        asset_id: str = None,
        asset_uri: str = None,
        to_account: str = None,
        amount: int = None,
        data: str = None,
        account_info: AccountInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链id
        self.bizid = bizid
        # 数字权证项目ID
        self.project_id = project_id
        # 业务方请求唯一标识，可用于异步查询交易情况
        self.trace_id = trace_id
        # 发行批次ID，线下生成，保证唯一，asset_id长度限制为64，只支持英文字符和数字
        self.asset_id = asset_id
        # 数字权证标准URI协议文件，权证信息。
        # 首次发行时必填，后续发行(增发)时可不用输入
        self.asset_uri = asset_uri
        # 该批次权证发行的目标账户
        self.to_account = to_account
        # 该批次中包含的资产个数
        self.amount = amount
        # 预留
        self.data = data
        # 托管账户信息(推荐)，托管和非拖管必选一种
        self.account_info = account_info

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.to_account, 'to_account')
        self.validate_required(self.amount, 'amount')
        if self.amount is not None:
            self.validate_minimum(self.amount, 'amount', 1)
        self.validate_required(self.account_info, 'account_info')
        if self.account_info:
            self.account_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.asset_uri is not None:
            result['asset_uri'] = self.asset_uri
        if self.to_account is not None:
            result['to_account'] = self.to_account
        if self.amount is not None:
            result['amount'] = self.amount
        if self.data is not None:
            result['data'] = self.data
        if self.account_info is not None:
            result['account_info'] = self.account_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('asset_uri') is not None:
            self.asset_uri = m.get('asset_uri')
        if m.get('to_account') is not None:
            self.to_account = m.get('to_account')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('account_info') is not None:
            temp_model = AccountInfo()
            self.account_info = temp_model.from_map(m['account_info'])
        return self


class ExecMultiIssueResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trace_id: str = None,
        hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户端传入的请求唯一标识
        self.trace_id = trace_id
        # 交易hash，可通过hash查询上链结果
        self.hash = hash

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
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.hash is not None:
            result['hash'] = self.hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        return self


class ExecMultiTransferRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        project_id: str = None,
        trace_id: str = None,
        from_: str = None,
        to: str = None,
        asset_id: str = None,
        shard_id: str = None,
        data: str = None,
        account_info: AccountInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链id
        self.bizid = bizid
        # 数字权证项目ID
        self.project_id = project_id
        # 业务方请求唯一标识，用于异步查询交易情况
        self.trace_id = trace_id
        # 权证所有者账户
        self.from_ = from_
        # 转移的目标账户
        self.to = to
        # 转移的目标权证批次
        self.asset_id = asset_id
        # 该批次中的资产的唯一编号，客户端不传递则系统采用随机UUID，并从结果返回
        self.shard_id = shard_id
        # 预留
        self.data = data
        # 托管账户信息(推荐)，托管和非拖管必选一种
        self.account_info = account_info

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.from_, 'from_')
        self.validate_required(self.to, 'to')
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.account_info, 'account_info')
        if self.account_info:
            self.account_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.shard_id is not None:
            result['shard_id'] = self.shard_id
        if self.data is not None:
            result['data'] = self.data
        if self.account_info is not None:
            result['account_info'] = self.account_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('shard_id') is not None:
            self.shard_id = m.get('shard_id')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('account_info') is not None:
            temp_model = AccountInfo()
            self.account_info = temp_model.from_map(m['account_info'])
        return self


class ExecMultiTransferResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trace_id: str = None,
        hash: str = None,
        shard_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户端传入的请求唯一标识
        self.trace_id = trace_id
        # 交易hash，可通过hash查询上链结果
        # 
        self.hash = hash
        # 资产id
        self.shard_id = shard_id

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
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.hash is not None:
            result['hash'] = self.hash
        if self.shard_id is not None:
            result['shard_id'] = self.shard_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('shard_id') is not None:
            self.shard_id = m.get('shard_id')
        return self


class ExecMultiWriteoffRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        project_id: str = None,
        trace_id: str = None,
        asset_id: str = None,
        shard_id: str = None,
        account_info: AccountInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链id
        self.bizid = bizid
        # 数字权证项目ID
        self.project_id = project_id
        # 业务方请求唯一标识，可用于异步查询交易情况
        self.trace_id = trace_id
        # 发行批次ID，线下生成，保证唯一，asset_id长度限制为64，只支持英文字符和数字
        self.asset_id = asset_id
        # 批次资产内每个资产的ID
        self.shard_id = shard_id
        # 托管账户信息(推荐)，托管和非拖管必选一种
        self.account_info = account_info

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.shard_id, 'shard_id')
        self.validate_required(self.account_info, 'account_info')
        if self.account_info:
            self.account_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.shard_id is not None:
            result['shard_id'] = self.shard_id
        if self.account_info is not None:
            result['account_info'] = self.account_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('shard_id') is not None:
            self.shard_id = m.get('shard_id')
        if m.get('account_info') is not None:
            temp_model = AccountInfo()
            self.account_info = temp_model.from_map(m['account_info'])
        return self


class ExecMultiWriteoffResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trace_id: str = None,
        hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户端传入的请求唯一标识
        self.trace_id = trace_id
        # 交易hash，可通过hash查询上链结果
        self.hash = hash

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
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.hash is not None:
            result['hash'] = self.hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        return self


class ExecMultiBurnoffRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        project_id: str = None,
        trace_id: str = None,
        asset_id: str = None,
        shard_id: str = None,
        from_: str = None,
        account_info: AccountInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 数字权证项目ID
        self.project_id = project_id
        # 业务方请求唯一标识，用于异步查询交易情况
        self.trace_id = trace_id
        # 被销毁的目标权证批次ID
        self.asset_id = asset_id
        # 该批次内具体的资产id
        self.shard_id = shard_id
        # 该权证资产的拥有者
        self.from_ = from_
        # 托管账户信息(推荐)，托管和非拖管必选一种
        self.account_info = account_info

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.shard_id, 'shard_id')
        self.validate_required(self.from_, 'from_')
        self.validate_required(self.account_info, 'account_info')
        if self.account_info:
            self.account_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.shard_id is not None:
            result['shard_id'] = self.shard_id
        if self.from_ is not None:
            result['from'] = self.from_
        if self.account_info is not None:
            result['account_info'] = self.account_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('shard_id') is not None:
            self.shard_id = m.get('shard_id')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('account_info') is not None:
            temp_model = AccountInfo()
            self.account_info = temp_model.from_map(m['account_info'])
        return self


class ExecMultiBurnoffResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trace_id: str = None,
        hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户端传入的请求唯一标识
        self.trace_id = trace_id
        # 交易hash，可通过hash查询上链结果
        self.hash = hash

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
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.hash is not None:
            result['hash'] = self.hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        return self


