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


class ProcessNode(TeaModel):
    def __init__(
        self,
        node_id: str = None,
        node_name: str = None,
        node_num: int = None,
    ):
        # 审批节点ID
        self.node_id = node_id
        # 节点名称
        self.node_name = node_name
        # 节点序号，从1开始编号
        self.node_num = node_num

    def validate(self):
        self.validate_required(self.node_id, 'node_id')
        if self.node_id is not None:
            self.validate_max_length(self.node_id, 'node_id', 100)
        self.validate_required(self.node_name, 'node_name')
        if self.node_name is not None:
            self.validate_max_length(self.node_name, 'node_name', 64)
        self.validate_required(self.node_num, 'node_num')
        if self.node_num is not None:
            self.validate_minimum(self.node_num, 'node_num', 1)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.node_name is not None:
            result['node_name'] = self.node_name
        if self.node_num is not None:
            result['node_num'] = self.node_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('node_name') is not None:
            self.node_name = m.get('node_name')
        if m.get('node_num') is not None:
            self.node_num = m.get('node_num')
        return self


class BlockchainBrowserTransactionContract(TeaModel):
    def __init__(
        self,
        data: str = None,
        from_: str = None,
        to: str = None,
        gas: int = None,
        hash: str = None,
        nonce: str = None,
        period: int = None,
        signature_list: List[str] = None,
        timestamp: int = None,
        transaction_type: str = None,
        value: int = None,
    ):
        # data
        self.data = data
        # from
        self.from_ = from_
        # to
        self.to = to
        # gas
        self.gas = gas
        # hash
        self.hash = hash
        # nonce
        self.nonce = nonce
        # period
        self.period = period
        # signature_list
        self.signature_list = signature_list
        # timestamp
        self.timestamp = timestamp
        # transaction_type
        self.transaction_type = transaction_type
        # value
        self.value = value

    def validate(self):
        self.validate_required(self.data, 'data')
        self.validate_required(self.from_, 'from_')
        self.validate_required(self.to, 'to')
        self.validate_required(self.gas, 'gas')
        self.validate_required(self.hash, 'hash')
        self.validate_required(self.nonce, 'nonce')
        self.validate_required(self.period, 'period')
        self.validate_required(self.signature_list, 'signature_list')
        self.validate_required(self.timestamp, 'timestamp')
        self.validate_required(self.transaction_type, 'transaction_type')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.data is not None:
            result['data'] = self.data
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        if self.gas is not None:
            result['gas'] = self.gas
        if self.hash is not None:
            result['hash'] = self.hash
        if self.nonce is not None:
            result['nonce'] = self.nonce
        if self.period is not None:
            result['period'] = self.period
        if self.signature_list is not None:
            result['signature_list'] = self.signature_list
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.transaction_type is not None:
            result['transaction_type'] = self.transaction_type
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('gas') is not None:
            self.gas = m.get('gas')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        if m.get('period') is not None:
            self.period = m.get('period')
        if m.get('signature_list') is not None:
            self.signature_list = m.get('signature_list')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('transaction_type') is not None:
            self.transaction_type = m.get('transaction_type')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class PositionStructBody(TeaModel):
    def __init__(
        self,
        error_count: str = None,
        height: str = None,
        index: str = None,
        last_error: str = None,
        type: str = None,
    ):
        # 错误计数
        self.error_count = error_count
        # 高度
        self.height = height
        # 序号
        self.index = index
        # 最后一个错误
        self.last_error = last_error
        # 类型
        self.type = type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.error_count is not None:
            result['error_count'] = self.error_count
        if self.height is not None:
            result['height'] = self.height
        if self.index is not None:
            result['index'] = self.index
        if self.last_error is not None:
            result['last_error'] = self.last_error
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('error_count') is not None:
            self.error_count = m.get('error_count')
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('index') is not None:
            self.index = m.get('index')
        if m.get('last_error') is not None:
            self.last_error = m.get('last_error')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class Participant(TeaModel):
    def __init__(
        self,
        biz_uid: str = None,
        blockchain_id: str = None,
        create_time: int = None,
        credit_number: str = None,
        extension_info: str = None,
        name: str = None,
        notification_service: str = None,
        participant_id: str = None,
        public_info: str = None,
        role: List[str] = None,
        space_id: str = None,
        status: str = None,
        update_time: int = None,
        account: str = None,
    ):
        # 业务系统唯一标示
        self.biz_uid = biz_uid
        # 区块链ID
        self.blockchain_id = blockchain_id
        # 创建时间
        self.create_time = create_time
        # 信用代码
        self.credit_number = credit_number
        # 扩展信息，标准JSON格式
        self.extension_info = extension_info
        # 参与方名字
        self.name = name
        # 回调通知服务地址
        self.notification_service = notification_service
        # 参与方ID
        self.participant_id = participant_id
        # DID  doc中的公开信息
        self.public_info = public_info
        # 参与方角色列表
        self.role = role
        # 空间ID
        self.space_id = space_id
        # 参与方状态
        self.status = status
        # 更新时间
        self.update_time = update_time
        # 账户名称
        self.account = account

    def validate(self):
        if self.biz_uid is not None:
            self.validate_max_length(self.biz_uid, 'biz_uid', 64)
        self.validate_required(self.create_time, 'create_time')
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 64)
        self.validate_required(self.participant_id, 'participant_id')
        if self.participant_id is not None:
            self.validate_max_length(self.participant_id, 'participant_id', 100)
        self.validate_required(self.role, 'role')
        self.validate_required(self.update_time, 'update_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_uid is not None:
            result['biz_uid'] = self.biz_uid
        if self.blockchain_id is not None:
            result['blockchain_id'] = self.blockchain_id
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.credit_number is not None:
            result['credit_number'] = self.credit_number
        if self.extension_info is not None:
            result['extension_info'] = self.extension_info
        if self.name is not None:
            result['name'] = self.name
        if self.notification_service is not None:
            result['notification_service'] = self.notification_service
        if self.participant_id is not None:
            result['participant_id'] = self.participant_id
        if self.public_info is not None:
            result['public_info'] = self.public_info
        if self.role is not None:
            result['role'] = self.role
        if self.space_id is not None:
            result['space_id'] = self.space_id
        if self.status is not None:
            result['status'] = self.status
        if self.update_time is not None:
            result['update_time'] = self.update_time
        if self.account is not None:
            result['account'] = self.account
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_uid') is not None:
            self.biz_uid = m.get('biz_uid')
        if m.get('blockchain_id') is not None:
            self.blockchain_id = m.get('blockchain_id')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('credit_number') is not None:
            self.credit_number = m.get('credit_number')
        if m.get('extension_info') is not None:
            self.extension_info = m.get('extension_info')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('notification_service') is not None:
            self.notification_service = m.get('notification_service')
        if m.get('participant_id') is not None:
            self.participant_id = m.get('participant_id')
        if m.get('public_info') is not None:
            self.public_info = m.get('public_info')
        if m.get('role') is not None:
            self.role = m.get('role')
        if m.get('space_id') is not None:
            self.space_id = m.get('space_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        if m.get('account') is not None:
            self.account = m.get('account')
        return self


class ContractBindResp(TeaModel):
    def __init__(
        self,
        service_id: str = None,
        name: str = None,
        bind: bool = None,
    ):
        # 合约标识
        self.service_id = service_id
        # 合约名称
        self.name = name
        # 是否已关联
        self.bind = bind

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.name is not None:
            result['name'] = self.name
        if self.bind is not None:
            result['bind'] = self.bind
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('bind') is not None:
            self.bind = m.get('bind')
        return self


class CrowdNodeTypeEnum(TeaModel):
    def __init__(
        self,
        group: str = None,
        condition: str = None,
    ):
        # 组合节点
        self.group = group
        # 条件节点
        self.condition = condition

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.group is not None:
            result['group'] = self.group
        if self.condition is not None:
            result['condition'] = self.condition
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('group') is not None:
            self.group = m.get('group')
        if m.get('condition') is not None:
            self.condition = m.get('condition')
        return self


class TaskListInfoDTO(TeaModel):
    def __init__(
        self,
        task_name: str = None,
        task_id: str = None,
        app_id: str = None,
        survey_id: str = None,
        tenant_id: str = None,
        tenant_name: str = None,
        operator: str = None,
        sample_num: int = None,
        completed_num: int = None,
        screen_num: int = None,
        sample_total_amount: str = None,
        red_packet_total_amount: str = None,
        task_total_amount: str = None,
        full_red_packet_amount: str = None,
        examine_red_packet_amount: str = None,
        issued_num: int = None,
        product_code_type: str = None,
        review_content: str = None,
        status: str = None,
        ap_status: str = None,
        prize_channel: int = None,
        full_red_packet_text_info: str = None,
        gmt_modified: str = None,
        gmt_create: str = None,
        gmt_online: str = None,
        gmt_pause_or_complete: str = None,
        last_round_time: int = None,
    ):
        # 任务名称
        self.task_name = task_name
        # 任务ID
        self.task_id = task_id
        # appId
        self.app_id = app_id
        # 自有ID
        self.survey_id = survey_id
        # 租户ID
        self.tenant_id = tenant_id
        # 租户名称
        self.tenant_name = tenant_name
        # 操作员
        self.operator = operator
        # 样本数量
        self.sample_num = sample_num
        # 完成数量
        self.completed_num = completed_num
        # 甄别数量
        self.screen_num = screen_num
        # 样本总金额
        self.sample_total_amount = sample_total_amount
        # 全额红包总金额
        self.red_packet_total_amount = red_packet_total_amount
        # 该任务总金额
        self.task_total_amount = task_total_amount
        # 全额红包金额
        self.full_red_packet_amount = full_red_packet_amount
        # 甄别红包金额
        self.examine_red_packet_amount = examine_red_packet_amount
        # 发证量
        self.issued_num = issued_num
        # 产品下单code类型（1-资源包 2-后付费）
        self.product_code_type = product_code_type
        # 审核理由
        self.review_content = review_content
        # 任务状态：0-已删、1-已完成、2-审核未通过、3-暂停、4-投放中、5-暂停中未重启、6、投放中未暂停、7-投放中未调整、8-投放中未完成、9-待投放、10-草稿任务
        self.status = status
        # ap状态，1:启用，0：审批中
        self.ap_status = ap_status
        # 奖励渠道（0-手动发支付宝余额 1-海豚红包 2-问卷自带）
        self.prize_channel = prize_channel
        # 奖励渠道为问卷自带时，全额红包信息
        self.full_red_packet_text_info = full_red_packet_text_info
        # 修改时间
        self.gmt_modified = gmt_modified
        # 创建时间
        self.gmt_create = gmt_create
        # 投放时间
        self.gmt_online = gmt_online
        # 最近暂停/完成时间
        self.gmt_pause_or_complete = gmt_pause_or_complete
        # 最近一轮用时（h）
        self.last_round_time = last_round_time

    def validate(self):
        self.validate_required(self.task_name, 'task_name')
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.survey_id, 'survey_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.tenant_name, 'tenant_name')
        self.validate_required(self.operator, 'operator')
        self.validate_required(self.sample_num, 'sample_num')
        self.validate_required(self.completed_num, 'completed_num')
        self.validate_required(self.screen_num, 'screen_num')
        self.validate_required(self.sample_total_amount, 'sample_total_amount')
        self.validate_required(self.red_packet_total_amount, 'red_packet_total_amount')
        self.validate_required(self.task_total_amount, 'task_total_amount')
        self.validate_required(self.full_red_packet_amount, 'full_red_packet_amount')
        self.validate_required(self.examine_red_packet_amount, 'examine_red_packet_amount')
        self.validate_required(self.product_code_type, 'product_code_type')
        self.validate_required(self.status, 'status')
        self.validate_required(self.ap_status, 'ap_status')
        self.validate_required(self.prize_channel, 'prize_channel')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        self.validate_required(self.gmt_create, 'gmt_create')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.task_name is not None:
            result['task_name'] = self.task_name
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.survey_id is not None:
            result['survey_id'] = self.survey_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.operator is not None:
            result['operator'] = self.operator
        if self.sample_num is not None:
            result['sample_num'] = self.sample_num
        if self.completed_num is not None:
            result['completed_num'] = self.completed_num
        if self.screen_num is not None:
            result['screen_num'] = self.screen_num
        if self.sample_total_amount is not None:
            result['sample_total_amount'] = self.sample_total_amount
        if self.red_packet_total_amount is not None:
            result['red_packet_total_amount'] = self.red_packet_total_amount
        if self.task_total_amount is not None:
            result['task_total_amount'] = self.task_total_amount
        if self.full_red_packet_amount is not None:
            result['full_red_packet_amount'] = self.full_red_packet_amount
        if self.examine_red_packet_amount is not None:
            result['examine_red_packet_amount'] = self.examine_red_packet_amount
        if self.issued_num is not None:
            result['issued_num'] = self.issued_num
        if self.product_code_type is not None:
            result['product_code_type'] = self.product_code_type
        if self.review_content is not None:
            result['review_content'] = self.review_content
        if self.status is not None:
            result['status'] = self.status
        if self.ap_status is not None:
            result['ap_status'] = self.ap_status
        if self.prize_channel is not None:
            result['prize_channel'] = self.prize_channel
        if self.full_red_packet_text_info is not None:
            result['full_red_packet_text_info'] = self.full_red_packet_text_info
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_online is not None:
            result['gmt_online'] = self.gmt_online
        if self.gmt_pause_or_complete is not None:
            result['gmt_pause_or_complete'] = self.gmt_pause_or_complete
        if self.last_round_time is not None:
            result['last_round_time'] = self.last_round_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('task_name') is not None:
            self.task_name = m.get('task_name')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('survey_id') is not None:
            self.survey_id = m.get('survey_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('sample_num') is not None:
            self.sample_num = m.get('sample_num')
        if m.get('completed_num') is not None:
            self.completed_num = m.get('completed_num')
        if m.get('screen_num') is not None:
            self.screen_num = m.get('screen_num')
        if m.get('sample_total_amount') is not None:
            self.sample_total_amount = m.get('sample_total_amount')
        if m.get('red_packet_total_amount') is not None:
            self.red_packet_total_amount = m.get('red_packet_total_amount')
        if m.get('task_total_amount') is not None:
            self.task_total_amount = m.get('task_total_amount')
        if m.get('full_red_packet_amount') is not None:
            self.full_red_packet_amount = m.get('full_red_packet_amount')
        if m.get('examine_red_packet_amount') is not None:
            self.examine_red_packet_amount = m.get('examine_red_packet_amount')
        if m.get('issued_num') is not None:
            self.issued_num = m.get('issued_num')
        if m.get('product_code_type') is not None:
            self.product_code_type = m.get('product_code_type')
        if m.get('review_content') is not None:
            self.review_content = m.get('review_content')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('ap_status') is not None:
            self.ap_status = m.get('ap_status')
        if m.get('prize_channel') is not None:
            self.prize_channel = m.get('prize_channel')
        if m.get('full_red_packet_text_info') is not None:
            self.full_red_packet_text_info = m.get('full_red_packet_text_info')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_online') is not None:
            self.gmt_online = m.get('gmt_online')
        if m.get('gmt_pause_or_complete') is not None:
            self.gmt_pause_or_complete = m.get('gmt_pause_or_complete')
        if m.get('last_round_time') is not None:
            self.last_round_time = m.get('last_round_time')
        return self


class ALiYunMember(TeaModel):
    def __init__(
        self,
        join_time: int = None,
        member_id: str = None,
        member_name: str = None,
        role: str = None,
        status: str = None,
    ):
        # 加入时间
        self.join_time = join_time
        # 成员id
        self.member_id = member_id
        # 成员名称
        self.member_name = member_name
        # 角色
        self.role = role
        # 状态
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.join_time is not None:
            result['join_time'] = self.join_time
        if self.member_id is not None:
            result['member_id'] = self.member_id
        if self.member_name is not None:
            result['member_name'] = self.member_name
        if self.role is not None:
            result['role'] = self.role
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('join_time') is not None:
            self.join_time = m.get('join_time')
        if m.get('member_id') is not None:
            self.member_id = m.get('member_id')
        if m.get('member_name') is not None:
            self.member_name = m.get('member_name')
        if m.get('role') is not None:
            self.role = m.get('role')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class DisplayInfo(TeaModel):
    def __init__(
        self,
        benefit_name: str = None,
        show_amount_text: str = None,
        threshold_amount_text: str = None,
        benefit_usage_desc: str = None,
        benefit_rule_desc: str = None,
    ):
        # 权益名称
        self.benefit_name = benefit_name
        # 展示金额文案
        self.show_amount_text = show_amount_text
        # 门槛金额文案
        self.threshold_amount_text = threshold_amount_text
        # 使用说明
        self.benefit_usage_desc = benefit_usage_desc
        # 规则描述
        self.benefit_rule_desc = benefit_rule_desc

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.benefit_name is not None:
            result['benefit_name'] = self.benefit_name
        if self.show_amount_text is not None:
            result['show_amount_text'] = self.show_amount_text
        if self.threshold_amount_text is not None:
            result['threshold_amount_text'] = self.threshold_amount_text
        if self.benefit_usage_desc is not None:
            result['benefit_usage_desc'] = self.benefit_usage_desc
        if self.benefit_rule_desc is not None:
            result['benefit_rule_desc'] = self.benefit_rule_desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('benefit_name') is not None:
            self.benefit_name = m.get('benefit_name')
        if m.get('show_amount_text') is not None:
            self.show_amount_text = m.get('show_amount_text')
        if m.get('threshold_amount_text') is not None:
            self.threshold_amount_text = m.get('threshold_amount_text')
        if m.get('benefit_usage_desc') is not None:
            self.benefit_usage_desc = m.get('benefit_usage_desc')
        if m.get('benefit_rule_desc') is not None:
            self.benefit_rule_desc = m.get('benefit_rule_desc')
        return self


class ApplicationPageListResp(TeaModel):
    def __init__(
        self,
        application_id: str = None,
        access_key: str = None,
        name_list: List[str] = None,
    ):
        # 应用标识
        self.application_id = application_id
        # 链ID
        self.access_key = access_key
        # 合约(创建实例时填写的合约名称。)
        self.name_list = name_list

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.application_id is not None:
            result['application_id'] = self.application_id
        if self.access_key is not None:
            result['access_key'] = self.access_key
        if self.name_list is not None:
            result['name_list'] = self.name_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('application_id') is not None:
            self.application_id = m.get('application_id')
        if m.get('access_key') is not None:
            self.access_key = m.get('access_key')
        if m.get('name_list') is not None:
            self.name_list = m.get('name_list')
        return self


class InstanceProgressInfo(TeaModel):
    def __init__(
        self,
        operator: str = None,
        time: int = None,
        type: str = None,
        status: str = None,
        type_name: str = None,
        data: str = None,
    ):
        # 操作人
        self.operator = operator
        # 操作时间
        self.time = time
        # 合约部署进度类型
        self.type = type
        # 部署状态
        self.status = status
        # 合约部署进度名称
        self.type_name = type_name
        # 额外参数
        self.data = data

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.operator is not None:
            result['operator'] = self.operator
        if self.time is not None:
            result['time'] = self.time
        if self.type is not None:
            result['type'] = self.type
        if self.status is not None:
            result['status'] = self.status
        if self.type_name is not None:
            result['type_name'] = self.type_name
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('time') is not None:
            self.time = m.get('time')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('type_name') is not None:
            self.type_name = m.get('type_name')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class DataModel(TeaModel):
    def __init__(
        self,
        biz_uid: str = None,
        space_id: str = None,
        create_time: int = None,
        description: str = None,
        field_detail: str = None,
        model_biz_id: str = None,
        model_id: str = None,
        name: str = None,
        submitter: Participant = None,
        update_time: int = None,
        status: str = None,
    ):
        # 业务系统唯一标示
        self.biz_uid = biz_uid
        # 空间ID
        self.space_id = space_id
        # 创建时间
        self.create_time = create_time
        # 数据模型描述
        self.description = description
        # 模型字段详细信息
        self.field_detail = field_detail
        # 数据模型业务ID
        self.model_biz_id = model_biz_id
        # 数据模型ID
        self.model_id = model_id
        # 数据模型名称
        self.name = name
        # 提交人
        self.submitter = submitter
        # 更新时间
        self.update_time = update_time
        # 状态
        self.status = status

    def validate(self):
        self.validate_required(self.space_id, 'space_id')
        self.validate_required(self.create_time, 'create_time')
        self.validate_required(self.field_detail, 'field_detail')
        self.validate_required(self.model_id, 'model_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.submitter, 'submitter')
        if self.submitter:
            self.submitter.validate()
        self.validate_required(self.update_time, 'update_time')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_uid is not None:
            result['biz_uid'] = self.biz_uid
        if self.space_id is not None:
            result['space_id'] = self.space_id
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.description is not None:
            result['description'] = self.description
        if self.field_detail is not None:
            result['field_detail'] = self.field_detail
        if self.model_biz_id is not None:
            result['model_biz_id'] = self.model_biz_id
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.name is not None:
            result['name'] = self.name
        if self.submitter is not None:
            result['submitter'] = self.submitter.to_map()
        if self.update_time is not None:
            result['update_time'] = self.update_time
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_uid') is not None:
            self.biz_uid = m.get('biz_uid')
        if m.get('space_id') is not None:
            self.space_id = m.get('space_id')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('field_detail') is not None:
            self.field_detail = m.get('field_detail')
        if m.get('model_biz_id') is not None:
            self.model_biz_id = m.get('model_biz_id')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('submitter') is not None:
            temp_model = Participant()
            self.submitter = temp_model.from_map(m['submitter'])
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class NodeDetail(TeaModel):
    def __init__(
        self,
        comment: str = None,
        node_id: str = None,
        node_name: str = None,
        node_status: str = None,
        operate_time: int = None,
        extension_info: str = None,
    ):
        # 节点审批意见
        self.comment = comment
        # 节点ID
        self.node_id = node_id
        # 节点名称
        self.node_name = node_name
        # 节点状态
        self.node_status = node_status
        # 节点审批时间
        self.operate_time = operate_time
        # 扩展参数
        self.extension_info = extension_info

    def validate(self):
        self.validate_required(self.comment, 'comment')
        self.validate_required(self.node_id, 'node_id')
        self.validate_required(self.node_name, 'node_name')
        self.validate_required(self.node_status, 'node_status')
        self.validate_required(self.operate_time, 'operate_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.comment is not None:
            result['comment'] = self.comment
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.node_name is not None:
            result['node_name'] = self.node_name
        if self.node_status is not None:
            result['node_status'] = self.node_status
        if self.operate_time is not None:
            result['operate_time'] = self.operate_time
        if self.extension_info is not None:
            result['extension_info'] = self.extension_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('comment') is not None:
            self.comment = m.get('comment')
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('node_name') is not None:
            self.node_name = m.get('node_name')
        if m.get('node_status') is not None:
            self.node_status = m.get('node_status')
        if m.get('operate_time') is not None:
            self.operate_time = m.get('operate_time')
        if m.get('extension_info') is not None:
            self.extension_info = m.get('extension_info')
        return self


class ContractIdeConfig(TeaModel):
    def __init__(
        self,
        account_name: str = None,
        bizid: str = None,
        chain_name: str = None,
        host: str = None,
        is_wasm: bool = None,
        port: str = None,
        private_key: str = None,
        rsa_public_key: str = None,
        version: str = None,
    ):
        # 合约链的一个已创建的测试账户
        self.account_name = account_name
        # 区块链唯一标识
        self.bizid = bizid
        # 合约链的名字
        self.chain_name = chain_name
        # 目标合约链的host地址
        self.host = host
        # 说明是否开启wasm合约功能
        self.is_wasm = is_wasm
        # 目标合约链服务公开的端口号
        self.port = port
        # 合约链已创建的测试账户的密钥
        self.private_key = private_key
        # 如果是TEE硬件隐私合约链，会包含此字段内容
        self.rsa_public_key = rsa_public_key
        # 合约链的版本说明
        self.version = version

    def validate(self):
        self.validate_required(self.account_name, 'account_name')
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.chain_name, 'chain_name')
        self.validate_required(self.host, 'host')
        self.validate_required(self.port, 'port')
        self.validate_required(self.private_key, 'private_key')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.account_name is not None:
            result['account_name'] = self.account_name
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.chain_name is not None:
            result['chain_name'] = self.chain_name
        if self.host is not None:
            result['host'] = self.host
        if self.is_wasm is not None:
            result['is_wasm'] = self.is_wasm
        if self.port is not None:
            result['port'] = self.port
        if self.private_key is not None:
            result['private_key'] = self.private_key
        if self.rsa_public_key is not None:
            result['rsa_public_key'] = self.rsa_public_key
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('account_name') is not None:
            self.account_name = m.get('account_name')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('chain_name') is not None:
            self.chain_name = m.get('chain_name')
        if m.get('host') is not None:
            self.host = m.get('host')
        if m.get('is_wasm') is not None:
            self.is_wasm = m.get('is_wasm')
        if m.get('port') is not None:
            self.port = m.get('port')
        if m.get('private_key') is not None:
            self.private_key = m.get('private_key')
        if m.get('rsa_public_key') is not None:
            self.rsa_public_key = m.get('rsa_public_key')
        if m.get('version') is not None:
            self.version = m.get('version')
        return self


class KeyValuePair(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: str = None,
    ):
        # 键名
        self.key = key
        # 值
        self.value = value

    def validate(self):
        self.validate_required(self.key, 'key')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

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


class TriggerLogDTOStructBody(TeaModel):
    def __init__(
        self,
        create_time: str = None,
        modify_time: str = None,
        status: str = None,
        uuid: str = None,
        position: PositionStructBody = None,
    ):
        # 创建时间
        self.create_time = create_time
        # 修改时间
        self.modify_time = modify_time
        # 状态
        self.status = status
        # uuid
        self.uuid = uuid
        # 位置
        self.position = position

    def validate(self):
        if self.position:
            self.position.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.modify_time is not None:
            result['modify_time'] = self.modify_time
        if self.status is not None:
            result['status'] = self.status
        if self.uuid is not None:
            result['uuid'] = self.uuid
        if self.position is not None:
            result['position'] = self.position.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('modify_time') is not None:
            self.modify_time = m.get('modify_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('uuid') is not None:
            self.uuid = m.get('uuid')
        if m.get('position') is not None:
            temp_model = PositionStructBody()
            self.position = temp_model.from_map(m['position'])
        return self


class ContractTypeListResp(TeaModel):
    def __init__(
        self,
        name: str = None,
        value: str = None,
    ):
        # 名称
        self.name = name
        # 值
        self.value = value

    def validate(self):
        pass

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


class BlockchainBrowserTransaction(TeaModel):
    def __init__(
        self,
        bizid: str = None,
        block_hash: str = None,
        category: int = None,
        create_time: int = None,
        from_: str = None,
        gas_used: int = None,
        hash: str = None,
        height: int = None,
        reference_count: int = None,
        to: str = None,
        transaction_type: str = None,
        block_version: int = None,
        blockchain_name: str = None,
        blockchain_status: bool = None,
        content: str = None,
        hash_status: bool = None,
        type: int = None,
        transaction_contract: BlockchainBrowserTransactionContract = None,
    ):
        # bizid
        self.bizid = bizid
        # block_hash
        self.block_hash = block_hash
        # category
        self.category = category
        # create_time
        self.create_time = create_time
        # from
        self.from_ = from_
        # gas_used
        self.gas_used = gas_used
        # hash
        self.hash = hash
        # height
        self.height = height
        # reference_count
        self.reference_count = reference_count
        # to
        self.to = to
        # transaction_type
        self.transaction_type = transaction_type
        # block_version
        self.block_version = block_version
        # blockchain_name
        self.blockchain_name = blockchain_name
        # blockchain_status
        self.blockchain_status = blockchain_status
        # content
        self.content = content
        # hash_status
        self.hash_status = hash_status
        # type
        self.type = type
        # transaction_contract
        self.transaction_contract = transaction_contract

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.block_hash, 'block_hash')
        self.validate_required(self.category, 'category')
        self.validate_required(self.create_time, 'create_time')
        self.validate_required(self.from_, 'from_')
        self.validate_required(self.gas_used, 'gas_used')
        self.validate_required(self.hash, 'hash')
        self.validate_required(self.height, 'height')
        self.validate_required(self.reference_count, 'reference_count')
        self.validate_required(self.to, 'to')
        self.validate_required(self.transaction_type, 'transaction_type')
        self.validate_required(self.block_version, 'block_version')
        self.validate_required(self.blockchain_name, 'blockchain_name')
        self.validate_required(self.blockchain_status, 'blockchain_status')
        self.validate_required(self.content, 'content')
        self.validate_required(self.hash_status, 'hash_status')
        self.validate_required(self.type, 'type')
        self.validate_required(self.transaction_contract, 'transaction_contract')
        if self.transaction_contract:
            self.transaction_contract.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.block_hash is not None:
            result['block_hash'] = self.block_hash
        if self.category is not None:
            result['category'] = self.category
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.from_ is not None:
            result['from'] = self.from_
        if self.gas_used is not None:
            result['gas_used'] = self.gas_used
        if self.hash is not None:
            result['hash'] = self.hash
        if self.height is not None:
            result['height'] = self.height
        if self.reference_count is not None:
            result['reference_count'] = self.reference_count
        if self.to is not None:
            result['to'] = self.to
        if self.transaction_type is not None:
            result['transaction_type'] = self.transaction_type
        if self.block_version is not None:
            result['block_version'] = self.block_version
        if self.blockchain_name is not None:
            result['blockchain_name'] = self.blockchain_name
        if self.blockchain_status is not None:
            result['blockchain_status'] = self.blockchain_status
        if self.content is not None:
            result['content'] = self.content
        if self.hash_status is not None:
            result['hash_status'] = self.hash_status
        if self.type is not None:
            result['type'] = self.type
        if self.transaction_contract is not None:
            result['transaction_contract'] = self.transaction_contract.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('block_hash') is not None:
            self.block_hash = m.get('block_hash')
        if m.get('category') is not None:
            self.category = m.get('category')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('gas_used') is not None:
            self.gas_used = m.get('gas_used')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('reference_count') is not None:
            self.reference_count = m.get('reference_count')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('transaction_type') is not None:
            self.transaction_type = m.get('transaction_type')
        if m.get('block_version') is not None:
            self.block_version = m.get('block_version')
        if m.get('blockchain_name') is not None:
            self.blockchain_name = m.get('blockchain_name')
        if m.get('blockchain_status') is not None:
            self.blockchain_status = m.get('blockchain_status')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('hash_status') is not None:
            self.hash_status = m.get('hash_status')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('transaction_contract') is not None:
            temp_model = BlockchainBrowserTransactionContract()
            self.transaction_contract = temp_model.from_map(m['transaction_contract'])
        return self


class SettleDetailInfo(TeaModel):
    def __init__(
        self,
        trans_in_type: str = None,
        trans_in: str = None,
        summary_dimension: str = None,
        settle_entity_type: str = None,
        settle_entity_id: str = None,
    ):
        # 结算收款方账户类型
        self.trans_in_type = trans_in_type
        # 结算收款方
        self.trans_in = trans_in
        # 结算汇总维度
        self.summary_dimension = summary_dimension
        # 结算主体类型
        self.settle_entity_type = settle_entity_type
        # 结算主体标识
        self.settle_entity_id = settle_entity_id

    def validate(self):
        self.validate_required(self.trans_in_type, 'trans_in_type')
        self.validate_required(self.trans_in, 'trans_in')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.trans_in_type is not None:
            result['trans_in_type'] = self.trans_in_type
        if self.trans_in is not None:
            result['trans_in'] = self.trans_in
        if self.summary_dimension is not None:
            result['summary_dimension'] = self.summary_dimension
        if self.settle_entity_type is not None:
            result['settle_entity_type'] = self.settle_entity_type
        if self.settle_entity_id is not None:
            result['settle_entity_id'] = self.settle_entity_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('trans_in_type') is not None:
            self.trans_in_type = m.get('trans_in_type')
        if m.get('trans_in') is not None:
            self.trans_in = m.get('trans_in')
        if m.get('summary_dimension') is not None:
            self.summary_dimension = m.get('summary_dimension')
        if m.get('settle_entity_type') is not None:
            self.settle_entity_type = m.get('settle_entity_type')
        if m.get('settle_entity_id') is not None:
            self.settle_entity_id = m.get('settle_entity_id')
        return self


class ALiYunDownloadPath(TeaModel):
    def __init__(
        self,
        client_crt_url: str = None,
        trust_ca_url: str = None,
        ca_crt_url: str = None,
        sdk_url: str = None,
    ):
        # client_crt_url
        self.client_crt_url = client_crt_url
        # trust_ca_url
        self.trust_ca_url = trust_ca_url
        # ca_crt_url
        self.ca_crt_url = ca_crt_url
        # sdk_url
        self.sdk_url = sdk_url

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.client_crt_url is not None:
            result['client_crt_url'] = self.client_crt_url
        if self.trust_ca_url is not None:
            result['trust_ca_url'] = self.trust_ca_url
        if self.ca_crt_url is not None:
            result['ca_crt_url'] = self.ca_crt_url
        if self.sdk_url is not None:
            result['sdk_url'] = self.sdk_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('client_crt_url') is not None:
            self.client_crt_url = m.get('client_crt_url')
        if m.get('trust_ca_url') is not None:
            self.trust_ca_url = m.get('trust_ca_url')
        if m.get('ca_crt_url') is not None:
            self.ca_crt_url = m.get('ca_crt_url')
        if m.get('sdk_url') is not None:
            self.sdk_url = m.get('sdk_url')
        return self


class ALiYunChainSubnet(TeaModel):
    def __init__(
        self,
        ant_chain_id: str = None,
        name: str = None,
        node_sum: int = None,
        monitor: bool = None,
        block_height: str = None,
        transaction_sum: int = None,
        create_time: int = None,
        status: str = None,
        consortium_member: bool = None,
        main_chain_id: str = None,
        rest: str = None,
        group_id: str = None,
    ):
        # 子链id
        self.ant_chain_id = ant_chain_id
        # 子链名称
        self.name = name
        # 子链节点数
        self.node_sum = node_sum
        # 子链监控状态
        self.monitor = monitor
        # 子链的块高
        self.block_height = block_height
        # 子链的业务总数
        self.transaction_sum = transaction_sum
        # 子链的创建时间
        self.create_time = create_time
        # 子链的状态
        self.status = status
        # 子链的权限
        self.consortium_member = consortium_member
        # 主链id
        self.main_chain_id = main_chain_id
        # rest申请状态
        self.rest = rest
        # 子链序号
        self.group_id = group_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.name is not None:
            result['name'] = self.name
        if self.node_sum is not None:
            result['node_sum'] = self.node_sum
        if self.monitor is not None:
            result['monitor'] = self.monitor
        if self.block_height is not None:
            result['block_height'] = self.block_height
        if self.transaction_sum is not None:
            result['transaction_sum'] = self.transaction_sum
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.status is not None:
            result['status'] = self.status
        if self.consortium_member is not None:
            result['consortium_member'] = self.consortium_member
        if self.main_chain_id is not None:
            result['main_chain_id'] = self.main_chain_id
        if self.rest is not None:
            result['rest'] = self.rest
        if self.group_id is not None:
            result['group_id'] = self.group_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('node_sum') is not None:
            self.node_sum = m.get('node_sum')
        if m.get('monitor') is not None:
            self.monitor = m.get('monitor')
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        if m.get('transaction_sum') is not None:
            self.transaction_sum = m.get('transaction_sum')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('consortium_member') is not None:
            self.consortium_member = m.get('consortium_member')
        if m.get('main_chain_id') is not None:
            self.main_chain_id = m.get('main_chain_id')
        if m.get('rest') is not None:
            self.rest = m.get('rest')
        if m.get('group_id') is not None:
            self.group_id = m.get('group_id')
        return self


class DidServiceInfo(TeaModel):
    def __init__(
        self,
        end_point: str = None,
        extension_info: str = None,
    ):
        # 服务的end point info
        self.end_point = end_point
        # 扩展字段信息
        self.extension_info = extension_info

    def validate(self):
        self.validate_required(self.end_point, 'end_point')
        self.validate_required(self.extension_info, 'extension_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.end_point is not None:
            result['end_point'] = self.end_point
        if self.extension_info is not None:
            result['extension_info'] = self.extension_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('end_point') is not None:
            self.end_point = m.get('end_point')
        if m.get('extension_info') is not None:
            self.extension_info = m.get('extension_info')
        return self


class InstanceRecordInfo(TeaModel):
    def __init__(
        self,
        application: str = None,
        status: str = None,
        operating_time: str = None,
    ):
        # 应用标识
        self.application = application
        # 执行结果
        self.status = status
        # 操作时间
        self.operating_time = operating_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.application is not None:
            result['application'] = self.application
        if self.status is not None:
            result['status'] = self.status
        if self.operating_time is not None:
            result['operating_time'] = self.operating_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('application') is not None:
            self.application = m.get('application')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('operating_time') is not None:
            self.operating_time = m.get('operating_time')
        return self


class ALiYunAccount(TeaModel):
    def __init__(
        self,
        ant_chain_id: str = None,
        account: str = None,
        account_public_key: str = None,
        account_recovery_key: str = None,
        account_status: str = None,
        member_name: str = None,
        create_time: int = None,
    ):
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # account
        self.account = account
        # account_public_key
        self.account_public_key = account_public_key
        # account_recovery_key
        self.account_recovery_key = account_recovery_key
        # account_status
        self.account_status = account_status
        # 机构信息
        self.member_name = member_name
        # 创建时间
        self.create_time = create_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.account is not None:
            result['account'] = self.account
        if self.account_public_key is not None:
            result['account_public_key'] = self.account_public_key
        if self.account_recovery_key is not None:
            result['account_recovery_key'] = self.account_recovery_key
        if self.account_status is not None:
            result['account_status'] = self.account_status
        if self.member_name is not None:
            result['member_name'] = self.member_name
        if self.create_time is not None:
            result['create_time'] = self.create_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('account_public_key') is not None:
            self.account_public_key = m.get('account_public_key')
        if m.get('account_recovery_key') is not None:
            self.account_recovery_key = m.get('account_recovery_key')
        if m.get('account_status') is not None:
            self.account_status = m.get('account_status')
        if m.get('member_name') is not None:
            self.member_name = m.get('member_name')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        return self


class ALiYunChainNodeInfo(TeaModel):
    def __init__(
        self,
        block_height: int = None,
        node_name: str = None,
        status: bool = None,
        version: str = None,
        node_id: str = None,
        node_ip: str = None,
        node_port: str = None,
        node_type: str = None,
        node_state: str = None,
        node_source: str = None,
        disk_use: str = None,
        disk_total: str = None,
        public_key: str = None,
    ):
        # block_height
        self.block_height = block_height
        # node_name
        self.node_name = node_name
        # status
        self.status = status
        # version
        self.version = version
        # 节点id
        self.node_id = node_id
        # 节点ip
        self.node_ip = node_ip
        # 节点的端口
        self.node_port = node_port
        # 节点类型
        self.node_type = node_type
        # 节点状态
        self.node_state = node_state
        # 节点来源
        self.node_source = node_source
        # 节点存储空间使用量
        self.disk_use = disk_use
        # 节点存储总空间大小
        self.disk_total = disk_total
        # 节点公钥
        self.public_key = public_key

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.block_height is not None:
            result['block_height'] = self.block_height
        if self.node_name is not None:
            result['node_name'] = self.node_name
        if self.status is not None:
            result['status'] = self.status
        if self.version is not None:
            result['version'] = self.version
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.node_ip is not None:
            result['node_ip'] = self.node_ip
        if self.node_port is not None:
            result['node_port'] = self.node_port
        if self.node_type is not None:
            result['node_type'] = self.node_type
        if self.node_state is not None:
            result['node_state'] = self.node_state
        if self.node_source is not None:
            result['node_source'] = self.node_source
        if self.disk_use is not None:
            result['disk_use'] = self.disk_use
        if self.disk_total is not None:
            result['disk_total'] = self.disk_total
        if self.public_key is not None:
            result['public_key'] = self.public_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        if m.get('node_name') is not None:
            self.node_name = m.get('node_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('node_ip') is not None:
            self.node_ip = m.get('node_ip')
        if m.get('node_port') is not None:
            self.node_port = m.get('node_port')
        if m.get('node_type') is not None:
            self.node_type = m.get('node_type')
        if m.get('node_state') is not None:
            self.node_state = m.get('node_state')
        if m.get('node_source') is not None:
            self.node_source = m.get('node_source')
        if m.get('disk_use') is not None:
            self.disk_use = m.get('disk_use')
        if m.get('disk_total') is not None:
            self.disk_total = m.get('disk_total')
        if m.get('public_key') is not None:
            self.public_key = m.get('public_key')
        return self


class VcTransmitTargetStruct(TeaModel):
    def __init__(
        self,
        public_key: str = None,
        vc_channel: str = None,
        verifier_did: str = None,
    ):
        # 目标did的公钥
        self.public_key = public_key
        # 传输vc使用的区块链id
        self.vc_channel = vc_channel
        # 验证者did
        self.verifier_did = verifier_did

    def validate(self):
        if self.vc_channel is not None:
            self.validate_max_length(self.vc_channel, 'vc_channel', 32)
        self.validate_required(self.verifier_did, 'verifier_did')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.public_key is not None:
            result['public_key'] = self.public_key
        if self.vc_channel is not None:
            result['vc_channel'] = self.vc_channel
        if self.verifier_did is not None:
            result['verifier_did'] = self.verifier_did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('public_key') is not None:
            self.public_key = m.get('public_key')
        if m.get('vc_channel') is not None:
            self.vc_channel = m.get('vc_channel')
        if m.get('verifier_did') is not None:
            self.verifier_did = m.get('verifier_did')
        return self


class CrowdTagEnumItemDTO(TeaModel):
    def __init__(
        self,
        name: str = None,
        val: str = None,
    ):
        # 枚举名称
        self.name = name
        # 枚举值
        self.val = val

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.val, 'val')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.val is not None:
            result['val'] = self.val
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('val') is not None:
            self.val = m.get('val')
        return self


class ALiYunTransaction(TeaModel):
    def __init__(
        self,
        tx_type: str = None,
        data: str = None,
        hash: str = None,
        from_: str = None,
        to: str = None,
        timestamp: int = None,
        period: int = None,
        nonce: str = None,
        gas: str = None,
        value: str = None,
        signatures: List[str] = None,
        extentions: List[str] = None,
    ):
        # tx_type
        self.tx_type = tx_type
        # data
        self.data = data
        # hash
        self.hash = hash
        # from
        self.from_ = from_
        # to
        self.to = to
        # timestamp
        self.timestamp = timestamp
        # period
        self.period = period
        # nonce
        self.nonce = nonce
        # gas
        self.gas = gas
        # value
        self.value = value
        # signatures
        self.signatures = signatures
        # extentions
        self.extentions = extentions

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tx_type is not None:
            result['tx_type'] = self.tx_type
        if self.data is not None:
            result['data'] = self.data
        if self.hash is not None:
            result['hash'] = self.hash
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.period is not None:
            result['period'] = self.period
        if self.nonce is not None:
            result['nonce'] = self.nonce
        if self.gas is not None:
            result['gas'] = self.gas
        if self.value is not None:
            result['value'] = self.value
        if self.signatures is not None:
            result['signatures'] = self.signatures
        if self.extentions is not None:
            result['extentions'] = self.extentions
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tx_type') is not None:
            self.tx_type = m.get('tx_type')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('period') is not None:
            self.period = m.get('period')
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        if m.get('gas') is not None:
            self.gas = m.get('gas')
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('signatures') is not None:
            self.signatures = m.get('signatures')
        if m.get('extentions') is not None:
            self.extentions = m.get('extentions')
        return self


class ALiYunNotaryBlockchain(TeaModel):
    def __init__(
        self,
        name: str = None,
        bizid: str = None,
        chain_type: str = None,
        node_num: int = None,
        member_status: str = None,
        block_height: int = None,
        transactions: int = None,
        network: str = None,
        version: str = None,
    ):
        # name
        self.name = name
        # bizid
        self.bizid = bizid
        # chain_type
        self.chain_type = chain_type
        # node_num
        self.node_num = node_num
        # member_status
        self.member_status = member_status
        # block_height
        self.block_height = block_height
        # transactions
        self.transactions = transactions
        # network
        self.network = network
        # version
        self.version = version

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.chain_type is not None:
            result['chain_type'] = self.chain_type
        if self.node_num is not None:
            result['node_num'] = self.node_num
        if self.member_status is not None:
            result['member_status'] = self.member_status
        if self.block_height is not None:
            result['block_height'] = self.block_height
        if self.transactions is not None:
            result['transactions'] = self.transactions
        if self.network is not None:
            result['network'] = self.network
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('chain_type') is not None:
            self.chain_type = m.get('chain_type')
        if m.get('node_num') is not None:
            self.node_num = m.get('node_num')
        if m.get('member_status') is not None:
            self.member_status = m.get('member_status')
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        if m.get('transactions') is not None:
            self.transactions = m.get('transactions')
        if m.get('network') is not None:
            self.network = m.get('network')
        if m.get('version') is not None:
            self.version = m.get('version')
        return self


class ContractTemplateResp(TeaModel):
    def __init__(
        self,
        template_id: str = None,
        product_code: str = None,
        name: str = None,
        thumb_url: str = None,
        description: str = None,
        detail_url: str = None,
        open: bool = None,
        avatar_logo_list: List[str] = None,
        price_message: str = None,
    ):
        # 模板标识
        self.template_id = template_id
        # 产品码
        self.product_code = product_code
        # 合约名称
        self.name = name
        # 缩略图url
        self.thumb_url = thumb_url
        # 合约描述
        self.description = description
        # 文档地址
        self.detail_url = detail_url
        # 是否已开通合约
        self.open = open
        # 后续展示：购买用户头像
        self.avatar_logo_list = avatar_logo_list
        # 定制合约价格
        self.price_message = price_message

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.name is not None:
            result['name'] = self.name
        if self.thumb_url is not None:
            result['thumb_url'] = self.thumb_url
        if self.description is not None:
            result['description'] = self.description
        if self.detail_url is not None:
            result['detail_url'] = self.detail_url
        if self.open is not None:
            result['open'] = self.open
        if self.avatar_logo_list is not None:
            result['avatar_logo_list'] = self.avatar_logo_list
        if self.price_message is not None:
            result['price_message'] = self.price_message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('thumb_url') is not None:
            self.thumb_url = m.get('thumb_url')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('detail_url') is not None:
            self.detail_url = m.get('detail_url')
        if m.get('open') is not None:
            self.open = m.get('open')
        if m.get('avatar_logo_list') is not None:
            self.avatar_logo_list = m.get('avatar_logo_list')
        if m.get('price_message') is not None:
            self.price_message = m.get('price_message')
        return self


class DataEntity(TeaModel):
    def __init__(
        self,
        auth_status: str = None,
        biz_uid: str = None,
        blockchain_id: str = None,
        category: str = None,
        data_id: str = None,
        data_model_id: str = None,
        extension_info: str = None,
        name: str = None,
        owner_id: str = None,
        process_template: List[ProcessNode] = None,
        status: str = None,
        create_time: int = None,
        update_time: int = None,
        public_info: str = None,
    ):
        # 授权状态
        self.auth_status = auth_status
        # 业务系统唯一标示
        self.biz_uid = biz_uid
        # 区块链ID
        self.blockchain_id = blockchain_id
        # 数据类别
        self.category = category
        # 数据ID
        self.data_id = data_id
        # 数据模型ID
        self.data_model_id = data_model_id
        # 扩展信息，标准JSON格式
        self.extension_info = extension_info
        # 数据名称
        self.name = name
        # 数据所有者ID
        self.owner_id = owner_id
        # 流程节点信息
        self.process_template = process_template
        # 数据状态
        self.status = status
        # 创建时间
        self.create_time = create_time
        # 修改时间
        self.update_time = update_time
        # DID doc里的公开信息
        self.public_info = public_info

    def validate(self):
        if self.biz_uid is not None:
            self.validate_max_length(self.biz_uid, 'biz_uid', 64)
        self.validate_required(self.category, 'category')
        if self.category is not None:
            self.validate_max_length(self.category, 'category', 32)
        self.validate_required(self.data_id, 'data_id')
        if self.data_id is not None:
            self.validate_max_length(self.data_id, 'data_id', 100)
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 64)
        self.validate_required(self.owner_id, 'owner_id')
        if self.owner_id is not None:
            self.validate_max_length(self.owner_id, 'owner_id', 100)
        if self.process_template:
            for k in self.process_template:
                if k:
                    k.validate()
        if self.status is not None:
            self.validate_max_length(self.status, 'status', 16)
        self.validate_required(self.create_time, 'create_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_status is not None:
            result['auth_status'] = self.auth_status
        if self.biz_uid is not None:
            result['biz_uid'] = self.biz_uid
        if self.blockchain_id is not None:
            result['blockchain_id'] = self.blockchain_id
        if self.category is not None:
            result['category'] = self.category
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.data_model_id is not None:
            result['data_model_id'] = self.data_model_id
        if self.extension_info is not None:
            result['extension_info'] = self.extension_info
        if self.name is not None:
            result['name'] = self.name
        if self.owner_id is not None:
            result['owner_id'] = self.owner_id
        result['process_template'] = []
        if self.process_template is not None:
            for k in self.process_template:
                result['process_template'].append(k.to_map() if k else None)
        if self.status is not None:
            result['status'] = self.status
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.update_time is not None:
            result['update_time'] = self.update_time
        if self.public_info is not None:
            result['public_info'] = self.public_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_status') is not None:
            self.auth_status = m.get('auth_status')
        if m.get('biz_uid') is not None:
            self.biz_uid = m.get('biz_uid')
        if m.get('blockchain_id') is not None:
            self.blockchain_id = m.get('blockchain_id')
        if m.get('category') is not None:
            self.category = m.get('category')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('data_model_id') is not None:
            self.data_model_id = m.get('data_model_id')
        if m.get('extension_info') is not None:
            self.extension_info = m.get('extension_info')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('owner_id') is not None:
            self.owner_id = m.get('owner_id')
        self.process_template = []
        if m.get('process_template') is not None:
            for k in m.get('process_template'):
                temp_model = ProcessNode()
                self.process_template.append(temp_model.from_map(k))
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        if m.get('public_info') is not None:
            self.public_info = m.get('public_info')
        return self


class CarUserInfo(TeaModel):
    def __init__(
        self,
        user_id: str = None,
        phone_num: str = None,
        city_code: str = None,
        user_cert_name: str = None,
        user_cert_no: str = None,
        user_gender: str = None,
        nick: str = None,
    ):
        # 唯一标识用户的id
        self.user_id = user_id
        # 手机号
        self.phone_num = phone_num
        # 城市编码
        self.city_code = city_code
        # 姓名
        self.user_cert_name = user_cert_name
        # 证件号码
        self.user_cert_no = user_cert_no
        # 性别
        self.user_gender = user_gender
        # 昵称
        self.nick = nick

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.phone_num, 'phone_num')
        self.validate_required(self.city_code, 'city_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.phone_num is not None:
            result['phone_num'] = self.phone_num
        if self.city_code is not None:
            result['city_code'] = self.city_code
        if self.user_cert_name is not None:
            result['user_cert_name'] = self.user_cert_name
        if self.user_cert_no is not None:
            result['user_cert_no'] = self.user_cert_no
        if self.user_gender is not None:
            result['user_gender'] = self.user_gender
        if self.nick is not None:
            result['nick'] = self.nick
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('phone_num') is not None:
            self.phone_num = m.get('phone_num')
        if m.get('city_code') is not None:
            self.city_code = m.get('city_code')
        if m.get('user_cert_name') is not None:
            self.user_cert_name = m.get('user_cert_name')
        if m.get('user_cert_no') is not None:
            self.user_cert_no = m.get('user_cert_no')
        if m.get('user_gender') is not None:
            self.user_gender = m.get('user_gender')
        if m.get('nick') is not None:
            self.nick = m.get('nick')
        return self


class ALiYunAntChain(TeaModel):
    def __init__(
        self,
        ant_chain_id: str = None,
        ant_chain_name: str = None,
        chain_type: str = None,
        cipher_suit: str = None,
        create_time: int = None,
        expire_time: int = None,
        instance_id: str = None,
        is_admin: bool = None,
        member_status: str = None,
        merkle_tree_suit: str = None,
        network: str = None,
        node_num: int = None,
        region_id: str = None,
        resource_size: str = None,
        rest_status: str = None,
        tls_algo: str = None,
        version: str = None,
        monitor_status: bool = None,
    ):
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # 链名称
        self.ant_chain_name = ant_chain_name
        # 链的类型
        self.chain_type = chain_type
        # cipher_suit
        self.cipher_suit = cipher_suit
        # 创建时间
        self.create_time = create_time
        # expire_time
        self.expire_time = expire_time
        # instance_id
        self.instance_id = instance_id
        # is_admin
        self.is_admin = is_admin
        # 成员状态
        self.member_status = member_status
        # merkle_tree_suit
        self.merkle_tree_suit = merkle_tree_suit
        # Network
        self.network = network
        # 节点数
        self.node_num = node_num
        # 区域信息
        self.region_id = region_id
        # 链的资源大小
        self.resource_size = resource_size
        # rest_status
        self.rest_status = rest_status
        # 算法参数
        self.tls_algo = tls_algo
        # 版本信息
        self.version = version
        # monitor_status
        self.monitor_status = monitor_status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.ant_chain_name is not None:
            result['ant_chain_name'] = self.ant_chain_name
        if self.chain_type is not None:
            result['chain_type'] = self.chain_type
        if self.cipher_suit is not None:
            result['cipher_suit'] = self.cipher_suit
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.expire_time is not None:
            result['expire_time'] = self.expire_time
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.is_admin is not None:
            result['is_admin'] = self.is_admin
        if self.member_status is not None:
            result['member_status'] = self.member_status
        if self.merkle_tree_suit is not None:
            result['merkle_tree_suit'] = self.merkle_tree_suit
        if self.network is not None:
            result['network'] = self.network
        if self.node_num is not None:
            result['node_num'] = self.node_num
        if self.region_id is not None:
            result['region_id'] = self.region_id
        if self.resource_size is not None:
            result['resource_size'] = self.resource_size
        if self.rest_status is not None:
            result['rest_status'] = self.rest_status
        if self.tls_algo is not None:
            result['tls_algo'] = self.tls_algo
        if self.version is not None:
            result['version'] = self.version
        if self.monitor_status is not None:
            result['monitor_status'] = self.monitor_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('ant_chain_name') is not None:
            self.ant_chain_name = m.get('ant_chain_name')
        if m.get('chain_type') is not None:
            self.chain_type = m.get('chain_type')
        if m.get('cipher_suit') is not None:
            self.cipher_suit = m.get('cipher_suit')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('expire_time') is not None:
            self.expire_time = m.get('expire_time')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('is_admin') is not None:
            self.is_admin = m.get('is_admin')
        if m.get('member_status') is not None:
            self.member_status = m.get('member_status')
        if m.get('merkle_tree_suit') is not None:
            self.merkle_tree_suit = m.get('merkle_tree_suit')
        if m.get('network') is not None:
            self.network = m.get('network')
        if m.get('node_num') is not None:
            self.node_num = m.get('node_num')
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        if m.get('resource_size') is not None:
            self.resource_size = m.get('resource_size')
        if m.get('rest_status') is not None:
            self.rest_status = m.get('rest_status')
        if m.get('tls_algo') is not None:
            self.tls_algo = m.get('tls_algo')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('monitor_status') is not None:
            self.monitor_status = m.get('monitor_status')
        return self


class DidDocServicesInfo(TeaModel):
    def __init__(
        self,
        extension: str = None,
        id: str = None,
        service_endpoint: str = None,
        type: str = None,
    ):
        # 服务的扩展字段
        self.extension = extension
        # 服务ID，必须保证该服务ID在did doc中是唯一的。对于保留类型服务：
        # DidAuthService， 有且只能有一个，并且id必须为didauth-1；
        # VerifiableClaimRepository， 有且只有一个，并且id必须为vcrepository-1;
        self.id = id
        # 服务的可访问地址
        self.service_endpoint = service_endpoint
        # 服务类型，必须是已经注册的服务类型，或者是默认保留的服务类型
        self.type = type

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.service_endpoint, 'service_endpoint')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.extension is not None:
            result['extension'] = self.extension
        if self.id is not None:
            result['id'] = self.id
        if self.service_endpoint is not None:
            result['service_endpoint'] = self.service_endpoint
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('extension') is not None:
            self.extension = m.get('extension')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('service_endpoint') is not None:
            self.service_endpoint = m.get('service_endpoint')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class ALiYunCertificateApplication(TeaModel):
    def __init__(
        self,
        ant_chain_id: str = None,
        username: str = None,
        createtime: int = None,
        updatetime: int = None,
        bid: str = None,
        status: str = None,
    ):
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # username
        self.username = username
        # createtime
        self.createtime = createtime
        # updatetime
        self.updatetime = updatetime
        # bid
        self.bid = bid
        # status
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.username is not None:
            result['username'] = self.username
        if self.createtime is not None:
            result['createtime'] = self.createtime
        if self.updatetime is not None:
            result['updatetime'] = self.updatetime
        if self.bid is not None:
            result['bid'] = self.bid
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('username') is not None:
            self.username = m.get('username')
        if m.get('createtime') is not None:
            self.createtime = m.get('createtime')
        if m.get('updatetime') is not None:
            self.updatetime = m.get('updatetime')
        if m.get('bid') is not None:
            self.bid = m.get('bid')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class DisServicesInfo(TeaModel):
    def __init__(
        self,
        extesion: str = None,
        id: str = None,
        service_endpoint: str = None,
        type: str = None,
        desc: str = None,
    ):
        # did doc service扩展字段
        self.extesion = extesion
        # did doc service id
        self.id = id
        # 服务endpoint
        self.service_endpoint = service_endpoint
        # service type
        self.type = type
        # EXIST
        # CONFLICT
        # VALID
        # INVALID
        self.desc = desc

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.service_endpoint, 'service_endpoint')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.extesion is not None:
            result['extesion'] = self.extesion
        if self.id is not None:
            result['id'] = self.id
        if self.service_endpoint is not None:
            result['service_endpoint'] = self.service_endpoint
        if self.type is not None:
            result['type'] = self.type
        if self.desc is not None:
            result['desc'] = self.desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('extesion') is not None:
            self.extesion = m.get('extesion')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('service_endpoint') is not None:
            self.service_endpoint = m.get('service_endpoint')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        return self


class ALiYunContractBlockchain(TeaModel):
    def __init__(
        self,
        name: str = None,
        bizid: str = None,
        chain_type: str = None,
        node_num: int = None,
        member_status: str = None,
        block_height: int = None,
        transactions: int = None,
        network: str = None,
        version: str = None,
    ):
        # name
        self.name = name
        # bizid
        self.bizid = bizid
        # chain_type
        self.chain_type = chain_type
        # node_num
        self.node_num = node_num
        # member_status
        self.member_status = member_status
        # block_height
        self.block_height = block_height
        # transactions
        self.transactions = transactions
        # network
        self.network = network
        # version
        self.version = version

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.chain_type is not None:
            result['chain_type'] = self.chain_type
        if self.node_num is not None:
            result['node_num'] = self.node_num
        if self.member_status is not None:
            result['member_status'] = self.member_status
        if self.block_height is not None:
            result['block_height'] = self.block_height
        if self.transactions is not None:
            result['transactions'] = self.transactions
        if self.network is not None:
            result['network'] = self.network
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('chain_type') is not None:
            self.chain_type = m.get('chain_type')
        if m.get('node_num') is not None:
            self.node_num = m.get('node_num')
        if m.get('member_status') is not None:
            self.member_status = m.get('member_status')
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        if m.get('transactions') is not None:
            self.transactions = m.get('transactions')
        if m.get('network') is not None:
            self.network = m.get('network')
        if m.get('version') is not None:
            self.version = m.get('version')
        return self


class ALiYunChainMiniAppAuthorizedUser(TeaModel):
    def __init__(
        self,
        phone: str = None,
        gmt_authorized: str = None,
        user_id: int = None,
    ):
        # phone
        self.phone = phone
        # gmt_authorized
        self.gmt_authorized = gmt_authorized
        # 记录id
        self.user_id = user_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.phone is not None:
            result['phone'] = self.phone
        if self.gmt_authorized is not None:
            result['gmt_authorized'] = self.gmt_authorized
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('gmt_authorized') is not None:
            self.gmt_authorized = m.get('gmt_authorized')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class ALiYunContractProject(TeaModel):
    def __init__(
        self,
        consortium_id: str = None,
        create_time: int = None,
        project_description: str = None,
        project_id: str = None,
        project_name: str = None,
        project_version: str = None,
        update_time: int = None,
    ):
        # consortium_id
        self.consortium_id = consortium_id
        # create_time
        self.create_time = create_time
        # project_description
        self.project_description = project_description
        # project_id
        self.project_id = project_id
        # project_name
        self.project_name = project_name
        # project_version
        self.project_version = project_version
        # update_time
        self.update_time = update_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.project_description is not None:
            result['project_description'] = self.project_description
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.project_name is not None:
            result['project_name'] = self.project_name
        if self.project_version is not None:
            result['project_version'] = self.project_version
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('project_description') is not None:
            self.project_description = m.get('project_description')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        if m.get('project_version') is not None:
            self.project_version = m.get('project_version')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class ContractPageListResp(TeaModel):
    def __init__(
        self,
        service_id: str = None,
        name: str = None,
        type: str = None,
        create_time: int = None,
    ):
        # 服务ID
        self.service_id = service_id
        # 合约名称
        self.name = name
        # 合约类型
        self.type = type
        # 创建时间
        self.create_time = create_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.create_time is not None:
            result['create_time'] = self.create_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        return self


class ALiYunOldContractBlockchain(TeaModel):
    def __init__(
        self,
        name: str = None,
        bizid: str = None,
        chain_type: str = None,
        node_num: int = None,
        member_status: str = None,
        block_height: int = None,
        transactions: int = None,
        network: str = None,
        version: str = None,
    ):
        # name
        self.name = name
        # bizid
        self.bizid = bizid
        # chain_type
        self.chain_type = chain_type
        # node_num
        self.node_num = node_num
        # member_status
        self.member_status = member_status
        # block_height
        self.block_height = block_height
        # transactions
        self.transactions = transactions
        # network
        self.network = network
        # version
        self.version = version

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.chain_type is not None:
            result['chain_type'] = self.chain_type
        if self.node_num is not None:
            result['node_num'] = self.node_num
        if self.member_status is not None:
            result['member_status'] = self.member_status
        if self.block_height is not None:
            result['block_height'] = self.block_height
        if self.transactions is not None:
            result['transactions'] = self.transactions
        if self.network is not None:
            result['network'] = self.network
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('chain_type') is not None:
            self.chain_type = m.get('chain_type')
        if m.get('node_num') is not None:
            self.node_num = m.get('node_num')
        if m.get('member_status') is not None:
            self.member_status = m.get('member_status')
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        if m.get('transactions') is not None:
            self.transactions = m.get('transactions')
        if m.get('network') is not None:
            self.network = m.get('network')
        if m.get('version') is not None:
            self.version = m.get('version')
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


class ALiYunTransactionSummary(TeaModel):
    def __init__(
        self,
        alias: str = None,
        hash: str = None,
        trans_type_v6: str = None,
        trans_type_v10: str = None,
        category: int = None,
        height: int = None,
        block_hash: str = None,
        create_time: int = None,
        reference_count: int = None,
        from_: str = None,
        to: str = None,
        gas_used: int = None,
    ):
        # alias
        self.alias = alias
        # hash
        self.hash = hash
        # trans_type_v6
        self.trans_type_v6 = trans_type_v6
        # trans_type_v10
        self.trans_type_v10 = trans_type_v10
        # category
        self.category = category
        # height
        self.height = height
        # block_hash
        self.block_hash = block_hash
        # create_time
        self.create_time = create_time
        # reference_count
        self.reference_count = reference_count
        # from
        self.from_ = from_
        # to
        self.to = to
        # gas_used
        self.gas_used = gas_used

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.alias is not None:
            result['alias'] = self.alias
        if self.hash is not None:
            result['hash'] = self.hash
        if self.trans_type_v6 is not None:
            result['trans_type_v6'] = self.trans_type_v6
        if self.trans_type_v10 is not None:
            result['trans_type_v10'] = self.trans_type_v10
        if self.category is not None:
            result['category'] = self.category
        if self.height is not None:
            result['height'] = self.height
        if self.block_hash is not None:
            result['block_hash'] = self.block_hash
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.reference_count is not None:
            result['reference_count'] = self.reference_count
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        if self.gas_used is not None:
            result['gas_used'] = self.gas_used
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('alias') is not None:
            self.alias = m.get('alias')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('trans_type_v6') is not None:
            self.trans_type_v6 = m.get('trans_type_v6')
        if m.get('trans_type_v10') is not None:
            self.trans_type_v10 = m.get('trans_type_v10')
        if m.get('category') is not None:
            self.category = m.get('category')
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('block_hash') is not None:
            self.block_hash = m.get('block_hash')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('reference_count') is not None:
            self.reference_count = m.get('reference_count')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('gas_used') is not None:
            self.gas_used = m.get('gas_used')
        return self


class ALiYunAntConsortium(TeaModel):
    def __init__(
        self,
        chain_num: int = None,
        member_num: int = None,
        create_time: int = None,
        role: str = None,
        consortium_id: str = None,
        status: str = None,
        consortium_name: str = None,
        consortium_description: str = None,
        is_empty_consortium: bool = None,
    ):
        # 链的数量
        self.chain_num = chain_num
        # 成员数量
        self.member_num = member_num
        # 时间戳
        self.create_time = create_time
        # 角色
        self.role = role
        # 联盟id
        self.consortium_id = consortium_id
        # 状态值
        self.status = status
        # 联盟名称
        self.consortium_name = consortium_name
        # 联盟描述
        self.consortium_description = consortium_description
        # 是否为空联盟
        self.is_empty_consortium = is_empty_consortium

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.chain_num is not None:
            result['chain_num'] = self.chain_num
        if self.member_num is not None:
            result['member_num'] = self.member_num
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.role is not None:
            result['role'] = self.role
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        if self.status is not None:
            result['status'] = self.status
        if self.consortium_name is not None:
            result['consortium_name'] = self.consortium_name
        if self.consortium_description is not None:
            result['consortium_description'] = self.consortium_description
        if self.is_empty_consortium is not None:
            result['is_empty_consortium'] = self.is_empty_consortium
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('chain_num') is not None:
            self.chain_num = m.get('chain_num')
        if m.get('member_num') is not None:
            self.member_num = m.get('member_num')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('role') is not None:
            self.role = m.get('role')
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('consortium_name') is not None:
            self.consortium_name = m.get('consortium_name')
        if m.get('consortium_description') is not None:
            self.consortium_description = m.get('consortium_description')
        if m.get('is_empty_consortium') is not None:
            self.is_empty_consortium = m.get('is_empty_consortium')
        return self


class CheckPointStructBody(TeaModel):
    def __init__(
        self,
        height: str = None,
        index: str = None,
        type: str = None,
        last_error: str = None,
        error_count: str = None,
        total_count: str = None,
    ):
        # 高度
        self.height = height
        # 序号
        self.index = index
        # 类型
        self.type = type
        # last_error
        self.last_error = last_error
        # 错误统计
        self.error_count = error_count
        # 统计
        self.total_count = total_count

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.height is not None:
            result['height'] = self.height
        if self.index is not None:
            result['index'] = self.index
        if self.type is not None:
            result['type'] = self.type
        if self.last_error is not None:
            result['last_error'] = self.last_error
        if self.error_count is not None:
            result['error_count'] = self.error_count
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('index') is not None:
            self.index = m.get('index')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('last_error') is not None:
            self.last_error = m.get('last_error')
        if m.get('error_count') is not None:
            self.error_count = m.get('error_count')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class CrowdMatchResult(TeaModel):
    def __init__(
        self,
        match: bool = None,
    ):
        # 人群匹配结果
        self.match = match

    def validate(self):
        self.validate_required(self.match, 'match')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.match is not None:
            result['match'] = self.match
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('match') is not None:
            self.match = m.get('match')
        return self


class AccountMappingInfo(TeaModel):
    def __init__(
        self,
        bc_account: str = None,
        binding_status: int = None,
        status: int = None,
        uid: str = None,
    ):
        # 链上账户id
        self.bc_account = bc_account
        # 账户绑定状态，1为未绑定，2为绑定成功
        self.binding_status = binding_status
        # 1是激活状态，2是冻结状态
        self.status = status
        # 账户唯一标示
        self.uid = uid

    def validate(self):
        self.validate_required(self.bc_account, 'bc_account')
        self.validate_required(self.binding_status, 'binding_status')
        self.validate_required(self.status, 'status')
        self.validate_required(self.uid, 'uid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.bc_account is not None:
            result['bc_account'] = self.bc_account
        if self.binding_status is not None:
            result['binding_status'] = self.binding_status
        if self.status is not None:
            result['status'] = self.status
        if self.uid is not None:
            result['uid'] = self.uid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('bc_account') is not None:
            self.bc_account = m.get('bc_account')
        if m.get('binding_status') is not None:
            self.binding_status = m.get('binding_status')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('uid') is not None:
            self.uid = m.get('uid')
        return self


class CertInstanceDetail(TeaModel):
    def __init__(
        self,
        biz_id: str = None,
        name: str = None,
        issuer: str = None,
        claim_content: str = None,
        status: int = None,
        verify_comment: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
    ):
        # 主键
        self.biz_id = biz_id
        # 实例名称
        self.name = name
        # 版发者
        self.issuer = issuer
        # 实例内容
        self.claim_content = claim_content
        # 状态；-1：已删除 0：审核未通过, 1：审核通过, 2：待审核, 3：编辑中
        self.status = status
        # 审核建议
        self.verify_comment = verify_comment
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.issuer, 'issuer')
        self.validate_required(self.claim_content, 'claim_content')
        self.validate_required(self.status, 'status')
        self.validate_required(self.verify_comment, 'verify_comment')
        self.validate_required(self.gmt_create, 'gmt_create')
        self.validate_required(self.gmt_modified, 'gmt_modified')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.name is not None:
            result['name'] = self.name
        if self.issuer is not None:
            result['issuer'] = self.issuer
        if self.claim_content is not None:
            result['claim_content'] = self.claim_content
        if self.status is not None:
            result['status'] = self.status
        if self.verify_comment is not None:
            result['verify_comment'] = self.verify_comment
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('issuer') is not None:
            self.issuer = m.get('issuer')
        if m.get('claim_content') is not None:
            self.claim_content = m.get('claim_content')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('verify_comment') is not None:
            self.verify_comment = m.get('verify_comment')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        return self


class PrizeBaseInfo(TeaModel):
    def __init__(
        self,
        prize_id: str = None,
        prize_name: str = None,
        prize_type: str = None,
        prize_status: str = None,
        budget_amount: int = None,
    ):
        # 奖品ID
        self.prize_id = prize_id
        # 奖品名称
        self.prize_name = prize_name
        # 奖品类型
        self.prize_type = prize_type
        # 奖品状态
        self.prize_status = prize_status
        # 预算金额
        self.budget_amount = budget_amount

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.prize_id is not None:
            result['prize_id'] = self.prize_id
        if self.prize_name is not None:
            result['prize_name'] = self.prize_name
        if self.prize_type is not None:
            result['prize_type'] = self.prize_type
        if self.prize_status is not None:
            result['prize_status'] = self.prize_status
        if self.budget_amount is not None:
            result['budget_amount'] = self.budget_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('prize_id') is not None:
            self.prize_id = m.get('prize_id')
        if m.get('prize_name') is not None:
            self.prize_name = m.get('prize_name')
        if m.get('prize_type') is not None:
            self.prize_type = m.get('prize_type')
        if m.get('prize_status') is not None:
            self.prize_status = m.get('prize_status')
        if m.get('budget_amount') is not None:
            self.budget_amount = m.get('budget_amount')
        return self


class ChainPurpose(TeaModel):
    def __init__(
        self,
        id: str = None,
        key: str = None,
        name: str = None,
        time: str = None,
        status: str = None,
        item: bool = None,
        extend: bool = None,
        purpose_item: str = None,
    ):
        # 用途id
        self.id = id
        # 用途key
        self.key = key
        # 用途内容
        self.name = name
        # 用途申报时间
        self.time = time
        # 用途申报状态
        self.status = status
        # 简短描述开关
        self.item = item
        # 详细描述开关
        self.extend = extend
        # 用途申报简短描述
        self.purpose_item = purpose_item

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.key is not None:
            result['key'] = self.key
        if self.name is not None:
            result['name'] = self.name
        if self.time is not None:
            result['time'] = self.time
        if self.status is not None:
            result['status'] = self.status
        if self.item is not None:
            result['item'] = self.item
        if self.extend is not None:
            result['extend'] = self.extend
        if self.purpose_item is not None:
            result['purpose_item'] = self.purpose_item
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('time') is not None:
            self.time = m.get('time')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('item') is not None:
            self.item = m.get('item')
        if m.get('extend') is not None:
            self.extend = m.get('extend')
        if m.get('purpose_item') is not None:
            self.purpose_item = m.get('purpose_item')
        return self


class PriceStrategy(TeaModel):
    def __init__(
        self,
        strategy_type: str = None,
        strategy_value: str = None,
        min_price: int = None,
        max_price: int = None,
        threshold: int = None,
        threshold_type: str = None,
    ):
        # 定价策略类型
        self.strategy_type = strategy_type
        # 策略值
        self.strategy_value = strategy_value
        # 最小金额（单位：分）
        self.min_price = min_price
        # 最大金额（单位：分）
        self.max_price = max_price
        # 门槛金额（单位：分）
        self.threshold = threshold
        # 门槛类型
        self.threshold_type = threshold_type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.strategy_type is not None:
            result['strategy_type'] = self.strategy_type
        if self.strategy_value is not None:
            result['strategy_value'] = self.strategy_value
        if self.min_price is not None:
            result['min_price'] = self.min_price
        if self.max_price is not None:
            result['max_price'] = self.max_price
        if self.threshold is not None:
            result['threshold'] = self.threshold
        if self.threshold_type is not None:
            result['threshold_type'] = self.threshold_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('strategy_type') is not None:
            self.strategy_type = m.get('strategy_type')
        if m.get('strategy_value') is not None:
            self.strategy_value = m.get('strategy_value')
        if m.get('min_price') is not None:
            self.min_price = m.get('min_price')
        if m.get('max_price') is not None:
            self.max_price = m.get('max_price')
        if m.get('threshold') is not None:
            self.threshold = m.get('threshold')
        if m.get('threshold_type') is not None:
            self.threshold_type = m.get('threshold_type')
        return self


class TemplateInstanceErrorDetailDTO(TeaModel):
    def __init__(
        self,
        error_num: int = None,
        samples: List[str] = None,
        error_column_index: int = None,
        error_description: str = None,
    ):
        # 当前错误类型的错误行数
        self.error_num = error_num
        # 出错数据抽样
        self.samples = samples
        # 出错列，从0开始
        self.error_column_index = error_column_index
        # 当前错误类型的描述
        self.error_description = error_description

    def validate(self):
        self.validate_required(self.error_num, 'error_num')
        self.validate_required(self.samples, 'samples')
        self.validate_required(self.error_column_index, 'error_column_index')
        self.validate_required(self.error_description, 'error_description')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.error_num is not None:
            result['error_num'] = self.error_num
        if self.samples is not None:
            result['samples'] = self.samples
        if self.error_column_index is not None:
            result['error_column_index'] = self.error_column_index
        if self.error_description is not None:
            result['error_description'] = self.error_description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('error_num') is not None:
            self.error_num = m.get('error_num')
        if m.get('samples') is not None:
            self.samples = m.get('samples')
        if m.get('error_column_index') is not None:
            self.error_column_index = m.get('error_column_index')
        if m.get('error_description') is not None:
            self.error_description = m.get('error_description')
        return self


class Claim(TeaModel):
    def __init__(
        self,
        claim_content: str = None,
        claim_type: str = None,
        expire: int = None,
        did: str = None,
        name: str = None,
    ):
        # 一个json的string，内容包含具体需要的声明，不同业务场景不同。
        self.claim_content = claim_content
        # 如果在相同的biz_type下，还需要针对声明claim进行细化划分，可以使用此字段。
        self.claim_type = claim_type
        # 申请声明颁发后的有效期，可选参数，如果不指定则默认申请永久有效。
        self.expire = expire
        # 授权颁发可验证声明的目标did信息，通常为机构或组织的did
        self.did = did
        # 目标待授权的名称，标定唯一性，与claim内容配合使用，如果不指定did可以考虑使用此字段。
        self.name = name

    def validate(self):
        self.validate_required(self.claim_content, 'claim_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.claim_content is not None:
            result['claim_content'] = self.claim_content
        if self.claim_type is not None:
            result['claim_type'] = self.claim_type
        if self.expire is not None:
            result['expire'] = self.expire
        if self.did is not None:
            result['did'] = self.did
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('claim_content') is not None:
            self.claim_content = m.get('claim_content')
        if m.get('claim_type') is not None:
            self.claim_type = m.get('claim_type')
        if m.get('expire') is not None:
            self.expire = m.get('expire')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class ALiYunChainSubnetCheck(TeaModel):
    def __init__(
        self,
        check_result: str = None,
        consortium_member_list: List[str] = None,
        chain_node_info_list: List[ALiYunChainNodeInfo] = None,
        consortium_admin: bool = None,
        consortium_member_info_list: List[ALiYunMember] = None,
        pagination: ALiYunPagination = None,
    ):
        # 检查结果
        self.check_result = check_result
        # 子链成员列表
        self.consortium_member_list = consortium_member_list
        # 节点信息列表
        self.chain_node_info_list = chain_node_info_list
        # 联盟管理员
        self.consortium_admin = consortium_admin
        # 子链成员列表
        self.consortium_member_info_list = consortium_member_info_list
        # 分页信息
        self.pagination = pagination

    def validate(self):
        if self.chain_node_info_list:
            for k in self.chain_node_info_list:
                if k:
                    k.validate()
        if self.consortium_member_info_list:
            for k in self.consortium_member_info_list:
                if k:
                    k.validate()
        if self.pagination:
            self.pagination.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.check_result is not None:
            result['check_result'] = self.check_result
        if self.consortium_member_list is not None:
            result['consortium_member_list'] = self.consortium_member_list
        result['chain_node_info_list'] = []
        if self.chain_node_info_list is not None:
            for k in self.chain_node_info_list:
                result['chain_node_info_list'].append(k.to_map() if k else None)
        if self.consortium_admin is not None:
            result['consortium_admin'] = self.consortium_admin
        result['consortium_member_info_list'] = []
        if self.consortium_member_info_list is not None:
            for k in self.consortium_member_info_list:
                result['consortium_member_info_list'].append(k.to_map() if k else None)
        if self.pagination is not None:
            result['pagination'] = self.pagination.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('check_result') is not None:
            self.check_result = m.get('check_result')
        if m.get('consortium_member_list') is not None:
            self.consortium_member_list = m.get('consortium_member_list')
        self.chain_node_info_list = []
        if m.get('chain_node_info_list') is not None:
            for k in m.get('chain_node_info_list'):
                temp_model = ALiYunChainNodeInfo()
                self.chain_node_info_list.append(temp_model.from_map(k))
        if m.get('consortium_admin') is not None:
            self.consortium_admin = m.get('consortium_admin')
        self.consortium_member_info_list = []
        if m.get('consortium_member_info_list') is not None:
            for k in m.get('consortium_member_info_list'):
                temp_model = ALiYunMember()
                self.consortium_member_info_list.append(temp_model.from_map(k))
        if m.get('pagination') is not None:
            temp_model = ALiYunPagination()
            self.pagination = temp_model.from_map(m['pagination'])
        return self


class AuthorizationRule(TeaModel):
    def __init__(
        self,
        source: str = None,
        index: str = None,
        type: str = None,
        expression: str = None,
        content: str = None,
    ):
        # 规则来源
        self.source = source
        # 规则索引
        self.index = index
        # 规则类型
        self.type = type
        # 规则表达式
        self.expression = expression
        # 规则内容
        self.content = content

    def validate(self):
        self.validate_required(self.source, 'source')
        self.validate_required(self.index, 'index')
        self.validate_required(self.type, 'type')
        self.validate_required(self.expression, 'expression')
        self.validate_required(self.content, 'content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.source is not None:
            result['source'] = self.source
        if self.index is not None:
            result['index'] = self.index
        if self.type is not None:
            result['type'] = self.type
        if self.expression is not None:
            result['expression'] = self.expression
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('index') is not None:
            self.index = m.get('index')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('expression') is not None:
            self.expression = m.get('expression')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class AccountMappingResult(TeaModel):
    def __init__(
        self,
        baccount: str = None,
        message: str = None,
        status: str = None,
        uid: str = None,
    ):
        # 该账户在链上的唯一标示
        self.baccount = baccount
        # 当前账户映射结果描述语句
        self.message = message
        # 状态描述符
        self.status = status
        # 自有系统中该账户唯一标示
        self.uid = uid

    def validate(self):
        self.validate_required(self.baccount, 'baccount')
        self.validate_required(self.message, 'message')
        self.validate_required(self.status, 'status')
        self.validate_required(self.uid, 'uid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.baccount is not None:
            result['baccount'] = self.baccount
        if self.message is not None:
            result['message'] = self.message
        if self.status is not None:
            result['status'] = self.status
        if self.uid is not None:
            result['uid'] = self.uid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('baccount') is not None:
            self.baccount = m.get('baccount')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('uid') is not None:
            self.uid = m.get('uid')
        return self


class AddressInfo(TeaModel):
    def __init__(
        self,
        city_code: str = None,
        district_code: str = None,
        address: str = None,
        province_code: str = None,
        poiid: str = None,
        longitude: str = None,
        latitude: str = None,
        type: str = None,
    ):
        # 城市编码
        self.city_code = city_code
        # 区县编码
        self.district_code = district_code
        # 地址
        self.address = address
        # 省份编码
        self.province_code = province_code
        # 高德 poiid
        self.poiid = poiid
        # 经度
        self.longitude = longitude
        # 纬度
        self.latitude = latitude
        # 地址类型
        self.type = type

    def validate(self):
        self.validate_required(self.city_code, 'city_code')
        self.validate_required(self.district_code, 'district_code')
        self.validate_required(self.address, 'address')
        self.validate_required(self.province_code, 'province_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.city_code is not None:
            result['city_code'] = self.city_code
        if self.district_code is not None:
            result['district_code'] = self.district_code
        if self.address is not None:
            result['address'] = self.address
        if self.province_code is not None:
            result['province_code'] = self.province_code
        if self.poiid is not None:
            result['poiid'] = self.poiid
        if self.longitude is not None:
            result['longitude'] = self.longitude
        if self.latitude is not None:
            result['latitude'] = self.latitude
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('city_code') is not None:
            self.city_code = m.get('city_code')
        if m.get('district_code') is not None:
            self.district_code = m.get('district_code')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('province_code') is not None:
            self.province_code = m.get('province_code')
        if m.get('poiid') is not None:
            self.poiid = m.get('poiid')
        if m.get('longitude') is not None:
            self.longitude = m.get('longitude')
        if m.get('latitude') is not None:
            self.latitude = m.get('latitude')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class VcContent(TeaModel):
    def __init__(
        self,
        vc_id: str = None,
        vc_content: str = None,
        status: str = None,
        did: str = None,
        message: str = None,
    ):
        # 可验证声明的唯一标识id，status 为 “1” 时候非空
        self.vc_id = vc_id
        # 可验证声明完整内容， status 为 “1” 时候非空
        self.vc_content = vc_content
        # 可验证声明的颁发状态说明： -1：颁发失败，0：未授权 1：授权成功，此时vc_content字段会包含授权后的声明内容，其它状态码，待定义后增加。
        self.status = status
        # 被颁发当前可验证声明的目标did
        self.did = did
        # 如果status 是 “-1”，则说明当前可验证声明颁发失败，此字段说明失败原因。
        self.message = message

    def validate(self):
        self.validate_required(self.vc_id, 'vc_id')
        self.validate_required(self.vc_content, 'vc_content')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        if self.vc_content is not None:
            result['vc_content'] = self.vc_content
        if self.status is not None:
            result['status'] = self.status
        if self.did is not None:
            result['did'] = self.did
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        if m.get('vc_content') is not None:
            self.vc_content = m.get('vc_content')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class RefundRoyaltyResult(TeaModel):
    def __init__(
        self,
        refund_amount: str = None,
        result_code: str = None,
    ):
        # 退分账金额
        self.refund_amount = refund_amount
        # 退分账结果码
        self.result_code = result_code

    def validate(self):
        self.validate_required(self.refund_amount, 'refund_amount')
        self.validate_required(self.result_code, 'result_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.refund_amount is not None:
            result['refund_amount'] = self.refund_amount
        if self.result_code is not None:
            result['result_code'] = self.result_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('refund_amount') is not None:
            self.refund_amount = m.get('refund_amount')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        return self


class UserInfoParam(TeaModel):
    def __init__(
        self,
        phone: str = None,
        user_account: str = None,
        user_name: str = None,
    ):
        # 用户手机号信息
        self.phone = phone
        # 用户账号信息
        self.user_account = user_account
        # 用户名称
        self.user_name = user_name

    def validate(self):
        self.validate_required(self.phone, 'phone')
        self.validate_required(self.user_account, 'user_account')
        self.validate_required(self.user_name, 'user_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.phone is not None:
            result['phone'] = self.phone
        if self.user_account is not None:
            result['user_account'] = self.user_account
        if self.user_name is not None:
            result['user_name'] = self.user_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('user_account') is not None:
            self.user_account = m.get('user_account')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        return self


class TaskCrowdMatchResp(TeaModel):
    def __init__(
        self,
        task_id: str = None,
        crowd_match_result: CrowdMatchResult = None,
    ):
        # 任务ID
        self.task_id = task_id
        # 人群匹配结果
        self.crowd_match_result = crowd_match_result

    def validate(self):
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.crowd_match_result, 'crowd_match_result')
        if self.crowd_match_result:
            self.crowd_match_result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.crowd_match_result is not None:
            result['crowd_match_result'] = self.crowd_match_result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('crowd_match_result') is not None:
            temp_model = CrowdMatchResult()
            self.crowd_match_result = temp_model.from_map(m['crowd_match_result'])
        return self


class MyChainInfo(TeaModel):
    def __init__(
        self,
        biz_id: str = None,
        tenant: str = None,
    ):
        # 链id
        self.biz_id = biz_id
        # 授权租户id
        self.tenant = tenant

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.tenant, 'tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.tenant is not None:
            result['tenant'] = self.tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        return self


class DeriveDid(TeaModel):
    def __init__(
        self,
        childdid: str = None,
        childdiddoc: str = None,
        code: str = None,
    ):
        # 派生的子did
        self.childdid = childdid
        # 子did 的did doc
        self.childdiddoc = childdiddoc
        # 用户输入用于派生子did的派生码
        self.code = code

    def validate(self):
        self.validate_required(self.childdid, 'childdid')
        self.validate_required(self.childdiddoc, 'childdiddoc')
        self.validate_required(self.code, 'code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.childdid is not None:
            result['childdid'] = self.childdid
        if self.childdiddoc is not None:
            result['childdiddoc'] = self.childdiddoc
        if self.code is not None:
            result['code'] = self.code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('childdid') is not None:
            self.childdid = m.get('childdid')
        if m.get('childdiddoc') is not None:
            self.childdiddoc = m.get('childdiddoc')
        if m.get('code') is not None:
            self.code = m.get('code')
        return self


class AuthorizationDetail(TeaModel):
    def __init__(
        self,
        authority_cert_id: str = None,
        authorization_id: str = None,
        block_num: int = None,
        expire: int = None,
        issuance_time: int = None,
        issuer: Participant = None,
        subject: Participant = None,
        tx_hash: str = None,
        owner: Participant = None,
    ):
        # 授权凭证ID
        self.authority_cert_id = authority_cert_id
        # 授权ID
        self.authorization_id = authorization_id
        # 区块号
        self.block_num = block_num
        # 过期时间
        self.expire = expire
        # 授权时间
        self.issuance_time = issuance_time
        # 授权人
        self.issuer = issuer
        # 被授权人
        self.subject = subject
        # 哈希
        self.tx_hash = tx_hash
        # 资产所有者
        self.owner = owner

    def validate(self):
        self.validate_required(self.authority_cert_id, 'authority_cert_id')
        self.validate_required(self.block_num, 'block_num')
        self.validate_required(self.issuance_time, 'issuance_time')
        self.validate_required(self.issuer, 'issuer')
        if self.issuer:
            self.issuer.validate()
        self.validate_required(self.subject, 'subject')
        if self.subject:
            self.subject.validate()
        self.validate_required(self.tx_hash, 'tx_hash')
        self.validate_required(self.owner, 'owner')
        if self.owner:
            self.owner.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.authority_cert_id is not None:
            result['authority_cert_id'] = self.authority_cert_id
        if self.authorization_id is not None:
            result['authorization_id'] = self.authorization_id
        if self.block_num is not None:
            result['block_num'] = self.block_num
        if self.expire is not None:
            result['expire'] = self.expire
        if self.issuance_time is not None:
            result['issuance_time'] = self.issuance_time
        if self.issuer is not None:
            result['issuer'] = self.issuer.to_map()
        if self.subject is not None:
            result['subject'] = self.subject.to_map()
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.owner is not None:
            result['owner'] = self.owner.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('authority_cert_id') is not None:
            self.authority_cert_id = m.get('authority_cert_id')
        if m.get('authorization_id') is not None:
            self.authorization_id = m.get('authorization_id')
        if m.get('block_num') is not None:
            self.block_num = m.get('block_num')
        if m.get('expire') is not None:
            self.expire = m.get('expire')
        if m.get('issuance_time') is not None:
            self.issuance_time = m.get('issuance_time')
        if m.get('issuer') is not None:
            temp_model = Participant()
            self.issuer = temp_model.from_map(m['issuer'])
        if m.get('subject') is not None:
            temp_model = Participant()
            self.subject = temp_model.from_map(m['subject'])
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('owner') is not None:
            temp_model = Participant()
            self.owner = temp_model.from_map(m['owner'])
        return self


class ALiYunChainCloudIdeConfig(TeaModel):
    def __init__(
        self,
        bizid: str = None,
        name: str = None,
        trial_account: str = None,
        trial_account_private_key: str = None,
        ant_chain_id: str = None,
        ant_chain_name: str = None,
        version: str = None,
    ):
        # bizid
        self.bizid = bizid
        # name
        self.name = name
        # trial_account
        self.trial_account = trial_account
        # trial_account_private_key
        self.trial_account_private_key = trial_account_private_key
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # ant_chain_name
        self.ant_chain_name = ant_chain_name
        # version
        self.version = version

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.name is not None:
            result['name'] = self.name
        if self.trial_account is not None:
            result['trial_account'] = self.trial_account
        if self.trial_account_private_key is not None:
            result['trial_account_private_key'] = self.trial_account_private_key
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.ant_chain_name is not None:
            result['ant_chain_name'] = self.ant_chain_name
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('trial_account') is not None:
            self.trial_account = m.get('trial_account')
        if m.get('trial_account_private_key') is not None:
            self.trial_account_private_key = m.get('trial_account_private_key')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('ant_chain_name') is not None:
            self.ant_chain_name = m.get('ant_chain_name')
        if m.get('version') is not None:
            self.version = m.get('version')
        return self


class ApplicationCreateResp(TeaModel):
    def __init__(
        self,
        application_id: str = None,
    ):
        # 应用标识
        self.application_id = application_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.application_id is not None:
            result['application_id'] = self.application_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('application_id') is not None:
            self.application_id = m.get('application_id')
        return self


class ALiYunUnion(TeaModel):
    def __init__(
        self,
        ant_chains: List[ALiYunAntChain] = None,
        ant_consortiums: List[ALiYunAntConsortium] = None,
        consortium_id: str = None,
        members: List[ALiYunMember] = None,
        pagination: ALiYunPagination = None,
        is_exist: bool = None,
    ):
        # 联盟内链的集合
        self.ant_chains = ant_chains
        # 联盟信息
        self.ant_consortiums = ant_consortiums
        # 联盟Id
        self.consortium_id = consortium_id
        # 联盟成员信息
        self.members = members
        # 阿里云分页属性
        self.pagination = pagination
        # is_exist
        self.is_exist = is_exist

    def validate(self):
        if self.ant_chains:
            for k in self.ant_chains:
                if k:
                    k.validate()
        if self.ant_consortiums:
            for k in self.ant_consortiums:
                if k:
                    k.validate()
        if self.members:
            for k in self.members:
                if k:
                    k.validate()
        if self.pagination:
            self.pagination.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['ant_chains'] = []
        if self.ant_chains is not None:
            for k in self.ant_chains:
                result['ant_chains'].append(k.to_map() if k else None)
        result['ant_consortiums'] = []
        if self.ant_consortiums is not None:
            for k in self.ant_consortiums:
                result['ant_consortiums'].append(k.to_map() if k else None)
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        result['members'] = []
        if self.members is not None:
            for k in self.members:
                result['members'].append(k.to_map() if k else None)
        if self.pagination is not None:
            result['pagination'] = self.pagination.to_map()
        if self.is_exist is not None:
            result['is_exist'] = self.is_exist
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.ant_chains = []
        if m.get('ant_chains') is not None:
            for k in m.get('ant_chains'):
                temp_model = ALiYunAntChain()
                self.ant_chains.append(temp_model.from_map(k))
        self.ant_consortiums = []
        if m.get('ant_consortiums') is not None:
            for k in m.get('ant_consortiums'):
                temp_model = ALiYunAntConsortium()
                self.ant_consortiums.append(temp_model.from_map(k))
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        self.members = []
        if m.get('members') is not None:
            for k in m.get('members'):
                temp_model = ALiYunMember()
                self.members.append(temp_model.from_map(k))
        if m.get('pagination') is not None:
            temp_model = ALiYunPagination()
            self.pagination = temp_model.from_map(m['pagination'])
        if m.get('is_exist') is not None:
            self.is_exist = m.get('is_exist')
        return self


class PublicKeyRelation(TeaModel):
    def __init__(
        self,
        issuer_id: str = None,
        recipient_id: str = None,
    ):
        # 公钥颁发者ID
        self.issuer_id = issuer_id
        # 公钥接受者ID
        self.recipient_id = recipient_id

    def validate(self):
        self.validate_required(self.issuer_id, 'issuer_id')
        self.validate_required(self.recipient_id, 'recipient_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.issuer_id is not None:
            result['issuer_id'] = self.issuer_id
        if self.recipient_id is not None:
            result['recipient_id'] = self.recipient_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('issuer_id') is not None:
            self.issuer_id = m.get('issuer_id')
        if m.get('recipient_id') is not None:
            self.recipient_id = m.get('recipient_id')
        return self


class GetAftsUploadUrlResponse(TeaModel):
    def __init__(
        self,
        mass_token: str = None,
        upload_url: str = None,
    ):
        # 11121312
        self.mass_token = mass_token
        # 上传文件地址
        self.upload_url = upload_url

    def validate(self):
        self.validate_required(self.mass_token, 'mass_token')
        self.validate_required(self.upload_url, 'upload_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.mass_token is not None:
            result['mass_token'] = self.mass_token
        if self.upload_url is not None:
            result['upload_url'] = self.upload_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('mass_token') is not None:
            self.mass_token = m.get('mass_token')
        if m.get('upload_url') is not None:
            self.upload_url = m.get('upload_url')
        return self


class ContractTypeResp(TeaModel):
    def __init__(
        self,
        type_list: List[ContractTypeListResp] = None,
    ):
        # 合约服务类型
        self.type_list = type_list

    def validate(self):
        if self.type_list:
            for k in self.type_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['type_list'] = []
        if self.type_list is not None:
            for k in self.type_list:
                result['type_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.type_list = []
        if m.get('type_list') is not None:
            for k in m.get('type_list'):
                temp_model = ContractTypeListResp()
                self.type_list.append(temp_model.from_map(k))
        return self


class LogisticLocation(TeaModel):
    def __init__(
        self,
        address: str = None,
        city_code: str = None,
        lat: str = None,
        lon: str = None,
        track_time: int = None,
    ):
        # 结构化地址信息,规则遵循：国家、省份、城市、区县、城镇、乡村、街道、门牌号码、屋邨、大厦
        self.address = address
        # 行政区划代码
        self.city_code = city_code
        # 纬度
        self.lat = lat
        # 经度
        self.lon = lon
        # 轨迹时间戳
        self.track_time = track_time

    def validate(self):
        self.validate_required(self.lat, 'lat')
        self.validate_required(self.lon, 'lon')
        self.validate_required(self.track_time, 'track_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.address is not None:
            result['address'] = self.address
        if self.city_code is not None:
            result['city_code'] = self.city_code
        if self.lat is not None:
            result['lat'] = self.lat
        if self.lon is not None:
            result['lon'] = self.lon
        if self.track_time is not None:
            result['track_time'] = self.track_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('city_code') is not None:
            self.city_code = m.get('city_code')
        if m.get('lat') is not None:
            self.lat = m.get('lat')
        if m.get('lon') is not None:
            self.lon = m.get('lon')
        if m.get('track_time') is not None:
            self.track_time = m.get('track_time')
        return self


class ActivityBaseInfo(TeaModel):
    def __init__(
        self,
        activity_id: str = None,
        activity_name: str = None,
        activity_status: str = None,
        platform_type: str = None,
        publish_start_time: str = None,
        publish_end_time: str = None,
    ):
        # 活动ID
        self.activity_id = activity_id
        # 活动名称
        self.activity_name = activity_name
        # 活动状态
        self.activity_status = activity_status
        # 平台类型
        self.platform_type = platform_type
        # 活动开始时间
        self.publish_start_time = publish_start_time
        # 活动结束时间
        self.publish_end_time = publish_end_time

    def validate(self):
        self.validate_required(self.activity_id, 'activity_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.activity_id is not None:
            result['activity_id'] = self.activity_id
        if self.activity_name is not None:
            result['activity_name'] = self.activity_name
        if self.activity_status is not None:
            result['activity_status'] = self.activity_status
        if self.platform_type is not None:
            result['platform_type'] = self.platform_type
        if self.publish_start_time is not None:
            result['publish_start_time'] = self.publish_start_time
        if self.publish_end_time is not None:
            result['publish_end_time'] = self.publish_end_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('activity_id') is not None:
            self.activity_id = m.get('activity_id')
        if m.get('activity_name') is not None:
            self.activity_name = m.get('activity_name')
        if m.get('activity_status') is not None:
            self.activity_status = m.get('activity_status')
        if m.get('platform_type') is not None:
            self.platform_type = m.get('platform_type')
        if m.get('publish_start_time') is not None:
            self.publish_start_time = m.get('publish_start_time')
        if m.get('publish_end_time') is not None:
            self.publish_end_time = m.get('publish_end_time')
        return self


class ALiYunOrderResult(TeaModel):
    def __init__(
        self,
        request_id: str = None,
        data: str = None,
        success: bool = None,
        code: str = None,
        message: str = None,
        synchro: bool = None,
    ):
        # request_id
        self.request_id = request_id
        # data
        self.data = data
        # success
        self.success = success
        # code
        self.code = code
        # message
        self.message = message
        # synchro
        self.synchro = synchro

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.data is not None:
            result['data'] = self.data
        if self.success is not None:
            result['success'] = self.success
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.synchro is not None:
            result['synchro'] = self.synchro
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('synchro') is not None:
            self.synchro = m.get('synchro')
        return self


class QueryMappingBatchResult(TeaModel):
    def __init__(
        self,
        accounts: List[AccountMappingInfo] = None,
        total_num: int = None,
        total_page: int = None,
    ):
        # 本次查询获取的账户信息
        self.accounts = accounts
        # 该商户下总共映射账户的数量
        self.total_num = total_num
        # 该商户下账户信息的总页数
        self.total_page = total_page

    def validate(self):
        self.validate_required(self.accounts, 'accounts')
        if self.accounts:
            for k in self.accounts:
                if k:
                    k.validate()
        self.validate_required(self.total_num, 'total_num')
        self.validate_required(self.total_page, 'total_page')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['accounts'] = []
        if self.accounts is not None:
            for k in self.accounts:
                result['accounts'].append(k.to_map() if k else None)
        if self.total_num is not None:
            result['total_num'] = self.total_num
        if self.total_page is not None:
            result['total_page'] = self.total_page
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.accounts = []
        if m.get('accounts') is not None:
            for k in m.get('accounts'):
                temp_model = AccountMappingInfo()
                self.accounts.append(temp_model.from_map(k))
        if m.get('total_num') is not None:
            self.total_num = m.get('total_num')
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        return self


class ALiYunChainBlock(TeaModel):
    def __init__(
        self,
        ant_chain_id: str = None,
        block_hash: str = None,
        create_time: int = None,
        height: int = None,
        previous_hash: str = None,
        root_tx_hash: str = None,
        transaction_size: int = None,
        trans_summary_list: List[ALiYunTransactionSummary] = None,
        version: int = None,
    ):
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # block_hash
        self.block_hash = block_hash
        # create_time
        self.create_time = create_time
        # height
        self.height = height
        # previous_hash
        self.previous_hash = previous_hash
        # root_tx_hash
        self.root_tx_hash = root_tx_hash
        # transaction_size
        self.transaction_size = transaction_size
        # trans_summary_list
        self.trans_summary_list = trans_summary_list
        # Version
        self.version = version

    def validate(self):
        if self.trans_summary_list:
            for k in self.trans_summary_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.block_hash is not None:
            result['block_hash'] = self.block_hash
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.height is not None:
            result['height'] = self.height
        if self.previous_hash is not None:
            result['previous_hash'] = self.previous_hash
        if self.root_tx_hash is not None:
            result['root_tx_hash'] = self.root_tx_hash
        if self.transaction_size is not None:
            result['transaction_size'] = self.transaction_size
        result['trans_summary_list'] = []
        if self.trans_summary_list is not None:
            for k in self.trans_summary_list:
                result['trans_summary_list'].append(k.to_map() if k else None)
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('block_hash') is not None:
            self.block_hash = m.get('block_hash')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('previous_hash') is not None:
            self.previous_hash = m.get('previous_hash')
        if m.get('root_tx_hash') is not None:
            self.root_tx_hash = m.get('root_tx_hash')
        if m.get('transaction_size') is not None:
            self.transaction_size = m.get('transaction_size')
        self.trans_summary_list = []
        if m.get('trans_summary_list') is not None:
            for k in m.get('trans_summary_list'):
                temp_model = ALiYunTransactionSummary()
                self.trans_summary_list.append(temp_model.from_map(k))
        if m.get('version') is not None:
            self.version = m.get('version')
        return self


class ApplicationPageResp(TeaModel):
    def __init__(
        self,
        list: List[ApplicationPageListResp] = None,
        total: int = None,
    ):
        # 应用授权列表
        self.list = list
        # 总数
        self.total = total

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        if self.total is not None:
            result['total'] = self.total
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = ApplicationPageListResp()
                self.list.append(temp_model.from_map(k))
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class DidZKPInfo(TeaModel):
    def __init__(
        self,
        path: str = None,
        public_inputs: str = None,
        zkp_type: str = None,
    ):
        # 需要生成证明的路径
        self.path = path
        # 生成ZKP证明的公共信息
        self.public_inputs = public_inputs
        # zkp方法
        self.zkp_type = zkp_type

    def validate(self):
        self.validate_required(self.path, 'path')
        self.validate_required(self.public_inputs, 'public_inputs')
        self.validate_required(self.zkp_type, 'zkp_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.path is not None:
            result['path'] = self.path
        if self.public_inputs is not None:
            result['public_inputs'] = self.public_inputs
        if self.zkp_type is not None:
            result['zkp_type'] = self.zkp_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('path') is not None:
            self.path = m.get('path')
        if m.get('public_inputs') is not None:
            self.public_inputs = m.get('public_inputs')
        if m.get('zkp_type') is not None:
            self.zkp_type = m.get('zkp_type')
        return self


class ALiYunAccountList(TeaModel):
    def __init__(
        self,
        pagination: ALiYunPagination = None,
        accounts: List[ALiYunAccount] = None,
        consortium_admin: bool = None,
    ):
        # pagination
        self.pagination = pagination
        # accounts
        self.accounts = accounts
        # 联盟管理员
        self.consortium_admin = consortium_admin

    def validate(self):
        if self.pagination:
            self.pagination.validate()
        if self.accounts:
            for k in self.accounts:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.pagination is not None:
            result['pagination'] = self.pagination.to_map()
        result['accounts'] = []
        if self.accounts is not None:
            for k in self.accounts:
                result['accounts'].append(k.to_map() if k else None)
        if self.consortium_admin is not None:
            result['consortium_admin'] = self.consortium_admin
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pagination') is not None:
            temp_model = ALiYunPagination()
            self.pagination = temp_model.from_map(m['pagination'])
        self.accounts = []
        if m.get('accounts') is not None:
            for k in m.get('accounts'):
                temp_model = ALiYunAccount()
                self.accounts.append(temp_model.from_map(k))
        if m.get('consortium_admin') is not None:
            self.consortium_admin = m.get('consortium_admin')
        return self


class AntChainPurposeResponse(TeaModel):
    def __init__(
        self,
        status: str = None,
        purpose: str = None,
        create_time: str = None,
        chain_purpose_item: str = None,
        chain_purpose_extend: str = None,
        record_list: List[ChainPurpose] = None,
    ):
        # 用户申报用途状态
        self.status = status
        # 已申报的用途，比如供应链金融
        self.purpose = purpose
        # 申报时间
        self.create_time = create_time
        # 简短说明用途
        self.chain_purpose_item = chain_purpose_item
        # 用途详情
        self.chain_purpose_extend = chain_purpose_extend
        # 申请用途列表
        self.record_list = record_list

    def validate(self):
        if self.record_list:
            for k in self.record_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.status is not None:
            result['status'] = self.status
        if self.purpose is not None:
            result['purpose'] = self.purpose
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.chain_purpose_item is not None:
            result['chain_purpose_item'] = self.chain_purpose_item
        if self.chain_purpose_extend is not None:
            result['chain_purpose_extend'] = self.chain_purpose_extend
        result['record_list'] = []
        if self.record_list is not None:
            for k in self.record_list:
                result['record_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('purpose') is not None:
            self.purpose = m.get('purpose')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('chain_purpose_item') is not None:
            self.chain_purpose_item = m.get('chain_purpose_item')
        if m.get('chain_purpose_extend') is not None:
            self.chain_purpose_extend = m.get('chain_purpose_extend')
        self.record_list = []
        if m.get('record_list') is not None:
            for k in m.get('record_list'):
                temp_model = ChainPurpose()
                self.record_list.append(temp_model.from_map(k))
        return self


class ALiYunTransactionReceipt(TeaModel):
    def __init__(
        self,
        data: str = None,
        gas_used: str = None,
        result: int = None,
        logs: List[str] = None,
    ):
        # data
        self.data = data
        # gas_used
        self.gas_used = gas_used
        # result
        self.result = result
        # logs
        self.logs = logs

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.data is not None:
            result['data'] = self.data
        if self.gas_used is not None:
            result['gas_used'] = self.gas_used
        if self.result is not None:
            result['result'] = self.result
        if self.logs is not None:
            result['logs'] = self.logs
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('gas_used') is not None:
            self.gas_used = m.get('gas_used')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('logs') is not None:
            self.logs = m.get('logs')
        return self


class ContractCreateProcessResp(TeaModel):
    def __init__(
        self,
        status: str = None,
        progress_info_list: List[InstanceProgressInfo] = None,
    ):
        # 当前进度信息
        self.status = status
        # 合约部署进度
        self.progress_info_list = progress_info_list

    def validate(self):
        if self.progress_info_list:
            for k in self.progress_info_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.status is not None:
            result['status'] = self.status
        result['progress_info_list'] = []
        if self.progress_info_list is not None:
            for k in self.progress_info_list:
                result['progress_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('status') is not None:
            self.status = m.get('status')
        self.progress_info_list = []
        if m.get('progress_info_list') is not None:
            for k in m.get('progress_info_list'):
                temp_model = InstanceProgressInfo()
                self.progress_info_list.append(temp_model.from_map(k))
        return self


class ContractCreateResp(TeaModel):
    def __init__(
        self,
        service_id: str = None,
    ):
        # 合约标识
        self.service_id = service_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.service_id is not None:
            result['service_id'] = self.service_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        return self


class CreateBlockchainInfo(TeaModel):
    def __init__(
        self,
        bizid: str = None,
        blockchain_status: str = None,
        blockchain_type: str = None,
        blockchain_name: str = None,
        blockchan_node_num: int = None,
        blockchain_create_time: int = None,
    ):
        # 链id
        self.bizid = bizid
        # 链的状态
        self.blockchain_status = blockchain_status
        # 链的类型
        self.blockchain_type = blockchain_type
        # 链的名称
        self.blockchain_name = blockchain_name
        # 节点数量
        self.blockchan_node_num = blockchan_node_num
        # 创建时间
        self.blockchain_create_time = blockchain_create_time

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.blockchain_status, 'blockchain_status')
        self.validate_required(self.blockchain_type, 'blockchain_type')
        self.validate_required(self.blockchain_name, 'blockchain_name')
        self.validate_required(self.blockchan_node_num, 'blockchan_node_num')
        self.validate_required(self.blockchain_create_time, 'blockchain_create_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.blockchain_status is not None:
            result['blockchain_status'] = self.blockchain_status
        if self.blockchain_type is not None:
            result['blockchain_type'] = self.blockchain_type
        if self.blockchain_name is not None:
            result['blockchain_name'] = self.blockchain_name
        if self.blockchan_node_num is not None:
            result['blockchan_node_num'] = self.blockchan_node_num
        if self.blockchain_create_time is not None:
            result['blockchain_create_time'] = self.blockchain_create_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('blockchain_status') is not None:
            self.blockchain_status = m.get('blockchain_status')
        if m.get('blockchain_type') is not None:
            self.blockchain_type = m.get('blockchain_type')
        if m.get('blockchain_name') is not None:
            self.blockchain_name = m.get('blockchain_name')
        if m.get('blockchan_node_num') is not None:
            self.blockchan_node_num = m.get('blockchan_node_num')
        if m.get('blockchain_create_time') is not None:
            self.blockchain_create_time = m.get('blockchain_create_time')
        return self


class VcShareResult(TeaModel):
    def __init__(
        self,
        vc_id: str = None,
        target_did: str = None,
        tx_hash: str = None,
        status: bool = None,
        msg: str = None,
    ):
        # 目标分享的VC的id
        self.vc_id = vc_id
        # 分享给目标接受者的did
        self.target_did = target_did
        # 分享链上VC数据的交易hash，可用于直连区块链查询交易内容时使用。
        self.tx_hash = tx_hash
        # 分享是否成功，true：成功，false：失败
        self.status = status
        # 失败的对应原因信息
        self.msg = msg

    def validate(self):
        self.validate_required(self.vc_id, 'vc_id')
        self.validate_required(self.target_did, 'target_did')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        if self.target_did is not None:
            result['target_did'] = self.target_did
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.status is not None:
            result['status'] = self.status
        if self.msg is not None:
            result['msg'] = self.msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        if m.get('target_did') is not None:
            self.target_did = m.get('target_did')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        return self


class ContractEncryptKeyItem(TeaModel):
    def __init__(
        self,
        key: str = None,
        type: int = None,
        value: str = None,
    ):
        # 字段对应的id
        self.key = key
        # 0:encrypt_text,
        # 1:encrypt_array_text,
        # 2:encrypt_int
        # 3:encrypt_array_int
        self.type = type
        # 字段对应的数据
        self.value = value

    def validate(self):
        self.validate_required(self.key, 'key')
        self.validate_required(self.type, 'type')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.type is not None:
            result['type'] = self.type
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class DidEvent(TeaModel):
    def __init__(
        self,
        action: str = None,
        did: str = None,
        did_doc: str = None,
        from_: str = None,
        height: int = None,
        tx_hash: str = None,
        tx_index: int = None,
    ):
        # 事件对应的合约方法
        self.action = action
        # 对应did
        self.did = did
        # did对应doc
        self.did_doc = did_doc
        # 本次事件的触发者
        self.from_ = from_
        # 6500
        self.height = height
        # 交易hash
        self.tx_hash = tx_hash
        # 交易在区块中的index
        self.tx_index = tx_index

    def validate(self):
        self.validate_required(self.action, 'action')
        self.validate_required(self.did, 'did')
        self.validate_required(self.did_doc, 'did_doc')
        self.validate_required(self.from_, 'from_')
        self.validate_required(self.height, 'height')
        self.validate_required(self.tx_hash, 'tx_hash')
        self.validate_required(self.tx_index, 'tx_index')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.action is not None:
            result['action'] = self.action
        if self.did is not None:
            result['did'] = self.did
        if self.did_doc is not None:
            result['did_doc'] = self.did_doc
        if self.from_ is not None:
            result['from'] = self.from_
        if self.height is not None:
            result['height'] = self.height
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.tx_index is not None:
            result['tx_index'] = self.tx_index
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('action') is not None:
            self.action = m.get('action')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('did_doc') is not None:
            self.did_doc = m.get('did_doc')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('tx_index') is not None:
            self.tx_index = m.get('tx_index')
        return self


class VcTransmitPayload(TeaModel):
    def __init__(
        self,
        target_verifier: List[VcTransmitTargetStruct] = None,
        vc_id: str = None,
        vc_content: str = None,
    ):
        # 目标did相关信息列表
        self.target_verifier = target_verifier
        # 要传输的vc_id
        self.vc_id = vc_id
        # vc原文，如果vc原文出现在传输接口，那么VC仓库不会从本地查找，而是直接将传输的VC上链
        self.vc_content = vc_content

    def validate(self):
        self.validate_required(self.target_verifier, 'target_verifier')
        if self.target_verifier:
            for k in self.target_verifier:
                if k:
                    k.validate()
        self.validate_required(self.vc_id, 'vc_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['target_verifier'] = []
        if self.target_verifier is not None:
            for k in self.target_verifier:
                result['target_verifier'].append(k.to_map() if k else None)
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        if self.vc_content is not None:
            result['vc_content'] = self.vc_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.target_verifier = []
        if m.get('target_verifier') is not None:
            for k in m.get('target_verifier'):
                temp_model = VcTransmitTargetStruct()
                self.target_verifier.append(temp_model.from_map(k))
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        if m.get('vc_content') is not None:
            self.vc_content = m.get('vc_content')
        return self


class ALiYunChainContractContent(TeaModel):
    def __init__(
        self,
        content: str = None,
        content_id: str = None,
        content_name: str = None,
        create_time: int = None,
        is_directory: bool = None,
        parent_content_id: str = None,
        project_id: str = None,
        update_time: int = None,
    ):
        # content
        self.content = content
        # content_id
        self.content_id = content_id
        # content_name
        self.content_name = content_name
        # create_time
        self.create_time = create_time
        # is_directory
        self.is_directory = is_directory
        # parent_content_id
        self.parent_content_id = parent_content_id
        # project_id
        self.project_id = project_id
        # update_time
        self.update_time = update_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.content is not None:
            result['content'] = self.content
        if self.content_id is not None:
            result['content_id'] = self.content_id
        if self.content_name is not None:
            result['content_name'] = self.content_name
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.is_directory is not None:
            result['is_directory'] = self.is_directory
        if self.parent_content_id is not None:
            result['parent_content_id'] = self.parent_content_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('content_id') is not None:
            self.content_id = m.get('content_id')
        if m.get('content_name') is not None:
            self.content_name = m.get('content_name')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('is_directory') is not None:
            self.is_directory = m.get('is_directory')
        if m.get('parent_content_id') is not None:
            self.parent_content_id = m.get('parent_content_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class SettleInfo(TeaModel):
    def __init__(
        self,
        settle_detail_infos: List[SettleDetailInfo] = None,
    ):
        # 结算详细信息
        self.settle_detail_infos = settle_detail_infos

    def validate(self):
        self.validate_required(self.settle_detail_infos, 'settle_detail_infos')
        if self.settle_detail_infos:
            for k in self.settle_detail_infos:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['settle_detail_infos'] = []
        if self.settle_detail_infos is not None:
            for k in self.settle_detail_infos:
                result['settle_detail_infos'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.settle_detail_infos = []
        if m.get('settle_detail_infos') is not None:
            for k in m.get('settle_detail_infos'):
                temp_model = SettleDetailInfo()
                self.settle_detail_infos.append(temp_model.from_map(k))
        return self


class Result(TeaModel):
    def __init__(
        self,
        consortium_id: str = None,
    ):
        # 联盟id
        self.consortium_id = consortium_id

    def validate(self):
        self.validate_required(self.consortium_id, 'consortium_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        return self


class UpdateDidService(TeaModel):
    def __init__(
        self,
        previous_version: int = None,
        service_id: str = None,
        service_info: DidServiceInfo = None,
        service_type: str = None,
    ):
        # 待更新did之前的版本号
        self.previous_version = previous_version
        # did doc中的service id
        self.service_id = service_id
        # 服务信息
        self.service_info = service_info
        # 服务类型
        self.service_type = service_type

    def validate(self):
        self.validate_required(self.previous_version, 'previous_version')
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.service_info, 'service_info')
        if self.service_info:
            self.service_info.validate()
        self.validate_required(self.service_type, 'service_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.previous_version is not None:
            result['previous_version'] = self.previous_version
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.service_info is not None:
            result['service_info'] = self.service_info.to_map()
        if self.service_type is not None:
            result['service_type'] = self.service_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('previous_version') is not None:
            self.previous_version = m.get('previous_version')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('service_info') is not None:
            temp_model = DidServiceInfo()
            self.service_info = temp_model.from_map(m['service_info'])
        if m.get('service_type') is not None:
            self.service_type = m.get('service_type')
        return self


class AccountInfoWithBiz(TeaModel):
    def __init__(
        self,
        address: str = None,
        biz_code: str = None,
        biz_name: str = None,
        biz_type: str = None,
        create_time: str = None,
        end_time: str = None,
        extension: str = None,
        group_code: str = None,
        group_name: str = None,
        identity_type: int = None,
        identity_value: str = None,
        label: str = None,
        parent: str = None,
        stat_date: str = None,
        user_id: str = None,
        user_name: str = None,
        user_type: str = None,
    ):
        # 注册地址
        self.address = address
        # 业务场景code
        self.biz_code = biz_code
        # 业务名称
        self.biz_name = biz_name
        # 业务类型，预留
        self.biz_type = biz_type
        # 用户创建时间，格式yyyy-MM-dd HH:mm:ss
        self.create_time = create_time
        # 用户注销时间，格式yyyy-MM-dd HH:mm:ss
        self.end_time = end_time
        # 扩展字段，使用json格式
        self.extension = extension
        # 业务组code
        self.group_code = group_code
        # 业务组名称
        self.group_name = group_name
        # 唯一标示类型，0:统一信用代码,1:开票机构代码,2:身份证号
        self.identity_type = identity_type
        # 唯一标示码
        self.identity_value = identity_value
        # 用户标签
        self.label = label
        # 间连用户的上层直连用户名称
        self.parent = parent
        # 统计时间，时间格式：yyyy-MM-dd HH:mm:ss
        self.stat_date = stat_date
        # 用户id
        self.user_id = user_id
        # 用户或企业名称
        self.user_name = user_name
        # 用户类型：direct直连，indirect间连，partner合作伙伴
        self.user_type = user_type

    def validate(self):
        self.validate_required(self.biz_code, 'biz_code')
        self.validate_required(self.biz_name, 'biz_name')
        if self.extension is not None:
            self.validate_max_length(self.extension, 'extension', 200)
        self.validate_required(self.group_code, 'group_code')
        self.validate_required(self.group_name, 'group_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.address is not None:
            result['address'] = self.address
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.biz_name is not None:
            result['biz_name'] = self.biz_name
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.extension is not None:
            result['extension'] = self.extension
        if self.group_code is not None:
            result['group_code'] = self.group_code
        if self.group_name is not None:
            result['group_name'] = self.group_name
        if self.identity_type is not None:
            result['identity_type'] = self.identity_type
        if self.identity_value is not None:
            result['identity_value'] = self.identity_value
        if self.label is not None:
            result['label'] = self.label
        if self.parent is not None:
            result['parent'] = self.parent
        if self.stat_date is not None:
            result['stat_date'] = self.stat_date
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_type is not None:
            result['user_type'] = self.user_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('biz_name') is not None:
            self.biz_name = m.get('biz_name')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('extension') is not None:
            self.extension = m.get('extension')
        if m.get('group_code') is not None:
            self.group_code = m.get('group_code')
        if m.get('group_name') is not None:
            self.group_name = m.get('group_name')
        if m.get('identity_type') is not None:
            self.identity_type = m.get('identity_type')
        if m.get('identity_value') is not None:
            self.identity_value = m.get('identity_value')
        if m.get('label') is not None:
            self.label = m.get('label')
        if m.get('parent') is not None:
            self.parent = m.get('parent')
        if m.get('stat_date') is not None:
            self.stat_date = m.get('stat_date')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        return self


class BasicCarInfo(TeaModel):
    def __init__(
        self,
        license_no: str = None,
        vin: str = None,
        engine_no: str = None,
        register_date: str = None,
        model_code: str = None,
        use_nature_code: str = None,
        mortgage: bool = None,
    ):
        # 车牌号码
        self.license_no = license_no
        # 车架号
        self.vin = vin
        # 发动机号
        self.engine_no = engine_no
        # 初登日期
        self.register_date = register_date
        # 车辆型号
        self.model_code = model_code
        # 营运性质
        self.use_nature_code = use_nature_code
        # 是否抵押
        self.mortgage = mortgage

    def validate(self):
        self.validate_required(self.license_no, 'license_no')
        self.validate_required(self.vin, 'vin')
        self.validate_required(self.engine_no, 'engine_no')
        self.validate_required(self.register_date, 'register_date')
        self.validate_required(self.model_code, 'model_code')
        self.validate_required(self.use_nature_code, 'use_nature_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.license_no is not None:
            result['license_no'] = self.license_no
        if self.vin is not None:
            result['vin'] = self.vin
        if self.engine_no is not None:
            result['engine_no'] = self.engine_no
        if self.register_date is not None:
            result['register_date'] = self.register_date
        if self.model_code is not None:
            result['model_code'] = self.model_code
        if self.use_nature_code is not None:
            result['use_nature_code'] = self.use_nature_code
        if self.mortgage is not None:
            result['mortgage'] = self.mortgage
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('license_no') is not None:
            self.license_no = m.get('license_no')
        if m.get('vin') is not None:
            self.vin = m.get('vin')
        if m.get('engine_no') is not None:
            self.engine_no = m.get('engine_no')
        if m.get('register_date') is not None:
            self.register_date = m.get('register_date')
        if m.get('model_code') is not None:
            self.model_code = m.get('model_code')
        if m.get('use_nature_code') is not None:
            self.use_nature_code = m.get('use_nature_code')
        if m.get('mortgage') is not None:
            self.mortgage = m.get('mortgage')
        return self


class IndustryQualificationInfo(TeaModel):
    def __init__(
        self,
        industry_qualification_type: str = None,
        industry_qualification_image: str = None,
    ):
        # 商户行业资质类型
        self.industry_qualification_type = industry_qualification_type
        # 商户行业资质图片
        self.industry_qualification_image = industry_qualification_image

    def validate(self):
        self.validate_required(self.industry_qualification_type, 'industry_qualification_type')
        self.validate_required(self.industry_qualification_image, 'industry_qualification_image')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.industry_qualification_type is not None:
            result['industry_qualification_type'] = self.industry_qualification_type
        if self.industry_qualification_image is not None:
            result['industry_qualification_image'] = self.industry_qualification_image
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('industry_qualification_type') is not None:
            self.industry_qualification_type = m.get('industry_qualification_type')
        if m.get('industry_qualification_image') is not None:
            self.industry_qualification_image = m.get('industry_qualification_image')
        return self


class IssueInfo(TeaModel):
    def __init__(
        self,
        batch_id: str = None,
        contract_id: str = None,
        credit_limit: str = None,
        err_msg: str = None,
        expire_date: str = None,
        issue_date: str = None,
        issue_id: str = None,
        status: int = None,
        waybill_id: str = None,
    ):
        # 信用流转批次号
        self.batch_id = batch_id
        # 合同编号
        self.contract_id = contract_id
        # 信用凭证额度
        self.credit_limit = credit_limit
        # 失败原因信息
        self.err_msg = err_msg
        # 信用凭证到期时间
        self.expire_date = expire_date
        # 信用凭证发起时间
        self.issue_date = issue_date
        # 信用流转凭证
        self.issue_id = issue_id
        # 发行结果状态
        # -1:发行失败状态， 0:未完成状态， 1:已发行状态
        self.status = status
        # 发行信用流转的运单号
        self.waybill_id = waybill_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.batch_id is not None:
            result['batch_id'] = self.batch_id
        if self.contract_id is not None:
            result['contract_id'] = self.contract_id
        if self.credit_limit is not None:
            result['credit_limit'] = self.credit_limit
        if self.err_msg is not None:
            result['err_msg'] = self.err_msg
        if self.expire_date is not None:
            result['expire_date'] = self.expire_date
        if self.issue_date is not None:
            result['issue_date'] = self.issue_date
        if self.issue_id is not None:
            result['issue_id'] = self.issue_id
        if self.status is not None:
            result['status'] = self.status
        if self.waybill_id is not None:
            result['waybill_id'] = self.waybill_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('batch_id') is not None:
            self.batch_id = m.get('batch_id')
        if m.get('contract_id') is not None:
            self.contract_id = m.get('contract_id')
        if m.get('credit_limit') is not None:
            self.credit_limit = m.get('credit_limit')
        if m.get('err_msg') is not None:
            self.err_msg = m.get('err_msg')
        if m.get('expire_date') is not None:
            self.expire_date = m.get('expire_date')
        if m.get('issue_date') is not None:
            self.issue_date = m.get('issue_date')
        if m.get('issue_id') is not None:
            self.issue_id = m.get('issue_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('waybill_id') is not None:
            self.waybill_id = m.get('waybill_id')
        return self


class ApplicationGetSkResp(TeaModel):
    def __init__(
        self,
        sk: str = None,
    ):
        # 应用秘钥
        self.sk = sk

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sk is not None:
            result['sk'] = self.sk
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sk') is not None:
            self.sk = m.get('sk')
        return self


class CommonResponsePageableStructBody(TeaModel):
    def __init__(
        self,
        page_size: str = None,
        current: str = None,
        total: str = None,
        list: List[TriggerLogDTOStructBody] = None,
    ):
        # 页面规格
        self.page_size = page_size
        # 当前页码
        self.current = current
        # 总条数
        self.total = total
        # 失败日志数组
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.current is not None:
            result['current'] = self.current
        if self.total is not None:
            result['total'] = self.total
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('total') is not None:
            self.total = m.get('total')
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = TriggerLogDTOStructBody()
                self.list.append(temp_model.from_map(k))
        return self


class ALiYunChainRegion(TeaModel):
    def __init__(
        self,
        region_id: str = None,
        region_name: str = None,
    ):
        # region_id
        self.region_id = region_id
        # region_name
        self.region_name = region_name

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.region_id is not None:
            result['region_id'] = self.region_id
        if self.region_name is not None:
            result['region_name'] = self.region_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        if m.get('region_name') is not None:
            self.region_name = m.get('region_name')
        return self


class ALiYunBuyUnion(TeaModel):
    def __init__(
        self,
        consortium_name: str = None,
        consortium_id: str = None,
    ):
        # consortium_name
        self.consortium_name = consortium_name
        # consortium_id
        self.consortium_id = consortium_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.consortium_name is not None:
            result['consortium_name'] = self.consortium_name
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('consortium_name') is not None:
            self.consortium_name = m.get('consortium_name')
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        return self


class VcShareStruct(TeaModel):
    def __init__(
        self,
        vc_id: str = None,
        owner_did: str = None,
        index: str = None,
        signature: str = None,
    ):
        # 分享的目标VC的id
        self.vc_id = vc_id
        # 目标的VC持有者的did
        self.owner_did = owner_did
        # 在支持声明的claim字段级别分享能力时使用，可以指定哪些字段隐藏，哪些字段分享。示例中标记为”1“的是隐藏，”0“的是分享明文。
        self.index = index
        # 非托管模式下owner_did的签名，作为授权凭证
        self.signature = signature

    def validate(self):
        self.validate_required(self.vc_id, 'vc_id')
        self.validate_required(self.owner_did, 'owner_did')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        if self.owner_did is not None:
            result['owner_did'] = self.owner_did
        if self.index is not None:
            result['index'] = self.index
        if self.signature is not None:
            result['signature'] = self.signature
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        if m.get('owner_did') is not None:
            self.owner_did = m.get('owner_did')
        if m.get('index') is not None:
            self.index = m.get('index')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        return self


class MiniAppBrowserAuthType(TeaModel):
    def __init__(
        self,
        auth_type: str = None,
    ):
        # 授权类型
        self.auth_type = auth_type

    def validate(self):
        self.validate_required(self.auth_type, 'auth_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_type is not None:
            result['auth_type'] = self.auth_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_type') is not None:
            self.auth_type = m.get('auth_type')
        return self


class TxInfo(TeaModel):
    def __init__(
        self,
        tx_receipt_result: str = None,
        biz_id: str = None,
        tx_hash: str = None,
        tx_type: str = None,
        timestamp: int = None,
        block_number: str = None,
        nonce: str = None,
        from_: str = None,
        to: str = None,
        signature: str = None,
    ):
        # 上链结果
        self.tx_receipt_result = tx_receipt_result
        # 区块链id
        self.biz_id = biz_id
        # 交易hash
        self.tx_hash = tx_hash
        # 交易类型
        self.tx_type = tx_type
        # 时间戳
        self.timestamp = timestamp
        # 区块高度
        self.block_number = block_number
        # 交易随机数Nonce
        self.nonce = nonce
        # 发起地址
        self.from_ = from_
        # 目标地址
        self.to = to
        # 签名
        self.signature = signature

    def validate(self):
        self.validate_required(self.tx_receipt_result, 'tx_receipt_result')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.tx_hash, 'tx_hash')
        self.validate_required(self.tx_type, 'tx_type')
        self.validate_required(self.timestamp, 'timestamp')
        self.validate_required(self.block_number, 'block_number')
        self.validate_required(self.nonce, 'nonce')
        self.validate_required(self.from_, 'from_')
        self.validate_required(self.to, 'to')
        self.validate_required(self.signature, 'signature')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tx_receipt_result is not None:
            result['tx_receipt_result'] = self.tx_receipt_result
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.tx_type is not None:
            result['tx_type'] = self.tx_type
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.nonce is not None:
            result['nonce'] = self.nonce
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        if self.signature is not None:
            result['signature'] = self.signature
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tx_receipt_result') is not None:
            self.tx_receipt_result = m.get('tx_receipt_result')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('tx_type') is not None:
            self.tx_type = m.get('tx_type')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        return self


class ServiceDiscoveryResult(TeaModel):
    def __init__(
        self,
        did: str = None,
        services: List[DidDocServicesInfo] = None,
    ):
        # 提供该服务能力的did
        self.did = did
        # 提供该服务能力的endpoint信息
        self.services = services

    def validate(self):
        self.validate_required(self.did, 'did')
        self.validate_required(self.services, 'services')
        if self.services:
            for k in self.services:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.did is not None:
            result['did'] = self.did
        result['services'] = []
        if self.services is not None:
            for k in self.services:
                result['services'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('did') is not None:
            self.did = m.get('did')
        self.services = []
        if m.get('services') is not None:
            for k in m.get('services'):
                temp_model = DidDocServicesInfo()
                self.services.append(temp_model.from_map(k))
        return self


class BlockchainBrowserTransactionStatistic(TeaModel):
    def __init__(
        self,
        bizid: str = None,
        create_time: int = None,
        date_time: str = None,
        last_sum_block_height: int = None,
        trans_count: int = None,
    ):
        # 蚂蚁链id
        self.bizid = bizid
        # 开始时间
        self.create_time = create_time
        # 时间点
        self.date_time = date_time
        # 统计时间内最新块高度
        self.last_sum_block_height = last_sum_block_height
        # 统计周期内交易的数量
        self.trans_count = trans_count

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.create_time, 'create_time')
        self.validate_required(self.date_time, 'date_time')
        self.validate_required(self.last_sum_block_height, 'last_sum_block_height')
        self.validate_required(self.trans_count, 'trans_count')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.date_time is not None:
            result['date_time'] = self.date_time
        if self.last_sum_block_height is not None:
            result['last_sum_block_height'] = self.last_sum_block_height
        if self.trans_count is not None:
            result['trans_count'] = self.trans_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('date_time') is not None:
            self.date_time = m.get('date_time')
        if m.get('last_sum_block_height') is not None:
            self.last_sum_block_height = m.get('last_sum_block_height')
        if m.get('trans_count') is not None:
            self.trans_count = m.get('trans_count')
        return self


class ALiYunChainRest(TeaModel):
    def __init__(
        self,
        access_id: str = None,
        create_time: int = None,
        rest: str = None,
        update_time: int = None,
        result: str = None,
    ):
        # access_id
        self.access_id = access_id
        # create_time
        self.create_time = create_time
        # rest
        self.rest = rest
        # update_time
        self.update_time = update_time
        # REST开通结果
        self.result = result

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.access_id is not None:
            result['access_id'] = self.access_id
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.rest is not None:
            result['rest'] = self.rest
        if self.update_time is not None:
            result['update_time'] = self.update_time
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('access_id') is not None:
            self.access_id = m.get('access_id')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('rest') is not None:
            self.rest = m.get('rest')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class VcControllerAddUserRegisterPayload(TeaModel):
    def __init__(
        self,
        did: str = None,
        public_key: str = None,
        vc_channel: str = None,
    ):
        # 注册用户did
        self.did = did
        # 用户did对应的授权公钥
        self.public_key = public_key
        # 业务区块连的bizid
        self.vc_channel = vc_channel

    def validate(self):
        self.validate_required(self.did, 'did')
        self.validate_required(self.public_key, 'public_key')
        if self.vc_channel is not None:
            self.validate_max_length(self.vc_channel, 'vc_channel', 32)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.did is not None:
            result['did'] = self.did
        if self.public_key is not None:
            result['public_key'] = self.public_key
        if self.vc_channel is not None:
            result['vc_channel'] = self.vc_channel
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('public_key') is not None:
            self.public_key = m.get('public_key')
        if m.get('vc_channel') is not None:
            self.vc_channel = m.get('vc_channel')
        return self


class AccountInfo(TeaModel):
    def __init__(
        self,
        ep_amount: int = None,
        ep_code: str = None,
    ):
        # 版通数量
        self.ep_amount = ep_amount
        # 版通代码
        self.ep_code = ep_code

    def validate(self):
        self.validate_required(self.ep_amount, 'ep_amount')
        self.validate_required(self.ep_code, 'ep_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ep_amount is not None:
            result['ep_amount'] = self.ep_amount
        if self.ep_code is not None:
            result['ep_code'] = self.ep_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ep_amount') is not None:
            self.ep_amount = m.get('ep_amount')
        if m.get('ep_code') is not None:
            self.ep_code = m.get('ep_code')
        return self


class ALiYunChainConfigOption(TeaModel):
    def __init__(
        self,
        config_option: str = None,
        show_name: str = None,
        enable: bool = None,
    ):
        # config_option
        self.config_option = config_option
        # show_name
        self.show_name = show_name
        # enable
        self.enable = enable

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.config_option is not None:
            result['config_option'] = self.config_option
        if self.show_name is not None:
            result['show_name'] = self.show_name
        if self.enable is not None:
            result['enable'] = self.enable
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('config_option') is not None:
            self.config_option = m.get('config_option')
        if m.get('show_name') is not None:
            self.show_name = m.get('show_name')
        if m.get('enable') is not None:
            self.enable = m.get('enable')
        return self


class ALiYunDeleteResource(TeaModel):
    def __init__(
        self,
        data: bool = None,
        success: bool = None,
    ):
        # data
        self.data = data
        # success
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.data is not None:
            result['data'] = self.data
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class TransactionInfo(TeaModel):
    def __init__(
        self,
        timestamp: int = None,
        hash: str = None,
        height: int = None,
        blockhash: str = None,
        from_: str = None,
        to: str = None,
        txtype: int = None,
        value: int = None,
        logs: str = None,
        gasused: int = None,
        result: str = None,
        json: str = None,
    ):
        # 交易时间戳
        self.timestamp = timestamp
        # 交易hash
        self.hash = hash
        # 交易块高
        self.height = height
        # 交易所在块高
        self.blockhash = blockhash
        # 交易来源
        self.from_ = from_
        # 交易地址
        self.to = to
        # 交易类型
        self.txtype = txtype
        # 转账额度
        self.value = value
        # logs
        self.logs = logs
        # 燃料消耗
        self.gasused = gasused
        # result
        self.result = result
        # 拓展json字段
        self.json = json

    def validate(self):
        self.validate_required(self.timestamp, 'timestamp')
        self.validate_required(self.hash, 'hash')
        self.validate_required(self.height, 'height')
        self.validate_required(self.blockhash, 'blockhash')
        self.validate_required(self.from_, 'from_')
        self.validate_required(self.to, 'to')
        self.validate_required(self.txtype, 'txtype')
        self.validate_required(self.value, 'value')
        self.validate_required(self.logs, 'logs')
        self.validate_required(self.gasused, 'gasused')
        self.validate_required(self.result, 'result')
        self.validate_required(self.json, 'json')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.hash is not None:
            result['hash'] = self.hash
        if self.height is not None:
            result['height'] = self.height
        if self.blockhash is not None:
            result['blockhash'] = self.blockhash
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        if self.txtype is not None:
            result['txtype'] = self.txtype
        if self.value is not None:
            result['value'] = self.value
        if self.logs is not None:
            result['logs'] = self.logs
        if self.gasused is not None:
            result['gasused'] = self.gasused
        if self.result is not None:
            result['result'] = self.result
        if self.json is not None:
            result['json'] = self.json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('blockhash') is not None:
            self.blockhash = m.get('blockhash')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('txtype') is not None:
            self.txtype = m.get('txtype')
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('logs') is not None:
            self.logs = m.get('logs')
        if m.get('gasused') is not None:
            self.gasused = m.get('gasused')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('json') is not None:
            self.json = m.get('json')
        return self


class ALiYunChainMiniAppAuthorization(TeaModel):
    def __init__(
        self,
        ant_chain_id: str = None,
        q_rcode_type: str = None,
        authorization_type: str = None,
    ):
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # q_r_code_type
        self.q_rcode_type = q_rcode_type
        # authorization_type
        self.authorization_type = authorization_type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.q_rcode_type is not None:
            result['q_r_code_type'] = self.q_rcode_type
        if self.authorization_type is not None:
            result['authorization_type'] = self.authorization_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('q_r_code_type') is not None:
            self.q_rcode_type = m.get('q_r_code_type')
        if m.get('authorization_type') is not None:
            self.authorization_type = m.get('authorization_type')
        return self


class OldTaskInfo(TeaModel):
    def __init__(
        self,
        task_name: str = None,
        app_id: str = None,
        survey_id: str = None,
        notes: str = None,
        tenant_id: str = None,
        operator: str = None,
        banner_title: str = None,
        banner_image_urls: str = None,
        banner_image_full_urls: List[str] = None,
        question_num: int = None,
        task_link_url: str = None,
        person_divide_content: str = None,
        city_divide_urls: str = None,
        city_divide_full_urls: List[str] = None,
        sample_num: int = None,
        completed_num: int = None,
        product_code_type: str = None,
        product_capacity: int = None,
        prize_channel: int = None,
        alipay_account_id: str = None,
        prize_type: int = None,
        full_red_packet_amount: str = None,
        full_red_packet_text_info: str = None,
        examine_red_packet_amount: str = None,
        cert_instance_id: str = None,
        cert_instance_detail: CertInstanceDetail = None,
        verify_comment: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        review_content: str = None,
        crowd_config: str = None,
        task_id: str = None,
        status: int = None,
    ):
        # 任务标题(同一个租户不能重复)
        self.task_name = task_name
        # appId
        self.app_id = app_id
        # 问卷ID
        self.survey_id = survey_id
        # 备注信息
        self.notes = notes
        # 租户ID
        self.tenant_id = tenant_id
        # 操作者
        self.operator = operator
        # banner标题
        self.banner_title = banner_title
        # banner图片地址（最多支持3张）
        self.banner_image_urls = banner_image_urls
        # banner 图片地址, 拼装后的url
        self.banner_image_full_urls = banner_image_full_urls
        # 题量
        self.question_num = question_num
        # 任务连接地址
        self.task_link_url = task_link_url
        # 人群划分描述
        self.person_divide_content = person_divide_content
        # 城市列表
        self.city_divide_urls = city_divide_urls
        # 城市列表, 拼装后的url
        self.city_divide_full_urls = city_divide_full_urls
        # 样本数量
        self.sample_num = sample_num
        # 完成样本量
        self.completed_num = completed_num
        # 产品下单code类型（1-资源包 2-后付费）
        self.product_code_type = product_code_type
        # 产品余量
        self.product_capacity = product_capacity
        # 奖励渠道（0-手动发支付宝余额 1-海豚红包 2-问卷自带）
        self.prize_channel = prize_channel
        # 支付宝账号
        self.alipay_account_id = alipay_account_id
        # 奖励类型（0-定额红包）
        self.prize_type = prize_type
        # 全额红包金额，奖励渠道为0和1时
        self.full_red_packet_amount = full_red_packet_amount
        # 全额红包描述，奖励渠道为2时，此处必填
        self.full_red_packet_text_info = full_red_packet_text_info
        # 甄别红包金额
        self.examine_red_packet_amount = examine_red_packet_amount
        # 关联的证书instanceId
        self.cert_instance_id = cert_instance_id
        # 证书实例详情
        self.cert_instance_detail = cert_instance_detail
        # 审核建议
        self.verify_comment = verify_comment
        # 任务创建时间
        self.gmt_create = gmt_create
        # 任务更新时间
        self.gmt_modified = gmt_modified
        # 审核理由
        self.review_content = review_content
        # 人群配置信息
        self.crowd_config = crowd_config
        # 任务ID
        self.task_id = task_id
        # 状态
        self.status = status

    def validate(self):
        self.validate_required(self.task_name, 'task_name')
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.survey_id, 'survey_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.operator, 'operator')
        self.validate_required(self.banner_title, 'banner_title')
        self.validate_required(self.question_num, 'question_num')
        self.validate_required(self.task_link_url, 'task_link_url')
        self.validate_required(self.sample_num, 'sample_num')
        self.validate_required(self.completed_num, 'completed_num')
        self.validate_required(self.product_code_type, 'product_code_type')
        self.validate_required(self.product_capacity, 'product_capacity')
        self.validate_required(self.prize_channel, 'prize_channel')
        self.validate_required(self.prize_type, 'prize_type')
        self.validate_required(self.full_red_packet_amount, 'full_red_packet_amount')
        self.validate_required(self.examine_red_packet_amount, 'examine_red_packet_amount')
        if self.cert_instance_detail:
            self.cert_instance_detail.validate()
        self.validate_required(self.gmt_create, 'gmt_create')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.task_name is not None:
            result['task_name'] = self.task_name
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.survey_id is not None:
            result['survey_id'] = self.survey_id
        if self.notes is not None:
            result['notes'] = self.notes
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.operator is not None:
            result['operator'] = self.operator
        if self.banner_title is not None:
            result['banner_title'] = self.banner_title
        if self.banner_image_urls is not None:
            result['banner_image_urls'] = self.banner_image_urls
        if self.banner_image_full_urls is not None:
            result['banner_image_full_urls'] = self.banner_image_full_urls
        if self.question_num is not None:
            result['question_num'] = self.question_num
        if self.task_link_url is not None:
            result['task_link_url'] = self.task_link_url
        if self.person_divide_content is not None:
            result['person_divide_content'] = self.person_divide_content
        if self.city_divide_urls is not None:
            result['city_divide_urls'] = self.city_divide_urls
        if self.city_divide_full_urls is not None:
            result['city_divide_full_urls'] = self.city_divide_full_urls
        if self.sample_num is not None:
            result['sample_num'] = self.sample_num
        if self.completed_num is not None:
            result['completed_num'] = self.completed_num
        if self.product_code_type is not None:
            result['product_code_type'] = self.product_code_type
        if self.product_capacity is not None:
            result['product_capacity'] = self.product_capacity
        if self.prize_channel is not None:
            result['prize_channel'] = self.prize_channel
        if self.alipay_account_id is not None:
            result['alipay_account_id'] = self.alipay_account_id
        if self.prize_type is not None:
            result['prize_type'] = self.prize_type
        if self.full_red_packet_amount is not None:
            result['full_red_packet_amount'] = self.full_red_packet_amount
        if self.full_red_packet_text_info is not None:
            result['full_red_packet_text_info'] = self.full_red_packet_text_info
        if self.examine_red_packet_amount is not None:
            result['examine_red_packet_amount'] = self.examine_red_packet_amount
        if self.cert_instance_id is not None:
            result['cert_instance_id'] = self.cert_instance_id
        if self.cert_instance_detail is not None:
            result['cert_instance_detail'] = self.cert_instance_detail.to_map()
        if self.verify_comment is not None:
            result['verify_comment'] = self.verify_comment
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.review_content is not None:
            result['review_content'] = self.review_content
        if self.crowd_config is not None:
            result['crowd_config'] = self.crowd_config
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('task_name') is not None:
            self.task_name = m.get('task_name')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('survey_id') is not None:
            self.survey_id = m.get('survey_id')
        if m.get('notes') is not None:
            self.notes = m.get('notes')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('banner_title') is not None:
            self.banner_title = m.get('banner_title')
        if m.get('banner_image_urls') is not None:
            self.banner_image_urls = m.get('banner_image_urls')
        if m.get('banner_image_full_urls') is not None:
            self.banner_image_full_urls = m.get('banner_image_full_urls')
        if m.get('question_num') is not None:
            self.question_num = m.get('question_num')
        if m.get('task_link_url') is not None:
            self.task_link_url = m.get('task_link_url')
        if m.get('person_divide_content') is not None:
            self.person_divide_content = m.get('person_divide_content')
        if m.get('city_divide_urls') is not None:
            self.city_divide_urls = m.get('city_divide_urls')
        if m.get('city_divide_full_urls') is not None:
            self.city_divide_full_urls = m.get('city_divide_full_urls')
        if m.get('sample_num') is not None:
            self.sample_num = m.get('sample_num')
        if m.get('completed_num') is not None:
            self.completed_num = m.get('completed_num')
        if m.get('product_code_type') is not None:
            self.product_code_type = m.get('product_code_type')
        if m.get('product_capacity') is not None:
            self.product_capacity = m.get('product_capacity')
        if m.get('prize_channel') is not None:
            self.prize_channel = m.get('prize_channel')
        if m.get('alipay_account_id') is not None:
            self.alipay_account_id = m.get('alipay_account_id')
        if m.get('prize_type') is not None:
            self.prize_type = m.get('prize_type')
        if m.get('full_red_packet_amount') is not None:
            self.full_red_packet_amount = m.get('full_red_packet_amount')
        if m.get('full_red_packet_text_info') is not None:
            self.full_red_packet_text_info = m.get('full_red_packet_text_info')
        if m.get('examine_red_packet_amount') is not None:
            self.examine_red_packet_amount = m.get('examine_red_packet_amount')
        if m.get('cert_instance_id') is not None:
            self.cert_instance_id = m.get('cert_instance_id')
        if m.get('cert_instance_detail') is not None:
            temp_model = CertInstanceDetail()
            self.cert_instance_detail = temp_model.from_map(m['cert_instance_detail'])
        if m.get('verify_comment') is not None:
            self.verify_comment = m.get('verify_comment')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('review_content') is not None:
            self.review_content = m.get('review_content')
        if m.get('crowd_config') is not None:
            self.crowd_config = m.get('crowd_config')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class ALiYunChainDownload(TeaModel):
    def __init__(
        self,
        private_key: str = None,
        download_path: ALiYunDownloadPath = None,
    ):
        # private_key
        self.private_key = private_key
        # download_path
        self.download_path = download_path

    def validate(self):
        if self.download_path:
            self.download_path.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.private_key is not None:
            result['private_key'] = self.private_key
        if self.download_path is not None:
            result['download_path'] = self.download_path.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('private_key') is not None:
            self.private_key = m.get('private_key')
        if m.get('download_path') is not None:
            temp_model = ALiYunDownloadPath()
            self.download_path = temp_model.from_map(m['download_path'])
        return self


class AgreementConfigInfoDTO(TeaModel):
    def __init__(
        self,
        agreement_name: str = None,
        agreement_url: str = None,
        agreement_desc: str = None,
        version: int = None,
    ):
        # 协议名称
        self.agreement_name = agreement_name
        # 协议链接
        self.agreement_url = agreement_url
        # 协议描述
        self.agreement_desc = agreement_desc
        # 协议版本
        self.version = version

    def validate(self):
        self.validate_required(self.agreement_name, 'agreement_name')
        self.validate_required(self.agreement_url, 'agreement_url')
        self.validate_required(self.agreement_desc, 'agreement_desc')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.agreement_name is not None:
            result['agreement_name'] = self.agreement_name
        if self.agreement_url is not None:
            result['agreement_url'] = self.agreement_url
        if self.agreement_desc is not None:
            result['agreement_desc'] = self.agreement_desc
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('agreement_name') is not None:
            self.agreement_name = m.get('agreement_name')
        if m.get('agreement_url') is not None:
            self.agreement_url = m.get('agreement_url')
        if m.get('agreement_desc') is not None:
            self.agreement_desc = m.get('agreement_desc')
        if m.get('version') is not None:
            self.version = m.get('version')
        return self


class ALiYunChainStatics(TeaModel):
    def __init__(
        self,
        alias: str = None,
        dt: int = None,
        trans_count: int = None,
        last_sum_block_height: int = None,
        creat_time: int = None,
    ):
        # alias
        self.alias = alias
        # Dt
        self.dt = dt
        # trans_count
        self.trans_count = trans_count
        # last_sum_block_height
        self.last_sum_block_height = last_sum_block_height
        # creat_time
        self.creat_time = creat_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.alias is not None:
            result['alias'] = self.alias
        if self.dt is not None:
            result['dt'] = self.dt
        if self.trans_count is not None:
            result['trans_count'] = self.trans_count
        if self.last_sum_block_height is not None:
            result['last_sum_block_height'] = self.last_sum_block_height
        if self.creat_time is not None:
            result['creat_time'] = self.creat_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('alias') is not None:
            self.alias = m.get('alias')
        if m.get('dt') is not None:
            self.dt = m.get('dt')
        if m.get('trans_count') is not None:
            self.trans_count = m.get('trans_count')
        if m.get('last_sum_block_height') is not None:
            self.last_sum_block_height = m.get('last_sum_block_height')
        if m.get('creat_time') is not None:
            self.creat_time = m.get('creat_time')
        return self


class ALiYunCertificateApplications(TeaModel):
    def __init__(
        self,
        pagination: ALiYunPagination = None,
        certificate_applications: List[ALiYunCertificateApplication] = None,
    ):
        # pagination
        self.pagination = pagination
        # certificate_application
        self.certificate_applications = certificate_applications

    def validate(self):
        if self.pagination:
            self.pagination.validate()
        if self.certificate_applications:
            for k in self.certificate_applications:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.pagination is not None:
            result['pagination'] = self.pagination.to_map()
        result['certificate_applications'] = []
        if self.certificate_applications is not None:
            for k in self.certificate_applications:
                result['certificate_applications'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pagination') is not None:
            temp_model = ALiYunPagination()
            self.pagination = temp_model.from_map(m['pagination'])
        self.certificate_applications = []
        if m.get('certificate_applications') is not None:
            for k in m.get('certificate_applications'):
                temp_model = ALiYunCertificateApplication()
                self.certificate_applications.append(temp_model.from_map(k))
        return self


class VcTransmitInitResult(TeaModel):
    def __init__(
        self,
        is_success: bool = None,
        message: str = None,
        target_verifier: str = None,
        need_signature_tx_hash: str = None,
    ):
        # 初始化成功与否
        self.is_success = is_success
        # 失败时返回的额外信息
        self.message = message
        # 接受者did
        self.target_verifier = target_verifier
        # 待签名的交易hash
        self.need_signature_tx_hash = need_signature_tx_hash

    def validate(self):
        self.validate_required(self.is_success, 'is_success')
        self.validate_required(self.message, 'message')
        self.validate_required(self.target_verifier, 'target_verifier')
        self.validate_required(self.need_signature_tx_hash, 'need_signature_tx_hash')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.is_success is not None:
            result['is_success'] = self.is_success
        if self.message is not None:
            result['message'] = self.message
        if self.target_verifier is not None:
            result['target_verifier'] = self.target_verifier
        if self.need_signature_tx_hash is not None:
            result['need_signature_tx_hash'] = self.need_signature_tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('is_success') is not None:
            self.is_success = m.get('is_success')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('target_verifier') is not None:
            self.target_verifier = m.get('target_verifier')
        if m.get('need_signature_tx_hash') is not None:
            self.need_signature_tx_hash = m.get('need_signature_tx_hash')
        return self


class EntityInfo(TeaModel):
    def __init__(
        self,
        type: int = None,
        value: str = None,
    ):
        # 0，身份证；1，电话；2，email，3，企业营业执照号
        self.type = type
        # 具体号码
        self.value = value

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class NodeInfo(TeaModel):
    def __init__(
        self,
        blockheight: int = None,
        nodename: str = None,
        status: bool = None,
        version: str = None,
    ):
        # 链的区块高度
        self.blockheight = blockheight
        # 节点名称
        self.nodename = nodename
        # 节点健康状况
        self.status = status
        # 节点版本
        self.version = version

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.blockheight is not None:
            result['blockheight'] = self.blockheight
        if self.nodename is not None:
            result['nodename'] = self.nodename
        if self.status is not None:
            result['status'] = self.status
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('blockheight') is not None:
            self.blockheight = m.get('blockheight')
        if m.get('nodename') is not None:
            self.nodename = m.get('nodename')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('version') is not None:
            self.version = m.get('version')
        return self


class DidServiceType(TeaModel):
    def __init__(
        self,
        access_mode: str = None,
        description: str = None,
        did: str = None,
        service_input: str = None,
        service_output: str = None,
        service_type: str = None,
    ):
        # 枚举类型，描述访问服务的方式
        self.access_mode = access_mode
        # 对服务的文字描述，<1000个字符
        self.description = description
        # 服务类型创建者did
        self.did = did
        # { "item1":"", "item2":"",...
        self.service_input = service_input
        # 返回值类型描述，json形式
        self.service_output = service_output
        # 自定义服务类型，字符数16～32个
        self.service_type = service_type

    def validate(self):
        if self.description is not None:
            self.validate_max_length(self.description, 'description', 1000)
        self.validate_required(self.did, 'did')
        self.validate_required(self.service_type, 'service_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.access_mode is not None:
            result['access_mode'] = self.access_mode
        if self.description is not None:
            result['description'] = self.description
        if self.did is not None:
            result['did'] = self.did
        if self.service_input is not None:
            result['service_input'] = self.service_input
        if self.service_output is not None:
            result['service_output'] = self.service_output
        if self.service_type is not None:
            result['service_type'] = self.service_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('access_mode') is not None:
            self.access_mode = m.get('access_mode')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('service_input') is not None:
            self.service_input = m.get('service_input')
        if m.get('service_output') is not None:
            self.service_output = m.get('service_output')
        if m.get('service_type') is not None:
            self.service_type = m.get('service_type')
        return self


class ApplicationQueryReq(TeaModel):
    def __init__(
        self,
        application_id: str = None,
    ):
        # 应用程序ID
        self.application_id = application_id

    def validate(self):
        self.validate_required(self.application_id, 'application_id')
        if self.application_id is not None:
            self.validate_max_length(self.application_id, 'application_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.application_id is not None:
            result['application_id'] = self.application_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('application_id') is not None:
            self.application_id = m.get('application_id')
        return self


class OpenApiRoyaltyDetailInfoPojo(TeaModel):
    def __init__(
        self,
        percentage: str = None,
        amount: str = None,
        royalty_type: str = None,
        trans_out_type: str = None,
        trans_out: str = None,
        trans_in_type: str = None,
        trans_in: str = None,
        desc: str = None,
    ):
        # 分账比例
        self.percentage = percentage
        # 分账金额
        self.amount = amount
        # 分账类型
        self.royalty_type = royalty_type
        # 支出方账户类型
        self.trans_out_type = trans_out_type
        # 支出方账户
        self.trans_out = trans_out
        # 收入方账户类型
        self.trans_in_type = trans_in_type
        # 收入方账户
        self.trans_in = trans_in
        # 分账描述
        self.desc = desc

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.percentage is not None:
            result['percentage'] = self.percentage
        if self.amount is not None:
            result['amount'] = self.amount
        if self.royalty_type is not None:
            result['royalty_type'] = self.royalty_type
        if self.trans_out_type is not None:
            result['trans_out_type'] = self.trans_out_type
        if self.trans_out is not None:
            result['trans_out'] = self.trans_out
        if self.trans_in_type is not None:
            result['trans_in_type'] = self.trans_in_type
        if self.trans_in is not None:
            result['trans_in'] = self.trans_in
        if self.desc is not None:
            result['desc'] = self.desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('percentage') is not None:
            self.percentage = m.get('percentage')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('royalty_type') is not None:
            self.royalty_type = m.get('royalty_type')
        if m.get('trans_out_type') is not None:
            self.trans_out_type = m.get('trans_out_type')
        if m.get('trans_out') is not None:
            self.trans_out = m.get('trans_out')
        if m.get('trans_in_type') is not None:
            self.trans_in_type = m.get('trans_in_type')
        if m.get('trans_in') is not None:
            self.trans_in = m.get('trans_in')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        return self


class ContractInfo(TeaModel):
    def __init__(
        self,
        contract: str = None,
        hash: str = None,
        timestamp: int = None,
    ):
        # 合约地址
        self.contract = contract
        # 部署hash
        self.hash = hash
        # 合约部署时间
        self.timestamp = timestamp

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.contract is not None:
            result['contract'] = self.contract
        if self.hash is not None:
            result['hash'] = self.hash
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('contract') is not None:
            self.contract = m.get('contract')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        return self


class AddVC(TeaModel):
    def __init__(
        self,
        content_hash: str = None,
        issuer_hash: str = None,
        status: str = None,
        subject_hash: str = None,
        vc_id: str = None,
    ):
        # vc原文hash
        self.content_hash = content_hash
        # issuer后缀的hash值
        self.issuer_hash = issuer_hash
        # valid or invalid
        self.status = status
        # 接收者后缀hash值
        self.subject_hash = subject_hash
        # 可验证声明id
        self.vc_id = vc_id

    def validate(self):
        self.validate_required(self.content_hash, 'content_hash')
        self.validate_required(self.issuer_hash, 'issuer_hash')
        self.validate_required(self.status, 'status')
        self.validate_required(self.subject_hash, 'subject_hash')
        self.validate_required(self.vc_id, 'vc_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.content_hash is not None:
            result['content_hash'] = self.content_hash
        if self.issuer_hash is not None:
            result['issuer_hash'] = self.issuer_hash
        if self.status is not None:
            result['status'] = self.status
        if self.subject_hash is not None:
            result['subject_hash'] = self.subject_hash
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('content_hash') is not None:
            self.content_hash = m.get('content_hash')
        if m.get('issuer_hash') is not None:
            self.issuer_hash = m.get('issuer_hash')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('subject_hash') is not None:
            self.subject_hash = m.get('subject_hash')
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        return self


class ValueUnitPair(TeaModel):
    def __init__(
        self,
        value: int = None,
        unit: str = None,
    ):
        # 数值
        self.value = value
        # 单位
        self.unit = unit

    def validate(self):
        self.validate_required(self.value, 'value')
        self.validate_required(self.unit, 'unit')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.value is not None:
            result['value'] = self.value
        if self.unit is not None:
            result['unit'] = self.unit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        return self


class ALiYunChainMiniAppCodeCreate(TeaModel):
    def __init__(
        self,
        ant_chain_id: str = None,
        transaction_hash: str = None,
        base_64qrcode_png: str = None,
        q_rcode_content: str = None,
    ):
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # transaction_hash
        self.transaction_hash = transaction_hash
        # base64_q_r_code_p_n_g
        self.base_64qrcode_png = base_64qrcode_png
        # q_r_code_content
        self.q_rcode_content = q_rcode_content

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.transaction_hash is not None:
            result['transaction_hash'] = self.transaction_hash
        if self.base_64qrcode_png is not None:
            result['base64_q_r_code_p_n_g'] = self.base_64qrcode_png
        if self.q_rcode_content is not None:
            result['q_r_code_content'] = self.q_rcode_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('transaction_hash') is not None:
            self.transaction_hash = m.get('transaction_hash')
        if m.get('base64_q_r_code_p_n_g') is not None:
            self.base_64qrcode_png = m.get('base64_q_r_code_p_n_g')
        if m.get('q_r_code_content') is not None:
            self.q_rcode_content = m.get('q_r_code_content')
        return self


class Curve(TeaModel):
    def __init__(
        self,
        date: str = None,
        value: str = None,
    ):
        # 分布以day为单位的日期
        self.date = date
        # 以day为单位的一天凭证颁发的数据量统计。
        self.value = value

    def validate(self):
        self.validate_required(self.date, 'date')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.date is not None:
            result['date'] = self.date
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class NotaryMetaParam(TeaModel):
    def __init__(
        self,
        phase: str = None,
        properties: str = None,
        token: str = None,
    ):
        # 描述本条存证在存证事务中的阶段，用户可自行维护
        self.phase = phase
        # 扩展字段
        self.properties = properties
        # 全局唯一的存证事务ID
        self.token = token

    def validate(self):
        self.validate_required(self.phase, 'phase')
        self.validate_required(self.token, 'token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.phase is not None:
            result['phase'] = self.phase
        if self.properties is not None:
            result['properties'] = self.properties
        if self.token is not None:
            result['token'] = self.token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('phase') is not None:
            self.phase = m.get('phase')
        if m.get('properties') is not None:
            self.properties = m.get('properties')
        if m.get('token') is not None:
            self.token = m.get('token')
        return self


class BizInfo(TeaModel):
    def __init__(
        self,
        client_tenent: str = None,
        code: str = None,
    ):
        # BPWZPFCN
        self.client_tenent = client_tenent
        # 业务代码
        self.code = code

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.client_tenent is not None:
            result['client_tenent'] = self.client_tenent
        if self.code is not None:
            result['code'] = self.code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('client_tenent') is not None:
            self.client_tenent = m.get('client_tenent')
        if m.get('code') is not None:
            self.code = m.get('code')
        return self


class EPTradeInfo(TeaModel):
    def __init__(
        self,
        ep_code: str = None,
        tx_code: str = None,
        tx_from: str = None,
        tx_time: int = None,
        tx_to: str = None,
        tx_value: int = None,
    ):
        # 版通代码
        self.ep_code = ep_code
        # 版通交易号
        self.tx_code = tx_code
        # 卖方账户
        self.tx_from = tx_from
        # 交易时间戳
        self.tx_time = tx_time
        # 买方账户
        self.tx_to = tx_to
        # 交易数量
        self.tx_value = tx_value

    def validate(self):
        self.validate_required(self.ep_code, 'ep_code')
        self.validate_required(self.tx_code, 'tx_code')
        self.validate_required(self.tx_from, 'tx_from')
        self.validate_required(self.tx_time, 'tx_time')
        self.validate_required(self.tx_to, 'tx_to')
        self.validate_required(self.tx_value, 'tx_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ep_code is not None:
            result['ep_code'] = self.ep_code
        if self.tx_code is not None:
            result['tx_code'] = self.tx_code
        if self.tx_from is not None:
            result['tx_from'] = self.tx_from
        if self.tx_time is not None:
            result['tx_time'] = self.tx_time
        if self.tx_to is not None:
            result['tx_to'] = self.tx_to
        if self.tx_value is not None:
            result['tx_value'] = self.tx_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ep_code') is not None:
            self.ep_code = m.get('ep_code')
        if m.get('tx_code') is not None:
            self.tx_code = m.get('tx_code')
        if m.get('tx_from') is not None:
            self.tx_from = m.get('tx_from')
        if m.get('tx_time') is not None:
            self.tx_time = m.get('tx_time')
        if m.get('tx_to') is not None:
            self.tx_to = m.get('tx_to')
        if m.get('tx_value') is not None:
            self.tx_value = m.get('tx_value')
        return self


class Identity(TeaModel):
    def __init__(
        self,
        agent: str = None,
        agent_id: str = None,
        cert_name: str = None,
        cert_no: str = None,
        cert_type: str = None,
        legal_person: str = None,
        legal_person_id: str = None,
        mobile_no: str = None,
        properties: str = None,
        user_type: str = None,
    ):
        # 经办人姓名，企业认证必选
        self.agent = agent
        # 经办人身份证
        self.agent_id = agent_id
        # 用户名称
        self.cert_name = cert_name
        # 证件号
        self.cert_no = cert_no
        # 证件类型，个人只支持身份证IDENTITY_CARD，企业支持UNIFIED_SOCIAL_CREDIT_CODE（统一社会信用代码）和ENTERPRISE_REGISTERED_NUMBER（企业工商注册号
        self.cert_type = cert_type
        # 法人姓名，企业认证必选
        self.legal_person = legal_person
        # 法人身份证,  企业认证必选
        self.legal_person_id = legal_person_id
        # 用户手机号码
        self.mobile_no = mobile_no
        # 扩展属性
        self.properties = properties
        # 用户类型，PERSON或者ENTERPRISE
        self.user_type = user_type

    def validate(self):
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_type, 'cert_type')
        self.validate_required(self.user_type, 'user_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.agent is not None:
            result['agent'] = self.agent
        if self.agent_id is not None:
            result['agent_id'] = self.agent_id
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.legal_person is not None:
            result['legal_person'] = self.legal_person
        if self.legal_person_id is not None:
            result['legal_person_id'] = self.legal_person_id
        if self.mobile_no is not None:
            result['mobile_no'] = self.mobile_no
        if self.properties is not None:
            result['properties'] = self.properties
        if self.user_type is not None:
            result['user_type'] = self.user_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('agent') is not None:
            self.agent = m.get('agent')
        if m.get('agent_id') is not None:
            self.agent_id = m.get('agent_id')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('legal_person') is not None:
            self.legal_person = m.get('legal_person')
        if m.get('legal_person_id') is not None:
            self.legal_person_id = m.get('legal_person_id')
        if m.get('mobile_no') is not None:
            self.mobile_no = m.get('mobile_no')
        if m.get('properties') is not None:
            self.properties = m.get('properties')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        return self


class ContactInfo(TeaModel):
    def __init__(
        self,
        name: str = None,
        mobile: str = None,
        email: str = None,
        phone: str = None,
        id_card_no: str = None,
    ):
        # 联系人名字
        self.name = name
        # 手机号
        self.mobile = mobile
        # 电子邮箱
        self.email = email
        # 电话
        self.phone = phone
        # 身份证号
        self.id_card_no = id_card_no

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.mobile, 'mobile')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.email is not None:
            result['email'] = self.email
        if self.phone is not None:
            result['phone'] = self.phone
        if self.id_card_no is not None:
            result['id_card_no'] = self.id_card_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('id_card_no') is not None:
            self.id_card_no = m.get('id_card_no')
        return self


class FundInfo(TeaModel):
    def __init__(
        self,
        balance: str = None,
        settle_quota: str = None,
        shop_id: str = None,
    ):
        # 可提现余额
        self.balance = balance
        # 待结算额度
        self.settle_quota = settle_quota
        # 商户id
        self.shop_id = shop_id

    def validate(self):
        self.validate_required(self.balance, 'balance')
        self.validate_required(self.settle_quota, 'settle_quota')
        self.validate_required(self.shop_id, 'shop_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.balance is not None:
            result['balance'] = self.balance
        if self.settle_quota is not None:
            result['settle_quota'] = self.settle_quota
        if self.shop_id is not None:
            result['shop_id'] = self.shop_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('balance') is not None:
            self.balance = m.get('balance')
        if m.get('settle_quota') is not None:
            self.settle_quota = m.get('settle_quota')
        if m.get('shop_id') is not None:
            self.shop_id = m.get('shop_id')
        return self


class VcUserRegisterPayload(TeaModel):
    def __init__(
        self,
        public_key: str = None,
        vc_channel: str = None,
    ):
        # 用户did对应的授权公钥
        self.public_key = public_key
        # 业务区块连的bizid
        self.vc_channel = vc_channel

    def validate(self):
        if self.vc_channel is not None:
            self.validate_max_length(self.vc_channel, 'vc_channel', 32)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.public_key is not None:
            result['public_key'] = self.public_key
        if self.vc_channel is not None:
            result['vc_channel'] = self.vc_channel
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('public_key') is not None:
            self.public_key = m.get('public_key')
        if m.get('vc_channel') is not None:
            self.vc_channel = m.get('vc_channel')
        return self


class ALiYunHandleBabelMns(TeaModel):
    def __init__(
        self,
        message: str = None,
        request_id: str = None,
        success: bool = None,
    ):
        # message
        self.message = message
        # request_id
        self.request_id = request_id
        # success
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.message is not None:
            result['message'] = self.message
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class Item(TeaModel):
    def __init__(
        self,
        desc: str = None,
        ext_info: str = None,
        key: str = None,
        title: str = None,
        type: str = None,
    ):
        # 溯源项的具体内容
        self.desc = desc
        # 扩展信息 ，json格式
        self.ext_info = ext_info
        # 溯源项的键值
        self.key = key
        # 溯源项的中文标题
        self.title = title
        # 内容类型
        self.type = type

    def validate(self):
        self.validate_required(self.desc, 'desc')
        self.validate_required(self.ext_info, 'ext_info')
        self.validate_required(self.key, 'key')
        self.validate_required(self.title, 'title')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.desc is not None:
            result['desc'] = self.desc
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        if self.key is not None:
            result['key'] = self.key
        if self.title is not None:
            result['title'] = self.title
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class TappInfo(TeaModel):
    def __init__(
        self,
        taap_id: str = None,
        tapp_version: int = None,
    ):
        # C3S可信计算TAPP应用标识
        self.taap_id = taap_id
        # C3S可信计算TAPP版本
        self.tapp_version = tapp_version

    def validate(self):
        self.validate_required(self.taap_id, 'taap_id')
        self.validate_required(self.tapp_version, 'tapp_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.taap_id is not None:
            result['taap_id'] = self.taap_id
        if self.tapp_version is not None:
            result['tapp_version'] = self.tapp_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('taap_id') is not None:
            self.taap_id = m.get('taap_id')
        if m.get('tapp_version') is not None:
            self.tapp_version = m.get('tapp_version')
        return self


class BaasUnionInfo(TeaModel):
    def __init__(
        self,
        union_name: str = None,
        union_description: str = None,
        union_user: str = None,
        union_user_cell: str = None,
        union_user_mail: str = None,
    ):
        # 联盟名称
        self.union_name = union_name
        # 描述
        self.union_description = union_description
        # 联系人
        self.union_user = union_user
        # 联盟联系人手机号码
        self.union_user_cell = union_user_cell
        # 联盟联系人邮箱
        self.union_user_mail = union_user_mail

    def validate(self):
        self.validate_required(self.union_name, 'union_name')
        self.validate_required(self.union_description, 'union_description')
        self.validate_required(self.union_user, 'union_user')
        self.validate_required(self.union_user_cell, 'union_user_cell')
        self.validate_required(self.union_user_mail, 'union_user_mail')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.union_name is not None:
            result['union_name'] = self.union_name
        if self.union_description is not None:
            result['union_description'] = self.union_description
        if self.union_user is not None:
            result['union_user'] = self.union_user
        if self.union_user_cell is not None:
            result['union_user_cell'] = self.union_user_cell
        if self.union_user_mail is not None:
            result['union_user_mail'] = self.union_user_mail
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('union_name') is not None:
            self.union_name = m.get('union_name')
        if m.get('union_description') is not None:
            self.union_description = m.get('union_description')
        if m.get('union_user') is not None:
            self.union_user = m.get('union_user')
        if m.get('union_user_cell') is not None:
            self.union_user_cell = m.get('union_user_cell')
        if m.get('union_user_mail') is not None:
            self.union_user_mail = m.get('union_user_mail')
        return self


class TransactionPo(TeaModel):
    def __init__(
        self,
        block_hash: str = None,
        from_: str = None,
        gas_used: int = None,
        hash: str = None,
        height: int = None,
        result: str = None,
        timestamp: int = None,
        to: str = None,
        tx_type: int = None,
        value: int = None,
    ):
        # 交易所在块hash
        self.block_hash = block_hash
        # 交易来源
        self.from_ = from_
        # gas消耗
        self.gas_used = gas_used
        # 交易hash
        self.hash = hash
        # 交易所在块 块高
        self.height = height
        # 交易返回结果
        self.result = result
        # 交易时间
        self.timestamp = timestamp
        # 交易地址
        self.to = to
        # 交易类型 同SDK
        self.tx_type = tx_type
        # 转账额度
        self.value = value

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.block_hash is not None:
            result['block_hash'] = self.block_hash
        if self.from_ is not None:
            result['from'] = self.from_
        if self.gas_used is not None:
            result['gas_used'] = self.gas_used
        if self.hash is not None:
            result['hash'] = self.hash
        if self.height is not None:
            result['height'] = self.height
        if self.result is not None:
            result['result'] = self.result
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.to is not None:
            result['to'] = self.to
        if self.tx_type is not None:
            result['tx_type'] = self.tx_type
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('block_hash') is not None:
            self.block_hash = m.get('block_hash')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('gas_used') is not None:
            self.gas_used = m.get('gas_used')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('tx_type') is not None:
            self.tx_type = m.get('tx_type')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class VcTransmitResult(TeaModel):
    def __init__(
        self,
        is_success: bool = None,
        message: str = None,
        target_verifier: str = None,
        tx_hash: str = None,
    ):
        # 成功或者失败
        self.is_success = is_success
        # 失败信息
        self.message = message
        # 验证verifier did
        self.target_verifier = target_verifier
        # 交易hash
        self.tx_hash = tx_hash

    def validate(self):
        self.validate_required(self.is_success, 'is_success')
        self.validate_required(self.target_verifier, 'target_verifier')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.is_success is not None:
            result['is_success'] = self.is_success
        if self.message is not None:
            result['message'] = self.message
        if self.target_verifier is not None:
            result['target_verifier'] = self.target_verifier
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('is_success') is not None:
            self.is_success = m.get('is_success')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('target_verifier') is not None:
            self.target_verifier = m.get('target_verifier')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class RoyaltyEntity(TeaModel):
    def __init__(
        self,
        type: str = None,
        account: str = None,
        name: str = None,
        memo: str = None,
    ):
        # 分账接收方类型
        self.type = type
        # 分账接收方账号
        self.account = account
        # 分账接收方真实姓名
        self.name = name
        # 分账关系描述
        self.memo = memo

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.account, 'account')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.account is not None:
            result['account'] = self.account
        if self.name is not None:
            result['name'] = self.name
        if self.memo is not None:
            result['memo'] = self.memo
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('memo') is not None:
            self.memo = m.get('memo')
        return self


class TsrResponse(TeaModel):
    def __init__(
        self,
        hashed_message: str = None,
        hash_algorithm: str = None,
        ts: str = None,
    ):
        # hash后的信息
        self.hashed_message = hashed_message
        # 哈希算法
        self.hash_algorithm = hash_algorithm
        # 时间
        self.ts = ts

    def validate(self):
        self.validate_required(self.hashed_message, 'hashed_message')
        self.validate_required(self.hash_algorithm, 'hash_algorithm')
        self.validate_required(self.ts, 'ts')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.hashed_message is not None:
            result['hashed_message'] = self.hashed_message
        if self.hash_algorithm is not None:
            result['hash_algorithm'] = self.hash_algorithm
        if self.ts is not None:
            result['ts'] = self.ts
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('hashed_message') is not None:
            self.hashed_message = m.get('hashed_message')
        if m.get('hash_algorithm') is not None:
            self.hash_algorithm = m.get('hash_algorithm')
        if m.get('ts') is not None:
            self.ts = m.get('ts')
        return self


class GoodsDetail(TeaModel):
    def __init__(
        self,
        goods_id: str = None,
        goods_name: str = None,
        quantity: str = None,
        price: str = None,
        goods_category: str = None,
        categories_tree: str = None,
        show_url: str = None,
        goods_ean_id: str = None,
        out_item_id: str = None,
        out_sku_id: str = None,
    ):
        # 商品编号
        self.goods_id = goods_id
        # 商品名称
        self.goods_name = goods_name
        # 商品数量
        self.quantity = quantity
        # 商品单价
        self.price = price
        # 商品类目
        self.goods_category = goods_category
        # 商品类目树
        self.categories_tree = categories_tree
        # 商品的展示地址
        self.show_url = show_url
        # 商品69条码
        self.goods_ean_id = goods_ean_id
        # 商家侧小程序商品 ID
        self.out_item_id = out_item_id
        # 商家侧小程序商品ID
        self.out_sku_id = out_sku_id

    def validate(self):
        self.validate_required(self.goods_id, 'goods_id')
        self.validate_required(self.goods_name, 'goods_name')
        self.validate_required(self.quantity, 'quantity')
        self.validate_required(self.price, 'price')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.goods_id is not None:
            result['goods_id'] = self.goods_id
        if self.goods_name is not None:
            result['goods_name'] = self.goods_name
        if self.quantity is not None:
            result['quantity'] = self.quantity
        if self.price is not None:
            result['price'] = self.price
        if self.goods_category is not None:
            result['goods_category'] = self.goods_category
        if self.categories_tree is not None:
            result['categories_tree'] = self.categories_tree
        if self.show_url is not None:
            result['show_url'] = self.show_url
        if self.goods_ean_id is not None:
            result['goods_ean_id'] = self.goods_ean_id
        if self.out_item_id is not None:
            result['out_item_id'] = self.out_item_id
        if self.out_sku_id is not None:
            result['out_sku_id'] = self.out_sku_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('goods_id') is not None:
            self.goods_id = m.get('goods_id')
        if m.get('goods_name') is not None:
            self.goods_name = m.get('goods_name')
        if m.get('quantity') is not None:
            self.quantity = m.get('quantity')
        if m.get('price') is not None:
            self.price = m.get('price')
        if m.get('goods_category') is not None:
            self.goods_category = m.get('goods_category')
        if m.get('categories_tree') is not None:
            self.categories_tree = m.get('categories_tree')
        if m.get('show_url') is not None:
            self.show_url = m.get('show_url')
        if m.get('goods_ean_id') is not None:
            self.goods_ean_id = m.get('goods_ean_id')
        if m.get('out_item_id') is not None:
            self.out_item_id = m.get('out_item_id')
        if m.get('out_sku_id') is not None:
            self.out_sku_id = m.get('out_sku_id')
        return self


class TriggerDTOStructBody(TeaModel):
    def __init__(
        self,
        name: str = None,
        type: str = None,
        source: str = None,
        create_time: str = None,
        error_message: str = None,
        status: str = None,
        option: str = None,
        checkpoint: CheckPointStructBody = None,
        pending_error_logs: str = None,
    ):
        # 名称
        self.name = name
        # 类型
        self.type = type
        # 源
        self.source = source
        # 创建时间
        self.create_time = create_time
        # 错误信息
        self.error_message = error_message
        # 状态
        self.status = status
        # option（map结构，由于金融云无map接口所以通过string类型传输json格式）
        self.option = option
        # checkpoint类
        self.checkpoint = checkpoint
        # 待处理的错误事件总数
        self.pending_error_logs = pending_error_logs

    def validate(self):
        if self.checkpoint:
            self.checkpoint.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.source is not None:
            result['source'] = self.source
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.status is not None:
            result['status'] = self.status
        if self.option is not None:
            result['option'] = self.option
        if self.checkpoint is not None:
            result['checkpoint'] = self.checkpoint.to_map()
        if self.pending_error_logs is not None:
            result['pending_error_logs'] = self.pending_error_logs
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('option') is not None:
            self.option = m.get('option')
        if m.get('checkpoint') is not None:
            temp_model = CheckPointStructBody()
            self.checkpoint = temp_model.from_map(m['checkpoint'])
        if m.get('pending_error_logs') is not None:
            self.pending_error_logs = m.get('pending_error_logs')
        return self


class CrowdNodeDTO(TeaModel):
    def __init__(
        self,
        node_id: str = None,
        node_type: CrowdNodeTypeEnum = None,
        exclude: bool = None,
        node_config: str = None,
    ):
        # 节点id
        self.node_id = node_id
        # 节点类型
        self.node_type = node_type
        # 是否排除
        self.exclude = exclude
        # 节点配置
        self.node_config = node_config

    def validate(self):
        self.validate_required(self.node_id, 'node_id')
        self.validate_required(self.node_type, 'node_type')
        if self.node_type:
            self.node_type.validate()
        self.validate_required(self.exclude, 'exclude')
        self.validate_required(self.node_config, 'node_config')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.node_type is not None:
            result['node_type'] = self.node_type.to_map()
        if self.exclude is not None:
            result['exclude'] = self.exclude
        if self.node_config is not None:
            result['node_config'] = self.node_config
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('node_type') is not None:
            temp_model = CrowdNodeTypeEnum()
            self.node_type = temp_model.from_map(m['node_type'])
        if m.get('exclude') is not None:
            self.exclude = m.get('exclude')
        if m.get('node_config') is not None:
            self.node_config = m.get('node_config')
        return self


class Location(TeaModel):
    def __init__(
        self,
        city: str = None,
        imei: str = None,
        imsi: str = None,
        ip: str = None,
        latitude: str = None,
        longitude: str = None,
        propertities: str = None,
        wifi_mac: str = None,
    ):
        # 所在城市
        self.city = city
        # 操作IMEI
        self.imei = imei
        # 操作IMSI
        self.imsi = imsi
        # 操作IP地址
        self.ip = ip
        # 纬度
        self.latitude = latitude
        # 经度
        self.longitude = longitude
        # 扩展属性
        self.propertities = propertities
        # 操作Wi-Fi物理地址
        self.wifi_mac = wifi_mac

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.city is not None:
            result['city'] = self.city
        if self.imei is not None:
            result['imei'] = self.imei
        if self.imsi is not None:
            result['imsi'] = self.imsi
        if self.ip is not None:
            result['ip'] = self.ip
        if self.latitude is not None:
            result['latitude'] = self.latitude
        if self.longitude is not None:
            result['longitude'] = self.longitude
        if self.propertities is not None:
            result['propertities'] = self.propertities
        if self.wifi_mac is not None:
            result['wifi_mac'] = self.wifi_mac
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('city') is not None:
            self.city = m.get('city')
        if m.get('imei') is not None:
            self.imei = m.get('imei')
        if m.get('imsi') is not None:
            self.imsi = m.get('imsi')
        if m.get('ip') is not None:
            self.ip = m.get('ip')
        if m.get('latitude') is not None:
            self.latitude = m.get('latitude')
        if m.get('longitude') is not None:
            self.longitude = m.get('longitude')
        if m.get('propertities') is not None:
            self.propertities = m.get('propertities')
        if m.get('wifi_mac') is not None:
            self.wifi_mac = m.get('wifi_mac')
        return self


class CapitalInfo(TeaModel):
    def __init__(
        self,
        balance_log: str = None,
        shop_id: str = None,
        time_log: int = None,
        tx_hash: str = None,
    ):
        # 记录流水额度
        self.balance_log = balance_log
        # 商户id
        self.shop_id = shop_id
        # 记录时间
        self.time_log = time_log
        # 链上地址
        self.tx_hash = tx_hash

    def validate(self):
        self.validate_required(self.balance_log, 'balance_log')
        self.validate_required(self.shop_id, 'shop_id')
        self.validate_required(self.time_log, 'time_log')
        self.validate_required(self.tx_hash, 'tx_hash')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.balance_log is not None:
            result['balance_log'] = self.balance_log
        if self.shop_id is not None:
            result['shop_id'] = self.shop_id
        if self.time_log is not None:
            result['time_log'] = self.time_log
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('balance_log') is not None:
            self.balance_log = m.get('balance_log')
        if m.get('shop_id') is not None:
            self.shop_id = m.get('shop_id')
        if m.get('time_log') is not None:
            self.time_log = m.get('time_log')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class ALiYunChainMiniAppLog(TeaModel):
    def __init__(
        self,
        access_count: int = None,
        access_alipay_account_count: int = None,
    ):
        # access_count
        self.access_count = access_count
        # access_alipay_account_count
        self.access_alipay_account_count = access_alipay_account_count

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.access_count is not None:
            result['access_count'] = self.access_count
        if self.access_alipay_account_count is not None:
            result['access_alipay_account_count'] = self.access_alipay_account_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('access_count') is not None:
            self.access_count = m.get('access_count')
        if m.get('access_alipay_account_count') is not None:
            self.access_alipay_account_count = m.get('access_alipay_account_count')
        return self


class OrderResult(TeaModel):
    def __init__(
        self,
        instance_id: str = None,
        success: bool = None,
    ):
        # 事例id
        self.instance_id = instance_id
        # 是否成功
        self.success = success

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.success, 'success')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class BlockchainBrowserNodeOwner(TeaModel):
    def __init__(
        self,
        node_id: str = None,
        node_ip: str = None,
        node_name: str = None,
        node_owner: str = None,
        node_port: str = None,
        node_source: str = None,
        node_state: str = None,
        node_type: str = None,
        node_disk_used: str = None,
        node_disk_total: str = None,
    ):
        # node_id
        self.node_id = node_id
        # node_ip
        self.node_ip = node_ip
        # node_name
        self.node_name = node_name
        # node_owner
        self.node_owner = node_owner
        # node_port
        self.node_port = node_port
        # node_source
        self.node_source = node_source
        # node_state
        self.node_state = node_state
        # node_type
        self.node_type = node_type
        # 节点已使用的存储空间
        self.node_disk_used = node_disk_used
        # 节点的总存储空间
        self.node_disk_total = node_disk_total

    def validate(self):
        self.validate_required(self.node_id, 'node_id')
        self.validate_required(self.node_ip, 'node_ip')
        self.validate_required(self.node_name, 'node_name')
        self.validate_required(self.node_owner, 'node_owner')
        self.validate_required(self.node_port, 'node_port')
        self.validate_required(self.node_source, 'node_source')
        self.validate_required(self.node_state, 'node_state')
        self.validate_required(self.node_type, 'node_type')
        self.validate_required(self.node_disk_used, 'node_disk_used')
        self.validate_required(self.node_disk_total, 'node_disk_total')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.node_ip is not None:
            result['node_ip'] = self.node_ip
        if self.node_name is not None:
            result['node_name'] = self.node_name
        if self.node_owner is not None:
            result['node_owner'] = self.node_owner
        if self.node_port is not None:
            result['node_port'] = self.node_port
        if self.node_source is not None:
            result['node_source'] = self.node_source
        if self.node_state is not None:
            result['node_state'] = self.node_state
        if self.node_type is not None:
            result['node_type'] = self.node_type
        if self.node_disk_used is not None:
            result['node_disk_used'] = self.node_disk_used
        if self.node_disk_total is not None:
            result['node_disk_total'] = self.node_disk_total
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('node_ip') is not None:
            self.node_ip = m.get('node_ip')
        if m.get('node_name') is not None:
            self.node_name = m.get('node_name')
        if m.get('node_owner') is not None:
            self.node_owner = m.get('node_owner')
        if m.get('node_port') is not None:
            self.node_port = m.get('node_port')
        if m.get('node_source') is not None:
            self.node_source = m.get('node_source')
        if m.get('node_state') is not None:
            self.node_state = m.get('node_state')
        if m.get('node_type') is not None:
            self.node_type = m.get('node_type')
        if m.get('node_disk_used') is not None:
            self.node_disk_used = m.get('node_disk_used')
        if m.get('node_disk_total') is not None:
            self.node_disk_total = m.get('node_disk_total')
        return self


class ALiYunChainAccount(TeaModel):
    def __init__(
        self,
        account_private_key: str = None,
        account_public_key: str = None,
        account_recover_private_key: str = None,
        account_recover_public_key: str = None,
        ant_chain_id: str = None,
        account: str = None,
    ):
        # account_private_key
        self.account_private_key = account_private_key
        # account_public_key
        self.account_public_key = account_public_key
        # account_recover_private_key
        self.account_recover_private_key = account_recover_private_key
        # account_recover_public_key
        self.account_recover_public_key = account_recover_public_key
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # account
        self.account = account

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.account_private_key is not None:
            result['account_private_key'] = self.account_private_key
        if self.account_public_key is not None:
            result['account_public_key'] = self.account_public_key
        if self.account_recover_private_key is not None:
            result['account_recover_private_key'] = self.account_recover_private_key
        if self.account_recover_public_key is not None:
            result['account_recover_public_key'] = self.account_recover_public_key
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.account is not None:
            result['account'] = self.account
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('account_private_key') is not None:
            self.account_private_key = m.get('account_private_key')
        if m.get('account_public_key') is not None:
            self.account_public_key = m.get('account_public_key')
        if m.get('account_recover_private_key') is not None:
            self.account_recover_private_key = m.get('account_recover_private_key')
        if m.get('account_recover_public_key') is not None:
            self.account_recover_public_key = m.get('account_recover_public_key')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('account') is not None:
            self.account = m.get('account')
        return self


class UpdateDidServiceList(TeaModel):
    def __init__(
        self,
        previous_version: int = None,
        service_list: List[DisServicesInfo] = None,
    ):
        # 待更新did之前的版本号
        self.previous_version = previous_version
        # 服务信息列表
        self.service_list = service_list

    def validate(self):
        self.validate_required(self.previous_version, 'previous_version')
        self.validate_required(self.service_list, 'service_list')
        if self.service_list:
            for k in self.service_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.previous_version is not None:
            result['previous_version'] = self.previous_version
        result['service_list'] = []
        if self.service_list is not None:
            for k in self.service_list:
                result['service_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('previous_version') is not None:
            self.previous_version = m.get('previous_version')
        self.service_list = []
        if m.get('service_list') is not None:
            for k in m.get('service_list'):
                temp_model = DisServicesInfo()
                self.service_list.append(temp_model.from_map(k))
        return self


class ItemDto(TeaModel):
    def __init__(
        self,
        product_id: str = None,
        shop_id: str = None,
        tx_hash: str = None,
    ):
        # 商品id
        self.product_id = product_id
        # 商户id
        self.shop_id = shop_id
        # 链上地址
        self.tx_hash = tx_hash

    def validate(self):
        self.validate_required(self.product_id, 'product_id')
        self.validate_required(self.shop_id, 'shop_id')
        self.validate_required(self.tx_hash, 'tx_hash')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.product_id is not None:
            result['product_id'] = self.product_id
        if self.shop_id is not None:
            result['shop_id'] = self.shop_id
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('product_id') is not None:
            self.product_id = m.get('product_id')
        if m.get('shop_id') is not None:
            self.shop_id = m.get('shop_id')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class BlockchainBrowserLatestBlock(TeaModel):
    def __init__(
        self,
        bizid: str = None,
        block_hash: str = None,
        create_time: int = None,
        height: int = None,
        previous_hash: str = None,
        root_tx_hash: str = None,
        size: int = None,
        transaction_size: int = None,
        version: int = None,
    ):
        # bizid
        self.bizid = bizid
        # block_hash
        self.block_hash = block_hash
        # create_time
        self.create_time = create_time
        # height
        self.height = height
        # previous_hash
        self.previous_hash = previous_hash
        # root_tx_hash
        self.root_tx_hash = root_tx_hash
        # size
        self.size = size
        # transaction_size
        self.transaction_size = transaction_size
        # version
        self.version = version

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.block_hash, 'block_hash')
        self.validate_required(self.create_time, 'create_time')
        self.validate_required(self.height, 'height')
        self.validate_required(self.previous_hash, 'previous_hash')
        self.validate_required(self.root_tx_hash, 'root_tx_hash')
        self.validate_required(self.size, 'size')
        self.validate_required(self.transaction_size, 'transaction_size')
        self.validate_required(self.version, 'version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.block_hash is not None:
            result['block_hash'] = self.block_hash
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.height is not None:
            result['height'] = self.height
        if self.previous_hash is not None:
            result['previous_hash'] = self.previous_hash
        if self.root_tx_hash is not None:
            result['root_tx_hash'] = self.root_tx_hash
        if self.size is not None:
            result['size'] = self.size
        if self.transaction_size is not None:
            result['transaction_size'] = self.transaction_size
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('block_hash') is not None:
            self.block_hash = m.get('block_hash')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('previous_hash') is not None:
            self.previous_hash = m.get('previous_hash')
        if m.get('root_tx_hash') is not None:
            self.root_tx_hash = m.get('root_tx_hash')
        if m.get('size') is not None:
            self.size = m.get('size')
        if m.get('transaction_size') is not None:
            self.transaction_size = m.get('transaction_size')
        if m.get('version') is not None:
            self.version = m.get('version')
        return self


class VcTransmitCnf(TeaModel):
    def __init__(
        self,
        signature: str = None,
        tx_hash: str = None,
        verifier_id: str = None,
    ):
        # 针对tx_hash的签名
        self.signature = signature
        # 交易hash
        self.tx_hash = tx_hash
        # vc传输目标did
        self.verifier_id = verifier_id

    def validate(self):
        self.validate_required(self.signature, 'signature')
        self.validate_required(self.tx_hash, 'tx_hash')
        self.validate_required(self.verifier_id, 'verifier_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.signature is not None:
            result['signature'] = self.signature
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.verifier_id is not None:
            result['verifier_id'] = self.verifier_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('verifier_id') is not None:
            self.verifier_id = m.get('verifier_id')
        return self


class ALiYunChainMiniAppUserPrivilege(TeaModel):
    def __init__(
        self,
        ant_chain_id: str = None,
        q_rcode_type: str = None,
        authorization_type: str = None,
        pagination: ALiYunPagination = None,
        authorized_user_list: List[ALiYunChainMiniAppAuthorizedUser] = None,
    ):
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # q_r_code_type
        self.q_rcode_type = q_rcode_type
        # authorization_type
        self.authorization_type = authorization_type
        # pagination
        self.pagination = pagination
        # ALiYunChainMiniAppAuthorizedUser
        self.authorized_user_list = authorized_user_list

    def validate(self):
        if self.pagination:
            self.pagination.validate()
        if self.authorized_user_list:
            for k in self.authorized_user_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.q_rcode_type is not None:
            result['q_r_code_type'] = self.q_rcode_type
        if self.authorization_type is not None:
            result['authorization_type'] = self.authorization_type
        if self.pagination is not None:
            result['pagination'] = self.pagination.to_map()
        result['authorized_user_list'] = []
        if self.authorized_user_list is not None:
            for k in self.authorized_user_list:
                result['authorized_user_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('q_r_code_type') is not None:
            self.q_rcode_type = m.get('q_r_code_type')
        if m.get('authorization_type') is not None:
            self.authorization_type = m.get('authorization_type')
        if m.get('pagination') is not None:
            temp_model = ALiYunPagination()
            self.pagination = temp_model.from_map(m['pagination'])
        self.authorized_user_list = []
        if m.get('authorized_user_list') is not None:
            for k in m.get('authorized_user_list'):
                temp_model = ALiYunChainMiniAppAuthorizedUser()
                self.authorized_user_list.append(temp_model.from_map(k))
        return self


class ProcessInfo(TeaModel):
    def __init__(
        self,
        current_node: int = None,
        extension_info: str = None,
        nodes: List[NodeDetail] = None,
        process_id: str = None,
        process_status: str = None,
        total_count: int = None,
        data_id: str = None,
    ):
        # 当前处理节点
        self.current_node = current_node
        # 扩展信息
        self.extension_info = extension_info
        # 节点列表
        self.nodes = nodes
        # 流程ID
        self.process_id = process_id
        # 流程状态
        self.process_status = process_status
        # 流程节点总数
        self.total_count = total_count
        # 数据对象ID
        self.data_id = data_id

    def validate(self):
        self.validate_required(self.current_node, 'current_node')
        if self.current_node is not None:
            self.validate_minimum(self.current_node, 'current_node', 0)
        self.validate_required(self.nodes, 'nodes')
        if self.nodes:
            for k in self.nodes:
                if k:
                    k.validate()
        self.validate_required(self.process_id, 'process_id')
        self.validate_required(self.process_status, 'process_status')
        self.validate_required(self.total_count, 'total_count')
        if self.total_count is not None:
            self.validate_minimum(self.total_count, 'total_count', 0)
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.current_node is not None:
            result['current_node'] = self.current_node
        if self.extension_info is not None:
            result['extension_info'] = self.extension_info
        result['nodes'] = []
        if self.nodes is not None:
            for k in self.nodes:
                result['nodes'].append(k.to_map() if k else None)
        if self.process_id is not None:
            result['process_id'] = self.process_id
        if self.process_status is not None:
            result['process_status'] = self.process_status
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.data_id is not None:
            result['data_id'] = self.data_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('current_node') is not None:
            self.current_node = m.get('current_node')
        if m.get('extension_info') is not None:
            self.extension_info = m.get('extension_info')
        self.nodes = []
        if m.get('nodes') is not None:
            for k in m.get('nodes'):
                temp_model = NodeDetail()
                self.nodes.append(temp_model.from_map(k))
        if m.get('process_id') is not None:
            self.process_id = m.get('process_id')
        if m.get('process_status') is not None:
            self.process_status = m.get('process_status')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        return self


class ALiYunChainResouceForSale(TeaModel):
    def __init__(
        self,
        region_id: str = None,
        type_list: List[str] = None,
    ):
        # region_id
        self.region_id = region_id
        # type_list
        self.type_list = type_list

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.region_id is not None:
            result['region_id'] = self.region_id
        if self.type_list is not None:
            result['type_list'] = self.type_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        if m.get('type_list') is not None:
            self.type_list = m.get('type_list')
        return self


class ExchangeAccountMap(TeaModel):
    def __init__(
        self,
        phone: str = None,
        user_account: str = None,
        user_name: str = None,
    ):
        # 用户联系方式
        self.phone = phone
        # 用户账户
        self.user_account = user_account
        # 用户名称
        self.user_name = user_name

    def validate(self):
        self.validate_required(self.phone, 'phone')
        self.validate_required(self.user_account, 'user_account')
        self.validate_required(self.user_name, 'user_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.phone is not None:
            result['phone'] = self.phone
        if self.user_account is not None:
            result['user_account'] = self.user_account
        if self.user_name is not None:
            result['user_name'] = self.user_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('user_account') is not None:
            self.user_account = m.get('user_account')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        return self


class ALiYunChainExecuteOrder(TeaModel):
    def __init__(
        self,
        user_request_id: str = None,
        data: str = None,
        success: bool = None,
        code: str = None,
        message: str = None,
        synchro: bool = None,
    ):
        # user_request_id
        self.user_request_id = user_request_id
        # data
        self.data = data
        # success
        self.success = success
        # code
        self.code = code
        # message
        self.message = message
        # synchro
        self.synchro = synchro

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_request_id is not None:
            result['user_request_id'] = self.user_request_id
        if self.data is not None:
            result['data'] = self.data
        if self.success is not None:
            result['success'] = self.success
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.synchro is not None:
            result['synchro'] = self.synchro
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_request_id') is not None:
            self.user_request_id = m.get('user_request_id')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('synchro') is not None:
            self.synchro = m.get('synchro')
        return self


class AuthProduct(TeaModel):
    def __init__(
        self,
        product_code: str = None,
        product_abbr: str = None,
    ):
        # 产品code
        self.product_code = product_code
        # 产品简称
        self.product_abbr = product_abbr

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.product_abbr, 'product_abbr')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.product_abbr is not None:
            result['product_abbr'] = self.product_abbr
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('product_abbr') is not None:
            self.product_abbr = m.get('product_abbr')
        return self


class AccountMap(TeaModel):
    def __init__(
        self,
        bizid: str = None,
        entity_info_type: int = None,
        entity_info_value: str = None,
        full_name: str = None,
        status: int = None,
        target_name: str = None,
        type: int = None,
        uid: str = None,
    ):
        # 要映射的链对应的唯一id
        self.bizid = bizid
        # 0: 身份证；1：手机；2: 电子邮箱；3: 企业营业执照号
        self.entity_info_type = entity_info_type
        # 对应entity_info_type的具体值
        # 
        self.entity_info_value = entity_info_value
        # 账户对应实体的全名
        self.full_name = full_name
        # 该账户在指定链上的状态1，激活，2，冻结，新建账户只能为1
        self.status = status
        # 希望映射后在链上的账户名
        self.target_name = target_name
        # 该账户对应实体的类型：0， 个人； 1， 企业
        self.type = type
        # 自有系统中该账户的唯一标示
        self.uid = uid

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.status, 'status')
        self.validate_required(self.uid, 'uid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.entity_info_type is not None:
            result['entity_info_type'] = self.entity_info_type
        if self.entity_info_value is not None:
            result['entity_info_value'] = self.entity_info_value
        if self.full_name is not None:
            result['full_name'] = self.full_name
        if self.status is not None:
            result['status'] = self.status
        if self.target_name is not None:
            result['target_name'] = self.target_name
        if self.type is not None:
            result['type'] = self.type
        if self.uid is not None:
            result['uid'] = self.uid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('entity_info_type') is not None:
            self.entity_info_type = m.get('entity_info_type')
        if m.get('entity_info_value') is not None:
            self.entity_info_value = m.get('entity_info_value')
        if m.get('full_name') is not None:
            self.full_name = m.get('full_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('target_name') is not None:
            self.target_name = m.get('target_name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('uid') is not None:
            self.uid = m.get('uid')
        return self


class PageTaskListDTO(TeaModel):
    def __init__(
        self,
        content: List[TaskListInfoDTO] = None,
        total_elements: int = None,
        total_pages: int = None,
        number: int = None,
        size: int = None,
        number_of_elements: int = None,
    ):
        # 任务列表集合
        self.content = content
        # 总记录条目
        self.total_elements = total_elements
        # 记录总页数
        self.total_pages = total_pages
        # 页码
        self.number = number
        # 每页记录条目
        self.size = size
        # 每页元素个数
        self.number_of_elements = number_of_elements

    def validate(self):
        self.validate_required(self.content, 'content')
        if self.content:
            for k in self.content:
                if k:
                    k.validate()
        self.validate_required(self.total_elements, 'total_elements')
        self.validate_required(self.total_pages, 'total_pages')
        self.validate_required(self.number, 'number')
        self.validate_required(self.size, 'size')
        self.validate_required(self.number_of_elements, 'number_of_elements')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['content'] = []
        if self.content is not None:
            for k in self.content:
                result['content'].append(k.to_map() if k else None)
        if self.total_elements is not None:
            result['total_elements'] = self.total_elements
        if self.total_pages is not None:
            result['total_pages'] = self.total_pages
        if self.number is not None:
            result['number'] = self.number
        if self.size is not None:
            result['size'] = self.size
        if self.number_of_elements is not None:
            result['number_of_elements'] = self.number_of_elements
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.content = []
        if m.get('content') is not None:
            for k in m.get('content'):
                temp_model = TaskListInfoDTO()
                self.content.append(temp_model.from_map(k))
        if m.get('total_elements') is not None:
            self.total_elements = m.get('total_elements')
        if m.get('total_pages') is not None:
            self.total_pages = m.get('total_pages')
        if m.get('number') is not None:
            self.number = m.get('number')
        if m.get('size') is not None:
            self.size = m.get('size')
        if m.get('number_of_elements') is not None:
            self.number_of_elements = m.get('number_of_elements')
        return self


class PresignedUrlPolicy(TeaModel):
    def __init__(
        self,
        access_id: str = None,
        callback: str = None,
        dir: str = None,
        expire: str = None,
        host: str = None,
        policy: str = None,
        signature: str = None,
    ):
        # oss访问的临时access id
        self.access_id = access_id
        # 一个需要回调通知服务端的方法名，非必填
        self.callback = callback
        # oss上的文件存放路径
        self.dir = dir
        # url超期的时间戳说明
        self.expire = expire
        # oss的地址
        self.host = host
        # 被base64编码的policy内容
        self.policy = policy
        # 签名结果
        self.signature = signature

    def validate(self):
        self.validate_required(self.access_id, 'access_id')
        self.validate_required(self.dir, 'dir')
        self.validate_required(self.expire, 'expire')
        self.validate_required(self.host, 'host')
        self.validate_required(self.policy, 'policy')
        self.validate_required(self.signature, 'signature')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.access_id is not None:
            result['access_id'] = self.access_id
        if self.callback is not None:
            result['callback'] = self.callback
        if self.dir is not None:
            result['dir'] = self.dir
        if self.expire is not None:
            result['expire'] = self.expire
        if self.host is not None:
            result['host'] = self.host
        if self.policy is not None:
            result['policy'] = self.policy
        if self.signature is not None:
            result['signature'] = self.signature
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('access_id') is not None:
            self.access_id = m.get('access_id')
        if m.get('callback') is not None:
            self.callback = m.get('callback')
        if m.get('dir') is not None:
            self.dir = m.get('dir')
        if m.get('expire') is not None:
            self.expire = m.get('expire')
        if m.get('host') is not None:
            self.host = m.get('host')
        if m.get('policy') is not None:
            self.policy = m.get('policy')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        return self


class UpdateDidAuthPayload(TeaModel):
    def __init__(
        self,
        controller: str = None,
        previous_auth_key_expire: str = None,
        previous_version: int = None,
        public_key_id: str = None,
        public_key_type: str = None,
        value: str = None,
    ):
        # 新公钥的实际控制者
        self.controller = controller
        # 旧Auth Key的过期时间
        self.previous_auth_key_expire = previous_auth_key_expire
        # 更新Did doc的版本
        self.previous_version = previous_version
        # 新DID Auth key的public key id
        self.public_key_id = public_key_id
        # 密钥对生成算法
        self.public_key_type = public_key_type
        # 公钥的实际值
        self.value = value

    def validate(self):
        self.validate_required(self.controller, 'controller')
        self.validate_required(self.previous_auth_key_expire, 'previous_auth_key_expire')
        self.validate_required(self.previous_version, 'previous_version')
        self.validate_required(self.public_key_id, 'public_key_id')
        self.validate_required(self.public_key_type, 'public_key_type')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.controller is not None:
            result['controller'] = self.controller
        if self.previous_auth_key_expire is not None:
            result['previous_auth_key_expire'] = self.previous_auth_key_expire
        if self.previous_version is not None:
            result['previous_version'] = self.previous_version
        if self.public_key_id is not None:
            result['public_key_id'] = self.public_key_id
        if self.public_key_type is not None:
            result['public_key_type'] = self.public_key_type
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('controller') is not None:
            self.controller = m.get('controller')
        if m.get('previous_auth_key_expire') is not None:
            self.previous_auth_key_expire = m.get('previous_auth_key_expire')
        if m.get('previous_version') is not None:
            self.previous_version = m.get('previous_version')
        if m.get('public_key_id') is not None:
            self.public_key_id = m.get('public_key_id')
        if m.get('public_key_type') is not None:
            self.public_key_type = m.get('public_key_type')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class GetAftsUploadUrlRequest(TeaModel):
    def __init__(
        self,
        file_type: str = None,
    ):
        # 问件类型
        self.file_type = file_type

    def validate(self):
        self.validate_required(self.file_type, 'file_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.file_type is not None:
            result['file_type'] = self.file_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        return self


class DidDetail(TeaModel):
    def __init__(
        self,
        controller: str = None,
        did: str = None,
        did_doc: str = None,
    ):
        # 控制者的did描述符
        self.controller = controller
        # did描述符
        self.did = did
        # did doc
        self.did_doc = did_doc

    def validate(self):
        self.validate_required(self.controller, 'controller')
        self.validate_required(self.did, 'did')
        self.validate_required(self.did_doc, 'did_doc')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.controller is not None:
            result['controller'] = self.controller
        if self.did is not None:
            result['did'] = self.did
        if self.did_doc is not None:
            result['did_doc'] = self.did_doc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('controller') is not None:
            self.controller = m.get('controller')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('did_doc') is not None:
            self.did_doc = m.get('did_doc')
        return self


class BlockchainBrowserBlock(TeaModel):
    def __init__(
        self,
        bizid: str = None,
        blockchain_name: str = None,
        blockchain_status: bool = None,
        block_hash: str = None,
        create_time: int = None,
        hash_status: bool = None,
        height: int = None,
        previous_hash: str = None,
        root_tx_hash: str = None,
        transaction_list: List[BlockchainBrowserTransaction] = None,
        transaction_size: int = None,
    ):
        # bizid
        self.bizid = bizid
        # blockchain_name
        self.blockchain_name = blockchain_name
        # blockchain_status
        self.blockchain_status = blockchain_status
        # block_hash
        self.block_hash = block_hash
        # create_time
        self.create_time = create_time
        # hash_status
        self.hash_status = hash_status
        # height
        self.height = height
        # previous_hash
        self.previous_hash = previous_hash
        # root_tx_hash
        self.root_tx_hash = root_tx_hash
        # transaction_list
        self.transaction_list = transaction_list
        # transaction_size
        self.transaction_size = transaction_size

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.blockchain_name, 'blockchain_name')
        self.validate_required(self.blockchain_status, 'blockchain_status')
        self.validate_required(self.block_hash, 'block_hash')
        self.validate_required(self.create_time, 'create_time')
        self.validate_required(self.hash_status, 'hash_status')
        self.validate_required(self.height, 'height')
        self.validate_required(self.previous_hash, 'previous_hash')
        self.validate_required(self.root_tx_hash, 'root_tx_hash')
        self.validate_required(self.transaction_list, 'transaction_list')
        if self.transaction_list:
            for k in self.transaction_list:
                if k:
                    k.validate()
        self.validate_required(self.transaction_size, 'transaction_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.blockchain_name is not None:
            result['blockchain_name'] = self.blockchain_name
        if self.blockchain_status is not None:
            result['blockchain_status'] = self.blockchain_status
        if self.block_hash is not None:
            result['block_hash'] = self.block_hash
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.hash_status is not None:
            result['hash_status'] = self.hash_status
        if self.height is not None:
            result['height'] = self.height
        if self.previous_hash is not None:
            result['previous_hash'] = self.previous_hash
        if self.root_tx_hash is not None:
            result['root_tx_hash'] = self.root_tx_hash
        result['transaction_list'] = []
        if self.transaction_list is not None:
            for k in self.transaction_list:
                result['transaction_list'].append(k.to_map() if k else None)
        if self.transaction_size is not None:
            result['transaction_size'] = self.transaction_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('blockchain_name') is not None:
            self.blockchain_name = m.get('blockchain_name')
        if m.get('blockchain_status') is not None:
            self.blockchain_status = m.get('blockchain_status')
        if m.get('block_hash') is not None:
            self.block_hash = m.get('block_hash')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('hash_status') is not None:
            self.hash_status = m.get('hash_status')
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('previous_hash') is not None:
            self.previous_hash = m.get('previous_hash')
        if m.get('root_tx_hash') is not None:
            self.root_tx_hash = m.get('root_tx_hash')
        self.transaction_list = []
        if m.get('transaction_list') is not None:
            for k in m.get('transaction_list'):
                temp_model = BlockchainBrowserTransaction()
                self.transaction_list.append(temp_model.from_map(k))
        if m.get('transaction_size') is not None:
            self.transaction_size = m.get('transaction_size')
        return self


class TaskCrowdNodeDTO(TeaModel):
    def __init__(
        self,
        node_id: str = None,
        node_type: str = None,
        exclude: bool = None,
        node_config: str = None,
    ):
        # 节点ID
        self.node_id = node_id
        # 节点类型
        self.node_type = node_type
        # 是否排除
        self.exclude = exclude
        # 节点配置
        self.node_config = node_config

    def validate(self):
        self.validate_required(self.node_id, 'node_id')
        self.validate_required(self.node_type, 'node_type')
        self.validate_required(self.exclude, 'exclude')
        self.validate_required(self.node_config, 'node_config')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.node_type is not None:
            result['node_type'] = self.node_type
        if self.exclude is not None:
            result['exclude'] = self.exclude
        if self.node_config is not None:
            result['node_config'] = self.node_config
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('node_type') is not None:
            self.node_type = m.get('node_type')
        if m.get('exclude') is not None:
            self.exclude = m.get('exclude')
        if m.get('node_config') is not None:
            self.node_config = m.get('node_config')
        return self


class MatchResult(TeaModel):
    def __init__(
        self,
        match: bool = None,
    ):
        # 是否匹配
        self.match = match

    def validate(self):
        self.validate_required(self.match, 'match')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.match is not None:
            result['match'] = self.match
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('match') is not None:
            self.match = m.get('match')
        return self


class ALiYunChain(TeaModel):
    def __init__(
        self,
        notary_blockchain: ALiYunNotaryBlockchain = None,
        contract_blockchain: ALiYunContractBlockchain = None,
        old_contract_blockchain: ALiYunOldContractBlockchain = None,
    ):
        # notary_blockchain
        self.notary_blockchain = notary_blockchain
        # contract_blockchain
        self.contract_blockchain = contract_blockchain
        # old_contract_blockchain
        self.old_contract_blockchain = old_contract_blockchain

    def validate(self):
        if self.notary_blockchain:
            self.notary_blockchain.validate()
        if self.contract_blockchain:
            self.contract_blockchain.validate()
        if self.old_contract_blockchain:
            self.old_contract_blockchain.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.notary_blockchain is not None:
            result['notary_blockchain'] = self.notary_blockchain.to_map()
        if self.contract_blockchain is not None:
            result['contract_blockchain'] = self.contract_blockchain.to_map()
        if self.old_contract_blockchain is not None:
            result['old_contract_blockchain'] = self.old_contract_blockchain.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('notary_blockchain') is not None:
            temp_model = ALiYunNotaryBlockchain()
            self.notary_blockchain = temp_model.from_map(m['notary_blockchain'])
        if m.get('contract_blockchain') is not None:
            temp_model = ALiYunContractBlockchain()
            self.contract_blockchain = temp_model.from_map(m['contract_blockchain'])
        if m.get('old_contract_blockchain') is not None:
            temp_model = ALiYunOldContractBlockchain()
            self.old_contract_blockchain = temp_model.from_map(m['old_contract_blockchain'])
        return self


class RakeBackInfo(TeaModel):
    def __init__(
        self,
        level: int = None,
        parent_id: str = None,
        promoter_id: str = None,
        quota: str = None,
        rate: str = None,
    ):
        # 推广层级
        self.level = level
        # 上级推广订单id
        self.parent_id = parent_id
        # 推广人id
        self.promoter_id = promoter_id
        # 返佣额度
        self.quota = quota
        # 返佣比例 10表示10%\
        self.rate = rate

    def validate(self):
        self.validate_required(self.level, 'level')
        self.validate_required(self.parent_id, 'parent_id')
        self.validate_required(self.promoter_id, 'promoter_id')
        self.validate_required(self.quota, 'quota')
        self.validate_required(self.rate, 'rate')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.level is not None:
            result['level'] = self.level
        if self.parent_id is not None:
            result['parent_id'] = self.parent_id
        if self.promoter_id is not None:
            result['promoter_id'] = self.promoter_id
        if self.quota is not None:
            result['quota'] = self.quota
        if self.rate is not None:
            result['rate'] = self.rate
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('level') is not None:
            self.level = m.get('level')
        if m.get('parent_id') is not None:
            self.parent_id = m.get('parent_id')
        if m.get('promoter_id') is not None:
            self.promoter_id = m.get('promoter_id')
        if m.get('quota') is not None:
            self.quota = m.get('quota')
        if m.get('rate') is not None:
            self.rate = m.get('rate')
        return self


class ALiYunChainMiniAppTransaction(TeaModel):
    def __init__(
        self,
        authorized: bool = None,
        transaction_response: str = None,
        transaction_receipt: str = None,
    ):
        # authorized
        self.authorized = authorized
        # transaction_response
        self.transaction_response = transaction_response
        # transaction_receipt
        self.transaction_receipt = transaction_receipt

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.authorized is not None:
            result['authorized'] = self.authorized
        if self.transaction_response is not None:
            result['transaction_response'] = self.transaction_response
        if self.transaction_receipt is not None:
            result['transaction_receipt'] = self.transaction_receipt
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('authorized') is not None:
            self.authorized = m.get('authorized')
        if m.get('transaction_response') is not None:
            self.transaction_response = m.get('transaction_response')
        if m.get('transaction_receipt') is not None:
            self.transaction_receipt = m.get('transaction_receipt')
        return self


class ALiYunChainKmsAccount(TeaModel):
    def __init__(
        self,
        pub_key: str = None,
        my_kms_key_id: str = None,
    ):
        # 账户公钥
        self.pub_key = pub_key
        # 托管秘钥ID
        self.my_kms_key_id = my_kms_key_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.pub_key is not None:
            result['pub_key'] = self.pub_key
        if self.my_kms_key_id is not None:
            result['my_kms_key_id'] = self.my_kms_key_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pub_key') is not None:
            self.pub_key = m.get('pub_key')
        if m.get('my_kms_key_id') is not None:
            self.my_kms_key_id = m.get('my_kms_key_id')
        return self


class LogisticFinUser(TeaModel):
    def __init__(
        self,
        drawee_tax_no: str = None,
        org_id: str = None,
        user_id: str = None,
    ):
        # 纳税人识别号
        self.drawee_tax_no = drawee_tax_no
        # 业务方企业id
        self.org_id = org_id
        # 业务方用户id
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.drawee_tax_no, 'drawee_tax_no')
        self.validate_required(self.org_id, 'org_id')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.drawee_tax_no is not None:
            result['drawee_tax_no'] = self.drawee_tax_no
        if self.org_id is not None:
            result['org_id'] = self.org_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('drawee_tax_no') is not None:
            self.drawee_tax_no = m.get('drawee_tax_no')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class ContractQueryDetailReq(TeaModel):
    def __init__(
        self,
        service_id: str = None,
    ):
        # 服务ID
        self.service_id = service_id

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        if self.service_id is not None:
            self.validate_max_length(self.service_id, 'service_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.service_id is not None:
            result['service_id'] = self.service_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        return self


class CarInfo(TeaModel):
    def __init__(
        self,
        license_no: str = None,
        vin: str = None,
        engine_no: str = None,
        register_date: str = None,
        model_code: str = None,
    ):
        # 车牌号
        self.license_no = license_no
        # 车架号
        self.vin = vin
        # 发动机号
        self.engine_no = engine_no
        # 
        # 注册日期
        self.register_date = register_date
        # 车型
        self.model_code = model_code

    def validate(self):
        self.validate_required(self.license_no, 'license_no')
        self.validate_required(self.vin, 'vin')
        self.validate_required(self.engine_no, 'engine_no')
        self.validate_required(self.register_date, 'register_date')
        self.validate_required(self.model_code, 'model_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.license_no is not None:
            result['license_no'] = self.license_no
        if self.vin is not None:
            result['vin'] = self.vin
        if self.engine_no is not None:
            result['engine_no'] = self.engine_no
        if self.register_date is not None:
            result['register_date'] = self.register_date
        if self.model_code is not None:
            result['model_code'] = self.model_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('license_no') is not None:
            self.license_no = m.get('license_no')
        if m.get('vin') is not None:
            self.vin = m.get('vin')
        if m.get('engine_no') is not None:
            self.engine_no = m.get('engine_no')
        if m.get('register_date') is not None:
            self.register_date = m.get('register_date')
        if m.get('model_code') is not None:
            self.model_code = m.get('model_code')
        return self


class ContractTemplateQueryReq(TeaModel):
    def __init__(
        self,
        num: int = None,
        size: int = None,
    ):
        # 页码
        self.num = num
        # 页大小
        self.size = size

    def validate(self):
        self.validate_required(self.num, 'num')
        self.validate_required(self.size, 'size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.num is not None:
            result['num'] = self.num
        if self.size is not None:
            result['size'] = self.size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('num') is not None:
            self.num = m.get('num')
        if m.get('size') is not None:
            self.size = m.get('size')
        return self


class DistributionUser(TeaModel):
    def __init__(
        self,
        create_time: str = None,
        mobile: str = None,
        user_id: str = None,
    ):
        # 用户创建时间
        self.create_time = create_time
        # 用户手机号
        self.mobile = mobile
        # 用户唯一标识
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.create_time, 'create_time')
        self.validate_required(self.mobile, 'mobile')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class ContractTemplateListResp(TeaModel):
    def __init__(
        self,
        list: List[ContractTemplateResp] = None,
        total: int = None,
    ):
        # 合约市场列表
        self.list = list
        # 总数
        self.total = total

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        if self.total is not None:
            result['total'] = self.total
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = ContractTemplateResp()
                self.list.append(temp_model.from_map(k))
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class ProcessResult(TeaModel):
    def __init__(
        self,
        extension: str = None,
        message: str = None,
        next: str = None,
        process_id: str = None,
        status: str = None,
        data_id: str = None,
        tx_hash: str = None,
        block_number: int = None,
        authority_cert: str = None,
    ):
        # 申请权限的扩展参数
        self.extension = extension
        # 申请权限原因
        self.message = message
        # 下一个处理节点ID
        self.next = next
        # 流程ID
        self.process_id = process_id
        # 流程状态
        self.status = status
        # 数据对象ID
        self.data_id = data_id
        # 交易HASH
        self.tx_hash = tx_hash
        # 区块高度
        self.block_number = block_number
        # 授权凭证
        self.authority_cert = authority_cert

    def validate(self):
        self.validate_required(self.process_id, 'process_id')
        self.validate_required(self.status, 'status')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.extension is not None:
            result['extension'] = self.extension
        if self.message is not None:
            result['message'] = self.message
        if self.next is not None:
            result['next'] = self.next
        if self.process_id is not None:
            result['process_id'] = self.process_id
        if self.status is not None:
            result['status'] = self.status
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.authority_cert is not None:
            result['authority_cert'] = self.authority_cert
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('extension') is not None:
            self.extension = m.get('extension')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('next') is not None:
            self.next = m.get('next')
        if m.get('process_id') is not None:
            self.process_id = m.get('process_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('authority_cert') is not None:
            self.authority_cert = m.get('authority_cert')
        return self


class PublicKey(TeaModel):
    def __init__(
        self,
        issuer_id: str = None,
        public_key_content: str = None,
        recipient_id: str = None,
    ):
        # 公钥颁发者ID
        self.issuer_id = issuer_id
        # 公钥内容
        self.public_key_content = public_key_content
        # 公钥接受者ID
        self.recipient_id = recipient_id

    def validate(self):
        self.validate_required(self.issuer_id, 'issuer_id')
        if self.issuer_id is not None:
            self.validate_max_length(self.issuer_id, 'issuer_id', 100)
        self.validate_required(self.public_key_content, 'public_key_content')
        self.validate_required(self.recipient_id, 'recipient_id')
        if self.recipient_id is not None:
            self.validate_max_length(self.recipient_id, 'recipient_id', 100)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.issuer_id is not None:
            result['issuer_id'] = self.issuer_id
        if self.public_key_content is not None:
            result['public_key_content'] = self.public_key_content
        if self.recipient_id is not None:
            result['recipient_id'] = self.recipient_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('issuer_id') is not None:
            self.issuer_id = m.get('issuer_id')
        if m.get('public_key_content') is not None:
            self.public_key_content = m.get('public_key_content')
        if m.get('recipient_id') is not None:
            self.recipient_id = m.get('recipient_id')
        return self


class ContractRecord(TeaModel):
    def __init__(
        self,
        abi_oss_key: str = None,
        abi_oss_url: str = None,
        bizid: str = None,
        blockchain_name: str = None,
        bytecode_oss_key: str = None,
        bytecode_oss_url: str = None,
        identity: str = None,
        instance_name: str = None,
        name: str = None,
        publish: int = None,
        tx_hash: str = None,
        type: str = None,
    ):
        # abi对应oss key
        self.abi_oss_key = abi_oss_key
        # abi oss 地址
        self.abi_oss_url = abi_oss_url
        # 区块链唯一标识
        self.bizid = bizid
        # 区块链名称
        self.blockchain_name = blockchain_name
        # bytecode对应oss key
        self.bytecode_oss_key = bytecode_oss_key
        # bytecode oss 地址
        self.bytecode_oss_url = bytecode_oss_url
        # 16进制表示的合约identity
        self.identity = identity
        # 合约代码中定义的合约实例名，比如solidity的contract 关键字后面的命名
        self.instance_name = instance_name
        # 合约名称
        self.name = name
        # 发布状态，1未发布，3已发布
        self.publish = publish
        # 交易hash
        self.tx_hash = tx_hash
        # solidity|cpp|go
        self.type = type

    def validate(self):
        self.validate_required(self.abi_oss_key, 'abi_oss_key')
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.blockchain_name, 'blockchain_name')
        self.validate_required(self.bytecode_oss_key, 'bytecode_oss_key')
        self.validate_required(self.identity, 'identity')
        self.validate_required(self.instance_name, 'instance_name')
        self.validate_required(self.name, 'name')
        self.validate_required(self.publish, 'publish')
        self.validate_required(self.tx_hash, 'tx_hash')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.abi_oss_key is not None:
            result['abi_oss_key'] = self.abi_oss_key
        if self.abi_oss_url is not None:
            result['abi_oss_url'] = self.abi_oss_url
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.blockchain_name is not None:
            result['blockchain_name'] = self.blockchain_name
        if self.bytecode_oss_key is not None:
            result['bytecode_oss_key'] = self.bytecode_oss_key
        if self.bytecode_oss_url is not None:
            result['bytecode_oss_url'] = self.bytecode_oss_url
        if self.identity is not None:
            result['identity'] = self.identity
        if self.instance_name is not None:
            result['instance_name'] = self.instance_name
        if self.name is not None:
            result['name'] = self.name
        if self.publish is not None:
            result['publish'] = self.publish
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('abi_oss_key') is not None:
            self.abi_oss_key = m.get('abi_oss_key')
        if m.get('abi_oss_url') is not None:
            self.abi_oss_url = m.get('abi_oss_url')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('blockchain_name') is not None:
            self.blockchain_name = m.get('blockchain_name')
        if m.get('bytecode_oss_key') is not None:
            self.bytecode_oss_key = m.get('bytecode_oss_key')
        if m.get('bytecode_oss_url') is not None:
            self.bytecode_oss_url = m.get('bytecode_oss_url')
        if m.get('identity') is not None:
            self.identity = m.get('identity')
        if m.get('instance_name') is not None:
            self.instance_name = m.get('instance_name')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('publish') is not None:
            self.publish = m.get('publish')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class BlockchainBrowserTransactionReceipt(TeaModel):
    def __init__(
        self,
        data: str = None,
        gas_used: int = None,
        logs: List[str] = None,
        result: int = None,
    ):
        # data
        self.data = data
        # gas_used
        self.gas_used = gas_used
        # logs
        self.logs = logs
        # result
        self.result = result

    def validate(self):
        self.validate_required(self.data, 'data')
        self.validate_required(self.gas_used, 'gas_used')
        self.validate_required(self.logs, 'logs')
        self.validate_required(self.result, 'result')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.data is not None:
            result['data'] = self.data
        if self.gas_used is not None:
            result['gas_used'] = self.gas_used
        if self.logs is not None:
            result['logs'] = self.logs
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('gas_used') is not None:
            self.gas_used = m.get('gas_used')
        if m.get('logs') is not None:
            self.logs = m.get('logs')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class SiteInfo(TeaModel):
    def __init__(
        self,
        site_type: str = None,
        site_url: str = None,
        site_name: str = None,
        tiny_app_id: str = None,
    ):
        # 网站类型
        self.site_type = site_type
        # 站点地址
        self.site_url = site_url
        # 站点名称
        self.site_name = site_name
        # 小程序 appId
        self.tiny_app_id = tiny_app_id

    def validate(self):
        self.validate_required(self.site_type, 'site_type')
        self.validate_required(self.site_url, 'site_url')
        self.validate_required(self.site_name, 'site_name')
        self.validate_required(self.tiny_app_id, 'tiny_app_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.site_type is not None:
            result['site_type'] = self.site_type
        if self.site_url is not None:
            result['site_url'] = self.site_url
        if self.site_name is not None:
            result['site_name'] = self.site_name
        if self.tiny_app_id is not None:
            result['tiny_app_id'] = self.tiny_app_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('site_type') is not None:
            self.site_type = m.get('site_type')
        if m.get('site_url') is not None:
            self.site_url = m.get('site_url')
        if m.get('site_name') is not None:
            self.site_name = m.get('site_name')
        if m.get('tiny_app_id') is not None:
            self.tiny_app_id = m.get('tiny_app_id')
        return self


class AccountWholesaleParam(TeaModel):
    def __init__(
        self,
        ep_amount: int = None,
        user_account: str = None,
    ):
        # 批发数量
        self.ep_amount = ep_amount
        # 用户账户
        self.user_account = user_account

    def validate(self):
        self.validate_required(self.ep_amount, 'ep_amount')
        self.validate_required(self.user_account, 'user_account')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ep_amount is not None:
            result['ep_amount'] = self.ep_amount
        if self.user_account is not None:
            result['user_account'] = self.user_account
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ep_amount') is not None:
            self.ep_amount = m.get('ep_amount')
        if m.get('user_account') is not None:
            self.user_account = m.get('user_account')
        return self


class List(TeaModel):
    def __init__(
        self,
        id: int = None,
        activity_id: str = None,
        activity_name: str = None,
        user_id: str = None,
        biz_id: str = None,
        record_source: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
    ):
        # 记录ID
        self.id = id
        # 活动ID
        self.activity_id = activity_id
        # 活动名称
        self.activity_name = activity_name
        # 用户ID
        self.user_id = user_id
        # 业务ID
        self.biz_id = biz_id
        # 记录来源：NORMAL（正常发券）/ HAITUN_SYNC（上游补录）
        self.record_source = record_source
        # 创建时间
        self.gmt_create = gmt_create
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
        if self.activity_id is not None:
            result['activity_id'] = self.activity_id
        if self.activity_name is not None:
            result['activity_name'] = self.activity_name
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.record_source is not None:
            result['record_source'] = self.record_source
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('activity_id') is not None:
            self.activity_id = m.get('activity_id')
        if m.get('activity_name') is not None:
            self.activity_name = m.get('activity_name')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('record_source') is not None:
            self.record_source = m.get('record_source')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        return self


class UpdatedTaskInfo(TeaModel):
    def __init__(
        self,
        task_name: str = None,
        app_id: str = None,
        survey_id: str = None,
        task_id: str = None,
        notes: str = None,
        tenant_id: str = None,
        operator: str = None,
        banner_title: str = None,
        banner_image_urls: str = None,
        banner_image_full_urls: List[str] = None,
        question_num: int = None,
        task_link_url: str = None,
        person_divide_content: str = None,
        city_divide_urls: str = None,
        city_divide_full_urls: List[str] = None,
        sample_num: int = None,
        completed_num: int = None,
        product_code_type: str = None,
        product_capacity: int = None,
        prize_channel: int = None,
        alipay_account_id: str = None,
        prize_type: int = None,
        full_red_packet_amount: str = None,
        full_red_packet_text_info: str = None,
        examine_red_packet_amount: str = None,
        cert_instance_id: str = None,
        cert_instance_detail: CertInstanceDetail = None,
        verify_omment: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        review_content: str = None,
        status: int = None,
        crowd_config: str = None,
    ):
        # 任务标题(同一个租户不能重复)
        self.task_name = task_name
        # appId
        self.app_id = app_id
        # 问卷ID
        self.survey_id = survey_id
        # 任务ID
        self.task_id = task_id
        # 备注信息
        self.notes = notes
        # 租户ID
        self.tenant_id = tenant_id
        # 操作者ID
        self.operator = operator
        # banner标题
        self.banner_title = banner_title
        # banner图片地址（最多支持3张）
        self.banner_image_urls = banner_image_urls
        # banner 图片地址, 拼装后的url
        self.banner_image_full_urls = banner_image_full_urls
        # 题量
        self.question_num = question_num
        # 任务连接地址
        self.task_link_url = task_link_url
        # 人群划分描述
        self.person_divide_content = person_divide_content
        # 城市列表
        self.city_divide_urls = city_divide_urls
        # 城市列表, 拼装后的url
        self.city_divide_full_urls = city_divide_full_urls
        # 样本数量
        self.sample_num = sample_num
        # 完成样本量
        self.completed_num = completed_num
        # 产品下单code类型（1-资源包 2-后付费）
        self.product_code_type = product_code_type
        # 产品余量
        self.product_capacity = product_capacity
        # 奖励渠道（0-手动发支付宝余额 1-海豚红包 2-问卷自带）
        self.prize_channel = prize_channel
        # 支付宝账号
        self.alipay_account_id = alipay_account_id
        # 奖励类型（0-定额红包）
        self.prize_type = prize_type
        # 全额红包金额，奖励渠道为0和1时
        self.full_red_packet_amount = full_red_packet_amount
        # 全额红包描述，奖励渠道为2时，此处必填
        self.full_red_packet_text_info = full_red_packet_text_info
        # 甄别红包金额
        self.examine_red_packet_amount = examine_red_packet_amount
        # 关联的证书instanceId
        self.cert_instance_id = cert_instance_id
        # 证书实例详情
        self.cert_instance_detail = cert_instance_detail
        # 审核意见
        self.verify_omment = verify_omment
        # 任务创建时间
        self.gmt_create = gmt_create
        # 任务修改时间
        self.gmt_modified = gmt_modified
        # 审核理由
        self.review_content = review_content
        # 状态
        self.status = status
        # 人群配置
        self.crowd_config = crowd_config

    def validate(self):
        self.validate_required(self.task_name, 'task_name')
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.survey_id, 'survey_id')
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.operator, 'operator')
        self.validate_required(self.banner_title, 'banner_title')
        self.validate_required(self.question_num, 'question_num')
        self.validate_required(self.task_link_url, 'task_link_url')
        self.validate_required(self.sample_num, 'sample_num')
        self.validate_required(self.completed_num, 'completed_num')
        self.validate_required(self.product_code_type, 'product_code_type')
        self.validate_required(self.product_capacity, 'product_capacity')
        self.validate_required(self.prize_channel, 'prize_channel')
        self.validate_required(self.prize_type, 'prize_type')
        self.validate_required(self.full_red_packet_amount, 'full_red_packet_amount')
        self.validate_required(self.examine_red_packet_amount, 'examine_red_packet_amount')
        self.validate_required(self.cert_instance_detail, 'cert_instance_detail')
        if self.cert_instance_detail:
            self.cert_instance_detail.validate()
        self.validate_required(self.gmt_create, 'gmt_create')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        self.validate_required(self.status, 'status')
        self.validate_required(self.crowd_config, 'crowd_config')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.task_name is not None:
            result['task_name'] = self.task_name
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.survey_id is not None:
            result['survey_id'] = self.survey_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.notes is not None:
            result['notes'] = self.notes
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.operator is not None:
            result['operator'] = self.operator
        if self.banner_title is not None:
            result['banner_title'] = self.banner_title
        if self.banner_image_urls is not None:
            result['banner_image_urls'] = self.banner_image_urls
        if self.banner_image_full_urls is not None:
            result['banner_image_full_urls'] = self.banner_image_full_urls
        if self.question_num is not None:
            result['question_num'] = self.question_num
        if self.task_link_url is not None:
            result['task_link_url'] = self.task_link_url
        if self.person_divide_content is not None:
            result['person_divide_content'] = self.person_divide_content
        if self.city_divide_urls is not None:
            result['city_divide_urls'] = self.city_divide_urls
        if self.city_divide_full_urls is not None:
            result['city_divide_full_urls'] = self.city_divide_full_urls
        if self.sample_num is not None:
            result['sample_num'] = self.sample_num
        if self.completed_num is not None:
            result['completed_num'] = self.completed_num
        if self.product_code_type is not None:
            result['product_code_type'] = self.product_code_type
        if self.product_capacity is not None:
            result['product_capacity'] = self.product_capacity
        if self.prize_channel is not None:
            result['prize_channel'] = self.prize_channel
        if self.alipay_account_id is not None:
            result['alipay_account_id'] = self.alipay_account_id
        if self.prize_type is not None:
            result['prize_type'] = self.prize_type
        if self.full_red_packet_amount is not None:
            result['full_red_packet_amount'] = self.full_red_packet_amount
        if self.full_red_packet_text_info is not None:
            result['full_red_packet_text_info'] = self.full_red_packet_text_info
        if self.examine_red_packet_amount is not None:
            result['examine_red_packet_amount'] = self.examine_red_packet_amount
        if self.cert_instance_id is not None:
            result['cert_instance_id'] = self.cert_instance_id
        if self.cert_instance_detail is not None:
            result['cert_instance_detail'] = self.cert_instance_detail.to_map()
        if self.verify_omment is not None:
            result['verify_omment'] = self.verify_omment
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.review_content is not None:
            result['review_content'] = self.review_content
        if self.status is not None:
            result['status'] = self.status
        if self.crowd_config is not None:
            result['crowd_config'] = self.crowd_config
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('task_name') is not None:
            self.task_name = m.get('task_name')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('survey_id') is not None:
            self.survey_id = m.get('survey_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('notes') is not None:
            self.notes = m.get('notes')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('banner_title') is not None:
            self.banner_title = m.get('banner_title')
        if m.get('banner_image_urls') is not None:
            self.banner_image_urls = m.get('banner_image_urls')
        if m.get('banner_image_full_urls') is not None:
            self.banner_image_full_urls = m.get('banner_image_full_urls')
        if m.get('question_num') is not None:
            self.question_num = m.get('question_num')
        if m.get('task_link_url') is not None:
            self.task_link_url = m.get('task_link_url')
        if m.get('person_divide_content') is not None:
            self.person_divide_content = m.get('person_divide_content')
        if m.get('city_divide_urls') is not None:
            self.city_divide_urls = m.get('city_divide_urls')
        if m.get('city_divide_full_urls') is not None:
            self.city_divide_full_urls = m.get('city_divide_full_urls')
        if m.get('sample_num') is not None:
            self.sample_num = m.get('sample_num')
        if m.get('completed_num') is not None:
            self.completed_num = m.get('completed_num')
        if m.get('product_code_type') is not None:
            self.product_code_type = m.get('product_code_type')
        if m.get('product_capacity') is not None:
            self.product_capacity = m.get('product_capacity')
        if m.get('prize_channel') is not None:
            self.prize_channel = m.get('prize_channel')
        if m.get('alipay_account_id') is not None:
            self.alipay_account_id = m.get('alipay_account_id')
        if m.get('prize_type') is not None:
            self.prize_type = m.get('prize_type')
        if m.get('full_red_packet_amount') is not None:
            self.full_red_packet_amount = m.get('full_red_packet_amount')
        if m.get('full_red_packet_text_info') is not None:
            self.full_red_packet_text_info = m.get('full_red_packet_text_info')
        if m.get('examine_red_packet_amount') is not None:
            self.examine_red_packet_amount = m.get('examine_red_packet_amount')
        if m.get('cert_instance_id') is not None:
            self.cert_instance_id = m.get('cert_instance_id')
        if m.get('cert_instance_detail') is not None:
            temp_model = CertInstanceDetail()
            self.cert_instance_detail = temp_model.from_map(m['cert_instance_detail'])
        if m.get('verify_omment') is not None:
            self.verify_omment = m.get('verify_omment')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('review_content') is not None:
            self.review_content = m.get('review_content')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('crowd_config') is not None:
            self.crowd_config = m.get('crowd_config')
        return self


class ALiYunTransactionResult(TeaModel):
    def __init__(
        self,
        block_hash: str = None,
        block_height: int = None,
        block_version: str = None,
        create_time: int = None,
        hash: str = None,
        transaction: ALiYunTransaction = None,
    ):
        # block_hash
        self.block_hash = block_hash
        # block_height
        self.block_height = block_height
        # block_version
        self.block_version = block_version
        # create_time
        self.create_time = create_time
        # hash
        self.hash = hash
        # Transaction
        self.transaction = transaction

    def validate(self):
        if self.transaction:
            self.transaction.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.block_hash is not None:
            result['block_hash'] = self.block_hash
        if self.block_height is not None:
            result['block_height'] = self.block_height
        if self.block_version is not None:
            result['block_version'] = self.block_version
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.hash is not None:
            result['hash'] = self.hash
        if self.transaction is not None:
            result['transaction'] = self.transaction.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('block_hash') is not None:
            self.block_hash = m.get('block_hash')
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        if m.get('block_version') is not None:
            self.block_version = m.get('block_version')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('transaction') is not None:
            temp_model = ALiYunTransaction()
            self.transaction = temp_model.from_map(m['transaction'])
        return self


class PublicKeyInfo(TeaModel):
    def __init__(
        self,
        key_id: str = None,
        public_key: str = None,
        sign_type: str = None,
        expire: int = None,
        status: int = None,
        controller: str = None,
    ):
        # 公钥id
        self.key_id = key_id
        # 公钥内容
        self.public_key = public_key
        # 算法类型
        self.sign_type = sign_type
        # 过期时间戳（毫秒）
        self.expire = expire
        # 公钥状态，0:不可用 1:可用
        self.status = status
        # 创建者的did
        self.controller = controller

    def validate(self):
        self.validate_required(self.key_id, 'key_id')
        self.validate_required(self.public_key, 'public_key')
        self.validate_required(self.sign_type, 'sign_type')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.key_id is not None:
            result['key_id'] = self.key_id
        if self.public_key is not None:
            result['public_key'] = self.public_key
        if self.sign_type is not None:
            result['sign_type'] = self.sign_type
        if self.expire is not None:
            result['expire'] = self.expire
        if self.status is not None:
            result['status'] = self.status
        if self.controller is not None:
            result['controller'] = self.controller
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key_id') is not None:
            self.key_id = m.get('key_id')
        if m.get('public_key') is not None:
            self.public_key = m.get('public_key')
        if m.get('sign_type') is not None:
            self.sign_type = m.get('sign_type')
        if m.get('expire') is not None:
            self.expire = m.get('expire')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('controller') is not None:
            self.controller = m.get('controller')
        return self


class UpdateVCStatus(TeaModel):
    def __init__(
        self,
        status: str = None,
        vc_id: str = None,
    ):
        # valid or invalid
        self.status = status
        # 可验证声明id
        self.vc_id = vc_id

    def validate(self):
        self.validate_required(self.status, 'status')
        self.validate_required(self.vc_id, 'vc_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.status is not None:
            result['status'] = self.status
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        return self


class ContractBindAppReq(TeaModel):
    def __init__(
        self,
        application_id: str = None,
        service_ids: List[str] = None,
    ):
        # 应用ID
        self.application_id = application_id
        # 合约服务标识集合
        self.service_ids = service_ids

    def validate(self):
        self.validate_required(self.application_id, 'application_id')
        if self.application_id is not None:
            self.validate_max_length(self.application_id, 'application_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.application_id is not None:
            result['application_id'] = self.application_id
        if self.service_ids is not None:
            result['service_ids'] = self.service_ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('application_id') is not None:
            self.application_id = m.get('application_id')
        if m.get('service_ids') is not None:
            self.service_ids = m.get('service_ids')
        return self


class OCUserData(TeaModel):
    def __init__(
        self,
        create_time: str = None,
        phone_number: str = None,
        user_name: str = None,
    ):
        # 创建时间
        self.create_time = create_time
        # 手机号
        self.phone_number = phone_number
        # 用户姓名
        self.user_name = user_name

    def validate(self):
        self.validate_required(self.create_time, 'create_time')
        if self.create_time is not None:
            self.validate_pattern(self.create_time, 'create_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.phone_number, 'phone_number')
        self.validate_required(self.user_name, 'user_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.phone_number is not None:
            result['phone_number'] = self.phone_number
        if self.user_name is not None:
            result['user_name'] = self.user_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('phone_number') is not None:
            self.phone_number = m.get('phone_number')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        return self


class CarItemsInfo(TeaModel):
    def __init__(
        self,
        vin: str = None,
        engine_no: str = None,
        register_date: str = None,
        model_code: str = None,
        use_nature_code: str = None,
    ):
        # 车架号
        self.vin = vin
        # 发动机号
        self.engine_no = engine_no
        # 注册日期
        self.register_date = register_date
        # 品牌车型
        self.model_code = model_code
        # 营运性质
        self.use_nature_code = use_nature_code

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.vin is not None:
            result['vin'] = self.vin
        if self.engine_no is not None:
            result['engine_no'] = self.engine_no
        if self.register_date is not None:
            result['register_date'] = self.register_date
        if self.model_code is not None:
            result['model_code'] = self.model_code
        if self.use_nature_code is not None:
            result['use_nature_code'] = self.use_nature_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('vin') is not None:
            self.vin = m.get('vin')
        if m.get('engine_no') is not None:
            self.engine_no = m.get('engine_no')
        if m.get('register_date') is not None:
            self.register_date = m.get('register_date')
        if m.get('model_code') is not None:
            self.model_code = m.get('model_code')
        if m.get('use_nature_code') is not None:
            self.use_nature_code = m.get('use_nature_code')
        return self


class UserMetaInfo(TeaModel):
    def __init__(
        self,
        type: str = None,
        data: List[KeyValuePair] = None,
    ):
        # 用户身份信息类型
        self.type = type
        # 用户身份信息
        self.data = data

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.data, 'data')
        if self.data:
            for k in self.data:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = KeyValuePair()
                self.data.append(temp_model.from_map(k))
        return self


class CarBusinessPrice(TeaModel):
    def __init__(
        self,
        brand_id: str = None,
        brand_name: str = None,
        car_series_id: str = None,
        car_series: str = None,
        car_id: str = None,
        car_name: str = None,
        car_year: str = None,
        city_code: str = None,
        city_name: str = None,
        series_guide_price: str = None,
        official_price: int = None,
        full_price: int = None,
        naked_price: int = None,
        purchase_tax: int = None,
        vehicle_vessel_tax: int = None,
        business_insurance: int = None,
        extra_content: str = None,
    ):
        # 品牌id
        self.brand_id = brand_id
        # 品牌名称
        self.brand_name = brand_name
        # 车系ID
        # 
        self.car_series_id = car_series_id
        # 车系名称
        self.car_series = car_series
        # 车型ID
        self.car_id = car_id
        # 车型名称
        self.car_name = car_name
        # 年款
        self.car_year = car_year
        # 城市code
        self.city_code = city_code
        # 城市名称
        self.city_name = city_name
        # 车系指导价（范围值） 单位到分
        self.series_guide_price = series_guide_price
        # 车型指导价（具体值）单位到分
        self.official_price = official_price
        # 车主成交价（具体值）单位到分
        self.full_price = full_price
        # 车主裸车价（具体值）单位到分
        self.naked_price = naked_price
        # 购置税（具体值）单位到分
        self.purchase_tax = purchase_tax
        # 车船税（具体值）单位到分
        self.vehicle_vessel_tax = vehicle_vessel_tax
        # 商业险（具体值）单位到分
        self.business_insurance = business_insurance
        # json 扩展字段
        self.extra_content = extra_content

    def validate(self):
        self.validate_required(self.brand_id, 'brand_id')
        self.validate_required(self.brand_name, 'brand_name')
        self.validate_required(self.car_series_id, 'car_series_id')
        self.validate_required(self.car_series, 'car_series')
        self.validate_required(self.car_id, 'car_id')
        self.validate_required(self.car_name, 'car_name')
        self.validate_required(self.car_year, 'car_year')
        self.validate_required(self.city_code, 'city_code')
        self.validate_required(self.city_name, 'city_name')
        self.validate_required(self.series_guide_price, 'series_guide_price')
        self.validate_required(self.official_price, 'official_price')
        self.validate_required(self.full_price, 'full_price')
        self.validate_required(self.naked_price, 'naked_price')
        self.validate_required(self.purchase_tax, 'purchase_tax')
        self.validate_required(self.vehicle_vessel_tax, 'vehicle_vessel_tax')
        self.validate_required(self.business_insurance, 'business_insurance')
        self.validate_required(self.extra_content, 'extra_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.brand_id is not None:
            result['brand_id'] = self.brand_id
        if self.brand_name is not None:
            result['brand_name'] = self.brand_name
        if self.car_series_id is not None:
            result['car_series_id'] = self.car_series_id
        if self.car_series is not None:
            result['car_series'] = self.car_series
        if self.car_id is not None:
            result['car_id'] = self.car_id
        if self.car_name is not None:
            result['car_name'] = self.car_name
        if self.car_year is not None:
            result['car_year'] = self.car_year
        if self.city_code is not None:
            result['city_code'] = self.city_code
        if self.city_name is not None:
            result['city_name'] = self.city_name
        if self.series_guide_price is not None:
            result['series_guide_price'] = self.series_guide_price
        if self.official_price is not None:
            result['official_price'] = self.official_price
        if self.full_price is not None:
            result['full_price'] = self.full_price
        if self.naked_price is not None:
            result['naked_price'] = self.naked_price
        if self.purchase_tax is not None:
            result['purchase_tax'] = self.purchase_tax
        if self.vehicle_vessel_tax is not None:
            result['vehicle_vessel_tax'] = self.vehicle_vessel_tax
        if self.business_insurance is not None:
            result['business_insurance'] = self.business_insurance
        if self.extra_content is not None:
            result['extra_content'] = self.extra_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('brand_id') is not None:
            self.brand_id = m.get('brand_id')
        if m.get('brand_name') is not None:
            self.brand_name = m.get('brand_name')
        if m.get('car_series_id') is not None:
            self.car_series_id = m.get('car_series_id')
        if m.get('car_series') is not None:
            self.car_series = m.get('car_series')
        if m.get('car_id') is not None:
            self.car_id = m.get('car_id')
        if m.get('car_name') is not None:
            self.car_name = m.get('car_name')
        if m.get('car_year') is not None:
            self.car_year = m.get('car_year')
        if m.get('city_code') is not None:
            self.city_code = m.get('city_code')
        if m.get('city_name') is not None:
            self.city_name = m.get('city_name')
        if m.get('series_guide_price') is not None:
            self.series_guide_price = m.get('series_guide_price')
        if m.get('official_price') is not None:
            self.official_price = m.get('official_price')
        if m.get('full_price') is not None:
            self.full_price = m.get('full_price')
        if m.get('naked_price') is not None:
            self.naked_price = m.get('naked_price')
        if m.get('purchase_tax') is not None:
            self.purchase_tax = m.get('purchase_tax')
        if m.get('vehicle_vessel_tax') is not None:
            self.vehicle_vessel_tax = m.get('vehicle_vessel_tax')
        if m.get('business_insurance') is not None:
            self.business_insurance = m.get('business_insurance')
        if m.get('extra_content') is not None:
            self.extra_content = m.get('extra_content')
        return self


class ALiYunChainSubnetList(TeaModel):
    def __init__(
        self,
        ant_chain_id: str = None,
        blockchain_name: str = None,
        consortium_admin: bool = None,
        blockchain_subnet_list: List[ALiYunChainSubnet] = None,
    ):
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # 子链名称
        self.blockchain_name = blockchain_name
        # 联盟管理员
        self.consortium_admin = consortium_admin
        # 子链列表信息
        self.blockchain_subnet_list = blockchain_subnet_list

    def validate(self):
        if self.blockchain_subnet_list:
            for k in self.blockchain_subnet_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.blockchain_name is not None:
            result['blockchain_name'] = self.blockchain_name
        if self.consortium_admin is not None:
            result['consortium_admin'] = self.consortium_admin
        result['blockchain_subnet_list'] = []
        if self.blockchain_subnet_list is not None:
            for k in self.blockchain_subnet_list:
                result['blockchain_subnet_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('blockchain_name') is not None:
            self.blockchain_name = m.get('blockchain_name')
        if m.get('consortium_admin') is not None:
            self.consortium_admin = m.get('consortium_admin')
        self.blockchain_subnet_list = []
        if m.get('blockchain_subnet_list') is not None:
            for k in m.get('blockchain_subnet_list'):
                temp_model = ALiYunChainSubnet()
                self.blockchain_subnet_list.append(temp_model.from_map(k))
        return self


class ContracPageReq(TeaModel):
    def __init__(
        self,
        type: str = None,
        num: int = None,
        size: int = None,
    ):
        # 合约服务类别
        self.type = type
        # 页码
        self.num = num
        # 页大小
        self.size = size

    def validate(self):
        self.validate_required(self.num, 'num')
        self.validate_required(self.size, 'size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.num is not None:
            result['num'] = self.num
        if self.size is not None:
            result['size'] = self.size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('num') is not None:
            self.num = m.get('num')
        if m.get('size') is not None:
            self.size = m.get('size')
        return self


class BatchSubmitCarResult(TeaModel):
    def __init__(
        self,
        submit_id: str = None,
        is_success: bool = None,
        push_result_code: str = None,
    ):
        # 提交线索唯一请求id
        self.submit_id = submit_id
        # 是否成功
        self.is_success = is_success
        # OK
        # NO_DEMAND 无线索需求，需要重试
        # INVALID 无效，不要重试
        self.push_result_code = push_result_code

    def validate(self):
        self.validate_required(self.submit_id, 'submit_id')
        self.validate_required(self.is_success, 'is_success')
        self.validate_required(self.push_result_code, 'push_result_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.submit_id is not None:
            result['submit_id'] = self.submit_id
        if self.is_success is not None:
            result['is_success'] = self.is_success
        if self.push_result_code is not None:
            result['push_result_code'] = self.push_result_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('submit_id') is not None:
            self.submit_id = m.get('submit_id')
        if m.get('is_success') is not None:
            self.is_success = m.get('is_success')
        if m.get('push_result_code') is not None:
            self.push_result_code = m.get('push_result_code')
        return self


class CrowdTagEnumResp(TeaModel):
    def __init__(
        self,
        crowd_tag: str = None,
        crow_tag_enum_item_list: List[CrowdTagEnumItemDTO] = None,
    ):
        # 人群标签code
        self.crowd_tag = crowd_tag
        # 人群标签枚举列表对象
        self.crow_tag_enum_item_list = crow_tag_enum_item_list

    def validate(self):
        self.validate_required(self.crowd_tag, 'crowd_tag')
        self.validate_required(self.crow_tag_enum_item_list, 'crow_tag_enum_item_list')
        if self.crow_tag_enum_item_list:
            for k in self.crow_tag_enum_item_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.crowd_tag is not None:
            result['crowd_tag'] = self.crowd_tag
        result['crow_tag_enum_item_list'] = []
        if self.crow_tag_enum_item_list is not None:
            for k in self.crow_tag_enum_item_list:
                result['crow_tag_enum_item_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('crowd_tag') is not None:
            self.crowd_tag = m.get('crowd_tag')
        self.crow_tag_enum_item_list = []
        if m.get('crow_tag_enum_item_list') is not None:
            for k in m.get('crow_tag_enum_item_list'):
                temp_model = CrowdTagEnumItemDTO()
                self.crow_tag_enum_item_list.append(temp_model.from_map(k))
        return self


class Agreement(TeaModel):
    def __init__(
        self,
        agreement_name: str = None,
        agreement_type: str = None,
        agreement_url: str = None,
        agreement_file_oss_key: str = None,
        agreement_file_original_name: str = None,
    ):
        # 协议名称
        self.agreement_name = agreement_name
        # 协议类型
        self.agreement_type = agreement_type
        # 第三方原始协议链接
        self.agreement_url = agreement_url
        # 协议文件上传目录
        self.agreement_file_oss_key = agreement_file_oss_key
        # 上传时的协议原始文件名
        self.agreement_file_original_name = agreement_file_original_name

    def validate(self):
        self.validate_required(self.agreement_name, 'agreement_name')
        self.validate_required(self.agreement_type, 'agreement_type')
        self.validate_required(self.agreement_url, 'agreement_url')
        self.validate_required(self.agreement_file_oss_key, 'agreement_file_oss_key')
        self.validate_required(self.agreement_file_original_name, 'agreement_file_original_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.agreement_name is not None:
            result['agreement_name'] = self.agreement_name
        if self.agreement_type is not None:
            result['agreement_type'] = self.agreement_type
        if self.agreement_url is not None:
            result['agreement_url'] = self.agreement_url
        if self.agreement_file_oss_key is not None:
            result['agreement_file_oss_key'] = self.agreement_file_oss_key
        if self.agreement_file_original_name is not None:
            result['agreement_file_original_name'] = self.agreement_file_original_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('agreement_name') is not None:
            self.agreement_name = m.get('agreement_name')
        if m.get('agreement_type') is not None:
            self.agreement_type = m.get('agreement_type')
        if m.get('agreement_url') is not None:
            self.agreement_url = m.get('agreement_url')
        if m.get('agreement_file_oss_key') is not None:
            self.agreement_file_oss_key = m.get('agreement_file_oss_key')
        if m.get('agreement_file_original_name') is not None:
            self.agreement_file_original_name = m.get('agreement_file_original_name')
        return self


class ALiYunChainBlockInfo(TeaModel):
    def __init__(
        self,
        alias: str = None,
        block_hash: str = None,
        root_tx_hash: str = None,
        height: int = None,
        previous_hash: str = None,
        create_time: int = None,
        biz_data: str = None,
        transaction_size: int = None,
        version: int = None,
        size: int = None,
    ):
        # alias
        self.alias = alias
        # block_hash
        self.block_hash = block_hash
        # root_tx_hash
        self.root_tx_hash = root_tx_hash
        # height
        self.height = height
        # previous_hash
        self.previous_hash = previous_hash
        # create_time
        self.create_time = create_time
        # biz_data
        self.biz_data = biz_data
        # transaction_size
        self.transaction_size = transaction_size
        # version
        self.version = version
        # size
        self.size = size

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.alias is not None:
            result['alias'] = self.alias
        if self.block_hash is not None:
            result['block_hash'] = self.block_hash
        if self.root_tx_hash is not None:
            result['root_tx_hash'] = self.root_tx_hash
        if self.height is not None:
            result['height'] = self.height
        if self.previous_hash is not None:
            result['previous_hash'] = self.previous_hash
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.biz_data is not None:
            result['biz_data'] = self.biz_data
        if self.transaction_size is not None:
            result['transaction_size'] = self.transaction_size
        if self.version is not None:
            result['version'] = self.version
        if self.size is not None:
            result['size'] = self.size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('alias') is not None:
            self.alias = m.get('alias')
        if m.get('block_hash') is not None:
            self.block_hash = m.get('block_hash')
        if m.get('root_tx_hash') is not None:
            self.root_tx_hash = m.get('root_tx_hash')
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('previous_hash') is not None:
            self.previous_hash = m.get('previous_hash')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('biz_data') is not None:
            self.biz_data = m.get('biz_data')
        if m.get('transaction_size') is not None:
            self.transaction_size = m.get('transaction_size')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('size') is not None:
            self.size = m.get('size')
        return self


class DiscreteValue(TeaModel):
    def __init__(
        self,
        sort_id: int = None,
        text: str = None,
        tips: str = None,
        unit: str = None,
        value: str = None,
    ):
        # 排序id
        self.sort_id = sort_id
        # 字段描述
        self.text = text
        # 提示信息
        self.tips = tips
        # 单位信息
        self.unit = unit
        # 值内容
        self.value = value

    def validate(self):
        self.validate_required(self.text, 'text')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sort_id is not None:
            result['sort_id'] = self.sort_id
        if self.text is not None:
            result['text'] = self.text
        if self.tips is not None:
            result['tips'] = self.tips
        if self.unit is not None:
            result['unit'] = self.unit
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sort_id') is not None:
            self.sort_id = m.get('sort_id')
        if m.get('text') is not None:
            self.text = m.get('text')
        if m.get('tips') is not None:
            self.tips = m.get('tips')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class ContractPageResp(TeaModel):
    def __init__(
        self,
        list: List[ContractPageListResp] = None,
        total: int = None,
    ):
        # 合约列表
        self.list = list
        # 总数
        self.total = total

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        if self.total is not None:
            result['total'] = self.total
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = ContractPageListResp()
                self.list.append(temp_model.from_map(k))
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class AccountPo(TeaModel):
    def __init__(
        self,
        account: str = None,
        create_time: int = None,
        hash: str = None,
        parent: str = None,
    ):
        # 账户 hash
        self.account = account
        # 账户创建时间
        self.create_time = create_time
        # 创建该账户的交易hash
        self.hash = hash
        # 创建该账户的 账户hash
        self.parent = parent

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.account is not None:
            result['account'] = self.account
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.hash is not None:
            result['hash'] = self.hash
        if self.parent is not None:
            result['parent'] = self.parent
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('parent') is not None:
            self.parent = m.get('parent')
        return self


class DidDeleteService(TeaModel):
    def __init__(
        self,
        previous_version: int = None,
        service_id: str = None,
    ):
        # 修改前did doc版本
        self.previous_version = previous_version
        # 指定服务的id
        self.service_id = service_id

    def validate(self):
        self.validate_required(self.previous_version, 'previous_version')
        self.validate_required(self.service_id, 'service_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.previous_version is not None:
            result['previous_version'] = self.previous_version
        if self.service_id is not None:
            result['service_id'] = self.service_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('previous_version') is not None:
            self.previous_version = m.get('previous_version')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        return self


class SettleCardInfo(TeaModel):
    def __init__(
        self,
        account_branch_name: str = None,
        account_holder_name: str = None,
        account_inst_city: str = None,
        account_inst_id: str = None,
        account_inst_name: str = None,
        account_inst_province: str = None,
        account_no: str = None,
        account_type: str = None,
        usage_type: str = None,
    ):
        # 开户支行名
        self.account_branch_name = account_branch_name
        # 卡户名
        self.account_holder_name = account_holder_name
        # 开户行所在地-市
        self.account_inst_city = account_inst_city
        # 开户行简称缩写
        self.account_inst_id = account_inst_id
        # 银行名称
        self.account_inst_name = account_inst_name
        # 开户行所在地-省
        self.account_inst_province = account_inst_province
        # 银行卡号
        self.account_no = account_no
        # 卡类型
        self.account_type = account_type
        # 账号使用类型
        self.usage_type = usage_type

    def validate(self):
        self.validate_required(self.account_branch_name, 'account_branch_name')
        self.validate_required(self.account_holder_name, 'account_holder_name')
        self.validate_required(self.account_inst_city, 'account_inst_city')
        self.validate_required(self.account_inst_id, 'account_inst_id')
        self.validate_required(self.account_inst_name, 'account_inst_name')
        self.validate_required(self.account_inst_province, 'account_inst_province')
        self.validate_required(self.account_no, 'account_no')
        self.validate_required(self.account_type, 'account_type')
        self.validate_required(self.usage_type, 'usage_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.account_branch_name is not None:
            result['account_branch_name'] = self.account_branch_name
        if self.account_holder_name is not None:
            result['account_holder_name'] = self.account_holder_name
        if self.account_inst_city is not None:
            result['account_inst_city'] = self.account_inst_city
        if self.account_inst_id is not None:
            result['account_inst_id'] = self.account_inst_id
        if self.account_inst_name is not None:
            result['account_inst_name'] = self.account_inst_name
        if self.account_inst_province is not None:
            result['account_inst_province'] = self.account_inst_province
        if self.account_no is not None:
            result['account_no'] = self.account_no
        if self.account_type is not None:
            result['account_type'] = self.account_type
        if self.usage_type is not None:
            result['usage_type'] = self.usage_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('account_branch_name') is not None:
            self.account_branch_name = m.get('account_branch_name')
        if m.get('account_holder_name') is not None:
            self.account_holder_name = m.get('account_holder_name')
        if m.get('account_inst_city') is not None:
            self.account_inst_city = m.get('account_inst_city')
        if m.get('account_inst_id') is not None:
            self.account_inst_id = m.get('account_inst_id')
        if m.get('account_inst_name') is not None:
            self.account_inst_name = m.get('account_inst_name')
        if m.get('account_inst_province') is not None:
            self.account_inst_province = m.get('account_inst_province')
        if m.get('account_no') is not None:
            self.account_no = m.get('account_no')
        if m.get('account_type') is not None:
            self.account_type = m.get('account_type')
        if m.get('usage_type') is not None:
            self.usage_type = m.get('usage_type')
        return self


class VCEvent(TeaModel):
    def __init__(
        self,
        action: str = None,
        from_: str = None,
        height: int = None,
        issuer: str = None,
        status: str = None,
        subjec: str = None,
        tx_hash: str = None,
        tx_index: int = None,
        vc_hash: str = None,
        vc_id: str = None,
    ):
        # 事件对应的合约方法
        self.action = action
        # 本次事件的触发者
        self.from_ = from_
        # 事件在区块的高度
        self.height = height
        # 该VC的颁发者
        self.issuer = issuer
        # 有效，或者无效
        self.status = status
        # 该vc的接受者
        self.subjec = subjec
        # 交易hash
        # 
        self.tx_hash = tx_hash
        # 交易在区块中的index
        self.tx_index = tx_index
        # 可验证声明Hash值
        self.vc_hash = vc_hash
        # vcid
        self.vc_id = vc_id

    def validate(self):
        self.validate_required(self.action, 'action')
        self.validate_required(self.from_, 'from_')
        self.validate_required(self.height, 'height')
        self.validate_required(self.issuer, 'issuer')
        self.validate_required(self.status, 'status')
        self.validate_required(self.subjec, 'subjec')
        self.validate_required(self.tx_hash, 'tx_hash')
        self.validate_required(self.tx_index, 'tx_index')
        self.validate_required(self.vc_hash, 'vc_hash')
        self.validate_required(self.vc_id, 'vc_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.action is not None:
            result['action'] = self.action
        if self.from_ is not None:
            result['from'] = self.from_
        if self.height is not None:
            result['height'] = self.height
        if self.issuer is not None:
            result['issuer'] = self.issuer
        if self.status is not None:
            result['status'] = self.status
        if self.subjec is not None:
            result['subjec'] = self.subjec
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.tx_index is not None:
            result['tx_index'] = self.tx_index
        if self.vc_hash is not None:
            result['vc_hash'] = self.vc_hash
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('action') is not None:
            self.action = m.get('action')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('issuer') is not None:
            self.issuer = m.get('issuer')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('subjec') is not None:
            self.subjec = m.get('subjec')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('tx_index') is not None:
            self.tx_index = m.get('tx_index')
        if m.get('vc_hash') is not None:
            self.vc_hash = m.get('vc_hash')
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        return self


class DisServiceInfo(TeaModel):
    def __init__(
        self,
        controller: str = None,
        end_point: str = None,
        service_id: str = None,
        service_type: str = None,
    ):
        # 提供服务的did
        self.controller = controller
        # 服务地址
        self.end_point = end_point
        # 服务id
        self.service_id = service_id
        # 服务类型
        self.service_type = service_type

    def validate(self):
        self.validate_required(self.controller, 'controller')
        self.validate_required(self.end_point, 'end_point')
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.service_type, 'service_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.controller is not None:
            result['controller'] = self.controller
        if self.end_point is not None:
            result['end_point'] = self.end_point
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.service_type is not None:
            result['service_type'] = self.service_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('controller') is not None:
            self.controller = m.get('controller')
        if m.get('end_point') is not None:
            self.end_point = m.get('end_point')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('service_type') is not None:
            self.service_type = m.get('service_type')
        return self


class CarOwnerUserInfo(TeaModel):
    def __init__(
        self,
        user_id: str = None,
        phone_num: str = None,
    ):
        # 用户id
        self.user_id = user_id
        # 手机号
        self.phone_num = phone_num

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.phone_num, 'phone_num')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.phone_num is not None:
            result['phone_num'] = self.phone_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('phone_num') is not None:
            self.phone_num = m.get('phone_num')
        return self


class PoapInfo(TeaModel):
    def __init__(
        self,
        poap_id: str = None,
        poap_name: str = None,
        uni_hash: str = None,
        status: str = None,
        poap_url: str = None,
        render_type: str = None,
        fault_tolerance_url: str = None,
        detail_alipays_url: str = None,
        detail_alipays_url_expire_time: str = None,
    ):
        # 徽章ID，具有唯一性
        self.poap_id = poap_id
        # 徽章名字
        self.poap_name = poap_name
        # 徽章HASH
        self.uni_hash = uni_hash
        # 状态，枚举值
        self.status = status
        # 徽章资源 URL
        self.poap_url = poap_url
        # 枚举值，2D_IMAGE--2D图片渲染；3D_OASISENGINE--3D模型渲染
        self.render_type = render_type
        # 3D模型降级使用的资源URL
        self.fault_tolerance_url = fault_tolerance_url
        # 小程序详情跳转URL。临时链接，过期时间为 detail_alipays_url_expire_time 字段的值
        self.detail_alipays_url = detail_alipays_url
        # 详情页跳转URL过期时间
        self.detail_alipays_url_expire_time = detail_alipays_url_expire_time

    def validate(self):
        self.validate_required(self.poap_id, 'poap_id')
        self.validate_required(self.poap_name, 'poap_name')
        self.validate_required(self.uni_hash, 'uni_hash')
        self.validate_required(self.poap_url, 'poap_url')
        self.validate_required(self.render_type, 'render_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.poap_id is not None:
            result['poap_id'] = self.poap_id
        if self.poap_name is not None:
            result['poap_name'] = self.poap_name
        if self.uni_hash is not None:
            result['uni_hash'] = self.uni_hash
        if self.status is not None:
            result['status'] = self.status
        if self.poap_url is not None:
            result['poap_url'] = self.poap_url
        if self.render_type is not None:
            result['render_type'] = self.render_type
        if self.fault_tolerance_url is not None:
            result['fault_tolerance_url'] = self.fault_tolerance_url
        if self.detail_alipays_url is not None:
            result['detail_alipays_url'] = self.detail_alipays_url
        if self.detail_alipays_url_expire_time is not None:
            result['detail_alipays_url_expire_time'] = self.detail_alipays_url_expire_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('poap_id') is not None:
            self.poap_id = m.get('poap_id')
        if m.get('poap_name') is not None:
            self.poap_name = m.get('poap_name')
        if m.get('uni_hash') is not None:
            self.uni_hash = m.get('uni_hash')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('poap_url') is not None:
            self.poap_url = m.get('poap_url')
        if m.get('render_type') is not None:
            self.render_type = m.get('render_type')
        if m.get('fault_tolerance_url') is not None:
            self.fault_tolerance_url = m.get('fault_tolerance_url')
        if m.get('detail_alipays_url') is not None:
            self.detail_alipays_url = m.get('detail_alipays_url')
        if m.get('detail_alipays_url_expire_time') is not None:
            self.detail_alipays_url_expire_time = m.get('detail_alipays_url_expire_time')
        return self


class DidInfo(TeaModel):
    def __init__(
        self,
        did: str = None,
        name: str = None,
    ):
        # 分布式数字身份id
        self.did = did
        # 分布式数字身份对应的用户名称
        self.name = name

    def validate(self):
        self.validate_required(self.did, 'did')
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.did is not None:
            result['did'] = self.did
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class ChoiceTappInfo(TeaModel):
    def __init__(
        self,
        tapp_name: str = None,
        tapp_version: int = None,
        service_id: str = None,
    ):
        # 选择的tapp的名字
        self.tapp_name = tapp_name
        # 版本号，如果不填就选择最新的版本
        self.tapp_version = tapp_version
        # 该tapp将被声明在did doc中的id
        self.service_id = service_id

    def validate(self):
        self.validate_required(self.tapp_name, 'tapp_name')
        self.validate_required(self.service_id, 'service_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tapp_name is not None:
            result['tapp_name'] = self.tapp_name
        if self.tapp_version is not None:
            result['tapp_version'] = self.tapp_version
        if self.service_id is not None:
            result['service_id'] = self.service_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tapp_name') is not None:
            self.tapp_name = m.get('tapp_name')
        if m.get('tapp_version') is not None:
            self.tapp_version = m.get('tapp_version')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        return self


class ALiYunContractProjectDuplicate(TeaModel):
    def __init__(
        self,
        id: str = None,
        consortium_id: str = None,
        gmt_create: int = None,
        gmt_modified: int = None,
        name: str = None,
        version: str = None,
        description: str = None,
    ):
        # id
        self.id = id
        # consortium_id
        self.consortium_id = consortium_id
        # gmt_create
        self.gmt_create = gmt_create
        # gmt_modified
        self.gmt_modified = gmt_modified
        # name
        self.name = name
        # version
        self.version = version
        # description
        self.description = description

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.name is not None:
            result['name'] = self.name
        if self.version is not None:
            result['version'] = self.version
        if self.description is not None:
            result['description'] = self.description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('description') is not None:
            self.description = m.get('description')
        return self


class CreditTransferStatementInfo(TeaModel):
    def __init__(
        self,
        credit_limit: str = None,
        expire_date: str = None,
        from_did: str = None,
        issue_date: str = None,
        issue_id: str = None,
        state_type: str = None,
        to_did: str = None,
    ):
        # 信用凭证额度
        self.credit_limit = credit_limit
        # 信用凭证到期时间
        self.expire_date = expire_date
        # 凭证来源方did
        self.from_did = from_did
        # 信用凭证发起时间
        self.issue_date = issue_date
        # 信用流转凭证
        self.issue_id = issue_id
        # 流水类型
        self.state_type = state_type
        # 凭证流转方did
        self.to_did = to_did

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.credit_limit is not None:
            result['credit_limit'] = self.credit_limit
        if self.expire_date is not None:
            result['expire_date'] = self.expire_date
        if self.from_did is not None:
            result['from_did'] = self.from_did
        if self.issue_date is not None:
            result['issue_date'] = self.issue_date
        if self.issue_id is not None:
            result['issue_id'] = self.issue_id
        if self.state_type is not None:
            result['state_type'] = self.state_type
        if self.to_did is not None:
            result['to_did'] = self.to_did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('credit_limit') is not None:
            self.credit_limit = m.get('credit_limit')
        if m.get('expire_date') is not None:
            self.expire_date = m.get('expire_date')
        if m.get('from_did') is not None:
            self.from_did = m.get('from_did')
        if m.get('issue_date') is not None:
            self.issue_date = m.get('issue_date')
        if m.get('issue_id') is not None:
            self.issue_id = m.get('issue_id')
        if m.get('state_type') is not None:
            self.state_type = m.get('state_type')
        if m.get('to_did') is not None:
            self.to_did = m.get('to_did')
        return self


class PrizeList(TeaModel):
    def __init__(
        self,
        display_info: DisplayInfo = None,
        price_strategy: PriceStrategy = None,
        prize_base_info: PrizeBaseInfo = None,
    ):
        # 对客展示信息
        self.display_info = display_info
        # 定价策略
        self.price_strategy = price_strategy
        # 奖品基本信息
        self.prize_base_info = prize_base_info

    def validate(self):
        if self.display_info:
            self.display_info.validate()
        if self.price_strategy:
            self.price_strategy.validate()
        if self.prize_base_info:
            self.prize_base_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.display_info is not None:
            result['display_info'] = self.display_info.to_map()
        if self.price_strategy is not None:
            result['price_strategy'] = self.price_strategy.to_map()
        if self.prize_base_info is not None:
            result['prize_base_info'] = self.prize_base_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('display_info') is not None:
            temp_model = DisplayInfo()
            self.display_info = temp_model.from_map(m['display_info'])
        if m.get('price_strategy') is not None:
            temp_model = PriceStrategy()
            self.price_strategy = temp_model.from_map(m['price_strategy'])
        if m.get('prize_base_info') is not None:
            temp_model = PrizeBaseInfo()
            self.prize_base_info = temp_model.from_map(m['prize_base_info'])
        return self


class NewCarInfo(TeaModel):
    def __init__(
        self,
        car_series: str = None,
        finaical_plan: str = None,
        car_series_id: str = None,
        submit_id: str = None,
        purcharse_time: str = None,
        user_info: CarUserInfo = None,
        match_source: str = None,
        qc_car_series_id: str = None,
    ):
        # 车系
        self.car_series = car_series
        # 金融方案
        self.finaical_plan = finaical_plan
        # 车系id
        self.car_series_id = car_series_id
        # 请求提交唯一id
        self.submit_id = submit_id
        # 预计购买时间
        self.purcharse_time = purcharse_time
        # 用户信息
        self.user_info = user_info
        # 懂车帝或者汽车之家
        self.match_source = match_source
        # 汽车之家车型id
        self.qc_car_series_id = qc_car_series_id

    def validate(self):
        self.validate_required(self.car_series, 'car_series')
        self.validate_required(self.user_info, 'user_info')
        if self.user_info:
            self.user_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.car_series is not None:
            result['car_series'] = self.car_series
        if self.finaical_plan is not None:
            result['finaical_plan'] = self.finaical_plan
        if self.car_series_id is not None:
            result['car_series_id'] = self.car_series_id
        if self.submit_id is not None:
            result['submit_id'] = self.submit_id
        if self.purcharse_time is not None:
            result['purcharse_time'] = self.purcharse_time
        if self.user_info is not None:
            result['user_info'] = self.user_info.to_map()
        if self.match_source is not None:
            result['match_source'] = self.match_source
        if self.qc_car_series_id is not None:
            result['qc_car_series_id'] = self.qc_car_series_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('car_series') is not None:
            self.car_series = m.get('car_series')
        if m.get('finaical_plan') is not None:
            self.finaical_plan = m.get('finaical_plan')
        if m.get('car_series_id') is not None:
            self.car_series_id = m.get('car_series_id')
        if m.get('submit_id') is not None:
            self.submit_id = m.get('submit_id')
        if m.get('purcharse_time') is not None:
            self.purcharse_time = m.get('purcharse_time')
        if m.get('user_info') is not None:
            temp_model = CarUserInfo()
            self.user_info = temp_model.from_map(m['user_info'])
        if m.get('match_source') is not None:
            self.match_source = m.get('match_source')
        if m.get('qc_car_series_id') is not None:
            self.qc_car_series_id = m.get('qc_car_series_id')
        return self


class ALiYunContractProjects(TeaModel):
    def __init__(
        self,
        pagination: ALiYunPagination = None,
        contract_projects: List[ALiYunContractProject] = None,
    ):
        # pagination
        self.pagination = pagination
        # contract_projects
        self.contract_projects = contract_projects

    def validate(self):
        if self.pagination:
            self.pagination.validate()
        if self.contract_projects:
            for k in self.contract_projects:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.pagination is not None:
            result['pagination'] = self.pagination.to_map()
        result['contract_projects'] = []
        if self.contract_projects is not None:
            for k in self.contract_projects:
                result['contract_projects'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pagination') is not None:
            temp_model = ALiYunPagination()
            self.pagination = temp_model.from_map(m['pagination'])
        self.contract_projects = []
        if m.get('contract_projects') is not None:
            for k in m.get('contract_projects'):
                temp_model = ALiYunContractProject()
                self.contract_projects.append(temp_model.from_map(k))
        return self


class ALiYunChainResouceType(TeaModel):
    def __init__(
        self,
        type_id: int = None,
        cpu: int = None,
        memory: int = None,
        disk: int = None,
    ):
        # type_id
        self.type_id = type_id
        # cpu
        self.cpu = cpu
        # memory
        self.memory = memory
        # disk
        self.disk = disk

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type_id is not None:
            result['type_id'] = self.type_id
        if self.cpu is not None:
            result['cpu'] = self.cpu
        if self.memory is not None:
            result['memory'] = self.memory
        if self.disk is not None:
            result['disk'] = self.disk
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type_id') is not None:
            self.type_id = m.get('type_id')
        if m.get('cpu') is not None:
            self.cpu = m.get('cpu')
        if m.get('memory') is not None:
            self.memory = m.get('memory')
        if m.get('disk') is not None:
            self.disk = m.get('disk')
        return self


class DepositMetaDataItem(TeaModel):
    def __init__(
        self,
        desc: str = None,
        key: str = None,
        type: int = None,
        value: str = None,
    ):
        # 结构化存证时该item的描述
        self.desc = desc
        # 结构化存证该数据字段的唯一索引
        self.key = key
        # 结构化存证时该item的类型
        # 0 text
        # 1 encrypt text
        # 2 txHash
        # 3 image url
        # 4 vedio url
        # 5 map url
        self.type = type
        # 结构化数据存证时，该item的值
        self.value = value

    def validate(self):
        self.validate_required(self.desc, 'desc')
        self.validate_required(self.key, 'key')
        self.validate_required(self.type, 'type')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.desc is not None:
            result['desc'] = self.desc
        if self.key is not None:
            result['key'] = self.key
        if self.type is not None:
            result['type'] = self.type
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class ALiYunLatestTransaction(TeaModel):
    def __init__(
        self,
        hash: str = None,
        transaction_v10type: str = None,
        trans_type_v6: str = None,
        from_: str = None,
        to: str = None,
        create_time: int = None,
    ):
        # hash
        self.hash = hash
        # transaction_v10_type
        self.transaction_v10type = transaction_v10type
        # trans_type_v6
        self.trans_type_v6 = trans_type_v6
        # from
        self.from_ = from_
        # to
        self.to = to
        # create_time
        self.create_time = create_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.hash is not None:
            result['hash'] = self.hash
        if self.transaction_v10type is not None:
            result['transaction_v10_type'] = self.transaction_v10type
        if self.trans_type_v6 is not None:
            result['trans_type_v6'] = self.trans_type_v6
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        if self.create_time is not None:
            result['create_time'] = self.create_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('transaction_v10_type') is not None:
            self.transaction_v10type = m.get('transaction_v10_type')
        if m.get('trans_type_v6') is not None:
            self.trans_type_v6 = m.get('trans_type_v6')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        return self


class PageReq(TeaModel):
    def __init__(
        self,
        num: int = None,
        size: int = None,
    ):
        # 页码
        self.num = num
        # 页大小
        self.size = size

    def validate(self):
        self.validate_required(self.num, 'num')
        self.validate_required(self.size, 'size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.num is not None:
            result['num'] = self.num
        if self.size is not None:
            result['size'] = self.size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('num') is not None:
            self.num = m.get('num')
        if m.get('size') is not None:
            self.size = m.get('size')
        return self


class UserBizKeyInfo(TeaModel):
    def __init__(
        self,
        granted_user: List[str] = None,
        key_name: str = None,
    ):
        # 拥有该密钥的用户列表
        self.granted_user = granted_user
        # 密钥名称
        self.key_name = key_name

    def validate(self):
        self.validate_required(self.granted_user, 'granted_user')
        self.validate_required(self.key_name, 'key_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.granted_user is not None:
            result['granted_user'] = self.granted_user
        if self.key_name is not None:
            result['key_name'] = self.key_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('granted_user') is not None:
            self.granted_user = m.get('granted_user')
        if m.get('key_name') is not None:
            self.key_name = m.get('key_name')
        return self


class BareClaim(TeaModel):
    def __init__(
        self,
        claim: str = None,
        type: str = None,
    ):
        # 下面的内容由调用者自己定义，建议只存放必要的声明信息，不要放置敏感数据
        self.claim = claim
        # 证书类型
        self.type = type

    def validate(self):
        self.validate_required(self.claim, 'claim')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.claim is not None:
            result['claim'] = self.claim
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('claim') is not None:
            self.claim = m.get('claim')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class ContractIdeConfigResult(TeaModel):
    def __init__(
        self,
        contract_ide_config_list: List[ContractIdeConfig] = None,
    ):
        # 合约链的配置信息，可包含多个合约链的配置
        self.contract_ide_config_list = contract_ide_config_list

    def validate(self):
        self.validate_required(self.contract_ide_config_list, 'contract_ide_config_list')
        if self.contract_ide_config_list:
            for k in self.contract_ide_config_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['contract_ide_config_list'] = []
        if self.contract_ide_config_list is not None:
            for k in self.contract_ide_config_list:
                result['contract_ide_config_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.contract_ide_config_list = []
        if m.get('contract_ide_config_list') is not None:
            for k in m.get('contract_ide_config_list'):
                temp_model = ContractIdeConfig()
                self.contract_ide_config_list.append(temp_model.from_map(k))
        return self


class ContractBindListResp(TeaModel):
    def __init__(
        self,
        list: List[ContractBindResp] = None,
    ):
        # 合约关联列表
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = ContractBindResp()
                self.list.append(temp_model.from_map(k))
        return self


class ContractDetailResp(TeaModel):
    def __init__(
        self,
        service_id: str = None,
        name: str = None,
        creator: str = None,
        create_time: int = None,
        ordering_products: str = None,
        chan_id: str = None,
        contract_status: str = None,
        status: str = None,
        progress_info_list: List[InstanceProgressInfo] = None,
        record_info_list: List[InstanceRecordInfo] = None,
    ):
        # 合约服务ID
        self.service_id = service_id
        # 合约服务名称
        self.name = name
        # 创建人
        self.creator = creator
        # 创建时间
        self.create_time = create_time
        # 订购产品
        self.ordering_products = ordering_products
        # 关联区块链id
        self.chan_id = chan_id
        # 合约状态
        self.contract_status = contract_status
        # 合约部署进度当前状态
        self.status = status
        # 合约部署进度
        self.progress_info_list = progress_info_list
        # 实例最近调用记录(暂缓，先不做)
        self.record_info_list = record_info_list

    def validate(self):
        if self.progress_info_list:
            for k in self.progress_info_list:
                if k:
                    k.validate()
        if self.record_info_list:
            for k in self.record_info_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.name is not None:
            result['name'] = self.name
        if self.creator is not None:
            result['creator'] = self.creator
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.ordering_products is not None:
            result['ordering_products'] = self.ordering_products
        if self.chan_id is not None:
            result['chan_id'] = self.chan_id
        if self.contract_status is not None:
            result['contract_status'] = self.contract_status
        if self.status is not None:
            result['status'] = self.status
        result['progress_info_list'] = []
        if self.progress_info_list is not None:
            for k in self.progress_info_list:
                result['progress_info_list'].append(k.to_map() if k else None)
        result['record_info_list'] = []
        if self.record_info_list is not None:
            for k in self.record_info_list:
                result['record_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('creator') is not None:
            self.creator = m.get('creator')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('ordering_products') is not None:
            self.ordering_products = m.get('ordering_products')
        if m.get('chan_id') is not None:
            self.chan_id = m.get('chan_id')
        if m.get('contract_status') is not None:
            self.contract_status = m.get('contract_status')
        if m.get('status') is not None:
            self.status = m.get('status')
        self.progress_info_list = []
        if m.get('progress_info_list') is not None:
            for k in m.get('progress_info_list'):
                temp_model = InstanceProgressInfo()
                self.progress_info_list.append(temp_model.from_map(k))
        self.record_info_list = []
        if m.get('record_info_list') is not None:
            for k in m.get('record_info_list'):
                temp_model = InstanceRecordInfo()
                self.record_info_list.append(temp_model.from_map(k))
        return self


class DefaultSettleRule(TeaModel):
    def __init__(
        self,
        default_settle_type: str = None,
        default_settle_target: str = None,
    ):
        # 默认结算类型，结算到银行卡: bankCard，结算到支付宝账号: alipayAccount
        self.default_settle_type = default_settle_type
        # 默认结算目标	bankCard 时填银行卡号，alipayAccount 时填支付宝登录号
        self.default_settle_target = default_settle_target

    def validate(self):
        self.validate_required(self.default_settle_type, 'default_settle_type')
        self.validate_required(self.default_settle_target, 'default_settle_target')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.default_settle_type is not None:
            result['default_settle_type'] = self.default_settle_type
        if self.default_settle_target is not None:
            result['default_settle_target'] = self.default_settle_target
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('default_settle_type') is not None:
            self.default_settle_type = m.get('default_settle_type')
        if m.get('default_settle_target') is not None:
            self.default_settle_target = m.get('default_settle_target')
        return self


class ManagedMQDTOStructBody(TeaModel):
    def __init__(
        self,
        id: str = None,
        instance: str = None,
        topic: str = None,
        type: str = None,
    ):
        # id
        self.id = id
        # 实例
        self.instance = instance
        # 主题
        self.topic = topic
        # 类型
        self.type = type

    def validate(self):
        self.validate_required(self.id, 'id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.instance is not None:
            result['instance'] = self.instance
        if self.topic is not None:
            result['topic'] = self.topic
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('instance') is not None:
            self.instance = m.get('instance')
        if m.get('topic') is not None:
            self.topic = m.get('topic')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class CertIssueProgressDTO(TeaModel):
    def __init__(
        self,
        biz_id: str = None,
        vc_id: str = None,
        status: int = None,
        error_message: str = None,
        titles: List[str] = None,
        progress_percent: int = None,
        total_num: str = None,
        cur_task_type: str = None,
        start_time_millis: int = None,
        end_time_millis: int = None,
        error_details: List[TemplateInstanceErrorDetailDTO] = None,
    ):
        # 证书实例id
        self.biz_id = biz_id
        # 存证ID，如果颁发失败，此值为null
        self.vc_id = vc_id
        # 因校验异常停止任务（不会继续校验文件内容和颁发证书） -3
        # 因校验内容不正确停止颁发任务(会校验完所有的行但不执行颁发) -2
        # 已手动取消（可重试状态下手动取消任务，取消状态下可以启动新的颁发任务） -1
        # 可重试 0
        # 执行中（初始状态） 1
        # 已成功完成 2
        self.status = status
        # is_error=true时的错误描述
        self.error_message = error_message
        # 证书的字段标题列表
        self.titles = titles
        # 颁发进度百分比
        self.progress_percent = progress_percent
        # 当前批次数据总行数（不含标题）
        self.total_num = total_num
        # 颁发证书当前执行的阶段，VERIFY：校验文件中，ISSUE：颁发中
        self.cur_task_type = cur_task_type
        # 颁发开始的时间戳
        self.start_time_millis = start_time_millis
        # 颁发结束的时间戳
        self.end_time_millis = end_time_millis
        # 校验错误描述列表
        self.error_details = error_details

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.vc_id, 'vc_id')
        self.validate_required(self.status, 'status')
        self.validate_required(self.error_message, 'error_message')
        self.validate_required(self.titles, 'titles')
        self.validate_required(self.progress_percent, 'progress_percent')
        self.validate_required(self.total_num, 'total_num')
        self.validate_required(self.cur_task_type, 'cur_task_type')
        self.validate_required(self.start_time_millis, 'start_time_millis')
        self.validate_required(self.end_time_millis, 'end_time_millis')
        self.validate_required(self.error_details, 'error_details')
        if self.error_details:
            for k in self.error_details:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        if self.status is not None:
            result['status'] = self.status
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.titles is not None:
            result['titles'] = self.titles
        if self.progress_percent is not None:
            result['progress_percent'] = self.progress_percent
        if self.total_num is not None:
            result['total_num'] = self.total_num
        if self.cur_task_type is not None:
            result['cur_task_type'] = self.cur_task_type
        if self.start_time_millis is not None:
            result['start_time_millis'] = self.start_time_millis
        if self.end_time_millis is not None:
            result['end_time_millis'] = self.end_time_millis
        result['error_details'] = []
        if self.error_details is not None:
            for k in self.error_details:
                result['error_details'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('titles') is not None:
            self.titles = m.get('titles')
        if m.get('progress_percent') is not None:
            self.progress_percent = m.get('progress_percent')
        if m.get('total_num') is not None:
            self.total_num = m.get('total_num')
        if m.get('cur_task_type') is not None:
            self.cur_task_type = m.get('cur_task_type')
        if m.get('start_time_millis') is not None:
            self.start_time_millis = m.get('start_time_millis')
        if m.get('end_time_millis') is not None:
            self.end_time_millis = m.get('end_time_millis')
        self.error_details = []
        if m.get('error_details') is not None:
            for k in m.get('error_details'):
                temp_model = TemplateInstanceErrorDetailDTO()
                self.error_details.append(temp_model.from_map(k))
        return self


class RefundGoodsDetail(TeaModel):
    def __init__(
        self,
        goods_id: str = None,
        refund_amount: str = None,
    ):
        # 商品编号
        self.goods_id = goods_id
        # 该商品的退款总金额
        self.refund_amount = refund_amount

    def validate(self):
        self.validate_required(self.goods_id, 'goods_id')
        self.validate_required(self.refund_amount, 'refund_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.goods_id is not None:
            result['goods_id'] = self.goods_id
        if self.refund_amount is not None:
            result['refund_amount'] = self.refund_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('goods_id') is not None:
            self.goods_id = m.get('goods_id')
        if m.get('refund_amount') is not None:
            self.refund_amount = m.get('refund_amount')
        return self


class NotaryTransaction(TeaModel):
    def __init__(
        self,
        content: str = None,
        transaction_hash: str = None,
        type: str = None,
    ):
        # 如果存证类型为text, 则为存证内容
        # 如果存证类型为file,则为存证文件临时下载地址
        self.content = content
        # 链上存证哈希
        self.transaction_hash = transaction_hash
        # 存证类型
        self.type = type

    def validate(self):
        self.validate_required(self.content, 'content')
        self.validate_required(self.transaction_hash, 'transaction_hash')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.content is not None:
            result['content'] = self.content
        if self.transaction_hash is not None:
            result['transaction_hash'] = self.transaction_hash
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('transaction_hash') is not None:
            self.transaction_hash = m.get('transaction_hash')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class BlockchainBrowserLatestTransaction(TeaModel):
    def __init__(
        self,
        create_time: int = None,
        from_: str = None,
        to: str = None,
        hash: str = None,
        transaction_type: str = None,
    ):
        # create_time
        self.create_time = create_time
        # from
        self.from_ = from_
        # to
        self.to = to
        # hash
        self.hash = hash
        # transactionV10Type
        self.transaction_type = transaction_type

    def validate(self):
        self.validate_required(self.create_time, 'create_time')
        self.validate_required(self.from_, 'from_')
        self.validate_required(self.to, 'to')
        self.validate_required(self.hash, 'hash')
        self.validate_required(self.transaction_type, 'transaction_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        if self.hash is not None:
            result['hash'] = self.hash
        if self.transaction_type is not None:
            result['transaction_type'] = self.transaction_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('transaction_type') is not None:
            self.transaction_type = m.get('transaction_type')
        return self


class EPIssueHisInfo(TeaModel):
    def __init__(
        self,
        issue_date: int = None,
        offline_issue_amount: int = None,
        online_issue_amount: int = None,
        self_issue_amount: int = None,
    ):
        # 版通发行日期时间戳
        self.issue_date = issue_date
        # 版通线下发行量
        self.offline_issue_amount = offline_issue_amount
        # 版通线上发行量
        self.online_issue_amount = online_issue_amount
        # 版通自持发行量
        self.self_issue_amount = self_issue_amount

    def validate(self):
        self.validate_required(self.issue_date, 'issue_date')
        self.validate_required(self.offline_issue_amount, 'offline_issue_amount')
        self.validate_required(self.online_issue_amount, 'online_issue_amount')
        self.validate_required(self.self_issue_amount, 'self_issue_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.issue_date is not None:
            result['issue_date'] = self.issue_date
        if self.offline_issue_amount is not None:
            result['offline_issue_amount'] = self.offline_issue_amount
        if self.online_issue_amount is not None:
            result['online_issue_amount'] = self.online_issue_amount
        if self.self_issue_amount is not None:
            result['self_issue_amount'] = self.self_issue_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('issue_date') is not None:
            self.issue_date = m.get('issue_date')
        if m.get('offline_issue_amount') is not None:
            self.offline_issue_amount = m.get('offline_issue_amount')
        if m.get('online_issue_amount') is not None:
            self.online_issue_amount = m.get('online_issue_amount')
        if m.get('self_issue_amount') is not None:
            self.self_issue_amount = m.get('self_issue_amount')
        return self


class ListDataEntityResult(TeaModel):
    def __init__(
        self,
        data_model: DataModel = None,
        data_entity: DataEntity = None,
    ):
        # 数据模型信息
        self.data_model = data_model
        # 数据资产信息
        self.data_entity = data_entity

    def validate(self):
        self.validate_required(self.data_model, 'data_model')
        if self.data_model:
            self.data_model.validate()
        self.validate_required(self.data_entity, 'data_entity')
        if self.data_entity:
            self.data_entity.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.data_model is not None:
            result['data_model'] = self.data_model.to_map()
        if self.data_entity is not None:
            result['data_entity'] = self.data_entity.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('data_model') is not None:
            temp_model = DataModel()
            self.data_model = temp_model.from_map(m['data_model'])
        if m.get('data_entity') is not None:
            temp_model = DataEntity()
            self.data_entity = temp_model.from_map(m['data_entity'])
        return self


class ContractCreateReq(TeaModel):
    def __init__(
        self,
        chain_id: str = None,
        template_id: str = None,
        name: str = None,
    ):
        # 链ID
        self.chain_id = chain_id
        # 合约模板标识
        self.template_id = template_id
        # 合约名称
        self.name = name

    def validate(self):
        self.validate_required(self.chain_id, 'chain_id')
        self.validate_required(self.template_id, 'template_id')
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.chain_id is not None:
            result['chain_id'] = self.chain_id
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('chain_id') is not None:
            self.chain_id = m.get('chain_id')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class IdentityParam(TeaModel):
    def __init__(
        self,
        agent: str = None,
        agent_id: str = None,
        cert_name: str = None,
        cert_no: str = None,
        cert_type: str = None,
        legal_person: str = None,
        legal_person_id: str = None,
        mobile_no: str = None,
        properties: str = None,
        user_type: str = None,
    ):
        # 经办人姓名
        self.agent = agent
        # 经办人身份证号
        self.agent_id = agent_id
        # 用户的姓名
        self.cert_name = cert_name
        # 用户的身份证号
        self.cert_no = cert_no
        # 用户证件类型，目前只支持IDENTITY_CARD
        self.cert_type = cert_type
        # 法人姓名，企业认证必选
        self.legal_person = legal_person
        # 法人身份证，企业认证必选
        self.legal_person_id = legal_person_id
        # 手机号码
        self.mobile_no = mobile_no
        # 扩展属性字段
        self.properties = properties
        # 用户类型，默认为PERSON
        self.user_type = user_type

    def validate(self):
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_type, 'cert_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.agent is not None:
            result['agent'] = self.agent
        if self.agent_id is not None:
            result['agent_id'] = self.agent_id
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.legal_person is not None:
            result['legal_person'] = self.legal_person
        if self.legal_person_id is not None:
            result['legal_person_id'] = self.legal_person_id
        if self.mobile_no is not None:
            result['mobile_no'] = self.mobile_no
        if self.properties is not None:
            result['properties'] = self.properties
        if self.user_type is not None:
            result['user_type'] = self.user_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('agent') is not None:
            self.agent = m.get('agent')
        if m.get('agent_id') is not None:
            self.agent_id = m.get('agent_id')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('legal_person') is not None:
            self.legal_person = m.get('legal_person')
        if m.get('legal_person_id') is not None:
            self.legal_person_id = m.get('legal_person_id')
        if m.get('mobile_no') is not None:
            self.mobile_no = m.get('mobile_no')
        if m.get('properties') is not None:
            self.properties = m.get('properties')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        return self


class ALiYunChainInfo(TeaModel):
    def __init__(
        self,
        abnormal_nodes: int = None,
        ant_chain_id: str = None,
        block_height: int = None,
        create_time: int = None,
        is_role: bool = None,
        node_number: int = None,
        normal: bool = None,
        transaction_sum: int = None,
        version: str = None,
        node_infos: List[ALiYunChainNodeInfo] = None,
    ):
        # abnormal_nodes
        self.abnormal_nodes = abnormal_nodes
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # block_height
        self.block_height = block_height
        # create_time
        self.create_time = create_time
        # is_role
        self.is_role = is_role
        # node_number
        self.node_number = node_number
        # normal
        self.normal = normal
        # transaction_sum
        self.transaction_sum = transaction_sum
        # Version
        self.version = version
        # node_infos
        self.node_infos = node_infos

    def validate(self):
        if self.node_infos:
            for k in self.node_infos:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.abnormal_nodes is not None:
            result['abnormal_nodes'] = self.abnormal_nodes
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.block_height is not None:
            result['block_height'] = self.block_height
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.is_role is not None:
            result['is_role'] = self.is_role
        if self.node_number is not None:
            result['node_number'] = self.node_number
        if self.normal is not None:
            result['normal'] = self.normal
        if self.transaction_sum is not None:
            result['transaction_sum'] = self.transaction_sum
        if self.version is not None:
            result['version'] = self.version
        result['node_infos'] = []
        if self.node_infos is not None:
            for k in self.node_infos:
                result['node_infos'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('abnormal_nodes') is not None:
            self.abnormal_nodes = m.get('abnormal_nodes')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('is_role') is not None:
            self.is_role = m.get('is_role')
        if m.get('node_number') is not None:
            self.node_number = m.get('node_number')
        if m.get('normal') is not None:
            self.normal = m.get('normal')
        if m.get('transaction_sum') is not None:
            self.transaction_sum = m.get('transaction_sum')
        if m.get('version') is not None:
            self.version = m.get('version')
        self.node_infos = []
        if m.get('node_infos') is not None:
            for k in m.get('node_infos'):
                temp_model = ALiYunChainNodeInfo()
                self.node_infos.append(temp_model.from_map(k))
        return self


class DidAddDoc(TeaModel):
    def __init__(
        self,
        doc: str = None,
    ):
        # did doc content
        self.doc = doc

    def validate(self):
        self.validate_required(self.doc, 'doc')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.doc is not None:
            result['doc'] = self.doc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('doc') is not None:
            self.doc = m.get('doc')
        return self


class TemplateInfoDTO(TeaModel):
    def __init__(
        self,
        id: int = None,
        category: str = None,
        claim_template: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
    ):
        # 主键
        self.id = id
        # 模板类别：马拉松类、滑雪类
        self.category = category
        # 模板内容， json格式文本
        self.claim_template = claim_template
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.category, 'category')
        self.validate_required(self.claim_template, 'claim_template')
        self.validate_required(self.gmt_create, 'gmt_create')
        self.validate_required(self.gmt_modified, 'gmt_modified')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.category is not None:
            result['category'] = self.category
        if self.claim_template is not None:
            result['claim_template'] = self.claim_template
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('category') is not None:
            self.category = m.get('category')
        if m.get('claim_template') is not None:
            self.claim_template = m.get('claim_template')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        return self


class OrderList(TeaModel):
    def __init__(
        self,
        activity_id: str = None,
        id: str = None,
        biz_id: str = None,
        prize_id: str = None,
    ):
        # 活动ID
        self.activity_id = activity_id
        # 记录ID
        self.id = id
        # 业务ID
        self.biz_id = biz_id
        # 奖品id
        self.prize_id = prize_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.activity_id is not None:
            result['activity_id'] = self.activity_id
        if self.id is not None:
            result['id'] = self.id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.prize_id is not None:
            result['prize_id'] = self.prize_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('activity_id') is not None:
            self.activity_id = m.get('activity_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('prize_id') is not None:
            self.prize_id = m.get('prize_id')
        return self


class QueryBaasPromotionActivityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        activity_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 活动ID，由运营线下通知分配
        self.activity_id = activity_id

    def validate(self):
        self.validate_required(self.activity_id, 'activity_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.activity_id is not None:
            result['activity_id'] = self.activity_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('activity_id') is not None:
            self.activity_id = m.get('activity_id')
        return self


class QueryBaasPromotionActivityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        activity_base_info: ActivityBaseInfo = None,
        prize_list: PrizeList = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 活动基本信息
        self.activity_base_info = activity_base_info
        # 关联奖品列表
        self.prize_list = prize_list

    def validate(self):
        if self.activity_base_info:
            self.activity_base_info.validate()
        if self.prize_list:
            self.prize_list.validate()

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
        if self.activity_base_info is not None:
            result['activity_base_info'] = self.activity_base_info.to_map()
        if self.prize_list is not None:
            result['prize_list'] = self.prize_list.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('activity_base_info') is not None:
            temp_model = ActivityBaseInfo()
            self.activity_base_info = temp_model.from_map(m['activity_base_info'])
        if m.get('prize_list') is not None:
            temp_model = PrizeList()
            self.prize_list = temp_model.from_map(m['prize_list'])
        return self


class ExecBaasPromotionCouponRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        open_id: str = None,
        app_id: str = None,
        activity_id: str = None,
        prize_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务ID
        self.biz_id = biz_id
        # openId
        self.open_id = open_id
        # appId
        self.app_id = app_id
        # 活动ID，由运营线下通知分配
        self.activity_id = activity_id
        # 奖品ID，需要指定奖品抽奖时传入
        self.prize_id = prize_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.open_id, 'open_id')
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.activity_id, 'activity_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.open_id is not None:
            result['open_id'] = self.open_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.activity_id is not None:
            result['activity_id'] = self.activity_id
        if self.prize_id is not None:
            result['prize_id'] = self.prize_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('open_id') is not None:
            self.open_id = m.get('open_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('activity_id') is not None:
            self.activity_id = m.get('activity_id')
        if m.get('prize_id') is not None:
            self.prize_id = m.get('prize_id')
        return self


class ExecBaasPromotionCouponResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        activity_id: str = None,
        activity_name: str = None,
        activity_status: str = None,
        sub_code: str = None,
        sub_message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 活动ID
        self.activity_id = activity_id
        # 活动名称
        self.activity_name = activity_name
        # 活动状态
        self.activity_status = activity_status
        # 子错误码
        self.sub_code = sub_code
        # 子错误描述
        self.sub_message = sub_message

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
        if self.activity_id is not None:
            result['activity_id'] = self.activity_id
        if self.activity_name is not None:
            result['activity_name'] = self.activity_name
        if self.activity_status is not None:
            result['activity_status'] = self.activity_status
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_message is not None:
            result['sub_message'] = self.sub_message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('activity_id') is not None:
            self.activity_id = m.get('activity_id')
        if m.get('activity_name') is not None:
            self.activity_name = m.get('activity_name')
        if m.get('activity_status') is not None:
            self.activity_status = m.get('activity_status')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_message') is not None:
            self.sub_message = m.get('sub_message')
        return self


class QueryBaasPromotionCouponRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        open_id: str = None,
        app_id: str = None,
        activity_id: str = None,
        start_date: str = None,
        end_date: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # openId
        self.open_id = open_id
        # appId
        self.app_id = app_id
        # 活动ID
        self.activity_id = activity_id
        # 开始日期
        self.start_date = start_date
        # 结束日期
        self.end_date = end_date
        # 页码，默认 1，最小值 1
        self.page_num = page_num
        # 每页数量，默认 20，范围 1~100
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.activity_id, 'activity_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.open_id is not None:
            result['open_id'] = self.open_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.activity_id is not None:
            result['activity_id'] = self.activity_id
        if self.start_date is not None:
            result['start_date'] = self.start_date
        if self.end_date is not None:
            result['end_date'] = self.end_date
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
        if m.get('open_id') is not None:
            self.open_id = m.get('open_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('activity_id') is not None:
            self.activity_id = m.get('activity_id')
        if m.get('start_date') is not None:
            self.start_date = m.get('start_date')
        if m.get('end_date') is not None:
            self.end_date = m.get('end_date')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryBaasPromotionCouponResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_count: int = None,
        page_num: int = None,
        page_size: int = None,
        list: List[List] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 记录总数
        self.total_count = total_count
        # 当前页码
        self.page_num = page_num
        # 每页数量
        self.page_size = page_size
        # 发券记录列表
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
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
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
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
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = List()
                self.list.append(temp_model.from_map(k))
        return self


class QueryPromotionActivityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        activity_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 活动ID，由运营线下通知分配
        self.activity_id = activity_id

    def validate(self):
        self.validate_required(self.activity_id, 'activity_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.activity_id is not None:
            result['activity_id'] = self.activity_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('activity_id') is not None:
            self.activity_id = m.get('activity_id')
        return self


class QueryPromotionActivityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        activity_base_info: ActivityBaseInfo = None,
        prize_list: PrizeList = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 活动基本信息
        self.activity_base_info = activity_base_info
        # 关联奖品列表
        self.prize_list = prize_list

    def validate(self):
        if self.activity_base_info:
            self.activity_base_info.validate()
        if self.prize_list:
            self.prize_list.validate()

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
        if self.activity_base_info is not None:
            result['activity_base_info'] = self.activity_base_info.to_map()
        if self.prize_list is not None:
            result['prize_list'] = self.prize_list.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('activity_base_info') is not None:
            temp_model = ActivityBaseInfo()
            self.activity_base_info = temp_model.from_map(m['activity_base_info'])
        if m.get('prize_list') is not None:
            temp_model = PrizeList()
            self.prize_list = temp_model.from_map(m['prize_list'])
        return self


class ExecPromotionCouponRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        open_id: str = None,
        app_id: str = None,
        activity_id: str = None,
        prize_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务ID
        self.biz_id = biz_id
        # open_id
        self.open_id = open_id
        # appId
        self.app_id = app_id
        # 活动ID
        self.activity_id = activity_id
        # 奖品ID，需要指定奖品抽奖时传入
        self.prize_id = prize_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.open_id, 'open_id')
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.activity_id, 'activity_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.open_id is not None:
            result['open_id'] = self.open_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.activity_id is not None:
            result['activity_id'] = self.activity_id
        if self.prize_id is not None:
            result['prize_id'] = self.prize_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('open_id') is not None:
            self.open_id = m.get('open_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('activity_id') is not None:
            self.activity_id = m.get('activity_id')
        if m.get('prize_id') is not None:
            self.prize_id = m.get('prize_id')
        return self


class ExecPromotionCouponResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        activity_id: str = None,
        activity_name: str = None,
        activity_status: str = None,
        sub_code: str = None,
        sub_message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 活动ID
        self.activity_id = activity_id
        # 活动名称
        self.activity_name = activity_name
        # 活动状态
        self.activity_status = activity_status
        # 子错误码
        self.sub_code = sub_code
        # 子错误描述
        self.sub_message = sub_message

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
        if self.activity_id is not None:
            result['activity_id'] = self.activity_id
        if self.activity_name is not None:
            result['activity_name'] = self.activity_name
        if self.activity_status is not None:
            result['activity_status'] = self.activity_status
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_message is not None:
            result['sub_message'] = self.sub_message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('activity_id') is not None:
            self.activity_id = m.get('activity_id')
        if m.get('activity_name') is not None:
            self.activity_name = m.get('activity_name')
        if m.get('activity_status') is not None:
            self.activity_status = m.get('activity_status')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_message') is not None:
            self.sub_message = m.get('sub_message')
        return self


class QueryPromotionCouponRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        activity_id: str = None,
        open_id: str = None,
        app_id: str = None,
        start_date: str = None,
        end_date: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 活动ID
        self.activity_id = activity_id
        # openId
        self.open_id = open_id
        # appId
        self.app_id = app_id
        # 开始日期
        self.start_date = start_date
        # 结束日期
        self.end_date = end_date
        # 页码，默认 1，最小值 1
        self.page_num = page_num
        # 每页数量，默认 20，范围 1~100
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.activity_id, 'activity_id')
        self.validate_required(self.open_id, 'open_id')
        self.validate_required(self.app_id, 'app_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.activity_id is not None:
            result['activity_id'] = self.activity_id
        if self.open_id is not None:
            result['open_id'] = self.open_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.start_date is not None:
            result['start_date'] = self.start_date
        if self.end_date is not None:
            result['end_date'] = self.end_date
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
        if m.get('activity_id') is not None:
            self.activity_id = m.get('activity_id')
        if m.get('open_id') is not None:
            self.open_id = m.get('open_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('start_date') is not None:
            self.start_date = m.get('start_date')
        if m.get('end_date') is not None:
            self.end_date = m.get('end_date')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryPromotionCouponResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_count: int = None,
        page_num: int = None,
        page_size: int = None,
        order_list: List[OrderList] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 记录总数
        self.total_count = total_count
        # 当前页码
        self.page_num = page_num
        # 每页数量
        self.page_size = page_size
        # 发券记录列表
        self.order_list = order_list

    def validate(self):
        if self.order_list:
            for k in self.order_list:
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
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
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
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.order_list = []
        if m.get('order_list') is not None:
            for k in m.get('order_list'):
                temp_model = OrderList()
                self.order_list.append(temp_model.from_map(k))
        return self


