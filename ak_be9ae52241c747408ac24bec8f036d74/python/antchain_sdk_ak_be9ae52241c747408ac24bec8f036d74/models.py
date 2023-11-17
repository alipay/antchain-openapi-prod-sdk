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


class ParticipantInput(TeaModel):
    def __init__(
        self,
        auth_dataset_id: str = None,
        fields: List[str] = None,
        filter: str = None,
    ):
        # 授权至项目内的数据集ID
        self.auth_dataset_id = auth_dataset_id
        # 上述数据集所需参与计算的列
        self.fields = fields
        # 用户筛选该数据集的过滤条件
        self.filter = filter

    def validate(self):
        self.validate_required(self.auth_dataset_id, 'auth_dataset_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_dataset_id is not None:
            result['auth_dataset_id'] = self.auth_dataset_id
        if self.fields is not None:
            result['fields'] = self.fields
        if self.filter is not None:
            result['filter'] = self.filter
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_dataset_id') is not None:
            self.auth_dataset_id = m.get('auth_dataset_id')
        if m.get('fields') is not None:
            self.fields = m.get('fields')
        if m.get('filter') is not None:
            self.filter = m.get('filter')
        return self


class ParticipantOutput(TeaModel):
    def __init__(
        self,
        auth_datasource_id: str = None,
        table_name: str = None,
        write_type: str = None,
    ):
        # 授权至项目内的数据源ID
        self.auth_datasource_id = auth_datasource_id
        # 输出表名
        self.table_name = table_name
        # 输出类型，本期仅支持FULL
        self.write_type = write_type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_datasource_id is not None:
            result['auth_datasource_id'] = self.auth_datasource_id
        if self.table_name is not None:
            result['table_name'] = self.table_name
        if self.write_type is not None:
            result['write_type'] = self.write_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_datasource_id') is not None:
            self.auth_datasource_id = m.get('auth_datasource_id')
        if m.get('table_name') is not None:
            self.table_name = m.get('table_name')
        if m.get('write_type') is not None:
            self.write_type = m.get('write_type')
        return self


class StructuredDataField(TeaModel):
    def __init__(
        self,
        name: str = None,
        description: str = None,
        type: str = None,
        nullable: bool = None,
    ):
        # 字段名称
        self.name = name
        # 字段描述
        self.description = description
        # 字段类型。
        # 示例如下：
        # STRING,
        # INTEGER,
        # DOUBLE,
        # BOOLEAN
        self.type = type
        # 字段是否可为空
        self.nullable = nullable

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.type is not None:
            result['type'] = self.type
        if self.nullable is not None:
            result['nullable'] = self.nullable
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('nullable') is not None:
            self.nullable = m.get('nullable')
        return self


class Party(TeaModel):
    def __init__(
        self,
        party_id: str = None,
        tenant_id: str = None,
        type: str = None,
        node_config: str = None,
    ):
        # 参与方节点id，创建项目时无需传入，由saas统一分配
        self.party_id = party_id
        # 所属方id，若为云上节点，则为云上租户ID，若为线下节点，则该参数为空
        self.tenant_id = tenant_id
        # 参与方节点类型，创建项目时无需填写，由local_config字段推导出节点参与方类型；
        # 一期支持两类，FATE为线下fate参与方节点，SAAS_FATE为云上fate参与方节点
        self.type = type
        # 参与方配置json，当type为FATE时，其结构为FatePartyConfigInfo，当type为SAAS_FATE时，其结构为List<FatePartyConfigInfo>
        self.node_config = node_config

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.party_id is not None:
            result['party_id'] = self.party_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.type is not None:
            result['type'] = self.type
        if self.node_config is not None:
            result['node_config'] = self.node_config
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('party_id') is not None:
            self.party_id = m.get('party_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('node_config') is not None:
            self.node_config = m.get('node_config')
        return self


class PsiParticipantConfig(TeaModel):
    def __init__(
        self,
        party_id: str = None,
        matched_column: str = None,
        input: ParticipantInput = None,
        output: ParticipantOutput = None,
    ):
        # 参与方所属节点ID
        self.party_id = party_id
        # 该参与方用于求交的匹配列，对于线下fate节点不填写该参数，默认匹配其第一列
        self.matched_column = matched_column
        # 参与方输入数据，参考结构体定义
        self.input = input
        # 参与方输出数据，参考结构体定义
        self.output = output

    def validate(self):
        self.validate_required(self.party_id, 'party_id')
        self.validate_required(self.input, 'input')
        if self.input:
            self.input.validate()
        if self.output:
            self.output.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.party_id is not None:
            result['party_id'] = self.party_id
        if self.matched_column is not None:
            result['matched_column'] = self.matched_column
        if self.input is not None:
            result['input'] = self.input.to_map()
        if self.output is not None:
            result['output'] = self.output.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('party_id') is not None:
            self.party_id = m.get('party_id')
        if m.get('matched_column') is not None:
            self.matched_column = m.get('matched_column')
        if m.get('input') is not None:
            temp_model = ParticipantInput()
            self.input = temp_model.from_map(m['input'])
        if m.get('output') is not None:
            temp_model = ParticipantOutput()
            self.output = temp_model.from_map(m['output'])
        return self


class StructuredDataSchema(TeaModel):
    def __init__(
        self,
        field_list: List[StructuredDataField] = None,
    ):
        # 结构化数据字段列表
        self.field_list = field_list

    def validate(self):
        if self.field_list:
            for k in self.field_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['field_list'] = []
        if self.field_list is not None:
            for k in self.field_list:
                result['field_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.field_list = []
        if m.get('field_list') is not None:
            for k in m.get('field_list'):
                temp_model = StructuredDataField()
                self.field_list.append(temp_model.from_map(k))
        return self


class PsiJob(TeaModel):
    def __init__(
        self,
        project_id: str = None,
        job_id: str = None,
        tenant_id: str = None,
        gmt_create: int = None,
        gmt_exec_start: int = None,
        gmt_exec_end: int = None,
        name: str = None,
        type: str = None,
        project_type: str = None,
        description: str = None,
        status: str = None,
        result_msg: str = None,
        participant_list: List[PsiParticipantConfig] = None,
    ):
        # 项目ID
        self.project_id = project_id
        # 执行任务ID
        self.job_id = job_id
        # 发起任务的租户ID
        self.tenant_id = tenant_id
        # 任务提交时间（毫秒）
        self.gmt_create = gmt_create
        # 任务真正开始执行的unix 时间戳（毫秒）
        self.gmt_exec_start = gmt_exec_start
        # 任务最终执行完成时间（毫秒）
        self.gmt_exec_end = gmt_exec_end
        # 任务名称
        self.name = name
        # 任务类型
        self.type = type
        # 项目类型
        self.project_type = project_type
        # 项目描述信息
        self.description = description
        # 任务执行状态，EXECUTING执行中，SUCCESS执行成功，FAILED执行失败
        self.status = status
        # 任务执行结果信息，若执行失败则返回错误日志
        self.result_msg = result_msg
        # 参与方配置参数，参考结构体定义
        self.participant_list = participant_list

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.job_id, 'job_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.gmt_create, 'gmt_create')
        self.validate_required(self.gmt_exec_start, 'gmt_exec_start')
        self.validate_required(self.gmt_exec_end, 'gmt_exec_end')
        self.validate_required(self.name, 'name')
        self.validate_required(self.type, 'type')
        self.validate_required(self.project_type, 'project_type')
        self.validate_required(self.description, 'description')
        self.validate_required(self.status, 'status')
        self.validate_required(self.participant_list, 'participant_list')
        if self.participant_list:
            for k in self.participant_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.job_id is not None:
            result['job_id'] = self.job_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_exec_start is not None:
            result['gmt_exec_start'] = self.gmt_exec_start
        if self.gmt_exec_end is not None:
            result['gmt_exec_end'] = self.gmt_exec_end
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.project_type is not None:
            result['project_type'] = self.project_type
        if self.description is not None:
            result['description'] = self.description
        if self.status is not None:
            result['status'] = self.status
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['participant_list'] = []
        if self.participant_list is not None:
            for k in self.participant_list:
                result['participant_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('job_id') is not None:
            self.job_id = m.get('job_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_exec_start') is not None:
            self.gmt_exec_start = m.get('gmt_exec_start')
        if m.get('gmt_exec_end') is not None:
            self.gmt_exec_end = m.get('gmt_exec_end')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('project_type') is not None:
            self.project_type = m.get('project_type')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.participant_list = []
        if m.get('participant_list') is not None:
            for k in m.get('participant_list'):
                temp_model = PsiParticipantConfig()
                self.participant_list.append(temp_model.from_map(k))
        return self


class RecognizedDatasetSchema(TeaModel):
    def __init__(
        self,
        format_type: str = None,
        format_config: str = None,
        schema_type: str = None,
        structured_data_schema: StructuredDataSchema = None,
    ):
        # 数据集格式类型。
        # 示例如下：
        # TABLE,
        # CSV
        self.format_type = format_type
        # 数据集数据源格式信息，如 csv 分隔符，数据库主键名称等。
        # 对应关系如下：
        # 数据表 -> TableFormatConfig，
        # CSV文件 -> CSVFormatConfig
        self.format_config = format_config
        # 数据集 schema 类型。
        self.schema_type = schema_type
        # 结构化数据 schema
        # schema_type为STRUCTURED_DATA时必填
        self.structured_data_schema = structured_data_schema

    def validate(self):
        if self.structured_data_schema:
            self.structured_data_schema.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.format_type is not None:
            result['format_type'] = self.format_type
        if self.format_config is not None:
            result['format_config'] = self.format_config
        if self.schema_type is not None:
            result['schema_type'] = self.schema_type
        if self.structured_data_schema is not None:
            result['structured_data_schema'] = self.structured_data_schema.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('format_type') is not None:
            self.format_type = m.get('format_type')
        if m.get('format_config') is not None:
            self.format_config = m.get('format_config')
        if m.get('schema_type') is not None:
            self.schema_type = m.get('schema_type')
        if m.get('structured_data_schema') is not None:
            temp_model = StructuredDataSchema()
            self.structured_data_schema = temp_model.from_map(m['structured_data_schema'])
        return self


class LocalDatasource(TeaModel):
    def __init__(
        self,
        id: str = None,
        name: str = None,
        description: str = None,
        writable: bool = None,
        type: str = None,
        conn_config: str = None,
    ):
        # 数据源id
        self.id = id
        # 数据源名称
        self.name = name
        # 数据源描述信息
        self.description = description
        # 当前数据源是否支持写入
        self.writable = writable
        # 用于描述数据源类型的枚举。
        # 示例如下：
        # MYSQL,
        # DB2,
        # SQLSERVER,
        # ORACLE,
        # HIVE2,
        # ODPS
        # 
        self.type = type
        # 用于描述数据源的连接信息，为描述连接信息的数据对象转化为的json字符串，与type指定的数据源类型必须一一对应。
        # 该参数请参考如下对应结构体，定义好后需转成jsonString，对应关系展示如下：
        # MYSQL -> MysqlConnConfig,
        # ORACLE -> OracleConnConfig,
        # SQLSERVER -> SqlServerConnConfig,
        # DB2 -> DbTwoConnConfig,
        # HIVE2 -> HiveTwoConnConfig,
        # ODPS -> OdpsConnConfig
        self.conn_config = conn_config

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
        if self.description is not None:
            result['description'] = self.description
        if self.writable is not None:
            result['writable'] = self.writable
        if self.type is not None:
            result['type'] = self.type
        if self.conn_config is not None:
            result['conn_config'] = self.conn_config
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('writable') is not None:
            self.writable = m.get('writable')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('conn_config') is not None:
            self.conn_config = m.get('conn_config')
        return self


class LocalDataset(TeaModel):
    def __init__(
        self,
        id: str = None,
        name: str = None,
        description: str = None,
        datasource_id: str = None,
        datasource_type: str = None,
        datasource_conn_config: str = None,
        location_config: str = None,
        format_type: str = None,
        format_config: str = None,
        schema_type: str = None,
        structured_data_schema: StructuredDataSchema = None,
    ):
        # 数据集id
        self.id = id
        # 数据集名称
        self.name = name
        # 数据集描述
        self.description = description
        # 数据集所属的数据源 id
        self.datasource_id = datasource_id
        # 数据源类型。
        # 示例如下：
        # MYSQL,
        # DB2,
        # SQLSERVER,
        # ORACLE,
        # HIVE2,
        # ODPS
        self.datasource_type = datasource_type
        # 数据源连接参数转化成的json字符串，必须与数据源类型一一对应。
        # 该参数请参考如下对应结构体，定义好后需转成jsonString，具体的对应信息如下：
        # MYSQL -> MysqlConnConfig,
        # ORACLE -> OracleConnConfig,
        # SQLSERVER -> SqlServerConnConfig,
        # DB2 -> DbTwoConnConfig,
        # HIVE2 -> HiveTwoConnConfig,
        # ODPS -> OdpsConnConfig
        self.datasource_conn_config = datasource_conn_config
        # 数据集在数据源中的位置信息转化成的json字符串，如数据表名称等，必须和数据源类型一一对应。
        # 该参数请参考如下对应结构体，定义好后需转成jsonString，具体的对应关系如下：
        # MYSQL -> MysqlLocationConfig,
        # ORACLE -> OracleLocationConfig,
        # SQLSERVER -> SqlServerLocationConfig,
        # DB2 -> DbTwoLocationConfig,
        # HIVE2 -> HiveTwoLocationConfig,
        # ODPS -> OdpsLocationConfig
        self.location_config = location_config
        # 数据集格式类型。
        # 示例如下：
        # TABLE
        self.format_type = format_type
        # 数据集格式信息，如 csv 分隔符，数据库主键名称等，与数据集类型一一对应。
        # 该参数请参考如下对应结构体，定义好后需转成jsonString，当前支持的类型展示如下：
        # 数据表 -> TableFormatConfig
        self.format_config = format_config
        # 数据集 schema 类型。
        # 示例如下：
        # STRUCTURED_DATA
        self.schema_type = schema_type
        # 结构化数据 schema，schema_type为STRUCTURED_DATA时必填
        self.structured_data_schema = structured_data_schema

    def validate(self):
        if self.structured_data_schema:
            self.structured_data_schema.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.datasource_id is not None:
            result['datasource_id'] = self.datasource_id
        if self.datasource_type is not None:
            result['datasource_type'] = self.datasource_type
        if self.datasource_conn_config is not None:
            result['datasource_conn_config'] = self.datasource_conn_config
        if self.location_config is not None:
            result['location_config'] = self.location_config
        if self.format_type is not None:
            result['format_type'] = self.format_type
        if self.format_config is not None:
            result['format_config'] = self.format_config
        if self.schema_type is not None:
            result['schema_type'] = self.schema_type
        if self.structured_data_schema is not None:
            result['structured_data_schema'] = self.structured_data_schema.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('datasource_id') is not None:
            self.datasource_id = m.get('datasource_id')
        if m.get('datasource_type') is not None:
            self.datasource_type = m.get('datasource_type')
        if m.get('datasource_conn_config') is not None:
            self.datasource_conn_config = m.get('datasource_conn_config')
        if m.get('location_config') is not None:
            self.location_config = m.get('location_config')
        if m.get('format_type') is not None:
            self.format_type = m.get('format_type')
        if m.get('format_config') is not None:
            self.format_config = m.get('format_config')
        if m.get('schema_type') is not None:
            self.schema_type = m.get('schema_type')
        if m.get('structured_data_schema') is not None:
            temp_model = StructuredDataSchema()
            self.structured_data_schema = temp_model.from_map(m['structured_data_schema'])
        return self


class AuthDatasource(TeaModel):
    def __init__(
        self,
        auth_datasource_id: str = None,
        gmt_create: int = None,
        gmt_modified: int = None,
        name: str = None,
        config: str = None,
        source: str = None,
        project_id: str = None,
        visible_type: str = None,
    ):
        # 授权数据源ID
        self.auth_datasource_id = auth_datasource_id
        # 创建数据源授权时间(毫秒)
        self.gmt_create = gmt_create
        # 更新数据源授权时间(毫秒)
        self.gmt_modified = gmt_modified
        # 数据源名称
        self.name = name
        # 对应本地数据源的配置参数
        self.config = config
        # 数据源来源
        self.source = source
        # 项目ID
        self.project_id = project_id
        # 项目内可见范围类型，ALL_TENANT全部机构可见，SPECIFIC_TENANT部分机构可见。调用授权数据集 和 数据源请求时 若不填该参数，则默认ALL_TENANT
        self.visible_type = visible_type

    def validate(self):
        self.validate_required(self.auth_datasource_id, 'auth_datasource_id')
        self.validate_required(self.gmt_create, 'gmt_create')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        self.validate_required(self.name, 'name')
        self.validate_required(self.config, 'config')
        self.validate_required(self.source, 'source')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.visible_type, 'visible_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_datasource_id is not None:
            result['auth_datasource_id'] = self.auth_datasource_id
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.name is not None:
            result['name'] = self.name
        if self.config is not None:
            result['config'] = self.config
        if self.source is not None:
            result['source'] = self.source
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.visible_type is not None:
            result['visible_type'] = self.visible_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_datasource_id') is not None:
            self.auth_datasource_id = m.get('auth_datasource_id')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('config') is not None:
            self.config = m.get('config')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('visible_type') is not None:
            self.visible_type = m.get('visible_type')
        return self


class Project(TeaModel):
    def __init__(
        self,
        project_id: str = None,
        tenant_id: str = None,
        name: str = None,
        status: str = None,
        gmt_create: int = None,
        gmt_modified: int = None,
        party_list: List[Party] = None,
    ):
        # 项目ID
        self.project_id = project_id
        # 创建者ID
        self.tenant_id = tenant_id
        # 项目名称
        self.name = name
        # 项目状态:CREATING为创建中，FAILED为创建失败，FINISHED为创建完成。仅状态为FINISHED的项目才允许创建任务
        self.status = status
        # 创建时间（毫秒）
        self.gmt_create = gmt_create
        # 更新时间（毫秒）
        self.gmt_modified = gmt_modified
        # 参与方列表
        self.party_list = party_list

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.status, 'status')
        self.validate_required(self.party_list, 'party_list')
        if self.party_list:
            for k in self.party_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.name is not None:
            result['name'] = self.name
        if self.status is not None:
            result['status'] = self.status
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        result['party_list'] = []
        if self.party_list is not None:
            for k in self.party_list:
                result['party_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        self.party_list = []
        if m.get('party_list') is not None:
            for k in m.get('party_list'):
                temp_model = Party()
                self.party_list.append(temp_model.from_map(k))
        return self


class AuthDataset(TeaModel):
    def __init__(
        self,
        auth_dataset_id: str = None,
        gmt_create: int = None,
        gmt_modified: int = None,
        name: str = None,
        config: str = None,
        source: str = None,
        project_id: str = None,
        visible_type: str = None,
    ):
        # 授权数据集ID
        self.auth_dataset_id = auth_dataset_id
        # 创建授权时间(毫秒)
        self.gmt_create = gmt_create
        # 更新授权时间(毫秒)
        self.gmt_modified = gmt_modified
        # 数据集名称
        self.name = name
        # 数据集配置参数
        self.config = config
        # SAAS：该数据集为云上saas节点登记，数据的元信息存储于fdf中
        # FATE：该数据集为线下fate节点登记，数据参数仅有tablename&namespace
        self.source = source
        # 项目ID
        self.project_id = project_id
        # 项目内可见范围类型，ALL_TENANT全部机构可见，SPECIFIC_TENANT部分机构可见。调用授权数据集 和 数据源请求时 若不填该参数，则默认ALL_TENANT
        self.visible_type = visible_type

    def validate(self):
        self.validate_required(self.auth_dataset_id, 'auth_dataset_id')
        self.validate_required(self.gmt_create, 'gmt_create')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        self.validate_required(self.name, 'name')
        self.validate_required(self.config, 'config')
        self.validate_required(self.source, 'source')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.visible_type, 'visible_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_dataset_id is not None:
            result['auth_dataset_id'] = self.auth_dataset_id
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.name is not None:
            result['name'] = self.name
        if self.config is not None:
            result['config'] = self.config
        if self.source is not None:
            result['source'] = self.source
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.visible_type is not None:
            result['visible_type'] = self.visible_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_dataset_id') is not None:
            self.auth_dataset_id = m.get('auth_dataset_id')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('config') is not None:
            self.config = m.get('config')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('visible_type') is not None:
            self.visible_type = m.get('visible_type')
        return self


class PartyReq(TeaModel):
    def __init__(
        self,
        type: str = None,
        tenant_id: str = None,
        remote_config: str = None,
    ):
        # 参与方类型，例如：{FATE, SAAS_FATE, KUSCIA, SAAS_KUSCIA}
        self.type = type
        # 参与方租户id
        self.tenant_id = tenant_id
        # 远端节点的配置信息，本期仅支持一种类型：FATE，其配置参考FatePartyLocalConfigInfo结构体定义
        self.remote_config = remote_config

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.remote_config, 'remote_config')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.remote_config is not None:
            result['remote_config'] = self.remote_config
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('remote_config') is not None:
            self.remote_config = m.get('remote_config')
        return self


class CreateAntchainPdcpDatasourceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        description: str = None,
        writable: bool = None,
        type: str = None,
        conn_config: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据源名称，必填，长度不超过50个字符
        self.name = name
        # 数据源的描述，数据量，作用域等等。
        # 非必填，长度不超过200个字符。
        self.description = description
        # 描述当前数据源是否支持写入。
        # true表示支持写入。
        self.writable = writable
        # 描述数据源类型的枚举，必填。
        # 示例如下：
        # MYSQL,
        # DB2,
        # SQLSERVER,
        # ORACLE,
        # HIVE2,
        # ODPS
        self.type = type
        # 数据源连接信息的对象体转化为的json字符串。
        # 要求连接信息的类型必须与type指定的一致。
        # 该参数请参考如下的对应结构体，定义好后转化成jsonstring，对应信息如下：
        # MYSQL -> MysqlConnConfig,
        # ORACLE -> OracleConnConfig,
        # SQLSERVER -> SqlServerConnConfig,
        # DB2 -> DbTwoConnConfig,
        # HIVE2 -> HiveTwoConnConfig,
        # ODPS -> OdpsConnConfig
        self.conn_config = conn_config

    def validate(self):
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 50)
        if self.description is not None:
            self.validate_max_length(self.description, 'description', 200)
        self.validate_required(self.writable, 'writable')
        self.validate_required(self.type, 'type')
        self.validate_required(self.conn_config, 'conn_config')

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
        if self.writable is not None:
            result['writable'] = self.writable
        if self.type is not None:
            result['type'] = self.type
        if self.conn_config is not None:
            result['conn_config'] = self.conn_config
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
        if m.get('writable') is not None:
            self.writable = m.get('writable')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('conn_config') is not None:
            self.conn_config = m.get('conn_config')
        return self


class CreateAntchainPdcpDatasourceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: LocalDatasource = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 创建的数据源的信息。
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
            temp_model = LocalDatasource()
            self.data = temp_model.from_map(m['data'])
        return self


class DeleteAntchainPdcpDatasourceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        datasource_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待删除的数据源 id，必填
        self.datasource_id = datasource_id

    def validate(self):
        self.validate_required(self.datasource_id, 'datasource_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.datasource_id is not None:
            result['datasource_id'] = self.datasource_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('datasource_id') is not None:
            self.datasource_id = m.get('datasource_id')
        return self


class DeleteAntchainPdcpDatasourceResponse(TeaModel):
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


class UpdateAntchainPdcpDatasourceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        datasource_id: str = None,
        name: str = None,
        description: str = None,
        writable: bool = None,
        conn_config: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待更新的数据源 id，必填
        self.datasource_id = datasource_id
        # 更新后的数据源名称，非必填，不填则不更新
        self.name = name
        # 更新后的数据源描述，非必填，不填则不更新
        self.description = description
        # 数据源是否可写，非必填，不填则不更新
        self.writable = writable
        # 数据源连接参数，非必填，不填则不更新，注意必须与此数据源创建时的类型一致。
        # 该参数请参考如下对应结构体，定义好后需转成jsonString，对应关系展示如下：
        # MYSQL -> MysqlConnConfig,
        # ORACLE -> OracleConnConfig,
        # SQLSERVER -> SqlServerConnConfig,
        # DB2 -> DbTwoConnConfig,
        # HIVE2 -> HiveTwoConnConfig,
        # ODPS -> OdpsConnConfig
        self.conn_config = conn_config

    def validate(self):
        self.validate_required(self.datasource_id, 'datasource_id')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 50)
        if self.description is not None:
            self.validate_max_length(self.description, 'description', 200)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.datasource_id is not None:
            result['datasource_id'] = self.datasource_id
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.writable is not None:
            result['writable'] = self.writable
        if self.conn_config is not None:
            result['conn_config'] = self.conn_config
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('datasource_id') is not None:
            self.datasource_id = m.get('datasource_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('writable') is not None:
            self.writable = m.get('writable')
        if m.get('conn_config') is not None:
            self.conn_config = m.get('conn_config')
        return self


class UpdateAntchainPdcpDatasourceResponse(TeaModel):
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


class QueryAntchainPdcpDatasourceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        datasource_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 想要查询的数据源的数据源id，用于指定数据源
        self.datasource_id = datasource_id

    def validate(self):
        self.validate_required(self.datasource_id, 'datasource_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.datasource_id is not None:
            result['datasource_id'] = self.datasource_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('datasource_id') is not None:
            self.datasource_id = m.get('datasource_id')
        return self


class QueryAntchainPdcpDatasourceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: LocalDatasource = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询到的指定数据源的信息
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
            temp_model = LocalDatasource()
            self.data = temp_model.from_map(m['data'])
        return self


class PagequeryAntchainPdcpDatasourceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        type: str = None,
        writable: bool = None,
        page: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据源名称，筛选用，非必填
        self.name = name
        # 数据源类型，筛选用，非必填。
        # 示例如下：
        # MYSQL,
        # DB2,
        # SQLSERVER,
        # ORACLE,
        # HIVE2,
        # OSS,
        # MINIO
        self.type = type
        # 数据源是否可写，筛选用，非必填
        self.writable = writable
        # 分页页数，必填
        self.page = page
        # 分页大小，必填
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.page, 'page')
        if self.page is not None:
            self.validate_minimum(self.page, 'page', 1)
        self.validate_required(self.page_size, 'page_size')
        if self.page_size is not None:
            self.validate_minimum(self.page_size, 'page_size', 1)

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
        if self.type is not None:
            result['type'] = self.type
        if self.writable is not None:
            result['writable'] = self.writable
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
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('writable') is not None:
            self.writable = m.get('writable')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryAntchainPdcpDatasourceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        page: str = None,
        page_size: int = None,
        data: List[LocalDatasource] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果的总数
        self.total = total
        # 分页页数
        self.page = page
        # 分页大小
        self.page_size = page_size
        # 返回的数据源元信息列表
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
        if self.total is not None:
            result['total'] = self.total
        if self.page is not None:
            result['page'] = self.page
        if self.page_size is not None:
            result['page_size'] = self.page_size
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
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = LocalDatasource()
                self.data.append(temp_model.from_map(k))
        return self


class CreateAntchainPdcpDatasetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        description: str = None,
        datasource_id: str = None,
        datasource_type: str = None,
        conn_config: str = None,
        location_config: str = None,
        format_type: str = None,
        format_config: str = None,
        schema_type: str = None,
        structured_data_schema: StructuredDataSchema = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据集名称，必填
        self.name = name
        # 数据集描述，非必填
        self.description = description
        # 采用数据源配置进行登记时的数据源 id
        # 如果填写了本参数，则可不填写datasourceType和connConfig
        # 如果填写了本参数，将优先采用本参数指定的 datasource 配置
        self.datasource_id = datasource_id
        # 数据集数据源类型。
        # 如果填写了datasourceId，则可不传本参数，填写了本参数也将被忽略。
        # 如果未填写datasourceId，则必须同时填写本参数和 connConfig参数。
        # 示例如下：
        # MYSQL,
        # DB2,
        # SQLSERVER,
        # ORACLE,
        # HIVE2,
        # ODPS
        self.datasource_type = datasource_type
        # 数据集所属数据源连接信息，与数据源类型一一对应。
        # 如果填写了datasourceId，则可不传本参数，填写本参数也将被忽略。
        # 如果未填写 datasourceId，则必须同时填写本参数和datasourceType参数。
        # 该参数请参考如下对应结构体，定义好后需转成jsonString，具体对应关系如下：
        # MYSQL -> MysqlConnConfig,
        # ORACLE -> OracleConnConfig,
        # SQLSERVER -> SqlServerConnConfig,
        # DB2 -> DbTwoConnConfig,
        # HIVE2 -> HiveTwoConnConfig,
        # ODPS -> OdpsConnConfig
        self.conn_config = conn_config
        # 数据集位置信息的对象转化成的json字符串，如数据表名称等。
        # 该参数请参考如下对应结构体，定义好后需转成jsonString，具体的对应信息如下：
        # MYSQL -> MysqlLocationConfig,
        # ORACLE -> OracleLocationConfig,
        # SQLSERVER -> SqlServerLocationConfig,
        # DB2 -> DbTwoLocationConfig,
        # HIVE2 -> HiveTwoLocationConfig,
        # ODPS -> OdpsLocationConfig
        self.location_config = location_config
        # 数据集格式类型。
        # 示例如下：
        # TABLE
        self.format_type = format_type
        # 数据集格式信息转化成的json字符串，如 csv 分隔符，数据库主键名称等，必须与数据源类型一一对应。
        # 具体的对应关系如下：
        # 数据表 -> TableFormatConfig
        self.format_config = format_config
        # 数据集 schema 类型。
        # 示例如下：
        # STRUCTURED_DATA
        self.schema_type = schema_type
        # 结构化数据 schema
        # schemaType为STRUCTURED_DATA时必填
        self.structured_data_schema = structured_data_schema

    def validate(self):
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 50)
        if self.description is not None:
            self.validate_max_length(self.description, 'description', 200)
        self.validate_required(self.location_config, 'location_config')
        self.validate_required(self.format_type, 'format_type')
        self.validate_required(self.format_config, 'format_config')
        self.validate_required(self.schema_type, 'schema_type')
        if self.structured_data_schema:
            self.structured_data_schema.validate()

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
        if self.datasource_id is not None:
            result['datasource_id'] = self.datasource_id
        if self.datasource_type is not None:
            result['datasource_type'] = self.datasource_type
        if self.conn_config is not None:
            result['conn_config'] = self.conn_config
        if self.location_config is not None:
            result['location_config'] = self.location_config
        if self.format_type is not None:
            result['format_type'] = self.format_type
        if self.format_config is not None:
            result['format_config'] = self.format_config
        if self.schema_type is not None:
            result['schema_type'] = self.schema_type
        if self.structured_data_schema is not None:
            result['structured_data_schema'] = self.structured_data_schema.to_map()
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
        if m.get('datasource_id') is not None:
            self.datasource_id = m.get('datasource_id')
        if m.get('datasource_type') is not None:
            self.datasource_type = m.get('datasource_type')
        if m.get('conn_config') is not None:
            self.conn_config = m.get('conn_config')
        if m.get('location_config') is not None:
            self.location_config = m.get('location_config')
        if m.get('format_type') is not None:
            self.format_type = m.get('format_type')
        if m.get('format_config') is not None:
            self.format_config = m.get('format_config')
        if m.get('schema_type') is not None:
            self.schema_type = m.get('schema_type')
        if m.get('structured_data_schema') is not None:
            temp_model = StructuredDataSchema()
            self.structured_data_schema = temp_model.from_map(m['structured_data_schema'])
        return self


class CreateAntchainPdcpDatasetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: LocalDataset = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 创建后的数据集信息
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
            temp_model = LocalDataset()
            self.data = temp_model.from_map(m['data'])
        return self


class DeleteAntchainPdcpDatasetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dataset_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待删除的数据集 id，必填
        self.dataset_id = dataset_id

    def validate(self):
        self.validate_required(self.dataset_id, 'dataset_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.dataset_id is not None:
            result['dataset_id'] = self.dataset_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dataset_id') is not None:
            self.dataset_id = m.get('dataset_id')
        return self


class DeleteAntchainPdcpDatasetResponse(TeaModel):
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


class UpdateAntchainPdcpDatasetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        datasource_id: str = None,
        dataset_id: str = None,
        datasource_type: str = None,
        name: str = None,
        description: str = None,
        conn_config: str = None,
        location_config: str = None,
        format_type: str = None,
        format_config: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 采用数据源配置进行登记时的数据源 id，非必填，不填则不更新
        # 如果填写了本参数，则可不填写datasourceType和connConfig
        # 如果填写了本参数，将优先采用本参数指定的datasource配置
        self.datasource_id = datasource_id
        # 待更新的数据集 id，必填
        self.dataset_id = dataset_id
        # 数据集数据源类型，非必填，不填则不更新。
        # 如果填写了datasourceId，则可不传本参数，填写了本参数也将被忽略。
        # 如果未填写datasourceId，则必须同时填写本参数和connConfig参数。
        # 示例如下：
        # MYSQL,
        # DB2,
        # SQLSERVER,
        # ORACLE,
        # HIVE2,
        # ODPS
        self.datasource_type = datasource_type
        # 更新后的数据集名称，非必填，不填则不更新
        self.name = name
        # 更新后的数据集描述，非必填，不填则不更新
        self.description = description
        # 数据集数据源连接信息转化的json字符串，非必填，不填则不更新。
        # 如果填写了datasourceId，则可不传本参数，填写本参数也将被忽略。
        # 如果未填写datasourceId，则必须同时填写本参数和datasourceType参数。
        # 该参数请参考如下对应结构体，定义好后需转成jsonString，对应信息如下：
        # MYSQL -> MysqlConnConfig,
        # ORACLE -> OracleConnConfig,
        # SQLSERVER -> SqlServerConnConfig,
        # DB2 -> DbTwoConnConfig,
        # HIVE2 -> HiveTwoConnConfig,
        # ODPS -> OdpsConnConfig
        self.conn_config = conn_config
        # 数据集位置信息转化的json字符串，如数据表名称等，非必填，不填则不更新。
        # 如果填写了datasourceId，则本参数必填且根据 datasourceId 对应的数据源类型进行解析。
        # 如果未填写datasourceId且填写了 connConfig，则本参数必填且根据datasourceType进行解析。
        # 该参数请参考如下对应结构体，定义好后需转成jsonString，对应信息如下：
        # MYSQL -> MysqlLocationConfig,
        # ORACLE -> OracleLocationConfig,
        # SQLSERVER -> SqlServerLocationConfig,
        # DB2 -> DbTwoLocationConfig,
        # HIVE2 -> HiveTwoLocationConfig,
        # ODPS -> OdpsLocationConfig
        self.location_config = location_config
        # 数据集格式类型，非必填，不填则不更新，如果填写，则format_config也必须填写。
        # 示例：TABLE
        self.format_type = format_type
        # 数据集数据源格式信息，如 csv 分隔符，数据库主键名称等，非必填，不填则不更新
        # 如果填写，则formatType也必须填写
        # 该参数请参考如下对应结构体，定义好后需转成jsonString，对应关系如下：
        # 数据表 -> TableFormatConfig，
        self.format_config = format_config

    def validate(self):
        self.validate_required(self.dataset_id, 'dataset_id')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 50)
        if self.description is not None:
            self.validate_max_length(self.description, 'description', 200)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.datasource_id is not None:
            result['datasource_id'] = self.datasource_id
        if self.dataset_id is not None:
            result['dataset_id'] = self.dataset_id
        if self.datasource_type is not None:
            result['datasource_type'] = self.datasource_type
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.conn_config is not None:
            result['conn_config'] = self.conn_config
        if self.location_config is not None:
            result['location_config'] = self.location_config
        if self.format_type is not None:
            result['format_type'] = self.format_type
        if self.format_config is not None:
            result['format_config'] = self.format_config
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('datasource_id') is not None:
            self.datasource_id = m.get('datasource_id')
        if m.get('dataset_id') is not None:
            self.dataset_id = m.get('dataset_id')
        if m.get('datasource_type') is not None:
            self.datasource_type = m.get('datasource_type')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('conn_config') is not None:
            self.conn_config = m.get('conn_config')
        if m.get('location_config') is not None:
            self.location_config = m.get('location_config')
        if m.get('format_type') is not None:
            self.format_type = m.get('format_type')
        if m.get('format_config') is not None:
            self.format_config = m.get('format_config')
        return self


class UpdateAntchainPdcpDatasetResponse(TeaModel):
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


class QueryAntchainPdcpDatasetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dataset_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据集id
        self.dataset_id = dataset_id

    def validate(self):
        self.validate_required(self.dataset_id, 'dataset_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.dataset_id is not None:
            result['dataset_id'] = self.dataset_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dataset_id') is not None:
            self.dataset_id = m.get('dataset_id')
        return self


class QueryAntchainPdcpDatasetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: LocalDataset = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询到的数据集信息
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
            temp_model = LocalDataset()
            self.data = temp_model.from_map(m['data'])
        return self


class PagequeryAntchainPdcpDatasetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        datasource_id: str = None,
        datasource_type: str = None,
        page: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据集名称
        self.name = name
        # 所属的数据源id，非必填
        self.datasource_id = datasource_id
        # 所属的数据源类型，非必填。
        # 示例如下：
        # MYSQL,
        # DB2,
        # SQLSERVER,
        # ORACLE,
        # HIVE2,
        # ODPS
        self.datasource_type = datasource_type
        # 分页页数,不允许为空
        self.page = page
        # 分页大小，不允许为空
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.page, 'page')
        if self.page is not None:
            self.validate_minimum(self.page, 'page', 1)
        self.validate_required(self.page_size, 'page_size')
        if self.page_size is not None:
            self.validate_minimum(self.page_size, 'page_size', 1)

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
        if self.datasource_id is not None:
            result['datasource_id'] = self.datasource_id
        if self.datasource_type is not None:
            result['datasource_type'] = self.datasource_type
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
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('datasource_id') is not None:
            self.datasource_id = m.get('datasource_id')
        if m.get('datasource_type') is not None:
            self.datasource_type = m.get('datasource_type')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryAntchainPdcpDatasetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        page: int = None,
        page_size: int = None,
        data: List[LocalDataset] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果的总数量
        self.total = total
        # 分页页数
        self.page = page
        # 分页大小
        self.page_size = page_size
        # 返回的数据集元信息的列表
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
        if self.total is not None:
            result['total'] = self.total
        if self.page is not None:
            result['page'] = self.page
        if self.page_size is not None:
            result['page_size'] = self.page_size
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
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = LocalDataset()
                self.data.append(temp_model.from_map(k))
        return self


class RecognizeAntchainPdcpDatasetSchemaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        datasource_id: str = None,
        datasource_type: str = None,
        conn_config: str = None,
        location_config: str = None,
        format_type: str = None,
        format_config: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 采用数据源配置进行登记时的数据源 id
        # 如果填写了本参数，则可不填写datasourceType和connConfig
        # 如果填写了本参数，将优先采用本参数指定的 datasource 配置
        self.datasource_id = datasource_id
        # 数据资产数据源类型
        # 如果填写了datasourceId，则可不传本参数，填写了本参数也将被忽略
        # 如果未填写datasourceId，则必须同时填写本参数和connConfig参数
        self.datasource_type = datasource_type
        # 数据资产数据源连接信息，与数据源类型必须一一对应。
        # 如果填写了datasourceId，则可不传本参数，填写本参数也将被忽略。
        # 如果未填写datasourceId，则必须同时填写本参数和datasourceType参数。
        # 该参数请参考如下对应结构体，定义好后需转成jsonString，具体的对应信息如下：
        # MYSQL -> MysqlConnConfig,
        # ORACLE -> OracleConnConfig,
        # SQLSERVER -> SqlServerConnConfig,
        # DB2 -> DbTwoConnConfig,
        # HIVE2 -> HiveTwoConnConfig,
        # ODPS -> OdpsConnConfig
        self.conn_config = conn_config
        # 数据集位置配置，如数据表名称等。
        # 如果填写了datasourceId，则根据datasourceId对应的数据源类型进行解析。
        # 如果未填写datasourceId，则根据datasourceType进行解析。
        # 该参数请参考如下对应结构体，定义好后需转成jsonString，对应信息如下：
        # MYSQL -> MysqlLocationConfig,
        # ORACLE -> OracleLocationConfig,
        # SQLSERVER -> SqlServerLocationConfig,
        # DB2 -> DbTwoLocationConfig,
        # HIVE2 -> HiveTwoLocationConfig,
        # ODPS -> OdpsLocationConfig
        self.location_config = location_config
        # 数据集格式类型，如TABLE。
        self.format_type = format_type
        # 数据集所属的数据源格式信息，如 csv 分隔符，数据库主键名称等。
        # 该参数请参考如下对应结构体，定义好后需转成jsonString，对应关系如下：
        # 数据表 -> TableFormatConfig，
        self.format_config = format_config

    def validate(self):
        self.validate_required(self.location_config, 'location_config')
        self.validate_required(self.format_type, 'format_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.datasource_id is not None:
            result['datasource_id'] = self.datasource_id
        if self.datasource_type is not None:
            result['datasource_type'] = self.datasource_type
        if self.conn_config is not None:
            result['conn_config'] = self.conn_config
        if self.location_config is not None:
            result['location_config'] = self.location_config
        if self.format_type is not None:
            result['format_type'] = self.format_type
        if self.format_config is not None:
            result['format_config'] = self.format_config
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('datasource_id') is not None:
            self.datasource_id = m.get('datasource_id')
        if m.get('datasource_type') is not None:
            self.datasource_type = m.get('datasource_type')
        if m.get('conn_config') is not None:
            self.conn_config = m.get('conn_config')
        if m.get('location_config') is not None:
            self.location_config = m.get('location_config')
        if m.get('format_type') is not None:
            self.format_type = m.get('format_type')
        if m.get('format_config') is not None:
            self.format_config = m.get('format_config')
        return self


class RecognizeAntchainPdcpDatasetSchemaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: RecognizedDatasetSchema = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 识别到的数据集的 schema 信息
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
            temp_model = RecognizedDatasetSchema()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateAntchainPdcpProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        party_list: List[PartyReq] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目名称
        self.name = name
        # 参与方节点信息列表，不同的节点类型参考不同结构体。一期节点类型仅支持FATE，其构造方式请参考FatePartyLocalConfigInfo
        self.party_list = party_list

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.party_list, 'party_list')
        if self.party_list:
            for k in self.party_list:
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
        if self.name is not None:
            result['name'] = self.name
        result['party_list'] = []
        if self.party_list is not None:
            for k in self.party_list:
                result['party_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        self.party_list = []
        if m.get('party_list') is not None:
            for k in m.get('party_list'):
                temp_model = PartyReq()
                self.party_list.append(temp_model.from_map(k))
        return self


class CreateAntchainPdcpProjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: Project = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 项目信息
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
            temp_model = Project()
            self.data = temp_model.from_map(m['data'])
        return self


class GetAntchainPdcpProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目唯一标识
        self.project_id = project_id

    def validate(self):
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
        if self.project_id is not None:
            result['project_id'] = self.project_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        return self


class GetAntchainPdcpProjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: Project = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 项目详情信息
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
            temp_model = Project()
            self.data = temp_model.from_map(m['data'])
        return self


class AuthAntchainPdcpProjectDatasetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        config: str = None,
        project_id: str = None,
        visible_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据集名称
        self.name = name
        # 数据集配置参数，若授权的数据集归属于云上的节点，则参考结构体AuthSaasDatasetConfig，若授权的数据集归属于线下的节点，则参考结构体AuthFateDatasetConfig
        self.config = config
        # 项目ID
        self.project_id = project_id
        # 项目内可见范围类型，ALL_TENANT全部机构可见，SPECIFIC_TENANT部分机构可见。调用授权数据集 和 数据源请求时 若不填该参数，则默认ALL_TENANT
        self.visible_type = visible_type

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.config, 'config')
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
        if self.name is not None:
            result['name'] = self.name
        if self.config is not None:
            result['config'] = self.config
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.visible_type is not None:
            result['visible_type'] = self.visible_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('config') is not None:
            self.config = m.get('config')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('visible_type') is not None:
            self.visible_type = m.get('visible_type')
        return self


class AuthAntchainPdcpProjectDatasetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AuthDataset = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权至某个项目中的数据集信息
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
            temp_model = AuthDataset()
            self.data = temp_model.from_map(m['data'])
        return self


class AuthAntchainPdcpProjectDatasourceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        config: str = None,
        project_id: str = None,
        visible_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据源名称
        self.name = name
        # 选择已登记的数据源ID，云上的参考AuthSaasDatasourceConfig
        self.config = config
        # 项目ID
        self.project_id = project_id
        # 项目内可见范围类型，ALL_TENANT全部机构可见，SPECIFIC_TENANT部分机构可见。调用授权数据集 和 数据源请求时 若不填该参数，则默认ALL_TENANT
        self.visible_type = visible_type

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.config, 'config')
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
        if self.name is not None:
            result['name'] = self.name
        if self.config is not None:
            result['config'] = self.config
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.visible_type is not None:
            result['visible_type'] = self.visible_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('config') is not None:
            self.config = m.get('config')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('visible_type') is not None:
            self.visible_type = m.get('visible_type')
        return self


class AuthAntchainPdcpProjectDatasourceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AuthDatasource = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权至项目的数据源信息
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
            temp_model = AuthDatasource()
            self.data = temp_model.from_map(m['data'])
        return self


class PagequeryAntchainPdcpProjectAuthdatasetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
        page: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目ID
        self.project_id = project_id
        # 分页参数
        self.page = page
        # 分页参数
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.page, 'page')
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
        if self.project_id is not None:
            result['project_id'] = self.project_id
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
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryAntchainPdcpProjectAuthdatasetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        page: int = None,
        page_size: int = None,
        data: List[AuthDataset] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果的总数量
        self.total = total
        # 分页页数
        self.page = page
        # 分页大小
        self.page_size = page_size
        # 返回的数据集元信息的列表
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
        if self.total is not None:
            result['total'] = self.total
        if self.page is not None:
            result['page'] = self.page
        if self.page_size is not None:
            result['page_size'] = self.page_size
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
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = AuthDataset()
                self.data.append(temp_model.from_map(k))
        return self


