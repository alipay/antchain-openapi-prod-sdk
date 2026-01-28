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


class ColumnDTO(TeaModel):
    def __init__(
        self,
        table_guid: str = None,
        name: str = None,
        desc: str = None,
        data_type: str = None,
        column_seq: int = None,
        security_level: str = None,
        is_pk: bool = None,
        is_partition: bool = None,
        column_id: str = None,
        code: str = None,
        visit_count: int = None,
    ):
        # tableGuid
        self.table_guid = table_guid
        # name
        self.name = name
        # desc
        self.desc = desc
        # dataType
        self.data_type = data_type
        # columnSeq
        self.column_seq = column_seq
        # securityLevel
        self.security_level = security_level
        # true, false
        self.is_pk = is_pk
        # isPartition
        self.is_partition = is_partition
        # columnId
        self.column_id = column_id
        # code
        self.code = code
        # visitCount
        self.visit_count = visit_count

    def validate(self):
        self.validate_required(self.table_guid, 'table_guid')
        self.validate_required(self.name, 'name')
        self.validate_required(self.desc, 'desc')
        self.validate_required(self.data_type, 'data_type')
        self.validate_required(self.column_seq, 'column_seq')
        self.validate_required(self.security_level, 'security_level')
        self.validate_required(self.is_pk, 'is_pk')
        self.validate_required(self.is_partition, 'is_partition')
        self.validate_required(self.column_id, 'column_id')
        self.validate_required(self.code, 'code')
        self.validate_required(self.visit_count, 'visit_count')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.table_guid is not None:
            result['table_guid'] = self.table_guid
        if self.name is not None:
            result['name'] = self.name
        if self.desc is not None:
            result['desc'] = self.desc
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.column_seq is not None:
            result['column_seq'] = self.column_seq
        if self.security_level is not None:
            result['security_level'] = self.security_level
        if self.is_pk is not None:
            result['is_p_k'] = self.is_pk
        if self.is_partition is not None:
            result['is_partition'] = self.is_partition
        if self.column_id is not None:
            result['column_id'] = self.column_id
        if self.code is not None:
            result['code'] = self.code
        if self.visit_count is not None:
            result['visit_count'] = self.visit_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('table_guid') is not None:
            self.table_guid = m.get('table_guid')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('column_seq') is not None:
            self.column_seq = m.get('column_seq')
        if m.get('security_level') is not None:
            self.security_level = m.get('security_level')
        if m.get('is_p_k') is not None:
            self.is_pk = m.get('is_p_k')
        if m.get('is_partition') is not None:
            self.is_partition = m.get('is_partition')
        if m.get('column_id') is not None:
            self.column_id = m.get('column_id')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('visit_count') is not None:
            self.visit_count = m.get('visit_count')
        return self


