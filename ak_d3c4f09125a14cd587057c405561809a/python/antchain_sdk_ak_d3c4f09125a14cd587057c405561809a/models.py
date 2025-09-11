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


class LoginAccountTypeBO(TeaModel):
    def __init__(
        self,
        user_login_type: str = None,
        login_name: str = None,
    ):
        # 登录类型
        self.user_login_type = user_login_type
        # 登录名称
        self.login_name = login_name

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_login_type is not None:
            result['user_login_type'] = self.user_login_type
        if self.login_name is not None:
            result['login_name'] = self.login_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_login_type') is not None:
            self.user_login_type = m.get('user_login_type')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        return self


class CrossChainBonusAccountsDetailVO(TeaModel):
    def __init__(
        self,
        id: str = None,
        transaction_hash: str = None,
        pre_balance: str = None,
        transaction_amount: str = None,
        post_balance: str = None,
        transaction_type: str = None,
        counter_address: str = None,
        gmt_created: int = None,
        gmt_modified: int = None,
    ):
        # 明细ID
        self.id = id
        # 交易链上Hash
        self.transaction_hash = transaction_hash
        # 交易前余额
        self.pre_balance = pre_balance
        # 交易数量
        self.transaction_amount = transaction_amount
        # 交易后余额
        self.post_balance = post_balance
        # 交易类型
        self.transaction_type = transaction_type
        # 对手地址
        self.counter_address = counter_address
        # 创建时间
        self.gmt_created = gmt_created
        # 更新时间
        self.gmt_modified = gmt_modified

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.transaction_hash is not None:
            result['transaction_hash'] = self.transaction_hash
        if self.pre_balance is not None:
            result['pre_balance'] = self.pre_balance
        if self.transaction_amount is not None:
            result['transaction_amount'] = self.transaction_amount
        if self.post_balance is not None:
            result['post_balance'] = self.post_balance
        if self.transaction_type is not None:
            result['transaction_type'] = self.transaction_type
        if self.counter_address is not None:
            result['counter_address'] = self.counter_address
        if self.gmt_created is not None:
            result['gmt_created'] = self.gmt_created
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('transaction_hash') is not None:
            self.transaction_hash = m.get('transaction_hash')
        if m.get('pre_balance') is not None:
            self.pre_balance = m.get('pre_balance')
        if m.get('transaction_amount') is not None:
            self.transaction_amount = m.get('transaction_amount')
        if m.get('post_balance') is not None:
            self.post_balance = m.get('post_balance')
        if m.get('transaction_type') is not None:
            self.transaction_type = m.get('transaction_type')
        if m.get('counter_address') is not None:
            self.counter_address = m.get('counter_address')
        if m.get('gmt_created') is not None:
            self.gmt_created = m.get('gmt_created')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        return self


class CrossChainAccountsDetailVO(TeaModel):
    def __init__(
        self,
        id: str = None,
        transaction_hash: str = None,
        pre_balance: str = None,
        transaction_amount: str = None,
        post_balance: str = None,
        transaction_type: str = None,
        counter_address: str = None,
        gmt_created: int = None,
        gmt_modified: int = None,
    ):
        # 明细ID
        self.id = id
        # 交易链上Hash
        self.transaction_hash = transaction_hash
        # 交易前余额
        self.pre_balance = pre_balance
        # 交易数量
        self.transaction_amount = transaction_amount
        # 交易后余额
        self.post_balance = post_balance
        # 交易类别
        self.transaction_type = transaction_type
        # 对手地址
        self.counter_address = counter_address
        # 创建时间
        self.gmt_created = gmt_created
        # 更新时间
        self.gmt_modified = gmt_modified

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.transaction_hash is not None:
            result['transaction_hash'] = self.transaction_hash
        if self.pre_balance is not None:
            result['pre_balance'] = self.pre_balance
        if self.transaction_amount is not None:
            result['transaction_amount'] = self.transaction_amount
        if self.post_balance is not None:
            result['post_balance'] = self.post_balance
        if self.transaction_type is not None:
            result['transaction_type'] = self.transaction_type
        if self.counter_address is not None:
            result['counter_address'] = self.counter_address
        if self.gmt_created is not None:
            result['gmt_created'] = self.gmt_created
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('transaction_hash') is not None:
            self.transaction_hash = m.get('transaction_hash')
        if m.get('pre_balance') is not None:
            self.pre_balance = m.get('pre_balance')
        if m.get('transaction_amount') is not None:
            self.transaction_amount = m.get('transaction_amount')
        if m.get('post_balance') is not None:
            self.post_balance = m.get('post_balance')
        if m.get('transaction_type') is not None:
            self.transaction_type = m.get('transaction_type')
        if m.get('counter_address') is not None:
            self.counter_address = m.get('counter_address')
        if m.get('gmt_created') is not None:
            self.gmt_created = m.get('gmt_created')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        return self