class PagequeryAntchainPdcpProjectAuthdatasourceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
        page: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目ID
        self.project_id = project_id
        # 分页参数
        self.page = page
        # 分页参数
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.page, 'page')
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
        if self.project_id is not None:
            result['project_id'] = self.project_id
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
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryAntchainPdcpProjectAuthdatasourceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        page: int = None,
        page_size: int = None,
        data: List[AuthDatasource] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果的总数量
        self.total = total
        # 分页页数
        self.page = page
        # 分页大小
        self.page_size = page_size
        # 返回项目内已授权的数据集源信息的列表
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
        if self.total is not None:
            result['total'] = self.total
        if self.page is not None:
            result['page'] = self.page
        if self.page_size is not None:
            result['page_size'] = self.page_size
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
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = AuthDatasource()
                self.data.append(temp_model.from_map(k))
        return self


class QueryAntchainPdcpJobPsiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        job_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.job_id = job_id

    def validate(self):
        self.validate_required(self.job_id, 'job_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.job_id is not None:
            result['job_id'] = self.job_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('job_id') is not None:
            self.job_id = m.get('job_id')
        return self


class QueryAntchainPdcpJobPsiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: PsiJob = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务信息
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
            temp_model = PsiJob()
            self.data = temp_model.from_map(m['data'])
        return self


class SubmitAntchainPdcpJobPsiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
        name: str = None,
        type: str = None,
        description: str = None,
        participant_list: List[PsiParticipantConfig] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目ID
        self.project_id = project_id
        # 任务名称
        self.name = name
        # 任务类型，目前仅支持一种
        self.type = type
        # 任务的描述信息
        self.description = description
        # 任务执行参数，构造方式参考Participant结构体定义
        self.participant_list = participant_list

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.type, 'type')
        self.validate_required(self.description, 'description')
        self.validate_required(self.participant_list, 'participant_list')
        if self.participant_list:
            for k in self.participant_list:
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
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.description is not None:
            result['description'] = self.description
        result['participant_list'] = []
        if self.participant_list is not None:
            for k in self.participant_list:
                result['participant_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('description') is not None:
            self.description = m.get('description')
        self.participant_list = []
        if m.get('participant_list') is not None:
            for k in m.get('participant_list'):
                temp_model = PsiParticipantConfig()
                self.participant_list.append(temp_model.from_map(k))
        return self


class SubmitAntchainPdcpJobPsiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: PsiJob = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务信息
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
            temp_model = PsiJob()
            self.data = temp_model.from_map(m['data'])
        return self


