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


class DeviceInfoNoGroup(TeaModel):
    def __init__(
        self,
        aliyun_model_id: str = None,
        device_meta: str = None,
        device_owner_id: str = None,
        device_setup_info: str = None,
        device_type: str = None,
        device_user_id_list: List[str] = None,
        device_virtual_id: str = None,
        smart_version: str = None,
        status: str = None,
        stock_position_id_list: List[str] = None,
        stock_position_name_list: List[str] = None,
        things_did: str = None,
        things_name: str = None,
        video_url: str = None,
        warehouse_id: str = None,
        warehouse_name: str = None,
    ):
        # 物模型Id
        self.aliyun_model_id = aliyun_model_id
        # 三元组
        self.device_meta = device_meta
        # 设备拥有者Id
        self.device_owner_id = device_owner_id
        # 设备安装信息
        self.device_setup_info = device_setup_info
        # 设备类型【ALIDEV：阿里云设备，CHAINMACDEV：链机设备，M2MDEV：M2M设备，OTHERDEV：其他设备】
        # 
        self.device_type = device_type
        # 设备使用者Id
        self.device_user_id_list = device_user_id_list
        # 设备虚拟id
        self.device_virtual_id = device_virtual_id
        # 智能版本
        self.smart_version = smart_version
        # 设备状态 【READY：未启用，STARTED：已启用，LOADING：信息待完善，DELETED：已注销， ALL：全部】
        self.status = status
        # 库位Id
        self.stock_position_id_list = stock_position_id_list
        # 库位名称
        self.stock_position_name_list = stock_position_name_list
        # 设备id
        self.things_did = things_did
        # 设备名称
        self.things_name = things_name
        # 视频流地址
        self.video_url = video_url
        # 仓库Id
        self.warehouse_id = warehouse_id
        # 仓库名称
        self.warehouse_name = warehouse_name

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.aliyun_model_id is not None:
            result['aliyun_model_id'] = self.aliyun_model_id
        if self.device_meta is not None:
            result['device_meta'] = self.device_meta
        if self.device_owner_id is not None:
            result['device_owner_id'] = self.device_owner_id
        if self.device_setup_info is not None:
            result['device_setup_info'] = self.device_setup_info
        if self.device_type is not None:
            result['device_type'] = self.device_type
        if self.device_user_id_list is not None:
            result['device_user_id_list'] = self.device_user_id_list
        if self.device_virtual_id is not None:
            result['device_virtual_id'] = self.device_virtual_id
        if self.smart_version is not None:
            result['smart_version'] = self.smart_version
        if self.status is not None:
            result['status'] = self.status
        if self.stock_position_id_list is not None:
            result['stock_position_id_list'] = self.stock_position_id_list
        if self.stock_position_name_list is not None:
            result['stock_position_name_list'] = self.stock_position_name_list
        if self.things_did is not None:
            result['things_did'] = self.things_did
        if self.things_name is not None:
            result['things_name'] = self.things_name
        if self.video_url is not None:
            result['video_url'] = self.video_url
        if self.warehouse_id is not None:
            result['warehouse_id'] = self.warehouse_id
        if self.warehouse_name is not None:
            result['warehouse_name'] = self.warehouse_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('aliyun_model_id') is not None:
            self.aliyun_model_id = m.get('aliyun_model_id')
        if m.get('device_meta') is not None:
            self.device_meta = m.get('device_meta')
        if m.get('device_owner_id') is not None:
            self.device_owner_id = m.get('device_owner_id')
        if m.get('device_setup_info') is not None:
            self.device_setup_info = m.get('device_setup_info')
        if m.get('device_type') is not None:
            self.device_type = m.get('device_type')
        if m.get('device_user_id_list') is not None:
            self.device_user_id_list = m.get('device_user_id_list')
        if m.get('device_virtual_id') is not None:
            self.device_virtual_id = m.get('device_virtual_id')
        if m.get('smart_version') is not None:
            self.smart_version = m.get('smart_version')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('stock_position_id_list') is not None:
            self.stock_position_id_list = m.get('stock_position_id_list')
        if m.get('stock_position_name_list') is not None:
            self.stock_position_name_list = m.get('stock_position_name_list')
        if m.get('things_did') is not None:
            self.things_did = m.get('things_did')
        if m.get('things_name') is not None:
            self.things_name = m.get('things_name')
        if m.get('video_url') is not None:
            self.video_url = m.get('video_url')
        if m.get('warehouse_id') is not None:
            self.warehouse_id = m.get('warehouse_id')
        if m.get('warehouse_name') is not None:
            self.warehouse_name = m.get('warehouse_name')
        return self


class CargoTank(TeaModel):
    def __init__(
        self,
        box_no: str = None,
        lead_sealing_no: str = None,
        box_type: str = None,
        box_weight: str = None,
    ):
        # 箱号
        self.box_no = box_no
        # 铅封号
        # 
        self.lead_sealing_no = lead_sealing_no
        # 箱型
        self.box_type = box_type
        # 重量
        self.box_weight = box_weight

    def validate(self):
        self.validate_required(self.box_no, 'box_no')
        self.validate_required(self.lead_sealing_no, 'lead_sealing_no')
        self.validate_required(self.box_type, 'box_type')
        self.validate_required(self.box_weight, 'box_weight')

    def to_map(self):
        result = dict()
        if self.box_no is not None:
            result['box_no'] = self.box_no
        if self.lead_sealing_no is not None:
            result['lead_sealing_no'] = self.lead_sealing_no
        if self.box_type is not None:
            result['box_type'] = self.box_type
        if self.box_weight is not None:
            result['box_weight'] = self.box_weight
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('box_no') is not None:
            self.box_no = m.get('box_no')
        if m.get('lead_sealing_no') is not None:
            self.lead_sealing_no = m.get('lead_sealing_no')
        if m.get('box_type') is not None:
            self.box_type = m.get('box_type')
        if m.get('box_weight') is not None:
            self.box_weight = m.get('box_weight')
        return self


class FlowNode(TeaModel):
    def __init__(
        self,
        index: int = None,
        type: str = None,
        state: str = None,
        operate_time: int = None,
        comment: str = None,
    ):
        # 序号
        self.index = index
        # 操作类型【CREATE：创建入库申请，AUDIT：保管人审核，ALLOCATE：审核拒绝，STORAGE：入库，COMPLETE：完成】
        # 
        # 
        # 
        self.type = type
        # 流程节点状态【 PASS：成功，FAIL：失败，ACTIVE：激活，INACTIVE：未激活】
        self.state = state
        # 操作时间，单位：ms
        self.operate_time = operate_time
        # 备注
        self.comment = comment

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.index is not None:
            result['index'] = self.index
        if self.type is not None:
            result['type'] = self.type
        if self.state is not None:
            result['state'] = self.state
        if self.operate_time is not None:
            result['operate_time'] = self.operate_time
        if self.comment is not None:
            result['comment'] = self.comment
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('index') is not None:
            self.index = m.get('index')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('operate_time') is not None:
            self.operate_time = m.get('operate_time')
        if m.get('comment') is not None:
            self.comment = m.get('comment')
        return self


class BlockchainInfo(TeaModel):
    def __init__(
        self,
        tx_hash: str = None,
        tx_time: int = None,
    ):
        # hash值
        self.tx_hash = tx_hash
        # 时间戳
        self.tx_time = tx_time

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.tx_time is not None:
            result['tx_time'] = self.tx_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('tx_time') is not None:
            self.tx_time = m.get('tx_time')
        return self


class FlowInfo(TeaModel):
    def __init__(
        self,
        comment: str = None,
        operate_time: str = None,
        operator: str = None,
        status: str = None,
    ):
        # 备注
        self.comment = comment
        # 操作时间
        self.operate_time = operate_time
        # 操作人
        self.operator = operator
        # 操作状态【NONE,WAITING,AGREED,REJECTED,CANCELED,ALL】
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.comment is not None:
            result['comment'] = self.comment
        if self.operate_time is not None:
            result['operate_time'] = self.operate_time
        if self.operator is not None:
            result['operator'] = self.operator
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('comment') is not None:
            self.comment = m.get('comment')
        if m.get('operate_time') is not None:
            self.operate_time = m.get('operate_time')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class TemplateDataConverter(TeaModel):
    def __init__(
        self,
        commodity_category: str = None,
        create_time: int = None,
        custodian_corp: str = None,
        customer_corp: str = None,
        custom_data: str = None,
        is_supplement: bool = None,
        league_id: str = None,
        league_name: str = None,
        lender_corp: str = None,
        position: List[str] = None,
        pre_position: List[str] = None,
        pre_warehouse_name: str = None,
        quantity: int = None,
        quantity_unit: str = None,
        real_right_name: str = None,
        state: str = None,
        supplement_warehouse_receipt_id: str = None,
        update_time: int = None,
        warehouse_name: str = None,
        warehouse_receipt_id: str = None,
        weight: str = None,
        weight_unit: str = None,
    ):
        # 货物品类
        self.commodity_category = commodity_category
        # 仓单的生成时间
        self.create_time = create_time
        # 仓储方名称或ID，提交的时候使用ID，展示使用名称
        self.custodian_corp = custodian_corp
        # 存货人名称或ID，提交的时候使用ID，展示使用名称
        self.customer_corp = customer_corp
        # 其他字典定制信息
        self.custom_data = custom_data
        # 是否补仓
        self.is_supplement = is_supplement
        # 联盟ID
        self.league_id = league_id
        # 联盟名称
        self.league_name = league_name
        # 资金方名称或ID，提交的时候使用ID，展示使用名称
        self.lender_corp = lender_corp
        # 仓位ID列表
        self.position = position
        # 预分配仓位ID列表
        self.pre_position = pre_position
        # 预分配仓库名称或ID，提交的时候使用ID，展示使用名称
        self.pre_warehouse_name = pre_warehouse_name
        # 数量
        self.quantity = quantity
        # 数量单位
        self.quantity_unit = quantity_unit
        # 物权方
        self.real_right_name = real_right_name
        # 仓单状态
        self.state = state
        # 补仓仓单ID
        self.supplement_warehouse_receipt_id = supplement_warehouse_receipt_id
        # 仓单更新时间
        self.update_time = update_time
        # 仓库名称或ID，提交的时候使用ID，展示使用名称
        self.warehouse_name = warehouse_name
        # 仓单ID
        self.warehouse_receipt_id = warehouse_receipt_id
        # 重量
        self.weight = weight
        # 重量单位
        self.weight_unit = weight_unit

    def validate(self):
        self.validate_required(self.commodity_category, 'commodity_category')
        self.validate_required(self.is_supplement, 'is_supplement')
        self.validate_required(self.league_id, 'league_id')
        self.validate_required(self.league_name, 'league_name')
        self.validate_required(self.quantity, 'quantity')
        self.validate_required(self.quantity_unit, 'quantity_unit')
        self.validate_required(self.weight, 'weight')
        self.validate_required(self.weight_unit, 'weight_unit')

    def to_map(self):
        result = dict()
        if self.commodity_category is not None:
            result['commodity_category'] = self.commodity_category
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.custodian_corp is not None:
            result['custodian_corp'] = self.custodian_corp
        if self.customer_corp is not None:
            result['customer_corp'] = self.customer_corp
        if self.custom_data is not None:
            result['custom_data'] = self.custom_data
        if self.is_supplement is not None:
            result['is_supplement'] = self.is_supplement
        if self.league_id is not None:
            result['league_id'] = self.league_id
        if self.league_name is not None:
            result['league_name'] = self.league_name
        if self.lender_corp is not None:
            result['lender_corp'] = self.lender_corp
        if self.position is not None:
            result['position'] = self.position
        if self.pre_position is not None:
            result['pre_position'] = self.pre_position
        if self.pre_warehouse_name is not None:
            result['pre_warehouse_name'] = self.pre_warehouse_name
        if self.quantity is not None:
            result['quantity'] = self.quantity
        if self.quantity_unit is not None:
            result['quantity_unit'] = self.quantity_unit
        if self.real_right_name is not None:
            result['real_right_name'] = self.real_right_name
        if self.state is not None:
            result['state'] = self.state
        if self.supplement_warehouse_receipt_id is not None:
            result['supplement_warehouse_receipt_id'] = self.supplement_warehouse_receipt_id
        if self.update_time is not None:
            result['update_time'] = self.update_time
        if self.warehouse_name is not None:
            result['warehouse_name'] = self.warehouse_name
        if self.warehouse_receipt_id is not None:
            result['warehouse_receipt_id'] = self.warehouse_receipt_id
        if self.weight is not None:
            result['weight'] = self.weight
        if self.weight_unit is not None:
            result['weight_unit'] = self.weight_unit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('commodity_category') is not None:
            self.commodity_category = m.get('commodity_category')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('custodian_corp') is not None:
            self.custodian_corp = m.get('custodian_corp')
        if m.get('customer_corp') is not None:
            self.customer_corp = m.get('customer_corp')
        if m.get('custom_data') is not None:
            self.custom_data = m.get('custom_data')
        if m.get('is_supplement') is not None:
            self.is_supplement = m.get('is_supplement')
        if m.get('league_id') is not None:
            self.league_id = m.get('league_id')
        if m.get('league_name') is not None:
            self.league_name = m.get('league_name')
        if m.get('lender_corp') is not None:
            self.lender_corp = m.get('lender_corp')
        if m.get('position') is not None:
            self.position = m.get('position')
        if m.get('pre_position') is not None:
            self.pre_position = m.get('pre_position')
        if m.get('pre_warehouse_name') is not None:
            self.pre_warehouse_name = m.get('pre_warehouse_name')
        if m.get('quantity') is not None:
            self.quantity = m.get('quantity')
        if m.get('quantity_unit') is not None:
            self.quantity_unit = m.get('quantity_unit')
        if m.get('real_right_name') is not None:
            self.real_right_name = m.get('real_right_name')
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('supplement_warehouse_receipt_id') is not None:
            self.supplement_warehouse_receipt_id = m.get('supplement_warehouse_receipt_id')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        if m.get('warehouse_name') is not None:
            self.warehouse_name = m.get('warehouse_name')
        if m.get('warehouse_receipt_id') is not None:
            self.warehouse_receipt_id = m.get('warehouse_receipt_id')
        if m.get('weight') is not None:
            self.weight = m.get('weight')
        if m.get('weight_unit') is not None:
            self.weight_unit = m.get('weight_unit')
        return self


class LeagueInfo(TeaModel):
    def __init__(
        self,
        create_time: int = None,
        league_id: str = None,
        league_name: str = None,
        league_desc: str = None,
        product_version: str = None,
    ):
        # 时间
        self.create_time = create_time
        # 联盟id
        self.league_id = league_id
        # 联盟名称
        self.league_name = league_name
        # 联盟描述
        self.league_desc = league_desc
        # 联盟对应的物权平台产品
        self.product_version = product_version

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.league_id is not None:
            result['league_id'] = self.league_id
        if self.league_name is not None:
            result['league_name'] = self.league_name
        if self.league_desc is not None:
            result['league_desc'] = self.league_desc
        if self.product_version is not None:
            result['product_version'] = self.product_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('league_id') is not None:
            self.league_id = m.get('league_id')
        if m.get('league_name') is not None:
            self.league_name = m.get('league_name')
        if m.get('league_desc') is not None:
            self.league_desc = m.get('league_desc')
        if m.get('product_version') is not None:
            self.product_version = m.get('product_version')
        return self


class DeviceGroup(TeaModel):
    def __init__(
        self,
        group_id: str = None,
        group_name: str = None,
        things_did_list: List[str] = None,
        things_info_list: List[DeviceInfoNoGroup] = None,
    ):
        # 设备组id
        self.group_id = group_id
        # 设备组名称
        self.group_name = group_name
        # 设备id
        self.things_did_list = things_did_list
        # 设备其他信息
        self.things_info_list = things_info_list

    def validate(self):
        if self.things_info_list:
            for k in self.things_info_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.group_id is not None:
            result['group_id'] = self.group_id
        if self.group_name is not None:
            result['group_name'] = self.group_name
        if self.things_did_list is not None:
            result['things_did_list'] = self.things_did_list
        result['things_info_list'] = []
        if self.things_info_list is not None:
            for k in self.things_info_list:
                result['things_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('group_id') is not None:
            self.group_id = m.get('group_id')
        if m.get('group_name') is not None:
            self.group_name = m.get('group_name')
        if m.get('things_did_list') is not None:
            self.things_did_list = m.get('things_did_list')
        self.things_info_list = []
        if m.get('things_info_list') is not None:
            for k in m.get('things_info_list'):
                temp_model = DeviceInfoNoGroup()
                self.things_info_list.append(temp_model.from_map(k))
        return self


class EvidenceInfo(TeaModel):
    def __init__(
        self,
        biz_id: int = None,
        asset_id: str = None,
        message: str = None,
        success: bool = None,
        qr_code: str = None,
    ):
        # 自定义序列
        self.biz_id = biz_id
        # 资产id
        self.asset_id = asset_id
        # 请求信息
        self.message = message
        # 创建是否成功
        self.success = success
        # 短码
        self.qr_code = qr_code

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.success, 'success')

    def to_map(self):
        result = dict()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.message is not None:
            result['message'] = self.message
        if self.success is not None:
            result['success'] = self.success
        if self.qr_code is not None:
            result['qr_code'] = self.qr_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('qr_code') is not None:
            self.qr_code = m.get('qr_code')
        return self


class FinancialRateInfo(TeaModel):
    def __init__(
        self,
        rate: str = None,
        start_day: int = None,
        end_day: int = None,
    ):
        # 融资利率
        self.rate = rate
        # 起始-天
        self.start_day = start_day
        # 终止-天
        self.end_day = end_day

    def validate(self):
        self.validate_required(self.rate, 'rate')
        self.validate_required(self.start_day, 'start_day')
        self.validate_required(self.end_day, 'end_day')

    def to_map(self):
        result = dict()
        if self.rate is not None:
            result['rate'] = self.rate
        if self.start_day is not None:
            result['start_day'] = self.start_day
        if self.end_day is not None:
            result['end_day'] = self.end_day
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('rate') is not None:
            self.rate = m.get('rate')
        if m.get('start_day') is not None:
            self.start_day = m.get('start_day')
        if m.get('end_day') is not None:
            self.end_day = m.get('end_day')
        return self


class WarehouseInfo(TeaModel):
    def __init__(
        self,
        address: str = None,
        blueprint_url: str = None,
        country: str = None,
        device_num: int = None,
        extra_info: str = None,
        latitude: str = None,
        longitude: str = None,
        smart_level: str = None,
        status: str = None,
        stock_position_num: int = None,
        version: str = None,
        warehouse_area: str = None,
        warehouse_height: str = None,
        warehouse_id: str = None,
        warehouse_name: str = None,
    ):
        # 地址
        self.address = address
        # 平面图
        self.blueprint_url = blueprint_url
        # 所在国家
        self.country = country
        # 设备数量
        self.device_num = device_num
        # 其他信息
        self.extra_info = extra_info
        # 纬度
        self.latitude = latitude
        # 经度
        self.longitude = longitude
        # 智能版本
        self.smart_level = smart_level
        # 仓库状态
        self.status = status
        # 仓位数量
        self.stock_position_num = stock_position_num
        # 版本信息
        self.version = version
        # 仓库面积
        self.warehouse_area = warehouse_area
        # 仓库高度
        self.warehouse_height = warehouse_height
        # 仓库Id
        self.warehouse_id = warehouse_id
        # 仓库名称
        self.warehouse_name = warehouse_name

    def validate(self):
        self.validate_required(self.address, 'address')
        self.validate_required(self.blueprint_url, 'blueprint_url')
        self.validate_required(self.country, 'country')
        self.validate_required(self.device_num, 'device_num')
        self.validate_required(self.latitude, 'latitude')
        self.validate_required(self.longitude, 'longitude')
        self.validate_required(self.smart_level, 'smart_level')
        self.validate_required(self.status, 'status')
        self.validate_required(self.stock_position_num, 'stock_position_num')
        self.validate_required(self.version, 'version')
        self.validate_required(self.warehouse_area, 'warehouse_area')
        self.validate_required(self.warehouse_height, 'warehouse_height')
        self.validate_required(self.warehouse_id, 'warehouse_id')
        self.validate_required(self.warehouse_name, 'warehouse_name')

    def to_map(self):
        result = dict()
        if self.address is not None:
            result['address'] = self.address
        if self.blueprint_url is not None:
            result['blueprint_url'] = self.blueprint_url
        if self.country is not None:
            result['country'] = self.country
        if self.device_num is not None:
            result['device_num'] = self.device_num
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        if self.latitude is not None:
            result['latitude'] = self.latitude
        if self.longitude is not None:
            result['longitude'] = self.longitude
        if self.smart_level is not None:
            result['smart_level'] = self.smart_level
        if self.status is not None:
            result['status'] = self.status
        if self.stock_position_num is not None:
            result['stock_position_num'] = self.stock_position_num
        if self.version is not None:
            result['version'] = self.version
        if self.warehouse_area is not None:
            result['warehouse_area'] = self.warehouse_area
        if self.warehouse_height is not None:
            result['warehouse_height'] = self.warehouse_height
        if self.warehouse_id is not None:
            result['warehouse_id'] = self.warehouse_id
        if self.warehouse_name is not None:
            result['warehouse_name'] = self.warehouse_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('blueprint_url') is not None:
            self.blueprint_url = m.get('blueprint_url')
        if m.get('country') is not None:
            self.country = m.get('country')
        if m.get('device_num') is not None:
            self.device_num = m.get('device_num')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        if m.get('latitude') is not None:
            self.latitude = m.get('latitude')
        if m.get('longitude') is not None:
            self.longitude = m.get('longitude')
        if m.get('smart_level') is not None:
            self.smart_level = m.get('smart_level')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('stock_position_num') is not None:
            self.stock_position_num = m.get('stock_position_num')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('warehouse_area') is not None:
            self.warehouse_area = m.get('warehouse_area')
        if m.get('warehouse_height') is not None:
            self.warehouse_height = m.get('warehouse_height')
        if m.get('warehouse_id') is not None:
            self.warehouse_id = m.get('warehouse_id')
        if m.get('warehouse_name') is not None:
            self.warehouse_name = m.get('warehouse_name')
        return self


class Role(TeaModel):
    def __init__(
        self,
        firm_name: str = None,
        open_tenant: str = None,
        role_type: str = None,
    ):
        # 企业名称
        self.firm_name = firm_name
        # 蚂蚁金融科技租户ID
        self.open_tenant = open_tenant
        # 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
        self.role_type = role_type

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.firm_name is not None:
            result['firm_name'] = self.firm_name
        if self.open_tenant is not None:
            result['open_tenant'] = self.open_tenant
        if self.role_type is not None:
            result['role_type'] = self.role_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('firm_name') is not None:
            self.firm_name = m.get('firm_name')
        if m.get('open_tenant') is not None:
            self.open_tenant = m.get('open_tenant')
        if m.get('role_type') is not None:
            self.role_type = m.get('role_type')
        return self


