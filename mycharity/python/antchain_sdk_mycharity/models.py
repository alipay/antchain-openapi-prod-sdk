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


class BatchDetailVO(TeaModel):
    def __init__(
        self,
        id: str = None,
        combination_id: str = None,
        name: str = None,
        remarks: str = None,
        issue_way: int = None,
        affirmance_receivers: int = None,
        receive_check_way: int = None,
        issue_amount: int = None,
    ):
        # id
        self.id = id
        # 实施内容id
        self.combination_id = combination_id
        # 批次名称
        self.name = name
        # 备注
        self.remarks = remarks
        # 发放方式：【0：自动拨付，1：其他方式拨付，2：快递寄送，3：当面发放，4：服务后确认发放，5：无特定发放方式】
        self.issue_way = issue_way
        # 确认接收人 0发前确认 1发后确认
        self.affirmance_receivers = affirmance_receivers
        # 接收方式（0扫脸验证、1身份证号码验证，2扫二维码验证, 3直接导入
        self.receive_check_way = receive_check_way
        # 发放数量
        self.issue_amount = issue_amount

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.combination_id, 'combination_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.remarks, 'remarks')
        self.validate_required(self.issue_way, 'issue_way')
        self.validate_required(self.affirmance_receivers, 'affirmance_receivers')
        self.validate_required(self.receive_check_way, 'receive_check_way')
        self.validate_required(self.issue_amount, 'issue_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.combination_id is not None:
            result['combination_id'] = self.combination_id
        if self.name is not None:
            result['name'] = self.name
        if self.remarks is not None:
            result['remarks'] = self.remarks
        if self.issue_way is not None:
            result['issue_way'] = self.issue_way
        if self.affirmance_receivers is not None:
            result['affirmance_receivers'] = self.affirmance_receivers
        if self.receive_check_way is not None:
            result['receive_check_way'] = self.receive_check_way
        if self.issue_amount is not None:
            result['issue_amount'] = self.issue_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('combination_id') is not None:
            self.combination_id = m.get('combination_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('remarks') is not None:
            self.remarks = m.get('remarks')
        if m.get('issue_way') is not None:
            self.issue_way = m.get('issue_way')
        if m.get('affirmance_receivers') is not None:
            self.affirmance_receivers = m.get('affirmance_receivers')
        if m.get('receive_check_way') is not None:
            self.receive_check_way = m.get('receive_check_way')
        if m.get('issue_amount') is not None:
            self.issue_amount = m.get('issue_amount')
        return self


class ProjectVO(TeaModel):
    def __init__(
        self,
        id: str = None,
        gmt_create: int = None,
        gmt_modified: int = None,
        pj_name: str = None,
        org_id: str = None,
        public_welfare_direction: str = None,
        test_flag: int = None,
    ):
        # 公益项目ID
        self.id = id
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified
        # 公益项目名称
        self.pj_name = pj_name
        # 机构ID
        self.org_id = org_id
        # 公益方向
        self.public_welfare_direction = public_welfare_direction
        # 测试项目:0正式项目(默认),1测试项目
        self.test_flag = test_flag

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.gmt_create, 'gmt_create')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        self.validate_required(self.pj_name, 'pj_name')
        self.validate_required(self.org_id, 'org_id')
        self.validate_required(self.public_welfare_direction, 'public_welfare_direction')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.pj_name is not None:
            result['pj_name'] = self.pj_name
        if self.org_id is not None:
            result['org_id'] = self.org_id
        if self.public_welfare_direction is not None:
            result['public_welfare_direction'] = self.public_welfare_direction
        if self.test_flag is not None:
            result['test_flag'] = self.test_flag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('pj_name') is not None:
            self.pj_name = m.get('pj_name')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        if m.get('public_welfare_direction') is not None:
            self.public_welfare_direction = m.get('public_welfare_direction')
        if m.get('test_flag') is not None:
            self.test_flag = m.get('test_flag')
        return self


class StagesDetailVO(TeaModel):
    def __init__(
        self,
        id: str = None,
        start_time: int = None,
        end_time: int = None,
        target_money: int = None,
        target_num: int = None,
        note: str = None,
        public_fundraising_no: str = None,
        cover_url: str = None,
        administrative_rate: int = None,
        state: int = None,
        sign_id: str = None,
    ):
        # 分期id
        self.id = id
        # 计划开始时间
        self.start_time = start_time
        # 计划结束时间
        self.end_time = end_time
        # 目标捐赠金额
        self.target_money = target_money
        # 目标捐赠人数
        self.target_num = target_num
        # 说明
        self.note = note
        # 公开募捐编号
        self.public_fundraising_no = public_fundraising_no
        # 静态文件地址‘,’分割
        self.cover_url = cover_url
        # 管理费用金额(单位：分)
        self.administrative_rate = administrative_rate
        # 项目状态，0进行中（默认），1已结项
        self.state = state
        # 签约id,关联签约表
        self.sign_id = sign_id

    def validate(self):
        self.validate_required(self.id, 'id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.target_money is not None:
            result['target_money'] = self.target_money
        if self.target_num is not None:
            result['target_num'] = self.target_num
        if self.note is not None:
            result['note'] = self.note
        if self.public_fundraising_no is not None:
            result['public_fundraising_no'] = self.public_fundraising_no
        if self.cover_url is not None:
            result['cover_url'] = self.cover_url
        if self.administrative_rate is not None:
            result['administrative_rate'] = self.administrative_rate
        if self.state is not None:
            result['state'] = self.state
        if self.sign_id is not None:
            result['sign_id'] = self.sign_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('target_money') is not None:
            self.target_money = m.get('target_money')
        if m.get('target_num') is not None:
            self.target_num = m.get('target_num')
        if m.get('note') is not None:
            self.note = m.get('note')
        if m.get('public_fundraising_no') is not None:
            self.public_fundraising_no = m.get('public_fundraising_no')
        if m.get('cover_url') is not None:
            self.cover_url = m.get('cover_url')
        if m.get('administrative_rate') is not None:
            self.administrative_rate = m.get('administrative_rate')
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('sign_id') is not None:
            self.sign_id = m.get('sign_id')
        return self


class SignUserInfo(TeaModel):
    def __init__(
        self,
        id: str = None,
        alipay_account: str = None,
    ):
        # 签约记录id
        self.id = id
        # 支付宝代扣账号
        self.alipay_account = alipay_account

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 50)
        self.validate_required(self.alipay_account, 'alipay_account')
        if self.alipay_account is not None:
            self.validate_max_length(self.alipay_account, 'alipay_account', 100)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.alipay_account is not None:
            result['alipay_account'] = self.alipay_account
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('alipay_account') is not None:
            self.alipay_account = m.get('alipay_account')
        return self


class SubjectCombinationMessage(TeaModel):
    def __init__(
        self,
        id: str = None,
        name: str = None,
        type: int = None,
        unit: str = None,
        note: str = None,
        price_determined_flag: int = None,
        price: int = None,
        total_num: int = None,
        operate: int = None,
    ):
        # 实施内容id
        self.id = id
        # 实施内容名称
        self.name = name
        # 实施内容类型：0善款类，1实物类、2服务类
        self.type = type
        # 单位
        self.unit = unit
        # 说明
        self.note = note
        # 单价是否固定，0:不固定，1:固定
        self.price_determined_flag = price_determined_flag
        # 单价
        self.price = price
        # 预估发放数量
        self.total_num = total_num
        # 操作类型0-新增，1-修改，2-删除
        self.operate = operate

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 50)
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 20)
        if self.unit is not None:
            self.validate_max_length(self.unit, 'unit', 10)
        if self.note is not None:
            self.validate_max_length(self.note, 'note', 1000)
        self.validate_required(self.operate, 'operate')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.unit is not None:
            result['unit'] = self.unit
        if self.note is not None:
            result['note'] = self.note
        if self.price_determined_flag is not None:
            result['price_determined_flag'] = self.price_determined_flag
        if self.price is not None:
            result['price'] = self.price
        if self.total_num is not None:
            result['total_num'] = self.total_num
        if self.operate is not None:
            result['operate'] = self.operate
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        if m.get('note') is not None:
            self.note = m.get('note')
        if m.get('price_determined_flag') is not None:
            self.price_determined_flag = m.get('price_determined_flag')
        if m.get('price') is not None:
            self.price = m.get('price')
        if m.get('total_num') is not None:
            self.total_num = m.get('total_num')
        if m.get('operate') is not None:
            self.operate = m.get('operate')
        return self


