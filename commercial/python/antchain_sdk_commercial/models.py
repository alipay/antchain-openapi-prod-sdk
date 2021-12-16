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


class PriceConstraintVO(TeaModel):
    def __init__(
        self,
        spec_condition_code: str = None,
        target_value: str = None,
        base_price: str = None,
        bd_price: str = None,
        cost_price: str = None,
    ):
        # 规格条件Code
        self.spec_condition_code = spec_condition_code
        # 当前规格条件下可选值
        self.target_value = target_value
        # 基础价格
        self.base_price = base_price
        # bd价格
        self.bd_price = bd_price
        # 成本价格
        self.cost_price = cost_price

    def validate(self):
        self.validate_required(self.spec_condition_code, 'spec_condition_code')
        self.validate_required(self.target_value, 'target_value')
        self.validate_required(self.base_price, 'base_price')
        self.validate_required(self.bd_price, 'bd_price')
        self.validate_required(self.cost_price, 'cost_price')

    def to_map(self):
        result = dict()
        if self.spec_condition_code is not None:
            result['spec_condition_code'] = self.spec_condition_code
        if self.target_value is not None:
            result['target_value'] = self.target_value
        if self.base_price is not None:
            result['base_price'] = self.base_price
        if self.bd_price is not None:
            result['bd_price'] = self.bd_price
        if self.cost_price is not None:
            result['cost_price'] = self.cost_price
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('spec_condition_code') is not None:
            self.spec_condition_code = m.get('spec_condition_code')
        if m.get('target_value') is not None:
            self.target_value = m.get('target_value')
        if m.get('base_price') is not None:
            self.base_price = m.get('base_price')
        if m.get('bd_price') is not None:
            self.bd_price = m.get('bd_price')
        if m.get('cost_price') is not None:
            self.cost_price = m.get('cost_price')
        return self


class Policy(TeaModel):
    def __init__(
        self,
        policy_id: str = None,
        policy_name: str = None,
        policy_type: str = None,
        start_time: str = None,
        end_time: str = None,
        offline_time: str = None,
        policy_status: str = None,
        creator: str = None,
        modifier: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
    ):
        # 政策id
        self.policy_id = policy_id
        # 政策名称
        self.policy_name = policy_name
        # 政策类型
        self.policy_type = policy_type
        # 政策生效时间
        self.start_time = start_time
        # 政策失效时间
        self.end_time = end_time
        # 下架时间
        self.offline_time = offline_time
        # 政策状态
        self.policy_status = policy_status
        # 创建者
        self.creator = creator
        # 修改者
        self.modifier = modifier
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified

    def validate(self):
        self.validate_required(self.policy_id, 'policy_id')
        self.validate_required(self.policy_name, 'policy_name')
        self.validate_required(self.policy_type, 'policy_type')
        self.validate_required(self.start_time, 'start_time')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.end_time, 'end_time')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.offline_time is not None:
            self.validate_pattern(self.offline_time, 'offline_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.policy_status, 'policy_status')
        self.validate_required(self.creator, 'creator')
        self.validate_required(self.modifier, 'modifier')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.policy_id is not None:
            result['policy_id'] = self.policy_id
        if self.policy_name is not None:
            result['policy_name'] = self.policy_name
        if self.policy_type is not None:
            result['policy_type'] = self.policy_type
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.offline_time is not None:
            result['offline_time'] = self.offline_time
        if self.policy_status is not None:
            result['policy_status'] = self.policy_status
        if self.creator is not None:
            result['creator'] = self.creator
        if self.modifier is not None:
            result['modifier'] = self.modifier
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('policy_id') is not None:
            self.policy_id = m.get('policy_id')
        if m.get('policy_name') is not None:
            self.policy_name = m.get('policy_name')
        if m.get('policy_type') is not None:
            self.policy_type = m.get('policy_type')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('offline_time') is not None:
            self.offline_time = m.get('offline_time')
        if m.get('policy_status') is not None:
            self.policy_status = m.get('policy_status')
        if m.get('creator') is not None:
            self.creator = m.get('creator')
        if m.get('modifier') is not None:
            self.modifier = m.get('modifier')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        return self


class PolicyCommodity(TeaModel):
    def __init__(
        self,
        policy_id: str = None,
        commodity_code: str = None,
        commodity_name: str = None,
        commodity_desc: str = None,
    ):
        # 政策id
        self.policy_id = policy_id
        # 商品code
        self.commodity_code = commodity_code
        # 商品名称
        self.commodity_name = commodity_name
        # 商品描述
        self.commodity_desc = commodity_desc

    def validate(self):
        self.validate_required(self.policy_id, 'policy_id')
        self.validate_required(self.commodity_code, 'commodity_code')
        self.validate_required(self.commodity_name, 'commodity_name')

    def to_map(self):
        result = dict()
        if self.policy_id is not None:
            result['policy_id'] = self.policy_id
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.commodity_name is not None:
            result['commodity_name'] = self.commodity_name
        if self.commodity_desc is not None:
            result['commodity_desc'] = self.commodity_desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('policy_id') is not None:
            self.policy_id = m.get('policy_id')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('commodity_name') is not None:
            self.commodity_name = m.get('commodity_name')
        if m.get('commodity_desc') is not None:
            self.commodity_desc = m.get('commodity_desc')
        return self


class Catalog(TeaModel):
    def __init__(
        self,
        catalog_id: int = None,
        catalog_name: str = None,
    ):
        # 类目id
        self.catalog_id = catalog_id
        # 类目名称
        self.catalog_name = catalog_name

    def validate(self):
        self.validate_required(self.catalog_id, 'catalog_id')
        self.validate_required(self.catalog_name, 'catalog_name')

    def to_map(self):
        result = dict()
        if self.catalog_id is not None:
            result['catalog_id'] = self.catalog_id
        if self.catalog_name is not None:
            result['catalog_name'] = self.catalog_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('catalog_id') is not None:
            self.catalog_id = m.get('catalog_id')
        if m.get('catalog_name') is not None:
            self.catalog_name = m.get('catalog_name')
        return self


class PricePlanVO(TeaModel):
    def __init__(
        self,
        spec_code: str = None,
        price_type: str = None,
        price_plan_desc: str = None,
        price_constraint: List[PriceConstraintVO] = None,
    ):
        # 规格Code
        self.spec_code = spec_code
        # 定价类型
        self.price_type = price_type
        # 定价计划描述
        self.price_plan_desc = price_plan_desc
        # 定价约束列表
        self.price_constraint = price_constraint

    def validate(self):
        self.validate_required(self.spec_code, 'spec_code')
        self.validate_required(self.price_type, 'price_type')
        self.validate_required(self.price_plan_desc, 'price_plan_desc')
        self.validate_required(self.price_constraint, 'price_constraint')
        if self.price_constraint:
            for k in self.price_constraint:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.spec_code is not None:
            result['spec_code'] = self.spec_code
        if self.price_type is not None:
            result['price_type'] = self.price_type
        if self.price_plan_desc is not None:
            result['price_plan_desc'] = self.price_plan_desc
        result['price_constraint'] = []
        if self.price_constraint is not None:
            for k in self.price_constraint:
                result['price_constraint'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('spec_code') is not None:
            self.spec_code = m.get('spec_code')
        if m.get('price_type') is not None:
            self.price_type = m.get('price_type')
        if m.get('price_plan_desc') is not None:
            self.price_plan_desc = m.get('price_plan_desc')
        self.price_constraint = []
        if m.get('price_constraint') is not None:
            for k in m.get('price_constraint'):
                temp_model = PriceConstraintVO()
                self.price_constraint.append(temp_model.from_map(k))
        return self


class Pair(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: str = None,
    ):
        # key
        self.key = key
        # value
        self.value = value

    def validate(self):
        self.validate_required(self.key, 'key')
        self.validate_required(self.value, 'value')

    def to_map(self):
        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class MultiCurrencyMoneyVO(TeaModel):
    def __init__(
        self,
        amt: str = None,
        ccy: str = None,
    ):
        # amount
        self.amt = amt
        # ccy
        self.ccy = ccy

    def validate(self):
        self.validate_required(self.amt, 'amt')
        self.validate_required(self.ccy, 'ccy')

    def to_map(self):
        result = dict()
        if self.amt is not None:
            result['amt'] = self.amt
        if self.ccy is not None:
            result['ccy'] = self.ccy
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('amt') is not None:
            self.amt = m.get('amt')
        if m.get('ccy') is not None:
            self.ccy = m.get('ccy')
        return self


class InvoiceEmail(TeaModel):
    def __init__(
        self,
        email: str = None,
        id: int = None,
        unique_id: str = None,
    ):
        # 电子邮箱
        self.email = email
        # 主键id
        self.id = id
        # 唯一id
        self.unique_id = unique_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.email is not None:
            result['email'] = self.email
        if self.id is not None:
            result['id'] = self.id
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        return self


class PolicyDTO(TeaModel):
    def __init__(
        self,
        policy: Policy = None,
        policy_commodity: PolicyCommodity = None,
        agreement_id: str = None,
        sign_status: str = None,
    ):
        # 政策信息
        self.policy = policy
        # 政策关联商品
        self.policy_commodity = policy_commodity
        # 合同id
        self.agreement_id = agreement_id
        # 签约状态
        self.sign_status = sign_status

    def validate(self):
        self.validate_required(self.policy, 'policy')
        if self.policy:
            self.policy.validate()
        self.validate_required(self.policy_commodity, 'policy_commodity')
        if self.policy_commodity:
            self.policy_commodity.validate()
        self.validate_required(self.sign_status, 'sign_status')

    def to_map(self):
        result = dict()
        if self.policy is not None:
            result['policy'] = self.policy.to_map()
        if self.policy_commodity is not None:
            result['policy_commodity'] = self.policy_commodity.to_map()
        if self.agreement_id is not None:
            result['agreement_id'] = self.agreement_id
        if self.sign_status is not None:
            result['sign_status'] = self.sign_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('policy') is not None:
            temp_model = Policy()
            self.policy = temp_model.from_map(m['policy'])
        if m.get('policy_commodity') is not None:
            temp_model = PolicyCommodity()
            self.policy_commodity = temp_model.from_map(m['policy_commodity'])
        if m.get('agreement_id') is not None:
            self.agreement_id = m.get('agreement_id')
        if m.get('sign_status') is not None:
            self.sign_status = m.get('sign_status')
        return self


class SpecVO(TeaModel):
    def __init__(
        self,
        spec_code: str = None,
        spec_name: str = None,
        main_pay_method: str = None,
        sales_mode: str = None,
        spec_status: str = None,
        desc: str = None,
    ):
        # 规格code
        self.spec_code = spec_code
        # 规格名称
        self.spec_name = spec_name
        # 主要付款方式
        self.main_pay_method = main_pay_method
        # 售卖模式
        self.sales_mode = sales_mode
        # 规格状态
        self.spec_status = spec_status
        # 规格描述
        self.desc = desc

    def validate(self):
        self.validate_required(self.spec_code, 'spec_code')
        self.validate_required(self.spec_name, 'spec_name')
        self.validate_required(self.main_pay_method, 'main_pay_method')
        self.validate_required(self.sales_mode, 'sales_mode')
        self.validate_required(self.spec_status, 'spec_status')
        self.validate_required(self.desc, 'desc')

    def to_map(self):
        result = dict()
        if self.spec_code is not None:
            result['spec_code'] = self.spec_code
        if self.spec_name is not None:
            result['spec_name'] = self.spec_name
        if self.main_pay_method is not None:
            result['main_pay_method'] = self.main_pay_method
        if self.sales_mode is not None:
            result['sales_mode'] = self.sales_mode
        if self.spec_status is not None:
            result['spec_status'] = self.spec_status
        if self.desc is not None:
            result['desc'] = self.desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('spec_code') is not None:
            self.spec_code = m.get('spec_code')
        if m.get('spec_name') is not None:
            self.spec_name = m.get('spec_name')
        if m.get('main_pay_method') is not None:
            self.main_pay_method = m.get('main_pay_method')
        if m.get('sales_mode') is not None:
            self.sales_mode = m.get('sales_mode')
        if m.get('spec_status') is not None:
            self.spec_status = m.get('spec_status')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        return self


class ProductVO(TeaModel):
    def __init__(
        self,
        product_code: str = None,
        product_name: str = None,
        oxm_type: str = None,
        desc: str = None,
    ):
        # 商品Code
        self.product_code = product_code
        # 产品名称
        self.product_name = product_name
        # 产品oxm类型
        self.oxm_type = oxm_type
        # 产品描述
        self.desc = desc

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.product_name, 'product_name')
        self.validate_required(self.oxm_type, 'oxm_type')
        self.validate_required(self.desc, 'desc')

    def to_map(self):
        result = dict()
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.oxm_type is not None:
            result['oxm_type'] = self.oxm_type
        if self.desc is not None:
            result['desc'] = self.desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('oxm_type') is not None:
            self.oxm_type = m.get('oxm_type')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        return self


class InvoiceAddress(TeaModel):
    def __init__(
        self,
        id: int = None,
        user_id: str = None,
        addressee: str = None,
        area: str = None,
        address: str = None,
        telephone: str = None,
        post_code: str = None,
        gmt_modified: str = None,
        gmt_create: str = None,
        unique_id: str = None,
    ):
        # 主键id
        self.id = id
        # 用户id
        self.user_id = user_id
        # 收件人
        self.addressee = addressee
        # 地区
        self.area = area
        # 地址
        self.address = address
        # 电话
        self.telephone = telephone
        # 邮编
        self.post_code = post_code
        # 修改时间
        self.gmt_modified = gmt_modified
        # 创建时间
        self.gmt_create = gmt_create
        # 唯一id
        self.unique_id = unique_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.addressee, 'addressee')
        self.validate_required(self.area, 'area')
        self.validate_required(self.address, 'address')
        self.validate_required(self.telephone, 'telephone')
        self.validate_required(self.post_code, 'post_code')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.addressee is not None:
            result['addressee'] = self.addressee
        if self.area is not None:
            result['area'] = self.area
        if self.address is not None:
            result['address'] = self.address
        if self.telephone is not None:
            result['telephone'] = self.telephone
        if self.post_code is not None:
            result['post_code'] = self.post_code
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('addressee') is not None:
            self.addressee = m.get('addressee')
        if m.get('area') is not None:
            self.area = m.get('area')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('telephone') is not None:
            self.telephone = m.get('telephone')
        if m.get('post_code') is not None:
            self.post_code = m.get('post_code')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        return self