class TableDTO(TeaModel):
    def __init__(
        self,
        table_id: str = None,
        sub_type: str = None,
        table_type: str = None,
        phy_file_size: int = None,
        table_life_cycle: str = None,
        create_time: str = None,
        last_ddl_time: str = None,
        node_ids: str = None,
        last_view_time: str = None,
        app_id: str = None,
        partition_key: str = None,
        primary_key: str = None,
        data_layer: str = None,
        owner: str = None,
        owner_name: str = None,
        visit_cnt_3m: str = None,
        env: str = None,
        name: str = None,
        name_cn: str = None,
        gmt_data_update_time: str = None,
        desc: str = None,
        guid: str = None,
        logic_sub_type: str = None,
        tenant_id: str = None,
        biz_unit_id: str = None,
        biz_unit_name: str = None,
        data_cell_jd: str = None,
        data_cell_name: str = None,
        project_id: str = None,
        project_name: str = None,
        develop_mode: str = None,
        model_type: str = None,
        parent_model_id: str = None,
        file_id: str = None,
        columns: List[ColumnDTO] = None,
    ):
        # tableId
        self.table_id = table_id
        # subType
        self.sub_type = sub_type
        # tableType
        self.table_type = table_type
        # phyFileSize
        self.phy_file_size = phy_file_size
        # tableLifeCycle
        self.table_life_cycle = table_life_cycle
        # createTime
        self.create_time = create_time
        # lastDdlTime
        self.last_ddl_time = last_ddl_time
        # nodeIds
        self.node_ids = node_ids
        # lastViewTime
        self.last_view_time = last_view_time
        # appId
        self.app_id = app_id
        # partitionKey
        self.partition_key = partition_key
        # primaryKey
        self.primary_key = primary_key
        # dataLayer
        self.data_layer = data_layer
        # owner
        self.owner = owner
        # ownerName
        self.owner_name = owner_name
        # visitCnt3m
        self.visit_cnt_3m = visit_cnt_3m
        # env
        self.env = env
        # name
        self.name = name
        # nameCn
        self.name_cn = name_cn
        # gmtDataUpdateTime
        self.gmt_data_update_time = gmt_data_update_time
        # desc
        self.desc = desc
        # guid
        self.guid = guid
        # logicSubType
        self.logic_sub_type = logic_sub_type
        # tenantId
        self.tenant_id = tenant_id
        # bizUnitId
        self.biz_unit_id = biz_unit_id
        # bizUnitName
        self.biz_unit_name = biz_unit_name
        # dataCellId
        self.data_cell_jd = data_cell_jd
        # dataCellName
        self.data_cell_name = data_cell_name
        # projectId
        self.project_id = project_id
        # projectName
        self.project_name = project_name
        # developMode
        self.develop_mode = develop_mode
        # modelType
        self.model_type = model_type
        # parentModelId
        self.parent_model_id = parent_model_id
        # fileId
        self.file_id = file_id
        # columns
        self.columns = columns

    def validate(self):
        self.validate_required(self.table_id, 'table_id')
        self.validate_required(self.sub_type, 'sub_type')
        self.validate_required(self.table_type, 'table_type')
        self.validate_required(self.phy_file_size, 'phy_file_size')
        self.validate_required(self.table_life_cycle, 'table_life_cycle')
        self.validate_required(self.create_time, 'create_time')
        self.validate_required(self.last_ddl_time, 'last_ddl_time')
        self.validate_required(self.node_ids, 'node_ids')
        self.validate_required(self.last_view_time, 'last_view_time')
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.partition_key, 'partition_key')
        self.validate_required(self.primary_key, 'primary_key')
        self.validate_required(self.data_layer, 'data_layer')
        self.validate_required(self.owner, 'owner')
        self.validate_required(self.owner_name, 'owner_name')
        self.validate_required(self.visit_cnt_3m, 'visit_cnt_3m')
        self.validate_required(self.env, 'env')
        self.validate_required(self.name, 'name')
        self.validate_required(self.name_cn, 'name_cn')
        self.validate_required(self.gmt_data_update_time, 'gmt_data_update_time')
        self.validate_required(self.desc, 'desc')
        self.validate_required(self.guid, 'guid')
        self.validate_required(self.logic_sub_type, 'logic_sub_type')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_unit_id, 'biz_unit_id')
        self.validate_required(self.biz_unit_name, 'biz_unit_name')
        self.validate_required(self.data_cell_jd, 'data_cell_jd')
        self.validate_required(self.data_cell_name, 'data_cell_name')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.project_name, 'project_name')
        self.validate_required(self.develop_mode, 'develop_mode')
        self.validate_required(self.model_type, 'model_type')
        self.validate_required(self.parent_model_id, 'parent_model_id')
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.columns, 'columns')
        if self.columns:
            for k in self.columns:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.table_id is not None:
            result['table_id'] = self.table_id
        if self.sub_type is not None:
            result['sub_type'] = self.sub_type
        if self.table_type is not None:
            result['table_type'] = self.table_type
        if self.phy_file_size is not None:
            result['phy_file_size'] = self.phy_file_size
        if self.table_life_cycle is not None:
            result['table_life_cycle'] = self.table_life_cycle
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.last_ddl_time is not None:
            result['last_ddl_time'] = self.last_ddl_time
        if self.node_ids is not None:
            result['node_ids'] = self.node_ids
        if self.last_view_time is not None:
            result['last_view_time'] = self.last_view_time
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.partition_key is not None:
            result['partition_key'] = self.partition_key
        if self.primary_key is not None:
            result['primary_key'] = self.primary_key
        if self.data_layer is not None:
            result['data_layer'] = self.data_layer
        if self.owner is not None:
            result['owner'] = self.owner
        if self.owner_name is not None:
            result['owner_name'] = self.owner_name
        if self.visit_cnt_3m is not None:
            result['visit_cnt3m'] = self.visit_cnt_3m
        if self.env is not None:
            result['env'] = self.env
        if self.name is not None:
            result['name'] = self.name
        if self.name_cn is not None:
            result['name_cn'] = self.name_cn
        if self.gmt_data_update_time is not None:
            result['gmt_data_update_time'] = self.gmt_data_update_time
        if self.desc is not None:
            result['desc'] = self.desc
        if self.guid is not None:
            result['guid'] = self.guid
        if self.logic_sub_type is not None:
            result['logic_sub_type'] = self.logic_sub_type
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_unit_id is not None:
            result['biz_unit_id'] = self.biz_unit_id
        if self.biz_unit_name is not None:
            result['biz_unit_name'] = self.biz_unit_name
        if self.data_cell_jd is not None:
            result['data_cell_jd'] = self.data_cell_jd
        if self.data_cell_name is not None:
            result['data_cell_name'] = self.data_cell_name
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.project_name is not None:
            result['project_name'] = self.project_name
        if self.develop_mode is not None:
            result['develop_mode'] = self.develop_mode
        if self.model_type is not None:
            result['model_type'] = self.model_type
        if self.parent_model_id is not None:
            result['parent_model_id'] = self.parent_model_id
        if self.file_id is not None:
            result['file_id'] = self.file_id
        result['columns'] = []
        if self.columns is not None:
            for k in self.columns:
                result['columns'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('table_id') is not None:
            self.table_id = m.get('table_id')
        if m.get('sub_type') is not None:
            self.sub_type = m.get('sub_type')
        if m.get('table_type') is not None:
            self.table_type = m.get('table_type')
        if m.get('phy_file_size') is not None:
            self.phy_file_size = m.get('phy_file_size')
        if m.get('table_life_cycle') is not None:
            self.table_life_cycle = m.get('table_life_cycle')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('last_ddl_time') is not None:
            self.last_ddl_time = m.get('last_ddl_time')
        if m.get('node_ids') is not None:
            self.node_ids = m.get('node_ids')
        if m.get('last_view_time') is not None:
            self.last_view_time = m.get('last_view_time')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('partition_key') is not None:
            self.partition_key = m.get('partition_key')
        if m.get('primary_key') is not None:
            self.primary_key = m.get('primary_key')
        if m.get('data_layer') is not None:
            self.data_layer = m.get('data_layer')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        if m.get('owner_name') is not None:
            self.owner_name = m.get('owner_name')
        if m.get('visit_cnt3m') is not None:
            self.visit_cnt_3m = m.get('visit_cnt3m')
        if m.get('env') is not None:
            self.env = m.get('env')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('name_cn') is not None:
            self.name_cn = m.get('name_cn')
        if m.get('gmt_data_update_time') is not None:
            self.gmt_data_update_time = m.get('gmt_data_update_time')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('guid') is not None:
            self.guid = m.get('guid')
        if m.get('logic_sub_type') is not None:
            self.logic_sub_type = m.get('logic_sub_type')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_unit_id') is not None:
            self.biz_unit_id = m.get('biz_unit_id')
        if m.get('biz_unit_name') is not None:
            self.biz_unit_name = m.get('biz_unit_name')
        if m.get('data_cell_jd') is not None:
            self.data_cell_jd = m.get('data_cell_jd')
        if m.get('data_cell_name') is not None:
            self.data_cell_name = m.get('data_cell_name')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        if m.get('develop_mode') is not None:
            self.develop_mode = m.get('develop_mode')
        if m.get('model_type') is not None:
            self.model_type = m.get('model_type')
        if m.get('parent_model_id') is not None:
            self.parent_model_id = m.get('parent_model_id')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        self.columns = []
        if m.get('columns') is not None:
            for k in m.get('columns'):
                temp_model = ColumnDTO()
                self.columns.append(temp_model.from_map(k))
        return self


class QueryResult(TeaModel):
    def __init__(
        self,
        work_no: str = None,
        nick_name: str = None,
        name: str = None,
        login_account: str = None,
        bu_mail: str = None,
        emp_type: str = None,
    ):
        # 工号
        self.work_no = work_no
        # 花名
        self.nick_name = nick_name
        # 姓名
        self.name = name
        # 域账号
        self.login_account = login_account
        # 企业邮箱
        self.bu_mail = bu_mail
        # 人员类型
        self.emp_type = emp_type

    def validate(self):
        self.validate_required(self.work_no, 'work_no')
        self.validate_required(self.name, 'name')
        self.validate_required(self.login_account, 'login_account')
        self.validate_required(self.bu_mail, 'bu_mail')
        self.validate_required(self.emp_type, 'emp_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.work_no is not None:
            result['work_no'] = self.work_no
        if self.nick_name is not None:
            result['nick_name'] = self.nick_name
        if self.name is not None:
            result['name'] = self.name
        if self.login_account is not None:
            result['login_account'] = self.login_account
        if self.bu_mail is not None:
            result['bu_mail'] = self.bu_mail
        if self.emp_type is not None:
            result['emp_type'] = self.emp_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('work_no') is not None:
            self.work_no = m.get('work_no')
        if m.get('nick_name') is not None:
            self.nick_name = m.get('nick_name')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('login_account') is not None:
            self.login_account = m.get('login_account')
        if m.get('bu_mail') is not None:
            self.bu_mail = m.get('bu_mail')
        if m.get('emp_type') is not None:
            self.emp_type = m.get('emp_type')
        return self


class PublishStatus(TeaModel):
    def __init__(
        self,
        status: str = None,
        error_code: str = None,
        message: str = None,
        error_data: str = None,
    ):
        # status
        self.status = status
        # errorCode
        self.error_code = error_code
        # message
        self.message = message
        # errorData
        self.error_data = error_data

    def validate(self):
        self.validate_required(self.status, 'status')
        self.validate_required(self.error_code, 'error_code')
        self.validate_required(self.message, 'message')
        self.validate_required(self.error_data, 'error_data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.status is not None:
            result['status'] = self.status
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.message is not None:
            result['message'] = self.message
        if self.error_data is not None:
            result['error_data'] = self.error_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('error_data') is not None:
            self.error_data = m.get('error_data')
        return self


class ZhxIrResultStruct(TeaModel):
    def __init__(
        self,
        amt_index_v: str = None,
        trans_num_index_v: str = None,
        user_num_index_v: str = None,
        dt: str = None,
        city_level: str = None,
    ):
        # 日合计交易金额指数
        self.amt_index_v = amt_index_v
        # 日合计交易笔数指标
        self.trans_num_index_v = trans_num_index_v
        # 日合计交易人数指数
        self.user_num_index_v = user_num_index_v
        # 时间
        self.dt = dt
        # 城市等级
        self.city_level = city_level

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.amt_index_v is not None:
            result['amt_index_v'] = self.amt_index_v
        if self.trans_num_index_v is not None:
            result['trans_num_index_v'] = self.trans_num_index_v
        if self.user_num_index_v is not None:
            result['user_num_index_v'] = self.user_num_index_v
        if self.dt is not None:
            result['dt'] = self.dt
        if self.city_level is not None:
            result['city_level'] = self.city_level
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('amt_index_v') is not None:
            self.amt_index_v = m.get('amt_index_v')
        if m.get('trans_num_index_v') is not None:
            self.trans_num_index_v = m.get('trans_num_index_v')
        if m.get('user_num_index_v') is not None:
            self.user_num_index_v = m.get('user_num_index_v')
        if m.get('dt') is not None:
            self.dt = m.get('dt')
        if m.get('city_level') is not None:
            self.city_level = m.get('city_level')
        return self


class PartitionObject(TeaModel):
    def __init__(
        self,
        table_guid: str = None,
        name: str = None,
        create_time: str = None,
        last_modify_time: str = None,
        pangu_file_size: int = None,
        record_cnt: int = None,
    ):
        # tableGuid
        self.table_guid = table_guid
        # name
        self.name = name
        # create_time
        self.create_time = create_time
        # last_modify_time
        self.last_modify_time = last_modify_time
        # panguFileSize
        self.pangu_file_size = pangu_file_size
        # recordCnt 记录数目
        self.record_cnt = record_cnt

    def validate(self):
        self.validate_required(self.table_guid, 'table_guid')
        self.validate_required(self.name, 'name')
        self.validate_required(self.create_time, 'create_time')
        self.validate_required(self.last_modify_time, 'last_modify_time')
        self.validate_required(self.pangu_file_size, 'pangu_file_size')
        self.validate_required(self.record_cnt, 'record_cnt')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.table_guid is not None:
            result['table_guid'] = self.table_guid
        if self.name is not None:
            result['name'] = self.name
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.last_modify_time is not None:
            result['last_modify_time'] = self.last_modify_time
        if self.pangu_file_size is not None:
            result['pangu_file_size'] = self.pangu_file_size
        if self.record_cnt is not None:
            result['record_cnt'] = self.record_cnt
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('table_guid') is not None:
            self.table_guid = m.get('table_guid')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('last_modify_time') is not None:
            self.last_modify_time = m.get('last_modify_time')
        if m.get('pangu_file_size') is not None:
            self.pangu_file_size = m.get('pangu_file_size')
        if m.get('record_cnt') is not None:
            self.record_cnt = m.get('record_cnt')
        return self


class ProduceFeatureResultObj(TeaModel):
    def __init__(
        self,
        project_id: str = None,
        task_id: str = None,
        status: str = None,
        publish_id: str = None,
        supplement_id: str = None,
        file_key: str = None,
        guid: str = None,
        partition: str = None,
    ):
        # projectId
        self.project_id = project_id
        # taskId
        self.task_id = task_id
        # status
        self.status = status
        # publishId
        self.publish_id = publish_id
        # supplementId
        self.supplement_id = supplement_id
        # fileKey
        self.file_key = file_key
        # guid
        self.guid = guid
        # partition
        self.partition = partition

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.status is not None:
            result['status'] = self.status
        if self.publish_id is not None:
            result['publish_id'] = self.publish_id
        if self.supplement_id is not None:
            result['supplement_id'] = self.supplement_id
        if self.file_key is not None:
            result['file_key'] = self.file_key
        if self.guid is not None:
            result['guid'] = self.guid
        if self.partition is not None:
            result['partition'] = self.partition
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('publish_id') is not None:
            self.publish_id = m.get('publish_id')
        if m.get('supplement_id') is not None:
            self.supplement_id = m.get('supplement_id')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        if m.get('guid') is not None:
            self.guid = m.get('guid')
        if m.get('partition') is not None:
            self.partition = m.get('partition')
        return self


class BaseResult(TeaModel):
    def __init__(
        self,
        success: bool = None,
        error_code: str = None,
        message: str = None,
        data: TableDTO = None,
    ):
        # success
        self.success = success
        # errorCode
        self.error_code = error_code
        # message
        self.message = message
        # tabledto
        self.data = data

    def validate(self):
        self.validate_required(self.success, 'success')
        self.validate_required(self.error_code, 'error_code')
        self.validate_required(self.message, 'message')
        self.validate_required(self.data, 'data')
        if self.data:
            self.data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.message is not None:
            result['message'] = self.message
        if self.data is not None:
            result['data'] = self.data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('data') is not None:
            temp_model = TableDTO()
            self.data = temp_model.from_map(m['data'])
        return self


class UserInfoResult(TeaModel):
    def __init__(
        self,
        success: bool = None,
        message: str = None,
        error_code: str = None,
        query_result_list: List[QueryResult] = None,
    ):
        # hr主数据接口调用结果
        self.success = success
        # 调用信息
        self.message = message
        # 错误码
        self.error_code = error_code
        # 查询结果
        self.query_result_list = query_result_list

    def validate(self):
        self.validate_required(self.success, 'success')
        self.validate_required(self.query_result_list, 'query_result_list')
        if self.query_result_list:
            for k in self.query_result_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.message is not None:
            result['message'] = self.message
        if self.error_code is not None:
            result['error_code'] = self.error_code
        result['query_result_list'] = []
        if self.query_result_list is not None:
            for k in self.query_result_list:
                result['query_result_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        self.query_result_list = []
        if m.get('query_result_list') is not None:
            for k in m.get('query_result_list'):
                temp_model = QueryResult()
                self.query_result_list.append(temp_model.from_map(k))
        return self


class NameValuePair(TeaModel):
    def __init__(
        self,
        name: str = None,
        value: str = None,
    ):
        # 
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


class ModelResult(TeaModel):
    def __init__(
        self,
        score: str = None,
        model_id: str = None,
    ):
        # 分数
        self.score = score
        # 模型id
        self.model_id = model_id

    def validate(self):
        self.validate_required(self.score, 'score')
        self.validate_required(self.model_id, 'model_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.score is not None:
            result['score'] = self.score
        if self.model_id is not None:
            result['model_id'] = self.model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        return self


class QueryDuankaEvaluationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_id: str = None,
        order_id: str = None,
        model_list: str = None,
        user_id: str = None,
        user_id_type: str = None,
        encrypt_type: str = None,
        auth_template_no: str = None,
        auth_no: str = None,
        request_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求流水ID
        self.request_id = request_id
        # 用户关联订单号
        self.order_id = order_id
        # 请求模型ID列表（目前仅支持每次请求一个模型），逗号分割
        self.model_list = model_list
        # 用户id
        self.user_id = user_id
        # 用户id类型：
        # "ID_NO"： 身份证号,
        self.user_id_type = user_id_type
        # 加密类型(目前只支持SHA256):
        # "MD5"：MD5（32位小写）,
        # "SHA256" ： SHA256（密文小写），              "SM3"： SM3（密文小写）
        self.encrypt_type = encrypt_type
        # 用户授权模版编号
        self.auth_template_no = auth_template_no
        # 用户授权编码
        self.auth_no = auth_no
        # 客户发起请求时间, 格式："yyyy-MM-dd HH:mm:ss"
        self.request_time = request_time

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.model_list, 'model_list')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.user_id_type, 'user_id_type')
        self.validate_required(self.encrypt_type, 'encrypt_type')
        self.validate_required(self.auth_template_no, 'auth_template_no')
        self.validate_required(self.auth_no, 'auth_no')
        self.validate_required(self.request_time, 'request_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.model_list is not None:
            result['model_list'] = self.model_list
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_id_type is not None:
            result['user_id_type'] = self.user_id_type
        if self.encrypt_type is not None:
            result['encrypt_type'] = self.encrypt_type
        if self.auth_template_no is not None:
            result['auth_template_no'] = self.auth_template_no
        if self.auth_no is not None:
            result['auth_no'] = self.auth_no
        if self.request_time is not None:
            result['request_time'] = self.request_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('model_list') is not None:
            self.model_list = m.get('model_list')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_id_type') is not None:
            self.user_id_type = m.get('user_id_type')
        if m.get('encrypt_type') is not None:
            self.encrypt_type = m.get('encrypt_type')
        if m.get('auth_template_no') is not None:
            self.auth_template_no = m.get('auth_template_no')
        if m.get('auth_no') is not None:
            self.auth_no = m.get('auth_no')
        if m.get('request_time') is not None:
            self.request_time = m.get('request_time')
        return self


class QueryDuankaEvaluationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[ModelResult] = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模型结果，数组返回
        self.result = result
        # 请求流水ID
        self.request_id = request_id

    def validate(self):
        if self.result:
            for k in self.result:
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
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
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
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = ModelResult()
                self.result.append(temp_model.from_map(k))
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class QueryHrUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        nick_name_list: List[str] = None,
        login_account_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 花名列表
        self.nick_name_list = nick_name_list
        # 域账户列表
        self.login_account_list = login_account_list

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.nick_name_list is not None:
            result['nick_name_list'] = self.nick_name_list
        if self.login_account_list is not None:
            result['login_account_list'] = self.login_account_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('nick_name_list') is not None:
            self.nick_name_list = m.get('nick_name_list')
        if m.get('login_account_list') is not None:
            self.login_account_list = m.get('login_account_list')
        return self


class QueryHrUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        user_info_result: UserInfoResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询用户信息结果
        self.user_info_result = user_info_result

    def validate(self):
        if self.user_info_result:
            self.user_info_result.validate()

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
        if self.user_info_result is not None:
            result['user_info_result'] = self.user_info_result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('user_info_result') is not None:
            temp_model = UserInfoResult()
            self.user_info_result = temp_model.from_map(m['user_info_result'])
        return self


class QuerySkyholdResRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        biz_code: str = None,
        key_id: str = None,
        channel_code: str = None,
        customer_id: str = None,
        auth_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 业务biz_code
        self.biz_code = biz_code
        # 查询key
        self.key_id = key_id
        # 渠道code
        self.channel_code = channel_code
        # 客户id
        self.customer_id = customer_id
        # 授权码
        self.auth_code = auth_code

    def validate(self):
        self.validate_required(self.biz_code, 'biz_code')
        self.validate_required(self.key_id, 'key_id')
        self.validate_required(self.channel_code, 'channel_code')
        self.validate_required(self.customer_id, 'customer_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.key_id is not None:
            result['key_id'] = self.key_id
        if self.channel_code is not None:
            result['channel_code'] = self.channel_code
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.auth_code is not None:
            result['auth_code'] = self.auth_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('key_id') is not None:
            self.key_id = m.get('key_id')
        if m.get('channel_code') is not None:
            self.channel_code = m.get('channel_code')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('auth_code') is not None:
            self.auth_code = m.get('auth_code')
        return self


class QuerySkyholdResResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        json_res: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询结果
        self.json_res = json_res

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
        if self.json_res is not None:
            result['json_res'] = self.json_res
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('json_res') is not None:
            self.json_res = m.get('json_res')
        return self


class QueryCommonScoreRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        auth_no: str = None,
        model_id: str = None,
        user_id: str = None,
        user_id_type: str = None,
        encrypt_type: str = None,
        customer_code: str = None,
        trans_no: str = None,
        user_id_hash_encrypt: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 用户授权编码
        self.auth_no = auth_no
        # 模型id
        self.model_id = model_id
        # 用户id（客户身份证号/手机号的md5/sha256散列值）
        self.user_id = user_id
        # 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
        self.user_id_type = user_id_type
        # user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
        self.encrypt_type = encrypt_type
        # 客户编码
        self.customer_code = customer_code
        # 流水号，串联链路用，非必填
        self.trans_no = trans_no
        # encrypt_type类型的散列后的操作，默认为空不加密。
        # 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING
        # 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。
        # 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
        self.user_id_hash_encrypt = user_id_hash_encrypt

    def validate(self):
        self.validate_required(self.auth_no, 'auth_no')
        self.validate_required(self.model_id, 'model_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.user_id_type, 'user_id_type')
        self.validate_required(self.encrypt_type, 'encrypt_type')
        self.validate_required(self.customer_code, 'customer_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.auth_no is not None:
            result['auth_no'] = self.auth_no
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_id_type is not None:
            result['user_id_type'] = self.user_id_type
        if self.encrypt_type is not None:
            result['encrypt_type'] = self.encrypt_type
        if self.customer_code is not None:
            result['customer_code'] = self.customer_code
        if self.trans_no is not None:
            result['trans_no'] = self.trans_no
        if self.user_id_hash_encrypt is not None:
            result['user_id_hash_encrypt'] = self.user_id_hash_encrypt
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('auth_no') is not None:
            self.auth_no = m.get('auth_no')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_id_type') is not None:
            self.user_id_type = m.get('user_id_type')
        if m.get('encrypt_type') is not None:
            self.encrypt_type = m.get('encrypt_type')
        if m.get('customer_code') is not None:
            self.customer_code = m.get('customer_code')
        if m.get('trans_no') is not None:
            self.trans_no = m.get('trans_no')
        if m.get('user_id_hash_encrypt') is not None:
            self.user_id_hash_encrypt = m.get('user_id_hash_encrypt')
        return self


class QueryCommonScoreResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        score: str = None,
        trans_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模型分数
        self.score = score
        # 流水号
        self.trans_no = trans_no

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
        if self.score is not None:
            result['score'] = self.score
        if self.trans_no is not None:
            result['trans_no'] = self.trans_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('trans_no') is not None:
            self.trans_no = m.get('trans_no')
        return self


class SubmitYunfengdieAuditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        params: str = None,
        headers: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 接口调用参数
        self.params = params
        # 请求头参数
        self.headers = headers

    def validate(self):
        self.validate_required(self.params, 'params')
        self.validate_required(self.headers, 'headers')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.params is not None:
            result['params'] = self.params
        if self.headers is not None:
            result['headers'] = self.headers
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('params') is not None:
            self.params = m.get('params')
        if m.get('headers') is not None:
            self.headers = m.get('headers')
        return self


class SubmitYunfengdieAuditResponse(TeaModel):
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
        # 云凤蝶工单提交相应JSON
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


class ImportAistudioOssRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        aliyun_oss_path: str = None,
        ant_oss_path: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 阿里云oss路径
        self.aliyun_oss_path = aliyun_oss_path
        # 主站oss路径
        self.ant_oss_path = ant_oss_path

    def validate(self):
        self.validate_required(self.aliyun_oss_path, 'aliyun_oss_path')
        self.validate_required(self.ant_oss_path, 'ant_oss_path')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.aliyun_oss_path is not None:
            result['aliyun_oss_path'] = self.aliyun_oss_path
        if self.ant_oss_path is not None:
            result['ant_oss_path'] = self.ant_oss_path
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('aliyun_oss_path') is not None:
            self.aliyun_oss_path = m.get('aliyun_oss_path')
        if m.get('ant_oss_path') is not None:
            self.ant_oss_path = m.get('ant_oss_path')
        return self


class ImportAistudioOssResponse(TeaModel):
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


class CheckAistudioModelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        biz_code: str = None,
        biz_type: str = None,
        model_type: int = None,
        service_selector: str = None,
        offline_model_path: str = None,
        online_model_path: str = None,
        script_path: str = None,
        sample_path: str = None,
        remain_list: str = None,
        feature_list: str = None,
        score_col: str = None,
        docker_image: str = None,
        pm_core: int = None,
        pm_mem: int = None,
        batch_size: int = None,
        verification_num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 业务唯一码（可填model_id）
        self.biz_code = biz_code
        # 业务类型（TDI平台填TDI）
        self.biz_type = biz_type
        # 模型类型（1：离线模型，2：在线模型，3：既是离线也是在线）
        self.model_type = model_type
        # 所需要验收服务的list
        # 1. PRESSURE
        # 2. RUNTIMUE
        # 3. SAFETY
        self.service_selector = service_selector
        # 离线模型oss路径
        self.offline_model_path = offline_model_path
        # 在线模型oss路径
        self.online_model_path = online_model_path
        # 模型脚本oss路径
        self.script_path = script_path
        # 验证样本（csv格式，包括保留列、特征列和分数）的OSS路径
        self.sample_path = sample_path
        # 验证样本保留列的list
        self.remain_list = remain_list
        # 验证样本特征列的list
        self.feature_list = feature_list
        # 验证样本分数列
        self.score_col = score_col
        # aistudio docker镜像指定，若未指定，则默认为
        # reg.docker.alibaba-inc.com/aii/aistudio:aistudio-108521006-1633157052-1690290565806
        self.docker_image = docker_image
        # 在线模型压测核数，默认为1
        self.pm_core = pm_core
        # 在线模型压测内存大小（GB），默认为2
        self.pm_mem = pm_mem
        # 离线模型批次大小，默认2000
        self.batch_size = batch_size
        # 验证所用样本数，默认50000
        self.verification_num = verification_num

    def validate(self):
        self.validate_required(self.biz_code, 'biz_code')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.model_type, 'model_type')
        self.validate_required(self.service_selector, 'service_selector')
        self.validate_required(self.script_path, 'script_path')
        self.validate_required(self.sample_path, 'sample_path')
        self.validate_required(self.remain_list, 'remain_list')
        self.validate_required(self.feature_list, 'feature_list')
        self.validate_required(self.score_col, 'score_col')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.model_type is not None:
            result['model_type'] = self.model_type
        if self.service_selector is not None:
            result['service_selector'] = self.service_selector
        if self.offline_model_path is not None:
            result['offline_model_path'] = self.offline_model_path
        if self.online_model_path is not None:
            result['online_model_path'] = self.online_model_path
        if self.script_path is not None:
            result['script_path'] = self.script_path
        if self.sample_path is not None:
            result['sample_path'] = self.sample_path
        if self.remain_list is not None:
            result['remain_list'] = self.remain_list
        if self.feature_list is not None:
            result['feature_list'] = self.feature_list
        if self.score_col is not None:
            result['score_col'] = self.score_col
        if self.docker_image is not None:
            result['docker_image'] = self.docker_image
        if self.pm_core is not None:
            result['pm_core'] = self.pm_core
        if self.pm_mem is not None:
            result['pm_mem'] = self.pm_mem
        if self.batch_size is not None:
            result['batch_size'] = self.batch_size
        if self.verification_num is not None:
            result['verification_num'] = self.verification_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('model_type') is not None:
            self.model_type = m.get('model_type')
        if m.get('service_selector') is not None:
            self.service_selector = m.get('service_selector')
        if m.get('offline_model_path') is not None:
            self.offline_model_path = m.get('offline_model_path')
        if m.get('online_model_path') is not None:
            self.online_model_path = m.get('online_model_path')
        if m.get('script_path') is not None:
            self.script_path = m.get('script_path')
        if m.get('sample_path') is not None:
            self.sample_path = m.get('sample_path')
        if m.get('remain_list') is not None:
            self.remain_list = m.get('remain_list')
        if m.get('feature_list') is not None:
            self.feature_list = m.get('feature_list')
        if m.get('score_col') is not None:
            self.score_col = m.get('score_col')
        if m.get('docker_image') is not None:
            self.docker_image = m.get('docker_image')
        if m.get('pm_core') is not None:
            self.pm_core = m.get('pm_core')
        if m.get('pm_mem') is not None:
            self.pm_mem = m.get('pm_mem')
        if m.get('batch_size') is not None:
            self.batch_size = m.get('batch_size')
        if m.get('verification_num') is not None:
            self.verification_num = m.get('verification_num')
        return self


class CheckAistudioModelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 异步任务id
        self.task_id = task_id

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
        return self


class QueryAistudioModelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 任务id
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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryAistudioModelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_code: str = None,
        pressure_report: str = None,
        runtime_report: str = None,
        safety_report: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务唯一id
        self.biz_code = biz_code
        # 压测报告
        self.pressure_report = pressure_report
        # 运行态报告
        self.runtime_report = runtime_report
        # 安全报告
        self.safety_report = safety_report
        # 任务状态
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
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.pressure_report is not None:
            result['pressure_report'] = self.pressure_report
        if self.runtime_report is not None:
            result['runtime_report'] = self.runtime_report
        if self.safety_report is not None:
            result['safety_report'] = self.safety_report
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
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('pressure_report') is not None:
            self.pressure_report = m.get('pressure_report')
        if m.get('runtime_report') is not None:
            self.runtime_report = m.get('runtime_report')
        if m.get('safety_report') is not None:
            self.safety_report = m.get('safety_report')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class QueryBacktrackScoreRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        auth_no: str = None,
        model_id: str = None,
        user_id: str = None,
        user_id_type: str = None,
        encrypt_type: str = None,
        customer_code: str = None,
        trans_no: str = None,
        user_id_hash_encrypt: str = None,
        sample_date: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 用户授权编码
        self.auth_no = auth_no
        # 模型id
        self.model_id = model_id
        # 用户id（客户身份证号/手机号的md5/sha256/sm3散列值）
        self.user_id = user_id
        # 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
        self.user_id_type = user_id_type
        # user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
        self.encrypt_type = encrypt_type
        # 
        # 客户编码
        self.customer_code = customer_code
        # 流水号，串联链路用，非必填
        self.trans_no = trans_no
        # encrypt_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
        self.user_id_hash_encrypt = user_id_hash_encrypt
        # 回溯采样日期
        self.sample_date = sample_date

    def validate(self):
        self.validate_required(self.auth_no, 'auth_no')
        self.validate_required(self.model_id, 'model_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.user_id_type, 'user_id_type')
        self.validate_required(self.encrypt_type, 'encrypt_type')
        self.validate_required(self.customer_code, 'customer_code')
        self.validate_required(self.sample_date, 'sample_date')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.auth_no is not None:
            result['auth_no'] = self.auth_no
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_id_type is not None:
            result['user_id_type'] = self.user_id_type
        if self.encrypt_type is not None:
            result['encrypt_type'] = self.encrypt_type
        if self.customer_code is not None:
            result['customer_code'] = self.customer_code
        if self.trans_no is not None:
            result['trans_no'] = self.trans_no
        if self.user_id_hash_encrypt is not None:
            result['user_id_hash_encrypt'] = self.user_id_hash_encrypt
        if self.sample_date is not None:
            result['sample_date'] = self.sample_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('auth_no') is not None:
            self.auth_no = m.get('auth_no')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_id_type') is not None:
            self.user_id_type = m.get('user_id_type')
        if m.get('encrypt_type') is not None:
            self.encrypt_type = m.get('encrypt_type')
        if m.get('customer_code') is not None:
            self.customer_code = m.get('customer_code')
        if m.get('trans_no') is not None:
            self.trans_no = m.get('trans_no')
        if m.get('user_id_hash_encrypt') is not None:
            self.user_id_hash_encrypt = m.get('user_id_hash_encrypt')
        if m.get('sample_date') is not None:
            self.sample_date = m.get('sample_date')
        return self


class QueryBacktrackScoreResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        score: str = None,
        trans_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模型分数
        self.score = score
        # 流水号
        self.trans_no = trans_no

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
        if self.score is not None:
            result['score'] = self.score
        if self.trans_no is not None:
            result['trans_no'] = self.trans_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('trans_no') is not None:
            self.trans_no = m.get('trans_no')
        return self


class CheckEasMdetectionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        sql: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # sql
        self.sql = sql

    def validate(self):
        self.validate_required(self.sql, 'sql')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.sql is not None:
            result['sql'] = self.sql
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('sql') is not None:
            self.sql = m.get('sql')
        return self


class CheckEasMdetectionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        check_result: bool = None,
        check_code: str = None,
        check_message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 检查结果
        self.check_result = check_result
        # 检查结果码
        self.check_code = check_code
        # 检查消息
        self.check_message = check_message

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
        if self.check_result is not None:
            result['check_result'] = self.check_result
        if self.check_code is not None:
            result['check_code'] = self.check_code
        if self.check_message is not None:
            result['check_message'] = self.check_message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('check_result') is not None:
            self.check_result = m.get('check_result')
        if m.get('check_code') is not None:
            self.check_code = m.get('check_code')
        if m.get('check_message') is not None:
            self.check_message = m.get('check_message')
        return self


class QueryBpserviceHttpRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        url: str = None,
        headers: List[NameValuePair] = None,
        request_body: str = None,
        http_method: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求地址
        self.url = url
        # 请求头参数
        self.headers = headers
        # 请求体JSON String
        self.request_body = request_body
        # 0-GET，1-POST，2-PUT，3-DELETE
        self.http_method = http_method

    def validate(self):
        self.validate_required(self.url, 'url')
        if self.headers:
            for k in self.headers:
                if k:
                    k.validate()
        self.validate_required(self.http_method, 'http_method')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.url is not None:
            result['url'] = self.url
        result['headers'] = []
        if self.headers is not None:
            for k in self.headers:
                result['headers'].append(k.to_map() if k else None)
        if self.request_body is not None:
            result['request_body'] = self.request_body
        if self.http_method is not None:
            result['http_method'] = self.http_method
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('url') is not None:
            self.url = m.get('url')
        self.headers = []
        if m.get('headers') is not None:
            for k in m.get('headers'):
                temp_model = NameValuePair()
                self.headers.append(temp_model.from_map(k))
        if m.get('request_body') is not None:
            self.request_body = m.get('request_body')
        if m.get('http_method') is not None:
            self.http_method = m.get('http_method')
        return self


class QueryBpserviceHttpResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_body_string: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # http响应body String
        self.response_body_string = response_body_string

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
        if self.response_body_string is not None:
            result['response_body_string'] = self.response_body_string
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_body_string') is not None:
            self.response_body_string = m.get('response_body_string')
        return self


class ImportDataphinTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        name: str = None,
        desc: str = None,
        operator: str = None,
        project_id: str = None,
        project_task_path: str = None,
        tenant_id: str = None,
        params: str = None,
        sql: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # name
        self.name = name
        # 描述
        self.desc = desc
        # 操作人
        self.operator = operator
        # 项目ID
        self.project_id = project_id
        # projectTaskPath项目任务地址
        self.project_task_path = project_task_path
        # tenantId租户id
        self.tenant_id = tenant_id
        # dt=20240226
        self.params = params
        # sql
        self.sql = sql

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.desc, 'desc')
        self.validate_required(self.operator, 'operator')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.project_task_path, 'project_task_path')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.params, 'params')
        self.validate_required(self.sql, 'sql')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.name is not None:
            result['name'] = self.name
        if self.desc is not None:
            result['desc'] = self.desc
        if self.operator is not None:
            result['operator'] = self.operator
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.project_task_path is not None:
            result['project_task_path'] = self.project_task_path
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.params is not None:
            result['params'] = self.params
        if self.sql is not None:
            result['sql'] = self.sql
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('project_task_path') is not None:
            self.project_task_path = m.get('project_task_path')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('params') is not None:
            self.params = m.get('params')
        if m.get('sql') is not None:
            self.sql = m.get('sql')
        return self


class ImportDataphinTaskResponse(TeaModel):
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
        # 结果数据
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


class SyncOssOdpsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        oss_path: str = None,
        oss_filename: str = None,
        source_list: List[str] = None,
        oss_ds_id: str = None,
        oss_ds_name: str = None,
        odps_ds_id: str = None,
        odps_ds_name: str = None,
        odps_project_name: str = None,
        odps_table_name: str = None,
        odps_guid_table_name: str = None,
        partition_condition: str = None,
        where: str = None,
        column_list: List[str] = None,
        name: str = None,
        desc: str = None,
        operator: str = None,
        project_id: str = None,
        project_task_path: str = None,
        tenant_id: str = None,
        params: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # ossPath
        self.oss_path = oss_path
        # ossFilename
        self.oss_filename = oss_filename
        # 来源列表
        self.source_list = source_list
        # oss ds id
        self.oss_ds_id = oss_ds_id
        # ossDsName
        self.oss_ds_name = oss_ds_name
        # odpsDsId
        self.odps_ds_id = odps_ds_id
        # odps_ds_name
        self.odps_ds_name = odps_ds_name
        # odpsProjectName
        self.odps_project_name = odps_project_name
        # odpsTableName
        self.odps_table_name = odps_table_name
        # odpsGuidTableName
        self.odps_guid_table_name = odps_guid_table_name
        # partitionCondition
        self.partition_condition = partition_condition
        # where
        self.where = where
        # columnList
        self.column_list = column_list
        # name
        self.name = name
        # 描述
        self.desc = desc
        # 操作人
        self.operator = operator
        # projectId项目id
        self.project_id = project_id
        # projectTaskPath 项目任务地址
        self.project_task_path = project_task_path
        # 租户id
        self.tenant_id = tenant_id
        # 参数
        self.params = params

    def validate(self):
        self.validate_required(self.oss_path, 'oss_path')
        self.validate_required(self.oss_filename, 'oss_filename')
        self.validate_required(self.oss_ds_id, 'oss_ds_id')
        self.validate_required(self.oss_ds_name, 'oss_ds_name')
        self.validate_required(self.odps_ds_id, 'odps_ds_id')
        self.validate_required(self.odps_ds_name, 'odps_ds_name')
        self.validate_required(self.odps_project_name, 'odps_project_name')
        self.validate_required(self.odps_table_name, 'odps_table_name')
        self.validate_required(self.odps_guid_table_name, 'odps_guid_table_name')
        self.validate_required(self.partition_condition, 'partition_condition')
        self.validate_required(self.column_list, 'column_list')
        self.validate_required(self.name, 'name')
        self.validate_required(self.operator, 'operator')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.project_task_path, 'project_task_path')
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.oss_path is not None:
            result['oss_path'] = self.oss_path
        if self.oss_filename is not None:
            result['oss_filename'] = self.oss_filename
        if self.source_list is not None:
            result['source_list'] = self.source_list
        if self.oss_ds_id is not None:
            result['oss_ds_id'] = self.oss_ds_id
        if self.oss_ds_name is not None:
            result['oss_ds_name'] = self.oss_ds_name
        if self.odps_ds_id is not None:
            result['odps_ds_id'] = self.odps_ds_id
        if self.odps_ds_name is not None:
            result['odps_ds_name'] = self.odps_ds_name
        if self.odps_project_name is not None:
            result['odps_project_name'] = self.odps_project_name
        if self.odps_table_name is not None:
            result['odps_table_name'] = self.odps_table_name
        if self.odps_guid_table_name is not None:
            result['odps_guid_table_name'] = self.odps_guid_table_name
        if self.partition_condition is not None:
            result['partition_condition'] = self.partition_condition
        if self.where is not None:
            result['where'] = self.where
        if self.column_list is not None:
            result['column_list'] = self.column_list
        if self.name is not None:
            result['name'] = self.name
        if self.desc is not None:
            result['desc'] = self.desc
        if self.operator is not None:
            result['operator'] = self.operator
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.project_task_path is not None:
            result['project_task_path'] = self.project_task_path
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.params is not None:
            result['params'] = self.params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('oss_path') is not None:
            self.oss_path = m.get('oss_path')
        if m.get('oss_filename') is not None:
            self.oss_filename = m.get('oss_filename')
        if m.get('source_list') is not None:
            self.source_list = m.get('source_list')
        if m.get('oss_ds_id') is not None:
            self.oss_ds_id = m.get('oss_ds_id')
        if m.get('oss_ds_name') is not None:
            self.oss_ds_name = m.get('oss_ds_name')
        if m.get('odps_ds_id') is not None:
            self.odps_ds_id = m.get('odps_ds_id')
        if m.get('odps_ds_name') is not None:
            self.odps_ds_name = m.get('odps_ds_name')
        if m.get('odps_project_name') is not None:
            self.odps_project_name = m.get('odps_project_name')
        if m.get('odps_table_name') is not None:
            self.odps_table_name = m.get('odps_table_name')
        if m.get('odps_guid_table_name') is not None:
            self.odps_guid_table_name = m.get('odps_guid_table_name')
        if m.get('partition_condition') is not None:
            self.partition_condition = m.get('partition_condition')
        if m.get('where') is not None:
            self.where = m.get('where')
        if m.get('column_list') is not None:
            self.column_list = m.get('column_list')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('project_task_path') is not None:
            self.project_task_path = m.get('project_task_path')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('params') is not None:
            self.params = m.get('params')
        return self


class SyncOssOdpsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        request_id: str = None,
        code: str = None,
        message: str = None,
        trace_id: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # requestId
        self.request_id = request_id
        # code
        self.code = code
        # message
        self.message = message
        # trace_id
        self.trace_id = trace_id
        # data
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
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
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
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class SyncOpdsOssRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        oss_path: str = None,
        oss_filename: str = None,
        oss_ds_id: str = None,
        oss_ds_name: str = None,
        odps_ds_id: str = None,
        odps_ds_name: str = None,
        odps_project_name: str = None,
        odps_table_name: str = None,
        odps_guid_table_name: str = None,
        partition_condition: str = None,
        where: str = None,
        column_list: List[str] = None,
        name: str = None,
        desc: str = None,
        operator: str = None,
        project_id: str = None,
        project_task_path: str = None,
        tenant_id: str = None,
        params: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # ossPath
        self.oss_path = oss_path
        # ossFilename
        self.oss_filename = oss_filename
        # ossDsId
        self.oss_ds_id = oss_ds_id
        # ossDsName
        self.oss_ds_name = oss_ds_name
        # odpsDsId
        self.odps_ds_id = odps_ds_id
        # odpsDsName
        self.odps_ds_name = odps_ds_name
        # odpsProjectName
        self.odps_project_name = odps_project_name
        # odpsTableName
        self.odps_table_name = odps_table_name
        # odpsGuidTableName
        self.odps_guid_table_name = odps_guid_table_name
        # 分区条件
        self.partition_condition = partition_condition
        # 过滤条件
        self.where = where
        # 字段列表
        self.column_list = column_list
        # name
        self.name = name
        # 任务描述
        self.desc = desc
        # 操作人
        self.operator = operator
        # 项目空间id
        self.project_id = project_id
        # project_task_path
        self.project_task_path = project_task_path
        # 租户id
        self.tenant_id = tenant_id
        # 参数
        self.params = params

    def validate(self):
        self.validate_required(self.oss_path, 'oss_path')
        self.validate_required(self.oss_filename, 'oss_filename')
        self.validate_required(self.oss_ds_id, 'oss_ds_id')
        self.validate_required(self.oss_ds_name, 'oss_ds_name')
        self.validate_required(self.odps_ds_id, 'odps_ds_id')
        self.validate_required(self.odps_ds_name, 'odps_ds_name')
        self.validate_required(self.odps_project_name, 'odps_project_name')
        self.validate_required(self.odps_table_name, 'odps_table_name')
        self.validate_required(self.odps_guid_table_name, 'odps_guid_table_name')
        self.validate_required(self.partition_condition, 'partition_condition')
        self.validate_required(self.where, 'where')
        self.validate_required(self.column_list, 'column_list')
        self.validate_required(self.name, 'name')
        self.validate_required(self.desc, 'desc')
        self.validate_required(self.operator, 'operator')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.project_task_path, 'project_task_path')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.params, 'params')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.oss_path is not None:
            result['oss_path'] = self.oss_path
        if self.oss_filename is not None:
            result['oss_filename'] = self.oss_filename
        if self.oss_ds_id is not None:
            result['oss_ds_id'] = self.oss_ds_id
        if self.oss_ds_name is not None:
            result['oss_ds_name'] = self.oss_ds_name
        if self.odps_ds_id is not None:
            result['odps_ds_id'] = self.odps_ds_id
        if self.odps_ds_name is not None:
            result['odps_ds_name'] = self.odps_ds_name
        if self.odps_project_name is not None:
            result['odps_project_name'] = self.odps_project_name
        if self.odps_table_name is not None:
            result['odps_table_name'] = self.odps_table_name
        if self.odps_guid_table_name is not None:
            result['odps_guid_table_name'] = self.odps_guid_table_name
        if self.partition_condition is not None:
            result['partition_condition'] = self.partition_condition
        if self.where is not None:
            result['where'] = self.where
        if self.column_list is not None:
            result['column_list'] = self.column_list
        if self.name is not None:
            result['name'] = self.name
        if self.desc is not None:
            result['desc'] = self.desc
        if self.operator is not None:
            result['operator'] = self.operator
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.project_task_path is not None:
            result['project_task_path'] = self.project_task_path
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.params is not None:
            result['params'] = self.params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('oss_path') is not None:
            self.oss_path = m.get('oss_path')
        if m.get('oss_filename') is not None:
            self.oss_filename = m.get('oss_filename')
        if m.get('oss_ds_id') is not None:
            self.oss_ds_id = m.get('oss_ds_id')
        if m.get('oss_ds_name') is not None:
            self.oss_ds_name = m.get('oss_ds_name')
        if m.get('odps_ds_id') is not None:
            self.odps_ds_id = m.get('odps_ds_id')
        if m.get('odps_ds_name') is not None:
            self.odps_ds_name = m.get('odps_ds_name')
        if m.get('odps_project_name') is not None:
            self.odps_project_name = m.get('odps_project_name')
        if m.get('odps_table_name') is not None:
            self.odps_table_name = m.get('odps_table_name')
        if m.get('odps_guid_table_name') is not None:
            self.odps_guid_table_name = m.get('odps_guid_table_name')
        if m.get('partition_condition') is not None:
            self.partition_condition = m.get('partition_condition')
        if m.get('where') is not None:
            self.where = m.get('where')
        if m.get('column_list') is not None:
            self.column_list = m.get('column_list')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('project_task_path') is not None:
            self.project_task_path = m.get('project_task_path')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('params') is not None:
            self.params = m.get('params')
        return self


class SyncOpdsOssResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
        request_id: str = None,
        code: str = None,
        message: str = None,
        trace_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
        self.data = data
        # requestId
        self.request_id = request_id
        # code
        self.code = code
        # message
        self.message = message
        # traceId
        self.trace_id = trace_id

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
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
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
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        return self


class ExistDataphinTablepartitionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        operator: str = None,
        project: str = None,
        table_name: str = None,
        partition: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # operator操作人
        self.operator = operator
        # project项目空间
        self.project = project
        # tableName
        self.table_name = table_name
        # 分区
        self.partition = partition

    def validate(self):
        self.validate_required(self.operator, 'operator')
        self.validate_required(self.project, 'project')
        self.validate_required(self.table_name, 'table_name')
        self.validate_required(self.partition, 'partition')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.operator is not None:
            result['operator'] = self.operator
        if self.project is not None:
            result['project'] = self.project
        if self.table_name is not None:
            result['table_name'] = self.table_name
        if self.partition is not None:
            result['partition'] = self.partition
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('project') is not None:
            self.project = m.get('project')
        if m.get('table_name') is not None:
            self.table_name = m.get('table_name')
        if m.get('partition') is not None:
            self.partition = m.get('partition')
        return self


class ExistDataphinTablepartitionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: PartitionObject = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分区返回数据
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
            temp_model = PartitionObject()
            self.data = temp_model.from_map(m['data'])
        return self


class PublishDataphinTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        desc: str = None,
        operator: str = None,
        tenant_id: str = None,
        project_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # desc
        self.desc = desc
        # operator
        self.operator = operator
        # tenantId
        self.tenant_id = tenant_id
        # projectId
        self.project_id = project_id
        # taskId
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.desc, 'desc')
        self.validate_required(self.operator, 'operator')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.desc is not None:
            result['desc'] = self.desc
        if self.operator is not None:
            result['operator'] = self.operator
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class PublishDataphinTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: int = None,
        request_id: str = None,
        code: str = None,
        message: str = None,
        trace_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
        self.data = data
        # requestId
        self.request_id = request_id
        # code
        self.code = code
        # message
        self.message = message
        # traceId
        self.trace_id = trace_id

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
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
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
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        return self


class CheckDataphinTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        publish_id: str = None,
        tenant_id: str = None,
        operator: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # publishId
        self.publish_id = publish_id
        # tenantId
        self.tenant_id = tenant_id
        # operator
        self.operator = operator

    def validate(self):
        self.validate_required(self.publish_id, 'publish_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.operator, 'operator')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.publish_id is not None:
            result['publish_id'] = self.publish_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.operator is not None:
            result['operator'] = self.operator
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('publish_id') is not None:
            self.publish_id = m.get('publish_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        return self


class CheckDataphinTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: PublishStatus = None,
        request_id: str = None,
        code: str = None,
        message: str = None,
        trace_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # publicstatus
        self.data = data
        # requestId
        self.request_id = request_id
        # code
        self.code = code
        # message
        self.message = message
        # traceId
        self.trace_id = trace_id

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
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
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
            temp_model = PublishStatus()
            self.data = temp_model.from_map(m['data'])
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        return self


class RunDataphinTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        name: str = None,
        tenant_id: str = None,
        operator: str = None,
        project_id: str = None,
        params: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # name
        self.name = name
        # tenantId
        self.tenant_id = tenant_id
        # operator
        self.operator = operator
        # projectId
        self.project_id = project_id
        # params,json map
        self.params = params
        # taskId
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.operator, 'operator')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.params, 'params')
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.name is not None:
            result['name'] = self.name
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.operator is not None:
            result['operator'] = self.operator
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.params is not None:
            result['params'] = self.params
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('params') is not None:
            self.params = m.get('params')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class RunDataphinTaskResponse(TeaModel):
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
        # data
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


class QueryDataphinTableinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        project_space_name: str = None,
        table_name: str = None,
        operator: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # projectSpaceName
        self.project_space_name = project_space_name
        # tableName
        self.table_name = table_name
        # operator
        self.operator = operator

    def validate(self):
        self.validate_required(self.project_space_name, 'project_space_name')
        self.validate_required(self.table_name, 'table_name')
        self.validate_required(self.operator, 'operator')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.project_space_name is not None:
            result['project_space_name'] = self.project_space_name
        if self.table_name is not None:
            result['table_name'] = self.table_name
        if self.operator is not None:
            result['operator'] = self.operator
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('project_space_name') is not None:
            self.project_space_name = m.get('project_space_name')
        if m.get('table_name') is not None:
            self.table_name = m.get('table_name')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        return self


class QueryDataphinTableinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        request_id: str = None,
        code: str = None,
        message: str = None,
        trace_id: str = None,
        data: BaseResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # requestId
        self.request_id = request_id
        # code
        self.code = code
        # message
        self.message = message
        # traceId
        self.trace_id = trace_id
        # data
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
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
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
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('data') is not None:
            temp_model = BaseResult()
            self.data = temp_model.from_map(m['data'])
        return self


class ImportDataphinFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        order_id: str = None,
        operator: str = None,
        user_id: str = None,
        file_key: str = None,
        header_list: List[str] = None,
        target_list: List[str] = None,
        table_project: str = None,
        table_name: str = None,
        partition: str = None,
        project: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # orderId
        self.order_id = order_id
        # operator
        self.operator = operator
        # userId
        self.user_id = user_id
        # fileKey
        self.file_key = file_key
        # headerList
        self.header_list = header_list
        # targetList
        self.target_list = target_list
        # tableProject
        self.table_project = table_project
        # tableName
        self.table_name = table_name
        # partition
        self.partition = partition
        # OcDataphinProjectEnum枚举
        self.project = project

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.operator, 'operator')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.file_key, 'file_key')
        self.validate_required(self.header_list, 'header_list')
        self.validate_required(self.target_list, 'target_list')
        self.validate_required(self.table_project, 'table_project')
        self.validate_required(self.table_name, 'table_name')
        self.validate_required(self.partition, 'partition')
        self.validate_required(self.project, 'project')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.operator is not None:
            result['operator'] = self.operator
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.file_key is not None:
            result['file_key'] = self.file_key
        if self.header_list is not None:
            result['header_list'] = self.header_list
        if self.target_list is not None:
            result['target_list'] = self.target_list
        if self.table_project is not None:
            result['table_project'] = self.table_project
        if self.table_name is not None:
            result['table_name'] = self.table_name
        if self.partition is not None:
            result['partition'] = self.partition
        if self.project is not None:
            result['project'] = self.project
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        if m.get('header_list') is not None:
            self.header_list = m.get('header_list')
        if m.get('target_list') is not None:
            self.target_list = m.get('target_list')
        if m.get('table_project') is not None:
            self.table_project = m.get('table_project')
        if m.get('table_name') is not None:
            self.table_name = m.get('table_name')
        if m.get('partition') is not None:
            self.partition = m.get('partition')
        if m.get('project') is not None:
            self.project = m.get('project')
        return self


class ImportDataphinFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        error_code: str = None,
        error_msg: str = None,
        result_obj: ProduceFeatureResultObj = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # success
        self.success = success
        # errorCode
        self.error_code = error_code
        # errorMsg
        self.error_msg = error_msg
        # resultObj
        self.result_obj = result_obj

    def validate(self):
        if self.result_obj:
            self.result_obj.validate()

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
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        if self.result_obj is not None:
            result['result_obj'] = self.result_obj.to_map()
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
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        if m.get('result_obj') is not None:
            temp_model = ProduceFeatureResultObj()
            self.result_obj = temp_model.from_map(m['result_obj'])
        return self


class SubmitDatapinTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        name: str = None,
        desc: str = None,
        operator: str = None,
        project_id: str = None,
        project_task_path: str = None,
        tenant_id: str = None,
        params: str = None,
        oss_ds_id: str = None,
        oss_ds_name: str = None,
        odps_ds_id: str = None,
        odps_ds_name: str = None,
        odps_project_name: str = None,
        odps_table_name: str = None,
        odps_guid_table_name: str = None,
        partition_condition: str = None,
        where: str = None,
        column_list: List[str] = None,
        oss_path: str = None,
        oss_filename: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # name
        self.name = name
        # 任务描述
        self.desc = desc
        # operator
        self.operator = operator
        # projectId
        self.project_id = project_id
        # projectTaskPath
        self.project_task_path = project_task_path
        # tenantId
        self.tenant_id = tenant_id
        # params
        self.params = params
        # ossDsId
        self.oss_ds_id = oss_ds_id
        # ossDsName
        self.oss_ds_name = oss_ds_name
        # odpsDsId
        self.odps_ds_id = odps_ds_id
        # odpsDsName
        self.odps_ds_name = odps_ds_name
        # odpsProjectName
        self.odps_project_name = odps_project_name
        # odpsTableName
        self.odps_table_name = odps_table_name
        # odpsGuidTableName
        self.odps_guid_table_name = odps_guid_table_name
        # partitionCondition
        self.partition_condition = partition_condition
        # where
        self.where = where
        # columnList
        self.column_list = column_list
        # ossPath
        self.oss_path = oss_path
        # ossFilename
        self.oss_filename = oss_filename

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.desc, 'desc')
        self.validate_required(self.operator, 'operator')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.project_task_path, 'project_task_path')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.params, 'params')
        self.validate_required(self.oss_ds_name, 'oss_ds_name')
        self.validate_required(self.odps_ds_id, 'odps_ds_id')
        self.validate_required(self.odps_project_name, 'odps_project_name')
        self.validate_required(self.odps_guid_table_name, 'odps_guid_table_name')
        self.validate_required(self.oss_path, 'oss_path')
        self.validate_required(self.oss_filename, 'oss_filename')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.name is not None:
            result['name'] = self.name
        if self.desc is not None:
            result['desc'] = self.desc
        if self.operator is not None:
            result['operator'] = self.operator
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.project_task_path is not None:
            result['project_task_path'] = self.project_task_path
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.params is not None:
            result['params'] = self.params
        if self.oss_ds_id is not None:
            result['oss_ds_id'] = self.oss_ds_id
        if self.oss_ds_name is not None:
            result['oss_ds_name'] = self.oss_ds_name
        if self.odps_ds_id is not None:
            result['odps_ds_id'] = self.odps_ds_id
        if self.odps_ds_name is not None:
            result['odps_ds_name'] = self.odps_ds_name
        if self.odps_project_name is not None:
            result['odps_project_name'] = self.odps_project_name
        if self.odps_table_name is not None:
            result['odps_table_name'] = self.odps_table_name
        if self.odps_guid_table_name is not None:
            result['odps_guid_table_name'] = self.odps_guid_table_name
        if self.partition_condition is not None:
            result['partition_condition'] = self.partition_condition
        if self.where is not None:
            result['where'] = self.where
        if self.column_list is not None:
            result['column_list'] = self.column_list
        if self.oss_path is not None:
            result['oss_path'] = self.oss_path
        if self.oss_filename is not None:
            result['oss_filename'] = self.oss_filename
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('project_task_path') is not None:
            self.project_task_path = m.get('project_task_path')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('params') is not None:
            self.params = m.get('params')
        if m.get('oss_ds_id') is not None:
            self.oss_ds_id = m.get('oss_ds_id')
        if m.get('oss_ds_name') is not None:
            self.oss_ds_name = m.get('oss_ds_name')
        if m.get('odps_ds_id') is not None:
            self.odps_ds_id = m.get('odps_ds_id')
        if m.get('odps_ds_name') is not None:
            self.odps_ds_name = m.get('odps_ds_name')
        if m.get('odps_project_name') is not None:
            self.odps_project_name = m.get('odps_project_name')
        if m.get('odps_table_name') is not None:
            self.odps_table_name = m.get('odps_table_name')
        if m.get('odps_guid_table_name') is not None:
            self.odps_guid_table_name = m.get('odps_guid_table_name')
        if m.get('partition_condition') is not None:
            self.partition_condition = m.get('partition_condition')
        if m.get('where') is not None:
            self.where = m.get('where')
        if m.get('column_list') is not None:
            self.column_list = m.get('column_list')
        if m.get('oss_path') is not None:
            self.oss_path = m.get('oss_path')
        if m.get('oss_filename') is not None:
            self.oss_filename = m.get('oss_filename')
        return self


class SubmitDatapinTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        request_id: str = None,
        code: str = None,
        message: str = None,
        trace_id: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # requestId
        self.request_id = request_id
        # code
        self.code = code
        # message
        self.message = message
        # traceId
        self.trace_id = trace_id
        # data
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
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
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
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class QueryIndustryScoreRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        model_id: str = None,
        user_id: str = None,
        user_id_type: str = None,
        encrypt_type: str = None,
        customer_code: str = None,
        trans_no: str = None,
        user_id_hash_encrypt: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 模型id
        self.model_id = model_id
        # 用户id（客户身份证号/手机号的md5/sha256散列值）
        self.user_id = user_id
        # 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
        self.user_id_type = user_id_type
        # user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
        self.encrypt_type = encrypt_type
        # 客户编码
        self.customer_code = customer_code
        # 流水号，串联链路用，非必填
        self.trans_no = trans_no
        # encrypt_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
        self.user_id_hash_encrypt = user_id_hash_encrypt

    def validate(self):
        self.validate_required(self.model_id, 'model_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.user_id_type, 'user_id_type')
        self.validate_required(self.encrypt_type, 'encrypt_type')
        self.validate_required(self.customer_code, 'customer_code')
        self.validate_required(self.trans_no, 'trans_no')
        self.validate_required(self.user_id_hash_encrypt, 'user_id_hash_encrypt')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_id_type is not None:
            result['user_id_type'] = self.user_id_type
        if self.encrypt_type is not None:
            result['encrypt_type'] = self.encrypt_type
        if self.customer_code is not None:
            result['customer_code'] = self.customer_code
        if self.trans_no is not None:
            result['trans_no'] = self.trans_no
        if self.user_id_hash_encrypt is not None:
            result['user_id_hash_encrypt'] = self.user_id_hash_encrypt
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_id_type') is not None:
            self.user_id_type = m.get('user_id_type')
        if m.get('encrypt_type') is not None:
            self.encrypt_type = m.get('encrypt_type')
        if m.get('customer_code') is not None:
            self.customer_code = m.get('customer_code')
        if m.get('trans_no') is not None:
            self.trans_no = m.get('trans_no')
        if m.get('user_id_hash_encrypt') is not None:
            self.user_id_hash_encrypt = m.get('user_id_hash_encrypt')
        return self


class QueryIndustryScoreResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        score: str = None,
        trans_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模型分数
        self.score = score
        # 流水号
        self.trans_no = trans_no

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
        if self.score is not None:
            result['score'] = self.score
        if self.trans_no is not None:
            result['trans_no'] = self.trans_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('trans_no') is not None:
            self.trans_no = m.get('trans_no')
        return self


class QueryIrBrandRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        brandmd_5: str = None,
        begin_date: str = None,
        end_date: str = None,
        scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 品牌MD5的 32位小写
        self.brandmd_5 = brandmd_5
        # 开始日期，包含填写时间 ，目前与end_date最大间隔不大于7天
        self.begin_date = begin_date
        # 结束日期，包含填写时间， 目前与start_date最大间隔不大于7天
        self.end_date = end_date
        # 场景码,brand_overview 品牌汇总；brand_citylevel 品牌城市汇总
        self.scene = scene

    def validate(self):
        self.validate_required(self.brandmd_5, 'brandmd_5')
        self.validate_required(self.begin_date, 'begin_date')
        self.validate_required(self.end_date, 'end_date')
        self.validate_required(self.scene, 'scene')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.brandmd_5 is not None:
            result['brandmd5'] = self.brandmd_5
        if self.begin_date is not None:
            result['begin_date'] = self.begin_date
        if self.end_date is not None:
            result['end_date'] = self.end_date
        if self.scene is not None:
            result['scene'] = self.scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('brandmd5') is not None:
            self.brandmd_5 = m.get('brandmd5')
        if m.get('begin_date') is not None:
            self.begin_date = m.get('begin_date')
        if m.get('end_date') is not None:
            self.end_date = m.get('end_date')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        return self


class QueryIrBrandResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data_list: List[ZhxIrResultStruct] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果
        self.data_list = data_list

    def validate(self):
        if self.data_list:
            for k in self.data_list:
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
        result['data_list'] = []
        if self.data_list is not None:
            for k in self.data_list:
                result['data_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data_list = []
        if m.get('data_list') is not None:
            for k in m.get('data_list'):
                temp_model = ZhxIrResultStruct()
                self.data_list.append(temp_model.from_map(k))
        return self