class OpenSubjectCombinationVO(TeaModel):
    def __init__(
        self,
        id: str = None,
        name: str = None,
        type: int = None,
        unit: str = None,
        note: str = None,
        price_determined_flag: int = None,
        price: int = None,
        total_num: int = None,
    ):
        # 实施内容id
        self.id = id
        # 实施内容名称
        self.name = name
        # 实施内容类型
        self.type = type
        # 单位
        self.unit = unit
        # 说明
        self.note = note
        # 单价是否固定，0:不固定，1:固定
        self.price_determined_flag = price_determined_flag
        # 单价
        self.price = price
        # 预估发放个数
        self.total_num = total_num

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
        if self.type is not None:
            result['type'] = self.type
        if self.unit is not None:
            result['unit'] = self.unit
        if self.note is not None:
            result['note'] = self.note
        if self.price_determined_flag is not None:
            result['price_determined_flag'] = self.price_determined_flag
        if self.price is not None:
            result['price'] = self.price
        if self.total_num is not None:
            result['total_num'] = self.total_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        if m.get('note') is not None:
            self.note = m.get('note')
        if m.get('price_determined_flag') is not None:
            self.price_determined_flag = m.get('price_determined_flag')
        if m.get('price') is not None:
            self.price = m.get('price')
        if m.get('total_num') is not None:
            self.total_num = m.get('total_num')
        return self


class ReceivedRecord(TeaModel):
    def __init__(
        self,
        id: str = None,
        receiver_alipay_user_id: str = None,
        receiver_name: str = None,
        receiver_card_no: str = None,
        receiver_phone_no: str = None,
        agent_flag: int = None,
        relationship: str = None,
        beneficiary_message: str = None,
        receiver_org: str = None,
        receive_note: str = None,
        benefit_number: int = None,
        express_address: str = None,
        issue_amount: int = None,
    ):
        # 执行记录id
        self.id = id
        # 支付宝用户标识
        self.receiver_alipay_user_id = receiver_alipay_user_id
        # 领取人姓名
        self.receiver_name = receiver_name
        # 领取人身份证号码
        self.receiver_card_no = receiver_card_no
        # 联系号码
        self.receiver_phone_no = receiver_phone_no
        # 是否是受益人本人 0本人，1代领
        self.agent_flag = agent_flag
        # 领取人和受益人关系
        self.relationship = relationship
        # 受益人信息
        self.beneficiary_message = beneficiary_message
        # 领取人所属机构
        self.receiver_org = receiver_org
        # 领取说明
        self.receive_note = receive_note
        # 受益人数
        self.benefit_number = benefit_number
        # 快递地址
        self.express_address = express_address
        # 发放数量
        self.issue_amount = issue_amount

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 50)
        self.validate_required(self.receiver_alipay_user_id, 'receiver_alipay_user_id')
        if self.receiver_alipay_user_id is not None:
            self.validate_max_length(self.receiver_alipay_user_id, 'receiver_alipay_user_id', 16)
        self.validate_required(self.receiver_name, 'receiver_name')
        if self.receiver_name is not None:
            self.validate_max_length(self.receiver_name, 'receiver_name', 50)
        self.validate_required(self.receiver_card_no, 'receiver_card_no')
        if self.receiver_phone_no is not None:
            self.validate_max_length(self.receiver_phone_no, 'receiver_phone_no', 20)
        self.validate_required(self.agent_flag, 'agent_flag')
        if self.relationship is not None:
            self.validate_max_length(self.relationship, 'relationship', 100)
        if self.beneficiary_message is not None:
            self.validate_max_length(self.beneficiary_message, 'beneficiary_message', 200)
        if self.receiver_org is not None:
            self.validate_max_length(self.receiver_org, 'receiver_org', 100)
        if self.receive_note is not None:
            self.validate_max_length(self.receive_note, 'receive_note', 100)
        if self.benefit_number is not None:
            self.validate_maximum(self.benefit_number, 'benefit_number', 999999999)
            self.validate_minimum(self.benefit_number, 'benefit_number', 1)
        if self.express_address is not None:
            self.validate_max_length(self.express_address, 'express_address', 100)
        if self.issue_amount is not None:
            self.validate_maximum(self.issue_amount, 'issue_amount', 100000000)
            self.validate_minimum(self.issue_amount, 'issue_amount', 1)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.receiver_alipay_user_id is not None:
            result['receiver_alipay_user_id'] = self.receiver_alipay_user_id
        if self.receiver_name is not None:
            result['receiver_name'] = self.receiver_name
        if self.receiver_card_no is not None:
            result['receiver_card_no'] = self.receiver_card_no
        if self.receiver_phone_no is not None:
            result['receiver_phone_no'] = self.receiver_phone_no
        if self.agent_flag is not None:
            result['agent_flag'] = self.agent_flag
        if self.relationship is not None:
            result['relationship'] = self.relationship
        if self.beneficiary_message is not None:
            result['beneficiary_message'] = self.beneficiary_message
        if self.receiver_org is not None:
            result['receiver_org'] = self.receiver_org
        if self.receive_note is not None:
            result['receive_note'] = self.receive_note
        if self.benefit_number is not None:
            result['benefit_number'] = self.benefit_number
        if self.express_address is not None:
            result['express_address'] = self.express_address
        if self.issue_amount is not None:
            result['issue_amount'] = self.issue_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('receiver_alipay_user_id') is not None:
            self.receiver_alipay_user_id = m.get('receiver_alipay_user_id')
        if m.get('receiver_name') is not None:
            self.receiver_name = m.get('receiver_name')
        if m.get('receiver_card_no') is not None:
            self.receiver_card_no = m.get('receiver_card_no')
        if m.get('receiver_phone_no') is not None:
            self.receiver_phone_no = m.get('receiver_phone_no')
        if m.get('agent_flag') is not None:
            self.agent_flag = m.get('agent_flag')
        if m.get('relationship') is not None:
            self.relationship = m.get('relationship')
        if m.get('beneficiary_message') is not None:
            self.beneficiary_message = m.get('beneficiary_message')
        if m.get('receiver_org') is not None:
            self.receiver_org = m.get('receiver_org')
        if m.get('receive_note') is not None:
            self.receive_note = m.get('receive_note')
        if m.get('benefit_number') is not None:
            self.benefit_number = m.get('benefit_number')
        if m.get('express_address') is not None:
            self.express_address = m.get('express_address')
        if m.get('issue_amount') is not None:
            self.issue_amount = m.get('issue_amount')
        return self