class SpecAddVO(TeaModel):
    def __init__(
        self,
        spec_code: str = None,
        product_code: str = None,
        commodity_code: str = None,
        sales_mode: str = None,
        main_pay_method: str = None,
        spec_desc: str = None,
        spec_name: str = None,
        price_plan: PricePlanVO = None,
    ):
        # 规格code
        self.spec_code = spec_code
        # 产品Code
        self.product_code = product_code
        # 商品code
        self.commodity_code = commodity_code
        # 售卖模式
        self.sales_mode = sales_mode
        # 付费方式
        self.main_pay_method = main_pay_method
        # 规格描述
        self.spec_desc = spec_desc
        # 规格名称
        self.spec_name = spec_name
        # 定价计划
        self.price_plan = price_plan

    def validate(self):
        self.validate_required(self.spec_code, 'spec_code')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.commodity_code, 'commodity_code')
        self.validate_required(self.sales_mode, 'sales_mode')
        self.validate_required(self.main_pay_method, 'main_pay_method')
        self.validate_required(self.spec_desc, 'spec_desc')
        self.validate_required(self.spec_name, 'spec_name')
        self.validate_required(self.price_plan, 'price_plan')
        if self.price_plan:
            self.price_plan.validate()

    def to_map(self):
        result = dict()
        if self.spec_code is not None:
            result['spec_code'] = self.spec_code
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.sales_mode is not None:
            result['sales_mode'] = self.sales_mode
        if self.main_pay_method is not None:
            result['main_pay_method'] = self.main_pay_method
        if self.spec_desc is not None:
            result['spec_desc'] = self.spec_desc
        if self.spec_name is not None:
            result['spec_name'] = self.spec_name
        if self.price_plan is not None:
            result['price_plan'] = self.price_plan.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('spec_code') is not None:
            self.spec_code = m.get('spec_code')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('sales_mode') is not None:
            self.sales_mode = m.get('sales_mode')
        if m.get('main_pay_method') is not None:
            self.main_pay_method = m.get('main_pay_method')
        if m.get('spec_desc') is not None:
            self.spec_desc = m.get('spec_desc')
        if m.get('spec_name') is not None:
            self.spec_name = m.get('spec_name')
        if m.get('price_plan') is not None:
            temp_model = PricePlanVO()
            self.price_plan = temp_model.from_map(m['price_plan'])
        return self


class CatalogVO(TeaModel):
    def __init__(
        self,
        catalog_id: int = None,
        catalog_name: str = None,
        child_catalogs: List[Catalog] = None,
    ):
        # 类目Id
        self.catalog_id = catalog_id
        # 类目名称
        self.catalog_name = catalog_name
        # 子类目列表
        self.child_catalogs = child_catalogs

    def validate(self):
        self.validate_required(self.catalog_id, 'catalog_id')
        self.validate_required(self.catalog_name, 'catalog_name')
        self.validate_required(self.child_catalogs, 'child_catalogs')
        if self.child_catalogs:
            for k in self.child_catalogs:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.catalog_id is not None:
            result['catalog_id'] = self.catalog_id
        if self.catalog_name is not None:
            result['catalog_name'] = self.catalog_name
        result['child_catalogs'] = []
        if self.child_catalogs is not None:
            for k in self.child_catalogs:
                result['child_catalogs'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('catalog_id') is not None:
            self.catalog_id = m.get('catalog_id')
        if m.get('catalog_name') is not None:
            self.catalog_name = m.get('catalog_name')
        self.child_catalogs = []
        if m.get('child_catalogs') is not None:
            for k in m.get('child_catalogs'):
                temp_model = Catalog()
                self.child_catalogs.append(temp_model.from_map(k))
        return self


class SpecSalesMode(TeaModel):
    def __init__(
        self,
        sales_mode_code: str = None,
        sales_mode_name: str = None,
    ):
        # 规格售卖模式
        self.sales_mode_code = sales_mode_code
        # 售卖模式
        self.sales_mode_name = sales_mode_name

    def validate(self):
        self.validate_required(self.sales_mode_code, 'sales_mode_code')
        self.validate_required(self.sales_mode_name, 'sales_mode_name')

    def to_map(self):
        result = dict()
        if self.sales_mode_code is not None:
            result['sales_mode_code'] = self.sales_mode_code
        if self.sales_mode_name is not None:
            result['sales_mode_name'] = self.sales_mode_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sales_mode_code') is not None:
            self.sales_mode_code = m.get('sales_mode_code')
        if m.get('sales_mode_name') is not None:
            self.sales_mode_name = m.get('sales_mode_name')
        return self


class ProductDTO(TeaModel):
    def __init__(
        self,
        product_code: str = None,
        product_name: str = None,
        oxm_type: str = None,
        l_1catalog_id: int = None,
        l_2catalog_id: int = None,
        desc: str = None,
    ):
        # 产品信息
        self.product_code = product_code
        # 产品名称
        self.product_name = product_name
        # 产品oxm类型
        self.oxm_type = oxm_type
        # 产品一级类目
        self.l_1catalog_id = l_1catalog_id
        # 产品二级类目
        self.l_2catalog_id = l_2catalog_id
        # 产品描述
        self.desc = desc

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.product_name, 'product_name')
        self.validate_required(self.oxm_type, 'oxm_type')
        self.validate_required(self.l_1catalog_id, 'l_1catalog_id')
        self.validate_required(self.l_2catalog_id, 'l_2catalog_id')
        self.validate_required(self.desc, 'desc')

    def to_map(self):
        result = dict()
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.oxm_type is not None:
            result['oxm_type'] = self.oxm_type
        if self.l_1catalog_id is not None:
            result['l1_catalog_id'] = self.l_1catalog_id
        if self.l_2catalog_id is not None:
            result['l2_catalog_id'] = self.l_2catalog_id
        if self.desc is not None:
            result['desc'] = self.desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('oxm_type') is not None:
            self.oxm_type = m.get('oxm_type')
        if m.get('l1_catalog_id') is not None:
            self.l_1catalog_id = m.get('l1_catalog_id')
        if m.get('l2_catalog_id') is not None:
            self.l_2catalog_id = m.get('l2_catalog_id')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        return self


