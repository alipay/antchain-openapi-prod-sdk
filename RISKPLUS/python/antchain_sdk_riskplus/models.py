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


class RtopLevelDistribution(TeaModel):
    def __init__(
        self,
        count: int = None,
        level: str = None,
    ):
        # 统计值
        self.count = count
        # 等级
        self.level = level

    def validate(self):
        self.validate_required(self.count, 'count')
        self.validate_required(self.level, 'level')

    def to_map(self):
        result = dict()
        if self.count is not None:
            result['count'] = self.count
        if self.level is not None:
            result['level'] = self.level
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('count') is not None:
            self.count = m.get('count')
        if m.get('level') is not None:
            self.level = m.get('level')
        return self


class RtopCrowdRiskFeatureTag(TeaModel):
    def __init__(
        self,
        tag_explanation: str = None,
        tag_name: str = None,
    ):
        # 标签描述
        self.tag_explanation = tag_explanation
        # 标签名称
        self.tag_name = tag_name

    def validate(self):
        self.validate_required(self.tag_explanation, 'tag_explanation')
        self.validate_required(self.tag_name, 'tag_name')

    def to_map(self):
        result = dict()
        if self.tag_explanation is not None:
            result['tag_explanation'] = self.tag_explanation
        if self.tag_name is not None:
            result['tag_name'] = self.tag_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tag_explanation') is not None:
            self.tag_explanation = m.get('tag_explanation')
        if m.get('tag_name') is not None:
            self.tag_name = m.get('tag_name')
        return self


class RtopTypeDistribution(TeaModel):
    def __init__(
        self,
        count: int = None,
        level_distribution: List[RtopLevelDistribution] = None,
        type: str = None,
    ):
        # 统计值
        self.count = count
        # 当前类型下的等级分布
        self.level_distribution = level_distribution
        # 类型
        self.type = type

    def validate(self):
        self.validate_required(self.count, 'count')
        self.validate_required(self.level_distribution, 'level_distribution')
        if self.level_distribution:
            for k in self.level_distribution:
                if k:
                    k.validate()
        self.validate_required(self.type, 'type')

    def to_map(self):
        result = dict()
        if self.count is not None:
            result['count'] = self.count
        result['levelDistribution'] = []
        if self.level_distribution is not None:
            for k in self.level_distribution:
                result['levelDistribution'].append(k.to_map() if k else None)
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('count') is not None:
            self.count = m.get('count')
        self.level_distribution = []
        if m.get('levelDistribution') is not None:
            for k in m.get('levelDistribution'):
                temp_model = RtopLevelDistribution()
                self.level_distribution.append(temp_model.from_map(k))
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class RtopRiskTag(TeaModel):
    def __init__(
        self,
        clue_detail_type: str = None,
        tag_clue: str = None,
        tag_clue_detail: str = None,
        tag_id: str = None,
        tag_name: str = None,
        tag_text: str = None,
        tag_type: str = None,
    ):
        # 线索明细类型
        self.clue_detail_type = clue_detail_type
        # 线索概览
        self.tag_clue = tag_clue
        # 线索明细
        self.tag_clue_detail = tag_clue_detail
        # 标签ID
        self.tag_id = tag_id
        # 标签名称
        self.tag_name = tag_name
        # 标签文本
        self.tag_text = tag_text
        # 标签类型
        self.tag_type = tag_type

    def validate(self):
        self.validate_required(self.tag_id, 'tag_id')
        self.validate_required(self.tag_name, 'tag_name')

    def to_map(self):
        result = dict()
        if self.clue_detail_type is not None:
            result['clue_detail_type'] = self.clue_detail_type
        if self.tag_clue is not None:
            result['tag_clue'] = self.tag_clue
        if self.tag_clue_detail is not None:
            result['tag_clue_detail'] = self.tag_clue_detail
        if self.tag_id is not None:
            result['tag_id'] = self.tag_id
        if self.tag_name is not None:
            result['tag_name'] = self.tag_name
        if self.tag_text is not None:
            result['tag_text'] = self.tag_text
        if self.tag_type is not None:
            result['tag_type'] = self.tag_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('clue_detail_type') is not None:
            self.clue_detail_type = m.get('clue_detail_type')
        if m.get('tag_clue') is not None:
            self.tag_clue = m.get('tag_clue')
        if m.get('tag_clue_detail') is not None:
            self.tag_clue_detail = m.get('tag_clue_detail')
        if m.get('tag_id') is not None:
            self.tag_id = m.get('tag_id')
        if m.get('tag_name') is not None:
            self.tag_name = m.get('tag_name')
        if m.get('tag_text') is not None:
            self.tag_text = m.get('tag_text')
        if m.get('tag_type') is not None:
            self.tag_type = m.get('tag_type')
        return self


class SecurityDataQueryStruct(TeaModel):
    def __init__(
        self,
        params: str = None,
        type: str = None,
        version: str = None,
    ):
        # 请求数据参数
        self.params = params
        # 请求数据类型
        self.type = type
        # 请求数据版本
        self.version = version

    def validate(self):
        self.validate_required(self.params, 'params')
        self.validate_required(self.type, 'type')
        self.validate_required(self.version, 'version')

    def to_map(self):
        result = dict()
        if self.params is not None:
            result['params'] = self.params
        if self.type is not None:
            result['type'] = self.type
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('params') is not None:
            self.params = m.get('params')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('version') is not None:
            self.version = m.get('version')
        return self


class RtopCompanyOpinionCount(TeaModel):
    def __init__(
        self,
        company_name: str = None,
        count: int = None,
    ):
        # 企业名称
        self.company_name = company_name
        # 企业对应的舆情数量
        self.count = count

    def validate(self):
        self.validate_required(self.company_name, 'company_name')
        self.validate_required(self.count, 'count')

    def to_map(self):
        result = dict()
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.count is not None:
            result['count'] = self.count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('count') is not None:
            self.count = m.get('count')
        return self


class SecurityScene(TeaModel):
    def __init__(
        self,
        access_channel: str = None,
        ctu_params: str = None,
        product_name: str = None,
        product_node: str = None,
        security_scene_params: str = None,
        system_name: str = None,
        total_fee: str = None,
    ):
        # 接入渠道
        self.access_channel = access_channel
        # 事件信息
        self.ctu_params = ctu_params
        # 产品名称
        self.product_name = product_name
        # 产品节点
        self.product_node = product_node
        # 扩展参数
        self.security_scene_params = security_scene_params
        # 系统名称
        self.system_name = system_name
        # 总金额
        self.total_fee = total_fee

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.access_channel is not None:
            result['access_channel'] = self.access_channel
        if self.ctu_params is not None:
            result['ctu_params'] = self.ctu_params
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.product_node is not None:
            result['product_node'] = self.product_node
        if self.security_scene_params is not None:
            result['security_scene_params'] = self.security_scene_params
        if self.system_name is not None:
            result['system_name'] = self.system_name
        if self.total_fee is not None:
            result['total_fee'] = self.total_fee
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('access_channel') is not None:
            self.access_channel = m.get('access_channel')
        if m.get('ctu_params') is not None:
            self.ctu_params = m.get('ctu_params')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('product_node') is not None:
            self.product_node = m.get('product_node')
        if m.get('security_scene_params') is not None:
            self.security_scene_params = m.get('security_scene_params')
        if m.get('system_name') is not None:
            self.system_name = m.get('system_name')
        if m.get('total_fee') is not None:
            self.total_fee = m.get('total_fee')
        return self


class RtopAgeDistribution(TeaModel):
    def __init__(
        self,
        age: str = None,
        count: int = None,
    ):
        # 年龄
        self.age = age
        # 统计值
        self.count = count

    def validate(self):
        self.validate_required(self.age, 'age')
        self.validate_required(self.count, 'count')

    def to_map(self):
        result = dict()
        if self.age is not None:
            result['age'] = self.age
        if self.count is not None:
            result['count'] = self.count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('age') is not None:
            self.age = m.get('age')
        if m.get('count') is not None:
            self.count = m.get('count')
        return self