class OrgVO(TeaModel):
    def __init__(
        self,
        id: str = None,
        gmt_create: int = None,
        gmt_modified: int = None,
        name: str = None,
        unified_social_credit_code: str = None,
        introduction: str = None,
        sign_time: int = None,
        test_flag: int = None,
    ):
        # 机构ID
        self.id = id
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified
        # 机构名称
        self.name = name
        # 统一社会信用代码
        self.unified_social_credit_code = unified_social_credit_code
        # 机构简介
        self.introduction = introduction
        # 签约时间
        self.sign_time = sign_time
        # 测试项目:0正式机构(默认),1测试机构
        self.test_flag = test_flag

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.gmt_create, 'gmt_create')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        self.validate_required(self.name, 'name')
        self.validate_required(self.unified_social_credit_code, 'unified_social_credit_code')
        self.validate_required(self.introduction, 'introduction')
        self.validate_required(self.sign_time, 'sign_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.name is not None:
            result['name'] = self.name
        if self.unified_social_credit_code is not None:
            result['unified_social_credit_code'] = self.unified_social_credit_code
        if self.introduction is not None:
            result['introduction'] = self.introduction
        if self.sign_time is not None:
            result['sign_time'] = self.sign_time
        if self.test_flag is not None:
            result['test_flag'] = self.test_flag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('unified_social_credit_code') is not None:
            self.unified_social_credit_code = m.get('unified_social_credit_code')
        if m.get('introduction') is not None:
            self.introduction = m.get('introduction')
        if m.get('sign_time') is not None:
            self.sign_time = m.get('sign_time')
        if m.get('test_flag') is not None:
            self.test_flag = m.get('test_flag')
        return self


class CreateAlipaysignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
        org_id: str = None,
        alipay_account: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 签约记录id
        self.id = id
        # 机构id
        self.org_id = org_id
        # 支付宝代扣账号
        self.alipay_account = alipay_account

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 50)
        self.validate_required(self.org_id, 'org_id')
        if self.org_id is not None:
            self.validate_max_length(self.org_id, 'org_id', 50)
        self.validate_required(self.alipay_account, 'alipay_account')
        if self.alipay_account is not None:
            self.validate_max_length(self.alipay_account, 'alipay_account', 100)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.org_id is not None:
            result['org_id'] = self.org_id
        if self.alipay_account is not None:
            result['alipay_account'] = self.alipay_account
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        if m.get('alipay_account') is not None:
            self.alipay_account = m.get('alipay_account')
        return self


class CreateAlipaysignResponse(TeaModel):
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


class QueryAlipaysignStateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 签约记录id
        self.id = id

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 50)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class QueryAlipaysignStateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        state: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 代扣账号签约状态 0.未签约 1.已签约
        self.state = state

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
        if self.state is not None:
            result['state'] = self.state
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('state') is not None:
            self.state = m.get('state')
        return self


class QueryAlipaysignQrcodeRequest(TeaModel):
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
        _map = super().to_map()
        if _map is not None:
            return _map

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


class QueryAlipaysignQrcodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 账号签约二维码url
        self.sign_url = sign_url

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
        if self.sign_url is not None:
            result['sign_url'] = self.sign_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_url') is not None:
            self.sign_url = m.get('sign_url')
        return self


class CreatePersonPermissionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        org_id: str = None,
        role_id: int = None,
        pj_id: str = None,
        alipay_user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 机构ID(第三方指定ID 50字符)
        self.org_id = org_id
        # 项目角色ID(1项目管理员、2项目执行人、3项目财务)
        self.role_id = role_id
        # 项目ID(第三方指定ID 50字符)
        self.pj_id = pj_id
        # 被授权人支付宝用户标识(16字符)
        self.alipay_user_id = alipay_user_id

    def validate(self):
        self.validate_required(self.org_id, 'org_id')
        if self.org_id is not None:
            self.validate_max_length(self.org_id, 'org_id', 50)
        self.validate_required(self.role_id, 'role_id')
        self.validate_required(self.pj_id, 'pj_id')
        if self.pj_id is not None:
            self.validate_max_length(self.pj_id, 'pj_id', 50)
        self.validate_required(self.alipay_user_id, 'alipay_user_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.org_id is not None:
            result['org_id'] = self.org_id
        if self.role_id is not None:
            result['role_id'] = self.role_id
        if self.pj_id is not None:
            result['pj_id'] = self.pj_id
        if self.alipay_user_id is not None:
            result['alipay_user_id'] = self.alipay_user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        if m.get('role_id') is not None:
            self.role_id = m.get('role_id')
        if m.get('pj_id') is not None:
            self.pj_id = m.get('pj_id')
        if m.get('alipay_user_id') is not None:
            self.alipay_user_id = m.get('alipay_user_id')
        return self


class CreatePersonPermissionResponse(TeaModel):
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


class DeletePersonRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        org_id: str = None,
        role_id: int = None,
        pj_id: str = None,
        alipay_user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 机构ID(第三方指定ID 50字符)
        self.org_id = org_id
        # 项目角色ID(1项目管理员、2项目执行人、3项目财务)
        self.role_id = role_id
        # 项目ID(第三方指定ID 50字符)
        self.pj_id = pj_id
        # 被授权人支付宝用户标识（16字符）
        self.alipay_user_id = alipay_user_id

    def validate(self):
        self.validate_required(self.org_id, 'org_id')
        if self.org_id is not None:
            self.validate_max_length(self.org_id, 'org_id', 50)
        self.validate_required(self.role_id, 'role_id')
        self.validate_required(self.pj_id, 'pj_id')
        if self.pj_id is not None:
            self.validate_max_length(self.pj_id, 'pj_id', 50)
        self.validate_required(self.alipay_user_id, 'alipay_user_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.org_id is not None:
            result['org_id'] = self.org_id
        if self.role_id is not None:
            result['role_id'] = self.role_id
        if self.pj_id is not None:
            result['pj_id'] = self.pj_id
        if self.alipay_user_id is not None:
            result['alipay_user_id'] = self.alipay_user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        if m.get('role_id') is not None:
            self.role_id = m.get('role_id')
        if m.get('pj_id') is not None:
            self.pj_id = m.get('pj_id')
        if m.get('alipay_user_id') is not None:
            self.alipay_user_id = m.get('alipay_user_id')
        return self


class DeletePersonResponse(TeaModel):
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


class InitBatchRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
        combination_id: str = None,
        name: str = None,
        remarks: str = None,
        affirmance_receivers: int = None,
        issue_way: int = None,
        receive_check_way: int = None,
        stages_id: str = None,
        issue_amount: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # id
        self.id = id
        # 实施内容id
        self.combination_id = combination_id
        # 批次名称
        self.name = name
        # 发放备注
        self.remarks = remarks
        # 确认接收人 0发前确认 1发后确认
        self.affirmance_receivers = affirmance_receivers
        # 发放方式：【0：自动拨付，1：其他方式拨付，2：快递寄送，3：当面发放，4：服务后确认发放，5：无特定发放方式，6：现场组织】
        self.issue_way = issue_way
        # 接收验证方式（0扫脸验证、1身份证号码验证，2扫二维码验证, 3快递签收验证，4登录确认，5直接导入）
        self.receive_check_way = receive_check_way
        # 分期ID
        self.stages_id = stages_id
        # 发放数量最大值1亿（发后确认- 扫码领取时必填）单位分
        self.issue_amount = issue_amount

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 50)
        self.validate_required(self.combination_id, 'combination_id')
        if self.combination_id is not None:
            self.validate_max_length(self.combination_id, 'combination_id', 50)
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 100)
        self.validate_required(self.remarks, 'remarks')
        if self.remarks is not None:
            self.validate_max_length(self.remarks, 'remarks', 200)
        self.validate_required(self.affirmance_receivers, 'affirmance_receivers')
        self.validate_required(self.issue_way, 'issue_way')
        self.validate_required(self.receive_check_way, 'receive_check_way')
        self.validate_required(self.stages_id, 'stages_id')
        if self.stages_id is not None:
            self.validate_max_length(self.stages_id, 'stages_id', 50)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.combination_id is not None:
            result['combination_id'] = self.combination_id
        if self.name is not None:
            result['name'] = self.name
        if self.remarks is not None:
            result['remarks'] = self.remarks
        if self.affirmance_receivers is not None:
            result['affirmance_receivers'] = self.affirmance_receivers
        if self.issue_way is not None:
            result['issue_way'] = self.issue_way
        if self.receive_check_way is not None:
            result['receive_check_way'] = self.receive_check_way
        if self.stages_id is not None:
            result['stages_id'] = self.stages_id
        if self.issue_amount is not None:
            result['issue_amount'] = self.issue_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('combination_id') is not None:
            self.combination_id = m.get('combination_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('remarks') is not None:
            self.remarks = m.get('remarks')
        if m.get('affirmance_receivers') is not None:
            self.affirmance_receivers = m.get('affirmance_receivers')
        if m.get('issue_way') is not None:
            self.issue_way = m.get('issue_way')
        if m.get('receive_check_way') is not None:
            self.receive_check_way = m.get('receive_check_way')
        if m.get('stages_id') is not None:
            self.stages_id = m.get('stages_id')
        if m.get('issue_amount') is not None:
            self.issue_amount = m.get('issue_amount')
        return self


class InitBatchResponse(TeaModel):
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


class UpdateBatchRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
        status: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # id
        self.id = id
        # 批次暂停状态 2继续发放（领取中），3暂停发放，4领取完成
        self.status = status

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 50)
        self.validate_required(self.status, 'status')
        if self.status is not None:
            self.validate_maximum(self.status, 'status', 4)
            self.validate_minimum(self.status, 'status', 2)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class UpdateBatchResponse(TeaModel):
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


class DeleteBatchRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # id
        self.id = id

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 50)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class DeleteBatchResponse(TeaModel):
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


class CreateStagesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
        pj_id: str = None,
        start_time: int = None,
        end_time: int = None,
        target_money: int = None,
        target_num: int = None,
        note: str = None,
        public_fundraising_no: str = None,
        cover_url: str = None,
        administrative_rate: int = None,
        sign_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 分期id
        self.id = id
        # 项目id
        self.pj_id = pj_id
        # 计划开始时间
        self.start_time = start_time
        # 计划结束时间
        self.end_time = end_time
        # 目标捐赠金额
        self.target_money = target_money
        # 目标捐赠人数
        self.target_num = target_num
        # 说明
        self.note = note
        # 公开募捐编号
        self.public_fundraising_no = public_fundraising_no
        # 静态文件地址‘,’分割
        self.cover_url = cover_url
        # 管理费用金额(单位：分)
        self.administrative_rate = administrative_rate
        # 签约id,关联签约表
        self.sign_id = sign_id

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 50)
        self.validate_required(self.pj_id, 'pj_id')
        if self.pj_id is not None:
            self.validate_max_length(self.pj_id, 'pj_id', 50)
        if self.note is not None:
            self.validate_max_length(self.note, 'note', 1000)
        if self.public_fundraising_no is not None:
            self.validate_max_length(self.public_fundraising_no, 'public_fundraising_no', 50)
        if self.cover_url is not None:
            self.validate_max_length(self.cover_url, 'cover_url', 450)
        if self.sign_id is not None:
            self.validate_max_length(self.sign_id, 'sign_id', 50)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.pj_id is not None:
            result['pj_id'] = self.pj_id
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.target_money is not None:
            result['target_money'] = self.target_money
        if self.target_num is not None:
            result['target_num'] = self.target_num
        if self.note is not None:
            result['note'] = self.note
        if self.public_fundraising_no is not None:
            result['public_fundraising_no'] = self.public_fundraising_no
        if self.cover_url is not None:
            result['cover_url'] = self.cover_url
        if self.administrative_rate is not None:
            result['administrative_rate'] = self.administrative_rate
        if self.sign_id is not None:
            result['sign_id'] = self.sign_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('pj_id') is not None:
            self.pj_id = m.get('pj_id')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('target_money') is not None:
            self.target_money = m.get('target_money')
        if m.get('target_num') is not None:
            self.target_num = m.get('target_num')
        if m.get('note') is not None:
            self.note = m.get('note')
        if m.get('public_fundraising_no') is not None:
            self.public_fundraising_no = m.get('public_fundraising_no')
        if m.get('cover_url') is not None:
            self.cover_url = m.get('cover_url')
        if m.get('administrative_rate') is not None:
            self.administrative_rate = m.get('administrative_rate')
        if m.get('sign_id') is not None:
            self.sign_id = m.get('sign_id')
        return self


class CreateStagesResponse(TeaModel):
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


class QueryBatchRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # id
        self.id = id

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 50)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class QueryBatchResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        batch_detail_vo: BatchDetailVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 批次详情
        self.batch_detail_vo = batch_detail_vo

    def validate(self):
        if self.batch_detail_vo:
            self.batch_detail_vo.validate()

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
        if self.batch_detail_vo is not None:
            result['batch_detail_vo'] = self.batch_detail_vo.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('batch_detail_vo') is not None:
            temp_model = BatchDetailVO()
            self.batch_detail_vo = temp_model.from_map(m['batch_detail_vo'])
        return self


class UpdateStagesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
        start_time: int = None,
        end_time: int = None,
        target_money: int = None,
        target_num: int = None,
        note: str = None,
        public_fundraising_no: str = None,
        cover_url: str = None,
        administrative_rate: int = None,
        state: int = None,
        sign_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 分期id
        self.id = id
        # 计划开始时间
        self.start_time = start_time
        # 计划结束时间
        self.end_time = end_time
        # 目标捐赠金额
        self.target_money = target_money
        # 目标捐赠人数
        self.target_num = target_num
        # 说明
        self.note = note
        # 公开募捐编号
        self.public_fundraising_no = public_fundraising_no
        # 静态文件地址‘,’分割
        self.cover_url = cover_url
        # 管理费用金额(单位：分)
        self.administrative_rate = administrative_rate
        # 项目状态，0进行中（默认），1已结项
        self.state = state
        # 签约id,关联签约表
        self.sign_id = sign_id

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 50)
        if self.note is not None:
            self.validate_max_length(self.note, 'note', 1000)
        if self.public_fundraising_no is not None:
            self.validate_max_length(self.public_fundraising_no, 'public_fundraising_no', 50)
        if self.cover_url is not None:
            self.validate_max_length(self.cover_url, 'cover_url', 450)
        if self.sign_id is not None:
            self.validate_max_length(self.sign_id, 'sign_id', 50)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.target_money is not None:
            result['target_money'] = self.target_money
        if self.target_num is not None:
            result['target_num'] = self.target_num
        if self.note is not None:
            result['note'] = self.note
        if self.public_fundraising_no is not None:
            result['public_fundraising_no'] = self.public_fundraising_no
        if self.cover_url is not None:
            result['cover_url'] = self.cover_url
        if self.administrative_rate is not None:
            result['administrative_rate'] = self.administrative_rate
        if self.state is not None:
            result['state'] = self.state
        if self.sign_id is not None:
            result['sign_id'] = self.sign_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('target_money') is not None:
            self.target_money = m.get('target_money')
        if m.get('target_num') is not None:
            self.target_num = m.get('target_num')
        if m.get('note') is not None:
            self.note = m.get('note')
        if m.get('public_fundraising_no') is not None:
            self.public_fundraising_no = m.get('public_fundraising_no')
        if m.get('cover_url') is not None:
            self.cover_url = m.get('cover_url')
        if m.get('administrative_rate') is not None:
            self.administrative_rate = m.get('administrative_rate')
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('sign_id') is not None:
            self.sign_id = m.get('sign_id')
        return self


class UpdateStagesResponse(TeaModel):
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


class CreateOrgRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
        name: str = None,
        introduction: str = None,
        unified_social_credit_code: str = None,
        test_flag: int = None,
        sign_time: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 50字符，单平台幂等
        self.id = id
        # 50字符 机构名称
        self.name = name
        # 500字符 机构简介
        self.introduction = introduction
        # 社会统一信用代码固定18位
        self.unified_social_credit_code = unified_social_credit_code
        # 测试机构说明:0正式机构(未填写默认0),1测试机构
        self.test_flag = test_flag
        # 13位时间戳 签约时间
        self.sign_time = sign_time

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 50)
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 50)
        self.validate_required(self.introduction, 'introduction')
        if self.introduction is not None:
            self.validate_max_length(self.introduction, 'introduction', 500)
        self.validate_required(self.unified_social_credit_code, 'unified_social_credit_code')
        self.validate_required(self.sign_time, 'sign_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.introduction is not None:
            result['introduction'] = self.introduction
        if self.unified_social_credit_code is not None:
            result['unified_social_credit_code'] = self.unified_social_credit_code
        if self.test_flag is not None:
            result['test_flag'] = self.test_flag
        if self.sign_time is not None:
            result['sign_time'] = self.sign_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('introduction') is not None:
            self.introduction = m.get('introduction')
        if m.get('unified_social_credit_code') is not None:
            self.unified_social_credit_code = m.get('unified_social_credit_code')
        if m.get('test_flag') is not None:
            self.test_flag = m.get('test_flag')
        if m.get('sign_time') is not None:
            self.sign_time = m.get('sign_time')
        return self


class CreateOrgResponse(TeaModel):
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


class QueryStagesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 分期id
        self.id = id

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 50)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class QueryStagesResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        open_stages_detail_vo: StagesDetailVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分期详情
        self.open_stages_detail_vo = open_stages_detail_vo

    def validate(self):
        if self.open_stages_detail_vo:
            self.open_stages_detail_vo.validate()

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
        if self.open_stages_detail_vo is not None:
            result['open_stages_detail_vo'] = self.open_stages_detail_vo.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('open_stages_detail_vo') is not None:
            temp_model = StagesDetailVO()
            self.open_stages_detail_vo = temp_model.from_map(m['open_stages_detail_vo'])
        return self


class UpdateOrgRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
        introduction: str = None,
        unified_social_credit_code: str = None,
        sign_time: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 50字符，单平台幂等
        self.id = id
        # 500字符 机构简介
        self.introduction = introduction
        # 社会统一信用代码固定18位
        self.unified_social_credit_code = unified_social_credit_code
        # 13位时间戳 签约时间
        self.sign_time = sign_time

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 50)
        if self.introduction is not None:
            self.validate_max_length(self.introduction, 'introduction', 500)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.introduction is not None:
            result['introduction'] = self.introduction
        if self.unified_social_credit_code is not None:
            result['unified_social_credit_code'] = self.unified_social_credit_code
        if self.sign_time is not None:
            result['sign_time'] = self.sign_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('introduction') is not None:
            self.introduction = m.get('introduction')
        if m.get('unified_social_credit_code') is not None:
            self.unified_social_credit_code = m.get('unified_social_credit_code')
        if m.get('sign_time') is not None:
            self.sign_time = m.get('sign_time')
        return self


class UpdateOrgResponse(TeaModel):
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


class CreateCombinationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
        stages_id: str = None,
        name: str = None,
        type: int = None,
        unit: str = None,
        note: str = None,
        price_determined_flag: int = None,
        price: int = None,
        total_num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 实施内容id
        self.id = id
        # 分期id
        self.stages_id = stages_id
        # 名称
        self.name = name
        # 实施内容类型：0善款类，1实物类、2服务类
        self.type = type
        # 单位
        self.unit = unit
        # 说明
        self.note = note
        # 单价是否固定，0:不固定，1:固定
        self.price_determined_flag = price_determined_flag
        # 单位分，预估单价
        self.price = price
        # 预估发放数量
        self.total_num = total_num

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 50)
        self.validate_required(self.stages_id, 'stages_id')
        if self.stages_id is not None:
            self.validate_max_length(self.stages_id, 'stages_id', 50)
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 20)
        self.validate_required(self.type, 'type')
        self.validate_required(self.unit, 'unit')
        if self.unit is not None:
            self.validate_max_length(self.unit, 'unit', 10)
        if self.note is not None:
            self.validate_max_length(self.note, 'note', 1000)
        self.validate_required(self.price_determined_flag, 'price_determined_flag')
        self.validate_required(self.price, 'price')
        self.validate_required(self.total_num, 'total_num')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.stages_id is not None:
            result['stages_id'] = self.stages_id
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.unit is not None:
            result['unit'] = self.unit
        if self.note is not None:
            result['note'] = self.note
        if self.price_determined_flag is not None:
            result['price_determined_flag'] = self.price_determined_flag
        if self.price is not None:
            result['price'] = self.price
        if self.total_num is not None:
            result['total_num'] = self.total_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('stages_id') is not None:
            self.stages_id = m.get('stages_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        if m.get('note') is not None:
            self.note = m.get('note')
        if m.get('price_determined_flag') is not None:
            self.price_determined_flag = m.get('price_determined_flag')
        if m.get('price') is not None:
            self.price = m.get('price')
        if m.get('total_num') is not None:
            self.total_num = m.get('total_num')
        return self


class CreateCombinationResponse(TeaModel):
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


class DetailOrgRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 50字符，单平台幂等
        self.id = id

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 50)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class DetailOrgResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        org_vo: OrgVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 机构详情结构体
        self.org_vo = org_vo

    def validate(self):
        if self.org_vo:
            self.org_vo.validate()

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
        if self.org_vo is not None:
            result['org_vo'] = self.org_vo.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('org_vo') is not None:
            temp_model = OrgVO()
            self.org_vo = temp_model.from_map(m['org_vo'])
        return self


class UpdateCombinationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
        name: str = None,
        type: int = None,
        unit: str = None,
        note: str = None,
        price_determined_flag: int = None,
        price: int = None,
        total_num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 实施内容id
        self.id = id
        # 名称
        self.name = name
        # 实施内容类型：0善款类，1实物类、2服务类
        self.type = type
        # 单位
        self.unit = unit
        # 说明
        self.note = note
        # 单价是否固定，0:不固定，1:固定
        self.price_determined_flag = price_determined_flag
        # 单位分，预估单价
        self.price = price
        # 预估发放数量
        self.total_num = total_num

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 50)
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 20)
        if self.unit is not None:
            self.validate_max_length(self.unit, 'unit', 10)
        if self.note is not None:
            self.validate_max_length(self.note, 'note', 1000)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.unit is not None:
            result['unit'] = self.unit
        if self.note is not None:
            result['note'] = self.note
        if self.price_determined_flag is not None:
            result['price_determined_flag'] = self.price_determined_flag
        if self.price is not None:
            result['price'] = self.price
        if self.total_num is not None:
            result['total_num'] = self.total_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        if m.get('note') is not None:
            self.note = m.get('note')
        if m.get('price_determined_flag') is not None:
            self.price_determined_flag = m.get('price_determined_flag')
        if m.get('price') is not None:
            self.price = m.get('price')
        if m.get('total_num') is not None:
            self.total_num = m.get('total_num')
        return self


class UpdateCombinationResponse(TeaModel):
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


class CreateProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
        org_id: str = None,
        pj_name: str = None,
        public_welfare_direction: str = None,
        test_flag: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 50字符，单平台幂等
        self.id = id
        # 50字符 机构id
        self.org_id = org_id
        # 100字符 项目名称
        self.pj_name = pj_name
        # 64字符  公益领域（系统判断是否维护公益领域字典表，数据库存id）
        self.public_welfare_direction = public_welfare_direction
        # 测试项目说明:0正式项目(未填写默认0),1测试项目
        self.test_flag = test_flag

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 50)
        self.validate_required(self.org_id, 'org_id')
        if self.org_id is not None:
            self.validate_max_length(self.org_id, 'org_id', 50)
        self.validate_required(self.pj_name, 'pj_name')
        if self.pj_name is not None:
            self.validate_max_length(self.pj_name, 'pj_name', 100)
        self.validate_required(self.public_welfare_direction, 'public_welfare_direction')
        if self.public_welfare_direction is not None:
            self.validate_max_length(self.public_welfare_direction, 'public_welfare_direction', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.org_id is not None:
            result['org_id'] = self.org_id
        if self.pj_name is not None:
            result['pj_name'] = self.pj_name
        if self.public_welfare_direction is not None:
            result['public_welfare_direction'] = self.public_welfare_direction
        if self.test_flag is not None:
            result['test_flag'] = self.test_flag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        if m.get('pj_name') is not None:
            self.pj_name = m.get('pj_name')
        if m.get('public_welfare_direction') is not None:
            self.public_welfare_direction = m.get('public_welfare_direction')
        if m.get('test_flag') is not None:
            self.test_flag = m.get('test_flag')
        return self


class CreateProjectResponse(TeaModel):
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


class UpdateProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
        pj_name: str = None,
        public_welfare_direction: str = None,
        test_flag: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 50字符，单平台幂等
        self.id = id
        # 100字符 项目名称
        self.pj_name = pj_name
        # 64字符 公益领域（系统判断是否维护公益领域字典表，数据库存id）
        self.public_welfare_direction = public_welfare_direction
        # 测试项目说明:0正式项目(未填写默认0),1测试项目
        self.test_flag = test_flag

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 50)
        if self.pj_name is not None:
            self.validate_max_length(self.pj_name, 'pj_name', 100)
        if self.public_welfare_direction is not None:
            self.validate_max_length(self.public_welfare_direction, 'public_welfare_direction', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.pj_name is not None:
            result['pj_name'] = self.pj_name
        if self.public_welfare_direction is not None:
            result['public_welfare_direction'] = self.public_welfare_direction
        if self.test_flag is not None:
            result['test_flag'] = self.test_flag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('pj_name') is not None:
            self.pj_name = m.get('pj_name')
        if m.get('public_welfare_direction') is not None:
            self.public_welfare_direction = m.get('public_welfare_direction')
        if m.get('test_flag') is not None:
            self.test_flag = m.get('test_flag')
        return self


class UpdateProjectResponse(TeaModel):
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


class DetailProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 50字符，单平台幂等
        self.id = id

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 50)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class DetailProjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        project_vo: ProjectVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 项目结构体
        self.project_vo = project_vo

    def validate(self):
        if self.project_vo:
            self.project_vo.validate()

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
        if self.project_vo is not None:
            result['project_vo'] = self.project_vo.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('project_vo') is not None:
            temp_model = ProjectVO()
            self.project_vo = temp_model.from_map(m['project_vo'])
        return self


class QueryCombinationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 实施内容id
        self.id = id

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 50)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class QueryCombinationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        open_subject_combination_vo: OpenSubjectCombinationVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 实施内容详情
        self.open_subject_combination_vo = open_subject_combination_vo

    def validate(self):
        if self.open_subject_combination_vo:
            self.open_subject_combination_vo.validate()

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
        if self.open_subject_combination_vo is not None:
            result['open_subject_combination_vo'] = self.open_subject_combination_vo.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('open_subject_combination_vo') is not None:
            temp_model = OpenSubjectCombinationVO()
            self.open_subject_combination_vo = temp_model.from_map(m['open_subject_combination_vo'])
        return self


class BatchcreateRecordRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        batch_id: str = None,
        received_record_list: List[ReceivedRecord] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 批次id
        self.batch_id = batch_id
        # 执行记录数组
        self.received_record_list = received_record_list

    def validate(self):
        self.validate_required(self.batch_id, 'batch_id')
        if self.batch_id is not None:
            self.validate_max_length(self.batch_id, 'batch_id', 50)
        self.validate_required(self.received_record_list, 'received_record_list')
        if self.received_record_list:
            for k in self.received_record_list:
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
        if self.batch_id is not None:
            result['batch_id'] = self.batch_id
        result['received_record_list'] = []
        if self.received_record_list is not None:
            for k in self.received_record_list:
                result['received_record_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('batch_id') is not None:
            self.batch_id = m.get('batch_id')
        self.received_record_list = []
        if m.get('received_record_list') is not None:
            for k in m.get('received_record_list'):
                temp_model = ReceivedRecord()
                self.received_record_list.append(temp_model.from_map(k))
        return self


class BatchcreateRecordResponse(TeaModel):
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


class CreateBatchRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
        stages_id: str = None,
        combination_id: str = None,
        name: str = None,
        remarks: str = None,
        issue_way: int = None,
        affirmance_receivers: int = None,
        receive_check_way: int = None,
        issue_amount: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # id
        self.id = id
        # 分期ID
        self.stages_id = stages_id
        # 实施内容id
        self.combination_id = combination_id
        # 批次名称
        self.name = name
        # 备注
        self.remarks = remarks
        # 接收验证方式（0扫脸验证、2扫二维码验证, 3快递签收验证，4登录确认）
        self.issue_way = issue_way
        # 确认接收人 0发前确认 1发后确认
        self.affirmance_receivers = affirmance_receivers
        # 接收方式（0扫脸验证、1身份证号码验证，2扫二维码验证, 3直接导入
        self.receive_check_way = receive_check_way
        # 发放数量最大值1亿（发后确认- 扫码领取时必填）单位分
        self.issue_amount = issue_amount

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 50)
        self.validate_required(self.stages_id, 'stages_id')
        if self.stages_id is not None:
            self.validate_max_length(self.stages_id, 'stages_id', 50)
        self.validate_required(self.combination_id, 'combination_id')
        if self.combination_id is not None:
            self.validate_max_length(self.combination_id, 'combination_id', 50)
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 100)
        self.validate_required(self.remarks, 'remarks')
        if self.remarks is not None:
            self.validate_max_length(self.remarks, 'remarks', 200)
        self.validate_required(self.issue_way, 'issue_way')
        self.validate_required(self.affirmance_receivers, 'affirmance_receivers')
        self.validate_required(self.receive_check_way, 'receive_check_way')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.stages_id is not None:
            result['stages_id'] = self.stages_id
        if self.combination_id is not None:
            result['combination_id'] = self.combination_id
        if self.name is not None:
            result['name'] = self.name
        if self.remarks is not None:
            result['remarks'] = self.remarks
        if self.issue_way is not None:
            result['issue_way'] = self.issue_way
        if self.affirmance_receivers is not None:
            result['affirmance_receivers'] = self.affirmance_receivers
        if self.receive_check_way is not None:
            result['receive_check_way'] = self.receive_check_way
        if self.issue_amount is not None:
            result['issue_amount'] = self.issue_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('stages_id') is not None:
            self.stages_id = m.get('stages_id')
        if m.get('combination_id') is not None:
            self.combination_id = m.get('combination_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('remarks') is not None:
            self.remarks = m.get('remarks')
        if m.get('issue_way') is not None:
            self.issue_way = m.get('issue_way')
        if m.get('affirmance_receivers') is not None:
            self.affirmance_receivers = m.get('affirmance_receivers')
        if m.get('receive_check_way') is not None:
            self.receive_check_way = m.get('receive_check_way')
        if m.get('issue_amount') is not None:
            self.issue_amount = m.get('issue_amount')
        return self


class CreateBatchResponse(TeaModel):
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


class UpdateRecordRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
        express_number: str = None,
        express_company: str = None,
        express_address: str = None,
        pay_serial_number: str = None,
        transfer_method: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # id
        self.id = id
        # 快递单号，50字符（发放方式（issue_way）为快递寄送时可修改）
        self.express_number = express_number
        # 快递公司，50字符（发放方式（issue_way）为快递寄送时可修改）
        self.express_company = express_company
        # 快递地址，100字符（发放方式（issue_way）为快递寄送时可修改）
        self.express_address = express_address
        # 支付流水号，100字符（实施内容为善款类且执行记录状态为待发放（receive_status）必填）
        self.pay_serial_number = pay_serial_number
        # 转账方式，100字符 发放方式为善款类且执行记录状态为待发放（receive_status）必填）
        self.transfer_method = transfer_method

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 50)
        if self.express_number is not None:
            self.validate_max_length(self.express_number, 'express_number', 50)
        if self.express_company is not None:
            self.validate_max_length(self.express_company, 'express_company', 50)
        if self.express_address is not None:
            self.validate_max_length(self.express_address, 'express_address', 100)
        if self.pay_serial_number is not None:
            self.validate_max_length(self.pay_serial_number, 'pay_serial_number', 100)
        if self.transfer_method is not None:
            self.validate_max_length(self.transfer_method, 'transfer_method', 100)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.express_number is not None:
            result['express_number'] = self.express_number
        if self.express_company is not None:
            result['express_company'] = self.express_company
        if self.express_address is not None:
            result['express_address'] = self.express_address
        if self.pay_serial_number is not None:
            result['pay_serial_number'] = self.pay_serial_number
        if self.transfer_method is not None:
            result['transfer_method'] = self.transfer_method
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('express_number') is not None:
            self.express_number = m.get('express_number')
        if m.get('express_company') is not None:
            self.express_company = m.get('express_company')
        if m.get('express_address') is not None:
            self.express_address = m.get('express_address')
        if m.get('pay_serial_number') is not None:
            self.pay_serial_number = m.get('pay_serial_number')
        if m.get('transfer_method') is not None:
            self.transfer_method = m.get('transfer_method')
        return self


class UpdateRecordResponse(TeaModel):
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


class BatchcreateCombinationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        stages_id: str = None,
        combination_message_list: List[SubjectCombinationMessage] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 分期id
        self.stages_id = stages_id
        # 实施内容信息集合
        self.combination_message_list = combination_message_list

    def validate(self):
        self.validate_required(self.stages_id, 'stages_id')
        self.validate_required(self.combination_message_list, 'combination_message_list')
        if self.combination_message_list:
            for k in self.combination_message_list:
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
        if self.stages_id is not None:
            result['stages_id'] = self.stages_id
        result['combination_message_list'] = []
        if self.combination_message_list is not None:
            for k in self.combination_message_list:
                result['combination_message_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('stages_id') is not None:
            self.stages_id = m.get('stages_id')
        self.combination_message_list = []
        if m.get('combination_message_list') is not None:
            for k in m.get('combination_message_list'):
                temp_model = SubjectCombinationMessage()
                self.combination_message_list.append(temp_model.from_map(k))
        return self


class BatchcreateCombinationResponse(TeaModel):
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


class BatchcreateAlipaysignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        org_id: str = None,
        sign_user_info_list: List[SignUserInfo] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 机构id
        self.org_id = org_id
        # 代扣签约账号信息列表
        self.sign_user_info_list = sign_user_info_list

    def validate(self):
        self.validate_required(self.org_id, 'org_id')
        if self.org_id is not None:
            self.validate_max_length(self.org_id, 'org_id', 50)
        self.validate_required(self.sign_user_info_list, 'sign_user_info_list')
        if self.sign_user_info_list:
            for k in self.sign_user_info_list:
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
        if self.org_id is not None:
            result['org_id'] = self.org_id
        result['sign_user_info_list'] = []
        if self.sign_user_info_list is not None:
            for k in self.sign_user_info_list:
                result['sign_user_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        self.sign_user_info_list = []
        if m.get('sign_user_info_list') is not None:
            for k in m.get('sign_user_info_list'):
                temp_model = SignUserInfo()
                self.sign_user_info_list.append(temp_model.from_map(k))
        return self


class BatchcreateAlipaysignResponse(TeaModel):
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


class CreateActivitychainrecordRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        activity_id: str = None,
        alipay_user_id: str = None,
        alipay_user_nick_name: str = None,
        activity_record_id: str = None,
        donate_type: str = None,
        amount: int = None,
        proof_data: str = None,
        donate_goods_name: str = None,
        goods_name: str = None,
        unit: str = None,
        pay_type: str = None,
        donate_time: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部活动ID
        self.activity_id = activity_id
        # 支付宝用户UID：,固定16位长度
        self.alipay_user_id = alipay_user_id
        # 支付宝用户昵称(脱敏)
        self.alipay_user_nick_name = alipay_user_nick_name
        # 捐赠记录ID：(同一租户下需要做幂等)
        self.activity_record_id = activity_record_id
        # 捐赠类型：固定为【point/money】,point为积分兑换捐赠类型，money为购买商品捐钱类型
        self.donate_type = donate_type
        # 捐赠数量：积分个数、金额数量，若为金额(单位为分)
        self.amount = amount
        # 捐赠流水号
        self.proof_data = proof_data
        # 捐赠描述（积分,钱等等）
        self.donate_goods_name = donate_goods_name
        # 商品名称，如：维他奶
        self.goods_name = goods_name
        # 单位：个、CNY
        self.unit = unit
        # 支付方式：【wechat/alipay/bank/exchangePoint】
        self.pay_type = pay_type
        # 固定13位数字
        self.donate_time = donate_time

    def validate(self):
        self.validate_required(self.activity_id, 'activity_id')
        if self.activity_id is not None:
            self.validate_max_length(self.activity_id, 'activity_id', 50)
        self.validate_required(self.alipay_user_id, 'alipay_user_id')
        if self.alipay_user_id is not None:
            self.validate_max_length(self.alipay_user_id, 'alipay_user_id', 16)
        if self.alipay_user_nick_name is not None:
            self.validate_max_length(self.alipay_user_nick_name, 'alipay_user_nick_name', 50)
        self.validate_required(self.activity_record_id, 'activity_record_id')
        if self.activity_record_id is not None:
            self.validate_max_length(self.activity_record_id, 'activity_record_id', 50)
        self.validate_required(self.donate_type, 'donate_type')
        self.validate_required(self.amount, 'amount')
        if self.amount is not None:
            self.validate_maximum(self.amount, 'amount', 999999999)
            self.validate_minimum(self.amount, 'amount', 1)
        if self.proof_data is not None:
            self.validate_max_length(self.proof_data, 'proof_data', 50)
        self.validate_required(self.donate_goods_name, 'donate_goods_name')
        if self.donate_goods_name is not None:
            self.validate_max_length(self.donate_goods_name, 'donate_goods_name', 200)
        if self.goods_name is not None:
            self.validate_max_length(self.goods_name, 'goods_name', 100)
        if self.unit is not None:
            self.validate_max_length(self.unit, 'unit', 50)
        self.validate_required(self.pay_type, 'pay_type')
        self.validate_required(self.donate_time, 'donate_time')

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
        if self.alipay_user_id is not None:
            result['alipay_user_id'] = self.alipay_user_id
        if self.alipay_user_nick_name is not None:
            result['alipay_user_nick_name'] = self.alipay_user_nick_name
        if self.activity_record_id is not None:
            result['activity_record_id'] = self.activity_record_id
        if self.donate_type is not None:
            result['donate_type'] = self.donate_type
        if self.amount is not None:
            result['amount'] = self.amount
        if self.proof_data is not None:
            result['proof_data'] = self.proof_data
        if self.donate_goods_name is not None:
            result['donate_goods_name'] = self.donate_goods_name
        if self.goods_name is not None:
            result['goods_name'] = self.goods_name
        if self.unit is not None:
            result['unit'] = self.unit
        if self.pay_type is not None:
            result['pay_type'] = self.pay_type
        if self.donate_time is not None:
            result['donate_time'] = self.donate_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('activity_id') is not None:
            self.activity_id = m.get('activity_id')
        if m.get('alipay_user_id') is not None:
            self.alipay_user_id = m.get('alipay_user_id')
        if m.get('alipay_user_nick_name') is not None:
            self.alipay_user_nick_name = m.get('alipay_user_nick_name')
        if m.get('activity_record_id') is not None:
            self.activity_record_id = m.get('activity_record_id')
        if m.get('donate_type') is not None:
            self.donate_type = m.get('donate_type')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('proof_data') is not None:
            self.proof_data = m.get('proof_data')
        if m.get('donate_goods_name') is not None:
            self.donate_goods_name = m.get('donate_goods_name')
        if m.get('goods_name') is not None:
            self.goods_name = m.get('goods_name')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        if m.get('pay_type') is not None:
            self.pay_type = m.get('pay_type')
        if m.get('donate_time') is not None:
            self.donate_time = m.get('donate_time')
        return self


class CreateActivitychainrecordResponse(TeaModel):
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