class CrossChainAccountsVO(TeaModel):
    def __init__(
        self,
        cross_chain_user_address: str = None,
        cross_chain_user_account_id: str = None,
        cross_chain_user_bonus_account_id: str = None,
        cross_chain_user_accounts_details: List[CrossChainAccountsDetailVO] = None,
        cross_chain_bonus_accounts_details: List[CrossChainBonusAccountsDetailVO] = None,
    ):
        # 对侧链用户地址
        self.cross_chain_user_address = cross_chain_user_address
        # 对侧链账户ID
        self.cross_chain_user_account_id = cross_chain_user_account_id
        # 对侧链红利账户ID
        self.cross_chain_user_bonus_account_id = cross_chain_user_bonus_account_id
        # 对侧链资产账户明细
        self.cross_chain_user_accounts_details = cross_chain_user_accounts_details
        # 对侧链账户信息
        self.cross_chain_bonus_accounts_details = cross_chain_bonus_accounts_details

    def validate(self):
        if self.cross_chain_user_accounts_details:
            for k in self.cross_chain_user_accounts_details:
                if k:
                    k.validate()
        if self.cross_chain_bonus_accounts_details:
            for k in self.cross_chain_bonus_accounts_details:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cross_chain_user_address is not None:
            result['cross_chain_user_address'] = self.cross_chain_user_address
        if self.cross_chain_user_account_id is not None:
            result['cross_chain_user_account_id'] = self.cross_chain_user_account_id
        if self.cross_chain_user_bonus_account_id is not None:
            result['cross_chain_user_bonus_account_id'] = self.cross_chain_user_bonus_account_id
        result['cross_chain_user_accounts_details'] = []
        if self.cross_chain_user_accounts_details is not None:
            for k in self.cross_chain_user_accounts_details:
                result['cross_chain_user_accounts_details'].append(k.to_map() if k else None)
        result['cross_chain_bonus_accounts_details'] = []
        if self.cross_chain_bonus_accounts_details is not None:
            for k in self.cross_chain_bonus_accounts_details:
                result['cross_chain_bonus_accounts_details'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cross_chain_user_address') is not None:
            self.cross_chain_user_address = m.get('cross_chain_user_address')
        if m.get('cross_chain_user_account_id') is not None:
            self.cross_chain_user_account_id = m.get('cross_chain_user_account_id')
        if m.get('cross_chain_user_bonus_account_id') is not None:
            self.cross_chain_user_bonus_account_id = m.get('cross_chain_user_bonus_account_id')
        self.cross_chain_user_accounts_details = []
        if m.get('cross_chain_user_accounts_details') is not None:
            for k in m.get('cross_chain_user_accounts_details'):
                temp_model = CrossChainAccountsDetailVO()
                self.cross_chain_user_accounts_details.append(temp_model.from_map(k))
        self.cross_chain_bonus_accounts_details = []
        if m.get('cross_chain_bonus_accounts_details') is not None:
            for k in m.get('cross_chain_bonus_accounts_details'):
                temp_model = CrossChainBonusAccountsDetailVO()
                self.cross_chain_bonus_accounts_details.append(temp_model.from_map(k))
        return self


class UserOperatorInfoBO(TeaModel):
    def __init__(
        self,
        user_id: str = None,
        alias: str = None,
        address: str = None,
        user_login_account_list: List[LoginAccountTypeBO] = None,
        user_institution_type_list: List[str] = None,
    ):
        # userId
        self.user_id = user_id
        # 别名
        self.alias = alias
        # 钱包地址
        self.address = address
        # 登录账号类型列表
        self.user_login_account_list = user_login_account_list
        # 机构类型列表
        self.user_institution_type_list = user_institution_type_list

    def validate(self):
        if self.user_login_account_list:
            for k in self.user_login_account_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.alias is not None:
            result['alias'] = self.alias
        if self.address is not None:
            result['address'] = self.address
        result['user_login_account_list'] = []
        if self.user_login_account_list is not None:
            for k in self.user_login_account_list:
                result['user_login_account_list'].append(k.to_map() if k else None)
        if self.user_institution_type_list is not None:
            result['user_institution_type_list'] = self.user_institution_type_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('alias') is not None:
            self.alias = m.get('alias')
        if m.get('address') is not None:
            self.address = m.get('address')
        self.user_login_account_list = []
        if m.get('user_login_account_list') is not None:
            for k in m.get('user_login_account_list'):
                temp_model = LoginAccountTypeBO()
                self.user_login_account_list.append(temp_model.from_map(k))
        if m.get('user_institution_type_list') is not None:
            self.user_institution_type_list = m.get('user_institution_type_list')
        return self


class ParticipantInfo(TeaModel):
    def __init__(
        self,
        id: str = None,
        type: str = None,
        name: str = None,
    ):
        # 机构id
        self.id = id
        # 二级机构类型
        self.type = type
        # 机构名称
        self.name = name

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.type is not None:
            result['type'] = self.type
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class ProjectWithRole(TeaModel):
    def __init__(
        self,
        project_id: str = None,
        projcet_name: str = None,
        description: str = None,
        token_name: str = None,
        capacity: str = None,
        net_value: str = None,
        price_type: str = None,
        project_net_value: str = None,
        max_subscription_amount: str = None,
        deployment_type: str = None,
        chain_type: str = None,
        user_operator_list: List[UserOperatorInfoBO] = None,
        participant_infos: List[ParticipantInfo] = None,
    ):
        # 项目id
        self.project_id = project_id
        # 项目名称
        self.projcet_name = projcet_name
        # 描述
        self.description = description
        # token名称
        self.token_name = token_name
        # 最大供应量
        self.capacity = capacity
        # 净值
        self.net_value = net_value
        # 价格类型
        self.price_type = price_type
        # 项目净值
        self.project_net_value = project_net_value
        # 最大限额
        self.max_subscription_amount = max_subscription_amount
        # 部署类型 DIRECT_PUBLIC_CHAIN 直发公链，NORMAL 普通模式
        self.deployment_type = deployment_type
        # 项目所在链
        self.chain_type = chain_type
        # 操作角色列表
        self.user_operator_list = user_operator_list
        # 代销者机构集合
        self.participant_infos = participant_infos

    def validate(self):
        if self.user_operator_list:
            for k in self.user_operator_list:
                if k:
                    k.validate()
        if self.participant_infos:
            for k in self.participant_infos:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.projcet_name is not None:
            result['projcet_name'] = self.projcet_name
        if self.description is not None:
            result['description'] = self.description
        if self.token_name is not None:
            result['token_name'] = self.token_name
        if self.capacity is not None:
            result['capacity'] = self.capacity
        if self.net_value is not None:
            result['net_value'] = self.net_value
        if self.price_type is not None:
            result['price_type'] = self.price_type
        if self.project_net_value is not None:
            result['project_net_value'] = self.project_net_value
        if self.max_subscription_amount is not None:
            result['max_subscription_amount'] = self.max_subscription_amount
        if self.deployment_type is not None:
            result['deployment_type'] = self.deployment_type
        if self.chain_type is not None:
            result['chain_type'] = self.chain_type
        result['user_operator_list'] = []
        if self.user_operator_list is not None:
            for k in self.user_operator_list:
                result['user_operator_list'].append(k.to_map() if k else None)
        result['participant_infos'] = []
        if self.participant_infos is not None:
            for k in self.participant_infos:
                result['participant_infos'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('projcet_name') is not None:
            self.projcet_name = m.get('projcet_name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('token_name') is not None:
            self.token_name = m.get('token_name')
        if m.get('capacity') is not None:
            self.capacity = m.get('capacity')
        if m.get('net_value') is not None:
            self.net_value = m.get('net_value')
        if m.get('price_type') is not None:
            self.price_type = m.get('price_type')
        if m.get('project_net_value') is not None:
            self.project_net_value = m.get('project_net_value')
        if m.get('max_subscription_amount') is not None:
            self.max_subscription_amount = m.get('max_subscription_amount')
        if m.get('deployment_type') is not None:
            self.deployment_type = m.get('deployment_type')
        if m.get('chain_type') is not None:
            self.chain_type = m.get('chain_type')
        self.user_operator_list = []
        if m.get('user_operator_list') is not None:
            for k in m.get('user_operator_list'):
                temp_model = UserOperatorInfoBO()
                self.user_operator_list.append(temp_model.from_map(k))
        self.participant_infos = []
        if m.get('participant_infos') is not None:
            for k in m.get('participant_infos'):
                temp_model = ParticipantInfo()
                self.participant_infos.append(temp_model.from_map(k))
        return self


class CrossAccountListVO(TeaModel):
    def __init__(
        self,
        project_id: str = None,
        asset_project_address: str = None,
        bonus_address: str = None,
        user_id: str = None,
        distributor_institution_id: str = None,
        chain_name: str = None,
        sub_user_account_id: str = None,
        sub_user_bonus_account_id: str = None,
        target_chain_name: str = None,
        target_chain_asset_token_address: str = None,
        target_chain_bonus_address: str = None,
        cross_chain_accounts_info: List[CrossChainAccountsVO] = None,
    ):
        # 项目ID
        self.project_id = project_id
        # 资产项目合约地址
        self.asset_project_address = asset_project_address
        # 红利合约地址
        self.bonus_address = bonus_address
        # 用户ID
        self.user_id = user_id
        # 代销机构ID
        self.distributor_institution_id = distributor_institution_id
        # 发行链名称
        self.chain_name = chain_name
        # 投资者用户账户ID
        self.sub_user_account_id = sub_user_account_id
        # 投资者用户红利账户ID
        self.sub_user_bonus_account_id = sub_user_bonus_account_id
        # 目标链名称
        self.target_chain_name = target_chain_name
        # 目标链资产合约地址
        self.target_chain_asset_token_address = target_chain_asset_token_address
        # 目标链红利合约地址
        self.target_chain_bonus_address = target_chain_bonus_address
        # 对侧链账户信息
        self.cross_chain_accounts_info = cross_chain_accounts_info

    def validate(self):
        if self.cross_chain_accounts_info:
            for k in self.cross_chain_accounts_info:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.asset_project_address is not None:
            result['asset_project_address'] = self.asset_project_address
        if self.bonus_address is not None:
            result['bonus_address'] = self.bonus_address
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.distributor_institution_id is not None:
            result['distributor_institution_id'] = self.distributor_institution_id
        if self.chain_name is not None:
            result['chain_name'] = self.chain_name
        if self.sub_user_account_id is not None:
            result['sub_user_account_id'] = self.sub_user_account_id
        if self.sub_user_bonus_account_id is not None:
            result['sub_user_bonus_account_id'] = self.sub_user_bonus_account_id
        if self.target_chain_name is not None:
            result['target_chain_name'] = self.target_chain_name
        if self.target_chain_asset_token_address is not None:
            result['target_chain_asset_token_address'] = self.target_chain_asset_token_address
        if self.target_chain_bonus_address is not None:
            result['target_chain_bonus_address'] = self.target_chain_bonus_address
        result['cross_chain_accounts_info'] = []
        if self.cross_chain_accounts_info is not None:
            for k in self.cross_chain_accounts_info:
                result['cross_chain_accounts_info'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('asset_project_address') is not None:
            self.asset_project_address = m.get('asset_project_address')
        if m.get('bonus_address') is not None:
            self.bonus_address = m.get('bonus_address')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('distributor_institution_id') is not None:
            self.distributor_institution_id = m.get('distributor_institution_id')
        if m.get('chain_name') is not None:
            self.chain_name = m.get('chain_name')
        if m.get('sub_user_account_id') is not None:
            self.sub_user_account_id = m.get('sub_user_account_id')
        if m.get('sub_user_bonus_account_id') is not None:
            self.sub_user_bonus_account_id = m.get('sub_user_bonus_account_id')
        if m.get('target_chain_name') is not None:
            self.target_chain_name = m.get('target_chain_name')
        if m.get('target_chain_asset_token_address') is not None:
            self.target_chain_asset_token_address = m.get('target_chain_asset_token_address')
        if m.get('target_chain_bonus_address') is not None:
            self.target_chain_bonus_address = m.get('target_chain_bonus_address')
        self.cross_chain_accounts_info = []
        if m.get('cross_chain_accounts_info') is not None:
            for k in m.get('cross_chain_accounts_info'):
                temp_model = CrossChainAccountsVO()
                self.cross_chain_accounts_info.append(temp_model.from_map(k))
        return self


class SubUserAccountVO(TeaModel):
    def __init__(
        self,
        user_account_id: str = None,
        user_id: str = None,
        user_address: str = None,
        user_target: str = None,
        user_balance: str = None,
        asset_project_id: str = None,
        asset_project_name: str = None,
        institution_id: str = None,
        institution_name: str = None,
    ):
        # 用户账户id
        self.user_account_id = user_account_id
        # 用户id
        self.user_id = user_id
        # 用户地址
        self.user_address = user_address
        # 用户资产配额
        self.user_target = user_target
        # 用户资产
        self.user_balance = user_balance
        # 项目id
        self.asset_project_id = asset_project_id
        # 项目名称
        self.asset_project_name = asset_project_name
        # 用户所属机构id
        self.institution_id = institution_id
        # 用户所属机构名称
        self.institution_name = institution_name

    def validate(self):
        self.validate_required(self.user_account_id, 'user_account_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.user_address, 'user_address')
        self.validate_required(self.user_target, 'user_target')
        self.validate_required(self.user_balance, 'user_balance')
        self.validate_required(self.asset_project_id, 'asset_project_id')
        self.validate_required(self.asset_project_name, 'asset_project_name')
        self.validate_required(self.institution_id, 'institution_id')
        self.validate_required(self.institution_name, 'institution_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_account_id is not None:
            result['user_account_id'] = self.user_account_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_address is not None:
            result['user_address'] = self.user_address
        if self.user_target is not None:
            result['user_target'] = self.user_target
        if self.user_balance is not None:
            result['user_balance'] = self.user_balance
        if self.asset_project_id is not None:
            result['asset_project_id'] = self.asset_project_id
        if self.asset_project_name is not None:
            result['asset_project_name'] = self.asset_project_name
        if self.institution_id is not None:
            result['institution_id'] = self.institution_id
        if self.institution_name is not None:
            result['institution_name'] = self.institution_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_account_id') is not None:
            self.user_account_id = m.get('user_account_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_address') is not None:
            self.user_address = m.get('user_address')
        if m.get('user_target') is not None:
            self.user_target = m.get('user_target')
        if m.get('user_balance') is not None:
            self.user_balance = m.get('user_balance')
        if m.get('asset_project_id') is not None:
            self.asset_project_id = m.get('asset_project_id')
        if m.get('asset_project_name') is not None:
            self.asset_project_name = m.get('asset_project_name')
        if m.get('institution_id') is not None:
            self.institution_id = m.get('institution_id')
        if m.get('institution_name') is not None:
            self.institution_name = m.get('institution_name')
        return self


class LoginOperationLogVO(TeaModel):
    def __init__(
        self,
        user_id: str = None,
        user_address: str = None,
        login_name: str = None,
        login_account_type: str = None,
        request_url: str = None,
        success: bool = None,
        gmt_created: int = None,
    ):
        # 用户ID
        self.user_id = user_id
        # 用户地址
        self.user_address = user_address
        # 登录名
        self.login_name = login_name
        # 登录类型
        self.login_account_type = login_account_type
        # 请求URL
        self.request_url = request_url
        # 是否成功
        self.success = success
        # 创建时间
        self.gmt_created = gmt_created

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.request_url, 'request_url')
        self.validate_required(self.success, 'success')
        self.validate_required(self.gmt_created, 'gmt_created')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_address is not None:
            result['user_address'] = self.user_address
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.login_account_type is not None:
            result['login_account_type'] = self.login_account_type
        if self.request_url is not None:
            result['request_u_r_l'] = self.request_url
        if self.success is not None:
            result['success'] = self.success
        if self.gmt_created is not None:
            result['gmt_created'] = self.gmt_created
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_address') is not None:
            self.user_address = m.get('user_address')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('login_account_type') is not None:
            self.login_account_type = m.get('login_account_type')
        if m.get('request_u_r_l') is not None:
            self.request_url = m.get('request_u_r_l')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('gmt_created') is not None:
            self.gmt_created = m.get('gmt_created')
        return self


class QueryAntdigitalWebtrwatradeIssuerSubuserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        project_id: str = None,
        institution_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户id
        self.user_id = user_id
        # 项目id
        self.project_id = project_id
        # 机构id
        self.institution_id = institution_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.institution_id, 'institution_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.institution_id is not None:
            result['institution_id'] = self.institution_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('institution_id') is not None:
            self.institution_id = m.get('institution_id')
        return self


class QueryAntdigitalWebtrwatradeIssuerSubuserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: SubUserAccountVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 二级用户信息
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

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
            temp_model = SubUserAccountVO()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryAntdigitalWebtrwatradeDistributorSubuserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        institution_id: str = None,
        project_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户id
        self.user_id = user_id
        # 机构id
        self.institution_id = institution_id
        # 项目id
        self.project_id = project_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.institution_id, 'institution_id')
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
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.institution_id is not None:
            result['institution_id'] = self.institution_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('institution_id') is not None:
            self.institution_id = m.get('institution_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        return self


class QueryAntdigitalWebtrwatradeDistributorSubuserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: SubUserAccountVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 二级用户信息
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

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
            temp_model = SubUserAccountVO()
            self.data = temp_model.from_map(m['data'])
        return self


class ListAntdigitalWebtrwatradeIssuerOperationlogRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        start_time_mills: int = None,
        end_time_mills: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 开始时间 (时间戳)
        self.start_time_mills = start_time_mills
        # 结束时间 (时间戳)
        self.end_time_mills = end_time_mills

    def validate(self):
        self.validate_required(self.start_time_mills, 'start_time_mills')
        self.validate_required(self.end_time_mills, 'end_time_mills')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.start_time_mills is not None:
            result['start_time_mills'] = self.start_time_mills
        if self.end_time_mills is not None:
            result['end_time_mills'] = self.end_time_mills
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('start_time_mills') is not None:
            self.start_time_mills = m.get('start_time_mills')
        if m.get('end_time_mills') is not None:
            self.end_time_mills = m.get('end_time_mills')
        return self


class ListAntdigitalWebtrwatradeIssuerOperationlogResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[LoginOperationLogVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 回参
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
                temp_model = LoginOperationLogVO()
                self.data.append(temp_model.from_map(k))
        return self


class ListAntdigitalWebtrwatradeDistributorOperationlogRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        start_time_mills: int = None,
        end_time_mills: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 开始时间 (时间戳)
        self.start_time_mills = start_time_mills
        # 结束时间 (时间戳)
        self.end_time_mills = end_time_mills

    def validate(self):
        self.validate_required(self.start_time_mills, 'start_time_mills')
        self.validate_required(self.end_time_mills, 'end_time_mills')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.start_time_mills is not None:
            result['start_time_mills'] = self.start_time_mills
        if self.end_time_mills is not None:
            result['end_time_mills'] = self.end_time_mills
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('start_time_mills') is not None:
            self.start_time_mills = m.get('start_time_mills')
        if m.get('end_time_mills') is not None:
            self.end_time_mills = m.get('end_time_mills')
        return self


class ListAntdigitalWebtrwatradeDistributorOperationlogResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[LoginOperationLogVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 回参
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
                temp_model = LoginOperationLogVO()
                self.data.append(temp_model.from_map(k))
        return self


class ListAntdigitalWebtrwatradeIssuerCrossaccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_project_id: str = None,
        asset_project_address: str = None,
        chain_name: str = None,
        user_id: str = None,
        user_address: str = None,
        login_name: str = None,
        login_account_type: str = None,
        cross_chain_user_address: str = None,
        start_time_mills: int = None,
        end_time_mills: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资产项目ID
        self.asset_project_id = asset_project_id
        # 资产项目合约地址
        self.asset_project_address = asset_project_address
        # 项目所在链
        self.chain_name = chain_name
        # 用户ID
        self.user_id = user_id
        # 本侧链用户地址
        self.user_address = user_address
        # 登录名
        self.login_name = login_name
        # 登录名类型(EMAIL)
        self.login_account_type = login_account_type
        # 对侧链用户地址
        self.cross_chain_user_address = cross_chain_user_address
        # 开始时间 (时间戳)
        self.start_time_mills = start_time_mills
        # 结束时间 (时间戳)
        self.end_time_mills = end_time_mills

    def validate(self):
        self.validate_required(self.start_time_mills, 'start_time_mills')
        self.validate_required(self.end_time_mills, 'end_time_mills')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_project_id is not None:
            result['asset_project_id'] = self.asset_project_id
        if self.asset_project_address is not None:
            result['asset_project_address'] = self.asset_project_address
        if self.chain_name is not None:
            result['chain_name'] = self.chain_name
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_address is not None:
            result['user_address'] = self.user_address
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.login_account_type is not None:
            result['login_account_type'] = self.login_account_type
        if self.cross_chain_user_address is not None:
            result['cross_chain_user_address'] = self.cross_chain_user_address
        if self.start_time_mills is not None:
            result['start_time_mills'] = self.start_time_mills
        if self.end_time_mills is not None:
            result['end_time_mills'] = self.end_time_mills
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_project_id') is not None:
            self.asset_project_id = m.get('asset_project_id')
        if m.get('asset_project_address') is not None:
            self.asset_project_address = m.get('asset_project_address')
        if m.get('chain_name') is not None:
            self.chain_name = m.get('chain_name')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_address') is not None:
            self.user_address = m.get('user_address')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('login_account_type') is not None:
            self.login_account_type = m.get('login_account_type')
        if m.get('cross_chain_user_address') is not None:
            self.cross_chain_user_address = m.get('cross_chain_user_address')
        if m.get('start_time_mills') is not None:
            self.start_time_mills = m.get('start_time_mills')
        if m.get('end_time_mills') is not None:
            self.end_time_mills = m.get('end_time_mills')
        return self


class ListAntdigitalWebtrwatradeIssuerCrossaccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[CrossAccountListVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 跨链账号明细
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
                temp_model = CrossAccountListVO()
                self.data.append(temp_model.from_map(k))
        return self


class ListAntdigitalWebtrwatradeDistributorCrossaccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_project_id: str = None,
        asset_project_address: str = None,
        chain_name: str = None,
        user_id: str = None,
        user_address: str = None,
        login_name: str = None,
        login_account_type: str = None,
        cross_chain_user_address: str = None,
        start_time_mills: int = None,
        end_time_mills: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资产项目ID
        self.asset_project_id = asset_project_id
        # 资产项目合约地址
        self.asset_project_address = asset_project_address
        # 项目所在链
        self.chain_name = chain_name
        # 用户ID
        self.user_id = user_id
        # 本侧链用户地址
        self.user_address = user_address
        # 登录名
        self.login_name = login_name
        # 登录名类型(EMAIL)
        self.login_account_type = login_account_type
        # 对侧链用户地址
        self.cross_chain_user_address = cross_chain_user_address
        # 开始时间 (时间戳)
        self.start_time_mills = start_time_mills
        # 结束时间 (时间戳)
        self.end_time_mills = end_time_mills

    def validate(self):
        self.validate_required(self.start_time_mills, 'start_time_mills')
        self.validate_required(self.end_time_mills, 'end_time_mills')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_project_id is not None:
            result['asset_project_id'] = self.asset_project_id
        if self.asset_project_address is not None:
            result['asset_project_address'] = self.asset_project_address
        if self.chain_name is not None:
            result['chain_name'] = self.chain_name
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_address is not None:
            result['user_address'] = self.user_address
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.login_account_type is not None:
            result['login_account_type'] = self.login_account_type
        if self.cross_chain_user_address is not None:
            result['cross_chain_user_address'] = self.cross_chain_user_address
        if self.start_time_mills is not None:
            result['start_time_mills'] = self.start_time_mills
        if self.end_time_mills is not None:
            result['end_time_mills'] = self.end_time_mills
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_project_id') is not None:
            self.asset_project_id = m.get('asset_project_id')
        if m.get('asset_project_address') is not None:
            self.asset_project_address = m.get('asset_project_address')
        if m.get('chain_name') is not None:
            self.chain_name = m.get('chain_name')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_address') is not None:
            self.user_address = m.get('user_address')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('login_account_type') is not None:
            self.login_account_type = m.get('login_account_type')
        if m.get('cross_chain_user_address') is not None:
            self.cross_chain_user_address = m.get('cross_chain_user_address')
        if m.get('start_time_mills') is not None:
            self.start_time_mills = m.get('start_time_mills')
        if m.get('end_time_mills') is not None:
            self.end_time_mills = m.get('end_time_mills')
        return self


class ListAntdigitalWebtrwatradeDistributorCrossaccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[CrossAccountListVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 跨链账号明细
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
                temp_model = CrossAccountListVO()
                self.data.append(temp_model.from_map(k))
        return self


class DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_project_id: str = None,
        asset_project_address: str = None,
        chain_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目id，项目资产ID和
        # 项目合约地址+所在链组合 二选一
        self.asset_project_id = asset_project_id
        # 资产项目合约地址，项目资产ID和
        # 项目合约地址+所在链组合 二选一
        self.asset_project_address = asset_project_address
        # 所在链，项目资产ID和
        # 项目合约地址+所在链组合 二选一
        self.chain_name = chain_name

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
        if self.asset_project_id is not None:
            result['asset_project_id'] = self.asset_project_id
        if self.asset_project_address is not None:
            result['asset_project_address'] = self.asset_project_address
        if self.chain_name is not None:
            result['chain_name'] = self.chain_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_project_id') is not None:
            self.asset_project_id = m.get('asset_project_id')
        if m.get('asset_project_address') is not None:
            self.asset_project_address = m.get('asset_project_address')
        if m.get('chain_name') is not None:
            self.chain_name = m.get('chain_name')
        return self


class DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ProjectWithRole = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 项目角色信息
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

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
            temp_model = ProjectWithRole()
            self.data = temp_model.from_map(m['data'])
        return self