class PartnerPolicyRelation(TeaModel):
    def __init__(
        self,
        agreement_id: str = None,
        sp_id: str = None,
        start_time: str = None,
        end_time: str = None,
        cancel_time: str = None,
        policy_id: str = None,
        policy_name: str = None,
        policy_type: str = None,
        policy_link: str = None,
        policy_ou: str = None,
        settle_type: str = None,
        gmt_modified: str = None,
        gmt_create: str = None,
    ):
        # 合同id
        self.agreement_id = agreement_id
        # 服务商id
        self.sp_id = sp_id
        # 合同生效时间
        self.start_time = start_time
        # 合同失效时间
        self.end_time = end_time
        # 合同取消时间
        self.cancel_time = cancel_time
        # 政策id
        self.policy_id = policy_id
        # 政策名称
        self.policy_name = policy_name
        # 政策类型
        self.policy_type = policy_type
        # 政策link
        self.policy_link = policy_link
        # 政策所属ou
        self.policy_ou = policy_ou
        # 结算类型
        self.settle_type = settle_type
        # 修改时间
        self.gmt_modified = gmt_modified
        # 创建时间
        self.gmt_create = gmt_create

    def validate(self):
        self.validate_required(self.agreement_id, 'agreement_id')
        self.validate_required(self.sp_id, 'sp_id')
        self.validate_required(self.start_time, 'start_time')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.end_time, 'end_time')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.cancel_time is not None:
            self.validate_pattern(self.cancel_time, 'cancel_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.policy_id, 'policy_id')
        self.validate_required(self.policy_name, 'policy_name')
        self.validate_required(self.policy_type, 'policy_type')
        self.validate_required(self.settle_type, 'settle_type')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.agreement_id is not None:
            result['agreement_id'] = self.agreement_id
        if self.sp_id is not None:
            result['sp_id'] = self.sp_id
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.cancel_time is not None:
            result['cancel_time'] = self.cancel_time
        if self.policy_id is not None:
            result['policy_id'] = self.policy_id
        if self.policy_name is not None:
            result['policy_name'] = self.policy_name
        if self.policy_type is not None:
            result['policy_type'] = self.policy_type
        if self.policy_link is not None:
            result['policy_link'] = self.policy_link
        if self.policy_ou is not None:
            result['policy_ou'] = self.policy_ou
        if self.settle_type is not None:
            result['settle_type'] = self.settle_type
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('agreement_id') is not None:
            self.agreement_id = m.get('agreement_id')
        if m.get('sp_id') is not None:
            self.sp_id = m.get('sp_id')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('cancel_time') is not None:
            self.cancel_time = m.get('cancel_time')
        if m.get('policy_id') is not None:
            self.policy_id = m.get('policy_id')
        if m.get('policy_name') is not None:
            self.policy_name = m.get('policy_name')
        if m.get('policy_type') is not None:
            self.policy_type = m.get('policy_type')
        if m.get('policy_link') is not None:
            self.policy_link = m.get('policy_link')
        if m.get('policy_ou') is not None:
            self.policy_ou = m.get('policy_ou')
        if m.get('settle_type') is not None:
            self.settle_type = m.get('settle_type')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        return self


class Invoice(TeaModel):
    def __init__(
        self,
        id: int = None,
        user_id: str = None,
        taxpayer_type: str = None,
        taxpayer_name: str = None,
        taxpayer_no: str = None,
        bank_name: str = None,
        bank_account: str = None,
        address: str = None,
        telephone: str = None,
        gmt_modified: str = None,
        gmt_create: str = None,
        unique_id: str = None,
    ):
        # 主键id
        self.id = id
        # 用户id
        self.user_id = user_id
        # 纳税人类型
        self.taxpayer_type = taxpayer_type
        # 纳税人名称
        self.taxpayer_name = taxpayer_name
        # 纳税人识别号
        self.taxpayer_no = taxpayer_no
        # 开户行名称
        self.bank_name = bank_name
        # 开户行账号
        self.bank_account = bank_account
        # 开户行地址
        self.address = address
        # 开户行电话
        self.telephone = telephone
        # 修改时间
        self.gmt_modified = gmt_modified
        # 创建时间
        self.gmt_create = gmt_create
        # 唯一id
        self.unique_id = unique_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.taxpayer_type, 'taxpayer_type')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.taxpayer_type is not None:
            result['taxpayer_type'] = self.taxpayer_type
        if self.taxpayer_name is not None:
            result['taxpayer_name'] = self.taxpayer_name
        if self.taxpayer_no is not None:
            result['taxpayer_no'] = self.taxpayer_no
        if self.bank_name is not None:
            result['bank_name'] = self.bank_name
        if self.bank_account is not None:
            result['bank_account'] = self.bank_account
        if self.address is not None:
            result['address'] = self.address
        if self.telephone is not None:
            result['telephone'] = self.telephone
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('taxpayer_type') is not None:
            self.taxpayer_type = m.get('taxpayer_type')
        if m.get('taxpayer_name') is not None:
            self.taxpayer_name = m.get('taxpayer_name')
        if m.get('taxpayer_no') is not None:
            self.taxpayer_no = m.get('taxpayer_no')
        if m.get('bank_name') is not None:
            self.bank_name = m.get('bank_name')
        if m.get('bank_account') is not None:
            self.bank_account = m.get('bank_account')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('telephone') is not None:
            self.telephone = m.get('telephone')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        return self