class OrderInfo(TeaModel):
    def __init__(
        self,
        order_no: str = None,
        ship_name: str = None,
        voyage_no: str = None,
        original_place: str = None,
        dest_place: str = None,
        leave_date: str = None,
        est_arri_date: str = None,
        actual_arri_date: str = None,
        waybill_weight: str = None,
        cargo_tank_list: List[CargoTank] = None,
        grantor_info: List[str] = None,
        consignee_info: List[str] = None,
        attachment: str = None,
        logistics_status: int = None,
    ):
        # 运单号
        self.order_no = order_no
        # 船名
        self.ship_name = ship_name
        # 航次
        self.voyage_no = voyage_no
        # 起始地
        self.original_place = original_place
        # 目的地
        self.dest_place = dest_place
        # 离港时间
        self.leave_date = leave_date
        # 预计到港时间
        self.est_arri_date = est_arri_date
        # 实际到港时间
        self.actual_arri_date = actual_arri_date
        # 运单重量
        self.waybill_weight = waybill_weight
        # 船运箱子详情列表
        self.cargo_tank_list = cargo_tank_list
        # 委托人信息
        self.grantor_info = grantor_info
        # 收货人信息
        self.consignee_info = consignee_info
        # 运单附件
        self.attachment = attachment
        # 物流状态:
        # 1-->已离开港口;
        # 2-->已到达港口;
        self.logistics_status = logistics_status

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.ship_name, 'ship_name')
        self.validate_required(self.voyage_no, 'voyage_no')
        self.validate_required(self.original_place, 'original_place')
        self.validate_required(self.dest_place, 'dest_place')
        self.validate_required(self.leave_date, 'leave_date')
        if self.leave_date is not None:
            self.validate_pattern(self.leave_date, 'leave_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.est_arri_date is not None:
            self.validate_pattern(self.est_arri_date, 'est_arri_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.actual_arri_date is not None:
            self.validate_pattern(self.actual_arri_date, 'actual_arri_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.waybill_weight, 'waybill_weight')
        self.validate_required(self.cargo_tank_list, 'cargo_tank_list')
        if self.cargo_tank_list:
            for k in self.cargo_tank_list:
                if k:
                    k.validate()
        self.validate_required(self.grantor_info, 'grantor_info')
        self.validate_required(self.consignee_info, 'consignee_info')
        self.validate_required(self.attachment, 'attachment')
        self.validate_required(self.logistics_status, 'logistics_status')

    def to_map(self):
        result = dict()
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.ship_name is not None:
            result['ship_name'] = self.ship_name
        if self.voyage_no is not None:
            result['voyage_no'] = self.voyage_no
        if self.original_place is not None:
            result['original_place'] = self.original_place
        if self.dest_place is not None:
            result['dest_place'] = self.dest_place
        if self.leave_date is not None:
            result['leave_date'] = self.leave_date
        if self.est_arri_date is not None:
            result['est_arri_date'] = self.est_arri_date
        if self.actual_arri_date is not None:
            result['actual_arri_date'] = self.actual_arri_date
        if self.waybill_weight is not None:
            result['waybill_weight'] = self.waybill_weight
        result['cargo_tank_list'] = []
        if self.cargo_tank_list is not None:
            for k in self.cargo_tank_list:
                result['cargo_tank_list'].append(k.to_map() if k else None)
        if self.grantor_info is not None:
            result['grantor_info'] = self.grantor_info
        if self.consignee_info is not None:
            result['consignee_info'] = self.consignee_info
        if self.attachment is not None:
            result['attachment'] = self.attachment
        if self.logistics_status is not None:
            result['logistics_status'] = self.logistics_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('ship_name') is not None:
            self.ship_name = m.get('ship_name')
        if m.get('voyage_no') is not None:
            self.voyage_no = m.get('voyage_no')
        if m.get('original_place') is not None:
            self.original_place = m.get('original_place')
        if m.get('dest_place') is not None:
            self.dest_place = m.get('dest_place')
        if m.get('leave_date') is not None:
            self.leave_date = m.get('leave_date')
        if m.get('est_arri_date') is not None:
            self.est_arri_date = m.get('est_arri_date')
        if m.get('actual_arri_date') is not None:
            self.actual_arri_date = m.get('actual_arri_date')
        if m.get('waybill_weight') is not None:
            self.waybill_weight = m.get('waybill_weight')
        self.cargo_tank_list = []
        if m.get('cargo_tank_list') is not None:
            for k in m.get('cargo_tank_list'):
                temp_model = CargoTank()
                self.cargo_tank_list.append(temp_model.from_map(k))
        if m.get('grantor_info') is not None:
            self.grantor_info = m.get('grantor_info')
        if m.get('consignee_info') is not None:
            self.consignee_info = m.get('consignee_info')
        if m.get('attachment') is not None:
            self.attachment = m.get('attachment')
        if m.get('logistics_status') is not None:
            self.logistics_status = m.get('logistics_status')
        return self


class UserDetail(TeaModel):
    def __init__(
        self,
        financing_no: str = None,
        divided_amount: int = None,
        divided_rate: str = None,
        penalty_amount: int = None,
        role_code: str = None,
        account_date: str = None,
        payment: int = None,
        other_profit: int = None,
    ):
        # 融资编号
        self.financing_no = financing_no
        # 分润金额，乘过分润比例，到记账日的累计值
        self.divided_amount = divided_amount
        # 分润比例，保留两位小数
        self.divided_rate = divided_rate
        # 罚息金额
        self.penalty_amount = penalty_amount
        # 角色编码
        self.role_code = role_code
        # 记账日期 yyyy-mm-dd
        self.account_date = account_date
        # 当日还款金额
        self.payment = payment
        # 其他利润(操作费还款日时写到各方记录)
        self.other_profit = other_profit

    def validate(self):
        self.validate_required(self.financing_no, 'financing_no')
        self.validate_required(self.divided_amount, 'divided_amount')
        self.validate_required(self.divided_rate, 'divided_rate')
        self.validate_required(self.penalty_amount, 'penalty_amount')
        self.validate_required(self.role_code, 'role_code')
        self.validate_required(self.account_date, 'account_date')
        if self.account_date is not None:
            self.validate_pattern(self.account_date, 'account_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.payment, 'payment')
        self.validate_required(self.other_profit, 'other_profit')

    def to_map(self):
        result = dict()
        if self.financing_no is not None:
            result['financing_no'] = self.financing_no
        if self.divided_amount is not None:
            result['divided_amount'] = self.divided_amount
        if self.divided_rate is not None:
            result['divided_rate'] = self.divided_rate
        if self.penalty_amount is not None:
            result['penalty_amount'] = self.penalty_amount
        if self.role_code is not None:
            result['role_code'] = self.role_code
        if self.account_date is not None:
            result['account_date'] = self.account_date
        if self.payment is not None:
            result['payment'] = self.payment
        if self.other_profit is not None:
            result['other_profit'] = self.other_profit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('financing_no') is not None:
            self.financing_no = m.get('financing_no')
        if m.get('divided_amount') is not None:
            self.divided_amount = m.get('divided_amount')
        if m.get('divided_rate') is not None:
            self.divided_rate = m.get('divided_rate')
        if m.get('penalty_amount') is not None:
            self.penalty_amount = m.get('penalty_amount')
        if m.get('role_code') is not None:
            self.role_code = m.get('role_code')
        if m.get('account_date') is not None:
            self.account_date = m.get('account_date')
        if m.get('payment') is not None:
            self.payment = m.get('payment')
        if m.get('other_profit') is not None:
            self.other_profit = m.get('other_profit')
        return self


class AssetInfo(TeaModel):
    def __init__(
        self,
        asset_id: str = None,
        template_id: str = None,
        content: str = None,
        blockchain_info: BlockchainInfo = None,
        qr_code: str = None,
    ):
        # 资产Id
        self.asset_id = asset_id
        # 数据字典Id
        self.template_id = template_id
        # 资产内容
        self.content = content
        # 链信息
        self.blockchain_info = blockchain_info
        # 短码
        self.qr_code = qr_code

    def validate(self):
        if self.blockchain_info:
            self.blockchain_info.validate()

    def to_map(self):
        result = dict()
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.content is not None:
            result['content'] = self.content
        if self.blockchain_info is not None:
            result['blockchain_info'] = self.blockchain_info.to_map()
        if self.qr_code is not None:
            result['qr_code'] = self.qr_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('blockchain_info') is not None:
            temp_model = BlockchainInfo()
            self.blockchain_info = temp_model.from_map(m['blockchain_info'])
        if m.get('qr_code') is not None:
            self.qr_code = m.get('qr_code')
        return self


class ErrorMessage(TeaModel):
    def __init__(
        self,
        error_code: str = None,
        error_msg: str = None,
    ):
        # 错误码
        self.error_code = error_code
        # 错误信息描述
        self.error_msg = error_msg

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class RoleRatio(TeaModel):
    def __init__(
        self,
        role_code: str = None,
        ratio: str = None,
    ):
        # 角色编号
        # 角色编号类型
        # 风险承担方：RISK_TAKER
        # 货物监管方：CARGO_SUPERVISION
        # 资金推荐方：CAPITAL_RECOMMEND
        # 融资推荐方：FUNDER_RECOMMEND
        # 运营管理方：MANAGEMENT
        # 技术支持方：TECHNICAL
        self.role_code = role_code
        # 分润比例，保留两位小数的百分比
        self.ratio = ratio

    def validate(self):
        self.validate_required(self.role_code, 'role_code')
        self.validate_required(self.ratio, 'ratio')

    def to_map(self):
        result = dict()
        if self.role_code is not None:
            result['role_code'] = self.role_code
        if self.ratio is not None:
            result['ratio'] = self.ratio
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('role_code') is not None:
            self.role_code = m.get('role_code')
        if m.get('ratio') is not None:
            self.ratio = m.get('ratio')
        return self


class UserStatement(TeaModel):
    def __init__(
        self,
        financing_no: str = None,
        product_no: str = None,
        financial_amount: int = None,
        profit_rate: str = None,
        total_amount: int = None,
        role_code: str = None,
        company_no: str = None,
        account_date: str = None,
    ):
        # 融资编号
        self.financing_no = financing_no
        # 产品编号，有的话返回
        self.product_no = product_no
        # 融资金额
        self.financial_amount = financial_amount
        # 分润比例，保留两位小数的百分比
        self.profit_rate = profit_rate
        # 总分润金额，乘过分润比例
        self.total_amount = total_amount
        # 角色名称，按上述角色名称约定
        self.role_code = role_code
        # 角色对应的企业
        self.company_no = company_no
        # 记账日期 yyyy-MM-dd
        self.account_date = account_date

    def validate(self):
        self.validate_required(self.financing_no, 'financing_no')
        self.validate_required(self.product_no, 'product_no')
        self.validate_required(self.financial_amount, 'financial_amount')
        self.validate_required(self.profit_rate, 'profit_rate')
        self.validate_required(self.total_amount, 'total_amount')
        self.validate_required(self.role_code, 'role_code')
        self.validate_required(self.company_no, 'company_no')
        self.validate_required(self.account_date, 'account_date')
        if self.account_date is not None:
            self.validate_pattern(self.account_date, 'account_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.financing_no is not None:
            result['financing_no'] = self.financing_no
        if self.product_no is not None:
            result['product_no'] = self.product_no
        if self.financial_amount is not None:
            result['financial_amount'] = self.financial_amount
        if self.profit_rate is not None:
            result['profit_rate'] = self.profit_rate
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.role_code is not None:
            result['role_code'] = self.role_code
        if self.company_no is not None:
            result['company_no'] = self.company_no
        if self.account_date is not None:
            result['account_date'] = self.account_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('financing_no') is not None:
            self.financing_no = m.get('financing_no')
        if m.get('product_no') is not None:
            self.product_no = m.get('product_no')
        if m.get('financial_amount') is not None:
            self.financial_amount = m.get('financial_amount')
        if m.get('profit_rate') is not None:
            self.profit_rate = m.get('profit_rate')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('role_code') is not None:
            self.role_code = m.get('role_code')
        if m.get('company_no') is not None:
            self.company_no = m.get('company_no')
        if m.get('account_date') is not None:
            self.account_date = m.get('account_date')
        return self


class DocumentInfo(TeaModel):
    def __init__(
        self,
        document_id: str = None,
        file_type: str = None,
        name: str = None,
        tx_hash: str = None,
        tx_time: int = None,
        url: str = None,
    ):
        # 文档Id
        self.document_id = document_id
        # 类型【CONTRACT 合同, NOTE 票据, DOCUMENT 文件, UNKNOWN 未知】
        self.file_type = file_type
        # 文档名
        self.name = name
        # 存证哈希
        self.tx_hash = tx_hash
        # 存证时间
        self.tx_time = tx_time
        # 文件Url
        self.url = url

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.document_id is not None:
            result['document_id'] = self.document_id
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.name is not None:
            result['name'] = self.name
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.tx_time is not None:
            result['tx_time'] = self.tx_time
        if self.url is not None:
            result['url'] = self.url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('document_id') is not None:
            self.document_id = m.get('document_id')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('tx_time') is not None:
            self.tx_time = m.get('tx_time')
        if m.get('url') is not None:
            self.url = m.get('url')
        return self


class AssetChainUser(TeaModel):
    def __init__(
        self,
        apply_id: str = None,
        apply_type: str = None,
        current_league_info: LeagueInfo = None,
        firm_name: str = None,
        league_apply_status: str = None,
        league_leader: bool = None,
        login_name: str = None,
        open_tenant: str = None,
        role_type: str = None,
    ):
        # 申请Id
        self.apply_id = apply_id
        # 联盟申请类型【NONE,JOIN,CREATE,ALL】
        self.apply_type = apply_type
        # 当前联盟信息
        self.current_league_info = current_league_info
        # 企业名称
        self.firm_name = firm_name
        # 申请流程状态【NONE,WAITING,AGREED,REJECTED,CANCELED,ALL】
        self.league_apply_status = league_apply_status
        # 是否是盟主
        self.league_leader = league_leader
        # 登录名
        self.login_name = login_name
        # 蚂蚁金融科技租户ID
        self.open_tenant = open_tenant
        # 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
        self.role_type = role_type

    def validate(self):
        if self.current_league_info:
            self.current_league_info.validate()

    def to_map(self):
        result = dict()
        if self.apply_id is not None:
            result['apply_id'] = self.apply_id
        if self.apply_type is not None:
            result['apply_type'] = self.apply_type
        if self.current_league_info is not None:
            result['current_league_info'] = self.current_league_info.to_map()
        if self.firm_name is not None:
            result['firm_name'] = self.firm_name
        if self.league_apply_status is not None:
            result['league_apply_status'] = self.league_apply_status
        if self.league_leader is not None:
            result['league_leader'] = self.league_leader
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.open_tenant is not None:
            result['open_tenant'] = self.open_tenant
        if self.role_type is not None:
            result['role_type'] = self.role_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('apply_id') is not None:
            self.apply_id = m.get('apply_id')
        if m.get('apply_type') is not None:
            self.apply_type = m.get('apply_type')
        if m.get('current_league_info') is not None:
            temp_model = LeagueInfo()
            self.current_league_info = temp_model.from_map(m['current_league_info'])
        if m.get('firm_name') is not None:
            self.firm_name = m.get('firm_name')
        if m.get('league_apply_status') is not None:
            self.league_apply_status = m.get('league_apply_status')
        if m.get('league_leader') is not None:
            self.league_leader = m.get('league_leader')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('open_tenant') is not None:
            self.open_tenant = m.get('open_tenant')
        if m.get('role_type') is not None:
            self.role_type = m.get('role_type')
        return self


class AllocLocationInfo(TeaModel):
    def __init__(
        self,
        location_id: str = None,
        location_name: str = None,
        capacity: int = None,
        used_capacity: str = None,
        monitor_capacity: str = None,
        monitor_level: str = None,
    ):
        # 仓位ID
        self.location_id = location_id
        # 仓位名称
        self.location_name = location_name
        # 仓位容量
        self.capacity = capacity
        # 已用容量
        self.used_capacity = used_capacity
        # 监控等级【VIDEOREGULATORY：视频监控】
        self.monitor_capacity = monitor_capacity
        # 监控水平【STANDARD：标准版，UPGRADED：升级版】
        self.monitor_level = monitor_level

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.location_id is not None:
            result['location_id'] = self.location_id
        if self.location_name is not None:
            result['location_name'] = self.location_name
        if self.capacity is not None:
            result['capacity'] = self.capacity
        if self.used_capacity is not None:
            result['used_capacity'] = self.used_capacity
        if self.monitor_capacity is not None:
            result['monitor_capacity'] = self.monitor_capacity
        if self.monitor_level is not None:
            result['monitor_level'] = self.monitor_level
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('location_id') is not None:
            self.location_id = m.get('location_id')
        if m.get('location_name') is not None:
            self.location_name = m.get('location_name')
        if m.get('capacity') is not None:
            self.capacity = m.get('capacity')
        if m.get('used_capacity') is not None:
            self.used_capacity = m.get('used_capacity')
        if m.get('monitor_capacity') is not None:
            self.monitor_capacity = m.get('monitor_capacity')
        if m.get('monitor_level') is not None:
            self.monitor_level = m.get('monitor_level')
        return self


class AliyunModel(TeaModel):
    def __init__(
        self,
        name: str = None,
        id: str = None,
    ):
        # 物模型类目名
        self.name = name
        # 物模型类目Id
        self.id = id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class AssetTemplate(TeaModel):
    def __init__(
        self,
        category_id: str = None,
        content: str = None,
        template_id: str = None,
        template_name: str = None,
        valid: bool = None,
        used: bool = None,
        version: str = None,
        league_uid: str = None,
        standard: bool = None,
    ):
        # 模板类型id
        self.category_id = category_id
        # 模板内容
        self.content = content
        # 模板id
        self.template_id = template_id
        # 模板名称
        self.template_name = template_name
        # 是否生效
        self.valid = valid
        # 是否使用
        self.used = used
        # 版本号
        self.version = version
        # 联盟Id
        self.league_uid = league_uid
        # 标准数据字典
        self.standard = standard

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.category_id is not None:
            result['category_id'] = self.category_id
        if self.content is not None:
            result['content'] = self.content
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.template_name is not None:
            result['template_name'] = self.template_name
        if self.valid is not None:
            result['valid'] = self.valid
        if self.used is not None:
            result['used'] = self.used
        if self.version is not None:
            result['version'] = self.version
        if self.league_uid is not None:
            result['league_uid'] = self.league_uid
        if self.standard is not None:
            result['standard'] = self.standard
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('category_id') is not None:
            self.category_id = m.get('category_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('template_name') is not None:
            self.template_name = m.get('template_name')
        if m.get('valid') is not None:
            self.valid = m.get('valid')
        if m.get('used') is not None:
            self.used = m.get('used')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('league_uid') is not None:
            self.league_uid = m.get('league_uid')
        if m.get('standard') is not None:
            self.standard = m.get('standard')
        return self


class DeviceInfo(TeaModel):
    def __init__(
        self,
        aliyun_model_id: str = None,
        device_group_list: List[DeviceGroup] = None,
        device_meta: str = None,
        device_owner_id: str = None,
        device_setup_info: str = None,
        device_type: str = None,
        device_user_id_list: List[str] = None,
        device_virtual_id: str = None,
        smart_version: str = None,
        status: str = None,
        stock_position_id_list: List[str] = None,
        stock_position_name_list: List[str] = None,
        things_did: str = None,
        things_name: str = None,
        video_url: str = None,
        warehouse_id: str = None,
        warehouse_name: str = None,
    ):
        # 物模型Id
        self.aliyun_model_id = aliyun_model_id
        # 设备组
        self.device_group_list = device_group_list
        # 三元组
        self.device_meta = device_meta
        # 设备拥有者Id
        self.device_owner_id = device_owner_id
        # 设备安装信息
        self.device_setup_info = device_setup_info
        # 设备类型【ALIDEV：阿里云设备，CHAINMACDEV：链机设备，M2MDEV：M2M设备，OTHERDEV：其他设备】
        self.device_type = device_type
        # 设备使用者Id
        self.device_user_id_list = device_user_id_list
        # 设备虚拟id
        self.device_virtual_id = device_virtual_id
        # 智能版本
        self.smart_version = smart_version
        # 设备状态
        # 【READY：未启用，STARTED：已启用，LOADING：信息待完善，DELETED：已注销， ALL：全部】
        self.status = status
        # 库位Id
        self.stock_position_id_list = stock_position_id_list
        # 库位名称
        self.stock_position_name_list = stock_position_name_list
        # thingsDid
        self.things_did = things_did
        # 设备名称
        self.things_name = things_name
        # 视频流地址
        self.video_url = video_url
        # 仓库Id
        self.warehouse_id = warehouse_id
        # 仓库名称
        self.warehouse_name = warehouse_name

    def validate(self):
        if self.device_group_list:
            for k in self.device_group_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.aliyun_model_id is not None:
            result['aliyun_model_id'] = self.aliyun_model_id
        result['device_group_list'] = []
        if self.device_group_list is not None:
            for k in self.device_group_list:
                result['device_group_list'].append(k.to_map() if k else None)
        if self.device_meta is not None:
            result['device_meta'] = self.device_meta
        if self.device_owner_id is not None:
            result['device_owner_id'] = self.device_owner_id
        if self.device_setup_info is not None:
            result['device_setup_info'] = self.device_setup_info
        if self.device_type is not None:
            result['device_type'] = self.device_type
        if self.device_user_id_list is not None:
            result['device_user_id_list'] = self.device_user_id_list
        if self.device_virtual_id is not None:
            result['device_virtual_id'] = self.device_virtual_id
        if self.smart_version is not None:
            result['smart_version'] = self.smart_version
        if self.status is not None:
            result['status'] = self.status
        if self.stock_position_id_list is not None:
            result['stock_position_id_list'] = self.stock_position_id_list
        if self.stock_position_name_list is not None:
            result['stock_position_name_list'] = self.stock_position_name_list
        if self.things_did is not None:
            result['things_did'] = self.things_did
        if self.things_name is not None:
            result['things_name'] = self.things_name
        if self.video_url is not None:
            result['video_url'] = self.video_url
        if self.warehouse_id is not None:
            result['warehouse_id'] = self.warehouse_id
        if self.warehouse_name is not None:
            result['warehouse_name'] = self.warehouse_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('aliyun_model_id') is not None:
            self.aliyun_model_id = m.get('aliyun_model_id')
        self.device_group_list = []
        if m.get('device_group_list') is not None:
            for k in m.get('device_group_list'):
                temp_model = DeviceGroup()
                self.device_group_list.append(temp_model.from_map(k))
        if m.get('device_meta') is not None:
            self.device_meta = m.get('device_meta')
        if m.get('device_owner_id') is not None:
            self.device_owner_id = m.get('device_owner_id')
        if m.get('device_setup_info') is not None:
            self.device_setup_info = m.get('device_setup_info')
        if m.get('device_type') is not None:
            self.device_type = m.get('device_type')
        if m.get('device_user_id_list') is not None:
            self.device_user_id_list = m.get('device_user_id_list')
        if m.get('device_virtual_id') is not None:
            self.device_virtual_id = m.get('device_virtual_id')
        if m.get('smart_version') is not None:
            self.smart_version = m.get('smart_version')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('stock_position_id_list') is not None:
            self.stock_position_id_list = m.get('stock_position_id_list')
        if m.get('stock_position_name_list') is not None:
            self.stock_position_name_list = m.get('stock_position_name_list')
        if m.get('things_did') is not None:
            self.things_did = m.get('things_did')
        if m.get('things_name') is not None:
            self.things_name = m.get('things_name')
        if m.get('video_url') is not None:
            self.video_url = m.get('video_url')
        if m.get('warehouse_id') is not None:
            self.warehouse_id = m.get('warehouse_id')
        if m.get('warehouse_name') is not None:
            self.warehouse_name = m.get('warehouse_name')
        return self


class LeagueApplyInfo(TeaModel):
    def __init__(
        self,
        apply_account: str = None,
        apply_corp: str = None,
        apply_id: str = None,
        apply_mobile_num: str = None,
        apply_time: str = None,
        apply_type: str = None,
        current_status: str = None,
        flow_history: List[FlowInfo] = None,
        role_type: str = None,
    ):
        # 申请账号
        self.apply_account = apply_account
        # 申请企业
        self.apply_corp = apply_corp
        # 申请Id
        self.apply_id = apply_id
        # 申请人手机
        self.apply_mobile_num = apply_mobile_num
        # 申请时间
        self.apply_time = apply_time
        # 申请类型【NONE,JOIN,CREATE,ALL】
        self.apply_type = apply_type
        # 当前流程状态【NONE,WAITING,AGREED,REJECTED,CANCELED,ALL】
        self.current_status = current_status
        # 流程历史
        self.flow_history = flow_history
        # 角色【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
        self.role_type = role_type

    def validate(self):
        if self.flow_history:
            for k in self.flow_history:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.apply_account is not None:
            result['apply_account'] = self.apply_account
        if self.apply_corp is not None:
            result['apply_corp'] = self.apply_corp
        if self.apply_id is not None:
            result['apply_id'] = self.apply_id
        if self.apply_mobile_num is not None:
            result['apply_mobile_num'] = self.apply_mobile_num
        if self.apply_time is not None:
            result['apply_time'] = self.apply_time
        if self.apply_type is not None:
            result['apply_type'] = self.apply_type
        if self.current_status is not None:
            result['current_status'] = self.current_status
        result['flow_history'] = []
        if self.flow_history is not None:
            for k in self.flow_history:
                result['flow_history'].append(k.to_map() if k else None)
        if self.role_type is not None:
            result['role_type'] = self.role_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('apply_account') is not None:
            self.apply_account = m.get('apply_account')
        if m.get('apply_corp') is not None:
            self.apply_corp = m.get('apply_corp')
        if m.get('apply_id') is not None:
            self.apply_id = m.get('apply_id')
        if m.get('apply_mobile_num') is not None:
            self.apply_mobile_num = m.get('apply_mobile_num')
        if m.get('apply_time') is not None:
            self.apply_time = m.get('apply_time')
        if m.get('apply_type') is not None:
            self.apply_type = m.get('apply_type')
        if m.get('current_status') is not None:
            self.current_status = m.get('current_status')
        self.flow_history = []
        if m.get('flow_history') is not None:
            for k in m.get('flow_history'):
                temp_model = FlowInfo()
                self.flow_history.append(temp_model.from_map(k))
        if m.get('role_type') is not None:
            self.role_type = m.get('role_type')
        return self


class RegisterWhReceiptSummary(TeaModel):
    def __init__(
        self,
        register_wh_receipt_id: str = None,
        warehouse_receipt_id: str = None,
        status: str = None,
        apply_time: int = None,
        commodity_category: str = None,
        quantity: str = None,
        weight: str = None,
        customer_name: str = None,
        custodian_name: str = None,
    ):
        # 注册仓单申请单ID
        self.register_wh_receipt_id = register_wh_receipt_id
        # 仓单ID
        self.warehouse_receipt_id = warehouse_receipt_id
        # 注册仓单申请单状态【 NONE：无效状态，WAITING：待审核，AGREED：审核同意，REJECTED：审核拒绝，CANCELED：已取消，WAITING_PRE_ALLOC_POSITION：待预分配仓位，WAITING_TRANSACTION_IN：待入库，TRANSACTION_IN：入库中，FINISHED_TRANSACTION_IN：已入库/待确认，CONFIRMED_TRANSACTION_IN：完成入库，INTERRUPTION：已中断，ALL：所有状态】
        self.status = status
        # 申请时间，单位：ms
        self.apply_time = apply_time
        # 货物品类
        self.commodity_category = commodity_category
        # 数量 + 单位
        self.quantity = quantity
        # 重量 + 单位
        self.weight = weight
        # 存货人名称
        self.customer_name = customer_name
        # 保管人名称
        self.custodian_name = custodian_name

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.register_wh_receipt_id is not None:
            result['register_wh_receipt_id'] = self.register_wh_receipt_id
        if self.warehouse_receipt_id is not None:
            result['warehouse_receipt_id'] = self.warehouse_receipt_id
        if self.status is not None:
            result['status'] = self.status
        if self.apply_time is not None:
            result['apply_time'] = self.apply_time
        if self.commodity_category is not None:
            result['commodity_category'] = self.commodity_category
        if self.quantity is not None:
            result['quantity'] = self.quantity
        if self.weight is not None:
            result['weight'] = self.weight
        if self.customer_name is not None:
            result['customer_name'] = self.customer_name
        if self.custodian_name is not None:
            result['custodian_name'] = self.custodian_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('register_wh_receipt_id') is not None:
            self.register_wh_receipt_id = m.get('register_wh_receipt_id')
        if m.get('warehouse_receipt_id') is not None:
            self.warehouse_receipt_id = m.get('warehouse_receipt_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('apply_time') is not None:
            self.apply_time = m.get('apply_time')
        if m.get('commodity_category') is not None:
            self.commodity_category = m.get('commodity_category')
        if m.get('quantity') is not None:
            self.quantity = m.get('quantity')
        if m.get('weight') is not None:
            self.weight = m.get('weight')
        if m.get('customer_name') is not None:
            self.customer_name = m.get('customer_name')
        if m.get('custodian_name') is not None:
            self.custodian_name = m.get('custodian_name')
        return self


class StockPositionUsed(TeaModel):
    def __init__(
        self,
        position_id: str = None,
        used_capacity: int = None,
    ):
        # 库位ID
        self.position_id = position_id
        # 已用容量，百分比的数值，如50%，则为50
        self.used_capacity = used_capacity

    def validate(self):
        self.validate_required(self.position_id, 'position_id')
        self.validate_required(self.used_capacity, 'used_capacity')

    def to_map(self):
        result = dict()
        if self.position_id is not None:
            result['position_id'] = self.position_id
        if self.used_capacity is not None:
            result['used_capacity'] = self.used_capacity
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('position_id') is not None:
            self.position_id = m.get('position_id')
        if m.get('used_capacity') is not None:
            self.used_capacity = m.get('used_capacity')
        return self


class DeviceUser(TeaModel):
    def __init__(
        self,
        device_user_id: str = None,
        device_user_name: str = None,
        role_type: str = None,
        authority: str = None,
    ):
        # 用户id
        self.device_user_id = device_user_id
        # 用户名称
        self.device_user_name = device_user_name
        # 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
        self.role_type = role_type
        # 权限(仅有设备所有权和设备使用权两种权限)
        self.authority = authority

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.device_user_id is not None:
            result['device_user_id'] = self.device_user_id
        if self.device_user_name is not None:
            result['device_user_name'] = self.device_user_name
        if self.role_type is not None:
            result['role_type'] = self.role_type
        if self.authority is not None:
            result['authority'] = self.authority
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('device_user_id') is not None:
            self.device_user_id = m.get('device_user_id')
        if m.get('device_user_name') is not None:
            self.device_user_name = m.get('device_user_name')
        if m.get('role_type') is not None:
            self.role_type = m.get('role_type')
        if m.get('authority') is not None:
            self.authority = m.get('authority')
        return self


class RoleOrganization(TeaModel):
    def __init__(
        self,
        company_no: str = None,
        company_name: str = None,
        role_code: str = None,
    ):
        # 企业编号
        self.company_no = company_no
        # 企业名称
        self.company_name = company_name
        # 角色编码
        # 角色编码类型
        # 风险承担方：RISK_TAKER
        # 货物监管方：CARGO_SUPERVISION
        # 资金推荐方：CAPITAL_RECOMMEND
        # 融资推荐方：FUNDER_RECOMMEND
        # 运营管理方：MANAGEMENT
        # 技术支持方：TECHNICAL
        self.role_code = role_code

    def validate(self):
        self.validate_required(self.company_no, 'company_no')
        self.validate_required(self.company_name, 'company_name')
        self.validate_required(self.role_code, 'role_code')

    def to_map(self):
        result = dict()
        if self.company_no is not None:
            result['company_no'] = self.company_no
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.role_code is not None:
            result['role_code'] = self.role_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('company_no') is not None:
            self.company_no = m.get('company_no')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('role_code') is not None:
            self.role_code = m.get('role_code')
        return self


class WarehouseReceiptTraceInfo(TeaModel):
    def __init__(
        self,
        operate_type: str = None,
        operate_type_desc: str = None,
        operate_time: int = None,
        blockchain_info: BlockchainInfo = None,
        operator_name: str = None,
        action_type: str = None,
        action_desc: str = None,
        operate_object: str = None,
    ):
        # string (enum: PICK_UP, WEAK_ASSET, WEAK_ASSET_TRANSFER, WAREHOUSE_RECEIPT_TRANSFER, WAREHOUSE_RECEIPT_REGISTER, PLEDGE_APPLICATION, PLEDGE_RELEASE, WAREHOUSE_RECEIPT_CANCEL, WAREHOUSE_RECEIPT_UPDATE)
        self.operate_type = operate_type
        # 操作标识
        self.operate_type_desc = operate_type_desc
        # 操作时间
        self.operate_time = operate_time
        # 区块链信息
        self.blockchain_info = blockchain_info
        # 操作主体
        self.operator_name = operator_name
        # string (enum: COMMIT, AGREE, REJECT, CREATE, START, PRE_ALLOC, ALLOC, UPLOAD, UPDATE, COMPLETE, CONFIRM, CONFIRM_COMMIT, CONFIRM_RECALL, TRIGGER, SPLIT, RECALL)
        self.action_type = action_type
        # 动作描述
        self.action_desc = action_desc
        # 操作对象
        self.operate_object = operate_object

    def validate(self):
        if self.blockchain_info:
            self.blockchain_info.validate()

    def to_map(self):
        result = dict()
        if self.operate_type is not None:
            result['operate_type'] = self.operate_type
        if self.operate_type_desc is not None:
            result['operate_type_desc'] = self.operate_type_desc
        if self.operate_time is not None:
            result['operate_time'] = self.operate_time
        if self.blockchain_info is not None:
            result['blockchain_info'] = self.blockchain_info.to_map()
        if self.operator_name is not None:
            result['operator_name'] = self.operator_name
        if self.action_type is not None:
            result['action_type'] = self.action_type
        if self.action_desc is not None:
            result['action_desc'] = self.action_desc
        if self.operate_object is not None:
            result['operate_object'] = self.operate_object
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('operate_type') is not None:
            self.operate_type = m.get('operate_type')
        if m.get('operate_type_desc') is not None:
            self.operate_type_desc = m.get('operate_type_desc')
        if m.get('operate_time') is not None:
            self.operate_time = m.get('operate_time')
        if m.get('blockchain_info') is not None:
            temp_model = BlockchainInfo()
            self.blockchain_info = temp_model.from_map(m['blockchain_info'])
        if m.get('operator_name') is not None:
            self.operator_name = m.get('operator_name')
        if m.get('action_type') is not None:
            self.action_type = m.get('action_type')
        if m.get('action_desc') is not None:
            self.action_desc = m.get('action_desc')
        if m.get('operate_object') is not None:
            self.operate_object = m.get('operate_object')
        return self


class ScreenShot(TeaModel):
    def __init__(
        self,
        file_id: str = None,
        file_url: str = None,
        screenshot_time: int = None,
        tx_hash: str = None,
        device_name: str = None,
        location_name_list: List[str] = None,
    ):
        # id
        self.file_id = file_id
        # url
        self.file_url = file_url
        # 时间
        self.screenshot_time = screenshot_time
        # 上链txHash
        self.tx_hash = tx_hash
        # 设备名称
        self.device_name = device_name
        # 关联仓位名称列表
        self.location_name_list = location_name_list

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.file_url is not None:
            result['file_url'] = self.file_url
        if self.screenshot_time is not None:
            result['screenshot_time'] = self.screenshot_time
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.device_name is not None:
            result['device_name'] = self.device_name
        if self.location_name_list is not None:
            result['location_name_list'] = self.location_name_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        if m.get('screenshot_time') is not None:
            self.screenshot_time = m.get('screenshot_time')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('device_name') is not None:
            self.device_name = m.get('device_name')
        if m.get('location_name_list') is not None:
            self.location_name_list = m.get('location_name_list')
        return self


class PenaltyRateInfo(TeaModel):
    def __init__(
        self,
        rate: str = None,
        start_day: int = None,
        end_day: int = None,
    ):
        # 罚息
        self.rate = rate
        # 起始-天
        self.start_day = start_day
        # 终止-天
        self.end_day = end_day

    def validate(self):
        self.validate_required(self.rate, 'rate')
        self.validate_required(self.start_day, 'start_day')
        self.validate_required(self.end_day, 'end_day')

    def to_map(self):
        result = dict()
        if self.rate is not None:
            result['rate'] = self.rate
        if self.start_day is not None:
            result['start_day'] = self.start_day
        if self.end_day is not None:
            result['end_day'] = self.end_day
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('rate') is not None:
            self.rate = m.get('rate')
        if m.get('start_day') is not None:
            self.start_day = m.get('start_day')
        if m.get('end_day') is not None:
            self.end_day = m.get('end_day')
        return self


class StorageLocation(TeaModel):
    def __init__(
        self,
        capacity: str = None,
        device_id_list: List[str] = None,
        extra_info: str = None,
        id: str = None,
        monitor_capacity: str = None,
        monitor_level: str = None,
        name: str = None,
        product_type: str = None,
        status: str = None,
        storage_location_area: str = None,
        storage_location_height: str = None,
        type: str = None,
        used_capacity: str = None,
        virtual_id: str = None,
        warehouse_id: str = None,
        warehouse_receipt_id: str = None,
    ):
        # 仓位容量
        self.capacity = capacity
        # 设备id
        self.device_id_list = device_id_list
        # 其他信息
        self.extra_info = extra_info
        # 库位id
        self.id = id
        # 监控等级【VIDEOREGULATORY：视频监控】
        self.monitor_capacity = monitor_capacity
        # 监控水平【STANDARD：标准版，UPGRADED：升级版】
        self.monitor_level = monitor_level
        # 库位名称
        self.name = name
        # 货物类型【DANGER：危险品，NON_DANGER：非危险品，FOOD：食品】
        # 
        self.product_type = product_type
        # 状态【AVAILABLE：可用，IN_USE：使用中，IN_CONFIG：配置中，DELETED：已删除】
        self.status = status
        # 仓位面积
        self.storage_location_area = storage_location_area
        # 仓位高度
        self.storage_location_height = storage_location_height
        # 库位类型【CHILL：冷藏，FREEZE：冷冻，PASSAGE：通道，FLAT：平面， STEREO：立体】
        self.type = type
        # 已用容量
        self.used_capacity = used_capacity
        # 库位虚拟id
        self.virtual_id = virtual_id
        # 仓库Id
        self.warehouse_id = warehouse_id
        # 关联仓单Id
        self.warehouse_receipt_id = warehouse_receipt_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.capacity is not None:
            result['capacity'] = self.capacity
        if self.device_id_list is not None:
            result['device_id_list'] = self.device_id_list
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        if self.id is not None:
            result['id'] = self.id
        if self.monitor_capacity is not None:
            result['monitor_capacity'] = self.monitor_capacity
        if self.monitor_level is not None:
            result['monitor_level'] = self.monitor_level
        if self.name is not None:
            result['name'] = self.name
        if self.product_type is not None:
            result['product_type'] = self.product_type
        if self.status is not None:
            result['status'] = self.status
        if self.storage_location_area is not None:
            result['storage_location_area'] = self.storage_location_area
        if self.storage_location_height is not None:
            result['storage_location_height'] = self.storage_location_height
        if self.type is not None:
            result['type'] = self.type
        if self.used_capacity is not None:
            result['used_capacity'] = self.used_capacity
        if self.virtual_id is not None:
            result['virtual_id'] = self.virtual_id
        if self.warehouse_id is not None:
            result['warehouse_id'] = self.warehouse_id
        if self.warehouse_receipt_id is not None:
            result['warehouse_receipt_id'] = self.warehouse_receipt_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('capacity') is not None:
            self.capacity = m.get('capacity')
        if m.get('device_id_list') is not None:
            self.device_id_list = m.get('device_id_list')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('monitor_capacity') is not None:
            self.monitor_capacity = m.get('monitor_capacity')
        if m.get('monitor_level') is not None:
            self.monitor_level = m.get('monitor_level')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('product_type') is not None:
            self.product_type = m.get('product_type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('storage_location_area') is not None:
            self.storage_location_area = m.get('storage_location_area')
        if m.get('storage_location_height') is not None:
            self.storage_location_height = m.get('storage_location_height')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('used_capacity') is not None:
            self.used_capacity = m.get('used_capacity')
        if m.get('virtual_id') is not None:
            self.virtual_id = m.get('virtual_id')
        if m.get('warehouse_id') is not None:
            self.warehouse_id = m.get('warehouse_id')
        if m.get('warehouse_receipt_id') is not None:
            self.warehouse_receipt_id = m.get('warehouse_receipt_id')
        return self


class ThirdPartyUser(TeaModel):
    def __init__(
        self,
        user_id: str = None,
        user_name: str = None,
        league_uid: str = None,
        create_time: str = None,
    ):
        # 用户id
        self.user_id = user_id
        # 用户名
        self.user_name = user_name
        # 联盟id
        self.league_uid = league_uid
        # 创建时间
        self.create_time = create_time

    def validate(self):
        if self.create_time is not None:
            self.validate_pattern(self.create_time, 'create_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.league_uid is not None:
            result['league_uid'] = self.league_uid
        if self.create_time is not None:
            result['create_time'] = self.create_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('league_uid') is not None:
            self.league_uid = m.get('league_uid')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        return self


class AssetResult(TeaModel):
    def __init__(
        self,
        asset_id: str = None,
        success: bool = None,
        message: str = None,
    ):
        # 资产id
        self.asset_id = asset_id
        # 是否成功
        self.success = success
        # 信息
        self.message = message

    def validate(self):
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.success, 'success')

    def to_map(self):
        result = dict()
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.success is not None:
            result['success'] = self.success
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class OpeUnitPriceInfo(TeaModel):
    def __init__(
        self,
        unit_price: int = None,
        start_day: int = None,
        end_day: int = None,
    ):
        # 操作费单价 （分）
        self.unit_price = unit_price
        # 起始-天 （-999 表示无日期限制）
        self.start_day = start_day
        # 终止-天 （-999 表示无日期限制）
        self.end_day = end_day

    def validate(self):
        self.validate_required(self.unit_price, 'unit_price')
        self.validate_required(self.start_day, 'start_day')
        self.validate_required(self.end_day, 'end_day')

    def to_map(self):
        result = dict()
        if self.unit_price is not None:
            result['unit_price'] = self.unit_price
        if self.start_day is not None:
            result['start_day'] = self.start_day
        if self.end_day is not None:
            result['end_day'] = self.end_day
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('unit_price') is not None:
            self.unit_price = m.get('unit_price')
        if m.get('start_day') is not None:
            self.start_day = m.get('start_day')
        if m.get('end_day') is not None:
            self.end_day = m.get('end_day')
        return self


class TemplateInfo(TeaModel):
    def __init__(
        self,
        template_id: str = None,
        template_name: str = None,
        template: str = None,
    ):
        # 数据字id
        self.template_id = template_id
        # 数据字典名称
        self.template_name = template_name
        # 数据字典内容
        self.template = template

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.template_name is not None:
            result['template_name'] = self.template_name
        if self.template is not None:
            result['template'] = self.template
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('template_name') is not None:
            self.template_name = m.get('template_name')
        if m.get('template') is not None:
            self.template = m.get('template')
        return self


class TotalStatement(TeaModel):
    def __init__(
        self,
        company_no: str = None,
        account_date: str = None,
        amount: int = None,
        risk_taker: int = None,
        cargo_supervision: int = None,
        capital_recommend: int = None,
        funder_recommend: int = None,
        management: int = None,
        technical: int = None,
    ):
        # 企业编号
        self.company_no = company_no
        # 记账日期 yyyy-mm-dd
        self.account_date = account_date
        # 总分润金额
        self.amount = amount
        # 风险承担方金额
        self.risk_taker = risk_taker
        # 货物监管方金额
        self.cargo_supervision = cargo_supervision
        # 资金推荐方金额
        self.capital_recommend = capital_recommend
        # 融资推荐方金额
        self.funder_recommend = funder_recommend
        # 运营管理方金额
        self.management = management
        # 技术支持方金额
        self.technical = technical

    def validate(self):
        self.validate_required(self.company_no, 'company_no')
        self.validate_required(self.account_date, 'account_date')
        if self.account_date is not None:
            self.validate_pattern(self.account_date, 'account_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.amount, 'amount')
        self.validate_required(self.risk_taker, 'risk_taker')
        self.validate_required(self.cargo_supervision, 'cargo_supervision')
        self.validate_required(self.capital_recommend, 'capital_recommend')
        self.validate_required(self.funder_recommend, 'funder_recommend')
        self.validate_required(self.management, 'management')
        self.validate_required(self.technical, 'technical')

    def to_map(self):
        result = dict()
        if self.company_no is not None:
            result['company_no'] = self.company_no
        if self.account_date is not None:
            result['account_date'] = self.account_date
        if self.amount is not None:
            result['amount'] = self.amount
        if self.risk_taker is not None:
            result['risk_taker'] = self.risk_taker
        if self.cargo_supervision is not None:
            result['cargo_supervision'] = self.cargo_supervision
        if self.capital_recommend is not None:
            result['capital_recommend'] = self.capital_recommend
        if self.funder_recommend is not None:
            result['funder_recommend'] = self.funder_recommend
        if self.management is not None:
            result['management'] = self.management
        if self.technical is not None:
            result['technical'] = self.technical
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('company_no') is not None:
            self.company_no = m.get('company_no')
        if m.get('account_date') is not None:
            self.account_date = m.get('account_date')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('risk_taker') is not None:
            self.risk_taker = m.get('risk_taker')
        if m.get('cargo_supervision') is not None:
            self.cargo_supervision = m.get('cargo_supervision')
        if m.get('capital_recommend') is not None:
            self.capital_recommend = m.get('capital_recommend')
        if m.get('funder_recommend') is not None:
            self.funder_recommend = m.get('funder_recommend')
        if m.get('management') is not None:
            self.management = m.get('management')
        if m.get('technical') is not None:
            self.technical = m.get('technical')
        return self


class CertificateInfo(TeaModel):
    def __init__(
        self,
        template_id: str = None,
        content: str = None,
        biz_id: int = None,
    ):
        # 模板id
        self.template_id = template_id
        # 字典模板定义的数据，key-value的json对象
        self.content = content
        # 自定义序列（不能重复）
        self.biz_id = biz_id

    def validate(self):
        self.validate_required(self.template_id, 'template_id')
        self.validate_required(self.content, 'content')
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        result = dict()
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.content is not None:
            result['content'] = self.content
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        return self


class TemplateData(TeaModel):
    def __init__(
        self,
        template_uid: str = None,
        form_data: TemplateDataConverter = None,
    ):
        # 字典类型ID
        self.template_uid = template_uid
        # 数字字典内容
        self.form_data = form_data

    def validate(self):
        if self.form_data:
            self.form_data.validate()

    def to_map(self):
        result = dict()
        if self.template_uid is not None:
            result['template_uid'] = self.template_uid
        if self.form_data is not None:
            result['form_data'] = self.form_data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('template_uid') is not None:
            self.template_uid = m.get('template_uid')
        if m.get('form_data') is not None:
            temp_model = TemplateDataConverter()
            self.form_data = temp_model.from_map(m['form_data'])
        return self


class TransactionInInfo(TeaModel):
    def __init__(
        self,
        id: int = None,
        warehouse_did: str = None,
        warehouse_name: str = None,
        location_did: str = None,
        location_name: str = None,
        device_did: str = None,
        device_name: str = None,
        start_time: int = None,
        end_time: int = None,
        video_url: str = None,
        tx_hash: str = None,
    ):
        # 入库信息表ID
        self.id = id
        # 仓库Did
        self.warehouse_did = warehouse_did
        # 仓库名称
        self.warehouse_name = warehouse_name
        # 库位Did
        self.location_did = location_did
        # 库位名称
        self.location_name = location_name
        # 设备Did
        self.device_did = device_did
        # 设备名称
        self.device_name = device_name
        # 开始时间，单位：s
        self.start_time = start_time
        # 结束时间, 单位：s
        self.end_time = end_time
        # 入库视频信息url
        self.video_url = video_url
        # 存证交易hash
        self.tx_hash = tx_hash

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.warehouse_did is not None:
            result['warehouse_did'] = self.warehouse_did
        if self.warehouse_name is not None:
            result['warehouse_name'] = self.warehouse_name
        if self.location_did is not None:
            result['location_did'] = self.location_did
        if self.location_name is not None:
            result['location_name'] = self.location_name
        if self.device_did is not None:
            result['device_did'] = self.device_did
        if self.device_name is not None:
            result['device_name'] = self.device_name
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.video_url is not None:
            result['video_url'] = self.video_url
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('warehouse_did') is not None:
            self.warehouse_did = m.get('warehouse_did')
        if m.get('warehouse_name') is not None:
            self.warehouse_name = m.get('warehouse_name')
        if m.get('location_did') is not None:
            self.location_did = m.get('location_did')
        if m.get('location_name') is not None:
            self.location_name = m.get('location_name')
        if m.get('device_did') is not None:
            self.device_did = m.get('device_did')
        if m.get('device_name') is not None:
            self.device_name = m.get('device_name')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('video_url') is not None:
            self.video_url = m.get('video_url')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class Organization(TeaModel):
    def __init__(
        self,
        role_company_no: str = None,
        role_company_name: str = None,
    ):
        # 企业编号
        self.role_company_no = role_company_no
        # 企业名称
        self.role_company_name = role_company_name

    def validate(self):
        self.validate_required(self.role_company_no, 'role_company_no')
        self.validate_required(self.role_company_name, 'role_company_name')

    def to_map(self):
        result = dict()
        if self.role_company_no is not None:
            result['role_company_no'] = self.role_company_no
        if self.role_company_name is not None:
            result['role_company_name'] = self.role_company_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('role_company_no') is not None:
            self.role_company_no = m.get('role_company_no')
        if m.get('role_company_name') is not None:
            self.role_company_name = m.get('role_company_name')
        return self


class BankFee(TeaModel):
    def __init__(
        self,
        financial_no: str = None,
        product_no: str = None,
        capital_amount: int = None,
        interest_amount: int = None,
        total_amount: int = None,
        account_date: str = None,
    ):
        # 融资编号
        self.financial_no = financial_no
        # 产品编号
        self.product_no = product_no
        # 应付银行本金
        self.capital_amount = capital_amount
        # 应付银行利息
        self.interest_amount = interest_amount
        # 应付总金额
        self.total_amount = total_amount
        # 记账日期 yyyy-MM-dd
        self.account_date = account_date

    def validate(self):
        self.validate_required(self.financial_no, 'financial_no')
        self.validate_required(self.product_no, 'product_no')
        self.validate_required(self.capital_amount, 'capital_amount')
        self.validate_required(self.interest_amount, 'interest_amount')
        self.validate_required(self.total_amount, 'total_amount')
        self.validate_required(self.account_date, 'account_date')
        if self.account_date is not None:
            self.validate_pattern(self.account_date, 'account_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.financial_no is not None:
            result['financial_no'] = self.financial_no
        if self.product_no is not None:
            result['product_no'] = self.product_no
        if self.capital_amount is not None:
            result['capital_amount'] = self.capital_amount
        if self.interest_amount is not None:
            result['interest_amount'] = self.interest_amount
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.account_date is not None:
            result['account_date'] = self.account_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('financial_no') is not None:
            self.financial_no = m.get('financial_no')
        if m.get('product_no') is not None:
            self.product_no = m.get('product_no')
        if m.get('capital_amount') is not None:
            self.capital_amount = m.get('capital_amount')
        if m.get('interest_amount') is not None:
            self.interest_amount = m.get('interest_amount')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('account_date') is not None:
            self.account_date = m.get('account_date')
        return self


class StringStringEntry(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: str = None,
    ):
        # 键
        self.key = key
        # 值
        self.value = value

    def validate(self):
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


class RegisterWhReceiptHeader(TeaModel):
    def __init__(
        self,
        register_wh_receipt_id: str = None,
        status: str = None,
        in_storing_status: str = None,
        update_time: int = None,
    ):
        # 注册申请单ID
        self.register_wh_receipt_id = register_wh_receipt_id
        # 注册仓单状态【 NONE：无效状态，WAITING：待审核，AGREED：审核同意，REJECTED：审核拒绝，CANCELED：已取消，WAITING_PRE_ALLOC_POSITION：待预分配仓位，WAITING_TRANSACTION_IN：待入库，TRANSACTION_IN：入库中，FINISHED_TRANSACTION_IN：已入库/待确认，CONFIRMED_TRANSACTION_IN：完成入库，INTERRUPTION：已中断，ALL：所有状态】
        self.status = status
        # 入库中时的子状态，只有入库中才有值【ALLOCATED_LOCATION：已调用分配仓位信息接口，TRANSACTION_IN_INFO：已调用添加入库信息接口，LOCATION_INFO：已调用补充仓位占用信息接口】
        self.in_storing_status = in_storing_status
        # 更新时间
        self.update_time = update_time

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.register_wh_receipt_id is not None:
            result['register_wh_receipt_id'] = self.register_wh_receipt_id
        if self.status is not None:
            result['status'] = self.status
        if self.in_storing_status is not None:
            result['in_storing_status'] = self.in_storing_status
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('register_wh_receipt_id') is not None:
            self.register_wh_receipt_id = m.get('register_wh_receipt_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('in_storing_status') is not None:
            self.in_storing_status = m.get('in_storing_status')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class FlowHistory(TeaModel):
    def __init__(
        self,
        flow_node_list: List[FlowNode] = None,
    ):
        # 操作信息
        self.flow_node_list = flow_node_list

    def validate(self):
        if self.flow_node_list:
            for k in self.flow_node_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        result['flow_node_list'] = []
        if self.flow_node_list is not None:
            for k in self.flow_node_list:
                result['flow_node_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.flow_node_list = []
        if m.get('flow_node_list') is not None:
            for k in m.get('flow_node_list'):
                temp_model = FlowNode()
                self.flow_node_list.append(temp_model.from_map(k))
        return self


class CreateUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_name: str = None,
        phone: str = None,
        email: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户名
        self.user_name = user_name
        # 11位的合法手机号
        self.phone = phone
        # 邮箱号
        self.email = email

    def validate(self):
        self.validate_required(self.user_name, 'user_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.phone is not None:
            result['phone'] = self.phone
        if self.email is not None:
            result['email'] = self.email
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('email') is not None:
            self.email = m.get('email')
        return self


class CreateUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        date: int = None,
        request_id: str = None,
        user_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求时间
        self.date = date
        # 请求id
        self.request_id = request_id
        # 用户id
        self.user_id = user_id

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
        if self.date is not None:
            result['date'] = self.date
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class CreateTransferRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_id: str = None,
        transferee: str = None,
        monetary_amount: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资产id
        self.asset_id = asset_id
        # 被转让的对象
        self.transferee = transferee
        # 转让金额
        self.monetary_amount = monetary_amount
        # 用户的标识
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.transferee, 'transferee')
        self.validate_required(self.monetary_amount, 'monetary_amount')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.transferee is not None:
            result['transferee'] = self.transferee
        if self.monetary_amount is not None:
            result['monetary_amount'] = self.monetary_amount
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('transferee') is not None:
            self.transferee = m.get('transferee')
        if m.get('monetary_amount') is not None:
            self.monetary_amount = m.get('monetary_amount')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class CreateTransferResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        request_id: str = None,
        date: int = None,
        blockchain_info: BlockchainInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求id
        self.request_id = request_id
        # long类型时间戳
        self.date = date
        # 实体类中包含两个变量
        self.blockchain_info = blockchain_info

    def validate(self):
        if self.blockchain_info:
            self.blockchain_info.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.date is not None:
            result['date'] = self.date
        if self.blockchain_info is not None:
            result['blockchain_info'] = self.blockchain_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('blockchain_info') is not None:
            temp_model = BlockchainInfo()
            self.blockchain_info = temp_model.from_map(m['blockchain_info'])
        return self


class CreatePickupRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_id: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资产id
        self.asset_id = asset_id
        # 用户标识
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class CreatePickupResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pickup_id: str = None,
        info: BlockchainInfo = None,
        request_id: str = None,
        date: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 提取码
        self.pickup_id = pickup_id
        # 区块链信息
        self.info = info
        # 请求标识
        self.request_id = request_id
        # 时间
        self.date = date

    def validate(self):
        if self.info:
            self.info.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.pickup_id is not None:
            result['pickup_id'] = self.pickup_id
        if self.info is not None:
            result['info'] = self.info.to_map()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.date is not None:
            result['date'] = self.date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pickup_id') is not None:
            self.pickup_id = m.get('pickup_id')
        if m.get('info') is not None:
            temp_model = BlockchainInfo()
            self.info = temp_model.from_map(m['info'])
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('date') is not None:
            self.date = m.get('date')
        return self


class CancelPickupRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        pickup_id: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 提取码
        self.pickup_id = pickup_id
        # 用户标识
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.pickup_id, 'pickup_id')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.pickup_id is not None:
            result['pickup_id'] = self.pickup_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('pickup_id') is not None:
            self.pickup_id = m.get('pickup_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class CancelPickupResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pickup_id: str = None,
        info: BlockchainInfo = None,
        request_id: str = None,
        date: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 提取码
        self.pickup_id = pickup_id
        # 区块链信息
        self.info = info
        # 请求标识
        self.request_id = request_id
        # 时间
        self.date = date

    def validate(self):
        if self.info:
            self.info.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.pickup_id is not None:
            result['pickup_id'] = self.pickup_id
        if self.info is not None:
            result['info'] = self.info.to_map()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.date is not None:
            result['date'] = self.date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pickup_id') is not None:
            self.pickup_id = m.get('pickup_id')
        if m.get('info') is not None:
            temp_model = BlockchainInfo()
            self.info = temp_model.from_map(m['info'])
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('date') is not None:
            self.date = m.get('date')
        return self


class DisablePickupRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_id: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资产id
        self.asset_id = asset_id
        # 用户标识
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class DisablePickupResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        info: BlockchainInfo = None,
        pickup_id: str = None,
        request_id: str = None,
        date: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 区块链信息
        self.info = info
        # 提取码
        self.pickup_id = pickup_id
        # 请求标识
        self.request_id = request_id
        # 时间
        self.date = date

    def validate(self):
        if self.info:
            self.info.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.info is not None:
            result['info'] = self.info.to_map()
        if self.pickup_id is not None:
            result['pickup_id'] = self.pickup_id
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.date is not None:
            result['date'] = self.date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('info') is not None:
            temp_model = BlockchainInfo()
            self.info = temp_model.from_map(m['info'])
        if m.get('pickup_id') is not None:
            self.pickup_id = m.get('pickup_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('date') is not None:
            self.date = m.get('date')
        return self


class CreateLeagueRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        blockchain_d: str = None,
        comment: str = None,
        league_name: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 区块链标识
        self.blockchain_d = blockchain_d
        # 评论
        self.comment = comment
        # 联盟名称
        self.league_name = league_name
        # 用户标识
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.blockchain_d, 'blockchain_d')
        self.validate_required(self.league_name, 'league_name')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.blockchain_d is not None:
            result['blockchain_d'] = self.blockchain_d
        if self.comment is not None:
            result['comment'] = self.comment
        if self.league_name is not None:
            result['league_name'] = self.league_name
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('blockchain_d') is not None:
            self.blockchain_d = m.get('blockchain_d')
        if m.get('comment') is not None:
            self.comment = m.get('comment')
        if m.get('league_name') is not None:
            self.league_name = m.get('league_name')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class CreateLeagueResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        date: int = None,
        league_id: str = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 时间
        self.date = date
        # 联盟id
        self.league_id = league_id
        # 请求标识
        self.request_id = request_id

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
        if self.date is not None:
            result['date'] = self.date
        if self.league_id is not None:
            result['league_id'] = self.league_id
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('league_id') is not None:
            self.league_id = m.get('league_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class AddLeagueRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        league_id: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟id
        self.league_id = league_id
        # 用户标识
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.league_id, 'league_id')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.league_id is not None:
            result['league_id'] = self.league_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('league_id') is not None:
            self.league_id = m.get('league_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class AddLeagueResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        date: int = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 时间
        self.date = date
        # 请求标识
        self.request_id = request_id

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
        if self.date is not None:
            result['date'] = self.date
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class ConfirmLeagueRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        league_id: str = None,
        user_id: str = None,
        join_user_id: str = None,
        pass_: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟id
        self.league_id = league_id
        # 用户标识
        self.user_id = user_id
        # 加入用户的标识
        self.join_user_id = join_user_id
        # 审核结果
        self.pass_ = pass_

    def validate(self):
        self.validate_required(self.league_id, 'league_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.join_user_id, 'join_user_id')
        self.validate_required(self.pass_, 'pass_')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.league_id is not None:
            result['league_id'] = self.league_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.join_user_id is not None:
            result['join_user_id'] = self.join_user_id
        if self.pass_ is not None:
            result['pass'] = self.pass_
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('league_id') is not None:
            self.league_id = m.get('league_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('join_user_id') is not None:
            self.join_user_id = m.get('join_user_id')
        if m.get('pass') is not None:
            self.pass_ = m.get('pass')
        return self


class ConfirmLeagueResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        date: int = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 时间
        self.date = date
        # 请求标识
        self.request_id = request_id

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
        if self.date is not None:
            result['date'] = self.date
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class QueryLeagueRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        league_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户标识
        self.user_id = user_id
        # 联盟id
        self.league_id = league_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.league_id, 'league_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.league_id is not None:
            result['league_id'] = self.league_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('league_id') is not None:
            self.league_id = m.get('league_id')
        return self


class QueryLeagueResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        league: LeagueInfo = None,
        date: int = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 联盟信息
        self.league = league
        # 时间
        self.date = date
        # 请求标识
        self.request_id = request_id

    def validate(self):
        if self.league:
            self.league.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.league is not None:
            result['league'] = self.league.to_map()
        if self.date is not None:
            result['date'] = self.date
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('league') is not None:
            temp_model = LeagueInfo()
            self.league = temp_model.from_map(m['league'])
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class CreateImportassetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        template_id: str = None,
        content: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 字典id
        self.template_id = template_id
        # 数据字典内容
        self.content = content
        # 用户标识
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.template_id, 'template_id')
        self.validate_required(self.content, 'content')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.content is not None:
            result['content'] = self.content
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class CreateImportassetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        asset_id: str = None,
        info: BlockchainInfo = None,
        date: int = None,
        request_id: str = None,
        qr_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 资产id
        self.asset_id = asset_id
        # 区块链信息
        self.info = info
        # 时间
        self.date = date
        # 请求标识
        self.request_id = request_id
        # 短码
        self.qr_code = qr_code

    def validate(self):
        if self.info:
            self.info.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.info is not None:
            result['info'] = self.info.to_map()
        if self.date is not None:
            result['date'] = self.date
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.qr_code is not None:
            result['qr_code'] = self.qr_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('info') is not None:
            temp_model = BlockchainInfo()
            self.info = temp_model.from_map(m['info'])
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('qr_code') is not None:
            self.qr_code = m.get('qr_code')
        return self


class UpdateImportassetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_id: str = None,
        content: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 物权id
        self.asset_id = asset_id
        # 数据字典内容
        self.content = content
        # 用户标识
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.content, 'content')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.content is not None:
            result['content'] = self.content
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class UpdateImportassetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        blockchain_info: BlockchainInfo = None,
        date: int = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 区块链信息
        self.blockchain_info = blockchain_info
        # 请求时间
        self.date = date
        # 请求标识
        self.request_id = request_id

    def validate(self):
        if self.blockchain_info:
            self.blockchain_info.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.blockchain_info is not None:
            result['blockchain_info'] = self.blockchain_info.to_map()
        if self.date is not None:
            result['date'] = self.date
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('blockchain_info') is not None:
            temp_model = BlockchainInfo()
            self.blockchain_info = temp_model.from_map(m['blockchain_info'])
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class CancelImportassetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_id: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 物权id
        self.asset_id = asset_id
        # 用户id
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class CancelImportassetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        blockchain_info: BlockchainInfo = None,
        date: int = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 区块链信息
        self.blockchain_info = blockchain_info
        # 时间
        self.date = date
        # 请求标识
        self.request_id = request_id

    def validate(self):
        if self.blockchain_info:
            self.blockchain_info.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.blockchain_info is not None:
            result['blockchain_info'] = self.blockchain_info.to_map()
        if self.date is not None:
            result['date'] = self.date
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('blockchain_info') is not None:
            temp_model = BlockchainInfo()
            self.blockchain_info = temp_model.from_map(m['blockchain_info'])
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class FreezeImportassetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_id: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 物权id
        self.asset_id = asset_id
        # 用户id
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class FreezeImportassetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        blockchain_info: BlockchainInfo = None,
        date: int = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 区块链信息
        self.blockchain_info = blockchain_info
        # 时间
        self.date = date
        # 请求标识
        self.request_id = request_id

    def validate(self):
        if self.blockchain_info:
            self.blockchain_info.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.blockchain_info is not None:
            result['blockchain_info'] = self.blockchain_info.to_map()
        if self.date is not None:
            result['date'] = self.date
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('blockchain_info') is not None:
            temp_model = BlockchainInfo()
            self.blockchain_info = temp_model.from_map(m['blockchain_info'])
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class UnfreezeImportassetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_id: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 物权id
        self.asset_id = asset_id
        # 用户id
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class UnfreezeImportassetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        blockchain_info: BlockchainInfo = None,
        date: int = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 区块链信息
        self.blockchain_info = blockchain_info
        # 时间
        self.date = date
        # 请求标识
        self.request_id = request_id

    def validate(self):
        if self.blockchain_info:
            self.blockchain_info.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.blockchain_info is not None:
            result['blockchain_info'] = self.blockchain_info.to_map()
        if self.date is not None:
            result['date'] = self.date
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('blockchain_info') is not None:
            temp_model = BlockchainInfo()
            self.blockchain_info = temp_model.from_map(m['blockchain_info'])
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class QueryImportassetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_id: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 物权id
        self.asset_id = asset_id
        # 用户id
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.asset_id, 'asset_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class QueryImportassetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        asset: AssetInfo = None,
        date: int = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 物权信息
        self.asset = asset
        # 时间
        self.date = date
        # 请求id
        self.request_id = request_id

    def validate(self):
        if self.asset:
            self.asset.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.asset is not None:
            result['asset'] = self.asset.to_map()
        if self.date is not None:
            result['date'] = self.date
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('asset') is not None:
            temp_model = AssetInfo()
            self.asset = temp_model.from_map(m['asset'])
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class AllImportassetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        current_page: int = None,
        page_size: int = None,
        user_id: str = None,
        phone: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当前页
        self.current_page = current_page
        # 页面容量
        self.page_size = page_size
        # 用户标识
        self.user_id = user_id
        # 小程序是加密后的字符串
        self.phone = phone

    def validate(self):
        self.validate_required(self.current_page, 'current_page')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.phone, 'phone')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.phone is not None:
            result['phone'] = self.phone
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        return self


class AllImportassetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        assets: List[AssetInfo] = None,
        current_page: int = None,
        date: int = None,
        request_id: str = None,
        total_count: int = None,
        total_page: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 物权信息
        self.assets = assets
        # 当前页码
        self.current_page = current_page
        # 时间
        self.date = date
        # 请求id
        self.request_id = request_id
        # 总数
        self.total_count = total_count
        # 总页数
        self.total_page = total_page

    def validate(self):
        if self.assets:
            for k in self.assets:
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
        result['assets'] = []
        if self.assets is not None:
            for k in self.assets:
                result['assets'].append(k.to_map() if k else None)
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.date is not None:
            result['date'] = self.date
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.total_page is not None:
            result['total_page'] = self.total_page
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.assets = []
        if m.get('assets') is not None:
            for k in m.get('assets'):
                temp_model = AssetInfo()
                self.assets.append(temp_model.from_map(k))
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        return self


class BatchqueryImportassetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        current_page: int = None,
        page_size: int = None,
        type: str = None,
        user_id: str = None,
        asset_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当前页
        self.current_page = current_page
        # 页面大小
        self.page_size = page_size
        # string (enum: PICK_UP, WEAK_ASSET, WEAK_ASSET_TRANSFER, WAREHOUSE_RECEIPT_TRANSFER, WAREHOUSE_RECEIPT_REGISTER, PLEDGE_APPLICATION, PLEDGE_RELEASE, WAREHOUSE_RECEIPT_CANCEL, WAREHOUSE_RECEIPT_UPDATE)
        self.type = type
        # 用户id
        self.user_id = user_id
        # 资产id
        self.asset_id = asset_id

    def validate(self):
        self.validate_required(self.current_page, 'current_page')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.type, 'type')
        self.validate_required(self.asset_id, 'asset_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.type is not None:
            result['type'] = self.type
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        return self


class BatchqueryImportassetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current_page: int = None,
        date: int = None,
        request_id: str = None,
        total_count: int = None,
        total_page: int = None,
        trace_info_list: List[WarehouseReceiptTraceInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前页码
        self.current_page = current_page
        # 时间
        self.date = date
        # 请求标识
        self.request_id = request_id
        # 总条目
        self.total_count = total_count
        # 总页数
        self.total_page = total_page
        # 溯源信息
        self.trace_info_list = trace_info_list

    def validate(self):
        if self.trace_info_list:
            for k in self.trace_info_list:
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
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.date is not None:
            result['date'] = self.date
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.total_page is not None:
            result['total_page'] = self.total_page
        result['trace_info_list'] = []
        if self.trace_info_list is not None:
            for k in self.trace_info_list:
                result['trace_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        self.trace_info_list = []
        if m.get('trace_info_list') is not None:
            for k in m.get('trace_info_list'):
                temp_model = WarehouseReceiptTraceInfo()
                self.trace_info_list.append(temp_model.from_map(k))
        return self


class CreateTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        template: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 名称
        self.name = name
        # 数据字典
        self.template = template
        # 用户id
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.name is not None:
            result['name'] = self.name
        if self.template is not None:
            result['template'] = self.template
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('template') is not None:
            self.template = m.get('template')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class CreateTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        date: int = None,
        request_id: str = None,
        template_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 时间
        self.date = date
        # 请求标识
        self.request_id = request_id
        # 数据字典id
        self.template_id = template_id

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
        if self.date is not None:
            result['date'] = self.date
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.template_id is not None:
            result['template_id'] = self.template_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        return self


class UpdateTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        template_id: str = None,
        template: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据字典id
        self.template_id = template_id
        # 数据字典内容
        self.template = template
        # 用户id
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.template_id, 'template_id')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.template is not None:
            result['template'] = self.template
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('template') is not None:
            self.template = m.get('template')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class UpdateTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        date: int = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 时间
        self.date = date
        # 请求id
        self.request_id = request_id

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
        if self.date is not None:
            result['date'] = self.date
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class QueryTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        template_id: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据字典id
        self.template_id = template_id
        # 用户id
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.template_id, 'template_id')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class QueryTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        date: int = None,
        request_id: str = None,
        template_info: TemplateInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 时间
        self.date = date
        # 请求id
        self.request_id = request_id
        # 数据字典信息
        self.template_info = template_info

    def validate(self):
        if self.template_info:
            self.template_info.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.date is not None:
            result['date'] = self.date
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.template_info is not None:
            result['template_info'] = self.template_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('template_info') is not None:
            temp_model = TemplateInfo()
            self.template_info = temp_model.from_map(m['template_info'])
        return self


class AllTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        current_page: int = None,
        page_size: int = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当前页
        self.current_page = current_page
        # 一页的大小
        self.page_size = page_size
        # 用户id
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.current_page, 'current_page')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class AllTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        date: int = None,
        request_id: str = None,
        template_info_list: List[TemplateInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 时间
        self.date = date
        # 请求id
        self.request_id = request_id
        # 数据字典信息
        self.template_info_list = template_info_list

    def validate(self):
        if self.template_info_list:
            for k in self.template_info_list:
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
        if self.date is not None:
            result['date'] = self.date
        if self.request_id is not None:
            result['request_id'] = self.request_id
        result['template_info_list'] = []
        if self.template_info_list is not None:
            for k in self.template_info_list:
                result['template_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        self.template_info_list = []
        if m.get('template_info_list') is not None:
            for k in m.get('template_info_list'):
                temp_model = TemplateInfo()
                self.template_info_list.append(temp_model.from_map(k))
        return self


class CreateCheckcodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_id: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 物权码
        self.asset_id = asset_id
        # 创建验权码的用户
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class CreateCheckcodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        check_code: str = None,
        request_id: str = None,
        date: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 验权码
        self.check_code = check_code
        # 请求标识
        self.request_id = request_id
        # 时间戳
        self.date = date

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
        if self.check_code is not None:
            result['check_code'] = self.check_code
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.date is not None:
            result['date'] = self.date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('check_code') is not None:
            self.check_code = m.get('check_code')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('date') is not None:
            self.date = m.get('date')
        return self


class CheckCheckcodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_id: str = None,
        check_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 物权码
        self.asset_id = asset_id
        # 验权码
        self.check_code = check_code

    def validate(self):
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.check_code, 'check_code')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.check_code is not None:
            result['check_code'] = self.check_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('check_code') is not None:
            self.check_code = m.get('check_code')
        return self


class CheckCheckcodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        audit: bool = None,
        request_id: str = None,
        date: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 校验通过与否
        self.audit = audit
        # 请求标识
        self.request_id = request_id
        # 时间戳
        self.date = date

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
        if self.audit is not None:
            result['audit'] = self.audit
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.date is not None:
            result['date'] = self.date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('audit') is not None:
            self.audit = m.get('audit')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('date') is not None:
            self.date = m.get('date')
        return self


class CreateAssetpledgeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_id: str = None,
        lender_id: str = None,
        user_id: str = None,
        financial_protocol_id: str = None,
        value: int = None,
        duration: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 物权id
        self.asset_id = asset_id
        # 资金方的id
        self.lender_id = lender_id
        # 申请方的id
        self.user_id = user_id
        # 融资协议
        self.financial_protocol_id = financial_protocol_id
        # 质押金额
        self.value = value
        # 质押时长
        self.duration = duration

    def validate(self):
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.lender_id, 'lender_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.value, 'value')
        self.validate_required(self.duration, 'duration')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.lender_id is not None:
            result['lender_id'] = self.lender_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.financial_protocol_id is not None:
            result['financial_protocol_id'] = self.financial_protocol_id
        if self.value is not None:
            result['value'] = self.value
        if self.duration is not None:
            result['duration'] = self.duration
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('lender_id') is not None:
            self.lender_id = m.get('lender_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('financial_protocol_id') is not None:
            self.financial_protocol_id = m.get('financial_protocol_id')
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('duration') is not None:
            self.duration = m.get('duration')
        return self


class CreateAssetpledgeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pledge_id: str = None,
        info: BlockchainInfo = None,
        date: int = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 质押申请id
        self.pledge_id = pledge_id
        # 区块链信息
        self.info = info
        # 时间戳
        self.date = date
        # 请求标识
        self.request_id = request_id

    def validate(self):
        if self.info:
            self.info.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.pledge_id is not None:
            result['pledge_id'] = self.pledge_id
        if self.info is not None:
            result['info'] = self.info.to_map()
        if self.date is not None:
            result['date'] = self.date
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pledge_id') is not None:
            self.pledge_id = m.get('pledge_id')
        if m.get('info') is not None:
            temp_model = BlockchainInfo()
            self.info = temp_model.from_map(m['info'])
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class ReleaseAssetpledgeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        pledge_id: str = None,
        lend_date: int = None,
        value: int = None,
        borrower_name: str = None,
        borrower_account: str = None,
        borrower_bank_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资金方的id
        self.user_id = user_id
        # 质押Id
        self.pledge_id = pledge_id
        # 放款时间
        self.lend_date = lend_date
        # 放款金额
        self.value = value
        # 收款方名称
        self.borrower_name = borrower_name
        # 收款方账号
        self.borrower_account = borrower_account
        # 收款方银行
        self.borrower_bank_info = borrower_bank_info

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.pledge_id, 'pledge_id')
        self.validate_required(self.lend_date, 'lend_date')
        self.validate_required(self.value, 'value')
        self.validate_required(self.borrower_name, 'borrower_name')
        self.validate_required(self.borrower_account, 'borrower_account')
        self.validate_required(self.borrower_bank_info, 'borrower_bank_info')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.pledge_id is not None:
            result['pledge_id'] = self.pledge_id
        if self.lend_date is not None:
            result['lend_date'] = self.lend_date
        if self.value is not None:
            result['value'] = self.value
        if self.borrower_name is not None:
            result['borrower_name'] = self.borrower_name
        if self.borrower_account is not None:
            result['borrower_account'] = self.borrower_account
        if self.borrower_bank_info is not None:
            result['borrower_bank_info'] = self.borrower_bank_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('pledge_id') is not None:
            self.pledge_id = m.get('pledge_id')
        if m.get('lend_date') is not None:
            self.lend_date = m.get('lend_date')
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('borrower_name') is not None:
            self.borrower_name = m.get('borrower_name')
        if m.get('borrower_account') is not None:
            self.borrower_account = m.get('borrower_account')
        if m.get('borrower_bank_info') is not None:
            self.borrower_bank_info = m.get('borrower_bank_info')
        return self


class ReleaseAssetpledgeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        info: BlockchainInfo = None,
        date: int = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 链信息
        self.info = info
        # 时间戳
        self.date = date
        # 请求标识
        self.request_id = request_id

    def validate(self):
        if self.info:
            self.info.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.info is not None:
            result['info'] = self.info.to_map()
        if self.date is not None:
            result['date'] = self.date
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('info') is not None:
            temp_model = BlockchainInfo()
            self.info = temp_model.from_map(m['info'])
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class RepayAssetpledgeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        pledge_id: str = None,
        recipient_bank: str = None,
        recipient_account: str = None,
        value: int = None,
        repay_date: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 申请方
        self.user_id = user_id
        # 质押id
        self.pledge_id = pledge_id
        # 收款方银行
        self.recipient_bank = recipient_bank
        # 收款方账号
        self.recipient_account = recipient_account
        # 金额
        self.value = value
        # 还款时间
        self.repay_date = repay_date

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.pledge_id, 'pledge_id')
        self.validate_required(self.recipient_bank, 'recipient_bank')
        self.validate_required(self.recipient_account, 'recipient_account')
        self.validate_required(self.value, 'value')
        self.validate_required(self.repay_date, 'repay_date')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.pledge_id is not None:
            result['pledge_id'] = self.pledge_id
        if self.recipient_bank is not None:
            result['recipient_bank'] = self.recipient_bank
        if self.recipient_account is not None:
            result['recipient_account'] = self.recipient_account
        if self.value is not None:
            result['value'] = self.value
        if self.repay_date is not None:
            result['repay_date'] = self.repay_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('pledge_id') is not None:
            self.pledge_id = m.get('pledge_id')
        if m.get('recipient_bank') is not None:
            self.recipient_bank = m.get('recipient_bank')
        if m.get('recipient_account') is not None:
            self.recipient_account = m.get('recipient_account')
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('repay_date') is not None:
            self.repay_date = m.get('repay_date')
        return self


class RepayAssetpledgeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        repay_id: str = None,
        info: BlockchainInfo = None,
        request_id: str = None,
        date: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 还款id
        self.repay_id = repay_id
        # 链信息
        self.info = info
        # 请求标识
        self.request_id = request_id
        # 时间戳
        self.date = date

    def validate(self):
        if self.info:
            self.info.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.repay_id is not None:
            result['repay_id'] = self.repay_id
        if self.info is not None:
            result['info'] = self.info.to_map()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.date is not None:
            result['date'] = self.date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('repay_id') is not None:
            self.repay_id = m.get('repay_id')
        if m.get('info') is not None:
            temp_model = BlockchainInfo()
            self.info = temp_model.from_map(m['info'])
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('date') is not None:
            self.date = m.get('date')
        return self


class GetLeagueAccountinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
    ):
        # OAuth模式下的授权token
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


class GetLeagueAccountinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        role: AssetChainUser = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户信息
        self.role = role

    def validate(self):
        if self.role:
            self.role.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.role is not None:
            result['role'] = self.role.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('role') is not None:
            temp_model = AssetChainUser()
            self.role = temp_model.from_map(m['role'])
        return self


class CreateWarehouseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        address: str = None,
        blueprint_id: str = None,
        country: str = None,
        extra_info: str = None,
        latitude: str = None,
        longitude: str = None,
        warehouse_area: str = None,
        warehouse_height: str = None,
        warehouse_id: str = None,
        warehouse_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 地址
        self.address = address
        # 平面图
        self.blueprint_id = blueprint_id
        # 所在国家
        self.country = country
        # 其他信息
        self.extra_info = extra_info
        # 纬度
        self.latitude = latitude
        # 经度
        self.longitude = longitude
        # 仓库面积
        self.warehouse_area = warehouse_area
        # 仓库高度
        self.warehouse_height = warehouse_height
        # 仓库id
        self.warehouse_id = warehouse_id
        # 仓库名称
        self.warehouse_name = warehouse_name

    def validate(self):
        self.validate_required(self.address, 'address')
        self.validate_required(self.country, 'country')
        self.validate_required(self.latitude, 'latitude')
        self.validate_required(self.longitude, 'longitude')
        self.validate_required(self.warehouse_area, 'warehouse_area')
        self.validate_required(self.warehouse_id, 'warehouse_id')
        if self.warehouse_id is not None:
            self.validate_max_length(self.warehouse_id, 'warehouse_id', 255)
        self.validate_required(self.warehouse_name, 'warehouse_name')
        if self.warehouse_name is not None:
            self.validate_max_length(self.warehouse_name, 'warehouse_name', 255)

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.address is not None:
            result['address'] = self.address
        if self.blueprint_id is not None:
            result['blueprint_id'] = self.blueprint_id
        if self.country is not None:
            result['country'] = self.country
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        if self.latitude is not None:
            result['latitude'] = self.latitude
        if self.longitude is not None:
            result['longitude'] = self.longitude
        if self.warehouse_area is not None:
            result['warehouse_area'] = self.warehouse_area
        if self.warehouse_height is not None:
            result['warehouse_height'] = self.warehouse_height
        if self.warehouse_id is not None:
            result['warehouse_id'] = self.warehouse_id
        if self.warehouse_name is not None:
            result['warehouse_name'] = self.warehouse_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('blueprint_id') is not None:
            self.blueprint_id = m.get('blueprint_id')
        if m.get('country') is not None:
            self.country = m.get('country')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        if m.get('latitude') is not None:
            self.latitude = m.get('latitude')
        if m.get('longitude') is not None:
            self.longitude = m.get('longitude')
        if m.get('warehouse_area') is not None:
            self.warehouse_area = m.get('warehouse_area')
        if m.get('warehouse_height') is not None:
            self.warehouse_height = m.get('warehouse_height')
        if m.get('warehouse_id') is not None:
            self.warehouse_id = m.get('warehouse_id')
        if m.get('warehouse_name') is not None:
            self.warehouse_name = m.get('warehouse_name')
        return self


class CreateWarehouseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        warehouse_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 仓库id
        self.warehouse_id = warehouse_id

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
        if self.warehouse_id is not None:
            result['warehouse_id'] = self.warehouse_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('warehouse_id') is not None:
            self.warehouse_id = m.get('warehouse_id')
        return self


class ListLeagueRoleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        role_types: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 角色类型集合【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
        self.role_types = role_types

    def validate(self):
        self.validate_required(self.role_types, 'role_types')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.role_types is not None:
            result['role_types'] = self.role_types
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('role_types') is not None:
            self.role_types = m.get('role_types')
        return self


class ListLeagueRoleResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        role_list: List[Role] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 角色列表
        self.role_list = role_list

    def validate(self):
        if self.role_list:
            for k in self.role_list:
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
        result['role_list'] = []
        if self.role_list is not None:
            for k in self.role_list:
                result['role_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.role_list = []
        if m.get('role_list') is not None:
            for k in m.get('role_list'):
                temp_model = Role()
                self.role_list.append(temp_model.from_map(k))
        return self


class GetWarehouseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        warehouse_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 仓库id
        self.warehouse_id = warehouse_id

    def validate(self):
        self.validate_required(self.warehouse_id, 'warehouse_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.warehouse_id is not None:
            result['warehouse_id'] = self.warehouse_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('warehouse_id') is not None:
            self.warehouse_id = m.get('warehouse_id')
        return self


class GetWarehouseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        address: str = None,
        blueprint_url: str = None,
        country: str = None,
        device_num: int = None,
        extra_info: str = None,
        latitude: str = None,
        longitude: str = None,
        smart_level: str = None,
        stock_position_num: int = None,
        version: str = None,
        warehouse_area: str = None,
        warehouse_height: str = None,
        warehouse_id: str = None,
        warehouse_name: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 地址
        self.address = address
        # 平面图
        self.blueprint_url = blueprint_url
        # 所在国家
        self.country = country
        # 设备数量
        self.device_num = device_num
        # 其他信息
        self.extra_info = extra_info
        # 纬度
        self.latitude = latitude
        # 经度
        self.longitude = longitude
        # 智能版本
        self.smart_level = smart_level
        # 仓位数量
        self.stock_position_num = stock_position_num
        # version
        self.version = version
        # 仓库面积
        self.warehouse_area = warehouse_area
        # 仓库高度
        self.warehouse_height = warehouse_height
        # 仓库id
        self.warehouse_id = warehouse_id
        # 仓库名称
        self.warehouse_name = warehouse_name

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
        if self.address is not None:
            result['address'] = self.address
        if self.blueprint_url is not None:
            result['blueprint_url'] = self.blueprint_url
        if self.country is not None:
            result['country'] = self.country
        if self.device_num is not None:
            result['device_num'] = self.device_num
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        if self.latitude is not None:
            result['latitude'] = self.latitude
        if self.longitude is not None:
            result['longitude'] = self.longitude
        if self.smart_level is not None:
            result['smart_level'] = self.smart_level
        if self.stock_position_num is not None:
            result['stock_position_num'] = self.stock_position_num
        if self.version is not None:
            result['version'] = self.version
        if self.warehouse_area is not None:
            result['warehouse_area'] = self.warehouse_area
        if self.warehouse_height is not None:
            result['warehouse_height'] = self.warehouse_height
        if self.warehouse_id is not None:
            result['warehouse_id'] = self.warehouse_id
        if self.warehouse_name is not None:
            result['warehouse_name'] = self.warehouse_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('blueprint_url') is not None:
            self.blueprint_url = m.get('blueprint_url')
        if m.get('country') is not None:
            self.country = m.get('country')
        if m.get('device_num') is not None:
            self.device_num = m.get('device_num')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        if m.get('latitude') is not None:
            self.latitude = m.get('latitude')
        if m.get('longitude') is not None:
            self.longitude = m.get('longitude')
        if m.get('smart_level') is not None:
            self.smart_level = m.get('smart_level')
        if m.get('stock_position_num') is not None:
            self.stock_position_num = m.get('stock_position_num')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('warehouse_area') is not None:
            self.warehouse_area = m.get('warehouse_area')
        if m.get('warehouse_height') is not None:
            self.warehouse_height = m.get('warehouse_height')
        if m.get('warehouse_id') is not None:
            self.warehouse_id = m.get('warehouse_id')
        if m.get('warehouse_name') is not None:
            self.warehouse_name = m.get('warehouse_name')
        return self


class UpdateWarehouseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        address: str = None,
        blueprint_id: str = None,
        country: str = None,
        extra_info: str = None,
        warehouse_area: str = None,
        warehouse_id: str = None,
        warehouse_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 地址（传原值，不可修改此项）
        self.address = address
        # 平面图
        self.blueprint_id = blueprint_id
        # 所在国家（传原值，不可修改此项）
        self.country = country
        # 其他信息
        self.extra_info = extra_info
        # 仓库面积
        self.warehouse_area = warehouse_area
        # 仓库id
        self.warehouse_id = warehouse_id
        # 仓库名称（传原值，不可修改此项）
        self.warehouse_name = warehouse_name

    def validate(self):
        self.validate_required(self.address, 'address')
        self.validate_required(self.country, 'country')
        self.validate_required(self.warehouse_area, 'warehouse_area')
        self.validate_required(self.warehouse_id, 'warehouse_id')
        self.validate_required(self.warehouse_name, 'warehouse_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.address is not None:
            result['address'] = self.address
        if self.blueprint_id is not None:
            result['blueprint_id'] = self.blueprint_id
        if self.country is not None:
            result['country'] = self.country
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        if self.warehouse_area is not None:
            result['warehouse_area'] = self.warehouse_area
        if self.warehouse_id is not None:
            result['warehouse_id'] = self.warehouse_id
        if self.warehouse_name is not None:
            result['warehouse_name'] = self.warehouse_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('blueprint_id') is not None:
            self.blueprint_id = m.get('blueprint_id')
        if m.get('country') is not None:
            self.country = m.get('country')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        if m.get('warehouse_area') is not None:
            self.warehouse_area = m.get('warehouse_area')
        if m.get('warehouse_id') is not None:
            self.warehouse_id = m.get('warehouse_id')
        if m.get('warehouse_name') is not None:
            self.warehouse_name = m.get('warehouse_name')
        return self


class UpdateWarehouseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        address: str = None,
        blueprint_id: str = None,
        country: str = None,
        extra_info: str = None,
        location: str = None,
        warehouse_area: str = None,
        warehouse_id: str = None,
        warehouse_name: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 地址
        self.address = address
        # 平面图
        self.blueprint_id = blueprint_id
        # 所在国家
        self.country = country
        # 其他信息
        self.extra_info = extra_info
        # 经纬度
        self.location = location
        # 仓库面积
        self.warehouse_area = warehouse_area
        # 仓库id
        self.warehouse_id = warehouse_id
        # 仓库名称
        self.warehouse_name = warehouse_name

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
        if self.address is not None:
            result['address'] = self.address
        if self.blueprint_id is not None:
            result['blueprint_id'] = self.blueprint_id
        if self.country is not None:
            result['country'] = self.country
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        if self.location is not None:
            result['location'] = self.location
        if self.warehouse_area is not None:
            result['warehouse_area'] = self.warehouse_area
        if self.warehouse_id is not None:
            result['warehouse_id'] = self.warehouse_id
        if self.warehouse_name is not None:
            result['warehouse_name'] = self.warehouse_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('blueprint_id') is not None:
            self.blueprint_id = m.get('blueprint_id')
        if m.get('country') is not None:
            self.country = m.get('country')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        if m.get('location') is not None:
            self.location = m.get('location')
        if m.get('warehouse_area') is not None:
            self.warehouse_area = m.get('warehouse_area')
        if m.get('warehouse_id') is not None:
            self.warehouse_id = m.get('warehouse_id')
        if m.get('warehouse_name') is not None:
            self.warehouse_name = m.get('warehouse_name')
        return self


class ListWarehouseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        current_page: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当前页
        self.current_page = current_page
        # 页面大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.current_page, 'current_page')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListWarehouseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        location_total: int = None,
        total_count: int = None,
        total_page: int = None,
        warehouse_list: List[WarehouseInfo] = None,
        device_total: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 仓位总数
        self.location_total = location_total
        # 总条目
        self.total_count = total_count
        # 总页数
        self.total_page = total_page
        # 仓库信息
        self.warehouse_list = warehouse_list
        # 设备总数
        self.device_total = device_total

    def validate(self):
        if self.warehouse_list:
            for k in self.warehouse_list:
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
        if self.location_total is not None:
            result['location_total'] = self.location_total
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.total_page is not None:
            result['total_page'] = self.total_page
        result['warehouse_list'] = []
        if self.warehouse_list is not None:
            for k in self.warehouse_list:
                result['warehouse_list'].append(k.to_map() if k else None)
        if self.device_total is not None:
            result['device_total'] = self.device_total
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('location_total') is not None:
            self.location_total = m.get('location_total')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        self.warehouse_list = []
        if m.get('warehouse_list') is not None:
            for k in m.get('warehouse_list'):
                temp_model = WarehouseInfo()
                self.warehouse_list.append(temp_model.from_map(k))
        if m.get('device_total') is not None:
            self.device_total = m.get('device_total')
        return self


class ListLeagueRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
    ):
        # OAuth模式下的授权token
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


class ListLeagueResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        league_info_list: List[LeagueInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 联盟详情列表
        self.league_info_list = league_info_list

    def validate(self):
        if self.league_info_list:
            for k in self.league_info_list:
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
        result['league_info_list'] = []
        if self.league_info_list is not None:
            for k in self.league_info_list:
                result['league_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.league_info_list = []
        if m.get('league_info_list') is not None:
            for k in m.get('league_info_list'):
                temp_model = LeagueInfo()
                self.league_info_list.append(temp_model.from_map(k))
        return self


class QueryWarehouseDeviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_filter: str = None,
        storage_location_id: str = None,
        warehouse_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备状态[READY：未启用，STARTED：已启用，LOADING：信息待完善，DELETED：已注销，ALL：全部]
        self.device_filter = device_filter
        # 仓位id
        self.storage_location_id = storage_location_id
        # 仓库id
        self.warehouse_id = warehouse_id

    def validate(self):
        self.validate_required(self.warehouse_id, 'warehouse_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.device_filter is not None:
            result['device_filter'] = self.device_filter
        if self.storage_location_id is not None:
            result['storage_location_id'] = self.storage_location_id
        if self.warehouse_id is not None:
            result['warehouse_id'] = self.warehouse_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_filter') is not None:
            self.device_filter = m.get('device_filter')
        if m.get('storage_location_id') is not None:
            self.storage_location_id = m.get('storage_location_id')
        if m.get('warehouse_id') is not None:
            self.warehouse_id = m.get('warehouse_id')
        return self


class QueryWarehouseDeviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        device_list: List[DeviceInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 设备信息
        self.device_list = device_list

    def validate(self):
        if self.device_list:
            for k in self.device_list:
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
        result['device_list'] = []
        if self.device_list is not None:
            for k in self.device_list:
                result['device_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.device_list = []
        if m.get('device_list') is not None:
            for k in m.get('device_list'):
                temp_model = DeviceInfo()
                self.device_list.append(temp_model.from_map(k))
        return self


class CreateLeagueApplyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        league_desc: str = None,
        league_name: str = None,
        rate: int = None,
        role_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟描述
        self.league_desc = league_desc
        # 联盟名称
        self.league_name = league_name
        # 费率
        self.rate = rate
        # 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
        self.role_type = role_type

    def validate(self):
        self.validate_required(self.league_name, 'league_name')
        self.validate_required(self.role_type, 'role_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.league_desc is not None:
            result['league_desc'] = self.league_desc
        if self.league_name is not None:
            result['league_name'] = self.league_name
        if self.rate is not None:
            result['rate'] = self.rate
        if self.role_type is not None:
            result['role_type'] = self.role_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('league_desc') is not None:
            self.league_desc = m.get('league_desc')
        if m.get('league_name') is not None:
            self.league_name = m.get('league_name')
        if m.get('rate') is not None:
            self.rate = m.get('rate')
        if m.get('role_type') is not None:
            self.role_type = m.get('role_type')
        return self


class CreateLeagueApplyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        apply_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 联盟id
        self.apply_id = apply_id

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
        if self.apply_id is not None:
            result['apply_id'] = self.apply_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('apply_id') is not None:
            self.apply_id = m.get('apply_id')
        return self


class CreateLeagueJoinapplyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        comment: str = None,
        league_id: str = None,
        role_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 备注
        self.comment = comment
        # 联盟Id
        self.league_id = league_id
        # 角色【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
        self.role_type = role_type

    def validate(self):
        self.validate_required(self.league_id, 'league_id')
        self.validate_required(self.role_type, 'role_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.comment is not None:
            result['comment'] = self.comment
        if self.league_id is not None:
            result['league_id'] = self.league_id
        if self.role_type is not None:
            result['role_type'] = self.role_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('comment') is not None:
            self.comment = m.get('comment')
        if m.get('league_id') is not None:
            self.league_id = m.get('league_id')
        if m.get('role_type') is not None:
            self.role_type = m.get('role_type')
        return self


class CreateLeagueJoinapplyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        apply_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 申请id
        self.apply_id = apply_id

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
        if self.apply_id is not None:
            result['apply_id'] = self.apply_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('apply_id') is not None:
            self.apply_id = m.get('apply_id')
        return self


class CancelLeagueApplyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        apply_id: str = None,
        apply_type: str = None,
        comment: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 申请Id
        self.apply_id = apply_id
        # 申请类型【NONE,JOIN,CREATE,ALL】
        self.apply_type = apply_type
        # 备注
        self.comment = comment

    def validate(self):
        self.validate_required(self.apply_id, 'apply_id')
        self.validate_required(self.apply_type, 'apply_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.apply_id is not None:
            result['apply_id'] = self.apply_id
        if self.apply_type is not None:
            result['apply_type'] = self.apply_type
        if self.comment is not None:
            result['comment'] = self.comment
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('apply_id') is not None:
            self.apply_id = m.get('apply_id')
        if m.get('apply_type') is not None:
            self.apply_type = m.get('apply_type')
        if m.get('comment') is not None:
            self.comment = m.get('comment')
        return self


class CancelLeagueApplyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        apply_type: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 申请类型【NONE,JOIN,CREATE,ALL】
        self.apply_type = apply_type

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
        if self.apply_type is not None:
            result['apply_type'] = self.apply_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('apply_type') is not None:
            self.apply_type = m.get('apply_type')
        return self


class QueryWarehouseStoragelocationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        warehouse_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 仓库id
        self.warehouse_id = warehouse_id

    def validate(self):
        self.validate_required(self.warehouse_id, 'warehouse_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.warehouse_id is not None:
            result['warehouse_id'] = self.warehouse_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('warehouse_id') is not None:
            self.warehouse_id = m.get('warehouse_id')
        return self


class QueryWarehouseStoragelocationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        storage_location_list: List[StorageLocation] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 库位信息
        self.storage_location_list = storage_location_list

    def validate(self):
        if self.storage_location_list:
            for k in self.storage_location_list:
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
        result['storage_location_list'] = []
        if self.storage_location_list is not None:
            for k in self.storage_location_list:
                result['storage_location_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.storage_location_list = []
        if m.get('storage_location_list') is not None:
            for k in m.get('storage_location_list'):
                temp_model = StorageLocation()
                self.storage_location_list.append(temp_model.from_map(k))
        return self


class AuthLeagueApplyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        apply_id: str = None,
        apply_type: str = None,
        comment: str = None,
        pass_: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 申请Id
        self.apply_id = apply_id
        # 申请类型【NONE,JOIN,CREATE,ALL】
        self.apply_type = apply_type
        # 备注
        self.comment = comment
        # 审核结果
        self.pass_ = pass_

    def validate(self):
        self.validate_required(self.apply_id, 'apply_id')
        self.validate_required(self.apply_type, 'apply_type')
        self.validate_required(self.pass_, 'pass_')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.apply_id is not None:
            result['apply_id'] = self.apply_id
        if self.apply_type is not None:
            result['apply_type'] = self.apply_type
        if self.comment is not None:
            result['comment'] = self.comment
        if self.pass_ is not None:
            result['pass'] = self.pass_
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('apply_id') is not None:
            self.apply_id = m.get('apply_id')
        if m.get('apply_type') is not None:
            self.apply_type = m.get('apply_type')
        if m.get('comment') is not None:
            self.comment = m.get('comment')
        if m.get('pass') is not None:
            self.pass_ = m.get('pass')
        return self


class AuthLeagueApplyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        apply_type: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 申请类型【NONE,JOIN,CREATE,ALL】
        self.apply_type = apply_type

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
        if self.apply_type is not None:
            result['apply_type'] = self.apply_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('apply_type') is not None:
            self.apply_type = m.get('apply_type')
        return self


class DeleteWarehouseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        warehouse_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 仓库id
        self.warehouse_id = warehouse_id

    def validate(self):
        self.validate_required(self.warehouse_id, 'warehouse_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.warehouse_id is not None:
            result['warehouse_id'] = self.warehouse_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('warehouse_id') is not None:
            self.warehouse_id = m.get('warehouse_id')
        return self


class DeleteWarehouseResponse(TeaModel):
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


class ListLeagueApplyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        apply_type: str = None,
        current_page: int = None,
        page_size: int = None,
        status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 申请类型【NONE,JOIN,CREATE,ALL】
        self.apply_type = apply_type
        # 当前页
        self.current_page = current_page
        # 页大小
        self.page_size = page_size
        # 入盟申请状态【NONE,WAITING,AGREED,REJECTED,CANCELED,ALL】
        self.status = status

    def validate(self):
        self.validate_required(self.apply_type, 'apply_type')
        self.validate_required(self.current_page, 'current_page')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.status, 'status')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.apply_type is not None:
            result['apply_type'] = self.apply_type
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('apply_type') is not None:
            self.apply_type = m.get('apply_type')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class ListLeagueApplyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        apply_type: str = None,
        league_apply_info_list: List[LeagueApplyInfo] = None,
        total_count: int = None,
        total_page: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 申请类型【NONE,JOIN,CREATE,ALL】
        self.apply_type = apply_type
        # 申请内容
        self.league_apply_info_list = league_apply_info_list
        # 总条目
        self.total_count = total_count
        # 总页数
        self.total_page = total_page

    def validate(self):
        if self.league_apply_info_list:
            for k in self.league_apply_info_list:
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
        if self.apply_type is not None:
            result['apply_type'] = self.apply_type
        result['league_apply_info_list'] = []
        if self.league_apply_info_list is not None:
            for k in self.league_apply_info_list:
                result['league_apply_info_list'].append(k.to_map() if k else None)
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.total_page is not None:
            result['total_page'] = self.total_page
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('apply_type') is not None:
            self.apply_type = m.get('apply_type')
        self.league_apply_info_list = []
        if m.get('league_apply_info_list') is not None:
            for k in m.get('league_apply_info_list'):
                temp_model = LeagueApplyInfo()
                self.league_apply_info_list.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        return self


class CreateWarehouseStoraglocationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        disable_surv: bool = None,
        extra_info: str = None,
        name: str = None,
        product_type: str = None,
        status: str = None,
        storage_location_area: str = None,
        storage_location_height: str = None,
        type: str = None,
        virtual_storage_location_id: str = None,
        warehouse_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 是否禁用智能监管
        self.disable_surv = disable_surv
        # 其他信息
        self.extra_info = extra_info
        # 库位名称
        self.name = name
        # 货物类型【DANGER：危险品，NON_DANGER：非危险品，FOOD：食品】
        self.product_type = product_type
        # 状态【AVAILABLE：可用，IN_USE：使用中，IN_CONFIG：配置中，DELETED：已删除】
        self.status = status
        # 仓位面积
        self.storage_location_area = storage_location_area
        # 仓位高度
        self.storage_location_height = storage_location_height
        # 库位类型【CHILL：冷藏，FREEZE：冷冻，PASSAGE：通道，FLAT：平面， STEREO：立体】
        self.type = type
        # 仓位虚拟id
        self.virtual_storage_location_id = virtual_storage_location_id
        # 仓库id
        self.warehouse_id = warehouse_id

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.product_type, 'product_type')
        self.validate_required(self.status, 'status')
        self.validate_required(self.storage_location_area, 'storage_location_area')
        self.validate_required(self.storage_location_height, 'storage_location_height')
        self.validate_required(self.type, 'type')
        self.validate_required(self.virtual_storage_location_id, 'virtual_storage_location_id')
        self.validate_required(self.warehouse_id, 'warehouse_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.disable_surv is not None:
            result['disable_surv'] = self.disable_surv
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        if self.name is not None:
            result['name'] = self.name
        if self.product_type is not None:
            result['product_type'] = self.product_type
        if self.status is not None:
            result['status'] = self.status
        if self.storage_location_area is not None:
            result['storage_location_area'] = self.storage_location_area
        if self.storage_location_height is not None:
            result['storage_location_height'] = self.storage_location_height
        if self.type is not None:
            result['type'] = self.type
        if self.virtual_storage_location_id is not None:
            result['virtual_storage_location_id'] = self.virtual_storage_location_id
        if self.warehouse_id is not None:
            result['warehouse_id'] = self.warehouse_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('disable_surv') is not None:
            self.disable_surv = m.get('disable_surv')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('product_type') is not None:
            self.product_type = m.get('product_type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('storage_location_area') is not None:
            self.storage_location_area = m.get('storage_location_area')
        if m.get('storage_location_height') is not None:
            self.storage_location_height = m.get('storage_location_height')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('virtual_storage_location_id') is not None:
            self.virtual_storage_location_id = m.get('virtual_storage_location_id')
        if m.get('warehouse_id') is not None:
            self.warehouse_id = m.get('warehouse_id')
        return self


class CreateWarehouseStoraglocationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        storage_location_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 库位id
        self.storage_location_id = storage_location_id

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
        if self.storage_location_id is not None:
            result['storage_location_id'] = self.storage_location_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('storage_location_id') is not None:
            self.storage_location_id = m.get('storage_location_id')
        return self


class GetWarehouseStoragelocationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        location_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 库位id
        self.location_id = location_id

    def validate(self):
        self.validate_required(self.location_id, 'location_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.location_id is not None:
            result['location_id'] = self.location_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('location_id') is not None:
            self.location_id = m.get('location_id')
        return self


class GetWarehouseStoragelocationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        storage_location: StorageLocation = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 库位信息
        self.storage_location = storage_location

    def validate(self):
        if self.storage_location:
            self.storage_location.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.storage_location is not None:
            result['storage_location'] = self.storage_location.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('storage_location') is not None:
            temp_model = StorageLocation()
            self.storage_location = temp_model.from_map(m['storage_location'])
        return self


class UpdateWarehouseStoragelocationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        extra_info: str = None,
        id: str = None,
        product_type: str = None,
        status: str = None,
        storage_location_area: str = None,
        storage_location_height: str = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 其他信息
        self.extra_info = extra_info
        # 仓位id
        self.id = id
        # 货物类型【DANGER：危险品，NON_DANGER：非危险品，FOOD：食品】
        self.product_type = product_type
        # 状态【AVAILABLE：可用，IN_USE：使用中，IN_CONFIG：配置中，DELETED：已删除】
        self.status = status
        # 仓位面积
        self.storage_location_area = storage_location_area
        # 仓位高度
        self.storage_location_height = storage_location_height
        # 库位类型【CHILL：冷藏，FREEZE：冷冻，PASSAGE：通道，FLAT：平面， STEREO：立体】
        self.type = type

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.product_type, 'product_type')
        self.validate_required(self.status, 'status')
        self.validate_required(self.storage_location_area, 'storage_location_area')
        self.validate_required(self.storage_location_height, 'storage_location_height')
        self.validate_required(self.type, 'type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        if self.id is not None:
            result['id'] = self.id
        if self.product_type is not None:
            result['product_type'] = self.product_type
        if self.status is not None:
            result['status'] = self.status
        if self.storage_location_area is not None:
            result['storage_location_area'] = self.storage_location_area
        if self.storage_location_height is not None:
            result['storage_location_height'] = self.storage_location_height
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('product_type') is not None:
            self.product_type = m.get('product_type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('storage_location_area') is not None:
            self.storage_location_area = m.get('storage_location_area')
        if m.get('storage_location_height') is not None:
            self.storage_location_height = m.get('storage_location_height')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class UpdateWarehouseStoragelocationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        storage_location: StorageLocation = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 库位信息
        self.storage_location = storage_location

    def validate(self):
        if self.storage_location:
            self.storage_location.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.storage_location is not None:
            result['storage_location'] = self.storage_location.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('storage_location') is not None:
            temp_model = StorageLocation()
            self.storage_location = temp_model.from_map(m['storage_location'])
        return self


class BatchqueryWarehouseStoragelocationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
    ):
        # OAuth模式下的授权token
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


class BatchqueryWarehouseStoragelocationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        storage_location_list: List[StorageLocation] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 库位信息
        self.storage_location_list = storage_location_list

    def validate(self):
        if self.storage_location_list:
            for k in self.storage_location_list:
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
        result['storage_location_list'] = []
        if self.storage_location_list is not None:
            for k in self.storage_location_list:
                result['storage_location_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.storage_location_list = []
        if m.get('storage_location_list') is not None:
            for k in m.get('storage_location_list'):
                temp_model = StorageLocation()
                self.storage_location_list.append(temp_model.from_map(k))
        return self


class ListWarehouseStoragelocationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        current_page: int = None,
        page_size: int = None,
        status: str = None,
        warehouse_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当前页
        self.current_page = current_page
        # 页大小
        self.page_size = page_size
        # 库位状态【AVAILABLE：可用，IN_USE：使用中，IN_CONFIG：配置中，DELETED：已删除】
        self.status = status
        # 仓库id
        self.warehouse_id = warehouse_id

    def validate(self):
        self.validate_required(self.current_page, 'current_page')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.warehouse_id, 'warehouse_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.status is not None:
            result['status'] = self.status
        if self.warehouse_id is not None:
            result['warehouse_id'] = self.warehouse_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('warehouse_id') is not None:
            self.warehouse_id = m.get('warehouse_id')
        return self


class ListWarehouseStoragelocationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        storage_location_list: List[StorageLocation] = None,
        total_count: int = None,
        total_page: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 库位信息
        self.storage_location_list = storage_location_list
        # 总条目
        self.total_count = total_count
        # 总页数
        self.total_page = total_page

    def validate(self):
        if self.storage_location_list:
            for k in self.storage_location_list:
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
        result['storage_location_list'] = []
        if self.storage_location_list is not None:
            for k in self.storage_location_list:
                result['storage_location_list'].append(k.to_map() if k else None)
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.total_page is not None:
            result['total_page'] = self.total_page
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.storage_location_list = []
        if m.get('storage_location_list') is not None:
            for k in m.get('storage_location_list'):
                temp_model = StorageLocation()
                self.storage_location_list.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        return self


class DeleteWarehouseStoragelocationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        location_id: str = None,
        warehouse_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 仓位id
        self.location_id = location_id
        # 仓库id
        self.warehouse_id = warehouse_id

    def validate(self):
        self.validate_required(self.location_id, 'location_id')
        self.validate_required(self.warehouse_id, 'warehouse_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.location_id is not None:
            result['location_id'] = self.location_id
        if self.warehouse_id is not None:
            result['warehouse_id'] = self.warehouse_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('location_id') is not None:
            self.location_id = m.get('location_id')
        if m.get('warehouse_id') is not None:
            self.warehouse_id = m.get('warehouse_id')
        return self


class DeleteWarehouseStoragelocationResponse(TeaModel):
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


class CreateAssettemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        category_id: str = None,
        content: str = None,
        name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 模板类型id
        self.category_id = category_id
        # 模板JSON内容
        self.content = content
        # 模板名称
        self.name = name

    def validate(self):
        self.validate_required(self.category_id, 'category_id')
        self.validate_required(self.content, 'content')
        self.validate_required(self.name, 'name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.category_id is not None:
            result['category_id'] = self.category_id
        if self.content is not None:
            result['content'] = self.content
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('category_id') is not None:
            self.category_id = m.get('category_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class CreateAssettemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        template_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据字典id
        self.template_id = template_id

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
        if self.template_id is not None:
            result['template_id'] = self.template_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        return self


class UpdateAssettemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        category_id: str = None,
        content: str = None,
        template_id: str = None,
        template_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 模板类型Id
        self.category_id = category_id
        # 模板JSON内容
        self.content = content
        # 数据字典id
        self.template_id = template_id
        # 名称
        self.template_name = template_name

    def validate(self):
        self.validate_required(self.template_id, 'template_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.category_id is not None:
            result['category_id'] = self.category_id
        if self.content is not None:
            result['content'] = self.content
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.template_name is not None:
            result['template_name'] = self.template_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('category_id') is not None:
            self.category_id = m.get('category_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('template_name') is not None:
            self.template_name = m.get('template_name')
        return self


class UpdateAssettemplateResponse(TeaModel):
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


class GetAssettemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        template_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据字典id
        self.template_id = template_id

    def validate(self):
        self.validate_required(self.template_id, 'template_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.template_id is not None:
            result['template_id'] = self.template_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        return self


class GetAssettemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        template_info: AssetTemplate = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据字典信息
        self.template_info = template_info

    def validate(self):
        if self.template_info:
            self.template_info.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.template_info is not None:
            result['template_info'] = self.template_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('template_info') is not None:
            temp_model = AssetTemplate()
            self.template_info = temp_model.from_map(m['template_info'])
        return self


class ListAssettemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        current_page: int = None,
        page_size: int = None,
        template_status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当前页
        self.current_page = current_page
        # 页大小
        self.page_size = page_size
        # 模板状态【ALL：全部，INVALID：无效，VALID：有效】
        self.template_status = template_status

    def validate(self):
        self.validate_required(self.current_page, 'current_page')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.template_status is not None:
            result['template_status'] = self.template_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('template_status') is not None:
            self.template_status = m.get('template_status')
        return self


class ListAssettemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        template_info_list: List[AssetTemplate] = None,
        total_count: int = None,
        total_page: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据字典信息
        self.template_info_list = template_info_list
        # 总条目
        self.total_count = total_count
        # 总页数
        self.total_page = total_page

    def validate(self):
        if self.template_info_list:
            for k in self.template_info_list:
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
        result['template_info_list'] = []
        if self.template_info_list is not None:
            for k in self.template_info_list:
                result['template_info_list'].append(k.to_map() if k else None)
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.total_page is not None:
            result['total_page'] = self.total_page
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.template_info_list = []
        if m.get('template_info_list') is not None:
            for k in m.get('template_info_list'):
                temp_model = AssetTemplate()
                self.template_info_list.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        return self


class DeleteAssettemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        template_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 模板id
        self.template_id = template_id

    def validate(self):
        self.validate_required(self.template_id, 'template_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.template_id is not None:
            result['template_id'] = self.template_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        return self


class DeleteAssettemplateResponse(TeaModel):
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


class EnableAssettemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        template_id: str = None,
        valid: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 模板id
        self.template_id = template_id
        # 是否生效
        self.valid = valid

    def validate(self):
        self.validate_required(self.template_id, 'template_id')
        self.validate_required(self.valid, 'valid')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.valid is not None:
            result['valid'] = self.valid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('valid') is not None:
            self.valid = m.get('valid')
        return self


class EnableAssettemplateResponse(TeaModel):
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


class UpdateDocumentFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_md_5: str = None,
        file_name: str = None,
        file_size: int = None,
        file_type: str = None,
        file_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 原文件md5
        self.file_md_5 = file_md_5
        # 文件名称
        self.file_name = file_name
        # 原文件大小
        self.file_size = file_size
        # 文件类型【CONTRACT 合同, NOTE 票据, DOCUMENT 文件, UNKNOWN 未知】
        self.file_type = file_type
        # 原文件url
        self.file_url = file_url

    def validate(self):
        self.validate_required(self.file_md_5, 'file_md_5')
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.file_size, 'file_size')
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.file_url, 'file_url')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_md_5 is not None:
            result['file_md5'] = self.file_md_5
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_size is not None:
            result['file_size'] = self.file_size
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.file_url is not None:
            result['file_url'] = self.file_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_md5') is not None:
            self.file_md_5 = m.get('file_md5')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_size') is not None:
            self.file_size = m.get('file_size')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        return self


class UpdateDocumentFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        document_info: DocumentInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文件信息
        self.document_info = document_info

    def validate(self):
        if self.document_info:
            self.document_info.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.document_info is not None:
            result['document_info'] = self.document_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('document_info') is not None:
            temp_model = DocumentInfo()
            self.document_info = temp_model.from_map(m['document_info'])
        return self


class GetDocumentFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件Id
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.file_id, 'file_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class GetDocumentFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        document_id: str = None,
        file_type: str = None,
        name: str = None,
        tx_hash: str = None,
        tx_time: int = None,
        url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文档Id
        self.document_id = document_id
        # 类型【CONTRACT 合同, NOTE 票据, DOCUMENT 文件, UNKNOWN 未知】
        self.file_type = file_type
        # 文档名
        self.name = name
        # 存证哈希
        self.tx_hash = tx_hash
        # 存证时间
        self.tx_time = tx_time
        # 文件Url
        self.url = url

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
        if self.document_id is not None:
            result['document_id'] = self.document_id
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.name is not None:
            result['name'] = self.name
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.tx_time is not None:
            result['tx_time'] = self.tx_time
        if self.url is not None:
            result['url'] = self.url
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
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('tx_time') is not None:
            self.tx_time = m.get('tx_time')
        if m.get('url') is not None:
            self.url = m.get('url')
        return self


class CancelUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户ID
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class CancelUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        date: int = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求时间
        self.date = date
        # 请求ID
        self.request_id = request_id

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
        if self.date is not None:
            result['date'] = self.date
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class UpdateUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        phone: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户ID
        self.user_id = user_id
        # 11位的合法手机号
        self.phone = phone

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.phone, 'phone')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.phone is not None:
            result['phone'] = self.phone
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        return self


class UpdateUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        date: int = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求时间
        self.date = date
        # 请求ID
        self.request_id = request_id

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
        if self.date is not None:
            result['date'] = self.date
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class ListUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        phone: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 手机号
        self.phone = phone

    def validate(self):
        self.validate_required(self.phone, 'phone')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.phone is not None:
            result['phone'] = self.phone
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        return self


class ListUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        user_list: List[ThirdPartyUser] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户信息列表
        self.user_list = user_list

    def validate(self):
        if self.user_list:
            for k in self.user_list:
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
        result['user_list'] = []
        if self.user_list is not None:
            for k in self.user_list:
                result['user_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.user_list = []
        if m.get('user_list') is not None:
            for k in m.get('user_list'):
                temp_model = ThirdPartyUser()
                self.user_list.append(temp_model.from_map(k))
        return self


class MountUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        platform: str = None,
        open_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 物证平台用户id
        self.user_id = user_id
        # 平台类别
        self.platform = platform
        # 外部平台id
        self.open_id = open_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.platform, 'platform')
        self.validate_required(self.open_id, 'open_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.platform is not None:
            result['platform'] = self.platform
        if self.open_id is not None:
            result['open_id'] = self.open_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('platform') is not None:
            self.platform = m.get('platform')
        if m.get('open_id') is not None:
            self.open_id = m.get('open_id')
        return self


class MountUserResponse(TeaModel):
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


class BatchcreateImportassetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        certificates: List[CertificateInfo] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户id
        self.user_id = user_id
        # 物权信息列表
        self.certificates = certificates

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.certificates, 'certificates')
        if self.certificates:
            for k in self.certificates:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        result['certificates'] = []
        if self.certificates is not None:
            for k in self.certificates:
                result['certificates'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        self.certificates = []
        if m.get('certificates') is not None:
            for k in m.get('certificates'):
                temp_model = CertificateInfo()
                self.certificates.append(temp_model.from_map(k))
        return self


class BatchcreateImportassetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        evidences: List[EvidenceInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 物证信息
        self.evidences = evidences

    def validate(self):
        if self.evidences:
            for k in self.evidences:
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
        result['evidences'] = []
        if self.evidences is not None:
            for k in self.evidences:
                result['evidences'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.evidences = []
        if m.get('evidences') is not None:
            for k in m.get('evidences'):
                temp_model = EvidenceInfo()
                self.evidences.append(temp_model.from_map(k))
        return self


class DescribeImportassetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_id: str = None,
        content: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 物权凭证id
        self.asset_id = asset_id
        # 信息内容JSON格式
        self.content = content
        # 用户id
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.content, 'content')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.content is not None:
            result['content'] = self.content
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class DescribeImportassetResponse(TeaModel):
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


class BatchfreezeImportassetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_id_list: List[str] = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资产id列表
        self.asset_id_list = asset_id_list
        # 用户id
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.asset_id_list, 'asset_id_list')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_id_list is not None:
            result['asset_id_list'] = self.asset_id_list
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_id_list') is not None:
            self.asset_id_list = m.get('asset_id_list')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class BatchfreezeImportassetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_list: List[AssetResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 批量操作返回信息
        self.result_list = result_list

    def validate(self):
        if self.result_list:
            for k in self.result_list:
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
        result['result_list'] = []
        if self.result_list is not None:
            for k in self.result_list:
                result['result_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result_list = []
        if m.get('result_list') is not None:
            for k in m.get('result_list'):
                temp_model = AssetResult()
                self.result_list.append(temp_model.from_map(k))
        return self


class BatchunfreezeImportassetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_id_list: List[str] = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 批量操作信息列表
        self.asset_id_list = asset_id_list
        # 用户id
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.asset_id_list, 'asset_id_list')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_id_list is not None:
            result['asset_id_list'] = self.asset_id_list
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_id_list') is not None:
            self.asset_id_list = m.get('asset_id_list')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class BatchunfreezeImportassetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_list: List[AssetResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 批量返回信息列表
        self.result_list = result_list

    def validate(self):
        if self.result_list:
            for k in self.result_list:
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
        result['result_list'] = []
        if self.result_list is not None:
            for k in self.result_list:
                result['result_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result_list = []
        if m.get('result_list') is not None:
            for k in m.get('result_list'):
                temp_model = AssetResult()
                self.result_list.append(temp_model.from_map(k))
        return self


class BatchcancelImportassetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_id_list: List[str] = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资产id列表
        self.asset_id_list = asset_id_list
        # 用户id
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.asset_id_list, 'asset_id_list')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_id_list is not None:
            result['asset_id_list'] = self.asset_id_list
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_id_list') is not None:
            self.asset_id_list = m.get('asset_id_list')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class BatchcancelImportassetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_list: List[AssetResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 批量返回信息列表
        self.result_list = result_list

    def validate(self):
        if self.result_list:
            for k in self.result_list:
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
        result['result_list'] = []
        if self.result_list is not None:
            for k in self.result_list:
                result['result_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result_list = []
        if m.get('result_list') is not None:
            for k in m.get('result_list'):
                temp_model = AssetResult()
                self.result_list.append(temp_model.from_map(k))
        return self


class BatchcreateTransferRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_id_list: List[str] = None,
        transferee: str = None,
        monetary_amount: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资产id列表
        self.asset_id_list = asset_id_list
        # 接收人id
        self.transferee = transferee
        # 转让金额
        self.monetary_amount = monetary_amount
        # 用户id
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.asset_id_list, 'asset_id_list')
        self.validate_required(self.transferee, 'transferee')
        self.validate_required(self.monetary_amount, 'monetary_amount')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_id_list is not None:
            result['asset_id_list'] = self.asset_id_list
        if self.transferee is not None:
            result['transferee'] = self.transferee
        if self.monetary_amount is not None:
            result['monetary_amount'] = self.monetary_amount
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_id_list') is not None:
            self.asset_id_list = m.get('asset_id_list')
        if m.get('transferee') is not None:
            self.transferee = m.get('transferee')
        if m.get('monetary_amount') is not None:
            self.monetary_amount = m.get('monetary_amount')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class BatchcreateTransferResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_list: List[AssetResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 批量操作返回信息列表
        self.result_list = result_list

    def validate(self):
        if self.result_list:
            for k in self.result_list:
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
        result['result_list'] = []
        if self.result_list is not None:
            for k in self.result_list:
                result['result_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result_list = []
        if m.get('result_list') is not None:
            for k in m.get('result_list'):
                temp_model = AssetResult()
                self.result_list.append(temp_model.from_map(k))
        return self


class CreateCmportProfitrateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_no: str = None,
        product_type: str = None,
        product_name: str = None,
        financial_no: str = None,
        financial_name: str = None,
        role_ratio: List[RoleRatio] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 产品编号
        self.product_no = product_no
        # 产品类型
        self.product_type = product_type
        # 产品名称
        self.product_name = product_name
        # 金融机构编号
        self.financial_no = financial_no
        # 金融机构名称
        self.financial_name = financial_name
        # 各方分润比例
        # 对应角色编码类型：
        # 风险承担方：RISK_TAKER
        # 货物监管方：CARGO_SUPERVISION
        # 资金推荐方：CAPITAL_RECOMMEND
        # 融资推荐方：FUNDER_RECOMMEND
        # 运营管理方：MANAGEMENT
        # 技术支持方：TECHNICAL
        self.role_ratio = role_ratio

    def validate(self):
        self.validate_required(self.product_no, 'product_no')
        self.validate_required(self.product_type, 'product_type')
        self.validate_required(self.product_name, 'product_name')
        self.validate_required(self.financial_no, 'financial_no')
        self.validate_required(self.financial_name, 'financial_name')
        self.validate_required(self.role_ratio, 'role_ratio')
        if self.role_ratio:
            for k in self.role_ratio:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_no is not None:
            result['product_no'] = self.product_no
        if self.product_type is not None:
            result['product_type'] = self.product_type
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.financial_no is not None:
            result['financial_no'] = self.financial_no
        if self.financial_name is not None:
            result['financial_name'] = self.financial_name
        result['role_ratio'] = []
        if self.role_ratio is not None:
            for k in self.role_ratio:
                result['role_ratio'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_no') is not None:
            self.product_no = m.get('product_no')
        if m.get('product_type') is not None:
            self.product_type = m.get('product_type')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('financial_no') is not None:
            self.financial_no = m.get('financial_no')
        if m.get('financial_name') is not None:
            self.financial_name = m.get('financial_name')
        self.role_ratio = []
        if m.get('role_ratio') is not None:
            for k in m.get('role_ratio'):
                temp_model = RoleRatio()
                self.role_ratio.append(temp_model.from_map(k))
        return self


class CreateCmportProfitrateResponse(TeaModel):
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


class ApplyCmportFinanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        source: str = None,
        financial_no: str = None,
        merchant_financial_no: str = None,
        trade_no: str = None,
        company_name: str = None,
        company_code: str = None,
        uni_credit_code: str = None,
        legal_person: str = None,
        legal_person_id_no: str = None,
        company_contact_person: str = None,
        company_contact_phone: str = None,
        company_addr: str = None,
        buyer_code: str = None,
        buyer_name: str = None,
        buyer_uni_credit_code: str = None,
        buyer_legal_person: str = None,
        buyer_legal_person_id_no: str = None,
        buyer_contact_person: str = None,
        buyer_contact_phone: str = None,
        financing_target: str = None,
        financial_amount: int = None,
        financial_period: int = None,
        financial_rate_list: List[FinancialRateInfo] = None,
        penalty_rate_list: List[PenaltyRateInfo] = None,
        ope_fee_type: int = None,
        ope_unit_price_list: List[OpeUnitPriceInfo] = None,
        cargo_type: str = None,
        cargo_weight: str = None,
        cargo_unit_price: int = None,
        cargo_unit_price_type: str = None,
        cargo_total_price: int = None,
        apply_date: str = None,
        product_no: str = None,
        product_name: str = None,
        product_type: int = None,
        authentic_right_code: str = None,
        authentic_right_name: str = None,
        authentic_right_status: int = None,
        authentic_right_time: str = None,
        storage_service_provider: str = None,
        warehouse_addr: str = None,
        storage_contact_phone: str = None,
        bank_insti_code: str = None,
        bank_insti_name: str = None,
        is_pay_security_deposit: int = None,
        security_deposit_amount: int = None,
        security_deposit_rate: str = None,
        financing_limit_agree_no: str = None,
        elec_cert_insti: str = None,
        sign_date: str = None,
        factoring_agreement_no: str = None,
        seller_factoring_account: str = None,
        service_type: str = None,
        business_type: str = None,
        fee_collect_type: str = None,
        interest_collect_type: str = None,
        elec_cert_no: str = None,
        elec_cert_set_up_date: str = None,
        elec_cert_expire_date: str = None,
        elec_cert_amount: int = None,
        trade_contract_invo_no: str = None,
        trade_contract_invo_amount: int = None,
        trade_contract_name: str = None,
        trade_contract_no: str = None,
        trade_contract_buyer_name: str = None,
        pound_proofs: str = None,
        storage_proofs: str = None,
        loan_contract: str = None,
        purchase_contract: str = None,
        sell_contract: str = None,
        consignment_contract: str = None,
        buss_license: str = None,
        legal_person_front: str = None,
        legal_person_reverse: str = None,
        bank_financial_rate: str = None,
        bank_penalty_rate: str = None,
        financial_status: int = None,
        cancel_apply_date: str = None,
        cancel_apply_desc: str = None,
        auditor: str = None,
        audit_date: str = None,
        audit_comment: str = None,
        confirm_loan_date: str = None,
        confirm_loan_comment: str = None,
        confirm_loan_flag: int = None,
        contract_sign_time: str = None,
        contract_sign_comment: str = None,
        contract_sign_flag: int = None,
        user_did: str = None,
        union_id: int = None,
        channel_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 来源方
        self.source = source
        # 融资编号（粮达生成）
        self.financial_no = financial_no
        # 融资编号（粮达生成）
        self.merchant_financial_no = merchant_financial_no
        # 交易编号（粮达生成）
        self.trade_no = trade_no
        # 融资企业名称
        self.company_name = company_name
        # 融资企业编码
        self.company_code = company_code
        # 统一信用代码
        self.uni_credit_code = uni_credit_code
        # 法人名称
        self.legal_person = legal_person
        # 法人身份号码
        self.legal_person_id_no = legal_person_id_no
        # 融资企业联系人
        self.company_contact_person = company_contact_person
        # 融资企业联系号码
        self.company_contact_phone = company_contact_phone
        # 企业办公地址
        self.company_addr = company_addr
        # 对手编号
        self.buyer_code = buyer_code
        # 对手企业名称
        self.buyer_name = buyer_name
        # 对手统一信用代码
        self.buyer_uni_credit_code = buyer_uni_credit_code
        # 对手法人
        self.buyer_legal_person = buyer_legal_person
        # 对手法人身份证号码
        self.buyer_legal_person_id_no = buyer_legal_person_id_no
        # 对手联系人
        self.buyer_contact_person = buyer_contact_person
        # 对手联系人手机
        self.buyer_contact_phone = buyer_contact_phone
        # 融资标的（采购合同关联的货权编号: 多个编号，隔开）
        self.financing_target = financing_target
        # 融资金额（分）
        self.financial_amount = financial_amount
        # 融资周期（天）
        self.financial_period = financial_period
        # 融资利率列表
        self.financial_rate_list = financial_rate_list
        # 罚息利率列表
        self.penalty_rate_list = penalty_rate_list
        # 操作费类型 1->标准收费; 2->阶梯收费
        self.ope_fee_type = ope_fee_type
        # 操作费单价列表
        self.ope_unit_price_list = ope_unit_price_list
        # 货物品种
        self.cargo_type = cargo_type
        # 货物吨数 (单位 t)
        self.cargo_weight = cargo_weight
        # 货物单价（分）
        self.cargo_unit_price = cargo_unit_price
        # 货物单价类型
        self.cargo_unit_price_type = cargo_unit_price_type
        # 货物总价
        self.cargo_total_price = cargo_total_price
        # 融资申请日期
        self.apply_date = apply_date
        # 产品编号
        self.product_no = product_no
        # 产品名称
        self.product_name = product_name
        # 产品类别：1->买方保理;2->卖方保理;3->仓单融资
        self.product_type = product_type
        # 确权方编码
        self.authentic_right_code = authentic_right_code
        # 确权方名称
        self.authentic_right_name = authentic_right_name
        # 确权状态 1->已确权; 2->未确权。粮达网默认是 1
        self.authentic_right_status = authentic_right_status
        # 确权时间
        self.authentic_right_time = authentic_right_time
        # 仓储服务商/物流服务商
        self.storage_service_provider = storage_service_provider
        # 仓储地址/物流地址
        self.warehouse_addr = warehouse_addr
        # 仓储联系方式/物流联系方式
        self.storage_contact_phone = storage_contact_phone
        # 金融机构编码
        self.bank_insti_code = bank_insti_code
        # 金融机构名称
        self.bank_insti_name = bank_insti_name
        # 是否缴纳保证金 1->缴纳;2->不缴纳
        self.is_pay_security_deposit = is_pay_security_deposit
        # 保证金缴纳金额
        self.security_deposit_amount = security_deposit_amount
        # 保证金缴纳比例
        self.security_deposit_rate = security_deposit_rate
        # 融资额度协议编号
        self.financing_limit_agree_no = financing_limit_agree_no
        # 电子章认证机构
        self.elec_cert_insti = elec_cert_insti
        # 签署日期
        self.sign_date = sign_date
        # 保理协议编号
        self.factoring_agreement_no = factoring_agreement_no
        # 卖方保理专户（回款账户）
        self.seller_factoring_account = seller_factoring_account
        # 服务类型: 1->应收账款保理
        self.service_type = service_type
        # 业务类型: 1-> 买断循环后收息
        self.business_type = business_type
        # 费用收取方式: 1-> 融资时收取
        self.fee_collect_type = fee_collect_type
        # 利息收取方式: 1-> 预扣
        self.interest_collect_type = interest_collect_type
        # 电子凭证编号
        self.elec_cert_no = elec_cert_no
        # 电子凭证开立日
        self.elec_cert_set_up_date = elec_cert_set_up_date
        # 电子凭证付款到期日
        self.elec_cert_expire_date = elec_cert_expire_date
        # 转让电子凭证金额
        self.elec_cert_amount = elec_cert_amount
        # 交易合同发票编号
        self.trade_contract_invo_no = trade_contract_invo_no
        # 交易合同发票金额
        self.trade_contract_invo_amount = trade_contract_invo_amount
        # 交易合同名称
        self.trade_contract_name = trade_contract_name
        # 交易合同编号
        self.trade_contract_no = trade_contract_no
        # 交易合同买方名称
        self.trade_contract_buyer_name = trade_contract_buyer_name
        # 磅单凭证（多个的话-分号分割）
        self.pound_proofs = pound_proofs
        # 入库凭证（多个的话-分号分割）
        self.storage_proofs = storage_proofs
        # 借款合同（多个的话-分号分割）
        self.loan_contract = loan_contract
        # 采购合同（多个的话-分号分割）
        self.purchase_contract = purchase_contract
        # 销售合同（多个的话-分号分割）
        self.sell_contract = sell_contract
        # 寄售合同（多个的话-分号分割）
        self.consignment_contract = consignment_contract
        # 融资方营业执照
        self.buss_license = buss_license
        # 法人身份证（正）
        self.legal_person_front = legal_person_front
        # 法人身份证（反）
        self.legal_person_reverse = legal_person_reverse
        # 银行侧融资利率
        self.bank_financial_rate = bank_financial_rate
        # 银行侧罚息
        self.bank_penalty_rate = bank_penalty_rate
        # 融资状态:
        # 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
        self.financial_status = financial_status
        # 撤销申请日期
        self.cancel_apply_date = cancel_apply_date
        # 撤销申请描述
        self.cancel_apply_desc = cancel_apply_desc
        # 审核人
        self.auditor = auditor
        # 审核时间
        self.audit_date = audit_date
        # 审核评论
        self.audit_comment = audit_comment
        # 确认放款日期
        self.confirm_loan_date = confirm_loan_date
        # 确认放款评论
        self.confirm_loan_comment = confirm_loan_comment
        # 流程标记：
        # 1->流程通过;2->流程打回到上一级;3->直接拒绝
        self.confirm_loan_flag = confirm_loan_flag
        # Date
        self.contract_sign_time = contract_sign_time
        # 待签署评论
        self.contract_sign_comment = contract_sign_comment
        # 流程标记：
        # 1->流程通过;2->流程打回到上一级;3->直接拒绝
        self.contract_sign_flag = contract_sign_flag
        # 上链账户
        self.user_did = user_did
        # 联盟id
        self.union_id = union_id
        # Channel 名称
        self.channel_name = channel_name

    def validate(self):
        self.validate_required(self.source, 'source')
        self.validate_required(self.financial_no, 'financial_no')
        self.validate_required(self.merchant_financial_no, 'merchant_financial_no')
        self.validate_required(self.trade_no, 'trade_no')
        self.validate_required(self.company_name, 'company_name')
        self.validate_required(self.company_code, 'company_code')
        self.validate_required(self.uni_credit_code, 'uni_credit_code')
        self.validate_required(self.legal_person, 'legal_person')
        self.validate_required(self.legal_person_id_no, 'legal_person_id_no')
        self.validate_required(self.company_contact_person, 'company_contact_person')
        self.validate_required(self.company_contact_phone, 'company_contact_phone')
        self.validate_required(self.company_addr, 'company_addr')
        self.validate_required(self.buyer_code, 'buyer_code')
        self.validate_required(self.buyer_name, 'buyer_name')
        self.validate_required(self.buyer_uni_credit_code, 'buyer_uni_credit_code')
        self.validate_required(self.financing_target, 'financing_target')
        self.validate_required(self.financial_amount, 'financial_amount')
        self.validate_required(self.financial_period, 'financial_period')
        self.validate_required(self.financial_rate_list, 'financial_rate_list')
        if self.financial_rate_list:
            for k in self.financial_rate_list:
                if k:
                    k.validate()
        self.validate_required(self.penalty_rate_list, 'penalty_rate_list')
        if self.penalty_rate_list:
            for k in self.penalty_rate_list:
                if k:
                    k.validate()
        self.validate_required(self.ope_fee_type, 'ope_fee_type')
        self.validate_required(self.ope_unit_price_list, 'ope_unit_price_list')
        if self.ope_unit_price_list:
            for k in self.ope_unit_price_list:
                if k:
                    k.validate()
        self.validate_required(self.cargo_type, 'cargo_type')
        self.validate_required(self.cargo_weight, 'cargo_weight')
        self.validate_required(self.cargo_unit_price, 'cargo_unit_price')
        self.validate_required(self.cargo_unit_price_type, 'cargo_unit_price_type')
        self.validate_required(self.cargo_total_price, 'cargo_total_price')
        if self.apply_date is not None:
            self.validate_pattern(self.apply_date, 'apply_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.product_no, 'product_no')
        self.validate_required(self.product_name, 'product_name')
        self.validate_required(self.product_type, 'product_type')
        self.validate_required(self.authentic_right_code, 'authentic_right_code')
        self.validate_required(self.authentic_right_name, 'authentic_right_name')
        self.validate_required(self.authentic_right_status, 'authentic_right_status')
        self.validate_required(self.authentic_right_time, 'authentic_right_time')
        if self.authentic_right_time is not None:
            self.validate_pattern(self.authentic_right_time, 'authentic_right_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.storage_service_provider, 'storage_service_provider')
        self.validate_required(self.warehouse_addr, 'warehouse_addr')
        self.validate_required(self.storage_contact_phone, 'storage_contact_phone')
        self.validate_required(self.bank_insti_code, 'bank_insti_code')
        self.validate_required(self.bank_insti_name, 'bank_insti_name')
        self.validate_required(self.is_pay_security_deposit, 'is_pay_security_deposit')
        self.validate_required(self.security_deposit_amount, 'security_deposit_amount')
        self.validate_required(self.security_deposit_rate, 'security_deposit_rate')
        self.validate_required(self.financing_limit_agree_no, 'financing_limit_agree_no')
        self.validate_required(self.elec_cert_insti, 'elec_cert_insti')
        self.validate_required(self.sign_date, 'sign_date')
        if self.sign_date is not None:
            self.validate_pattern(self.sign_date, 'sign_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.factoring_agreement_no, 'factoring_agreement_no')
        self.validate_required(self.seller_factoring_account, 'seller_factoring_account')
        self.validate_required(self.service_type, 'service_type')
        self.validate_required(self.business_type, 'business_type')
        self.validate_required(self.fee_collect_type, 'fee_collect_type')
        self.validate_required(self.interest_collect_type, 'interest_collect_type')
        self.validate_required(self.elec_cert_no, 'elec_cert_no')
        self.validate_required(self.elec_cert_set_up_date, 'elec_cert_set_up_date')
        if self.elec_cert_set_up_date is not None:
            self.validate_pattern(self.elec_cert_set_up_date, 'elec_cert_set_up_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.elec_cert_expire_date, 'elec_cert_expire_date')
        if self.elec_cert_expire_date is not None:
            self.validate_pattern(self.elec_cert_expire_date, 'elec_cert_expire_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.elec_cert_amount, 'elec_cert_amount')
        self.validate_required(self.trade_contract_invo_no, 'trade_contract_invo_no')
        self.validate_required(self.trade_contract_invo_amount, 'trade_contract_invo_amount')
        self.validate_required(self.trade_contract_name, 'trade_contract_name')
        self.validate_required(self.trade_contract_no, 'trade_contract_no')
        self.validate_required(self.trade_contract_buyer_name, 'trade_contract_buyer_name')
        self.validate_required(self.storage_proofs, 'storage_proofs')
        self.validate_required(self.loan_contract, 'loan_contract')
        self.validate_required(self.purchase_contract, 'purchase_contract')
        self.validate_required(self.sell_contract, 'sell_contract')
        self.validate_required(self.bank_financial_rate, 'bank_financial_rate')
        self.validate_required(self.bank_penalty_rate, 'bank_penalty_rate')
        self.validate_required(self.financial_status, 'financial_status')
        if self.cancel_apply_date is not None:
            self.validate_pattern(self.cancel_apply_date, 'cancel_apply_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.audit_date is not None:
            self.validate_pattern(self.audit_date, 'audit_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.confirm_loan_date is not None:
            self.validate_pattern(self.confirm_loan_date, 'confirm_loan_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.contract_sign_time is not None:
            self.validate_pattern(self.contract_sign_time, 'contract_sign_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.channel_name, 'channel_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.source is not None:
            result['source'] = self.source
        if self.financial_no is not None:
            result['financial_no'] = self.financial_no
        if self.merchant_financial_no is not None:
            result['merchant_financial_no'] = self.merchant_financial_no
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.company_code is not None:
            result['company_code'] = self.company_code
        if self.uni_credit_code is not None:
            result['uni_credit_code'] = self.uni_credit_code
        if self.legal_person is not None:
            result['legal_person'] = self.legal_person
        if self.legal_person_id_no is not None:
            result['legal_person_id_no'] = self.legal_person_id_no
        if self.company_contact_person is not None:
            result['company_contact_person'] = self.company_contact_person
        if self.company_contact_phone is not None:
            result['company_contact_phone'] = self.company_contact_phone
        if self.company_addr is not None:
            result['company_addr'] = self.company_addr
        if self.buyer_code is not None:
            result['buyer_code'] = self.buyer_code
        if self.buyer_name is not None:
            result['buyer_name'] = self.buyer_name
        if self.buyer_uni_credit_code is not None:
            result['buyer_uni_credit_code'] = self.buyer_uni_credit_code
        if self.buyer_legal_person is not None:
            result['buyer_legal_person'] = self.buyer_legal_person
        if self.buyer_legal_person_id_no is not None:
            result['buyer_legal_person_id_no'] = self.buyer_legal_person_id_no
        if self.buyer_contact_person is not None:
            result['buyer_contact_person'] = self.buyer_contact_person
        if self.buyer_contact_phone is not None:
            result['buyer_contact_phone'] = self.buyer_contact_phone
        if self.financing_target is not None:
            result['financing_target'] = self.financing_target
        if self.financial_amount is not None:
            result['financial_amount'] = self.financial_amount
        if self.financial_period is not None:
            result['financial_period'] = self.financial_period
        result['financial_rate_list'] = []
        if self.financial_rate_list is not None:
            for k in self.financial_rate_list:
                result['financial_rate_list'].append(k.to_map() if k else None)
        result['penalty_rate_list'] = []
        if self.penalty_rate_list is not None:
            for k in self.penalty_rate_list:
                result['penalty_rate_list'].append(k.to_map() if k else None)
        if self.ope_fee_type is not None:
            result['ope_fee_type'] = self.ope_fee_type
        result['ope_unit_price_list'] = []
        if self.ope_unit_price_list is not None:
            for k in self.ope_unit_price_list:
                result['ope_unit_price_list'].append(k.to_map() if k else None)
        if self.cargo_type is not None:
            result['cargo_type'] = self.cargo_type
        if self.cargo_weight is not None:
            result['cargo_weight'] = self.cargo_weight
        if self.cargo_unit_price is not None:
            result['cargo_unit_price'] = self.cargo_unit_price
        if self.cargo_unit_price_type is not None:
            result['cargo_unit_price_type'] = self.cargo_unit_price_type
        if self.cargo_total_price is not None:
            result['cargo_total_price'] = self.cargo_total_price
        if self.apply_date is not None:
            result['apply_date'] = self.apply_date
        if self.product_no is not None:
            result['product_no'] = self.product_no
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.product_type is not None:
            result['product_type'] = self.product_type
        if self.authentic_right_code is not None:
            result['authentic_right_code'] = self.authentic_right_code
        if self.authentic_right_name is not None:
            result['authentic_right_name'] = self.authentic_right_name
        if self.authentic_right_status is not None:
            result['authentic_right_status'] = self.authentic_right_status
        if self.authentic_right_time is not None:
            result['authentic_right_time'] = self.authentic_right_time
        if self.storage_service_provider is not None:
            result['storage_service_provider'] = self.storage_service_provider
        if self.warehouse_addr is not None:
            result['warehouse_addr'] = self.warehouse_addr
        if self.storage_contact_phone is not None:
            result['storage_contact_phone'] = self.storage_contact_phone
        if self.bank_insti_code is not None:
            result['bank_insti_code'] = self.bank_insti_code
        if self.bank_insti_name is not None:
            result['bank_insti_name'] = self.bank_insti_name
        if self.is_pay_security_deposit is not None:
            result['is_pay_security_deposit'] = self.is_pay_security_deposit
        if self.security_deposit_amount is not None:
            result['security_deposit_amount'] = self.security_deposit_amount
        if self.security_deposit_rate is not None:
            result['security_deposit_rate'] = self.security_deposit_rate
        if self.financing_limit_agree_no is not None:
            result['financing_limit_agree_no'] = self.financing_limit_agree_no
        if self.elec_cert_insti is not None:
            result['elec_cert_insti'] = self.elec_cert_insti
        if self.sign_date is not None:
            result['sign_date'] = self.sign_date
        if self.factoring_agreement_no is not None:
            result['factoring_agreement_no'] = self.factoring_agreement_no
        if self.seller_factoring_account is not None:
            result['seller_factoring_account'] = self.seller_factoring_account
        if self.service_type is not None:
            result['service_type'] = self.service_type
        if self.business_type is not None:
            result['business_type'] = self.business_type
        if self.fee_collect_type is not None:
            result['fee_collect_type'] = self.fee_collect_type
        if self.interest_collect_type is not None:
            result['interest_collect_type'] = self.interest_collect_type
        if self.elec_cert_no is not None:
            result['elec_cert_no'] = self.elec_cert_no
        if self.elec_cert_set_up_date is not None:
            result['elec_cert_set_up_date'] = self.elec_cert_set_up_date
        if self.elec_cert_expire_date is not None:
            result['elec_cert_expire_date'] = self.elec_cert_expire_date
        if self.elec_cert_amount is not None:
            result['elec_cert_amount'] = self.elec_cert_amount
        if self.trade_contract_invo_no is not None:
            result['trade_contract_invo_no'] = self.trade_contract_invo_no
        if self.trade_contract_invo_amount is not None:
            result['trade_contract_invo_amount'] = self.trade_contract_invo_amount
        if self.trade_contract_name is not None:
            result['trade_contract_name'] = self.trade_contract_name
        if self.trade_contract_no is not None:
            result['trade_contract_no'] = self.trade_contract_no
        if self.trade_contract_buyer_name is not None:
            result['trade_contract_buyer_name'] = self.trade_contract_buyer_name
        if self.pound_proofs is not None:
            result['pound_proofs'] = self.pound_proofs
        if self.storage_proofs is not None:
            result['storage_proofs'] = self.storage_proofs
        if self.loan_contract is not None:
            result['loan_contract'] = self.loan_contract
        if self.purchase_contract is not None:
            result['purchase_contract'] = self.purchase_contract
        if self.sell_contract is not None:
            result['sell_contract'] = self.sell_contract
        if self.consignment_contract is not None:
            result['consignment_contract'] = self.consignment_contract
        if self.buss_license is not None:
            result['buss_license'] = self.buss_license
        if self.legal_person_front is not None:
            result['legal_person_front'] = self.legal_person_front
        if self.legal_person_reverse is not None:
            result['legal_person_reverse'] = self.legal_person_reverse
        if self.bank_financial_rate is not None:
            result['bank_financial_rate'] = self.bank_financial_rate
        if self.bank_penalty_rate is not None:
            result['bank_penalty_rate'] = self.bank_penalty_rate
        if self.financial_status is not None:
            result['financial_status'] = self.financial_status
        if self.cancel_apply_date is not None:
            result['cancel_apply_date'] = self.cancel_apply_date
        if self.cancel_apply_desc is not None:
            result['cancel_apply_desc'] = self.cancel_apply_desc
        if self.auditor is not None:
            result['auditor'] = self.auditor
        if self.audit_date is not None:
            result['audit_date'] = self.audit_date
        if self.audit_comment is not None:
            result['audit_comment'] = self.audit_comment
        if self.confirm_loan_date is not None:
            result['confirm_loan_date'] = self.confirm_loan_date
        if self.confirm_loan_comment is not None:
            result['confirm_loan_comment'] = self.confirm_loan_comment
        if self.confirm_loan_flag is not None:
            result['confirm_loan_flag'] = self.confirm_loan_flag
        if self.contract_sign_time is not None:
            result['contract_sign_time'] = self.contract_sign_time
        if self.contract_sign_comment is not None:
            result['contract_sign_comment'] = self.contract_sign_comment
        if self.contract_sign_flag is not None:
            result['contract_sign_flag'] = self.contract_sign_flag
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.channel_name is not None:
            result['channel_name'] = self.channel_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('financial_no') is not None:
            self.financial_no = m.get('financial_no')
        if m.get('merchant_financial_no') is not None:
            self.merchant_financial_no = m.get('merchant_financial_no')
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('company_code') is not None:
            self.company_code = m.get('company_code')
        if m.get('uni_credit_code') is not None:
            self.uni_credit_code = m.get('uni_credit_code')
        if m.get('legal_person') is not None:
            self.legal_person = m.get('legal_person')
        if m.get('legal_person_id_no') is not None:
            self.legal_person_id_no = m.get('legal_person_id_no')
        if m.get('company_contact_person') is not None:
            self.company_contact_person = m.get('company_contact_person')
        if m.get('company_contact_phone') is not None:
            self.company_contact_phone = m.get('company_contact_phone')
        if m.get('company_addr') is not None:
            self.company_addr = m.get('company_addr')
        if m.get('buyer_code') is not None:
            self.buyer_code = m.get('buyer_code')
        if m.get('buyer_name') is not None:
            self.buyer_name = m.get('buyer_name')
        if m.get('buyer_uni_credit_code') is not None:
            self.buyer_uni_credit_code = m.get('buyer_uni_credit_code')
        if m.get('buyer_legal_person') is not None:
            self.buyer_legal_person = m.get('buyer_legal_person')
        if m.get('buyer_legal_person_id_no') is not None:
            self.buyer_legal_person_id_no = m.get('buyer_legal_person_id_no')
        if m.get('buyer_contact_person') is not None:
            self.buyer_contact_person = m.get('buyer_contact_person')
        if m.get('buyer_contact_phone') is not None:
            self.buyer_contact_phone = m.get('buyer_contact_phone')
        if m.get('financing_target') is not None:
            self.financing_target = m.get('financing_target')
        if m.get('financial_amount') is not None:
            self.financial_amount = m.get('financial_amount')
        if m.get('financial_period') is not None:
            self.financial_period = m.get('financial_period')
        self.financial_rate_list = []
        if m.get('financial_rate_list') is not None:
            for k in m.get('financial_rate_list'):
                temp_model = FinancialRateInfo()
                self.financial_rate_list.append(temp_model.from_map(k))
        self.penalty_rate_list = []
        if m.get('penalty_rate_list') is not None:
            for k in m.get('penalty_rate_list'):
                temp_model = PenaltyRateInfo()
                self.penalty_rate_list.append(temp_model.from_map(k))
        if m.get('ope_fee_type') is not None:
            self.ope_fee_type = m.get('ope_fee_type')
        self.ope_unit_price_list = []
        if m.get('ope_unit_price_list') is not None:
            for k in m.get('ope_unit_price_list'):
                temp_model = OpeUnitPriceInfo()
                self.ope_unit_price_list.append(temp_model.from_map(k))
        if m.get('cargo_type') is not None:
            self.cargo_type = m.get('cargo_type')
        if m.get('cargo_weight') is not None:
            self.cargo_weight = m.get('cargo_weight')
        if m.get('cargo_unit_price') is not None:
            self.cargo_unit_price = m.get('cargo_unit_price')
        if m.get('cargo_unit_price_type') is not None:
            self.cargo_unit_price_type = m.get('cargo_unit_price_type')
        if m.get('cargo_total_price') is not None:
            self.cargo_total_price = m.get('cargo_total_price')
        if m.get('apply_date') is not None:
            self.apply_date = m.get('apply_date')
        if m.get('product_no') is not None:
            self.product_no = m.get('product_no')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('product_type') is not None:
            self.product_type = m.get('product_type')
        if m.get('authentic_right_code') is not None:
            self.authentic_right_code = m.get('authentic_right_code')
        if m.get('authentic_right_name') is not None:
            self.authentic_right_name = m.get('authentic_right_name')
        if m.get('authentic_right_status') is not None:
            self.authentic_right_status = m.get('authentic_right_status')
        if m.get('authentic_right_time') is not None:
            self.authentic_right_time = m.get('authentic_right_time')
        if m.get('storage_service_provider') is not None:
            self.storage_service_provider = m.get('storage_service_provider')
        if m.get('warehouse_addr') is not None:
            self.warehouse_addr = m.get('warehouse_addr')
        if m.get('storage_contact_phone') is not None:
            self.storage_contact_phone = m.get('storage_contact_phone')
        if m.get('bank_insti_code') is not None:
            self.bank_insti_code = m.get('bank_insti_code')
        if m.get('bank_insti_name') is not None:
            self.bank_insti_name = m.get('bank_insti_name')
        if m.get('is_pay_security_deposit') is not None:
            self.is_pay_security_deposit = m.get('is_pay_security_deposit')
        if m.get('security_deposit_amount') is not None:
            self.security_deposit_amount = m.get('security_deposit_amount')
        if m.get('security_deposit_rate') is not None:
            self.security_deposit_rate = m.get('security_deposit_rate')
        if m.get('financing_limit_agree_no') is not None:
            self.financing_limit_agree_no = m.get('financing_limit_agree_no')
        if m.get('elec_cert_insti') is not None:
            self.elec_cert_insti = m.get('elec_cert_insti')
        if m.get('sign_date') is not None:
            self.sign_date = m.get('sign_date')
        if m.get('factoring_agreement_no') is not None:
            self.factoring_agreement_no = m.get('factoring_agreement_no')
        if m.get('seller_factoring_account') is not None:
            self.seller_factoring_account = m.get('seller_factoring_account')
        if m.get('service_type') is not None:
            self.service_type = m.get('service_type')
        if m.get('business_type') is not None:
            self.business_type = m.get('business_type')
        if m.get('fee_collect_type') is not None:
            self.fee_collect_type = m.get('fee_collect_type')
        if m.get('interest_collect_type') is not None:
            self.interest_collect_type = m.get('interest_collect_type')
        if m.get('elec_cert_no') is not None:
            self.elec_cert_no = m.get('elec_cert_no')
        if m.get('elec_cert_set_up_date') is not None:
            self.elec_cert_set_up_date = m.get('elec_cert_set_up_date')
        if m.get('elec_cert_expire_date') is not None:
            self.elec_cert_expire_date = m.get('elec_cert_expire_date')
        if m.get('elec_cert_amount') is not None:
            self.elec_cert_amount = m.get('elec_cert_amount')
        if m.get('trade_contract_invo_no') is not None:
            self.trade_contract_invo_no = m.get('trade_contract_invo_no')
        if m.get('trade_contract_invo_amount') is not None:
            self.trade_contract_invo_amount = m.get('trade_contract_invo_amount')
        if m.get('trade_contract_name') is not None:
            self.trade_contract_name = m.get('trade_contract_name')
        if m.get('trade_contract_no') is not None:
            self.trade_contract_no = m.get('trade_contract_no')
        if m.get('trade_contract_buyer_name') is not None:
            self.trade_contract_buyer_name = m.get('trade_contract_buyer_name')
        if m.get('pound_proofs') is not None:
            self.pound_proofs = m.get('pound_proofs')
        if m.get('storage_proofs') is not None:
            self.storage_proofs = m.get('storage_proofs')
        if m.get('loan_contract') is not None:
            self.loan_contract = m.get('loan_contract')
        if m.get('purchase_contract') is not None:
            self.purchase_contract = m.get('purchase_contract')
        if m.get('sell_contract') is not None:
            self.sell_contract = m.get('sell_contract')
        if m.get('consignment_contract') is not None:
            self.consignment_contract = m.get('consignment_contract')
        if m.get('buss_license') is not None:
            self.buss_license = m.get('buss_license')
        if m.get('legal_person_front') is not None:
            self.legal_person_front = m.get('legal_person_front')
        if m.get('legal_person_reverse') is not None:
            self.legal_person_reverse = m.get('legal_person_reverse')
        if m.get('bank_financial_rate') is not None:
            self.bank_financial_rate = m.get('bank_financial_rate')
        if m.get('bank_penalty_rate') is not None:
            self.bank_penalty_rate = m.get('bank_penalty_rate')
        if m.get('financial_status') is not None:
            self.financial_status = m.get('financial_status')
        if m.get('cancel_apply_date') is not None:
            self.cancel_apply_date = m.get('cancel_apply_date')
        if m.get('cancel_apply_desc') is not None:
            self.cancel_apply_desc = m.get('cancel_apply_desc')
        if m.get('auditor') is not None:
            self.auditor = m.get('auditor')
        if m.get('audit_date') is not None:
            self.audit_date = m.get('audit_date')
        if m.get('audit_comment') is not None:
            self.audit_comment = m.get('audit_comment')
        if m.get('confirm_loan_date') is not None:
            self.confirm_loan_date = m.get('confirm_loan_date')
        if m.get('confirm_loan_comment') is not None:
            self.confirm_loan_comment = m.get('confirm_loan_comment')
        if m.get('confirm_loan_flag') is not None:
            self.confirm_loan_flag = m.get('confirm_loan_flag')
        if m.get('contract_sign_time') is not None:
            self.contract_sign_time = m.get('contract_sign_time')
        if m.get('contract_sign_comment') is not None:
            self.contract_sign_comment = m.get('contract_sign_comment')
        if m.get('contract_sign_flag') is not None:
            self.contract_sign_flag = m.get('contract_sign_flag')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('channel_name') is not None:
            self.channel_name = m.get('channel_name')
        return self


class ApplyCmportFinanceResponse(TeaModel):
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


class ListCmportEnterprisestatementRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        account_date: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # accountingDate
        self.account_date = account_date
        # 页码，从1开始
        self.page_num = page_num
        # 页大小，最大100
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.account_date, 'account_date')
        if self.account_date is not None:
            self.validate_pattern(self.account_date, 'account_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.account_date is not None:
            result['account_date'] = self.account_date
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
        if m.get('account_date') is not None:
            self.account_date = m.get('account_date')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListCmportEnterprisestatementResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_num: int = None,
        page_size: int = None,
        total_page: int = None,
        total_statement_list: List[TotalStatement] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 页码
        self.page_num = page_num
        # 页大小
        self.page_size = page_size
        # 总页数
        self.total_page = total_page
        # 总对账单
        self.total_statement_list = total_statement_list

    def validate(self):
        if self.total_statement_list:
            for k in self.total_statement_list:
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
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_page is not None:
            result['total_page'] = self.total_page
        result['total_statement_list'] = []
        if self.total_statement_list is not None:
            for k in self.total_statement_list:
                result['total_statement_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        self.total_statement_list = []
        if m.get('total_statement_list') is not None:
            for k in m.get('total_statement_list'):
                temp_model = TotalStatement()
                self.total_statement_list.append(temp_model.from_map(k))
        return self


class ListCmportUserstatementRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_num: int = None,
        page_size: int = None,
        accounting_date: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 页码
        self.page_num = page_num
        # 页大小
        self.page_size = page_size
        # 记账日期   yyyy-mm-dd
        self.accounting_date = accounting_date

    def validate(self):
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.accounting_date, 'accounting_date')
        if self.accounting_date is not None:
            self.validate_pattern(self.accounting_date, 'accounting_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.accounting_date is not None:
            result['accounting_date'] = self.accounting_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('accounting_date') is not None:
            self.accounting_date = m.get('accounting_date')
        return self


class ListCmportUserstatementResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_num: int = None,
        page_size: int = None,
        total_page: int = None,
        user_statement_list: List[UserStatement] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 页码
        self.page_num = page_num
        # 页大小
        self.page_size = page_size
        # 总页数
        self.total_page = total_page
        # 用户对账单
        self.user_statement_list = user_statement_list

    def validate(self):
        if self.user_statement_list:
            for k in self.user_statement_list:
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
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_page is not None:
            result['total_page'] = self.total_page
        result['user_statement_list'] = []
        if self.user_statement_list is not None:
            for k in self.user_statement_list:
                result['user_statement_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        self.user_statement_list = []
        if m.get('user_statement_list') is not None:
            for k in m.get('user_statement_list'):
                temp_model = UserStatement()
                self.user_statement_list.append(temp_model.from_map(k))
        return self


class ListCmportUserprofitRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_num: int = None,
        page_size: int = None,
        accounting_date: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 页码
        self.page_num = page_num
        # 页大小
        self.page_size = page_size
        # 记账日期 yyyy-mm-dd
        self.accounting_date = accounting_date

    def validate(self):
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.accounting_date, 'accounting_date')
        if self.accounting_date is not None:
            self.validate_pattern(self.accounting_date, 'accounting_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.accounting_date is not None:
            result['accounting_date'] = self.accounting_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('accounting_date') is not None:
            self.accounting_date = m.get('accounting_date')
        return self


class ListCmportUserprofitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_num: int = None,
        page_size: int = None,
        total_page: int = None,
        user_bill_list: List[UserDetail] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 页码
        self.page_num = page_num
        # 页大小
        self.page_size = page_size
        # 总页数
        self.total_page = total_page
        # 用户明细清单
        self.user_bill_list = user_bill_list

    def validate(self):
        if self.user_bill_list:
            for k in self.user_bill_list:
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
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_page is not None:
            result['total_page'] = self.total_page
        result['user_bill_list'] = []
        if self.user_bill_list is not None:
            for k in self.user_bill_list:
                result['user_bill_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        self.user_bill_list = []
        if m.get('user_bill_list') is not None:
            for k in m.get('user_bill_list'):
                temp_model = UserDetail()
                self.user_bill_list.append(temp_model.from_map(k))
        return self


class QueryCmportBankfeeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        financial_no: str = None,
        account_date: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 融资编号
        self.financial_no = financial_no
        # 记账日期 yyyy-mm-dd
        self.account_date = account_date

    def validate(self):
        self.validate_required(self.financial_no, 'financial_no')
        self.validate_required(self.account_date, 'account_date')
        if self.account_date is not None:
            self.validate_pattern(self.account_date, 'account_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.financial_no is not None:
            result['financial_no'] = self.financial_no
        if self.account_date is not None:
            result['account_date'] = self.account_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('financial_no') is not None:
            self.financial_no = m.get('financial_no')
        if m.get('account_date') is not None:
            self.account_date = m.get('account_date')
        return self


class QueryCmportBankfeeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        capital_amount: int = None,
        interest_amount: int = None,
        total_amount: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 应付银行本金
        self.capital_amount = capital_amount
        # 应付银行利息
        self.interest_amount = interest_amount
        # 应付总金额
        self.total_amount = total_amount

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
        if self.capital_amount is not None:
            result['capital_amount'] = self.capital_amount
        if self.interest_amount is not None:
            result['interest_amount'] = self.interest_amount
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('capital_amount') is not None:
            self.capital_amount = m.get('capital_amount')
        if m.get('interest_amount') is not None:
            self.interest_amount = m.get('interest_amount')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        return self


class CreateCmportProfitpartnerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_no: str = None,
        company_name: str = None,
        organization_category: str = None,
        role_organization_list: List[RoleOrganization] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业编号
        self.company_no = company_no
        # 企业名称
        self.company_name = company_name
        # 组织类别
        self.organization_category = organization_category
        # 角色编号对应组织信息
        # 组织对应角色编码：
        # 风险承担方：RISK_TAKER
        # 货物监管方：CARGO_SUPERVISION
        # 资金推荐方：CAPITAL_RECOMMEND
        # 融资推荐方：FUNDER_RECOMMEND
        # 运营管理方：MANAGEMENT
        # 技术支持方：TECHNICAL
        self.role_organization_list = role_organization_list

    def validate(self):
        self.validate_required(self.company_no, 'company_no')
        self.validate_required(self.company_name, 'company_name')
        self.validate_required(self.organization_category, 'organization_category')
        self.validate_required(self.role_organization_list, 'role_organization_list')
        if self.role_organization_list:
            for k in self.role_organization_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_no is not None:
            result['company_no'] = self.company_no
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.organization_category is not None:
            result['organization_category'] = self.organization_category
        result['role_organization_list'] = []
        if self.role_organization_list is not None:
            for k in self.role_organization_list:
                result['role_organization_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_no') is not None:
            self.company_no = m.get('company_no')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('organization_category') is not None:
            self.organization_category = m.get('organization_category')
        self.role_organization_list = []
        if m.get('role_organization_list') is not None:
            for k in m.get('role_organization_list'):
                temp_model = RoleOrganization()
                self.role_organization_list.append(temp_model.from_map(k))
        return self


class CreateCmportProfitpartnerResponse(TeaModel):
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


class CancelCmportFinanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        financial_no: str = None,
        company_code: str = None,
        company_name: str = None,
        cancel_apply_date: str = None,
        cancel_apply_desc: str = None,
        financial_status: int = None,
        user_did: str = None,
        union_id: int = None,
        channel_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 平台融资编号
        self.financial_no = financial_no
        # 融资企业编码
        self.company_code = company_code
        # 融资企业名称
        self.company_name = company_name
        # 撤销申请日期
        self.cancel_apply_date = cancel_apply_date
        # 撤销申请描述
        self.cancel_apply_desc = cancel_apply_desc
        # 融资状态:
        # 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
        self.financial_status = financial_status
        # 上链账户
        self.user_did = user_did
        # 联盟id
        self.union_id = union_id
        # Channel 名称
        self.channel_name = channel_name

    def validate(self):
        self.validate_required(self.financial_no, 'financial_no')
        self.validate_required(self.company_code, 'company_code')
        self.validate_required(self.company_name, 'company_name')
        self.validate_required(self.cancel_apply_date, 'cancel_apply_date')
        if self.cancel_apply_date is not None:
            self.validate_pattern(self.cancel_apply_date, 'cancel_apply_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.cancel_apply_desc, 'cancel_apply_desc')
        self.validate_required(self.financial_status, 'financial_status')
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.channel_name, 'channel_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.financial_no is not None:
            result['financial_no'] = self.financial_no
        if self.company_code is not None:
            result['company_code'] = self.company_code
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.cancel_apply_date is not None:
            result['cancel_apply_date'] = self.cancel_apply_date
        if self.cancel_apply_desc is not None:
            result['cancel_apply_desc'] = self.cancel_apply_desc
        if self.financial_status is not None:
            result['financial_status'] = self.financial_status
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.channel_name is not None:
            result['channel_name'] = self.channel_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('financial_no') is not None:
            self.financial_no = m.get('financial_no')
        if m.get('company_code') is not None:
            self.company_code = m.get('company_code')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('cancel_apply_date') is not None:
            self.cancel_apply_date = m.get('cancel_apply_date')
        if m.get('cancel_apply_desc') is not None:
            self.cancel_apply_desc = m.get('cancel_apply_desc')
        if m.get('financial_status') is not None:
            self.financial_status = m.get('financial_status')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('channel_name') is not None:
            self.channel_name = m.get('channel_name')
        return self


class CancelCmportFinanceResponse(TeaModel):
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


class NotifyCmportBankRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        financial_no: str = None,
        auditor: str = None,
        audit_date: str = None,
        audit_comment: str = None,
        financial_status: int = None,
        user_did: str = None,
        union_id: int = None,
        channel_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 平台融资编号
        self.financial_no = financial_no
        # 审核人
        self.auditor = auditor
        # 审核时间
        self.audit_date = audit_date
        # 审核评论
        self.audit_comment = audit_comment
        # 融资状态:
        # 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
        self.financial_status = financial_status
        # 上链账户
        self.user_did = user_did
        # 联盟id
        self.union_id = union_id
        # Channel 名称
        self.channel_name = channel_name

    def validate(self):
        self.validate_required(self.financial_no, 'financial_no')
        self.validate_required(self.auditor, 'auditor')
        self.validate_required(self.audit_date, 'audit_date')
        if self.audit_date is not None:
            self.validate_pattern(self.audit_date, 'audit_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.audit_comment, 'audit_comment')
        self.validate_required(self.financial_status, 'financial_status')
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.channel_name, 'channel_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.financial_no is not None:
            result['financial_no'] = self.financial_no
        if self.auditor is not None:
            result['auditor'] = self.auditor
        if self.audit_date is not None:
            result['audit_date'] = self.audit_date
        if self.audit_comment is not None:
            result['audit_comment'] = self.audit_comment
        if self.financial_status is not None:
            result['financial_status'] = self.financial_status
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.channel_name is not None:
            result['channel_name'] = self.channel_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('financial_no') is not None:
            self.financial_no = m.get('financial_no')
        if m.get('auditor') is not None:
            self.auditor = m.get('auditor')
        if m.get('audit_date') is not None:
            self.audit_date = m.get('audit_date')
        if m.get('audit_comment') is not None:
            self.audit_comment = m.get('audit_comment')
        if m.get('financial_status') is not None:
            self.financial_status = m.get('financial_status')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('channel_name') is not None:
            self.channel_name = m.get('channel_name')
        return self


class NotifyCmportBankResponse(TeaModel):
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


class NotifyCmportLoanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        financial_no: str = None,
        confirm_loan_date: str = None,
        confirm_loan_comment: str = None,
        confirm_loan_flag: int = None,
        financial_status: int = None,
        user_did: str = None,
        union_id: int = None,
        channel_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 平台融资编号
        self.financial_no = financial_no
        # 确认放款日期
        self.confirm_loan_date = confirm_loan_date
        # 放款描述
        self.confirm_loan_comment = confirm_loan_comment
        # 流程标记： 1->流程通过;2->流程打回到上一级;3->直接拒绝
        self.confirm_loan_flag = confirm_loan_flag
        # 融资状态:
        # 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
        self.financial_status = financial_status
        # 上链账户
        self.user_did = user_did
        # 联盟id
        self.union_id = union_id
        # Channel 名称
        self.channel_name = channel_name

    def validate(self):
        self.validate_required(self.financial_no, 'financial_no')
        self.validate_required(self.confirm_loan_date, 'confirm_loan_date')
        if self.confirm_loan_date is not None:
            self.validate_pattern(self.confirm_loan_date, 'confirm_loan_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.confirm_loan_comment, 'confirm_loan_comment')
        self.validate_required(self.confirm_loan_flag, 'confirm_loan_flag')
        self.validate_required(self.financial_status, 'financial_status')
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.channel_name, 'channel_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.financial_no is not None:
            result['financial_no'] = self.financial_no
        if self.confirm_loan_date is not None:
            result['confirm_loan_date'] = self.confirm_loan_date
        if self.confirm_loan_comment is not None:
            result['confirm_loan_comment'] = self.confirm_loan_comment
        if self.confirm_loan_flag is not None:
            result['confirm_loan_flag'] = self.confirm_loan_flag
        if self.financial_status is not None:
            result['financial_status'] = self.financial_status
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.channel_name is not None:
            result['channel_name'] = self.channel_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('financial_no') is not None:
            self.financial_no = m.get('financial_no')
        if m.get('confirm_loan_date') is not None:
            self.confirm_loan_date = m.get('confirm_loan_date')
        if m.get('confirm_loan_comment') is not None:
            self.confirm_loan_comment = m.get('confirm_loan_comment')
        if m.get('confirm_loan_flag') is not None:
            self.confirm_loan_flag = m.get('confirm_loan_flag')
        if m.get('financial_status') is not None:
            self.financial_status = m.get('financial_status')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('channel_name') is not None:
            self.channel_name = m.get('channel_name')
        return self


class NotifyCmportLoanResponse(TeaModel):
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


class NotifyCmportRepayRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        financial_no: str = None,
        repay_no: str = None,
        company_name: str = None,
        company_code: str = None,
        product_no: str = None,
        product_name: str = None,
        total_amount: int = None,
        repay_bank: str = None,
        repay_bank_account: str = None,
        financial_status: int = None,
        repay_date: str = None,
        user_did: str = None,
        union_id: int = None,
        channel_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 平台融资编号
        self.financial_no = financial_no
        # 还款编号
        self.repay_no = repay_no
        # 融资企业名称
        self.company_name = company_name
        # 融资企业编码
        self.company_code = company_code
        # 产品编号
        self.product_no = product_no
        # 产品名称
        self.product_name = product_name
        # 还款金额，一期一次性全部还款，加上利息
        self.total_amount = total_amount
        # 还款银行
        self.repay_bank = repay_bank
        # 还款银行账号
        self.repay_bank_account = repay_bank_account
        # 融资状态:
        # 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
        self.financial_status = financial_status
        # 还款日期
        self.repay_date = repay_date
        # 上链账户
        self.user_did = user_did
        # 联盟id
        self.union_id = union_id
        # Channel 名称
        self.channel_name = channel_name

    def validate(self):
        self.validate_required(self.financial_no, 'financial_no')
        self.validate_required(self.repay_no, 'repay_no')
        self.validate_required(self.company_name, 'company_name')
        self.validate_required(self.company_code, 'company_code')
        self.validate_required(self.product_no, 'product_no')
        self.validate_required(self.product_name, 'product_name')
        self.validate_required(self.total_amount, 'total_amount')
        self.validate_required(self.repay_bank, 'repay_bank')
        self.validate_required(self.repay_bank_account, 'repay_bank_account')
        self.validate_required(self.financial_status, 'financial_status')
        self.validate_required(self.repay_date, 'repay_date')
        if self.repay_date is not None:
            self.validate_pattern(self.repay_date, 'repay_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.channel_name, 'channel_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.financial_no is not None:
            result['financial_no'] = self.financial_no
        if self.repay_no is not None:
            result['repay_no'] = self.repay_no
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.company_code is not None:
            result['company_code'] = self.company_code
        if self.product_no is not None:
            result['product_no'] = self.product_no
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.repay_bank is not None:
            result['repay_bank'] = self.repay_bank
        if self.repay_bank_account is not None:
            result['repay_bank_account'] = self.repay_bank_account
        if self.financial_status is not None:
            result['financial_status'] = self.financial_status
        if self.repay_date is not None:
            result['repay_date'] = self.repay_date
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.channel_name is not None:
            result['channel_name'] = self.channel_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('financial_no') is not None:
            self.financial_no = m.get('financial_no')
        if m.get('repay_no') is not None:
            self.repay_no = m.get('repay_no')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('company_code') is not None:
            self.company_code = m.get('company_code')
        if m.get('product_no') is not None:
            self.product_no = m.get('product_no')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('repay_bank') is not None:
            self.repay_bank = m.get('repay_bank')
        if m.get('repay_bank_account') is not None:
            self.repay_bank_account = m.get('repay_bank_account')
        if m.get('financial_status') is not None:
            self.financial_status = m.get('financial_status')
        if m.get('repay_date') is not None:
            self.repay_date = m.get('repay_date')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('channel_name') is not None:
            self.channel_name = m.get('channel_name')
        return self


class NotifyCmportRepayResponse(TeaModel):
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


class ListCmportBankfeeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        account_date: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # accountingDate
        self.account_date = account_date
        # 页码，从1开始
        self.page_num = page_num
        # 页大小，最大100
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.account_date, 'account_date')
        if self.account_date is not None:
            self.validate_pattern(self.account_date, 'account_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.account_date is not None:
            result['account_date'] = self.account_date
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
        if m.get('account_date') is not None:
            self.account_date = m.get('account_date')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListCmportBankfeeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_num: int = None,
        page_size: int = None,
        total_page: int = None,
        bank_fee_list: List[BankFee] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 页码
        self.page_num = page_num
        # 页大小
        self.page_size = page_size
        # 总页数
        self.total_page = total_page
        # 返回还款利息列表
        self.bank_fee_list = bank_fee_list

    def validate(self):
        if self.bank_fee_list:
            for k in self.bank_fee_list:
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
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_page is not None:
            result['total_page'] = self.total_page
        result['bank_fee_list'] = []
        if self.bank_fee_list is not None:
            for k in self.bank_fee_list:
                result['bank_fee_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        self.bank_fee_list = []
        if m.get('bank_fee_list') is not None:
            for k in m.get('bank_fee_list'):
                temp_model = BankFee()
                self.bank_fee_list.append(temp_model.from_map(k))
        return self


class NotifyCmportLogisticsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        financial_no: str = None,
        cargo_right_no: str = None,
        goods_type_name: str = None,
        transit_clause: str = None,
        box_num: int = None,
        box_type: str = None,
        order_info_list: List[OrderInfo] = None,
        user_did: str = None,
        union_id: int = None,
        channel_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 融资编号
        # 
        self.financial_no = financial_no
        # 货权编号
        # 
        self.cargo_right_no = cargo_right_no
        # 获物品名
        # 
        self.goods_type_name = goods_type_name
        # 运输条款
        # 
        self.transit_clause = transit_clause
        # 箱子数量
        # 
        self.box_num = box_num
        # 箱型
        # 
        self.box_type = box_type
        # 运单信息详情列表
        self.order_info_list = order_info_list
        # 上链账户
        self.user_did = user_did
        # 联盟id
        self.union_id = union_id
        # 渠道名称
        self.channel_name = channel_name

    def validate(self):
        self.validate_required(self.financial_no, 'financial_no')
        self.validate_required(self.cargo_right_no, 'cargo_right_no')
        self.validate_required(self.goods_type_name, 'goods_type_name')
        self.validate_required(self.transit_clause, 'transit_clause')
        self.validate_required(self.box_num, 'box_num')
        self.validate_required(self.order_info_list, 'order_info_list')
        if self.order_info_list:
            for k in self.order_info_list:
                if k:
                    k.validate()
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.channel_name, 'channel_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.financial_no is not None:
            result['financial_no'] = self.financial_no
        if self.cargo_right_no is not None:
            result['cargo_right_no'] = self.cargo_right_no
        if self.goods_type_name is not None:
            result['goods_type_name'] = self.goods_type_name
        if self.transit_clause is not None:
            result['transit_clause'] = self.transit_clause
        if self.box_num is not None:
            result['box_num'] = self.box_num
        if self.box_type is not None:
            result['box_type'] = self.box_type
        result['order_info_list'] = []
        if self.order_info_list is not None:
            for k in self.order_info_list:
                result['order_info_list'].append(k.to_map() if k else None)
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.channel_name is not None:
            result['channel_name'] = self.channel_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('financial_no') is not None:
            self.financial_no = m.get('financial_no')
        if m.get('cargo_right_no') is not None:
            self.cargo_right_no = m.get('cargo_right_no')
        if m.get('goods_type_name') is not None:
            self.goods_type_name = m.get('goods_type_name')
        if m.get('transit_clause') is not None:
            self.transit_clause = m.get('transit_clause')
        if m.get('box_num') is not None:
            self.box_num = m.get('box_num')
        if m.get('box_type') is not None:
            self.box_type = m.get('box_type')
        self.order_info_list = []
        if m.get('order_info_list') is not None:
            for k in m.get('order_info_list'):
                temp_model = OrderInfo()
                self.order_info_list.append(temp_model.from_map(k))
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('channel_name') is not None:
            self.channel_name = m.get('channel_name')
        return self


class NotifyCmportLogisticsResponse(TeaModel):
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


