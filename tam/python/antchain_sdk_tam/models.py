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


class FormParam(TeaModel):
    def __init__(
        self,
        oss_access_key_id: str = None,
        callback: str = None,
        key: str = None,
        policy: str = None,
        signature: str = None,
        success_action_status: str = None,
        app_name: str = None,
    ):
        # 
        self.oss_access_key_id = oss_access_key_id
        # 
        self.callback = callback
        # 
        self.key = key
        # 
        self.policy = policy
        # 
        self.signature = signature
        # 
        self.success_action_status = success_action_status
        # 
        self.app_name = app_name

    def validate(self):
        self.validate_required(self.oss_access_key_id, 'oss_access_key_id')
        self.validate_required(self.callback, 'callback')
        self.validate_required(self.key, 'key')
        self.validate_required(self.policy, 'policy')
        self.validate_required(self.signature, 'signature')
        self.validate_required(self.success_action_status, 'success_action_status')
        self.validate_required(self.app_name, 'app_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.oss_access_key_id is not None:
            result['oss_access_key_id'] = self.oss_access_key_id
        if self.callback is not None:
            result['callback'] = self.callback
        if self.key is not None:
            result['key'] = self.key
        if self.policy is not None:
            result['policy'] = self.policy
        if self.signature is not None:
            result['signature'] = self.signature
        if self.success_action_status is not None:
            result['success_action_status'] = self.success_action_status
        if self.app_name is not None:
            result['app_name'] = self.app_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('oss_access_key_id') is not None:
            self.oss_access_key_id = m.get('oss_access_key_id')
        if m.get('callback') is not None:
            self.callback = m.get('callback')
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('policy') is not None:
            self.policy = m.get('policy')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        if m.get('success_action_status') is not None:
            self.success_action_status = m.get('success_action_status')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        return self


class UploadRequest(TeaModel):
    def __init__(
        self,
        stream: str = None,
        filename: str = None,
        user: str = None,
        target_type: str = None,
        target_id: int = None,
    ):
        # 文件流/文件地址
        self.stream = stream
        # 文件名称
        self.filename = filename
        # 内外工号
        self.user = user
        # 附件的关联对象类型
        self.target_type = target_type
        # 附件的关联对象ID
        self.target_id = target_id

    def validate(self):
        self.validate_required(self.stream, 'stream')
        self.validate_required(self.filename, 'filename')
        self.validate_required(self.user, 'user')
        self.validate_required(self.target_type, 'target_type')
        self.validate_required(self.target_id, 'target_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.stream is not None:
            result['stream'] = self.stream
        if self.filename is not None:
            result['filename'] = self.filename
        if self.user is not None:
            result['user'] = self.user
        if self.target_type is not None:
            result['target_type'] = self.target_type
        if self.target_id is not None:
            result['target_id'] = self.target_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('stream') is not None:
            self.stream = m.get('stream')
        if m.get('filename') is not None:
            self.filename = m.get('filename')
        if m.get('user') is not None:
            self.user = m.get('user')
        if m.get('target_type') is not None:
            self.target_type = m.get('target_type')
        if m.get('target_id') is not None:
            self.target_id = m.get('target_id')
        return self


class ResultMap(TeaModel):
    def __init__(
        self,
        name: str = None,
        value: str = None,
    ):
        # name
        self.name = name
        # value
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


class UploadRequestArray(TeaModel):
    def __init__(
        self,
        upload_array: UploadRequest = None,
    ):
        # 文件数据
        self.upload_array = upload_array

    def validate(self):
        self.validate_required(self.upload_array, 'upload_array')
        if self.upload_array:
            self.upload_array.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.upload_array is not None:
            result['upload_array'] = self.upload_array.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('upload_array') is not None:
            temp_model = UploadRequest()
            self.upload_array = temp_model.from_map(m['upload_array'])
        return self


class Emergency(TeaModel):
    def __init__(
        self,
        title: str = None,
        account: str = None,
        name: str = None,
        phone: str = None,
        email: str = None,
        group: str = None,
        status: str = None,
    ):
        # 标题
        self.title = title
        # 账号
        self.account = account
        # 姓名
        self.name = name
        # 手机号
        self.phone = phone
        # 邮箱
        self.email = email
        # 钉钉群
        self.group = group
        # 当前记录状态
        self.status = status

    def validate(self):
        self.validate_required(self.title, 'title')
        self.validate_required(self.account, 'account')
        self.validate_required(self.name, 'name')
        self.validate_required(self.phone, 'phone')
        self.validate_required(self.email, 'email')
        self.validate_required(self.group, 'group')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.title is not None:
            result['title'] = self.title
        if self.account is not None:
            result['account'] = self.account
        if self.name is not None:
            result['name'] = self.name
        if self.phone is not None:
            result['phone'] = self.phone
        if self.email is not None:
            result['email'] = self.email
        if self.group is not None:
            result['group'] = self.group
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('group') is not None:
            self.group = m.get('group')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class AcesProduct(TeaModel):
    def __init__(
        self,
        cn_name: str = None,
        en_name: str = None,
        code: str = None,
        owner: str = None,
        create_time: str = None,
        update_time: str = None,
        description: str = None,
        l_1: str = None,
        l_2: str = None,
    ):
        # 
        self.cn_name = cn_name
        # 
        self.en_name = en_name
        # 
        self.code = code
        # 产品owner
        self.owner = owner
        # 产品创建时间
        self.create_time = create_time
        # 产品修改时间
        self.update_time = update_time
        # 
        self.description = description
        # 
        self.l_1 = l_1
        # 
        self.l_2 = l_2

    def validate(self):
        self.validate_required(self.cn_name, 'cn_name')
        self.validate_required(self.code, 'code')
        self.validate_required(self.create_time, 'create_time')
        self.validate_required(self.update_time, 'update_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cn_name is not None:
            result['cn_name'] = self.cn_name
        if self.en_name is not None:
            result['en_name'] = self.en_name
        if self.code is not None:
            result['code'] = self.code
        if self.owner is not None:
            result['owner'] = self.owner
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.update_time is not None:
            result['update_time'] = self.update_time
        if self.description is not None:
            result['description'] = self.description
        if self.l_1 is not None:
            result['l1'] = self.l_1
        if self.l_2 is not None:
            result['l2'] = self.l_2
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cn_name') is not None:
            self.cn_name = m.get('cn_name')
        if m.get('en_name') is not None:
            self.en_name = m.get('en_name')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('l1') is not None:
            self.l_1 = m.get('l1')
        if m.get('l2') is not None:
            self.l_2 = m.get('l2')
        return self


class ResultOncall(TeaModel):
    def __init__(
        self,
        success: str = None,
        result_msg: str = None,
        id: str = None,
    ):
        # 是否成功
        self.success = success
        # 提示信息
        self.result_msg = result_msg
        # 保存的工单主键id（成功才有）
        self.id = id

    def validate(self):
        self.validate_required(self.success, 'success')
        self.validate_required(self.result_msg, 'result_msg')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class ProjectBase(TeaModel):
    def __init__(
        self,
        id: str = None,
        project_code: str = None,
        title: str = None,
        source: str = None,
        contractor: str = None,
        stage: str = None,
        status: str = None,
        expect_con_date: str = None,
        expect_con_amt: str = None,
        need_pm: str = None,
        need_ad_entry: str = None,
        partner_id: str = None,
        partner_name: str = None,
        aliyun_bpid: str = None,
        customer_id: str = None,
        customer_name: str = None,
        bd_work_no: str = None,
        pm_work_nos: List[str] = None,
        tam_list: List[str] = None,
        bd_list: List[str] = None,
        tm_list: List[str] = None,
        pm_list: List[str] = None,
    ):
        # 项目记录ID
        self.id = id
        # 项目可读编码
        self.project_code = project_code
        # 项目名称
        self.title = title
        # 项目来源：蚂蚁、阿里云、合作伙伴 ProjectSource.getKey() ANTCLOUD("ANTCLOUD", "蚂蚁区块链"), ALIYUN("ALIYUN", "阿里云"), PARTNER("PARTNER", "合作伙伴");
        self.source = source
        # 签约方（总包方）。蚂蚁、阿里云 ANTCLOUD("ANTCLOUD", "蚂蚁区块链"), ALIYUN("ALIYUN", "阿里云"),
        self.contractor = contractor
        # 项目所在阶段
        self.stage = stage
        # 项目状态
        self.status = status
        # 预计签约日期
        self.expect_con_date = expect_con_date
        # 预估签约金额
        self.expect_con_amt = expect_con_amt
        # 是否需要交付。1需要，0不需要
        self.need_pm = need_pm
        # 是否需要提前”进场“。1需要，0不需要。
        self.need_ad_entry = need_ad_entry
        # 合作伙伴Id
        self.partner_id = partner_id
        # partnerName
        self.partner_name = partner_name
        # 阿里云Bpid
        self.aliyun_bpid = aliyun_bpid
        # 客户ID
        self.customer_id = customer_id
        # 客户名称
        self.customer_name = customer_name
        # BD
        self.bd_work_no = bd_work_no
        # PM
        self.pm_work_nos = pm_work_nos
        # 
        self.tam_list = tam_list
        # 
        self.bd_list = bd_list
        # 
        self.tm_list = tm_list
        # 
        self.pm_list = pm_list

    def validate(self):
        if self.expect_con_date is not None:
            self.validate_pattern(self.expect_con_date, 'expect_con_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.project_code is not None:
            result['project_code'] = self.project_code
        if self.title is not None:
            result['title'] = self.title
        if self.source is not None:
            result['source'] = self.source
        if self.contractor is not None:
            result['contractor'] = self.contractor
        if self.stage is not None:
            result['stage'] = self.stage
        if self.status is not None:
            result['status'] = self.status
        if self.expect_con_date is not None:
            result['expect_con_date'] = self.expect_con_date
        if self.expect_con_amt is not None:
            result['expect_con_amt'] = self.expect_con_amt
        if self.need_pm is not None:
            result['need_pm'] = self.need_pm
        if self.need_ad_entry is not None:
            result['need_ad_entry'] = self.need_ad_entry
        if self.partner_id is not None:
            result['partner_id'] = self.partner_id
        if self.partner_name is not None:
            result['partner_name'] = self.partner_name
        if self.aliyun_bpid is not None:
            result['aliyun_bpid'] = self.aliyun_bpid
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.customer_name is not None:
            result['customer_name'] = self.customer_name
        if self.bd_work_no is not None:
            result['bd_work_no'] = self.bd_work_no
        if self.pm_work_nos is not None:
            result['pm_work_nos'] = self.pm_work_nos
        if self.tam_list is not None:
            result['tam_list'] = self.tam_list
        if self.bd_list is not None:
            result['bd_list'] = self.bd_list
        if self.tm_list is not None:
            result['tm_list'] = self.tm_list
        if self.pm_list is not None:
            result['pm_list'] = self.pm_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('project_code') is not None:
            self.project_code = m.get('project_code')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('contractor') is not None:
            self.contractor = m.get('contractor')
        if m.get('stage') is not None:
            self.stage = m.get('stage')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('expect_con_date') is not None:
            self.expect_con_date = m.get('expect_con_date')
        if m.get('expect_con_amt') is not None:
            self.expect_con_amt = m.get('expect_con_amt')
        if m.get('need_pm') is not None:
            self.need_pm = m.get('need_pm')
        if m.get('need_ad_entry') is not None:
            self.need_ad_entry = m.get('need_ad_entry')
        if m.get('partner_id') is not None:
            self.partner_id = m.get('partner_id')
        if m.get('partner_name') is not None:
            self.partner_name = m.get('partner_name')
        if m.get('aliyun_bpid') is not None:
            self.aliyun_bpid = m.get('aliyun_bpid')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('customer_name') is not None:
            self.customer_name = m.get('customer_name')
        if m.get('bd_work_no') is not None:
            self.bd_work_no = m.get('bd_work_no')
        if m.get('pm_work_nos') is not None:
            self.pm_work_nos = m.get('pm_work_nos')
        if m.get('tam_list') is not None:
            self.tam_list = m.get('tam_list')
        if m.get('bd_list') is not None:
            self.bd_list = m.get('bd_list')
        if m.get('tm_list') is not None:
            self.tm_list = m.get('tm_list')
        if m.get('pm_list') is not None:
            self.pm_list = m.get('pm_list')
        return self


class ResultData(TeaModel):
    def __init__(
        self,
        data: ResultMap = None,
    ):
        # data
        self.data = data

    def validate(self):
        self.validate_required(self.data, 'data')
        if self.data:
            self.data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.data is not None:
            result['data'] = self.data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('data') is not None:
            temp_model = ResultMap()
            self.data = temp_model.from_map(m['data'])
        return self


class AcesProject(TeaModel):
    def __init__(
        self,
        project_id: str = None,
        project_name: str = None,
        customer_id: str = None,
        customer_name: str = None,
        project_line: str = None,
        work_line: str = None,
        biz_type: str = None,
        project_big_stage: str = None,
        op_status: str = None,
        deliver: str = None,
        after_sale: bool = None,
        aliyun_bpid: str = None,
        sa: str = None,
        pm: str = None,
        bd: str = None,
        tm: str = None,
        project_stage: str = None,
        project_status: str = None,
        need_deliver: str = None,
        need_ad_entry: str = None,
        need_tender: str = None,
        cre: str = None,
    ):
        # 项目id
        self.project_id = project_id
        # 项目名称
        self.project_name = project_name
        # 客户id
        self.customer_id = customer_id
        # 客户名称
        self.customer_name = customer_name
        # 产品线
        self.project_line = project_line
        # 业务线
        self.work_line = work_line
        # 业务分类
        self.biz_type = biz_type
        # 项目大阶段
        self.project_big_stage = project_big_stage
        # 转维状态
        self.op_status = op_status
        # 交付阶段
        self.deliver = deliver
        # 是否售后
        self.after_sale = after_sale
        # 
        self.aliyun_bpid = aliyun_bpid
        # 解决方案架构师
        self.sa = sa
        # 项目经理
        self.pm = pm
        # 商务经理
        self.bd = bd
        # 交付经理
        self.tm = tm
        # 项目状态
        self.project_stage = project_stage
        # 项目交付状态（未启动、已启动等）
        self.project_status = project_status
        # 是否需要交付 1需要 0不需要
        self.need_deliver = need_deliver
        # 是否需要提前进场 1需要 0不需要
        self.need_ad_entry = need_ad_entry
        # 是否需要竞标 1需要 0不需要
        self.need_tender = need_tender
        # 张三
        self.cre = cre

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.project_name, 'project_name')
        self.validate_required(self.customer_id, 'customer_id')
        self.validate_required(self.customer_name, 'customer_name')
        self.validate_required(self.sa, 'sa')
        self.validate_required(self.pm, 'pm')
        self.validate_required(self.bd, 'bd')
        self.validate_required(self.tm, 'tm')
        self.validate_required(self.need_deliver, 'need_deliver')
        self.validate_required(self.need_ad_entry, 'need_ad_entry')
        self.validate_required(self.need_tender, 'need_tender')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.project_name is not None:
            result['project_name'] = self.project_name
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.customer_name is not None:
            result['customer_name'] = self.customer_name
        if self.project_line is not None:
            result['project_line'] = self.project_line
        if self.work_line is not None:
            result['work_line'] = self.work_line
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.project_big_stage is not None:
            result['project_big_stage'] = self.project_big_stage
        if self.op_status is not None:
            result['op_status'] = self.op_status
        if self.deliver is not None:
            result['deliver'] = self.deliver
        if self.after_sale is not None:
            result['after_sale'] = self.after_sale
        if self.aliyun_bpid is not None:
            result['aliyun_bpid'] = self.aliyun_bpid
        if self.sa is not None:
            result['sa'] = self.sa
        if self.pm is not None:
            result['pm'] = self.pm
        if self.bd is not None:
            result['bd'] = self.bd
        if self.tm is not None:
            result['tm'] = self.tm
        if self.project_stage is not None:
            result['project_stage'] = self.project_stage
        if self.project_status is not None:
            result['project_status'] = self.project_status
        if self.need_deliver is not None:
            result['need_deliver'] = self.need_deliver
        if self.need_ad_entry is not None:
            result['need_ad_entry'] = self.need_ad_entry
        if self.need_tender is not None:
            result['need_tender'] = self.need_tender
        if self.cre is not None:
            result['cre'] = self.cre
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('customer_name') is not None:
            self.customer_name = m.get('customer_name')
        if m.get('project_line') is not None:
            self.project_line = m.get('project_line')
        if m.get('work_line') is not None:
            self.work_line = m.get('work_line')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('project_big_stage') is not None:
            self.project_big_stage = m.get('project_big_stage')
        if m.get('op_status') is not None:
            self.op_status = m.get('op_status')
        if m.get('deliver') is not None:
            self.deliver = m.get('deliver')
        if m.get('after_sale') is not None:
            self.after_sale = m.get('after_sale')
        if m.get('aliyun_bpid') is not None:
            self.aliyun_bpid = m.get('aliyun_bpid')
        if m.get('sa') is not None:
            self.sa = m.get('sa')
        if m.get('pm') is not None:
            self.pm = m.get('pm')
        if m.get('bd') is not None:
            self.bd = m.get('bd')
        if m.get('tm') is not None:
            self.tm = m.get('tm')
        if m.get('project_stage') is not None:
            self.project_stage = m.get('project_stage')
        if m.get('project_status') is not None:
            self.project_status = m.get('project_status')
        if m.get('need_deliver') is not None:
            self.need_deliver = m.get('need_deliver')
        if m.get('need_ad_entry') is not None:
            self.need_ad_entry = m.get('need_ad_entry')
        if m.get('need_tender') is not None:
            self.need_tender = m.get('need_tender')
        if m.get('cre') is not None:
            self.cre = m.get('cre')
        return self


class Upload(TeaModel):
    def __init__(
        self,
        endpoint: str = None,
        file_unique_id: str = None,
        file_url: str = None,
        form_param: FormParam = None,
    ):
        # 
        self.endpoint = endpoint
        # 
        self.file_unique_id = file_unique_id
        # 
        self.file_url = file_url
        # 
        self.form_param = form_param

    def validate(self):
        self.validate_required(self.endpoint, 'endpoint')
        self.validate_required(self.file_unique_id, 'file_unique_id')
        self.validate_required(self.file_url, 'file_url')
        self.validate_required(self.form_param, 'form_param')
        if self.form_param:
            self.form_param.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.endpoint is not None:
            result['endpoint'] = self.endpoint
        if self.file_unique_id is not None:
            result['file_unique_id'] = self.file_unique_id
        if self.file_url is not None:
            result['file_url'] = self.file_url
        if self.form_param is not None:
            result['form_param'] = self.form_param.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('endpoint') is not None:
            self.endpoint = m.get('endpoint')
        if m.get('file_unique_id') is not None:
            self.file_unique_id = m.get('file_unique_id')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        if m.get('form_param') is not None:
            temp_model = FormParam()
            self.form_param = temp_model.from_map(m['form_param'])
        return self


class SubmitRequest(TeaModel):
    def __init__(
        self,
        title: str = None,
        description: str = None,
        influence: str = None,
        account: str = None,
        name: str = None,
        phone: str = None,
        email: str = None,
        group: str = None,
        token: str = None,
        ip: str = None,
        verify_code: str = None,
        biz_no: str = None,
        type: str = None,
        file_url: List[str] = None,
    ):
        # 测试
        self.title = title
        # 问题描述（富文本）
        self.description = description
        # 影响
        self.influence = influence
        # 账号
        self.account = account
        # 姓名
        self.name = name
        # 手机号
        self.phone = phone
        # 邮箱
        self.email = email
        # 钉钉群
        self.group = group
        # 校验令牌（接入RDS校验）
        self.token = token
        # ip
        self.ip = ip
        # 验证码
        self.verify_code = verify_code
        # RDS的bizNo
        self.biz_no = biz_no
        # 公有化PUBLIC、私有化PRIVATE
        self.type = type
        # 上传附件的URL
        self.file_url = file_url

    def validate(self):
        self.validate_required(self.title, 'title')
        self.validate_required(self.description, 'description')
        self.validate_required(self.influence, 'influence')
        self.validate_required(self.account, 'account')
        self.validate_required(self.name, 'name')
        self.validate_required(self.group, 'group')
        self.validate_required(self.token, 'token')
        self.validate_required(self.ip, 'ip')
        self.validate_required(self.verify_code, 'verify_code')
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.title is not None:
            result['title'] = self.title
        if self.description is not None:
            result['description'] = self.description
        if self.influence is not None:
            result['influence'] = self.influence
        if self.account is not None:
            result['account'] = self.account
        if self.name is not None:
            result['name'] = self.name
        if self.phone is not None:
            result['phone'] = self.phone
        if self.email is not None:
            result['email'] = self.email
        if self.group is not None:
            result['group'] = self.group
        if self.token is not None:
            result['token'] = self.token
        if self.ip is not None:
            result['ip'] = self.ip
        if self.verify_code is not None:
            result['verify_code'] = self.verify_code
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.type is not None:
            result['type'] = self.type
        if self.file_url is not None:
            result['file_url'] = self.file_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('influence') is not None:
            self.influence = m.get('influence')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('group') is not None:
            self.group = m.get('group')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('ip') is not None:
            self.ip = m.get('ip')
        if m.get('verify_code') is not None:
            self.verify_code = m.get('verify_code')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        return self


class ResultArray(TeaModel):
    def __init__(
        self,
        result_array: List[str] = None,
    ):
        # 数组
        self.result_array = result_array

    def validate(self):
        self.validate_required(self.result_array, 'result_array')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.result_array is not None:
            result['result_array'] = self.result_array
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('result_array') is not None:
            self.result_array = m.get('result_array')
        return self


class QueryCustomRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        page_no: int = None,
        page_size: int = None,
        project_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 分页页码
        self.page_no = page_no
        # 分页长度，最大不超过50
        self.page_size = page_size
        # 项目id，非必填；可通过项目id查询单个项目
        self.project_id = project_id

    def validate(self):
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 50)
            self.validate_minimum(self.page_size, 'page_size', 10)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.project_id is not None:
            result['project_id'] = self.project_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        return self


class QueryCustomResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        data: List[AcesProject] = None,
        total: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 调用结果是否成功标识
        self.success = success
        # 项目数组
        self.data = data
        # 项目总数
        self.total = total

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
        if self.success is not None:
            result['success'] = self.success
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
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
        if m.get('success') is not None:
            self.success = m.get('success')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = AcesProject()
                self.data.append(temp_model.from_map(k))
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class QueryCodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        l_5code_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 
        self.l_5code_list = l_5code_list

    def validate(self):
        self.validate_required(self.l_5code_list, 'l_5code_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.l_5code_list is not None:
            result['l5code_list'] = self.l_5code_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('l5code_list') is not None:
            self.l_5code_list = m.get('l5code_list')
        return self


class QueryCodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        l_3code_list: List[str] = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 
        self.l_3code_list = l_3code_list
        # 
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
        if self.l_3code_list is not None:
            result['l3code_list'] = self.l_3code_list
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
        if m.get('l3code_list') is not None:
            self.l_3code_list = m.get('l3code_list')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        l_3code_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # l3code的数组
        self.l_3code_list = l_3code_list

    def validate(self):
        self.validate_required(self.l_3code_list, 'l_3code_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.l_3code_list is not None:
            result['l3code_list'] = self.l_3code_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('l3code_list') is not None:
            self.l_3code_list = m.get('l3code_list')
        return self


class QueryProductResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        product_list: List[AcesProduct] = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 
        self.product_list = product_list
        # 
        self.success = success

    def validate(self):
        if self.product_list:
            for k in self.product_list:
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
        result['product_list'] = []
        if self.product_list is not None:
            for k in self.product_list:
                result['product_list'].append(k.to_map() if k else None)
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
        self.product_list = []
        if m.get('product_list') is not None:
            for k in m.get('product_list'):
                temp_model = AcesProduct()
                self.product_list.append(temp_model.from_map(k))
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryProjectPagequeryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        id: str = None,
        project_code: str = None,
        title: str = None,
        customer_id: str = None,
        customer_name: str = None,
        status: List[str] = None,
        stages: List[str] = None,
        bd_work_nos: List[str] = None,
        pm_work_nos: List[str] = None,
        page_size: int = None,
        current_page: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 兼容BD待客下单对外暴露项目Id查询
        self.id = id
        # 项目唯一编码
        self.project_code = project_code
        # 项目名称，支持模糊
        self.title = title
        # 客户id
        self.customer_id = customer_id
        # 客户名称
        self.customer_name = customer_name
        # 项目阶段，支持多个过滤
        self.status = status
        # 项目阶段，支持多个过滤
        self.stages = stages
        # 项目BD工号列表
        self.bd_work_nos = bd_work_nos
        # 交付项目经理工号列表
        self.pm_work_nos = pm_work_nos
        # 页面大小
        self.page_size = page_size
        # 当前页面
        self.current_page = current_page

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.id is not None:
            result['id'] = self.id
        if self.project_code is not None:
            result['project_code'] = self.project_code
        if self.title is not None:
            result['title'] = self.title
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.customer_name is not None:
            result['customer_name'] = self.customer_name
        if self.status is not None:
            result['status'] = self.status
        if self.stages is not None:
            result['stages'] = self.stages
        if self.bd_work_nos is not None:
            result['bd_work_nos'] = self.bd_work_nos
        if self.pm_work_nos is not None:
            result['pm_work_nos'] = self.pm_work_nos
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.current_page is not None:
            result['current_page'] = self.current_page
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('project_code') is not None:
            self.project_code = m.get('project_code')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('customer_name') is not None:
            self.customer_name = m.get('customer_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('stages') is not None:
            self.stages = m.get('stages')
        if m.get('bd_work_nos') is not None:
            self.bd_work_nos = m.get('bd_work_nos')
        if m.get('pm_work_nos') is not None:
            self.pm_work_nos = m.get('pm_work_nos')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        return self


class QueryProjectPagequeryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        project_list: List[ProjectBase] = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据
        self.project_list = project_list
        # 是否成功
        self.success = success

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
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['project_list'] = []
        if self.project_list is not None:
            for k in self.project_list:
                result['project_list'].append(k.to_map() if k else None)
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
        self.project_list = []
        if m.get('project_list') is not None:
            for k in m.get('project_list'):
                temp_model = ProjectBase()
                self.project_list.append(temp_model.from_map(k))
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryProjectGetprojectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        project_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 项目id
        self.project_id = project_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.project_id is not None:
            result['project_id'] = self.project_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        return self


class QueryProjectGetprojectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        project_list: ProjectBase = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 
        self.project_list = project_list
        # 
        self.success = success

    def validate(self):
        if self.project_list:
            self.project_list.validate()

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
        if self.project_list is not None:
            result['project_list'] = self.project_list.to_map()
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
        if m.get('project_list') is not None:
            temp_model = ProjectBase()
            self.project_list = temp_model.from_map(m['project_list'])
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class SaveAoneRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_line: str = None,
        product_name: str = None,
        issue_type: str = None,
        expected_at: str = None,
        author: str = None,
        assigned_to: str = None,
        subject: str = None,
        description: str = None,
        watcher_users: List[str] = None,
        priority_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 产品线
        self.product_line = product_line
        # 产品名称
        self.product_name = product_name
        # 问题类型
        self.issue_type = issue_type
        # 期望日期
        self.expected_at = expected_at
        # 创建者的工号
        self.author = author
        # 解决者/指派者的工号
        self.assigned_to = assigned_to
        # 标题
        self.subject = subject
        # 描述
        self.description = description
        # 跟踪者的工号
        self.watcher_users = watcher_users
        # 优先级
        self.priority_id = priority_id

    def validate(self):
        self.validate_required(self.product_line, 'product_line')
        self.validate_required(self.product_name, 'product_name')
        self.validate_required(self.issue_type, 'issue_type')
        if self.expected_at is not None:
            self.validate_pattern(self.expected_at, 'expected_at', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.author, 'author')
        self.validate_required(self.assigned_to, 'assigned_to')
        self.validate_required(self.subject, 'subject')
        self.validate_required(self.description, 'description')
        self.validate_required(self.watcher_users, 'watcher_users')
        self.validate_required(self.priority_id, 'priority_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_line is not None:
            result['product_line'] = self.product_line
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.issue_type is not None:
            result['issue_type'] = self.issue_type
        if self.expected_at is not None:
            result['expected_at'] = self.expected_at
        if self.author is not None:
            result['author'] = self.author
        if self.assigned_to is not None:
            result['assigned_to'] = self.assigned_to
        if self.subject is not None:
            result['subject'] = self.subject
        if self.description is not None:
            result['description'] = self.description
        if self.watcher_users is not None:
            result['watcher_users'] = self.watcher_users
        if self.priority_id is not None:
            result['priority_id'] = self.priority_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_line') is not None:
            self.product_line = m.get('product_line')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('issue_type') is not None:
            self.issue_type = m.get('issue_type')
        if m.get('expected_at') is not None:
            self.expected_at = m.get('expected_at')
        if m.get('author') is not None:
            self.author = m.get('author')
        if m.get('assigned_to') is not None:
            self.assigned_to = m.get('assigned_to')
        if m.get('subject') is not None:
            self.subject = m.get('subject')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('watcher_users') is not None:
            self.watcher_users = m.get('watcher_users')
        if m.get('priority_id') is not None:
            self.priority_id = m.get('priority_id')
        return self


class SaveAoneResponse(TeaModel):
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
        # 返回数据
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


class QueryAoneRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 项目id
        self.id = id

    def validate(self):
        self.validate_required(self.id, 'id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class QueryAoneResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回值
        self.data = data

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


class ImportScOperationcenterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        submit_request: SubmitRequest = None,
        flag_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 提交表单入参
        self.submit_request = submit_request
        # 站位
        self.flag_id = flag_id

    def validate(self):
        self.validate_required(self.submit_request, 'submit_request')
        if self.submit_request:
            self.submit_request.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.submit_request is not None:
            result['submit_request'] = self.submit_request.to_map()
        if self.flag_id is not None:
            result['flag_id'] = self.flag_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('submit_request') is not None:
            temp_model = SubmitRequest()
            self.submit_request = temp_model.from_map(m['submit_request'])
        if m.get('flag_id') is not None:
            self.flag_id = m.get('flag_id')
        return self


class ImportScOperationcenterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success
        # 保存的工单主键id（成功才有）
        self.id = id

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
        if self.id is not None:
            result['id'] = self.id
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
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class OperateScOperationcenterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        receiver: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 手机号/邮箱
        self.receiver = receiver

    def validate(self):
        self.validate_required(self.receiver, 'receiver')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.receiver is not None:
            result['receiver'] = self.receiver
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('receiver') is not None:
            self.receiver = m.get('receiver')
        return self


class OperateScOperationcenterResponse(TeaModel):
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


class QueryScOperationcenterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # id
        self.id = id

    def validate(self):
        self.validate_required(self.id, 'id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class QueryScOperationcenterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        data: Emergency = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success
        # 事件详情
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
        if self.success is not None:
            result['success'] = self.success
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
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('data') is not None:
            temp_model = Emergency()
            self.data = temp_model.from_map(m['data'])
        return self


class ImportScFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        key: str = None,
        file_name: str = None,
        business_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 
        self.key = key
        # 
        self.file_name = file_name
        # 
        self.business_name = business_name

    def validate(self):
        self.validate_required(self.key, 'key')
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.business_name, 'business_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.key is not None:
            result['key'] = self.key
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.business_name is not None:
            result['business_name'] = self.business_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('business_name') is not None:
            self.business_name = m.get('business_name')
        return self


class ImportScFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        data: Upload = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success
        # 
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
        if self.success is not None:
            result['success'] = self.success
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
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('data') is not None:
            temp_model = Upload()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryScTestRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        return self


class QueryScTestResponse(TeaModel):
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