class RtopRegionalDistribution(TeaModel):
    def __init__(
        self,
        count: int = None,
        place: str = None,
        type_distribution: List[RtopTypeDistribution] = None,
    ):
        # 统计值
        self.count = count
        # 地区
        self.place = place
        # 当前地区的涉众风险类型分布，即非法集资有多少企业，传销有多少企业
        self.type_distribution = type_distribution

    def validate(self):
        self.validate_required(self.count, 'count')
        self.validate_required(self.place, 'place')
        if self.type_distribution:
            for k in self.type_distribution:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.count is not None:
            result['count'] = self.count
        if self.place is not None:
            result['place'] = self.place
        result['type_distribution'] = []
        if self.type_distribution is not None:
            for k in self.type_distribution:
                result['type_distribution'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('count') is not None:
            self.count = m.get('count')
        if m.get('place') is not None:
            self.place = m.get('place')
        self.type_distribution = []
        if m.get('type_distribution') is not None:
            for k in m.get('type_distribution'):
                temp_model = RtopTypeDistribution()
                self.type_distribution.append(temp_model.from_map(k))
        return self


class CompanyInfo(TeaModel):
    def __init__(
        self,
        active_addr_json: str = None,
        active_city: str = None,
        active_county: str = None,
        active_province: str = None,
        categories: str = None,
        check_date: str = None,
        del_flag: str = None,
        dt: str = None,
        former_org_names: str = None,
        head_office: str = None,
        id: int = None,
        involved_amount: int = None,
        involved_people: int = None,
        key_rela_orgs: str = None,
        legal_representative: str = None,
        mct_one_id: str = None,
        operating_addr_json: str = None,
        operating_city: str = None,
        operating_county: str = None,
        operating_place: str = None,
        operating_province: str = None,
        oprt_actv_state: str = None,
        oprt_end_date: str = None,
        oprt_scope: str = None,
        oprt_start_date: str = None,
        op_type: str = None,
        org_code: str = None,
        org_email: str = None,
        org_name: str = None,
        org_reg_cptl_rmb: str = None,
        org_state: str = None,
        org_tel: str = None,
        org_type: str = None,
        platform: str = None,
        platform_name: str = None,
        platform_states: str = None,
        register_capital_currency: str = None,
        register_capital_value: str = None,
        register_city: str = None,
        register_county: str = None,
        register_date: str = None,
        register_place: str = None,
        register_province: str = None,
        registration_authority: str = None,
        reg_no: str = None,
        riskstorm_company_id: str = None,
        risk_factors: str = None,
        risk_graph_json: str = None,
        risk_message: str = None,
        risk_score: int = None,
        risk_score_trend: str = None,
        risk_score_weekly_float: int = None,
        risk_tags: str = None,
        risk_tags_id: str = None,
        risk_type: str = None,
        search_content: str = None,
        spread_number: int = None,
        spread_num_distribution: str = None,
        uc_code: str = None,
        update_date: str = None,
    ):
        # 活跃地json
        self.active_addr_json = active_addr_json
        # 活跃市(字段停用)
        self.active_city = active_city
        # 活跃县(字段停用)
        self.active_county = active_county
        # 活跃省(字段停用)
        self.active_province = active_province
        # 类经融行业分类
        self.categories = categories
        # 核准日期
        self.check_date = check_date
        # 删除标志
        self.del_flag = del_flag
        # odps数据产生时间，业务上不关心
        self.dt = dt
        # 企业曾用名
        self.former_org_names = former_org_names
        # {"mct_one_id":"ID1","org_name":"总公司名称1"}
        self.head_office = head_office
        # 记录ID
        self.id = id
        # 影响金额
        self.involved_amount = involved_amount
        # 影响人数
        self.involved_people = involved_people
        # 重要关联企业,json格式
        self.key_rela_orgs = key_rela_orgs
        # 法人
        self.legal_representative = legal_representative
        # 企业ID
        self.mct_one_id = mct_one_id
        # 经营地json
        self.operating_addr_json = operating_addr_json
        # 经营市(字段停用)
        self.operating_city = operating_city
        # 经营县(字段停用)
        self.operating_county = operating_county
        # 经营地址(字段停用)
        self.operating_place = operating_place
        # 经营省(字段停用)
        self.operating_province = operating_province
        # 营运状态(1:营运0:不营运)
        self.oprt_actv_state = oprt_actv_state
        # 经营期限至
        self.oprt_end_date = oprt_end_date
        # 经营范围
        self.oprt_scope = oprt_scope
        # 经营期限自
        self.oprt_start_date = oprt_start_date
        # 操作类型
        # 
        self.op_type = op_type
        # 组织机构代码
        self.org_code = org_code
        # 电子邮箱
        self.org_email = org_email
        # 企业名
        self.org_name = org_name
        # 注册资本折人民币(万元)
        self.org_reg_cptl_rmb = org_reg_cptl_rmb
        # 企业状态
        self.org_state = org_state
        # 联系电话
        self.org_tel = org_tel
        # 企业类型
        self.org_type = org_type
        # 平台json
        self.platform = platform
        # 平台名
        self.platform_name = platform_name
        # 平台状态
        self.platform_states = platform_states
        # 注册资本币种
        self.register_capital_currency = register_capital_currency
        # 注册资本值
        self.register_capital_value = register_capital_value
        # 注册市
        self.register_city = register_city
        # 注册区县
        self.register_county = register_county
        # 注册时间
        self.register_date = register_date
        # 注册地址
        self.register_place = register_place
        # 注册省
        self.register_province = register_province
        # 登记机关
        self.registration_authority = registration_authority
        # 工商注册号
        self.reg_no = reg_no
        # 风报企业ID
        self.riskstorm_company_id = riskstorm_company_id
        # 风险维度
        self.risk_factors = risk_factors
        # 风险图谱可视化数据
        self.risk_graph_json = risk_graph_json
        # 风险报文
        self.risk_message = risk_message
        # 风险指数
        self.risk_score = risk_score
        # 风险指数，按日的趋势图
        self.risk_score_trend = risk_score_trend
        # 风险指数周波动
        self.risk_score_weekly_float = risk_score_weekly_float
        # 风险标签(字段停用)
        self.risk_tags = risk_tags
        # 风险标签ID
        self.risk_tags_id = risk_tags_id
        # 风险定性
        self.risk_type = risk_type
        # 搜索内容
        self.search_content = search_content
        # 传播人次
        self.spread_number = spread_number
        # 影响地区人次分布,json格式如下
        self.spread_num_distribution = spread_num_distribution
        # 社会统一信用代码
        self.uc_code = uc_code
        # 公有云数据库产生时间
        self.update_date = update_date

    def validate(self):
        self.validate_required(self.active_addr_json, 'active_addr_json')
        self.validate_required(self.active_city, 'active_city')
        self.validate_required(self.active_county, 'active_county')
        self.validate_required(self.active_province, 'active_province')
        self.validate_required(self.categories, 'categories')
        self.validate_required(self.check_date, 'check_date')
        self.validate_required(self.del_flag, 'del_flag')
        self.validate_required(self.dt, 'dt')
        self.validate_required(self.former_org_names, 'former_org_names')
        self.validate_required(self.head_office, 'head_office')
        self.validate_required(self.id, 'id')
        self.validate_required(self.involved_amount, 'involved_amount')
        self.validate_required(self.involved_people, 'involved_people')
        self.validate_required(self.key_rela_orgs, 'key_rela_orgs')
        self.validate_required(self.legal_representative, 'legal_representative')
        self.validate_required(self.mct_one_id, 'mct_one_id')
        self.validate_required(self.operating_addr_json, 'operating_addr_json')
        self.validate_required(self.operating_city, 'operating_city')
        self.validate_required(self.operating_county, 'operating_county')
        self.validate_required(self.operating_place, 'operating_place')
        self.validate_required(self.operating_province, 'operating_province')
        self.validate_required(self.oprt_actv_state, 'oprt_actv_state')
        self.validate_required(self.oprt_end_date, 'oprt_end_date')
        self.validate_required(self.oprt_scope, 'oprt_scope')
        self.validate_required(self.oprt_start_date, 'oprt_start_date')
        self.validate_required(self.op_type, 'op_type')
        self.validate_required(self.org_code, 'org_code')
        self.validate_required(self.org_email, 'org_email')
        self.validate_required(self.org_name, 'org_name')
        self.validate_required(self.org_reg_cptl_rmb, 'org_reg_cptl_rmb')
        self.validate_required(self.org_state, 'org_state')
        self.validate_required(self.org_tel, 'org_tel')
        self.validate_required(self.org_type, 'org_type')
        self.validate_required(self.platform, 'platform')
        self.validate_required(self.platform_name, 'platform_name')
        self.validate_required(self.platform_states, 'platform_states')
        self.validate_required(self.register_capital_currency, 'register_capital_currency')
        self.validate_required(self.register_capital_value, 'register_capital_value')
        self.validate_required(self.register_city, 'register_city')
        self.validate_required(self.register_county, 'register_county')
        self.validate_required(self.register_date, 'register_date')
        self.validate_required(self.register_place, 'register_place')
        self.validate_required(self.register_province, 'register_province')
        self.validate_required(self.registration_authority, 'registration_authority')
        self.validate_required(self.reg_no, 'reg_no')
        self.validate_required(self.riskstorm_company_id, 'riskstorm_company_id')
        self.validate_required(self.risk_factors, 'risk_factors')
        self.validate_required(self.risk_graph_json, 'risk_graph_json')
        self.validate_required(self.risk_message, 'risk_message')
        self.validate_required(self.risk_score, 'risk_score')
        self.validate_required(self.risk_score_trend, 'risk_score_trend')
        self.validate_required(self.risk_score_weekly_float, 'risk_score_weekly_float')
        self.validate_required(self.risk_tags, 'risk_tags')
        self.validate_required(self.risk_tags_id, 'risk_tags_id')
        self.validate_required(self.risk_type, 'risk_type')
        self.validate_required(self.search_content, 'search_content')
        self.validate_required(self.spread_number, 'spread_number')
        self.validate_required(self.spread_num_distribution, 'spread_num_distribution')
        self.validate_required(self.uc_code, 'uc_code')
        self.validate_required(self.update_date, 'update_date')

    def to_map(self):
        result = dict()
        if self.active_addr_json is not None:
            result['active_addr_json'] = self.active_addr_json
        if self.active_city is not None:
            result['active_city'] = self.active_city
        if self.active_county is not None:
            result['active_county'] = self.active_county
        if self.active_province is not None:
            result['active_province'] = self.active_province
        if self.categories is not None:
            result['categories'] = self.categories
        if self.check_date is not None:
            result['check_date'] = self.check_date
        if self.del_flag is not None:
            result['del_flag'] = self.del_flag
        if self.dt is not None:
            result['dt'] = self.dt
        if self.former_org_names is not None:
            result['former_org_names'] = self.former_org_names
        if self.head_office is not None:
            result['head_office'] = self.head_office
        if self.id is not None:
            result['id'] = self.id
        if self.involved_amount is not None:
            result['involved_amount'] = self.involved_amount
        if self.involved_people is not None:
            result['involved_people'] = self.involved_people
        if self.key_rela_orgs is not None:
            result['key_rela_orgs'] = self.key_rela_orgs
        if self.legal_representative is not None:
            result['legal_representative'] = self.legal_representative
        if self.mct_one_id is not None:
            result['mct_one_id'] = self.mct_one_id
        if self.operating_addr_json is not None:
            result['operating_addr_json'] = self.operating_addr_json
        if self.operating_city is not None:
            result['operating_city'] = self.operating_city
        if self.operating_county is not None:
            result['operating_county'] = self.operating_county
        if self.operating_place is not None:
            result['operating_place'] = self.operating_place
        if self.operating_province is not None:
            result['operating_province'] = self.operating_province
        if self.oprt_actv_state is not None:
            result['oprt_actv_state'] = self.oprt_actv_state
        if self.oprt_end_date is not None:
            result['oprt_end_date'] = self.oprt_end_date
        if self.oprt_scope is not None:
            result['oprt_scope'] = self.oprt_scope
        if self.oprt_start_date is not None:
            result['oprt_start_date'] = self.oprt_start_date
        if self.op_type is not None:
            result['op_type'] = self.op_type
        if self.org_code is not None:
            result['org_code'] = self.org_code
        if self.org_email is not None:
            result['org_email'] = self.org_email
        if self.org_name is not None:
            result['org_name'] = self.org_name
        if self.org_reg_cptl_rmb is not None:
            result['org_reg_cptl_rmb'] = self.org_reg_cptl_rmb
        if self.org_state is not None:
            result['org_state'] = self.org_state
        if self.org_tel is not None:
            result['org_tel'] = self.org_tel
        if self.org_type is not None:
            result['org_type'] = self.org_type
        if self.platform is not None:
            result['platform'] = self.platform
        if self.platform_name is not None:
            result['platform_name'] = self.platform_name
        if self.platform_states is not None:
            result['platform_states'] = self.platform_states
        if self.register_capital_currency is not None:
            result['register_capital_currency'] = self.register_capital_currency
        if self.register_capital_value is not None:
            result['register_capital_value'] = self.register_capital_value
        if self.register_city is not None:
            result['register_city'] = self.register_city
        if self.register_county is not None:
            result['register_county'] = self.register_county
        if self.register_date is not None:
            result['register_date'] = self.register_date
        if self.register_place is not None:
            result['register_place'] = self.register_place
        if self.register_province is not None:
            result['register_province'] = self.register_province
        if self.registration_authority is not None:
            result['registration_authority'] = self.registration_authority
        if self.reg_no is not None:
            result['reg_no'] = self.reg_no
        if self.riskstorm_company_id is not None:
            result['riskstorm_company_id'] = self.riskstorm_company_id
        if self.risk_factors is not None:
            result['risk_factors'] = self.risk_factors
        if self.risk_graph_json is not None:
            result['risk_graph_json'] = self.risk_graph_json
        if self.risk_message is not None:
            result['risk_message'] = self.risk_message
        if self.risk_score is not None:
            result['risk_score'] = self.risk_score
        if self.risk_score_trend is not None:
            result['risk_score_trend'] = self.risk_score_trend
        if self.risk_score_weekly_float is not None:
            result['risk_score_weekly_float'] = self.risk_score_weekly_float
        if self.risk_tags is not None:
            result['risk_tags'] = self.risk_tags
        if self.risk_tags_id is not None:
            result['risk_tags_id'] = self.risk_tags_id
        if self.risk_type is not None:
            result['risk_type'] = self.risk_type
        if self.search_content is not None:
            result['search_content'] = self.search_content
        if self.spread_number is not None:
            result['spread_number'] = self.spread_number
        if self.spread_num_distribution is not None:
            result['spread_num_distribution'] = self.spread_num_distribution
        if self.uc_code is not None:
            result['uc_code'] = self.uc_code
        if self.update_date is not None:
            result['update_date'] = self.update_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('active_addr_json') is not None:
            self.active_addr_json = m.get('active_addr_json')
        if m.get('active_city') is not None:
            self.active_city = m.get('active_city')
        if m.get('active_county') is not None:
            self.active_county = m.get('active_county')
        if m.get('active_province') is not None:
            self.active_province = m.get('active_province')
        if m.get('categories') is not None:
            self.categories = m.get('categories')
        if m.get('check_date') is not None:
            self.check_date = m.get('check_date')
        if m.get('del_flag') is not None:
            self.del_flag = m.get('del_flag')
        if m.get('dt') is not None:
            self.dt = m.get('dt')
        if m.get('former_org_names') is not None:
            self.former_org_names = m.get('former_org_names')
        if m.get('head_office') is not None:
            self.head_office = m.get('head_office')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('involved_amount') is not None:
            self.involved_amount = m.get('involved_amount')
        if m.get('involved_people') is not None:
            self.involved_people = m.get('involved_people')
        if m.get('key_rela_orgs') is not None:
            self.key_rela_orgs = m.get('key_rela_orgs')
        if m.get('legal_representative') is not None:
            self.legal_representative = m.get('legal_representative')
        if m.get('mct_one_id') is not None:
            self.mct_one_id = m.get('mct_one_id')
        if m.get('operating_addr_json') is not None:
            self.operating_addr_json = m.get('operating_addr_json')
        if m.get('operating_city') is not None:
            self.operating_city = m.get('operating_city')
        if m.get('operating_county') is not None:
            self.operating_county = m.get('operating_county')
        if m.get('operating_place') is not None:
            self.operating_place = m.get('operating_place')
        if m.get('operating_province') is not None:
            self.operating_province = m.get('operating_province')
        if m.get('oprt_actv_state') is not None:
            self.oprt_actv_state = m.get('oprt_actv_state')
        if m.get('oprt_end_date') is not None:
            self.oprt_end_date = m.get('oprt_end_date')
        if m.get('oprt_scope') is not None:
            self.oprt_scope = m.get('oprt_scope')
        if m.get('oprt_start_date') is not None:
            self.oprt_start_date = m.get('oprt_start_date')
        if m.get('op_type') is not None:
            self.op_type = m.get('op_type')
        if m.get('org_code') is not None:
            self.org_code = m.get('org_code')
        if m.get('org_email') is not None:
            self.org_email = m.get('org_email')
        if m.get('org_name') is not None:
            self.org_name = m.get('org_name')
        if m.get('org_reg_cptl_rmb') is not None:
            self.org_reg_cptl_rmb = m.get('org_reg_cptl_rmb')
        if m.get('org_state') is not None:
            self.org_state = m.get('org_state')
        if m.get('org_tel') is not None:
            self.org_tel = m.get('org_tel')
        if m.get('org_type') is not None:
            self.org_type = m.get('org_type')
        if m.get('platform') is not None:
            self.platform = m.get('platform')
        if m.get('platform_name') is not None:
            self.platform_name = m.get('platform_name')
        if m.get('platform_states') is not None:
            self.platform_states = m.get('platform_states')
        if m.get('register_capital_currency') is not None:
            self.register_capital_currency = m.get('register_capital_currency')
        if m.get('register_capital_value') is not None:
            self.register_capital_value = m.get('register_capital_value')
        if m.get('register_city') is not None:
            self.register_city = m.get('register_city')
        if m.get('register_county') is not None:
            self.register_county = m.get('register_county')
        if m.get('register_date') is not None:
            self.register_date = m.get('register_date')
        if m.get('register_place') is not None:
            self.register_place = m.get('register_place')
        if m.get('register_province') is not None:
            self.register_province = m.get('register_province')
        if m.get('registration_authority') is not None:
            self.registration_authority = m.get('registration_authority')
        if m.get('reg_no') is not None:
            self.reg_no = m.get('reg_no')
        if m.get('riskstorm_company_id') is not None:
            self.riskstorm_company_id = m.get('riskstorm_company_id')
        if m.get('risk_factors') is not None:
            self.risk_factors = m.get('risk_factors')
        if m.get('risk_graph_json') is not None:
            self.risk_graph_json = m.get('risk_graph_json')
        if m.get('risk_message') is not None:
            self.risk_message = m.get('risk_message')
        if m.get('risk_score') is not None:
            self.risk_score = m.get('risk_score')
        if m.get('risk_score_trend') is not None:
            self.risk_score_trend = m.get('risk_score_trend')
        if m.get('risk_score_weekly_float') is not None:
            self.risk_score_weekly_float = m.get('risk_score_weekly_float')
        if m.get('risk_tags') is not None:
            self.risk_tags = m.get('risk_tags')
        if m.get('risk_tags_id') is not None:
            self.risk_tags_id = m.get('risk_tags_id')
        if m.get('risk_type') is not None:
            self.risk_type = m.get('risk_type')
        if m.get('search_content') is not None:
            self.search_content = m.get('search_content')
        if m.get('spread_number') is not None:
            self.spread_number = m.get('spread_number')
        if m.get('spread_num_distribution') is not None:
            self.spread_num_distribution = m.get('spread_num_distribution')
        if m.get('uc_code') is not None:
            self.uc_code = m.get('uc_code')
        if m.get('update_date') is not None:
            self.update_date = m.get('update_date')
        return self


class RiskLabelInfo(TeaModel):
    def __init__(
        self,
        clue_detail_type: str = None,
        dt: str = None,
        gmt_create: str = None,
        id: int = None,
        is_deleted: int = None,
        mct_one_id: str = None,
        operator_id: str = None,
        op_type: str = None,
        org_name: str = None,
        risk_detail_type: str = None,
        risk_dimension_type: str = None,
        tag_clue: str = None,
        tag_clue_detail: str = None,
        tag_id: str = None,
        tag_list_headers: str = None,
        tag_list_order_column: str = None,
        tag_list_order_type: str = None,
        tag_text: str = None,
        tag_trend_chart_name: str = None,
        update_date: str = None,
    ):
        # 线索明细类型(字段停用)
        self.clue_detail_type = clue_detail_type
        # odps数据产出时间，冗余字段，业务上不需要，以备错误排查
        self.dt = dt
        # 数据产生时间
        self.gmt_create = gmt_create
        # 记录唯一ID
        self.id = id
        # 0-正常 1-删除
        self.is_deleted = is_deleted
        # 企业ID
        self.mct_one_id = mct_one_id
        # 操作人ID
        self.operator_id = operator_id
        # 操作类型
        # add、delete、update
        self.op_type = op_type
        # 企业名称
        self.org_name = org_name
        # 线索类型
        self.risk_detail_type = risk_detail_type
        # 风险维度
        # 
        self.risk_dimension_type = risk_dimension_type
        # 线索概览
        self.tag_clue = tag_clue
        # 线索明细
        self.tag_clue_detail = tag_clue_detail
        # 标签ID
        self.tag_id = tag_id
        # 线索列表表头，英文逗号分隔
        # 
        self.tag_list_headers = tag_list_headers
        # 标签列表，排序字段
        self.tag_list_order_column = tag_list_order_column
        # 标签列表排序方式
        self.tag_list_order_type = tag_list_order_type
        # 标签文本
        self.tag_text = tag_text
        # 趋势图表名
        self.tag_trend_chart_name = tag_trend_chart_name
        # 数据同步到公有云时间(业务上赋值当天)
        self.update_date = update_date

    def validate(self):
        self.validate_required(self.clue_detail_type, 'clue_detail_type')
        self.validate_required(self.gmt_create, 'gmt_create')
        self.validate_required(self.id, 'id')
        self.validate_required(self.is_deleted, 'is_deleted')
        self.validate_required(self.mct_one_id, 'mct_one_id')
        self.validate_required(self.operator_id, 'operator_id')
        self.validate_required(self.op_type, 'op_type')
        self.validate_required(self.org_name, 'org_name')
        self.validate_required(self.risk_detail_type, 'risk_detail_type')
        self.validate_required(self.risk_dimension_type, 'risk_dimension_type')
        self.validate_required(self.tag_clue, 'tag_clue')
        self.validate_required(self.tag_clue_detail, 'tag_clue_detail')
        self.validate_required(self.tag_id, 'tag_id')
        self.validate_required(self.tag_list_headers, 'tag_list_headers')
        self.validate_required(self.tag_list_order_column, 'tag_list_order_column')
        self.validate_required(self.tag_list_order_type, 'tag_list_order_type')
        self.validate_required(self.tag_text, 'tag_text')
        self.validate_required(self.tag_trend_chart_name, 'tag_trend_chart_name')
        self.validate_required(self.update_date, 'update_date')

    def to_map(self):
        result = dict()
        if self.clue_detail_type is not None:
            result['clue_detail_type'] = self.clue_detail_type
        if self.dt is not None:
            result['dt'] = self.dt
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.id is not None:
            result['id'] = self.id
        if self.is_deleted is not None:
            result['is_deleted'] = self.is_deleted
        if self.mct_one_id is not None:
            result['mct_one_id'] = self.mct_one_id
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        if self.op_type is not None:
            result['op_type'] = self.op_type
        if self.org_name is not None:
            result['org_name'] = self.org_name
        if self.risk_detail_type is not None:
            result['risk_detail_type'] = self.risk_detail_type
        if self.risk_dimension_type is not None:
            result['risk_dimension_type'] = self.risk_dimension_type
        if self.tag_clue is not None:
            result['tag_clue'] = self.tag_clue
        if self.tag_clue_detail is not None:
            result['tag_clue_detail'] = self.tag_clue_detail
        if self.tag_id is not None:
            result['tag_id'] = self.tag_id
        if self.tag_list_headers is not None:
            result['tag_list_headers'] = self.tag_list_headers
        if self.tag_list_order_column is not None:
            result['tag_list_order_column'] = self.tag_list_order_column
        if self.tag_list_order_type is not None:
            result['tag_list_order_type'] = self.tag_list_order_type
        if self.tag_text is not None:
            result['tag_text'] = self.tag_text
        if self.tag_trend_chart_name is not None:
            result['tag_trend_chart_name'] = self.tag_trend_chart_name
        if self.update_date is not None:
            result['update_date'] = self.update_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('clue_detail_type') is not None:
            self.clue_detail_type = m.get('clue_detail_type')
        if m.get('dt') is not None:
            self.dt = m.get('dt')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('is_deleted') is not None:
            self.is_deleted = m.get('is_deleted')
        if m.get('mct_one_id') is not None:
            self.mct_one_id = m.get('mct_one_id')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        if m.get('op_type') is not None:
            self.op_type = m.get('op_type')
        if m.get('org_name') is not None:
            self.org_name = m.get('org_name')
        if m.get('risk_detail_type') is not None:
            self.risk_detail_type = m.get('risk_detail_type')
        if m.get('risk_dimension_type') is not None:
            self.risk_dimension_type = m.get('risk_dimension_type')
        if m.get('tag_clue') is not None:
            self.tag_clue = m.get('tag_clue')
        if m.get('tag_clue_detail') is not None:
            self.tag_clue_detail = m.get('tag_clue_detail')
        if m.get('tag_id') is not None:
            self.tag_id = m.get('tag_id')
        if m.get('tag_list_headers') is not None:
            self.tag_list_headers = m.get('tag_list_headers')
        if m.get('tag_list_order_column') is not None:
            self.tag_list_order_column = m.get('tag_list_order_column')
        if m.get('tag_list_order_type') is not None:
            self.tag_list_order_type = m.get('tag_list_order_type')
        if m.get('tag_text') is not None:
            self.tag_text = m.get('tag_text')
        if m.get('tag_trend_chart_name') is not None:
            self.tag_trend_chart_name = m.get('tag_trend_chart_name')
        if m.get('update_date') is not None:
            self.update_date = m.get('update_date')
        return self


class RiskLabelConfigInfo(TeaModel):
    def __init__(
        self,
        gmt_create: str = None,
        gmt_modified: str = None,
        id: int = None,
        is_delete: int = None,
        operator_id: str = None,
        risk_detail_type: str = None,
        risk_dimension_type: str = None,
        tag_id: str = None,
        tag_list_headers: str = None,
        tag_list_order_column: str = None,
        tag_list_order_type: str = None,
        tag_text: str = None,
        tag_trend_chart_name: str = None,
    ):
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified
        # id
        self.id = id
        # 标记删除
        self.is_delete = is_delete
        # 操作人ID
        self.operator_id = operator_id
        # 线索类型
        self.risk_detail_type = risk_detail_type
        # 风险维度
        self.risk_dimension_type = risk_dimension_type
        # 线索ID
        self.tag_id = tag_id
        # 线索列表表头，英文逗号分隔
        self.tag_list_headers = tag_list_headers
        # 标签列表，排序字段
        self.tag_list_order_column = tag_list_order_column
        # 标签列表排序方式
        self.tag_list_order_type = tag_list_order_type
        # 标签文本
        self.tag_text = tag_text
        # 趋势图表名
        self.tag_trend_chart_name = tag_trend_chart_name

    def validate(self):
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        self.validate_required(self.id, 'id')
        self.validate_required(self.is_delete, 'is_delete')
        self.validate_required(self.operator_id, 'operator_id')
        self.validate_required(self.risk_detail_type, 'risk_detail_type')
        self.validate_required(self.risk_dimension_type, 'risk_dimension_type')
        self.validate_required(self.tag_id, 'tag_id')
        self.validate_required(self.tag_list_headers, 'tag_list_headers')
        self.validate_required(self.tag_list_order_column, 'tag_list_order_column')
        self.validate_required(self.tag_list_order_type, 'tag_list_order_type')
        self.validate_required(self.tag_text, 'tag_text')
        self.validate_required(self.tag_trend_chart_name, 'tag_trend_chart_name')

    def to_map(self):
        result = dict()
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.id is not None:
            result['id'] = self.id
        if self.is_delete is not None:
            result['is_delete'] = self.is_delete
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        if self.risk_detail_type is not None:
            result['risk_detail_type'] = self.risk_detail_type
        if self.risk_dimension_type is not None:
            result['risk_dimension_type'] = self.risk_dimension_type
        if self.tag_id is not None:
            result['tag_id'] = self.tag_id
        if self.tag_list_headers is not None:
            result['tag_list_headers'] = self.tag_list_headers
        if self.tag_list_order_column is not None:
            result['tag_list_order_column'] = self.tag_list_order_column
        if self.tag_list_order_type is not None:
            result['tag_list_order_type'] = self.tag_list_order_type
        if self.tag_text is not None:
            result['tag_text'] = self.tag_text
        if self.tag_trend_chart_name is not None:
            result['tag_trend_chart_name'] = self.tag_trend_chart_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('is_delete') is not None:
            self.is_delete = m.get('is_delete')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        if m.get('risk_detail_type') is not None:
            self.risk_detail_type = m.get('risk_detail_type')
        if m.get('risk_dimension_type') is not None:
            self.risk_dimension_type = m.get('risk_dimension_type')
        if m.get('tag_id') is not None:
            self.tag_id = m.get('tag_id')
        if m.get('tag_list_headers') is not None:
            self.tag_list_headers = m.get('tag_list_headers')
        if m.get('tag_list_order_column') is not None:
            self.tag_list_order_column = m.get('tag_list_order_column')
        if m.get('tag_list_order_type') is not None:
            self.tag_list_order_type = m.get('tag_list_order_type')
        if m.get('tag_text') is not None:
            self.tag_text = m.get('tag_text')
        if m.get('tag_trend_chart_name') is not None:
            self.tag_trend_chart_name = m.get('tag_trend_chart_name')
        return self


class RtopCompanyRiskInfo(TeaModel):
    def __init__(
        self,
        mct_one_id: str = None,
        org_code: str = None,
        org_name: str = None,
        place_name: str = None,
        place_type: str = None,
        reg_no: str = None,
        risk_score: str = None,
        risk_shift_rank: str = None,
        risk_tags_id: List[str] = None,
        risk_type: str = None,
        tags_clue: str = None,
        tags_clue_detail: str = None,
        uc_code: str = None,
    ):
        # 企业唯一id
        self.mct_one_id = mct_one_id
        # 组织机构代码
        self.org_code = org_code
        # 企业名
        self.org_name = org_name
        # 区域
        self.place_name = place_name
        # 区域类型
        self.place_type = place_type
        # 工商注册号
        self.reg_no = reg_no
        # 风险评分
        self.risk_score = risk_score
        # 风险变化程度排序，根据分值波动大小，标签变更次数排序
        self.risk_shift_rank = risk_shift_rank
        # 风险标签id列表
        self.risk_tags_id = risk_tags_id
        # 风险定性
        self.risk_type = risk_type
        # 线索
        self.tags_clue = tags_clue
        # 风险线索明细
        self.tags_clue_detail = tags_clue_detail
        # 企业统一社会信用代码
        self.uc_code = uc_code

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.mct_one_id is not None:
            result['mct_one_id'] = self.mct_one_id
        if self.org_code is not None:
            result['org_code'] = self.org_code
        if self.org_name is not None:
            result['org_name'] = self.org_name
        if self.place_name is not None:
            result['place_name'] = self.place_name
        if self.place_type is not None:
            result['place_type'] = self.place_type
        if self.reg_no is not None:
            result['reg_no'] = self.reg_no
        if self.risk_score is not None:
            result['risk_score'] = self.risk_score
        if self.risk_shift_rank is not None:
            result['risk_shift_rank'] = self.risk_shift_rank
        if self.risk_tags_id is not None:
            result['risk_tags_id'] = self.risk_tags_id
        if self.risk_type is not None:
            result['risk_type'] = self.risk_type
        if self.tags_clue is not None:
            result['tags_clue'] = self.tags_clue
        if self.tags_clue_detail is not None:
            result['tags_clue_detail'] = self.tags_clue_detail
        if self.uc_code is not None:
            result['uc_code'] = self.uc_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('mct_one_id') is not None:
            self.mct_one_id = m.get('mct_one_id')
        if m.get('org_code') is not None:
            self.org_code = m.get('org_code')
        if m.get('org_name') is not None:
            self.org_name = m.get('org_name')
        if m.get('place_name') is not None:
            self.place_name = m.get('place_name')
        if m.get('place_type') is not None:
            self.place_type = m.get('place_type')
        if m.get('reg_no') is not None:
            self.reg_no = m.get('reg_no')
        if m.get('risk_score') is not None:
            self.risk_score = m.get('risk_score')
        if m.get('risk_shift_rank') is not None:
            self.risk_shift_rank = m.get('risk_shift_rank')
        if m.get('risk_tags_id') is not None:
            self.risk_tags_id = m.get('risk_tags_id')
        if m.get('risk_type') is not None:
            self.risk_type = m.get('risk_type')
        if m.get('tags_clue') is not None:
            self.tags_clue = m.get('tags_clue')
        if m.get('tags_clue_detail') is not None:
            self.tags_clue_detail = m.get('tags_clue_detail')
        if m.get('uc_code') is not None:
            self.uc_code = m.get('uc_code')
        return self


class ServiceContext(TeaModel):
    def __init__(
        self,
        client_ip: str = None,
        client_pcidguid: str = None,
        server_name: str = None,
        session_id: str = None,
        user_id: str = None,
    ):
        # 客户端IP
        self.client_ip = client_ip
        # 客户端UMID
        self.client_pcidguid = client_pcidguid
        # 服务器名
        self.server_name = server_name
        # 会话ID
        self.session_id = session_id
        # 用户ID
        self.user_id = user_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.client_ip is not None:
            result['client_ip'] = self.client_ip
        if self.client_pcidguid is not None:
            result['client_pcidguid'] = self.client_pcidguid
        if self.server_name is not None:
            result['server_name'] = self.server_name
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('client_ip') is not None:
            self.client_ip = m.get('client_ip')
        if m.get('client_pcidguid') is not None:
            self.client_pcidguid = m.get('client_pcidguid')
        if m.get('server_name') is not None:
            self.server_name = m.get('server_name')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class RtopGenderDistribution(TeaModel):
    def __init__(
        self,
        count: int = None,
        gender: str = None,
    ):
        # 统计值
        self.count = count
        # 性别
        self.gender = gender

    def validate(self):
        self.validate_required(self.count, 'count')
        self.validate_required(self.gender, 'gender')

    def to_map(self):
        result = dict()
        if self.count is not None:
            result['count'] = self.count
        if self.gender is not None:
            result['gender'] = self.gender
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('count') is not None:
            self.count = m.get('count')
        if m.get('gender') is not None:
            self.gender = m.get('gender')
        return self


class ZhimaQueryResp(TeaModel):
    def __init__(
        self,
        ep_cert_no: str = None,
        ep_name: str = None,
        failed_code: str = None,
        passed: str = None,
        result_code: str = None,
        result_msg: str = None,
        sub_code: str = None,
        sub_msg: str = None,
    ):
        # 认证的企业证件号
        self.ep_cert_no = ep_cert_no
        # 认证的企业名
        self.ep_name = ep_name
        # 认证不通过的错误码
        self.failed_code = failed_code
        # 认证是否通过，通过为true，不通过为false
        self.passed = passed
        # 10000是成功，其余是失败
        self.result_code = result_code
        # 
        self.result_msg = result_msg
        # 
        self.sub_code = sub_code
        # 
        self.sub_msg = sub_msg

    def validate(self):
        self.validate_required(self.result_code, 'result_code')
        self.validate_required(self.result_msg, 'result_msg')

    def to_map(self):
        result = dict()
        if self.ep_cert_no is not None:
            result['ep_cert_no'] = self.ep_cert_no
        if self.ep_name is not None:
            result['ep_name'] = self.ep_name
        if self.failed_code is not None:
            result['failed_code'] = self.failed_code
        if self.passed is not None:
            result['passed'] = self.passed
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ep_cert_no') is not None:
            self.ep_cert_no = m.get('ep_cert_no')
        if m.get('ep_name') is not None:
            self.ep_name = m.get('ep_name')
        if m.get('failed_code') is not None:
            self.failed_code = m.get('failed_code')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        return self


class RtopRiskyCompany(TeaModel):
    def __init__(
        self,
        change_level: str = None,
        change_score: str = None,
        company_id: str = None,
        data_time: str = None,
        head_register_place: str = None,
        new_added_time: str = None,
    ):
        # 异动程度
        self.change_level = change_level
        # 异动分数
        self.change_score = change_score
        # 企业ID
        self.company_id = company_id
        # 数据的时间
        self.data_time = data_time
        # 总公司注册地
        self.head_register_place = head_register_place
        # 新增企业的时间
        self.new_added_time = new_added_time

    def validate(self):
        self.validate_required(self.change_level, 'change_level')
        self.validate_required(self.change_score, 'change_score')
        self.validate_required(self.company_id, 'company_id')
        self.validate_required(self.data_time, 'data_time')
        self.validate_required(self.head_register_place, 'head_register_place')
        self.validate_required(self.new_added_time, 'new_added_time')
        if self.new_added_time is not None:
            self.validate_pattern(self.new_added_time, 'new_added_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')

    def to_map(self):
        result = dict()
        if self.change_level is not None:
            result['change_level'] = self.change_level
        if self.change_score is not None:
            result['change_score'] = self.change_score
        if self.company_id is not None:
            result['company_id'] = self.company_id
        if self.data_time is not None:
            result['data_time'] = self.data_time
        if self.head_register_place is not None:
            result['head_register_place'] = self.head_register_place
        if self.new_added_time is not None:
            result['new_added_time'] = self.new_added_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('change_level') is not None:
            self.change_level = m.get('change_level')
        if m.get('change_score') is not None:
            self.change_score = m.get('change_score')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        if m.get('data_time') is not None:
            self.data_time = m.get('data_time')
        if m.get('head_register_place') is not None:
            self.head_register_place = m.get('head_register_place')
        if m.get('new_added_time') is not None:
            self.new_added_time = m.get('new_added_time')
        return self


class RtopPopulationDistribution(TeaModel):
    def __init__(
        self,
        city: str = None,
        count: int = None,
    ):
        # 市
        self.city = city
        # 统计值
        self.count = count

    def validate(self):
        self.validate_required(self.city, 'city')
        self.validate_required(self.count, 'count')

    def to_map(self):
        result = dict()
        if self.city is not None:
            result['city'] = self.city
        if self.count is not None:
            result['count'] = self.count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('city') is not None:
            self.city = m.get('city')
        if m.get('count') is not None:
            self.count = m.get('count')
        return self


class RtopCompanyAlarm(TeaModel):
    def __init__(
        self,
        alarm_date: str = None,
        alarm_flag: str = None,
        alarm_idx: str = None,
        alarm_type: str = None,
        company_id: str = None,
    ):
        # 预警日期
        self.alarm_date = alarm_date
        # 预警标识，是否需要预警
        self.alarm_flag = alarm_flag
        # 预警序号
        self.alarm_idx = alarm_idx
        # 预警类型
        self.alarm_type = alarm_type
        # 企业ID
        self.company_id = company_id

    def validate(self):
        self.validate_required(self.alarm_date, 'alarm_date')
        self.validate_required(self.alarm_flag, 'alarm_flag')
        self.validate_required(self.alarm_idx, 'alarm_idx')
        self.validate_required(self.alarm_type, 'alarm_type')
        self.validate_required(self.company_id, 'company_id')

    def to_map(self):
        result = dict()
        if self.alarm_date is not None:
            result['alarm_date'] = self.alarm_date
        if self.alarm_flag is not None:
            result['alarm_flag'] = self.alarm_flag
        if self.alarm_idx is not None:
            result['alarm_idx'] = self.alarm_idx
        if self.alarm_type is not None:
            result['alarm_type'] = self.alarm_type
        if self.company_id is not None:
            result['company_id'] = self.company_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('alarm_date') is not None:
            self.alarm_date = m.get('alarm_date')
        if m.get('alarm_flag') is not None:
            self.alarm_flag = m.get('alarm_flag')
        if m.get('alarm_idx') is not None:
            self.alarm_idx = m.get('alarm_idx')
        if m.get('alarm_type') is not None:
            self.alarm_type = m.get('alarm_type')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        return self


class RtopCompanyFeedback(TeaModel):
    def __init__(
        self,
        comment: str = None,
        company_id: str = None,
        feedback_reason: str = None,
        feedback_reason_detail: str = None,
        id: int = None,
    ):
        # 评论
        self.comment = comment
        # 企业ID
        self.company_id = company_id
        # 反馈原因
        self.feedback_reason = feedback_reason
        # 反馈原因详情
        self.feedback_reason_detail = feedback_reason_detail
        # 主键
        self.id = id

    def validate(self):
        self.validate_required(self.comment, 'comment')
        self.validate_required(self.company_id, 'company_id')
        self.validate_required(self.feedback_reason, 'feedback_reason')
        self.validate_required(self.feedback_reason_detail, 'feedback_reason_detail')
        self.validate_required(self.id, 'id')

    def to_map(self):
        result = dict()
        if self.comment is not None:
            result['comment'] = self.comment
        if self.company_id is not None:
            result['company_id'] = self.company_id
        if self.feedback_reason is not None:
            result['feedback_reason'] = self.feedback_reason
        if self.feedback_reason_detail is not None:
            result['feedback_reason_detail'] = self.feedback_reason_detail
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('comment') is not None:
            self.comment = m.get('comment')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        if m.get('feedback_reason') is not None:
            self.feedback_reason = m.get('feedback_reason')
        if m.get('feedback_reason_detail') is not None:
            self.feedback_reason_detail = m.get('feedback_reason_detail')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class RtopCompanyRiskFactor(TeaModel):
    def __init__(
        self,
        name: str = None,
        score: int = None,
    ):
        # 维度名称
        self.name = name
        # 维度分数
        self.score = score

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.score is not None:
            result['score'] = self.score
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('score') is not None:
            self.score = m.get('score')
        return self


class RtopRiskStormCompanyAnnualReport(TeaModel):
    def __init__(
        self,
        annual_report_count: int = None,
        annual_report_has_equity_transfer: bool = None,
        annual_report_has_external_guarantee: bool = None,
        annual_report_has_external_invest: bool = None,
        annual_report_main_business_income: str = None,
        annual_report_net_profit: str = None,
        annual_report_release_date: str = None,
        annual_report_sh_actual_paid: str = None,
        annual_report_staff_count: int = None,
        annual_report_total_assets: str = None,
        annual_report_total_liabilities: str = None,
        annual_report_total_operating_income: str = None,
        annual_report_total_owner_equity: str = None,
        annual_report_total_profit: str = None,
        annual_report_total_tax: str = None,
        annual_report_year: str = None,
    ):
        # 年报个数
        self.annual_report_count = annual_report_count
        # 年报是否发生股权转让
        self.annual_report_has_equity_transfer = annual_report_has_equity_transfer
        # 年报是否对外提供担保
        self.annual_report_has_external_guarantee = annual_report_has_external_guarantee
        # 年报是否对外投资
        self.annual_report_has_external_invest = annual_report_has_external_invest
        # 营业总收入中主营业务收入
        self.annual_report_main_business_income = annual_report_main_business_income
        # 年报净利润
        self.annual_report_net_profit = annual_report_net_profit
        # 年报发布日期
        self.annual_report_release_date = annual_report_release_date
        # 年报股东实缴出资额（万元（实缴出资额用两个冒号::分割）
        self.annual_report_sh_actual_paid = annual_report_sh_actual_paid
        # 年报公司人数
        self.annual_report_staff_count = annual_report_staff_count
        # 资产总额
        self.annual_report_total_assets = annual_report_total_assets
        # 负债总额
        self.annual_report_total_liabilities = annual_report_total_liabilities
        # 营业总收入
        self.annual_report_total_operating_income = annual_report_total_operating_income
        # 年报所有者权益合计
        self.annual_report_total_owner_equity = annual_report_total_owner_equity
        # 年报利润总额
        self.annual_report_total_profit = annual_report_total_profit
        # 纳税总额
        self.annual_report_total_tax = annual_report_total_tax
        # 年报报送年度
        self.annual_report_year = annual_report_year

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.annual_report_count is not None:
            result['annual_report_count'] = self.annual_report_count
        if self.annual_report_has_equity_transfer is not None:
            result['annual_report_has_equity_transfer'] = self.annual_report_has_equity_transfer
        if self.annual_report_has_external_guarantee is not None:
            result['annual_report_has_external_guarantee'] = self.annual_report_has_external_guarantee
        if self.annual_report_has_external_invest is not None:
            result['annual_report_has_external_invest'] = self.annual_report_has_external_invest
        if self.annual_report_main_business_income is not None:
            result['annual_report_main_business_income'] = self.annual_report_main_business_income
        if self.annual_report_net_profit is not None:
            result['annual_report_net_profit'] = self.annual_report_net_profit
        if self.annual_report_release_date is not None:
            result['annual_report_release_date'] = self.annual_report_release_date
        if self.annual_report_sh_actual_paid is not None:
            result['annual_report_sh_actual_paid'] = self.annual_report_sh_actual_paid
        if self.annual_report_staff_count is not None:
            result['annual_report_staff_count'] = self.annual_report_staff_count
        if self.annual_report_total_assets is not None:
            result['annual_report_total_assets'] = self.annual_report_total_assets
        if self.annual_report_total_liabilities is not None:
            result['annual_report_total_liabilities'] = self.annual_report_total_liabilities
        if self.annual_report_total_operating_income is not None:
            result['annual_report_total_operating_income'] = self.annual_report_total_operating_income
        if self.annual_report_total_owner_equity is not None:
            result['annual_report_total_owner_equity'] = self.annual_report_total_owner_equity
        if self.annual_report_total_profit is not None:
            result['annual_report_total_profit'] = self.annual_report_total_profit
        if self.annual_report_total_tax is not None:
            result['annual_report_total_tax'] = self.annual_report_total_tax
        if self.annual_report_year is not None:
            result['annual_report_year'] = self.annual_report_year
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('annual_report_count') is not None:
            self.annual_report_count = m.get('annual_report_count')
        if m.get('annual_report_has_equity_transfer') is not None:
            self.annual_report_has_equity_transfer = m.get('annual_report_has_equity_transfer')
        if m.get('annual_report_has_external_guarantee') is not None:
            self.annual_report_has_external_guarantee = m.get('annual_report_has_external_guarantee')
        if m.get('annual_report_has_external_invest') is not None:
            self.annual_report_has_external_invest = m.get('annual_report_has_external_invest')
        if m.get('annual_report_main_business_income') is not None:
            self.annual_report_main_business_income = m.get('annual_report_main_business_income')
        if m.get('annual_report_net_profit') is not None:
            self.annual_report_net_profit = m.get('annual_report_net_profit')
        if m.get('annual_report_release_date') is not None:
            self.annual_report_release_date = m.get('annual_report_release_date')
        if m.get('annual_report_sh_actual_paid') is not None:
            self.annual_report_sh_actual_paid = m.get('annual_report_sh_actual_paid')
        if m.get('annual_report_staff_count') is not None:
            self.annual_report_staff_count = m.get('annual_report_staff_count')
        if m.get('annual_report_total_assets') is not None:
            self.annual_report_total_assets = m.get('annual_report_total_assets')
        if m.get('annual_report_total_liabilities') is not None:
            self.annual_report_total_liabilities = m.get('annual_report_total_liabilities')
        if m.get('annual_report_total_operating_income') is not None:
            self.annual_report_total_operating_income = m.get('annual_report_total_operating_income')
        if m.get('annual_report_total_owner_equity') is not None:
            self.annual_report_total_owner_equity = m.get('annual_report_total_owner_equity')
        if m.get('annual_report_total_profit') is not None:
            self.annual_report_total_profit = m.get('annual_report_total_profit')
        if m.get('annual_report_total_tax') is not None:
            self.annual_report_total_tax = m.get('annual_report_total_tax')
        if m.get('annual_report_year') is not None:
            self.annual_report_year = m.get('annual_report_year')
        return self


class RtopDateDistribution(TeaModel):
    def __init__(
        self,
        count: int = None,
        date: str = None,
    ):
        # 统计值
        self.count = count
        # 年龄
        self.date = date

    def validate(self):
        self.validate_required(self.count, 'count')
        self.validate_required(self.date, 'date')
        if self.date is not None:
            self.validate_pattern(self.date, 'date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')

    def to_map(self):
        result = dict()
        if self.count is not None:
            result['count'] = self.count
        if self.date is not None:
            result['date'] = self.date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('count') is not None:
            self.count = m.get('count')
        if m.get('date') is not None:
            self.date = m.get('date')
        return self


class RtopCompanyOpinionDetail(TeaModel):
    def __init__(
        self,
        doc_content: str = None,
        doc_id: str = None,
        doc_title: str = None,
        doc_url: str = None,
        emotion_score: str = None,
        entity_relevancy_score: str = None,
        hit_keywords: str = None,
        media_influence_score: str = None,
        media_name: str = None,
        media_propagation_score: str = None,
        publish_time: str = None,
        similar_docs: int = None,
    ):
        # 具体的舆情内容
        self.doc_content = doc_content
        # 舆情的id
        self.doc_id = doc_id
        # 舆情的标题
        self.doc_title = doc_title
        # 舆情的url
        self.doc_url = doc_url
        # 情感得分
        self.emotion_score = emotion_score
        # 实体相关度得分
        self.entity_relevancy_score = entity_relevancy_score
        # 命中的关键词
        self.hit_keywords = hit_keywords
        # 媒体影响力得分
        self.media_influence_score = media_influence_score
        # 来源媒体
        self.media_name = media_name
        # 媒体传播得分
        self.media_propagation_score = media_propagation_score
        # 舆情的发布时间
        self.publish_time = publish_time
        # 相似文章数
        self.similar_docs = similar_docs

    def validate(self):
        self.validate_required(self.doc_content, 'doc_content')
        self.validate_required(self.doc_id, 'doc_id')
        self.validate_required(self.doc_title, 'doc_title')
        self.validate_required(self.doc_url, 'doc_url')
        self.validate_required(self.media_name, 'media_name')
        self.validate_required(self.publish_time, 'publish_time')
        if self.publish_time is not None:
            self.validate_pattern(self.publish_time, 'publish_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')

    def to_map(self):
        result = dict()
        if self.doc_content is not None:
            result['doc_content'] = self.doc_content
        if self.doc_id is not None:
            result['doc_id'] = self.doc_id
        if self.doc_title is not None:
            result['doc_title'] = self.doc_title
        if self.doc_url is not None:
            result['doc_url'] = self.doc_url
        if self.emotion_score is not None:
            result['emotion_score'] = self.emotion_score
        if self.entity_relevancy_score is not None:
            result['entity_relevancy_score'] = self.entity_relevancy_score
        if self.hit_keywords is not None:
            result['hit_keywords'] = self.hit_keywords
        if self.media_influence_score is not None:
            result['media_influence_score'] = self.media_influence_score
        if self.media_name is not None:
            result['media_name'] = self.media_name
        if self.media_propagation_score is not None:
            result['media_propagation_score'] = self.media_propagation_score
        if self.publish_time is not None:
            result['publish_time'] = self.publish_time
        if self.similar_docs is not None:
            result['similar_docs'] = self.similar_docs
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('doc_content') is not None:
            self.doc_content = m.get('doc_content')
        if m.get('doc_id') is not None:
            self.doc_id = m.get('doc_id')
        if m.get('doc_title') is not None:
            self.doc_title = m.get('doc_title')
        if m.get('doc_url') is not None:
            self.doc_url = m.get('doc_url')
        if m.get('emotion_score') is not None:
            self.emotion_score = m.get('emotion_score')
        if m.get('entity_relevancy_score') is not None:
            self.entity_relevancy_score = m.get('entity_relevancy_score')
        if m.get('hit_keywords') is not None:
            self.hit_keywords = m.get('hit_keywords')
        if m.get('media_influence_score') is not None:
            self.media_influence_score = m.get('media_influence_score')
        if m.get('media_name') is not None:
            self.media_name = m.get('media_name')
        if m.get('media_propagation_score') is not None:
            self.media_propagation_score = m.get('media_propagation_score')
        if m.get('publish_time') is not None:
            self.publish_time = m.get('publish_time')
        if m.get('similar_docs') is not None:
            self.similar_docs = m.get('similar_docs')
        return self


class StrategyDetails(TeaModel):
    def __init__(
        self,
        decision: str = None,
        id: str = None,
        name: str = None,
        scene_code: str = None,
    ):
        # 决策结果
        self.decision = decision
        # 策略id
        self.id = id
        # 策略名称
        self.name = name
        # 场景码
        self.scene_code = scene_code

    def validate(self):
        self.validate_required(self.decision, 'decision')
        self.validate_required(self.id, 'id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.scene_code, 'scene_code')

    def to_map(self):
        result = dict()
        if self.decision is not None:
            result['decision'] = self.decision
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        return self


class RpcommonResp(TeaModel):
    def __init__(
        self,
        data: str = None,
        response_code: str = None,
        result_msg: str = None,
        success: bool = None,
    ):
        # 具体返回值.jsonString形式
        self.data = data
        # 结果码
        self.response_code = response_code
        # 结果描述
        self.result_msg = result_msg
        # 调用是否成功
        self.success = success

    def validate(self):
        self.validate_required(self.data, 'data')
        self.validate_required(self.response_code, 'response_code')
        self.validate_required(self.result_msg, 'result_msg')
        self.validate_required(self.success, 'success')

    def to_map(self):
        result = dict()
        if self.data is not None:
            result['data'] = self.data
        if self.response_code is not None:
            result['response_code'] = self.response_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class RiskStormLabelResp(TeaModel):
    def __init__(
        self,
        label_count: int = None,
        label_id: str = None,
        label_name: str = None,
    ):
        # 标签次数
        self.label_count = label_count
        # 标签id
        self.label_id = label_id
        # 标签名称
        self.label_name = label_name

    def validate(self):
        self.validate_required(self.label_count, 'label_count')
        self.validate_required(self.label_id, 'label_id')
        self.validate_required(self.label_name, 'label_name')

    def to_map(self):
        result = dict()
        if self.label_count is not None:
            result['label_count'] = self.label_count
        if self.label_id is not None:
            result['label_id'] = self.label_id
        if self.label_name is not None:
            result['label_name'] = self.label_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('label_count') is not None:
            self.label_count = m.get('label_count')
        if m.get('label_id') is not None:
            self.label_id = m.get('label_id')
        if m.get('label_name') is not None:
            self.label_name = m.get('label_name')
        return self


class ModelDetails(TeaModel):
    def __init__(
        self,
        scene_code: str = None,
        score: str = None,
    ):
        # 风险场景编码
        self.scene_code = scene_code
        # 该风险场景的风险分值
        # 
        self.score = score

    def validate(self):
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.score, 'score')

    def to_map(self):
        result = dict()
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.score is not None:
            result['score'] = self.score
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('score') is not None:
            self.score = m.get('score')
        return self


class ZhimaIdentifyResp(TeaModel):
    def __init__(
        self,
        biz_no: str = None,
        certify_url: str = None,
        result_code: str = None,
        result_msg: str = None,
        sub_code: str = None,
        sub_msg: str = None,
    ):
        # 唯一ID，接口正常的话有此字段
        self.biz_no = biz_no
        # 带参数的回调地址，接口正常的话有此字段
        self.certify_url = certify_url
        # 蚂蚁调用芝麻的错误码
        self.result_code = result_code
        # 蚂蚁调用芝麻的结果描述
        self.result_msg = result_msg
        # 蚂蚁调用芝麻的错误码
        self.sub_code = sub_code
        # 蚂蚁调用芝麻信息
        self.sub_msg = sub_msg

    def validate(self):
        self.validate_required(self.result_code, 'result_code')
        self.validate_required(self.result_msg, 'result_msg')

    def to_map(self):
        result = dict()
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.certify_url is not None:
            result['certify_url'] = self.certify_url
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('certify_url') is not None:
            self.certify_url = m.get('certify_url')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        return self


class RtopCrowdRiskFeatureResp(TeaModel):
    def __init__(
        self,
        clue_tags: List[RtopCrowdRiskFeatureTag] = None,
        feature_name: str = None,
        score: int = None,
    ):
        # 特征标签列表
        self.clue_tags = clue_tags
        # 特征名称
        self.feature_name = feature_name
        # 特征​分数
        self.score = score

    def validate(self):
        if self.clue_tags:
            for k in self.clue_tags:
                if k:
                    k.validate()
        self.validate_required(self.feature_name, 'feature_name')
        self.validate_required(self.score, 'score')

    def to_map(self):
        result = dict()
        result['clue_tags'] = []
        if self.clue_tags is not None:
            for k in self.clue_tags:
                result['clue_tags'].append(k.to_map() if k else None)
        if self.feature_name is not None:
            result['feature_name'] = self.feature_name
        if self.score is not None:
            result['score'] = self.score
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.clue_tags = []
        if m.get('clue_tags') is not None:
            for k in m.get('clue_tags'):
                temp_model = RtopCrowdRiskFeatureTag()
                self.clue_tags.append(temp_model.from_map(k))
        if m.get('feature_name') is not None:
            self.feature_name = m.get('feature_name')
        if m.get('score') is not None:
            self.score = m.get('score')
        return self


class RtopCrowdRiskSummaryResp(TeaModel):
    def __init__(
        self,
        active_city: str = None,
        active_county: str = None,
        active_province: str = None,
        clue_tags: List[str] = None,
        company_id: str = None,
        company_name: str = None,
        crowd_risk_level: str = None,
        crowd_risk_score: int = None,
        crowd_risk_type: str = None,
        detected_time: str = None,
        money_involved: int = None,
        people_involved: int = None,
        registered_city: str = None,
        registered_county: str = None,
        registered_province: str = None,
    ):
        # 活跃市
        self.active_city = active_city
        # 活跃县
        self.active_county = active_county
        # 活跃省
        self.active_province = active_province
        # 风险标签
        self.clue_tags = clue_tags
        # 企业ID
        self.company_id = company_id
        # 企业名称
        self.company_name = company_name
        # 风险等级
        self.crowd_risk_level = crowd_risk_level
        # 涉众风险分数
        self.crowd_risk_score = crowd_risk_score
        # 涉众风险类型
        self.crowd_risk_type = crowd_risk_type
        # 发现时间
        self.detected_time = detected_time
        # 影响金额
        self.money_involved = money_involved
        # 影响人数
        self.people_involved = people_involved
        # 注册市
        self.registered_city = registered_city
        # 注册县
        self.registered_county = registered_county
        # 注册省
        self.registered_province = registered_province

    def validate(self):
        self.validate_required(self.company_id, 'company_id')
        self.validate_required(self.company_name, 'company_name')
        if self.detected_time is not None:
            self.validate_pattern(self.detected_time, 'detected_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')

    def to_map(self):
        result = dict()
        if self.active_city is not None:
            result['active_city'] = self.active_city
        if self.active_county is not None:
            result['active_county'] = self.active_county
        if self.active_province is not None:
            result['active_province'] = self.active_province
        if self.clue_tags is not None:
            result['clue_tags'] = self.clue_tags
        if self.company_id is not None:
            result['company_id'] = self.company_id
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.crowd_risk_level is not None:
            result['crowd_risk_level'] = self.crowd_risk_level
        if self.crowd_risk_score is not None:
            result['crowd_risk_score'] = self.crowd_risk_score
        if self.crowd_risk_type is not None:
            result['crowd_risk_type'] = self.crowd_risk_type
        if self.detected_time is not None:
            result['detected_time'] = self.detected_time
        if self.money_involved is not None:
            result['money_involved'] = self.money_involved
        if self.people_involved is not None:
            result['people_involved'] = self.people_involved
        if self.registered_city is not None:
            result['registered_city'] = self.registered_city
        if self.registered_county is not None:
            result['registered_county'] = self.registered_county
        if self.registered_province is not None:
            result['registered_province'] = self.registered_province
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('active_city') is not None:
            self.active_city = m.get('active_city')
        if m.get('active_county') is not None:
            self.active_county = m.get('active_county')
        if m.get('active_province') is not None:
            self.active_province = m.get('active_province')
        if m.get('clue_tags') is not None:
            self.clue_tags = m.get('clue_tags')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('crowd_risk_level') is not None:
            self.crowd_risk_level = m.get('crowd_risk_level')
        if m.get('crowd_risk_score') is not None:
            self.crowd_risk_score = m.get('crowd_risk_score')
        if m.get('crowd_risk_type') is not None:
            self.crowd_risk_type = m.get('crowd_risk_type')
        if m.get('detected_time') is not None:
            self.detected_time = m.get('detected_time')
        if m.get('money_involved') is not None:
            self.money_involved = m.get('money_involved')
        if m.get('people_involved') is not None:
            self.people_involved = m.get('people_involved')
        if m.get('registered_city') is not None:
            self.registered_city = m.get('registered_city')
        if m.get('registered_county') is not None:
            self.registered_county = m.get('registered_county')
        if m.get('registered_province') is not None:
            self.registered_province = m.get('registered_province')
        return self


class RiskLabelFilterConfigInfo(TeaModel):
    def __init__(
        self,
        gmt_create: str = None,
        gmt_modified: str = None,
        id: int = None,
        is_base: int = None,
        is_delete: int = None,
        operator_id: str = None,
        place_name: str = None,
        place_type: str = None,
        tag_id: str = None,
    ):
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified
        # id
        self.id = id
        # 是否为基本筛选标签
        self.is_base = is_base
        # 标记删除
        self.is_delete = is_delete
        # 操作人员ID
        self.operator_id = operator_id
        # 地区名
        self.place_name = place_name
        # 地区类型
        self.place_type = place_type
        # 标签ID
        self.tag_id = tag_id

    def validate(self):
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        self.validate_required(self.id, 'id')
        self.validate_required(self.is_base, 'is_base')
        self.validate_required(self.is_delete, 'is_delete')
        self.validate_required(self.operator_id, 'operator_id')
        self.validate_required(self.place_name, 'place_name')
        self.validate_required(self.place_type, 'place_type')
        self.validate_required(self.tag_id, 'tag_id')

    def to_map(self):
        result = dict()
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.id is not None:
            result['id'] = self.id
        if self.is_base is not None:
            result['is_base'] = self.is_base
        if self.is_delete is not None:
            result['is_delete'] = self.is_delete
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        if self.place_name is not None:
            result['place_name'] = self.place_name
        if self.place_type is not None:
            result['place_type'] = self.place_type
        if self.tag_id is not None:
            result['tag_id'] = self.tag_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('is_base') is not None:
            self.is_base = m.get('is_base')
        if m.get('is_delete') is not None:
            self.is_delete = m.get('is_delete')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        if m.get('place_name') is not None:
            self.place_name = m.get('place_name')
        if m.get('place_type') is not None:
            self.place_type = m.get('place_type')
        if m.get('tag_id') is not None:
            self.tag_id = m.get('tag_id')
        return self


class RtopStarCompanyInfo(TeaModel):
    def __init__(
        self,
        categories: List[str] = None,
        operating_place: str = None,
        operating_province: str = None,
        org_name: str = None,
        risk_score: int = None,
        risk_tags: List[str] = None,
        risk_tag_details: List[RtopRiskTag] = None,
        risk_tag_ids: List[str] = None,
        uc_code: str = None,
    ):
        # 行业
        self.categories = categories
        # 经营地址
        self.operating_place = operating_place
        # 经营省份
        self.operating_province = operating_province
        # 企业名称
        self.org_name = org_name
        # 风险分数
        self.risk_score = risk_score
        # 风险标签
        self.risk_tags = risk_tags
        # 风险线索
        self.risk_tag_details = risk_tag_details
        # 风险标签Id集合
        self.risk_tag_ids = risk_tag_ids
        # 统一社会信用代码
        self.uc_code = uc_code

    def validate(self):
        if self.risk_tag_details:
            for k in self.risk_tag_details:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.categories is not None:
            result['categories'] = self.categories
        if self.operating_place is not None:
            result['operating_place'] = self.operating_place
        if self.operating_province is not None:
            result['operating_province'] = self.operating_province
        if self.org_name is not None:
            result['org_name'] = self.org_name
        if self.risk_score is not None:
            result['risk_score'] = self.risk_score
        if self.risk_tags is not None:
            result['risk_tags'] = self.risk_tags
        result['risk_tag_details'] = []
        if self.risk_tag_details is not None:
            for k in self.risk_tag_details:
                result['risk_tag_details'].append(k.to_map() if k else None)
        if self.risk_tag_ids is not None:
            result['risk_tag_ids'] = self.risk_tag_ids
        if self.uc_code is not None:
            result['uc_code'] = self.uc_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('categories') is not None:
            self.categories = m.get('categories')
        if m.get('operating_place') is not None:
            self.operating_place = m.get('operating_place')
        if m.get('operating_province') is not None:
            self.operating_province = m.get('operating_province')
        if m.get('org_name') is not None:
            self.org_name = m.get('org_name')
        if m.get('risk_score') is not None:
            self.risk_score = m.get('risk_score')
        if m.get('risk_tags') is not None:
            self.risk_tags = m.get('risk_tags')
        self.risk_tag_details = []
        if m.get('risk_tag_details') is not None:
            for k in m.get('risk_tag_details'):
                temp_model = RtopRiskTag()
                self.risk_tag_details.append(temp_model.from_map(k))
        if m.get('risk_tag_ids') is not None:
            self.risk_tag_ids = m.get('risk_tag_ids')
        if m.get('uc_code') is not None:
            self.uc_code = m.get('uc_code')
        return self


class RtopTagImage(TeaModel):
    def __init__(
        self,
        id: int = None,
        image: str = None,
    ):
        # 标签图片表主键
        self.id = id
        # 图片
        self.image = image

    def validate(self):
        self.validate_required(self.id, 'id')

    def to_map(self):
        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.image is not None:
            result['image'] = self.image
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('image') is not None:
            self.image = m.get('image')
        return self


class RtopRiskGeneNode(TeaModel):
    def __init__(
        self,
        main_company_id: str = None,
        main_company_name: str = None,
        node_cert_no: str = None,
        node_ext_json: str = None,
        node_id: str = None,
        node_name: str = None,
        node_type: str = None,
        risk_label: str = None,
        risk_mode: str = None,
    ):
        # 主企业唯一ID
        self.main_company_id = main_company_id
        # 主企业名称
        self.main_company_name = main_company_name
        # 节点证件号码
        self.node_cert_no = node_cert_no
        # 节点扩展信息
        self.node_ext_json = node_ext_json
        # 节点唯一ID
        self.node_id = node_id
        # 节点名称
        self.node_name = node_name
        # 节点类型，枚举值
        self.node_type = node_type
        # 基因模式
        self.risk_label = risk_label
        # 基因模式
        self.risk_mode = risk_mode

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.main_company_id is not None:
            result['main_company_id'] = self.main_company_id
        if self.main_company_name is not None:
            result['main_company_name'] = self.main_company_name
        if self.node_cert_no is not None:
            result['node_cert_no'] = self.node_cert_no
        if self.node_ext_json is not None:
            result['node_ext_json'] = self.node_ext_json
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.node_name is not None:
            result['node_name'] = self.node_name
        if self.node_type is not None:
            result['node_type'] = self.node_type
        if self.risk_label is not None:
            result['risk_label'] = self.risk_label
        if self.risk_mode is not None:
            result['risk_mode'] = self.risk_mode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('main_company_id') is not None:
            self.main_company_id = m.get('main_company_id')
        if m.get('main_company_name') is not None:
            self.main_company_name = m.get('main_company_name')
        if m.get('node_cert_no') is not None:
            self.node_cert_no = m.get('node_cert_no')
        if m.get('node_ext_json') is not None:
            self.node_ext_json = m.get('node_ext_json')
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('node_name') is not None:
            self.node_name = m.get('node_name')
        if m.get('node_type') is not None:
            self.node_type = m.get('node_type')
        if m.get('risk_label') is not None:
            self.risk_label = m.get('risk_label')
        if m.get('risk_mode') is not None:
            self.risk_mode = m.get('risk_mode')
        return self


class RtopMonitorCompanyFeature(TeaModel):
    def __init__(
        self,
        description: str = None,
        name: str = None,
        risk_tags: List[str] = None,
        score: int = None,
    ):
        # 特征的描述
        self.description = description
        # 特征的名称
        self.name = name
        # 特征里的风险标签列表
        self.risk_tags = risk_tags
        # 特征的评分
        self.score = score

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.score, 'score')

    def to_map(self):
        result = dict()
        if self.description is not None:
            result['description'] = self.description
        if self.name is not None:
            result['name'] = self.name
        if self.risk_tags is not None:
            result['risk_tags'] = self.risk_tags
        if self.score is not None:
            result['score'] = self.score
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('risk_tags') is not None:
            self.risk_tags = m.get('risk_tags')
        if m.get('score') is not None:
            self.score = m.get('score')
        return self


class QuerySecurityPolicyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        risk_type: str = None,
        security_scene: SecurityScene = None,
        service_context: ServiceContext = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 风险类型：表示风险处理或风险咨询——process/advice
        self.risk_type = risk_type
        self.security_scene = security_scene
        self.service_context = service_context

    def validate(self):
        self.validate_required(self.risk_type, 'risk_type')
        self.validate_required(self.security_scene, 'security_scene')
        if self.security_scene:
            self.security_scene.validate()
        self.validate_required(self.service_context, 'service_context')
        if self.service_context:
            self.service_context.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.risk_type is not None:
            result['risk_type'] = self.risk_type
        if self.security_scene is not None:
            result['security_scene'] = self.security_scene.to_map()
        if self.service_context is not None:
            result['service_context'] = self.service_context.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('risk_type') is not None:
            self.risk_type = m.get('risk_type')
        if m.get('security_scene') is not None:
            temp_model = SecurityScene()
            self.security_scene = temp_model.from_map(m['security_scene'])
        if m.get('service_context') is not None:
            temp_model = ServiceContext()
            self.service_context = temp_model.from_map(m['service_context'])
        return self


class QuerySecurityPolicyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        level: int = None,
        security_id: str = None,
        security_result: str = None,
        success: str = None,
        template_code: str = None,
        template_desc: str = None,
        verify_id: str = None,
        verify_url: str = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 风险咨询情况下返回的风险等级，风险处理不会返回该值
        self.level = level
        # 反馈成功之后的id
        self.security_id = security_id
        # 安全处理结果，枚举值为：reject[拒绝],validate[校验],accept[放过]
        self.security_result = security_result
        # 是否成功
        self.success = success
        # 有风险需要失败业务情况下的返回码
        self.template_code = template_code
        # 有风险需要失败业务情况下的返回码描述
        self.template_desc = template_desc
        # native场景下的核身id
        self.verify_id = verify_id
        # h5场景下的核身地址
        self.verify_url = verify_url

    def validate(self):
        self.validate_required(self.success, 'success')

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.level is not None:
            result['level'] = self.level
        if self.security_id is not None:
            result['security_id'] = self.security_id
        if self.security_result is not None:
            result['security_result'] = self.security_result
        if self.success is not None:
            result['success'] = self.success
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_desc is not None:
            result['template_desc'] = self.template_desc
        if self.verify_id is not None:
            result['verify_id'] = self.verify_id
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
        if m.get('level') is not None:
            self.level = m.get('level')
        if m.get('security_id') is not None:
            self.security_id = m.get('security_id')
        if m.get('security_result') is not None:
            self.security_result = m.get('security_result')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_desc') is not None:
            self.template_desc = m.get('template_desc')
        if m.get('verify_id') is not None:
            self.verify_id = m.get('verify_id')
        if m.get('verify_url') is not None:
            self.verify_url = m.get('verify_url')
        return self


class SendSecurityDataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        security_content: str = None,
        security_sign: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 安全累计属性列表字段，安全属性列表
        self.security_content = security_content
        # 代码发送给安全核心的事件编码
        self.security_sign = security_sign

    def validate(self):
        self.validate_required(self.security_content, 'security_content')
        self.validate_required(self.security_sign, 'security_sign')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.security_content is not None:
            result['security_content'] = self.security_content
        if self.security_sign is not None:
            result['security_sign'] = self.security_sign
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('security_content') is not None:
            self.security_content = m.get('security_content')
        if m.get('security_sign') is not None:
            self.security_sign = m.get('security_sign')
        return self


class SendSecurityDataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: str = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 是否成功
        self.success = success

    def validate(self):
        self.validate_required(self.success, 'success')

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


class ConfirmSecurityPolicyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        confirm_params: str = None,
        security_id: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 二次确认参数，防止篡改
        self.confirm_params = confirm_params
        # 代码发送给安全核心的事件编码
        self.security_id = security_id

    def validate(self):
        self.validate_required(self.confirm_params, 'confirm_params')
        self.validate_required(self.security_id, 'security_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.confirm_params is not None:
            result['confirm_params'] = self.confirm_params
        if self.security_id is not None:
            result['security_id'] = self.security_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('confirm_params') is not None:
            self.confirm_params = m.get('confirm_params')
        if m.get('security_id') is not None:
            self.security_id = m.get('security_id')
        return self


class ConfirmSecurityPolicyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: str = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 是否成功
        self.success = success

    def validate(self):
        self.validate_required(self.success, 'success')

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


class CheckSecurityRdsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        rds_content: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 输入大字段，具体见接入文档
        self.rds_content = rds_content

    def validate(self):
        self.validate_required(self.rds_content, 'rds_content')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.rds_content is not None:
            result['rds_content'] = self.rds_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('rds_content') is not None:
            self.rds_content = m.get('rds_content')
        return self


class CheckSecurityRdsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: int = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 是否成功
        self.result = result

    def validate(self):
        self.validate_required(self.result, 'result')

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


class QuerySecurityDataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        req_info: List[SecurityDataQueryStruct] = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.req_info = req_info

    def validate(self):
        self.validate_required(self.req_info, 'req_info')
        if self.req_info:
            for k in self.req_info:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        result['req_info'] = []
        if self.req_info is not None:
            for k in self.req_info:
                result['req_info'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.req_info = []
        if m.get('req_info') is not None:
            for k in m.get('req_info'):
                temp_model = SecurityDataQueryStruct()
                self.req_info.append(temp_model.from_map(k))
        return self


class QuerySecurityDataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: str = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 是否成功
        self.success = success

    def validate(self):
        self.validate_required(self.success, 'success')

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


class CheckSecurityDataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        req_info: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 入参为Map转换后的String
        self.req_info = req_info

    def validate(self):
        self.validate_required(self.req_info, 'req_info')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.req_info is not None:
            result['req_info'] = self.req_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('req_info') is not None:
            self.req_info = m.get('req_info')
        return self


class CheckSecurityDataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response: str = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # code表示状态，message为提示，data为返回结果
        self.response = response

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
        if self.response is not None:
            result['response'] = self.response
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
            self.response = m.get('response')
        return self


class VerifyFinserviceZhimaIdentifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        legal_person_cert_name: str = None,
        legal_person_cert_no: str = None,
        merchant_url: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 需要校验的人姓名
        self.legal_person_cert_name = legal_person_cert_name
        # 需要校验的人身份证号
        self.legal_person_cert_no = legal_person_cert_no
        # 认证结束后的商户回调地址。
        self.merchant_url = merchant_url

    def validate(self):
        self.validate_required(self.legal_person_cert_name, 'legal_person_cert_name')
        self.validate_required(self.legal_person_cert_no, 'legal_person_cert_no')
        self.validate_required(self.merchant_url, 'merchant_url')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.legal_person_cert_name is not None:
            result['legal_person_cert_name'] = self.legal_person_cert_name
        if self.legal_person_cert_no is not None:
            result['legal_person_cert_no'] = self.legal_person_cert_no
        if self.merchant_url is not None:
            result['merchant_url'] = self.merchant_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('legal_person_cert_name') is not None:
            self.legal_person_cert_name = m.get('legal_person_cert_name')
        if m.get('legal_person_cert_no') is not None:
            self.legal_person_cert_no = m.get('legal_person_cert_no')
        if m.get('merchant_url') is not None:
            self.merchant_url = m.get('merchant_url')
        return self


class VerifyFinserviceZhimaIdentifyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ZhimaIdentifyResp = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 本次认证的唯一标识，商户需要记录，后续的操作都需要用到。
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
        if m.get('data') is not None:
            temp_model = ZhimaIdentifyResp()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryFinserviceZhimaIdentifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_no: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 初始化时候返回的唯一标识
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


class QueryFinserviceZhimaIdentifyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ZhimaQueryResp = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 
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
        if m.get('data') is not None:
            temp_model = ZhimaQueryResp()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryRbbGenericInvokeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        content: str = None,
        permission: str = None,
        title: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # {"platformId":1234,"method":"riskQuery"}
        self.content = content
        # 账号的所有权限点，逗号分隔
        self.permission = permission
        # 标题备用
        self.title = title

    def validate(self):
        self.validate_required(self.content, 'content')
        self.validate_required(self.permission, 'permission')
        self.validate_required(self.title, 'title')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.content is not None:
            result['content'] = self.content
        if self.permission is not None:
            result['permission'] = self.permission
        if self.title is not None:
            result['title'] = self.title
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('permission') is not None:
            self.permission = m.get('permission')
        if m.get('title') is not None:
            self.title = m.get('title')
        return self


class QueryRbbGenericInvokeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 返回数据内容
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


class CreateRbbTokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        content: str = None,
        password: str = None,
        username: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 扩展字段
        self.content = content
        # 新人用户密码，用来做映射生成token
        self.password = password
        # 用户
        self.username = username

    def validate(self):
        self.validate_required(self.content, 'content')
        self.validate_required(self.password, 'password')
        self.validate_required(self.username, 'username')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.content is not None:
            result['content'] = self.content
        if self.password is not None:
            result['password'] = self.password
        if self.username is not None:
            result['username'] = self.username
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('password') is not None:
            self.password = m.get('password')
        if m.get('username') is not None:
            self.username = m.get('username')
        return self


class CreateRbbTokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 返回数据
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


class CreateRbbApiGwtokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        extension: str = None,
        password: str = None,
        username: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 扩展字段
        self.extension = extension
        # 新人用户密码，用来做映射生成token
        self.password = password
        # 用户
        self.username = username

    def validate(self):
        self.validate_required(self.password, 'password')
        self.validate_required(self.username, 'username')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.extension is not None:
            result['extension'] = self.extension
        if self.password is not None:
            result['password'] = self.password
        if self.username is not None:
            result['username'] = self.username
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('extension') is not None:
            self.extension = m.get('extension')
        if m.get('password') is not None:
            self.password = m.get('password')
        if m.get('username') is not None:
            self.username = m.get('username')
        return self


class CreateRbbApiGwtokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        logintoken: str = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 返回登录token
        self.logintoken = logintoken

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
        if self.logintoken is not None:
            result['logintoken'] = self.logintoken
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('logintoken') is not None:
            self.logintoken = m.get('logintoken')
        return self


class QueryRbbGeneralRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        extension: str = None,
        queryname: str = None,
        queryparas: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 额外参数json
        self.extension = extension
        # 通用查询名称
        self.queryname = queryname
        # 查询参数JSON字符串
        self.queryparas = queryparas

    def validate(self):
        self.validate_required(self.queryname, 'queryname')
        if self.queryname is not None:
            self.validate_max_length(self.queryname, 'queryname', 200)

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.extension is not None:
            result['extension'] = self.extension
        if self.queryname is not None:
            result['queryname'] = self.queryname
        if self.queryparas is not None:
            result['queryparas'] = self.queryparas
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('extension') is not None:
            self.extension = m.get('extension')
        if m.get('queryname') is not None:
            self.queryname = m.get('queryname')
        if m.get('queryparas') is not None:
            self.queryparas = m.get('queryparas')
        return self


class QueryRbbGeneralResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # json字符串表示的通用查询结果
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


class GetRbbLoginTokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        extension: str = None,
        password: str = None,
        username: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 扩展json字符串
        self.extension = extension
        # 密码
        self.password = password
        # 用户名
        self.username = username

    def validate(self):
        self.validate_required(self.password, 'password')
        self.validate_required(self.username, 'username')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.extension is not None:
            result['extension'] = self.extension
        if self.password is not None:
            result['password'] = self.password
        if self.username is not None:
            result['username'] = self.username
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('extension') is not None:
            self.extension = m.get('extension')
        if m.get('password') is not None:
            self.password = m.get('password')
        if m.get('username') is not None:
            self.username = m.get('username')
        return self


class GetRbbLoginTokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        logintoken: str = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 登录token，5分钟有效
        self.logintoken = logintoken

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
        if self.logintoken is not None:
            result['logintoken'] = self.logintoken
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('logintoken') is not None:
            self.logintoken = m.get('logintoken')
        return self


class CreateRbbTenantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        effective_end_date: str = None,
        tenant_code: str = None,
        tenant_name: str = None,
        tenant_property_json: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户过期时间，不填表示永不过期
        self.effective_end_date = effective_end_date
        # 租户编码，必须全局唯一
        self.tenant_code = tenant_code
        # 租户名称
        self.tenant_name = tenant_name
        # 租户自定义属性，JSON格式，可以为空
        self.tenant_property_json = tenant_property_json

    def validate(self):
        if self.effective_end_date is not None:
            self.validate_pattern(self.effective_end_date, 'effective_end_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        self.validate_required(self.tenant_code, 'tenant_code')
        if self.tenant_code is not None:
            self.validate_max_length(self.tenant_code, 'tenant_code', 64)
        self.validate_required(self.tenant_name, 'tenant_name')
        if self.tenant_name is not None:
            self.validate_max_length(self.tenant_name, 'tenant_name', 64)

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.effective_end_date is not None:
            result['effective_end_date'] = self.effective_end_date
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.tenant_property_json is not None:
            result['tenant_property_json'] = self.tenant_property_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('effective_end_date') is not None:
            self.effective_end_date = m.get('effective_end_date')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('tenant_property_json') is not None:
            self.tenant_property_json = m.get('tenant_property_json')
        return self


class CreateRbbTenantResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        self.req_msg_id = req_msg_id
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


class CreateRbbUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        email: str = None,
        full_name: str = None,
        password: str = None,
        phone: str = None,
        tenant_code: str = None,
        user_name: str = None,
        user_property_json: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户邮箱，非必填
        self.email = email
        # 用户姓名、真实名称，不要求全局唯一
        self.full_name = full_name
        # 用户密码
        self.password = password
        # 用户电话号码，非必填
        self.phone = phone
        # 用户所属租户编码
        self.tenant_code = tenant_code
        # 用户名，必须全局唯一
        self.user_name = user_name
        # 用户属性扩展字段，json格式，可以为空
        self.user_property_json = user_property_json

    def validate(self):
        if self.email is not None:
            self.validate_max_length(self.email, 'email', 128)
        self.validate_required(self.full_name, 'full_name')
        if self.full_name is not None:
            self.validate_max_length(self.full_name, 'full_name', 64)
        self.validate_required(self.password, 'password')
        if self.password is not None:
            self.validate_max_length(self.password, 'password', 200)
        if self.phone is not None:
            self.validate_max_length(self.phone, 'phone', 64)
        if self.tenant_code is not None:
            self.validate_max_length(self.tenant_code, 'tenant_code', 64)
        self.validate_required(self.user_name, 'user_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.email is not None:
            result['email'] = self.email
        if self.full_name is not None:
            result['full_name'] = self.full_name
        if self.password is not None:
            result['password'] = self.password
        if self.phone is not None:
            result['phone'] = self.phone
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_property_json is not None:
            result['user_property_json'] = self.user_property_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('full_name') is not None:
            self.full_name = m.get('full_name')
        if m.get('password') is not None:
            self.password = m.get('password')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_property_json') is not None:
            self.user_property_json = m.get('user_property_json')
        return self


class CreateRbbUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        self.req_msg_id = req_msg_id
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


class QueryRtopCompanyOpinionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        end_time: str = None,
        page_num: int = None,
        page_size: int = None,
        place_name: str = None,
        place_type: str = None,
        start_time: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 结束时间
        self.end_time = end_time
        # 页码
        self.page_num = page_num
        # 一页的数量
        self.page_size = page_size
        # 所在地的名称
        self.place_name = place_name
        # 地区类型
        self.place_type = place_type
        # 开始时间
        self.start_time = start_time

    def validate(self):
        self.validate_required(self.end_time, 'end_time')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.place_name, 'place_name')
        self.validate_required(self.place_type, 'place_type')
        self.validate_required(self.start_time, 'start_time')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.place_name is not None:
            result['place_name'] = self.place_name
        if self.place_type is not None:
            result['place_type'] = self.place_type
        if self.start_time is not None:
            result['start_time'] = self.start_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('place_name') is not None:
            self.place_name = m.get('place_name')
        if m.get('place_type') is not None:
            self.place_type = m.get('place_type')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        return self


class QueryRtopCompanyOpinionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        company_opinion_count: List[RtopCompanyOpinionCount] = None,
        page_num: int = None,
        page_size: int = None,
        total_count: int = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.company_opinion_count = company_opinion_count
        # 页码
        self.page_num = page_num
        # 一页的数量
        self.page_size = page_size
        # 总的记录数
        self.total_count = total_count

    def validate(self):
        self.validate_required(self.company_opinion_count, 'company_opinion_count')
        if self.company_opinion_count:
            for k in self.company_opinion_count:
                if k:
                    k.validate()
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.total_count, 'total_count')

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['company_opinion_count'] = []
        if self.company_opinion_count is not None:
            for k in self.company_opinion_count:
                result['company_opinion_count'].append(k.to_map() if k else None)
        if self.page_num is not None:
            result['page_num'] = self.page_num
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
        self.company_opinion_count = []
        if m.get('company_opinion_count') is not None:
            for k in m.get('company_opinion_count'):
                temp_model = RtopCompanyOpinionCount()
                self.company_opinion_count.append(temp_model.from_map(k))
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class ListRtopCompanyOpinionsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_name: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 地区类型
        self.company_name = company_name
        # 页码
        self.page_num = page_num
        # 一页的数量
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.company_name, 'company_name')
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListRtopCompanyOpinionsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        company_opinion_details: List[RtopCompanyOpinionDetail] = None,
        page_num: int = None,
        page_size: int = None,
        total_count: int = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.company_opinion_details = company_opinion_details
        # 页码
        self.page_num = page_num
        # 一页的数量
        self.page_size = page_size
        # 总的记录数
        self.total_count = total_count

    def validate(self):
        self.validate_required(self.company_opinion_details, 'company_opinion_details')
        if self.company_opinion_details:
            for k in self.company_opinion_details:
                if k:
                    k.validate()
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.total_count, 'total_count')

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['company_opinion_details'] = []
        if self.company_opinion_details is not None:
            for k in self.company_opinion_details:
                result['company_opinion_details'].append(k.to_map() if k else None)
        if self.page_num is not None:
            result['page_num'] = self.page_num
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
        self.company_opinion_details = []
        if m.get('company_opinion_details') is not None:
            for k in m.get('company_opinion_details'):
                temp_model = RtopCompanyOpinionDetail()
                self.company_opinion_details.append(temp_model.from_map(k))
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class GetRtopCompanyMonitorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_name: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 地区类型
        self.company_name = company_name

    def validate(self):
        self.validate_required(self.company_name, 'company_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_name is not None:
            result['company_name'] = self.company_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        return self


class GetRtopCompanyMonitorResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        active_city: str = None,
        company_category: str = None,
        crowd_risk_type: str = None,
        features: List[RtopMonitorCompanyFeature] = None,
        money_involved: int = None,
        monitor_risk_tags: List[str] = None,
        monitor_score: int = None,
        people_involved: int = None,
        registered_city: str = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 活跃市，不带国家和地区的代码
        self.active_city = active_city
        # 监测企业的行业
        self.company_category = company_category
        # 涉众风险类型
        self.crowd_risk_type = crowd_risk_type
        self.features = features
        # 影响金额
        self.money_involved = money_involved
        self.monitor_risk_tags = monitor_risk_tags
        # 监测企业的评分
        self.monitor_score = monitor_score
        # 影响人数
        self.people_involved = people_involved
        # 注册市，不带国家和地区的代码
        self.registered_city = registered_city

    def validate(self):
        self.validate_required(self.active_city, 'active_city')
        self.validate_required(self.crowd_risk_type, 'crowd_risk_type')
        self.validate_required(self.features, 'features')
        if self.features:
            for k in self.features:
                if k:
                    k.validate()
        self.validate_required(self.money_involved, 'money_involved')
        self.validate_required(self.monitor_risk_tags, 'monitor_risk_tags')
        self.validate_required(self.monitor_score, 'monitor_score')
        self.validate_required(self.people_involved, 'people_involved')
        self.validate_required(self.registered_city, 'registered_city')

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.active_city is not None:
            result['active_city'] = self.active_city
        if self.company_category is not None:
            result['company_category'] = self.company_category
        if self.crowd_risk_type is not None:
            result['crowd_risk_type'] = self.crowd_risk_type
        result['features'] = []
        if self.features is not None:
            for k in self.features:
                result['features'].append(k.to_map() if k else None)
        if self.money_involved is not None:
            result['money_involved'] = self.money_involved
        if self.monitor_risk_tags is not None:
            result['monitor_risk_tags'] = self.monitor_risk_tags
        if self.monitor_score is not None:
            result['monitor_score'] = self.monitor_score
        if self.people_involved is not None:
            result['people_involved'] = self.people_involved
        if self.registered_city is not None:
            result['registered_city'] = self.registered_city
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('active_city') is not None:
            self.active_city = m.get('active_city')
        if m.get('company_category') is not None:
            self.company_category = m.get('company_category')
        if m.get('crowd_risk_type') is not None:
            self.crowd_risk_type = m.get('crowd_risk_type')
        self.features = []
        if m.get('features') is not None:
            for k in m.get('features'):
                temp_model = RtopMonitorCompanyFeature()
                self.features.append(temp_model.from_map(k))
        if m.get('money_involved') is not None:
            self.money_involved = m.get('money_involved')
        if m.get('monitor_risk_tags') is not None:
            self.monitor_risk_tags = m.get('monitor_risk_tags')
        if m.get('monitor_score') is not None:
            self.monitor_score = m.get('monitor_score')
        if m.get('people_involved') is not None:
            self.people_involved = m.get('people_involved')
        if m.get('registered_city') is not None:
            self.registered_city = m.get('registered_city')
        return self


class QueryRtopCrowdriskStatisticRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        end_time: str = None,
        place_name: str = None,
        place_type: str = None,
        start_time: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 结束时间
        self.end_time = end_time
        # 所在地的名称
        self.place_name = place_name
        # 地区类型
        self.place_type = place_type
        # 开始时间
        self.start_time = start_time

    def validate(self):
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.place_name is not None:
            result['place_name'] = self.place_name
        if self.place_type is not None:
            result['place_type'] = self.place_type
        if self.start_time is not None:
            result['start_time'] = self.start_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('place_name') is not None:
            self.place_name = m.get('place_name')
        if m.get('place_type') is not None:
            self.place_type = m.get('place_type')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        return self


class QueryRtopCrowdriskStatisticResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        level_distribution: List[RtopLevelDistribution] = None,
        region_distribution: List[RtopRegionalDistribution] = None,
        type_distribution: List[RtopTypeDistribution] = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.level_distribution = level_distribution
        # 按地区统计
        self.region_distribution = region_distribution
        self.type_distribution = type_distribution

    def validate(self):
        if self.level_distribution:
            for k in self.level_distribution:
                if k:
                    k.validate()
        if self.region_distribution:
            for k in self.region_distribution:
                if k:
                    k.validate()
        if self.type_distribution:
            for k in self.type_distribution:
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
        result['level_distribution'] = []
        if self.level_distribution is not None:
            for k in self.level_distribution:
                result['level_distribution'].append(k.to_map() if k else None)
        result['region_distribution'] = []
        if self.region_distribution is not None:
            for k in self.region_distribution:
                result['region_distribution'].append(k.to_map() if k else None)
        result['type_distribution'] = []
        if self.type_distribution is not None:
            for k in self.type_distribution:
                result['type_distribution'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.level_distribution = []
        if m.get('level_distribution') is not None:
            for k in m.get('level_distribution'):
                temp_model = RtopLevelDistribution()
                self.level_distribution.append(temp_model.from_map(k))
        self.region_distribution = []
        if m.get('region_distribution') is not None:
            for k in m.get('region_distribution'):
                temp_model = RtopRegionalDistribution()
                self.region_distribution.append(temp_model.from_map(k))
        self.type_distribution = []
        if m.get('type_distribution') is not None:
            for k in m.get('type_distribution'):
                temp_model = RtopTypeDistribution()
                self.type_distribution.append(temp_model.from_map(k))
        return self


class ListRtopCrowdriskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        active_places: List[str] = None,
        crowd_risk_levels: List[str] = None,
        crowd_risk_types: List[str] = None,
        end_time: str = None,
        page_num: int = None,
        page_size: int = None,
        place_name: str = None,
        place_type: str = None,
        reg_places: List[str] = None,
        sort_by: str = None,
        sort_type: str = None,
        start_time: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 活跃地筛选
        self.active_places = active_places
        # 风险等级
        self.crowd_risk_levels = crowd_risk_levels
        # 风险类型
        self.crowd_risk_types = crowd_risk_types
        # 结束时间
        self.end_time = end_time
        # 页码
        self.page_num = page_num
        # 每页条数
        self.page_size = page_size
        # 所在地的名称
        self.place_name = place_name
        # 地区类型
        self.place_type = place_type
        # 注册地筛选
        self.reg_places = reg_places
        # 排序字段
        self.sort_by = sort_by
        # 排序方式
        self.sort_type = sort_type
        # 开始时间
        self.start_time = start_time

    def validate(self):
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.active_places is not None:
            result['active_places'] = self.active_places
        if self.crowd_risk_levels is not None:
            result['crowd_risk_levels'] = self.crowd_risk_levels
        if self.crowd_risk_types is not None:
            result['crowd_risk_types'] = self.crowd_risk_types
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.place_name is not None:
            result['place_name'] = self.place_name
        if self.place_type is not None:
            result['place_type'] = self.place_type
        if self.reg_places is not None:
            result['reg_places'] = self.reg_places
        if self.sort_by is not None:
            result['sort_by'] = self.sort_by
        if self.sort_type is not None:
            result['sort_type'] = self.sort_type
        if self.start_time is not None:
            result['start_time'] = self.start_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('active_places') is not None:
            self.active_places = m.get('active_places')
        if m.get('crowd_risk_levels') is not None:
            self.crowd_risk_levels = m.get('crowd_risk_levels')
        if m.get('crowd_risk_types') is not None:
            self.crowd_risk_types = m.get('crowd_risk_types')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('place_name') is not None:
            self.place_name = m.get('place_name')
        if m.get('place_type') is not None:
            self.place_type = m.get('place_type')
        if m.get('reg_places') is not None:
            self.reg_places = m.get('reg_places')
        if m.get('sort_by') is not None:
            self.sort_by = m.get('sort_by')
        if m.get('sort_type') is not None:
            self.sort_type = m.get('sort_type')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        return self


class ListRtopCrowdriskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        companys: List[RtopCrowdRiskSummaryResp] = None,
        page_num: int = None,
        page_size: int = None,
        total_count: int = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 企业列表
        self.companys = companys
        # 页码
        self.page_num = page_num
        # 每页条数
        self.page_size = page_size
        # 总数
        self.total_count = total_count

    def validate(self):
        if self.companys:
            for k in self.companys:
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
        result['companys'] = []
        if self.companys is not None:
            for k in self.companys:
                result['companys'].append(k.to_map() if k else None)
        if self.page_num is not None:
            result['page_num'] = self.page_num
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
        self.companys = []
        if m.get('companys') is not None:
            for k in m.get('companys'):
                temp_model = RtopCrowdRiskSummaryResp()
                self.companys.append(temp_model.from_map(k))
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class QueryRtopCrowdriskDetailRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_id: str = None,
        place_name: str = None,
        place_type: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业ID
        self.company_id = company_id
        # 所在地的名称
        self.place_name = place_name
        # 地区类型
        self.place_type = place_type

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_id is not None:
            result['company_id'] = self.company_id
        if self.place_name is not None:
            result['place_name'] = self.place_name
        if self.place_type is not None:
            result['place_type'] = self.place_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        if m.get('place_name') is not None:
            self.place_name = m.get('place_name')
        if m.get('place_type') is not None:
            self.place_type = m.get('place_type')
        return self


class QueryRtopCrowdriskDetailResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        active_city: str = None,
        active_county: str = None,
        active_province: str = None,
        age_distribution: List[RtopAgeDistribution] = None,
        clue_tags: List[str] = None,
        conclusion: str = None,
        crowd_risk_level: str = None,
        crowd_risk_score: int = None,
        crowd_risk_type: str = None,
        detected_time: str = None,
        features: List[RtopCrowdRiskFeatureResp] = None,
        gender_distribution: List[RtopGenderDistribution] = None,
        last_active_time: str = None,
        money_involved: int = None,
        money_involved_history: List[RtopDateDistribution] = None,
        people_involved: int = None,
        people_involved_history: List[RtopDateDistribution] = None,
        population_distribution: List[RtopPopulationDistribution] = None,
        registered_city: str = None,
        registered_county: str = None,
        registered_province: str = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 活跃市
        self.active_city = active_city
        # 活跃县
        self.active_county = active_county
        # 活跃省
        self.active_province = active_province
        # 年龄分布
        self.age_distribution = age_distribution
        # 线索标签
        self.clue_tags = clue_tags
        # 报文
        self.conclusion = conclusion
        # 风险等级
        self.crowd_risk_level = crowd_risk_level
        # 涉众风险分析的分数
        self.crowd_risk_score = crowd_risk_score
        # 风险类型
        self.crowd_risk_type = crowd_risk_type
        # 发现时间
        self.detected_time = detected_time
        # 特征
        self.features = features
        # 性别分布
        self.gender_distribution = gender_distribution
        # 上次活跃时间
        self.last_active_time = last_active_time
        # 涉案金额
        self.money_involved = money_involved
        # 影响金额的历史曲线
        self.money_involved_history = money_involved_history
        # 涉案人数
        self.people_involved = people_involved
        # 影响人数的历史曲线
        self.people_involved_history = people_involved_history
        # 影响的人数分布，key为地区城市，value为影响的人数
        self.population_distribution = population_distribution
        # 注册市
        self.registered_city = registered_city
        # 注册县
        self.registered_county = registered_county
        # 注册省
        self.registered_province = registered_province

    def validate(self):
        if self.age_distribution:
            for k in self.age_distribution:
                if k:
                    k.validate()
        if self.detected_time is not None:
            self.validate_pattern(self.detected_time, 'detected_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.features:
            for k in self.features:
                if k:
                    k.validate()
        if self.gender_distribution:
            for k in self.gender_distribution:
                if k:
                    k.validate()
        if self.last_active_time is not None:
            self.validate_pattern(self.last_active_time, 'last_active_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.money_involved_history:
            for k in self.money_involved_history:
                if k:
                    k.validate()
        if self.people_involved_history:
            for k in self.people_involved_history:
                if k:
                    k.validate()
        if self.population_distribution:
            for k in self.population_distribution:
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
        if self.active_city is not None:
            result['active_city'] = self.active_city
        if self.active_county is not None:
            result['active_county'] = self.active_county
        if self.active_province is not None:
            result['active_province'] = self.active_province
        result['age_distribution'] = []
        if self.age_distribution is not None:
            for k in self.age_distribution:
                result['age_distribution'].append(k.to_map() if k else None)
        if self.clue_tags is not None:
            result['clue_tags'] = self.clue_tags
        if self.conclusion is not None:
            result['conclusion'] = self.conclusion
        if self.crowd_risk_level is not None:
            result['crowd_risk_level'] = self.crowd_risk_level
        if self.crowd_risk_score is not None:
            result['crowd_risk_score'] = self.crowd_risk_score
        if self.crowd_risk_type is not None:
            result['crowd_risk_type'] = self.crowd_risk_type
        if self.detected_time is not None:
            result['detected_time'] = self.detected_time
        result['features'] = []
        if self.features is not None:
            for k in self.features:
                result['features'].append(k.to_map() if k else None)
        result['gender_distribution'] = []
        if self.gender_distribution is not None:
            for k in self.gender_distribution:
                result['gender_distribution'].append(k.to_map() if k else None)
        if self.last_active_time is not None:
            result['last_active_time'] = self.last_active_time
        if self.money_involved is not None:
            result['money_involved'] = self.money_involved
        result['money_involved_history'] = []
        if self.money_involved_history is not None:
            for k in self.money_involved_history:
                result['money_involved_history'].append(k.to_map() if k else None)
        if self.people_involved is not None:
            result['people_involved'] = self.people_involved
        result['people_involved_history'] = []
        if self.people_involved_history is not None:
            for k in self.people_involved_history:
                result['people_involved_history'].append(k.to_map() if k else None)
        result['population_distribution'] = []
        if self.population_distribution is not None:
            for k in self.population_distribution:
                result['population_distribution'].append(k.to_map() if k else None)
        if self.registered_city is not None:
            result['registered_city'] = self.registered_city
        if self.registered_county is not None:
            result['registered_county'] = self.registered_county
        if self.registered_province is not None:
            result['registered_province'] = self.registered_province
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('active_city') is not None:
            self.active_city = m.get('active_city')
        if m.get('active_county') is not None:
            self.active_county = m.get('active_county')
        if m.get('active_province') is not None:
            self.active_province = m.get('active_province')
        self.age_distribution = []
        if m.get('age_distribution') is not None:
            for k in m.get('age_distribution'):
                temp_model = RtopAgeDistribution()
                self.age_distribution.append(temp_model.from_map(k))
        if m.get('clue_tags') is not None:
            self.clue_tags = m.get('clue_tags')
        if m.get('conclusion') is not None:
            self.conclusion = m.get('conclusion')
        if m.get('crowd_risk_level') is not None:
            self.crowd_risk_level = m.get('crowd_risk_level')
        if m.get('crowd_risk_score') is not None:
            self.crowd_risk_score = m.get('crowd_risk_score')
        if m.get('crowd_risk_type') is not None:
            self.crowd_risk_type = m.get('crowd_risk_type')
        if m.get('detected_time') is not None:
            self.detected_time = m.get('detected_time')
        self.features = []
        if m.get('features') is not None:
            for k in m.get('features'):
                temp_model = RtopCrowdRiskFeatureResp()
                self.features.append(temp_model.from_map(k))
        self.gender_distribution = []
        if m.get('gender_distribution') is not None:
            for k in m.get('gender_distribution'):
                temp_model = RtopGenderDistribution()
                self.gender_distribution.append(temp_model.from_map(k))
        if m.get('last_active_time') is not None:
            self.last_active_time = m.get('last_active_time')
        if m.get('money_involved') is not None:
            self.money_involved = m.get('money_involved')
        self.money_involved_history = []
        if m.get('money_involved_history') is not None:
            for k in m.get('money_involved_history'):
                temp_model = RtopDateDistribution()
                self.money_involved_history.append(temp_model.from_map(k))
        if m.get('people_involved') is not None:
            self.people_involved = m.get('people_involved')
        self.people_involved_history = []
        if m.get('people_involved_history') is not None:
            for k in m.get('people_involved_history'):
                temp_model = RtopDateDistribution()
                self.people_involved_history.append(temp_model.from_map(k))
        self.population_distribution = []
        if m.get('population_distribution') is not None:
            for k in m.get('population_distribution'):
                temp_model = RtopPopulationDistribution()
                self.population_distribution.append(temp_model.from_map(k))
        if m.get('registered_city') is not None:
            self.registered_city = m.get('registered_city')
        if m.get('registered_county') is not None:
            self.registered_county = m.get('registered_county')
        if m.get('registered_province') is not None:
            self.registered_province = m.get('registered_province')
        return self


class QueryRtopRiskstormRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_id: str = None,
        type: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业ID
        self.company_id = company_id
        # 数据类型
        self.type = type

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_id is not None:
            result['company_id'] = self.company_id
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class QueryRtopRiskstormResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        annual_reports: List[RtopRiskStormCompanyAnnualReport] = None,
        risk_labels: List[RiskStormLabelResp] = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 年报数据
        self.annual_reports = annual_reports
        # 风险标签数据
        self.risk_labels = risk_labels

    def validate(self):
        if self.annual_reports:
            for k in self.annual_reports:
                if k:
                    k.validate()
        if self.risk_labels:
            for k in self.risk_labels:
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
        result['annual_reports'] = []
        if self.annual_reports is not None:
            for k in self.annual_reports:
                result['annual_reports'].append(k.to_map() if k else None)
        result['risk_labels'] = []
        if self.risk_labels is not None:
            for k in self.risk_labels:
                result['risk_labels'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.annual_reports = []
        if m.get('annual_reports') is not None:
            for k in m.get('annual_reports'):
                temp_model = RtopRiskStormCompanyAnnualReport()
                self.annual_reports.append(temp_model.from_map(k))
        self.risk_labels = []
        if m.get('risk_labels') is not None:
            for k in m.get('risk_labels'):
                temp_model = RiskStormLabelResp()
                self.risk_labels.append(temp_model.from_map(k))
        return self


class QueryRtopCrowdriskSumRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_ids: List[str] = None,
        place_name: str = None,
        place_type: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 指定的企业ID列表，企业ID数量不超过100个。
        self.company_ids = company_ids
        # 指定的地区名称，例如温州市、鹿城区等
        self.place_name = place_name
        # 地区类型，PROVINCE表示省，CITY表示市，COUNTY表示县
        self.place_type = place_type

    def validate(self):
        self.validate_required(self.company_ids, 'company_ids')
        self.validate_required(self.place_name, 'place_name')
        self.validate_required(self.place_type, 'place_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_ids is not None:
            result['company_ids'] = self.company_ids
        if self.place_name is not None:
            result['place_name'] = self.place_name
        if self.place_type is not None:
            result['place_type'] = self.place_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_ids') is not None:
            self.company_ids = m.get('company_ids')
        if m.get('place_name') is not None:
            self.place_name = m.get('place_name')
        if m.get('place_type') is not None:
            self.place_type = m.get('place_type')
        return self


class QueryRtopCrowdriskSumResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        money_involved: int = None,
        people_involved: int = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 查询企业的影响金额之和
        self.money_involved = money_involved
        # 查询企业的影响人数之和
        self.people_involved = people_involved

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
        if self.money_involved is not None:
            result['money_involved'] = self.money_involved
        if self.people_involved is not None:
            result['people_involved'] = self.people_involved
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('money_involved') is not None:
            self.money_involved = m.get('money_involved')
        if m.get('people_involved') is not None:
            self.people_involved = m.get('people_involved')
        return self


class GetRtopCompanyDetailRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_id: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业ID
        self.company_id = company_id

    def validate(self):
        self.validate_required(self.company_id, 'company_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_id is not None:
            result['company_id'] = self.company_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        return self


class GetRtopCompanyDetailResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        risk_features: str = None,
        risk_score: int = None,
        risk_tags: List[RtopRiskTag] = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 风险维度特征
        self.risk_features = risk_features
        # 风险分数
        self.risk_score = risk_score
        # 风险标签列表
        self.risk_tags = risk_tags

    def validate(self):
        if self.risk_tags:
            for k in self.risk_tags:
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
        if self.risk_features is not None:
            result['risk_features'] = self.risk_features
        if self.risk_score is not None:
            result['risk_score'] = self.risk_score
        result['risk_tags'] = []
        if self.risk_tags is not None:
            for k in self.risk_tags:
                result['risk_tags'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('risk_features') is not None:
            self.risk_features = m.get('risk_features')
        if m.get('risk_score') is not None:
            self.risk_score = m.get('risk_score')
        self.risk_tags = []
        if m.get('risk_tags') is not None:
            for k in m.get('risk_tags'):
                temp_model = RtopRiskTag()
                self.risk_tags.append(temp_model.from_map(k))
        return self


class QueryRtopCompanyRiskinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ak: str = None,
        biz_type: str = None,
        memo: str = None,
        place_name: str = None,
        place_type: str = None,
        sk: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户access key
        self.ak = ak
        # 业务场景 ""
        self.biz_type = biz_type
        # 预留字段
        self.memo = memo
        # 区域中文名称
        self.place_name = place_name
        # 区域类型
        self.place_type = place_type
        # 租户seceret key
        self.sk = sk

    def validate(self):
        self.validate_required(self.ak, 'ak')
        self.validate_required(self.place_name, 'place_name')
        self.validate_required(self.place_type, 'place_type')
        self.validate_required(self.sk, 'sk')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ak is not None:
            result['ak'] = self.ak
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.memo is not None:
            result['memo'] = self.memo
        if self.place_name is not None:
            result['place_name'] = self.place_name
        if self.place_type is not None:
            result['place_type'] = self.place_type
        if self.sk is not None:
            result['sk'] = self.sk
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ak') is not None:
            self.ak = m.get('ak')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('memo') is not None:
            self.memo = m.get('memo')
        if m.get('place_name') is not None:
            self.place_name = m.get('place_name')
        if m.get('place_type') is not None:
            self.place_type = m.get('place_type')
        if m.get('sk') is not None:
            self.sk = m.get('sk')
        return self


class QueryRtopCompanyRiskinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[RtopCompanyRiskInfo] = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 企业列表
        self.data = data

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
                temp_model = RtopCompanyRiskInfo()
                self.data.append(temp_model.from_map(k))
        return self


class ExecRtopGenericInvokeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        content: str = None,
        permission: str = None,
        title: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # {"platformId":1234}
        self.content = content
        # 这个账号的所有权限点，逗号分隔
        self.permission = permission
        # title
        self.title = title

    def validate(self):
        self.validate_required(self.content, 'content')
        self.validate_required(self.permission, 'permission')
        self.validate_required(self.title, 'title')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.content is not None:
            result['content'] = self.content
        if self.permission is not None:
            result['permission'] = self.permission
        if self.title is not None:
            result['title'] = self.title
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('permission') is not None:
            self.permission = m.get('permission')
        if m.get('title') is not None:
            self.title = m.get('title')
        return self


class ExecRtopGenericInvokeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
        response_code: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 接口数据
        self.data = data
        # response_code
        self.response_code = response_code
        # 是否请求成功
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
        if self.data is not None:
            result['data'] = self.data
        if self.response_code is not None:
            result['response_code'] = self.response_code
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
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class CreateRtopTokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        return self


class CreateRtopTokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
        response_code: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 返回数据
        self.data = data
        # 返回码
        self.response_code = response_code
        # 成功，失败
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
        if self.data is not None:
            result['data'] = self.data
        if self.response_code is not None:
            result['response_code'] = self.response_code
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
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryRtopRisklabelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        mct_one_id: str = None,
        page_no: int = None,
        page_size: int = None,
        scroll_id: str = None,
        tag_id: str = None,
        update_date: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # mct_one_id  -- search after使用
        self.mct_one_id = mct_one_id
        # pageNo
        self.page_no = page_no
        # pageSize
        self.page_size = page_size
        # scroll_id
        self.scroll_id = scroll_id
        # tag_id  -- search after使用
        self.tag_id = tag_id
        # 数据更新日期
        self.update_date = update_date

    def validate(self):
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.update_date, 'update_date')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.mct_one_id is not None:
            result['mct_one_id'] = self.mct_one_id
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.scroll_id is not None:
            result['scroll_id'] = self.scroll_id
        if self.tag_id is not None:
            result['tag_id'] = self.tag_id
        if self.update_date is not None:
            result['update_date'] = self.update_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('mct_one_id') is not None:
            self.mct_one_id = m.get('mct_one_id')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('scroll_id') is not None:
            self.scroll_id = m.get('scroll_id')
        if m.get('tag_id') is not None:
            self.tag_id = m.get('tag_id')
        if m.get('update_date') is not None:
            self.update_date = m.get('update_date')
        return self


class QueryRtopRisklabelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_code: str = None,
        risk_label_infos: List[RiskLabelInfo] = None,
        scroll_id: str = None,
        success: bool = None,
        total: int = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 返回码
        self.response_code = response_code
        # 标签信息
        self.risk_label_infos = risk_label_infos
        # scroll_id
        self.scroll_id = scroll_id
        # 是否调用成功
        self.success = success
        # total
        self.total = total

    def validate(self):
        if self.risk_label_infos:
            for k in self.risk_label_infos:
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
        if self.response_code is not None:
            result['response_code'] = self.response_code
        result['risk_label_infos'] = []
        if self.risk_label_infos is not None:
            for k in self.risk_label_infos:
                result['risk_label_infos'].append(k.to_map() if k else None)
        if self.scroll_id is not None:
            result['scroll_id'] = self.scroll_id
        if self.success is not None:
            result['success'] = self.success
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
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        self.risk_label_infos = []
        if m.get('risk_label_infos') is not None:
            for k in m.get('risk_label_infos'):
                temp_model = RiskLabelInfo()
                self.risk_label_infos.append(temp_model.from_map(k))
        if m.get('scroll_id') is not None:
            self.scroll_id = m.get('scroll_id')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class QueryRtopCompanyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_ids: List[str] = None,
        update_date: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 公司ID集合
        self.company_ids = company_ids
        # 数据同步到公有云时间(业务上赋值当天)
        self.update_date = update_date

    def validate(self):
        self.validate_required(self.company_ids, 'company_ids')
        self.validate_required(self.update_date, 'update_date')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_ids is not None:
            result['company_ids'] = self.company_ids
        if self.update_date is not None:
            result['update_date'] = self.update_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_ids') is not None:
            self.company_ids = m.get('company_ids')
        if m.get('update_date') is not None:
            self.update_date = m.get('update_date')
        return self


class QueryRtopCompanyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        company_infos: List[CompanyInfo] = None,
        response_code: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 企业信息列表
        self.company_infos = company_infos
        # 返回码
        self.response_code = response_code
        # 是否调用成功
        self.success = success

    def validate(self):
        if self.company_infos:
            for k in self.company_infos:
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
        result['company_infos'] = []
        if self.company_infos is not None:
            for k in self.company_infos:
                result['company_infos'].append(k.to_map() if k else None)
        if self.response_code is not None:
            result['response_code'] = self.response_code
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
        self.company_infos = []
        if m.get('company_infos') is not None:
            for k in m.get('company_infos'):
                temp_model = CompanyInfo()
                self.company_infos.append(temp_model.from_map(k))
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryRtopRisklabelFilterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_no: int = None,
        page_size: int = None,
        place_name: str = None,
        place_type: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # pageNo
        self.page_no = page_no
        # page_size
        self.page_size = page_size
        # 成都市
        self.place_name = place_name
        # CITY
        self.place_type = place_type

    def validate(self):
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.place_name, 'place_name')
        self.validate_required(self.place_type, 'place_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.place_name is not None:
            result['place_name'] = self.place_name
        if self.place_type is not None:
            result['place_type'] = self.place_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('place_name') is not None:
            self.place_name = m.get('place_name')
        if m.get('place_type') is not None:
            self.place_type = m.get('place_type')
        return self


class QueryRtopRisklabelFilterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_code: str = None,
        risk_label_filter_config_info: List[RiskLabelFilterConfigInfo] = None,
        success: bool = None,
        total: int = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 返回码
        self.response_code = response_code
        # 标签配置全量信息
        self.risk_label_filter_config_info = risk_label_filter_config_info
        # 是否调用成功
        self.success = success
        # 总数
        self.total = total

    def validate(self):
        if self.risk_label_filter_config_info:
            for k in self.risk_label_filter_config_info:
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
        if self.response_code is not None:
            result['response_code'] = self.response_code
        result['risk_label_filter_config_info'] = []
        if self.risk_label_filter_config_info is not None:
            for k in self.risk_label_filter_config_info:
                result['risk_label_filter_config_info'].append(k.to_map() if k else None)
        if self.success is not None:
            result['success'] = self.success
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
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        self.risk_label_filter_config_info = []
        if m.get('risk_label_filter_config_info') is not None:
            for k in m.get('risk_label_filter_config_info'):
                temp_model = RiskLabelFilterConfigInfo()
                self.risk_label_filter_config_info.append(temp_model.from_map(k))
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class PullRegtechNewsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        news_max_id: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 表示本地数据库中舆情数据中的最大id
        self.news_max_id = news_max_id

    def validate(self):
        self.validate_required(self.news_max_id, 'news_max_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.news_max_id is not None:
            result['news_max_id'] = self.news_max_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('news_max_id') is not None:
            self.news_max_id = m.get('news_max_id')
        return self


class PullRegtechNewsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 返回的数据体
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


class QueryRtopCompanyFeedbackRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_no: int = None,
        page_size: int = None,
        user_place: str = None,
        user_place_type: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当前是第几页
        self.page_no = page_no
        # 每一页的记录条数
        self.page_size = page_size
        # 用户属地
        self.user_place = user_place
        # 用户所在地类型
        self.user_place_type = user_place_type

    def validate(self):
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.user_place, 'user_place')
        self.validate_required(self.user_place_type, 'user_place_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.user_place is not None:
            result['user_place'] = self.user_place
        if self.user_place_type is not None:
            result['user_place_type'] = self.user_place_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('user_place') is not None:
            self.user_place = m.get('user_place')
        if m.get('user_place_type') is not None:
            self.user_place_type = m.get('user_place_type')
        return self


class QueryRtopCompanyFeedbackResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        company_feedbacks: List[RtopCompanyFeedback] = None,
        response_code: str = None,
        success: bool = None,
        total_num: int = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 企业反馈列表
        self.company_feedbacks = company_feedbacks
        # 返回码
        self.response_code = response_code
        # 是否调用成功
        self.success = success
        # 总条数
        self.total_num = total_num

    def validate(self):
        if self.company_feedbacks:
            for k in self.company_feedbacks:
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
        result['company_feedbacks'] = []
        if self.company_feedbacks is not None:
            for k in self.company_feedbacks:
                result['company_feedbacks'].append(k.to_map() if k else None)
        if self.response_code is not None:
            result['response_code'] = self.response_code
        if self.success is not None:
            result['success'] = self.success
        if self.total_num is not None:
            result['total_num'] = self.total_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.company_feedbacks = []
        if m.get('company_feedbacks') is not None:
            for k in m.get('company_feedbacks'):
                temp_model = RtopCompanyFeedback()
                self.company_feedbacks.append(temp_model.from_map(k))
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('total_num') is not None:
            self.total_num = m.get('total_num')
        return self


class QueryRtopCompanyAlarmRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_time: str = None,
        page_no: int = None,
        page_size: int = None,
        user_place: str = None,
        user_place_type: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据的时间
        self.data_time = data_time
        # 当前是第几页
        self.page_no = page_no
        # 每一页的记录条数
        self.page_size = page_size
        # 用户属地
        self.user_place = user_place
        # 用户所在地类型
        self.user_place_type = user_place_type

    def validate(self):
        self.validate_required(self.data_time, 'data_time')
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.user_place, 'user_place')
        self.validate_required(self.user_place_type, 'user_place_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_time is not None:
            result['data_time'] = self.data_time
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.user_place is not None:
            result['user_place'] = self.user_place
        if self.user_place_type is not None:
            result['user_place_type'] = self.user_place_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_time') is not None:
            self.data_time = m.get('data_time')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('user_place') is not None:
            self.user_place = m.get('user_place')
        if m.get('user_place_type') is not None:
            self.user_place_type = m.get('user_place_type')
        return self


class QueryRtopCompanyAlarmResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        company_alarms: List[RtopCompanyAlarm] = None,
        response_code: str = None,
        success: bool = None,
        total_num: int = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 预警企业列表
        self.company_alarms = company_alarms
        # 返回码
        self.response_code = response_code
        # 是否调用成功
        self.success = success
        # 总条数
        self.total_num = total_num

    def validate(self):
        if self.company_alarms:
            for k in self.company_alarms:
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
        result['company_alarms'] = []
        if self.company_alarms is not None:
            for k in self.company_alarms:
                result['company_alarms'].append(k.to_map() if k else None)
        if self.response_code is not None:
            result['response_code'] = self.response_code
        if self.success is not None:
            result['success'] = self.success
        if self.total_num is not None:
            result['total_num'] = self.total_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.company_alarms = []
        if m.get('company_alarms') is not None:
            for k in m.get('company_alarms'):
                temp_model = RtopCompanyAlarm()
                self.company_alarms.append(temp_model.from_map(k))
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('total_num') is not None:
            self.total_num = m.get('total_num')
        return self


class QueryRtopCompanyRiskyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_time: str = None,
        list_type: str = None,
        page_no: int = None,
        page_size: int = None,
        type: str = None,
        user_place: str = None,
        user_place_type: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据时间
        self.data_time = data_time
        # 全局态势中的列表 类型
        self.list_type = list_type
        # 当前是第几页
        self.page_no = page_no
        # 每一页的记录条数
        self.page_size = page_size
        # 全局动态类型
        self.type = type
        # 用户属地
        self.user_place = user_place
        # 用户所在地类型
        self.user_place_type = user_place_type

    def validate(self):
        self.validate_required(self.data_time, 'data_time')
        self.validate_required(self.list_type, 'list_type')
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.type, 'type')
        self.validate_required(self.user_place, 'user_place')
        self.validate_required(self.user_place_type, 'user_place_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_time is not None:
            result['data_time'] = self.data_time
        if self.list_type is not None:
            result['list_type'] = self.list_type
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.type is not None:
            result['type'] = self.type
        if self.user_place is not None:
            result['user_place'] = self.user_place
        if self.user_place_type is not None:
            result['user_place_type'] = self.user_place_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_time') is not None:
            self.data_time = m.get('data_time')
        if m.get('list_type') is not None:
            self.list_type = m.get('list_type')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('user_place') is not None:
            self.user_place = m.get('user_place')
        if m.get('user_place_type') is not None:
            self.user_place_type = m.get('user_place_type')
        return self


class QueryRtopCompanyRiskyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_code: str = None,
        risky_companies: List[RtopRiskyCompany] = None,
        success: bool = None,
        total_num: int = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 返回码
        self.response_code = response_code
        # 全局动态中的企业列表
        self.risky_companies = risky_companies
        # 是否调用成功
        self.success = success
        # 总条数
        self.total_num = total_num

    def validate(self):
        if self.risky_companies:
            for k in self.risky_companies:
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
        if self.response_code is not None:
            result['response_code'] = self.response_code
        result['risky_companies'] = []
        if self.risky_companies is not None:
            for k in self.risky_companies:
                result['risky_companies'].append(k.to_map() if k else None)
        if self.success is not None:
            result['success'] = self.success
        if self.total_num is not None:
            result['total_num'] = self.total_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        self.risky_companies = []
        if m.get('risky_companies') is not None:
            for k in m.get('risky_companies'):
                temp_model = RtopRiskyCompany()
                self.risky_companies.append(temp_model.from_map(k))
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('total_num') is not None:
            self.total_num = m.get('total_num')
        return self


class QueryRtopCompanyListRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        active_areas: List[str] = None,
        categories: List[str] = None,
        company_states: List[str] = None,
        feedback: List[str] = None,
        max_risk_score: int = None,
        max_risk_score_weekly_float: str = None,
        max_spread_number: int = None,
        min_risk_score: int = None,
        min_risk_score_weekly_float: str = None,
        min_spread_number: int = None,
        normal_operation: bool = None,
        operate_areas: List[str] = None,
        page_no: int = None,
        page_size: int = None,
        platform_states: List[str] = None,
        register_areas: List[str] = None,
        risky_dimensions: List[str] = None,
        risk_tags: List[str] = None,
        risk_types: List[str] = None,
        sort_field: str = None,
        sort_type: str = None,
        user_place: str = None,
        user_place_type: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 活跃地区
        self.active_areas = active_areas
        # 企业类型
        self.categories = categories
        # 企业状态
        self.company_states = company_states
        # 反馈
        self.feedback = feedback
        # 风险指数最大值
        self.max_risk_score = max_risk_score
        # 指数周波动最大值
        self.max_risk_score_weekly_float = max_risk_score_weekly_float
        # 传播人次最大值
        self.max_spread_number = max_spread_number
        # 风险指数最小值
        self.min_risk_score = min_risk_score
        # 指数周波动最小值
        self.min_risk_score_weekly_float = min_risk_score_weekly_float
        # 传播人次最小值
        self.min_spread_number = min_spread_number
        # 正常营运状态
        self.normal_operation = normal_operation
        # 经营地区
        self.operate_areas = operate_areas
        # 当前是第几页
        self.page_no = page_no
        # 每一页的记录条数
        self.page_size = page_size
        # 平台状态
        self.platform_states = platform_states
        # 注册地区
        self.register_areas = register_areas
        # 高风险维度
        self.risky_dimensions = risky_dimensions
        # 风险标签
        self.risk_tags = risk_tags
        # 风险定性
        self.risk_types = risk_types
        # 排序字段
        self.sort_field = sort_field
        # 排序类型
        self.sort_type = sort_type
        # 用户属地
        self.user_place = user_place
        # 用户所在地类型
        self.user_place_type = user_place_type

    def validate(self):
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.user_place, 'user_place')
        self.validate_required(self.user_place_type, 'user_place_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.active_areas is not None:
            result['active_areas'] = self.active_areas
        if self.categories is not None:
            result['categories'] = self.categories
        if self.company_states is not None:
            result['company_states'] = self.company_states
        if self.feedback is not None:
            result['feedback'] = self.feedback
        if self.max_risk_score is not None:
            result['max_risk_score'] = self.max_risk_score
        if self.max_risk_score_weekly_float is not None:
            result['max_risk_score_weekly_float'] = self.max_risk_score_weekly_float
        if self.max_spread_number is not None:
            result['max_spread_number'] = self.max_spread_number
        if self.min_risk_score is not None:
            result['min_risk_score'] = self.min_risk_score
        if self.min_risk_score_weekly_float is not None:
            result['min_risk_score_weekly_float'] = self.min_risk_score_weekly_float
        if self.min_spread_number is not None:
            result['min_spread_number'] = self.min_spread_number
        if self.normal_operation is not None:
            result['normal_operation'] = self.normal_operation
        if self.operate_areas is not None:
            result['operate_areas'] = self.operate_areas
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.platform_states is not None:
            result['platform_states'] = self.platform_states
        if self.register_areas is not None:
            result['register_areas'] = self.register_areas
        if self.risky_dimensions is not None:
            result['risky_dimensions'] = self.risky_dimensions
        if self.risk_tags is not None:
            result['risk_tags'] = self.risk_tags
        if self.risk_types is not None:
            result['risk_types'] = self.risk_types
        if self.sort_field is not None:
            result['sort_field'] = self.sort_field
        if self.sort_type is not None:
            result['sort_type'] = self.sort_type
        if self.user_place is not None:
            result['user_place'] = self.user_place
        if self.user_place_type is not None:
            result['user_place_type'] = self.user_place_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('active_areas') is not None:
            self.active_areas = m.get('active_areas')
        if m.get('categories') is not None:
            self.categories = m.get('categories')
        if m.get('company_states') is not None:
            self.company_states = m.get('company_states')
        if m.get('feedback') is not None:
            self.feedback = m.get('feedback')
        if m.get('max_risk_score') is not None:
            self.max_risk_score = m.get('max_risk_score')
        if m.get('max_risk_score_weekly_float') is not None:
            self.max_risk_score_weekly_float = m.get('max_risk_score_weekly_float')
        if m.get('max_spread_number') is not None:
            self.max_spread_number = m.get('max_spread_number')
        if m.get('min_risk_score') is not None:
            self.min_risk_score = m.get('min_risk_score')
        if m.get('min_risk_score_weekly_float') is not None:
            self.min_risk_score_weekly_float = m.get('min_risk_score_weekly_float')
        if m.get('min_spread_number') is not None:
            self.min_spread_number = m.get('min_spread_number')
        if m.get('normal_operation') is not None:
            self.normal_operation = m.get('normal_operation')
        if m.get('operate_areas') is not None:
            self.operate_areas = m.get('operate_areas')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('platform_states') is not None:
            self.platform_states = m.get('platform_states')
        if m.get('register_areas') is not None:
            self.register_areas = m.get('register_areas')
        if m.get('risky_dimensions') is not None:
            self.risky_dimensions = m.get('risky_dimensions')
        if m.get('risk_tags') is not None:
            self.risk_tags = m.get('risk_tags')
        if m.get('risk_types') is not None:
            self.risk_types = m.get('risk_types')
        if m.get('sort_field') is not None:
            self.sort_field = m.get('sort_field')
        if m.get('sort_type') is not None:
            self.sort_type = m.get('sort_type')
        if m.get('user_place') is not None:
            self.user_place = m.get('user_place')
        if m.get('user_place_type') is not None:
            self.user_place_type = m.get('user_place_type')
        return self


class QueryRtopCompanyListResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        company_ids: List[str] = None,
        response_code: str = None,
        success: bool = None,
        total_num: int = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 企业id列表
        self.company_ids = company_ids
        # 返回码
        self.response_code = response_code
        # 是否调用成功
        self.success = success
        # 总条数
        self.total_num = total_num

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
        if self.company_ids is not None:
            result['company_ids'] = self.company_ids
        if self.response_code is not None:
            result['response_code'] = self.response_code
        if self.success is not None:
            result['success'] = self.success
        if self.total_num is not None:
            result['total_num'] = self.total_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('company_ids') is not None:
            self.company_ids = m.get('company_ids')
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('total_num') is not None:
            self.total_num = m.get('total_num')
        return self


class QueryRtopRisklabelConfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_no: int = None,
        page_size: int = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # page_no
        self.page_no = page_no
        # page_size
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryRtopRisklabelConfigResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_code: str = None,
        success: bool = None,
        tag_config: List[RiskLabelConfigInfo] = None,
        total: int = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 返回码
        # 
        self.response_code = response_code
        # 是否调用成功
        # 
        self.success = success
        # 列表
        self.tag_config = tag_config
        # 总数
        self.total = total

    def validate(self):
        if self.tag_config:
            for k in self.tag_config:
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
        if self.response_code is not None:
            result['response_code'] = self.response_code
        if self.success is not None:
            result['success'] = self.success
        result['tag_config'] = []
        if self.tag_config is not None:
            for k in self.tag_config:
                result['tag_config'].append(k.to_map() if k else None)
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
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        if m.get('success') is not None:
            self.success = m.get('success')
        self.tag_config = []
        if m.get('tag_config') is not None:
            for k in m.get('tag_config'):
                temp_model = RiskLabelConfigInfo()
                self.tag_config.append(temp_model.from_map(k))
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class QueryRtopCompanyRiskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_id: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业id
        self.company_id = company_id

    def validate(self):
        self.validate_required(self.company_id, 'company_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_id is not None:
            result['company_id'] = self.company_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        return self


class QueryRtopCompanyRiskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        risk_factors: List[RtopCompanyRiskFactor] = None,
        risk_level: str = None,
        risk_message: str = None,
        risk_score: int = None,
        risk_tags: List[str] = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 风险维度
        self.risk_factors = risk_factors
        # 风险等级
        self.risk_level = risk_level
        # 风险报文
        self.risk_message = risk_message
        # 风险分数
        self.risk_score = risk_score
        # 风险标签
        self.risk_tags = risk_tags

    def validate(self):
        if self.risk_factors:
            for k in self.risk_factors:
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
        result['risk_factors'] = []
        if self.risk_factors is not None:
            for k in self.risk_factors:
                result['risk_factors'].append(k.to_map() if k else None)
        if self.risk_level is not None:
            result['risk_level'] = self.risk_level
        if self.risk_message is not None:
            result['risk_message'] = self.risk_message
        if self.risk_score is not None:
            result['risk_score'] = self.risk_score
        if self.risk_tags is not None:
            result['risk_tags'] = self.risk_tags
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.risk_factors = []
        if m.get('risk_factors') is not None:
            for k in m.get('risk_factors'):
                temp_model = RtopCompanyRiskFactor()
                self.risk_factors.append(temp_model.from_map(k))
        if m.get('risk_level') is not None:
            self.risk_level = m.get('risk_level')
        if m.get('risk_message') is not None:
            self.risk_message = m.get('risk_message')
        if m.get('risk_score') is not None:
            self.risk_score = m.get('risk_score')
        if m.get('risk_tags') is not None:
            self.risk_tags = m.get('risk_tags')
        return self


class ListRtopCompanyRelatedRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_id: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业id
        self.company_id = company_id

    def validate(self):
        self.validate_required(self.company_id, 'company_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_id is not None:
            result['company_id'] = self.company_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        return self


class ListRtopCompanyRelatedResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        companies: List[RtopRiskGeneNode] = None,
        response_code: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # node
        self.companies = companies
        # 返回码
        # 
        self.response_code = response_code
        # 是否调用成功
        # 
        self.success = success

    def validate(self):
        if self.companies:
            for k in self.companies:
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
        result['companies'] = []
        if self.companies is not None:
            for k in self.companies:
                result['companies'].append(k.to_map() if k else None)
        if self.response_code is not None:
            result['response_code'] = self.response_code
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
        self.companies = []
        if m.get('companies') is not None:
            for k in m.get('companies'):
                temp_model = RtopRiskGeneNode()
                self.companies.append(temp_model.from_map(k))
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryRtopTagImageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_id: str = None,
        tag_id: str = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业ID
        self.company_id = company_id
        # 标签ID
        self.tag_id = tag_id

    def validate(self):
        self.validate_required(self.company_id, 'company_id')
        self.validate_required(self.tag_id, 'tag_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_id is not None:
            result['company_id'] = self.company_id
        if self.tag_id is not None:
            result['tag_id'] = self.tag_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        if m.get('tag_id') is not None:
            self.tag_id = m.get('tag_id')
        return self


class QueryRtopTagImageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        risk_images: List[RtopTagImage] = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 标签图片列表
        self.risk_images = risk_images

    def validate(self):
        if self.risk_images:
            for k in self.risk_images:
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
        result['risk_images'] = []
        if self.risk_images is not None:
            for k in self.risk_images:
                result['risk_images'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.risk_images = []
        if m.get('risk_images') is not None:
            for k in m.get('risk_images'):
                temp_model = RtopTagImage()
                self.risk_images.append(temp_model.from_map(k))
        return self


class ListRtopStarCompanyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_no: int = None,
        page_size: int = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 页码
        self.page_no = page_no
        # 一页条数
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListRtopStarCompanyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        company_infos: List[RtopStarCompanyInfo] = None,
        page_no: int = None,
        page_size: int = None,
        total_count: int = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 企业列表
        self.company_infos = company_infos
        # 页码
        self.page_no = page_no
        # 一页条数
        self.page_size = page_size
        # 总的记录数
        self.total_count = total_count

    def validate(self):
        if self.company_infos:
            for k in self.company_infos:
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
        result['company_infos'] = []
        if self.company_infos is not None:
            for k in self.company_infos:
                result['company_infos'].append(k.to_map() if k else None)
        if self.page_no is not None:
            result['page_no'] = self.page_no
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
        self.company_infos = []
        if m.get('company_infos') is not None:
            for k in m.get('company_infos'):
                temp_model = RtopStarCompanyInfo()
                self.company_infos.append(temp_model.from_map(k))
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class QueryRpSecurityPolicyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        risk_type: str = None,
        security_scene: SecurityScene = None,
        service_context: ServiceContext = None,
    ):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 风险类型：表示风险处理或风险咨询——process/advice
        self.risk_type = risk_type
        # security_scene
        self.security_scene = security_scene
        # service_context
        self.service_context = service_context

    def validate(self):
        self.validate_required(self.risk_type, 'risk_type')
        self.validate_required(self.security_scene, 'security_scene')
        if self.security_scene:
            self.security_scene.validate()
        self.validate_required(self.service_context, 'service_context')
        if self.service_context:
            self.service_context.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.risk_type is not None:
            result['risk_type'] = self.risk_type
        if self.security_scene is not None:
            result['security_scene'] = self.security_scene.to_map()
        if self.service_context is not None:
            result['service_context'] = self.service_context.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('risk_type') is not None:
            self.risk_type = m.get('risk_type')
        if m.get('security_scene') is not None:
            temp_model = SecurityScene()
            self.security_scene = temp_model.from_map(m['security_scene'])
        if m.get('service_context') is not None:
            temp_model = ServiceContext()
            self.service_context = temp_model.from_map(m['service_context'])
        return self


class QueryRpSecurityPolicyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        model_details: List[ModelDetails] = None,
        security_id: str = None,
        security_result: str = None,
        strategy_details: List[StrategyDetails] = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 模型结果详情
        # 
        self.model_details = model_details
        # 反馈成功之后的id
        self.security_id = security_id
        # 安全处理结果，枚举值为：reject[拒绝],validate[校验],accept[放过]
        self.security_result = security_result
        # 策略结果详情
        # 
        self.strategy_details = strategy_details

    def validate(self):
        if self.model_details:
            for k in self.model_details:
                if k:
                    k.validate()
        if self.strategy_details:
            for k in self.strategy_details:
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
        result['model_details'] = []
        if self.model_details is not None:
            for k in self.model_details:
                result['model_details'].append(k.to_map() if k else None)
        if self.security_id is not None:
            result['security_id'] = self.security_id
        if self.security_result is not None:
            result['security_result'] = self.security_result
        result['strategy_details'] = []
        if self.strategy_details is not None:
            for k in self.strategy_details:
                result['strategy_details'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.model_details = []
        if m.get('model_details') is not None:
            for k in m.get('model_details'):
                temp_model = ModelDetails()
                self.model_details.append(temp_model.from_map(k))
        if m.get('security_id') is not None:
            self.security_id = m.get('security_id')
        if m.get('security_result') is not None:
            self.security_result = m.get('security_result')
        self.strategy_details = []
        if m.get('strategy_details') is not None:
            for k in m.get('strategy_details'):
                temp_model = StrategyDetails()
                self.strategy_details.append(temp_model.from_map(k))
        return self


