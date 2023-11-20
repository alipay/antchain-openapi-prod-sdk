// This file is auto-generated, don't edit it
import AntchainUtil from '@antchain/alipay-util';
import Util, * as $Util from '@alicloud/tea-util';
import RPCUtil from '@alicloud/rpc-util';
import * as $tea from '@alicloud/tea-typescript';

/**
 * Model for initing client
 */
export class Config extends $tea.Model {
  accessKeyId?: string;
  accessKeySecret?: string;
  securityToken?: string;
  protocol?: string;
  readTimeout?: number;
  connectTimeout?: number;
  httpProxy?: string;
  httpsProxy?: string;
  endpoint?: string;
  noProxy?: string;
  maxIdleConns?: number;
  userAgent?: string;
  socks5Proxy?: string;
  socks5NetWork?: string;
  maxIdleTimeMillis?: number;
  keepAliveDurationMillis?: number;
  maxRequests?: number;
  maxRequestsPerHost?: number;
  static names(): { [key: string]: string } {
    return {
      accessKeyId: 'accessKeyId',
      accessKeySecret: 'accessKeySecret',
      securityToken: 'securityToken',
      protocol: 'protocol',
      readTimeout: 'readTimeout',
      connectTimeout: 'connectTimeout',
      httpProxy: 'httpProxy',
      httpsProxy: 'httpsProxy',
      endpoint: 'endpoint',
      noProxy: 'noProxy',
      maxIdleConns: 'maxIdleConns',
      userAgent: 'userAgent',
      socks5Proxy: 'socks5Proxy',
      socks5NetWork: 'socks5NetWork',
      maxIdleTimeMillis: 'maxIdleTimeMillis',
      keepAliveDurationMillis: 'keepAliveDurationMillis',
      maxRequests: 'maxRequests',
      maxRequestsPerHost: 'maxRequestsPerHost',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accessKeyId: 'string',
      accessKeySecret: 'string',
      securityToken: 'string',
      protocol: 'string',
      readTimeout: 'number',
      connectTimeout: 'number',
      httpProxy: 'string',
      httpsProxy: 'string',
      endpoint: 'string',
      noProxy: 'string',
      maxIdleConns: 'number',
      userAgent: 'string',
      socks5Proxy: 'string',
      socks5NetWork: 'string',
      maxIdleTimeMillis: 'number',
      keepAliveDurationMillis: 'number',
      maxRequests: 'number',
      maxRequestsPerHost: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 该参与方的输入数据配置
export class ParticipantInput extends $tea.Model {
  // 授权至项目内的数据集ID
  authDatasetId: string;
  // 上述数据集所需参与计算的列
  fields?: string[];
  // 用户筛选该数据集的过滤条件
  filter?: string;
  static names(): { [key: string]: string } {
    return {
      authDatasetId: 'auth_dataset_id',
      fields: 'fields',
      filter: 'filter',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authDatasetId: 'string',
      fields: { 'type': 'array', 'itemType': 'string' },
      filter: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 参与方输出配置参数
export class ParticipantOutput extends $tea.Model {
  // 授权至项目内的数据源ID
  authDatasourceId?: string;
  // 输出表名
  tableName?: string;
  // 输出类型，本期仅支持FULL
  writeType?: string;
  static names(): { [key: string]: string } {
    return {
      authDatasourceId: 'auth_datasource_id',
      tableName: 'table_name',
      writeType: 'write_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authDatasourceId: 'string',
      tableName: 'string',
      writeType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 字段的元信息
export class StructuredDataField extends $tea.Model {
  // 字段名称
  name?: string;
  // 字段描述
  description?: string;
  // 字段类型。
  // 示例如下：
  // STRING,
  // INTEGER,
  // DOUBLE,
  // BOOLEAN
  type?: string;
  // 字段是否可为空
  nullable?: boolean;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      description: 'description',
      type: 'type',
      nullable: 'nullable',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      description: 'string',
      type: 'string',
      nullable: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 项目内参与方节点信息
export class Party extends $tea.Model {
  // 参与方节点id，创建项目时无需传入，由saas统一分配
  partyId?: string;
  // 所属方id，若为云上节点，则为云上租户ID，若为线下节点，则该参数为空
  tenantId?: string;
  // 参与方节点类型，创建项目时无需填写，由local_config字段推导出节点参与方类型；
  // 一期支持两类，FATE为线下fate参与方节点，SAAS_FATE为云上fate参与方节点
  type?: string;
  // 参与方配置json，当type为FATE时，其结构为FatePartyConfigInfo，当type为SAAS_FATE时，其结构为List<FatePartyConfigInfo>
  nodeConfig?: string;
  static names(): { [key: string]: string } {
    return {
      partyId: 'party_id',
      tenantId: 'tenant_id',
      type: 'type',
      nodeConfig: 'node_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      partyId: 'string',
      tenantId: 'string',
      type: 'string',
      nodeConfig: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// psi参与方任务配置信息
export class PsiParticipantConfig extends $tea.Model {
  // 参与方所属节点ID
  partyId: string;
  // 该参与方用于求交的匹配列，对于线下fate节点不填写该参数，默认匹配其第一列
  matchedColumn?: string;
  // 参与方输入数据，参考结构体定义
  input: ParticipantInput;
  // 参与方输出数据，参考结构体定义
  output?: ParticipantOutput;
  static names(): { [key: string]: string } {
    return {
      partyId: 'party_id',
      matchedColumn: 'matched_column',
      input: 'input',
      output: 'output',
    };
  }

  static types(): { [key: string]: any } {
    return {
      partyId: 'string',
      matchedColumn: 'string',
      input: ParticipantInput,
      output: ParticipantOutput,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 结构化数据源的schema信息
export class StructuredDataSchema extends $tea.Model {
  // 结构化数据字段列表
  fieldList?: StructuredDataField[];
  static names(): { [key: string]: string } {
    return {
      fieldList: 'field_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fieldList: { 'type': 'array', 'itemType': StructuredDataField },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// psi任务信息
export class PsiJob extends $tea.Model {
  // 项目ID
  projectId: string;
  // 执行任务ID
  jobId: string;
  // 发起任务的租户ID
  tenantId: string;
  // 任务提交时间（毫秒）
  gmtCreate: number;
  // 任务真正开始执行的unix 时间戳（毫秒）
  gmtExecStart: number;
  // 任务最终执行完成时间（毫秒）
  gmtExecEnd: number;
  // 任务名称
  name: string;
  // 任务类型
  type: string;
  // 项目类型
  projectType: string;
  // 项目描述信息
  description: string;
  // 任务执行状态，EXECUTING执行中，SUCCESS执行成功，FAILED执行失败
  status: string;
  // 任务执行结果信息，若执行失败则返回错误日志
  resultMsg?: string;
  // 参与方配置参数，参考结构体定义
  participantList: PsiParticipantConfig[];
  static names(): { [key: string]: string } {
    return {
      projectId: 'project_id',
      jobId: 'job_id',
      tenantId: 'tenant_id',
      gmtCreate: 'gmt_create',
      gmtExecStart: 'gmt_exec_start',
      gmtExecEnd: 'gmt_exec_end',
      name: 'name',
      type: 'type',
      projectType: 'project_type',
      description: 'description',
      status: 'status',
      resultMsg: 'result_msg',
      participantList: 'participant_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      projectId: 'string',
      jobId: 'string',
      tenantId: 'string',
      gmtCreate: 'number',
      gmtExecStart: 'number',
      gmtExecEnd: 'number',
      name: 'string',
      type: 'string',
      projectType: 'string',
      description: 'string',
      status: 'string',
      resultMsg: 'string',
      participantList: { 'type': 'array', 'itemType': PsiParticipantConfig },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 推断出的数据集schema
export class RecognizedDatasetSchema extends $tea.Model {
  // 数据集格式类型。
  // 示例如下：
  // TABLE,
  // CSV
  formatType?: string;
  // 数据集数据源格式信息，如 csv 分隔符，数据库主键名称等。
  // 对应关系如下：
  // 数据表 -> TableFormatConfig，
  // CSV文件 -> CSVFormatConfig
  formatConfig?: string;
  // 数据集 schema 类型。
  schemaType?: string;
  // 结构化数据 schema
  // schema_type为STRUCTURED_DATA时必填
  structuredDataSchema?: StructuredDataSchema;
  static names(): { [key: string]: string } {
    return {
      formatType: 'format_type',
      formatConfig: 'format_config',
      schemaType: 'schema_type',
      structuredDataSchema: 'structured_data_schema',
    };
  }

  static types(): { [key: string]: any } {
    return {
      formatType: 'string',
      formatConfig: 'string',
      schemaType: 'string',
      structuredDataSchema: StructuredDataSchema,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用于描述数据源的元信息
export class LocalDatasource extends $tea.Model {
  // 数据源id
  id?: string;
  // 数据源名称
  name?: string;
  // 数据源描述信息
  description?: string;
  // 当前数据源是否支持写入
  writable?: boolean;
  // 用于描述数据源类型的枚举。
  // 示例如下：
  // MYSQL,
  // DB2,
  // SQLSERVER,
  // ORACLE,
  // HIVE2,
  // ODPS
  // 
  type?: string;
  // 用于描述数据源的连接信息，为描述连接信息的数据对象转化为的json字符串，与type指定的数据源类型必须一一对应。
  // 该参数请参考如下对应结构体，定义好后需转成jsonString，对应关系展示如下：
  // MYSQL -> MysqlConnConfig,
  // ORACLE -> OracleConnConfig,
  // SQLSERVER -> SqlServerConnConfig,
  // DB2 -> DbTwoConnConfig,
  // HIVE2 -> HiveTwoConnConfig,
  // ODPS -> OdpsConnConfig
  connConfig?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      description: 'description',
      writable: 'writable',
      type: 'type',
      connConfig: 'conn_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      description: 'string',
      writable: 'boolean',
      type: 'string',
      connConfig: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用于描述数据集的元信息
export class LocalDataset extends $tea.Model {
  // 数据集id
  id?: string;
  // 数据集名称
  name?: string;
  // 数据集描述
  description?: string;
  // 数据集所属的数据源 id
  datasourceId?: string;
  // 数据源类型。
  // 示例如下：
  // MYSQL,
  // DB2,
  // SQLSERVER,
  // ORACLE,
  // HIVE2,
  // ODPS
  datasourceType?: string;
  // 数据源连接参数转化成的json字符串，必须与数据源类型一一对应。
  // 该参数请参考如下对应结构体，定义好后需转成jsonString，具体的对应信息如下：
  // MYSQL -> MysqlConnConfig,
  // ORACLE -> OracleConnConfig,
  // SQLSERVER -> SqlServerConnConfig,
  // DB2 -> DbTwoConnConfig,
  // HIVE2 -> HiveTwoConnConfig,
  // ODPS -> OdpsConnConfig
  datasourceConnConfig?: string;
  // 数据集在数据源中的位置信息转化成的json字符串，如数据表名称等，必须和数据源类型一一对应。
  // 该参数请参考如下对应结构体，定义好后需转成jsonString，具体的对应关系如下：
  // MYSQL -> MysqlLocationConfig,
  // ORACLE -> OracleLocationConfig,
  // SQLSERVER -> SqlServerLocationConfig,
  // DB2 -> DbTwoLocationConfig,
  // HIVE2 -> HiveTwoLocationConfig,
  // ODPS -> OdpsLocationConfig
  locationConfig?: string;
  // 数据集格式类型。
  // 示例如下：
  // TABLE
  formatType?: string;
  // 数据集格式信息，如 csv 分隔符，数据库主键名称等，与数据集类型一一对应。
  // 该参数请参考如下对应结构体，定义好后需转成jsonString，当前支持的类型展示如下：
  // 数据表 -> TableFormatConfig
  formatConfig?: string;
  // 数据集 schema 类型。
  // 示例如下：
  // STRUCTURED_DATA
  schemaType?: string;
  // 结构化数据 schema，schema_type为STRUCTURED_DATA时必填
  structuredDataSchema?: StructuredDataSchema;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      description: 'description',
      datasourceId: 'datasource_id',
      datasourceType: 'datasource_type',
      datasourceConnConfig: 'datasource_conn_config',
      locationConfig: 'location_config',
      formatType: 'format_type',
      formatConfig: 'format_config',
      schemaType: 'schema_type',
      structuredDataSchema: 'structured_data_schema',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      description: 'string',
      datasourceId: 'string',
      datasourceType: 'string',
      datasourceConnConfig: 'string',
      locationConfig: 'string',
      formatType: 'string',
      formatConfig: 'string',
      schemaType: 'string',
      structuredDataSchema: StructuredDataSchema,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 已授权至项目内的数据源配置信息
export class AuthDatasource extends $tea.Model {
  // 授权数据源ID
  authDatasourceId: string;
  // 创建数据源授权时间(毫秒)
  gmtCreate: number;
  // 更新数据源授权时间(毫秒)
  gmtModified: number;
  // 数据源名称
  name: string;
  // 对应本地数据源的配置参数
  config: string;
  //  数据源来源
  source: string;
  // 项目ID
  projectId: string;
  // 项目内可见范围类型，ALL_TENANT全部机构可见，SPECIFIC_TENANT部分机构可见。调用授权数据集 和 数据源请求时 若不填该参数，则默认ALL_TENANT
  visibleType: string;
  static names(): { [key: string]: string } {
    return {
      authDatasourceId: 'auth_datasource_id',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      name: 'name',
      config: 'config',
      source: 'source',
      projectId: 'project_id',
      visibleType: 'visible_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authDatasourceId: 'string',
      gmtCreate: 'number',
      gmtModified: 'number',
      name: 'string',
      config: 'string',
      source: 'string',
      projectId: 'string',
      visibleType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 项目信息
export class Project extends $tea.Model {
  // 项目ID
  projectId: string;
  // 创建者ID
  tenantId: string;
  // 项目名称
  name: string;
  // 项目状态:CREATING为创建中，FAILED为创建失败，FINISHED为创建完成。仅状态为FINISHED的项目才允许创建任务
  status: string;
  // 创建时间（毫秒）
  gmtCreate?: number;
  // 更新时间（毫秒）
  gmtModified?: number;
  // 参与方列表
  partyList: Party[];
  static names(): { [key: string]: string } {
    return {
      projectId: 'project_id',
      tenantId: 'tenant_id',
      name: 'name',
      status: 'status',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      partyList: 'party_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      projectId: 'string',
      tenantId: 'string',
      name: 'string',
      status: 'string',
      gmtCreate: 'number',
      gmtModified: 'number',
      partyList: { 'type': 'array', 'itemType': Party },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 项目内授权的数据集信息
export class AuthDataset extends $tea.Model {
  // 授权数据集ID
  authDatasetId: string;
  // 创建授权时间(毫秒)
  gmtCreate: number;
  // 更新授权时间(毫秒)
  gmtModified: number;
  // 数据集名称
  name: string;
  // 数据集配置参数
  config: string;
  // SAAS：该数据集为云上saas节点登记，数据的元信息存储于fdf中
  // FATE：该数据集为线下fate节点登记，数据参数仅有tablename&namespace
  source: string;
  // 项目ID
  projectId: string;
  // 项目内可见范围类型，ALL_TENANT全部机构可见，SPECIFIC_TENANT部分机构可见。调用授权数据集 和 数据源请求时 若不填该参数，则默认ALL_TENANT
  visibleType: string;
  static names(): { [key: string]: string } {
    return {
      authDatasetId: 'auth_dataset_id',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      name: 'name',
      config: 'config',
      source: 'source',
      projectId: 'project_id',
      visibleType: 'visible_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authDatasetId: 'string',
      gmtCreate: 'number',
      gmtModified: 'number',
      name: 'string',
      config: 'string',
      source: 'string',
      projectId: 'string',
      visibleType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 创建项目时所有参与方的连接参数
export class PartyReq extends $tea.Model {
  // 参与方类型，例如：{FATE, SAAS_FATE, KUSCIA, SAAS_KUSCIA}
  type: string;
  // 参与方租户id
  tenantId?: string;
  // 远端节点的配置信息，本期仅支持一种类型：FATE，其配置参考FatePartyLocalConfigInfo结构体定义
  remoteConfig: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      tenantId: 'tenant_id',
      remoteConfig: 'remote_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      tenantId: 'string',
      remoteConfig: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntchainPdcpDatasourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据源名称，必填，长度不超过50个字符
  name: string;
  // 数据源的描述，数据量，作用域等等。
  // 非必填，长度不超过200个字符。
  description?: string;
  // 描述当前数据源是否支持写入。
  // true表示支持写入。
  writable: boolean;
  // 描述数据源类型的枚举，必填。
  // 示例如下：
  // MYSQL,
  // DB2,
  // SQLSERVER,
  // ORACLE,
  // HIVE2,
  // ODPS
  type: string;
  // 数据源连接信息的对象体转化为的json字符串。
  // 要求连接信息的类型必须与type指定的一致。
  // 该参数请参考如下的对应结构体，定义好后转化成jsonstring，对应信息如下：
  // MYSQL -> MysqlConnConfig,
  // ORACLE -> OracleConnConfig,
  // SQLSERVER -> SqlServerConnConfig,
  // DB2 -> DbTwoConnConfig,
  // HIVE2 -> HiveTwoConnConfig,
  // ODPS -> OdpsConnConfig
  connConfig: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      description: 'description',
      writable: 'writable',
      type: 'type',
      connConfig: 'conn_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      description: 'string',
      writable: 'boolean',
      type: 'string',
      connConfig: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntchainPdcpDatasourceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建的数据源的信息。
  data?: LocalDatasource;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: LocalDatasource,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAntchainPdcpDatasourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待删除的数据源 id，必填
  datasourceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      datasourceId: 'datasource_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      datasourceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAntchainPdcpDatasourceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAntchainPdcpDatasourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待更新的数据源 id，必填
  datasourceId: string;
  // 更新后的数据源名称，非必填，不填则不更新
  name?: string;
  // 更新后的数据源描述，非必填，不填则不更新
  description?: string;
  // 数据源是否可写，非必填，不填则不更新
  writable?: boolean;
  // 数据源连接参数，非必填，不填则不更新，注意必须与此数据源创建时的类型一致。
  // 该参数请参考如下对应结构体，定义好后需转成jsonString，对应关系展示如下：
  // MYSQL -> MysqlConnConfig,
  // ORACLE -> OracleConnConfig,
  // SQLSERVER -> SqlServerConnConfig,
  // DB2 -> DbTwoConnConfig,
  // HIVE2 -> HiveTwoConnConfig,
  // ODPS -> OdpsConnConfig
  connConfig?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      datasourceId: 'datasource_id',
      name: 'name',
      description: 'description',
      writable: 'writable',
      connConfig: 'conn_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      datasourceId: 'string',
      name: 'string',
      description: 'string',
      writable: 'boolean',
      connConfig: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAntchainPdcpDatasourceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainPdcpDatasourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 想要查询的数据源的数据源id，用于指定数据源
  datasourceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      datasourceId: 'datasource_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      datasourceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainPdcpDatasourceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询到的指定数据源的信息
  data?: LocalDatasource;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: LocalDatasource,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryAntchainPdcpDatasourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据源名称，筛选用，非必填
  name?: string;
  // 数据源类型，筛选用，非必填。
  // 示例如下：
  // MYSQL,
  // DB2,
  // SQLSERVER,
  // ORACLE,
  // HIVE2,
  // OSS,
  // MINIO
  type?: string;
  // 数据源是否可写，筛选用，非必填
  writable?: boolean;
  // 分页页数，必填
  page: number;
  // 分页大小，必填
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      type: 'type',
      writable: 'writable',
      page: 'page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      type: 'string',
      writable: 'boolean',
      page: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryAntchainPdcpDatasourceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果的总数
  total?: number;
  // 分页页数
  page?: string;
  // 分页大小
  pageSize?: number;
  // 返回的数据源元信息列表
  data?: LocalDatasource[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      total: 'total',
      page: 'page',
      pageSize: 'page_size',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      total: 'number',
      page: 'string',
      pageSize: 'number',
      data: { 'type': 'array', 'itemType': LocalDatasource },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntchainPdcpDatasetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据集名称，必填
  name: string;
  // 数据集描述，非必填
  description?: string;
  // 采用数据源配置进行登记时的数据源 id
  // 如果填写了本参数，则可不填写datasourceType和connConfig
  // 如果填写了本参数，将优先采用本参数指定的 datasource 配置
  datasourceId?: string;
  // 数据集数据源类型。
  // 如果填写了datasourceId，则可不传本参数，填写了本参数也将被忽略。
  // 如果未填写datasourceId，则必须同时填写本参数和 connConfig参数。
  // 示例如下：
  // MYSQL,
  // DB2,
  // SQLSERVER,
  // ORACLE,
  // HIVE2,
  // ODPS
  datasourceType?: string;
  // 数据集所属数据源连接信息，与数据源类型一一对应。
  // 如果填写了datasourceId，则可不传本参数，填写本参数也将被忽略。
  // 如果未填写 datasourceId，则必须同时填写本参数和datasourceType参数。
  // 该参数请参考如下对应结构体，定义好后需转成jsonString，具体对应关系如下：
  // MYSQL -> MysqlConnConfig,
  // ORACLE -> OracleConnConfig,
  // SQLSERVER -> SqlServerConnConfig,
  // DB2 -> DbTwoConnConfig,
  // HIVE2 -> HiveTwoConnConfig,
  // ODPS -> OdpsConnConfig
  connConfig?: string;
  // 数据集位置信息的对象转化成的json字符串，如数据表名称等。
  // 该参数请参考如下对应结构体，定义好后需转成jsonString，具体的对应信息如下：
  // MYSQL -> MysqlLocationConfig,
  // ORACLE -> OracleLocationConfig,
  // SQLSERVER -> SqlServerLocationConfig,
  // DB2 -> DbTwoLocationConfig,
  // HIVE2 -> HiveTwoLocationConfig,
  // ODPS -> OdpsLocationConfig
  locationConfig: string;
  // 数据集格式类型。
  // 示例如下：
  // TABLE
  formatType: string;
  // 数据集格式信息转化成的json字符串，如 csv 分隔符，数据库主键名称等，必须与数据源类型一一对应。
  // 具体的对应关系如下：
  // 数据表 -> TableFormatConfig
  formatConfig: string;
  // 数据集 schema 类型。
  // 示例如下：
  // STRUCTURED_DATA
  schemaType: string;
  // 结构化数据 schema
  // schemaType为STRUCTURED_DATA时必填
  structuredDataSchema?: StructuredDataSchema;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      description: 'description',
      datasourceId: 'datasource_id',
      datasourceType: 'datasource_type',
      connConfig: 'conn_config',
      locationConfig: 'location_config',
      formatType: 'format_type',
      formatConfig: 'format_config',
      schemaType: 'schema_type',
      structuredDataSchema: 'structured_data_schema',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      description: 'string',
      datasourceId: 'string',
      datasourceType: 'string',
      connConfig: 'string',
      locationConfig: 'string',
      formatType: 'string',
      formatConfig: 'string',
      schemaType: 'string',
      structuredDataSchema: StructuredDataSchema,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntchainPdcpDatasetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建后的数据集信息
  data?: LocalDataset;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: LocalDataset,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAntchainPdcpDatasetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待删除的数据集 id，必填
  datasetId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      datasetId: 'dataset_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      datasetId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAntchainPdcpDatasetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAntchainPdcpDatasetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 采用数据源配置进行登记时的数据源 id，非必填，不填则不更新
  // 如果填写了本参数，则可不填写datasourceType和connConfig
  // 如果填写了本参数，将优先采用本参数指定的datasource配置
  datasourceId?: string;
  // 待更新的数据集 id，必填
  datasetId: string;
  // 数据集数据源类型，非必填，不填则不更新。
  // 如果填写了datasourceId，则可不传本参数，填写了本参数也将被忽略。
  // 如果未填写datasourceId，则必须同时填写本参数和connConfig参数。
  // 示例如下：
  // MYSQL,
  // DB2,
  // SQLSERVER,
  // ORACLE,
  // HIVE2,
  // ODPS
  datasourceType?: string;
  // 更新后的数据集名称，非必填，不填则不更新
  name?: string;
  // 更新后的数据集描述，非必填，不填则不更新
  description?: string;
  // 数据集数据源连接信息转化的json字符串，非必填，不填则不更新。
  // 如果填写了datasourceId，则可不传本参数，填写本参数也将被忽略。
  // 如果未填写datasourceId，则必须同时填写本参数和datasourceType参数。
  // 该参数请参考如下对应结构体，定义好后需转成jsonString，对应信息如下：
  // MYSQL -> MysqlConnConfig,
  // ORACLE -> OracleConnConfig,
  // SQLSERVER -> SqlServerConnConfig,
  // DB2 -> DbTwoConnConfig,
  // HIVE2 -> HiveTwoConnConfig,
  // ODPS -> OdpsConnConfig
  connConfig?: string;
  // 数据集位置信息转化的json字符串，如数据表名称等，非必填，不填则不更新。
  // 如果填写了datasourceId，则本参数必填且根据 datasourceId 对应的数据源类型进行解析。
  // 如果未填写datasourceId且填写了 connConfig，则本参数必填且根据datasourceType进行解析。
  // 该参数请参考如下对应结构体，定义好后需转成jsonString，对应信息如下：
  // MYSQL -> MysqlLocationConfig,
  // ORACLE -> OracleLocationConfig,
  // SQLSERVER -> SqlServerLocationConfig,
  // DB2 -> DbTwoLocationConfig,
  // HIVE2 -> HiveTwoLocationConfig,
  // ODPS -> OdpsLocationConfig
  locationConfig?: string;
  // 数据集格式类型，非必填，不填则不更新，如果填写，则format_config也必须填写。
  // 示例：TABLE
  formatType?: string;
  // 数据集数据源格式信息，如 csv 分隔符，数据库主键名称等，非必填，不填则不更新
  // 如果填写，则formatType也必须填写
  // 该参数请参考如下对应结构体，定义好后需转成jsonString，对应关系如下：
  // 数据表 -> TableFormatConfig，
  formatConfig?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      datasourceId: 'datasource_id',
      datasetId: 'dataset_id',
      datasourceType: 'datasource_type',
      name: 'name',
      description: 'description',
      connConfig: 'conn_config',
      locationConfig: 'location_config',
      formatType: 'format_type',
      formatConfig: 'format_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      datasourceId: 'string',
      datasetId: 'string',
      datasourceType: 'string',
      name: 'string',
      description: 'string',
      connConfig: 'string',
      locationConfig: 'string',
      formatType: 'string',
      formatConfig: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAntchainPdcpDatasetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainPdcpDatasetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据集id
  datasetId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      datasetId: 'dataset_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      datasetId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainPdcpDatasetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询到的数据集信息
  data?: LocalDataset;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: LocalDataset,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryAntchainPdcpDatasetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据集名称
  name?: string;
  // 所属的数据源id，非必填
  datasourceId?: string;
  // 所属的数据源类型，非必填。
  // 示例如下：
  // MYSQL,
  // DB2,
  // SQLSERVER,
  // ORACLE,
  // HIVE2,
  // ODPS
  datasourceType?: string;
  // 分页页数,不允许为空
  page: number;
  // 分页大小，不允许为空
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      datasourceId: 'datasource_id',
      datasourceType: 'datasource_type',
      page: 'page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      datasourceId: 'string',
      datasourceType: 'string',
      page: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryAntchainPdcpDatasetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果的总数量
  total?: number;
  // 分页页数
  page?: number;
  // 分页大小
  pageSize?: number;
  // 返回的数据集元信息的列表
  data?: LocalDataset[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      total: 'total',
      page: 'page',
      pageSize: 'page_size',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      total: 'number',
      page: 'number',
      pageSize: 'number',
      data: { 'type': 'array', 'itemType': LocalDataset },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RecognizeAntchainPdcpDatasetSchemaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 采用数据源配置进行登记时的数据源 id
  // 如果填写了本参数，则可不填写datasourceType和connConfig
  // 如果填写了本参数，将优先采用本参数指定的 datasource 配置
  datasourceId?: string;
  // 数据资产数据源类型
  // 如果填写了datasourceId，则可不传本参数，填写了本参数也将被忽略
  // 如果未填写datasourceId，则必须同时填写本参数和connConfig参数
  datasourceType?: string;
  // 数据资产数据源连接信息，与数据源类型必须一一对应。
  // 如果填写了datasourceId，则可不传本参数，填写本参数也将被忽略。
  // 如果未填写datasourceId，则必须同时填写本参数和datasourceType参数。
  // 该参数请参考如下对应结构体，定义好后需转成jsonString，具体的对应信息如下：
  // MYSQL -> MysqlConnConfig,
  // ORACLE -> OracleConnConfig,
  // SQLSERVER -> SqlServerConnConfig,
  // DB2 -> DbTwoConnConfig,
  // HIVE2 -> HiveTwoConnConfig,
  // ODPS -> OdpsConnConfig
  connConfig?: string;
  // 数据集位置配置，如数据表名称等。
  // 如果填写了datasourceId，则根据datasourceId对应的数据源类型进行解析。
  // 如果未填写datasourceId，则根据datasourceType进行解析。
  // 该参数请参考如下对应结构体，定义好后需转成jsonString，对应信息如下：
  // MYSQL -> MysqlLocationConfig,
  // ORACLE -> OracleLocationConfig,
  // SQLSERVER -> SqlServerLocationConfig,
  // DB2 -> DbTwoLocationConfig,
  // HIVE2 -> HiveTwoLocationConfig,
  // ODPS -> OdpsLocationConfig
  locationConfig: string;
  // 数据集格式类型，如TABLE。
  formatType: string;
  // 数据集所属的数据源格式信息，如 csv 分隔符，数据库主键名称等。
  // 该参数请参考如下对应结构体，定义好后需转成jsonString，对应关系如下：
  // 数据表 -> TableFormatConfig，
  formatConfig?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      datasourceId: 'datasource_id',
      datasourceType: 'datasource_type',
      connConfig: 'conn_config',
      locationConfig: 'location_config',
      formatType: 'format_type',
      formatConfig: 'format_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      datasourceId: 'string',
      datasourceType: 'string',
      connConfig: 'string',
      locationConfig: 'string',
      formatType: 'string',
      formatConfig: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RecognizeAntchainPdcpDatasetSchemaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 识别到的数据集的 schema 信息
  data?: RecognizedDatasetSchema;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: RecognizedDatasetSchema,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntchainPdcpProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目名称
  name: string;
  // 参与方节点信息列表，不同的节点类型参考不同结构体。一期节点类型仅支持FATE，其构造方式请参考FatePartyLocalConfigInfo
  partyList: PartyReq[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      partyList: 'party_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      partyList: { 'type': 'array', 'itemType': PartyReq },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntchainPdcpProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 项目信息
  data?: Project;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: Project,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainPdcpProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目唯一标识
  projectId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainPdcpProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 项目详情信息
  data?: Project;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: Project,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthAntchainPdcpProjectDatasetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据集名称
  name: string;
  // 数据集配置参数，若授权的数据集归属于云上的节点，则参考结构体AuthSaasDatasetConfig，若授权的数据集归属于线下的节点，则参考结构体AuthFateDatasetConfig
  config: string;
  // 项目ID
  projectId: string;
  // 项目内可见范围类型，ALL_TENANT全部机构可见，SPECIFIC_TENANT部分机构可见。调用授权数据集 和 数据源请求时 若不填该参数，则默认ALL_TENANT
  visibleType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      config: 'config',
      projectId: 'project_id',
      visibleType: 'visible_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      config: 'string',
      projectId: 'string',
      visibleType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthAntchainPdcpProjectDatasetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权至某个项目中的数据集信息
  data?: AuthDataset;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: AuthDataset,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthAntchainPdcpProjectDatasourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据源名称
  name: string;
  // 选择已登记的数据源ID，云上的参考AuthSaasDatasourceConfig
  config: string;
  // 项目ID
  projectId: string;
  // 项目内可见范围类型，ALL_TENANT全部机构可见，SPECIFIC_TENANT部分机构可见。调用授权数据集 和 数据源请求时 若不填该参数，则默认ALL_TENANT
  visibleType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      config: 'config',
      projectId: 'project_id',
      visibleType: 'visible_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      config: 'string',
      projectId: 'string',
      visibleType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthAntchainPdcpProjectDatasourceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权至项目的数据源信息
  data?: AuthDatasource;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: AuthDatasource,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryAntchainPdcpProjectAuthdatasetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目ID
  projectId: string;
  // 分页参数
  page: number;
  // 分页参数
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      page: 'page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      page: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryAntchainPdcpProjectAuthdatasetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果的总数量
  total?: number;
  // 分页页数
  page?: number;
  // 分页大小
  pageSize?: number;
  // 返回的数据集元信息的列表
  data?: AuthDataset[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      total: 'total',
      page: 'page',
      pageSize: 'page_size',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      total: 'number',
      page: 'number',
      pageSize: 'number',
      data: { 'type': 'array', 'itemType': AuthDataset },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryAntchainPdcpProjectAuthdatasourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目ID
  projectId: string;
  // 分页参数
  page: number;
  // 分页参数
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      page: 'page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      page: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryAntchainPdcpProjectAuthdatasourceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果的总数量
  total?: number;
  // 分页页数
  page?: number;
  // 分页大小
  pageSize?: number;
  // 返回项目内已授权的数据集源信息的列表
  data?: AuthDatasource[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      total: 'total',
      page: 'page',
      pageSize: 'page_size',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      total: 'number',
      page: 'number',
      pageSize: 'number',
      data: { 'type': 'array', 'itemType': AuthDatasource },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainPdcpJobPsiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务ID
  jobId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      jobId: 'job_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      jobId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainPdcpJobPsiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务信息
  data?: PsiJob;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: PsiJob,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAntchainPdcpJobPsiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目ID
  projectId: string;
  // 任务名称
  name: string;
  // 任务类型，目前仅支持一种
  type: string;
  // 任务的描述信息
  description: string;
  // 任务执行参数，构造方式参考Participant结构体定义
  participantList: PsiParticipantConfig[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      name: 'name',
      type: 'type',
      description: 'description',
      participantList: 'participant_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      name: 'string',
      type: 'string',
      description: 'string',
      participantList: { 'type': 'array', 'itemType': PsiParticipantConfig },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAntchainPdcpJobPsiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务信息
  data?: PsiJob;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: PsiJob,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}


export default class Client {
  _endpoint: string;
  _regionId: string;
  _accessKeyId: string;
  _accessKeySecret: string;
  _protocol: string;
  _userAgent: string;
  _readTimeout: number;
  _connectTimeout: number;
  _httpProxy: string;
  _httpsProxy: string;
  _socks5Proxy: string;
  _socks5NetWork: string;
  _noProxy: string;
  _maxIdleConns: number;
  _securityToken: string;
  _maxIdleTimeMillis: number;
  _keepAliveDurationMillis: number;
  _maxRequests: number;
  _maxRequestsPerHost: number;

  /**
   * Init client with Config
   * @param config config contains the necessary information to create a client
   */
  constructor(config: Config) {
    if (Util.isUnset($tea.toMap(config))) {
      throw $tea.newError({
        code: "ParameterMissing",
        message: "'config' can not be unset",
      });
    }

    this._accessKeyId = config.accessKeyId;
    this._accessKeySecret = config.accessKeySecret;
    this._securityToken = config.securityToken;
    this._endpoint = config.endpoint;
    this._protocol = config.protocol;
    this._userAgent = config.userAgent;
    this._readTimeout = Util.defaultNumber(config.readTimeout, 20000);
    this._connectTimeout = Util.defaultNumber(config.connectTimeout, 20000);
    this._httpProxy = config.httpProxy;
    this._httpsProxy = config.httpsProxy;
    this._noProxy = config.noProxy;
    this._socks5Proxy = config.socks5Proxy;
    this._socks5NetWork = config.socks5NetWork;
    this._maxIdleConns = Util.defaultNumber(config.maxIdleConns, 60000);
    this._maxIdleTimeMillis = Util.defaultNumber(config.maxIdleTimeMillis, 5);
    this._keepAliveDurationMillis = Util.defaultNumber(config.keepAliveDurationMillis, 5000);
    this._maxRequests = Util.defaultNumber(config.maxRequests, 100);
    this._maxRequestsPerHost = Util.defaultNumber(config.maxRequestsPerHost, 100);
  }

  /**
   * Encapsulate the request and invoke the network
   * @param action api name
   * @param protocol http or https
   * @param method e.g. GET
   * @param pathname pathname of every api
   * @param request which contains request params
   * @param runtime which controls some details of call api, such as retry times
   * @return the response
   */
  async doRequest(version: string, action: string, protocol: string, method: string, pathname: string, request: {[key: string]: any}, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<{[key: string]: any}> {
    let _runtime: { [key: string]: any } = {
      timeouted: "retry",
      readTimeout: Util.defaultNumber(runtime.readTimeout, this._readTimeout),
      connectTimeout: Util.defaultNumber(runtime.connectTimeout, this._connectTimeout),
      httpProxy: Util.defaultString(runtime.httpProxy, this._httpProxy),
      httpsProxy: Util.defaultString(runtime.httpsProxy, this._httpsProxy),
      noProxy: Util.defaultString(runtime.noProxy, this._noProxy),
      maxIdleConns: Util.defaultNumber(runtime.maxIdleConns, this._maxIdleConns),
      maxIdleTimeMillis: this._maxIdleTimeMillis,
      keepAliveDuration: this._keepAliveDurationMillis,
      maxRequests: this._maxRequests,
      maxRequestsPerHost: this._maxRequestsPerHost,
      retry: {
        retryable: runtime.autoretry,
        maxAttempts: Util.defaultNumber(runtime.maxAttempts, 3),
      },
      backoff: {
        policy: Util.defaultString(runtime.backoffPolicy, "no"),
        period: Util.defaultNumber(runtime.backoffPeriod, 1),
      },
      ignoreSSL: runtime.ignoreSSL,
    }

    let _lastRequest = null;
    let _now = Date.now();
    let _retryTimes = 0;
    while ($tea.allowRetry(_runtime['retry'], _retryTimes, _now)) {
      if (_retryTimes > 0) {
        let _backoffTime = $tea.getBackoffTime(_runtime['backoff'], _retryTimes);
        if (_backoffTime > 0) {
          await $tea.sleep(_backoffTime);
        }
      }

      _retryTimes = _retryTimes + 1;
      try {
        let request_ = new $tea.Request();
        request_.protocol = Util.defaultString(this._protocol, protocol);
        request_.method = method;
        request_.pathname = pathname;
        request_.query = {
          method: action,
          version: version,
          sign_type: "HmacSHA1",
          req_time: AntchainUtil.getTimestamp(),
          req_msg_id: AntchainUtil.getNonce(),
          access_key: this._accessKeyId,
          base_sdk_version: "TeaSDK-2.0",
          sdk_version: "1.0.1",
          _prod_code: "ak_be9ae52241c747408ac24bec8f036d74",
          _prod_channel: "saas",
        };
        if (!Util.empty(this._securityToken)) {
          request_.query["security_token"] = this._securityToken;
        }

        request_.headers = {
          host: Util.defaultString(this._endpoint, "openapi.antchain.antgroup.com"),
          'user-agent': Util.getUserAgent(this._userAgent),
          ...headers,
        };
        let tmp = Util.anyifyMapValue(RPCUtil.query(request));
        request_.body = new $tea.BytesReadable(Util.toFormString(tmp));
        request_.headers["content-type"] = "application/x-www-form-urlencoded";
        let signedParam = {
          ...request_.query,
          ...RPCUtil.query(request),
        };
        request_.query["sign"] = AntchainUtil.getSignature(signedParam, this._accessKeySecret);
        _lastRequest = request_;
        let response_ = await $tea.doAction(request_, _runtime);

        let raw = await Util.readAsString(response_.body);
        let obj = Util.parseJSON(raw);
        let res = Util.assertAsMap(obj);
        let resp = Util.assertAsMap(res["response"]);
        if (AntchainUtil.hasError(raw, this._accessKeySecret)) {
          throw $tea.newError({
            message: resp["result_msg"],
            data: resp,
            code: resp["result_code"],
          });
        }

        return resp;
      } catch (ex) {
        if ($tea.isRetryable(ex)) {
          continue;
        }
        throw ex;
      }
    }

    throw $tea.newUnretryableError(_lastRequest);
  }

  /**
   * Description: 请求创建数据源
   * Summary: 创建新的数据源
   */
  async createAntchainPdcpDatasource(request: CreateAntchainPdcpDatasourceRequest): Promise<CreateAntchainPdcpDatasourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntchainPdcpDatasourceEx(request, headers, runtime);
  }

  /**
   * Description: 请求创建数据源
   * Summary: 创建新的数据源
   */
  async createAntchainPdcpDatasourceEx(request: CreateAntchainPdcpDatasourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntchainPdcpDatasourceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntchainPdcpDatasourceResponse>(await this.doRequest("1.0", "antchain.pdcp.datasource.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntchainPdcpDatasourceResponse({}));
  }

  /**
   * Description: 请求删除指定的数据源。
   * Summary: 删除指定的数据源
   */
  async deleteAntchainPdcpDatasource(request: DeleteAntchainPdcpDatasourceRequest): Promise<DeleteAntchainPdcpDatasourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAntchainPdcpDatasourceEx(request, headers, runtime);
  }

  /**
   * Description: 请求删除指定的数据源。
   * Summary: 删除指定的数据源
   */
  async deleteAntchainPdcpDatasourceEx(request: DeleteAntchainPdcpDatasourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAntchainPdcpDatasourceResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAntchainPdcpDatasourceResponse>(await this.doRequest("1.0", "antchain.pdcp.datasource.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAntchainPdcpDatasourceResponse({}));
  }

  /**
   * Description: 请求更新指定数据源的信息。
   * Summary: 更新指定数据源的信息
   */
  async updateAntchainPdcpDatasource(request: UpdateAntchainPdcpDatasourceRequest): Promise<UpdateAntchainPdcpDatasourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAntchainPdcpDatasourceEx(request, headers, runtime);
  }

  /**
   * Description: 请求更新指定数据源的信息。
   * Summary: 更新指定数据源的信息
   */
  async updateAntchainPdcpDatasourceEx(request: UpdateAntchainPdcpDatasourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAntchainPdcpDatasourceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAntchainPdcpDatasourceResponse>(await this.doRequest("1.0", "antchain.pdcp.datasource.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAntchainPdcpDatasourceResponse({}));
  }

  /**
   * Description: 请求查询指定的数据源信息。
   * Summary: 查询指定的数据源信息
   */
  async queryAntchainPdcpDatasource(request: QueryAntchainPdcpDatasourceRequest): Promise<QueryAntchainPdcpDatasourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainPdcpDatasourceEx(request, headers, runtime);
  }

  /**
   * Description: 请求查询指定的数据源信息。
   * Summary: 查询指定的数据源信息
   */
  async queryAntchainPdcpDatasourceEx(request: QueryAntchainPdcpDatasourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainPdcpDatasourceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainPdcpDatasourceResponse>(await this.doRequest("1.0", "antchain.pdcp.datasource.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainPdcpDatasourceResponse({}));
  }

  /**
   * Description: 分页搜索数据源
   * Summary: 分页搜索数据源
   */
  async pagequeryAntchainPdcpDatasource(request: PagequeryAntchainPdcpDatasourceRequest): Promise<PagequeryAntchainPdcpDatasourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryAntchainPdcpDatasourceEx(request, headers, runtime);
  }

  /**
   * Description: 分页搜索数据源
   * Summary: 分页搜索数据源
   */
  async pagequeryAntchainPdcpDatasourceEx(request: PagequeryAntchainPdcpDatasourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryAntchainPdcpDatasourceResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryAntchainPdcpDatasourceResponse>(await this.doRequest("1.0", "antchain.pdcp.datasource.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryAntchainPdcpDatasourceResponse({}));
  }

  /**
   * Description: 创建新的数据集
   * Summary: 创建新的数据集
   */
  async createAntchainPdcpDataset(request: CreateAntchainPdcpDatasetRequest): Promise<CreateAntchainPdcpDatasetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntchainPdcpDatasetEx(request, headers, runtime);
  }

  /**
   * Description: 创建新的数据集
   * Summary: 创建新的数据集
   */
  async createAntchainPdcpDatasetEx(request: CreateAntchainPdcpDatasetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntchainPdcpDatasetResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntchainPdcpDatasetResponse>(await this.doRequest("1.0", "antchain.pdcp.dataset.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntchainPdcpDatasetResponse({}));
  }

  /**
   * Description: 删除指定数据集
   * Summary: 删除指定数据集
   */
  async deleteAntchainPdcpDataset(request: DeleteAntchainPdcpDatasetRequest): Promise<DeleteAntchainPdcpDatasetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAntchainPdcpDatasetEx(request, headers, runtime);
  }

  /**
   * Description: 删除指定数据集
   * Summary: 删除指定数据集
   */
  async deleteAntchainPdcpDatasetEx(request: DeleteAntchainPdcpDatasetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAntchainPdcpDatasetResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAntchainPdcpDatasetResponse>(await this.doRequest("1.0", "antchain.pdcp.dataset.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAntchainPdcpDatasetResponse({}));
  }

  /**
   * Description: 更新指定数据集信息
   * Summary: 更新指定数据集信息
   */
  async updateAntchainPdcpDataset(request: UpdateAntchainPdcpDatasetRequest): Promise<UpdateAntchainPdcpDatasetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAntchainPdcpDatasetEx(request, headers, runtime);
  }

  /**
   * Description: 更新指定数据集信息
   * Summary: 更新指定数据集信息
   */
  async updateAntchainPdcpDatasetEx(request: UpdateAntchainPdcpDatasetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAntchainPdcpDatasetResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAntchainPdcpDatasetResponse>(await this.doRequest("1.0", "antchain.pdcp.dataset.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAntchainPdcpDatasetResponse({}));
  }

  /**
   * Description: 查询指定数据集信息
   * Summary: 查询指定数据集信息
   */
  async queryAntchainPdcpDataset(request: QueryAntchainPdcpDatasetRequest): Promise<QueryAntchainPdcpDatasetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainPdcpDatasetEx(request, headers, runtime);
  }

  /**
   * Description: 查询指定数据集信息
   * Summary: 查询指定数据集信息
   */
  async queryAntchainPdcpDatasetEx(request: QueryAntchainPdcpDatasetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainPdcpDatasetResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainPdcpDatasetResponse>(await this.doRequest("1.0", "antchain.pdcp.dataset.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainPdcpDatasetResponse({}));
  }

  /**
   * Description: 分页搜索数据集
   * Summary: 分页搜索数据集
   */
  async pagequeryAntchainPdcpDataset(request: PagequeryAntchainPdcpDatasetRequest): Promise<PagequeryAntchainPdcpDatasetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryAntchainPdcpDatasetEx(request, headers, runtime);
  }

  /**
   * Description: 分页搜索数据集
   * Summary: 分页搜索数据集
   */
  async pagequeryAntchainPdcpDatasetEx(request: PagequeryAntchainPdcpDatasetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryAntchainPdcpDatasetResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryAntchainPdcpDatasetResponse>(await this.doRequest("1.0", "antchain.pdcp.dataset.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryAntchainPdcpDatasetResponse({}));
  }

  /**
   * Description: 识别数据集的 schema 信息
   * Summary: 识别数据集的 schema 信息
   */
  async recognizeAntchainPdcpDatasetSchema(request: RecognizeAntchainPdcpDatasetSchemaRequest): Promise<RecognizeAntchainPdcpDatasetSchemaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.recognizeAntchainPdcpDatasetSchemaEx(request, headers, runtime);
  }

  /**
   * Description: 识别数据集的 schema 信息
   * Summary: 识别数据集的 schema 信息
   */
  async recognizeAntchainPdcpDatasetSchemaEx(request: RecognizeAntchainPdcpDatasetSchemaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RecognizeAntchainPdcpDatasetSchemaResponse> {
    Util.validateModel(request);
    return $tea.cast<RecognizeAntchainPdcpDatasetSchemaResponse>(await this.doRequest("1.0", "antchain.pdcp.dataset.schema.recognize", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RecognizeAntchainPdcpDatasetSchemaResponse({}));
  }

  /**
   * Description: 创建项目，添加线下参与方协作节点
   * Summary: 创建项目
   */
  async createAntchainPdcpProject(request: CreateAntchainPdcpProjectRequest): Promise<CreateAntchainPdcpProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntchainPdcpProjectEx(request, headers, runtime);
  }

  /**
   * Description: 创建项目，添加线下参与方协作节点
   * Summary: 创建项目
   */
  async createAntchainPdcpProjectEx(request: CreateAntchainPdcpProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntchainPdcpProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntchainPdcpProjectResponse>(await this.doRequest("1.0", "antchain.pdcp.project.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntchainPdcpProjectResponse({}));
  }

  /**
   * Description: 根据项目ID查询项目信息
   * Summary: 根据项目ID查询项目信息
   */
  async getAntchainPdcpProject(request: GetAntchainPdcpProjectRequest): Promise<GetAntchainPdcpProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAntchainPdcpProjectEx(request, headers, runtime);
  }

  /**
   * Description: 根据项目ID查询项目信息
   * Summary: 根据项目ID查询项目信息
   */
  async getAntchainPdcpProjectEx(request: GetAntchainPdcpProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAntchainPdcpProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAntchainPdcpProjectResponse>(await this.doRequest("1.0", "antchain.pdcp.project.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAntchainPdcpProjectResponse({}));
  }

  /**
   * Description: 授权dataset至项目内，/api/project/dataset/auth，后续创建任务时仅允许选择已授权至项目内的数据集列表
   * Summary: 授权某个本地的数据集至项目中
   */
  async authAntchainPdcpProjectDataset(request: AuthAntchainPdcpProjectDatasetRequest): Promise<AuthAntchainPdcpProjectDatasetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authAntchainPdcpProjectDatasetEx(request, headers, runtime);
  }

  /**
   * Description: 授权dataset至项目内，/api/project/dataset/auth，后续创建任务时仅允许选择已授权至项目内的数据集列表
   * Summary: 授权某个本地的数据集至项目中
   */
  async authAntchainPdcpProjectDatasetEx(request: AuthAntchainPdcpProjectDatasetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthAntchainPdcpProjectDatasetResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthAntchainPdcpProjectDatasetResponse>(await this.doRequest("1.0", "antchain.pdcp.project.dataset.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthAntchainPdcpProjectDatasetResponse({}));
  }

  /**
   * Description: 授权数据源至项目/api/project/datasource/auth
   * Summary: 授权某个本地数据源至项目中
   */
  async authAntchainPdcpProjectDatasource(request: AuthAntchainPdcpProjectDatasourceRequest): Promise<AuthAntchainPdcpProjectDatasourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authAntchainPdcpProjectDatasourceEx(request, headers, runtime);
  }

  /**
   * Description: 授权数据源至项目/api/project/datasource/auth
   * Summary: 授权某个本地数据源至项目中
   */
  async authAntchainPdcpProjectDatasourceEx(request: AuthAntchainPdcpProjectDatasourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthAntchainPdcpProjectDatasourceResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthAntchainPdcpProjectDatasourceResponse>(await this.doRequest("1.0", "antchain.pdcp.project.datasource.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthAntchainPdcpProjectDatasourceResponse({}));
  }

  /**
   * Description: 分页查询项目内已授权的数据集列表
   * Summary: 分页查询项目内已授权的数据集列表
   */
  async pagequeryAntchainPdcpProjectAuthdataset(request: PagequeryAntchainPdcpProjectAuthdatasetRequest): Promise<PagequeryAntchainPdcpProjectAuthdatasetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryAntchainPdcpProjectAuthdatasetEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询项目内已授权的数据集列表
   * Summary: 分页查询项目内已授权的数据集列表
   */
  async pagequeryAntchainPdcpProjectAuthdatasetEx(request: PagequeryAntchainPdcpProjectAuthdatasetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryAntchainPdcpProjectAuthdatasetResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryAntchainPdcpProjectAuthdatasetResponse>(await this.doRequest("1.0", "antchain.pdcp.project.authdataset.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryAntchainPdcpProjectAuthdatasetResponse({}));
  }

  /**
   * Description: 分页查询项目内已授权的数据源列表
   * Summary: 分页查询项目内已授权的数据源列表
   */
  async pagequeryAntchainPdcpProjectAuthdatasource(request: PagequeryAntchainPdcpProjectAuthdatasourceRequest): Promise<PagequeryAntchainPdcpProjectAuthdatasourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryAntchainPdcpProjectAuthdatasourceEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询项目内已授权的数据源列表
   * Summary: 分页查询项目内已授权的数据源列表
   */
  async pagequeryAntchainPdcpProjectAuthdatasourceEx(request: PagequeryAntchainPdcpProjectAuthdatasourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryAntchainPdcpProjectAuthdatasourceResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryAntchainPdcpProjectAuthdatasourceResponse>(await this.doRequest("1.0", "antchain.pdcp.project.authdatasource.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryAntchainPdcpProjectAuthdatasourceResponse({}));
  }

  /**
   * Description: 查询任务信息
   * Summary: 查询任务状态
   */
  async queryAntchainPdcpJobPsi(request: QueryAntchainPdcpJobPsiRequest): Promise<QueryAntchainPdcpJobPsiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainPdcpJobPsiEx(request, headers, runtime);
  }

  /**
   * Description: 查询任务信息
   * Summary: 查询任务状态
   */
  async queryAntchainPdcpJobPsiEx(request: QueryAntchainPdcpJobPsiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainPdcpJobPsiResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainPdcpJobPsiResponse>(await this.doRequest("1.0", "antchain.pdcp.job.psi.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainPdcpJobPsiResponse({}));
  }

  /**
   * Description: 提交psi任务接口
   * Summary: 提交psi任务接口
   */
  async submitAntchainPdcpJobPsi(request: SubmitAntchainPdcpJobPsiRequest): Promise<SubmitAntchainPdcpJobPsiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAntchainPdcpJobPsiEx(request, headers, runtime);
  }

  /**
   * Description: 提交psi任务接口
   * Summary: 提交psi任务接口
   */
  async submitAntchainPdcpJobPsiEx(request: SubmitAntchainPdcpJobPsiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAntchainPdcpJobPsiResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAntchainPdcpJobPsiResponse>(await this.doRequest("1.0", "antchain.pdcp.job.psi.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAntchainPdcpJobPsiResponse({}));
  }

}