class PaidSpecInstance(TeaModel):
    def __init__(
        self,
        spec_instance_id: str = None,
        spec_name: str = None,
        spec_conf: str = None,
        start_time: str = None,
        end_time: str = None,
        status: str = None,
    ):
        # 规格实例id
        self.spec_instance_id = spec_instance_id
        # 规格名称
        self.spec_name = spec_name
        # 规格配置(描述)
        self.spec_conf = spec_conf
        # 实例开始时间
        self.start_time = start_time
        # 实例到期时间
        self.end_time = end_time
        # 规格实例的运行状态
        self.status = status

    def validate(self):
        self.validate_required(self.spec_instance_id, 'spec_instance_id')
        self.validate_required(self.spec_name, 'spec_name')
        self.validate_required(self.status, 'status')

    def to_map(self):
        result = dict()
        if self.spec_instance_id is not None:
            result['spec_instance_id'] = self.spec_instance_id
        if self.spec_name is not None:
            result['spec_name'] = self.spec_name
        if self.spec_conf is not None:
            result['spec_conf'] = self.spec_conf
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('spec_instance_id') is not None:
            self.spec_instance_id = m.get('spec_instance_id')
        if m.get('spec_name') is not None:
            self.spec_name = m.get('spec_name')
        if m.get('spec_conf') is not None:
            self.spec_conf = m.get('spec_conf')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class MainOrderVO(TeaModel):
    def __init__(
        self,
        order_no: str = None,
        buyer: str = None,
        seller: str = None,
        sp_id: str = None,
        login_account: str = None,
        product_name: str = None,
        money: MultiCurrencyMoneyVO = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        gmt_close: str = None,
        gmt_pay_success: str = None,
        order_status: str = None,
        order_type: str = None,
        order_origin: str = None,
        order_level: str = None,
        pay_method: str = None,
        order_duration: str = None,
        parent_order_no: str = None,
        commodity_name: str = None,
        spec_code: str = None,
        spec_name: str = None,
        spec_desc: str = None,
        order_detail: str = None,
        sub_order_include: bool = None,
        spec_props: List[Pair] = None,
        ext_params: List[Pair] = None,
    ):
        # order_no
        self.order_no = order_no
        # buyer
        self.buyer = buyer
        # seller
        self.seller = seller
        # sp_id
        self.sp_id = sp_id
        # login_account
        self.login_account = login_account
        # product_name
        self.product_name = product_name
        # money
        self.money = money
        # gmt_create
        self.gmt_create = gmt_create
        # gmt_modified
        self.gmt_modified = gmt_modified
        # gmt_close
        self.gmt_close = gmt_close
        # gmt_pay_success
        self.gmt_pay_success = gmt_pay_success
        # order_status
        self.order_status = order_status
        # order_type
        self.order_type = order_type
        # order_origin
        self.order_origin = order_origin
        # order_level
        self.order_level = order_level
        # pay_method
        self.pay_method = pay_method
        # orde_duration
        self.order_duration = order_duration
        # parent_order_no
        self.parent_order_no = parent_order_no
        # commodity_name
        self.commodity_name = commodity_name
        # spec_code
        self.spec_code = spec_code
        # spec_name
        self.spec_name = spec_name
        # spec_desc
        self.spec_desc = spec_desc
        # order_detail
        self.order_detail = order_detail
        # sub_order_include
        self.sub_order_include = sub_order_include
        # spec_props
        self.spec_props = spec_props
        # ext_params
        self.ext_params = ext_params

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.buyer, 'buyer')
        self.validate_required(self.seller, 'seller')
        self.validate_required(self.sp_id, 'sp_id')
        self.validate_required(self.login_account, 'login_account')
        self.validate_required(self.product_name, 'product_name')
        self.validate_required(self.money, 'money')
        if self.money:
            self.money.validate()
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_close, 'gmt_close')
        if self.gmt_close is not None:
            self.validate_pattern(self.gmt_close, 'gmt_close', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_pay_success, 'gmt_pay_success')
        if self.gmt_pay_success is not None:
            self.validate_pattern(self.gmt_pay_success, 'gmt_pay_success', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.order_status, 'order_status')
        self.validate_required(self.order_type, 'order_type')
        self.validate_required(self.order_origin, 'order_origin')
        self.validate_required(self.order_level, 'order_level')
        self.validate_required(self.pay_method, 'pay_method')
        self.validate_required(self.order_duration, 'order_duration')
        self.validate_required(self.parent_order_no, 'parent_order_no')
        self.validate_required(self.commodity_name, 'commodity_name')
        self.validate_required(self.spec_code, 'spec_code')
        self.validate_required(self.spec_name, 'spec_name')
        self.validate_required(self.spec_desc, 'spec_desc')
        self.validate_required(self.order_detail, 'order_detail')
        self.validate_required(self.sub_order_include, 'sub_order_include')
        self.validate_required(self.spec_props, 'spec_props')
        if self.spec_props:
            for k in self.spec_props:
                if k:
                    k.validate()
        self.validate_required(self.ext_params, 'ext_params')
        if self.ext_params:
            for k in self.ext_params:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.buyer is not None:
            result['buyer'] = self.buyer
        if self.seller is not None:
            result['seller'] = self.seller
        if self.sp_id is not None:
            result['sp_id'] = self.sp_id
        if self.login_account is not None:
            result['login_account'] = self.login_account
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.money is not None:
            result['money'] = self.money.to_map()
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.gmt_close is not None:
            result['gmt_close'] = self.gmt_close
        if self.gmt_pay_success is not None:
            result['gmt_pay_success'] = self.gmt_pay_success
        if self.order_status is not None:
            result['order_status'] = self.order_status
        if self.order_type is not None:
            result['order_type'] = self.order_type
        if self.order_origin is not None:
            result['order_origin'] = self.order_origin
        if self.order_level is not None:
            result['order_level'] = self.order_level
        if self.pay_method is not None:
            result['pay_method'] = self.pay_method
        if self.order_duration is not None:
            result['order_duration'] = self.order_duration
        if self.parent_order_no is not None:
            result['parent_order_no'] = self.parent_order_no
        if self.commodity_name is not None:
            result['commodity_name'] = self.commodity_name
        if self.spec_code is not None:
            result['spec_code'] = self.spec_code
        if self.spec_name is not None:
            result['spec_name'] = self.spec_name
        if self.spec_desc is not None:
            result['spec_desc'] = self.spec_desc
        if self.order_detail is not None:
            result['order_detail'] = self.order_detail
        if self.sub_order_include is not None:
            result['sub_order_include'] = self.sub_order_include
        result['spec_props'] = []
        if self.spec_props is not None:
            for k in self.spec_props:
                result['spec_props'].append(k.to_map() if k else None)
        result['ext_params'] = []
        if self.ext_params is not None:
            for k in self.ext_params:
                result['ext_params'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('buyer') is not None:
            self.buyer = m.get('buyer')
        if m.get('seller') is not None:
            self.seller = m.get('seller')
        if m.get('sp_id') is not None:
            self.sp_id = m.get('sp_id')
        if m.get('login_account') is not None:
            self.login_account = m.get('login_account')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('money') is not None:
            temp_model = MultiCurrencyMoneyVO()
            self.money = temp_model.from_map(m['money'])
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('gmt_close') is not None:
            self.gmt_close = m.get('gmt_close')
        if m.get('gmt_pay_success') is not None:
            self.gmt_pay_success = m.get('gmt_pay_success')
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        if m.get('order_type') is not None:
            self.order_type = m.get('order_type')
        if m.get('order_origin') is not None:
            self.order_origin = m.get('order_origin')
        if m.get('order_level') is not None:
            self.order_level = m.get('order_level')
        if m.get('pay_method') is not None:
            self.pay_method = m.get('pay_method')
        if m.get('order_duration') is not None:
            self.order_duration = m.get('order_duration')
        if m.get('parent_order_no') is not None:
            self.parent_order_no = m.get('parent_order_no')
        if m.get('commodity_name') is not None:
            self.commodity_name = m.get('commodity_name')
        if m.get('spec_code') is not None:
            self.spec_code = m.get('spec_code')
        if m.get('spec_name') is not None:
            self.spec_name = m.get('spec_name')
        if m.get('spec_desc') is not None:
            self.spec_desc = m.get('spec_desc')
        if m.get('order_detail') is not None:
            self.order_detail = m.get('order_detail')
        if m.get('sub_order_include') is not None:
            self.sub_order_include = m.get('sub_order_include')
        self.spec_props = []
        if m.get('spec_props') is not None:
            for k in m.get('spec_props'):
                temp_model = Pair()
                self.spec_props.append(temp_model.from_map(k))
        self.ext_params = []
        if m.get('ext_params') is not None:
            for k in m.get('ext_params'):
                temp_model = Pair()
                self.ext_params.append(temp_model.from_map(k))
        return self


class CommodityVO(TeaModel):
    def __init__(
        self,
        commodity_code: str = None,
        commodity_name: str = None,
        service_type: str = None,
        source_type: str = None,
        desc: str = None,
    ):
        # 商品Code
        self.commodity_code = commodity_code
        # 商品名称
        self.commodity_name = commodity_name
        # 商品服务类型
        self.service_type = service_type
        # 商品来源
        self.source_type = source_type
        # 商品描述
        self.desc = desc

    def validate(self):
        self.validate_required(self.commodity_code, 'commodity_code')
        self.validate_required(self.commodity_name, 'commodity_name')
        self.validate_required(self.service_type, 'service_type')
        self.validate_required(self.source_type, 'source_type')
        self.validate_required(self.desc, 'desc')

    def to_map(self):
        result = dict()
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.commodity_name is not None:
            result['commodity_name'] = self.commodity_name
        if self.service_type is not None:
            result['service_type'] = self.service_type
        if self.source_type is not None:
            result['source_type'] = self.source_type
        if self.desc is not None:
            result['desc'] = self.desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('commodity_name') is not None:
            self.commodity_name = m.get('commodity_name')
        if m.get('service_type') is not None:
            self.service_type = m.get('service_type')
        if m.get('source_type') is not None:
            self.source_type = m.get('source_type')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        return self


class ApBill(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        return self


class TaxInfo(TeaModel):
    def __init__(
        self,
        taxpayer_name: str = None,
        taxpayer_no: str = None,
        bank_name: str = None,
        bank_account: str = None,
        address: str = None,
        telephone: str = None,
    ):
        # 纳税人名称
        self.taxpayer_name = taxpayer_name
        # 纳税人识别号
        self.taxpayer_no = taxpayer_no
        # 开户行名称
        self.bank_name = bank_name
        # 开户行账号
        self.bank_account = bank_account
        # 开户行地址
        self.address = address
        # 开户行电话
        self.telephone = telephone

    def validate(self):
        self.validate_required(self.taxpayer_name, 'taxpayer_name')
        self.validate_required(self.taxpayer_no, 'taxpayer_no')

    def to_map(self):
        result = dict()
        if self.taxpayer_name is not None:
            result['taxpayer_name'] = self.taxpayer_name
        if self.taxpayer_no is not None:
            result['taxpayer_no'] = self.taxpayer_no
        if self.bank_name is not None:
            result['bank_name'] = self.bank_name
        if self.bank_account is not None:
            result['bank_account'] = self.bank_account
        if self.address is not None:
            result['address'] = self.address
        if self.telephone is not None:
            result['telephone'] = self.telephone
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('taxpayer_name') is not None:
            self.taxpayer_name = m.get('taxpayer_name')
        if m.get('taxpayer_no') is not None:
            self.taxpayer_no = m.get('taxpayer_no')
        if m.get('bank_name') is not None:
            self.bank_name = m.get('bank_name')
        if m.get('bank_account') is not None:
            self.bank_account = m.get('bank_account')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('telephone') is not None:
            self.telephone = m.get('telephone')
        return self


class InvoiceInfo(TeaModel):
    def __init__(
        self,
        invoice_type: str = None,
        invoice_code: str = None,
        invoice_date: str = None,
        invoice_slots: str = None,
        total_amt: str = None,
    ):
        # 发票类型
        self.invoice_type = invoice_type
        # 发票编码
        self.invoice_code = invoice_code
        # 开票日期
        self.invoice_date = invoice_date
        # 发票信息槽
        self.invoice_slots = invoice_slots
        # 税价合计
        self.total_amt = total_amt

    def validate(self):
        self.validate_required(self.invoice_type, 'invoice_type')
        self.validate_required(self.invoice_code, 'invoice_code')
        self.validate_required(self.invoice_date, 'invoice_date')
        if self.invoice_date is not None:
            self.validate_pattern(self.invoice_date, 'invoice_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.invoice_slots, 'invoice_slots')
        self.validate_required(self.total_amt, 'total_amt')

    def to_map(self):
        result = dict()
        if self.invoice_type is not None:
            result['invoice_type'] = self.invoice_type
        if self.invoice_code is not None:
            result['invoice_code'] = self.invoice_code
        if self.invoice_date is not None:
            result['invoice_date'] = self.invoice_date
        if self.invoice_slots is not None:
            result['invoice_slots'] = self.invoice_slots
        if self.total_amt is not None:
            result['total_amt'] = self.total_amt
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('invoice_type') is not None:
            self.invoice_type = m.get('invoice_type')
        if m.get('invoice_code') is not None:
            self.invoice_code = m.get('invoice_code')
        if m.get('invoice_date') is not None:
            self.invoice_date = m.get('invoice_date')
        if m.get('invoice_slots') is not None:
            self.invoice_slots = m.get('invoice_slots')
        if m.get('total_amt') is not None:
            self.total_amt = m.get('total_amt')
        return self


class ProductCodes(TeaModel):
    def __init__(
        self,
        product_codes: List[str] = None,
    ):
        # 产品code列表
        self.product_codes = product_codes

    def validate(self):
        self.validate_required(self.product_codes, 'product_codes')

    def to_map(self):
        result = dict()
        if self.product_codes is not None:
            result['product_codes'] = self.product_codes
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('product_codes') is not None:
            self.product_codes = m.get('product_codes')
        return self


class SoldSpecInstance(TeaModel):
    def __init__(
        self,
        spec_code: str = None,
        spec_instance_id: str = None,
        status: str = None,
        start_time: str = None,
        plan_stop_time: str = None,
        actual_stop_time: str = None,
        merchant_id: str = None,
    ):
        # 规格码
        self.spec_code = spec_code
        # 规格实例id
        self.spec_instance_id = spec_instance_id
        # 规格实例运行状态.
        # 实例状态 STARTED 正常有效、STOPPED 停服、STAETED_IN_ARR 欠费运行中
        self.status = status
        # 实例生效时间
        self.start_time = start_time
        # 实例计划停服时间
        self.plan_stop_time = plan_stop_time
        # 实例实际停服时间
        self.actual_stop_time = actual_stop_time
        # 购买规格实例的商户id(商业中台用来唯一标识商户的id)
        self.merchant_id = merchant_id

    def validate(self):
        self.validate_required(self.spec_code, 'spec_code')
        self.validate_required(self.spec_instance_id, 'spec_instance_id')
        self.validate_required(self.status, 'status')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.plan_stop_time is not None:
            self.validate_pattern(self.plan_stop_time, 'plan_stop_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.actual_stop_time is not None:
            self.validate_pattern(self.actual_stop_time, 'actual_stop_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.merchant_id, 'merchant_id')

    def to_map(self):
        result = dict()
        if self.spec_code is not None:
            result['spec_code'] = self.spec_code
        if self.spec_instance_id is not None:
            result['spec_instance_id'] = self.spec_instance_id
        if self.status is not None:
            result['status'] = self.status
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.plan_stop_time is not None:
            result['plan_stop_time'] = self.plan_stop_time
        if self.actual_stop_time is not None:
            result['actual_stop_time'] = self.actual_stop_time
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('spec_code') is not None:
            self.spec_code = m.get('spec_code')
        if m.get('spec_instance_id') is not None:
            self.spec_instance_id = m.get('spec_instance_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('plan_stop_time') is not None:
            self.plan_stop_time = m.get('plan_stop_time')
        if m.get('actual_stop_time') is not None:
            self.actual_stop_time = m.get('actual_stop_time')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class CommoditySourceType(TeaModel):
    def __init__(
        self,
        type_code: str = None,
        type_desc: str = None,
    ):
        # 商品来源code
        self.type_code = type_code
        # 商品来源描述
        self.type_desc = type_desc

    def validate(self):
        self.validate_required(self.type_code, 'type_code')
        self.validate_required(self.type_desc, 'type_desc')

    def to_map(self):
        result = dict()
        if self.type_code is not None:
            result['type_code'] = self.type_code
        if self.type_desc is not None:
            result['type_desc'] = self.type_desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type_code') is not None:
            self.type_code = m.get('type_code')
        if m.get('type_desc') is not None:
            self.type_desc = m.get('type_desc')
        return self


class QueryBillingcoreInvoiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        return self


class QueryBillingcoreInvoiceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        invoice: Invoice = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发票信息
        self.invoice = invoice

    def validate(self):
        if self.invoice:
            self.invoice.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.invoice is not None:
            result['invoice'] = self.invoice.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('invoice') is not None:
            temp_model = Invoice()
            self.invoice = temp_model.from_map(m['invoice'])
        return self


class QueryBillingcoreInvoicelocRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        return self


class QueryBillingcoreInvoicelocResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        invoice: Invoice = None,
        invoice_address: InvoiceAddress = None,
        invoice_email: InvoiceEmail = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发票信息
        self.invoice = invoice
        # 发票寄送地址
        self.invoice_address = invoice_address
        # 发票电子邮箱
        self.invoice_email = invoice_email

    def validate(self):
        if self.invoice:
            self.invoice.validate()
        if self.invoice_address:
            self.invoice_address.validate()
        if self.invoice_email:
            self.invoice_email.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.invoice is not None:
            result['invoice'] = self.invoice.to_map()
        if self.invoice_address is not None:
            result['invoice_address'] = self.invoice_address.to_map()
        if self.invoice_email is not None:
            result['invoice_email'] = self.invoice_email.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('invoice') is not None:
            temp_model = Invoice()
            self.invoice = temp_model.from_map(m['invoice'])
        if m.get('invoice_address') is not None:
            temp_model = InvoiceAddress()
            self.invoice_address = temp_model.from_map(m['invoice_address'])
        if m.get('invoice_email') is not None:
            temp_model = InvoiceEmail()
            self.invoice_email = temp_model.from_map(m['invoice_email'])
        return self


class AddBillingcoreInvoiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_unique_id: str = None,
        invoice: Invoice = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求唯一id，可以是时间戳
        self.request_unique_id = request_unique_id
        # 发票信息
        self.invoice = invoice

    def validate(self):
        self.validate_required(self.invoice, 'invoice')
        if self.invoice:
            self.invoice.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_unique_id is not None:
            result['request_unique_id'] = self.request_unique_id
        if self.invoice is not None:
            result['invoice'] = self.invoice.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_unique_id') is not None:
            self.request_unique_id = m.get('request_unique_id')
        if m.get('invoice') is not None:
            temp_model = Invoice()
            self.invoice = temp_model.from_map(m['invoice'])
        return self


class AddBillingcoreInvoiceResponse(TeaModel):
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


class UpdateBillingcoreInvoiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_unique_id: str = None,
        invoice: Invoice = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求唯一id，可以是时间戳
        self.request_unique_id = request_unique_id
        # 发票信息
        self.invoice = invoice

    def validate(self):
        self.validate_required(self.invoice, 'invoice')
        if self.invoice:
            self.invoice.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_unique_id is not None:
            result['request_unique_id'] = self.request_unique_id
        if self.invoice is not None:
            result['invoice'] = self.invoice.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_unique_id') is not None:
            self.request_unique_id = m.get('request_unique_id')
        if m.get('invoice') is not None:
            temp_model = Invoice()
            self.invoice = temp_model.from_map(m['invoice'])
        return self


class UpdateBillingcoreInvoiceResponse(TeaModel):
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


class AddBillingcoreInvoiceaddressRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_unique_id: str = None,
        invoice_address: InvoiceAddress = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求唯一id，可以是时间戳
        self.request_unique_id = request_unique_id
        # 发票寄送地址
        self.invoice_address = invoice_address

    def validate(self):
        self.validate_required(self.invoice_address, 'invoice_address')
        if self.invoice_address:
            self.invoice_address.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_unique_id is not None:
            result['request_unique_id'] = self.request_unique_id
        if self.invoice_address is not None:
            result['invoice_address'] = self.invoice_address.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_unique_id') is not None:
            self.request_unique_id = m.get('request_unique_id')
        if m.get('invoice_address') is not None:
            temp_model = InvoiceAddress()
            self.invoice_address = temp_model.from_map(m['invoice_address'])
        return self


class AddBillingcoreInvoiceaddressResponse(TeaModel):
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


class UpdateBillingcoreInvoiceaddressRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        invoice_address: InvoiceAddress = None,
        request_unique_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 发票寄送地址
        self.invoice_address = invoice_address
        # 请求唯一id，可以是时间戳
        self.request_unique_id = request_unique_id

    def validate(self):
        self.validate_required(self.invoice_address, 'invoice_address')
        if self.invoice_address:
            self.invoice_address.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.invoice_address is not None:
            result['invoice_address'] = self.invoice_address.to_map()
        if self.request_unique_id is not None:
            result['request_unique_id'] = self.request_unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('invoice_address') is not None:
            temp_model = InvoiceAddress()
            self.invoice_address = temp_model.from_map(m['invoice_address'])
        if m.get('request_unique_id') is not None:
            self.request_unique_id = m.get('request_unique_id')
        return self


class UpdateBillingcoreInvoiceaddressResponse(TeaModel):
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


class AddBillingcoreInvoiceemailRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_unique_id: str = None,
        invoice_email: InvoiceEmail = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求唯一id，可以是时间戳
        self.request_unique_id = request_unique_id
        # 发票电子邮箱
        self.invoice_email = invoice_email

    def validate(self):
        self.validate_required(self.invoice_email, 'invoice_email')
        if self.invoice_email:
            self.invoice_email.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_unique_id is not None:
            result['request_unique_id'] = self.request_unique_id
        if self.invoice_email is not None:
            result['invoice_email'] = self.invoice_email.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_unique_id') is not None:
            self.request_unique_id = m.get('request_unique_id')
        if m.get('invoice_email') is not None:
            temp_model = InvoiceEmail()
            self.invoice_email = temp_model.from_map(m['invoice_email'])
        return self


class AddBillingcoreInvoiceemailResponse(TeaModel):
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


class UpdateBillingcoreInvoiceemailRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_unique_id: str = None,
        invoice_email: InvoiceEmail = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求唯一id，可以是时间戳
        self.request_unique_id = request_unique_id
        # 发票电子邮件信息
        self.invoice_email = invoice_email

    def validate(self):
        self.validate_required(self.invoice_email, 'invoice_email')
        if self.invoice_email:
            self.invoice_email.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_unique_id is not None:
            result['request_unique_id'] = self.request_unique_id
        if self.invoice_email is not None:
            result['invoice_email'] = self.invoice_email.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_unique_id') is not None:
            self.request_unique_id = m.get('request_unique_id')
        if m.get('invoice_email') is not None:
            temp_model = InvoiceEmail()
            self.invoice_email = temp_model.from_map(m['invoice_email'])
        return self


class UpdateBillingcoreInvoiceemailResponse(TeaModel):
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


class ApplyBillingcoreMerchantinvoiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        order_no: str = None,
        invoice: Invoice = None,
        invoice_address: InvoiceAddress = None,
        invoice_email: InvoiceEmail = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 订单号
        self.order_no = order_no
        # 发票信息
        self.invoice = invoice
        # 发票寄送地址
        self.invoice_address = invoice_address
        # 发票电子邮箱
        self.invoice_email = invoice_email

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.invoice, 'invoice')
        if self.invoice:
            self.invoice.validate()
        if self.invoice_address:
            self.invoice_address.validate()
        if self.invoice_email:
            self.invoice_email.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.invoice is not None:
            result['invoice'] = self.invoice.to_map()
        if self.invoice_address is not None:
            result['invoice_address'] = self.invoice_address.to_map()
        if self.invoice_email is not None:
            result['invoice_email'] = self.invoice_email.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('invoice') is not None:
            temp_model = Invoice()
            self.invoice = temp_model.from_map(m['invoice'])
        if m.get('invoice_address') is not None:
            temp_model = InvoiceAddress()
            self.invoice_address = temp_model.from_map(m['invoice_address'])
        if m.get('invoice_email') is not None:
            temp_model = InvoiceEmail()
            self.invoice_email = temp_model.from_map(m['invoice_email'])
        return self


class ApplyBillingcoreMerchantinvoiceResponse(TeaModel):
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


class QueryBillingcoreMerchantinvoiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 订单号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class QueryBillingcoreMerchantinvoiceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        id: int = None,
        merchant_id: str = None,
        order_no: str = None,
        order_amt: str = None,
        ccy: str = None,
        invoice: Invoice = None,
        invoice_address: InvoiceAddress = None,
        invoice_email: InvoiceEmail = None,
        gmt_create: str = None,
        gmt_modified: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 主键id
        self.id = id
        # 商户id
        self.merchant_id = merchant_id
        # 订单号
        self.order_no = order_no
        # 订单金额
        self.order_amt = order_amt
        # 币种
        self.ccy = ccy
        # 发票信息
        self.invoice = invoice
        # 发票寄送地址
        self.invoice_address = invoice_address
        # 发票电子邮箱
        self.invoice_email = invoice_email
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified

    def validate(self):
        if self.invoice:
            self.invoice.validate()
        if self.invoice_address:
            self.invoice_address.validate()
        if self.invoice_email:
            self.invoice_email.validate()
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.id is not None:
            result['id'] = self.id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.order_amt is not None:
            result['order_amt'] = self.order_amt
        if self.ccy is not None:
            result['ccy'] = self.ccy
        if self.invoice is not None:
            result['invoice'] = self.invoice.to_map()
        if self.invoice_address is not None:
            result['invoice_address'] = self.invoice_address.to_map()
        if self.invoice_email is not None:
            result['invoice_email'] = self.invoice_email.to_map()
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
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
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('order_amt') is not None:
            self.order_amt = m.get('order_amt')
        if m.get('ccy') is not None:
            self.ccy = m.get('ccy')
        if m.get('invoice') is not None:
            temp_model = Invoice()
            self.invoice = temp_model.from_map(m['invoice'])
        if m.get('invoice_address') is not None:
            temp_model = InvoiceAddress()
            self.invoice_address = temp_model.from_map(m['invoice_address'])
        if m.get('invoice_email') is not None:
            temp_model = InvoiceEmail()
            self.invoice_email = temp_model.from_map(m['invoice_email'])
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        return self


class QueryBillingcoreSpbillRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        bill_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 账单id
        self.bill_id = bill_id

    def validate(self):
        self.validate_required(self.bill_id, 'bill_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.bill_id is not None:
            result['bill_id'] = self.bill_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('bill_id') is not None:
            self.bill_id = m.get('bill_id')
        return self


class QueryBillingcoreSpbillResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ap_bill: ApBill = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # ap账单
        self.ap_bill = ap_bill

    def validate(self):
        if self.ap_bill:
            self.ap_bill.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.ap_bill is not None:
            result['ap_bill'] = self.ap_bill.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ap_bill') is not None:
            temp_model = ApBill()
            self.ap_bill = temp_model.from_map(m['ap_bill'])
        return self


class PagequeryBillingcoreSpbillRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        current: int = None,
        page_size: int = None,
        start_date: str = None,
        end_date: str = None,
        status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 当前页码
        self.current = current
        # 每页记录数
        self.page_size = page_size
        # 开始时间
        self.start_date = start_date
        # 结束时间
        self.end_date = end_date
        # 账单状态
        self.status = status

    def validate(self):
        self.validate_required(self.current, 'current')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.start_date, 'start_date')
        if self.start_date is not None:
            self.validate_pattern(self.start_date, 'start_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.end_date, 'end_date')
        if self.end_date is not None:
            self.validate_pattern(self.end_date, 'end_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.current is not None:
            result['current'] = self.current
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.start_date is not None:
            result['start_date'] = self.start_date
        if self.end_date is not None:
            result['end_date'] = self.end_date
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('start_date') is not None:
            self.start_date = m.get('start_date')
        if m.get('end_date') is not None:
            self.end_date = m.get('end_date')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class PagequeryBillingcoreSpbillResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_pages: int = None,
        current: int = None,
        page_size: int = None,
        total: int = None,
        data: ApBill = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总页数
        self.total_pages = total_pages
        # 当前页码
        self.current = current
        # 每页记录数
        self.page_size = page_size
        # 总记录数
        self.total = total
        # 账单列表
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
        if self.total_pages is not None:
            result['total_pages'] = self.total_pages
        if self.current is not None:
            result['current'] = self.current
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total is not None:
            result['total'] = self.total
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
        if m.get('total_pages') is not None:
            self.total_pages = m.get('total_pages')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('data') is not None:
            temp_model = ApBill()
            self.data = temp_model.from_map(m['data'])
        return self


class ApplyBillingcoreSpinvoiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        bill_nos: str = None,
        bill_amt: str = None,
        ccy: str = None,
        seller_info: TaxInfo = None,
        buyer_info: TaxInfo = None,
        invoice_infos: List[InvoiceInfo] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 账单号，多个时逗号分隔
        self.bill_nos = bill_nos
        # 账单总金额
        self.bill_amt = bill_amt
        # 币种
        self.ccy = ccy
        # 销售方信息
        self.seller_info = seller_info
        # 购买方信息
        self.buyer_info = buyer_info
        # 发票信息
        self.invoice_infos = invoice_infos

    def validate(self):
        self.validate_required(self.bill_nos, 'bill_nos')
        self.validate_required(self.bill_amt, 'bill_amt')
        self.validate_required(self.ccy, 'ccy')
        self.validate_required(self.seller_info, 'seller_info')
        if self.seller_info:
            self.seller_info.validate()
        self.validate_required(self.buyer_info, 'buyer_info')
        if self.buyer_info:
            self.buyer_info.validate()
        self.validate_required(self.invoice_infos, 'invoice_infos')
        if self.invoice_infos:
            for k in self.invoice_infos:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.bill_nos is not None:
            result['bill_nos'] = self.bill_nos
        if self.bill_amt is not None:
            result['bill_amt'] = self.bill_amt
        if self.ccy is not None:
            result['ccy'] = self.ccy
        if self.seller_info is not None:
            result['seller_info'] = self.seller_info.to_map()
        if self.buyer_info is not None:
            result['buyer_info'] = self.buyer_info.to_map()
        result['invoice_infos'] = []
        if self.invoice_infos is not None:
            for k in self.invoice_infos:
                result['invoice_infos'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('bill_nos') is not None:
            self.bill_nos = m.get('bill_nos')
        if m.get('bill_amt') is not None:
            self.bill_amt = m.get('bill_amt')
        if m.get('ccy') is not None:
            self.ccy = m.get('ccy')
        if m.get('seller_info') is not None:
            temp_model = TaxInfo()
            self.seller_info = temp_model.from_map(m['seller_info'])
        if m.get('buyer_info') is not None:
            temp_model = TaxInfo()
            self.buyer_info = temp_model.from_map(m['buyer_info'])
        self.invoice_infos = []
        if m.get('invoice_infos') is not None:
            for k in m.get('invoice_infos'):
                temp_model = InvoiceInfo()
                self.invoice_infos.append(temp_model.from_map(k))
        return self


class ApplyBillingcoreSpinvoiceResponse(TeaModel):
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


class AllCommercialcoreCatalogRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        return self


class AllCommercialcoreCatalogResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        catalog_trees: List[CatalogVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 全部类目树结构体
        self.catalog_trees = catalog_trees

    def validate(self):
        if self.catalog_trees:
            for k in self.catalog_trees:
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
        result['catalog_trees'] = []
        if self.catalog_trees is not None:
            for k in self.catalog_trees:
                result['catalog_trees'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.catalog_trees = []
        if m.get('catalog_trees') is not None:
            for k in m.get('catalog_trees'):
                temp_model = CatalogVO()
                self.catalog_trees.append(temp_model.from_map(k))
        return self


class ListCommercialcoreProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        catalog_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 类目id
        self.catalog_id = catalog_id

    def validate(self):
        self.validate_required(self.catalog_id, 'catalog_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.catalog_id is not None:
            result['catalog_id'] = self.catalog_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('catalog_id') is not None:
            self.catalog_id = m.get('catalog_id')
        return self


class ListCommercialcoreProductResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        products: List[ProductVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 产品列表
        self.products = products

    def validate(self):
        if self.products:
            for k in self.products:
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
        result['products'] = []
        if self.products is not None:
            for k in self.products:
                result['products'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.products = []
        if m.get('products') is not None:
            for k in m.get('products'):
                temp_model = ProductVO()
                self.products.append(temp_model.from_map(k))
        return self


class ListCommercialcoreCommodityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 商品code
        self.product_code = product_code

    def validate(self):
        self.validate_required(self.product_code, 'product_code')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_code is not None:
            result['product_code'] = self.product_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        return self


class ListCommercialcoreCommodityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        commodities: List[CommodityVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商品列表
        self.commodities = commodities

    def validate(self):
        if self.commodities:
            for k in self.commodities:
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
        result['commodities'] = []
        if self.commodities is not None:
            for k in self.commodities:
                result['commodities'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.commodities = []
        if m.get('commodities') is not None:
            for k in m.get('commodities'):
                temp_model = CommodityVO()
                self.commodities.append(temp_model.from_map(k))
        return self


class ListCommercialcoreSpecRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        commodity_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 商品code
        self.commodity_code = commodity_code

    def validate(self):
        self.validate_required(self.commodity_code, 'commodity_code')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        return self


class ListCommercialcoreSpecResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        specs: List[SpecVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 规格列表
        self.specs = specs

    def validate(self):
        if self.specs:
            for k in self.specs:
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
        result['specs'] = []
        if self.specs is not None:
            for k in self.specs:
                result['specs'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.specs = []
        if m.get('specs') is not None:
            for k in m.get('specs'):
                temp_model = SpecVO()
                self.specs.append(temp_model.from_map(k))
        return self


class QueryCommercialcoreSpecRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        spec_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 规格code
        self.spec_code = spec_code

    def validate(self):
        self.validate_required(self.spec_code, 'spec_code')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.spec_code is not None:
            result['spec_code'] = self.spec_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('spec_code') is not None:
            self.spec_code = m.get('spec_code')
        return self


class QueryCommercialcoreSpecResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        price_plan: PricePlanVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 定价计划
        self.price_plan = price_plan

    def validate(self):
        if self.price_plan:
            self.price_plan.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.price_plan is not None:
            result['price_plan'] = self.price_plan.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('price_plan') is not None:
            temp_model = PricePlanVO()
            self.price_plan = temp_model.from_map(m['price_plan'])
        return self


class AddCommercialcoreProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_code: str = None,
        product_name: str = None,
        oxm_type: str = None,
        l_1catalog_id: int = None,
        l_2catalog_id: int = None,
        desc: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 产品code
        self.product_code = product_code
        # 产品名称
        self.product_name = product_name
        # 产品oxm类型
        self.oxm_type = oxm_type
        # 产品一级类目
        self.l_1catalog_id = l_1catalog_id
        # 产品二级类目
        self.l_2catalog_id = l_2catalog_id
        # 产品描述
        self.desc = desc

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.product_name, 'product_name')
        self.validate_required(self.oxm_type, 'oxm_type')
        self.validate_required(self.l_1catalog_id, 'l_1catalog_id')
        self.validate_required(self.l_2catalog_id, 'l_2catalog_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.oxm_type is not None:
            result['oxm_type'] = self.oxm_type
        if self.l_1catalog_id is not None:
            result['l1_catalog_id'] = self.l_1catalog_id
        if self.l_2catalog_id is not None:
            result['l2_catalog_id'] = self.l_2catalog_id
        if self.desc is not None:
            result['desc'] = self.desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('oxm_type') is not None:
            self.oxm_type = m.get('oxm_type')
        if m.get('l1_catalog_id') is not None:
            self.l_1catalog_id = m.get('l1_catalog_id')
        if m.get('l2_catalog_id') is not None:
            self.l_2catalog_id = m.get('l2_catalog_id')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        return self


class AddCommercialcoreProductResponse(TeaModel):
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


class UpdateCommercialcoreProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_code: str = None,
        product_name: str = None,
        oxm_type: str = None,
        l_1catalog_id: int = None,
        l_2catalog_id: int = None,
        desc: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 产品code
        self.product_code = product_code
        # 产品名称
        self.product_name = product_name
        # 产品oxm类型
        self.oxm_type = oxm_type
        # 产品一级类目
        self.l_1catalog_id = l_1catalog_id
        # 产品二级类目
        self.l_2catalog_id = l_2catalog_id
        # 产品描述xxx
        self.desc = desc

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.product_name, 'product_name')
        self.validate_required(self.oxm_type, 'oxm_type')
        self.validate_required(self.l_1catalog_id, 'l_1catalog_id')
        self.validate_required(self.l_2catalog_id, 'l_2catalog_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.oxm_type is not None:
            result['oxm_type'] = self.oxm_type
        if self.l_1catalog_id is not None:
            result['l1_catalog_id'] = self.l_1catalog_id
        if self.l_2catalog_id is not None:
            result['l2_catalog_id'] = self.l_2catalog_id
        if self.desc is not None:
            result['desc'] = self.desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('oxm_type') is not None:
            self.oxm_type = m.get('oxm_type')
        if m.get('l1_catalog_id') is not None:
            self.l_1catalog_id = m.get('l1_catalog_id')
        if m.get('l2_catalog_id') is not None:
            self.l_2catalog_id = m.get('l2_catalog_id')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        return self


class UpdateCommercialcoreProductResponse(TeaModel):
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
        # 成功
        self.success = success

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


class BatchqueryCommercialcoreProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        return self


class BatchqueryCommercialcoreProductResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        product_codes: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 产品code列表
        self.product_codes = product_codes

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
        if self.product_codes is not None:
            result['product_codes'] = self.product_codes
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('product_codes') is not None:
            self.product_codes = m.get('product_codes')
        return self


class QueryCommercialcoreProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 产品code
        self.product_code = product_code

    def validate(self):
        self.validate_required(self.product_code, 'product_code')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_code is not None:
            result['product_code'] = self.product_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        return self


class QueryCommercialcoreProductResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        product: ProductDTO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 产品信息
        self.product = product

    def validate(self):
        if self.product:
            self.product.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.product is not None:
            result['product'] = self.product.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('product') is not None:
            temp_model = ProductDTO()
            self.product = temp_model.from_map(m['product'])
        return self


class QueryCommercialcoreCommodityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 产品code
        self.product_code = product_code

    def validate(self):
        self.validate_required(self.product_code, 'product_code')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_code is not None:
            result['product_code'] = self.product_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        return self


class QueryCommercialcoreCommodityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        source_types: List[CommoditySourceType] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商品来源列表
        self.source_types = source_types

    def validate(self):
        if self.source_types:
            for k in self.source_types:
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
        result['source_types'] = []
        if self.source_types is not None:
            for k in self.source_types:
                result['source_types'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.source_types = []
        if m.get('source_types') is not None:
            for k in m.get('source_types'):
                temp_model = CommoditySourceType()
                self.source_types.append(temp_model.from_map(k))
        return self


class AddCommercialcoreCommodityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        commodity_code: str = None,
        product_code: str = None,
        commodity_name: str = None,
        service_type: str = None,
        source_type: str = None,
        desc: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 商品code
        self.commodity_code = commodity_code
        # 产品code
        self.product_code = product_code
        # 商品名称
        self.commodity_name = commodity_name
        # 商品服务类型
        self.service_type = service_type
        # 商品来源
        self.source_type = source_type
        # 商品描述
        self.desc = desc

    def validate(self):
        self.validate_required(self.commodity_code, 'commodity_code')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.commodity_name, 'commodity_name')
        self.validate_required(self.service_type, 'service_type')
        self.validate_required(self.source_type, 'source_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.commodity_name is not None:
            result['commodity_name'] = self.commodity_name
        if self.service_type is not None:
            result['service_type'] = self.service_type
        if self.source_type is not None:
            result['source_type'] = self.source_type
        if self.desc is not None:
            result['desc'] = self.desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('commodity_name') is not None:
            self.commodity_name = m.get('commodity_name')
        if m.get('service_type') is not None:
            self.service_type = m.get('service_type')
        if m.get('source_type') is not None:
            self.source_type = m.get('source_type')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        return self


class AddCommercialcoreCommodityResponse(TeaModel):
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


class UpdateCommercialcoreCommodityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        commodity_code: str = None,
        product_code: str = None,
        commodity_name: str = None,
        service_type: str = None,
        source_type: str = None,
        desc: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 商品code
        self.commodity_code = commodity_code
        # 产品code
        self.product_code = product_code
        # 商品名称
        self.commodity_name = commodity_name
        # 商品服务类型
        self.service_type = service_type
        # 商品来源
        self.source_type = source_type
        # 商品描述
        self.desc = desc

    def validate(self):
        self.validate_required(self.commodity_code, 'commodity_code')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.commodity_name, 'commodity_name')
        self.validate_required(self.service_type, 'service_type')
        self.validate_required(self.source_type, 'source_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.commodity_name is not None:
            result['commodity_name'] = self.commodity_name
        if self.service_type is not None:
            result['service_type'] = self.service_type
        if self.source_type is not None:
            result['source_type'] = self.source_type
        if self.desc is not None:
            result['desc'] = self.desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('commodity_name') is not None:
            self.commodity_name = m.get('commodity_name')
        if m.get('service_type') is not None:
            self.service_type = m.get('service_type')
        if m.get('source_type') is not None:
            self.source_type = m.get('source_type')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        return self


class UpdateCommercialcoreCommodityResponse(TeaModel):
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


class BatchqueryCommercialcoreSpecRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        commodity_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 商品code
        self.commodity_code = commodity_code

    def validate(self):
        self.validate_required(self.commodity_code, 'commodity_code')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        return self


class BatchqueryCommercialcoreSpecResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sales_modes: List[SpecSalesMode] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 规格售卖模式列表
        self.sales_modes = sales_modes

    def validate(self):
        if self.sales_modes:
            for k in self.sales_modes:
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
        result['sales_modes'] = []
        if self.sales_modes is not None:
            for k in self.sales_modes:
                result['sales_modes'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.sales_modes = []
        if m.get('sales_modes') is not None:
            for k in m.get('sales_modes'):
                temp_model = SpecSalesMode()
                self.sales_modes.append(temp_model.from_map(k))
        return self


class AddCommercialcoreSpecRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        spec_code: str = None,
        product_code: str = None,
        commodity_code: str = None,
        sales_mode: str = None,
        main_pay_method: str = None,
        spec_desc: str = None,
        spec_name: str = None,
        price_plan: PricePlanVO = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 规格code
        self.spec_code = spec_code
        # 产品code
        self.product_code = product_code
        # 商品code
        self.commodity_code = commodity_code
        # 售卖模式
        self.sales_mode = sales_mode
        # 主要付款方式
        self.main_pay_method = main_pay_method
        # 规格描述
        self.spec_desc = spec_desc
        # 规格名称
        self.spec_name = spec_name
        # 定价计划
        self.price_plan = price_plan

    def validate(self):
        self.validate_required(self.spec_code, 'spec_code')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.commodity_code, 'commodity_code')
        self.validate_required(self.sales_mode, 'sales_mode')
        self.validate_required(self.main_pay_method, 'main_pay_method')
        self.validate_required(self.spec_name, 'spec_name')
        self.validate_required(self.price_plan, 'price_plan')
        if self.price_plan:
            self.price_plan.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.spec_code is not None:
            result['spec_code'] = self.spec_code
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.sales_mode is not None:
            result['sales_mode'] = self.sales_mode
        if self.main_pay_method is not None:
            result['main_pay_method'] = self.main_pay_method
        if self.spec_desc is not None:
            result['spec_desc'] = self.spec_desc
        if self.spec_name is not None:
            result['spec_name'] = self.spec_name
        if self.price_plan is not None:
            result['price_plan'] = self.price_plan.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('spec_code') is not None:
            self.spec_code = m.get('spec_code')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('sales_mode') is not None:
            self.sales_mode = m.get('sales_mode')
        if m.get('main_pay_method') is not None:
            self.main_pay_method = m.get('main_pay_method')
        if m.get('spec_desc') is not None:
            self.spec_desc = m.get('spec_desc')
        if m.get('spec_name') is not None:
            self.spec_name = m.get('spec_name')
        if m.get('price_plan') is not None:
            temp_model = PricePlanVO()
            self.price_plan = temp_model.from_map(m['price_plan'])
        return self


class AddCommercialcoreSpecResponse(TeaModel):
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


class UpdateCommercialcoreSpecRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        spec_code: str = None,
        spec_name: str = None,
        main_pay_method: str = None,
        sales_mode: str = None,
        desc: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 规格code
        self.spec_code = spec_code
        # 规格名称
        self.spec_name = spec_name
        # 主要付款方式
        self.main_pay_method = main_pay_method
        # 售卖模式
        self.sales_mode = sales_mode
        # 规格描述
        self.desc = desc

    def validate(self):
        self.validate_required(self.spec_code, 'spec_code')
        self.validate_required(self.spec_name, 'spec_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.spec_code is not None:
            result['spec_code'] = self.spec_code
        if self.spec_name is not None:
            result['spec_name'] = self.spec_name
        if self.main_pay_method is not None:
            result['main_pay_method'] = self.main_pay_method
        if self.sales_mode is not None:
            result['sales_mode'] = self.sales_mode
        if self.desc is not None:
            result['desc'] = self.desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('spec_code') is not None:
            self.spec_code = m.get('spec_code')
        if m.get('spec_name') is not None:
            self.spec_name = m.get('spec_name')
        if m.get('main_pay_method') is not None:
            self.main_pay_method = m.get('main_pay_method')
        if m.get('sales_mode') is not None:
            self.sales_mode = m.get('sales_mode')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        return self


class UpdateCommercialcoreSpecResponse(TeaModel):
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


class AuthCommercialcoreSpecRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        spec_code: str = None,
        spec_status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 规格code
        self.spec_code = spec_code
        # 规格状态
        self.spec_status = spec_status

    def validate(self):
        self.validate_required(self.spec_code, 'spec_code')
        self.validate_required(self.spec_status, 'spec_status')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.spec_code is not None:
            result['spec_code'] = self.spec_code
        if self.spec_status is not None:
            result['spec_status'] = self.spec_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('spec_code') is not None:
            self.spec_code = m.get('spec_code')
        if m.get('spec_status') is not None:
            self.spec_status = m.get('spec_status')
        return self


class AuthCommercialcoreSpecResponse(TeaModel):
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


class CheckCommercialcoreProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 产品code
        self.product_code = product_code

    def validate(self):
        self.validate_required(self.product_code, 'product_code')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_code is not None:
            result['product_code'] = self.product_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        return self


class CheckCommercialcoreProductResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        is_duplicate: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # true: code已存在 ；false : code不存在
        self.is_duplicate = is_duplicate

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
        if self.is_duplicate is not None:
            result['is_duplicate'] = self.is_duplicate
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('is_duplicate') is not None:
            self.is_duplicate = m.get('is_duplicate')
        return self


class AddPartnercoreSignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        policy_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 政策id
        self.policy_id = policy_id

    def validate(self):
        self.validate_required(self.policy_id, 'policy_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.policy_id is not None:
            result['policy_id'] = self.policy_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('policy_id') is not None:
            self.policy_id = m.get('policy_id')
        return self


class AddPartnercoreSignResponse(TeaModel):
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


class QueryPartnercorePolicyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        policy_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 政策id
        self.policy_id = policy_id

    def validate(self):
        self.validate_required(self.policy_id, 'policy_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.policy_id is not None:
            result['policy_id'] = self.policy_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('policy_id') is not None:
            self.policy_id = m.get('policy_id')
        return self


class QueryPartnercorePolicyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        policy_dto: PolicyDTO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 政策信息扩展
        self.policy_dto = policy_dto

    def validate(self):
        if self.policy_dto:
            self.policy_dto.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.policy_dto is not None:
            result['policy_dto'] = self.policy_dto.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('policy_dto') is not None:
            temp_model = PolicyDTO()
            self.policy_dto = temp_model.from_map(m['policy_dto'])
        return self


class PagequeryPartnercorePolicyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        policy_name: str = None,
        policy_status: str = None,
        sign_status: str = None,
        current: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 政策名称（字段保留） 不做调用
        self.policy_name = policy_name
        # 政策状态（字段保留） 不做调用
        self.policy_status = policy_status
        # 签约状态 SIGNED已签约 UNSIGNED 待签约
        self.sign_status = sign_status
        # 当前页码
        self.current = current
        # 每页记录数
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.current, 'current')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.policy_name is not None:
            result['policy_name'] = self.policy_name
        if self.policy_status is not None:
            result['policy_status'] = self.policy_status
        if self.sign_status is not None:
            result['sign_status'] = self.sign_status
        if self.current is not None:
            result['current'] = self.current
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('policy_name') is not None:
            self.policy_name = m.get('policy_name')
        if m.get('policy_status') is not None:
            self.policy_status = m.get('policy_status')
        if m.get('sign_status') is not None:
            self.sign_status = m.get('sign_status')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryPartnercorePolicyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[PolicyDTO] = None,
        current: int = None,
        page_size: int = None,
        total: int = None,
        total_pages: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 政策信息扩展
        self.data = data
        # 当前页码
        self.current = current
        # 每页记录数
        self.page_size = page_size
        # 总记录数
        self.total = total
        # 总页数
        self.total_pages = total_pages

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
        if self.current is not None:
            result['current'] = self.current
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total is not None:
            result['total'] = self.total
        if self.total_pages is not None:
            result['total_pages'] = self.total_pages
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
                temp_model = PolicyDTO()
                self.data.append(temp_model.from_map(k))
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('total_pages') is not None:
            self.total_pages = m.get('total_pages')
        return self


class QueryPartnercoreSignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        agreement_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 合同id
        self.agreement_id = agreement_id

    def validate(self):
        self.validate_required(self.agreement_id, 'agreement_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.agreement_id is not None:
            result['agreement_id'] = self.agreement_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('agreement_id') is not None:
            self.agreement_id = m.get('agreement_id')
        return self


class QueryPartnercoreSignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        partner_policy_relation: PartnerPolicyRelation = None,
        policy_dto: PolicyDTO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 合同信息
        self.partner_policy_relation = partner_policy_relation
        # 政策信息扩展
        self.policy_dto = policy_dto

    def validate(self):
        if self.partner_policy_relation:
            self.partner_policy_relation.validate()
        if self.policy_dto:
            self.policy_dto.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.partner_policy_relation is not None:
            result['partner_policy_relation'] = self.partner_policy_relation.to_map()
        if self.policy_dto is not None:
            result['policy_dto'] = self.policy_dto.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('partner_policy_relation') is not None:
            temp_model = PartnerPolicyRelation()
            self.partner_policy_relation = temp_model.from_map(m['partner_policy_relation'])
        if m.get('policy_dto') is not None:
            temp_model = PolicyDTO()
            self.policy_dto = temp_model.from_map(m['policy_dto'])
        return self


class BatchqueryTradecorePaidspecinstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        merchant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 商业中台用来唯一标记商户的id
        self.merchant_id = merchant_id

    def validate(self):
        self.validate_required(self.merchant_id, 'merchant_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class BatchqueryTradecorePaidspecinstanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        paid_spec_instances: List[PaidSpecInstance] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 所有符合条件的规格实例的部分信息
        self.paid_spec_instances = paid_spec_instances

    def validate(self):
        if self.paid_spec_instances:
            for k in self.paid_spec_instances:
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
        result['paid_spec_instances'] = []
        if self.paid_spec_instances is not None:
            for k in self.paid_spec_instances:
                result['paid_spec_instances'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.paid_spec_instances = []
        if m.get('paid_spec_instances') is not None:
            for k in m.get('paid_spec_instances'):
                temp_model = PaidSpecInstance()
                self.paid_spec_instances.append(temp_model.from_map(k))
        return self


class BatchqueryTradecoreSoldspecinstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        merchant_id: str = None,
        merchant_login_main_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 商业中台用来唯一标记商户的id
        # merchant_id 与 merchant_login_main_id至少填一个
        self.merchant_id = merchant_id
        # 商户(买家)登录主账号
        # merchant_id 与 merchant_login_main_id至少填一个
        self.merchant_login_main_id = merchant_login_main_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.merchant_login_main_id is not None:
            result['merchant_login_main_id'] = self.merchant_login_main_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('merchant_login_main_id') is not None:
            self.merchant_login_main_id = m.get('merchant_login_main_id')
        return self


class BatchqueryTradecoreSoldspecinstanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sold_spec_instances: List[SoldSpecInstance] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 某开发商已售给某商户的所有规格实例信息
        self.sold_spec_instances = sold_spec_instances

    def validate(self):
        if self.sold_spec_instances:
            for k in self.sold_spec_instances:
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
        result['sold_spec_instances'] = []
        if self.sold_spec_instances is not None:
            for k in self.sold_spec_instances:
                result['sold_spec_instances'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.sold_spec_instances = []
        if m.get('sold_spec_instances') is not None:
            for k in m.get('sold_spec_instances'):
                temp_model = SoldSpecInstance()
                self.sold_spec_instances.append(temp_model.from_map(k))
        return self


class QueryTradecoreMerchantinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        merchant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 商业中台唯一标识商户的id
        self.merchant_id = merchant_id

    def validate(self):
        self.validate_required(self.merchant_id, 'merchant_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class QueryTradecoreMerchantinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        merchant_name: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商户的名称
        self.merchant_name = merchant_name

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
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        return self


class CreateTradecorePayRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        order_no: str = None,
        channel_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 订单编号
        self.order_no = order_no
        # 交易渠道编号
        self.channel_no = channel_no

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.channel_no, 'channel_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.channel_no is not None:
            result['channel_no'] = self.channel_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('channel_no') is not None:
            self.channel_no = m.get('channel_no')
        return self


class CreateTradecorePayResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        form_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # form表单信息
        self.form_data = form_data

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
        if self.form_data is not None:
            result['form_data'] = self.form_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('form_data') is not None:
            self.form_data = m.get('form_data')
        return self


class ReceiveTradecorePayRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        notify_data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 支付宝回调参数，参数可能变化，返回字符串
        self.notify_data = notify_data

    def validate(self):
        self.validate_required(self.notify_data, 'notify_data')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.notify_data is not None:
            result['notify_data'] = self.notify_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('notify_data') is not None:
            self.notify_data = m.get('notify_data')
        return self


class ReceiveTradecorePayResponse(TeaModel):
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
        # 返回success表示成功，否则失败
        self.result = result

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


class CancelTradecoreOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 订单号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class CancelTradecoreOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        main_order: MainOrderVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # main_order
        self.main_order = main_order

    def validate(self):
        if self.main_order:
            self.main_order.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.main_order is not None:
            result['main_order'] = self.main_order.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('main_order') is not None:
            temp_model = MainOrderVO()
            self.main_order = temp_model.from_map(m['main_order'])
        return self


class CreateTradecoreOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        seller: str = None,
        sp_id: str = None,
        product_name: str = None,
        amt: str = None,
        ccy: str = None,
        order_origin: str = None,
        pay_method: str = None,
        order_duration: str = None,
        commodity_name: str = None,
        spec_code: str = None,
        spec_name: str = None,
        spec_desc: str = None,
        order_detail: str = None,
        spec_props: List[Pair] = None,
        ext_params: List[Pair] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # seller
        self.seller = seller
        # 开发环境可以用：0016010039
        self.sp_id = sp_id
        # product_name
        self.product_name = product_name
        # 开发环境可以用：3000.00  单位是元
        self.amt = amt
        # ccy
        self.ccy = ccy
        # 固定填写OFFICIAL_SITE
        self.order_origin = order_origin
        # LICENSE(软件许可),RENEW(软件许可更新和技术支持),SUBSCRIBE(软件订阅),PRE(包年包月),POST(按量付费),SERVICE(服务型)
        self.pay_method = pay_method
        # order_duration
        self.order_duration = order_duration
        # commodity_name
        self.commodity_name = commodity_name
        # 开发环境可以用：10007
        self.spec_code = spec_code
        # spec_name
        self.spec_name = spec_name
        # spec_desc
        self.spec_desc = spec_desc
        # order_detail
        self.order_detail = order_detail
        # spec_props
        self.spec_props = spec_props
        # ext_params
        self.ext_params = ext_params

    def validate(self):
        self.validate_required(self.seller, 'seller')
        self.validate_required(self.sp_id, 'sp_id')
        self.validate_required(self.product_name, 'product_name')
        self.validate_required(self.amt, 'amt')
        self.validate_required(self.order_origin, 'order_origin')
        self.validate_required(self.pay_method, 'pay_method')
        self.validate_required(self.order_duration, 'order_duration')
        self.validate_required(self.commodity_name, 'commodity_name')
        self.validate_required(self.spec_code, 'spec_code')
        self.validate_required(self.spec_name, 'spec_name')
        self.validate_required(self.spec_props, 'spec_props')
        if self.spec_props:
            for k in self.spec_props:
                if k:
                    k.validate()
        if self.ext_params:
            for k in self.ext_params:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.seller is not None:
            result['seller'] = self.seller
        if self.sp_id is not None:
            result['sp_id'] = self.sp_id
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.amt is not None:
            result['amt'] = self.amt
        if self.ccy is not None:
            result['ccy'] = self.ccy
        if self.order_origin is not None:
            result['order_origin'] = self.order_origin
        if self.pay_method is not None:
            result['pay_method'] = self.pay_method
        if self.order_duration is not None:
            result['order_duration'] = self.order_duration
        if self.commodity_name is not None:
            result['commodity_name'] = self.commodity_name
        if self.spec_code is not None:
            result['spec_code'] = self.spec_code
        if self.spec_name is not None:
            result['spec_name'] = self.spec_name
        if self.spec_desc is not None:
            result['spec_desc'] = self.spec_desc
        if self.order_detail is not None:
            result['order_detail'] = self.order_detail
        result['spec_props'] = []
        if self.spec_props is not None:
            for k in self.spec_props:
                result['spec_props'].append(k.to_map() if k else None)
        result['ext_params'] = []
        if self.ext_params is not None:
            for k in self.ext_params:
                result['ext_params'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('seller') is not None:
            self.seller = m.get('seller')
        if m.get('sp_id') is not None:
            self.sp_id = m.get('sp_id')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('amt') is not None:
            self.amt = m.get('amt')
        if m.get('ccy') is not None:
            self.ccy = m.get('ccy')
        if m.get('order_origin') is not None:
            self.order_origin = m.get('order_origin')
        if m.get('pay_method') is not None:
            self.pay_method = m.get('pay_method')
        if m.get('order_duration') is not None:
            self.order_duration = m.get('order_duration')
        if m.get('commodity_name') is not None:
            self.commodity_name = m.get('commodity_name')
        if m.get('spec_code') is not None:
            self.spec_code = m.get('spec_code')
        if m.get('spec_name') is not None:
            self.spec_name = m.get('spec_name')
        if m.get('spec_desc') is not None:
            self.spec_desc = m.get('spec_desc')
        if m.get('order_detail') is not None:
            self.order_detail = m.get('order_detail')
        self.spec_props = []
        if m.get('spec_props') is not None:
            for k in m.get('spec_props'):
                temp_model = Pair()
                self.spec_props.append(temp_model.from_map(k))
        self.ext_params = []
        if m.get('ext_params') is not None:
            for k in m.get('ext_params'):
                temp_model = Pair()
                self.ext_params.append(temp_model.from_map(k))
        return self


class CreateTradecoreOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        main_order: MainOrderVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # main_order
        self.main_order = main_order

    def validate(self):
        if self.main_order:
            self.main_order.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.main_order is not None:
            result['main_order'] = self.main_order.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('main_order') is not None:
            temp_model = MainOrderVO()
            self.main_order = temp_model.from_map(m['main_order'])
        return self


class QueryTradecoreOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 订单号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class QueryTradecoreOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        main_order: MainOrderVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # main_order
        self.main_order = main_order

    def validate(self):
        if self.main_order:
            self.main_order.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.main_order is not None:
            result['main_order'] = self.main_order.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('main_order') is not None:
            temp_model = MainOrderVO()
            self.main_order = temp_model.from_map(m['main_order'])
        return self


class PagequeryTradecoreOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        order_type: str = None,
        order_status: str = None,
        sort_column: str = None,
        sort_type: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 取值范围：NEW
        self.order_type = order_type
        # 取值范围：INIT、PAY_SUCCESS、CLOSED
        self.order_status = order_status
        # 取值范围：GMT_CREATE（订单创建时间）、GMT_PAY_SUCCESS（订单支付成功时间）
        self.sort_column = sort_column
        # 取值范围：ASC（升序）、DESC（降序）
        self.sort_type = sort_type
        # page_num
        self.page_num = page_num
        # page_size
        self.page_size = page_size

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.order_type is not None:
            result['order_type'] = self.order_type
        if self.order_status is not None:
            result['order_status'] = self.order_status
        if self.sort_column is not None:
            result['sort_column'] = self.sort_column
        if self.sort_type is not None:
            result['sort_type'] = self.sort_type
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('order_type') is not None:
            self.order_type = m.get('order_type')
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        if m.get('sort_column') is not None:
            self.sort_column = m.get('sort_column')
        if m.get('sort_type') is not None:
            self.sort_type = m.get('sort_type')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryTradecoreOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pages: int = None,
        page_num: int = None,
        page_size: int = None,
        total: int = None,
        order_list: List[MainOrderVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总页数
        self.pages = pages
        # 当前页码
        self.page_num = page_num
        # page_size
        self.page_size = page_size
        # total
        self.total = total
        # order_list
        self.order_list = order_list

    def validate(self):
        if self.order_list:
            for k in self.order_list:
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
        if self.pages is not None:
            result['pages'] = self.pages
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total is not None:
            result['total'] = self.total
        result['order_list'] = []
        if self.order_list is not None:
            for k in self.order_list:
                result['order_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pages') is not None:
            self.pages = m.get('pages')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total') is not None:
            self.total = m.get('total')
        self.order_list = []
        if m.get('order_list') is not None:
            for k in m.get('order_list'):
                temp_model = MainOrderVO()
                self.order_list.append(temp_model.from_map(k))
        return self


class CheckTradecoreSpRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        sp_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 服务商id
        self.sp_id = sp_id

    def validate(self):
        self.validate_required(self.sp_id, 'sp_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.sp_id is not None:
            result['sp_id'] = self.sp_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('sp_id') is not None:
            self.sp_id = m.get('sp_id')
        return self


class CheckTradecoreSpResponse(TeaModel):
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


